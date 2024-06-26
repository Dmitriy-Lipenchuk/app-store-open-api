# SubscriptionOfferCodeOneTimeUseCodesApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**subscriptionOfferCodeOneTimeUseCodesCreateInstance**](SubscriptionOfferCodeOneTimeUseCodesApi.md#subscriptionOfferCodeOneTimeUseCodesCreateInstance) | **POST** /v1/subscriptionOfferCodeOneTimeUseCodes |  |
| [**subscriptionOfferCodeOneTimeUseCodesGetInstance**](SubscriptionOfferCodeOneTimeUseCodesApi.md#subscriptionOfferCodeOneTimeUseCodesGetInstance) | **GET** /v1/subscriptionOfferCodeOneTimeUseCodes/{id} |  |
| [**subscriptionOfferCodeOneTimeUseCodesUpdateInstance**](SubscriptionOfferCodeOneTimeUseCodesApi.md#subscriptionOfferCodeOneTimeUseCodesUpdateInstance) | **PATCH** /v1/subscriptionOfferCodeOneTimeUseCodes/{id} |  |
| [**subscriptionOfferCodeOneTimeUseCodesValuesGetToOneRelated**](SubscriptionOfferCodeOneTimeUseCodesApi.md#subscriptionOfferCodeOneTimeUseCodesValuesGetToOneRelated) | **GET** /v1/subscriptionOfferCodeOneTimeUseCodes/{id}/values |  |



## subscriptionOfferCodeOneTimeUseCodesCreateInstance

> SubscriptionOfferCodeOneTimeUseCodeResponse subscriptionOfferCodeOneTimeUseCodesCreateInstance(subscriptionOfferCodeOneTimeUseCodeCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionOfferCodeOneTimeUseCodesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionOfferCodeOneTimeUseCodesApi apiInstance = new SubscriptionOfferCodeOneTimeUseCodesApi(defaultClient);
        SubscriptionOfferCodeOneTimeUseCodeCreateRequest subscriptionOfferCodeOneTimeUseCodeCreateRequest = new SubscriptionOfferCodeOneTimeUseCodeCreateRequest(); // SubscriptionOfferCodeOneTimeUseCodeCreateRequest | SubscriptionOfferCodeOneTimeUseCode representation
        try {
            SubscriptionOfferCodeOneTimeUseCodeResponse result = apiInstance.subscriptionOfferCodeOneTimeUseCodesCreateInstance(subscriptionOfferCodeOneTimeUseCodeCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionOfferCodeOneTimeUseCodesApi#subscriptionOfferCodeOneTimeUseCodesCreateInstance");
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
| **subscriptionOfferCodeOneTimeUseCodeCreateRequest** | [**SubscriptionOfferCodeOneTimeUseCodeCreateRequest**](SubscriptionOfferCodeOneTimeUseCodeCreateRequest.md)| SubscriptionOfferCodeOneTimeUseCode representation | |

### Return type

[**SubscriptionOfferCodeOneTimeUseCodeResponse**](SubscriptionOfferCodeOneTimeUseCodeResponse.md)

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
| **201** | Single SubscriptionOfferCodeOneTimeUseCode |  -  |
| **409** | Request entity error(s) |  -  |


## subscriptionOfferCodeOneTimeUseCodesGetInstance

> SubscriptionOfferCodeOneTimeUseCodeResponse subscriptionOfferCodeOneTimeUseCodesGetInstance(id, fieldsSubscriptionOfferCodeOneTimeUseCodes, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionOfferCodeOneTimeUseCodesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionOfferCodeOneTimeUseCodesApi apiInstance = new SubscriptionOfferCodeOneTimeUseCodesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsSubscriptionOfferCodeOneTimeUseCodes = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionOfferCodeOneTimeUseCodes
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            SubscriptionOfferCodeOneTimeUseCodeResponse result = apiInstance.subscriptionOfferCodeOneTimeUseCodesGetInstance(id, fieldsSubscriptionOfferCodeOneTimeUseCodes, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionOfferCodeOneTimeUseCodesApi#subscriptionOfferCodeOneTimeUseCodesGetInstance");
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
| **fieldsSubscriptionOfferCodeOneTimeUseCodes** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionOfferCodeOneTimeUseCodes | [optional] [enum: active, createdDate, expirationDate, numberOfCodes, offerCode, values] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: offerCode] |

### Return type

[**SubscriptionOfferCodeOneTimeUseCodeResponse**](SubscriptionOfferCodeOneTimeUseCodeResponse.md)

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
| **200** | Single SubscriptionOfferCodeOneTimeUseCode |  -  |


## subscriptionOfferCodeOneTimeUseCodesUpdateInstance

> SubscriptionOfferCodeOneTimeUseCodeResponse subscriptionOfferCodeOneTimeUseCodesUpdateInstance(id, subscriptionOfferCodeOneTimeUseCodeUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionOfferCodeOneTimeUseCodesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionOfferCodeOneTimeUseCodesApi apiInstance = new SubscriptionOfferCodeOneTimeUseCodesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        SubscriptionOfferCodeOneTimeUseCodeUpdateRequest subscriptionOfferCodeOneTimeUseCodeUpdateRequest = new SubscriptionOfferCodeOneTimeUseCodeUpdateRequest(); // SubscriptionOfferCodeOneTimeUseCodeUpdateRequest | SubscriptionOfferCodeOneTimeUseCode representation
        try {
            SubscriptionOfferCodeOneTimeUseCodeResponse result = apiInstance.subscriptionOfferCodeOneTimeUseCodesUpdateInstance(id, subscriptionOfferCodeOneTimeUseCodeUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionOfferCodeOneTimeUseCodesApi#subscriptionOfferCodeOneTimeUseCodesUpdateInstance");
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
| **subscriptionOfferCodeOneTimeUseCodeUpdateRequest** | [**SubscriptionOfferCodeOneTimeUseCodeUpdateRequest**](SubscriptionOfferCodeOneTimeUseCodeUpdateRequest.md)| SubscriptionOfferCodeOneTimeUseCode representation | |

### Return type

[**SubscriptionOfferCodeOneTimeUseCodeResponse**](SubscriptionOfferCodeOneTimeUseCodeResponse.md)

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
| **200** | Single SubscriptionOfferCodeOneTimeUseCode |  -  |
| **409** | Request entity error(s) |  -  |


## subscriptionOfferCodeOneTimeUseCodesValuesGetToOneRelated

> String subscriptionOfferCodeOneTimeUseCodesValuesGetToOneRelated(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionOfferCodeOneTimeUseCodesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionOfferCodeOneTimeUseCodesApi apiInstance = new SubscriptionOfferCodeOneTimeUseCodesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            String result = apiInstance.subscriptionOfferCodeOneTimeUseCodesValuesGetToOneRelated(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionOfferCodeOneTimeUseCodesApi#subscriptionOfferCodeOneTimeUseCodesValuesGetToOneRelated");
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

**String**

### Authorization

[itc-bearer-token](../README.md#itc-bearer-token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Parameter error(s) |  -  |
| **401** | Unauthorized error(s) |  -  |
| **403** | Forbidden error |  -  |
| **404** | Not found error |  -  |
| **200** | Single SubscriptionOfferCodeOneTimeUseCodeValue |  -  |

