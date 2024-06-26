# AppPreviewsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**appPreviewsCreateInstance**](AppPreviewsApi.md#appPreviewsCreateInstance) | **POST** /v1/appPreviews |  |
| [**appPreviewsDeleteInstance**](AppPreviewsApi.md#appPreviewsDeleteInstance) | **DELETE** /v1/appPreviews/{id} |  |
| [**appPreviewsGetInstance**](AppPreviewsApi.md#appPreviewsGetInstance) | **GET** /v1/appPreviews/{id} |  |
| [**appPreviewsUpdateInstance**](AppPreviewsApi.md#appPreviewsUpdateInstance) | **PATCH** /v1/appPreviews/{id} |  |



## appPreviewsCreateInstance

> AppPreviewResponse appPreviewsCreateInstance(appPreviewCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppPreviewsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppPreviewsApi apiInstance = new AppPreviewsApi(defaultClient);
        AppPreviewCreateRequest appPreviewCreateRequest = new AppPreviewCreateRequest(); // AppPreviewCreateRequest | AppPreview representation
        try {
            AppPreviewResponse result = apiInstance.appPreviewsCreateInstance(appPreviewCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppPreviewsApi#appPreviewsCreateInstance");
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
| **appPreviewCreateRequest** | [**AppPreviewCreateRequest**](AppPreviewCreateRequest.md)| AppPreview representation | |

### Return type

[**AppPreviewResponse**](AppPreviewResponse.md)

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
| **201** | Single AppPreview |  -  |
| **409** | Request entity error(s) |  -  |


## appPreviewsDeleteInstance

> appPreviewsDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppPreviewsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppPreviewsApi apiInstance = new AppPreviewsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.appPreviewsDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppPreviewsApi#appPreviewsDeleteInstance");
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


## appPreviewsGetInstance

> AppPreviewResponse appPreviewsGetInstance(id, fieldsAppPreviews, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppPreviewsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppPreviewsApi apiInstance = new AppPreviewsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAppPreviews = Arrays.asList(); // List<String> | the fields to include for returned resources of type appPreviews
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            AppPreviewResponse result = apiInstance.appPreviewsGetInstance(id, fieldsAppPreviews, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppPreviewsApi#appPreviewsGetInstance");
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
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: appPreviewSet] |

### Return type

[**AppPreviewResponse**](AppPreviewResponse.md)

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
| **200** | Single AppPreview |  -  |


## appPreviewsUpdateInstance

> AppPreviewResponse appPreviewsUpdateInstance(id, appPreviewUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppPreviewsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppPreviewsApi apiInstance = new AppPreviewsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        AppPreviewUpdateRequest appPreviewUpdateRequest = new AppPreviewUpdateRequest(); // AppPreviewUpdateRequest | AppPreview representation
        try {
            AppPreviewResponse result = apiInstance.appPreviewsUpdateInstance(id, appPreviewUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppPreviewsApi#appPreviewsUpdateInstance");
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
| **appPreviewUpdateRequest** | [**AppPreviewUpdateRequest**](AppPreviewUpdateRequest.md)| AppPreview representation | |

### Return type

[**AppPreviewResponse**](AppPreviewResponse.md)

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
| **200** | Single AppPreview |  -  |
| **409** | Request entity error(s) |  -  |

