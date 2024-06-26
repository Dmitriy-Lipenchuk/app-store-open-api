# AlternativeDistributionDomainsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**alternativeDistributionDomainsCreateInstance**](AlternativeDistributionDomainsApi.md#alternativeDistributionDomainsCreateInstance) | **POST** /v1/alternativeDistributionDomains |  |
| [**alternativeDistributionDomainsDeleteInstance**](AlternativeDistributionDomainsApi.md#alternativeDistributionDomainsDeleteInstance) | **DELETE** /v1/alternativeDistributionDomains/{id} |  |
| [**alternativeDistributionDomainsGetCollection**](AlternativeDistributionDomainsApi.md#alternativeDistributionDomainsGetCollection) | **GET** /v1/alternativeDistributionDomains |  |
| [**alternativeDistributionDomainsGetInstance**](AlternativeDistributionDomainsApi.md#alternativeDistributionDomainsGetInstance) | **GET** /v1/alternativeDistributionDomains/{id} |  |



## alternativeDistributionDomainsCreateInstance

> AlternativeDistributionDomainResponse alternativeDistributionDomainsCreateInstance(alternativeDistributionDomainCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AlternativeDistributionDomainsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AlternativeDistributionDomainsApi apiInstance = new AlternativeDistributionDomainsApi(defaultClient);
        AlternativeDistributionDomainCreateRequest alternativeDistributionDomainCreateRequest = new AlternativeDistributionDomainCreateRequest(); // AlternativeDistributionDomainCreateRequest | AlternativeDistributionDomain representation
        try {
            AlternativeDistributionDomainResponse result = apiInstance.alternativeDistributionDomainsCreateInstance(alternativeDistributionDomainCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlternativeDistributionDomainsApi#alternativeDistributionDomainsCreateInstance");
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
| **alternativeDistributionDomainCreateRequest** | [**AlternativeDistributionDomainCreateRequest**](AlternativeDistributionDomainCreateRequest.md)| AlternativeDistributionDomain representation | |

### Return type

[**AlternativeDistributionDomainResponse**](AlternativeDistributionDomainResponse.md)

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
| **201** | Single AlternativeDistributionDomain |  -  |
| **409** | Request entity error(s) |  -  |


## alternativeDistributionDomainsDeleteInstance

> alternativeDistributionDomainsDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AlternativeDistributionDomainsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AlternativeDistributionDomainsApi apiInstance = new AlternativeDistributionDomainsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.alternativeDistributionDomainsDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlternativeDistributionDomainsApi#alternativeDistributionDomainsDeleteInstance");
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


## alternativeDistributionDomainsGetCollection

> AlternativeDistributionDomainsResponse alternativeDistributionDomainsGetCollection(fieldsAlternativeDistributionDomains, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AlternativeDistributionDomainsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AlternativeDistributionDomainsApi apiInstance = new AlternativeDistributionDomainsApi(defaultClient);
        List<String> fieldsAlternativeDistributionDomains = Arrays.asList(); // List<String> | the fields to include for returned resources of type alternativeDistributionDomains
        Integer limit = 56; // Integer | maximum resources per page
        try {
            AlternativeDistributionDomainsResponse result = apiInstance.alternativeDistributionDomainsGetCollection(fieldsAlternativeDistributionDomains, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlternativeDistributionDomainsApi#alternativeDistributionDomainsGetCollection");
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
| **fieldsAlternativeDistributionDomains** | **List&lt;String&gt;**| the fields to include for returned resources of type alternativeDistributionDomains | [optional] [enum: createdDate, domain, referenceName] |
| **limit** | **Integer**| maximum resources per page | [optional] |

### Return type

[**AlternativeDistributionDomainsResponse**](AlternativeDistributionDomainsResponse.md)

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
| **200** | List of AlternativeDistributionDomains |  -  |


## alternativeDistributionDomainsGetInstance

> AlternativeDistributionDomainResponse alternativeDistributionDomainsGetInstance(id, fieldsAlternativeDistributionDomains)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AlternativeDistributionDomainsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AlternativeDistributionDomainsApi apiInstance = new AlternativeDistributionDomainsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAlternativeDistributionDomains = Arrays.asList(); // List<String> | the fields to include for returned resources of type alternativeDistributionDomains
        try {
            AlternativeDistributionDomainResponse result = apiInstance.alternativeDistributionDomainsGetInstance(id, fieldsAlternativeDistributionDomains);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlternativeDistributionDomainsApi#alternativeDistributionDomainsGetInstance");
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
| **fieldsAlternativeDistributionDomains** | **List&lt;String&gt;**| the fields to include for returned resources of type alternativeDistributionDomains | [optional] [enum: createdDate, domain, referenceName] |

### Return type

[**AlternativeDistributionDomainResponse**](AlternativeDistributionDomainResponse.md)

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
| **200** | Single AlternativeDistributionDomain |  -  |

