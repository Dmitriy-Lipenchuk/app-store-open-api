# AppStoreVersionPromotionsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**appStoreVersionPromotionsCreateInstance**](AppStoreVersionPromotionsApi.md#appStoreVersionPromotionsCreateInstance) | **POST** /v1/appStoreVersionPromotions |  |



## appStoreVersionPromotionsCreateInstance

> AppStoreVersionPromotionResponse appStoreVersionPromotionsCreateInstance(appStoreVersionPromotionCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppStoreVersionPromotionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppStoreVersionPromotionsApi apiInstance = new AppStoreVersionPromotionsApi(defaultClient);
        AppStoreVersionPromotionCreateRequest appStoreVersionPromotionCreateRequest = new AppStoreVersionPromotionCreateRequest(); // AppStoreVersionPromotionCreateRequest | AppStoreVersionPromotion representation
        try {
            AppStoreVersionPromotionResponse result = apiInstance.appStoreVersionPromotionsCreateInstance(appStoreVersionPromotionCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppStoreVersionPromotionsApi#appStoreVersionPromotionsCreateInstance");
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
| **appStoreVersionPromotionCreateRequest** | [**AppStoreVersionPromotionCreateRequest**](AppStoreVersionPromotionCreateRequest.md)| AppStoreVersionPromotion representation | |

### Return type

[**AppStoreVersionPromotionResponse**](AppStoreVersionPromotionResponse.md)

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
| **201** | Single AppStoreVersionPromotion |  -  |
| **409** | Request entity error(s) |  -  |

