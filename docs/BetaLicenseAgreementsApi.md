# BetaLicenseAgreementsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**betaLicenseAgreementsAppGetToOneRelated**](BetaLicenseAgreementsApi.md#betaLicenseAgreementsAppGetToOneRelated) | **GET** /v1/betaLicenseAgreements/{id}/app |  |
| [**betaLicenseAgreementsGetCollection**](BetaLicenseAgreementsApi.md#betaLicenseAgreementsGetCollection) | **GET** /v1/betaLicenseAgreements |  |
| [**betaLicenseAgreementsGetInstance**](BetaLicenseAgreementsApi.md#betaLicenseAgreementsGetInstance) | **GET** /v1/betaLicenseAgreements/{id} |  |
| [**betaLicenseAgreementsUpdateInstance**](BetaLicenseAgreementsApi.md#betaLicenseAgreementsUpdateInstance) | **PATCH** /v1/betaLicenseAgreements/{id} |  |



## betaLicenseAgreementsAppGetToOneRelated

> AppWithoutIncludesResponse betaLicenseAgreementsAppGetToOneRelated(id, fieldsApps)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BetaLicenseAgreementsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BetaLicenseAgreementsApi apiInstance = new BetaLicenseAgreementsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsApps = Arrays.asList(); // List<String> | the fields to include for returned resources of type apps
        try {
            AppWithoutIncludesResponse result = apiInstance.betaLicenseAgreementsAppGetToOneRelated(id, fieldsApps);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BetaLicenseAgreementsApi#betaLicenseAgreementsAppGetToOneRelated");
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
| **fieldsApps** | **List&lt;String&gt;**| the fields to include for returned resources of type apps | [optional] [enum: alternativeDistributionKey, analyticsReportRequests, appAvailability, appClips, appCustomProductPages, appEncryptionDeclarations, appEvents, appInfos, appPricePoints, appPriceSchedule, appStoreVersionExperimentsV2, appStoreVersions, betaAppLocalizations, betaAppReviewDetail, betaGroups, betaLicenseAgreement, betaTesters, builds, bundleId, ciProduct, contentRightsDeclaration, customerReviews, endUserLicenseAgreement, gameCenterDetail, gameCenterEnabledVersions, inAppPurchases, inAppPurchasesV2, isOrEverWasMadeForKids, marketplaceSearchDetail, name, perfPowerMetrics, preOrder, preReleaseVersions, primaryLocale, promotedPurchases, reviewSubmissions, sku, subscriptionGracePeriod, subscriptionGroups, subscriptionStatusUrl, subscriptionStatusUrlForSandbox, subscriptionStatusUrlVersion, subscriptionStatusUrlVersionForSandbox] |

### Return type

[**AppWithoutIncludesResponse**](AppWithoutIncludesResponse.md)

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
| **200** | Single App with get |  -  |


## betaLicenseAgreementsGetCollection

> BetaLicenseAgreementsResponse betaLicenseAgreementsGetCollection(filterApp, fieldsBetaLicenseAgreements, limit, include, fieldsApps)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BetaLicenseAgreementsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BetaLicenseAgreementsApi apiInstance = new BetaLicenseAgreementsApi(defaultClient);
        List<String> filterApp = Arrays.asList(); // List<String> | filter by id(s) of related 'app'
        List<String> fieldsBetaLicenseAgreements = Arrays.asList(); // List<String> | the fields to include for returned resources of type betaLicenseAgreements
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsApps = Arrays.asList(); // List<String> | the fields to include for returned resources of type apps
        try {
            BetaLicenseAgreementsResponse result = apiInstance.betaLicenseAgreementsGetCollection(filterApp, fieldsBetaLicenseAgreements, limit, include, fieldsApps);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BetaLicenseAgreementsApi#betaLicenseAgreementsGetCollection");
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
| **filterApp** | **List&lt;String&gt;**| filter by id(s) of related &#39;app&#39; | [optional] |
| **fieldsBetaLicenseAgreements** | **List&lt;String&gt;**| the fields to include for returned resources of type betaLicenseAgreements | [optional] [enum: agreementText, app] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: app] |
| **fieldsApps** | **List&lt;String&gt;**| the fields to include for returned resources of type apps | [optional] [enum: alternativeDistributionKey, analyticsReportRequests, appAvailability, appClips, appCustomProductPages, appEncryptionDeclarations, appEvents, appInfos, appPricePoints, appPriceSchedule, appStoreVersionExperimentsV2, appStoreVersions, betaAppLocalizations, betaAppReviewDetail, betaGroups, betaLicenseAgreement, betaTesters, builds, bundleId, ciProduct, contentRightsDeclaration, customerReviews, endUserLicenseAgreement, gameCenterDetail, gameCenterEnabledVersions, inAppPurchases, inAppPurchasesV2, isOrEverWasMadeForKids, marketplaceSearchDetail, name, perfPowerMetrics, preOrder, preReleaseVersions, primaryLocale, promotedPurchases, reviewSubmissions, sku, subscriptionGracePeriod, subscriptionGroups, subscriptionStatusUrl, subscriptionStatusUrlForSandbox, subscriptionStatusUrlVersion, subscriptionStatusUrlVersionForSandbox] |

### Return type

[**BetaLicenseAgreementsResponse**](BetaLicenseAgreementsResponse.md)

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
| **200** | List of BetaLicenseAgreements |  -  |


## betaLicenseAgreementsGetInstance

> BetaLicenseAgreementResponse betaLicenseAgreementsGetInstance(id, fieldsBetaLicenseAgreements, include, fieldsApps)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BetaLicenseAgreementsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BetaLicenseAgreementsApi apiInstance = new BetaLicenseAgreementsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsBetaLicenseAgreements = Arrays.asList(); // List<String> | the fields to include for returned resources of type betaLicenseAgreements
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsApps = Arrays.asList(); // List<String> | the fields to include for returned resources of type apps
        try {
            BetaLicenseAgreementResponse result = apiInstance.betaLicenseAgreementsGetInstance(id, fieldsBetaLicenseAgreements, include, fieldsApps);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BetaLicenseAgreementsApi#betaLicenseAgreementsGetInstance");
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
| **fieldsBetaLicenseAgreements** | **List&lt;String&gt;**| the fields to include for returned resources of type betaLicenseAgreements | [optional] [enum: agreementText, app] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: app] |
| **fieldsApps** | **List&lt;String&gt;**| the fields to include for returned resources of type apps | [optional] [enum: alternativeDistributionKey, analyticsReportRequests, appAvailability, appClips, appCustomProductPages, appEncryptionDeclarations, appEvents, appInfos, appPricePoints, appPriceSchedule, appStoreVersionExperimentsV2, appStoreVersions, betaAppLocalizations, betaAppReviewDetail, betaGroups, betaLicenseAgreement, betaTesters, builds, bundleId, ciProduct, contentRightsDeclaration, customerReviews, endUserLicenseAgreement, gameCenterDetail, gameCenterEnabledVersions, inAppPurchases, inAppPurchasesV2, isOrEverWasMadeForKids, marketplaceSearchDetail, name, perfPowerMetrics, preOrder, preReleaseVersions, primaryLocale, promotedPurchases, reviewSubmissions, sku, subscriptionGracePeriod, subscriptionGroups, subscriptionStatusUrl, subscriptionStatusUrlForSandbox, subscriptionStatusUrlVersion, subscriptionStatusUrlVersionForSandbox] |

### Return type

[**BetaLicenseAgreementResponse**](BetaLicenseAgreementResponse.md)

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
| **200** | Single BetaLicenseAgreement |  -  |


## betaLicenseAgreementsUpdateInstance

> BetaLicenseAgreementResponse betaLicenseAgreementsUpdateInstance(id, betaLicenseAgreementUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BetaLicenseAgreementsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BetaLicenseAgreementsApi apiInstance = new BetaLicenseAgreementsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        BetaLicenseAgreementUpdateRequest betaLicenseAgreementUpdateRequest = new BetaLicenseAgreementUpdateRequest(); // BetaLicenseAgreementUpdateRequest | BetaLicenseAgreement representation
        try {
            BetaLicenseAgreementResponse result = apiInstance.betaLicenseAgreementsUpdateInstance(id, betaLicenseAgreementUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BetaLicenseAgreementsApi#betaLicenseAgreementsUpdateInstance");
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
| **betaLicenseAgreementUpdateRequest** | [**BetaLicenseAgreementUpdateRequest**](BetaLicenseAgreementUpdateRequest.md)| BetaLicenseAgreement representation | |

### Return type

[**BetaLicenseAgreementResponse**](BetaLicenseAgreementResponse.md)

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
| **200** | Single BetaLicenseAgreement |  -  |
| **409** | Request entity error(s) |  -  |

