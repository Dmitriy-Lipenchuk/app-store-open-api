# BetaTestersApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**betaTestersAppsDeleteToManyRelationship**](BetaTestersApi.md#betaTestersAppsDeleteToManyRelationship) | **DELETE** /v1/betaTesters/{id}/relationships/apps |  |
| [**betaTestersAppsGetToManyRelated**](BetaTestersApi.md#betaTestersAppsGetToManyRelated) | **GET** /v1/betaTesters/{id}/apps |  |
| [**betaTestersAppsGetToManyRelationship**](BetaTestersApi.md#betaTestersAppsGetToManyRelationship) | **GET** /v1/betaTesters/{id}/relationships/apps |  |
| [**betaTestersBetaGroupsCreateToManyRelationship**](BetaTestersApi.md#betaTestersBetaGroupsCreateToManyRelationship) | **POST** /v1/betaTesters/{id}/relationships/betaGroups |  |
| [**betaTestersBetaGroupsDeleteToManyRelationship**](BetaTestersApi.md#betaTestersBetaGroupsDeleteToManyRelationship) | **DELETE** /v1/betaTesters/{id}/relationships/betaGroups |  |
| [**betaTestersBetaGroupsGetToManyRelated**](BetaTestersApi.md#betaTestersBetaGroupsGetToManyRelated) | **GET** /v1/betaTesters/{id}/betaGroups |  |
| [**betaTestersBetaGroupsGetToManyRelationship**](BetaTestersApi.md#betaTestersBetaGroupsGetToManyRelationship) | **GET** /v1/betaTesters/{id}/relationships/betaGroups |  |
| [**betaTestersBetaTesterUsagesGetMetrics**](BetaTestersApi.md#betaTestersBetaTesterUsagesGetMetrics) | **GET** /v1/betaTesters/{id}/metrics/betaTesterUsages |  |
| [**betaTestersBuildsCreateToManyRelationship**](BetaTestersApi.md#betaTestersBuildsCreateToManyRelationship) | **POST** /v1/betaTesters/{id}/relationships/builds |  |
| [**betaTestersBuildsDeleteToManyRelationship**](BetaTestersApi.md#betaTestersBuildsDeleteToManyRelationship) | **DELETE** /v1/betaTesters/{id}/relationships/builds |  |
| [**betaTestersBuildsGetToManyRelated**](BetaTestersApi.md#betaTestersBuildsGetToManyRelated) | **GET** /v1/betaTesters/{id}/builds |  |
| [**betaTestersBuildsGetToManyRelationship**](BetaTestersApi.md#betaTestersBuildsGetToManyRelationship) | **GET** /v1/betaTesters/{id}/relationships/builds |  |
| [**betaTestersCreateInstance**](BetaTestersApi.md#betaTestersCreateInstance) | **POST** /v1/betaTesters |  |
| [**betaTestersDeleteInstance**](BetaTestersApi.md#betaTestersDeleteInstance) | **DELETE** /v1/betaTesters/{id} |  |
| [**betaTestersGetCollection**](BetaTestersApi.md#betaTestersGetCollection) | **GET** /v1/betaTesters |  |
| [**betaTestersGetInstance**](BetaTestersApi.md#betaTestersGetInstance) | **GET** /v1/betaTesters/{id} |  |



## betaTestersAppsDeleteToManyRelationship

> betaTestersAppsDeleteToManyRelationship(id, betaTesterAppsLinkagesRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BetaTestersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BetaTestersApi apiInstance = new BetaTestersApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        BetaTesterAppsLinkagesRequest betaTesterAppsLinkagesRequest = new BetaTesterAppsLinkagesRequest(); // BetaTesterAppsLinkagesRequest | List of related linkages
        try {
            apiInstance.betaTestersAppsDeleteToManyRelationship(id, betaTesterAppsLinkagesRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling BetaTestersApi#betaTestersAppsDeleteToManyRelationship");
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
| **betaTesterAppsLinkagesRequest** | [**BetaTesterAppsLinkagesRequest**](BetaTesterAppsLinkagesRequest.md)| List of related linkages | |

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
| **202** | Accepted for future completion |  -  |
| **204** | Success (no content) |  -  |


## betaTestersAppsGetToManyRelated

> AppsWithoutIncludesResponse betaTestersAppsGetToManyRelated(id, fieldsApps, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BetaTestersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BetaTestersApi apiInstance = new BetaTestersApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsApps = Arrays.asList(); // List<String> | the fields to include for returned resources of type apps
        Integer limit = 56; // Integer | maximum resources per page
        try {
            AppsWithoutIncludesResponse result = apiInstance.betaTestersAppsGetToManyRelated(id, fieldsApps, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BetaTestersApi#betaTestersAppsGetToManyRelated");
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
| **limit** | **Integer**| maximum resources per page | [optional] |

### Return type

[**AppsWithoutIncludesResponse**](AppsWithoutIncludesResponse.md)

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
| **200** | List of Apps with get |  -  |


## betaTestersAppsGetToManyRelationship

> BetaTesterAppsLinkagesResponse betaTestersAppsGetToManyRelationship(id, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BetaTestersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BetaTestersApi apiInstance = new BetaTestersApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        Integer limit = 56; // Integer | maximum resources per page
        try {
            BetaTesterAppsLinkagesResponse result = apiInstance.betaTestersAppsGetToManyRelationship(id, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BetaTestersApi#betaTestersAppsGetToManyRelationship");
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

[**BetaTesterAppsLinkagesResponse**](BetaTesterAppsLinkagesResponse.md)

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


## betaTestersBetaGroupsCreateToManyRelationship

> betaTestersBetaGroupsCreateToManyRelationship(id, betaTesterBetaGroupsLinkagesRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BetaTestersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BetaTestersApi apiInstance = new BetaTestersApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        BetaTesterBetaGroupsLinkagesRequest betaTesterBetaGroupsLinkagesRequest = new BetaTesterBetaGroupsLinkagesRequest(); // BetaTesterBetaGroupsLinkagesRequest | List of related linkages
        try {
            apiInstance.betaTestersBetaGroupsCreateToManyRelationship(id, betaTesterBetaGroupsLinkagesRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling BetaTestersApi#betaTestersBetaGroupsCreateToManyRelationship");
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
| **betaTesterBetaGroupsLinkagesRequest** | [**BetaTesterBetaGroupsLinkagesRequest**](BetaTesterBetaGroupsLinkagesRequest.md)| List of related linkages | |

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


## betaTestersBetaGroupsDeleteToManyRelationship

> betaTestersBetaGroupsDeleteToManyRelationship(id, betaTesterBetaGroupsLinkagesRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BetaTestersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BetaTestersApi apiInstance = new BetaTestersApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        BetaTesterBetaGroupsLinkagesRequest betaTesterBetaGroupsLinkagesRequest = new BetaTesterBetaGroupsLinkagesRequest(); // BetaTesterBetaGroupsLinkagesRequest | List of related linkages
        try {
            apiInstance.betaTestersBetaGroupsDeleteToManyRelationship(id, betaTesterBetaGroupsLinkagesRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling BetaTestersApi#betaTestersBetaGroupsDeleteToManyRelationship");
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
| **betaTesterBetaGroupsLinkagesRequest** | [**BetaTesterBetaGroupsLinkagesRequest**](BetaTesterBetaGroupsLinkagesRequest.md)| List of related linkages | |

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


## betaTestersBetaGroupsGetToManyRelated

> BetaGroupsWithoutIncludesResponse betaTestersBetaGroupsGetToManyRelated(id, fieldsBetaGroups, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BetaTestersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BetaTestersApi apiInstance = new BetaTestersApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsBetaGroups = Arrays.asList(); // List<String> | the fields to include for returned resources of type betaGroups
        Integer limit = 56; // Integer | maximum resources per page
        try {
            BetaGroupsWithoutIncludesResponse result = apiInstance.betaTestersBetaGroupsGetToManyRelated(id, fieldsBetaGroups, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BetaTestersApi#betaTestersBetaGroupsGetToManyRelated");
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
| **fieldsBetaGroups** | **List&lt;String&gt;**| the fields to include for returned resources of type betaGroups | [optional] [enum: app, betaTesters, builds, createdDate, feedbackEnabled, hasAccessToAllBuilds, iosBuildsAvailableForAppleSiliconMac, isInternalGroup, name, publicLink, publicLinkEnabled, publicLinkId, publicLinkLimit, publicLinkLimitEnabled] |
| **limit** | **Integer**| maximum resources per page | [optional] |

### Return type

[**BetaGroupsWithoutIncludesResponse**](BetaGroupsWithoutIncludesResponse.md)

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
| **200** | List of BetaGroups with get |  -  |


## betaTestersBetaGroupsGetToManyRelationship

> BetaTesterBetaGroupsLinkagesResponse betaTestersBetaGroupsGetToManyRelationship(id, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BetaTestersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BetaTestersApi apiInstance = new BetaTestersApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        Integer limit = 56; // Integer | maximum resources per page
        try {
            BetaTesterBetaGroupsLinkagesResponse result = apiInstance.betaTestersBetaGroupsGetToManyRelationship(id, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BetaTestersApi#betaTestersBetaGroupsGetToManyRelationship");
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

[**BetaTesterBetaGroupsLinkagesResponse**](BetaTesterBetaGroupsLinkagesResponse.md)

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


## betaTestersBetaTesterUsagesGetMetrics

> BetaTesterUsagesV1MetricResponse betaTestersBetaTesterUsagesGetMetrics(id, filterApps, limit, period)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BetaTestersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BetaTestersApi apiInstance = new BetaTestersApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        String filterApps = "filterApps_example"; // String | filter by 'apps' relationship dimension
        Integer limit = 56; // Integer | maximum number of groups to return per page
        String period = "P7D"; // String | the duration of the reporting period
        try {
            BetaTesterUsagesV1MetricResponse result = apiInstance.betaTestersBetaTesterUsagesGetMetrics(id, filterApps, limit, period);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BetaTestersApi#betaTestersBetaTesterUsagesGetMetrics");
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
| **filterApps** | **String**| filter by &#39;apps&#39; relationship dimension | |
| **limit** | **Integer**| maximum number of groups to return per page | [optional] |
| **period** | **String**| the duration of the reporting period | [optional] [enum: P7D, P30D, P90D, P365D] |

### Return type

[**BetaTesterUsagesV1MetricResponse**](BetaTesterUsagesV1MetricResponse.md)

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
| **200** | Metrics data response |  -  |


## betaTestersBuildsCreateToManyRelationship

> betaTestersBuildsCreateToManyRelationship(id, betaTesterBuildsLinkagesRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BetaTestersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BetaTestersApi apiInstance = new BetaTestersApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        BetaTesterBuildsLinkagesRequest betaTesterBuildsLinkagesRequest = new BetaTesterBuildsLinkagesRequest(); // BetaTesterBuildsLinkagesRequest | List of related linkages
        try {
            apiInstance.betaTestersBuildsCreateToManyRelationship(id, betaTesterBuildsLinkagesRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling BetaTestersApi#betaTestersBuildsCreateToManyRelationship");
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
| **betaTesterBuildsLinkagesRequest** | [**BetaTesterBuildsLinkagesRequest**](BetaTesterBuildsLinkagesRequest.md)| List of related linkages | |

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


## betaTestersBuildsDeleteToManyRelationship

> betaTestersBuildsDeleteToManyRelationship(id, betaTesterBuildsLinkagesRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BetaTestersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BetaTestersApi apiInstance = new BetaTestersApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        BetaTesterBuildsLinkagesRequest betaTesterBuildsLinkagesRequest = new BetaTesterBuildsLinkagesRequest(); // BetaTesterBuildsLinkagesRequest | List of related linkages
        try {
            apiInstance.betaTestersBuildsDeleteToManyRelationship(id, betaTesterBuildsLinkagesRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling BetaTestersApi#betaTestersBuildsDeleteToManyRelationship");
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
| **betaTesterBuildsLinkagesRequest** | [**BetaTesterBuildsLinkagesRequest**](BetaTesterBuildsLinkagesRequest.md)| List of related linkages | |

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


## betaTestersBuildsGetToManyRelated

> BuildsWithoutIncludesResponse betaTestersBuildsGetToManyRelated(id, fieldsBuilds, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BetaTestersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BetaTestersApi apiInstance = new BetaTestersApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsBuilds = Arrays.asList(); // List<String> | the fields to include for returned resources of type builds
        Integer limit = 56; // Integer | maximum resources per page
        try {
            BuildsWithoutIncludesResponse result = apiInstance.betaTestersBuildsGetToManyRelated(id, fieldsBuilds, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BetaTestersApi#betaTestersBuildsGetToManyRelated");
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
| **fieldsBuilds** | **List&lt;String&gt;**| the fields to include for returned resources of type builds | [optional] [enum: app, appEncryptionDeclaration, appStoreVersion, betaAppReviewSubmission, betaBuildLocalizations, betaGroups, buildAudienceType, buildBetaDetail, buildBundles, computedMinMacOsVersion, diagnosticSignatures, expirationDate, expired, iconAssetToken, icons, individualTesters, lsMinimumSystemVersion, minOsVersion, perfPowerMetrics, preReleaseVersion, processingState, uploadedDate, usesNonExemptEncryption, version] |
| **limit** | **Integer**| maximum resources per page | [optional] |

### Return type

[**BuildsWithoutIncludesResponse**](BuildsWithoutIncludesResponse.md)

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
| **200** | List of Builds with get |  -  |


## betaTestersBuildsGetToManyRelationship

> BetaTesterBuildsLinkagesResponse betaTestersBuildsGetToManyRelationship(id, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BetaTestersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BetaTestersApi apiInstance = new BetaTestersApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        Integer limit = 56; // Integer | maximum resources per page
        try {
            BetaTesterBuildsLinkagesResponse result = apiInstance.betaTestersBuildsGetToManyRelationship(id, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BetaTestersApi#betaTestersBuildsGetToManyRelationship");
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

[**BetaTesterBuildsLinkagesResponse**](BetaTesterBuildsLinkagesResponse.md)

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


## betaTestersCreateInstance

> BetaTesterResponse betaTestersCreateInstance(betaTesterCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BetaTestersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BetaTestersApi apiInstance = new BetaTestersApi(defaultClient);
        BetaTesterCreateRequest betaTesterCreateRequest = new BetaTesterCreateRequest(); // BetaTesterCreateRequest | BetaTester representation
        try {
            BetaTesterResponse result = apiInstance.betaTestersCreateInstance(betaTesterCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BetaTestersApi#betaTestersCreateInstance");
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
| **betaTesterCreateRequest** | [**BetaTesterCreateRequest**](BetaTesterCreateRequest.md)| BetaTester representation | |

### Return type

[**BetaTesterResponse**](BetaTesterResponse.md)

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
| **201** | Single BetaTester |  -  |
| **409** | Request entity error(s) |  -  |


## betaTestersDeleteInstance

> betaTestersDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BetaTestersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BetaTestersApi apiInstance = new BetaTestersApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.betaTestersDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling BetaTestersApi#betaTestersDeleteInstance");
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
| **202** | Accepted for future completion |  -  |
| **204** | Success (no content) |  -  |


## betaTestersGetCollection

> BetaTestersResponse betaTestersGetCollection(filterEmail, filterFirstName, filterInviteType, filterLastName, filterApps, filterBetaGroups, filterBuilds, filterId, sort, fieldsBetaTesters, limit, include, fieldsApps, fieldsBuilds, fieldsBetaGroups, limitApps, limitBetaGroups, limitBuilds)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BetaTestersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BetaTestersApi apiInstance = new BetaTestersApi(defaultClient);
        List<String> filterEmail = Arrays.asList(); // List<String> | filter by attribute 'email'
        List<String> filterFirstName = Arrays.asList(); // List<String> | filter by attribute 'firstName'
        List<String> filterInviteType = Arrays.asList(); // List<String> | filter by attribute 'inviteType'
        List<String> filterLastName = Arrays.asList(); // List<String> | filter by attribute 'lastName'
        List<String> filterApps = Arrays.asList(); // List<String> | filter by id(s) of related 'apps'
        List<String> filterBetaGroups = Arrays.asList(); // List<String> | filter by id(s) of related 'betaGroups'
        List<String> filterBuilds = Arrays.asList(); // List<String> | filter by id(s) of related 'builds'
        List<String> filterId = Arrays.asList(); // List<String> | filter by id(s)
        List<String> sort = Arrays.asList(); // List<String> | comma-separated list of sort expressions; resources will be sorted as specified
        List<String> fieldsBetaTesters = Arrays.asList(); // List<String> | the fields to include for returned resources of type betaTesters
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsApps = Arrays.asList(); // List<String> | the fields to include for returned resources of type apps
        List<String> fieldsBuilds = Arrays.asList(); // List<String> | the fields to include for returned resources of type builds
        List<String> fieldsBetaGroups = Arrays.asList(); // List<String> | the fields to include for returned resources of type betaGroups
        Integer limitApps = 56; // Integer | maximum number of related apps returned (when they are included)
        Integer limitBetaGroups = 56; // Integer | maximum number of related betaGroups returned (when they are included)
        Integer limitBuilds = 56; // Integer | maximum number of related builds returned (when they are included)
        try {
            BetaTestersResponse result = apiInstance.betaTestersGetCollection(filterEmail, filterFirstName, filterInviteType, filterLastName, filterApps, filterBetaGroups, filterBuilds, filterId, sort, fieldsBetaTesters, limit, include, fieldsApps, fieldsBuilds, fieldsBetaGroups, limitApps, limitBetaGroups, limitBuilds);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BetaTestersApi#betaTestersGetCollection");
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
| **filterEmail** | **List&lt;String&gt;**| filter by attribute &#39;email&#39; | [optional] |
| **filterFirstName** | **List&lt;String&gt;**| filter by attribute &#39;firstName&#39; | [optional] |
| **filterInviteType** | **List&lt;String&gt;**| filter by attribute &#39;inviteType&#39; | [optional] [enum: EMAIL, PUBLIC_LINK] |
| **filterLastName** | **List&lt;String&gt;**| filter by attribute &#39;lastName&#39; | [optional] |
| **filterApps** | **List&lt;String&gt;**| filter by id(s) of related &#39;apps&#39; | [optional] |
| **filterBetaGroups** | **List&lt;String&gt;**| filter by id(s) of related &#39;betaGroups&#39; | [optional] |
| **filterBuilds** | **List&lt;String&gt;**| filter by id(s) of related &#39;builds&#39; | [optional] |
| **filterId** | **List&lt;String&gt;**| filter by id(s) | [optional] |
| **sort** | **List&lt;String&gt;**| comma-separated list of sort expressions; resources will be sorted as specified | [optional] [enum: email, -email, firstName, -firstName, inviteType, -inviteType, lastName, -lastName, state, -state] |
| **fieldsBetaTesters** | **List&lt;String&gt;**| the fields to include for returned resources of type betaTesters | [optional] [enum: apps, betaGroups, builds, email, firstName, inviteType, lastName, state] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: apps, betaGroups, builds] |
| **fieldsApps** | **List&lt;String&gt;**| the fields to include for returned resources of type apps | [optional] [enum: alternativeDistributionKey, analyticsReportRequests, appAvailability, appClips, appCustomProductPages, appEncryptionDeclarations, appEvents, appInfos, appPricePoints, appPriceSchedule, appStoreVersionExperimentsV2, appStoreVersions, betaAppLocalizations, betaAppReviewDetail, betaGroups, betaLicenseAgreement, betaTesters, builds, bundleId, ciProduct, contentRightsDeclaration, customerReviews, endUserLicenseAgreement, gameCenterDetail, gameCenterEnabledVersions, inAppPurchases, inAppPurchasesV2, isOrEverWasMadeForKids, marketplaceSearchDetail, name, perfPowerMetrics, preOrder, preReleaseVersions, primaryLocale, promotedPurchases, reviewSubmissions, sku, subscriptionGracePeriod, subscriptionGroups, subscriptionStatusUrl, subscriptionStatusUrlForSandbox, subscriptionStatusUrlVersion, subscriptionStatusUrlVersionForSandbox] |
| **fieldsBuilds** | **List&lt;String&gt;**| the fields to include for returned resources of type builds | [optional] [enum: app, appEncryptionDeclaration, appStoreVersion, betaAppReviewSubmission, betaBuildLocalizations, betaGroups, buildAudienceType, buildBetaDetail, buildBundles, computedMinMacOsVersion, diagnosticSignatures, expirationDate, expired, iconAssetToken, icons, individualTesters, lsMinimumSystemVersion, minOsVersion, perfPowerMetrics, preReleaseVersion, processingState, uploadedDate, usesNonExemptEncryption, version] |
| **fieldsBetaGroups** | **List&lt;String&gt;**| the fields to include for returned resources of type betaGroups | [optional] [enum: app, betaTesters, builds, createdDate, feedbackEnabled, hasAccessToAllBuilds, iosBuildsAvailableForAppleSiliconMac, isInternalGroup, name, publicLink, publicLinkEnabled, publicLinkId, publicLinkLimit, publicLinkLimitEnabled] |
| **limitApps** | **Integer**| maximum number of related apps returned (when they are included) | [optional] |
| **limitBetaGroups** | **Integer**| maximum number of related betaGroups returned (when they are included) | [optional] |
| **limitBuilds** | **Integer**| maximum number of related builds returned (when they are included) | [optional] |

### Return type

[**BetaTestersResponse**](BetaTestersResponse.md)

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
| **200** | List of BetaTesters |  -  |


## betaTestersGetInstance

> BetaTesterResponse betaTestersGetInstance(id, fieldsBetaTesters, include, fieldsApps, fieldsBuilds, fieldsBetaGroups, limitApps, limitBetaGroups, limitBuilds)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BetaTestersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BetaTestersApi apiInstance = new BetaTestersApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsBetaTesters = Arrays.asList(); // List<String> | the fields to include for returned resources of type betaTesters
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsApps = Arrays.asList(); // List<String> | the fields to include for returned resources of type apps
        List<String> fieldsBuilds = Arrays.asList(); // List<String> | the fields to include for returned resources of type builds
        List<String> fieldsBetaGroups = Arrays.asList(); // List<String> | the fields to include for returned resources of type betaGroups
        Integer limitApps = 56; // Integer | maximum number of related apps returned (when they are included)
        Integer limitBetaGroups = 56; // Integer | maximum number of related betaGroups returned (when they are included)
        Integer limitBuilds = 56; // Integer | maximum number of related builds returned (when they are included)
        try {
            BetaTesterResponse result = apiInstance.betaTestersGetInstance(id, fieldsBetaTesters, include, fieldsApps, fieldsBuilds, fieldsBetaGroups, limitApps, limitBetaGroups, limitBuilds);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BetaTestersApi#betaTestersGetInstance");
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
| **fieldsBetaTesters** | **List&lt;String&gt;**| the fields to include for returned resources of type betaTesters | [optional] [enum: apps, betaGroups, builds, email, firstName, inviteType, lastName, state] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: apps, betaGroups, builds] |
| **fieldsApps** | **List&lt;String&gt;**| the fields to include for returned resources of type apps | [optional] [enum: alternativeDistributionKey, analyticsReportRequests, appAvailability, appClips, appCustomProductPages, appEncryptionDeclarations, appEvents, appInfos, appPricePoints, appPriceSchedule, appStoreVersionExperimentsV2, appStoreVersions, betaAppLocalizations, betaAppReviewDetail, betaGroups, betaLicenseAgreement, betaTesters, builds, bundleId, ciProduct, contentRightsDeclaration, customerReviews, endUserLicenseAgreement, gameCenterDetail, gameCenterEnabledVersions, inAppPurchases, inAppPurchasesV2, isOrEverWasMadeForKids, marketplaceSearchDetail, name, perfPowerMetrics, preOrder, preReleaseVersions, primaryLocale, promotedPurchases, reviewSubmissions, sku, subscriptionGracePeriod, subscriptionGroups, subscriptionStatusUrl, subscriptionStatusUrlForSandbox, subscriptionStatusUrlVersion, subscriptionStatusUrlVersionForSandbox] |
| **fieldsBuilds** | **List&lt;String&gt;**| the fields to include for returned resources of type builds | [optional] [enum: app, appEncryptionDeclaration, appStoreVersion, betaAppReviewSubmission, betaBuildLocalizations, betaGroups, buildAudienceType, buildBetaDetail, buildBundles, computedMinMacOsVersion, diagnosticSignatures, expirationDate, expired, iconAssetToken, icons, individualTesters, lsMinimumSystemVersion, minOsVersion, perfPowerMetrics, preReleaseVersion, processingState, uploadedDate, usesNonExemptEncryption, version] |
| **fieldsBetaGroups** | **List&lt;String&gt;**| the fields to include for returned resources of type betaGroups | [optional] [enum: app, betaTesters, builds, createdDate, feedbackEnabled, hasAccessToAllBuilds, iosBuildsAvailableForAppleSiliconMac, isInternalGroup, name, publicLink, publicLinkEnabled, publicLinkId, publicLinkLimit, publicLinkLimitEnabled] |
| **limitApps** | **Integer**| maximum number of related apps returned (when they are included) | [optional] |
| **limitBetaGroups** | **Integer**| maximum number of related betaGroups returned (when they are included) | [optional] |
| **limitBuilds** | **Integer**| maximum number of related builds returned (when they are included) | [optional] |

### Return type

[**BetaTesterResponse**](BetaTesterResponse.md)

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
| **200** | Single BetaTester |  -  |

