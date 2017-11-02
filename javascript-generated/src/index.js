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

(function(factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/BadRequest', 'model/Category', 'model/Content', 'model/ContentImage', 'model/Forbidden', 'model/InternalServerError', 'model/LocalizedValue', 'model/NotFound', 'model/NotImplemented', 'api/CategoriesApi', 'api/ContentsApi'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('./ApiClient'), require('./model/BadRequest'), require('./model/Category'), require('./model/Content'), require('./model/ContentImage'), require('./model/Forbidden'), require('./model/InternalServerError'), require('./model/LocalizedValue'), require('./model/NotFound'), require('./model/NotImplemented'), require('./api/CategoriesApi'), require('./api/ContentsApi'));
  }
}(function(ApiClient, BadRequest, Category, Content, ContentImage, Forbidden, InternalServerError, LocalizedValue, NotFound, NotImplemented, CategoriesApi, ContentsApi) {
  'use strict';

  /**
   * SOTE_API.<br>
   * The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
   * <p>
   * An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
   * <pre>
   * var SoteapiClient = require('index'); // See note below*.
   * var xxxSvc = new SoteapiClient.XxxApi(); // Allocate the API class we're going to use.
   * var yyyModel = new SoteapiClient.Yyy(); // Construct a model instance.
   * yyyModel.someProperty = 'someValue';
   * ...
   * var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
   * ...
   * </pre>
   * <em>*NOTE: For a top-level AMD script, use require(['index'], function(){...})
   * and put the application logic within the callback function.</em>
   * </p>
   * <p>
   * A non-AMD browser application (discouraged) might do something like this:
   * <pre>
   * var xxxSvc = new SoteapiClient.XxxApi(); // Allocate the API class we're going to use.
   * var yyy = new SoteapiClient.Yyy(); // Construct a model instance.
   * yyyModel.someProperty = 'someValue';
   * ...
   * var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
   * ...
   * </pre>
   * </p>
   * @module index
   * @version 0.0.13
   */
  var exports = {
    /**
     * The ApiClient constructor.
     * @property {module:ApiClient}
     */
    ApiClient: ApiClient,
    /**
     * The BadRequest model constructor.
     * @property {module:model/BadRequest}
     */
    BadRequest: BadRequest,
    /**
     * The Category model constructor.
     * @property {module:model/Category}
     */
    Category: Category,
    /**
     * The Content model constructor.
     * @property {module:model/Content}
     */
    Content: Content,
    /**
     * The ContentImage model constructor.
     * @property {module:model/ContentImage}
     */
    ContentImage: ContentImage,
    /**
     * The Forbidden model constructor.
     * @property {module:model/Forbidden}
     */
    Forbidden: Forbidden,
    /**
     * The InternalServerError model constructor.
     * @property {module:model/InternalServerError}
     */
    InternalServerError: InternalServerError,
    /**
     * The LocalizedValue model constructor.
     * @property {module:model/LocalizedValue}
     */
    LocalizedValue: LocalizedValue,
    /**
     * The NotFound model constructor.
     * @property {module:model/NotFound}
     */
    NotFound: NotFound,
    /**
     * The NotImplemented model constructor.
     * @property {module:model/NotImplemented}
     */
    NotImplemented: NotImplemented,
    /**
     * The CategoriesApi service constructor.
     * @property {module:api/CategoriesApi}
     */
    CategoriesApi: CategoriesApi,
    /**
     * The ContentsApi service constructor.
     * @property {module:api/ContentsApi}
     */
    ContentsApi: ContentsApi
  };

  return exports;
}));
