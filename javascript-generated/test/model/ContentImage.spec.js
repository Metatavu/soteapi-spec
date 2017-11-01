/**
 * SOTE API
 * SOTE API
 *
 * OpenAPI spec version: 0.0.1
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 3.0.0-SNAPSHOT
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.SoteapiClient);
  }
}(this, function(expect, SoteapiClient) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new SoteapiClient.ContentImage();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('ContentImage', function() {
    it('should create an instance of ContentImage', function() {
      // uncomment below and update the code to test ContentImage
      //var instane = new SoteapiClient.ContentImage();
      //expect(instance).to.be.a(SoteapiClient.ContentImage);
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instane = new SoteapiClient.ContentImage();
      //expect(instance).to.be();
    });

    it('should have the property name (base name: "name")', function() {
      // uncomment below and update the code to test the property name
      //var instane = new SoteapiClient.ContentImage();
      //expect(instance).to.be();
    });

    it('should have the property contentType (base name: "contentType")', function() {
      // uncomment below and update the code to test the property contentType
      //var instane = new SoteapiClient.ContentImage();
      //expect(instance).to.be();
    });

    it('should have the property size (base name: "size")', function() {
      // uncomment below and update the code to test the property size
      //var instane = new SoteapiClient.ContentImage();
      //expect(instance).to.be();
    });

    it('should have the property type (base name: "type")', function() {
      // uncomment below and update the code to test the property type
      //var instane = new SoteapiClient.ContentImage();
      //expect(instance).to.be();
    });

  });

}));