# AppStoreVersionExperimentTreatmentsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**appStoreVersionExperimentTreatmentsAppStoreVersionExperimentTreatmentLocalizationsGetToManyRelated**](AppStoreVersionExperimentTreatmentsApi.md#appStoreVersionExperimentTreatmentsAppStoreVersionExperimentTreatmentLocalizationsGetToManyRelated) | **GET** /v1/appStoreVersionExperimentTreatments/{id}/appStoreVersionExperimentTreatmentLocalizations |  |
| [**appStoreVersionExperimentTreatmentsCreateInstance**](AppStoreVersionExperimentTreatmentsApi.md#appStoreVersionExperimentTreatmentsCreateInstance) | **POST** /v1/appStoreVersionExperimentTreatments |  |
| [**appStoreVersionExperimentTreatmentsDeleteInstance**](AppStoreVersionExperimentTreatmentsApi.md#appStoreVersionExperimentTreatmentsDeleteInstance) | **DELETE** /v1/appStoreVersionExperimentTreatments/{id} |  |
| [**appStoreVersionExperimentTreatmentsGetInstance**](AppStoreVersionExperimentTreatmentsApi.md#appStoreVersionExperimentTreatmentsGetInstance) | **GET** /v1/appStoreVersionExperimentTreatments/{id} |  |
| [**appStoreVersionExperimentTreatmentsUpdateInstance**](AppStoreVersionExperimentTreatmentsApi.md#appStoreVersionExperimentTreatmentsUpdateInstance) | **PATCH** /v1/appStoreVersionExperimentTreatments/{id} |  |



## appStoreVersionExperimentTreatmentsAppStoreVersionExperimentTreatmentLocalizationsGetToManyRelated

> AppStoreVersionExperimentTreatmentLocalizationsResponse appStoreVersionExperimentTreatmentsAppStoreVersionExperimentTreatmentLocalizationsGetToManyRelated(id, filterLocale, fieldsAppScreenshotSets, fieldsAppStoreVersionExperimentTreatments, fieldsAppStoreVersionExperimentTreatmentLocalizations, fieldsAppPreviewSets, limit, limitAppScreenshotSets, limitAppPreviewSets, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppStoreVersionExperimentTreatmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppStoreVersionExperimentTreatmentsApi apiInstance = new AppStoreVersionExperimentTreatmentsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> filterLocale = Arrays.asList(); // List<String> | filter by attribute 'locale'
        List<String> fieldsAppScreenshotSets = Arrays.asList(); // List<String> | the fields to include for returned resources of type appScreenshotSets
        List<String> fieldsAppStoreVersionExperimentTreatments = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersionExperimentTreatments
        List<String> fieldsAppStoreVersionExperimentTreatmentLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersionExperimentTreatmentLocalizations
        List<String> fieldsAppPreviewSets = Arrays.asList(); // List<String> | the fields to include for returned resources of type appPreviewSets
        Integer limit = 56; // Integer | maximum resources per page
        Integer limitAppScreenshotSets = 56; // Integer | maximum number of related appScreenshotSets returned (when they are included)
        Integer limitAppPreviewSets = 56; // Integer | maximum number of related appPreviewSets returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            AppStoreVersionExperimentTreatmentLocalizationsResponse result = apiInstance.appStoreVersionExperimentTreatmentsAppStoreVersionExperimentTreatmentLocalizationsGetToManyRelated(id, filterLocale, fieldsAppScreenshotSets, fieldsAppStoreVersionExperimentTreatments, fieldsAppStoreVersionExperimentTreatmentLocalizations, fieldsAppPreviewSets, limit, limitAppScreenshotSets, limitAppPreviewSets, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppStoreVersionExperimentTreatmentsApi#appStoreVersionExperimentTreatmentsAppStoreVersionExperimentTreatmentLocalizationsGetToManyRelated");
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
| **fieldsAppStoreVersionExperimentTreatments** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersionExperimentTreatments | [optional] [enum: appIcon, appIconName, appStoreVersionExperiment, appStoreVersionExperimentTreatmentLocalizations, appStoreVersionExperimentV2, name, promotedDate] |
| **fieldsAppStoreVersionExperimentTreatmentLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersionExperimentTreatmentLocalizations | [optional] [enum: appPreviewSets, appScreenshotSets, appStoreVersionExperimentTreatment, locale] |
| **fieldsAppPreviewSets** | **List&lt;String&gt;**| the fields to include for returned resources of type appPreviewSets | [optional] [enum: appCustomProductPageLocalization, appPreviews, appStoreVersionExperimentTreatmentLocalization, appStoreVersionLocalization, previewType] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **limitAppScreenshotSets** | **Integer**| maximum number of related appScreenshotSets returned (when they are included) | [optional] |
| **limitAppPreviewSets** | **Integer**| maximum number of related appPreviewSets returned (when they are included) | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: appPreviewSets, appScreenshotSets, appStoreVersionExperimentTreatment] |

### Return type

[**AppStoreVersionExperimentTreatmentLocalizationsResponse**](AppStoreVersionExperimentTreatmentLocalizationsResponse.md)

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
| **200** | List of AppStoreVersionExperimentTreatmentLocalizations |  -  |


## appStoreVersionExperimentTreatmentsCreateInstance

> AppStoreVersionExperimentTreatmentResponse appStoreVersionExperimentTreatmentsCreateInstance(appStoreVersionExperimentTreatmentCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppStoreVersionExperimentTreatmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppStoreVersionExperimentTreatmentsApi apiInstance = new AppStoreVersionExperimentTreatmentsApi(defaultClient);
        AppStoreVersionExperimentTreatmentCreateRequest appStoreVersionExperimentTreatmentCreateRequest = new AppStoreVersionExperimentTreatmentCreateRequest(); // AppStoreVersionExperimentTreatmentCreateRequest | AppStoreVersionExperimentTreatment representation
        try {
            AppStoreVersionExperimentTreatmentResponse result = apiInstance.appStoreVersionExperimentTreatmentsCreateInstance(appStoreVersionExperimentTreatmentCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppStoreVersionExperimentTreatmentsApi#appStoreVersionExperimentTreatmentsCreateInstance");
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
| **appStoreVersionExperimentTreatmentCreateRequest** | [**AppStoreVersionExperimentTreatmentCreateRequest**](AppStoreVersionExperimentTreatmentCreateRequest.md)| AppStoreVersionExperimentTreatment representation | |

### Return type

[**AppStoreVersionExperimentTreatmentResponse**](AppStoreVersionExperimentTreatmentResponse.md)

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
| **201** | Single AppStoreVersionExperimentTreatment |  -  |
| **409** | Request entity error(s) |  -  |


## appStoreVersionExperimentTreatmentsDeleteInstance

> appStoreVersionExperimentTreatmentsDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppStoreVersionExperimentTreatmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppStoreVersionExperimentTreatmentsApi apiInstance = new AppStoreVersionExperimentTreatmentsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.appStoreVersionExperimentTreatmentsDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppStoreVersionExperimentTreatmentsApi#appStoreVersionExperimentTreatmentsDeleteInstance");
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


## appStoreVersionExperimentTreatmentsGetInstance

> AppStoreVersionExperimentTreatmentResponse appStoreVersionExperimentTreatmentsGetInstance(id, fieldsAppStoreVersionExperimentTreatments, include, fieldsAppStoreVersionExperimentTreatmentLocalizations, limitAppStoreVersionExperimentTreatmentLocalizations)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppStoreVersionExperimentTreatmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppStoreVersionExperimentTreatmentsApi apiInstance = new AppStoreVersionExperimentTreatmentsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAppStoreVersionExperimentTreatments = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersionExperimentTreatments
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsAppStoreVersionExperimentTreatmentLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersionExperimentTreatmentLocalizations
        Integer limitAppStoreVersionExperimentTreatmentLocalizations = 56; // Integer | maximum number of related appStoreVersionExperimentTreatmentLocalizations returned (when they are included)
        try {
            AppStoreVersionExperimentTreatmentResponse result = apiInstance.appStoreVersionExperimentTreatmentsGetInstance(id, fieldsAppStoreVersionExperimentTreatments, include, fieldsAppStoreVersionExperimentTreatmentLocalizations, limitAppStoreVersionExperimentTreatmentLocalizations);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppStoreVersionExperimentTreatmentsApi#appStoreVersionExperimentTreatmentsGetInstance");
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
| **fieldsAppStoreVersionExperimentTreatments** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersionExperimentTreatments | [optional] [enum: appIcon, appIconName, appStoreVersionExperiment, appStoreVersionExperimentTreatmentLocalizations, appStoreVersionExperimentV2, name, promotedDate] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: appStoreVersionExperiment, appStoreVersionExperimentTreatmentLocalizations, appStoreVersionExperimentV2] |
| **fieldsAppStoreVersionExperimentTreatmentLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersionExperimentTreatmentLocalizations | [optional] [enum: appPreviewSets, appScreenshotSets, appStoreVersionExperimentTreatment, locale] |
| **limitAppStoreVersionExperimentTreatmentLocalizations** | **Integer**| maximum number of related appStoreVersionExperimentTreatmentLocalizations returned (when they are included) | [optional] |

### Return type

[**AppStoreVersionExperimentTreatmentResponse**](AppStoreVersionExperimentTreatmentResponse.md)

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
| **200** | Single AppStoreVersionExperimentTreatment |  -  |


## appStoreVersionExperimentTreatmentsUpdateInstance

> AppStoreVersionExperimentTreatmentResponse appStoreVersionExperimentTreatmentsUpdateInstance(id, appStoreVersionExperimentTreatmentUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppStoreVersionExperimentTreatmentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppStoreVersionExperimentTreatmentsApi apiInstance = new AppStoreVersionExperimentTreatmentsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        AppStoreVersionExperimentTreatmentUpdateRequest appStoreVersionExperimentTreatmentUpdateRequest = new AppStoreVersionExperimentTreatmentUpdateRequest(); // AppStoreVersionExperimentTreatmentUpdateRequest | AppStoreVersionExperimentTreatment representation
        try {
            AppStoreVersionExperimentTreatmentResponse result = apiInstance.appStoreVersionExperimentTreatmentsUpdateInstance(id, appStoreVersionExperimentTreatmentUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppStoreVersionExperimentTreatmentsApi#appStoreVersionExperimentTreatmentsUpdateInstance");
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
| **appStoreVersionExperimentTreatmentUpdateRequest** | [**AppStoreVersionExperimentTreatmentUpdateRequest**](AppStoreVersionExperimentTreatmentUpdateRequest.md)| AppStoreVersionExperimentTreatment representation | |

### Return type

[**AppStoreVersionExperimentTreatmentResponse**](AppStoreVersionExperimentTreatmentResponse.md)

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
| **200** | Single AppStoreVersionExperimentTreatment |  -  |
| **409** | Request entity error(s) |  -  |

