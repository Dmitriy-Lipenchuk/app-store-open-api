# AppStoreVersionExperimentsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**appStoreVersionExperimentsAppStoreVersionExperimentTreatmentsGetToManyRelated**](AppStoreVersionExperimentsApi.md#appStoreVersionExperimentsAppStoreVersionExperimentTreatmentsGetToManyRelated) | **GET** /v1/appStoreVersionExperiments/{id}/appStoreVersionExperimentTreatments |  |
| [**appStoreVersionExperimentsCreateInstance**](AppStoreVersionExperimentsApi.md#appStoreVersionExperimentsCreateInstance) | **POST** /v1/appStoreVersionExperiments |  |
| [**appStoreVersionExperimentsDeleteInstance**](AppStoreVersionExperimentsApi.md#appStoreVersionExperimentsDeleteInstance) | **DELETE** /v1/appStoreVersionExperiments/{id} |  |
| [**appStoreVersionExperimentsGetInstance**](AppStoreVersionExperimentsApi.md#appStoreVersionExperimentsGetInstance) | **GET** /v1/appStoreVersionExperiments/{id} |  |
| [**appStoreVersionExperimentsUpdateInstance**](AppStoreVersionExperimentsApi.md#appStoreVersionExperimentsUpdateInstance) | **PATCH** /v1/appStoreVersionExperiments/{id} |  |
| [**appStoreVersionExperimentsV2AppStoreVersionExperimentTreatmentsGetToManyRelated**](AppStoreVersionExperimentsApi.md#appStoreVersionExperimentsV2AppStoreVersionExperimentTreatmentsGetToManyRelated) | **GET** /v2/appStoreVersionExperiments/{id}/appStoreVersionExperimentTreatments |  |
| [**appStoreVersionExperimentsV2CreateInstance**](AppStoreVersionExperimentsApi.md#appStoreVersionExperimentsV2CreateInstance) | **POST** /v2/appStoreVersionExperiments |  |
| [**appStoreVersionExperimentsV2DeleteInstance**](AppStoreVersionExperimentsApi.md#appStoreVersionExperimentsV2DeleteInstance) | **DELETE** /v2/appStoreVersionExperiments/{id} |  |
| [**appStoreVersionExperimentsV2GetInstance**](AppStoreVersionExperimentsApi.md#appStoreVersionExperimentsV2GetInstance) | **GET** /v2/appStoreVersionExperiments/{id} |  |
| [**appStoreVersionExperimentsV2UpdateInstance**](AppStoreVersionExperimentsApi.md#appStoreVersionExperimentsV2UpdateInstance) | **PATCH** /v2/appStoreVersionExperiments/{id} |  |



## appStoreVersionExperimentsAppStoreVersionExperimentTreatmentsGetToManyRelated

> AppStoreVersionExperimentTreatmentsResponse appStoreVersionExperimentsAppStoreVersionExperimentTreatmentsGetToManyRelated(id, fieldsAppStoreVersionExperiments, fieldsAppStoreVersionExperimentTreatments, fieldsAppStoreVersionExperimentTreatmentLocalizations, limit, limitAppStoreVersionExperimentTreatmentLocalizations, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppStoreVersionExperimentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppStoreVersionExperimentsApi apiInstance = new AppStoreVersionExperimentsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAppStoreVersionExperiments = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersionExperiments
        List<String> fieldsAppStoreVersionExperimentTreatments = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersionExperimentTreatments
        List<String> fieldsAppStoreVersionExperimentTreatmentLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersionExperimentTreatmentLocalizations
        Integer limit = 56; // Integer | maximum resources per page
        Integer limitAppStoreVersionExperimentTreatmentLocalizations = 56; // Integer | maximum number of related appStoreVersionExperimentTreatmentLocalizations returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            AppStoreVersionExperimentTreatmentsResponse result = apiInstance.appStoreVersionExperimentsAppStoreVersionExperimentTreatmentsGetToManyRelated(id, fieldsAppStoreVersionExperiments, fieldsAppStoreVersionExperimentTreatments, fieldsAppStoreVersionExperimentTreatmentLocalizations, limit, limitAppStoreVersionExperimentTreatmentLocalizations, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppStoreVersionExperimentsApi#appStoreVersionExperimentsAppStoreVersionExperimentTreatmentsGetToManyRelated");
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
| **fieldsAppStoreVersionExperimentTreatments** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersionExperimentTreatments | [optional] [enum: appIcon, appIconName, appStoreVersionExperiment, appStoreVersionExperimentTreatmentLocalizations, appStoreVersionExperimentV2, name, promotedDate] |
| **fieldsAppStoreVersionExperimentTreatmentLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersionExperimentTreatmentLocalizations | [optional] [enum: appPreviewSets, appScreenshotSets, appStoreVersionExperimentTreatment, locale] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **limitAppStoreVersionExperimentTreatmentLocalizations** | **Integer**| maximum number of related appStoreVersionExperimentTreatmentLocalizations returned (when they are included) | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: appStoreVersionExperiment, appStoreVersionExperimentTreatmentLocalizations, appStoreVersionExperimentV2] |

### Return type

[**AppStoreVersionExperimentTreatmentsResponse**](AppStoreVersionExperimentTreatmentsResponse.md)

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
| **200** | List of AppStoreVersionExperimentTreatments |  -  |


## appStoreVersionExperimentsCreateInstance

> AppStoreVersionExperimentResponse appStoreVersionExperimentsCreateInstance(appStoreVersionExperimentCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppStoreVersionExperimentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppStoreVersionExperimentsApi apiInstance = new AppStoreVersionExperimentsApi(defaultClient);
        AppStoreVersionExperimentCreateRequest appStoreVersionExperimentCreateRequest = new AppStoreVersionExperimentCreateRequest(); // AppStoreVersionExperimentCreateRequest | AppStoreVersionExperiment representation
        try {
            AppStoreVersionExperimentResponse result = apiInstance.appStoreVersionExperimentsCreateInstance(appStoreVersionExperimentCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppStoreVersionExperimentsApi#appStoreVersionExperimentsCreateInstance");
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
| **appStoreVersionExperimentCreateRequest** | [**AppStoreVersionExperimentCreateRequest**](AppStoreVersionExperimentCreateRequest.md)| AppStoreVersionExperiment representation | |

### Return type

[**AppStoreVersionExperimentResponse**](AppStoreVersionExperimentResponse.md)

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
| **201** | Single AppStoreVersionExperiment |  -  |
| **409** | Request entity error(s) |  -  |


## appStoreVersionExperimentsDeleteInstance

> appStoreVersionExperimentsDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppStoreVersionExperimentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppStoreVersionExperimentsApi apiInstance = new AppStoreVersionExperimentsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.appStoreVersionExperimentsDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppStoreVersionExperimentsApi#appStoreVersionExperimentsDeleteInstance");
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


## appStoreVersionExperimentsGetInstance

> AppStoreVersionExperimentResponse appStoreVersionExperimentsGetInstance(id, fieldsAppStoreVersionExperiments, include, fieldsAppStoreVersionExperimentTreatments, limitAppStoreVersionExperimentTreatments)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppStoreVersionExperimentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppStoreVersionExperimentsApi apiInstance = new AppStoreVersionExperimentsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAppStoreVersionExperiments = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersionExperiments
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsAppStoreVersionExperimentTreatments = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersionExperimentTreatments
        Integer limitAppStoreVersionExperimentTreatments = 56; // Integer | maximum number of related appStoreVersionExperimentTreatments returned (when they are included)
        try {
            AppStoreVersionExperimentResponse result = apiInstance.appStoreVersionExperimentsGetInstance(id, fieldsAppStoreVersionExperiments, include, fieldsAppStoreVersionExperimentTreatments, limitAppStoreVersionExperimentTreatments);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppStoreVersionExperimentsApi#appStoreVersionExperimentsGetInstance");
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
| **fieldsAppStoreVersionExperiments** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersionExperiments | [optional] [enum: appStoreVersion, appStoreVersionExperimentTreatments, endDate, name, reviewRequired, startDate, started, state, trafficProportion] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: appStoreVersion, appStoreVersionExperimentTreatments] |
| **fieldsAppStoreVersionExperimentTreatments** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersionExperimentTreatments | [optional] [enum: appIcon, appIconName, appStoreVersionExperiment, appStoreVersionExperimentTreatmentLocalizations, appStoreVersionExperimentV2, name, promotedDate] |
| **limitAppStoreVersionExperimentTreatments** | **Integer**| maximum number of related appStoreVersionExperimentTreatments returned (when they are included) | [optional] |

### Return type

[**AppStoreVersionExperimentResponse**](AppStoreVersionExperimentResponse.md)

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
| **200** | Single AppStoreVersionExperiment |  -  |


## appStoreVersionExperimentsUpdateInstance

> AppStoreVersionExperimentResponse appStoreVersionExperimentsUpdateInstance(id, appStoreVersionExperimentUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppStoreVersionExperimentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppStoreVersionExperimentsApi apiInstance = new AppStoreVersionExperimentsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        AppStoreVersionExperimentUpdateRequest appStoreVersionExperimentUpdateRequest = new AppStoreVersionExperimentUpdateRequest(); // AppStoreVersionExperimentUpdateRequest | AppStoreVersionExperiment representation
        try {
            AppStoreVersionExperimentResponse result = apiInstance.appStoreVersionExperimentsUpdateInstance(id, appStoreVersionExperimentUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppStoreVersionExperimentsApi#appStoreVersionExperimentsUpdateInstance");
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
| **appStoreVersionExperimentUpdateRequest** | [**AppStoreVersionExperimentUpdateRequest**](AppStoreVersionExperimentUpdateRequest.md)| AppStoreVersionExperiment representation | |

### Return type

[**AppStoreVersionExperimentResponse**](AppStoreVersionExperimentResponse.md)

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
| **200** | Single AppStoreVersionExperiment |  -  |
| **409** | Request entity error(s) |  -  |


## appStoreVersionExperimentsV2AppStoreVersionExperimentTreatmentsGetToManyRelated

> AppStoreVersionExperimentTreatmentsResponse appStoreVersionExperimentsV2AppStoreVersionExperimentTreatmentsGetToManyRelated(id, fieldsAppStoreVersionExperiments, fieldsAppStoreVersionExperimentTreatments, fieldsAppStoreVersionExperimentTreatmentLocalizations, limit, limitAppStoreVersionExperimentTreatmentLocalizations, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppStoreVersionExperimentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppStoreVersionExperimentsApi apiInstance = new AppStoreVersionExperimentsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAppStoreVersionExperiments = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersionExperiments
        List<String> fieldsAppStoreVersionExperimentTreatments = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersionExperimentTreatments
        List<String> fieldsAppStoreVersionExperimentTreatmentLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersionExperimentTreatmentLocalizations
        Integer limit = 56; // Integer | maximum resources per page
        Integer limitAppStoreVersionExperimentTreatmentLocalizations = 56; // Integer | maximum number of related appStoreVersionExperimentTreatmentLocalizations returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            AppStoreVersionExperimentTreatmentsResponse result = apiInstance.appStoreVersionExperimentsV2AppStoreVersionExperimentTreatmentsGetToManyRelated(id, fieldsAppStoreVersionExperiments, fieldsAppStoreVersionExperimentTreatments, fieldsAppStoreVersionExperimentTreatmentLocalizations, limit, limitAppStoreVersionExperimentTreatmentLocalizations, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppStoreVersionExperimentsApi#appStoreVersionExperimentsV2AppStoreVersionExperimentTreatmentsGetToManyRelated");
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
| **fieldsAppStoreVersionExperimentTreatments** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersionExperimentTreatments | [optional] [enum: appIcon, appIconName, appStoreVersionExperiment, appStoreVersionExperimentTreatmentLocalizations, appStoreVersionExperimentV2, name, promotedDate] |
| **fieldsAppStoreVersionExperimentTreatmentLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersionExperimentTreatmentLocalizations | [optional] [enum: appPreviewSets, appScreenshotSets, appStoreVersionExperimentTreatment, locale] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **limitAppStoreVersionExperimentTreatmentLocalizations** | **Integer**| maximum number of related appStoreVersionExperimentTreatmentLocalizations returned (when they are included) | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: appStoreVersionExperiment, appStoreVersionExperimentTreatmentLocalizations, appStoreVersionExperimentV2] |

### Return type

[**AppStoreVersionExperimentTreatmentsResponse**](AppStoreVersionExperimentTreatmentsResponse.md)

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
| **200** | List of AppStoreVersionExperimentTreatments |  -  |


## appStoreVersionExperimentsV2CreateInstance

> AppStoreVersionExperimentV2Response appStoreVersionExperimentsV2CreateInstance(appStoreVersionExperimentV2CreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppStoreVersionExperimentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppStoreVersionExperimentsApi apiInstance = new AppStoreVersionExperimentsApi(defaultClient);
        AppStoreVersionExperimentV2CreateRequest appStoreVersionExperimentV2CreateRequest = new AppStoreVersionExperimentV2CreateRequest(); // AppStoreVersionExperimentV2CreateRequest | AppStoreVersionExperiment representation
        try {
            AppStoreVersionExperimentV2Response result = apiInstance.appStoreVersionExperimentsV2CreateInstance(appStoreVersionExperimentV2CreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppStoreVersionExperimentsApi#appStoreVersionExperimentsV2CreateInstance");
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
| **appStoreVersionExperimentV2CreateRequest** | [**AppStoreVersionExperimentV2CreateRequest**](AppStoreVersionExperimentV2CreateRequest.md)| AppStoreVersionExperiment representation | |

### Return type

[**AppStoreVersionExperimentV2Response**](AppStoreVersionExperimentV2Response.md)

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
| **201** | Single AppStoreVersionExperiment |  -  |
| **409** | Request entity error(s) |  -  |


## appStoreVersionExperimentsV2DeleteInstance

> appStoreVersionExperimentsV2DeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppStoreVersionExperimentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppStoreVersionExperimentsApi apiInstance = new AppStoreVersionExperimentsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.appStoreVersionExperimentsV2DeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppStoreVersionExperimentsApi#appStoreVersionExperimentsV2DeleteInstance");
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


## appStoreVersionExperimentsV2GetInstance

> AppStoreVersionExperimentV2Response appStoreVersionExperimentsV2GetInstance(id, fieldsAppStoreVersionExperiments, include, fieldsAppStoreVersionExperimentTreatments, limitAppStoreVersionExperimentTreatments, limitControlVersions)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppStoreVersionExperimentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppStoreVersionExperimentsApi apiInstance = new AppStoreVersionExperimentsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAppStoreVersionExperiments = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersionExperiments
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsAppStoreVersionExperimentTreatments = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersionExperimentTreatments
        Integer limitAppStoreVersionExperimentTreatments = 56; // Integer | maximum number of related appStoreVersionExperimentTreatments returned (when they are included)
        Integer limitControlVersions = 56; // Integer | maximum number of related controlVersions returned (when they are included)
        try {
            AppStoreVersionExperimentV2Response result = apiInstance.appStoreVersionExperimentsV2GetInstance(id, fieldsAppStoreVersionExperiments, include, fieldsAppStoreVersionExperimentTreatments, limitAppStoreVersionExperimentTreatments, limitControlVersions);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppStoreVersionExperimentsApi#appStoreVersionExperimentsV2GetInstance");
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
| **fieldsAppStoreVersionExperiments** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersionExperiments | [optional] [enum: app, appStoreVersionExperimentTreatments, controlVersions, endDate, latestControlVersion, name, platform, reviewRequired, startDate, started, state, trafficProportion] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: app, appStoreVersionExperimentTreatments, controlVersions, latestControlVersion] |
| **fieldsAppStoreVersionExperimentTreatments** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersionExperimentTreatments | [optional] [enum: appIcon, appIconName, appStoreVersionExperiment, appStoreVersionExperimentTreatmentLocalizations, appStoreVersionExperimentV2, name, promotedDate] |
| **limitAppStoreVersionExperimentTreatments** | **Integer**| maximum number of related appStoreVersionExperimentTreatments returned (when they are included) | [optional] |
| **limitControlVersions** | **Integer**| maximum number of related controlVersions returned (when they are included) | [optional] |

### Return type

[**AppStoreVersionExperimentV2Response**](AppStoreVersionExperimentV2Response.md)

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
| **200** | Single AppStoreVersionExperiment |  -  |


## appStoreVersionExperimentsV2UpdateInstance

> AppStoreVersionExperimentV2Response appStoreVersionExperimentsV2UpdateInstance(id, appStoreVersionExperimentV2UpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppStoreVersionExperimentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppStoreVersionExperimentsApi apiInstance = new AppStoreVersionExperimentsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        AppStoreVersionExperimentV2UpdateRequest appStoreVersionExperimentV2UpdateRequest = new AppStoreVersionExperimentV2UpdateRequest(); // AppStoreVersionExperimentV2UpdateRequest | AppStoreVersionExperiment representation
        try {
            AppStoreVersionExperimentV2Response result = apiInstance.appStoreVersionExperimentsV2UpdateInstance(id, appStoreVersionExperimentV2UpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppStoreVersionExperimentsApi#appStoreVersionExperimentsV2UpdateInstance");
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
| **appStoreVersionExperimentV2UpdateRequest** | [**AppStoreVersionExperimentV2UpdateRequest**](AppStoreVersionExperimentV2UpdateRequest.md)| AppStoreVersionExperiment representation | |

### Return type

[**AppStoreVersionExperimentV2Response**](AppStoreVersionExperimentV2Response.md)

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
| **200** | Single AppStoreVersionExperiment |  -  |
| **409** | Request entity error(s) |  -  |

