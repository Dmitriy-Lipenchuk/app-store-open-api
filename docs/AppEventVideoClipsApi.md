# AppEventVideoClipsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**appEventVideoClipsCreateInstance**](AppEventVideoClipsApi.md#appEventVideoClipsCreateInstance) | **POST** /v1/appEventVideoClips |  |
| [**appEventVideoClipsDeleteInstance**](AppEventVideoClipsApi.md#appEventVideoClipsDeleteInstance) | **DELETE** /v1/appEventVideoClips/{id} |  |
| [**appEventVideoClipsGetInstance**](AppEventVideoClipsApi.md#appEventVideoClipsGetInstance) | **GET** /v1/appEventVideoClips/{id} |  |
| [**appEventVideoClipsUpdateInstance**](AppEventVideoClipsApi.md#appEventVideoClipsUpdateInstance) | **PATCH** /v1/appEventVideoClips/{id} |  |



## appEventVideoClipsCreateInstance

> AppEventVideoClipResponse appEventVideoClipsCreateInstance(appEventVideoClipCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppEventVideoClipsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppEventVideoClipsApi apiInstance = new AppEventVideoClipsApi(defaultClient);
        AppEventVideoClipCreateRequest appEventVideoClipCreateRequest = new AppEventVideoClipCreateRequest(); // AppEventVideoClipCreateRequest | AppEventVideoClip representation
        try {
            AppEventVideoClipResponse result = apiInstance.appEventVideoClipsCreateInstance(appEventVideoClipCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppEventVideoClipsApi#appEventVideoClipsCreateInstance");
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
| **appEventVideoClipCreateRequest** | [**AppEventVideoClipCreateRequest**](AppEventVideoClipCreateRequest.md)| AppEventVideoClip representation | |

### Return type

[**AppEventVideoClipResponse**](AppEventVideoClipResponse.md)

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
| **201** | Single AppEventVideoClip |  -  |
| **409** | Request entity error(s) |  -  |


## appEventVideoClipsDeleteInstance

> appEventVideoClipsDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppEventVideoClipsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppEventVideoClipsApi apiInstance = new AppEventVideoClipsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.appEventVideoClipsDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppEventVideoClipsApi#appEventVideoClipsDeleteInstance");
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


## appEventVideoClipsGetInstance

> AppEventVideoClipResponse appEventVideoClipsGetInstance(id, fieldsAppEventVideoClips, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppEventVideoClipsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppEventVideoClipsApi apiInstance = new AppEventVideoClipsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAppEventVideoClips = Arrays.asList(); // List<String> | the fields to include for returned resources of type appEventVideoClips
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            AppEventVideoClipResponse result = apiInstance.appEventVideoClipsGetInstance(id, fieldsAppEventVideoClips, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppEventVideoClipsApi#appEventVideoClipsGetInstance");
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
| **fieldsAppEventVideoClips** | **List&lt;String&gt;**| the fields to include for returned resources of type appEventVideoClips | [optional] [enum: appEventAssetType, appEventLocalization, assetDeliveryState, fileName, fileSize, previewFrameTimeCode, previewImage, uploadOperations, uploaded, videoUrl] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: appEventLocalization] |

### Return type

[**AppEventVideoClipResponse**](AppEventVideoClipResponse.md)

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
| **200** | Single AppEventVideoClip |  -  |


## appEventVideoClipsUpdateInstance

> AppEventVideoClipResponse appEventVideoClipsUpdateInstance(id, appEventVideoClipUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppEventVideoClipsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppEventVideoClipsApi apiInstance = new AppEventVideoClipsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        AppEventVideoClipUpdateRequest appEventVideoClipUpdateRequest = new AppEventVideoClipUpdateRequest(); // AppEventVideoClipUpdateRequest | AppEventVideoClip representation
        try {
            AppEventVideoClipResponse result = apiInstance.appEventVideoClipsUpdateInstance(id, appEventVideoClipUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppEventVideoClipsApi#appEventVideoClipsUpdateInstance");
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
| **appEventVideoClipUpdateRequest** | [**AppEventVideoClipUpdateRequest**](AppEventVideoClipUpdateRequest.md)| AppEventVideoClip representation | |

### Return type

[**AppEventVideoClipResponse**](AppEventVideoClipResponse.md)

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
| **404** | Not found error |  -  |
| **422** | Unprocessable request entity error(s) |  -  |
| **200** | Single AppEventVideoClip |  -  |
| **409** | Request entity error(s) |  -  |

