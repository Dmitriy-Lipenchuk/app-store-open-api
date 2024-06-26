# AlternativeDistributionPackageDeltasApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**alternativeDistributionPackageDeltasGetInstance**](AlternativeDistributionPackageDeltasApi.md#alternativeDistributionPackageDeltasGetInstance) | **GET** /v1/alternativeDistributionPackageDeltas/{id} |  |



## alternativeDistributionPackageDeltasGetInstance

> AlternativeDistributionPackageDeltaResponse alternativeDistributionPackageDeltasGetInstance(id, fieldsAlternativeDistributionPackageDeltas)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AlternativeDistributionPackageDeltasApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AlternativeDistributionPackageDeltasApi apiInstance = new AlternativeDistributionPackageDeltasApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAlternativeDistributionPackageDeltas = Arrays.asList(); // List<String> | the fields to include for returned resources of type alternativeDistributionPackageDeltas
        try {
            AlternativeDistributionPackageDeltaResponse result = apiInstance.alternativeDistributionPackageDeltasGetInstance(id, fieldsAlternativeDistributionPackageDeltas);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlternativeDistributionPackageDeltasApi#alternativeDistributionPackageDeltasGetInstance");
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
| **fieldsAlternativeDistributionPackageDeltas** | **List&lt;String&gt;**| the fields to include for returned resources of type alternativeDistributionPackageDeltas | [optional] [enum: alternativeDistributionKeyBlob, fileChecksum, url, urlExpirationDate] |

### Return type

[**AlternativeDistributionPackageDeltaResponse**](AlternativeDistributionPackageDeltaResponse.md)

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
| **200** | Single AlternativeDistributionPackageDelta |  -  |

