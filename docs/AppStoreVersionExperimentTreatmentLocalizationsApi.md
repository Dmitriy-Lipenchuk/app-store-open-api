# AppStoreVersionExperimentTreatmentLocalizationsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**appStoreVersionExperimentTreatmentLocalizationsAppPreviewSetsGetToManyRelated**](AppStoreVersionExperimentTreatmentLocalizationsApi.md#appStoreVersionExperimentTreatmentLocalizationsAppPreviewSetsGetToManyRelated) | **GET** /v1/appStoreVersionExperimentTreatmentLocalizations/{id}/appPreviewSets |  |
| [**appStoreVersionExperimentTreatmentLocalizationsAppScreenshotSetsGetToManyRelated**](AppStoreVersionExperimentTreatmentLocalizationsApi.md#appStoreVersionExperimentTreatmentLocalizationsAppScreenshotSetsGetToManyRelated) | **GET** /v1/appStoreVersionExperimentTreatmentLocalizations/{id}/appScreenshotSets |  |
| [**appStoreVersionExperimentTreatmentLocalizationsCreateInstance**](AppStoreVersionExperimentTreatmentLocalizationsApi.md#appStoreVersionExperimentTreatmentLocalizationsCreateInstance) | **POST** /v1/appStoreVersionExperimentTreatmentLocalizations |  |
| [**appStoreVersionExperimentTreatmentLocalizationsDeleteInstance**](AppStoreVersionExperimentTreatmentLocalizationsApi.md#appStoreVersionExperimentTreatmentLocalizationsDeleteInstance) | **DELETE** /v1/appStoreVersionExperimentTreatmentLocalizations/{id} |  |
| [**appStoreVersionExperimentTreatmentLocalizationsGetInstance**](AppStoreVersionExperimentTreatmentLocalizationsApi.md#appStoreVersionExperimentTreatmentLocalizationsGetInstance) | **GET** /v1/appStoreVersionExperimentTreatmentLocalizations/{id} |  |



## appStoreVersionExperimentTreatmentLocalizationsAppPreviewSetsGetToManyRelated

> AppPreviewSetsResponse appStoreVersionExperimentTreatmentLocalizationsAppPreviewSetsGetToManyRelated(id, filterPreviewType, filterAppCustomProductPageLocalization, filterAppStoreVersionLocalization, fieldsAppCustomProductPageLocalizations, fieldsAppStoreVersionExperimentTreatmentLocalizations, fieldsAppPreviews, fieldsAppPreviewSets, fieldsAppStoreVersionLocalizations, limit, limitAppPreviews, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppStoreVersionExperimentTreatmentLocalizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppStoreVersionExperimentTreatmentLocalizationsApi apiInstance = new AppStoreVersionExperimentTreatmentLocalizationsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> filterPreviewType = Arrays.asList(); // List<String> | filter by attribute 'previewType'
        List<String> filterAppCustomProductPageLocalization = Arrays.asList(); // List<String> | filter by id(s) of related 'appCustomProductPageLocalization'
        List<String> filterAppStoreVersionLocalization = Arrays.asList(); // List<String> | filter by id(s) of related 'appStoreVersionLocalization'
        List<String> fieldsAppCustomProductPageLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type appCustomProductPageLocalizations
        List<String> fieldsAppStoreVersionExperimentTreatmentLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersionExperimentTreatmentLocalizations
        List<String> fieldsAppPreviews = Arrays.asList(); // List<String> | the fields to include for returned resources of type appPreviews
        List<String> fieldsAppPreviewSets = Arrays.asList(); // List<String> | the fields to include for returned resources of type appPreviewSets
        List<String> fieldsAppStoreVersionLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersionLocalizations
        Integer limit = 56; // Integer | maximum resources per page
        Integer limitAppPreviews = 56; // Integer | maximum number of related appPreviews returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            AppPreviewSetsResponse result = apiInstance.appStoreVersionExperimentTreatmentLocalizationsAppPreviewSetsGetToManyRelated(id, filterPreviewType, filterAppCustomProductPageLocalization, filterAppStoreVersionLocalization, fieldsAppCustomProductPageLocalizations, fieldsAppStoreVersionExperimentTreatmentLocalizations, fieldsAppPreviews, fieldsAppPreviewSets, fieldsAppStoreVersionLocalizations, limit, limitAppPreviews, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppStoreVersionExperimentTreatmentLocalizationsApi#appStoreVersionExperimentTreatmentLocalizationsAppPreviewSetsGetToManyRelated");
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
| **filterPreviewType** | **List&lt;String&gt;**| filter by attribute &#39;previewType&#39; | [optional] [enum: IPHONE_67, IPHONE_61, IPHONE_65, IPHONE_58, IPHONE_55, IPHONE_47, IPHONE_40, IPHONE_35, IPAD_PRO_3GEN_129, IPAD_PRO_3GEN_11, IPAD_PRO_129, IPAD_105, IPAD_97, DESKTOP, APPLE_TV, APPLE_VISION_PRO] |
| **filterAppCustomProductPageLocalization** | **List&lt;String&gt;**| filter by id(s) of related &#39;appCustomProductPageLocalization&#39; | [optional] |
| **filterAppStoreVersionLocalization** | **List&lt;String&gt;**| filter by id(s) of related &#39;appStoreVersionLocalization&#39; | [optional] |
| **fieldsAppCustomProductPageLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type appCustomProductPageLocalizations | [optional] [enum: appCustomProductPageVersion, appPreviewSets, appScreenshotSets, locale, promotionalText] |
| **fieldsAppStoreVersionExperimentTreatmentLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersionExperimentTreatmentLocalizations | [optional] [enum: appPreviewSets, appScreenshotSets, appStoreVersionExperimentTreatment, locale] |
| **fieldsAppPreviews** | **List&lt;String&gt;**| the fields to include for returned resources of type appPreviews | [optional] [enum: appPreviewSet, assetDeliveryState, fileName, fileSize, mimeType, previewFrameTimeCode, previewImage, sourceFileChecksum, uploadOperations, uploaded, videoUrl] |
| **fieldsAppPreviewSets** | **List&lt;String&gt;**| the fields to include for returned resources of type appPreviewSets | [optional] [enum: appCustomProductPageLocalization, appPreviews, appStoreVersionExperimentTreatmentLocalization, appStoreVersionLocalization, previewType] |
| **fieldsAppStoreVersionLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersionLocalizations | [optional] [enum: appPreviewSets, appScreenshotSets, appStoreVersion, description, keywords, locale, marketingUrl, promotionalText, supportUrl, whatsNew] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **limitAppPreviews** | **Integer**| maximum number of related appPreviews returned (when they are included) | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: appCustomProductPageLocalization, appPreviews, appStoreVersionExperimentTreatmentLocalization, appStoreVersionLocalization] |

### Return type

[**AppPreviewSetsResponse**](AppPreviewSetsResponse.md)

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
| **200** | List of AppPreviewSets |  -  |


## appStoreVersionExperimentTreatmentLocalizationsAppScreenshotSetsGetToManyRelated

> AppScreenshotSetsResponse appStoreVersionExperimentTreatmentLocalizationsAppScreenshotSetsGetToManyRelated(id, filterScreenshotDisplayType, filterAppCustomProductPageLocalization, filterAppStoreVersionLocalization, fieldsAppScreenshotSets, fieldsAppCustomProductPageLocalizations, fieldsAppStoreVersionExperimentTreatmentLocalizations, fieldsAppScreenshots, fieldsAppStoreVersionLocalizations, limit, limitAppScreenshots, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppStoreVersionExperimentTreatmentLocalizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppStoreVersionExperimentTreatmentLocalizationsApi apiInstance = new AppStoreVersionExperimentTreatmentLocalizationsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> filterScreenshotDisplayType = Arrays.asList(); // List<String> | filter by attribute 'screenshotDisplayType'
        List<String> filterAppCustomProductPageLocalization = Arrays.asList(); // List<String> | filter by id(s) of related 'appCustomProductPageLocalization'
        List<String> filterAppStoreVersionLocalization = Arrays.asList(); // List<String> | filter by id(s) of related 'appStoreVersionLocalization'
        List<String> fieldsAppScreenshotSets = Arrays.asList(); // List<String> | the fields to include for returned resources of type appScreenshotSets
        List<String> fieldsAppCustomProductPageLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type appCustomProductPageLocalizations
        List<String> fieldsAppStoreVersionExperimentTreatmentLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersionExperimentTreatmentLocalizations
        List<String> fieldsAppScreenshots = Arrays.asList(); // List<String> | the fields to include for returned resources of type appScreenshots
        List<String> fieldsAppStoreVersionLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersionLocalizations
        Integer limit = 56; // Integer | maximum resources per page
        Integer limitAppScreenshots = 56; // Integer | maximum number of related appScreenshots returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            AppScreenshotSetsResponse result = apiInstance.appStoreVersionExperimentTreatmentLocalizationsAppScreenshotSetsGetToManyRelated(id, filterScreenshotDisplayType, filterAppCustomProductPageLocalization, filterAppStoreVersionLocalization, fieldsAppScreenshotSets, fieldsAppCustomProductPageLocalizations, fieldsAppStoreVersionExperimentTreatmentLocalizations, fieldsAppScreenshots, fieldsAppStoreVersionLocalizations, limit, limitAppScreenshots, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppStoreVersionExperimentTreatmentLocalizationsApi#appStoreVersionExperimentTreatmentLocalizationsAppScreenshotSetsGetToManyRelated");
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
| **filterScreenshotDisplayType** | **List&lt;String&gt;**| filter by attribute &#39;screenshotDisplayType&#39; | [optional] [enum: APP_IPHONE_67, APP_IPHONE_61, APP_IPHONE_65, APP_IPHONE_58, APP_IPHONE_55, APP_IPHONE_47, APP_IPHONE_40, APP_IPHONE_35, APP_IPAD_PRO_3GEN_129, APP_IPAD_PRO_3GEN_11, APP_IPAD_PRO_129, APP_IPAD_105, APP_IPAD_97, APP_DESKTOP, APP_WATCH_ULTRA, APP_WATCH_SERIES_7, APP_WATCH_SERIES_4, APP_WATCH_SERIES_3, APP_APPLE_TV, APP_APPLE_VISION_PRO, IMESSAGE_APP_IPHONE_67, IMESSAGE_APP_IPHONE_61, IMESSAGE_APP_IPHONE_65, IMESSAGE_APP_IPHONE_58, IMESSAGE_APP_IPHONE_55, IMESSAGE_APP_IPHONE_47, IMESSAGE_APP_IPHONE_40, IMESSAGE_APP_IPAD_PRO_3GEN_129, IMESSAGE_APP_IPAD_PRO_3GEN_11, IMESSAGE_APP_IPAD_PRO_129, IMESSAGE_APP_IPAD_105, IMESSAGE_APP_IPAD_97] |
| **filterAppCustomProductPageLocalization** | **List&lt;String&gt;**| filter by id(s) of related &#39;appCustomProductPageLocalization&#39; | [optional] |
| **filterAppStoreVersionLocalization** | **List&lt;String&gt;**| filter by id(s) of related &#39;appStoreVersionLocalization&#39; | [optional] |
| **fieldsAppScreenshotSets** | **List&lt;String&gt;**| the fields to include for returned resources of type appScreenshotSets | [optional] [enum: appCustomProductPageLocalization, appScreenshots, appStoreVersionExperimentTreatmentLocalization, appStoreVersionLocalization, screenshotDisplayType] |
| **fieldsAppCustomProductPageLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type appCustomProductPageLocalizations | [optional] [enum: appCustomProductPageVersion, appPreviewSets, appScreenshotSets, locale, promotionalText] |
| **fieldsAppStoreVersionExperimentTreatmentLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersionExperimentTreatmentLocalizations | [optional] [enum: appPreviewSets, appScreenshotSets, appStoreVersionExperimentTreatment, locale] |
| **fieldsAppScreenshots** | **List&lt;String&gt;**| the fields to include for returned resources of type appScreenshots | [optional] [enum: appScreenshotSet, assetDeliveryState, assetToken, assetType, fileName, fileSize, imageAsset, sourceFileChecksum, uploadOperations, uploaded] |
| **fieldsAppStoreVersionLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersionLocalizations | [optional] [enum: appPreviewSets, appScreenshotSets, appStoreVersion, description, keywords, locale, marketingUrl, promotionalText, supportUrl, whatsNew] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **limitAppScreenshots** | **Integer**| maximum number of related appScreenshots returned (when they are included) | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: appCustomProductPageLocalization, appScreenshots, appStoreVersionExperimentTreatmentLocalization, appStoreVersionLocalization] |

### Return type

[**AppScreenshotSetsResponse**](AppScreenshotSetsResponse.md)

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
| **200** | List of AppScreenshotSets |  -  |


## appStoreVersionExperimentTreatmentLocalizationsCreateInstance

> AppStoreVersionExperimentTreatmentLocalizationResponse appStoreVersionExperimentTreatmentLocalizationsCreateInstance(appStoreVersionExperimentTreatmentLocalizationCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppStoreVersionExperimentTreatmentLocalizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppStoreVersionExperimentTreatmentLocalizationsApi apiInstance = new AppStoreVersionExperimentTreatmentLocalizationsApi(defaultClient);
        AppStoreVersionExperimentTreatmentLocalizationCreateRequest appStoreVersionExperimentTreatmentLocalizationCreateRequest = new AppStoreVersionExperimentTreatmentLocalizationCreateRequest(); // AppStoreVersionExperimentTreatmentLocalizationCreateRequest | AppStoreVersionExperimentTreatmentLocalization representation
        try {
            AppStoreVersionExperimentTreatmentLocalizationResponse result = apiInstance.appStoreVersionExperimentTreatmentLocalizationsCreateInstance(appStoreVersionExperimentTreatmentLocalizationCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppStoreVersionExperimentTreatmentLocalizationsApi#appStoreVersionExperimentTreatmentLocalizationsCreateInstance");
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
| **appStoreVersionExperimentTreatmentLocalizationCreateRequest** | [**AppStoreVersionExperimentTreatmentLocalizationCreateRequest**](AppStoreVersionExperimentTreatmentLocalizationCreateRequest.md)| AppStoreVersionExperimentTreatmentLocalization representation | |

### Return type

[**AppStoreVersionExperimentTreatmentLocalizationResponse**](AppStoreVersionExperimentTreatmentLocalizationResponse.md)

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
| **201** | Single AppStoreVersionExperimentTreatmentLocalization |  -  |
| **409** | Request entity error(s) |  -  |


## appStoreVersionExperimentTreatmentLocalizationsDeleteInstance

> appStoreVersionExperimentTreatmentLocalizationsDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppStoreVersionExperimentTreatmentLocalizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppStoreVersionExperimentTreatmentLocalizationsApi apiInstance = new AppStoreVersionExperimentTreatmentLocalizationsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.appStoreVersionExperimentTreatmentLocalizationsDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppStoreVersionExperimentTreatmentLocalizationsApi#appStoreVersionExperimentTreatmentLocalizationsDeleteInstance");
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


## appStoreVersionExperimentTreatmentLocalizationsGetInstance

> AppStoreVersionExperimentTreatmentLocalizationResponse appStoreVersionExperimentTreatmentLocalizationsGetInstance(id, fieldsAppStoreVersionExperimentTreatmentLocalizations, include, fieldsAppScreenshotSets, fieldsAppPreviewSets, limitAppPreviewSets, limitAppScreenshotSets)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppStoreVersionExperimentTreatmentLocalizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppStoreVersionExperimentTreatmentLocalizationsApi apiInstance = new AppStoreVersionExperimentTreatmentLocalizationsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAppStoreVersionExperimentTreatmentLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersionExperimentTreatmentLocalizations
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsAppScreenshotSets = Arrays.asList(); // List<String> | the fields to include for returned resources of type appScreenshotSets
        List<String> fieldsAppPreviewSets = Arrays.asList(); // List<String> | the fields to include for returned resources of type appPreviewSets
        Integer limitAppPreviewSets = 56; // Integer | maximum number of related appPreviewSets returned (when they are included)
        Integer limitAppScreenshotSets = 56; // Integer | maximum number of related appScreenshotSets returned (when they are included)
        try {
            AppStoreVersionExperimentTreatmentLocalizationResponse result = apiInstance.appStoreVersionExperimentTreatmentLocalizationsGetInstance(id, fieldsAppStoreVersionExperimentTreatmentLocalizations, include, fieldsAppScreenshotSets, fieldsAppPreviewSets, limitAppPreviewSets, limitAppScreenshotSets);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppStoreVersionExperimentTreatmentLocalizationsApi#appStoreVersionExperimentTreatmentLocalizationsGetInstance");
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
| **fieldsAppStoreVersionExperimentTreatmentLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersionExperimentTreatmentLocalizations | [optional] [enum: appPreviewSets, appScreenshotSets, appStoreVersionExperimentTreatment, locale] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: appPreviewSets, appScreenshotSets, appStoreVersionExperimentTreatment] |
| **fieldsAppScreenshotSets** | **List&lt;String&gt;**| the fields to include for returned resources of type appScreenshotSets | [optional] [enum: appCustomProductPageLocalization, appScreenshots, appStoreVersionExperimentTreatmentLocalization, appStoreVersionLocalization, screenshotDisplayType] |
| **fieldsAppPreviewSets** | **List&lt;String&gt;**| the fields to include for returned resources of type appPreviewSets | [optional] [enum: appCustomProductPageLocalization, appPreviews, appStoreVersionExperimentTreatmentLocalization, appStoreVersionLocalization, previewType] |
| **limitAppPreviewSets** | **Integer**| maximum number of related appPreviewSets returned (when they are included) | [optional] |
| **limitAppScreenshotSets** | **Integer**| maximum number of related appScreenshotSets returned (when they are included) | [optional] |

### Return type

[**AppStoreVersionExperimentTreatmentLocalizationResponse**](AppStoreVersionExperimentTreatmentLocalizationResponse.md)

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
| **200** | Single AppStoreVersionExperimentTreatmentLocalization |  -  |

