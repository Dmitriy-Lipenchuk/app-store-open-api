# EndAppAvailabilityPreOrdersApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**endAppAvailabilityPreOrdersCreateInstance**](EndAppAvailabilityPreOrdersApi.md#endAppAvailabilityPreOrdersCreateInstance) | **POST** /v1/endAppAvailabilityPreOrders |  |



## endAppAvailabilityPreOrdersCreateInstance

> EndAppAvailabilityPreOrderResponse endAppAvailabilityPreOrdersCreateInstance(endAppAvailabilityPreOrderCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.EndAppAvailabilityPreOrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        EndAppAvailabilityPreOrdersApi apiInstance = new EndAppAvailabilityPreOrdersApi(defaultClient);
        EndAppAvailabilityPreOrderCreateRequest endAppAvailabilityPreOrderCreateRequest = new EndAppAvailabilityPreOrderCreateRequest(); // EndAppAvailabilityPreOrderCreateRequest | EndAppAvailabilityPreOrder representation
        try {
            EndAppAvailabilityPreOrderResponse result = apiInstance.endAppAvailabilityPreOrdersCreateInstance(endAppAvailabilityPreOrderCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EndAppAvailabilityPreOrdersApi#endAppAvailabilityPreOrdersCreateInstance");
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
| **endAppAvailabilityPreOrderCreateRequest** | [**EndAppAvailabilityPreOrderCreateRequest**](EndAppAvailabilityPreOrderCreateRequest.md)| EndAppAvailabilityPreOrder representation | |

### Return type

[**EndAppAvailabilityPreOrderResponse**](EndAppAvailabilityPreOrderResponse.md)

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
| **201** | Single EndAppAvailabilityPreOrder |  -  |
| **409** | Request entity error(s) |  -  |

