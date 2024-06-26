# InAppPurchaseAppStoreReviewScreenshotsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**inAppPurchaseAppStoreReviewScreenshotsCreateInstance**](InAppPurchaseAppStoreReviewScreenshotsApi.md#inAppPurchaseAppStoreReviewScreenshotsCreateInstance) | **POST** /v1/inAppPurchaseAppStoreReviewScreenshots |  |
| [**inAppPurchaseAppStoreReviewScreenshotsDeleteInstance**](InAppPurchaseAppStoreReviewScreenshotsApi.md#inAppPurchaseAppStoreReviewScreenshotsDeleteInstance) | **DELETE** /v1/inAppPurchaseAppStoreReviewScreenshots/{id} |  |
| [**inAppPurchaseAppStoreReviewScreenshotsGetInstance**](InAppPurchaseAppStoreReviewScreenshotsApi.md#inAppPurchaseAppStoreReviewScreenshotsGetInstance) | **GET** /v1/inAppPurchaseAppStoreReviewScreenshots/{id} |  |
| [**inAppPurchaseAppStoreReviewScreenshotsUpdateInstance**](InAppPurchaseAppStoreReviewScreenshotsApi.md#inAppPurchaseAppStoreReviewScreenshotsUpdateInstance) | **PATCH** /v1/inAppPurchaseAppStoreReviewScreenshots/{id} |  |



## inAppPurchaseAppStoreReviewScreenshotsCreateInstance

> InAppPurchaseAppStoreReviewScreenshotResponse inAppPurchaseAppStoreReviewScreenshotsCreateInstance(inAppPurchaseAppStoreReviewScreenshotCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.InAppPurchaseAppStoreReviewScreenshotsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        InAppPurchaseAppStoreReviewScreenshotsApi apiInstance = new InAppPurchaseAppStoreReviewScreenshotsApi(defaultClient);
        InAppPurchaseAppStoreReviewScreenshotCreateRequest inAppPurchaseAppStoreReviewScreenshotCreateRequest = new InAppPurchaseAppStoreReviewScreenshotCreateRequest(); // InAppPurchaseAppStoreReviewScreenshotCreateRequest | InAppPurchaseAppStoreReviewScreenshot representation
        try {
            InAppPurchaseAppStoreReviewScreenshotResponse result = apiInstance.inAppPurchaseAppStoreReviewScreenshotsCreateInstance(inAppPurchaseAppStoreReviewScreenshotCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InAppPurchaseAppStoreReviewScreenshotsApi#inAppPurchaseAppStoreReviewScreenshotsCreateInstance");
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
| **inAppPurchaseAppStoreReviewScreenshotCreateRequest** | [**InAppPurchaseAppStoreReviewScreenshotCreateRequest**](InAppPurchaseAppStoreReviewScreenshotCreateRequest.md)| InAppPurchaseAppStoreReviewScreenshot representation | |

### Return type

[**InAppPurchaseAppStoreReviewScreenshotResponse**](InAppPurchaseAppStoreReviewScreenshotResponse.md)

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
| **201** | Single InAppPurchaseAppStoreReviewScreenshot |  -  |
| **409** | Request entity error(s) |  -  |


## inAppPurchaseAppStoreReviewScreenshotsDeleteInstance

> inAppPurchaseAppStoreReviewScreenshotsDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.InAppPurchaseAppStoreReviewScreenshotsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        InAppPurchaseAppStoreReviewScreenshotsApi apiInstance = new InAppPurchaseAppStoreReviewScreenshotsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.inAppPurchaseAppStoreReviewScreenshotsDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling InAppPurchaseAppStoreReviewScreenshotsApi#inAppPurchaseAppStoreReviewScreenshotsDeleteInstance");
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


## inAppPurchaseAppStoreReviewScreenshotsGetInstance

> InAppPurchaseAppStoreReviewScreenshotResponse inAppPurchaseAppStoreReviewScreenshotsGetInstance(id, fieldsInAppPurchaseAppStoreReviewScreenshots, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.InAppPurchaseAppStoreReviewScreenshotsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        InAppPurchaseAppStoreReviewScreenshotsApi apiInstance = new InAppPurchaseAppStoreReviewScreenshotsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsInAppPurchaseAppStoreReviewScreenshots = Arrays.asList(); // List<String> | the fields to include for returned resources of type inAppPurchaseAppStoreReviewScreenshots
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            InAppPurchaseAppStoreReviewScreenshotResponse result = apiInstance.inAppPurchaseAppStoreReviewScreenshotsGetInstance(id, fieldsInAppPurchaseAppStoreReviewScreenshots, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InAppPurchaseAppStoreReviewScreenshotsApi#inAppPurchaseAppStoreReviewScreenshotsGetInstance");
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
| **fieldsInAppPurchaseAppStoreReviewScreenshots** | **List&lt;String&gt;**| the fields to include for returned resources of type inAppPurchaseAppStoreReviewScreenshots | [optional] [enum: assetDeliveryState, assetToken, assetType, fileName, fileSize, imageAsset, inAppPurchaseV2, sourceFileChecksum, uploadOperations, uploaded] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: inAppPurchaseV2] |

### Return type

[**InAppPurchaseAppStoreReviewScreenshotResponse**](InAppPurchaseAppStoreReviewScreenshotResponse.md)

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
| **200** | Single InAppPurchaseAppStoreReviewScreenshot |  -  |


## inAppPurchaseAppStoreReviewScreenshotsUpdateInstance

> InAppPurchaseAppStoreReviewScreenshotResponse inAppPurchaseAppStoreReviewScreenshotsUpdateInstance(id, inAppPurchaseAppStoreReviewScreenshotUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.InAppPurchaseAppStoreReviewScreenshotsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        InAppPurchaseAppStoreReviewScreenshotsApi apiInstance = new InAppPurchaseAppStoreReviewScreenshotsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        InAppPurchaseAppStoreReviewScreenshotUpdateRequest inAppPurchaseAppStoreReviewScreenshotUpdateRequest = new InAppPurchaseAppStoreReviewScreenshotUpdateRequest(); // InAppPurchaseAppStoreReviewScreenshotUpdateRequest | InAppPurchaseAppStoreReviewScreenshot representation
        try {
            InAppPurchaseAppStoreReviewScreenshotResponse result = apiInstance.inAppPurchaseAppStoreReviewScreenshotsUpdateInstance(id, inAppPurchaseAppStoreReviewScreenshotUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InAppPurchaseAppStoreReviewScreenshotsApi#inAppPurchaseAppStoreReviewScreenshotsUpdateInstance");
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
| **inAppPurchaseAppStoreReviewScreenshotUpdateRequest** | [**InAppPurchaseAppStoreReviewScreenshotUpdateRequest**](InAppPurchaseAppStoreReviewScreenshotUpdateRequest.md)| InAppPurchaseAppStoreReviewScreenshot representation | |

### Return type

[**InAppPurchaseAppStoreReviewScreenshotResponse**](InAppPurchaseAppStoreReviewScreenshotResponse.md)

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
| **200** | Single InAppPurchaseAppStoreReviewScreenshot |  -  |
| **409** | Request entity error(s) |  -  |

