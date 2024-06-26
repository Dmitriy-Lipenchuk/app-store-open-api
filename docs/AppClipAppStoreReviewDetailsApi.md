# AppClipAppStoreReviewDetailsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**appClipAppStoreReviewDetailsCreateInstance**](AppClipAppStoreReviewDetailsApi.md#appClipAppStoreReviewDetailsCreateInstance) | **POST** /v1/appClipAppStoreReviewDetails |  |
| [**appClipAppStoreReviewDetailsGetInstance**](AppClipAppStoreReviewDetailsApi.md#appClipAppStoreReviewDetailsGetInstance) | **GET** /v1/appClipAppStoreReviewDetails/{id} |  |
| [**appClipAppStoreReviewDetailsUpdateInstance**](AppClipAppStoreReviewDetailsApi.md#appClipAppStoreReviewDetailsUpdateInstance) | **PATCH** /v1/appClipAppStoreReviewDetails/{id} |  |



## appClipAppStoreReviewDetailsCreateInstance

> AppClipAppStoreReviewDetailResponse appClipAppStoreReviewDetailsCreateInstance(appClipAppStoreReviewDetailCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppClipAppStoreReviewDetailsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppClipAppStoreReviewDetailsApi apiInstance = new AppClipAppStoreReviewDetailsApi(defaultClient);
        AppClipAppStoreReviewDetailCreateRequest appClipAppStoreReviewDetailCreateRequest = new AppClipAppStoreReviewDetailCreateRequest(); // AppClipAppStoreReviewDetailCreateRequest | AppClipAppStoreReviewDetail representation
        try {
            AppClipAppStoreReviewDetailResponse result = apiInstance.appClipAppStoreReviewDetailsCreateInstance(appClipAppStoreReviewDetailCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppClipAppStoreReviewDetailsApi#appClipAppStoreReviewDetailsCreateInstance");
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
| **appClipAppStoreReviewDetailCreateRequest** | [**AppClipAppStoreReviewDetailCreateRequest**](AppClipAppStoreReviewDetailCreateRequest.md)| AppClipAppStoreReviewDetail representation | |

### Return type

[**AppClipAppStoreReviewDetailResponse**](AppClipAppStoreReviewDetailResponse.md)

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
| **201** | Single AppClipAppStoreReviewDetail |  -  |
| **409** | Request entity error(s) |  -  |


## appClipAppStoreReviewDetailsGetInstance

> AppClipAppStoreReviewDetailResponse appClipAppStoreReviewDetailsGetInstance(id, fieldsAppClipAppStoreReviewDetails, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppClipAppStoreReviewDetailsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppClipAppStoreReviewDetailsApi apiInstance = new AppClipAppStoreReviewDetailsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAppClipAppStoreReviewDetails = Arrays.asList(); // List<String> | the fields to include for returned resources of type appClipAppStoreReviewDetails
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            AppClipAppStoreReviewDetailResponse result = apiInstance.appClipAppStoreReviewDetailsGetInstance(id, fieldsAppClipAppStoreReviewDetails, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppClipAppStoreReviewDetailsApi#appClipAppStoreReviewDetailsGetInstance");
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
| **fieldsAppClipAppStoreReviewDetails** | **List&lt;String&gt;**| the fields to include for returned resources of type appClipAppStoreReviewDetails | [optional] [enum: appClipDefaultExperience, invocationUrls] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: appClipDefaultExperience] |

### Return type

[**AppClipAppStoreReviewDetailResponse**](AppClipAppStoreReviewDetailResponse.md)

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
| **200** | Single AppClipAppStoreReviewDetail |  -  |


## appClipAppStoreReviewDetailsUpdateInstance

> AppClipAppStoreReviewDetailResponse appClipAppStoreReviewDetailsUpdateInstance(id, appClipAppStoreReviewDetailUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppClipAppStoreReviewDetailsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppClipAppStoreReviewDetailsApi apiInstance = new AppClipAppStoreReviewDetailsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        AppClipAppStoreReviewDetailUpdateRequest appClipAppStoreReviewDetailUpdateRequest = new AppClipAppStoreReviewDetailUpdateRequest(); // AppClipAppStoreReviewDetailUpdateRequest | AppClipAppStoreReviewDetail representation
        try {
            AppClipAppStoreReviewDetailResponse result = apiInstance.appClipAppStoreReviewDetailsUpdateInstance(id, appClipAppStoreReviewDetailUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppClipAppStoreReviewDetailsApi#appClipAppStoreReviewDetailsUpdateInstance");
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
| **appClipAppStoreReviewDetailUpdateRequest** | [**AppClipAppStoreReviewDetailUpdateRequest**](AppClipAppStoreReviewDetailUpdateRequest.md)| AppClipAppStoreReviewDetail representation | |

### Return type

[**AppClipAppStoreReviewDetailResponse**](AppClipAppStoreReviewDetailResponse.md)

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
| **200** | Single AppClipAppStoreReviewDetail |  -  |
| **409** | Request entity error(s) |  -  |

