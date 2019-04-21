module.exports = function(grunt) {
  require("load-grunt-tasks")(grunt);
  
  const SWAGGER_VERSION = "3.0.7";
  const SWAGGER_JAR = `swagger-codegen-cli-${SWAGGER_VERSION}.jar`;
  const SWAGGER_URL = `https://search.maven.org/remotecontent?filepath=io/swagger/codegen/v3/swagger-codegen-cli/${SWAGGER_VERSION}/${SWAGGER_JAR}`;
  
  const JAXRS_ARTIFACT = "soteapi-spec";
  const JAXRS_PACKAGE = "fi.metatavu.soteapi.server.rest";
  const JAXRS_GROUP = "fi.metatavu.soteapi";
  const TYPESCRIPT_MODEL_PACKAGE = "soteapi-client";
  const TYPESCRIPT_MODEL_VERSION = require("./typescript-client-generated/package.json").version;

  grunt.initConfig({
    "curl": {
      "swagger-codegen":  {
        src: SWAGGER_URL,
        dest: SWAGGER_JAR
      }
    },
    "clean": {
      "jaxrs-spec-cruft": [
        "jaxrs-spec-generated/src/main/java/fi/metatavu/soteapi/server/rest/RestApplication.java"
      ],
      "jaxrs-spec-sources": ["jaxrs-spec-generated/src"],
      "typescript-client": [
        "typescript-client-generated/typings.json",
        "typescript-client-generated/api.module.ts",
        "typescript-client-generated/variables.ts",
        "typescript-client-generated/encoder.ts",
        "typescript-client-generated/configuration.ts"
      ]
    },
    "shell": {
      "jaxrs-spec-generate": {
        command : "mv jaxrs-spec-generated/pom.xml jaxrs-spec-generated/pom.xml.before && " +
          `java -jar ${SWAGGER_JAR} generate ` +
          "-i ./swagger.yaml " +
          "-l jaxrs-spec " +
          `--api-package ${JAXRS_PACKAGE} ` +
          `--model-package ${JAXRS_PACKAGE}.model ` +
          `--group-id ${JAXRS_GROUP} ` +
          `--artifact-id ${JAXRS_ARTIFACT} ` +
          `--invoker-package ${JAXRS_PACKAGE} ` +
          "--template-engine handlebars " +
          "--artifact-version `cat jaxrs-spec-generated/pom.xml.before|grep version -m 1|sed -e \"s/.*<version>//\"|sed -e \"s/<.*//\"` " +
          "--template-dir jaxrs-spec-templates " +
          `--additional-properties dateLibrary=java8,useBeanValidation=true,sourceFolder=src/main/java,interfaceOnly=true,returnResponse=true,package=${JAXRS_PACKAGE} ` +
          "-o jaxrs-spec-generated/"
      },
      "jaxrs-fix-folders": {
        command : "mkdir -p jaxrs-spec-generated/src/main/java/fi/metatavu/soteapi/server/rest && mv jaxrs-spec-generated/src/main/java/io/swagger/* jaxrs-spec-generated/src/main/java/fi/metatavu/soteapi/server/rest"
      },
      "jaxrs-spec-install": {
        command : "mvn install",
        options: {
          execOptions: {
            cwd: "jaxrs-spec-generated"
          }
        }
      },
      "jaxrs-spec-release": {
        command : "git add src pom.xml swagger.json && git commit -m 'Generated source' && git push && mvn -B release:clean release:prepare release:perform",
        options: {
          execOptions: {
            cwd: "jaxrs-spec-generated"
          }
        }
      },
      "typescript-client-generate": {
        command : `java -jar ${SWAGGER_JAR} generate ` +
          "-i ./swagger.yaml " +
          "-l typescript-angular " +
          "-t typescript-client-template/ " +
          "-o typescript-client-generated/ " +
          "--template-engine mustache " +
          `--additional-properties projectName=${TYPESCRIPT_MODEL_PACKAGE},npmName=${TYPESCRIPT_MODEL_PACKAGE},npmVersion=${TYPESCRIPT_MODEL_VERSION}`
      },
      'typescript-client-bump-version': {
        command: 'npm version patch',
        options: {
          execOptions: {
            cwd: 'typescript-client-generated'
          }
        }
      },
      'typescript-client-push': {
        command : 'git add . && git commit -m "Generated typescript source" && git push',
        options: {
          execOptions: {
            cwd: 'typescript-client-generated'
          }
        }
      },
      "typescript-client-publish": {
        command : 'npm install && npm run build && npm publish',
        options: {
          execOptions: {
            cwd: 'typescript-client-generated'
          }
        }
      },
    }
  });

  grunt.registerTask("download-dependencies", "if-missing:curl:swagger-codegen");
  grunt.registerTask("jaxrs-gen", [ "download-dependencies", "clean:jaxrs-spec-sources", "shell:jaxrs-spec-generate", "clean:jaxrs-spec-cruft", "shell:jaxrs-fix-folders", "shell:jaxrs-spec-install" ]);
  grunt.registerTask("jaxrs-spec", [ "jaxrs-gen", "shell:jaxrs-spec-release" ]);
  grunt.registerTask('typescript-client-gen', [ 'shell:typescript-client-generate', 'clean:typescript-client']);
  grunt.registerTask('typescript-client', [ 'typescript-client-gen', "shell:typescript-client-bump-version", "shell:typescript-client-push", "shell:typescript-client-publish" ]);

  grunt.registerTask("default", [ "jaxrs-spec" ]);
};