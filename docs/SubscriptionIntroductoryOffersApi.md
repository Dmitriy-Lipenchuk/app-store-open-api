# SubscriptionIntroductoryOffersApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**subscriptionIntroductoryOffersCreateInstance**](SubscriptionIntroductoryOffersApi.md#subscriptionIntroductoryOffersCreateInstance) | **POST** /v1/subscriptionIntroductoryOffers |  |
| [**subscriptionIntroductoryOffersDeleteInstance**](SubscriptionIntroductoryOffersApi.md#subscriptionIntroductoryOffersDeleteInstance) | **DELETE** /v1/subscriptionIntroductoryOffers/{id} |  |
| [**subscriptionIntroductoryOffersUpdateInstance**](SubscriptionIntroductoryOffersApi.md#subscriptionIntroductoryOffersUpdateInstance) | **PATCH** /v1/subscriptionIntroductoryOffers/{id} |  |



## subscriptionIntroductoryOffersCreateInstance

> SubscriptionIntroductoryOfferResponse subscriptionIntroductoryOffersCreateInstance(subscriptionIntroductoryOfferCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionIntroductoryOffersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionIntroductoryOffersApi apiInstance = new SubscriptionIntroductoryOffersApi(defaultClient);
        SubscriptionIntroductoryOfferCreateRequest subscriptionIntroductoryOfferCreateRequest = new SubscriptionIntroductoryOfferCreateRequest(); // SubscriptionIntroductoryOfferCreateRequest | SubscriptionIntroductoryOffer representation
        try {
            SubscriptionIntroductoryOfferResponse result = apiInstance.subscriptionIntroductoryOffersCreateInstance(subscriptionIntroductoryOfferCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionIntroductoryOffersApi#subscriptionIntroductoryOffersCreateInstance");
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
| **subscriptionIntroductoryOfferCreateRequest** | [**SubscriptionIntroductoryOfferCreateRequest**](SubscriptionIntroductoryOfferCreateRequest.md)| SubscriptionIntroductoryOffer representation | |

### Return type

[**SubscriptionIntroductoryOfferResponse**](SubscriptionIntroductoryOfferResponse.md)

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
| **201** | Single SubscriptionIntroductoryOffer |  -  |
| **409** | Request entity error(s) |  -  |


## subscriptionIntroductoryOffersDeleteInstance

> subscriptionIntroductoryOffersDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionIntroductoryOffersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionIntroductoryOffersApi apiInstance = new SubscriptionIntroductoryOffersApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.subscriptionIntroductoryOffersDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionIntroductoryOffersApi#subscriptionIntroductoryOffersDeleteInstance");
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

### Return type

null (empty response body)

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
| **409** | Request entity error(s) |  -  |
| **204** | Success (no content) |  -  |


## subscriptionIntroductoryOffersUpdateInstance

> SubscriptionIntroductoryOfferResponse subscriptionIntroductoryOffersUpdateInstance(id, subscriptionIntroductoryOfferUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionIntroductoryOffersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionIntroductoryOffersApi apiInstance = new SubscriptionIntroductoryOffersApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        SubscriptionIntroductoryOfferUpdateRequest subscriptionIntroductoryOfferUpdateRequest = new SubscriptionIntroductoryOfferUpdateRequest(); // SubscriptionIntroductoryOfferUpdateRequest | SubscriptionIntroductoryOffer representation
        try {
            SubscriptionIntroductoryOfferResponse result = apiInstance.subscriptionIntroductoryOffersUpdateInstance(id, subscriptionIntroductoryOfferUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionIntroductoryOffersApi#subscriptionIntroductoryOffersUpdateInstance");
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
| **subscriptionIntroductoryOfferUpdateRequest** | [**SubscriptionIntroductoryOfferUpdateRequest**](SubscriptionIntroductoryOfferUpdateRequest.md)| SubscriptionIntroductoryOffer representation | |

### Return type

[**SubscriptionIntroductoryOfferResponse**](SubscriptionIntroductoryOfferResponse.md)

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
| **200** | Single SubscriptionIntroductoryOffer |  -  |
| **409** | Request entity error(s) |  -  |

