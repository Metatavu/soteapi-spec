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
    define(['ApiClient', 'model/BadRequest', 'model/Content', 'model/ContentImage', 'model/Forbidden', 'model/InternalServerError', 'model/LocalizedValue'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/BadRequest'), require('../model/Content'), require('../model/ContentImage'), require('../model/Forbidden'), require('../model/InternalServerError'), require('../model/LocalizedValue'));
  } else {
    // Browser globals (root is window)
    if (!root.SoteapiClient) {
      root.SoteapiClient = {};
    }
    root.SoteapiClient.ContentsApi = factory(root.SoteapiClient.ApiClient, root.SoteapiClient.BadRequest, root.SoteapiClient.Content, root.SoteapiClient.ContentImage, root.SoteapiClient.Forbidden, root.SoteapiClient.InternalServerError, root.SoteapiClient.LocalizedValue);
  }
}(this, function(ApiClient, BadRequest, Content, ContentImage, Forbidden, InternalServerError, LocalizedValue) {
  'use strict';

  /**
   * Contents service.
   * @module api/ContentsApi
   * @version 0.0.13
   */

  /**
   * Constructs a new ContentsApi. 
   * @alias module:api/ContentsApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;



    /**
     * Finds content
     * Finds single content 
     * @param {Number} contentId content id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/Content} and HTTP response
     */
    this.findContentWithHttpInfo = function(contentId) {
      var postBody = null;

      // verify the required parameter 'contentId' is set
      if (contentId === undefined || contentId === null) {
        throw new Error("Missing the required parameter 'contentId' when calling findContent");
      }


      var pathParams = {
        'contentId': contentId
      };
      var queryParams = {
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
      var returnType = Content;

      return this.apiClient.callApi(
        '/contents/{contentId}', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Finds content
     * Finds single content 
     * @param {Number} contentId content id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/Content}
     */
    this.findContent = function(contentId) {
      return this.findContentWithHttpInfo(contentId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Returns content content in all available languages
     * Returns single content content in all available languages 
     * @param {Number} contentId content id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/LocalizedValue>} and HTTP response
     */
    this.findContentDataWithHttpInfo = function(contentId) {
      var postBody = null;

      // verify the required parameter 'contentId' is set
      if (contentId === undefined || contentId === null) {
        throw new Error("Missing the required parameter 'contentId' when calling findContentData");
      }


      var pathParams = {
        'contentId': contentId
      };
      var queryParams = {
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
      var returnType = [LocalizedValue];

      return this.apiClient.callApi(
        '/contents/{contentId}/content', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Returns content content in all available languages
     * Returns single content content in all available languages 
     * @param {Number} contentId content id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/LocalizedValue>}
     */
    this.findContentData = function(contentId) {
      return this.findContentDataWithHttpInfo(contentId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Returns a single content image
     * Returns a single content image 
     * @param {Number} contentId Content Id
     * @param {Number} imageId Content image id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/ContentImage} and HTTP response
     */
    this.findContentImageWithHttpInfo = function(contentId, imageId) {
      var postBody = null;

      // verify the required parameter 'contentId' is set
      if (contentId === undefined || contentId === null) {
        throw new Error("Missing the required parameter 'contentId' when calling findContentImage");
      }

      // verify the required parameter 'imageId' is set
      if (imageId === undefined || imageId === null) {
        throw new Error("Missing the required parameter 'imageId' when calling findContentImage");
      }


      var pathParams = {
        'contentId': contentId,
        'imageId': imageId
      };
      var queryParams = {
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
      var returnType = ContentImage;

      return this.apiClient.callApi(
        '/contents/{contentId}/images/{imageId}', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Returns a single content image
     * Returns a single content image 
     * @param {Number} contentId Content Id
     * @param {Number} imageId Content image id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/ContentImage}
     */
    this.findContentImage = function(contentId, imageId) {
      return this.findContentImageWithHttpInfo(contentId, imageId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Returns an content image data
     * Returns an content image data 
     * @param {Number} contentId Content id
     * @param {Number} imageId Content image id
     * @param {Object} opts Optional parameters
     * @param {Number} opts.size Maximum width or height of image
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link 'Blob'} and HTTP response
     */
    this.getContentImageDataWithHttpInfo = function(contentId, imageId, opts) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'contentId' is set
      if (contentId === undefined || contentId === null) {
        throw new Error("Missing the required parameter 'contentId' when calling getContentImageData");
      }

      // verify the required parameter 'imageId' is set
      if (imageId === undefined || imageId === null) {
        throw new Error("Missing the required parameter 'imageId' when calling getContentImageData");
      }


      var pathParams = {
        'contentId': contentId,
        'imageId': imageId
      };
      var queryParams = {
        'size': opts['size'],
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json;charset=utf-8'];
      var accepts = ['application/octet-stream'];
      var returnType = 'Blob';

      return this.apiClient.callApi(
        '/contents/{contentId}/images/{imageId}/data', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Returns an content image data
     * Returns an content image data 
     * @param {Number} contentId Content id
     * @param {Number} imageId Content image id
     * @param {Object} opts Optional parameters
     * @param {Number} opts.size Maximum width or height of image
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link 'Blob'}
     */
    this.getContentImageData = function(contentId, imageId, opts) {
      return this.getContentImageDataWithHttpInfo(contentId, imageId, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Returns a list of content images
     * Returns a list of content images 
     * @param {Number} contentId Content id
     * @param {Object} opts Optional parameters
     * @param {String} opts.type Filter by type
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/ContentImage>} and HTTP response
     */
    this.listContentImagesWithHttpInfo = function(contentId, opts) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'contentId' is set
      if (contentId === undefined || contentId === null) {
        throw new Error("Missing the required parameter 'contentId' when calling listContentImages");
      }


      var pathParams = {
        'contentId': contentId
      };
      var queryParams = {
        'type': opts['type'],
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
      var returnType = [ContentImage];

      return this.apiClient.callApi(
        '/contents/{contentId}/images', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Returns a list of content images
     * Returns a list of content images 
     * @param {Number} contentId Content id
     * @param {Object} opts Optional parameters
     * @param {String} opts.type Filter by type
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/ContentImage>}
     */
    this.listContentImages = function(contentId, opts) {
      return this.listContentImagesWithHttpInfo(contentId, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Lists contents
     * Lists contents 
     * @param {Object} opts Optional parameters
     * @param {String} opts.parentId Filter results by parent id
     * @param {Array.<String>} opts.type Filter results by content type
     * @param {String} opts.categorySlug Filter by category slug
     * @param {Number} opts.firstResult First result
     * @param {Number} opts.maxResults Max results
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/Content>} and HTTP response
     */
    this.listContentsWithHttpInfo = function(opts) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
        'parentId': opts['parentId'],
        'categorySlug': opts['categorySlug'],
        'firstResult': opts['firstResult'],
        'maxResults': opts['maxResults'],
      };
      var collectionQueryParams = {
        'type': {
          value: opts['type'],
          collectionFormat: 'csv'
        },
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json;charset=utf-8'];
      var accepts = ['application/json;charset=utf-8'];
      var returnType = [Content];

      return this.apiClient.callApi(
        '/contents', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Lists contents
     * Lists contents 
     * @param {Object} opts Optional parameters
     * @param {String} opts.parentId Filter results by parent id
     * @param {Array.<String>} opts.type Filter results by content type
     * @param {String} opts.categorySlug Filter by category slug
     * @param {Number} opts.firstResult First result
     * @param {Number} opts.maxResults Max results
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/Content>}
     */
    this.listContents = function(opts) {
      return this.listContentsWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }
  };

  return exports;
}));
