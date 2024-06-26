# AppClipHeaderImagesApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**appClipHeaderImagesCreateInstance**](AppClipHeaderImagesApi.md#appClipHeaderImagesCreateInstance) | **POST** /v1/appClipHeaderImages |  |
| [**appClipHeaderImagesDeleteInstance**](AppClipHeaderImagesApi.md#appClipHeaderImagesDeleteInstance) | **DELETE** /v1/appClipHeaderImages/{id} |  |
| [**appClipHeaderImagesGetInstance**](AppClipHeaderImagesApi.md#appClipHeaderImagesGetInstance) | **GET** /v1/appClipHeaderImages/{id} |  |
| [**appClipHeaderImagesUpdateInstance**](AppClipHeaderImagesApi.md#appClipHeaderImagesUpdateInstance) | **PATCH** /v1/appClipHeaderImages/{id} |  |



## appClipHeaderImagesCreateInstance

> AppClipHeaderImageResponse appClipHeaderImagesCreateInstance(appClipHeaderImageCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppClipHeaderImagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppClipHeaderImagesApi apiInstance = new AppClipHeaderImagesApi(defaultClient);
        AppClipHeaderImageCreateRequest appClipHeaderImageCreateRequest = new AppClipHeaderImageCreateRequest(); // AppClipHeaderImageCreateRequest | AppClipHeaderImage representation
        try {
            AppClipHeaderImageResponse result = apiInstance.appClipHeaderImagesCreateInstance(appClipHeaderImageCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppClipHeaderImagesApi#appClipHeaderImagesCreateInstance");
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
| **appClipHeaderImageCreateRequest** | [**AppClipHeaderImageCreateRequest**](AppClipHeaderImageCreateRequest.md)| AppClipHeaderImage representation | |

### Return type

[**AppClipHeaderImageResponse**](AppClipHeaderImageResponse.md)

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
| **201** | Single AppClipHeaderImage |  -  |
| **409** | Request entity error(s) |  -  |


## appClipHeaderImagesDeleteInstance

> appClipHeaderImagesDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppClipHeaderImagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppClipHeaderImagesApi apiInstance = new AppClipHeaderImagesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.appClipHeaderImagesDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppClipHeaderImagesApi#appClipHeaderImagesDeleteInstance");
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


## appClipHeaderImagesGetInstance

> AppClipHeaderImageResponse appClipHeaderImagesGetInstance(id, fieldsAppClipHeaderImages, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppClipHeaderImagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppClipHeaderImagesApi apiInstance = new AppClipHeaderImagesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAppClipHeaderImages = Arrays.asList(); // List<String> | the fields to include for returned resources of type appClipHeaderImages
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            AppClipHeaderImageResponse result = apiInstance.appClipHeaderImagesGetInstance(id, fieldsAppClipHeaderImages, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppClipHeaderImagesApi#appClipHeaderImagesGetInstance");
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
| **fieldsAppClipHeaderImages** | **List&lt;String&gt;**| the fields to include for returned resources of type appClipHeaderImages | [optional] [enum: appClipDefaultExperienceLocalization, assetDeliveryState, fileName, fileSize, imageAsset, sourceFileChecksum, uploadOperations, uploaded] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: appClipDefaultExperienceLocalization] |

### Return type

[**AppClipHeaderImageResponse**](AppClipHeaderImageResponse.md)

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
| **200** | Single AppClipHeaderImage |  -  |


## appClipHeaderImagesUpdateInstance

> AppClipHeaderImageResponse appClipHeaderImagesUpdateInstance(id, appClipHeaderImageUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppClipHeaderImagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppClipHeaderImagesApi apiInstance = new AppClipHeaderImagesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        AppClipHeaderImageUpdateRequest appClipHeaderImageUpdateRequest = new AppClipHeaderImageUpdateRequest(); // AppClipHeaderImageUpdateRequest | AppClipHeaderImage representation
        try {
            AppClipHeaderImageResponse result = apiInstance.appClipHeaderImagesUpdateInstance(id, appClipHeaderImageUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppClipHeaderImagesApi#appClipHeaderImagesUpdateInstance");
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
| **appClipHeaderImageUpdateRequest** | [**AppClipHeaderImageUpdateRequest**](AppClipHeaderImageUpdateRequest.md)| AppClipHeaderImage representation | |

### Return type

[**AppClipHeaderImageResponse**](AppClipHeaderImageResponse.md)

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
| **200** | Single AppClipHeaderImage |  -  |
| **409** | Request entity error(s) |  -  |

