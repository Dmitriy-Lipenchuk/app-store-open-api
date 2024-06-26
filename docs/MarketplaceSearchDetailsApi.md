# MarketplaceSearchDetailsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**marketplaceSearchDetailsCreateInstance**](MarketplaceSearchDetailsApi.md#marketplaceSearchDetailsCreateInstance) | **POST** /v1/marketplaceSearchDetails |  |
| [**marketplaceSearchDetailsDeleteInstance**](MarketplaceSearchDetailsApi.md#marketplaceSearchDetailsDeleteInstance) | **DELETE** /v1/marketplaceSearchDetails/{id} |  |
| [**marketplaceSearchDetailsUpdateInstance**](MarketplaceSearchDetailsApi.md#marketplaceSearchDetailsUpdateInstance) | **PATCH** /v1/marketplaceSearchDetails/{id} |  |



## marketplaceSearchDetailsCreateInstance

> MarketplaceSearchDetailResponse marketplaceSearchDetailsCreateInstance(marketplaceSearchDetailCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.MarketplaceSearchDetailsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        MarketplaceSearchDetailsApi apiInstance = new MarketplaceSearchDetailsApi(defaultClient);
        MarketplaceSearchDetailCreateRequest marketplaceSearchDetailCreateRequest = new MarketplaceSearchDetailCreateRequest(); // MarketplaceSearchDetailCreateRequest | MarketplaceSearchDetail representation
        try {
            MarketplaceSearchDetailResponse result = apiInstance.marketplaceSearchDetailsCreateInstance(marketplaceSearchDetailCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketplaceSearchDetailsApi#marketplaceSearchDetailsCreateInstance");
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
| **marketplaceSearchDetailCreateRequest** | [**MarketplaceSearchDetailCreateRequest**](MarketplaceSearchDetailCreateRequest.md)| MarketplaceSearchDetail representation | |

### Return type

[**MarketplaceSearchDetailResponse**](MarketplaceSearchDetailResponse.md)

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
| **201** | Single MarketplaceSearchDetail |  -  |
| **409** | Request entity error(s) |  -  |


## marketplaceSearchDetailsDeleteInstance

> marketplaceSearchDetailsDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.MarketplaceSearchDetailsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        MarketplaceSearchDetailsApi apiInstance = new MarketplaceSearchDetailsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.marketplaceSearchDetailsDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketplaceSearchDetailsApi#marketplaceSearchDetailsDeleteInstance");
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


## marketplaceSearchDetailsUpdateInstance

> MarketplaceSearchDetailResponse marketplaceSearchDetailsUpdateInstance(id, marketplaceSearchDetailUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.MarketplaceSearchDetailsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        MarketplaceSearchDetailsApi apiInstance = new MarketplaceSearchDetailsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        MarketplaceSearchDetailUpdateRequest marketplaceSearchDetailUpdateRequest = new MarketplaceSearchDetailUpdateRequest(); // MarketplaceSearchDetailUpdateRequest | MarketplaceSearchDetail representation
        try {
            MarketplaceSearchDetailResponse result = apiInstance.marketplaceSearchDetailsUpdateInstance(id, marketplaceSearchDetailUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketplaceSearchDetailsApi#marketplaceSearchDetailsUpdateInstance");
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
| **marketplaceSearchDetailUpdateRequest** | [**MarketplaceSearchDetailUpdateRequest**](MarketplaceSearchDetailUpdateRequest.md)| MarketplaceSearchDetail representation | |

### Return type

[**MarketplaceSearchDetailResponse**](MarketplaceSearchDetailResponse.md)

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
| **200** | Single MarketplaceSearchDetail |  -  |
| **409** | Request entity error(s) |  -  |

