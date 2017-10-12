# SoteapiClient.PagesApi

All URIs are relative to *https://localhost/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findPage**](PagesApi.md#findPage) | **GET** /pages/{pageId} | Finds page
[**findPageContent**](PagesApi.md#findPageContent) | **GET** /pages/{pageId}/content | Returns page content in all available languages
[**findPageImage**](PagesApi.md#findPageImage) | **GET** /pages/{pageId}/images/{imageId} | Returns a single page image
[**getPageImageData**](PagesApi.md#getPageImageData) | **GET** /pages/{pageId}/images/{imageId}/data | Returns an page image data
[**listPageImages**](PagesApi.md#listPageImages) | **GET** /pages/{pageId}/images | Returns a list of page images
[**listPages**](PagesApi.md#listPages) | **GET** /pages | Lists pages


<a name="findPage"></a>
# **findPage**
> Page findPage(pageId)

Finds page

Finds single page 

### Example
```javascript
var SoteapiClient = require('soteapi-client');

var apiInstance = new SoteapiClient.PagesApi();

var pageId = 789; // Number | page id

apiInstance.findPage(pageId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageId** | **Number**| page id | 

### Return type

[**Page**](Page.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findPageContent"></a>
# **findPageContent**
> [LocalizedValue] findPageContent(pageId)

Returns page content in all available languages

Returns single page content in all available languages 

### Example
```javascript
var SoteapiClient = require('soteapi-client');

var apiInstance = new SoteapiClient.PagesApi();

var pageId = 789; // Number | page id

apiInstance.findPageContent(pageId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageId** | **Number**| page id | 

### Return type

[**[LocalizedValue]**](LocalizedValue.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="findPageImage"></a>
# **findPageImage**
> PageImage findPageImage(pageId, imageId)

Returns a single page image

Returns a single page image 

### Example
```javascript
var SoteapiClient = require('soteapi-client');

var apiInstance = new SoteapiClient.PagesApi();

var pageId = 789; // Number | Page Id

var imageId = 789; // Number | Page image id

apiInstance.findPageImage(pageId, imageId).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageId** | **Number**| Page Id | 
 **imageId** | **Number**| Page image id | 

### Return type

[**PageImage**](PageImage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="getPageImageData"></a>
# **getPageImageData**
> &#39;Blob&#39; getPageImageData(pageId, imageId, opts)

Returns an page image data

Returns an page image data 

### Example
```javascript
var SoteapiClient = require('soteapi-client');

var apiInstance = new SoteapiClient.PagesApi();

var pageId = 789; // Number | Page id

var imageId = 789; // Number | Page image id

var opts = { 
  'size': 56 // Number | Maximum width or height of image
};
apiInstance.getPageImageData(pageId, imageId, opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageId** | **Number**| Page id | 
 **imageId** | **Number**| Page image id | 
 **size** | **Number**| Maximum width or height of image | [optional] 

### Return type

**&#39;Blob&#39;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/octet-stream

<a name="listPageImages"></a>
# **listPageImages**
> [PageImage] listPageImages(pageId, opts)

Returns a list of page images

Returns a list of page images 

### Example
```javascript
var SoteapiClient = require('soteapi-client');

var apiInstance = new SoteapiClient.PagesApi();

var pageId = 789; // Number | Page id

var opts = { 
  'type': "type_example" // String | Filter by type
};
apiInstance.listPageImages(pageId, opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pageId** | **Number**| Page id | 
 **type** | **String**| Filter by type | [optional] 

### Return type

[**[PageImage]**](PageImage.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

<a name="listPages"></a>
# **listPages**
> [Page] listPages(opts)

Lists pages

Lists pages 

### Example
```javascript
var SoteapiClient = require('soteapi-client');

var apiInstance = new SoteapiClient.PagesApi();

var opts = { 
  'parentId': 789, // Number | Filter results by parent id
  'path': "path_example", // String | Filter results by page path
  'firstResult': 789, // Number | First result
  'maxResults': 789 // Number | Max results
};
apiInstance.listPages(opts).then(function(data) {
  console.log('API called successfully. Returned data: ' + data);
}, function(error) {
  console.error(error);
});

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parentId** | **Number**| Filter results by parent id | [optional] 
 **path** | **String**| Filter results by page path | [optional] 
 **firstResult** | **Number**| First result | [optional] 
 **maxResults** | **Number**| Max results | [optional] 

### Return type

[**[Page]**](Page.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8

