# MarketplaceDomainsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**marketplaceDomainsCreateInstance**](MarketplaceDomainsApi.md#marketplaceDomainsCreateInstance) | **POST** /v1/marketplaceDomains |  |
| [**marketplaceDomainsDeleteInstance**](MarketplaceDomainsApi.md#marketplaceDomainsDeleteInstance) | **DELETE** /v1/marketplaceDomains/{id} |  |
| [**marketplaceDomainsGetCollection**](MarketplaceDomainsApi.md#marketplaceDomainsGetCollection) | **GET** /v1/marketplaceDomains |  |
| [**marketplaceDomainsGetInstance**](MarketplaceDomainsApi.md#marketplaceDomainsGetInstance) | **GET** /v1/marketplaceDomains/{id} |  |



## marketplaceDomainsCreateInstance

> MarketplaceDomainResponse marketplaceDomainsCreateInstance(marketplaceDomainCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.MarketplaceDomainsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        MarketplaceDomainsApi apiInstance = new MarketplaceDomainsApi(defaultClient);
        MarketplaceDomainCreateRequest marketplaceDomainCreateRequest = new MarketplaceDomainCreateRequest(); // MarketplaceDomainCreateRequest | MarketplaceDomain representation
        try {
            MarketplaceDomainResponse result = apiInstance.marketplaceDomainsCreateInstance(marketplaceDomainCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketplaceDomainsApi#marketplaceDomainsCreateInstance");
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
| **marketplaceDomainCreateRequest** | [**MarketplaceDomainCreateRequest**](MarketplaceDomainCreateRequest.md)| MarketplaceDomain representation | |

### Return type

[**MarketplaceDomainResponse**](MarketplaceDomainResponse.md)

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
| **201** | Single MarketplaceDomain |  -  |
| **409** | Request entity error(s) |  -  |


## marketplaceDomainsDeleteInstance

> marketplaceDomainsDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.MarketplaceDomainsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        MarketplaceDomainsApi apiInstance = new MarketplaceDomainsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.marketplaceDomainsDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketplaceDomainsApi#marketplaceDomainsDeleteInstance");
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


## marketplaceDomainsGetCollection

> MarketplaceDomainsResponse marketplaceDomainsGetCollection(fieldsMarketplaceDomains, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.MarketplaceDomainsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        MarketplaceDomainsApi apiInstance = new MarketplaceDomainsApi(defaultClient);
        List<String> fieldsMarketplaceDomains = Arrays.asList(); // List<String> | the fields to include for returned resources of type marketplaceDomains
        Integer limit = 56; // Integer | maximum resources per page
        try {
            MarketplaceDomainsResponse result = apiInstance.marketplaceDomainsGetCollection(fieldsMarketplaceDomains, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketplaceDomainsApi#marketplaceDomainsGetCollection");
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
| **fieldsMarketplaceDomains** | **List&lt;String&gt;**| the fields to include for returned resources of type marketplaceDomains | [optional] [enum: createdDate, domain, referenceName] |
| **limit** | **Integer**| maximum resources per page | [optional] |

### Return type

[**MarketplaceDomainsResponse**](MarketplaceDomainsResponse.md)

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
| **200** | List of MarketplaceDomains |  -  |


## marketplaceDomainsGetInstance

> MarketplaceDomainResponse marketplaceDomainsGetInstance(id, fieldsMarketplaceDomains)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.MarketplaceDomainsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        MarketplaceDomainsApi apiInstance = new MarketplaceDomainsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsMarketplaceDomains = Arrays.asList(); // List<String> | the fields to include for returned resources of type marketplaceDomains
        try {
            MarketplaceDomainResponse result = apiInstance.marketplaceDomainsGetInstance(id, fieldsMarketplaceDomains);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketplaceDomainsApi#marketplaceDomainsGetInstance");
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
| **fieldsMarketplaceDomains** | **List&lt;String&gt;**| the fields to include for returned resources of type marketplaceDomains | [optional] [enum: createdDate, domain, referenceName] |

### Return type

[**MarketplaceDomainResponse**](MarketplaceDomainResponse.md)

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
| **200** | Single MarketplaceDomain |  -  |

