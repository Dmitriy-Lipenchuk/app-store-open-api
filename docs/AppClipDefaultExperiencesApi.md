# AppClipDefaultExperiencesApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**appClipDefaultExperiencesAppClipAppStoreReviewDetailGetToOneRelated**](AppClipDefaultExperiencesApi.md#appClipDefaultExperiencesAppClipAppStoreReviewDetailGetToOneRelated) | **GET** /v1/appClipDefaultExperiences/{id}/appClipAppStoreReviewDetail |  |
| [**appClipDefaultExperiencesAppClipDefaultExperienceLocalizationsGetToManyRelated**](AppClipDefaultExperiencesApi.md#appClipDefaultExperiencesAppClipDefaultExperienceLocalizationsGetToManyRelated) | **GET** /v1/appClipDefaultExperiences/{id}/appClipDefaultExperienceLocalizations |  |
| [**appClipDefaultExperiencesCreateInstance**](AppClipDefaultExperiencesApi.md#appClipDefaultExperiencesCreateInstance) | **POST** /v1/appClipDefaultExperiences |  |
| [**appClipDefaultExperiencesDeleteInstance**](AppClipDefaultExperiencesApi.md#appClipDefaultExperiencesDeleteInstance) | **DELETE** /v1/appClipDefaultExperiences/{id} |  |
| [**appClipDefaultExperiencesGetInstance**](AppClipDefaultExperiencesApi.md#appClipDefaultExperiencesGetInstance) | **GET** /v1/appClipDefaultExperiences/{id} |  |
| [**appClipDefaultExperiencesReleaseWithAppStoreVersionGetToOneRelated**](AppClipDefaultExperiencesApi.md#appClipDefaultExperiencesReleaseWithAppStoreVersionGetToOneRelated) | **GET** /v1/appClipDefaultExperiences/{id}/releaseWithAppStoreVersion |  |
| [**appClipDefaultExperiencesReleaseWithAppStoreVersionGetToOneRelationship**](AppClipDefaultExperiencesApi.md#appClipDefaultExperiencesReleaseWithAppStoreVersionGetToOneRelationship) | **GET** /v1/appClipDefaultExperiences/{id}/relationships/releaseWithAppStoreVersion |  |
| [**appClipDefaultExperiencesReleaseWithAppStoreVersionUpdateToOneRelationship**](AppClipDefaultExperiencesApi.md#appClipDefaultExperiencesReleaseWithAppStoreVersionUpdateToOneRelationship) | **PATCH** /v1/appClipDefaultExperiences/{id}/relationships/releaseWithAppStoreVersion |  |
| [**appClipDefaultExperiencesUpdateInstance**](AppClipDefaultExperiencesApi.md#appClipDefaultExperiencesUpdateInstance) | **PATCH** /v1/appClipDefaultExperiences/{id} |  |



## appClipDefaultExperiencesAppClipAppStoreReviewDetailGetToOneRelated

> AppClipAppStoreReviewDetailResponse appClipDefaultExperiencesAppClipAppStoreReviewDetailGetToOneRelated(id, fieldsAppClipAppStoreReviewDetails, fieldsAppClipDefaultExperiences, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppClipDefaultExperiencesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppClipDefaultExperiencesApi apiInstance = new AppClipDefaultExperiencesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAppClipAppStoreReviewDetails = Arrays.asList(); // List<String> | the fields to include for returned resources of type appClipAppStoreReviewDetails
        List<String> fieldsAppClipDefaultExperiences = Arrays.asList(); // List<String> | the fields to include for returned resources of type appClipDefaultExperiences
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            AppClipAppStoreReviewDetailResponse result = apiInstance.appClipDefaultExperiencesAppClipAppStoreReviewDetailGetToOneRelated(id, fieldsAppClipAppStoreReviewDetails, fieldsAppClipDefaultExperiences, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppClipDefaultExperiencesApi#appClipDefaultExperiencesAppClipAppStoreReviewDetailGetToOneRelated");
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
| **fieldsAppClipAppStoreReviewDetails** | **List&lt;String&gt;**| the fields to include for returned resources of type appClipAppStoreReviewDetails | [optional] [enum: appClipDefaultExperience, invocationUrls] |
| **fieldsAppClipDefaultExperiences** | **List&lt;String&gt;**| the fields to include for returned resources of type appClipDefaultExperiences | [optional] [enum: action, appClip, appClipAppStoreReviewDetail, appClipDefaultExperienceLocalizations, appClipDefaultExperienceTemplate, releaseWithAppStoreVersion] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: appClipDefaultExperience] |

### Return type

[**AppClipAppStoreReviewDetailResponse**](AppClipAppStoreReviewDetailResponse.md)

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
| **200** | Single AppClipAppStoreReviewDetail |  -  |


## appClipDefaultExperiencesAppClipDefaultExperienceLocalizationsGetToManyRelated

> AppClipDefaultExperienceLocalizationsResponse appClipDefaultExperiencesAppClipDefaultExperienceLocalizationsGetToManyRelated(id, filterLocale, fieldsAppClipDefaultExperiences, fieldsAppClipDefaultExperienceLocalizations, fieldsAppClipHeaderImages, limit, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppClipDefaultExperiencesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppClipDefaultExperiencesApi apiInstance = new AppClipDefaultExperiencesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> filterLocale = Arrays.asList(); // List<String> | filter by attribute 'locale'
        List<String> fieldsAppClipDefaultExperiences = Arrays.asList(); // List<String> | the fields to include for returned resources of type appClipDefaultExperiences
        List<String> fieldsAppClipDefaultExperienceLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type appClipDefaultExperienceLocalizations
        List<String> fieldsAppClipHeaderImages = Arrays.asList(); // List<String> | the fields to include for returned resources of type appClipHeaderImages
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            AppClipDefaultExperienceLocalizationsResponse result = apiInstance.appClipDefaultExperiencesAppClipDefaultExperienceLocalizationsGetToManyRelated(id, filterLocale, fieldsAppClipDefaultExperiences, fieldsAppClipDefaultExperienceLocalizations, fieldsAppClipHeaderImages, limit, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppClipDefaultExperiencesApi#appClipDefaultExperiencesAppClipDefaultExperienceLocalizationsGetToManyRelated");
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
| **fieldsAppClipDefaultExperiences** | **List&lt;String&gt;**| the fields to include for returned resources of type appClipDefaultExperiences | [optional] [enum: action, appClip, appClipAppStoreReviewDetail, appClipDefaultExperienceLocalizations, appClipDefaultExperienceTemplate, releaseWithAppStoreVersion] |
| **fieldsAppClipDefaultExperienceLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type appClipDefaultExperienceLocalizations | [optional] [enum: appClipDefaultExperience, appClipHeaderImage, locale, subtitle] |
| **fieldsAppClipHeaderImages** | **List&lt;String&gt;**| the fields to include for returned resources of type appClipHeaderImages | [optional] [enum: appClipDefaultExperienceLocalization, assetDeliveryState, fileName, fileSize, imageAsset, sourceFileChecksum, uploadOperations, uploaded] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: appClipDefaultExperience, appClipHeaderImage] |

### Return type

[**AppClipDefaultExperienceLocalizationsResponse**](AppClipDefaultExperienceLocalizationsResponse.md)

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
| **200** | List of AppClipDefaultExperienceLocalizations |  -  |


## appClipDefaultExperiencesCreateInstance

> AppClipDefaultExperienceResponse appClipDefaultExperiencesCreateInstance(appClipDefaultExperienceCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppClipDefaultExperiencesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppClipDefaultExperiencesApi apiInstance = new AppClipDefaultExperiencesApi(defaultClient);
        AppClipDefaultExperienceCreateRequest appClipDefaultExperienceCreateRequest = new AppClipDefaultExperienceCreateRequest(); // AppClipDefaultExperienceCreateRequest | AppClipDefaultExperience representation
        try {
            AppClipDefaultExperienceResponse result = apiInstance.appClipDefaultExperiencesCreateInstance(appClipDefaultExperienceCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppClipDefaultExperiencesApi#appClipDefaultExperiencesCreateInstance");
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
| **appClipDefaultExperienceCreateRequest** | [**AppClipDefaultExperienceCreateRequest**](AppClipDefaultExperienceCreateRequest.md)| AppClipDefaultExperience representation | |

### Return type

[**AppClipDefaultExperienceResponse**](AppClipDefaultExperienceResponse.md)

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
| **201** | Single AppClipDefaultExperience |  -  |
| **409** | Request entity error(s) |  -  |


## appClipDefaultExperiencesDeleteInstance

> appClipDefaultExperiencesDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppClipDefaultExperiencesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppClipDefaultExperiencesApi apiInstance = new AppClipDefaultExperiencesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.appClipDefaultExperiencesDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppClipDefaultExperiencesApi#appClipDefaultExperiencesDeleteInstance");
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


## appClipDefaultExperiencesGetInstance

> AppClipDefaultExperienceResponse appClipDefaultExperiencesGetInstance(id, fieldsAppClipDefaultExperiences, include, fieldsAppClipAppStoreReviewDetails, fieldsAppStoreVersions, fieldsAppClipDefaultExperienceLocalizations, limitAppClipDefaultExperienceLocalizations)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppClipDefaultExperiencesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppClipDefaultExperiencesApi apiInstance = new AppClipDefaultExperiencesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAppClipDefaultExperiences = Arrays.asList(); // List<String> | the fields to include for returned resources of type appClipDefaultExperiences
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsAppClipAppStoreReviewDetails = Arrays.asList(); // List<String> | the fields to include for returned resources of type appClipAppStoreReviewDetails
        List<String> fieldsAppStoreVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersions
        List<String> fieldsAppClipDefaultExperienceLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type appClipDefaultExperienceLocalizations
        Integer limitAppClipDefaultExperienceLocalizations = 56; // Integer | maximum number of related appClipDefaultExperienceLocalizations returned (when they are included)
        try {
            AppClipDefaultExperienceResponse result = apiInstance.appClipDefaultExperiencesGetInstance(id, fieldsAppClipDefaultExperiences, include, fieldsAppClipAppStoreReviewDetails, fieldsAppStoreVersions, fieldsAppClipDefaultExperienceLocalizations, limitAppClipDefaultExperienceLocalizations);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppClipDefaultExperiencesApi#appClipDefaultExperiencesGetInstance");
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
| **fieldsAppClipDefaultExperiences** | **List&lt;String&gt;**| the fields to include for returned resources of type appClipDefaultExperiences | [optional] [enum: action, appClip, appClipAppStoreReviewDetail, appClipDefaultExperienceLocalizations, appClipDefaultExperienceTemplate, releaseWithAppStoreVersion] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: appClip, appClipAppStoreReviewDetail, appClipDefaultExperienceLocalizations, releaseWithAppStoreVersion] |
| **fieldsAppClipAppStoreReviewDetails** | **List&lt;String&gt;**| the fields to include for returned resources of type appClipAppStoreReviewDetails | [optional] [enum: appClipDefaultExperience, invocationUrls] |
| **fieldsAppStoreVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersions | [optional] [enum: ageRatingDeclaration, alternativeDistributionPackage, app, appClipDefaultExperience, appStoreReviewDetail, appStoreState, appStoreVersionExperiments, appStoreVersionExperimentsV2, appStoreVersionLocalizations, appStoreVersionPhasedRelease, appStoreVersionSubmission, appVersionState, build, copyright, createdDate, customerReviews, downloadable, earliestReleaseDate, platform, releaseType, reviewType, routingAppCoverage, versionString] |
| **fieldsAppClipDefaultExperienceLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type appClipDefaultExperienceLocalizations | [optional] [enum: appClipDefaultExperience, appClipHeaderImage, locale, subtitle] |
| **limitAppClipDefaultExperienceLocalizations** | **Integer**| maximum number of related appClipDefaultExperienceLocalizations returned (when they are included) | [optional] |

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


## appClipDefaultExperiencesReleaseWithAppStoreVersionGetToOneRelated

> AppStoreVersionResponse appClipDefaultExperiencesReleaseWithAppStoreVersionGetToOneRelated(id, fieldsAgeRatingDeclarations, fieldsAppStoreReviewDetails, fieldsAppStoreVersionLocalizations, fieldsAppStoreVersionExperiments, fieldsAppStoreVersionSubmissions, fieldsAlternativeDistributionPackages, fieldsAppStoreVersions, fieldsApps, fieldsRoutingAppCoverages, fieldsAppClipDefaultExperiences, fieldsAppStoreVersionPhasedReleases, fieldsBuilds, limitAppStoreVersionLocalizations, limitAppStoreVersionExperiments, limitAppStoreVersionExperimentsV2, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppClipDefaultExperiencesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppClipDefaultExperiencesApi apiInstance = new AppClipDefaultExperiencesApi(defaultClient);
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
            AppStoreVersionResponse result = apiInstance.appClipDefaultExperiencesReleaseWithAppStoreVersionGetToOneRelated(id, fieldsAgeRatingDeclarations, fieldsAppStoreReviewDetails, fieldsAppStoreVersionLocalizations, fieldsAppStoreVersionExperiments, fieldsAppStoreVersionSubmissions, fieldsAlternativeDistributionPackages, fieldsAppStoreVersions, fieldsApps, fieldsRoutingAppCoverages, fieldsAppClipDefaultExperiences, fieldsAppStoreVersionPhasedReleases, fieldsBuilds, limitAppStoreVersionLocalizations, limitAppStoreVersionExperiments, limitAppStoreVersionExperimentsV2, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppClipDefaultExperiencesApi#appClipDefaultExperiencesReleaseWithAppStoreVersionGetToOneRelated");
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


## appClipDefaultExperiencesReleaseWithAppStoreVersionGetToOneRelationship

> AppClipDefaultExperienceReleaseWithAppStoreVersionLinkageResponse appClipDefaultExperiencesReleaseWithAppStoreVersionGetToOneRelationship(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppClipDefaultExperiencesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppClipDefaultExperiencesApi apiInstance = new AppClipDefaultExperiencesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            AppClipDefaultExperienceReleaseWithAppStoreVersionLinkageResponse result = apiInstance.appClipDefaultExperiencesReleaseWithAppStoreVersionGetToOneRelationship(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppClipDefaultExperiencesApi#appClipDefaultExperiencesReleaseWithAppStoreVersionGetToOneRelationship");
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

[**AppClipDefaultExperienceReleaseWithAppStoreVersionLinkageResponse**](AppClipDefaultExperienceReleaseWithAppStoreVersionLinkageResponse.md)

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


## appClipDefaultExperiencesReleaseWithAppStoreVersionUpdateToOneRelationship

> appClipDefaultExperiencesReleaseWithAppStoreVersionUpdateToOneRelationship(id, appClipDefaultExperienceReleaseWithAppStoreVersionLinkageRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppClipDefaultExperiencesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppClipDefaultExperiencesApi apiInstance = new AppClipDefaultExperiencesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        AppClipDefaultExperienceReleaseWithAppStoreVersionLinkageRequest appClipDefaultExperienceReleaseWithAppStoreVersionLinkageRequest = new AppClipDefaultExperienceReleaseWithAppStoreVersionLinkageRequest(); // AppClipDefaultExperienceReleaseWithAppStoreVersionLinkageRequest | Related linkage
        try {
            apiInstance.appClipDefaultExperiencesReleaseWithAppStoreVersionUpdateToOneRelationship(id, appClipDefaultExperienceReleaseWithAppStoreVersionLinkageRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppClipDefaultExperiencesApi#appClipDefaultExperiencesReleaseWithAppStoreVersionUpdateToOneRelationship");
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
| **appClipDefaultExperienceReleaseWithAppStoreVersionLinkageRequest** | [**AppClipDefaultExperienceReleaseWithAppStoreVersionLinkageRequest**](AppClipDefaultExperienceReleaseWithAppStoreVersionLinkageRequest.md)| Related linkage | |

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


## appClipDefaultExperiencesUpdateInstance

> AppClipDefaultExperienceResponse appClipDefaultExperiencesUpdateInstance(id, appClipDefaultExperienceUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppClipDefaultExperiencesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppClipDefaultExperiencesApi apiInstance = new AppClipDefaultExperiencesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        AppClipDefaultExperienceUpdateRequest appClipDefaultExperienceUpdateRequest = new AppClipDefaultExperienceUpdateRequest(); // AppClipDefaultExperienceUpdateRequest | AppClipDefaultExperience representation
        try {
            AppClipDefaultExperienceResponse result = apiInstance.appClipDefaultExperiencesUpdateInstance(id, appClipDefaultExperienceUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppClipDefaultExperiencesApi#appClipDefaultExperiencesUpdateInstance");
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
| **appClipDefaultExperienceUpdateRequest** | [**AppClipDefaultExperienceUpdateRequest**](AppClipDefaultExperienceUpdateRequest.md)| AppClipDefaultExperience representation | |

### Return type

[**AppClipDefaultExperienceResponse**](AppClipDefaultExperienceResponse.md)

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
| **200** | Single AppClipDefaultExperience |  -  |
| **409** | Request entity error(s) |  -  |

