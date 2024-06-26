# CiBuildRunsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ciBuildRunsActionsGetToManyRelated**](CiBuildRunsApi.md#ciBuildRunsActionsGetToManyRelated) | **GET** /v1/ciBuildRuns/{id}/actions |  |
| [**ciBuildRunsBuildsGetToManyRelated**](CiBuildRunsApi.md#ciBuildRunsBuildsGetToManyRelated) | **GET** /v1/ciBuildRuns/{id}/builds |  |
| [**ciBuildRunsCreateInstance**](CiBuildRunsApi.md#ciBuildRunsCreateInstance) | **POST** /v1/ciBuildRuns |  |
| [**ciBuildRunsGetInstance**](CiBuildRunsApi.md#ciBuildRunsGetInstance) | **GET** /v1/ciBuildRuns/{id} |  |



## ciBuildRunsActionsGetToManyRelated

> CiBuildActionsResponse ciBuildRunsActionsGetToManyRelated(id, fieldsCiBuildRuns, fieldsCiBuildActions, limit, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.CiBuildRunsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        CiBuildRunsApi apiInstance = new CiBuildRunsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsCiBuildRuns = Arrays.asList(); // List<String> | the fields to include for returned resources of type ciBuildRuns
        List<String> fieldsCiBuildActions = Arrays.asList(); // List<String> | the fields to include for returned resources of type ciBuildActions
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            CiBuildActionsResponse result = apiInstance.ciBuildRunsActionsGetToManyRelated(id, fieldsCiBuildRuns, fieldsCiBuildActions, limit, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CiBuildRunsApi#ciBuildRunsActionsGetToManyRelated");
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
| **fieldsCiBuildRuns** | **List&lt;String&gt;**| the fields to include for returned resources of type ciBuildRuns | [optional] [enum: actions, buildRun, builds, cancelReason, clean, completionStatus, createdDate, destinationBranch, destinationCommit, executionProgress, finishedDate, isPullRequestBuild, issueCounts, number, product, pullRequest, sourceBranchOrTag, sourceCommit, startReason, startedDate, workflow] |
| **fieldsCiBuildActions** | **List&lt;String&gt;**| the fields to include for returned resources of type ciBuildActions | [optional] [enum: actionType, artifacts, buildRun, completionStatus, executionProgress, finishedDate, isRequiredToPass, issueCounts, issues, name, startedDate, testResults] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: buildRun] |

### Return type

[**CiBuildActionsResponse**](CiBuildActionsResponse.md)

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
| **200** | List of CiBuildActions |  -  |


## ciBuildRunsBuildsGetToManyRelated

> BuildsResponse ciBuildRunsBuildsGetToManyRelated(id, filterBetaAppReviewSubmissionBetaReviewState, filterBuildAudienceType, filterExpired, filterPreReleaseVersionPlatform, filterPreReleaseVersionVersion, filterProcessingState, filterUsesNonExemptEncryption, filterVersion, filterApp, filterAppStoreVersion, filterBetaGroups, filterPreReleaseVersion, filterId, sort, fieldsBuildBundles, fieldsBuildIcons, fieldsBetaAppReviewSubmissions, fieldsBuildBetaDetails, fieldsBetaTesters, fieldsPreReleaseVersions, fieldsBetaBuildLocalizations, fieldsAppStoreVersions, fieldsAppEncryptionDeclarations, fieldsApps, fieldsBuilds, fieldsBetaGroups, limit, limitIndividualTesters, limitBetaGroups, limitBetaBuildLocalizations, limitIcons, limitBuildBundles, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.CiBuildRunsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        CiBuildRunsApi apiInstance = new CiBuildRunsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
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
        List<String> fieldsBuildBundles = Arrays.asList(); // List<String> | the fields to include for returned resources of type buildBundles
        List<String> fieldsBuildIcons = Arrays.asList(); // List<String> | the fields to include for returned resources of type buildIcons
        List<String> fieldsBetaAppReviewSubmissions = Arrays.asList(); // List<String> | the fields to include for returned resources of type betaAppReviewSubmissions
        List<String> fieldsBuildBetaDetails = Arrays.asList(); // List<String> | the fields to include for returned resources of type buildBetaDetails
        List<String> fieldsBetaTesters = Arrays.asList(); // List<String> | the fields to include for returned resources of type betaTesters
        List<String> fieldsPreReleaseVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type preReleaseVersions
        List<String> fieldsBetaBuildLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type betaBuildLocalizations
        List<String> fieldsAppStoreVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersions
        List<String> fieldsAppEncryptionDeclarations = Arrays.asList(); // List<String> | the fields to include for returned resources of type appEncryptionDeclarations
        List<String> fieldsApps = Arrays.asList(); // List<String> | the fields to include for returned resources of type apps
        List<String> fieldsBuilds = Arrays.asList(); // List<String> | the fields to include for returned resources of type builds
        List<String> fieldsBetaGroups = Arrays.asList(); // List<String> | the fields to include for returned resources of type betaGroups
        Integer limit = 56; // Integer | maximum resources per page
        Integer limitIndividualTesters = 56; // Integer | maximum number of related individualTesters returned (when they are included)
        Integer limitBetaGroups = 56; // Integer | maximum number of related betaGroups returned (when they are included)
        Integer limitBetaBuildLocalizations = 56; // Integer | maximum number of related betaBuildLocalizations returned (when they are included)
        Integer limitIcons = 56; // Integer | maximum number of related icons returned (when they are included)
        Integer limitBuildBundles = 56; // Integer | maximum number of related buildBundles returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            BuildsResponse result = apiInstance.ciBuildRunsBuildsGetToManyRelated(id, filterBetaAppReviewSubmissionBetaReviewState, filterBuildAudienceType, filterExpired, filterPreReleaseVersionPlatform, filterPreReleaseVersionVersion, filterProcessingState, filterUsesNonExemptEncryption, filterVersion, filterApp, filterAppStoreVersion, filterBetaGroups, filterPreReleaseVersion, filterId, sort, fieldsBuildBundles, fieldsBuildIcons, fieldsBetaAppReviewSubmissions, fieldsBuildBetaDetails, fieldsBetaTesters, fieldsPreReleaseVersions, fieldsBetaBuildLocalizations, fieldsAppStoreVersions, fieldsAppEncryptionDeclarations, fieldsApps, fieldsBuilds, fieldsBetaGroups, limit, limitIndividualTesters, limitBetaGroups, limitBetaBuildLocalizations, limitIcons, limitBuildBundles, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CiBuildRunsApi#ciBuildRunsBuildsGetToManyRelated");
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
| **fieldsBuildBundles** | **List&lt;String&gt;**| the fields to include for returned resources of type buildBundles | [optional] [enum: appClipDomainCacheStatus, appClipDomainDebugStatus, betaAppClipInvocations, buildBundleFileSizes, bundleId, bundleType, dSYMUrl, deviceProtocols, entitlements, fileName, hasOnDemandResources, hasPrerenderedIcon, hasSirikit, includesSymbols, isIosBuildMacAppStoreCompatible, locales, platformBuild, requiredCapabilities, sdkBuild, supportedArchitectures, usesLocationServices] |
| **fieldsBuildIcons** | **List&lt;String&gt;**| the fields to include for returned resources of type buildIcons | [optional] [enum: iconAsset, iconType, name] |
| **fieldsBetaAppReviewSubmissions** | **List&lt;String&gt;**| the fields to include for returned resources of type betaAppReviewSubmissions | [optional] [enum: betaReviewState, build, submittedDate] |
| **fieldsBuildBetaDetails** | **List&lt;String&gt;**| the fields to include for returned resources of type buildBetaDetails | [optional] [enum: autoNotifyEnabled, build, externalBuildState, internalBuildState] |
| **fieldsBetaTesters** | **List&lt;String&gt;**| the fields to include for returned resources of type betaTesters | [optional] [enum: apps, betaGroups, builds, email, firstName, inviteType, lastName, state] |
| **fieldsPreReleaseVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type preReleaseVersions | [optional] [enum: app, builds, platform, version] |
| **fieldsBetaBuildLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type betaBuildLocalizations | [optional] [enum: build, locale, whatsNew] |
| **fieldsAppStoreVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersions | [optional] [enum: ageRatingDeclaration, alternativeDistributionPackage, app, appClipDefaultExperience, appStoreReviewDetail, appStoreState, appStoreVersionExperiments, appStoreVersionExperimentsV2, appStoreVersionLocalizations, appStoreVersionPhasedRelease, appStoreVersionSubmission, appVersionState, build, copyright, createdDate, customerReviews, downloadable, earliestReleaseDate, platform, releaseType, reviewType, routingAppCoverage, versionString] |
| **fieldsAppEncryptionDeclarations** | **List&lt;String&gt;**| the fields to include for returned resources of type appEncryptionDeclarations | [optional] [enum: app, appDescription, appEncryptionDeclarationDocument, appEncryptionDeclarationState, availableOnFrenchStore, builds, codeValue, containsProprietaryCryptography, containsThirdPartyCryptography, createdDate, documentName, documentType, documentUrl, exempt, platform, uploadedDate, usesEncryption] |
| **fieldsApps** | **List&lt;String&gt;**| the fields to include for returned resources of type apps | [optional] [enum: alternativeDistributionKey, analyticsReportRequests, appAvailability, appClips, appCustomProductPages, appEncryptionDeclarations, appEvents, appInfos, appPricePoints, appPriceSchedule, appStoreVersionExperimentsV2, appStoreVersions, betaAppLocalizations, betaAppReviewDetail, betaGroups, betaLicenseAgreement, betaTesters, builds, bundleId, ciProduct, contentRightsDeclaration, customerReviews, endUserLicenseAgreement, gameCenterDetail, gameCenterEnabledVersions, inAppPurchases, inAppPurchasesV2, isOrEverWasMadeForKids, marketplaceSearchDetail, name, perfPowerMetrics, preOrder, preReleaseVersions, primaryLocale, promotedPurchases, reviewSubmissions, sku, subscriptionGracePeriod, subscriptionGroups, subscriptionStatusUrl, subscriptionStatusUrlForSandbox, subscriptionStatusUrlVersion, subscriptionStatusUrlVersionForSandbox] |
| **fieldsBuilds** | **List&lt;String&gt;**| the fields to include for returned resources of type builds | [optional] [enum: app, appEncryptionDeclaration, appStoreVersion, betaAppReviewSubmission, betaBuildLocalizations, betaGroups, buildAudienceType, buildBetaDetail, buildBundles, computedMinMacOsVersion, diagnosticSignatures, expirationDate, expired, iconAssetToken, icons, individualTesters, lsMinimumSystemVersion, minOsVersion, perfPowerMetrics, preReleaseVersion, processingState, uploadedDate, usesNonExemptEncryption, version] |
| **fieldsBetaGroups** | **List&lt;String&gt;**| the fields to include for returned resources of type betaGroups | [optional] [enum: app, betaTesters, builds, createdDate, feedbackEnabled, hasAccessToAllBuilds, iosBuildsAvailableForAppleSiliconMac, isInternalGroup, name, publicLink, publicLinkEnabled, publicLinkId, publicLinkLimit, publicLinkLimitEnabled] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **limitIndividualTesters** | **Integer**| maximum number of related individualTesters returned (when they are included) | [optional] |
| **limitBetaGroups** | **Integer**| maximum number of related betaGroups returned (when they are included) | [optional] |
| **limitBetaBuildLocalizations** | **Integer**| maximum number of related betaBuildLocalizations returned (when they are included) | [optional] |
| **limitIcons** | **Integer**| maximum number of related icons returned (when they are included) | [optional] |
| **limitBuildBundles** | **Integer**| maximum number of related buildBundles returned (when they are included) | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: app, appEncryptionDeclaration, appStoreVersion, betaAppReviewSubmission, betaBuildLocalizations, betaGroups, buildBetaDetail, buildBundles, icons, individualTesters, preReleaseVersion] |

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
| **404** | Not found error |  -  |
| **200** | List of Builds |  -  |


## ciBuildRunsCreateInstance

> CiBuildRunResponse ciBuildRunsCreateInstance(ciBuildRunCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.CiBuildRunsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        CiBuildRunsApi apiInstance = new CiBuildRunsApi(defaultClient);
        CiBuildRunCreateRequest ciBuildRunCreateRequest = new CiBuildRunCreateRequest(); // CiBuildRunCreateRequest | CiBuildRun representation
        try {
            CiBuildRunResponse result = apiInstance.ciBuildRunsCreateInstance(ciBuildRunCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CiBuildRunsApi#ciBuildRunsCreateInstance");
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
| **ciBuildRunCreateRequest** | [**CiBuildRunCreateRequest**](CiBuildRunCreateRequest.md)| CiBuildRun representation | |

### Return type

[**CiBuildRunResponse**](CiBuildRunResponse.md)

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
| **201** | Single CiBuildRun |  -  |
| **409** | Request entity error(s) |  -  |


## ciBuildRunsGetInstance

> CiBuildRunResponse ciBuildRunsGetInstance(id, fieldsCiBuildRuns, include, fieldsCiBuildActions, fieldsBuilds, limitBuilds)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.CiBuildRunsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        CiBuildRunsApi apiInstance = new CiBuildRunsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsCiBuildRuns = Arrays.asList(); // List<String> | the fields to include for returned resources of type ciBuildRuns
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsCiBuildActions = Arrays.asList(); // List<String> | the fields to include for returned resources of type ciBuildActions
        List<String> fieldsBuilds = Arrays.asList(); // List<String> | the fields to include for returned resources of type builds
        Integer limitBuilds = 56; // Integer | maximum number of related builds returned (when they are included)
        try {
            CiBuildRunResponse result = apiInstance.ciBuildRunsGetInstance(id, fieldsCiBuildRuns, include, fieldsCiBuildActions, fieldsBuilds, limitBuilds);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CiBuildRunsApi#ciBuildRunsGetInstance");
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
| **fieldsCiBuildRuns** | **List&lt;String&gt;**| the fields to include for returned resources of type ciBuildRuns | [optional] [enum: actions, buildRun, builds, cancelReason, clean, completionStatus, createdDate, destinationBranch, destinationCommit, executionProgress, finishedDate, isPullRequestBuild, issueCounts, number, product, pullRequest, sourceBranchOrTag, sourceCommit, startReason, startedDate, workflow] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: builds, destinationBranch, product, pullRequest, sourceBranchOrTag, workflow] |
| **fieldsCiBuildActions** | **List&lt;String&gt;**| the fields to include for returned resources of type ciBuildActions | [optional] [enum: actionType, artifacts, buildRun, completionStatus, executionProgress, finishedDate, isRequiredToPass, issueCounts, issues, name, startedDate, testResults] |
| **fieldsBuilds** | **List&lt;String&gt;**| the fields to include for returned resources of type builds | [optional] [enum: app, appEncryptionDeclaration, appStoreVersion, betaAppReviewSubmission, betaBuildLocalizations, betaGroups, buildAudienceType, buildBetaDetail, buildBundles, computedMinMacOsVersion, diagnosticSignatures, expirationDate, expired, iconAssetToken, icons, individualTesters, lsMinimumSystemVersion, minOsVersion, perfPowerMetrics, preReleaseVersion, processingState, uploadedDate, usesNonExemptEncryption, version] |
| **limitBuilds** | **Integer**| maximum number of related builds returned (when they are included) | [optional] |

### Return type

[**CiBuildRunResponse**](CiBuildRunResponse.md)

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
| **200** | Single CiBuildRun |  -  |

