# BetaAppClipInvocationLocalizationsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**betaAppClipInvocationLocalizationsCreateInstance**](BetaAppClipInvocationLocalizationsApi.md#betaAppClipInvocationLocalizationsCreateInstance) | **POST** /v1/betaAppClipInvocationLocalizations |  |
| [**betaAppClipInvocationLocalizationsDeleteInstance**](BetaAppClipInvocationLocalizationsApi.md#betaAppClipInvocationLocalizationsDeleteInstance) | **DELETE** /v1/betaAppClipInvocationLocalizations/{id} |  |
| [**betaAppClipInvocationLocalizationsUpdateInstance**](BetaAppClipInvocationLocalizationsApi.md#betaAppClipInvocationLocalizationsUpdateInstance) | **PATCH** /v1/betaAppClipInvocationLocalizations/{id} |  |



## betaAppClipInvocationLocalizationsCreateInstance

> BetaAppClipInvocationLocalizationResponse betaAppClipInvocationLocalizationsCreateInstance(betaAppClipInvocationLocalizationCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BetaAppClipInvocationLocalizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BetaAppClipInvocationLocalizationsApi apiInstance = new BetaAppClipInvocationLocalizationsApi(defaultClient);
        BetaAppClipInvocationLocalizationCreateRequest betaAppClipInvocationLocalizationCreateRequest = new BetaAppClipInvocationLocalizationCreateRequest(); // BetaAppClipInvocationLocalizationCreateRequest | BetaAppClipInvocationLocalization representation
        try {
            BetaAppClipInvocationLocalizationResponse result = apiInstance.betaAppClipInvocationLocalizationsCreateInstance(betaAppClipInvocationLocalizationCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BetaAppClipInvocationLocalizationsApi#betaAppClipInvocationLocalizationsCreateInstance");
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
| **betaAppClipInvocationLocalizationCreateRequest** | [**BetaAppClipInvocationLocalizationCreateRequest**](BetaAppClipInvocationLocalizationCreateRequest.md)| BetaAppClipInvocationLocalization representation | |

### Return type

[**BetaAppClipInvocationLocalizationResponse**](BetaAppClipInvocationLocalizationResponse.md)

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
| **201** | Single BetaAppClipInvocationLocalization |  -  |
| **409** | Request entity error(s) |  -  |


## betaAppClipInvocationLocalizationsDeleteInstance

> betaAppClipInvocationLocalizationsDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BetaAppClipInvocationLocalizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BetaAppClipInvocationLocalizationsApi apiInstance = new BetaAppClipInvocationLocalizationsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.betaAppClipInvocationLocalizationsDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling BetaAppClipInvocationLocalizationsApi#betaAppClipInvocationLocalizationsDeleteInstance");
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


## betaAppClipInvocationLocalizationsUpdateInstance

> BetaAppClipInvocationLocalizationResponse betaAppClipInvocationLocalizationsUpdateInstance(id, betaAppClipInvocationLocalizationUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BetaAppClipInvocationLocalizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BetaAppClipInvocationLocalizationsApi apiInstance = new BetaAppClipInvocationLocalizationsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        BetaAppClipInvocationLocalizationUpdateRequest betaAppClipInvocationLocalizationUpdateRequest = new BetaAppClipInvocationLocalizationUpdateRequest(); // BetaAppClipInvocationLocalizationUpdateRequest | BetaAppClipInvocationLocalization representation
        try {
            BetaAppClipInvocationLocalizationResponse result = apiInstance.betaAppClipInvocationLocalizationsUpdateInstance(id, betaAppClipInvocationLocalizationUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BetaAppClipInvocationLocalizationsApi#betaAppClipInvocationLocalizationsUpdateInstance");
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
| **betaAppClipInvocationLocalizationUpdateRequest** | [**BetaAppClipInvocationLocalizationUpdateRequest**](BetaAppClipInvocationLocalizationUpdateRequest.md)| BetaAppClipInvocationLocalization representation | |

### Return type

[**BetaAppClipInvocationLocalizationResponse**](BetaAppClipInvocationLocalizationResponse.md)

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
| **200** | Single BetaAppClipInvocationLocalization |  -  |
| **409** | Request entity error(s) |  -  |

