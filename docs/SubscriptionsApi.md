# SubscriptionsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**subscriptionsAppStoreReviewScreenshotGetToOneRelated**](SubscriptionsApi.md#subscriptionsAppStoreReviewScreenshotGetToOneRelated) | **GET** /v1/subscriptions/{id}/appStoreReviewScreenshot |  |
| [**subscriptionsCreateInstance**](SubscriptionsApi.md#subscriptionsCreateInstance) | **POST** /v1/subscriptions |  |
| [**subscriptionsDeleteInstance**](SubscriptionsApi.md#subscriptionsDeleteInstance) | **DELETE** /v1/subscriptions/{id} |  |
| [**subscriptionsGetInstance**](SubscriptionsApi.md#subscriptionsGetInstance) | **GET** /v1/subscriptions/{id} |  |
| [**subscriptionsIntroductoryOffersDeleteToManyRelationship**](SubscriptionsApi.md#subscriptionsIntroductoryOffersDeleteToManyRelationship) | **DELETE** /v1/subscriptions/{id}/relationships/introductoryOffers |  |
| [**subscriptionsIntroductoryOffersGetToManyRelated**](SubscriptionsApi.md#subscriptionsIntroductoryOffersGetToManyRelated) | **GET** /v1/subscriptions/{id}/introductoryOffers |  |
| [**subscriptionsIntroductoryOffersGetToManyRelationship**](SubscriptionsApi.md#subscriptionsIntroductoryOffersGetToManyRelationship) | **GET** /v1/subscriptions/{id}/relationships/introductoryOffers |  |
| [**subscriptionsOfferCodesGetToManyRelated**](SubscriptionsApi.md#subscriptionsOfferCodesGetToManyRelated) | **GET** /v1/subscriptions/{id}/offerCodes |  |
| [**subscriptionsPricePointsGetToManyRelated**](SubscriptionsApi.md#subscriptionsPricePointsGetToManyRelated) | **GET** /v1/subscriptions/{id}/pricePoints |  |
| [**subscriptionsPricesDeleteToManyRelationship**](SubscriptionsApi.md#subscriptionsPricesDeleteToManyRelationship) | **DELETE** /v1/subscriptions/{id}/relationships/prices |  |
| [**subscriptionsPricesGetToManyRelated**](SubscriptionsApi.md#subscriptionsPricesGetToManyRelated) | **GET** /v1/subscriptions/{id}/prices |  |
| [**subscriptionsPricesGetToManyRelationship**](SubscriptionsApi.md#subscriptionsPricesGetToManyRelationship) | **GET** /v1/subscriptions/{id}/relationships/prices |  |
| [**subscriptionsPromotedPurchaseGetToOneRelated**](SubscriptionsApi.md#subscriptionsPromotedPurchaseGetToOneRelated) | **GET** /v1/subscriptions/{id}/promotedPurchase |  |
| [**subscriptionsPromotionalOffersGetToManyRelated**](SubscriptionsApi.md#subscriptionsPromotionalOffersGetToManyRelated) | **GET** /v1/subscriptions/{id}/promotionalOffers |  |
| [**subscriptionsSubscriptionAvailabilityGetToOneRelated**](SubscriptionsApi.md#subscriptionsSubscriptionAvailabilityGetToOneRelated) | **GET** /v1/subscriptions/{id}/subscriptionAvailability |  |
| [**subscriptionsSubscriptionLocalizationsGetToManyRelated**](SubscriptionsApi.md#subscriptionsSubscriptionLocalizationsGetToManyRelated) | **GET** /v1/subscriptions/{id}/subscriptionLocalizations |  |
| [**subscriptionsUpdateInstance**](SubscriptionsApi.md#subscriptionsUpdateInstance) | **PATCH** /v1/subscriptions/{id} |  |



## subscriptionsAppStoreReviewScreenshotGetToOneRelated

> SubscriptionAppStoreReviewScreenshotResponse subscriptionsAppStoreReviewScreenshotGetToOneRelated(id, fieldsSubscriptionAppStoreReviewScreenshots, fieldsSubscriptions, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsSubscriptionAppStoreReviewScreenshots = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionAppStoreReviewScreenshots
        List<String> fieldsSubscriptions = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptions
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            SubscriptionAppStoreReviewScreenshotResponse result = apiInstance.subscriptionsAppStoreReviewScreenshotGetToOneRelated(id, fieldsSubscriptionAppStoreReviewScreenshots, fieldsSubscriptions, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionsApi#subscriptionsAppStoreReviewScreenshotGetToOneRelated");
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
| **fieldsSubscriptionAppStoreReviewScreenshots** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionAppStoreReviewScreenshots | [optional] [enum: assetDeliveryState, assetToken, assetType, fileName, fileSize, imageAsset, sourceFileChecksum, subscription, uploadOperations, uploaded] |
| **fieldsSubscriptions** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptions | [optional] [enum: appStoreReviewScreenshot, familySharable, group, groupLevel, introductoryOffers, name, offerCodes, pricePoints, prices, productId, promotedPurchase, promotionalOffers, reviewNote, state, subscriptionAvailability, subscriptionLocalizations, subscriptionPeriod] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: subscription] |

### Return type

[**SubscriptionAppStoreReviewScreenshotResponse**](SubscriptionAppStoreReviewScreenshotResponse.md)

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
| **200** | Single SubscriptionAppStoreReviewScreenshot |  -  |


## subscriptionsCreateInstance

> SubscriptionResponse subscriptionsCreateInstance(subscriptionCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
        SubscriptionCreateRequest subscriptionCreateRequest = new SubscriptionCreateRequest(); // SubscriptionCreateRequest | Subscription representation
        try {
            SubscriptionResponse result = apiInstance.subscriptionsCreateInstance(subscriptionCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionsApi#subscriptionsCreateInstance");
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
| **subscriptionCreateRequest** | [**SubscriptionCreateRequest**](SubscriptionCreateRequest.md)| Subscription representation | |

### Return type

[**SubscriptionResponse**](SubscriptionResponse.md)

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
| **201** | Single Subscription |  -  |
| **409** | Request entity error(s) |  -  |


## subscriptionsDeleteInstance

> subscriptionsDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.subscriptionsDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionsApi#subscriptionsDeleteInstance");
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


## subscriptionsGetInstance

> SubscriptionResponse subscriptionsGetInstance(id, fieldsSubscriptions, include, fieldsPromotedPurchases, fieldsSubscriptionPricePoints, fieldsSubscriptionPromotionalOffers, fieldsSubscriptionOfferCodes, fieldsSubscriptionAppStoreReviewScreenshots, fieldsSubscriptionAvailabilities, fieldsSubscriptionPrices, fieldsSubscriptionIntroductoryOffers, fieldsSubscriptionLocalizations, limitIntroductoryOffers, limitOfferCodes, limitPrices, limitPromotionalOffers, limitSubscriptionLocalizations)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsSubscriptions = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptions
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsPromotedPurchases = Arrays.asList(); // List<String> | the fields to include for returned resources of type promotedPurchases
        List<String> fieldsSubscriptionPricePoints = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionPricePoints
        List<String> fieldsSubscriptionPromotionalOffers = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionPromotionalOffers
        List<String> fieldsSubscriptionOfferCodes = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionOfferCodes
        List<String> fieldsSubscriptionAppStoreReviewScreenshots = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionAppStoreReviewScreenshots
        List<String> fieldsSubscriptionAvailabilities = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionAvailabilities
        List<String> fieldsSubscriptionPrices = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionPrices
        List<String> fieldsSubscriptionIntroductoryOffers = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionIntroductoryOffers
        List<String> fieldsSubscriptionLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionLocalizations
        Integer limitIntroductoryOffers = 56; // Integer | maximum number of related introductoryOffers returned (when they are included)
        Integer limitOfferCodes = 56; // Integer | maximum number of related offerCodes returned (when they are included)
        Integer limitPrices = 56; // Integer | maximum number of related prices returned (when they are included)
        Integer limitPromotionalOffers = 56; // Integer | maximum number of related promotionalOffers returned (when they are included)
        Integer limitSubscriptionLocalizations = 56; // Integer | maximum number of related subscriptionLocalizations returned (when they are included)
        try {
            SubscriptionResponse result = apiInstance.subscriptionsGetInstance(id, fieldsSubscriptions, include, fieldsPromotedPurchases, fieldsSubscriptionPricePoints, fieldsSubscriptionPromotionalOffers, fieldsSubscriptionOfferCodes, fieldsSubscriptionAppStoreReviewScreenshots, fieldsSubscriptionAvailabilities, fieldsSubscriptionPrices, fieldsSubscriptionIntroductoryOffers, fieldsSubscriptionLocalizations, limitIntroductoryOffers, limitOfferCodes, limitPrices, limitPromotionalOffers, limitSubscriptionLocalizations);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionsApi#subscriptionsGetInstance");
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
| **fieldsSubscriptions** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptions | [optional] [enum: appStoreReviewScreenshot, familySharable, group, groupLevel, introductoryOffers, name, offerCodes, pricePoints, prices, productId, promotedPurchase, promotionalOffers, reviewNote, state, subscriptionAvailability, subscriptionLocalizations, subscriptionPeriod] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: appStoreReviewScreenshot, group, introductoryOffers, offerCodes, prices, promotedPurchase, promotionalOffers, subscriptionAvailability, subscriptionLocalizations] |
| **fieldsPromotedPurchases** | **List&lt;String&gt;**| the fields to include for returned resources of type promotedPurchases | [optional] [enum: app, enabled, inAppPurchaseV2, promotionImages, state, subscription, visibleForAllUsers] |
| **fieldsSubscriptionPricePoints** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionPricePoints | [optional] [enum: customerPrice, equalizations, proceeds, proceedsYear2, subscription, territory] |
| **fieldsSubscriptionPromotionalOffers** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionPromotionalOffers | [optional] [enum: duration, name, numberOfPeriods, offerCode, offerMode, prices, subscription] |
| **fieldsSubscriptionOfferCodes** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionOfferCodes | [optional] [enum: active, customCodes, customerEligibilities, duration, name, numberOfPeriods, offerEligibility, offerMode, oneTimeUseCodes, prices, subscription, totalNumberOfCodes] |
| **fieldsSubscriptionAppStoreReviewScreenshots** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionAppStoreReviewScreenshots | [optional] [enum: assetDeliveryState, assetToken, assetType, fileName, fileSize, imageAsset, sourceFileChecksum, subscription, uploadOperations, uploaded] |
| **fieldsSubscriptionAvailabilities** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionAvailabilities | [optional] [enum: availableInNewTerritories, availableTerritories, subscription] |
| **fieldsSubscriptionPrices** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionPrices | [optional] [enum: preserveCurrentPrice, preserved, startDate, subscription, subscriptionPricePoint, territory] |
| **fieldsSubscriptionIntroductoryOffers** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionIntroductoryOffers | [optional] [enum: duration, endDate, numberOfPeriods, offerMode, startDate, subscription, subscriptionPricePoint, territory] |
| **fieldsSubscriptionLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionLocalizations | [optional] [enum: description, locale, name, state, subscription] |
| **limitIntroductoryOffers** | **Integer**| maximum number of related introductoryOffers returned (when they are included) | [optional] |
| **limitOfferCodes** | **Integer**| maximum number of related offerCodes returned (when they are included) | [optional] |
| **limitPrices** | **Integer**| maximum number of related prices returned (when they are included) | [optional] |
| **limitPromotionalOffers** | **Integer**| maximum number of related promotionalOffers returned (when they are included) | [optional] |
| **limitSubscriptionLocalizations** | **Integer**| maximum number of related subscriptionLocalizations returned (when they are included) | [optional] |

### Return type

[**SubscriptionResponse**](SubscriptionResponse.md)

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
| **200** | Single Subscription |  -  |


## subscriptionsIntroductoryOffersDeleteToManyRelationship

> subscriptionsIntroductoryOffersDeleteToManyRelationship(id, subscriptionIntroductoryOffersLinkagesRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        SubscriptionIntroductoryOffersLinkagesRequest subscriptionIntroductoryOffersLinkagesRequest = new SubscriptionIntroductoryOffersLinkagesRequest(); // SubscriptionIntroductoryOffersLinkagesRequest | List of related linkages
        try {
            apiInstance.subscriptionsIntroductoryOffersDeleteToManyRelationship(id, subscriptionIntroductoryOffersLinkagesRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionsApi#subscriptionsIntroductoryOffersDeleteToManyRelationship");
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
| **subscriptionIntroductoryOffersLinkagesRequest** | [**SubscriptionIntroductoryOffersLinkagesRequest**](SubscriptionIntroductoryOffersLinkagesRequest.md)| List of related linkages | |

### Return type

null (empty response body)

### Authorization

[itc-bearer-token](../README.md#itc-bearer-token)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | Unauthorized error(s) |  -  |
| **403** | Forbidden error |  -  |
| **404** | Not found error |  -  |
| **422** | Unprocessable request entity error(s) |  -  |
| **409** | Request entity error(s) |  -  |
| **204** | Success (no content) |  -  |


## subscriptionsIntroductoryOffersGetToManyRelated

> SubscriptionIntroductoryOffersResponse subscriptionsIntroductoryOffersGetToManyRelated(id, filterTerritory, fieldsSubscriptionPricePoints, fieldsSubscriptions, fieldsSubscriptionIntroductoryOffers, fieldsTerritories, limit, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> filterTerritory = Arrays.asList(); // List<String> | filter by id(s) of related 'territory'
        List<String> fieldsSubscriptionPricePoints = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionPricePoints
        List<String> fieldsSubscriptions = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptions
        List<String> fieldsSubscriptionIntroductoryOffers = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionIntroductoryOffers
        List<String> fieldsTerritories = Arrays.asList(); // List<String> | the fields to include for returned resources of type territories
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            SubscriptionIntroductoryOffersResponse result = apiInstance.subscriptionsIntroductoryOffersGetToManyRelated(id, filterTerritory, fieldsSubscriptionPricePoints, fieldsSubscriptions, fieldsSubscriptionIntroductoryOffers, fieldsTerritories, limit, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionsApi#subscriptionsIntroductoryOffersGetToManyRelated");
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
| **fieldsSubscriptions** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptions | [optional] [enum: appStoreReviewScreenshot, familySharable, group, groupLevel, introductoryOffers, name, offerCodes, pricePoints, prices, productId, promotedPurchase, promotionalOffers, reviewNote, state, subscriptionAvailability, subscriptionLocalizations, subscriptionPeriod] |
| **fieldsSubscriptionIntroductoryOffers** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionIntroductoryOffers | [optional] [enum: duration, endDate, numberOfPeriods, offerMode, startDate, subscription, subscriptionPricePoint, territory] |
| **fieldsTerritories** | **List&lt;String&gt;**| the fields to include for returned resources of type territories | [optional] [enum: currency] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: subscription, subscriptionPricePoint, territory] |

### Return type

[**SubscriptionIntroductoryOffersResponse**](SubscriptionIntroductoryOffersResponse.md)

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
| **200** | List of SubscriptionIntroductoryOffers |  -  |


## subscriptionsIntroductoryOffersGetToManyRelationship

> SubscriptionIntroductoryOffersLinkagesResponse subscriptionsIntroductoryOffersGetToManyRelationship(id, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        Integer limit = 56; // Integer | maximum resources per page
        try {
            SubscriptionIntroductoryOffersLinkagesResponse result = apiInstance.subscriptionsIntroductoryOffersGetToManyRelationship(id, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionsApi#subscriptionsIntroductoryOffersGetToManyRelationship");
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

[**SubscriptionIntroductoryOffersLinkagesResponse**](SubscriptionIntroductoryOffersLinkagesResponse.md)

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
| **200** | List of related linkages |  -  |


## subscriptionsOfferCodesGetToManyRelated

> SubscriptionOfferCodesResponse subscriptionsOfferCodesGetToManyRelated(id, filterTerritory, fieldsSubscriptionOfferCodeCustomCodes, fieldsSubscriptionOfferCodes, fieldsSubscriptionOfferCodeOneTimeUseCodes, fieldsSubscriptions, fieldsSubscriptionOfferCodePrices, limit, limitOneTimeUseCodes, limitCustomCodes, limitPrices, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> filterTerritory = Arrays.asList(); // List<String> | filter by territory
        List<String> fieldsSubscriptionOfferCodeCustomCodes = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionOfferCodeCustomCodes
        List<String> fieldsSubscriptionOfferCodes = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionOfferCodes
        List<String> fieldsSubscriptionOfferCodeOneTimeUseCodes = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionOfferCodeOneTimeUseCodes
        List<String> fieldsSubscriptions = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptions
        List<String> fieldsSubscriptionOfferCodePrices = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionOfferCodePrices
        Integer limit = 56; // Integer | maximum resources per page
        Integer limitOneTimeUseCodes = 56; // Integer | maximum number of related oneTimeUseCodes returned (when they are included)
        Integer limitCustomCodes = 56; // Integer | maximum number of related customCodes returned (when they are included)
        Integer limitPrices = 56; // Integer | maximum number of related prices returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            SubscriptionOfferCodesResponse result = apiInstance.subscriptionsOfferCodesGetToManyRelated(id, filterTerritory, fieldsSubscriptionOfferCodeCustomCodes, fieldsSubscriptionOfferCodes, fieldsSubscriptionOfferCodeOneTimeUseCodes, fieldsSubscriptions, fieldsSubscriptionOfferCodePrices, limit, limitOneTimeUseCodes, limitCustomCodes, limitPrices, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionsApi#subscriptionsOfferCodesGetToManyRelated");
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
| **filterTerritory** | **List&lt;String&gt;**| filter by territory | [optional] |
| **fieldsSubscriptionOfferCodeCustomCodes** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionOfferCodeCustomCodes | [optional] [enum: active, createdDate, customCode, expirationDate, numberOfCodes, offerCode] |
| **fieldsSubscriptionOfferCodes** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionOfferCodes | [optional] [enum: active, customCodes, customerEligibilities, duration, name, numberOfPeriods, offerEligibility, offerMode, oneTimeUseCodes, prices, subscription, totalNumberOfCodes] |
| **fieldsSubscriptionOfferCodeOneTimeUseCodes** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionOfferCodeOneTimeUseCodes | [optional] [enum: active, createdDate, expirationDate, numberOfCodes, offerCode, values] |
| **fieldsSubscriptions** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptions | [optional] [enum: appStoreReviewScreenshot, familySharable, group, groupLevel, introductoryOffers, name, offerCodes, pricePoints, prices, productId, promotedPurchase, promotionalOffers, reviewNote, state, subscriptionAvailability, subscriptionLocalizations, subscriptionPeriod] |
| **fieldsSubscriptionOfferCodePrices** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionOfferCodePrices | [optional] [enum: subscriptionPricePoint, territory] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **limitOneTimeUseCodes** | **Integer**| maximum number of related oneTimeUseCodes returned (when they are included) | [optional] |
| **limitCustomCodes** | **Integer**| maximum number of related customCodes returned (when they are included) | [optional] |
| **limitPrices** | **Integer**| maximum number of related prices returned (when they are included) | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: customCodes, oneTimeUseCodes, prices, subscription] |

### Return type

[**SubscriptionOfferCodesResponse**](SubscriptionOfferCodesResponse.md)

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
| **200** | List of SubscriptionOfferCodes |  -  |


## subscriptionsPricePointsGetToManyRelated

> SubscriptionPricePointsResponse subscriptionsPricePointsGetToManyRelated(id, filterTerritory, fieldsSubscriptionPricePoints, fieldsTerritories, limit, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> filterTerritory = Arrays.asList(); // List<String> | filter by id(s) of related 'territory'
        List<String> fieldsSubscriptionPricePoints = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionPricePoints
        List<String> fieldsTerritories = Arrays.asList(); // List<String> | the fields to include for returned resources of type territories
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            SubscriptionPricePointsResponse result = apiInstance.subscriptionsPricePointsGetToManyRelated(id, filterTerritory, fieldsSubscriptionPricePoints, fieldsTerritories, limit, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionsApi#subscriptionsPricePointsGetToManyRelated");
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
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: territory] |

### Return type

[**SubscriptionPricePointsResponse**](SubscriptionPricePointsResponse.md)

### Authorization

[itc-bearer-token](../README.md#itc-bearer-token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Parameter error(s) |  -  |
| **401** | Unauthorized error(s) |  -  |
| **403** | Forbidden error |  -  |
| **404** | Not found error |  -  |
| **200** | List of SubscriptionPricePoints |  -  |


## subscriptionsPricesDeleteToManyRelationship

> subscriptionsPricesDeleteToManyRelationship(id, subscriptionPricesLinkagesRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        SubscriptionPricesLinkagesRequest subscriptionPricesLinkagesRequest = new SubscriptionPricesLinkagesRequest(); // SubscriptionPricesLinkagesRequest | List of related linkages
        try {
            apiInstance.subscriptionsPricesDeleteToManyRelationship(id, subscriptionPricesLinkagesRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionsApi#subscriptionsPricesDeleteToManyRelationship");
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
| **subscriptionPricesLinkagesRequest** | [**SubscriptionPricesLinkagesRequest**](SubscriptionPricesLinkagesRequest.md)| List of related linkages | |

### Return type

null (empty response body)

### Authorization

[itc-bearer-token](../README.md#itc-bearer-token)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | Unauthorized error(s) |  -  |
| **403** | Forbidden error |  -  |
| **404** | Not found error |  -  |
| **422** | Unprocessable request entity error(s) |  -  |
| **409** | Request entity error(s) |  -  |
| **204** | Success (no content) |  -  |


## subscriptionsPricesGetToManyRelated

> SubscriptionPricesResponse subscriptionsPricesGetToManyRelated(id, filterSubscriptionPricePoint, filterTerritory, fieldsSubscriptionPricePoints, fieldsSubscriptionPrices, fieldsTerritories, limit, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> filterSubscriptionPricePoint = Arrays.asList(); // List<String> | filter by id(s) of related 'subscriptionPricePoint'
        List<String> filterTerritory = Arrays.asList(); // List<String> | filter by id(s) of related 'territory'
        List<String> fieldsSubscriptionPricePoints = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionPricePoints
        List<String> fieldsSubscriptionPrices = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionPrices
        List<String> fieldsTerritories = Arrays.asList(); // List<String> | the fields to include for returned resources of type territories
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            SubscriptionPricesResponse result = apiInstance.subscriptionsPricesGetToManyRelated(id, filterSubscriptionPricePoint, filterTerritory, fieldsSubscriptionPricePoints, fieldsSubscriptionPrices, fieldsTerritories, limit, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionsApi#subscriptionsPricesGetToManyRelated");
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
| **filterSubscriptionPricePoint** | **List&lt;String&gt;**| filter by id(s) of related &#39;subscriptionPricePoint&#39; | [optional] |
| **filterTerritory** | **List&lt;String&gt;**| filter by id(s) of related &#39;territory&#39; | [optional] |
| **fieldsSubscriptionPricePoints** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionPricePoints | [optional] [enum: customerPrice, equalizations, proceeds, proceedsYear2, subscription, territory] |
| **fieldsSubscriptionPrices** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionPrices | [optional] [enum: preserveCurrentPrice, preserved, startDate, subscription, subscriptionPricePoint, territory] |
| **fieldsTerritories** | **List&lt;String&gt;**| the fields to include for returned resources of type territories | [optional] [enum: currency] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: subscriptionPricePoint, territory] |

### Return type

[**SubscriptionPricesResponse**](SubscriptionPricesResponse.md)

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
| **200** | List of SubscriptionPrices |  -  |


## subscriptionsPricesGetToManyRelationship

> SubscriptionPricesLinkagesResponse subscriptionsPricesGetToManyRelationship(id, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        Integer limit = 56; // Integer | maximum resources per page
        try {
            SubscriptionPricesLinkagesResponse result = apiInstance.subscriptionsPricesGetToManyRelationship(id, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionsApi#subscriptionsPricesGetToManyRelationship");
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

[**SubscriptionPricesLinkagesResponse**](SubscriptionPricesLinkagesResponse.md)

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
| **200** | List of related linkages |  -  |


## subscriptionsPromotedPurchaseGetToOneRelated

> PromotedPurchaseResponse subscriptionsPromotedPurchaseGetToOneRelated(id, fieldsPromotedPurchases, fieldsSubscriptions, fieldsInAppPurchases, fieldsPromotedPurchaseImages, limitPromotionImages, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsPromotedPurchases = Arrays.asList(); // List<String> | the fields to include for returned resources of type promotedPurchases
        List<String> fieldsSubscriptions = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptions
        List<String> fieldsInAppPurchases = Arrays.asList(); // List<String> | the fields to include for returned resources of type inAppPurchases
        List<String> fieldsPromotedPurchaseImages = Arrays.asList(); // List<String> | the fields to include for returned resources of type promotedPurchaseImages
        Integer limitPromotionImages = 56; // Integer | maximum number of related promotionImages returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            PromotedPurchaseResponse result = apiInstance.subscriptionsPromotedPurchaseGetToOneRelated(id, fieldsPromotedPurchases, fieldsSubscriptions, fieldsInAppPurchases, fieldsPromotedPurchaseImages, limitPromotionImages, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionsApi#subscriptionsPromotedPurchaseGetToOneRelated");
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
| **fieldsPromotedPurchases** | **List&lt;String&gt;**| the fields to include for returned resources of type promotedPurchases | [optional] [enum: app, enabled, inAppPurchaseV2, promotionImages, state, subscription, visibleForAllUsers] |
| **fieldsSubscriptions** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptions | [optional] [enum: appStoreReviewScreenshot, familySharable, group, groupLevel, introductoryOffers, name, offerCodes, pricePoints, prices, productId, promotedPurchase, promotionalOffers, reviewNote, state, subscriptionAvailability, subscriptionLocalizations, subscriptionPeriod] |
| **fieldsInAppPurchases** | **List&lt;String&gt;**| the fields to include for returned resources of type inAppPurchases | [optional] [enum: app, appStoreReviewScreenshot, content, contentHosting, familySharable, iapPriceSchedule, inAppPurchaseAvailability, inAppPurchaseLocalizations, inAppPurchaseType, name, pricePoints, productId, promotedPurchase, reviewNote, state] |
| **fieldsPromotedPurchaseImages** | **List&lt;String&gt;**| the fields to include for returned resources of type promotedPurchaseImages | [optional] [enum: assetToken, assetType, fileName, fileSize, imageAsset, promotedPurchase, sourceFileChecksum, state, uploadOperations, uploaded] |
| **limitPromotionImages** | **Integer**| maximum number of related promotionImages returned (when they are included) | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: inAppPurchaseV2, promotionImages, subscription] |

### Return type

[**PromotedPurchaseResponse**](PromotedPurchaseResponse.md)

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
| **200** | Single PromotedPurchase |  -  |


## subscriptionsPromotionalOffersGetToManyRelated

> SubscriptionPromotionalOffersResponse subscriptionsPromotionalOffersGetToManyRelated(id, filterTerritory, fieldsSubscriptionPromotionalOffers, fieldsSubscriptions, fieldsSubscriptionPromotionalOfferPrices, limit, limitPrices, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> filterTerritory = Arrays.asList(); // List<String> | filter by territory
        List<String> fieldsSubscriptionPromotionalOffers = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionPromotionalOffers
        List<String> fieldsSubscriptions = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptions
        List<String> fieldsSubscriptionPromotionalOfferPrices = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionPromotionalOfferPrices
        Integer limit = 56; // Integer | maximum resources per page
        Integer limitPrices = 56; // Integer | maximum number of related prices returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            SubscriptionPromotionalOffersResponse result = apiInstance.subscriptionsPromotionalOffersGetToManyRelated(id, filterTerritory, fieldsSubscriptionPromotionalOffers, fieldsSubscriptions, fieldsSubscriptionPromotionalOfferPrices, limit, limitPrices, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionsApi#subscriptionsPromotionalOffersGetToManyRelated");
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
| **filterTerritory** | **List&lt;String&gt;**| filter by territory | [optional] |
| **fieldsSubscriptionPromotionalOffers** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionPromotionalOffers | [optional] [enum: duration, name, numberOfPeriods, offerCode, offerMode, prices, subscription] |
| **fieldsSubscriptions** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptions | [optional] [enum: appStoreReviewScreenshot, familySharable, group, groupLevel, introductoryOffers, name, offerCodes, pricePoints, prices, productId, promotedPurchase, promotionalOffers, reviewNote, state, subscriptionAvailability, subscriptionLocalizations, subscriptionPeriod] |
| **fieldsSubscriptionPromotionalOfferPrices** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionPromotionalOfferPrices | [optional] [enum: subscriptionPricePoint, territory] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **limitPrices** | **Integer**| maximum number of related prices returned (when they are included) | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: prices, subscription] |

### Return type

[**SubscriptionPromotionalOffersResponse**](SubscriptionPromotionalOffersResponse.md)

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
| **200** | List of SubscriptionPromotionalOffers |  -  |


## subscriptionsSubscriptionAvailabilityGetToOneRelated

> SubscriptionAvailabilityResponse subscriptionsSubscriptionAvailabilityGetToOneRelated(id, fieldsSubscriptionAvailabilities, fieldsSubscriptions, fieldsTerritories, limitAvailableTerritories, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsSubscriptionAvailabilities = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionAvailabilities
        List<String> fieldsSubscriptions = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptions
        List<String> fieldsTerritories = Arrays.asList(); // List<String> | the fields to include for returned resources of type territories
        Integer limitAvailableTerritories = 56; // Integer | maximum number of related availableTerritories returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            SubscriptionAvailabilityResponse result = apiInstance.subscriptionsSubscriptionAvailabilityGetToOneRelated(id, fieldsSubscriptionAvailabilities, fieldsSubscriptions, fieldsTerritories, limitAvailableTerritories, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionsApi#subscriptionsSubscriptionAvailabilityGetToOneRelated");
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
| **fieldsSubscriptionAvailabilities** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionAvailabilities | [optional] [enum: availableInNewTerritories, availableTerritories, subscription] |
| **fieldsSubscriptions** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptions | [optional] [enum: appStoreReviewScreenshot, familySharable, group, groupLevel, introductoryOffers, name, offerCodes, pricePoints, prices, productId, promotedPurchase, promotionalOffers, reviewNote, state, subscriptionAvailability, subscriptionLocalizations, subscriptionPeriod] |
| **fieldsTerritories** | **List&lt;String&gt;**| the fields to include for returned resources of type territories | [optional] [enum: currency] |
| **limitAvailableTerritories** | **Integer**| maximum number of related availableTerritories returned (when they are included) | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: availableTerritories, subscription] |

### Return type

[**SubscriptionAvailabilityResponse**](SubscriptionAvailabilityResponse.md)

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
| **200** | Single SubscriptionAvailability |  -  |


## subscriptionsSubscriptionLocalizationsGetToManyRelated

> SubscriptionLocalizationsResponse subscriptionsSubscriptionLocalizationsGetToManyRelated(id, fieldsSubscriptions, fieldsSubscriptionLocalizations, limit, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsSubscriptions = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptions
        List<String> fieldsSubscriptionLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionLocalizations
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            SubscriptionLocalizationsResponse result = apiInstance.subscriptionsSubscriptionLocalizationsGetToManyRelated(id, fieldsSubscriptions, fieldsSubscriptionLocalizations, limit, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionsApi#subscriptionsSubscriptionLocalizationsGetToManyRelated");
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
| **fieldsSubscriptions** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptions | [optional] [enum: appStoreReviewScreenshot, familySharable, group, groupLevel, introductoryOffers, name, offerCodes, pricePoints, prices, productId, promotedPurchase, promotionalOffers, reviewNote, state, subscriptionAvailability, subscriptionLocalizations, subscriptionPeriod] |
| **fieldsSubscriptionLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionLocalizations | [optional] [enum: description, locale, name, state, subscription] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: subscription] |

### Return type

[**SubscriptionLocalizationsResponse**](SubscriptionLocalizationsResponse.md)

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
| **200** | List of SubscriptionLocalizations |  -  |


## subscriptionsUpdateInstance

> SubscriptionResponse subscriptionsUpdateInstance(id, subscriptionUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        SubscriptionUpdateRequest subscriptionUpdateRequest = new SubscriptionUpdateRequest(); // SubscriptionUpdateRequest | Subscription representation
        try {
            SubscriptionResponse result = apiInstance.subscriptionsUpdateInstance(id, subscriptionUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionsApi#subscriptionsUpdateInstance");
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
| **subscriptionUpdateRequest** | [**SubscriptionUpdateRequest**](SubscriptionUpdateRequest.md)| Subscription representation | |

### Return type

[**SubscriptionResponse**](SubscriptionResponse.md)

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
| **200** | Single Subscription |  -  |
| **409** | Request entity error(s) |  -  |

