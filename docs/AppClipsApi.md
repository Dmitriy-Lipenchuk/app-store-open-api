# AppClipsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**appClipsAppClipAdvancedExperiencesGetToManyRelated**](AppClipsApi.md#appClipsAppClipAdvancedExperiencesGetToManyRelated) | **GET** /v1/appClips/{id}/appClipAdvancedExperiences |  |
| [**appClipsAppClipDefaultExperiencesGetToManyRelated**](AppClipsApi.md#appClipsAppClipDefaultExperiencesGetToManyRelated) | **GET** /v1/appClips/{id}/appClipDefaultExperiences |  |
| [**appClipsGetInstance**](AppClipsApi.md#appClipsGetInstance) | **GET** /v1/appClips/{id} |  |



## appClipsAppClipAdvancedExperiencesGetToManyRelated

> AppClipAdvancedExperiencesResponse appClipsAppClipAdvancedExperiencesGetToManyRelated(id, filterAction, filterPlaceStatus, filterStatus, fieldsAppClipAdvancedExperiences, fieldsAppClips, fieldsAppClipAdvancedExperienceImages, fieldsAppClipAdvancedExperienceLocalizations, limit, limitLocalizations, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppClipsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppClipsApi apiInstance = new AppClipsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> filterAction = Arrays.asList(); // List<String> | filter by attribute 'action'
        List<String> filterPlaceStatus = Arrays.asList(); // List<String> | filter by attribute 'placeStatus'
        List<String> filterStatus = Arrays.asList(); // List<String> | filter by attribute 'status'
        List<String> fieldsAppClipAdvancedExperiences = Arrays.asList(); // List<String> | the fields to include for returned resources of type appClipAdvancedExperiences
        List<String> fieldsAppClips = Arrays.asList(); // List<String> | the fields to include for returned resources of type appClips
        List<String> fieldsAppClipAdvancedExperienceImages = Arrays.asList(); // List<String> | the fields to include for returned resources of type appClipAdvancedExperienceImages
        List<String> fieldsAppClipAdvancedExperienceLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type appClipAdvancedExperienceLocalizations
        Integer limit = 56; // Integer | maximum resources per page
        Integer limitLocalizations = 56; // Integer | maximum number of related localizations returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            AppClipAdvancedExperiencesResponse result = apiInstance.appClipsAppClipAdvancedExperiencesGetToManyRelated(id, filterAction, filterPlaceStatus, filterStatus, fieldsAppClipAdvancedExperiences, fieldsAppClips, fieldsAppClipAdvancedExperienceImages, fieldsAppClipAdvancedExperienceLocalizations, limit, limitLocalizations, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppClipsApi#appClipsAppClipAdvancedExperiencesGetToManyRelated");
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
| **filterAction** | **List&lt;String&gt;**| filter by attribute &#39;action&#39; | [optional] [enum: OPEN, VIEW, PLAY] |
| **filterPlaceStatus** | **List&lt;String&gt;**| filter by attribute &#39;placeStatus&#39; | [optional] [enum: PENDING, MATCHED, NO_MATCH] |
| **filterStatus** | **List&lt;String&gt;**| filter by attribute &#39;status&#39; | [optional] [enum: RECEIVED, DEACTIVATED, APP_TRANSFER_IN_PROGRESS] |
| **fieldsAppClipAdvancedExperiences** | **List&lt;String&gt;**| the fields to include for returned resources of type appClipAdvancedExperiences | [optional] [enum: action, appClip, businessCategory, defaultLanguage, headerImage, isPoweredBy, link, localizations, place, placeStatus, removed, status, version] |
| **fieldsAppClips** | **List&lt;String&gt;**| the fields to include for returned resources of type appClips | [optional] [enum: app, appClipAdvancedExperiences, appClipDefaultExperiences, bundleId] |
| **fieldsAppClipAdvancedExperienceImages** | **List&lt;String&gt;**| the fields to include for returned resources of type appClipAdvancedExperienceImages | [optional] [enum: assetDeliveryState, fileName, fileSize, imageAsset, sourceFileChecksum, uploadOperations, uploaded] |
| **fieldsAppClipAdvancedExperienceLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type appClipAdvancedExperienceLocalizations | [optional] [enum: language, subtitle, title] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **limitLocalizations** | **Integer**| maximum number of related localizations returned (when they are included) | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: appClip, headerImage, localizations] |

### Return type

[**AppClipAdvancedExperiencesResponse**](AppClipAdvancedExperiencesResponse.md)

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
| **200** | List of AppClipAdvancedExperiences |  -  |


## appClipsAppClipDefaultExperiencesGetToManyRelated

> AppClipDefaultExperiencesResponse appClipsAppClipDefaultExperiencesGetToManyRelated(id, existsReleaseWithAppStoreVersion, fieldsAppClips, fieldsAppClipAppStoreReviewDetails, fieldsAppStoreVersions, fieldsAppClipDefaultExperiences, fieldsAppClipDefaultExperienceLocalizations, limit, limitAppClipDefaultExperienceLocalizations, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppClipsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppClipsApi apiInstance = new AppClipsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        Boolean existsReleaseWithAppStoreVersion = true; // Boolean | filter by existence or non-existence of related 'releaseWithAppStoreVersion'
        List<String> fieldsAppClips = Arrays.asList(); // List<String> | the fields to include for returned resources of type appClips
        List<String> fieldsAppClipAppStoreReviewDetails = Arrays.asList(); // List<String> | the fields to include for returned resources of type appClipAppStoreReviewDetails
        List<String> fieldsAppStoreVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersions
        List<String> fieldsAppClipDefaultExperiences = Arrays.asList(); // List<String> | the fields to include for returned resources of type appClipDefaultExperiences
        List<String> fieldsAppClipDefaultExperienceLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type appClipDefaultExperienceLocalizations
        Integer limit = 56; // Integer | maximum resources per page
        Integer limitAppClipDefaultExperienceLocalizations = 56; // Integer | maximum number of related appClipDefaultExperienceLocalizations returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            AppClipDefaultExperiencesResponse result = apiInstance.appClipsAppClipDefaultExperiencesGetToManyRelated(id, existsReleaseWithAppStoreVersion, fieldsAppClips, fieldsAppClipAppStoreReviewDetails, fieldsAppStoreVersions, fieldsAppClipDefaultExperiences, fieldsAppClipDefaultExperienceLocalizations, limit, limitAppClipDefaultExperienceLocalizations, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppClipsApi#appClipsAppClipDefaultExperiencesGetToManyRelated");
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
| **existsReleaseWithAppStoreVersion** | **Boolean**| filter by existence or non-existence of related &#39;releaseWithAppStoreVersion&#39; | [optional] |
| **fieldsAppClips** | **List&lt;String&gt;**| the fields to include for returned resources of type appClips | [optional] [enum: app, appClipAdvancedExperiences, appClipDefaultExperiences, bundleId] |
| **fieldsAppClipAppStoreReviewDetails** | **List&lt;String&gt;**| the fields to include for returned resources of type appClipAppStoreReviewDetails | [optional] [enum: appClipDefaultExperience, invocationUrls] |
| **fieldsAppStoreVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersions | [optional] [enum: ageRatingDeclaration, alternativeDistributionPackage, app, appClipDefaultExperience, appStoreReviewDetail, appStoreState, appStoreVersionExperiments, appStoreVersionExperimentsV2, appStoreVersionLocalizations, appStoreVersionPhasedRelease, appStoreVersionSubmission, appVersionState, build, copyright, createdDate, customerReviews, downloadable, earliestReleaseDate, platform, releaseType, reviewType, routingAppCoverage, versionString] |
| **fieldsAppClipDefaultExperiences** | **List&lt;String&gt;**| the fields to include for returned resources of type appClipDefaultExperiences | [optional] [enum: action, appClip, appClipAppStoreReviewDetail, appClipDefaultExperienceLocalizations, appClipDefaultExperienceTemplate, releaseWithAppStoreVersion] |
| **fieldsAppClipDefaultExperienceLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type appClipDefaultExperienceLocalizations | [optional] [enum: appClipDefaultExperience, appClipHeaderImage, locale, subtitle] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **limitAppClipDefaultExperienceLocalizations** | **Integer**| maximum number of related appClipDefaultExperienceLocalizations returned (when they are included) | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: appClip, appClipAppStoreReviewDetail, appClipDefaultExperienceLocalizations, releaseWithAppStoreVersion] |

### Return type

[**AppClipDefaultExperiencesResponse**](AppClipDefaultExperiencesResponse.md)

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
| **200** | List of AppClipDefaultExperiences |  -  |


## appClipsGetInstance

> AppClipResponse appClipsGetInstance(id, fieldsAppClips, include, fieldsAppClipAdvancedExperiences, fieldsAppClipDefaultExperiences, limitAppClipDefaultExperiences)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppClipsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppClipsApi apiInstance = new AppClipsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAppClips = Arrays.asList(); // List<String> | the fields to include for returned resources of type appClips
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsAppClipAdvancedExperiences = Arrays.asList(); // List<String> | the fields to include for returned resources of type appClipAdvancedExperiences
        List<String> fieldsAppClipDefaultExperiences = Arrays.asList(); // List<String> | the fields to include for returned resources of type appClipDefaultExperiences
        Integer limitAppClipDefaultExperiences = 56; // Integer | maximum number of related appClipDefaultExperiences returned (when they are included)
        try {
            AppClipResponse result = apiInstance.appClipsGetInstance(id, fieldsAppClips, include, fieldsAppClipAdvancedExperiences, fieldsAppClipDefaultExperiences, limitAppClipDefaultExperiences);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppClipsApi#appClipsGetInstance");
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
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: app, appClipDefaultExperiences] |
| **fieldsAppClipAdvancedExperiences** | **List&lt;String&gt;**| the fields to include for returned resources of type appClipAdvancedExperiences | [optional] [enum: action, appClip, businessCategory, defaultLanguage, headerImage, isPoweredBy, link, localizations, place, placeStatus, removed, status, version] |
| **fieldsAppClipDefaultExperiences** | **List&lt;String&gt;**| the fields to include for returned resources of type appClipDefaultExperiences | [optional] [enum: action, appClip, appClipAppStoreReviewDetail, appClipDefaultExperienceLocalizations, appClipDefaultExperienceTemplate, releaseWithAppStoreVersion] |
| **limitAppClipDefaultExperiences** | **Integer**| maximum number of related appClipDefaultExperiences returned (when they are included) | [optional] |

### Return type

[**AppClipResponse**](AppClipResponse.md)

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
| **200** | Single AppClip |  -  |

