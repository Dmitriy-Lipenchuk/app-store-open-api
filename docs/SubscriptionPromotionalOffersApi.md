# SubscriptionPromotionalOffersApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**subscriptionPromotionalOffersCreateInstance**](SubscriptionPromotionalOffersApi.md#subscriptionPromotionalOffersCreateInstance) | **POST** /v1/subscriptionPromotionalOffers |  |
| [**subscriptionPromotionalOffersDeleteInstance**](SubscriptionPromotionalOffersApi.md#subscriptionPromotionalOffersDeleteInstance) | **DELETE** /v1/subscriptionPromotionalOffers/{id} |  |
| [**subscriptionPromotionalOffersGetInstance**](SubscriptionPromotionalOffersApi.md#subscriptionPromotionalOffersGetInstance) | **GET** /v1/subscriptionPromotionalOffers/{id} |  |
| [**subscriptionPromotionalOffersPricesGetToManyRelated**](SubscriptionPromotionalOffersApi.md#subscriptionPromotionalOffersPricesGetToManyRelated) | **GET** /v1/subscriptionPromotionalOffers/{id}/prices |  |
| [**subscriptionPromotionalOffersUpdateInstance**](SubscriptionPromotionalOffersApi.md#subscriptionPromotionalOffersUpdateInstance) | **PATCH** /v1/subscriptionPromotionalOffers/{id} |  |



## subscriptionPromotionalOffersCreateInstance

> SubscriptionPromotionalOfferResponse subscriptionPromotionalOffersCreateInstance(subscriptionPromotionalOfferCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionPromotionalOffersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionPromotionalOffersApi apiInstance = new SubscriptionPromotionalOffersApi(defaultClient);
        SubscriptionPromotionalOfferCreateRequest subscriptionPromotionalOfferCreateRequest = new SubscriptionPromotionalOfferCreateRequest(); // SubscriptionPromotionalOfferCreateRequest | SubscriptionPromotionalOffer representation
        try {
            SubscriptionPromotionalOfferResponse result = apiInstance.subscriptionPromotionalOffersCreateInstance(subscriptionPromotionalOfferCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionPromotionalOffersApi#subscriptionPromotionalOffersCreateInstance");
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
| **subscriptionPromotionalOfferCreateRequest** | [**SubscriptionPromotionalOfferCreateRequest**](SubscriptionPromotionalOfferCreateRequest.md)| SubscriptionPromotionalOffer representation | |

### Return type

[**SubscriptionPromotionalOfferResponse**](SubscriptionPromotionalOfferResponse.md)

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
| **201** | Single SubscriptionPromotionalOffer |  -  |
| **409** | Request entity error(s) |  -  |


## subscriptionPromotionalOffersDeleteInstance

> subscriptionPromotionalOffersDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionPromotionalOffersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionPromotionalOffersApi apiInstance = new SubscriptionPromotionalOffersApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.subscriptionPromotionalOffersDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionPromotionalOffersApi#subscriptionPromotionalOffersDeleteInstance");
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


## subscriptionPromotionalOffersGetInstance

> SubscriptionPromotionalOfferResponse subscriptionPromotionalOffersGetInstance(id, fieldsSubscriptionPromotionalOffers, include, fieldsSubscriptionPromotionalOfferPrices, limitPrices)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionPromotionalOffersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionPromotionalOffersApi apiInstance = new SubscriptionPromotionalOffersApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsSubscriptionPromotionalOffers = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionPromotionalOffers
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsSubscriptionPromotionalOfferPrices = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionPromotionalOfferPrices
        Integer limitPrices = 56; // Integer | maximum number of related prices returned (when they are included)
        try {
            SubscriptionPromotionalOfferResponse result = apiInstance.subscriptionPromotionalOffersGetInstance(id, fieldsSubscriptionPromotionalOffers, include, fieldsSubscriptionPromotionalOfferPrices, limitPrices);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionPromotionalOffersApi#subscriptionPromotionalOffersGetInstance");
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
| **fieldsSubscriptionPromotionalOffers** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionPromotionalOffers | [optional] [enum: duration, name, numberOfPeriods, offerCode, offerMode, prices, subscription] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: prices, subscription] |
| **fieldsSubscriptionPromotionalOfferPrices** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionPromotionalOfferPrices | [optional] [enum: subscriptionPricePoint, territory] |
| **limitPrices** | **Integer**| maximum number of related prices returned (when they are included) | [optional] |

### Return type

[**SubscriptionPromotionalOfferResponse**](SubscriptionPromotionalOfferResponse.md)

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
| **200** | Single SubscriptionPromotionalOffer |  -  |


## subscriptionPromotionalOffersPricesGetToManyRelated

> SubscriptionPromotionalOfferPricesResponse subscriptionPromotionalOffersPricesGetToManyRelated(id, filterTerritory, fieldsSubscriptionPricePoints, fieldsTerritories, fieldsSubscriptionPromotionalOfferPrices, limit, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionPromotionalOffersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionPromotionalOffersApi apiInstance = new SubscriptionPromotionalOffersApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> filterTerritory = Arrays.asList(); // List<String> | filter by id(s) of related 'territory'
        List<String> fieldsSubscriptionPricePoints = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionPricePoints
        List<String> fieldsTerritories = Arrays.asList(); // List<String> | the fields to include for returned resources of type territories
        List<String> fieldsSubscriptionPromotionalOfferPrices = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionPromotionalOfferPrices
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            SubscriptionPromotionalOfferPricesResponse result = apiInstance.subscriptionPromotionalOffersPricesGetToManyRelated(id, filterTerritory, fieldsSubscriptionPricePoints, fieldsTerritories, fieldsSubscriptionPromotionalOfferPrices, limit, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionPromotionalOffersApi#subscriptionPromotionalOffersPricesGetToManyRelated");
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
| **filterTerritory** | **List&lt;String&gt;**| filter by id(s) of related &#39;territory&#39; | [optional] |
| **fieldsSubscriptionPricePoints** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionPricePoints | [optional] [enum: customerPrice, equalizations, proceeds, proceedsYear2, subscription, territory] |
| **fieldsTerritories** | **List&lt;String&gt;**| the fields to include for returned resources of type territories | [optional] [enum: currency] |
| **fieldsSubscriptionPromotionalOfferPrices** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionPromotionalOfferPrices | [optional] [enum: subscriptionPricePoint, territory] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: subscriptionPricePoint, territory] |

### Return type

[**SubscriptionPromotionalOfferPricesResponse**](SubscriptionPromotionalOfferPricesResponse.md)

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
| **200** | List of SubscriptionPromotionalOfferPrices |  -  |


## subscriptionPromotionalOffersUpdateInstance

> SubscriptionPromotionalOfferResponse subscriptionPromotionalOffersUpdateInstance(id, subscriptionPromotionalOfferUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionPromotionalOffersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionPromotionalOffersApi apiInstance = new SubscriptionPromotionalOffersApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        SubscriptionPromotionalOfferUpdateRequest subscriptionPromotionalOfferUpdateRequest = new SubscriptionPromotionalOfferUpdateRequest(); // SubscriptionPromotionalOfferUpdateRequest | SubscriptionPromotionalOffer representation
        try {
            SubscriptionPromotionalOfferResponse result = apiInstance.subscriptionPromotionalOffersUpdateInstance(id, subscriptionPromotionalOfferUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionPromotionalOffersApi#subscriptionPromotionalOffersUpdateInstance");
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
| **subscriptionPromotionalOfferUpdateRequest** | [**SubscriptionPromotionalOfferUpdateRequest**](SubscriptionPromotionalOfferUpdateRequest.md)| SubscriptionPromotionalOffer representation | |

### Return type

[**SubscriptionPromotionalOfferResponse**](SubscriptionPromotionalOfferResponse.md)

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
| **200** | Single SubscriptionPromotionalOffer |  -  |
| **409** | Request entity error(s) |  -  |

