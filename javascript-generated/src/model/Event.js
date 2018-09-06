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
    define(['ApiClient', 'model/LocalizedValue'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./LocalizedValue'));
  } else {
    // Browser globals (root is window)
    if (!root.SoteapiClient) {
      root.SoteapiClient = {};
    }
    root.SoteapiClient.Event = factory(root.SoteapiClient.ApiClient, root.SoteapiClient.LocalizedValue);
  }
}(this, function(ApiClient, LocalizedValue) {
  'use strict';




  /**
   * The Event model module.
   * @module model/Event
   * @version 0.0.19
   */

  /**
   * Constructs a new <code>Event</code>.
   * @alias module:model/Event
   * @class
   */
  var exports = function() {
    var _this = this;











  };

  /**
   * Constructs a <code>Event</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Event} obj Optional instance to populate.
   * @return {module:model/Event} The populated <code>Event</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'Number');
      }
      if (data.hasOwnProperty('slug')) {
        obj['slug'] = ApiClient.convertToType(data['slug'], 'String');
      }
      if (data.hasOwnProperty('category')) {
        obj['category'] = ApiClient.convertToType(data['category'], 'String');
      }
      if (data.hasOwnProperty('title')) {
        obj['title'] = ApiClient.convertToType(data['title'], [LocalizedValue]);
      }
      if (data.hasOwnProperty('description')) {
        obj['description'] = ApiClient.convertToType(data['description'], [LocalizedValue]);
      }
      if (data.hasOwnProperty('startDate')) {
        obj['startDate'] = ApiClient.convertToType(data['startDate'], 'Date');
      }
      if (data.hasOwnProperty('startTime')) {
        obj['startTime'] = ApiClient.convertToType(data['startTime'], 'String');
      }
      if (data.hasOwnProperty('endDate')) {
        obj['endDate'] = ApiClient.convertToType(data['endDate'], 'Date');
      }
      if (data.hasOwnProperty('endTime')) {
        obj['endTime'] = ApiClient.convertToType(data['endTime'], 'String');
      }
      if (data.hasOwnProperty('allDay')) {
        obj['allDay'] = ApiClient.convertToType(data['allDay'], 'Boolean');
      }
    }
    return obj;
  }

  /**
   * @member {Number} id
   */
  exports.prototype['id'] = undefined;
  /**
   * @member {String} slug
   */
  exports.prototype['slug'] = undefined;
  /**
   * Category slug
   * @member {String} category
   */
  exports.prototype['category'] = undefined;
  /**
   * @member {Array.<module:model/LocalizedValue>} title
   */
  exports.prototype['title'] = undefined;
  /**
   * @member {Array.<module:model/LocalizedValue>} description
   */
  exports.prototype['description'] = undefined;
  /**
   * Event's start date.
   * @member {Date} startDate
   */
  exports.prototype['startDate'] = undefined;
  /**
   * Event's start time.
   * @member {String} startTime
   */
  exports.prototype['startTime'] = undefined;
  /**
   * Event's end date.
   * @member {Date} endDate
   */
  exports.prototype['endDate'] = undefined;
  /**
   * Event's end time.
   * @member {String} endTime
   */
  exports.prototype['endTime'] = undefined;
  /**
   * @member {Boolean} allDay
   */
  exports.prototype['allDay'] = undefined;



  return exports;
}));


