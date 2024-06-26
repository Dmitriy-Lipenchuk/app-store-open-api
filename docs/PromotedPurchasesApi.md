# PromotedPurchasesApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**promotedPurchasesCreateInstance**](PromotedPurchasesApi.md#promotedPurchasesCreateInstance) | **POST** /v1/promotedPurchases |  |
| [**promotedPurchasesDeleteInstance**](PromotedPurchasesApi.md#promotedPurchasesDeleteInstance) | **DELETE** /v1/promotedPurchases/{id} |  |
| [**promotedPurchasesGetInstance**](PromotedPurchasesApi.md#promotedPurchasesGetInstance) | **GET** /v1/promotedPurchases/{id} |  |
| [**promotedPurchasesPromotionImagesGetToManyRelated**](PromotedPurchasesApi.md#promotedPurchasesPromotionImagesGetToManyRelated) | **GET** /v1/promotedPurchases/{id}/promotionImages |  |
| [**promotedPurchasesUpdateInstance**](PromotedPurchasesApi.md#promotedPurchasesUpdateInstance) | **PATCH** /v1/promotedPurchases/{id} |  |



## promotedPurchasesCreateInstance

> PromotedPurchaseResponse promotedPurchasesCreateInstance(promotedPurchaseCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.PromotedPurchasesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        PromotedPurchasesApi apiInstance = new PromotedPurchasesApi(defaultClient);
        PromotedPurchaseCreateRequest promotedPurchaseCreateRequest = new PromotedPurchaseCreateRequest(); // PromotedPurchaseCreateRequest | PromotedPurchase representation
        try {
            PromotedPurchaseResponse result = apiInstance.promotedPurchasesCreateInstance(promotedPurchaseCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PromotedPurchasesApi#promotedPurchasesCreateInstance");
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
| **promotedPurchaseCreateRequest** | [**PromotedPurchaseCreateRequest**](PromotedPurchaseCreateRequest.md)| PromotedPurchase representation | |

### Return type

[**PromotedPurchaseResponse**](PromotedPurchaseResponse.md)

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
| **201** | Single PromotedPurchase |  -  |
| **409** | Request entity error(s) |  -  |


## promotedPurchasesDeleteInstance

> promotedPurchasesDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.PromotedPurchasesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        PromotedPurchasesApi apiInstance = new PromotedPurchasesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.promotedPurchasesDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling PromotedPurchasesApi#promotedPurchasesDeleteInstance");
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


## promotedPurchasesGetInstance

> PromotedPurchaseResponse promotedPurchasesGetInstance(id, fieldsPromotedPurchases, include, fieldsPromotedPurchaseImages, limitPromotionImages)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.PromotedPurchasesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        PromotedPurchasesApi apiInstance = new PromotedPurchasesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsPromotedPurchases = Arrays.asList(); // List<String> | the fields to include for returned resources of type promotedPurchases
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsPromotedPurchaseImages = Arrays.asList(); // List<String> | the fields to include for returned resources of type promotedPurchaseImages
        Integer limitPromotionImages = 56; // Integer | maximum number of related promotionImages returned (when they are included)
        try {
            PromotedPurchaseResponse result = apiInstance.promotedPurchasesGetInstance(id, fieldsPromotedPurchases, include, fieldsPromotedPurchaseImages, limitPromotionImages);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PromotedPurchasesApi#promotedPurchasesGetInstance");
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
| **fieldsPromotedPurchases** | **List&lt;String&gt;**| the fields to include for returned resources of type promotedPurchases | [optional] [enum: app, enabled, inAppPurchaseV2, promotionImages, state, subscription, visibleForAllUsers] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: inAppPurchaseV2, promotionImages, subscription] |
| **fieldsPromotedPurchaseImages** | **List&lt;String&gt;**| the fields to include for returned resources of type promotedPurchaseImages | [optional] [enum: assetToken, assetType, fileName, fileSize, imageAsset, promotedPurchase, sourceFileChecksum, state, uploadOperations, uploaded] |
| **limitPromotionImages** | **Integer**| maximum number of related promotionImages returned (when they are included) | [optional] |

### Return type

[**PromotedPurchaseResponse**](PromotedPurchaseResponse.md)

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
| **200** | Single PromotedPurchase |  -  |


## promotedPurchasesPromotionImagesGetToManyRelated

> PromotedPurchaseImagesResponse promotedPurchasesPromotionImagesGetToManyRelated(id, fieldsPromotedPurchases, fieldsPromotedPurchaseImages, limit, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.PromotedPurchasesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        PromotedPurchasesApi apiInstance = new PromotedPurchasesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsPromotedPurchases = Arrays.asList(); // List<String> | the fields to include for returned resources of type promotedPurchases
        List<String> fieldsPromotedPurchaseImages = Arrays.asList(); // List<String> | the fields to include for returned resources of type promotedPurchaseImages
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            PromotedPurchaseImagesResponse result = apiInstance.promotedPurchasesPromotionImagesGetToManyRelated(id, fieldsPromotedPurchases, fieldsPromotedPurchaseImages, limit, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PromotedPurchasesApi#promotedPurchasesPromotionImagesGetToManyRelated");
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
| **fieldsPromotedPurchases** | **List&lt;String&gt;**| the fields to include for returned resources of type promotedPurchases | [optional] [enum: app, enabled, inAppPurchaseV2, promotionImages, state, subscription, visibleForAllUsers] |
| **fieldsPromotedPurchaseImages** | **List&lt;String&gt;**| the fields to include for returned resources of type promotedPurchaseImages | [optional] [enum: assetToken, assetType, fileName, fileSize, imageAsset, promotedPurchase, sourceFileChecksum, state, uploadOperations, uploaded] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: promotedPurchase] |

### Return type

[**PromotedPurchaseImagesResponse**](PromotedPurchaseImagesResponse.md)

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
| **200** | List of PromotedPurchaseImages |  -  |


## promotedPurchasesUpdateInstance

> PromotedPurchaseResponse promotedPurchasesUpdateInstance(id, promotedPurchaseUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.PromotedPurchasesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        PromotedPurchasesApi apiInstance = new PromotedPurchasesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        PromotedPurchaseUpdateRequest promotedPurchaseUpdateRequest = new PromotedPurchaseUpdateRequest(); // PromotedPurchaseUpdateRequest | PromotedPurchase representation
        try {
            PromotedPurchaseResponse result = apiInstance.promotedPurchasesUpdateInstance(id, promotedPurchaseUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PromotedPurchasesApi#promotedPurchasesUpdateInstance");
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
| **promotedPurchaseUpdateRequest** | [**PromotedPurchaseUpdateRequest**](PromotedPurchaseUpdateRequest.md)| PromotedPurchase representation | |

### Return type

[**PromotedPurchaseResponse**](PromotedPurchaseResponse.md)

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
| **200** | Single PromotedPurchase |  -  |
| **409** | Request entity error(s) |  -  |

