# SubscriptionGroupsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**subscriptionGroupsCreateInstance**](SubscriptionGroupsApi.md#subscriptionGroupsCreateInstance) | **POST** /v1/subscriptionGroups |  |
| [**subscriptionGroupsDeleteInstance**](SubscriptionGroupsApi.md#subscriptionGroupsDeleteInstance) | **DELETE** /v1/subscriptionGroups/{id} |  |
| [**subscriptionGroupsGetInstance**](SubscriptionGroupsApi.md#subscriptionGroupsGetInstance) | **GET** /v1/subscriptionGroups/{id} |  |
| [**subscriptionGroupsSubscriptionGroupLocalizationsGetToManyRelated**](SubscriptionGroupsApi.md#subscriptionGroupsSubscriptionGroupLocalizationsGetToManyRelated) | **GET** /v1/subscriptionGroups/{id}/subscriptionGroupLocalizations |  |
| [**subscriptionGroupsSubscriptionsGetToManyRelated**](SubscriptionGroupsApi.md#subscriptionGroupsSubscriptionsGetToManyRelated) | **GET** /v1/subscriptionGroups/{id}/subscriptions |  |
| [**subscriptionGroupsUpdateInstance**](SubscriptionGroupsApi.md#subscriptionGroupsUpdateInstance) | **PATCH** /v1/subscriptionGroups/{id} |  |



## subscriptionGroupsCreateInstance

> SubscriptionGroupResponse subscriptionGroupsCreateInstance(subscriptionGroupCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionGroupsApi apiInstance = new SubscriptionGroupsApi(defaultClient);
        SubscriptionGroupCreateRequest subscriptionGroupCreateRequest = new SubscriptionGroupCreateRequest(); // SubscriptionGroupCreateRequest | SubscriptionGroup representation
        try {
            SubscriptionGroupResponse result = apiInstance.subscriptionGroupsCreateInstance(subscriptionGroupCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionGroupsApi#subscriptionGroupsCreateInstance");
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
| **subscriptionGroupCreateRequest** | [**SubscriptionGroupCreateRequest**](SubscriptionGroupCreateRequest.md)| SubscriptionGroup representation | |

### Return type

[**SubscriptionGroupResponse**](SubscriptionGroupResponse.md)

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
| **201** | Single SubscriptionGroup |  -  |
| **409** | Request entity error(s) |  -  |


## subscriptionGroupsDeleteInstance

> subscriptionGroupsDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionGroupsApi apiInstance = new SubscriptionGroupsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.subscriptionGroupsDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionGroupsApi#subscriptionGroupsDeleteInstance");
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


## subscriptionGroupsGetInstance

> SubscriptionGroupResponse subscriptionGroupsGetInstance(id, fieldsSubscriptionGroups, include, fieldsSubscriptions, fieldsSubscriptionGroupLocalizations, limitSubscriptionGroupLocalizations, limitSubscriptions)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionGroupsApi apiInstance = new SubscriptionGroupsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsSubscriptionGroups = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionGroups
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsSubscriptions = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptions
        List<String> fieldsSubscriptionGroupLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionGroupLocalizations
        Integer limitSubscriptionGroupLocalizations = 56; // Integer | maximum number of related subscriptionGroupLocalizations returned (when they are included)
        Integer limitSubscriptions = 56; // Integer | maximum number of related subscriptions returned (when they are included)
        try {
            SubscriptionGroupResponse result = apiInstance.subscriptionGroupsGetInstance(id, fieldsSubscriptionGroups, include, fieldsSubscriptions, fieldsSubscriptionGroupLocalizations, limitSubscriptionGroupLocalizations, limitSubscriptions);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionGroupsApi#subscriptionGroupsGetInstance");
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
| **fieldsSubscriptionGroups** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionGroups | [optional] [enum: app, referenceName, subscriptionGroupLocalizations, subscriptions] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: subscriptionGroupLocalizations, subscriptions] |
| **fieldsSubscriptions** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptions | [optional] [enum: appStoreReviewScreenshot, familySharable, group, groupLevel, introductoryOffers, name, offerCodes, pricePoints, prices, productId, promotedPurchase, promotionalOffers, reviewNote, state, subscriptionAvailability, subscriptionLocalizations, subscriptionPeriod] |
| **fieldsSubscriptionGroupLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionGroupLocalizations | [optional] [enum: customAppName, locale, name, state, subscriptionGroup] |
| **limitSubscriptionGroupLocalizations** | **Integer**| maximum number of related subscriptionGroupLocalizations returned (when they are included) | [optional] |
| **limitSubscriptions** | **Integer**| maximum number of related subscriptions returned (when they are included) | [optional] |

### Return type

[**SubscriptionGroupResponse**](SubscriptionGroupResponse.md)

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
| **200** | Single SubscriptionGroup |  -  |


## subscriptionGroupsSubscriptionGroupLocalizationsGetToManyRelated

> SubscriptionGroupLocalizationsResponse subscriptionGroupsSubscriptionGroupLocalizationsGetToManyRelated(id, fieldsSubscriptionGroups, fieldsSubscriptionGroupLocalizations, limit, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionGroupsApi apiInstance = new SubscriptionGroupsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsSubscriptionGroups = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionGroups
        List<String> fieldsSubscriptionGroupLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionGroupLocalizations
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            SubscriptionGroupLocalizationsResponse result = apiInstance.subscriptionGroupsSubscriptionGroupLocalizationsGetToManyRelated(id, fieldsSubscriptionGroups, fieldsSubscriptionGroupLocalizations, limit, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionGroupsApi#subscriptionGroupsSubscriptionGroupLocalizationsGetToManyRelated");
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
| **fieldsSubscriptionGroups** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionGroups | [optional] [enum: app, referenceName, subscriptionGroupLocalizations, subscriptions] |
| **fieldsSubscriptionGroupLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionGroupLocalizations | [optional] [enum: customAppName, locale, name, state, subscriptionGroup] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: subscriptionGroup] |

### Return type

[**SubscriptionGroupLocalizationsResponse**](SubscriptionGroupLocalizationsResponse.md)

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
| **200** | List of SubscriptionGroupLocalizations |  -  |


## subscriptionGroupsSubscriptionsGetToManyRelated

> SubscriptionsResponse subscriptionGroupsSubscriptionsGetToManyRelated(id, filterName, filterProductId, filterState, sort, fieldsPromotedPurchases, fieldsSubscriptionPromotionalOffers, fieldsSubscriptionOfferCodes, fieldsSubscriptionAppStoreReviewScreenshots, fieldsSubscriptions, fieldsSubscriptionAvailabilities, fieldsSubscriptionGroups, fieldsSubscriptionIntroductoryOffers, fieldsSubscriptionPrices, fieldsSubscriptionLocalizations, limit, limitSubscriptionLocalizations, limitIntroductoryOffers, limitPromotionalOffers, limitOfferCodes, limitPrices, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionGroupsApi apiInstance = new SubscriptionGroupsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> filterName = Arrays.asList(); // List<String> | filter by attribute 'name'
        List<String> filterProductId = Arrays.asList(); // List<String> | filter by attribute 'productId'
        List<String> filterState = Arrays.asList(); // List<String> | filter by attribute 'state'
        List<String> sort = Arrays.asList(); // List<String> | comma-separated list of sort expressions; resources will be sorted as specified
        List<String> fieldsPromotedPurchases = Arrays.asList(); // List<String> | the fields to include for returned resources of type promotedPurchases
        List<String> fieldsSubscriptionPromotionalOffers = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionPromotionalOffers
        List<String> fieldsSubscriptionOfferCodes = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionOfferCodes
        List<String> fieldsSubscriptionAppStoreReviewScreenshots = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionAppStoreReviewScreenshots
        List<String> fieldsSubscriptions = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptions
        List<String> fieldsSubscriptionAvailabilities = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionAvailabilities
        List<String> fieldsSubscriptionGroups = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionGroups
        List<String> fieldsSubscriptionIntroductoryOffers = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionIntroductoryOffers
        List<String> fieldsSubscriptionPrices = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionPrices
        List<String> fieldsSubscriptionLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionLocalizations
        Integer limit = 56; // Integer | maximum resources per page
        Integer limitSubscriptionLocalizations = 56; // Integer | maximum number of related subscriptionLocalizations returned (when they are included)
        Integer limitIntroductoryOffers = 56; // Integer | maximum number of related introductoryOffers returned (when they are included)
        Integer limitPromotionalOffers = 56; // Integer | maximum number of related promotionalOffers returned (when they are included)
        Integer limitOfferCodes = 56; // Integer | maximum number of related offerCodes returned (when they are included)
        Integer limitPrices = 56; // Integer | maximum number of related prices returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            SubscriptionsResponse result = apiInstance.subscriptionGroupsSubscriptionsGetToManyRelated(id, filterName, filterProductId, filterState, sort, fieldsPromotedPurchases, fieldsSubscriptionPromotionalOffers, fieldsSubscriptionOfferCodes, fieldsSubscriptionAppStoreReviewScreenshots, fieldsSubscriptions, fieldsSubscriptionAvailabilities, fieldsSubscriptionGroups, fieldsSubscriptionIntroductoryOffers, fieldsSubscriptionPrices, fieldsSubscriptionLocalizations, limit, limitSubscriptionLocalizations, limitIntroductoryOffers, limitPromotionalOffers, limitOfferCodes, limitPrices, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionGroupsApi#subscriptionGroupsSubscriptionsGetToManyRelated");
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
| **filterName** | **List&lt;String&gt;**| filter by attribute &#39;name&#39; | [optional] |
| **filterProductId** | **List&lt;String&gt;**| filter by attribute &#39;productId&#39; | [optional] |
| **filterState** | **List&lt;String&gt;**| filter by attribute &#39;state&#39; | [optional] [enum: MISSING_METADATA, READY_TO_SUBMIT, WAITING_FOR_REVIEW, IN_REVIEW, DEVELOPER_ACTION_NEEDED, PENDING_BINARY_APPROVAL, APPROVED, DEVELOPER_REMOVED_FROM_SALE, REMOVED_FROM_SALE, REJECTED] |
| **sort** | **List&lt;String&gt;**| comma-separated list of sort expressions; resources will be sorted as specified | [optional] [enum: name, -name] |
| **fieldsPromotedPurchases** | **List&lt;String&gt;**| the fields to include for returned resources of type promotedPurchases | [optional] [enum: app, enabled, inAppPurchaseV2, promotionImages, state, subscription, visibleForAllUsers] |
| **fieldsSubscriptionPromotionalOffers** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionPromotionalOffers | [optional] [enum: duration, name, numberOfPeriods, offerCode, offerMode, prices, subscription] |
| **fieldsSubscriptionOfferCodes** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionOfferCodes | [optional] [enum: active, customCodes, customerEligibilities, duration, name, numberOfPeriods, offerEligibility, offerMode, oneTimeUseCodes, prices, subscription, totalNumberOfCodes] |
| **fieldsSubscriptionAppStoreReviewScreenshots** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionAppStoreReviewScreenshots | [optional] [enum: assetDeliveryState, assetToken, assetType, fileName, fileSize, imageAsset, sourceFileChecksum, subscription, uploadOperations, uploaded] |
| **fieldsSubscriptions** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptions | [optional] [enum: appStoreReviewScreenshot, familySharable, group, groupLevel, introductoryOffers, name, offerCodes, pricePoints, prices, productId, promotedPurchase, promotionalOffers, reviewNote, state, subscriptionAvailability, subscriptionLocalizations, subscriptionPeriod] |
| **fieldsSubscriptionAvailabilities** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionAvailabilities | [optional] [enum: availableInNewTerritories, availableTerritories, subscription] |
| **fieldsSubscriptionGroups** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionGroups | [optional] [enum: app, referenceName, subscriptionGroupLocalizations, subscriptions] |
| **fieldsSubscriptionIntroductoryOffers** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionIntroductoryOffers | [optional] [enum: duration, endDate, numberOfPeriods, offerMode, startDate, subscription, subscriptionPricePoint, territory] |
| **fieldsSubscriptionPrices** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionPrices | [optional] [enum: preserveCurrentPrice, preserved, startDate, subscription, subscriptionPricePoint, territory] |
| **fieldsSubscriptionLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionLocalizations | [optional] [enum: description, locale, name, state, subscription] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **limitSubscriptionLocalizations** | **Integer**| maximum number of related subscriptionLocalizations returned (when they are included) | [optional] |
| **limitIntroductoryOffers** | **Integer**| maximum number of related introductoryOffers returned (when they are included) | [optional] |
| **limitPromotionalOffers** | **Integer**| maximum number of related promotionalOffers returned (when they are included) | [optional] |
| **limitOfferCodes** | **Integer**| maximum number of related offerCodes returned (when they are included) | [optional] |
| **limitPrices** | **Integer**| maximum number of related prices returned (when they are included) | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: appStoreReviewScreenshot, group, introductoryOffers, offerCodes, prices, promotedPurchase, promotionalOffers, subscriptionAvailability, subscriptionLocalizations] |

### Return type

[**SubscriptionsResponse**](SubscriptionsResponse.md)

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
| **200** | List of Subscriptions |  -  |


## subscriptionGroupsUpdateInstance

> SubscriptionGroupResponse subscriptionGroupsUpdateInstance(id, subscriptionGroupUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionGroupsApi apiInstance = new SubscriptionGroupsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        SubscriptionGroupUpdateRequest subscriptionGroupUpdateRequest = new SubscriptionGroupUpdateRequest(); // SubscriptionGroupUpdateRequest | SubscriptionGroup representation
        try {
            SubscriptionGroupResponse result = apiInstance.subscriptionGroupsUpdateInstance(id, subscriptionGroupUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionGroupsApi#subscriptionGroupsUpdateInstance");
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
| **subscriptionGroupUpdateRequest** | [**SubscriptionGroupUpdateRequest**](SubscriptionGroupUpdateRequest.md)| SubscriptionGroup representation | |

### Return type

[**SubscriptionGroupResponse**](SubscriptionGroupResponse.md)

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
| **200** | Single SubscriptionGroup |  -  |
| **409** | Request entity error(s) |  -  |

