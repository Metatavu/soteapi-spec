# SoteapiClient.ContentsApi

All URIs are relative to *https://localhost/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findContent**](ContentsApi.md#findContent) | **GET** /contents/{contentId} | Finds content
[**findContentData**](ContentsApi.md#findContentData) | **GET** /contents/{contentId}/content | Returns content content in all available languages
[**findContentImage**](ContentsApi.md#findContentImage) | **GET** /contents/{contentId}/images/{imageId} | Returns a single content image
[**getContentImageData**](ContentsApi.md#getContentImageData) | **GET** /contents/{contentId}/images/{imageId}/data | Returns an content image data
[**listContentImages**](ContentsApi.md#listContentImages) | **GET** /contents/{contentId}/images | Returns a list of content images
[**listContents**](ContentsApi.md#listContents) | **GET** /contents | Lists contents


<a name="findContent"></a>
# **findContent**
> Content findContent(contentId)

Finds content

Finds single content 

### Example
```javascript
var SoteapiClient = require('soteapi-client');

var apiInstance = new SoteapiClient.ContentsApi();

var contentId = 789; // Number | content id

apiInstance.findContent(contentId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentId** | **Number**| content id | 

### Return type

[**Content**](Content.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findContentData"></a>
# **findContentData**
> [LocalizedValue] findContentData(contentId)

Returns content content in all available languages

Returns single content content in all available languages 

### Example
```javascript
var SoteapiClient = require('soteapi-client');

var apiInstance = new SoteapiClient.ContentsApi();

var contentId = 789; // Number | content id

apiInstance.findContentData(contentId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentId** | **Number**| content id | 

### Return type

[**[LocalizedValue]**](LocalizedValue.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findContentImage"></a>
# **findContentImage**
> ContentImage findContentImage(contentId, imageId)

Returns a single content image

Returns a single content image 

### Example
```javascript
var SoteapiClient = require('soteapi-client');

var apiInstance = new SoteapiClient.ContentsApi();

var contentId = 789; // Number | Content Id

var imageId = 789; // Number | Content image id

apiInstance.findContentImage(contentId, imageId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentId** | **Number**| Content Id | 
 **imageId** | **Number**| Content image id | 

### Return type

[**ContentImage**](ContentImage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="getContentImageData"></a>
# **getContentImageData**
> &#39;Blob&#39; getContentImageData(contentId, imageId, opts)

Returns an content image data

Returns an content image data 

### Example
```javascript
var SoteapiClient = require('soteapi-client');

var apiInstance = new SoteapiClient.ContentsApi();

var contentId = 789; // Number | Content id

var imageId = 789; // Number | Content image id

var opts = { 
  'size': 56 // Number | Maximum width or height of image
};
apiInstance.getContentImageData(contentId, imageId, opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentId** | **Number**| Content id | 
 **imageId** | **Number**| Content image id | 
 **size** | **Number**| Maximum width or height of image | [optional] 

### Return type

**&#39;Blob&#39;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/octet-stream

<a name="listContentImages"></a>
# **listContentImages**
> [ContentImage] listContentImages(contentId, opts)

Returns a list of content images

Returns a list of content images 

### Example
```javascript
var SoteapiClient = require('soteapi-client');

var apiInstance = new SoteapiClient.ContentsApi();

var contentId = 789; // Number | Content id

var opts = { 
  'type': "type_example" // String | Filter by type
};
apiInstance.listContentImages(contentId, opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **contentId** | **Number**| Content id | 
 **type** | **String**| Filter by type | [optional] 

### Return type

[**[ContentImage]**](ContentImage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listContents"></a>
# **listContents**
> [Content] listContents(opts)

Lists contents

Lists contents 

### Example
```javascript
var SoteapiClient = require('soteapi-client');

var apiInstance = new SoteapiClient.ContentsApi();

var opts = { 
  'parentId': "parentId_example", // String | Filter results by parent id
  'type': ["type_example"], // [String] | Filter results by content type
  'categorySlug': "categorySlug_example", // String | Filter by category slug
  'firstResult': 789, // Number | First result
  'maxResults': 789 // Number | Max results
};
apiInstance.listContents(opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **String**| Filter results by parent id | [optional] 
 **type** | [**[String]**](String.md)| Filter results by content type | [optional] 
 **categorySlug** | **String**| Filter by category slug | [optional] 
 **firstResult** | **Number**| First result | [optional] 
 **maxResults** | **Number**| Max results | [optional] 

### Return type

[**[Content]**](Content.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

