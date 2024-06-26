# AppCustomProductPagesApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**appCustomProductPagesAppCustomProductPageVersionsGetToManyRelated**](AppCustomProductPagesApi.md#appCustomProductPagesAppCustomProductPageVersionsGetToManyRelated) | **GET** /v1/appCustomProductPages/{id}/appCustomProductPageVersions |  |
| [**appCustomProductPagesCreateInstance**](AppCustomProductPagesApi.md#appCustomProductPagesCreateInstance) | **POST** /v1/appCustomProductPages |  |
| [**appCustomProductPagesDeleteInstance**](AppCustomProductPagesApi.md#appCustomProductPagesDeleteInstance) | **DELETE** /v1/appCustomProductPages/{id} |  |
| [**appCustomProductPagesGetInstance**](AppCustomProductPagesApi.md#appCustomProductPagesGetInstance) | **GET** /v1/appCustomProductPages/{id} |  |
| [**appCustomProductPagesUpdateInstance**](AppCustomProductPagesApi.md#appCustomProductPagesUpdateInstance) | **PATCH** /v1/appCustomProductPages/{id} |  |



## appCustomProductPagesAppCustomProductPageVersionsGetToManyRelated

> AppCustomProductPageVersionsResponse appCustomProductPagesAppCustomProductPageVersionsGetToManyRelated(id, filterState, fieldsAppCustomProductPageLocalizations, fieldsAppCustomProductPageVersions, fieldsAppCustomProductPages, limit, limitAppCustomProductPageLocalizations, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppCustomProductPagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppCustomProductPagesApi apiInstance = new AppCustomProductPagesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> filterState = Arrays.asList(); // List<String> | filter by attribute 'state'
        List<String> fieldsAppCustomProductPageLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type appCustomProductPageLocalizations
        List<String> fieldsAppCustomProductPageVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type appCustomProductPageVersions
        List<String> fieldsAppCustomProductPages = Arrays.asList(); // List<String> | the fields to include for returned resources of type appCustomProductPages
        Integer limit = 56; // Integer | maximum resources per page
        Integer limitAppCustomProductPageLocalizations = 56; // Integer | maximum number of related appCustomProductPageLocalizations returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            AppCustomProductPageVersionsResponse result = apiInstance.appCustomProductPagesAppCustomProductPageVersionsGetToManyRelated(id, filterState, fieldsAppCustomProductPageLocalizations, fieldsAppCustomProductPageVersions, fieldsAppCustomProductPages, limit, limitAppCustomProductPageLocalizations, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppCustomProductPagesApi#appCustomProductPagesAppCustomProductPageVersionsGetToManyRelated");
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
| **filterState** | **List&lt;String&gt;**| filter by attribute &#39;state&#39; | [optional] [enum: PREPARE_FOR_SUBMISSION, READY_FOR_REVIEW, WAITING_FOR_REVIEW, IN_REVIEW, ACCEPTED, APPROVED, REPLACED_WITH_NEW_VERSION, REJECTED] |
| **fieldsAppCustomProductPageLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type appCustomProductPageLocalizations | [optional] [enum: appCustomProductPageVersion, appPreviewSets, appScreenshotSets, locale, promotionalText] |
| **fieldsAppCustomProductPageVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type appCustomProductPageVersions | [optional] [enum: appCustomProductPage, appCustomProductPageLocalizations, deepLink, state, version] |
| **fieldsAppCustomProductPages** | **List&lt;String&gt;**| the fields to include for returned resources of type appCustomProductPages | [optional] [enum: app, appCustomProductPageVersions, appStoreVersionTemplate, customProductPageTemplate, name, url, visible] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **limitAppCustomProductPageLocalizations** | **Integer**| maximum number of related appCustomProductPageLocalizations returned (when they are included) | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: appCustomProductPage, appCustomProductPageLocalizations] |

### Return type

[**AppCustomProductPageVersionsResponse**](AppCustomProductPageVersionsResponse.md)

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
| **200** | List of AppCustomProductPageVersions |  -  |


## appCustomProductPagesCreateInstance

> AppCustomProductPageResponse appCustomProductPagesCreateInstance(appCustomProductPageCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppCustomProductPagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppCustomProductPagesApi apiInstance = new AppCustomProductPagesApi(defaultClient);
        AppCustomProductPageCreateRequest appCustomProductPageCreateRequest = new AppCustomProductPageCreateRequest(); // AppCustomProductPageCreateRequest | AppCustomProductPage representation
        try {
            AppCustomProductPageResponse result = apiInstance.appCustomProductPagesCreateInstance(appCustomProductPageCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppCustomProductPagesApi#appCustomProductPagesCreateInstance");
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
| **appCustomProductPageCreateRequest** | [**AppCustomProductPageCreateRequest**](AppCustomProductPageCreateRequest.md)| AppCustomProductPage representation | |

### Return type

[**AppCustomProductPageResponse**](AppCustomProductPageResponse.md)

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
| **201** | Single AppCustomProductPage |  -  |
| **409** | Request entity error(s) |  -  |


## appCustomProductPagesDeleteInstance

> appCustomProductPagesDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppCustomProductPagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppCustomProductPagesApi apiInstance = new AppCustomProductPagesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.appCustomProductPagesDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppCustomProductPagesApi#appCustomProductPagesDeleteInstance");
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


## appCustomProductPagesGetInstance

> AppCustomProductPageResponse appCustomProductPagesGetInstance(id, fieldsAppCustomProductPages, include, fieldsAppCustomProductPageVersions, limitAppCustomProductPageVersions)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppCustomProductPagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppCustomProductPagesApi apiInstance = new AppCustomProductPagesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAppCustomProductPages = Arrays.asList(); // List<String> | the fields to include for returned resources of type appCustomProductPages
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsAppCustomProductPageVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type appCustomProductPageVersions
        Integer limitAppCustomProductPageVersions = 56; // Integer | maximum number of related appCustomProductPageVersions returned (when they are included)
        try {
            AppCustomProductPageResponse result = apiInstance.appCustomProductPagesGetInstance(id, fieldsAppCustomProductPages, include, fieldsAppCustomProductPageVersions, limitAppCustomProductPageVersions);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppCustomProductPagesApi#appCustomProductPagesGetInstance");
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
| **fieldsAppCustomProductPages** | **List&lt;String&gt;**| the fields to include for returned resources of type appCustomProductPages | [optional] [enum: app, appCustomProductPageVersions, appStoreVersionTemplate, customProductPageTemplate, name, url, visible] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: app, appCustomProductPageVersions] |
| **fieldsAppCustomProductPageVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type appCustomProductPageVersions | [optional] [enum: appCustomProductPage, appCustomProductPageLocalizations, deepLink, state, version] |
| **limitAppCustomProductPageVersions** | **Integer**| maximum number of related appCustomProductPageVersions returned (when they are included) | [optional] |

### Return type

[**AppCustomProductPageResponse**](AppCustomProductPageResponse.md)

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
| **200** | Single AppCustomProductPage |  -  |


## appCustomProductPagesUpdateInstance

> AppCustomProductPageResponse appCustomProductPagesUpdateInstance(id, appCustomProductPageUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppCustomProductPagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppCustomProductPagesApi apiInstance = new AppCustomProductPagesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        AppCustomProductPageUpdateRequest appCustomProductPageUpdateRequest = new AppCustomProductPageUpdateRequest(); // AppCustomProductPageUpdateRequest | AppCustomProductPage representation
        try {
            AppCustomProductPageResponse result = apiInstance.appCustomProductPagesUpdateInstance(id, appCustomProductPageUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppCustomProductPagesApi#appCustomProductPagesUpdateInstance");
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
| **appCustomProductPageUpdateRequest** | [**AppCustomProductPageUpdateRequest**](AppCustomProductPageUpdateRequest.md)| AppCustomProductPage representation | |

### Return type

[**AppCustomProductPageResponse**](AppCustomProductPageResponse.md)

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
| **200** | Single AppCustomProductPage |  -  |
| **409** | Request entity error(s) |  -  |

