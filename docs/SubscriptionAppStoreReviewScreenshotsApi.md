# SubscriptionAppStoreReviewScreenshotsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**subscriptionAppStoreReviewScreenshotsCreateInstance**](SubscriptionAppStoreReviewScreenshotsApi.md#subscriptionAppStoreReviewScreenshotsCreateInstance) | **POST** /v1/subscriptionAppStoreReviewScreenshots |  |
| [**subscriptionAppStoreReviewScreenshotsDeleteInstance**](SubscriptionAppStoreReviewScreenshotsApi.md#subscriptionAppStoreReviewScreenshotsDeleteInstance) | **DELETE** /v1/subscriptionAppStoreReviewScreenshots/{id} |  |
| [**subscriptionAppStoreReviewScreenshotsGetInstance**](SubscriptionAppStoreReviewScreenshotsApi.md#subscriptionAppStoreReviewScreenshotsGetInstance) | **GET** /v1/subscriptionAppStoreReviewScreenshots/{id} |  |
| [**subscriptionAppStoreReviewScreenshotsUpdateInstance**](SubscriptionAppStoreReviewScreenshotsApi.md#subscriptionAppStoreReviewScreenshotsUpdateInstance) | **PATCH** /v1/subscriptionAppStoreReviewScreenshots/{id} |  |



## subscriptionAppStoreReviewScreenshotsCreateInstance

> SubscriptionAppStoreReviewScreenshotResponse subscriptionAppStoreReviewScreenshotsCreateInstance(subscriptionAppStoreReviewScreenshotCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionAppStoreReviewScreenshotsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionAppStoreReviewScreenshotsApi apiInstance = new SubscriptionAppStoreReviewScreenshotsApi(defaultClient);
        SubscriptionAppStoreReviewScreenshotCreateRequest subscriptionAppStoreReviewScreenshotCreateRequest = new SubscriptionAppStoreReviewScreenshotCreateRequest(); // SubscriptionAppStoreReviewScreenshotCreateRequest | SubscriptionAppStoreReviewScreenshot representation
        try {
            SubscriptionAppStoreReviewScreenshotResponse result = apiInstance.subscriptionAppStoreReviewScreenshotsCreateInstance(subscriptionAppStoreReviewScreenshotCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionAppStoreReviewScreenshotsApi#subscriptionAppStoreReviewScreenshotsCreateInstance");
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
| **subscriptionAppStoreReviewScreenshotCreateRequest** | [**SubscriptionAppStoreReviewScreenshotCreateRequest**](SubscriptionAppStoreReviewScreenshotCreateRequest.md)| SubscriptionAppStoreReviewScreenshot representation | |

### Return type

[**SubscriptionAppStoreReviewScreenshotResponse**](SubscriptionAppStoreReviewScreenshotResponse.md)

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
| **201** | Single SubscriptionAppStoreReviewScreenshot |  -  |
| **409** | Request entity error(s) |  -  |


## subscriptionAppStoreReviewScreenshotsDeleteInstance

> subscriptionAppStoreReviewScreenshotsDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionAppStoreReviewScreenshotsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionAppStoreReviewScreenshotsApi apiInstance = new SubscriptionAppStoreReviewScreenshotsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.subscriptionAppStoreReviewScreenshotsDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionAppStoreReviewScreenshotsApi#subscriptionAppStoreReviewScreenshotsDeleteInstance");
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


## subscriptionAppStoreReviewScreenshotsGetInstance

> SubscriptionAppStoreReviewScreenshotResponse subscriptionAppStoreReviewScreenshotsGetInstance(id, fieldsSubscriptionAppStoreReviewScreenshots, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionAppStoreReviewScreenshotsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionAppStoreReviewScreenshotsApi apiInstance = new SubscriptionAppStoreReviewScreenshotsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsSubscriptionAppStoreReviewScreenshots = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionAppStoreReviewScreenshots
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            SubscriptionAppStoreReviewScreenshotResponse result = apiInstance.subscriptionAppStoreReviewScreenshotsGetInstance(id, fieldsSubscriptionAppStoreReviewScreenshots, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionAppStoreReviewScreenshotsApi#subscriptionAppStoreReviewScreenshotsGetInstance");
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
| **fieldsSubscriptionAppStoreReviewScreenshots** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionAppStoreReviewScreenshots | [optional] [enum: assetDeliveryState, assetToken, assetType, fileName, fileSize, imageAsset, sourceFileChecksum, subscription, uploadOperations, uploaded] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: subscription] |

### Return type

[**SubscriptionAppStoreReviewScreenshotResponse**](SubscriptionAppStoreReviewScreenshotResponse.md)

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
| **200** | Single SubscriptionAppStoreReviewScreenshot |  -  |


## subscriptionAppStoreReviewScreenshotsUpdateInstance

> SubscriptionAppStoreReviewScreenshotResponse subscriptionAppStoreReviewScreenshotsUpdateInstance(id, subscriptionAppStoreReviewScreenshotUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionAppStoreReviewScreenshotsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionAppStoreReviewScreenshotsApi apiInstance = new SubscriptionAppStoreReviewScreenshotsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        SubscriptionAppStoreReviewScreenshotUpdateRequest subscriptionAppStoreReviewScreenshotUpdateRequest = new SubscriptionAppStoreReviewScreenshotUpdateRequest(); // SubscriptionAppStoreReviewScreenshotUpdateRequest | SubscriptionAppStoreReviewScreenshot representation
        try {
            SubscriptionAppStoreReviewScreenshotResponse result = apiInstance.subscriptionAppStoreReviewScreenshotsUpdateInstance(id, subscriptionAppStoreReviewScreenshotUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionAppStoreReviewScreenshotsApi#subscriptionAppStoreReviewScreenshotsUpdateInstance");
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
| **subscriptionAppStoreReviewScreenshotUpdateRequest** | [**SubscriptionAppStoreReviewScreenshotUpdateRequest**](SubscriptionAppStoreReviewScreenshotUpdateRequest.md)| SubscriptionAppStoreReviewScreenshot representation | |

### Return type

[**SubscriptionAppStoreReviewScreenshotResponse**](SubscriptionAppStoreReviewScreenshotResponse.md)

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
| **200** | Single SubscriptionAppStoreReviewScreenshot |  -  |
| **409** | Request entity error(s) |  -  |

