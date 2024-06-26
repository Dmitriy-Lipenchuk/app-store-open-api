# PromotedPurchaseImagesApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**promotedPurchaseImagesCreateInstance**](PromotedPurchaseImagesApi.md#promotedPurchaseImagesCreateInstance) | **POST** /v1/promotedPurchaseImages |  |
| [**promotedPurchaseImagesDeleteInstance**](PromotedPurchaseImagesApi.md#promotedPurchaseImagesDeleteInstance) | **DELETE** /v1/promotedPurchaseImages/{id} |  |
| [**promotedPurchaseImagesGetInstance**](PromotedPurchaseImagesApi.md#promotedPurchaseImagesGetInstance) | **GET** /v1/promotedPurchaseImages/{id} |  |
| [**promotedPurchaseImagesUpdateInstance**](PromotedPurchaseImagesApi.md#promotedPurchaseImagesUpdateInstance) | **PATCH** /v1/promotedPurchaseImages/{id} |  |



## promotedPurchaseImagesCreateInstance

> PromotedPurchaseImageResponse promotedPurchaseImagesCreateInstance(promotedPurchaseImageCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.PromotedPurchaseImagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        PromotedPurchaseImagesApi apiInstance = new PromotedPurchaseImagesApi(defaultClient);
        PromotedPurchaseImageCreateRequest promotedPurchaseImageCreateRequest = new PromotedPurchaseImageCreateRequest(); // PromotedPurchaseImageCreateRequest | PromotedPurchaseImage representation
        try {
            PromotedPurchaseImageResponse result = apiInstance.promotedPurchaseImagesCreateInstance(promotedPurchaseImageCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PromotedPurchaseImagesApi#promotedPurchaseImagesCreateInstance");
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
| **promotedPurchaseImageCreateRequest** | [**PromotedPurchaseImageCreateRequest**](PromotedPurchaseImageCreateRequest.md)| PromotedPurchaseImage representation | |

### Return type

[**PromotedPurchaseImageResponse**](PromotedPurchaseImageResponse.md)

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
| **201** | Single PromotedPurchaseImage |  -  |
| **409** | Request entity error(s) |  -  |


## promotedPurchaseImagesDeleteInstance

> promotedPurchaseImagesDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.PromotedPurchaseImagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        PromotedPurchaseImagesApi apiInstance = new PromotedPurchaseImagesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.promotedPurchaseImagesDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling PromotedPurchaseImagesApi#promotedPurchaseImagesDeleteInstance");
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


## promotedPurchaseImagesGetInstance

> PromotedPurchaseImageResponse promotedPurchaseImagesGetInstance(id, fieldsPromotedPurchaseImages, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.PromotedPurchaseImagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        PromotedPurchaseImagesApi apiInstance = new PromotedPurchaseImagesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsPromotedPurchaseImages = Arrays.asList(); // List<String> | the fields to include for returned resources of type promotedPurchaseImages
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            PromotedPurchaseImageResponse result = apiInstance.promotedPurchaseImagesGetInstance(id, fieldsPromotedPurchaseImages, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PromotedPurchaseImagesApi#promotedPurchaseImagesGetInstance");
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
| **fieldsPromotedPurchaseImages** | **List&lt;String&gt;**| the fields to include for returned resources of type promotedPurchaseImages | [optional] [enum: assetToken, assetType, fileName, fileSize, imageAsset, promotedPurchase, sourceFileChecksum, state, uploadOperations, uploaded] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: promotedPurchase] |

### Return type

[**PromotedPurchaseImageResponse**](PromotedPurchaseImageResponse.md)

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
| **200** | Single PromotedPurchaseImage |  -  |


## promotedPurchaseImagesUpdateInstance

> PromotedPurchaseImageResponse promotedPurchaseImagesUpdateInstance(id, promotedPurchaseImageUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.PromotedPurchaseImagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        PromotedPurchaseImagesApi apiInstance = new PromotedPurchaseImagesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        PromotedPurchaseImageUpdateRequest promotedPurchaseImageUpdateRequest = new PromotedPurchaseImageUpdateRequest(); // PromotedPurchaseImageUpdateRequest | PromotedPurchaseImage representation
        try {
            PromotedPurchaseImageResponse result = apiInstance.promotedPurchaseImagesUpdateInstance(id, promotedPurchaseImageUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PromotedPurchaseImagesApi#promotedPurchaseImagesUpdateInstance");
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
| **promotedPurchaseImageUpdateRequest** | [**PromotedPurchaseImageUpdateRequest**](PromotedPurchaseImageUpdateRequest.md)| PromotedPurchaseImage representation | |

### Return type

[**PromotedPurchaseImageResponse**](PromotedPurchaseImageResponse.md)

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
| **200** | Single PromotedPurchaseImage |  -  |
| **409** | Request entity error(s) |  -  |

