package fi.metatavu.soteapi.server.rest.api;

import java.util.UUID;
import fi.metatavu.soteapi.server.rest.model.*;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.io.File;

import java.time.OffsetDateTime;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/surveys")

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJAXRSSpecServerCodegen", date = "2019-08-28T07:11:31.821+03:00[Europe/Helsinki]")
public interface SurveysApi {

    @GET
    @Path("/{surveyName}")
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Finds survey", description = "Finds single survey ", tags={ "Surveys" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Returns a single survey", content = @Content(schema = @Schema(implementation = Survey.class))),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = BadRequest.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = Forbidden.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = InternalServerError.class))) })
    Response findSurvey( @PathParam("surveyName")

 @Parameter(description = "survey name") String surveyName
);
    @GET
    @Path("/{surveyName}/questions/{questionNumber}/summary")
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Finds survey question summary", description = "Finds single survey question summary ", tags={ "Surveys" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Returns a single survey", content = @Content(schema = @Schema(implementation = SurveyQuestionSummary.class))),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = BadRequest.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = Forbidden.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = InternalServerError.class))) })
    Response findSurveyQuestionSummary( @PathParam("surveyName")

 @Parameter(description = "survey name") String surveyName
, @PathParam("questionNumber")

 @Parameter(description = "Question number") Long questionNumber
);
    @GET
    @Path("/{surveyName}/questions")
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "lists questions of survey", description = "Lists questions of sigle survey ", tags={ "Surveys" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Returns a single survey", content = @Content(array = @ArraySchema(schema = @Schema(implementation = SurveyQuestion.class)))),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = BadRequest.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = Forbidden.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = InternalServerError.class))) })
    Response listSurveyQuestions( @PathParam("surveyName")

 @Parameter(description = "survey name") String surveyName
);
    @GET
    @Produces({ "application/json;charset=utf-8" })
    @Operation(summary = "Lists surveys", description = "Lists surveys ", tags={ "Surveys" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Returns a list of surveys", content = @Content(array = @ArraySchema(schema = @Schema(implementation = Survey.class)))),
        @ApiResponse(responseCode = "400", description = "Invalid request was sent to the server", content = @Content(schema = @Schema(implementation = BadRequest.class))),
        @ApiResponse(responseCode = "403", description = "Attempted to make a call with unauthorized client", content = @Content(schema = @Schema(implementation = Forbidden.class))),
        @ApiResponse(responseCode = "500", description = "Internal server error", content = @Content(schema = @Schema(implementation = InternalServerError.class))) })
    Response listSurveys();}
