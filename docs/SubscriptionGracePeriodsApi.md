# SubscriptionGracePeriodsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**subscriptionGracePeriodsGetInstance**](SubscriptionGracePeriodsApi.md#subscriptionGracePeriodsGetInstance) | **GET** /v1/subscriptionGracePeriods/{id} |  |
| [**subscriptionGracePeriodsUpdateInstance**](SubscriptionGracePeriodsApi.md#subscriptionGracePeriodsUpdateInstance) | **PATCH** /v1/subscriptionGracePeriods/{id} |  |



## subscriptionGracePeriodsGetInstance

> SubscriptionGracePeriodResponse subscriptionGracePeriodsGetInstance(id, fieldsSubscriptionGracePeriods)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionGracePeriodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionGracePeriodsApi apiInstance = new SubscriptionGracePeriodsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsSubscriptionGracePeriods = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionGracePeriods
        try {
            SubscriptionGracePeriodResponse result = apiInstance.subscriptionGracePeriodsGetInstance(id, fieldsSubscriptionGracePeriods);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionGracePeriodsApi#subscriptionGracePeriodsGetInstance");
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
| **fieldsSubscriptionGracePeriods** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionGracePeriods | [optional] [enum: duration, optIn, renewalType, sandboxOptIn] |

### Return type

[**SubscriptionGracePeriodResponse**](SubscriptionGracePeriodResponse.md)

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
| **200** | Single SubscriptionGracePeriod |  -  |


## subscriptionGracePeriodsUpdateInstance

> SubscriptionGracePeriodResponse subscriptionGracePeriodsUpdateInstance(id, subscriptionGracePeriodUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionGracePeriodsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionGracePeriodsApi apiInstance = new SubscriptionGracePeriodsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        SubscriptionGracePeriodUpdateRequest subscriptionGracePeriodUpdateRequest = new SubscriptionGracePeriodUpdateRequest(); // SubscriptionGracePeriodUpdateRequest | SubscriptionGracePeriod representation
        try {
            SubscriptionGracePeriodResponse result = apiInstance.subscriptionGracePeriodsUpdateInstance(id, subscriptionGracePeriodUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionGracePeriodsApi#subscriptionGracePeriodsUpdateInstance");
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
| **subscriptionGracePeriodUpdateRequest** | [**SubscriptionGracePeriodUpdateRequest**](SubscriptionGracePeriodUpdateRequest.md)| SubscriptionGracePeriod representation | |

### Return type

[**SubscriptionGracePeriodResponse**](SubscriptionGracePeriodResponse.md)

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
| **200** | Single SubscriptionGracePeriod |  -  |
| **409** | Request entity error(s) |  -  |

