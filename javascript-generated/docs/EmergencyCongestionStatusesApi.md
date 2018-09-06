# SoteapiClient.EmergencyCongestionStatusesApi

All URIs are relative to *https://localhost/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listEmergencyCongestionStatuses**](EmergencyCongestionStatusesApi.md#listEmergencyCongestionStatuses) | **GET** /emergencyCongestionStatuses | Lists emergency congestion statuses


<a name="listEmergencyCongestionStatuses"></a>
# **listEmergencyCongestionStatuses**
> [EmergencyCongestionStatus] listEmergencyCongestionStatuses(opts)

Lists emergency congestion statuses

List of emergency congestion statuses

### Example
```javascript
var SoteapiClient = require('soteapi-client');

var apiInstance = new SoteapiClient.EmergencyCongestionStatusesApi();

var opts = { 
  'sort': "sort_example", // String | Sort results. See EmergencyCongestionStatusListSort for sort options
  'firstResult': 789, // Number | First result
  'maxResults': 789 // Number | Max results
};
apiInstance.listEmergencyCongestionStatuses(opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| Sort results. See EmergencyCongestionStatusListSort for sort options | [optional] 
 **firstResult** | **Number**| First result | [optional] 
 **maxResults** | **Number**| Max results | [optional] 

### Return type

[**[EmergencyCongestionStatus]**](EmergencyCongestionStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

