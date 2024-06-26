# BuildsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**buildsAppEncryptionDeclarationGetToOneRelated**](BuildsApi.md#buildsAppEncryptionDeclarationGetToOneRelated) | **GET** /v1/builds/{id}/appEncryptionDeclaration |  |
| [**buildsAppEncryptionDeclarationGetToOneRelationship**](BuildsApi.md#buildsAppEncryptionDeclarationGetToOneRelationship) | **GET** /v1/builds/{id}/relationships/appEncryptionDeclaration |  |
| [**buildsAppEncryptionDeclarationUpdateToOneRelationship**](BuildsApi.md#buildsAppEncryptionDeclarationUpdateToOneRelationship) | **PATCH** /v1/builds/{id}/relationships/appEncryptionDeclaration |  |
| [**buildsAppGetToOneRelated**](BuildsApi.md#buildsAppGetToOneRelated) | **GET** /v1/builds/{id}/app |  |
| [**buildsAppStoreVersionGetToOneRelated**](BuildsApi.md#buildsAppStoreVersionGetToOneRelated) | **GET** /v1/builds/{id}/appStoreVersion |  |
| [**buildsBetaAppReviewSubmissionGetToOneRelated**](BuildsApi.md#buildsBetaAppReviewSubmissionGetToOneRelated) | **GET** /v1/builds/{id}/betaAppReviewSubmission |  |
| [**buildsBetaBuildLocalizationsGetToManyRelated**](BuildsApi.md#buildsBetaBuildLocalizationsGetToManyRelated) | **GET** /v1/builds/{id}/betaBuildLocalizations |  |
| [**buildsBetaBuildUsagesGetMetrics**](BuildsApi.md#buildsBetaBuildUsagesGetMetrics) | **GET** /v1/builds/{id}/metrics/betaBuildUsages |  |
| [**buildsBetaGroupsCreateToManyRelationship**](BuildsApi.md#buildsBetaGroupsCreateToManyRelationship) | **POST** /v1/builds/{id}/relationships/betaGroups |  |
| [**buildsBetaGroupsDeleteToManyRelationship**](BuildsApi.md#buildsBetaGroupsDeleteToManyRelationship) | **DELETE** /v1/builds/{id}/relationships/betaGroups |  |
| [**buildsBuildBetaDetailGetToOneRelated**](BuildsApi.md#buildsBuildBetaDetailGetToOneRelated) | **GET** /v1/builds/{id}/buildBetaDetail |  |
| [**buildsDiagnosticSignaturesGetToManyRelated**](BuildsApi.md#buildsDiagnosticSignaturesGetToManyRelated) | **GET** /v1/builds/{id}/diagnosticSignatures |  |
| [**buildsGetCollection**](BuildsApi.md#buildsGetCollection) | **GET** /v1/builds |  |
| [**buildsGetInstance**](BuildsApi.md#buildsGetInstance) | **GET** /v1/builds/{id} |  |
| [**buildsIconsGetToManyRelated**](BuildsApi.md#buildsIconsGetToManyRelated) | **GET** /v1/builds/{id}/icons |  |
| [**buildsIndividualTestersCreateToManyRelationship**](BuildsApi.md#buildsIndividualTestersCreateToManyRelationship) | **POST** /v1/builds/{id}/relationships/individualTesters |  |
| [**buildsIndividualTestersDeleteToManyRelationship**](BuildsApi.md#buildsIndividualTestersDeleteToManyRelationship) | **DELETE** /v1/builds/{id}/relationships/individualTesters |  |
| [**buildsIndividualTestersGetToManyRelated**](BuildsApi.md#buildsIndividualTestersGetToManyRelated) | **GET** /v1/builds/{id}/individualTesters |  |
| [**buildsIndividualTestersGetToManyRelationship**](BuildsApi.md#buildsIndividualTestersGetToManyRelationship) | **GET** /v1/builds/{id}/relationships/individualTesters |  |
| [**buildsPerfPowerMetricsGetToManyRelated**](BuildsApi.md#buildsPerfPowerMetricsGetToManyRelated) | **GET** /v1/builds/{id}/perfPowerMetrics |  |
| [**buildsPreReleaseVersionGetToOneRelated**](BuildsApi.md#buildsPreReleaseVersionGetToOneRelated) | **GET** /v1/builds/{id}/preReleaseVersion |  |
| [**buildsUpdateInstance**](BuildsApi.md#buildsUpdateInstance) | **PATCH** /v1/builds/{id} |  |



## buildsAppEncryptionDeclarationGetToOneRelated

> AppEncryptionDeclarationWithoutIncludesResponse buildsAppEncryptionDeclarationGetToOneRelated(id, fieldsAppEncryptionDeclarations)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BuildsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BuildsApi apiInstance = new BuildsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAppEncryptionDeclarations = Arrays.asList(); // List<String> | the fields to include for returned resources of type appEncryptionDeclarations
        try {
            AppEncryptionDeclarationWithoutIncludesResponse result = apiInstance.buildsAppEncryptionDeclarationGetToOneRelated(id, fieldsAppEncryptionDeclarations);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BuildsApi#buildsAppEncryptionDeclarationGetToOneRelated");
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
| **fieldsAppEncryptionDeclarations** | **List&lt;String&gt;**| the fields to include for returned resources of type appEncryptionDeclarations | [optional] [enum: app, appDescription, appEncryptionDeclarationDocument, appEncryptionDeclarationState, availableOnFrenchStore, builds, codeValue, containsProprietaryCryptography, containsThirdPartyCryptography, createdDate, documentName, documentType, documentUrl, exempt, platform, uploadedDate, usesEncryption] |

### Return type

[**AppEncryptionDeclarationWithoutIncludesResponse**](AppEncryptionDeclarationWithoutIncludesResponse.md)

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
| **200** | Single AppEncryptionDeclaration with get |  -  |


## buildsAppEncryptionDeclarationGetToOneRelationship

> BuildAppEncryptionDeclarationLinkageResponse buildsAppEncryptionDeclarationGetToOneRelationship(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BuildsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BuildsApi apiInstance = new BuildsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            BuildAppEncryptionDeclarationLinkageResponse result = apiInstance.buildsAppEncryptionDeclarationGetToOneRelationship(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BuildsApi#buildsAppEncryptionDeclarationGetToOneRelationship");
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

[**BuildAppEncryptionDeclarationLinkageResponse**](BuildAppEncryptionDeclarationLinkageResponse.md)

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
| **200** | Related linkage |  -  |


## buildsAppEncryptionDeclarationUpdateToOneRelationship

> buildsAppEncryptionDeclarationUpdateToOneRelationship(id, buildAppEncryptionDeclarationLinkageRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BuildsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BuildsApi apiInstance = new BuildsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        BuildAppEncryptionDeclarationLinkageRequest buildAppEncryptionDeclarationLinkageRequest = new BuildAppEncryptionDeclarationLinkageRequest(); // BuildAppEncryptionDeclarationLinkageRequest | Related linkage
        try {
            apiInstance.buildsAppEncryptionDeclarationUpdateToOneRelationship(id, buildAppEncryptionDeclarationLinkageRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling BuildsApi#buildsAppEncryptionDeclarationUpdateToOneRelationship");
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
| **buildAppEncryptionDeclarationLinkageRequest** | [**BuildAppEncryptionDeclarationLinkageRequest**](BuildAppEncryptionDeclarationLinkageRequest.md)| Related linkage | |

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


## buildsAppGetToOneRelated

> AppWithoutIncludesResponse buildsAppGetToOneRelated(id, fieldsApps)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BuildsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BuildsApi apiInstance = new BuildsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsApps = Arrays.asList(); // List<String> | the fields to include for returned resources of type apps
        try {
            AppWithoutIncludesResponse result = apiInstance.buildsAppGetToOneRelated(id, fieldsApps);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BuildsApi#buildsAppGetToOneRelated");
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


## buildsAppStoreVersionGetToOneRelated

> AppStoreVersionResponse buildsAppStoreVersionGetToOneRelated(id, fieldsAgeRatingDeclarations, fieldsAppStoreReviewDetails, fieldsAppStoreVersionLocalizations, fieldsAppStoreVersionExperiments, fieldsAppStoreVersionSubmissions, fieldsAlternativeDistributionPackages, fieldsAppStoreVersions, fieldsApps, fieldsRoutingAppCoverages, fieldsAppClipDefaultExperiences, fieldsAppStoreVersionPhasedReleases, fieldsBuilds, limitAppStoreVersionLocalizations, limitAppStoreVersionExperiments, limitAppStoreVersionExperimentsV2, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BuildsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BuildsApi apiInstance = new BuildsApi(defaultClient);
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
            AppStoreVersionResponse result = apiInstance.buildsAppStoreVersionGetToOneRelated(id, fieldsAgeRatingDeclarations, fieldsAppStoreReviewDetails, fieldsAppStoreVersionLocalizations, fieldsAppStoreVersionExperiments, fieldsAppStoreVersionSubmissions, fieldsAlternativeDistributionPackages, fieldsAppStoreVersions, fieldsApps, fieldsRoutingAppCoverages, fieldsAppClipDefaultExperiences, fieldsAppStoreVersionPhasedReleases, fieldsBuilds, limitAppStoreVersionLocalizations, limitAppStoreVersionExperiments, limitAppStoreVersionExperimentsV2, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BuildsApi#buildsAppStoreVersionGetToOneRelated");
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


## buildsBetaAppReviewSubmissionGetToOneRelated

> BetaAppReviewSubmissionWithoutIncludesResponse buildsBetaAppReviewSubmissionGetToOneRelated(id, fieldsBetaAppReviewSubmissions)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BuildsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BuildsApi apiInstance = new BuildsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsBetaAppReviewSubmissions = Arrays.asList(); // List<String> | the fields to include for returned resources of type betaAppReviewSubmissions
        try {
            BetaAppReviewSubmissionWithoutIncludesResponse result = apiInstance.buildsBetaAppReviewSubmissionGetToOneRelated(id, fieldsBetaAppReviewSubmissions);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BuildsApi#buildsBetaAppReviewSubmissionGetToOneRelated");
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
| **fieldsBetaAppReviewSubmissions** | **List&lt;String&gt;**| the fields to include for returned resources of type betaAppReviewSubmissions | [optional] [enum: betaReviewState, build, submittedDate] |

### Return type

[**BetaAppReviewSubmissionWithoutIncludesResponse**](BetaAppReviewSubmissionWithoutIncludesResponse.md)

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
| **200** | Single BetaAppReviewSubmission with get |  -  |


## buildsBetaBuildLocalizationsGetToManyRelated

> BetaBuildLocalizationsWithoutIncludesResponse buildsBetaBuildLocalizationsGetToManyRelated(id, fieldsBetaBuildLocalizations, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BuildsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BuildsApi apiInstance = new BuildsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsBetaBuildLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type betaBuildLocalizations
        Integer limit = 56; // Integer | maximum resources per page
        try {
            BetaBuildLocalizationsWithoutIncludesResponse result = apiInstance.buildsBetaBuildLocalizationsGetToManyRelated(id, fieldsBetaBuildLocalizations, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BuildsApi#buildsBetaBuildLocalizationsGetToManyRelated");
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
| **fieldsBetaBuildLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type betaBuildLocalizations | [optional] [enum: build, locale, whatsNew] |
| **limit** | **Integer**| maximum resources per page | [optional] |

### Return type

[**BetaBuildLocalizationsWithoutIncludesResponse**](BetaBuildLocalizationsWithoutIncludesResponse.md)

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
| **200** | List of BetaBuildLocalizations with get |  -  |


## buildsBetaBuildUsagesGetMetrics

> BetaBuildUsagesV1MetricResponse buildsBetaBuildUsagesGetMetrics(id, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BuildsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BuildsApi apiInstance = new BuildsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        Integer limit = 56; // Integer | maximum number of groups to return per page
        try {
            BetaBuildUsagesV1MetricResponse result = apiInstance.buildsBetaBuildUsagesGetMetrics(id, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BuildsApi#buildsBetaBuildUsagesGetMetrics");
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
| **limit** | **Integer**| maximum number of groups to return per page | [optional] |

### Return type

[**BetaBuildUsagesV1MetricResponse**](BetaBuildUsagesV1MetricResponse.md)

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


## buildsBetaGroupsCreateToManyRelationship

> buildsBetaGroupsCreateToManyRelationship(id, buildBetaGroupsLinkagesRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BuildsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BuildsApi apiInstance = new BuildsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        BuildBetaGroupsLinkagesRequest buildBetaGroupsLinkagesRequest = new BuildBetaGroupsLinkagesRequest(); // BuildBetaGroupsLinkagesRequest | List of related linkages
        try {
            apiInstance.buildsBetaGroupsCreateToManyRelationship(id, buildBetaGroupsLinkagesRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling BuildsApi#buildsBetaGroupsCreateToManyRelationship");
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
| **buildBetaGroupsLinkagesRequest** | [**BuildBetaGroupsLinkagesRequest**](BuildBetaGroupsLinkagesRequest.md)| List of related linkages | |

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


## buildsBetaGroupsDeleteToManyRelationship

> buildsBetaGroupsDeleteToManyRelationship(id, buildBetaGroupsLinkagesRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BuildsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BuildsApi apiInstance = new BuildsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        BuildBetaGroupsLinkagesRequest buildBetaGroupsLinkagesRequest = new BuildBetaGroupsLinkagesRequest(); // BuildBetaGroupsLinkagesRequest | List of related linkages
        try {
            apiInstance.buildsBetaGroupsDeleteToManyRelationship(id, buildBetaGroupsLinkagesRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling BuildsApi#buildsBetaGroupsDeleteToManyRelationship");
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
| **buildBetaGroupsLinkagesRequest** | [**BuildBetaGroupsLinkagesRequest**](BuildBetaGroupsLinkagesRequest.md)| List of related linkages | |

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


## buildsBuildBetaDetailGetToOneRelated

> BuildBetaDetailResponse buildsBuildBetaDetailGetToOneRelated(id, fieldsBuildBetaDetails, fieldsBuilds, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BuildsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BuildsApi apiInstance = new BuildsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsBuildBetaDetails = Arrays.asList(); // List<String> | the fields to include for returned resources of type buildBetaDetails
        List<String> fieldsBuilds = Arrays.asList(); // List<String> | the fields to include for returned resources of type builds
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            BuildBetaDetailResponse result = apiInstance.buildsBuildBetaDetailGetToOneRelated(id, fieldsBuildBetaDetails, fieldsBuilds, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BuildsApi#buildsBuildBetaDetailGetToOneRelated");
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
| **fieldsBuildBetaDetails** | **List&lt;String&gt;**| the fields to include for returned resources of type buildBetaDetails | [optional] [enum: autoNotifyEnabled, build, externalBuildState, internalBuildState] |
| **fieldsBuilds** | **List&lt;String&gt;**| the fields to include for returned resources of type builds | [optional] [enum: app, appEncryptionDeclaration, appStoreVersion, betaAppReviewSubmission, betaBuildLocalizations, betaGroups, buildAudienceType, buildBetaDetail, buildBundles, computedMinMacOsVersion, diagnosticSignatures, expirationDate, expired, iconAssetToken, icons, individualTesters, lsMinimumSystemVersion, minOsVersion, perfPowerMetrics, preReleaseVersion, processingState, uploadedDate, usesNonExemptEncryption, version] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: build] |

### Return type

[**BuildBetaDetailResponse**](BuildBetaDetailResponse.md)

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
| **200** | Single BuildBetaDetail |  -  |


## buildsDiagnosticSignaturesGetToManyRelated

> DiagnosticSignaturesResponse buildsDiagnosticSignaturesGetToManyRelated(id, filterDiagnosticType, fieldsDiagnosticSignatures, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BuildsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BuildsApi apiInstance = new BuildsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> filterDiagnosticType = Arrays.asList(); // List<String> | filter by attribute 'diagnosticType'
        List<String> fieldsDiagnosticSignatures = Arrays.asList(); // List<String> | the fields to include for returned resources of type diagnosticSignatures
        Integer limit = 56; // Integer | maximum resources per page
        try {
            DiagnosticSignaturesResponse result = apiInstance.buildsDiagnosticSignaturesGetToManyRelated(id, filterDiagnosticType, fieldsDiagnosticSignatures, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BuildsApi#buildsDiagnosticSignaturesGetToManyRelated");
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
| **filterDiagnosticType** | **List&lt;String&gt;**| filter by attribute &#39;diagnosticType&#39; | [optional] [enum: DISK_WRITES, HANGS, LAUNCHES] |
| **fieldsDiagnosticSignatures** | **List&lt;String&gt;**| the fields to include for returned resources of type diagnosticSignatures | [optional] [enum: diagnosticType, insight, logs, signature, weight] |
| **limit** | **Integer**| maximum resources per page | [optional] |

### Return type

[**DiagnosticSignaturesResponse**](DiagnosticSignaturesResponse.md)

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
| **200** | List of DiagnosticSignatures |  -  |


## buildsGetCollection

> BuildsResponse buildsGetCollection(filterBetaAppReviewSubmissionBetaReviewState, filterBuildAudienceType, filterExpired, filterPreReleaseVersionPlatform, filterPreReleaseVersionVersion, filterProcessingState, filterUsesNonExemptEncryption, filterVersion, filterApp, filterAppStoreVersion, filterBetaGroups, filterPreReleaseVersion, filterId, sort, fieldsBuilds, limit, include, fieldsDiagnosticSignatures, fieldsBuildIcons, fieldsBuildBetaDetails, fieldsBetaAppReviewSubmissions, fieldsBetaTesters, fieldsAppStoreVersions, fieldsBetaBuildLocalizations, fieldsPreReleaseVersions, fieldsAppEncryptionDeclarations, fieldsApps, fieldsPerfPowerMetrics, limitBetaBuildLocalizations, limitBetaGroups, limitBuildBundles, limitIcons, limitIndividualTesters)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BuildsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BuildsApi apiInstance = new BuildsApi(defaultClient);
        List<String> filterBetaAppReviewSubmissionBetaReviewState = Arrays.asList(); // List<String> | filter by attribute 'betaAppReviewSubmission.betaReviewState'
        List<String> filterBuildAudienceType = Arrays.asList(); // List<String> | filter by attribute 'buildAudienceType'
        List<String> filterExpired = Arrays.asList(); // List<String> | filter by attribute 'expired'
        List<String> filterPreReleaseVersionPlatform = Arrays.asList(); // List<String> | filter by attribute 'preReleaseVersion.platform'
        List<String> filterPreReleaseVersionVersion = Arrays.asList(); // List<String> | filter by attribute 'preReleaseVersion.version'
        List<String> filterProcessingState = Arrays.asList(); // List<String> | filter by attribute 'processingState'
        List<String> filterUsesNonExemptEncryption = Arrays.asList(); // List<String> | filter by attribute 'usesNonExemptEncryption'
        List<String> filterVersion = Arrays.asList(); // List<String> | filter by attribute 'version'
        List<String> filterApp = Arrays.asList(); // List<String> | filter by id(s) of related 'app'
        List<String> filterAppStoreVersion = Arrays.asList(); // List<String> | filter by id(s) of related 'appStoreVersion'
        List<String> filterBetaGroups = Arrays.asList(); // List<String> | filter by id(s) of related 'betaGroups'
        List<String> filterPreReleaseVersion = Arrays.asList(); // List<String> | filter by id(s) of related 'preReleaseVersion'
        List<String> filterId = Arrays.asList(); // List<String> | filter by id(s)
        List<String> sort = Arrays.asList(); // List<String> | comma-separated list of sort expressions; resources will be sorted as specified
        List<String> fieldsBuilds = Arrays.asList(); // List<String> | the fields to include for returned resources of type builds
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsDiagnosticSignatures = Arrays.asList(); // List<String> | the fields to include for returned resources of type diagnosticSignatures
        List<String> fieldsBuildIcons = Arrays.asList(); // List<String> | the fields to include for returned resources of type buildIcons
        List<String> fieldsBuildBetaDetails = Arrays.asList(); // List<String> | the fields to include for returned resources of type buildBetaDetails
        List<String> fieldsBetaAppReviewSubmissions = Arrays.asList(); // List<String> | the fields to include for returned resources of type betaAppReviewSubmissions
        List<String> fieldsBetaTesters = Arrays.asList(); // List<String> | the fields to include for returned resources of type betaTesters
        List<String> fieldsAppStoreVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersions
        List<String> fieldsBetaBuildLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type betaBuildLocalizations
        List<String> fieldsPreReleaseVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type preReleaseVersions
        List<String> fieldsAppEncryptionDeclarations = Arrays.asList(); // List<String> | the fields to include for returned resources of type appEncryptionDeclarations
        List<String> fieldsApps = Arrays.asList(); // List<String> | the fields to include for returned resources of type apps
        List<String> fieldsPerfPowerMetrics = Arrays.asList(); // List<String> | the fields to include for returned resources of type perfPowerMetrics
        Integer limitBetaBuildLocalizations = 56; // Integer | maximum number of related betaBuildLocalizations returned (when they are included)
        Integer limitBetaGroups = 56; // Integer | maximum number of related betaGroups returned (when they are included)
        Integer limitBuildBundles = 56; // Integer | maximum number of related buildBundles returned (when they are included)
        Integer limitIcons = 56; // Integer | maximum number of related icons returned (when they are included)
        Integer limitIndividualTesters = 56; // Integer | maximum number of related individualTesters returned (when they are included)
        try {
            BuildsResponse result = apiInstance.buildsGetCollection(filterBetaAppReviewSubmissionBetaReviewState, filterBuildAudienceType, filterExpired, filterPreReleaseVersionPlatform, filterPreReleaseVersionVersion, filterProcessingState, filterUsesNonExemptEncryption, filterVersion, filterApp, filterAppStoreVersion, filterBetaGroups, filterPreReleaseVersion, filterId, sort, fieldsBuilds, limit, include, fieldsDiagnosticSignatures, fieldsBuildIcons, fieldsBuildBetaDetails, fieldsBetaAppReviewSubmissions, fieldsBetaTesters, fieldsAppStoreVersions, fieldsBetaBuildLocalizations, fieldsPreReleaseVersions, fieldsAppEncryptionDeclarations, fieldsApps, fieldsPerfPowerMetrics, limitBetaBuildLocalizations, limitBetaGroups, limitBuildBundles, limitIcons, limitIndividualTesters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BuildsApi#buildsGetCollection");
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
| **filterBetaAppReviewSubmissionBetaReviewState** | **List&lt;String&gt;**| filter by attribute &#39;betaAppReviewSubmission.betaReviewState&#39; | [optional] [enum: WAITING_FOR_REVIEW, IN_REVIEW, REJECTED, APPROVED] |
| **filterBuildAudienceType** | **List&lt;String&gt;**| filter by attribute &#39;buildAudienceType&#39; | [optional] [enum: INTERNAL_ONLY, APP_STORE_ELIGIBLE] |
| **filterExpired** | **List&lt;String&gt;**| filter by attribute &#39;expired&#39; | [optional] |
| **filterPreReleaseVersionPlatform** | **List&lt;String&gt;**| filter by attribute &#39;preReleaseVersion.platform&#39; | [optional] [enum: IOS, MAC_OS, TV_OS, VISION_OS] |
| **filterPreReleaseVersionVersion** | **List&lt;String&gt;**| filter by attribute &#39;preReleaseVersion.version&#39; | [optional] |
| **filterProcessingState** | **List&lt;String&gt;**| filter by attribute &#39;processingState&#39; | [optional] [enum: PROCESSING, FAILED, INVALID, VALID] |
| **filterUsesNonExemptEncryption** | **List&lt;String&gt;**| filter by attribute &#39;usesNonExemptEncryption&#39; | [optional] |
| **filterVersion** | **List&lt;String&gt;**| filter by attribute &#39;version&#39; | [optional] |
| **filterApp** | **List&lt;String&gt;**| filter by id(s) of related &#39;app&#39; | [optional] |
| **filterAppStoreVersion** | **List&lt;String&gt;**| filter by id(s) of related &#39;appStoreVersion&#39; | [optional] |
| **filterBetaGroups** | **List&lt;String&gt;**| filter by id(s) of related &#39;betaGroups&#39; | [optional] |
| **filterPreReleaseVersion** | **List&lt;String&gt;**| filter by id(s) of related &#39;preReleaseVersion&#39; | [optional] |
| **filterId** | **List&lt;String&gt;**| filter by id(s) | [optional] |
| **sort** | **List&lt;String&gt;**| comma-separated list of sort expressions; resources will be sorted as specified | [optional] [enum: preReleaseVersion, -preReleaseVersion, uploadedDate, -uploadedDate, version, -version] |
| **fieldsBuilds** | **List&lt;String&gt;**| the fields to include for returned resources of type builds | [optional] [enum: app, appEncryptionDeclaration, appStoreVersion, betaAppReviewSubmission, betaBuildLocalizations, betaGroups, buildAudienceType, buildBetaDetail, buildBundles, computedMinMacOsVersion, diagnosticSignatures, expirationDate, expired, iconAssetToken, icons, individualTesters, lsMinimumSystemVersion, minOsVersion, perfPowerMetrics, preReleaseVersion, processingState, uploadedDate, usesNonExemptEncryption, version] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: app, appEncryptionDeclaration, appStoreVersion, betaAppReviewSubmission, betaBuildLocalizations, betaGroups, buildBetaDetail, buildBundles, icons, individualTesters, preReleaseVersion] |
| **fieldsDiagnosticSignatures** | **List&lt;String&gt;**| the fields to include for returned resources of type diagnosticSignatures | [optional] [enum: diagnosticType, insight, logs, signature, weight] |
| **fieldsBuildIcons** | **List&lt;String&gt;**| the fields to include for returned resources of type buildIcons | [optional] [enum: iconAsset, iconType, name] |
| **fieldsBuildBetaDetails** | **List&lt;String&gt;**| the fields to include for returned resources of type buildBetaDetails | [optional] [enum: autoNotifyEnabled, build, externalBuildState, internalBuildState] |
| **fieldsBetaAppReviewSubmissions** | **List&lt;String&gt;**| the fields to include for returned resources of type betaAppReviewSubmissions | [optional] [enum: betaReviewState, build, submittedDate] |
| **fieldsBetaTesters** | **List&lt;String&gt;**| the fields to include for returned resources of type betaTesters | [optional] [enum: apps, betaGroups, builds, email, firstName, inviteType, lastName, state] |
| **fieldsAppStoreVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersions | [optional] [enum: ageRatingDeclaration, alternativeDistributionPackage, app, appClipDefaultExperience, appStoreReviewDetail, appStoreState, appStoreVersionExperiments, appStoreVersionExperimentsV2, appStoreVersionLocalizations, appStoreVersionPhasedRelease, appStoreVersionSubmission, appVersionState, build, copyright, createdDate, customerReviews, downloadable, earliestReleaseDate, platform, releaseType, reviewType, routingAppCoverage, versionString] |
| **fieldsBetaBuildLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type betaBuildLocalizations | [optional] [enum: build, locale, whatsNew] |
| **fieldsPreReleaseVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type preReleaseVersions | [optional] [enum: app, builds, platform, version] |
| **fieldsAppEncryptionDeclarations** | **List&lt;String&gt;**| the fields to include for returned resources of type appEncryptionDeclarations | [optional] [enum: app, appDescription, appEncryptionDeclarationDocument, appEncryptionDeclarationState, availableOnFrenchStore, builds, codeValue, containsProprietaryCryptography, containsThirdPartyCryptography, createdDate, documentName, documentType, documentUrl, exempt, platform, uploadedDate, usesEncryption] |
| **fieldsApps** | **List&lt;String&gt;**| the fields to include for returned resources of type apps | [optional] [enum: alternativeDistributionKey, analyticsReportRequests, appAvailability, appClips, appCustomProductPages, appEncryptionDeclarations, appEvents, appInfos, appPricePoints, appPriceSchedule, appStoreVersionExperimentsV2, appStoreVersions, betaAppLocalizations, betaAppReviewDetail, betaGroups, betaLicenseAgreement, betaTesters, builds, bundleId, ciProduct, contentRightsDeclaration, customerReviews, endUserLicenseAgreement, gameCenterDetail, gameCenterEnabledVersions, inAppPurchases, inAppPurchasesV2, isOrEverWasMadeForKids, marketplaceSearchDetail, name, perfPowerMetrics, preOrder, preReleaseVersions, primaryLocale, promotedPurchases, reviewSubmissions, sku, subscriptionGracePeriod, subscriptionGroups, subscriptionStatusUrl, subscriptionStatusUrlForSandbox, subscriptionStatusUrlVersion, subscriptionStatusUrlVersionForSandbox] |
| **fieldsPerfPowerMetrics** | **List&lt;String&gt;**| the fields to include for returned resources of type perfPowerMetrics | [optional] [enum: deviceType, metricType, platform] |
| **limitBetaBuildLocalizations** | **Integer**| maximum number of related betaBuildLocalizations returned (when they are included) | [optional] |
| **limitBetaGroups** | **Integer**| maximum number of related betaGroups returned (when they are included) | [optional] |
| **limitBuildBundles** | **Integer**| maximum number of related buildBundles returned (when they are included) | [optional] |
| **limitIcons** | **Integer**| maximum number of related icons returned (when they are included) | [optional] |
| **limitIndividualTesters** | **Integer**| maximum number of related individualTesters returned (when they are included) | [optional] |

### Return type

[**BuildsResponse**](BuildsResponse.md)

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
| **200** | List of Builds |  -  |


## buildsGetInstance

> BuildResponse buildsGetInstance(id, fieldsBuilds, include, fieldsDiagnosticSignatures, fieldsBuildIcons, fieldsBuildBetaDetails, fieldsBetaAppReviewSubmissions, fieldsBetaTesters, fieldsAppStoreVersions, fieldsBetaBuildLocalizations, fieldsPreReleaseVersions, fieldsAppEncryptionDeclarations, fieldsApps, fieldsPerfPowerMetrics, limitBetaBuildLocalizations, limitBetaGroups, limitBuildBundles, limitIcons, limitIndividualTesters)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BuildsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BuildsApi apiInstance = new BuildsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsBuilds = Arrays.asList(); // List<String> | the fields to include for returned resources of type builds
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsDiagnosticSignatures = Arrays.asList(); // List<String> | the fields to include for returned resources of type diagnosticSignatures
        List<String> fieldsBuildIcons = Arrays.asList(); // List<String> | the fields to include for returned resources of type buildIcons
        List<String> fieldsBuildBetaDetails = Arrays.asList(); // List<String> | the fields to include for returned resources of type buildBetaDetails
        List<String> fieldsBetaAppReviewSubmissions = Arrays.asList(); // List<String> | the fields to include for returned resources of type betaAppReviewSubmissions
        List<String> fieldsBetaTesters = Arrays.asList(); // List<String> | the fields to include for returned resources of type betaTesters
        List<String> fieldsAppStoreVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersions
        List<String> fieldsBetaBuildLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type betaBuildLocalizations
        List<String> fieldsPreReleaseVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type preReleaseVersions
        List<String> fieldsAppEncryptionDeclarations = Arrays.asList(); // List<String> | the fields to include for returned resources of type appEncryptionDeclarations
        List<String> fieldsApps = Arrays.asList(); // List<String> | the fields to include for returned resources of type apps
        List<String> fieldsPerfPowerMetrics = Arrays.asList(); // List<String> | the fields to include for returned resources of type perfPowerMetrics
        Integer limitBetaBuildLocalizations = 56; // Integer | maximum number of related betaBuildLocalizations returned (when they are included)
        Integer limitBetaGroups = 56; // Integer | maximum number of related betaGroups returned (when they are included)
        Integer limitBuildBundles = 56; // Integer | maximum number of related buildBundles returned (when they are included)
        Integer limitIcons = 56; // Integer | maximum number of related icons returned (when they are included)
        Integer limitIndividualTesters = 56; // Integer | maximum number of related individualTesters returned (when they are included)
        try {
            BuildResponse result = apiInstance.buildsGetInstance(id, fieldsBuilds, include, fieldsDiagnosticSignatures, fieldsBuildIcons, fieldsBuildBetaDetails, fieldsBetaAppReviewSubmissions, fieldsBetaTesters, fieldsAppStoreVersions, fieldsBetaBuildLocalizations, fieldsPreReleaseVersions, fieldsAppEncryptionDeclarations, fieldsApps, fieldsPerfPowerMetrics, limitBetaBuildLocalizations, limitBetaGroups, limitBuildBundles, limitIcons, limitIndividualTesters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BuildsApi#buildsGetInstance");
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
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: app, appEncryptionDeclaration, appStoreVersion, betaAppReviewSubmission, betaBuildLocalizations, betaGroups, buildBetaDetail, buildBundles, icons, individualTesters, preReleaseVersion] |
| **fieldsDiagnosticSignatures** | **List&lt;String&gt;**| the fields to include for returned resources of type diagnosticSignatures | [optional] [enum: diagnosticType, insight, logs, signature, weight] |
| **fieldsBuildIcons** | **List&lt;String&gt;**| the fields to include for returned resources of type buildIcons | [optional] [enum: iconAsset, iconType, name] |
| **fieldsBuildBetaDetails** | **List&lt;String&gt;**| the fields to include for returned resources of type buildBetaDetails | [optional] [enum: autoNotifyEnabled, build, externalBuildState, internalBuildState] |
| **fieldsBetaAppReviewSubmissions** | **List&lt;String&gt;**| the fields to include for returned resources of type betaAppReviewSubmissions | [optional] [enum: betaReviewState, build, submittedDate] |
| **fieldsBetaTesters** | **List&lt;String&gt;**| the fields to include for returned resources of type betaTesters | [optional] [enum: apps, betaGroups, builds, email, firstName, inviteType, lastName, state] |
| **fieldsAppStoreVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersions | [optional] [enum: ageRatingDeclaration, alternativeDistributionPackage, app, appClipDefaultExperience, appStoreReviewDetail, appStoreState, appStoreVersionExperiments, appStoreVersionExperimentsV2, appStoreVersionLocalizations, appStoreVersionPhasedRelease, appStoreVersionSubmission, appVersionState, build, copyright, createdDate, customerReviews, downloadable, earliestReleaseDate, platform, releaseType, reviewType, routingAppCoverage, versionString] |
| **fieldsBetaBuildLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type betaBuildLocalizations | [optional] [enum: build, locale, whatsNew] |
| **fieldsPreReleaseVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type preReleaseVersions | [optional] [enum: app, builds, platform, version] |
| **fieldsAppEncryptionDeclarations** | **List&lt;String&gt;**| the fields to include for returned resources of type appEncryptionDeclarations | [optional] [enum: app, appDescription, appEncryptionDeclarationDocument, appEncryptionDeclarationState, availableOnFrenchStore, builds, codeValue, containsProprietaryCryptography, containsThirdPartyCryptography, createdDate, documentName, documentType, documentUrl, exempt, platform, uploadedDate, usesEncryption] |
| **fieldsApps** | **List&lt;String&gt;**| the fields to include for returned resources of type apps | [optional] [enum: alternativeDistributionKey, analyticsReportRequests, appAvailability, appClips, appCustomProductPages, appEncryptionDeclarations, appEvents, appInfos, appPricePoints, appPriceSchedule, appStoreVersionExperimentsV2, appStoreVersions, betaAppLocalizations, betaAppReviewDetail, betaGroups, betaLicenseAgreement, betaTesters, builds, bundleId, ciProduct, contentRightsDeclaration, customerReviews, endUserLicenseAgreement, gameCenterDetail, gameCenterEnabledVersions, inAppPurchases, inAppPurchasesV2, isOrEverWasMadeForKids, marketplaceSearchDetail, name, perfPowerMetrics, preOrder, preReleaseVersions, primaryLocale, promotedPurchases, reviewSubmissions, sku, subscriptionGracePeriod, subscriptionGroups, subscriptionStatusUrl, subscriptionStatusUrlForSandbox, subscriptionStatusUrlVersion, subscriptionStatusUrlVersionForSandbox] |
| **fieldsPerfPowerMetrics** | **List&lt;String&gt;**| the fields to include for returned resources of type perfPowerMetrics | [optional] [enum: deviceType, metricType, platform] |
| **limitBetaBuildLocalizations** | **Integer**| maximum number of related betaBuildLocalizations returned (when they are included) | [optional] |
| **limitBetaGroups** | **Integer**| maximum number of related betaGroups returned (when they are included) | [optional] |
| **limitBuildBundles** | **Integer**| maximum number of related buildBundles returned (when they are included) | [optional] |
| **limitIcons** | **Integer**| maximum number of related icons returned (when they are included) | [optional] |
| **limitIndividualTesters** | **Integer**| maximum number of related individualTesters returned (when they are included) | [optional] |

### Return type

[**BuildResponse**](BuildResponse.md)

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
| **200** | Single Build |  -  |


## buildsIconsGetToManyRelated

> BuildIconsWithoutIncludesResponse buildsIconsGetToManyRelated(id, fieldsBuildIcons, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BuildsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BuildsApi apiInstance = new BuildsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsBuildIcons = Arrays.asList(); // List<String> | the fields to include for returned resources of type buildIcons
        Integer limit = 56; // Integer | maximum resources per page
        try {
            BuildIconsWithoutIncludesResponse result = apiInstance.buildsIconsGetToManyRelated(id, fieldsBuildIcons, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BuildsApi#buildsIconsGetToManyRelated");
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
| **fieldsBuildIcons** | **List&lt;String&gt;**| the fields to include for returned resources of type buildIcons | [optional] [enum: iconAsset, iconType, name] |
| **limit** | **Integer**| maximum resources per page | [optional] |

### Return type

[**BuildIconsWithoutIncludesResponse**](BuildIconsWithoutIncludesResponse.md)

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
| **200** | List of BuildIcons with get |  -  |


## buildsIndividualTestersCreateToManyRelationship

> buildsIndividualTestersCreateToManyRelationship(id, buildIndividualTestersLinkagesRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BuildsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BuildsApi apiInstance = new BuildsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        BuildIndividualTestersLinkagesRequest buildIndividualTestersLinkagesRequest = new BuildIndividualTestersLinkagesRequest(); // BuildIndividualTestersLinkagesRequest | List of related linkages
        try {
            apiInstance.buildsIndividualTestersCreateToManyRelationship(id, buildIndividualTestersLinkagesRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling BuildsApi#buildsIndividualTestersCreateToManyRelationship");
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
| **buildIndividualTestersLinkagesRequest** | [**BuildIndividualTestersLinkagesRequest**](BuildIndividualTestersLinkagesRequest.md)| List of related linkages | |

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


## buildsIndividualTestersDeleteToManyRelationship

> buildsIndividualTestersDeleteToManyRelationship(id, buildIndividualTestersLinkagesRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BuildsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BuildsApi apiInstance = new BuildsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        BuildIndividualTestersLinkagesRequest buildIndividualTestersLinkagesRequest = new BuildIndividualTestersLinkagesRequest(); // BuildIndividualTestersLinkagesRequest | List of related linkages
        try {
            apiInstance.buildsIndividualTestersDeleteToManyRelationship(id, buildIndividualTestersLinkagesRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling BuildsApi#buildsIndividualTestersDeleteToManyRelationship");
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
| **buildIndividualTestersLinkagesRequest** | [**BuildIndividualTestersLinkagesRequest**](BuildIndividualTestersLinkagesRequest.md)| List of related linkages | |

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


## buildsIndividualTestersGetToManyRelated

> BetaTestersWithoutIncludesResponse buildsIndividualTestersGetToManyRelated(id, fieldsBetaTesters, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BuildsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BuildsApi apiInstance = new BuildsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsBetaTesters = Arrays.asList(); // List<String> | the fields to include for returned resources of type betaTesters
        Integer limit = 56; // Integer | maximum resources per page
        try {
            BetaTestersWithoutIncludesResponse result = apiInstance.buildsIndividualTestersGetToManyRelated(id, fieldsBetaTesters, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BuildsApi#buildsIndividualTestersGetToManyRelated");
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
| **limit** | **Integer**| maximum resources per page | [optional] |

### Return type

[**BetaTestersWithoutIncludesResponse**](BetaTestersWithoutIncludesResponse.md)

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
| **200** | List of BetaTesters with get |  -  |


## buildsIndividualTestersGetToManyRelationship

> BuildIndividualTestersLinkagesResponse buildsIndividualTestersGetToManyRelationship(id, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BuildsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BuildsApi apiInstance = new BuildsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        Integer limit = 56; // Integer | maximum resources per page
        try {
            BuildIndividualTestersLinkagesResponse result = apiInstance.buildsIndividualTestersGetToManyRelationship(id, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BuildsApi#buildsIndividualTestersGetToManyRelationship");
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

[**BuildIndividualTestersLinkagesResponse**](BuildIndividualTestersLinkagesResponse.md)

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


## buildsPerfPowerMetricsGetToManyRelated

> XcodeMetrics buildsPerfPowerMetricsGetToManyRelated(id, filterDeviceType, filterMetricType, filterPlatform)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BuildsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BuildsApi apiInstance = new BuildsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> filterDeviceType = Arrays.asList(); // List<String> | filter by attribute 'deviceType'
        List<String> filterMetricType = Arrays.asList(); // List<String> | filter by attribute 'metricType'
        List<String> filterPlatform = Arrays.asList(); // List<String> | filter by attribute 'platform'
        try {
            XcodeMetrics result = apiInstance.buildsPerfPowerMetricsGetToManyRelated(id, filterDeviceType, filterMetricType, filterPlatform);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BuildsApi#buildsPerfPowerMetricsGetToManyRelated");
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
| **filterDeviceType** | **List&lt;String&gt;**| filter by attribute &#39;deviceType&#39; | [optional] |
| **filterMetricType** | **List&lt;String&gt;**| filter by attribute &#39;metricType&#39; | [optional] [enum: DISK, HANG, BATTERY, LAUNCH, MEMORY, ANIMATION, TERMINATION] |
| **filterPlatform** | **List&lt;String&gt;**| filter by attribute &#39;platform&#39; | [optional] [enum: IOS] |

### Return type

[**XcodeMetrics**](XcodeMetrics.md)

### Authorization

[itc-bearer-token](../README.md#itc-bearer-token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/vnd.apple.xcode-metrics+json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Parameter error(s) |  -  |
| **401** | Unauthorized error(s) |  -  |
| **403** | Forbidden error |  -  |
| **404** | Not found error |  -  |
| **200** | List of PerfPowerMetrics |  -  |


## buildsPreReleaseVersionGetToOneRelated

> PrereleaseVersionWithoutIncludesResponse buildsPreReleaseVersionGetToOneRelated(id, fieldsPreReleaseVersions)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BuildsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BuildsApi apiInstance = new BuildsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsPreReleaseVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type preReleaseVersions
        try {
            PrereleaseVersionWithoutIncludesResponse result = apiInstance.buildsPreReleaseVersionGetToOneRelated(id, fieldsPreReleaseVersions);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BuildsApi#buildsPreReleaseVersionGetToOneRelated");
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
| **fieldsPreReleaseVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type preReleaseVersions | [optional] [enum: app, builds, platform, version] |

### Return type

[**PrereleaseVersionWithoutIncludesResponse**](PrereleaseVersionWithoutIncludesResponse.md)

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
| **200** | Single PrereleaseVersion with get |  -  |


## buildsUpdateInstance

> BuildResponse buildsUpdateInstance(id, buildUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BuildsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BuildsApi apiInstance = new BuildsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        BuildUpdateRequest buildUpdateRequest = new BuildUpdateRequest(); // BuildUpdateRequest | Build representation
        try {
            BuildResponse result = apiInstance.buildsUpdateInstance(id, buildUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BuildsApi#buildsUpdateInstance");
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
| **buildUpdateRequest** | [**BuildUpdateRequest**](BuildUpdateRequest.md)| Build representation | |

### Return type

[**BuildResponse**](BuildResponse.md)

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
| **200** | Single Build |  -  |
| **409** | Request entity error(s) |  -  |

