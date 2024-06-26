# InAppPurchaseContentsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**inAppPurchaseContentsGetInstance**](InAppPurchaseContentsApi.md#inAppPurchaseContentsGetInstance) | **GET** /v1/inAppPurchaseContents/{id} |  |



## inAppPurchaseContentsGetInstance

> InAppPurchaseContentResponse inAppPurchaseContentsGetInstance(id, fieldsInAppPurchaseContents, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.InAppPurchaseContentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        InAppPurchaseContentsApi apiInstance = new InAppPurchaseContentsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsInAppPurchaseContents = Arrays.asList(); // List<String> | the fields to include for returned resources of type inAppPurchaseContents
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            InAppPurchaseContentResponse result = apiInstance.inAppPurchaseContentsGetInstance(id, fieldsInAppPurchaseContents, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InAppPurchaseContentsApi#inAppPurchaseContentsGetInstance");
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
| **fieldsInAppPurchaseContents** | **List&lt;String&gt;**| the fields to include for returned resources of type inAppPurchaseContents | [optional] [enum: fileName, fileSize, inAppPurchaseV2, lastModifiedDate, url] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: inAppPurchaseV2] |

### Return type

[**InAppPurchaseContentResponse**](InAppPurchaseContentResponse.md)

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
| **200** | Single InAppPurchaseContent |  -  |

