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
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.SoteapiClient) {
      root.SoteapiClient = {};
    }
    root.SoteapiClient.EmergencyCongestionStatusListSort = factory(root.SoteapiClient.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';


  /**
   * Enum class EmergencyCongestionStatusListSort.
   * @enum {}
   * @readonly
   */
  var exports = {
    /**
     * value: "CREATED_DESC"
     * @const
     */
    "DESC": "CREATED_DESC",
    /**
     * value: "CREATED_ASC"
     * @const
     */
    "ASC": "CREATED_ASC"  };

  /**
   * Returns a <code>EmergencyCongestionStatusListSort</code> enum value from a Javascript object name.
   * @param {Object} data The plain JavaScript object containing the name of the enum value.
   * @return {module:model/EmergencyCongestionStatusListSort} The enum <code>EmergencyCongestionStatusListSort</code> value.
   */
  exports.constructFromObject = function(object) {
    return object;
  }

  return exports;
}));

