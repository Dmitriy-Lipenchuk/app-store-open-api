# AppPreviewSetsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**appPreviewSetsAppPreviewsGetToManyRelated**](AppPreviewSetsApi.md#appPreviewSetsAppPreviewsGetToManyRelated) | **GET** /v1/appPreviewSets/{id}/appPreviews |  |
| [**appPreviewSetsAppPreviewsGetToManyRelationship**](AppPreviewSetsApi.md#appPreviewSetsAppPreviewsGetToManyRelationship) | **GET** /v1/appPreviewSets/{id}/relationships/appPreviews |  |
| [**appPreviewSetsAppPreviewsReplaceToManyRelationship**](AppPreviewSetsApi.md#appPreviewSetsAppPreviewsReplaceToManyRelationship) | **PATCH** /v1/appPreviewSets/{id}/relationships/appPreviews |  |
| [**appPreviewSetsCreateInstance**](AppPreviewSetsApi.md#appPreviewSetsCreateInstance) | **POST** /v1/appPreviewSets |  |
| [**appPreviewSetsDeleteInstance**](AppPreviewSetsApi.md#appPreviewSetsDeleteInstance) | **DELETE** /v1/appPreviewSets/{id} |  |
| [**appPreviewSetsGetInstance**](AppPreviewSetsApi.md#appPreviewSetsGetInstance) | **GET** /v1/appPreviewSets/{id} |  |



## appPreviewSetsAppPreviewsGetToManyRelated

> AppPreviewsResponse appPreviewSetsAppPreviewsGetToManyRelated(id, fieldsAppPreviews, fieldsAppPreviewSets, limit, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppPreviewSetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppPreviewSetsApi apiInstance = new AppPreviewSetsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAppPreviews = Arrays.asList(); // List<String> | the fields to include for returned resources of type appPreviews
        List<String> fieldsAppPreviewSets = Arrays.asList(); // List<String> | the fields to include for returned resources of type appPreviewSets
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            AppPreviewsResponse result = apiInstance.appPreviewSetsAppPreviewsGetToManyRelated(id, fieldsAppPreviews, fieldsAppPreviewSets, limit, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppPreviewSetsApi#appPreviewSetsAppPreviewsGetToManyRelated");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| the id of the requested resource | |
| **fieldsAppPreviews** | **List&lt;String&gt;**| the fields to include for returned resources of type appPreviews | [optional] [enum: appPreviewSet, assetDeliveryState, fileName, fileSize, mimeType, previewFrameTimeCode, previewImage, sourceFileChecksum, uploadOperations, uploaded, videoUrl] |
| **fieldsAppPreviewSets** | **List&lt;String&gt;**| the fields to include for returned resources of type appPreviewSets | [optional] [enum: appCustomProductPageLocalization, appPreviews, appStoreVersionExperimentTreatmentLocalization, appStoreVersionLocalization, previewType] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: appPreviewSet] |

### Return type

[**AppPreviewsResponse**](AppPreviewsResponse.md)

### Authorization

[itc-bearer-token](../README.md#itc-bearer-token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Parameter error(s) |  -  |
| **401** | Unauthorized error(s) |  -  |
| **403** | Forbidden error |  -  |
| **404** | Not found error |  -  |
| **200** | List of AppPreviews |  -  |


## appPreviewSetsAppPreviewsGetToManyRelationship

> AppPreviewSetAppPreviewsLinkagesResponse appPreviewSetsAppPreviewsGetToManyRelationship(id, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppPreviewSetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppPreviewSetsApi apiInstance = new AppPreviewSetsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        Integer limit = 56; // Integer | maximum resources per page
        try {
            AppPreviewSetAppPreviewsLinkagesResponse result = apiInstance.appPreviewSetsAppPreviewsGetToManyRelationship(id, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppPreviewSetsApi#appPreviewSetsAppPreviewsGetToManyRelationship");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| the id of the requested resource | |
| **limit** | **Integer**| maximum resources per page | [optional] |

### Return type

[**AppPreviewSetAppPreviewsLinkagesResponse**](AppPreviewSetAppPreviewsLinkagesResponse.md)

### Authorization

[itc-bearer-token](../README.md#itc-bearer-token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Parameter error(s) |  -  |
| **401** | Unauthorized error(s) |  -  |
| **403** | Forbidden error |  -  |
| **404** | Not found error |  -  |
| **200** | List of related linkages |  -  |


## appPreviewSetsAppPreviewsReplaceToManyRelationship

> appPreviewSetsAppPreviewsReplaceToManyRelationship(id, appPreviewSetAppPreviewsLinkagesRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppPreviewSetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppPreviewSetsApi apiInstance = new AppPreviewSetsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        AppPreviewSetAppPreviewsLinkagesRequest appPreviewSetAppPreviewsLinkagesRequest = new AppPreviewSetAppPreviewsLinkagesRequest(); // AppPreviewSetAppPreviewsLinkagesRequest | List of related linkages
        try {
            apiInstance.appPreviewSetsAppPreviewsReplaceToManyRelationship(id, appPreviewSetAppPreviewsLinkagesRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppPreviewSetsApi#appPreviewSetsAppPreviewsReplaceToManyRelationship");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| the id of the requested resource | |
| **appPreviewSetAppPreviewsLinkagesRequest** | [**AppPreviewSetAppPreviewsLinkagesRequest**](AppPreviewSetAppPreviewsLinkagesRequest.md)| List of related linkages | |

### Return type

null (empty response body)

### Authorization

[itc-bearer-token](../README.md#itc-bearer-token)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | Unauthorized error(s) |  -  |
| **403** | Forbidden error |  -  |
| **404** | Not found error |  -  |
| **422** | Unprocessable request entity error(s) |  -  |
| **409** | Request entity error(s) |  -  |
| **204** | Success (no content) |  -  |


## appPreviewSetsCreateInstance

> AppPreviewSetResponse appPreviewSetsCreateInstance(appPreviewSetCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppPreviewSetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppPreviewSetsApi apiInstance = new AppPreviewSetsApi(defaultClient);
        AppPreviewSetCreateRequest appPreviewSetCreateRequest = new AppPreviewSetCreateRequest(); // AppPreviewSetCreateRequest | AppPreviewSet representation
        try {
            AppPreviewSetResponse result = apiInstance.appPreviewSetsCreateInstance(appPreviewSetCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppPreviewSetsApi#appPreviewSetsCreateInstance");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **appPreviewSetCreateRequest** | [**AppPreviewSetCreateRequest**](AppPreviewSetCreateRequest.md)| AppPreviewSet representation | |

### Return type

[**AppPreviewSetResponse**](AppPreviewSetResponse.md)

### Authorization

[itc-bearer-token](../README.md#itc-bearer-token)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Parameter error(s) |  -  |
| **401** | Unauthorized error(s) |  -  |
| **403** | Forbidden error |  -  |
| **422** | Unprocessable request entity error(s) |  -  |
| **201** | Single AppPreviewSet |  -  |
| **409** | Request entity error(s) |  -  |


## appPreviewSetsDeleteInstance

> appPreviewSetsDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppPreviewSetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppPreviewSetsApi apiInstance = new AppPreviewSetsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.appPreviewSetsDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppPreviewSetsApi#appPreviewSetsDeleteInstance");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| the id of the requested resource | |

### Return type

null (empty response body)

### Authorization

[itc-bearer-token](../README.md#itc-bearer-token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Parameter error(s) |  -  |
| **401** | Unauthorized error(s) |  -  |
| **403** | Forbidden error |  -  |
| **404** | Not found error |  -  |
| **409** | Request entity error(s) |  -  |
| **204** | Success (no content) |  -  |


## appPreviewSetsGetInstance

> AppPreviewSetResponse appPreviewSetsGetInstance(id, fieldsAppPreviewSets, include, fieldsAppPreviews, limitAppPreviews)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppPreviewSetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppPreviewSetsApi apiInstance = new AppPreviewSetsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAppPreviewSets = Arrays.asList(); // List<String> | the fields to include for returned resources of type appPreviewSets
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsAppPreviews = Arrays.asList(); // List<String> | the fields to include for returned resources of type appPreviews
        Integer limitAppPreviews = 56; // Integer | maximum number of related appPreviews returned (when they are included)
        try {
            AppPreviewSetResponse result = apiInstance.appPreviewSetsGetInstance(id, fieldsAppPreviewSets, include, fieldsAppPreviews, limitAppPreviews);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppPreviewSetsApi#appPreviewSetsGetInstance");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| the id of the requested resource | |
| **fieldsAppPreviewSets** | **List&lt;String&gt;**| the fields to include for returned resources of type appPreviewSets | [optional] [enum: appCustomProductPageLocalization, appPreviews, appStoreVersionExperimentTreatmentLocalization, appStoreVersionLocalization, previewType] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: appCustomProductPageLocalization, appPreviews, appStoreVersionExperimentTreatmentLocalization, appStoreVersionLocalization] |
| **fieldsAppPreviews** | **List&lt;String&gt;**| the fields to include for returned resources of type appPreviews | [optional] [enum: appPreviewSet, assetDeliveryState, fileName, fileSize, mimeType, previewFrameTimeCode, previewImage, sourceFileChecksum, uploadOperations, uploaded, videoUrl] |
| **limitAppPreviews** | **Integer**| maximum number of related appPreviews returned (when they are included) | [optional] |

### Return type

[**AppPreviewSetResponse**](AppPreviewSetResponse.md)

### Authorization

[itc-bearer-token](../README.md#itc-bearer-token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Parameter error(s) |  -  |
| **401** | Unauthorized error(s) |  -  |
| **403** | Forbidden error |  -  |
| **404** | Not found error |  -  |
| **200** | Single AppPreviewSet |  -  |

