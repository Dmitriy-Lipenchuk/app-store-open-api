# AlternativeDistributionPackageVariantsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**alternativeDistributionPackageVariantsGetInstance**](AlternativeDistributionPackageVariantsApi.md#alternativeDistributionPackageVariantsGetInstance) | **GET** /v1/alternativeDistributionPackageVariants/{id} |  |



## alternativeDistributionPackageVariantsGetInstance

> AlternativeDistributionPackageVariantResponse alternativeDistributionPackageVariantsGetInstance(id, fieldsAlternativeDistributionPackageVariants)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AlternativeDistributionPackageVariantsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AlternativeDistributionPackageVariantsApi apiInstance = new AlternativeDistributionPackageVariantsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAlternativeDistributionPackageVariants = Arrays.asList(); // List<String> | the fields to include for returned resources of type alternativeDistributionPackageVariants
        try {
            AlternativeDistributionPackageVariantResponse result = apiInstance.alternativeDistributionPackageVariantsGetInstance(id, fieldsAlternativeDistributionPackageVariants);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlternativeDistributionPackageVariantsApi#alternativeDistributionPackageVariantsGetInstance");
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
| **fieldsAlternativeDistributionPackageVariants** | **List&lt;String&gt;**| the fields to include for returned resources of type alternativeDistributionPackageVariants | [optional] [enum: alternativeDistributionKeyBlob, fileChecksum, url, urlExpirationDate] |

### Return type

[**AlternativeDistributionPackageVariantResponse**](AlternativeDistributionPackageVariantResponse.md)

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
| **200** | Single AlternativeDistributionPackageVariant |  -  |

