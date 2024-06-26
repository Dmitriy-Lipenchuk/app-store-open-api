# AppPricePointsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**appPricePointsV3EqualizationsGetToManyRelated**](AppPricePointsApi.md#appPricePointsV3EqualizationsGetToManyRelated) | **GET** /v3/appPricePoints/{id}/equalizations |  |
| [**appPricePointsV3GetInstance**](AppPricePointsApi.md#appPricePointsV3GetInstance) | **GET** /v3/appPricePoints/{id} |  |



## appPricePointsV3EqualizationsGetToManyRelated

> AppPricePointsV3Response appPricePointsV3EqualizationsGetToManyRelated(id, filterTerritory, fieldsAppPricePoints, fieldsApps, fieldsTerritories, limit, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppPricePointsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppPricePointsApi apiInstance = new AppPricePointsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> filterTerritory = Arrays.asList(); // List<String> | filter by id(s) of related 'territory'
        List<String> fieldsAppPricePoints = Arrays.asList(); // List<String> | the fields to include for returned resources of type appPricePoints
        List<String> fieldsApps = Arrays.asList(); // List<String> | the fields to include for returned resources of type apps
        List<String> fieldsTerritories = Arrays.asList(); // List<String> | the fields to include for returned resources of type territories
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            AppPricePointsV3Response result = apiInstance.appPricePointsV3EqualizationsGetToManyRelated(id, filterTerritory, fieldsAppPricePoints, fieldsApps, fieldsTerritories, limit, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppPricePointsApi#appPricePointsV3EqualizationsGetToManyRelated");
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
| **fieldsAppPricePoints** | **List&lt;String&gt;**| the fields to include for returned resources of type appPricePoints | [optional] [enum: app, customerPrice, equalizations, proceeds, territory] |
| **fieldsApps** | **List&lt;String&gt;**| the fields to include for returned resources of type apps | [optional] [enum: alternativeDistributionKey, analyticsReportRequests, appAvailability, appClips, appCustomProductPages, appEncryptionDeclarations, appEvents, appInfos, appPricePoints, appPriceSchedule, appStoreVersionExperimentsV2, appStoreVersions, betaAppLocalizations, betaAppReviewDetail, betaGroups, betaLicenseAgreement, betaTesters, builds, bundleId, ciProduct, contentRightsDeclaration, customerReviews, endUserLicenseAgreement, gameCenterDetail, gameCenterEnabledVersions, inAppPurchases, inAppPurchasesV2, isOrEverWasMadeForKids, marketplaceSearchDetail, name, perfPowerMetrics, preOrder, preReleaseVersions, primaryLocale, promotedPurchases, reviewSubmissions, sku, subscriptionGracePeriod, subscriptionGroups, subscriptionStatusUrl, subscriptionStatusUrlForSandbox, subscriptionStatusUrlVersion, subscriptionStatusUrlVersionForSandbox] |
| **fieldsTerritories** | **List&lt;String&gt;**| the fields to include for returned resources of type territories | [optional] [enum: currency] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: app, territory] |

### Return type

[**AppPricePointsV3Response**](AppPricePointsV3Response.md)

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
| **200** | List of AppPricePoints |  -  |


## appPricePointsV3GetInstance

> AppPricePointV3Response appPricePointsV3GetInstance(id, fieldsAppPricePoints, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppPricePointsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppPricePointsApi apiInstance = new AppPricePointsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAppPricePoints = Arrays.asList(); // List<String> | the fields to include for returned resources of type appPricePoints
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            AppPricePointV3Response result = apiInstance.appPricePointsV3GetInstance(id, fieldsAppPricePoints, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppPricePointsApi#appPricePointsV3GetInstance");
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
| **fieldsAppPricePoints** | **List&lt;String&gt;**| the fields to include for returned resources of type appPricePoints | [optional] [enum: app, customerPrice, equalizations, proceeds, territory] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: app, territory] |

### Return type

[**AppPricePointV3Response**](AppPricePointV3Response.md)

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
| **200** | Single AppPricePoint |  -  |

