# SubscriptionGroupSubmissionsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**subscriptionGroupSubmissionsCreateInstance**](SubscriptionGroupSubmissionsApi.md#subscriptionGroupSubmissionsCreateInstance) | **POST** /v1/subscriptionGroupSubmissions |  |



## subscriptionGroupSubmissionsCreateInstance

> SubscriptionGroupSubmissionResponse subscriptionGroupSubmissionsCreateInstance(subscriptionGroupSubmissionCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionGroupSubmissionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionGroupSubmissionsApi apiInstance = new SubscriptionGroupSubmissionsApi(defaultClient);
        SubscriptionGroupSubmissionCreateRequest subscriptionGroupSubmissionCreateRequest = new SubscriptionGroupSubmissionCreateRequest(); // SubscriptionGroupSubmissionCreateRequest | SubscriptionGroupSubmission representation
        try {
            SubscriptionGroupSubmissionResponse result = apiInstance.subscriptionGroupSubmissionsCreateInstance(subscriptionGroupSubmissionCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionGroupSubmissionsApi#subscriptionGroupSubmissionsCreateInstance");
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
| **subscriptionGroupSubmissionCreateRequest** | [**SubscriptionGroupSubmissionCreateRequest**](SubscriptionGroupSubmissionCreateRequest.md)| SubscriptionGroupSubmission representation | |

### Return type

[**SubscriptionGroupSubmissionResponse**](SubscriptionGroupSubmissionResponse.md)

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
| **201** | Single SubscriptionGroupSubmission |  -  |
| **409** | Request entity error(s) |  -  |

