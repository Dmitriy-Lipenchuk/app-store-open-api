# ReviewSubmissionsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**reviewSubmissionsCreateInstance**](ReviewSubmissionsApi.md#reviewSubmissionsCreateInstance) | **POST** /v1/reviewSubmissions |  |
| [**reviewSubmissionsGetCollection**](ReviewSubmissionsApi.md#reviewSubmissionsGetCollection) | **GET** /v1/reviewSubmissions |  |
| [**reviewSubmissionsGetInstance**](ReviewSubmissionsApi.md#reviewSubmissionsGetInstance) | **GET** /v1/reviewSubmissions/{id} |  |
| [**reviewSubmissionsItemsGetToManyRelated**](ReviewSubmissionsApi.md#reviewSubmissionsItemsGetToManyRelated) | **GET** /v1/reviewSubmissions/{id}/items |  |
| [**reviewSubmissionsUpdateInstance**](ReviewSubmissionsApi.md#reviewSubmissionsUpdateInstance) | **PATCH** /v1/reviewSubmissions/{id} |  |



## reviewSubmissionsCreateInstance

> ReviewSubmissionResponse reviewSubmissionsCreateInstance(reviewSubmissionCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.ReviewSubmissionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        ReviewSubmissionsApi apiInstance = new ReviewSubmissionsApi(defaultClient);
        ReviewSubmissionCreateRequest reviewSubmissionCreateRequest = new ReviewSubmissionCreateRequest(); // ReviewSubmissionCreateRequest | ReviewSubmission representation
        try {
            ReviewSubmissionResponse result = apiInstance.reviewSubmissionsCreateInstance(reviewSubmissionCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReviewSubmissionsApi#reviewSubmissionsCreateInstance");
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
| **reviewSubmissionCreateRequest** | [**ReviewSubmissionCreateRequest**](ReviewSubmissionCreateRequest.md)| ReviewSubmission representation | |

### Return type

[**ReviewSubmissionResponse**](ReviewSubmissionResponse.md)

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
| **201** | Single ReviewSubmission |  -  |
| **409** | Request entity error(s) |  -  |


## reviewSubmissionsGetCollection

> ReviewSubmissionsResponse reviewSubmissionsGetCollection(filterApp, filterPlatform, filterState, fieldsReviewSubmissions, limit, include, fieldsReviewSubmissionItems, limitItems)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.ReviewSubmissionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        ReviewSubmissionsApi apiInstance = new ReviewSubmissionsApi(defaultClient);
        List<String> filterApp = Arrays.asList(); // List<String> | filter by id(s) of related 'app'
        List<String> filterPlatform = Arrays.asList(); // List<String> | filter by attribute 'platform'
        List<String> filterState = Arrays.asList(); // List<String> | filter by attribute 'state'
        List<String> fieldsReviewSubmissions = Arrays.asList(); // List<String> | the fields to include for returned resources of type reviewSubmissions
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsReviewSubmissionItems = Arrays.asList(); // List<String> | the fields to include for returned resources of type reviewSubmissionItems
        Integer limitItems = 56; // Integer | maximum number of related items returned (when they are included)
        try {
            ReviewSubmissionsResponse result = apiInstance.reviewSubmissionsGetCollection(filterApp, filterPlatform, filterState, fieldsReviewSubmissions, limit, include, fieldsReviewSubmissionItems, limitItems);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReviewSubmissionsApi#reviewSubmissionsGetCollection");
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
| **filterApp** | **List&lt;String&gt;**| filter by id(s) of related &#39;app&#39; | |
| **filterPlatform** | **List&lt;String&gt;**| filter by attribute &#39;platform&#39; | [optional] [enum: IOS, MAC_OS, TV_OS, VISION_OS] |
| **filterState** | **List&lt;String&gt;**| filter by attribute &#39;state&#39; | [optional] [enum: READY_FOR_REVIEW, WAITING_FOR_REVIEW, IN_REVIEW, UNRESOLVED_ISSUES, CANCELING, COMPLETING, COMPLETE] |
| **fieldsReviewSubmissions** | **List&lt;String&gt;**| the fields to include for returned resources of type reviewSubmissions | [optional] [enum: app, appStoreVersionForReview, canceled, items, lastUpdatedByActor, platform, state, submitted, submittedByActor, submittedDate] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: app, appStoreVersionForReview, items, lastUpdatedByActor, submittedByActor] |
| **fieldsReviewSubmissionItems** | **List&lt;String&gt;**| the fields to include for returned resources of type reviewSubmissionItems | [optional] [enum: appCustomProductPageVersion, appEvent, appStoreVersion, appStoreVersionExperiment, appStoreVersionExperimentV2, removed, resolved, reviewSubmission, state] |
| **limitItems** | **Integer**| maximum number of related items returned (when they are included) | [optional] |

### Return type

[**ReviewSubmissionsResponse**](ReviewSubmissionsResponse.md)

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
| **200** | List of ReviewSubmissions |  -  |


## reviewSubmissionsGetInstance

> ReviewSubmissionResponse reviewSubmissionsGetInstance(id, fieldsReviewSubmissions, include, fieldsReviewSubmissionItems, limitItems)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.ReviewSubmissionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        ReviewSubmissionsApi apiInstance = new ReviewSubmissionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsReviewSubmissions = Arrays.asList(); // List<String> | the fields to include for returned resources of type reviewSubmissions
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsReviewSubmissionItems = Arrays.asList(); // List<String> | the fields to include for returned resources of type reviewSubmissionItems
        Integer limitItems = 56; // Integer | maximum number of related items returned (when they are included)
        try {
            ReviewSubmissionResponse result = apiInstance.reviewSubmissionsGetInstance(id, fieldsReviewSubmissions, include, fieldsReviewSubmissionItems, limitItems);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReviewSubmissionsApi#reviewSubmissionsGetInstance");
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
| **fieldsReviewSubmissions** | **List&lt;String&gt;**| the fields to include for returned resources of type reviewSubmissions | [optional] [enum: app, appStoreVersionForReview, canceled, items, lastUpdatedByActor, platform, state, submitted, submittedByActor, submittedDate] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: app, appStoreVersionForReview, items, lastUpdatedByActor, submittedByActor] |
| **fieldsReviewSubmissionItems** | **List&lt;String&gt;**| the fields to include for returned resources of type reviewSubmissionItems | [optional] [enum: appCustomProductPageVersion, appEvent, appStoreVersion, appStoreVersionExperiment, appStoreVersionExperimentV2, removed, resolved, reviewSubmission, state] |
| **limitItems** | **Integer**| maximum number of related items returned (when they are included) | [optional] |

### Return type

[**ReviewSubmissionResponse**](ReviewSubmissionResponse.md)

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
| **200** | Single ReviewSubmission |  -  |


## reviewSubmissionsItemsGetToManyRelated

> ReviewSubmissionItemsResponse reviewSubmissionsItemsGetToManyRelated(id, fieldsAppStoreVersionExperiments, fieldsReviewSubmissionItems, fieldsAppStoreVersions, fieldsAppCustomProductPageVersions, fieldsAppEvents, limit, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.ReviewSubmissionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        ReviewSubmissionsApi apiInstance = new ReviewSubmissionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAppStoreVersionExperiments = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersionExperiments
        List<String> fieldsReviewSubmissionItems = Arrays.asList(); // List<String> | the fields to include for returned resources of type reviewSubmissionItems
        List<String> fieldsAppStoreVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersions
        List<String> fieldsAppCustomProductPageVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type appCustomProductPageVersions
        List<String> fieldsAppEvents = Arrays.asList(); // List<String> | the fields to include for returned resources of type appEvents
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            ReviewSubmissionItemsResponse result = apiInstance.reviewSubmissionsItemsGetToManyRelated(id, fieldsAppStoreVersionExperiments, fieldsReviewSubmissionItems, fieldsAppStoreVersions, fieldsAppCustomProductPageVersions, fieldsAppEvents, limit, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReviewSubmissionsApi#reviewSubmissionsItemsGetToManyRelated");
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
| **fieldsAppStoreVersionExperiments** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersionExperiments | [optional] [enum: app, appStoreVersion, appStoreVersionExperimentTreatments, controlVersions, endDate, latestControlVersion, name, platform, reviewRequired, startDate, started, state, trafficProportion] |
| **fieldsReviewSubmissionItems** | **List&lt;String&gt;**| the fields to include for returned resources of type reviewSubmissionItems | [optional] [enum: appCustomProductPageVersion, appEvent, appStoreVersion, appStoreVersionExperiment, appStoreVersionExperimentV2, removed, resolved, reviewSubmission, state] |
| **fieldsAppStoreVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersions | [optional] [enum: ageRatingDeclaration, alternativeDistributionPackage, app, appClipDefaultExperience, appStoreReviewDetail, appStoreState, appStoreVersionExperiments, appStoreVersionExperimentsV2, appStoreVersionLocalizations, appStoreVersionPhasedRelease, appStoreVersionSubmission, appVersionState, build, copyright, createdDate, customerReviews, downloadable, earliestReleaseDate, platform, releaseType, reviewType, routingAppCoverage, versionString] |
| **fieldsAppCustomProductPageVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type appCustomProductPageVersions | [optional] [enum: appCustomProductPage, appCustomProductPageLocalizations, deepLink, state, version] |
| **fieldsAppEvents** | **List&lt;String&gt;**| the fields to include for returned resources of type appEvents | [optional] [enum: app, archivedTerritorySchedules, badge, deepLink, eventState, localizations, primaryLocale, priority, purchaseRequirement, purpose, referenceName, territorySchedules] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: appCustomProductPageVersion, appEvent, appStoreVersion, appStoreVersionExperiment, appStoreVersionExperimentV2] |

### Return type

[**ReviewSubmissionItemsResponse**](ReviewSubmissionItemsResponse.md)

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
| **200** | List of ReviewSubmissionItems |  -  |


## reviewSubmissionsUpdateInstance

> ReviewSubmissionResponse reviewSubmissionsUpdateInstance(id, reviewSubmissionUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.ReviewSubmissionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        ReviewSubmissionsApi apiInstance = new ReviewSubmissionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        ReviewSubmissionUpdateRequest reviewSubmissionUpdateRequest = new ReviewSubmissionUpdateRequest(); // ReviewSubmissionUpdateRequest | ReviewSubmission representation
        try {
            ReviewSubmissionResponse result = apiInstance.reviewSubmissionsUpdateInstance(id, reviewSubmissionUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReviewSubmissionsApi#reviewSubmissionsUpdateInstance");
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
| **reviewSubmissionUpdateRequest** | [**ReviewSubmissionUpdateRequest**](ReviewSubmissionUpdateRequest.md)| ReviewSubmission representation | |

### Return type

[**ReviewSubmissionResponse**](ReviewSubmissionResponse.md)

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
| **200** | Single ReviewSubmission |  -  |
| **409** | Request entity error(s) |  -  |

