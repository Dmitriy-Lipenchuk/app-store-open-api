# CiProductsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ciProductsAdditionalRepositoriesGetToManyRelated**](CiProductsApi.md#ciProductsAdditionalRepositoriesGetToManyRelated) | **GET** /v1/ciProducts/{id}/additionalRepositories |  |
| [**ciProductsAppGetToOneRelated**](CiProductsApi.md#ciProductsAppGetToOneRelated) | **GET** /v1/ciProducts/{id}/app |  |
| [**ciProductsBuildRunsGetToManyRelated**](CiProductsApi.md#ciProductsBuildRunsGetToManyRelated) | **GET** /v1/ciProducts/{id}/buildRuns |  |
| [**ciProductsDeleteInstance**](CiProductsApi.md#ciProductsDeleteInstance) | **DELETE** /v1/ciProducts/{id} |  |
| [**ciProductsGetCollection**](CiProductsApi.md#ciProductsGetCollection) | **GET** /v1/ciProducts |  |
| [**ciProductsGetInstance**](CiProductsApi.md#ciProductsGetInstance) | **GET** /v1/ciProducts/{id} |  |
| [**ciProductsPrimaryRepositoriesGetToManyRelated**](CiProductsApi.md#ciProductsPrimaryRepositoriesGetToManyRelated) | **GET** /v1/ciProducts/{id}/primaryRepositories |  |
| [**ciProductsWorkflowsGetToManyRelated**](CiProductsApi.md#ciProductsWorkflowsGetToManyRelated) | **GET** /v1/ciProducts/{id}/workflows |  |



## ciProductsAdditionalRepositoriesGetToManyRelated

> ScmRepositoriesResponse ciProductsAdditionalRepositoriesGetToManyRelated(id, filterId, fieldsScmGitReferences, fieldsScmProviders, fieldsScmRepositories, limit, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.CiProductsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        CiProductsApi apiInstance = new CiProductsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> filterId = Arrays.asList(); // List<String> | filter by id(s)
        List<String> fieldsScmGitReferences = Arrays.asList(); // List<String> | the fields to include for returned resources of type scmGitReferences
        List<String> fieldsScmProviders = Arrays.asList(); // List<String> | the fields to include for returned resources of type scmProviders
        List<String> fieldsScmRepositories = Arrays.asList(); // List<String> | the fields to include for returned resources of type scmRepositories
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            ScmRepositoriesResponse result = apiInstance.ciProductsAdditionalRepositoriesGetToManyRelated(id, filterId, fieldsScmGitReferences, fieldsScmProviders, fieldsScmRepositories, limit, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CiProductsApi#ciProductsAdditionalRepositoriesGetToManyRelated");
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
| **filterId** | **List&lt;String&gt;**| filter by id(s) | [optional] |
| **fieldsScmGitReferences** | **List&lt;String&gt;**| the fields to include for returned resources of type scmGitReferences | [optional] [enum: canonicalName, isDeleted, kind, name, repository] |
| **fieldsScmProviders** | **List&lt;String&gt;**| the fields to include for returned resources of type scmProviders | [optional] [enum: repositories, scmProviderType, url] |
| **fieldsScmRepositories** | **List&lt;String&gt;**| the fields to include for returned resources of type scmRepositories | [optional] [enum: defaultBranch, gitReferences, httpCloneUrl, lastAccessedDate, ownerName, pullRequests, repositoryName, scmProvider, sshCloneUrl] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: defaultBranch, scmProvider] |

### Return type

[**ScmRepositoriesResponse**](ScmRepositoriesResponse.md)

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
| **200** | List of ScmRepositories |  -  |


## ciProductsAppGetToOneRelated

> AppResponse ciProductsAppGetToOneRelated(id, fieldsBetaAppReviewDetails, fieldsGameCenterDetails, fieldsCiProducts, fieldsReviewSubmissions, fieldsBetaGroups, fieldsPromotedPurchases, fieldsApps, fieldsAppEvents, fieldsBuilds, fieldsBetaLicenseAgreements, fieldsAppClips, fieldsBetaAppLocalizations, fieldsAppInfos, fieldsPreReleaseVersions, fieldsInAppPurchases, fieldsSubscriptionGroups, fieldsAppPreOrders, fieldsGameCenterEnabledVersions, fieldsAppStoreVersionExperiments, fieldsSubscriptionGracePeriods, fieldsEndUserLicenseAgreements, fieldsAppStoreVersions, fieldsAppEncryptionDeclarations, fieldsAppCustomProductPages, limitAppEncryptionDeclarations, limitBetaGroups, limitAppStoreVersions, limitPreReleaseVersions, limitBetaAppLocalizations, limitBuilds, limitAppInfos, limitAppClips, limitInAppPurchases, limitSubscriptionGroups, limitGameCenterEnabledVersions, limitAppCustomProductPages, limitInAppPurchasesV2, limitPromotedPurchases, limitAppEvents, limitReviewSubmissions, limitAppStoreVersionExperimentsV2, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.CiProductsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        CiProductsApi apiInstance = new CiProductsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsBetaAppReviewDetails = Arrays.asList(); // List<String> | the fields to include for returned resources of type betaAppReviewDetails
        List<String> fieldsGameCenterDetails = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterDetails
        List<String> fieldsCiProducts = Arrays.asList(); // List<String> | the fields to include for returned resources of type ciProducts
        List<String> fieldsReviewSubmissions = Arrays.asList(); // List<String> | the fields to include for returned resources of type reviewSubmissions
        List<String> fieldsBetaGroups = Arrays.asList(); // List<String> | the fields to include for returned resources of type betaGroups
        List<String> fieldsPromotedPurchases = Arrays.asList(); // List<String> | the fields to include for returned resources of type promotedPurchases
        List<String> fieldsApps = Arrays.asList(); // List<String> | the fields to include for returned resources of type apps
        List<String> fieldsAppEvents = Arrays.asList(); // List<String> | the fields to include for returned resources of type appEvents
        List<String> fieldsBuilds = Arrays.asList(); // List<String> | the fields to include for returned resources of type builds
        List<String> fieldsBetaLicenseAgreements = Arrays.asList(); // List<String> | the fields to include for returned resources of type betaLicenseAgreements
        List<String> fieldsAppClips = Arrays.asList(); // List<String> | the fields to include for returned resources of type appClips
        List<String> fieldsBetaAppLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type betaAppLocalizations
        List<String> fieldsAppInfos = Arrays.asList(); // List<String> | the fields to include for returned resources of type appInfos
        List<String> fieldsPreReleaseVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type preReleaseVersions
        List<String> fieldsInAppPurchases = Arrays.asList(); // List<String> | the fields to include for returned resources of type inAppPurchases
        List<String> fieldsSubscriptionGroups = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionGroups
        List<String> fieldsAppPreOrders = Arrays.asList(); // List<String> | the fields to include for returned resources of type appPreOrders
        List<String> fieldsGameCenterEnabledVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterEnabledVersions
        List<String> fieldsAppStoreVersionExperiments = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersionExperiments
        List<String> fieldsSubscriptionGracePeriods = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionGracePeriods
        List<String> fieldsEndUserLicenseAgreements = Arrays.asList(); // List<String> | the fields to include for returned resources of type endUserLicenseAgreements
        List<String> fieldsAppStoreVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersions
        List<String> fieldsAppEncryptionDeclarations = Arrays.asList(); // List<String> | the fields to include for returned resources of type appEncryptionDeclarations
        List<String> fieldsAppCustomProductPages = Arrays.asList(); // List<String> | the fields to include for returned resources of type appCustomProductPages
        Integer limitAppEncryptionDeclarations = 56; // Integer | maximum number of related appEncryptionDeclarations returned (when they are included)
        Integer limitBetaGroups = 56; // Integer | maximum number of related betaGroups returned (when they are included)
        Integer limitAppStoreVersions = 56; // Integer | maximum number of related appStoreVersions returned (when they are included)
        Integer limitPreReleaseVersions = 56; // Integer | maximum number of related preReleaseVersions returned (when they are included)
        Integer limitBetaAppLocalizations = 56; // Integer | maximum number of related betaAppLocalizations returned (when they are included)
        Integer limitBuilds = 56; // Integer | maximum number of related builds returned (when they are included)
        Integer limitAppInfos = 56; // Integer | maximum number of related appInfos returned (when they are included)
        Integer limitAppClips = 56; // Integer | maximum number of related appClips returned (when they are included)
        Integer limitInAppPurchases = 56; // Integer | maximum number of related inAppPurchases returned (when they are included)
        Integer limitSubscriptionGroups = 56; // Integer | maximum number of related subscriptionGroups returned (when they are included)
        Integer limitGameCenterEnabledVersions = 56; // Integer | maximum number of related gameCenterEnabledVersions returned (when they are included)
        Integer limitAppCustomProductPages = 56; // Integer | maximum number of related appCustomProductPages returned (when they are included)
        Integer limitInAppPurchasesV2 = 56; // Integer | maximum number of related inAppPurchasesV2 returned (when they are included)
        Integer limitPromotedPurchases = 56; // Integer | maximum number of related promotedPurchases returned (when they are included)
        Integer limitAppEvents = 56; // Integer | maximum number of related appEvents returned (when they are included)
        Integer limitReviewSubmissions = 56; // Integer | maximum number of related reviewSubmissions returned (when they are included)
        Integer limitAppStoreVersionExperimentsV2 = 56; // Integer | maximum number of related appStoreVersionExperimentsV2 returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            AppResponse result = apiInstance.ciProductsAppGetToOneRelated(id, fieldsBetaAppReviewDetails, fieldsGameCenterDetails, fieldsCiProducts, fieldsReviewSubmissions, fieldsBetaGroups, fieldsPromotedPurchases, fieldsApps, fieldsAppEvents, fieldsBuilds, fieldsBetaLicenseAgreements, fieldsAppClips, fieldsBetaAppLocalizations, fieldsAppInfos, fieldsPreReleaseVersions, fieldsInAppPurchases, fieldsSubscriptionGroups, fieldsAppPreOrders, fieldsGameCenterEnabledVersions, fieldsAppStoreVersionExperiments, fieldsSubscriptionGracePeriods, fieldsEndUserLicenseAgreements, fieldsAppStoreVersions, fieldsAppEncryptionDeclarations, fieldsAppCustomProductPages, limitAppEncryptionDeclarations, limitBetaGroups, limitAppStoreVersions, limitPreReleaseVersions, limitBetaAppLocalizations, limitBuilds, limitAppInfos, limitAppClips, limitInAppPurchases, limitSubscriptionGroups, limitGameCenterEnabledVersions, limitAppCustomProductPages, limitInAppPurchasesV2, limitPromotedPurchases, limitAppEvents, limitReviewSubmissions, limitAppStoreVersionExperimentsV2, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CiProductsApi#ciProductsAppGetToOneRelated");
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
| **fieldsBetaAppReviewDetails** | **List&lt;String&gt;**| the fields to include for returned resources of type betaAppReviewDetails | [optional] [enum: app, contactEmail, contactFirstName, contactLastName, contactPhone, demoAccountName, demoAccountPassword, demoAccountRequired, notes] |
| **fieldsGameCenterDetails** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterDetails | [optional] [enum: achievementReleases, app, arcadeEnabled, challengeEnabled, defaultGroupLeaderboard, defaultLeaderboard, gameCenterAchievements, gameCenterAppVersions, gameCenterGroup, gameCenterLeaderboardSets, gameCenterLeaderboards, leaderboardReleases, leaderboardSetReleases] |
| **fieldsCiProducts** | **List&lt;String&gt;**| the fields to include for returned resources of type ciProducts | [optional] [enum: additionalRepositories, app, buildRuns, bundleId, createdDate, name, primaryRepositories, productType, workflows] |
| **fieldsReviewSubmissions** | **List&lt;String&gt;**| the fields to include for returned resources of type reviewSubmissions | [optional] [enum: app, appStoreVersionForReview, canceled, items, lastUpdatedByActor, platform, state, submitted, submittedByActor, submittedDate] |
| **fieldsBetaGroups** | **List&lt;String&gt;**| the fields to include for returned resources of type betaGroups | [optional] [enum: app, betaTesters, builds, createdDate, feedbackEnabled, hasAccessToAllBuilds, iosBuildsAvailableForAppleSiliconMac, isInternalGroup, name, publicLink, publicLinkEnabled, publicLinkId, publicLinkLimit, publicLinkLimitEnabled] |
| **fieldsPromotedPurchases** | **List&lt;String&gt;**| the fields to include for returned resources of type promotedPurchases | [optional] [enum: app, enabled, inAppPurchaseV2, promotionImages, state, subscription, visibleForAllUsers] |
| **fieldsApps** | **List&lt;String&gt;**| the fields to include for returned resources of type apps | [optional] [enum: alternativeDistributionKey, analyticsReportRequests, appAvailability, appClips, appCustomProductPages, appEncryptionDeclarations, appEvents, appInfos, appPricePoints, appPriceSchedule, appStoreVersionExperimentsV2, appStoreVersions, betaAppLocalizations, betaAppReviewDetail, betaGroups, betaLicenseAgreement, betaTesters, builds, bundleId, ciProduct, contentRightsDeclaration, customerReviews, endUserLicenseAgreement, gameCenterDetail, gameCenterEnabledVersions, inAppPurchases, inAppPurchasesV2, isOrEverWasMadeForKids, marketplaceSearchDetail, name, perfPowerMetrics, preOrder, preReleaseVersions, primaryLocale, promotedPurchases, reviewSubmissions, sku, subscriptionGracePeriod, subscriptionGroups, subscriptionStatusUrl, subscriptionStatusUrlForSandbox, subscriptionStatusUrlVersion, subscriptionStatusUrlVersionForSandbox] |
| **fieldsAppEvents** | **List&lt;String&gt;**| the fields to include for returned resources of type appEvents | [optional] [enum: app, archivedTerritorySchedules, badge, deepLink, eventState, localizations, primaryLocale, priority, purchaseRequirement, purpose, referenceName, territorySchedules] |
| **fieldsBuilds** | **List&lt;String&gt;**| the fields to include for returned resources of type builds | [optional] [enum: app, appEncryptionDeclaration, appStoreVersion, betaAppReviewSubmission, betaBuildLocalizations, betaGroups, buildAudienceType, buildBetaDetail, buildBundles, computedMinMacOsVersion, diagnosticSignatures, expirationDate, expired, iconAssetToken, icons, individualTesters, lsMinimumSystemVersion, minOsVersion, perfPowerMetrics, preReleaseVersion, processingState, uploadedDate, usesNonExemptEncryption, version] |
| **fieldsBetaLicenseAgreements** | **List&lt;String&gt;**| the fields to include for returned resources of type betaLicenseAgreements | [optional] [enum: agreementText, app] |
| **fieldsAppClips** | **List&lt;String&gt;**| the fields to include for returned resources of type appClips | [optional] [enum: app, appClipAdvancedExperiences, appClipDefaultExperiences, bundleId] |
| **fieldsBetaAppLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type betaAppLocalizations | [optional] [enum: app, description, feedbackEmail, locale, marketingUrl, privacyPolicyUrl, tvOsPrivacyPolicy] |
| **fieldsAppInfos** | **List&lt;String&gt;**| the fields to include for returned resources of type appInfos | [optional] [enum: ageRatingDeclaration, app, appInfoLocalizations, appStoreAgeRating, appStoreState, brazilAgeRating, brazilAgeRatingV2, kidsAgeBand, primaryCategory, primarySubcategoryOne, primarySubcategoryTwo, secondaryCategory, secondarySubcategoryOne, secondarySubcategoryTwo, state] |
| **fieldsPreReleaseVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type preReleaseVersions | [optional] [enum: app, builds, platform, version] |
| **fieldsInAppPurchases** | **List&lt;String&gt;**| the fields to include for returned resources of type inAppPurchases | [optional] [enum: app, appStoreReviewScreenshot, apps, content, contentHosting, familySharable, iapPriceSchedule, inAppPurchaseAvailability, inAppPurchaseLocalizations, inAppPurchaseType, name, pricePoints, productId, promotedPurchase, referenceName, reviewNote, state] |
| **fieldsSubscriptionGroups** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionGroups | [optional] [enum: app, referenceName, subscriptionGroupLocalizations, subscriptions] |
| **fieldsAppPreOrders** | **List&lt;String&gt;**| the fields to include for returned resources of type appPreOrders | [optional] [enum: app, appReleaseDate, preOrderAvailableDate] |
| **fieldsGameCenterEnabledVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterEnabledVersions | [optional] [enum: app, compatibleVersions, iconAsset, platform, versionString] |
| **fieldsAppStoreVersionExperiments** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersionExperiments | [optional] [enum: app, appStoreVersionExperimentTreatments, controlVersions, endDate, latestControlVersion, name, platform, reviewRequired, startDate, started, state, trafficProportion] |
| **fieldsSubscriptionGracePeriods** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionGracePeriods | [optional] [enum: duration, optIn, renewalType, sandboxOptIn] |
| **fieldsEndUserLicenseAgreements** | **List&lt;String&gt;**| the fields to include for returned resources of type endUserLicenseAgreements | [optional] [enum: agreementText, app, territories] |
| **fieldsAppStoreVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersions | [optional] [enum: ageRatingDeclaration, alternativeDistributionPackage, app, appClipDefaultExperience, appStoreReviewDetail, appStoreState, appStoreVersionExperiments, appStoreVersionExperimentsV2, appStoreVersionLocalizations, appStoreVersionPhasedRelease, appStoreVersionSubmission, appVersionState, build, copyright, createdDate, customerReviews, downloadable, earliestReleaseDate, platform, releaseType, reviewType, routingAppCoverage, versionString] |
| **fieldsAppEncryptionDeclarations** | **List&lt;String&gt;**| the fields to include for returned resources of type appEncryptionDeclarations | [optional] [enum: app, appDescription, appEncryptionDeclarationDocument, appEncryptionDeclarationState, availableOnFrenchStore, builds, codeValue, containsProprietaryCryptography, containsThirdPartyCryptography, createdDate, documentName, documentType, documentUrl, exempt, platform, uploadedDate, usesEncryption] |
| **fieldsAppCustomProductPages** | **List&lt;String&gt;**| the fields to include for returned resources of type appCustomProductPages | [optional] [enum: app, appCustomProductPageVersions, appStoreVersionTemplate, customProductPageTemplate, name, url, visible] |
| **limitAppEncryptionDeclarations** | **Integer**| maximum number of related appEncryptionDeclarations returned (when they are included) | [optional] |
| **limitBetaGroups** | **Integer**| maximum number of related betaGroups returned (when they are included) | [optional] |
| **limitAppStoreVersions** | **Integer**| maximum number of related appStoreVersions returned (when they are included) | [optional] |
| **limitPreReleaseVersions** | **Integer**| maximum number of related preReleaseVersions returned (when they are included) | [optional] |
| **limitBetaAppLocalizations** | **Integer**| maximum number of related betaAppLocalizations returned (when they are included) | [optional] |
| **limitBuilds** | **Integer**| maximum number of related builds returned (when they are included) | [optional] |
| **limitAppInfos** | **Integer**| maximum number of related appInfos returned (when they are included) | [optional] |
| **limitAppClips** | **Integer**| maximum number of related appClips returned (when they are included) | [optional] |
| **limitInAppPurchases** | **Integer**| maximum number of related inAppPurchases returned (when they are included) | [optional] |
| **limitSubscriptionGroups** | **Integer**| maximum number of related subscriptionGroups returned (when they are included) | [optional] |
| **limitGameCenterEnabledVersions** | **Integer**| maximum number of related gameCenterEnabledVersions returned (when they are included) | [optional] |
| **limitAppCustomProductPages** | **Integer**| maximum number of related appCustomProductPages returned (when they are included) | [optional] |
| **limitInAppPurchasesV2** | **Integer**| maximum number of related inAppPurchasesV2 returned (when they are included) | [optional] |
| **limitPromotedPurchases** | **Integer**| maximum number of related promotedPurchases returned (when they are included) | [optional] |
| **limitAppEvents** | **Integer**| maximum number of related appEvents returned (when they are included) | [optional] |
| **limitReviewSubmissions** | **Integer**| maximum number of related reviewSubmissions returned (when they are included) | [optional] |
| **limitAppStoreVersionExperimentsV2** | **Integer**| maximum number of related appStoreVersionExperimentsV2 returned (when they are included) | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: appClips, appCustomProductPages, appEncryptionDeclarations, appEvents, appInfos, appStoreVersionExperimentsV2, appStoreVersions, betaAppLocalizations, betaAppReviewDetail, betaGroups, betaLicenseAgreement, builds, ciProduct, endUserLicenseAgreement, gameCenterDetail, gameCenterEnabledVersions, inAppPurchases, inAppPurchasesV2, preOrder, preReleaseVersions, promotedPurchases, reviewSubmissions, subscriptionGracePeriod, subscriptionGroups] |

### Return type

[**AppResponse**](AppResponse.md)

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
| **200** | Single App |  -  |


## ciProductsBuildRunsGetToManyRelated

> CiBuildRunsResponse ciProductsBuildRunsGetToManyRelated(id, filterBuilds, sort, fieldsScmGitReferences, fieldsCiBuildRuns, fieldsCiWorkflows, fieldsScmPullRequests, fieldsCiProducts, fieldsBuilds, limit, limitBuilds, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.CiProductsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        CiProductsApi apiInstance = new CiProductsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> filterBuilds = Arrays.asList(); // List<String> | filter by id(s) of related 'builds'
        List<String> sort = Arrays.asList(); // List<String> | comma-separated list of sort expressions; resources will be sorted as specified
        List<String> fieldsScmGitReferences = Arrays.asList(); // List<String> | the fields to include for returned resources of type scmGitReferences
        List<String> fieldsCiBuildRuns = Arrays.asList(); // List<String> | the fields to include for returned resources of type ciBuildRuns
        List<String> fieldsCiWorkflows = Arrays.asList(); // List<String> | the fields to include for returned resources of type ciWorkflows
        List<String> fieldsScmPullRequests = Arrays.asList(); // List<String> | the fields to include for returned resources of type scmPullRequests
        List<String> fieldsCiProducts = Arrays.asList(); // List<String> | the fields to include for returned resources of type ciProducts
        List<String> fieldsBuilds = Arrays.asList(); // List<String> | the fields to include for returned resources of type builds
        Integer limit = 56; // Integer | maximum resources per page
        Integer limitBuilds = 56; // Integer | maximum number of related builds returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            CiBuildRunsResponse result = apiInstance.ciProductsBuildRunsGetToManyRelated(id, filterBuilds, sort, fieldsScmGitReferences, fieldsCiBuildRuns, fieldsCiWorkflows, fieldsScmPullRequests, fieldsCiProducts, fieldsBuilds, limit, limitBuilds, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CiProductsApi#ciProductsBuildRunsGetToManyRelated");
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
| **filterBuilds** | **List&lt;String&gt;**| filter by id(s) of related &#39;builds&#39; | [optional] |
| **sort** | **List&lt;String&gt;**| comma-separated list of sort expressions; resources will be sorted as specified | [optional] [enum: number, -number] |
| **fieldsScmGitReferences** | **List&lt;String&gt;**| the fields to include for returned resources of type scmGitReferences | [optional] [enum: canonicalName, isDeleted, kind, name, repository] |
| **fieldsCiBuildRuns** | **List&lt;String&gt;**| the fields to include for returned resources of type ciBuildRuns | [optional] [enum: actions, buildRun, builds, cancelReason, clean, completionStatus, createdDate, destinationBranch, destinationCommit, executionProgress, finishedDate, isPullRequestBuild, issueCounts, number, product, pullRequest, sourceBranchOrTag, sourceCommit, startReason, startedDate, workflow] |
| **fieldsCiWorkflows** | **List&lt;String&gt;**| the fields to include for returned resources of type ciWorkflows | [optional] [enum: actions, branchStartCondition, buildRuns, clean, containerFilePath, description, isEnabled, isLockedForEditing, lastModifiedDate, macOsVersion, manualBranchStartCondition, manualPullRequestStartCondition, manualTagStartCondition, name, product, pullRequestStartCondition, repository, scheduledStartCondition, tagStartCondition, xcodeVersion] |
| **fieldsScmPullRequests** | **List&lt;String&gt;**| the fields to include for returned resources of type scmPullRequests | [optional] [enum: destinationBranchName, destinationRepositoryName, destinationRepositoryOwner, isClosed, isCrossRepository, number, repository, sourceBranchName, sourceRepositoryName, sourceRepositoryOwner, title, webUrl] |
| **fieldsCiProducts** | **List&lt;String&gt;**| the fields to include for returned resources of type ciProducts | [optional] [enum: additionalRepositories, app, buildRuns, bundleId, createdDate, name, primaryRepositories, productType, workflows] |
| **fieldsBuilds** | **List&lt;String&gt;**| the fields to include for returned resources of type builds | [optional] [enum: app, appEncryptionDeclaration, appStoreVersion, betaAppReviewSubmission, betaBuildLocalizations, betaGroups, buildAudienceType, buildBetaDetail, buildBundles, computedMinMacOsVersion, diagnosticSignatures, expirationDate, expired, iconAssetToken, icons, individualTesters, lsMinimumSystemVersion, minOsVersion, perfPowerMetrics, preReleaseVersion, processingState, uploadedDate, usesNonExemptEncryption, version] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **limitBuilds** | **Integer**| maximum number of related builds returned (when they are included) | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: builds, destinationBranch, product, pullRequest, sourceBranchOrTag, workflow] |

### Return type

[**CiBuildRunsResponse**](CiBuildRunsResponse.md)

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
| **200** | List of CiBuildRuns |  -  |


## ciProductsDeleteInstance

> ciProductsDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.CiProductsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        CiProductsApi apiInstance = new CiProductsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.ciProductsDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling CiProductsApi#ciProductsDeleteInstance");
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


## ciProductsGetCollection

> CiProductsResponse ciProductsGetCollection(filterProductType, filterApp, fieldsCiProducts, limit, include, fieldsCiBuildRuns, fieldsCiWorkflows, fieldsApps, fieldsScmRepositories, limitPrimaryRepositories)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.CiProductsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        CiProductsApi apiInstance = new CiProductsApi(defaultClient);
        List<String> filterProductType = Arrays.asList(); // List<String> | filter by attribute 'productType'
        List<String> filterApp = Arrays.asList(); // List<String> | filter by id(s) of related 'app'
        List<String> fieldsCiProducts = Arrays.asList(); // List<String> | the fields to include for returned resources of type ciProducts
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsCiBuildRuns = Arrays.asList(); // List<String> | the fields to include for returned resources of type ciBuildRuns
        List<String> fieldsCiWorkflows = Arrays.asList(); // List<String> | the fields to include for returned resources of type ciWorkflows
        List<String> fieldsApps = Arrays.asList(); // List<String> | the fields to include for returned resources of type apps
        List<String> fieldsScmRepositories = Arrays.asList(); // List<String> | the fields to include for returned resources of type scmRepositories
        Integer limitPrimaryRepositories = 56; // Integer | maximum number of related primaryRepositories returned (when they are included)
        try {
            CiProductsResponse result = apiInstance.ciProductsGetCollection(filterProductType, filterApp, fieldsCiProducts, limit, include, fieldsCiBuildRuns, fieldsCiWorkflows, fieldsApps, fieldsScmRepositories, limitPrimaryRepositories);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CiProductsApi#ciProductsGetCollection");
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
| **filterProductType** | **List&lt;String&gt;**| filter by attribute &#39;productType&#39; | [optional] [enum: APP, FRAMEWORK] |
| **filterApp** | **List&lt;String&gt;**| filter by id(s) of related &#39;app&#39; | [optional] |
| **fieldsCiProducts** | **List&lt;String&gt;**| the fields to include for returned resources of type ciProducts | [optional] [enum: additionalRepositories, app, buildRuns, bundleId, createdDate, name, primaryRepositories, productType, workflows] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: app, bundleId, primaryRepositories] |
| **fieldsCiBuildRuns** | **List&lt;String&gt;**| the fields to include for returned resources of type ciBuildRuns | [optional] [enum: actions, buildRun, builds, cancelReason, clean, completionStatus, createdDate, destinationBranch, destinationCommit, executionProgress, finishedDate, isPullRequestBuild, issueCounts, number, product, pullRequest, sourceBranchOrTag, sourceCommit, startReason, startedDate, workflow] |
| **fieldsCiWorkflows** | **List&lt;String&gt;**| the fields to include for returned resources of type ciWorkflows | [optional] [enum: actions, branchStartCondition, buildRuns, clean, containerFilePath, description, isEnabled, isLockedForEditing, lastModifiedDate, macOsVersion, manualBranchStartCondition, manualPullRequestStartCondition, manualTagStartCondition, name, product, pullRequestStartCondition, repository, scheduledStartCondition, tagStartCondition, xcodeVersion] |
| **fieldsApps** | **List&lt;String&gt;**| the fields to include for returned resources of type apps | [optional] [enum: alternativeDistributionKey, analyticsReportRequests, appAvailability, appClips, appCustomProductPages, appEncryptionDeclarations, appEvents, appInfos, appPricePoints, appPriceSchedule, appStoreVersionExperimentsV2, appStoreVersions, betaAppLocalizations, betaAppReviewDetail, betaGroups, betaLicenseAgreement, betaTesters, builds, bundleId, ciProduct, contentRightsDeclaration, customerReviews, endUserLicenseAgreement, gameCenterDetail, gameCenterEnabledVersions, inAppPurchases, inAppPurchasesV2, isOrEverWasMadeForKids, marketplaceSearchDetail, name, perfPowerMetrics, preOrder, preReleaseVersions, primaryLocale, promotedPurchases, reviewSubmissions, sku, subscriptionGracePeriod, subscriptionGroups, subscriptionStatusUrl, subscriptionStatusUrlForSandbox, subscriptionStatusUrlVersion, subscriptionStatusUrlVersionForSandbox] |
| **fieldsScmRepositories** | **List&lt;String&gt;**| the fields to include for returned resources of type scmRepositories | [optional] [enum: defaultBranch, gitReferences, httpCloneUrl, lastAccessedDate, ownerName, pullRequests, repositoryName, scmProvider, sshCloneUrl] |
| **limitPrimaryRepositories** | **Integer**| maximum number of related primaryRepositories returned (when they are included) | [optional] |

### Return type

[**CiProductsResponse**](CiProductsResponse.md)

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
| **200** | List of CiProducts |  -  |


## ciProductsGetInstance

> CiProductResponse ciProductsGetInstance(id, fieldsCiProducts, include, fieldsCiBuildRuns, fieldsCiWorkflows, fieldsApps, fieldsScmRepositories, limitPrimaryRepositories)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.CiProductsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        CiProductsApi apiInstance = new CiProductsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsCiProducts = Arrays.asList(); // List<String> | the fields to include for returned resources of type ciProducts
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsCiBuildRuns = Arrays.asList(); // List<String> | the fields to include for returned resources of type ciBuildRuns
        List<String> fieldsCiWorkflows = Arrays.asList(); // List<String> | the fields to include for returned resources of type ciWorkflows
        List<String> fieldsApps = Arrays.asList(); // List<String> | the fields to include for returned resources of type apps
        List<String> fieldsScmRepositories = Arrays.asList(); // List<String> | the fields to include for returned resources of type scmRepositories
        Integer limitPrimaryRepositories = 56; // Integer | maximum number of related primaryRepositories returned (when they are included)
        try {
            CiProductResponse result = apiInstance.ciProductsGetInstance(id, fieldsCiProducts, include, fieldsCiBuildRuns, fieldsCiWorkflows, fieldsApps, fieldsScmRepositories, limitPrimaryRepositories);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CiProductsApi#ciProductsGetInstance");
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
| **fieldsCiProducts** | **List&lt;String&gt;**| the fields to include for returned resources of type ciProducts | [optional] [enum: additionalRepositories, app, buildRuns, bundleId, createdDate, name, primaryRepositories, productType, workflows] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: app, bundleId, primaryRepositories] |
| **fieldsCiBuildRuns** | **List&lt;String&gt;**| the fields to include for returned resources of type ciBuildRuns | [optional] [enum: actions, buildRun, builds, cancelReason, clean, completionStatus, createdDate, destinationBranch, destinationCommit, executionProgress, finishedDate, isPullRequestBuild, issueCounts, number, product, pullRequest, sourceBranchOrTag, sourceCommit, startReason, startedDate, workflow] |
| **fieldsCiWorkflows** | **List&lt;String&gt;**| the fields to include for returned resources of type ciWorkflows | [optional] [enum: actions, branchStartCondition, buildRuns, clean, containerFilePath, description, isEnabled, isLockedForEditing, lastModifiedDate, macOsVersion, manualBranchStartCondition, manualPullRequestStartCondition, manualTagStartCondition, name, product, pullRequestStartCondition, repository, scheduledStartCondition, tagStartCondition, xcodeVersion] |
| **fieldsApps** | **List&lt;String&gt;**| the fields to include for returned resources of type apps | [optional] [enum: alternativeDistributionKey, analyticsReportRequests, appAvailability, appClips, appCustomProductPages, appEncryptionDeclarations, appEvents, appInfos, appPricePoints, appPriceSchedule, appStoreVersionExperimentsV2, appStoreVersions, betaAppLocalizations, betaAppReviewDetail, betaGroups, betaLicenseAgreement, betaTesters, builds, bundleId, ciProduct, contentRightsDeclaration, customerReviews, endUserLicenseAgreement, gameCenterDetail, gameCenterEnabledVersions, inAppPurchases, inAppPurchasesV2, isOrEverWasMadeForKids, marketplaceSearchDetail, name, perfPowerMetrics, preOrder, preReleaseVersions, primaryLocale, promotedPurchases, reviewSubmissions, sku, subscriptionGracePeriod, subscriptionGroups, subscriptionStatusUrl, subscriptionStatusUrlForSandbox, subscriptionStatusUrlVersion, subscriptionStatusUrlVersionForSandbox] |
| **fieldsScmRepositories** | **List&lt;String&gt;**| the fields to include for returned resources of type scmRepositories | [optional] [enum: defaultBranch, gitReferences, httpCloneUrl, lastAccessedDate, ownerName, pullRequests, repositoryName, scmProvider, sshCloneUrl] |
| **limitPrimaryRepositories** | **Integer**| maximum number of related primaryRepositories returned (when they are included) | [optional] |

### Return type

[**CiProductResponse**](CiProductResponse.md)

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
| **200** | Single CiProduct |  -  |


## ciProductsPrimaryRepositoriesGetToManyRelated

> ScmRepositoriesResponse ciProductsPrimaryRepositoriesGetToManyRelated(id, filterId, fieldsScmGitReferences, fieldsScmProviders, fieldsScmRepositories, limit, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.CiProductsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        CiProductsApi apiInstance = new CiProductsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> filterId = Arrays.asList(); // List<String> | filter by id(s)
        List<String> fieldsScmGitReferences = Arrays.asList(); // List<String> | the fields to include for returned resources of type scmGitReferences
        List<String> fieldsScmProviders = Arrays.asList(); // List<String> | the fields to include for returned resources of type scmProviders
        List<String> fieldsScmRepositories = Arrays.asList(); // List<String> | the fields to include for returned resources of type scmRepositories
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            ScmRepositoriesResponse result = apiInstance.ciProductsPrimaryRepositoriesGetToManyRelated(id, filterId, fieldsScmGitReferences, fieldsScmProviders, fieldsScmRepositories, limit, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CiProductsApi#ciProductsPrimaryRepositoriesGetToManyRelated");
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
| **filterId** | **List&lt;String&gt;**| filter by id(s) | [optional] |
| **fieldsScmGitReferences** | **List&lt;String&gt;**| the fields to include for returned resources of type scmGitReferences | [optional] [enum: canonicalName, isDeleted, kind, name, repository] |
| **fieldsScmProviders** | **List&lt;String&gt;**| the fields to include for returned resources of type scmProviders | [optional] [enum: repositories, scmProviderType, url] |
| **fieldsScmRepositories** | **List&lt;String&gt;**| the fields to include for returned resources of type scmRepositories | [optional] [enum: defaultBranch, gitReferences, httpCloneUrl, lastAccessedDate, ownerName, pullRequests, repositoryName, scmProvider, sshCloneUrl] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: defaultBranch, scmProvider] |

### Return type

[**ScmRepositoriesResponse**](ScmRepositoriesResponse.md)

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
| **200** | List of ScmRepositories |  -  |


## ciProductsWorkflowsGetToManyRelated

> CiWorkflowsResponse ciProductsWorkflowsGetToManyRelated(id, fieldsCiXcodeVersions, fieldsCiWorkflows, fieldsCiMacOsVersions, fieldsCiProducts, fieldsScmRepositories, limit, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.CiProductsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        CiProductsApi apiInstance = new CiProductsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsCiXcodeVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type ciXcodeVersions
        List<String> fieldsCiWorkflows = Arrays.asList(); // List<String> | the fields to include for returned resources of type ciWorkflows
        List<String> fieldsCiMacOsVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type ciMacOsVersions
        List<String> fieldsCiProducts = Arrays.asList(); // List<String> | the fields to include for returned resources of type ciProducts
        List<String> fieldsScmRepositories = Arrays.asList(); // List<String> | the fields to include for returned resources of type scmRepositories
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            CiWorkflowsResponse result = apiInstance.ciProductsWorkflowsGetToManyRelated(id, fieldsCiXcodeVersions, fieldsCiWorkflows, fieldsCiMacOsVersions, fieldsCiProducts, fieldsScmRepositories, limit, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CiProductsApi#ciProductsWorkflowsGetToManyRelated");
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
| **fieldsCiXcodeVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type ciXcodeVersions | [optional] [enum: macOsVersions, name, testDestinations, version] |
| **fieldsCiWorkflows** | **List&lt;String&gt;**| the fields to include for returned resources of type ciWorkflows | [optional] [enum: actions, branchStartCondition, buildRuns, clean, containerFilePath, description, isEnabled, isLockedForEditing, lastModifiedDate, macOsVersion, manualBranchStartCondition, manualPullRequestStartCondition, manualTagStartCondition, name, product, pullRequestStartCondition, repository, scheduledStartCondition, tagStartCondition, xcodeVersion] |
| **fieldsCiMacOsVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type ciMacOsVersions | [optional] [enum: name, version, xcodeVersions] |
| **fieldsCiProducts** | **List&lt;String&gt;**| the fields to include for returned resources of type ciProducts | [optional] [enum: additionalRepositories, app, buildRuns, bundleId, createdDate, name, primaryRepositories, productType, workflows] |
| **fieldsScmRepositories** | **List&lt;String&gt;**| the fields to include for returned resources of type scmRepositories | [optional] [enum: defaultBranch, gitReferences, httpCloneUrl, lastAccessedDate, ownerName, pullRequests, repositoryName, scmProvider, sshCloneUrl] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: macOsVersion, product, repository, xcodeVersion] |

### Return type

[**CiWorkflowsResponse**](CiWorkflowsResponse.md)

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
| **200** | List of CiWorkflows |  -  |

