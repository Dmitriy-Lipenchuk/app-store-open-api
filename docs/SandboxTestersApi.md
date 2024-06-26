# SandboxTestersApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sandboxTestersV2GetCollection**](SandboxTestersApi.md#sandboxTestersV2GetCollection) | **GET** /v2/sandboxTesters |  |
| [**sandboxTestersV2UpdateInstance**](SandboxTestersApi.md#sandboxTestersV2UpdateInstance) | **PATCH** /v2/sandboxTesters/{id} |  |



## sandboxTestersV2GetCollection

> SandboxTestersV2Response sandboxTestersV2GetCollection(fieldsSandboxTesters, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SandboxTestersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SandboxTestersApi apiInstance = new SandboxTestersApi(defaultClient);
        List<String> fieldsSandboxTesters = Arrays.asList(); // List<String> | the fields to include for returned resources of type sandboxTesters
        Integer limit = 56; // Integer | maximum resources per page
        try {
            SandboxTestersV2Response result = apiInstance.sandboxTestersV2GetCollection(fieldsSandboxTesters, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SandboxTestersApi#sandboxTestersV2GetCollection");
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
| **fieldsSandboxTesters** | **List&lt;String&gt;**| the fields to include for returned resources of type sandboxTesters | [optional] [enum: acAccountName, applePayCompatible, firstName, interruptPurchases, lastName, subscriptionRenewalRate, territory] |
| **limit** | **Integer**| maximum resources per page | [optional] |

### Return type

[**SandboxTestersV2Response**](SandboxTestersV2Response.md)

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
| **200** | List of SandboxTesters |  -  |


## sandboxTestersV2UpdateInstance

> SandboxTesterV2Response sandboxTestersV2UpdateInstance(id, sandboxTesterV2UpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SandboxTestersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SandboxTestersApi apiInstance = new SandboxTestersApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        SandboxTesterV2UpdateRequest sandboxTesterV2UpdateRequest = new SandboxTesterV2UpdateRequest(); // SandboxTesterV2UpdateRequest | SandboxTester representation
        try {
            SandboxTesterV2Response result = apiInstance.sandboxTestersV2UpdateInstance(id, sandboxTesterV2UpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SandboxTestersApi#sandboxTestersV2UpdateInstance");
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
| **sandboxTesterV2UpdateRequest** | [**SandboxTesterV2UpdateRequest**](SandboxTesterV2UpdateRequest.md)| SandboxTester representation | |

### Return type

[**SandboxTesterV2Response**](SandboxTesterV2Response.md)

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
| **200** | Single SandboxTester |  -  |
| **409** | Request entity error(s) |  -  |

