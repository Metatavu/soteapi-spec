# SoteapiClient.EventsApi

All URIs are relative to *https://localhost/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findEvent**](EventsApi.md#findEvent) | **GET** /events/{eventId} | Finds event
[**listEvents**](EventsApi.md#listEvents) | **GET** /events | Lists events


<a name="findEvent"></a>
# **findEvent**
> Event findEvent(eventId)

Finds event

Finds single event 

### Example
```javascript
var SoteapiClient = require('soteapi-client');

var apiInstance = new SoteapiClient.EventsApi();

var eventId = 789; // Number | event id

apiInstance.findEvent(eventId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventId** | **Number**| event id | 

### Return type

[**Event**](Event.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listEvents"></a>
# **listEvents**
> [Event] listEvents(opts)

Lists events

Lists events 

### Example
```javascript
var SoteapiClient = require('soteapi-client');

var apiInstance = new SoteapiClient.EventsApi();

var opts = { 
  'endsAfter': "endsAfter_example", // String | 
  'startsBefore': "startsBefore_example", // String | 
  'categorySlug': "categorySlug_example", // String | Filter by category slug
  'firstResult': 789, // Number | First result
  'maxResults': 789 // Number | Max results
};
apiInstance.listEvents(opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **endsAfter** | **String**|  | [optional] 
 **startsBefore** | **String**|  | [optional] 
 **categorySlug** | **String**| Filter by category slug | [optional] 
 **firstResult** | **Number**| First result | [optional] 
 **maxResults** | **Number**| Max results | [optional] 

### Return type

[**[Event]**](Event.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

