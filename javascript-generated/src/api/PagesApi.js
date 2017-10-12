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
    define(['ApiClient', 'model/BadRequest', 'model/Forbidden', 'model/InternalServerError', 'model/LocalizedValue', 'model/Page', 'model/PageImage'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/BadRequest'), require('../model/Forbidden'), require('../model/InternalServerError'), require('../model/LocalizedValue'), require('../model/Page'), require('../model/PageImage'));
  } else {
    // Browser globals (root is window)
    if (!root.SoteapiClient) {
      root.SoteapiClient = {};
    }
    root.SoteapiClient.PagesApi = factory(root.SoteapiClient.ApiClient, root.SoteapiClient.BadRequest, root.SoteapiClient.Forbidden, root.SoteapiClient.InternalServerError, root.SoteapiClient.LocalizedValue, root.SoteapiClient.Page, root.SoteapiClient.PageImage);
  }
}(this, function(ApiClient, BadRequest, Forbidden, InternalServerError, LocalizedValue, Page, PageImage) {
  'use strict';

  /**
   * Pages service.
   * @module api/PagesApi
   * @version 0.0.4
   */

  /**
   * Constructs a new PagesApi. 
   * @alias module:api/PagesApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;



    /**
     * Finds page
     * Finds single page 
     * @param {Number} pageId page id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/Page} and HTTP response
     */
    this.findPageWithHttpInfo = function(pageId) {
      var postBody = null;

      // verify the required parameter 'pageId' is set
      if (pageId === undefined || pageId === null) {
        throw new Error("Missing the required parameter 'pageId' when calling findPage");
      }


      var pathParams = {
        'pageId': pageId
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
      var returnType = Page;

      return this.apiClient.callApi(
        '/pages/{pageId}', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Finds page
     * Finds single page 
     * @param {Number} pageId page id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/Page}
     */
    this.findPage = function(pageId) {
      return this.findPageWithHttpInfo(pageId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Returns page content in all available languages
     * Returns single page content in all available languages 
     * @param {Number} pageId page id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/LocalizedValue>} and HTTP response
     */
    this.findPageContentWithHttpInfo = function(pageId) {
      var postBody = null;

      // verify the required parameter 'pageId' is set
      if (pageId === undefined || pageId === null) {
        throw new Error("Missing the required parameter 'pageId' when calling findPageContent");
      }


      var pathParams = {
        'pageId': pageId
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
        '/pages/{pageId}/content', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Returns page content in all available languages
     * Returns single page content in all available languages 
     * @param {Number} pageId page id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/LocalizedValue>}
     */
    this.findPageContent = function(pageId) {
      return this.findPageContentWithHttpInfo(pageId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Returns a single page image
     * Returns a single page image 
     * @param {Number} pageId Page Id
     * @param {Number} imageId Page image id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link module:model/PageImage} and HTTP response
     */
    this.findPageImageWithHttpInfo = function(pageId, imageId) {
      var postBody = null;

      // verify the required parameter 'pageId' is set
      if (pageId === undefined || pageId === null) {
        throw new Error("Missing the required parameter 'pageId' when calling findPageImage");
      }

      // verify the required parameter 'imageId' is set
      if (imageId === undefined || imageId === null) {
        throw new Error("Missing the required parameter 'imageId' when calling findPageImage");
      }


      var pathParams = {
        'pageId': pageId,
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
      var returnType = PageImage;

      return this.apiClient.callApi(
        '/pages/{pageId}/images/{imageId}', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Returns a single page image
     * Returns a single page image 
     * @param {Number} pageId Page Id
     * @param {Number} imageId Page image id
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link module:model/PageImage}
     */
    this.findPageImage = function(pageId, imageId) {
      return this.findPageImageWithHttpInfo(pageId, imageId)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Returns an page image data
     * Returns an page image data 
     * @param {Number} pageId Page id
     * @param {Number} imageId Page image id
     * @param {Object} opts Optional parameters
     * @param {Number} opts.size Maximum width or height of image
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link 'Blob'} and HTTP response
     */
    this.getPageImageDataWithHttpInfo = function(pageId, imageId, opts) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'pageId' is set
      if (pageId === undefined || pageId === null) {
        throw new Error("Missing the required parameter 'pageId' when calling getPageImageData");
      }

      // verify the required parameter 'imageId' is set
      if (imageId === undefined || imageId === null) {
        throw new Error("Missing the required parameter 'imageId' when calling getPageImageData");
      }


      var pathParams = {
        'pageId': pageId,
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
        '/pages/{pageId}/images/{imageId}/data', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Returns an page image data
     * Returns an page image data 
     * @param {Number} pageId Page id
     * @param {Number} imageId Page image id
     * @param {Object} opts Optional parameters
     * @param {Number} opts.size Maximum width or height of image
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link 'Blob'}
     */
    this.getPageImageData = function(pageId, imageId, opts) {
      return this.getPageImageDataWithHttpInfo(pageId, imageId, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Returns a list of page images
     * Returns a list of page images 
     * @param {Number} pageId Page id
     * @param {Object} opts Optional parameters
     * @param {String} opts.type Filter by type
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/PageImage>} and HTTP response
     */
    this.listPageImagesWithHttpInfo = function(pageId, opts) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'pageId' is set
      if (pageId === undefined || pageId === null) {
        throw new Error("Missing the required parameter 'pageId' when calling listPageImages");
      }


      var pathParams = {
        'pageId': pageId
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
      var returnType = [PageImage];

      return this.apiClient.callApi(
        '/pages/{pageId}/images', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Returns a list of page images
     * Returns a list of page images 
     * @param {Number} pageId Page id
     * @param {Object} opts Optional parameters
     * @param {String} opts.type Filter by type
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/PageImage>}
     */
    this.listPageImages = function(pageId, opts) {
      return this.listPageImagesWithHttpInfo(pageId, opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }


    /**
     * Lists pages
     * Lists pages 
     * @param {Object} opts Optional parameters
     * @param {Number} opts.parentId Filter results by parent id
     * @param {String} opts.path Filter results by page path
     * @param {Number} opts.firstResult First result
     * @param {Number} opts.maxResults Max results
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with an object containing data of type {@link Array.<module:model/Page>} and HTTP response
     */
    this.listPagesWithHttpInfo = function(opts) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
        'parentId': opts['parentId'],
        'path': opts['path'],
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
      var returnType = [Page];

      return this.apiClient.callApi(
        '/pages', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType
      );
    }

    /**
     * Lists pages
     * Lists pages 
     * @param {Object} opts Optional parameters
     * @param {Number} opts.parentId Filter results by parent id
     * @param {String} opts.path Filter results by page path
     * @param {Number} opts.firstResult First result
     * @param {Number} opts.maxResults Max results
     * @return {Promise} a {@link https://www.promisejs.org/|Promise}, with data of type {@link Array.<module:model/Page>}
     */
    this.listPages = function(opts) {
      return this.listPagesWithHttpInfo(opts)
        .then(function(response_and_data) {
          return response_and_data.data;
        });
    }
  };

  return exports;
}));
