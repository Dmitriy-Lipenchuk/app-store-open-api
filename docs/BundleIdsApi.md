# BundleIdsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**bundleIdsAppGetToOneRelated**](BundleIdsApi.md#bundleIdsAppGetToOneRelated) | **GET** /v1/bundleIds/{id}/app |  |
| [**bundleIdsBundleIdCapabilitiesGetToManyRelated**](BundleIdsApi.md#bundleIdsBundleIdCapabilitiesGetToManyRelated) | **GET** /v1/bundleIds/{id}/bundleIdCapabilities |  |
| [**bundleIdsCreateInstance**](BundleIdsApi.md#bundleIdsCreateInstance) | **POST** /v1/bundleIds |  |
| [**bundleIdsDeleteInstance**](BundleIdsApi.md#bundleIdsDeleteInstance) | **DELETE** /v1/bundleIds/{id} |  |
| [**bundleIdsGetCollection**](BundleIdsApi.md#bundleIdsGetCollection) | **GET** /v1/bundleIds |  |
| [**bundleIdsGetInstance**](BundleIdsApi.md#bundleIdsGetInstance) | **GET** /v1/bundleIds/{id} |  |
| [**bundleIdsProfilesGetToManyRelated**](BundleIdsApi.md#bundleIdsProfilesGetToManyRelated) | **GET** /v1/bundleIds/{id}/profiles |  |
| [**bundleIdsUpdateInstance**](BundleIdsApi.md#bundleIdsUpdateInstance) | **PATCH** /v1/bundleIds/{id} |  |



## bundleIdsAppGetToOneRelated

> AppWithoutIncludesResponse bundleIdsAppGetToOneRelated(id, fieldsApps)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BundleIdsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BundleIdsApi apiInstance = new BundleIdsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsApps = Arrays.asList(); // List<String> | the fields to include for returned resources of type apps
        try {
            AppWithoutIncludesResponse result = apiInstance.bundleIdsAppGetToOneRelated(id, fieldsApps);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BundleIdsApi#bundleIdsAppGetToOneRelated");
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


## bundleIdsBundleIdCapabilitiesGetToManyRelated

> BundleIdCapabilitiesWithoutIncludesResponse bundleIdsBundleIdCapabilitiesGetToManyRelated(id, fieldsBundleIdCapabilities, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BundleIdsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BundleIdsApi apiInstance = new BundleIdsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsBundleIdCapabilities = Arrays.asList(); // List<String> | the fields to include for returned resources of type bundleIdCapabilities
        Integer limit = 56; // Integer | maximum resources per page
        try {
            BundleIdCapabilitiesWithoutIncludesResponse result = apiInstance.bundleIdsBundleIdCapabilitiesGetToManyRelated(id, fieldsBundleIdCapabilities, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BundleIdsApi#bundleIdsBundleIdCapabilitiesGetToManyRelated");
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
| **fieldsBundleIdCapabilities** | **List&lt;String&gt;**| the fields to include for returned resources of type bundleIdCapabilities | [optional] [enum: bundleId, capabilityType, settings] |
| **limit** | **Integer**| maximum resources per page | [optional] |

### Return type

[**BundleIdCapabilitiesWithoutIncludesResponse**](BundleIdCapabilitiesWithoutIncludesResponse.md)

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
| **200** | List of BundleIdCapabilities with get |  -  |


## bundleIdsCreateInstance

> BundleIdResponse bundleIdsCreateInstance(bundleIdCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BundleIdsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BundleIdsApi apiInstance = new BundleIdsApi(defaultClient);
        BundleIdCreateRequest bundleIdCreateRequest = new BundleIdCreateRequest(); // BundleIdCreateRequest | BundleId representation
        try {
            BundleIdResponse result = apiInstance.bundleIdsCreateInstance(bundleIdCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BundleIdsApi#bundleIdsCreateInstance");
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
| **bundleIdCreateRequest** | [**BundleIdCreateRequest**](BundleIdCreateRequest.md)| BundleId representation | |

### Return type

[**BundleIdResponse**](BundleIdResponse.md)

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
| **201** | Single BundleId |  -  |
| **409** | Request entity error(s) |  -  |


## bundleIdsDeleteInstance

> bundleIdsDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BundleIdsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BundleIdsApi apiInstance = new BundleIdsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.bundleIdsDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling BundleIdsApi#bundleIdsDeleteInstance");
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


## bundleIdsGetCollection

> BundleIdsResponse bundleIdsGetCollection(filterIdentifier, filterName, filterPlatform, filterSeedId, filterId, sort, fieldsBundleIds, limit, include, fieldsBundleIdCapabilities, fieldsProfiles, fieldsApps, limitBundleIdCapabilities, limitProfiles)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BundleIdsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BundleIdsApi apiInstance = new BundleIdsApi(defaultClient);
        List<String> filterIdentifier = Arrays.asList(); // List<String> | filter by attribute 'identifier'
        List<String> filterName = Arrays.asList(); // List<String> | filter by attribute 'name'
        List<String> filterPlatform = Arrays.asList(); // List<String> | filter by attribute 'platform'
        List<String> filterSeedId = Arrays.asList(); // List<String> | filter by attribute 'seedId'
        List<String> filterId = Arrays.asList(); // List<String> | filter by id(s)
        List<String> sort = Arrays.asList(); // List<String> | comma-separated list of sort expressions; resources will be sorted as specified
        List<String> fieldsBundleIds = Arrays.asList(); // List<String> | the fields to include for returned resources of type bundleIds
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsBundleIdCapabilities = Arrays.asList(); // List<String> | the fields to include for returned resources of type bundleIdCapabilities
        List<String> fieldsProfiles = Arrays.asList(); // List<String> | the fields to include for returned resources of type profiles
        List<String> fieldsApps = Arrays.asList(); // List<String> | the fields to include for returned resources of type apps
        Integer limitBundleIdCapabilities = 56; // Integer | maximum number of related bundleIdCapabilities returned (when they are included)
        Integer limitProfiles = 56; // Integer | maximum number of related profiles returned (when they are included)
        try {
            BundleIdsResponse result = apiInstance.bundleIdsGetCollection(filterIdentifier, filterName, filterPlatform, filterSeedId, filterId, sort, fieldsBundleIds, limit, include, fieldsBundleIdCapabilities, fieldsProfiles, fieldsApps, limitBundleIdCapabilities, limitProfiles);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BundleIdsApi#bundleIdsGetCollection");
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
| **filterIdentifier** | **List&lt;String&gt;**| filter by attribute &#39;identifier&#39; | [optional] |
| **filterName** | **List&lt;String&gt;**| filter by attribute &#39;name&#39; | [optional] |
| **filterPlatform** | **List&lt;String&gt;**| filter by attribute &#39;platform&#39; | [optional] [enum: IOS, MAC_OS] |
| **filterSeedId** | **List&lt;String&gt;**| filter by attribute &#39;seedId&#39; | [optional] |
| **filterId** | **List&lt;String&gt;**| filter by id(s) | [optional] |
| **sort** | **List&lt;String&gt;**| comma-separated list of sort expressions; resources will be sorted as specified | [optional] [enum: id, -id, identifier, -identifier, name, -name, platform, -platform, seedId, -seedId] |
| **fieldsBundleIds** | **List&lt;String&gt;**| the fields to include for returned resources of type bundleIds | [optional] [enum: app, bundleIdCapabilities, identifier, name, platform, profiles, seedId] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: app, bundleIdCapabilities, profiles] |
| **fieldsBundleIdCapabilities** | **List&lt;String&gt;**| the fields to include for returned resources of type bundleIdCapabilities | [optional] [enum: bundleId, capabilityType, settings] |
| **fieldsProfiles** | **List&lt;String&gt;**| the fields to include for returned resources of type profiles | [optional] [enum: bundleId, certificates, createdDate, devices, expirationDate, name, platform, profileContent, profileState, profileType, uuid] |
| **fieldsApps** | **List&lt;String&gt;**| the fields to include for returned resources of type apps | [optional] [enum: alternativeDistributionKey, analyticsReportRequests, appAvailability, appClips, appCustomProductPages, appEncryptionDeclarations, appEvents, appInfos, appPricePoints, appPriceSchedule, appStoreVersionExperimentsV2, appStoreVersions, betaAppLocalizations, betaAppReviewDetail, betaGroups, betaLicenseAgreement, betaTesters, builds, bundleId, ciProduct, contentRightsDeclaration, customerReviews, endUserLicenseAgreement, gameCenterDetail, gameCenterEnabledVersions, inAppPurchases, inAppPurchasesV2, isOrEverWasMadeForKids, marketplaceSearchDetail, name, perfPowerMetrics, preOrder, preReleaseVersions, primaryLocale, promotedPurchases, reviewSubmissions, sku, subscriptionGracePeriod, subscriptionGroups, subscriptionStatusUrl, subscriptionStatusUrlForSandbox, subscriptionStatusUrlVersion, subscriptionStatusUrlVersionForSandbox] |
| **limitBundleIdCapabilities** | **Integer**| maximum number of related bundleIdCapabilities returned (when they are included) | [optional] |
| **limitProfiles** | **Integer**| maximum number of related profiles returned (when they are included) | [optional] |

### Return type

[**BundleIdsResponse**](BundleIdsResponse.md)

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
| **200** | List of BundleIds |  -  |


## bundleIdsGetInstance

> BundleIdResponse bundleIdsGetInstance(id, fieldsBundleIds, include, fieldsBundleIdCapabilities, fieldsProfiles, fieldsApps, limitBundleIdCapabilities, limitProfiles)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BundleIdsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BundleIdsApi apiInstance = new BundleIdsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsBundleIds = Arrays.asList(); // List<String> | the fields to include for returned resources of type bundleIds
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsBundleIdCapabilities = Arrays.asList(); // List<String> | the fields to include for returned resources of type bundleIdCapabilities
        List<String> fieldsProfiles = Arrays.asList(); // List<String> | the fields to include for returned resources of type profiles
        List<String> fieldsApps = Arrays.asList(); // List<String> | the fields to include for returned resources of type apps
        Integer limitBundleIdCapabilities = 56; // Integer | maximum number of related bundleIdCapabilities returned (when they are included)
        Integer limitProfiles = 56; // Integer | maximum number of related profiles returned (when they are included)
        try {
            BundleIdResponse result = apiInstance.bundleIdsGetInstance(id, fieldsBundleIds, include, fieldsBundleIdCapabilities, fieldsProfiles, fieldsApps, limitBundleIdCapabilities, limitProfiles);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BundleIdsApi#bundleIdsGetInstance");
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
| **fieldsBundleIds** | **List&lt;String&gt;**| the fields to include for returned resources of type bundleIds | [optional] [enum: app, bundleIdCapabilities, identifier, name, platform, profiles, seedId] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: app, bundleIdCapabilities, profiles] |
| **fieldsBundleIdCapabilities** | **List&lt;String&gt;**| the fields to include for returned resources of type bundleIdCapabilities | [optional] [enum: bundleId, capabilityType, settings] |
| **fieldsProfiles** | **List&lt;String&gt;**| the fields to include for returned resources of type profiles | [optional] [enum: bundleId, certificates, createdDate, devices, expirationDate, name, platform, profileContent, profileState, profileType, uuid] |
| **fieldsApps** | **List&lt;String&gt;**| the fields to include for returned resources of type apps | [optional] [enum: alternativeDistributionKey, analyticsReportRequests, appAvailability, appClips, appCustomProductPages, appEncryptionDeclarations, appEvents, appInfos, appPricePoints, appPriceSchedule, appStoreVersionExperimentsV2, appStoreVersions, betaAppLocalizations, betaAppReviewDetail, betaGroups, betaLicenseAgreement, betaTesters, builds, bundleId, ciProduct, contentRightsDeclaration, customerReviews, endUserLicenseAgreement, gameCenterDetail, gameCenterEnabledVersions, inAppPurchases, inAppPurchasesV2, isOrEverWasMadeForKids, marketplaceSearchDetail, name, perfPowerMetrics, preOrder, preReleaseVersions, primaryLocale, promotedPurchases, reviewSubmissions, sku, subscriptionGracePeriod, subscriptionGroups, subscriptionStatusUrl, subscriptionStatusUrlForSandbox, subscriptionStatusUrlVersion, subscriptionStatusUrlVersionForSandbox] |
| **limitBundleIdCapabilities** | **Integer**| maximum number of related bundleIdCapabilities returned (when they are included) | [optional] |
| **limitProfiles** | **Integer**| maximum number of related profiles returned (when they are included) | [optional] |

### Return type

[**BundleIdResponse**](BundleIdResponse.md)

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
| **200** | Single BundleId |  -  |


## bundleIdsProfilesGetToManyRelated

> ProfilesWithoutIncludesResponse bundleIdsProfilesGetToManyRelated(id, fieldsProfiles, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BundleIdsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BundleIdsApi apiInstance = new BundleIdsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsProfiles = Arrays.asList(); // List<String> | the fields to include for returned resources of type profiles
        Integer limit = 56; // Integer | maximum resources per page
        try {
            ProfilesWithoutIncludesResponse result = apiInstance.bundleIdsProfilesGetToManyRelated(id, fieldsProfiles, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BundleIdsApi#bundleIdsProfilesGetToManyRelated");
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
| **fieldsProfiles** | **List&lt;String&gt;**| the fields to include for returned resources of type profiles | [optional] [enum: bundleId, certificates, createdDate, devices, expirationDate, name, platform, profileContent, profileState, profileType, uuid] |
| **limit** | **Integer**| maximum resources per page | [optional] |

### Return type

[**ProfilesWithoutIncludesResponse**](ProfilesWithoutIncludesResponse.md)

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
| **200** | List of Profiles with get |  -  |


## bundleIdsUpdateInstance

> BundleIdResponse bundleIdsUpdateInstance(id, bundleIdUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BundleIdsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BundleIdsApi apiInstance = new BundleIdsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        BundleIdUpdateRequest bundleIdUpdateRequest = new BundleIdUpdateRequest(); // BundleIdUpdateRequest | BundleId representation
        try {
            BundleIdResponse result = apiInstance.bundleIdsUpdateInstance(id, bundleIdUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BundleIdsApi#bundleIdsUpdateInstance");
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
| **bundleIdUpdateRequest** | [**BundleIdUpdateRequest**](BundleIdUpdateRequest.md)| BundleId representation | |

### Return type

[**BundleIdResponse**](BundleIdResponse.md)

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
| **200** | Single BundleId |  -  |
| **409** | Request entity error(s) |  -  |

