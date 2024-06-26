# MarketplaceWebhooksApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**marketplaceWebhooksCreateInstance**](MarketplaceWebhooksApi.md#marketplaceWebhooksCreateInstance) | **POST** /v1/marketplaceWebhooks |  |
| [**marketplaceWebhooksDeleteInstance**](MarketplaceWebhooksApi.md#marketplaceWebhooksDeleteInstance) | **DELETE** /v1/marketplaceWebhooks/{id} |  |
| [**marketplaceWebhooksGetCollection**](MarketplaceWebhooksApi.md#marketplaceWebhooksGetCollection) | **GET** /v1/marketplaceWebhooks |  |
| [**marketplaceWebhooksUpdateInstance**](MarketplaceWebhooksApi.md#marketplaceWebhooksUpdateInstance) | **PATCH** /v1/marketplaceWebhooks/{id} |  |



## marketplaceWebhooksCreateInstance

> MarketplaceWebhookResponse marketplaceWebhooksCreateInstance(marketplaceWebhookCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.MarketplaceWebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        MarketplaceWebhooksApi apiInstance = new MarketplaceWebhooksApi(defaultClient);
        MarketplaceWebhookCreateRequest marketplaceWebhookCreateRequest = new MarketplaceWebhookCreateRequest(); // MarketplaceWebhookCreateRequest | MarketplaceWebhook representation
        try {
            MarketplaceWebhookResponse result = apiInstance.marketplaceWebhooksCreateInstance(marketplaceWebhookCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketplaceWebhooksApi#marketplaceWebhooksCreateInstance");
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
| **marketplaceWebhookCreateRequest** | [**MarketplaceWebhookCreateRequest**](MarketplaceWebhookCreateRequest.md)| MarketplaceWebhook representation | |

### Return type

[**MarketplaceWebhookResponse**](MarketplaceWebhookResponse.md)

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
| **201** | Single MarketplaceWebhook |  -  |
| **409** | Request entity error(s) |  -  |


## marketplaceWebhooksDeleteInstance

> marketplaceWebhooksDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.MarketplaceWebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        MarketplaceWebhooksApi apiInstance = new MarketplaceWebhooksApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.marketplaceWebhooksDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketplaceWebhooksApi#marketplaceWebhooksDeleteInstance");
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


## marketplaceWebhooksGetCollection

> MarketplaceWebhooksResponse marketplaceWebhooksGetCollection(fieldsMarketplaceWebhooks, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.MarketplaceWebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        MarketplaceWebhooksApi apiInstance = new MarketplaceWebhooksApi(defaultClient);
        List<String> fieldsMarketplaceWebhooks = Arrays.asList(); // List<String> | the fields to include for returned resources of type marketplaceWebhooks
        Integer limit = 56; // Integer | maximum resources per page
        try {
            MarketplaceWebhooksResponse result = apiInstance.marketplaceWebhooksGetCollection(fieldsMarketplaceWebhooks, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketplaceWebhooksApi#marketplaceWebhooksGetCollection");
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
| **fieldsMarketplaceWebhooks** | **List&lt;String&gt;**| the fields to include for returned resources of type marketplaceWebhooks | [optional] [enum: endpointUrl, secret] |
| **limit** | **Integer**| maximum resources per page | [optional] |

### Return type

[**MarketplaceWebhooksResponse**](MarketplaceWebhooksResponse.md)

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
| **200** | List of MarketplaceWebhooks |  -  |


## marketplaceWebhooksUpdateInstance

> MarketplaceWebhookResponse marketplaceWebhooksUpdateInstance(id, marketplaceWebhookUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.MarketplaceWebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        MarketplaceWebhooksApi apiInstance = new MarketplaceWebhooksApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        MarketplaceWebhookUpdateRequest marketplaceWebhookUpdateRequest = new MarketplaceWebhookUpdateRequest(); // MarketplaceWebhookUpdateRequest | MarketplaceWebhook representation
        try {
            MarketplaceWebhookResponse result = apiInstance.marketplaceWebhooksUpdateInstance(id, marketplaceWebhookUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketplaceWebhooksApi#marketplaceWebhooksUpdateInstance");
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
| **marketplaceWebhookUpdateRequest** | [**MarketplaceWebhookUpdateRequest**](MarketplaceWebhookUpdateRequest.md)| MarketplaceWebhook representation | |

### Return type

[**MarketplaceWebhookResponse**](MarketplaceWebhookResponse.md)

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
| **200** | Single MarketplaceWebhook |  -  |
| **409** | Request entity error(s) |  -  |

