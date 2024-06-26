# AppEventsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**appEventsCreateInstance**](AppEventsApi.md#appEventsCreateInstance) | **POST** /v1/appEvents |  |
| [**appEventsDeleteInstance**](AppEventsApi.md#appEventsDeleteInstance) | **DELETE** /v1/appEvents/{id} |  |
| [**appEventsGetInstance**](AppEventsApi.md#appEventsGetInstance) | **GET** /v1/appEvents/{id} |  |
| [**appEventsLocalizationsGetToManyRelated**](AppEventsApi.md#appEventsLocalizationsGetToManyRelated) | **GET** /v1/appEvents/{id}/localizations |  |
| [**appEventsUpdateInstance**](AppEventsApi.md#appEventsUpdateInstance) | **PATCH** /v1/appEvents/{id} |  |



## appEventsCreateInstance

> AppEventResponse appEventsCreateInstance(appEventCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppEventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppEventsApi apiInstance = new AppEventsApi(defaultClient);
        AppEventCreateRequest appEventCreateRequest = new AppEventCreateRequest(); // AppEventCreateRequest | AppEvent representation
        try {
            AppEventResponse result = apiInstance.appEventsCreateInstance(appEventCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppEventsApi#appEventsCreateInstance");
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
| **appEventCreateRequest** | [**AppEventCreateRequest**](AppEventCreateRequest.md)| AppEvent representation | |

### Return type

[**AppEventResponse**](AppEventResponse.md)

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
| **201** | Single AppEvent |  -  |
| **409** | Request entity error(s) |  -  |


## appEventsDeleteInstance

> appEventsDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppEventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppEventsApi apiInstance = new AppEventsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.appEventsDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppEventsApi#appEventsDeleteInstance");
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


## appEventsGetInstance

> AppEventResponse appEventsGetInstance(id, fieldsAppEvents, include, fieldsAppEventLocalizations, limitLocalizations)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppEventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppEventsApi apiInstance = new AppEventsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAppEvents = Arrays.asList(); // List<String> | the fields to include for returned resources of type appEvents
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsAppEventLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type appEventLocalizations
        Integer limitLocalizations = 56; // Integer | maximum number of related localizations returned (when they are included)
        try {
            AppEventResponse result = apiInstance.appEventsGetInstance(id, fieldsAppEvents, include, fieldsAppEventLocalizations, limitLocalizations);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppEventsApi#appEventsGetInstance");
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
| **fieldsAppEvents** | **List&lt;String&gt;**| the fields to include for returned resources of type appEvents | [optional] [enum: app, archivedTerritorySchedules, badge, deepLink, eventState, localizations, primaryLocale, priority, purchaseRequirement, purpose, referenceName, territorySchedules] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: localizations] |
| **fieldsAppEventLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type appEventLocalizations | [optional] [enum: appEvent, appEventScreenshots, appEventVideoClips, locale, longDescription, name, shortDescription] |
| **limitLocalizations** | **Integer**| maximum number of related localizations returned (when they are included) | [optional] |

### Return type

[**AppEventResponse**](AppEventResponse.md)

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
| **200** | Single AppEvent |  -  |


## appEventsLocalizationsGetToManyRelated

> AppEventLocalizationsResponse appEventsLocalizationsGetToManyRelated(id, fieldsAppEventScreenshots, fieldsAppEventVideoClips, fieldsAppEventLocalizations, fieldsAppEvents, limit, limitAppEventScreenshots, limitAppEventVideoClips, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppEventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppEventsApi apiInstance = new AppEventsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAppEventScreenshots = Arrays.asList(); // List<String> | the fields to include for returned resources of type appEventScreenshots
        List<String> fieldsAppEventVideoClips = Arrays.asList(); // List<String> | the fields to include for returned resources of type appEventVideoClips
        List<String> fieldsAppEventLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type appEventLocalizations
        List<String> fieldsAppEvents = Arrays.asList(); // List<String> | the fields to include for returned resources of type appEvents
        Integer limit = 56; // Integer | maximum resources per page
        Integer limitAppEventScreenshots = 56; // Integer | maximum number of related appEventScreenshots returned (when they are included)
        Integer limitAppEventVideoClips = 56; // Integer | maximum number of related appEventVideoClips returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            AppEventLocalizationsResponse result = apiInstance.appEventsLocalizationsGetToManyRelated(id, fieldsAppEventScreenshots, fieldsAppEventVideoClips, fieldsAppEventLocalizations, fieldsAppEvents, limit, limitAppEventScreenshots, limitAppEventVideoClips, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppEventsApi#appEventsLocalizationsGetToManyRelated");
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
| **fieldsAppEventScreenshots** | **List&lt;String&gt;**| the fields to include for returned resources of type appEventScreenshots | [optional] [enum: appEventAssetType, appEventLocalization, assetDeliveryState, assetToken, fileName, fileSize, imageAsset, uploadOperations, uploaded] |
| **fieldsAppEventVideoClips** | **List&lt;String&gt;**| the fields to include for returned resources of type appEventVideoClips | [optional] [enum: appEventAssetType, appEventLocalization, assetDeliveryState, fileName, fileSize, previewFrameTimeCode, previewImage, uploadOperations, uploaded, videoUrl] |
| **fieldsAppEventLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type appEventLocalizations | [optional] [enum: appEvent, appEventScreenshots, appEventVideoClips, locale, longDescription, name, shortDescription] |
| **fieldsAppEvents** | **List&lt;String&gt;**| the fields to include for returned resources of type appEvents | [optional] [enum: app, archivedTerritorySchedules, badge, deepLink, eventState, localizations, primaryLocale, priority, purchaseRequirement, purpose, referenceName, territorySchedules] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **limitAppEventScreenshots** | **Integer**| maximum number of related appEventScreenshots returned (when they are included) | [optional] |
| **limitAppEventVideoClips** | **Integer**| maximum number of related appEventVideoClips returned (when they are included) | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: appEvent, appEventScreenshots, appEventVideoClips] |

### Return type

[**AppEventLocalizationsResponse**](AppEventLocalizationsResponse.md)

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
| **200** | List of AppEventLocalizations |  -  |


## appEventsUpdateInstance

> AppEventResponse appEventsUpdateInstance(id, appEventUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppEventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppEventsApi apiInstance = new AppEventsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        AppEventUpdateRequest appEventUpdateRequest = new AppEventUpdateRequest(); // AppEventUpdateRequest | AppEvent representation
        try {
            AppEventResponse result = apiInstance.appEventsUpdateInstance(id, appEventUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppEventsApi#appEventsUpdateInstance");
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
| **appEventUpdateRequest** | [**AppEventUpdateRequest**](AppEventUpdateRequest.md)| AppEvent representation | |

### Return type

[**AppEventResponse**](AppEventResponse.md)

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
| **200** | Single AppEvent |  -  |
| **409** | Request entity error(s) |  -  |

