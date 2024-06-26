# AppClipAdvancedExperienceImagesApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**appClipAdvancedExperienceImagesCreateInstance**](AppClipAdvancedExperienceImagesApi.md#appClipAdvancedExperienceImagesCreateInstance) | **POST** /v1/appClipAdvancedExperienceImages |  |
| [**appClipAdvancedExperienceImagesGetInstance**](AppClipAdvancedExperienceImagesApi.md#appClipAdvancedExperienceImagesGetInstance) | **GET** /v1/appClipAdvancedExperienceImages/{id} |  |
| [**appClipAdvancedExperienceImagesUpdateInstance**](AppClipAdvancedExperienceImagesApi.md#appClipAdvancedExperienceImagesUpdateInstance) | **PATCH** /v1/appClipAdvancedExperienceImages/{id} |  |



## appClipAdvancedExperienceImagesCreateInstance

> AppClipAdvancedExperienceImageResponse appClipAdvancedExperienceImagesCreateInstance(appClipAdvancedExperienceImageCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppClipAdvancedExperienceImagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppClipAdvancedExperienceImagesApi apiInstance = new AppClipAdvancedExperienceImagesApi(defaultClient);
        AppClipAdvancedExperienceImageCreateRequest appClipAdvancedExperienceImageCreateRequest = new AppClipAdvancedExperienceImageCreateRequest(); // AppClipAdvancedExperienceImageCreateRequest | AppClipAdvancedExperienceImage representation
        try {
            AppClipAdvancedExperienceImageResponse result = apiInstance.appClipAdvancedExperienceImagesCreateInstance(appClipAdvancedExperienceImageCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppClipAdvancedExperienceImagesApi#appClipAdvancedExperienceImagesCreateInstance");
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
| **appClipAdvancedExperienceImageCreateRequest** | [**AppClipAdvancedExperienceImageCreateRequest**](AppClipAdvancedExperienceImageCreateRequest.md)| AppClipAdvancedExperienceImage representation | |

### Return type

[**AppClipAdvancedExperienceImageResponse**](AppClipAdvancedExperienceImageResponse.md)

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
| **201** | Single AppClipAdvancedExperienceImage |  -  |
| **409** | Request entity error(s) |  -  |


## appClipAdvancedExperienceImagesGetInstance

> AppClipAdvancedExperienceImageResponse appClipAdvancedExperienceImagesGetInstance(id, fieldsAppClipAdvancedExperienceImages)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppClipAdvancedExperienceImagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppClipAdvancedExperienceImagesApi apiInstance = new AppClipAdvancedExperienceImagesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAppClipAdvancedExperienceImages = Arrays.asList(); // List<String> | the fields to include for returned resources of type appClipAdvancedExperienceImages
        try {
            AppClipAdvancedExperienceImageResponse result = apiInstance.appClipAdvancedExperienceImagesGetInstance(id, fieldsAppClipAdvancedExperienceImages);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppClipAdvancedExperienceImagesApi#appClipAdvancedExperienceImagesGetInstance");
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
| **fieldsAppClipAdvancedExperienceImages** | **List&lt;String&gt;**| the fields to include for returned resources of type appClipAdvancedExperienceImages | [optional] [enum: assetDeliveryState, fileName, fileSize, imageAsset, sourceFileChecksum, uploadOperations, uploaded] |

### Return type

[**AppClipAdvancedExperienceImageResponse**](AppClipAdvancedExperienceImageResponse.md)

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
| **200** | Single AppClipAdvancedExperienceImage |  -  |


## appClipAdvancedExperienceImagesUpdateInstance

> AppClipAdvancedExperienceImageResponse appClipAdvancedExperienceImagesUpdateInstance(id, appClipAdvancedExperienceImageUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppClipAdvancedExperienceImagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppClipAdvancedExperienceImagesApi apiInstance = new AppClipAdvancedExperienceImagesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        AppClipAdvancedExperienceImageUpdateRequest appClipAdvancedExperienceImageUpdateRequest = new AppClipAdvancedExperienceImageUpdateRequest(); // AppClipAdvancedExperienceImageUpdateRequest | AppClipAdvancedExperienceImage representation
        try {
            AppClipAdvancedExperienceImageResponse result = apiInstance.appClipAdvancedExperienceImagesUpdateInstance(id, appClipAdvancedExperienceImageUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppClipAdvancedExperienceImagesApi#appClipAdvancedExperienceImagesUpdateInstance");
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
| **appClipAdvancedExperienceImageUpdateRequest** | [**AppClipAdvancedExperienceImageUpdateRequest**](AppClipAdvancedExperienceImageUpdateRequest.md)| AppClipAdvancedExperienceImage representation | |

### Return type

[**AppClipAdvancedExperienceImageResponse**](AppClipAdvancedExperienceImageResponse.md)

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
| **200** | Single AppClipAdvancedExperienceImage |  -  |
| **409** | Request entity error(s) |  -  |

