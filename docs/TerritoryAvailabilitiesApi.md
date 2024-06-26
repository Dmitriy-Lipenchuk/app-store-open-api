# TerritoryAvailabilitiesApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**territoryAvailabilitiesUpdateInstance**](TerritoryAvailabilitiesApi.md#territoryAvailabilitiesUpdateInstance) | **PATCH** /v1/territoryAvailabilities/{id} |  |



## territoryAvailabilitiesUpdateInstance

> TerritoryAvailabilityResponse territoryAvailabilitiesUpdateInstance(id, territoryAvailabilityUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.TerritoryAvailabilitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        TerritoryAvailabilitiesApi apiInstance = new TerritoryAvailabilitiesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        TerritoryAvailabilityUpdateRequest territoryAvailabilityUpdateRequest = new TerritoryAvailabilityUpdateRequest(); // TerritoryAvailabilityUpdateRequest | TerritoryAvailability representation
        try {
            TerritoryAvailabilityResponse result = apiInstance.territoryAvailabilitiesUpdateInstance(id, territoryAvailabilityUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TerritoryAvailabilitiesApi#territoryAvailabilitiesUpdateInstance");
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
| **territoryAvailabilityUpdateRequest** | [**TerritoryAvailabilityUpdateRequest**](TerritoryAvailabilityUpdateRequest.md)| TerritoryAvailability representation | |

### Return type

[**TerritoryAvailabilityResponse**](TerritoryAvailabilityResponse.md)

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
| **200** | Single TerritoryAvailability |  -  |
| **409** | Request entity error(s) |  -  |

