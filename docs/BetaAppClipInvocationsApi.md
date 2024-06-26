# BetaAppClipInvocationsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**betaAppClipInvocationsCreateInstance**](BetaAppClipInvocationsApi.md#betaAppClipInvocationsCreateInstance) | **POST** /v1/betaAppClipInvocations |  |
| [**betaAppClipInvocationsDeleteInstance**](BetaAppClipInvocationsApi.md#betaAppClipInvocationsDeleteInstance) | **DELETE** /v1/betaAppClipInvocations/{id} |  |
| [**betaAppClipInvocationsGetInstance**](BetaAppClipInvocationsApi.md#betaAppClipInvocationsGetInstance) | **GET** /v1/betaAppClipInvocations/{id} |  |
| [**betaAppClipInvocationsUpdateInstance**](BetaAppClipInvocationsApi.md#betaAppClipInvocationsUpdateInstance) | **PATCH** /v1/betaAppClipInvocations/{id} |  |



## betaAppClipInvocationsCreateInstance

> BetaAppClipInvocationResponse betaAppClipInvocationsCreateInstance(betaAppClipInvocationCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BetaAppClipInvocationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BetaAppClipInvocationsApi apiInstance = new BetaAppClipInvocationsApi(defaultClient);
        BetaAppClipInvocationCreateRequest betaAppClipInvocationCreateRequest = new BetaAppClipInvocationCreateRequest(); // BetaAppClipInvocationCreateRequest | BetaAppClipInvocation representation
        try {
            BetaAppClipInvocationResponse result = apiInstance.betaAppClipInvocationsCreateInstance(betaAppClipInvocationCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BetaAppClipInvocationsApi#betaAppClipInvocationsCreateInstance");
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
| **betaAppClipInvocationCreateRequest** | [**BetaAppClipInvocationCreateRequest**](BetaAppClipInvocationCreateRequest.md)| BetaAppClipInvocation representation | |

### Return type

[**BetaAppClipInvocationResponse**](BetaAppClipInvocationResponse.md)

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
| **201** | Single BetaAppClipInvocation |  -  |
| **409** | Request entity error(s) |  -  |


## betaAppClipInvocationsDeleteInstance

> betaAppClipInvocationsDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BetaAppClipInvocationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BetaAppClipInvocationsApi apiInstance = new BetaAppClipInvocationsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.betaAppClipInvocationsDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling BetaAppClipInvocationsApi#betaAppClipInvocationsDeleteInstance");
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


## betaAppClipInvocationsGetInstance

> BetaAppClipInvocationResponse betaAppClipInvocationsGetInstance(id, fieldsBetaAppClipInvocations, include, limitBetaAppClipInvocationLocalizations)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BetaAppClipInvocationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BetaAppClipInvocationsApi apiInstance = new BetaAppClipInvocationsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsBetaAppClipInvocations = Arrays.asList(); // List<String> | the fields to include for returned resources of type betaAppClipInvocations
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        Integer limitBetaAppClipInvocationLocalizations = 56; // Integer | maximum number of related betaAppClipInvocationLocalizations returned (when they are included)
        try {
            BetaAppClipInvocationResponse result = apiInstance.betaAppClipInvocationsGetInstance(id, fieldsBetaAppClipInvocations, include, limitBetaAppClipInvocationLocalizations);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BetaAppClipInvocationsApi#betaAppClipInvocationsGetInstance");
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
| **fieldsBetaAppClipInvocations** | **List&lt;String&gt;**| the fields to include for returned resources of type betaAppClipInvocations | [optional] [enum: betaAppClipInvocationLocalizations, buildBundle, url] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: betaAppClipInvocationLocalizations] |
| **limitBetaAppClipInvocationLocalizations** | **Integer**| maximum number of related betaAppClipInvocationLocalizations returned (when they are included) | [optional] |

### Return type

[**BetaAppClipInvocationResponse**](BetaAppClipInvocationResponse.md)

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
| **200** | Single BetaAppClipInvocation |  -  |


## betaAppClipInvocationsUpdateInstance

> BetaAppClipInvocationResponse betaAppClipInvocationsUpdateInstance(id, betaAppClipInvocationUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BetaAppClipInvocationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BetaAppClipInvocationsApi apiInstance = new BetaAppClipInvocationsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        BetaAppClipInvocationUpdateRequest betaAppClipInvocationUpdateRequest = new BetaAppClipInvocationUpdateRequest(); // BetaAppClipInvocationUpdateRequest | BetaAppClipInvocation representation
        try {
            BetaAppClipInvocationResponse result = apiInstance.betaAppClipInvocationsUpdateInstance(id, betaAppClipInvocationUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BetaAppClipInvocationsApi#betaAppClipInvocationsUpdateInstance");
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
| **betaAppClipInvocationUpdateRequest** | [**BetaAppClipInvocationUpdateRequest**](BetaAppClipInvocationUpdateRequest.md)| BetaAppClipInvocation representation | |

### Return type

[**BetaAppClipInvocationResponse**](BetaAppClipInvocationResponse.md)

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
| **200** | Single BetaAppClipInvocation |  -  |
| **409** | Request entity error(s) |  -  |

