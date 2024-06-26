# SubscriptionGroupLocalizationsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**subscriptionGroupLocalizationsCreateInstance**](SubscriptionGroupLocalizationsApi.md#subscriptionGroupLocalizationsCreateInstance) | **POST** /v1/subscriptionGroupLocalizations |  |
| [**subscriptionGroupLocalizationsDeleteInstance**](SubscriptionGroupLocalizationsApi.md#subscriptionGroupLocalizationsDeleteInstance) | **DELETE** /v1/subscriptionGroupLocalizations/{id} |  |
| [**subscriptionGroupLocalizationsGetInstance**](SubscriptionGroupLocalizationsApi.md#subscriptionGroupLocalizationsGetInstance) | **GET** /v1/subscriptionGroupLocalizations/{id} |  |
| [**subscriptionGroupLocalizationsUpdateInstance**](SubscriptionGroupLocalizationsApi.md#subscriptionGroupLocalizationsUpdateInstance) | **PATCH** /v1/subscriptionGroupLocalizations/{id} |  |



## subscriptionGroupLocalizationsCreateInstance

> SubscriptionGroupLocalizationResponse subscriptionGroupLocalizationsCreateInstance(subscriptionGroupLocalizationCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionGroupLocalizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionGroupLocalizationsApi apiInstance = new SubscriptionGroupLocalizationsApi(defaultClient);
        SubscriptionGroupLocalizationCreateRequest subscriptionGroupLocalizationCreateRequest = new SubscriptionGroupLocalizationCreateRequest(); // SubscriptionGroupLocalizationCreateRequest | SubscriptionGroupLocalization representation
        try {
            SubscriptionGroupLocalizationResponse result = apiInstance.subscriptionGroupLocalizationsCreateInstance(subscriptionGroupLocalizationCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionGroupLocalizationsApi#subscriptionGroupLocalizationsCreateInstance");
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
| **subscriptionGroupLocalizationCreateRequest** | [**SubscriptionGroupLocalizationCreateRequest**](SubscriptionGroupLocalizationCreateRequest.md)| SubscriptionGroupLocalization representation | |

### Return type

[**SubscriptionGroupLocalizationResponse**](SubscriptionGroupLocalizationResponse.md)

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
| **201** | Single SubscriptionGroupLocalization |  -  |
| **409** | Request entity error(s) |  -  |


## subscriptionGroupLocalizationsDeleteInstance

> subscriptionGroupLocalizationsDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionGroupLocalizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionGroupLocalizationsApi apiInstance = new SubscriptionGroupLocalizationsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.subscriptionGroupLocalizationsDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionGroupLocalizationsApi#subscriptionGroupLocalizationsDeleteInstance");
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


## subscriptionGroupLocalizationsGetInstance

> SubscriptionGroupLocalizationResponse subscriptionGroupLocalizationsGetInstance(id, fieldsSubscriptionGroupLocalizations, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionGroupLocalizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionGroupLocalizationsApi apiInstance = new SubscriptionGroupLocalizationsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsSubscriptionGroupLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionGroupLocalizations
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            SubscriptionGroupLocalizationResponse result = apiInstance.subscriptionGroupLocalizationsGetInstance(id, fieldsSubscriptionGroupLocalizations, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionGroupLocalizationsApi#subscriptionGroupLocalizationsGetInstance");
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
| **fieldsSubscriptionGroupLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionGroupLocalizations | [optional] [enum: customAppName, locale, name, state, subscriptionGroup] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: subscriptionGroup] |

### Return type

[**SubscriptionGroupLocalizationResponse**](SubscriptionGroupLocalizationResponse.md)

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
| **200** | Single SubscriptionGroupLocalization |  -  |


## subscriptionGroupLocalizationsUpdateInstance

> SubscriptionGroupLocalizationResponse subscriptionGroupLocalizationsUpdateInstance(id, subscriptionGroupLocalizationUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionGroupLocalizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionGroupLocalizationsApi apiInstance = new SubscriptionGroupLocalizationsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        SubscriptionGroupLocalizationUpdateRequest subscriptionGroupLocalizationUpdateRequest = new SubscriptionGroupLocalizationUpdateRequest(); // SubscriptionGroupLocalizationUpdateRequest | SubscriptionGroupLocalization representation
        try {
            SubscriptionGroupLocalizationResponse result = apiInstance.subscriptionGroupLocalizationsUpdateInstance(id, subscriptionGroupLocalizationUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionGroupLocalizationsApi#subscriptionGroupLocalizationsUpdateInstance");
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
| **subscriptionGroupLocalizationUpdateRequest** | [**SubscriptionGroupLocalizationUpdateRequest**](SubscriptionGroupLocalizationUpdateRequest.md)| SubscriptionGroupLocalization representation | |

### Return type

[**SubscriptionGroupLocalizationResponse**](SubscriptionGroupLocalizationResponse.md)

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
| **200** | Single SubscriptionGroupLocalization |  -  |
| **409** | Request entity error(s) |  -  |

