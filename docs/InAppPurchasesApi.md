# InAppPurchasesApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**inAppPurchasesGetInstance**](InAppPurchasesApi.md#inAppPurchasesGetInstance) | **GET** /v1/inAppPurchases/{id} |  |
| [**inAppPurchasesV2AppStoreReviewScreenshotGetToOneRelated**](InAppPurchasesApi.md#inAppPurchasesV2AppStoreReviewScreenshotGetToOneRelated) | **GET** /v2/inAppPurchases/{id}/appStoreReviewScreenshot |  |
| [**inAppPurchasesV2ContentGetToOneRelated**](InAppPurchasesApi.md#inAppPurchasesV2ContentGetToOneRelated) | **GET** /v2/inAppPurchases/{id}/content |  |
| [**inAppPurchasesV2CreateInstance**](InAppPurchasesApi.md#inAppPurchasesV2CreateInstance) | **POST** /v2/inAppPurchases |  |
| [**inAppPurchasesV2DeleteInstance**](InAppPurchasesApi.md#inAppPurchasesV2DeleteInstance) | **DELETE** /v2/inAppPurchases/{id} |  |
| [**inAppPurchasesV2GetInstance**](InAppPurchasesApi.md#inAppPurchasesV2GetInstance) | **GET** /v2/inAppPurchases/{id} |  |
| [**inAppPurchasesV2IapPriceScheduleGetToOneRelated**](InAppPurchasesApi.md#inAppPurchasesV2IapPriceScheduleGetToOneRelated) | **GET** /v2/inAppPurchases/{id}/iapPriceSchedule |  |
| [**inAppPurchasesV2InAppPurchaseAvailabilityGetToOneRelated**](InAppPurchasesApi.md#inAppPurchasesV2InAppPurchaseAvailabilityGetToOneRelated) | **GET** /v2/inAppPurchases/{id}/inAppPurchaseAvailability |  |
| [**inAppPurchasesV2InAppPurchaseLocalizationsGetToManyRelated**](InAppPurchasesApi.md#inAppPurchasesV2InAppPurchaseLocalizationsGetToManyRelated) | **GET** /v2/inAppPurchases/{id}/inAppPurchaseLocalizations |  |
| [**inAppPurchasesV2PricePointsGetToManyRelated**](InAppPurchasesApi.md#inAppPurchasesV2PricePointsGetToManyRelated) | **GET** /v2/inAppPurchases/{id}/pricePoints |  |
| [**inAppPurchasesV2PromotedPurchaseGetToOneRelated**](InAppPurchasesApi.md#inAppPurchasesV2PromotedPurchaseGetToOneRelated) | **GET** /v2/inAppPurchases/{id}/promotedPurchase |  |
| [**inAppPurchasesV2UpdateInstance**](InAppPurchasesApi.md#inAppPurchasesV2UpdateInstance) | **PATCH** /v2/inAppPurchases/{id} |  |



## inAppPurchasesGetInstance

> InAppPurchaseResponse inAppPurchasesGetInstance(id, fieldsInAppPurchases, include, limitApps)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.InAppPurchasesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        InAppPurchasesApi apiInstance = new InAppPurchasesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsInAppPurchases = Arrays.asList(); // List<String> | the fields to include for returned resources of type inAppPurchases
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        Integer limitApps = 56; // Integer | maximum number of related apps returned (when they are included)
        try {
            InAppPurchaseResponse result = apiInstance.inAppPurchasesGetInstance(id, fieldsInAppPurchases, include, limitApps);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InAppPurchasesApi#inAppPurchasesGetInstance");
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
| **fieldsInAppPurchases** | **List&lt;String&gt;**| the fields to include for returned resources of type inAppPurchases | [optional] [enum: apps, inAppPurchaseType, productId, referenceName, state] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: apps] |
| **limitApps** | **Integer**| maximum number of related apps returned (when they are included) | [optional] |

### Return type

[**InAppPurchaseResponse**](InAppPurchaseResponse.md)

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
| **200** | Single InAppPurchase |  -  |


## inAppPurchasesV2AppStoreReviewScreenshotGetToOneRelated

> InAppPurchaseAppStoreReviewScreenshotResponse inAppPurchasesV2AppStoreReviewScreenshotGetToOneRelated(id, fieldsInAppPurchaseAppStoreReviewScreenshots, fieldsInAppPurchases, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.InAppPurchasesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        InAppPurchasesApi apiInstance = new InAppPurchasesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsInAppPurchaseAppStoreReviewScreenshots = Arrays.asList(); // List<String> | the fields to include for returned resources of type inAppPurchaseAppStoreReviewScreenshots
        List<String> fieldsInAppPurchases = Arrays.asList(); // List<String> | the fields to include for returned resources of type inAppPurchases
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            InAppPurchaseAppStoreReviewScreenshotResponse result = apiInstance.inAppPurchasesV2AppStoreReviewScreenshotGetToOneRelated(id, fieldsInAppPurchaseAppStoreReviewScreenshots, fieldsInAppPurchases, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InAppPurchasesApi#inAppPurchasesV2AppStoreReviewScreenshotGetToOneRelated");
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
| **fieldsInAppPurchaseAppStoreReviewScreenshots** | **List&lt;String&gt;**| the fields to include for returned resources of type inAppPurchaseAppStoreReviewScreenshots | [optional] [enum: assetDeliveryState, assetToken, assetType, fileName, fileSize, imageAsset, inAppPurchaseV2, sourceFileChecksum, uploadOperations, uploaded] |
| **fieldsInAppPurchases** | **List&lt;String&gt;**| the fields to include for returned resources of type inAppPurchases | [optional] [enum: app, appStoreReviewScreenshot, content, contentHosting, familySharable, iapPriceSchedule, inAppPurchaseAvailability, inAppPurchaseLocalizations, inAppPurchaseType, name, pricePoints, productId, promotedPurchase, reviewNote, state] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: inAppPurchaseV2] |

### Return type

[**InAppPurchaseAppStoreReviewScreenshotResponse**](InAppPurchaseAppStoreReviewScreenshotResponse.md)

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
| **200** | Single InAppPurchaseAppStoreReviewScreenshot |  -  |


## inAppPurchasesV2ContentGetToOneRelated

> InAppPurchaseContentResponse inAppPurchasesV2ContentGetToOneRelated(id, fieldsInAppPurchases, fieldsInAppPurchaseContents, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.InAppPurchasesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        InAppPurchasesApi apiInstance = new InAppPurchasesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsInAppPurchases = Arrays.asList(); // List<String> | the fields to include for returned resources of type inAppPurchases
        List<String> fieldsInAppPurchaseContents = Arrays.asList(); // List<String> | the fields to include for returned resources of type inAppPurchaseContents
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            InAppPurchaseContentResponse result = apiInstance.inAppPurchasesV2ContentGetToOneRelated(id, fieldsInAppPurchases, fieldsInAppPurchaseContents, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InAppPurchasesApi#inAppPurchasesV2ContentGetToOneRelated");
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
| **fieldsInAppPurchases** | **List&lt;String&gt;**| the fields to include for returned resources of type inAppPurchases | [optional] [enum: app, appStoreReviewScreenshot, content, contentHosting, familySharable, iapPriceSchedule, inAppPurchaseAvailability, inAppPurchaseLocalizations, inAppPurchaseType, name, pricePoints, productId, promotedPurchase, reviewNote, state] |
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


## inAppPurchasesV2CreateInstance

> InAppPurchaseV2Response inAppPurchasesV2CreateInstance(inAppPurchaseV2CreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.InAppPurchasesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        InAppPurchasesApi apiInstance = new InAppPurchasesApi(defaultClient);
        InAppPurchaseV2CreateRequest inAppPurchaseV2CreateRequest = new InAppPurchaseV2CreateRequest(); // InAppPurchaseV2CreateRequest | InAppPurchase representation
        try {
            InAppPurchaseV2Response result = apiInstance.inAppPurchasesV2CreateInstance(inAppPurchaseV2CreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InAppPurchasesApi#inAppPurchasesV2CreateInstance");
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
| **inAppPurchaseV2CreateRequest** | [**InAppPurchaseV2CreateRequest**](InAppPurchaseV2CreateRequest.md)| InAppPurchase representation | |

### Return type

[**InAppPurchaseV2Response**](InAppPurchaseV2Response.md)

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
| **201** | Single InAppPurchase |  -  |
| **409** | Request entity error(s) |  -  |


## inAppPurchasesV2DeleteInstance

> inAppPurchasesV2DeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.InAppPurchasesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        InAppPurchasesApi apiInstance = new InAppPurchasesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.inAppPurchasesV2DeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling InAppPurchasesApi#inAppPurchasesV2DeleteInstance");
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


## inAppPurchasesV2GetInstance

> InAppPurchaseV2Response inAppPurchasesV2GetInstance(id, fieldsInAppPurchases, include, fieldsInAppPurchaseAvailabilities, fieldsInAppPurchaseAppStoreReviewScreenshots, fieldsPromotedPurchases, fieldsInAppPurchasePricePoints, fieldsInAppPurchaseLocalizations, fieldsInAppPurchasePriceSchedules, fieldsInAppPurchaseContents, limitInAppPurchaseLocalizations, limitPricePoints)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.InAppPurchasesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        InAppPurchasesApi apiInstance = new InAppPurchasesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsInAppPurchases = Arrays.asList(); // List<String> | the fields to include for returned resources of type inAppPurchases
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsInAppPurchaseAvailabilities = Arrays.asList(); // List<String> | the fields to include for returned resources of type inAppPurchaseAvailabilities
        List<String> fieldsInAppPurchaseAppStoreReviewScreenshots = Arrays.asList(); // List<String> | the fields to include for returned resources of type inAppPurchaseAppStoreReviewScreenshots
        List<String> fieldsPromotedPurchases = Arrays.asList(); // List<String> | the fields to include for returned resources of type promotedPurchases
        List<String> fieldsInAppPurchasePricePoints = Arrays.asList(); // List<String> | the fields to include for returned resources of type inAppPurchasePricePoints
        List<String> fieldsInAppPurchaseLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type inAppPurchaseLocalizations
        List<String> fieldsInAppPurchasePriceSchedules = Arrays.asList(); // List<String> | the fields to include for returned resources of type inAppPurchasePriceSchedules
        List<String> fieldsInAppPurchaseContents = Arrays.asList(); // List<String> | the fields to include for returned resources of type inAppPurchaseContents
        Integer limitInAppPurchaseLocalizations = 56; // Integer | maximum number of related inAppPurchaseLocalizations returned (when they are included)
        Integer limitPricePoints = 56; // Integer | maximum number of related pricePoints returned (when they are included)
        try {
            InAppPurchaseV2Response result = apiInstance.inAppPurchasesV2GetInstance(id, fieldsInAppPurchases, include, fieldsInAppPurchaseAvailabilities, fieldsInAppPurchaseAppStoreReviewScreenshots, fieldsPromotedPurchases, fieldsInAppPurchasePricePoints, fieldsInAppPurchaseLocalizations, fieldsInAppPurchasePriceSchedules, fieldsInAppPurchaseContents, limitInAppPurchaseLocalizations, limitPricePoints);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InAppPurchasesApi#inAppPurchasesV2GetInstance");
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
| **fieldsInAppPurchases** | **List&lt;String&gt;**| the fields to include for returned resources of type inAppPurchases | [optional] [enum: app, appStoreReviewScreenshot, content, contentHosting, familySharable, iapPriceSchedule, inAppPurchaseAvailability, inAppPurchaseLocalizations, inAppPurchaseType, name, pricePoints, productId, promotedPurchase, reviewNote, state] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: appStoreReviewScreenshot, content, iapPriceSchedule, inAppPurchaseAvailability, inAppPurchaseLocalizations, pricePoints, promotedPurchase] |
| **fieldsInAppPurchaseAvailabilities** | **List&lt;String&gt;**| the fields to include for returned resources of type inAppPurchaseAvailabilities | [optional] [enum: availableInNewTerritories, availableTerritories, inAppPurchase] |
| **fieldsInAppPurchaseAppStoreReviewScreenshots** | **List&lt;String&gt;**| the fields to include for returned resources of type inAppPurchaseAppStoreReviewScreenshots | [optional] [enum: assetDeliveryState, assetToken, assetType, fileName, fileSize, imageAsset, inAppPurchaseV2, sourceFileChecksum, uploadOperations, uploaded] |
| **fieldsPromotedPurchases** | **List&lt;String&gt;**| the fields to include for returned resources of type promotedPurchases | [optional] [enum: app, enabled, inAppPurchaseV2, promotionImages, state, subscription, visibleForAllUsers] |
| **fieldsInAppPurchasePricePoints** | **List&lt;String&gt;**| the fields to include for returned resources of type inAppPurchasePricePoints | [optional] [enum: customerPrice, inAppPurchaseV2, proceeds, territory] |
| **fieldsInAppPurchaseLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type inAppPurchaseLocalizations | [optional] [enum: description, inAppPurchaseV2, locale, name, state] |
| **fieldsInAppPurchasePriceSchedules** | **List&lt;String&gt;**| the fields to include for returned resources of type inAppPurchasePriceSchedules | [optional] [enum: automaticPrices, baseTerritory, inAppPurchase, manualPrices] |
| **fieldsInAppPurchaseContents** | **List&lt;String&gt;**| the fields to include for returned resources of type inAppPurchaseContents | [optional] [enum: fileName, fileSize, inAppPurchaseV2, lastModifiedDate, url] |
| **limitInAppPurchaseLocalizations** | **Integer**| maximum number of related inAppPurchaseLocalizations returned (when they are included) | [optional] |
| **limitPricePoints** | **Integer**| maximum number of related pricePoints returned (when they are included) | [optional] |

### Return type

[**InAppPurchaseV2Response**](InAppPurchaseV2Response.md)

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
| **200** | Single InAppPurchase |  -  |


## inAppPurchasesV2IapPriceScheduleGetToOneRelated

> InAppPurchasePriceScheduleResponse inAppPurchasesV2IapPriceScheduleGetToOneRelated(id, fieldsInAppPurchasePrices, fieldsInAppPurchases, fieldsInAppPurchasePriceSchedules, fieldsTerritories, limitManualPrices, limitAutomaticPrices, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.InAppPurchasesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        InAppPurchasesApi apiInstance = new InAppPurchasesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsInAppPurchasePrices = Arrays.asList(); // List<String> | the fields to include for returned resources of type inAppPurchasePrices
        List<String> fieldsInAppPurchases = Arrays.asList(); // List<String> | the fields to include for returned resources of type inAppPurchases
        List<String> fieldsInAppPurchasePriceSchedules = Arrays.asList(); // List<String> | the fields to include for returned resources of type inAppPurchasePriceSchedules
        List<String> fieldsTerritories = Arrays.asList(); // List<String> | the fields to include for returned resources of type territories
        Integer limitManualPrices = 56; // Integer | maximum number of related manualPrices returned (when they are included)
        Integer limitAutomaticPrices = 56; // Integer | maximum number of related automaticPrices returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            InAppPurchasePriceScheduleResponse result = apiInstance.inAppPurchasesV2IapPriceScheduleGetToOneRelated(id, fieldsInAppPurchasePrices, fieldsInAppPurchases, fieldsInAppPurchasePriceSchedules, fieldsTerritories, limitManualPrices, limitAutomaticPrices, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InAppPurchasesApi#inAppPurchasesV2IapPriceScheduleGetToOneRelated");
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
| **fieldsInAppPurchasePrices** | **List&lt;String&gt;**| the fields to include for returned resources of type inAppPurchasePrices | [optional] [enum: endDate, inAppPurchasePricePoint, inAppPurchaseV2, manual, startDate, territory] |
| **fieldsInAppPurchases** | **List&lt;String&gt;**| the fields to include for returned resources of type inAppPurchases | [optional] [enum: app, appStoreReviewScreenshot, content, contentHosting, familySharable, iapPriceSchedule, inAppPurchaseAvailability, inAppPurchaseLocalizations, inAppPurchaseType, name, pricePoints, productId, promotedPurchase, reviewNote, state] |
| **fieldsInAppPurchasePriceSchedules** | **List&lt;String&gt;**| the fields to include for returned resources of type inAppPurchasePriceSchedules | [optional] [enum: automaticPrices, baseTerritory, inAppPurchase, manualPrices] |
| **fieldsTerritories** | **List&lt;String&gt;**| the fields to include for returned resources of type territories | [optional] [enum: currency] |
| **limitManualPrices** | **Integer**| maximum number of related manualPrices returned (when they are included) | [optional] |
| **limitAutomaticPrices** | **Integer**| maximum number of related automaticPrices returned (when they are included) | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: automaticPrices, baseTerritory, inAppPurchase, manualPrices] |

### Return type

[**InAppPurchasePriceScheduleResponse**](InAppPurchasePriceScheduleResponse.md)

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
| **200** | Single InAppPurchasePriceSchedule |  -  |


## inAppPurchasesV2InAppPurchaseAvailabilityGetToOneRelated

> InAppPurchaseAvailabilityResponse inAppPurchasesV2InAppPurchaseAvailabilityGetToOneRelated(id, fieldsInAppPurchaseAvailabilities, fieldsTerritories, limitAvailableTerritories, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.InAppPurchasesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        InAppPurchasesApi apiInstance = new InAppPurchasesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsInAppPurchaseAvailabilities = Arrays.asList(); // List<String> | the fields to include for returned resources of type inAppPurchaseAvailabilities
        List<String> fieldsTerritories = Arrays.asList(); // List<String> | the fields to include for returned resources of type territories
        Integer limitAvailableTerritories = 56; // Integer | maximum number of related availableTerritories returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            InAppPurchaseAvailabilityResponse result = apiInstance.inAppPurchasesV2InAppPurchaseAvailabilityGetToOneRelated(id, fieldsInAppPurchaseAvailabilities, fieldsTerritories, limitAvailableTerritories, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InAppPurchasesApi#inAppPurchasesV2InAppPurchaseAvailabilityGetToOneRelated");
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
| **fieldsInAppPurchaseAvailabilities** | **List&lt;String&gt;**| the fields to include for returned resources of type inAppPurchaseAvailabilities | [optional] [enum: availableInNewTerritories, availableTerritories, inAppPurchase] |
| **fieldsTerritories** | **List&lt;String&gt;**| the fields to include for returned resources of type territories | [optional] [enum: currency] |
| **limitAvailableTerritories** | **Integer**| maximum number of related availableTerritories returned (when they are included) | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: availableTerritories] |

### Return type

[**InAppPurchaseAvailabilityResponse**](InAppPurchaseAvailabilityResponse.md)

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
| **200** | Single InAppPurchaseAvailability |  -  |


## inAppPurchasesV2InAppPurchaseLocalizationsGetToManyRelated

> InAppPurchaseLocalizationsResponse inAppPurchasesV2InAppPurchaseLocalizationsGetToManyRelated(id, fieldsInAppPurchaseLocalizations, fieldsInAppPurchases, limit, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.InAppPurchasesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        InAppPurchasesApi apiInstance = new InAppPurchasesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsInAppPurchaseLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type inAppPurchaseLocalizations
        List<String> fieldsInAppPurchases = Arrays.asList(); // List<String> | the fields to include for returned resources of type inAppPurchases
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            InAppPurchaseLocalizationsResponse result = apiInstance.inAppPurchasesV2InAppPurchaseLocalizationsGetToManyRelated(id, fieldsInAppPurchaseLocalizations, fieldsInAppPurchases, limit, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InAppPurchasesApi#inAppPurchasesV2InAppPurchaseLocalizationsGetToManyRelated");
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
| **fieldsInAppPurchaseLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type inAppPurchaseLocalizations | [optional] [enum: description, inAppPurchaseV2, locale, name, state] |
| **fieldsInAppPurchases** | **List&lt;String&gt;**| the fields to include for returned resources of type inAppPurchases | [optional] [enum: app, appStoreReviewScreenshot, content, contentHosting, familySharable, iapPriceSchedule, inAppPurchaseAvailability, inAppPurchaseLocalizations, inAppPurchaseType, name, pricePoints, productId, promotedPurchase, reviewNote, state] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: inAppPurchaseV2] |

### Return type

[**InAppPurchaseLocalizationsResponse**](InAppPurchaseLocalizationsResponse.md)

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
| **200** | List of InAppPurchaseLocalizations |  -  |


## inAppPurchasesV2PricePointsGetToManyRelated

> InAppPurchasePricePointsResponse inAppPurchasesV2PricePointsGetToManyRelated(id, filterTerritory, fieldsInAppPurchasePricePoints, fieldsTerritories, limit, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.InAppPurchasesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        InAppPurchasesApi apiInstance = new InAppPurchasesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> filterTerritory = Arrays.asList(); // List<String> | filter by id(s) of related 'territory'
        List<String> fieldsInAppPurchasePricePoints = Arrays.asList(); // List<String> | the fields to include for returned resources of type inAppPurchasePricePoints
        List<String> fieldsTerritories = Arrays.asList(); // List<String> | the fields to include for returned resources of type territories
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            InAppPurchasePricePointsResponse result = apiInstance.inAppPurchasesV2PricePointsGetToManyRelated(id, filterTerritory, fieldsInAppPurchasePricePoints, fieldsTerritories, limit, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InAppPurchasesApi#inAppPurchasesV2PricePointsGetToManyRelated");
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
| **fieldsInAppPurchasePricePoints** | **List&lt;String&gt;**| the fields to include for returned resources of type inAppPurchasePricePoints | [optional] [enum: customerPrice, inAppPurchaseV2, proceeds, territory] |
| **fieldsTerritories** | **List&lt;String&gt;**| the fields to include for returned resources of type territories | [optional] [enum: currency] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: territory] |

### Return type

[**InAppPurchasePricePointsResponse**](InAppPurchasePricePointsResponse.md)

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
| **200** | List of InAppPurchasePricePoints |  -  |


## inAppPurchasesV2PromotedPurchaseGetToOneRelated

> PromotedPurchaseResponse inAppPurchasesV2PromotedPurchaseGetToOneRelated(id, fieldsPromotedPurchases, fieldsSubscriptions, fieldsInAppPurchases, fieldsPromotedPurchaseImages, limitPromotionImages, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.InAppPurchasesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        InAppPurchasesApi apiInstance = new InAppPurchasesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsPromotedPurchases = Arrays.asList(); // List<String> | the fields to include for returned resources of type promotedPurchases
        List<String> fieldsSubscriptions = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptions
        List<String> fieldsInAppPurchases = Arrays.asList(); // List<String> | the fields to include for returned resources of type inAppPurchases
        List<String> fieldsPromotedPurchaseImages = Arrays.asList(); // List<String> | the fields to include for returned resources of type promotedPurchaseImages
        Integer limitPromotionImages = 56; // Integer | maximum number of related promotionImages returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            PromotedPurchaseResponse result = apiInstance.inAppPurchasesV2PromotedPurchaseGetToOneRelated(id, fieldsPromotedPurchases, fieldsSubscriptions, fieldsInAppPurchases, fieldsPromotedPurchaseImages, limitPromotionImages, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InAppPurchasesApi#inAppPurchasesV2PromotedPurchaseGetToOneRelated");
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


## inAppPurchasesV2UpdateInstance

> InAppPurchaseV2Response inAppPurchasesV2UpdateInstance(id, inAppPurchaseV2UpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.InAppPurchasesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        InAppPurchasesApi apiInstance = new InAppPurchasesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        InAppPurchaseV2UpdateRequest inAppPurchaseV2UpdateRequest = new InAppPurchaseV2UpdateRequest(); // InAppPurchaseV2UpdateRequest | InAppPurchase representation
        try {
            InAppPurchaseV2Response result = apiInstance.inAppPurchasesV2UpdateInstance(id, inAppPurchaseV2UpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InAppPurchasesApi#inAppPurchasesV2UpdateInstance");
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
| **inAppPurchaseV2UpdateRequest** | [**InAppPurchaseV2UpdateRequest**](InAppPurchaseV2UpdateRequest.md)| InAppPurchase representation | |

### Return type

[**InAppPurchaseV2Response**](InAppPurchaseV2Response.md)

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
| **200** | Single InAppPurchase |  -  |
| **409** | Request entity error(s) |  -  |

