# AppEventLocalizationsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**appEventLocalizationsAppEventScreenshotsGetToManyRelated**](AppEventLocalizationsApi.md#appEventLocalizationsAppEventScreenshotsGetToManyRelated) | **GET** /v1/appEventLocalizations/{id}/appEventScreenshots |  |
| [**appEventLocalizationsAppEventVideoClipsGetToManyRelated**](AppEventLocalizationsApi.md#appEventLocalizationsAppEventVideoClipsGetToManyRelated) | **GET** /v1/appEventLocalizations/{id}/appEventVideoClips |  |
| [**appEventLocalizationsCreateInstance**](AppEventLocalizationsApi.md#appEventLocalizationsCreateInstance) | **POST** /v1/appEventLocalizations |  |
| [**appEventLocalizationsDeleteInstance**](AppEventLocalizationsApi.md#appEventLocalizationsDeleteInstance) | **DELETE** /v1/appEventLocalizations/{id} |  |
| [**appEventLocalizationsGetInstance**](AppEventLocalizationsApi.md#appEventLocalizationsGetInstance) | **GET** /v1/appEventLocalizations/{id} |  |
| [**appEventLocalizationsUpdateInstance**](AppEventLocalizationsApi.md#appEventLocalizationsUpdateInstance) | **PATCH** /v1/appEventLocalizations/{id} |  |



## appEventLocalizationsAppEventScreenshotsGetToManyRelated

> AppEventScreenshotsResponse appEventLocalizationsAppEventScreenshotsGetToManyRelated(id, fieldsAppEventScreenshots, fieldsAppEventLocalizations, limit, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppEventLocalizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppEventLocalizationsApi apiInstance = new AppEventLocalizationsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAppEventScreenshots = Arrays.asList(); // List<String> | the fields to include for returned resources of type appEventScreenshots
        List<String> fieldsAppEventLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type appEventLocalizations
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            AppEventScreenshotsResponse result = apiInstance.appEventLocalizationsAppEventScreenshotsGetToManyRelated(id, fieldsAppEventScreenshots, fieldsAppEventLocalizations, limit, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppEventLocalizationsApi#appEventLocalizationsAppEventScreenshotsGetToManyRelated");
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
| **fieldsAppEventLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type appEventLocalizations | [optional] [enum: appEvent, appEventScreenshots, appEventVideoClips, locale, longDescription, name, shortDescription] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: appEventLocalization] |

### Return type

[**AppEventScreenshotsResponse**](AppEventScreenshotsResponse.md)

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
| **200** | List of AppEventScreenshots |  -  |


## appEventLocalizationsAppEventVideoClipsGetToManyRelated

> AppEventVideoClipsResponse appEventLocalizationsAppEventVideoClipsGetToManyRelated(id, fieldsAppEventVideoClips, fieldsAppEventLocalizations, limit, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppEventLocalizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppEventLocalizationsApi apiInstance = new AppEventLocalizationsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAppEventVideoClips = Arrays.asList(); // List<String> | the fields to include for returned resources of type appEventVideoClips
        List<String> fieldsAppEventLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type appEventLocalizations
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            AppEventVideoClipsResponse result = apiInstance.appEventLocalizationsAppEventVideoClipsGetToManyRelated(id, fieldsAppEventVideoClips, fieldsAppEventLocalizations, limit, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppEventLocalizationsApi#appEventLocalizationsAppEventVideoClipsGetToManyRelated");
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
| **fieldsAppEventVideoClips** | **List&lt;String&gt;**| the fields to include for returned resources of type appEventVideoClips | [optional] [enum: appEventAssetType, appEventLocalization, assetDeliveryState, fileName, fileSize, previewFrameTimeCode, previewImage, uploadOperations, uploaded, videoUrl] |
| **fieldsAppEventLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type appEventLocalizations | [optional] [enum: appEvent, appEventScreenshots, appEventVideoClips, locale, longDescription, name, shortDescription] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: appEventLocalization] |

### Return type

[**AppEventVideoClipsResponse**](AppEventVideoClipsResponse.md)

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
| **200** | List of AppEventVideoClips |  -  |


## appEventLocalizationsCreateInstance

> AppEventLocalizationResponse appEventLocalizationsCreateInstance(appEventLocalizationCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppEventLocalizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppEventLocalizationsApi apiInstance = new AppEventLocalizationsApi(defaultClient);
        AppEventLocalizationCreateRequest appEventLocalizationCreateRequest = new AppEventLocalizationCreateRequest(); // AppEventLocalizationCreateRequest | AppEventLocalization representation
        try {
            AppEventLocalizationResponse result = apiInstance.appEventLocalizationsCreateInstance(appEventLocalizationCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppEventLocalizationsApi#appEventLocalizationsCreateInstance");
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
| **appEventLocalizationCreateRequest** | [**AppEventLocalizationCreateRequest**](AppEventLocalizationCreateRequest.md)| AppEventLocalization representation | |

### Return type

[**AppEventLocalizationResponse**](AppEventLocalizationResponse.md)

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
| **201** | Single AppEventLocalization |  -  |
| **409** | Request entity error(s) |  -  |


## appEventLocalizationsDeleteInstance

> appEventLocalizationsDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppEventLocalizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppEventLocalizationsApi apiInstance = new AppEventLocalizationsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.appEventLocalizationsDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppEventLocalizationsApi#appEventLocalizationsDeleteInstance");
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


## appEventLocalizationsGetInstance

> AppEventLocalizationResponse appEventLocalizationsGetInstance(id, fieldsAppEventLocalizations, include, fieldsAppEventScreenshots, fieldsAppEventVideoClips, limitAppEventScreenshots, limitAppEventVideoClips)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppEventLocalizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppEventLocalizationsApi apiInstance = new AppEventLocalizationsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAppEventLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type appEventLocalizations
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsAppEventScreenshots = Arrays.asList(); // List<String> | the fields to include for returned resources of type appEventScreenshots
        List<String> fieldsAppEventVideoClips = Arrays.asList(); // List<String> | the fields to include for returned resources of type appEventVideoClips
        Integer limitAppEventScreenshots = 56; // Integer | maximum number of related appEventScreenshots returned (when they are included)
        Integer limitAppEventVideoClips = 56; // Integer | maximum number of related appEventVideoClips returned (when they are included)
        try {
            AppEventLocalizationResponse result = apiInstance.appEventLocalizationsGetInstance(id, fieldsAppEventLocalizations, include, fieldsAppEventScreenshots, fieldsAppEventVideoClips, limitAppEventScreenshots, limitAppEventVideoClips);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppEventLocalizationsApi#appEventLocalizationsGetInstance");
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
| **fieldsAppEventLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type appEventLocalizations | [optional] [enum: appEvent, appEventScreenshots, appEventVideoClips, locale, longDescription, name, shortDescription] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: appEvent, appEventScreenshots, appEventVideoClips] |
| **fieldsAppEventScreenshots** | **List&lt;String&gt;**| the fields to include for returned resources of type appEventScreenshots | [optional] [enum: appEventAssetType, appEventLocalization, assetDeliveryState, assetToken, fileName, fileSize, imageAsset, uploadOperations, uploaded] |
| **fieldsAppEventVideoClips** | **List&lt;String&gt;**| the fields to include for returned resources of type appEventVideoClips | [optional] [enum: appEventAssetType, appEventLocalization, assetDeliveryState, fileName, fileSize, previewFrameTimeCode, previewImage, uploadOperations, uploaded, videoUrl] |
| **limitAppEventScreenshots** | **Integer**| maximum number of related appEventScreenshots returned (when they are included) | [optional] |
| **limitAppEventVideoClips** | **Integer**| maximum number of related appEventVideoClips returned (when they are included) | [optional] |

### Return type

[**AppEventLocalizationResponse**](AppEventLocalizationResponse.md)

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
| **200** | Single AppEventLocalization |  -  |


## appEventLocalizationsUpdateInstance

> AppEventLocalizationResponse appEventLocalizationsUpdateInstance(id, appEventLocalizationUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppEventLocalizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppEventLocalizationsApi apiInstance = new AppEventLocalizationsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        AppEventLocalizationUpdateRequest appEventLocalizationUpdateRequest = new AppEventLocalizationUpdateRequest(); // AppEventLocalizationUpdateRequest | AppEventLocalization representation
        try {
            AppEventLocalizationResponse result = apiInstance.appEventLocalizationsUpdateInstance(id, appEventLocalizationUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppEventLocalizationsApi#appEventLocalizationsUpdateInstance");
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
| **appEventLocalizationUpdateRequest** | [**AppEventLocalizationUpdateRequest**](AppEventLocalizationUpdateRequest.md)| AppEventLocalization representation | |

### Return type

[**AppEventLocalizationResponse**](AppEventLocalizationResponse.md)

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
| **200** | Single AppEventLocalization |  -  |
| **409** | Request entity error(s) |  -  |

