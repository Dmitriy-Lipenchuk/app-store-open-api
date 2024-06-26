# GameCenterAppVersionsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**gameCenterAppVersionsAppStoreVersionGetToOneRelated**](GameCenterAppVersionsApi.md#gameCenterAppVersionsAppStoreVersionGetToOneRelated) | **GET** /v1/gameCenterAppVersions/{id}/appStoreVersion |  |
| [**gameCenterAppVersionsCompatibilityVersionsCreateToManyRelationship**](GameCenterAppVersionsApi.md#gameCenterAppVersionsCompatibilityVersionsCreateToManyRelationship) | **POST** /v1/gameCenterAppVersions/{id}/relationships/compatibilityVersions |  |
| [**gameCenterAppVersionsCompatibilityVersionsDeleteToManyRelationship**](GameCenterAppVersionsApi.md#gameCenterAppVersionsCompatibilityVersionsDeleteToManyRelationship) | **DELETE** /v1/gameCenterAppVersions/{id}/relationships/compatibilityVersions |  |
| [**gameCenterAppVersionsCompatibilityVersionsGetToManyRelated**](GameCenterAppVersionsApi.md#gameCenterAppVersionsCompatibilityVersionsGetToManyRelated) | **GET** /v1/gameCenterAppVersions/{id}/compatibilityVersions |  |
| [**gameCenterAppVersionsCompatibilityVersionsGetToManyRelationship**](GameCenterAppVersionsApi.md#gameCenterAppVersionsCompatibilityVersionsGetToManyRelationship) | **GET** /v1/gameCenterAppVersions/{id}/relationships/compatibilityVersions |  |
| [**gameCenterAppVersionsCreateInstance**](GameCenterAppVersionsApi.md#gameCenterAppVersionsCreateInstance) | **POST** /v1/gameCenterAppVersions |  |
| [**gameCenterAppVersionsGetInstance**](GameCenterAppVersionsApi.md#gameCenterAppVersionsGetInstance) | **GET** /v1/gameCenterAppVersions/{id} |  |
| [**gameCenterAppVersionsUpdateInstance**](GameCenterAppVersionsApi.md#gameCenterAppVersionsUpdateInstance) | **PATCH** /v1/gameCenterAppVersions/{id} |  |



## gameCenterAppVersionsAppStoreVersionGetToOneRelated

> AppStoreVersionResponse gameCenterAppVersionsAppStoreVersionGetToOneRelated(id, fieldsAgeRatingDeclarations, fieldsAppStoreReviewDetails, fieldsAppStoreVersionLocalizations, fieldsAppStoreVersionExperiments, fieldsAppStoreVersionSubmissions, fieldsAlternativeDistributionPackages, fieldsAppStoreVersions, fieldsApps, fieldsRoutingAppCoverages, fieldsAppClipDefaultExperiences, fieldsAppStoreVersionPhasedReleases, fieldsBuilds, limitAppStoreVersionLocalizations, limitAppStoreVersionExperiments, limitAppStoreVersionExperimentsV2, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterAppVersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterAppVersionsApi apiInstance = new GameCenterAppVersionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAgeRatingDeclarations = Arrays.asList(); // List<String> | the fields to include for returned resources of type ageRatingDeclarations
        List<String> fieldsAppStoreReviewDetails = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreReviewDetails
        List<String> fieldsAppStoreVersionLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersionLocalizations
        List<String> fieldsAppStoreVersionExperiments = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersionExperiments
        List<String> fieldsAppStoreVersionSubmissions = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersionSubmissions
        List<String> fieldsAlternativeDistributionPackages = Arrays.asList(); // List<String> | the fields to include for returned resources of type alternativeDistributionPackages
        List<String> fieldsAppStoreVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersions
        List<String> fieldsApps = Arrays.asList(); // List<String> | the fields to include for returned resources of type apps
        List<String> fieldsRoutingAppCoverages = Arrays.asList(); // List<String> | the fields to include for returned resources of type routingAppCoverages
        List<String> fieldsAppClipDefaultExperiences = Arrays.asList(); // List<String> | the fields to include for returned resources of type appClipDefaultExperiences
        List<String> fieldsAppStoreVersionPhasedReleases = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersionPhasedReleases
        List<String> fieldsBuilds = Arrays.asList(); // List<String> | the fields to include for returned resources of type builds
        Integer limitAppStoreVersionLocalizations = 56; // Integer | maximum number of related appStoreVersionLocalizations returned (when they are included)
        Integer limitAppStoreVersionExperiments = 56; // Integer | maximum number of related appStoreVersionExperiments returned (when they are included)
        Integer limitAppStoreVersionExperimentsV2 = 56; // Integer | maximum number of related appStoreVersionExperimentsV2 returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            AppStoreVersionResponse result = apiInstance.gameCenterAppVersionsAppStoreVersionGetToOneRelated(id, fieldsAgeRatingDeclarations, fieldsAppStoreReviewDetails, fieldsAppStoreVersionLocalizations, fieldsAppStoreVersionExperiments, fieldsAppStoreVersionSubmissions, fieldsAlternativeDistributionPackages, fieldsAppStoreVersions, fieldsApps, fieldsRoutingAppCoverages, fieldsAppClipDefaultExperiences, fieldsAppStoreVersionPhasedReleases, fieldsBuilds, limitAppStoreVersionLocalizations, limitAppStoreVersionExperiments, limitAppStoreVersionExperimentsV2, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterAppVersionsApi#gameCenterAppVersionsAppStoreVersionGetToOneRelated");
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
| **fieldsAgeRatingDeclarations** | **List&lt;String&gt;**| the fields to include for returned resources of type ageRatingDeclarations | [optional] [enum: ageRatingOverride, alcoholTobaccoOrDrugUseOrReferences, contests, gambling, gamblingAndContests, gamblingSimulated, horrorOrFearThemes, kidsAgeBand, matureOrSuggestiveThemes, medicalOrTreatmentInformation, profanityOrCrudeHumor, seventeenPlus, sexualContentGraphicAndNudity, sexualContentOrNudity, unrestrictedWebAccess, violenceCartoonOrFantasy, violenceRealistic, violenceRealisticProlongedGraphicOrSadistic] |
| **fieldsAppStoreReviewDetails** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreReviewDetails | [optional] [enum: appStoreReviewAttachments, appStoreVersion, contactEmail, contactFirstName, contactLastName, contactPhone, demoAccountName, demoAccountPassword, demoAccountRequired, notes] |
| **fieldsAppStoreVersionLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersionLocalizations | [optional] [enum: appPreviewSets, appScreenshotSets, appStoreVersion, description, keywords, locale, marketingUrl, promotionalText, supportUrl, whatsNew] |
| **fieldsAppStoreVersionExperiments** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersionExperiments | [optional] [enum: app, appStoreVersion, appStoreVersionExperimentTreatments, controlVersions, endDate, latestControlVersion, name, platform, reviewRequired, startDate, started, state, trafficProportion] |
| **fieldsAppStoreVersionSubmissions** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersionSubmissions | [optional] [enum: appStoreVersion] |
| **fieldsAlternativeDistributionPackages** | **List&lt;String&gt;**| the fields to include for returned resources of type alternativeDistributionPackages | [optional] [enum: appStoreVersion, versions] |
| **fieldsAppStoreVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersions | [optional] [enum: ageRatingDeclaration, alternativeDistributionPackage, app, appClipDefaultExperience, appStoreReviewDetail, appStoreState, appStoreVersionExperiments, appStoreVersionExperimentsV2, appStoreVersionLocalizations, appStoreVersionPhasedRelease, appStoreVersionSubmission, appVersionState, build, copyright, createdDate, customerReviews, downloadable, earliestReleaseDate, platform, releaseType, reviewType, routingAppCoverage, versionString] |
| **fieldsApps** | **List&lt;String&gt;**| the fields to include for returned resources of type apps | [optional] [enum: alternativeDistributionKey, analyticsReportRequests, appAvailability, appClips, appCustomProductPages, appEncryptionDeclarations, appEvents, appInfos, appPricePoints, appPriceSchedule, appStoreVersionExperimentsV2, appStoreVersions, betaAppLocalizations, betaAppReviewDetail, betaGroups, betaLicenseAgreement, betaTesters, builds, bundleId, ciProduct, contentRightsDeclaration, customerReviews, endUserLicenseAgreement, gameCenterDetail, gameCenterEnabledVersions, inAppPurchases, inAppPurchasesV2, isOrEverWasMadeForKids, marketplaceSearchDetail, name, perfPowerMetrics, preOrder, preReleaseVersions, primaryLocale, promotedPurchases, reviewSubmissions, sku, subscriptionGracePeriod, subscriptionGroups, subscriptionStatusUrl, subscriptionStatusUrlForSandbox, subscriptionStatusUrlVersion, subscriptionStatusUrlVersionForSandbox] |
| **fieldsRoutingAppCoverages** | **List&lt;String&gt;**| the fields to include for returned resources of type routingAppCoverages | [optional] [enum: appStoreVersion, assetDeliveryState, fileName, fileSize, sourceFileChecksum, uploadOperations, uploaded] |
| **fieldsAppClipDefaultExperiences** | **List&lt;String&gt;**| the fields to include for returned resources of type appClipDefaultExperiences | [optional] [enum: action, appClip, appClipAppStoreReviewDetail, appClipDefaultExperienceLocalizations, appClipDefaultExperienceTemplate, releaseWithAppStoreVersion] |
| **fieldsAppStoreVersionPhasedReleases** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersionPhasedReleases | [optional] [enum: appStoreVersion, currentDayNumber, phasedReleaseState, startDate, totalPauseDuration] |
| **fieldsBuilds** | **List&lt;String&gt;**| the fields to include for returned resources of type builds | [optional] [enum: app, appEncryptionDeclaration, appStoreVersion, betaAppReviewSubmission, betaBuildLocalizations, betaGroups, buildAudienceType, buildBetaDetail, buildBundles, computedMinMacOsVersion, diagnosticSignatures, expirationDate, expired, iconAssetToken, icons, individualTesters, lsMinimumSystemVersion, minOsVersion, perfPowerMetrics, preReleaseVersion, processingState, uploadedDate, usesNonExemptEncryption, version] |
| **limitAppStoreVersionLocalizations** | **Integer**| maximum number of related appStoreVersionLocalizations returned (when they are included) | [optional] |
| **limitAppStoreVersionExperiments** | **Integer**| maximum number of related appStoreVersionExperiments returned (when they are included) | [optional] |
| **limitAppStoreVersionExperimentsV2** | **Integer**| maximum number of related appStoreVersionExperimentsV2 returned (when they are included) | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: ageRatingDeclaration, alternativeDistributionPackage, app, appClipDefaultExperience, appStoreReviewDetail, appStoreVersionExperiments, appStoreVersionExperimentsV2, appStoreVersionLocalizations, appStoreVersionPhasedRelease, appStoreVersionSubmission, build, routingAppCoverage] |

### Return type

[**AppStoreVersionResponse**](AppStoreVersionResponse.md)

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
| **200** | Single AppStoreVersion |  -  |


## gameCenterAppVersionsCompatibilityVersionsCreateToManyRelationship

> gameCenterAppVersionsCompatibilityVersionsCreateToManyRelationship(id, gameCenterAppVersionCompatibilityVersionsLinkagesRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterAppVersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterAppVersionsApi apiInstance = new GameCenterAppVersionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        GameCenterAppVersionCompatibilityVersionsLinkagesRequest gameCenterAppVersionCompatibilityVersionsLinkagesRequest = new GameCenterAppVersionCompatibilityVersionsLinkagesRequest(); // GameCenterAppVersionCompatibilityVersionsLinkagesRequest | List of related linkages
        try {
            apiInstance.gameCenterAppVersionsCompatibilityVersionsCreateToManyRelationship(id, gameCenterAppVersionCompatibilityVersionsLinkagesRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterAppVersionsApi#gameCenterAppVersionsCompatibilityVersionsCreateToManyRelationship");
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
| **gameCenterAppVersionCompatibilityVersionsLinkagesRequest** | [**GameCenterAppVersionCompatibilityVersionsLinkagesRequest**](GameCenterAppVersionCompatibilityVersionsLinkagesRequest.md)| List of related linkages | |

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


## gameCenterAppVersionsCompatibilityVersionsDeleteToManyRelationship

> gameCenterAppVersionsCompatibilityVersionsDeleteToManyRelationship(id, gameCenterAppVersionCompatibilityVersionsLinkagesRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterAppVersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterAppVersionsApi apiInstance = new GameCenterAppVersionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        GameCenterAppVersionCompatibilityVersionsLinkagesRequest gameCenterAppVersionCompatibilityVersionsLinkagesRequest = new GameCenterAppVersionCompatibilityVersionsLinkagesRequest(); // GameCenterAppVersionCompatibilityVersionsLinkagesRequest | List of related linkages
        try {
            apiInstance.gameCenterAppVersionsCompatibilityVersionsDeleteToManyRelationship(id, gameCenterAppVersionCompatibilityVersionsLinkagesRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterAppVersionsApi#gameCenterAppVersionsCompatibilityVersionsDeleteToManyRelationship");
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
| **gameCenterAppVersionCompatibilityVersionsLinkagesRequest** | [**GameCenterAppVersionCompatibilityVersionsLinkagesRequest**](GameCenterAppVersionCompatibilityVersionsLinkagesRequest.md)| List of related linkages | |

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


## gameCenterAppVersionsCompatibilityVersionsGetToManyRelated

> GameCenterAppVersionsResponse gameCenterAppVersionsCompatibilityVersionsGetToManyRelated(id, filterEnabled, fieldsAppStoreVersions, fieldsGameCenterAppVersions, limit, limitCompatibilityVersions, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterAppVersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterAppVersionsApi apiInstance = new GameCenterAppVersionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> filterEnabled = Arrays.asList(); // List<String> | filter by attribute 'enabled'
        List<String> fieldsAppStoreVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersions
        List<String> fieldsGameCenterAppVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterAppVersions
        Integer limit = 56; // Integer | maximum resources per page
        Integer limitCompatibilityVersions = 56; // Integer | maximum number of related compatibilityVersions returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            GameCenterAppVersionsResponse result = apiInstance.gameCenterAppVersionsCompatibilityVersionsGetToManyRelated(id, filterEnabled, fieldsAppStoreVersions, fieldsGameCenterAppVersions, limit, limitCompatibilityVersions, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterAppVersionsApi#gameCenterAppVersionsCompatibilityVersionsGetToManyRelated");
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
| **filterEnabled** | **List&lt;String&gt;**| filter by attribute &#39;enabled&#39; | [optional] |
| **fieldsAppStoreVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersions | [optional] [enum: ageRatingDeclaration, alternativeDistributionPackage, app, appClipDefaultExperience, appStoreReviewDetail, appStoreState, appStoreVersionExperiments, appStoreVersionExperimentsV2, appStoreVersionLocalizations, appStoreVersionPhasedRelease, appStoreVersionSubmission, appVersionState, build, copyright, createdDate, customerReviews, downloadable, earliestReleaseDate, platform, releaseType, reviewType, routingAppCoverage, versionString] |
| **fieldsGameCenterAppVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterAppVersions | [optional] [enum: appStoreVersion, compatibilityVersions, enabled] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **limitCompatibilityVersions** | **Integer**| maximum number of related compatibilityVersions returned (when they are included) | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: appStoreVersion, compatibilityVersions] |

### Return type

[**GameCenterAppVersionsResponse**](GameCenterAppVersionsResponse.md)

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
| **200** | List of GameCenterAppVersions |  -  |


## gameCenterAppVersionsCompatibilityVersionsGetToManyRelationship

> GameCenterAppVersionCompatibilityVersionsLinkagesResponse gameCenterAppVersionsCompatibilityVersionsGetToManyRelationship(id, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterAppVersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterAppVersionsApi apiInstance = new GameCenterAppVersionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        Integer limit = 56; // Integer | maximum resources per page
        try {
            GameCenterAppVersionCompatibilityVersionsLinkagesResponse result = apiInstance.gameCenterAppVersionsCompatibilityVersionsGetToManyRelationship(id, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterAppVersionsApi#gameCenterAppVersionsCompatibilityVersionsGetToManyRelationship");
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

[**GameCenterAppVersionCompatibilityVersionsLinkagesResponse**](GameCenterAppVersionCompatibilityVersionsLinkagesResponse.md)

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


## gameCenterAppVersionsCreateInstance

> GameCenterAppVersionResponse gameCenterAppVersionsCreateInstance(gameCenterAppVersionCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterAppVersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterAppVersionsApi apiInstance = new GameCenterAppVersionsApi(defaultClient);
        GameCenterAppVersionCreateRequest gameCenterAppVersionCreateRequest = new GameCenterAppVersionCreateRequest(); // GameCenterAppVersionCreateRequest | GameCenterAppVersion representation
        try {
            GameCenterAppVersionResponse result = apiInstance.gameCenterAppVersionsCreateInstance(gameCenterAppVersionCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterAppVersionsApi#gameCenterAppVersionsCreateInstance");
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
| **gameCenterAppVersionCreateRequest** | [**GameCenterAppVersionCreateRequest**](GameCenterAppVersionCreateRequest.md)| GameCenterAppVersion representation | |

### Return type

[**GameCenterAppVersionResponse**](GameCenterAppVersionResponse.md)

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
| **201** | Single GameCenterAppVersion |  -  |
| **409** | Request entity error(s) |  -  |


## gameCenterAppVersionsGetInstance

> GameCenterAppVersionResponse gameCenterAppVersionsGetInstance(id, fieldsGameCenterAppVersions, include, fieldsAppStoreVersions, limitCompatibilityVersions)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterAppVersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterAppVersionsApi apiInstance = new GameCenterAppVersionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsGameCenterAppVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterAppVersions
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsAppStoreVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersions
        Integer limitCompatibilityVersions = 56; // Integer | maximum number of related compatibilityVersions returned (when they are included)
        try {
            GameCenterAppVersionResponse result = apiInstance.gameCenterAppVersionsGetInstance(id, fieldsGameCenterAppVersions, include, fieldsAppStoreVersions, limitCompatibilityVersions);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterAppVersionsApi#gameCenterAppVersionsGetInstance");
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
| **fieldsGameCenterAppVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterAppVersions | [optional] [enum: appStoreVersion, compatibilityVersions, enabled] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: appStoreVersion, compatibilityVersions] |
| **fieldsAppStoreVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersions | [optional] [enum: ageRatingDeclaration, alternativeDistributionPackage, app, appClipDefaultExperience, appStoreReviewDetail, appStoreState, appStoreVersionExperiments, appStoreVersionExperimentsV2, appStoreVersionLocalizations, appStoreVersionPhasedRelease, appStoreVersionSubmission, appVersionState, build, copyright, createdDate, customerReviews, downloadable, earliestReleaseDate, platform, releaseType, reviewType, routingAppCoverage, versionString] |
| **limitCompatibilityVersions** | **Integer**| maximum number of related compatibilityVersions returned (when they are included) | [optional] |

### Return type

[**GameCenterAppVersionResponse**](GameCenterAppVersionResponse.md)

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
| **200** | Single GameCenterAppVersion |  -  |


## gameCenterAppVersionsUpdateInstance

> GameCenterAppVersionResponse gameCenterAppVersionsUpdateInstance(id, gameCenterAppVersionUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterAppVersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterAppVersionsApi apiInstance = new GameCenterAppVersionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        GameCenterAppVersionUpdateRequest gameCenterAppVersionUpdateRequest = new GameCenterAppVersionUpdateRequest(); // GameCenterAppVersionUpdateRequest | GameCenterAppVersion representation
        try {
            GameCenterAppVersionResponse result = apiInstance.gameCenterAppVersionsUpdateInstance(id, gameCenterAppVersionUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterAppVersionsApi#gameCenterAppVersionsUpdateInstance");
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
| **gameCenterAppVersionUpdateRequest** | [**GameCenterAppVersionUpdateRequest**](GameCenterAppVersionUpdateRequest.md)| GameCenterAppVersion representation | |

### Return type

[**GameCenterAppVersionResponse**](GameCenterAppVersionResponse.md)

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
| **200** | Single GameCenterAppVersion |  -  |
| **409** | Request entity error(s) |  -  |

