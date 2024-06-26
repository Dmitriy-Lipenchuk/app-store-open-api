# SubscriptionOfferCodeCustomCodesApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**subscriptionOfferCodeCustomCodesCreateInstance**](SubscriptionOfferCodeCustomCodesApi.md#subscriptionOfferCodeCustomCodesCreateInstance) | **POST** /v1/subscriptionOfferCodeCustomCodes |  |
| [**subscriptionOfferCodeCustomCodesGetInstance**](SubscriptionOfferCodeCustomCodesApi.md#subscriptionOfferCodeCustomCodesGetInstance) | **GET** /v1/subscriptionOfferCodeCustomCodes/{id} |  |
| [**subscriptionOfferCodeCustomCodesUpdateInstance**](SubscriptionOfferCodeCustomCodesApi.md#subscriptionOfferCodeCustomCodesUpdateInstance) | **PATCH** /v1/subscriptionOfferCodeCustomCodes/{id} |  |



## subscriptionOfferCodeCustomCodesCreateInstance

> SubscriptionOfferCodeCustomCodeResponse subscriptionOfferCodeCustomCodesCreateInstance(subscriptionOfferCodeCustomCodeCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionOfferCodeCustomCodesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionOfferCodeCustomCodesApi apiInstance = new SubscriptionOfferCodeCustomCodesApi(defaultClient);
        SubscriptionOfferCodeCustomCodeCreateRequest subscriptionOfferCodeCustomCodeCreateRequest = new SubscriptionOfferCodeCustomCodeCreateRequest(); // SubscriptionOfferCodeCustomCodeCreateRequest | SubscriptionOfferCodeCustomCode representation
        try {
            SubscriptionOfferCodeCustomCodeResponse result = apiInstance.subscriptionOfferCodeCustomCodesCreateInstance(subscriptionOfferCodeCustomCodeCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionOfferCodeCustomCodesApi#subscriptionOfferCodeCustomCodesCreateInstance");
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
| **subscriptionOfferCodeCustomCodeCreateRequest** | [**SubscriptionOfferCodeCustomCodeCreateRequest**](SubscriptionOfferCodeCustomCodeCreateRequest.md)| SubscriptionOfferCodeCustomCode representation | |

### Return type

[**SubscriptionOfferCodeCustomCodeResponse**](SubscriptionOfferCodeCustomCodeResponse.md)

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
| **201** | Single SubscriptionOfferCodeCustomCode |  -  |
| **409** | Request entity error(s) |  -  |


## subscriptionOfferCodeCustomCodesGetInstance

> SubscriptionOfferCodeCustomCodeResponse subscriptionOfferCodeCustomCodesGetInstance(id, fieldsSubscriptionOfferCodeCustomCodes, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionOfferCodeCustomCodesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionOfferCodeCustomCodesApi apiInstance = new SubscriptionOfferCodeCustomCodesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsSubscriptionOfferCodeCustomCodes = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionOfferCodeCustomCodes
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            SubscriptionOfferCodeCustomCodeResponse result = apiInstance.subscriptionOfferCodeCustomCodesGetInstance(id, fieldsSubscriptionOfferCodeCustomCodes, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionOfferCodeCustomCodesApi#subscriptionOfferCodeCustomCodesGetInstance");
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
| **fieldsSubscriptionOfferCodeCustomCodes** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionOfferCodeCustomCodes | [optional] [enum: active, createdDate, customCode, expirationDate, numberOfCodes, offerCode] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: offerCode] |

### Return type

[**SubscriptionOfferCodeCustomCodeResponse**](SubscriptionOfferCodeCustomCodeResponse.md)

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
| **200** | Single SubscriptionOfferCodeCustomCode |  -  |


## subscriptionOfferCodeCustomCodesUpdateInstance

> SubscriptionOfferCodeCustomCodeResponse subscriptionOfferCodeCustomCodesUpdateInstance(id, subscriptionOfferCodeCustomCodeUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionOfferCodeCustomCodesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionOfferCodeCustomCodesApi apiInstance = new SubscriptionOfferCodeCustomCodesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        SubscriptionOfferCodeCustomCodeUpdateRequest subscriptionOfferCodeCustomCodeUpdateRequest = new SubscriptionOfferCodeCustomCodeUpdateRequest(); // SubscriptionOfferCodeCustomCodeUpdateRequest | SubscriptionOfferCodeCustomCode representation
        try {
            SubscriptionOfferCodeCustomCodeResponse result = apiInstance.subscriptionOfferCodeCustomCodesUpdateInstance(id, subscriptionOfferCodeCustomCodeUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionOfferCodeCustomCodesApi#subscriptionOfferCodeCustomCodesUpdateInstance");
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
| **subscriptionOfferCodeCustomCodeUpdateRequest** | [**SubscriptionOfferCodeCustomCodeUpdateRequest**](SubscriptionOfferCodeCustomCodeUpdateRequest.md)| SubscriptionOfferCodeCustomCode representation | |

### Return type

[**SubscriptionOfferCodeCustomCodeResponse**](SubscriptionOfferCodeCustomCodeResponse.md)

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
| **200** | Single SubscriptionOfferCodeCustomCode |  -  |
| **409** | Request entity error(s) |  -  |

