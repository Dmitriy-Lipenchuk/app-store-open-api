# DiagnosticSignaturesApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**diagnosticSignaturesLogsGetToManyRelated**](DiagnosticSignaturesApi.md#diagnosticSignaturesLogsGetToManyRelated) | **GET** /v1/diagnosticSignatures/{id}/logs |  |



## diagnosticSignaturesLogsGetToManyRelated

> DiagnosticLogs diagnosticSignaturesLogsGetToManyRelated(id, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.DiagnosticSignaturesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        DiagnosticSignaturesApi apiInstance = new DiagnosticSignaturesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        Integer limit = 56; // Integer | maximum resources per page
        try {
            DiagnosticLogs result = apiInstance.diagnosticSignaturesLogsGetToManyRelated(id, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DiagnosticSignaturesApi#diagnosticSignaturesLogsGetToManyRelated");
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
| **limit** | **Integer**| maximum resources per page | [optional] |

### Return type

[**DiagnosticLogs**](DiagnosticLogs.md)

### Authorization

[itc-bearer-token](../README.md#itc-bearer-token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.apple.diagnostic-logs+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Parameter error(s) |  -  |
| **401** | Unauthorized error(s) |  -  |
| **403** | Forbidden error |  -  |
| **404** | Not found error |  -  |
| **200** | List of DiagnosticLogs |  -  |

