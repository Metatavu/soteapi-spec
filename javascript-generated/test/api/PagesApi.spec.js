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
    instance = new SoteapiClient.PagesApi();
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

  describe('PagesApi', function() {
    describe('findPage', function() {
      it('should call findPage successfully', function(done) {
        //uncomment below and update the code to test findPage
        //instance.findPage(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('findPageContent', function() {
      it('should call findPageContent successfully', function(done) {
        //uncomment below and update the code to test findPageContent
        //instance.findPageContent(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('findPageImage', function() {
      it('should call findPageImage successfully', function(done) {
        //uncomment below and update the code to test findPageImage
        //instance.findPageImage(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getPageImageData', function() {
      it('should call getPageImageData successfully', function(done) {
        //uncomment below and update the code to test getPageImageData
        //instance.getPageImageData(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('listPageImages', function() {
      it('should call listPageImages successfully', function(done) {
        //uncomment below and update the code to test listPageImages
        //instance.listPageImages(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('listPages', function() {
      it('should call listPages successfully', function(done) {
        //uncomment below and update the code to test listPages
        //instance.listPages(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));
