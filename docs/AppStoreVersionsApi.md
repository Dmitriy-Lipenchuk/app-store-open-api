# AppStoreVersionsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**appStoreVersionsAgeRatingDeclarationGetToOneRelated**](AppStoreVersionsApi.md#appStoreVersionsAgeRatingDeclarationGetToOneRelated) | **GET** /v1/appStoreVersions/{id}/ageRatingDeclaration |  |
| [**appStoreVersionsAlternativeDistributionPackageGetToOneRelated**](AppStoreVersionsApi.md#appStoreVersionsAlternativeDistributionPackageGetToOneRelated) | **GET** /v1/appStoreVersions/{id}/alternativeDistributionPackage |  |
| [**appStoreVersionsAppClipDefaultExperienceGetToOneRelated**](AppStoreVersionsApi.md#appStoreVersionsAppClipDefaultExperienceGetToOneRelated) | **GET** /v1/appStoreVersions/{id}/appClipDefaultExperience |  |
| [**appStoreVersionsAppClipDefaultExperienceGetToOneRelationship**](AppStoreVersionsApi.md#appStoreVersionsAppClipDefaultExperienceGetToOneRelationship) | **GET** /v1/appStoreVersions/{id}/relationships/appClipDefaultExperience |  |
| [**appStoreVersionsAppClipDefaultExperienceUpdateToOneRelationship**](AppStoreVersionsApi.md#appStoreVersionsAppClipDefaultExperienceUpdateToOneRelationship) | **PATCH** /v1/appStoreVersions/{id}/relationships/appClipDefaultExperience |  |
| [**appStoreVersionsAppStoreReviewDetailGetToOneRelated**](AppStoreVersionsApi.md#appStoreVersionsAppStoreReviewDetailGetToOneRelated) | **GET** /v1/appStoreVersions/{id}/appStoreReviewDetail |  |
| [**appStoreVersionsAppStoreVersionExperimentsGetToManyRelated**](AppStoreVersionsApi.md#appStoreVersionsAppStoreVersionExperimentsGetToManyRelated) | **GET** /v1/appStoreVersions/{id}/appStoreVersionExperiments |  |
| [**appStoreVersionsAppStoreVersionExperimentsV2GetToManyRelated**](AppStoreVersionsApi.md#appStoreVersionsAppStoreVersionExperimentsV2GetToManyRelated) | **GET** /v1/appStoreVersions/{id}/appStoreVersionExperimentsV2 |  |
| [**appStoreVersionsAppStoreVersionLocalizationsGetToManyRelated**](AppStoreVersionsApi.md#appStoreVersionsAppStoreVersionLocalizationsGetToManyRelated) | **GET** /v1/appStoreVersions/{id}/appStoreVersionLocalizations |  |
| [**appStoreVersionsAppStoreVersionPhasedReleaseGetToOneRelated**](AppStoreVersionsApi.md#appStoreVersionsAppStoreVersionPhasedReleaseGetToOneRelated) | **GET** /v1/appStoreVersions/{id}/appStoreVersionPhasedRelease |  |
| [**appStoreVersionsAppStoreVersionSubmissionGetToOneRelated**](AppStoreVersionsApi.md#appStoreVersionsAppStoreVersionSubmissionGetToOneRelated) | **GET** /v1/appStoreVersions/{id}/appStoreVersionSubmission |  |
| [**appStoreVersionsBuildGetToOneRelated**](AppStoreVersionsApi.md#appStoreVersionsBuildGetToOneRelated) | **GET** /v1/appStoreVersions/{id}/build |  |
| [**appStoreVersionsBuildGetToOneRelationship**](AppStoreVersionsApi.md#appStoreVersionsBuildGetToOneRelationship) | **GET** /v1/appStoreVersions/{id}/relationships/build |  |
| [**appStoreVersionsBuildUpdateToOneRelationship**](AppStoreVersionsApi.md#appStoreVersionsBuildUpdateToOneRelationship) | **PATCH** /v1/appStoreVersions/{id}/relationships/build |  |
| [**appStoreVersionsCreateInstance**](AppStoreVersionsApi.md#appStoreVersionsCreateInstance) | **POST** /v1/appStoreVersions |  |
| [**appStoreVersionsCustomerReviewsGetToManyRelated**](AppStoreVersionsApi.md#appStoreVersionsCustomerReviewsGetToManyRelated) | **GET** /v1/appStoreVersions/{id}/customerReviews |  |
| [**appStoreVersionsDeleteInstance**](AppStoreVersionsApi.md#appStoreVersionsDeleteInstance) | **DELETE** /v1/appStoreVersions/{id} |  |
| [**appStoreVersionsGetInstance**](AppStoreVersionsApi.md#appStoreVersionsGetInstance) | **GET** /v1/appStoreVersions/{id} |  |
| [**appStoreVersionsRoutingAppCoverageGetToOneRelated**](AppStoreVersionsApi.md#appStoreVersionsRoutingAppCoverageGetToOneRelated) | **GET** /v1/appStoreVersions/{id}/routingAppCoverage |  |
| [**appStoreVersionsUpdateInstance**](AppStoreVersionsApi.md#appStoreVersionsUpdateInstance) | **PATCH** /v1/appStoreVersions/{id} |  |



## appStoreVersionsAgeRatingDeclarationGetToOneRelated

> AgeRatingDeclarationWithoutIncludesResponse appStoreVersionsAgeRatingDeclarationGetToOneRelated(id, fieldsAgeRatingDeclarations)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppStoreVersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppStoreVersionsApi apiInstance = new AppStoreVersionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAgeRatingDeclarations = Arrays.asList(); // List<String> | the fields to include for returned resources of type ageRatingDeclarations
        try {
            AgeRatingDeclarationWithoutIncludesResponse result = apiInstance.appStoreVersionsAgeRatingDeclarationGetToOneRelated(id, fieldsAgeRatingDeclarations);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppStoreVersionsApi#appStoreVersionsAgeRatingDeclarationGetToOneRelated");
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

### Return type

[**AgeRatingDeclarationWithoutIncludesResponse**](AgeRatingDeclarationWithoutIncludesResponse.md)

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
| **200** | Single AgeRatingDeclaration with get |  -  |


## appStoreVersionsAlternativeDistributionPackageGetToOneRelated

> AlternativeDistributionPackageResponse appStoreVersionsAlternativeDistributionPackageGetToOneRelated(id, fieldsAlternativeDistributionPackages, fieldsAlternativeDistributionPackageVersions, limitVersions, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppStoreVersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppStoreVersionsApi apiInstance = new AppStoreVersionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAlternativeDistributionPackages = Arrays.asList(); // List<String> | the fields to include for returned resources of type alternativeDistributionPackages
        List<String> fieldsAlternativeDistributionPackageVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type alternativeDistributionPackageVersions
        Integer limitVersions = 56; // Integer | maximum number of related versions returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            AlternativeDistributionPackageResponse result = apiInstance.appStoreVersionsAlternativeDistributionPackageGetToOneRelated(id, fieldsAlternativeDistributionPackages, fieldsAlternativeDistributionPackageVersions, limitVersions, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppStoreVersionsApi#appStoreVersionsAlternativeDistributionPackageGetToOneRelated");
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
| **fieldsAlternativeDistributionPackages** | **List&lt;String&gt;**| the fields to include for returned resources of type alternativeDistributionPackages | [optional] [enum: appStoreVersion, versions] |
| **fieldsAlternativeDistributionPackageVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type alternativeDistributionPackageVersions | [optional] [enum: alternativeDistributionPackage, deltas, fileChecksum, state, url, urlExpirationDate, variants, version] |
| **limitVersions** | **Integer**| maximum number of related versions returned (when they are included) | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: versions] |

### Return type

[**AlternativeDistributionPackageResponse**](AlternativeDistributionPackageResponse.md)

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
| **200** | Single AlternativeDistributionPackage |  -  |


## appStoreVersionsAppClipDefaultExperienceGetToOneRelated

> AppClipDefaultExperienceResponse appStoreVersionsAppClipDefaultExperienceGetToOneRelated(id, fieldsAppClips, fieldsAppClipAppStoreReviewDetails, fieldsAppStoreVersions, fieldsAppClipDefaultExperiences, fieldsAppClipDefaultExperienceLocalizations, limitAppClipDefaultExperienceLocalizations, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppStoreVersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppStoreVersionsApi apiInstance = new AppStoreVersionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAppClips = Arrays.asList(); // List<String> | the fields to include for returned resources of type appClips
        List<String> fieldsAppClipAppStoreReviewDetails = Arrays.asList(); // List<String> | the fields to include for returned resources of type appClipAppStoreReviewDetails
        List<String> fieldsAppStoreVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersions
        List<String> fieldsAppClipDefaultExperiences = Arrays.asList(); // List<String> | the fields to include for returned resources of type appClipDefaultExperiences
        List<String> fieldsAppClipDefaultExperienceLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type appClipDefaultExperienceLocalizations
        Integer limitAppClipDefaultExperienceLocalizations = 56; // Integer | maximum number of related appClipDefaultExperienceLocalizations returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            AppClipDefaultExperienceResponse result = apiInstance.appStoreVersionsAppClipDefaultExperienceGetToOneRelated(id, fieldsAppClips, fieldsAppClipAppStoreReviewDetails, fieldsAppStoreVersions, fieldsAppClipDefaultExperiences, fieldsAppClipDefaultExperienceLocalizations, limitAppClipDefaultExperienceLocalizations, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppStoreVersionsApi#appStoreVersionsAppClipDefaultExperienceGetToOneRelated");
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
| **fieldsAppClips** | **List&lt;String&gt;**| the fields to include for returned resources of type appClips | [optional] [enum: app, appClipAdvancedExperiences, appClipDefaultExperiences, bundleId] |
| **fieldsAppClipAppStoreReviewDetails** | **List&lt;String&gt;**| the fields to include for returned resources of type appClipAppStoreReviewDetails | [optional] [enum: appClipDefaultExperience, invocationUrls] |
| **fieldsAppStoreVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersions | [optional] [enum: ageRatingDeclaration, alternativeDistributionPackage, app, appClipDefaultExperience, appStoreReviewDetail, appStoreState, appStoreVersionExperiments, appStoreVersionExperimentsV2, appStoreVersionLocalizations, appStoreVersionPhasedRelease, appStoreVersionSubmission, appVersionState, build, copyright, createdDate, customerReviews, downloadable, earliestReleaseDate, platform, releaseType, reviewType, routingAppCoverage, versionString] |
| **fieldsAppClipDefaultExperiences** | **List&lt;String&gt;**| the fields to include for returned resources of type appClipDefaultExperiences | [optional] [enum: action, appClip, appClipAppStoreReviewDetail, appClipDefaultExperienceLocalizations, appClipDefaultExperienceTemplate, releaseWithAppStoreVersion] |
| **fieldsAppClipDefaultExperienceLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type appClipDefaultExperienceLocalizations | [optional] [enum: appClipDefaultExperience, appClipHeaderImage, locale, subtitle] |
| **limitAppClipDefaultExperienceLocalizations** | **Integer**| maximum number of related appClipDefaultExperienceLocalizations returned (when they are included) | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: appClip, appClipAppStoreReviewDetail, appClipDefaultExperienceLocalizations, releaseWithAppStoreVersion] |

### Return type

[**AppClipDefaultExperienceResponse**](AppClipDefaultExperienceResponse.md)

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
| **200** | Single AppClipDefaultExperience |  -  |


## appStoreVersionsAppClipDefaultExperienceGetToOneRelationship

> AppStoreVersionAppClipDefaultExperienceLinkageResponse appStoreVersionsAppClipDefaultExperienceGetToOneRelationship(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppStoreVersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppStoreVersionsApi apiInstance = new AppStoreVersionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            AppStoreVersionAppClipDefaultExperienceLinkageResponse result = apiInstance.appStoreVersionsAppClipDefaultExperienceGetToOneRelationship(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppStoreVersionsApi#appStoreVersionsAppClipDefaultExperienceGetToOneRelationship");
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

[**AppStoreVersionAppClipDefaultExperienceLinkageResponse**](AppStoreVersionAppClipDefaultExperienceLinkageResponse.md)

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


## appStoreVersionsAppClipDefaultExperienceUpdateToOneRelationship

> appStoreVersionsAppClipDefaultExperienceUpdateToOneRelationship(id, appStoreVersionAppClipDefaultExperienceLinkageRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppStoreVersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppStoreVersionsApi apiInstance = new AppStoreVersionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        AppStoreVersionAppClipDefaultExperienceLinkageRequest appStoreVersionAppClipDefaultExperienceLinkageRequest = new AppStoreVersionAppClipDefaultExperienceLinkageRequest(); // AppStoreVersionAppClipDefaultExperienceLinkageRequest | Related linkage
        try {
            apiInstance.appStoreVersionsAppClipDefaultExperienceUpdateToOneRelationship(id, appStoreVersionAppClipDefaultExperienceLinkageRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppStoreVersionsApi#appStoreVersionsAppClipDefaultExperienceUpdateToOneRelationship");
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
| **appStoreVersionAppClipDefaultExperienceLinkageRequest** | [**AppStoreVersionAppClipDefaultExperienceLinkageRequest**](AppStoreVersionAppClipDefaultExperienceLinkageRequest.md)| Related linkage | |

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


## appStoreVersionsAppStoreReviewDetailGetToOneRelated

> AppStoreReviewDetailResponse appStoreVersionsAppStoreReviewDetailGetToOneRelated(id, fieldsAppStoreReviewDetails, fieldsAppStoreVersions, fieldsAppStoreReviewAttachments, limitAppStoreReviewAttachments, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppStoreVersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppStoreVersionsApi apiInstance = new AppStoreVersionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAppStoreReviewDetails = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreReviewDetails
        List<String> fieldsAppStoreVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersions
        List<String> fieldsAppStoreReviewAttachments = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreReviewAttachments
        Integer limitAppStoreReviewAttachments = 56; // Integer | maximum number of related appStoreReviewAttachments returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            AppStoreReviewDetailResponse result = apiInstance.appStoreVersionsAppStoreReviewDetailGetToOneRelated(id, fieldsAppStoreReviewDetails, fieldsAppStoreVersions, fieldsAppStoreReviewAttachments, limitAppStoreReviewAttachments, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppStoreVersionsApi#appStoreVersionsAppStoreReviewDetailGetToOneRelated");
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
| **fieldsAppStoreReviewDetails** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreReviewDetails | [optional] [enum: appStoreReviewAttachments, appStoreVersion, contactEmail, contactFirstName, contactLastName, contactPhone, demoAccountName, demoAccountPassword, demoAccountRequired, notes] |
| **fieldsAppStoreVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersions | [optional] [enum: ageRatingDeclaration, alternativeDistributionPackage, app, appClipDefaultExperience, appStoreReviewDetail, appStoreState, appStoreVersionExperiments, appStoreVersionExperimentsV2, appStoreVersionLocalizations, appStoreVersionPhasedRelease, appStoreVersionSubmission, appVersionState, build, copyright, createdDate, customerReviews, downloadable, earliestReleaseDate, platform, releaseType, reviewType, routingAppCoverage, versionString] |
| **fieldsAppStoreReviewAttachments** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreReviewAttachments | [optional] [enum: appStoreReviewDetail, assetDeliveryState, fileName, fileSize, sourceFileChecksum, uploadOperations, uploaded] |
| **limitAppStoreReviewAttachments** | **Integer**| maximum number of related appStoreReviewAttachments returned (when they are included) | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: appStoreReviewAttachments, appStoreVersion] |

### Return type

[**AppStoreReviewDetailResponse**](AppStoreReviewDetailResponse.md)

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
| **200** | Single AppStoreReviewDetail |  -  |


## appStoreVersionsAppStoreVersionExperimentsGetToManyRelated

> AppStoreVersionExperimentsResponse appStoreVersionsAppStoreVersionExperimentsGetToManyRelated(id, filterState, fieldsAppStoreVersionExperiments, fieldsAppStoreVersionExperimentTreatments, fieldsAppStoreVersions, limit, limitAppStoreVersionExperimentTreatments, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppStoreVersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppStoreVersionsApi apiInstance = new AppStoreVersionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> filterState = Arrays.asList(); // List<String> | filter by attribute 'state'
        List<String> fieldsAppStoreVersionExperiments = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersionExperiments
        List<String> fieldsAppStoreVersionExperimentTreatments = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersionExperimentTreatments
        List<String> fieldsAppStoreVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersions
        Integer limit = 56; // Integer | maximum resources per page
        Integer limitAppStoreVersionExperimentTreatments = 56; // Integer | maximum number of related appStoreVersionExperimentTreatments returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            AppStoreVersionExperimentsResponse result = apiInstance.appStoreVersionsAppStoreVersionExperimentsGetToManyRelated(id, filterState, fieldsAppStoreVersionExperiments, fieldsAppStoreVersionExperimentTreatments, fieldsAppStoreVersions, limit, limitAppStoreVersionExperimentTreatments, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppStoreVersionsApi#appStoreVersionsAppStoreVersionExperimentsGetToManyRelated");
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
| **filterState** | **List&lt;String&gt;**| filter by attribute &#39;state&#39; | [optional] [enum: PREPARE_FOR_SUBMISSION, READY_FOR_REVIEW, WAITING_FOR_REVIEW, IN_REVIEW, ACCEPTED, APPROVED, REJECTED, COMPLETED, STOPPED] |
| **fieldsAppStoreVersionExperiments** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersionExperiments | [optional] [enum: appStoreVersion, appStoreVersionExperimentTreatments, endDate, name, reviewRequired, startDate, started, state, trafficProportion] |
| **fieldsAppStoreVersionExperimentTreatments** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersionExperimentTreatments | [optional] [enum: appIcon, appIconName, appStoreVersionExperiment, appStoreVersionExperimentTreatmentLocalizations, appStoreVersionExperimentV2, name, promotedDate] |
| **fieldsAppStoreVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersions | [optional] [enum: ageRatingDeclaration, alternativeDistributionPackage, app, appClipDefaultExperience, appStoreReviewDetail, appStoreState, appStoreVersionExperiments, appStoreVersionExperimentsV2, appStoreVersionLocalizations, appStoreVersionPhasedRelease, appStoreVersionSubmission, appVersionState, build, copyright, createdDate, customerReviews, downloadable, earliestReleaseDate, platform, releaseType, reviewType, routingAppCoverage, versionString] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **limitAppStoreVersionExperimentTreatments** | **Integer**| maximum number of related appStoreVersionExperimentTreatments returned (when they are included) | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: appStoreVersion, appStoreVersionExperimentTreatments] |

### Return type

[**AppStoreVersionExperimentsResponse**](AppStoreVersionExperimentsResponse.md)

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
| **200** | List of AppStoreVersionExperiments |  -  |


## appStoreVersionsAppStoreVersionExperimentsV2GetToManyRelated

> AppStoreVersionExperimentsV2Response appStoreVersionsAppStoreVersionExperimentsV2GetToManyRelated(id, filterState, fieldsAppStoreVersionExperiments, fieldsAppStoreVersionExperimentTreatments, fieldsAppStoreVersions, fieldsApps, limit, limitControlVersions, limitAppStoreVersionExperimentTreatments, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppStoreVersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppStoreVersionsApi apiInstance = new AppStoreVersionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> filterState = Arrays.asList(); // List<String> | filter by attribute 'state'
        List<String> fieldsAppStoreVersionExperiments = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersionExperiments
        List<String> fieldsAppStoreVersionExperimentTreatments = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersionExperimentTreatments
        List<String> fieldsAppStoreVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersions
        List<String> fieldsApps = Arrays.asList(); // List<String> | the fields to include for returned resources of type apps
        Integer limit = 56; // Integer | maximum resources per page
        Integer limitControlVersions = 56; // Integer | maximum number of related controlVersions returned (when they are included)
        Integer limitAppStoreVersionExperimentTreatments = 56; // Integer | maximum number of related appStoreVersionExperimentTreatments returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            AppStoreVersionExperimentsV2Response result = apiInstance.appStoreVersionsAppStoreVersionExperimentsV2GetToManyRelated(id, filterState, fieldsAppStoreVersionExperiments, fieldsAppStoreVersionExperimentTreatments, fieldsAppStoreVersions, fieldsApps, limit, limitControlVersions, limitAppStoreVersionExperimentTreatments, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppStoreVersionsApi#appStoreVersionsAppStoreVersionExperimentsV2GetToManyRelated");
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
| **filterState** | **List&lt;String&gt;**| filter by attribute &#39;state&#39; | [optional] [enum: PREPARE_FOR_SUBMISSION, READY_FOR_REVIEW, WAITING_FOR_REVIEW, IN_REVIEW, ACCEPTED, APPROVED, REJECTED, COMPLETED, STOPPED] |
| **fieldsAppStoreVersionExperiments** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersionExperiments | [optional] [enum: app, appStoreVersionExperimentTreatments, controlVersions, endDate, latestControlVersion, name, platform, reviewRequired, startDate, started, state, trafficProportion] |
| **fieldsAppStoreVersionExperimentTreatments** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersionExperimentTreatments | [optional] [enum: appIcon, appIconName, appStoreVersionExperiment, appStoreVersionExperimentTreatmentLocalizations, appStoreVersionExperimentV2, name, promotedDate] |
| **fieldsAppStoreVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersions | [optional] [enum: ageRatingDeclaration, alternativeDistributionPackage, app, appClipDefaultExperience, appStoreReviewDetail, appStoreState, appStoreVersionExperiments, appStoreVersionExperimentsV2, appStoreVersionLocalizations, appStoreVersionPhasedRelease, appStoreVersionSubmission, appVersionState, build, copyright, createdDate, customerReviews, downloadable, earliestReleaseDate, platform, releaseType, reviewType, routingAppCoverage, versionString] |
| **fieldsApps** | **List&lt;String&gt;**| the fields to include for returned resources of type apps | [optional] [enum: alternativeDistributionKey, analyticsReportRequests, appAvailability, appClips, appCustomProductPages, appEncryptionDeclarations, appEvents, appInfos, appPricePoints, appPriceSchedule, appStoreVersionExperimentsV2, appStoreVersions, betaAppLocalizations, betaAppReviewDetail, betaGroups, betaLicenseAgreement, betaTesters, builds, bundleId, ciProduct, contentRightsDeclaration, customerReviews, endUserLicenseAgreement, gameCenterDetail, gameCenterEnabledVersions, inAppPurchases, inAppPurchasesV2, isOrEverWasMadeForKids, marketplaceSearchDetail, name, perfPowerMetrics, preOrder, preReleaseVersions, primaryLocale, promotedPurchases, reviewSubmissions, sku, subscriptionGracePeriod, subscriptionGroups, subscriptionStatusUrl, subscriptionStatusUrlForSandbox, subscriptionStatusUrlVersion, subscriptionStatusUrlVersionForSandbox] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **limitControlVersions** | **Integer**| maximum number of related controlVersions returned (when they are included) | [optional] |
| **limitAppStoreVersionExperimentTreatments** | **Integer**| maximum number of related appStoreVersionExperimentTreatments returned (when they are included) | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: app, appStoreVersionExperimentTreatments, controlVersions, latestControlVersion] |

### Return type

[**AppStoreVersionExperimentsV2Response**](AppStoreVersionExperimentsV2Response.md)

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
| **200** | List of AppStoreVersionExperiments |  -  |


## appStoreVersionsAppStoreVersionLocalizationsGetToManyRelated

> AppStoreVersionLocalizationsResponse appStoreVersionsAppStoreVersionLocalizationsGetToManyRelated(id, filterLocale, fieldsAppScreenshotSets, fieldsAppStoreVersions, fieldsAppPreviewSets, fieldsAppStoreVersionLocalizations, limit, limitAppScreenshotSets, limitAppPreviewSets, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppStoreVersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppStoreVersionsApi apiInstance = new AppStoreVersionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> filterLocale = Arrays.asList(); // List<String> | filter by attribute 'locale'
        List<String> fieldsAppScreenshotSets = Arrays.asList(); // List<String> | the fields to include for returned resources of type appScreenshotSets
        List<String> fieldsAppStoreVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersions
        List<String> fieldsAppPreviewSets = Arrays.asList(); // List<String> | the fields to include for returned resources of type appPreviewSets
        List<String> fieldsAppStoreVersionLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersionLocalizations
        Integer limit = 56; // Integer | maximum resources per page
        Integer limitAppScreenshotSets = 56; // Integer | maximum number of related appScreenshotSets returned (when they are included)
        Integer limitAppPreviewSets = 56; // Integer | maximum number of related appPreviewSets returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            AppStoreVersionLocalizationsResponse result = apiInstance.appStoreVersionsAppStoreVersionLocalizationsGetToManyRelated(id, filterLocale, fieldsAppScreenshotSets, fieldsAppStoreVersions, fieldsAppPreviewSets, fieldsAppStoreVersionLocalizations, limit, limitAppScreenshotSets, limitAppPreviewSets, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppStoreVersionsApi#appStoreVersionsAppStoreVersionLocalizationsGetToManyRelated");
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
| **filterLocale** | **List&lt;String&gt;**| filter by attribute &#39;locale&#39; | [optional] |
| **fieldsAppScreenshotSets** | **List&lt;String&gt;**| the fields to include for returned resources of type appScreenshotSets | [optional] [enum: appCustomProductPageLocalization, appScreenshots, appStoreVersionExperimentTreatmentLocalization, appStoreVersionLocalization, screenshotDisplayType] |
| **fieldsAppStoreVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersions | [optional] [enum: ageRatingDeclaration, alternativeDistributionPackage, app, appClipDefaultExperience, appStoreReviewDetail, appStoreState, appStoreVersionExperiments, appStoreVersionExperimentsV2, appStoreVersionLocalizations, appStoreVersionPhasedRelease, appStoreVersionSubmission, appVersionState, build, copyright, createdDate, customerReviews, downloadable, earliestReleaseDate, platform, releaseType, reviewType, routingAppCoverage, versionString] |
| **fieldsAppPreviewSets** | **List&lt;String&gt;**| the fields to include for returned resources of type appPreviewSets | [optional] [enum: appCustomProductPageLocalization, appPreviews, appStoreVersionExperimentTreatmentLocalization, appStoreVersionLocalization, previewType] |
| **fieldsAppStoreVersionLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersionLocalizations | [optional] [enum: appPreviewSets, appScreenshotSets, appStoreVersion, description, keywords, locale, marketingUrl, promotionalText, supportUrl, whatsNew] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **limitAppScreenshotSets** | **Integer**| maximum number of related appScreenshotSets returned (when they are included) | [optional] |
| **limitAppPreviewSets** | **Integer**| maximum number of related appPreviewSets returned (when they are included) | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: appPreviewSets, appScreenshotSets, appStoreVersion] |

### Return type

[**AppStoreVersionLocalizationsResponse**](AppStoreVersionLocalizationsResponse.md)

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
| **200** | List of AppStoreVersionLocalizations |  -  |


## appStoreVersionsAppStoreVersionPhasedReleaseGetToOneRelated

> AppStoreVersionPhasedReleaseWithoutIncludesResponse appStoreVersionsAppStoreVersionPhasedReleaseGetToOneRelated(id, fieldsAppStoreVersionPhasedReleases)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppStoreVersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppStoreVersionsApi apiInstance = new AppStoreVersionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAppStoreVersionPhasedReleases = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersionPhasedReleases
        try {
            AppStoreVersionPhasedReleaseWithoutIncludesResponse result = apiInstance.appStoreVersionsAppStoreVersionPhasedReleaseGetToOneRelated(id, fieldsAppStoreVersionPhasedReleases);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppStoreVersionsApi#appStoreVersionsAppStoreVersionPhasedReleaseGetToOneRelated");
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
| **fieldsAppStoreVersionPhasedReleases** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersionPhasedReleases | [optional] [enum: appStoreVersion, currentDayNumber, phasedReleaseState, startDate, totalPauseDuration] |

### Return type

[**AppStoreVersionPhasedReleaseWithoutIncludesResponse**](AppStoreVersionPhasedReleaseWithoutIncludesResponse.md)

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
| **200** | Single AppStoreVersionPhasedRelease with get |  -  |


## appStoreVersionsAppStoreVersionSubmissionGetToOneRelated

> AppStoreVersionSubmissionResponse appStoreVersionsAppStoreVersionSubmissionGetToOneRelated(id, fieldsAppStoreVersionSubmissions, fieldsAppStoreVersions, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppStoreVersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppStoreVersionsApi apiInstance = new AppStoreVersionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAppStoreVersionSubmissions = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersionSubmissions
        List<String> fieldsAppStoreVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersions
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            AppStoreVersionSubmissionResponse result = apiInstance.appStoreVersionsAppStoreVersionSubmissionGetToOneRelated(id, fieldsAppStoreVersionSubmissions, fieldsAppStoreVersions, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppStoreVersionsApi#appStoreVersionsAppStoreVersionSubmissionGetToOneRelated");
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
| **fieldsAppStoreVersionSubmissions** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersionSubmissions | [optional] [enum: appStoreVersion] |
| **fieldsAppStoreVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersions | [optional] [enum: ageRatingDeclaration, alternativeDistributionPackage, app, appClipDefaultExperience, appStoreReviewDetail, appStoreState, appStoreVersionExperiments, appStoreVersionExperimentsV2, appStoreVersionLocalizations, appStoreVersionPhasedRelease, appStoreVersionSubmission, appVersionState, build, copyright, createdDate, customerReviews, downloadable, earliestReleaseDate, platform, releaseType, reviewType, routingAppCoverage, versionString] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: appStoreVersion] |

### Return type

[**AppStoreVersionSubmissionResponse**](AppStoreVersionSubmissionResponse.md)

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
| **200** | Single AppStoreVersionSubmission |  -  |


## appStoreVersionsBuildGetToOneRelated

> BuildWithoutIncludesResponse appStoreVersionsBuildGetToOneRelated(id, fieldsBuilds)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppStoreVersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppStoreVersionsApi apiInstance = new AppStoreVersionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsBuilds = Arrays.asList(); // List<String> | the fields to include for returned resources of type builds
        try {
            BuildWithoutIncludesResponse result = apiInstance.appStoreVersionsBuildGetToOneRelated(id, fieldsBuilds);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppStoreVersionsApi#appStoreVersionsBuildGetToOneRelated");
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

### Return type

[**BuildWithoutIncludesResponse**](BuildWithoutIncludesResponse.md)

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
| **200** | Single Build with get |  -  |


## appStoreVersionsBuildGetToOneRelationship

> AppStoreVersionBuildLinkageResponse appStoreVersionsBuildGetToOneRelationship(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppStoreVersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppStoreVersionsApi apiInstance = new AppStoreVersionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            AppStoreVersionBuildLinkageResponse result = apiInstance.appStoreVersionsBuildGetToOneRelationship(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppStoreVersionsApi#appStoreVersionsBuildGetToOneRelationship");
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

[**AppStoreVersionBuildLinkageResponse**](AppStoreVersionBuildLinkageResponse.md)

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


## appStoreVersionsBuildUpdateToOneRelationship

> appStoreVersionsBuildUpdateToOneRelationship(id, appStoreVersionBuildLinkageRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppStoreVersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppStoreVersionsApi apiInstance = new AppStoreVersionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        AppStoreVersionBuildLinkageRequest appStoreVersionBuildLinkageRequest = new AppStoreVersionBuildLinkageRequest(); // AppStoreVersionBuildLinkageRequest | Related linkage
        try {
            apiInstance.appStoreVersionsBuildUpdateToOneRelationship(id, appStoreVersionBuildLinkageRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppStoreVersionsApi#appStoreVersionsBuildUpdateToOneRelationship");
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
| **appStoreVersionBuildLinkageRequest** | [**AppStoreVersionBuildLinkageRequest**](AppStoreVersionBuildLinkageRequest.md)| Related linkage | |

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


## appStoreVersionsCreateInstance

> AppStoreVersionResponse appStoreVersionsCreateInstance(appStoreVersionCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppStoreVersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppStoreVersionsApi apiInstance = new AppStoreVersionsApi(defaultClient);
        AppStoreVersionCreateRequest appStoreVersionCreateRequest = new AppStoreVersionCreateRequest(); // AppStoreVersionCreateRequest | AppStoreVersion representation
        try {
            AppStoreVersionResponse result = apiInstance.appStoreVersionsCreateInstance(appStoreVersionCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppStoreVersionsApi#appStoreVersionsCreateInstance");
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
| **appStoreVersionCreateRequest** | [**AppStoreVersionCreateRequest**](AppStoreVersionCreateRequest.md)| AppStoreVersion representation | |

### Return type

[**AppStoreVersionResponse**](AppStoreVersionResponse.md)

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
| **201** | Single AppStoreVersion |  -  |
| **409** | Request entity error(s) |  -  |


## appStoreVersionsCustomerReviewsGetToManyRelated

> CustomerReviewsResponse appStoreVersionsCustomerReviewsGetToManyRelated(id, filterRating, filterTerritory, existsPublishedResponse, sort, fieldsCustomerReviews, fieldsCustomerReviewResponses, limit, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppStoreVersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppStoreVersionsApi apiInstance = new AppStoreVersionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> filterRating = Arrays.asList(); // List<String> | filter by attribute 'rating'
        List<String> filterTerritory = Arrays.asList(); // List<String> | filter by attribute 'territory'
        Boolean existsPublishedResponse = true; // Boolean | filter by publishedResponse
        List<String> sort = Arrays.asList(); // List<String> | comma-separated list of sort expressions; resources will be sorted as specified
        List<String> fieldsCustomerReviews = Arrays.asList(); // List<String> | the fields to include for returned resources of type customerReviews
        List<String> fieldsCustomerReviewResponses = Arrays.asList(); // List<String> | the fields to include for returned resources of type customerReviewResponses
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            CustomerReviewsResponse result = apiInstance.appStoreVersionsCustomerReviewsGetToManyRelated(id, filterRating, filterTerritory, existsPublishedResponse, sort, fieldsCustomerReviews, fieldsCustomerReviewResponses, limit, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppStoreVersionsApi#appStoreVersionsCustomerReviewsGetToManyRelated");
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
| **filterRating** | **List&lt;String&gt;**| filter by attribute &#39;rating&#39; | [optional] |
| **filterTerritory** | **List&lt;String&gt;**| filter by attribute &#39;territory&#39; | [optional] [enum: ABW, AFG, AGO, AIA, ALB, AND, ANT, ARE, ARG, ARM, ASM, ATG, AUS, AUT, AZE, BDI, BEL, BEN, BES, BFA, BGD, BGR, BHR, BHS, BIH, BLR, BLZ, BMU, BOL, BRA, BRB, BRN, BTN, BWA, CAF, CAN, CHE, CHL, CHN, CIV, CMR, COD, COG, COK, COL, COM, CPV, CRI, CUB, CUW, CXR, CYM, CYP, CZE, DEU, DJI, DMA, DNK, DOM, DZA, ECU, EGY, ERI, ESP, EST, ETH, FIN, FJI, FLK, FRA, FRO, FSM, GAB, GBR, GEO, GGY, GHA, GIB, GIN, GLP, GMB, GNB, GNQ, GRC, GRD, GRL, GTM, GUF, GUM, GUY, HKG, HND, HRV, HTI, HUN, IDN, IMN, IND, IRL, IRQ, ISL, ISR, ITA, JAM, JEY, JOR, JPN, KAZ, KEN, KGZ, KHM, KIR, KNA, KOR, KWT, LAO, LBN, LBR, LBY, LCA, LIE, LKA, LSO, LTU, LUX, LVA, MAC, MAR, MCO, MDA, MDG, MDV, MEX, MHL, MKD, MLI, MLT, MMR, MNE, MNG, MNP, MOZ, MRT, MSR, MTQ, MUS, MWI, MYS, MYT, NAM, NCL, NER, NFK, NGA, NIC, NIU, NLD, NOR, NPL, NRU, NZL, OMN, PAK, PAN, PER, PHL, PLW, PNG, POL, PRI, PRT, PRY, PSE, PYF, QAT, REU, ROU, RUS, RWA, SAU, SEN, SGP, SHN, SLB, SLE, SLV, SMR, SOM, SPM, SRB, SSD, STP, SUR, SVK, SVN, SWE, SWZ, SXM, SYC, TCA, TCD, TGO, THA, TJK, TKM, TLS, TON, TTO, TUN, TUR, TUV, TWN, TZA, UGA, UKR, UMI, URY, USA, UZB, VAT, VCT, VEN, VGB, VIR, VNM, VUT, WLF, WSM, YEM, ZAF, ZMB, ZWE] |
| **existsPublishedResponse** | **Boolean**| filter by publishedResponse | [optional] |
| **sort** | **List&lt;String&gt;**| comma-separated list of sort expressions; resources will be sorted as specified | [optional] [enum: createdDate, -createdDate, rating, -rating] |
| **fieldsCustomerReviews** | **List&lt;String&gt;**| the fields to include for returned resources of type customerReviews | [optional] [enum: body, createdDate, rating, response, reviewerNickname, territory, title] |
| **fieldsCustomerReviewResponses** | **List&lt;String&gt;**| the fields to include for returned resources of type customerReviewResponses | [optional] [enum: lastModifiedDate, responseBody, review, state] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: response] |

### Return type

[**CustomerReviewsResponse**](CustomerReviewsResponse.md)

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
| **200** | List of CustomerReviews |  -  |


## appStoreVersionsDeleteInstance

> appStoreVersionsDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppStoreVersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppStoreVersionsApi apiInstance = new AppStoreVersionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.appStoreVersionsDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppStoreVersionsApi#appStoreVersionsDeleteInstance");
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


## appStoreVersionsGetInstance

> AppStoreVersionResponse appStoreVersionsGetInstance(id, fieldsAppStoreVersions, include, fieldsAppStoreVersionExperiments, fieldsAppStoreVersionSubmissions, fieldsAgeRatingDeclarations, fieldsAlternativeDistributionPackages, fieldsCustomerReviews, fieldsAppStoreReviewDetails, fieldsAppClipDefaultExperiences, fieldsRoutingAppCoverages, fieldsAppStoreVersionPhasedReleases, fieldsBuilds, fieldsAppStoreVersionLocalizations, limitAppStoreVersionExperiments, limitAppStoreVersionExperimentsV2, limitAppStoreVersionLocalizations)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppStoreVersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppStoreVersionsApi apiInstance = new AppStoreVersionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAppStoreVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersions
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsAppStoreVersionExperiments = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersionExperiments
        List<String> fieldsAppStoreVersionSubmissions = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersionSubmissions
        List<String> fieldsAgeRatingDeclarations = Arrays.asList(); // List<String> | the fields to include for returned resources of type ageRatingDeclarations
        List<String> fieldsAlternativeDistributionPackages = Arrays.asList(); // List<String> | the fields to include for returned resources of type alternativeDistributionPackages
        List<String> fieldsCustomerReviews = Arrays.asList(); // List<String> | the fields to include for returned resources of type customerReviews
        List<String> fieldsAppStoreReviewDetails = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreReviewDetails
        List<String> fieldsAppClipDefaultExperiences = Arrays.asList(); // List<String> | the fields to include for returned resources of type appClipDefaultExperiences
        List<String> fieldsRoutingAppCoverages = Arrays.asList(); // List<String> | the fields to include for returned resources of type routingAppCoverages
        List<String> fieldsAppStoreVersionPhasedReleases = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersionPhasedReleases
        List<String> fieldsBuilds = Arrays.asList(); // List<String> | the fields to include for returned resources of type builds
        List<String> fieldsAppStoreVersionLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersionLocalizations
        Integer limitAppStoreVersionExperiments = 56; // Integer | maximum number of related appStoreVersionExperiments returned (when they are included)
        Integer limitAppStoreVersionExperimentsV2 = 56; // Integer | maximum number of related appStoreVersionExperimentsV2 returned (when they are included)
        Integer limitAppStoreVersionLocalizations = 56; // Integer | maximum number of related appStoreVersionLocalizations returned (when they are included)
        try {
            AppStoreVersionResponse result = apiInstance.appStoreVersionsGetInstance(id, fieldsAppStoreVersions, include, fieldsAppStoreVersionExperiments, fieldsAppStoreVersionSubmissions, fieldsAgeRatingDeclarations, fieldsAlternativeDistributionPackages, fieldsCustomerReviews, fieldsAppStoreReviewDetails, fieldsAppClipDefaultExperiences, fieldsRoutingAppCoverages, fieldsAppStoreVersionPhasedReleases, fieldsBuilds, fieldsAppStoreVersionLocalizations, limitAppStoreVersionExperiments, limitAppStoreVersionExperimentsV2, limitAppStoreVersionLocalizations);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppStoreVersionsApi#appStoreVersionsGetInstance");
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
| **fieldsAppStoreVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersions | [optional] [enum: ageRatingDeclaration, alternativeDistributionPackage, app, appClipDefaultExperience, appStoreReviewDetail, appStoreState, appStoreVersionExperiments, appStoreVersionExperimentsV2, appStoreVersionLocalizations, appStoreVersionPhasedRelease, appStoreVersionSubmission, appVersionState, build, copyright, createdDate, customerReviews, downloadable, earliestReleaseDate, platform, releaseType, reviewType, routingAppCoverage, versionString] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: ageRatingDeclaration, alternativeDistributionPackage, app, appClipDefaultExperience, appStoreReviewDetail, appStoreVersionExperiments, appStoreVersionExperimentsV2, appStoreVersionLocalizations, appStoreVersionPhasedRelease, appStoreVersionSubmission, build, routingAppCoverage] |
| **fieldsAppStoreVersionExperiments** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersionExperiments | [optional] [enum: app, appStoreVersion, appStoreVersionExperimentTreatments, controlVersions, endDate, latestControlVersion, name, platform, reviewRequired, startDate, started, state, trafficProportion] |
| **fieldsAppStoreVersionSubmissions** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersionSubmissions | [optional] [enum: appStoreVersion] |
| **fieldsAgeRatingDeclarations** | **List&lt;String&gt;**| the fields to include for returned resources of type ageRatingDeclarations | [optional] [enum: ageRatingOverride, alcoholTobaccoOrDrugUseOrReferences, contests, gambling, gamblingAndContests, gamblingSimulated, horrorOrFearThemes, kidsAgeBand, matureOrSuggestiveThemes, medicalOrTreatmentInformation, profanityOrCrudeHumor, seventeenPlus, sexualContentGraphicAndNudity, sexualContentOrNudity, unrestrictedWebAccess, violenceCartoonOrFantasy, violenceRealistic, violenceRealisticProlongedGraphicOrSadistic] |
| **fieldsAlternativeDistributionPackages** | **List&lt;String&gt;**| the fields to include for returned resources of type alternativeDistributionPackages | [optional] [enum: appStoreVersion, versions] |
| **fieldsCustomerReviews** | **List&lt;String&gt;**| the fields to include for returned resources of type customerReviews | [optional] [enum: body, createdDate, rating, response, reviewerNickname, territory, title] |
| **fieldsAppStoreReviewDetails** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreReviewDetails | [optional] [enum: appStoreReviewAttachments, appStoreVersion, contactEmail, contactFirstName, contactLastName, contactPhone, demoAccountName, demoAccountPassword, demoAccountRequired, notes] |
| **fieldsAppClipDefaultExperiences** | **List&lt;String&gt;**| the fields to include for returned resources of type appClipDefaultExperiences | [optional] [enum: action, appClip, appClipAppStoreReviewDetail, appClipDefaultExperienceLocalizations, appClipDefaultExperienceTemplate, releaseWithAppStoreVersion] |
| **fieldsRoutingAppCoverages** | **List&lt;String&gt;**| the fields to include for returned resources of type routingAppCoverages | [optional] [enum: appStoreVersion, assetDeliveryState, fileName, fileSize, sourceFileChecksum, uploadOperations, uploaded] |
| **fieldsAppStoreVersionPhasedReleases** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersionPhasedReleases | [optional] [enum: appStoreVersion, currentDayNumber, phasedReleaseState, startDate, totalPauseDuration] |
| **fieldsBuilds** | **List&lt;String&gt;**| the fields to include for returned resources of type builds | [optional] [enum: app, appEncryptionDeclaration, appStoreVersion, betaAppReviewSubmission, betaBuildLocalizations, betaGroups, buildAudienceType, buildBetaDetail, buildBundles, computedMinMacOsVersion, diagnosticSignatures, expirationDate, expired, iconAssetToken, icons, individualTesters, lsMinimumSystemVersion, minOsVersion, perfPowerMetrics, preReleaseVersion, processingState, uploadedDate, usesNonExemptEncryption, version] |
| **fieldsAppStoreVersionLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersionLocalizations | [optional] [enum: appPreviewSets, appScreenshotSets, appStoreVersion, description, keywords, locale, marketingUrl, promotionalText, supportUrl, whatsNew] |
| **limitAppStoreVersionExperiments** | **Integer**| maximum number of related appStoreVersionExperiments returned (when they are included) | [optional] |
| **limitAppStoreVersionExperimentsV2** | **Integer**| maximum number of related appStoreVersionExperimentsV2 returned (when they are included) | [optional] |
| **limitAppStoreVersionLocalizations** | **Integer**| maximum number of related appStoreVersionLocalizations returned (when they are included) | [optional] |

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


## appStoreVersionsRoutingAppCoverageGetToOneRelated

> RoutingAppCoverageWithoutIncludesResponse appStoreVersionsRoutingAppCoverageGetToOneRelated(id, fieldsRoutingAppCoverages)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppStoreVersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppStoreVersionsApi apiInstance = new AppStoreVersionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsRoutingAppCoverages = Arrays.asList(); // List<String> | the fields to include for returned resources of type routingAppCoverages
        try {
            RoutingAppCoverageWithoutIncludesResponse result = apiInstance.appStoreVersionsRoutingAppCoverageGetToOneRelated(id, fieldsRoutingAppCoverages);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppStoreVersionsApi#appStoreVersionsRoutingAppCoverageGetToOneRelated");
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
| **fieldsRoutingAppCoverages** | **List&lt;String&gt;**| the fields to include for returned resources of type routingAppCoverages | [optional] [enum: appStoreVersion, assetDeliveryState, fileName, fileSize, sourceFileChecksum, uploadOperations, uploaded] |

### Return type

[**RoutingAppCoverageWithoutIncludesResponse**](RoutingAppCoverageWithoutIncludesResponse.md)

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
| **200** | Single RoutingAppCoverage with get |  -  |


## appStoreVersionsUpdateInstance

> AppStoreVersionResponse appStoreVersionsUpdateInstance(id, appStoreVersionUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppStoreVersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppStoreVersionsApi apiInstance = new AppStoreVersionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        AppStoreVersionUpdateRequest appStoreVersionUpdateRequest = new AppStoreVersionUpdateRequest(); // AppStoreVersionUpdateRequest | AppStoreVersion representation
        try {
            AppStoreVersionResponse result = apiInstance.appStoreVersionsUpdateInstance(id, appStoreVersionUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppStoreVersionsApi#appStoreVersionsUpdateInstance");
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
| **appStoreVersionUpdateRequest** | [**AppStoreVersionUpdateRequest**](AppStoreVersionUpdateRequest.md)| AppStoreVersion representation | |

### Return type

[**AppStoreVersionResponse**](AppStoreVersionResponse.md)

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
| **200** | Single AppStoreVersion |  -  |
| **409** | Request entity error(s) |  -  |

