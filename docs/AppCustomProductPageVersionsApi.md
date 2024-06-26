# AppCustomProductPageVersionsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**appCustomProductPageVersionsAppCustomProductPageLocalizationsGetToManyRelated**](AppCustomProductPageVersionsApi.md#appCustomProductPageVersionsAppCustomProductPageLocalizationsGetToManyRelated) | **GET** /v1/appCustomProductPageVersions/{id}/appCustomProductPageLocalizations |  |
| [**appCustomProductPageVersionsCreateInstance**](AppCustomProductPageVersionsApi.md#appCustomProductPageVersionsCreateInstance) | **POST** /v1/appCustomProductPageVersions |  |
| [**appCustomProductPageVersionsGetInstance**](AppCustomProductPageVersionsApi.md#appCustomProductPageVersionsGetInstance) | **GET** /v1/appCustomProductPageVersions/{id} |  |
| [**appCustomProductPageVersionsUpdateInstance**](AppCustomProductPageVersionsApi.md#appCustomProductPageVersionsUpdateInstance) | **PATCH** /v1/appCustomProductPageVersions/{id} |  |



## appCustomProductPageVersionsAppCustomProductPageLocalizationsGetToManyRelated

> AppCustomProductPageLocalizationsResponse appCustomProductPageVersionsAppCustomProductPageLocalizationsGetToManyRelated(id, filterLocale, fieldsAppScreenshotSets, fieldsAppCustomProductPageLocalizations, fieldsAppCustomProductPageVersions, fieldsAppPreviewSets, limit, limitAppScreenshotSets, limitAppPreviewSets, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppCustomProductPageVersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppCustomProductPageVersionsApi apiInstance = new AppCustomProductPageVersionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> filterLocale = Arrays.asList(); // List<String> | filter by attribute 'locale'
        List<String> fieldsAppScreenshotSets = Arrays.asList(); // List<String> | the fields to include for returned resources of type appScreenshotSets
        List<String> fieldsAppCustomProductPageLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type appCustomProductPageLocalizations
        List<String> fieldsAppCustomProductPageVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type appCustomProductPageVersions
        List<String> fieldsAppPreviewSets = Arrays.asList(); // List<String> | the fields to include for returned resources of type appPreviewSets
        Integer limit = 56; // Integer | maximum resources per page
        Integer limitAppScreenshotSets = 56; // Integer | maximum number of related appScreenshotSets returned (when they are included)
        Integer limitAppPreviewSets = 56; // Integer | maximum number of related appPreviewSets returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            AppCustomProductPageLocalizationsResponse result = apiInstance.appCustomProductPageVersionsAppCustomProductPageLocalizationsGetToManyRelated(id, filterLocale, fieldsAppScreenshotSets, fieldsAppCustomProductPageLocalizations, fieldsAppCustomProductPageVersions, fieldsAppPreviewSets, limit, limitAppScreenshotSets, limitAppPreviewSets, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppCustomProductPageVersionsApi#appCustomProductPageVersionsAppCustomProductPageLocalizationsGetToManyRelated");
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
| **fieldsAppCustomProductPageLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type appCustomProductPageLocalizations | [optional] [enum: appCustomProductPageVersion, appPreviewSets, appScreenshotSets, locale, promotionalText] |
| **fieldsAppCustomProductPageVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type appCustomProductPageVersions | [optional] [enum: appCustomProductPage, appCustomProductPageLocalizations, deepLink, state, version] |
| **fieldsAppPreviewSets** | **List&lt;String&gt;**| the fields to include for returned resources of type appPreviewSets | [optional] [enum: appCustomProductPageLocalization, appPreviews, appStoreVersionExperimentTreatmentLocalization, appStoreVersionLocalization, previewType] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **limitAppScreenshotSets** | **Integer**| maximum number of related appScreenshotSets returned (when they are included) | [optional] |
| **limitAppPreviewSets** | **Integer**| maximum number of related appPreviewSets returned (when they are included) | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: appCustomProductPageVersion, appPreviewSets, appScreenshotSets] |

### Return type

[**AppCustomProductPageLocalizationsResponse**](AppCustomProductPageLocalizationsResponse.md)

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
| **200** | List of AppCustomProductPageLocalizations |  -  |


## appCustomProductPageVersionsCreateInstance

> AppCustomProductPageVersionResponse appCustomProductPageVersionsCreateInstance(appCustomProductPageVersionCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppCustomProductPageVersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppCustomProductPageVersionsApi apiInstance = new AppCustomProductPageVersionsApi(defaultClient);
        AppCustomProductPageVersionCreateRequest appCustomProductPageVersionCreateRequest = new AppCustomProductPageVersionCreateRequest(); // AppCustomProductPageVersionCreateRequest | AppCustomProductPageVersion representation
        try {
            AppCustomProductPageVersionResponse result = apiInstance.appCustomProductPageVersionsCreateInstance(appCustomProductPageVersionCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppCustomProductPageVersionsApi#appCustomProductPageVersionsCreateInstance");
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
| **appCustomProductPageVersionCreateRequest** | [**AppCustomProductPageVersionCreateRequest**](AppCustomProductPageVersionCreateRequest.md)| AppCustomProductPageVersion representation | |

### Return type

[**AppCustomProductPageVersionResponse**](AppCustomProductPageVersionResponse.md)

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
| **201** | Single AppCustomProductPageVersion |  -  |
| **409** | Request entity error(s) |  -  |


## appCustomProductPageVersionsGetInstance

> AppCustomProductPageVersionResponse appCustomProductPageVersionsGetInstance(id, fieldsAppCustomProductPageVersions, include, fieldsAppCustomProductPageLocalizations, limitAppCustomProductPageLocalizations)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppCustomProductPageVersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppCustomProductPageVersionsApi apiInstance = new AppCustomProductPageVersionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAppCustomProductPageVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type appCustomProductPageVersions
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsAppCustomProductPageLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type appCustomProductPageLocalizations
        Integer limitAppCustomProductPageLocalizations = 56; // Integer | maximum number of related appCustomProductPageLocalizations returned (when they are included)
        try {
            AppCustomProductPageVersionResponse result = apiInstance.appCustomProductPageVersionsGetInstance(id, fieldsAppCustomProductPageVersions, include, fieldsAppCustomProductPageLocalizations, limitAppCustomProductPageLocalizations);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppCustomProductPageVersionsApi#appCustomProductPageVersionsGetInstance");
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
| **fieldsAppCustomProductPageVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type appCustomProductPageVersions | [optional] [enum: appCustomProductPage, appCustomProductPageLocalizations, deepLink, state, version] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: appCustomProductPage, appCustomProductPageLocalizations] |
| **fieldsAppCustomProductPageLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type appCustomProductPageLocalizations | [optional] [enum: appCustomProductPageVersion, appPreviewSets, appScreenshotSets, locale, promotionalText] |
| **limitAppCustomProductPageLocalizations** | **Integer**| maximum number of related appCustomProductPageLocalizations returned (when they are included) | [optional] |

### Return type

[**AppCustomProductPageVersionResponse**](AppCustomProductPageVersionResponse.md)

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
| **200** | Single AppCustomProductPageVersion |  -  |


## appCustomProductPageVersionsUpdateInstance

> AppCustomProductPageVersionResponse appCustomProductPageVersionsUpdateInstance(id, appCustomProductPageVersionUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppCustomProductPageVersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppCustomProductPageVersionsApi apiInstance = new AppCustomProductPageVersionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        AppCustomProductPageVersionUpdateRequest appCustomProductPageVersionUpdateRequest = new AppCustomProductPageVersionUpdateRequest(); // AppCustomProductPageVersionUpdateRequest | AppCustomProductPageVersion representation
        try {
            AppCustomProductPageVersionResponse result = apiInstance.appCustomProductPageVersionsUpdateInstance(id, appCustomProductPageVersionUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppCustomProductPageVersionsApi#appCustomProductPageVersionsUpdateInstance");
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
| **appCustomProductPageVersionUpdateRequest** | [**AppCustomProductPageVersionUpdateRequest**](AppCustomProductPageVersionUpdateRequest.md)| AppCustomProductPageVersion representation | |

### Return type

[**AppCustomProductPageVersionResponse**](AppCustomProductPageVersionResponse.md)

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
| **200** | Single AppCustomProductPageVersion |  -  |
| **409** | Request entity error(s) |  -  |

