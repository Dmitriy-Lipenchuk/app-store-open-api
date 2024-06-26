# AlternativeDistributionKeysApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**alternativeDistributionKeysCreateInstance**](AlternativeDistributionKeysApi.md#alternativeDistributionKeysCreateInstance) | **POST** /v1/alternativeDistributionKeys |  |
| [**alternativeDistributionKeysDeleteInstance**](AlternativeDistributionKeysApi.md#alternativeDistributionKeysDeleteInstance) | **DELETE** /v1/alternativeDistributionKeys/{id} |  |
| [**alternativeDistributionKeysGetCollection**](AlternativeDistributionKeysApi.md#alternativeDistributionKeysGetCollection) | **GET** /v1/alternativeDistributionKeys |  |
| [**alternativeDistributionKeysGetInstance**](AlternativeDistributionKeysApi.md#alternativeDistributionKeysGetInstance) | **GET** /v1/alternativeDistributionKeys/{id} |  |



## alternativeDistributionKeysCreateInstance

> AlternativeDistributionKeyResponse alternativeDistributionKeysCreateInstance(alternativeDistributionKeyCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AlternativeDistributionKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AlternativeDistributionKeysApi apiInstance = new AlternativeDistributionKeysApi(defaultClient);
        AlternativeDistributionKeyCreateRequest alternativeDistributionKeyCreateRequest = new AlternativeDistributionKeyCreateRequest(); // AlternativeDistributionKeyCreateRequest | AlternativeDistributionKey representation
        try {
            AlternativeDistributionKeyResponse result = apiInstance.alternativeDistributionKeysCreateInstance(alternativeDistributionKeyCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlternativeDistributionKeysApi#alternativeDistributionKeysCreateInstance");
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
| **alternativeDistributionKeyCreateRequest** | [**AlternativeDistributionKeyCreateRequest**](AlternativeDistributionKeyCreateRequest.md)| AlternativeDistributionKey representation | |

### Return type

[**AlternativeDistributionKeyResponse**](AlternativeDistributionKeyResponse.md)

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
| **201** | Single AlternativeDistributionKey |  -  |
| **409** | Request entity error(s) |  -  |


## alternativeDistributionKeysDeleteInstance

> alternativeDistributionKeysDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AlternativeDistributionKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AlternativeDistributionKeysApi apiInstance = new AlternativeDistributionKeysApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.alternativeDistributionKeysDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlternativeDistributionKeysApi#alternativeDistributionKeysDeleteInstance");
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


## alternativeDistributionKeysGetCollection

> AlternativeDistributionKeysResponse alternativeDistributionKeysGetCollection(existsApp, fieldsAlternativeDistributionKeys, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AlternativeDistributionKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AlternativeDistributionKeysApi apiInstance = new AlternativeDistributionKeysApi(defaultClient);
        Boolean existsApp = true; // Boolean | filter by existence or non-existence of related 'app'
        List<String> fieldsAlternativeDistributionKeys = Arrays.asList(); // List<String> | the fields to include for returned resources of type alternativeDistributionKeys
        Integer limit = 56; // Integer | maximum resources per page
        try {
            AlternativeDistributionKeysResponse result = apiInstance.alternativeDistributionKeysGetCollection(existsApp, fieldsAlternativeDistributionKeys, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlternativeDistributionKeysApi#alternativeDistributionKeysGetCollection");
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
| **existsApp** | **Boolean**| filter by existence or non-existence of related &#39;app&#39; | [optional] |
| **fieldsAlternativeDistributionKeys** | **List&lt;String&gt;**| the fields to include for returned resources of type alternativeDistributionKeys | [optional] [enum: app, publicKey] |
| **limit** | **Integer**| maximum resources per page | [optional] |

### Return type

[**AlternativeDistributionKeysResponse**](AlternativeDistributionKeysResponse.md)

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
| **200** | List of AlternativeDistributionKeys |  -  |


## alternativeDistributionKeysGetInstance

> AlternativeDistributionKeyResponse alternativeDistributionKeysGetInstance(id, fieldsAlternativeDistributionKeys)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AlternativeDistributionKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AlternativeDistributionKeysApi apiInstance = new AlternativeDistributionKeysApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAlternativeDistributionKeys = Arrays.asList(); // List<String> | the fields to include for returned resources of type alternativeDistributionKeys
        try {
            AlternativeDistributionKeyResponse result = apiInstance.alternativeDistributionKeysGetInstance(id, fieldsAlternativeDistributionKeys);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlternativeDistributionKeysApi#alternativeDistributionKeysGetInstance");
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
| **fieldsAlternativeDistributionKeys** | **List&lt;String&gt;**| the fields to include for returned resources of type alternativeDistributionKeys | [optional] [enum: app, publicKey] |

### Return type

[**AlternativeDistributionKeyResponse**](AlternativeDistributionKeyResponse.md)

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
| **200** | Single AlternativeDistributionKey |  -  |

