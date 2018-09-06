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
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/BadRequest', 'model/EmergencyCongestionStatus', 'model/Forbidden', 'model/InternalServerError'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/BadRequest'), require('../model/EmergencyCongestionStatus'), require('../model/Forbidden'), require('../model/InternalServerError'));
  } else {
    // Browser globals (root is window)
    if (!root.SoteapiClient) {
      root.SoteapiClient = {};
    }
    root.SoteapiClient.EmergencyCongestionStatusesApi = factory(root.SoteapiClient.ApiClient, root.SoteapiClient.BadRequest, root.SoteapiClient.EmergencyCongestionStatus, root.SoteapiClient.Forbidden, root.SoteapiClient.InternalServerError);
  }
}(this, function(ApiClient, BadRequest, EmergencyCongestionStatus, Forbidden, InternalServerError) {
  'use strict';

  /**
   * EmergencyCongestionStatuses service.
   * @module api/EmergencyCongestionStatusesApi
   * @version 0.0.18
   */

  /**
   * Constructs a new EmergencyCongestionStatusesApi. 
   * @alias module:api/EmergencyCongestionStatusesApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;



    /**
     * Lists emergency congestion statuses
     * List of emergency congestion statuses
     * @param {Object} opts Optional parameters
     * @param {String} opts.sort Sort results. See EmergencyCongestionStatusListSort for sort options
     * @param {Number} opts.firstResult First result
     * @param {Number} opts.maxResults Max results
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/EmergencyCongestionStatus>} and HTTP response
     */
    this.listEmergencyCongestionStatusesWithHttpInfo = function(opts) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
        'sort': opts['sort'],
        'firstResult': opts['firstResult'],
        'maxResults': opts['maxResults'],
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json;charset=utf-8'];
      var accepts = ['application/json;charset=utf-8'];
      var returnType = [EmergencyCongestionStatus];

      return this.apiClient.callApi(
        '/emergencyCongestionStatuses', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Lists emergency congestion statuses
     * List of emergency congestion statuses
     * @param {Object} opts Optional parameters
     * @param {String} opts.sort Sort results. See EmergencyCongestionStatusListSort for sort options
     * @param {Number} opts.firstResult First result
     * @param {Number} opts.maxResults Max results
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/EmergencyCongestionStatus>}
     */
    this.listEmergencyCongestionStatuses = function(opts) {
      return this.listEmergencyCongestionStatusesWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }
  };

  return exports;
}));
