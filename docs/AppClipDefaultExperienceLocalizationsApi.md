# AppClipDefaultExperienceLocalizationsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**appClipDefaultExperienceLocalizationsAppClipHeaderImageGetToOneRelated**](AppClipDefaultExperienceLocalizationsApi.md#appClipDefaultExperienceLocalizationsAppClipHeaderImageGetToOneRelated) | **GET** /v1/appClipDefaultExperienceLocalizations/{id}/appClipHeaderImage |  |
| [**appClipDefaultExperienceLocalizationsCreateInstance**](AppClipDefaultExperienceLocalizationsApi.md#appClipDefaultExperienceLocalizationsCreateInstance) | **POST** /v1/appClipDefaultExperienceLocalizations |  |
| [**appClipDefaultExperienceLocalizationsDeleteInstance**](AppClipDefaultExperienceLocalizationsApi.md#appClipDefaultExperienceLocalizationsDeleteInstance) | **DELETE** /v1/appClipDefaultExperienceLocalizations/{id} |  |
| [**appClipDefaultExperienceLocalizationsGetInstance**](AppClipDefaultExperienceLocalizationsApi.md#appClipDefaultExperienceLocalizationsGetInstance) | **GET** /v1/appClipDefaultExperienceLocalizations/{id} |  |
| [**appClipDefaultExperienceLocalizationsUpdateInstance**](AppClipDefaultExperienceLocalizationsApi.md#appClipDefaultExperienceLocalizationsUpdateInstance) | **PATCH** /v1/appClipDefaultExperienceLocalizations/{id} |  |



## appClipDefaultExperienceLocalizationsAppClipHeaderImageGetToOneRelated

> AppClipHeaderImageResponse appClipDefaultExperienceLocalizationsAppClipHeaderImageGetToOneRelated(id, fieldsAppClipHeaderImages, fieldsAppClipDefaultExperienceLocalizations, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppClipDefaultExperienceLocalizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppClipDefaultExperienceLocalizationsApi apiInstance = new AppClipDefaultExperienceLocalizationsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAppClipHeaderImages = Arrays.asList(); // List<String> | the fields to include for returned resources of type appClipHeaderImages
        List<String> fieldsAppClipDefaultExperienceLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type appClipDefaultExperienceLocalizations
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            AppClipHeaderImageResponse result = apiInstance.appClipDefaultExperienceLocalizationsAppClipHeaderImageGetToOneRelated(id, fieldsAppClipHeaderImages, fieldsAppClipDefaultExperienceLocalizations, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppClipDefaultExperienceLocalizationsApi#appClipDefaultExperienceLocalizationsAppClipHeaderImageGetToOneRelated");
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
| **fieldsAppClipHeaderImages** | **List&lt;String&gt;**| the fields to include for returned resources of type appClipHeaderImages | [optional] [enum: appClipDefaultExperienceLocalization, assetDeliveryState, fileName, fileSize, imageAsset, sourceFileChecksum, uploadOperations, uploaded] |
| **fieldsAppClipDefaultExperienceLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type appClipDefaultExperienceLocalizations | [optional] [enum: appClipDefaultExperience, appClipHeaderImage, locale, subtitle] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: appClipDefaultExperienceLocalization] |

### Return type

[**AppClipHeaderImageResponse**](AppClipHeaderImageResponse.md)

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
| **200** | Single AppClipHeaderImage |  -  |


## appClipDefaultExperienceLocalizationsCreateInstance

> AppClipDefaultExperienceLocalizationResponse appClipDefaultExperienceLocalizationsCreateInstance(appClipDefaultExperienceLocalizationCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppClipDefaultExperienceLocalizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppClipDefaultExperienceLocalizationsApi apiInstance = new AppClipDefaultExperienceLocalizationsApi(defaultClient);
        AppClipDefaultExperienceLocalizationCreateRequest appClipDefaultExperienceLocalizationCreateRequest = new AppClipDefaultExperienceLocalizationCreateRequest(); // AppClipDefaultExperienceLocalizationCreateRequest | AppClipDefaultExperienceLocalization representation
        try {
            AppClipDefaultExperienceLocalizationResponse result = apiInstance.appClipDefaultExperienceLocalizationsCreateInstance(appClipDefaultExperienceLocalizationCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppClipDefaultExperienceLocalizationsApi#appClipDefaultExperienceLocalizationsCreateInstance");
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
| **appClipDefaultExperienceLocalizationCreateRequest** | [**AppClipDefaultExperienceLocalizationCreateRequest**](AppClipDefaultExperienceLocalizationCreateRequest.md)| AppClipDefaultExperienceLocalization representation | |

### Return type

[**AppClipDefaultExperienceLocalizationResponse**](AppClipDefaultExperienceLocalizationResponse.md)

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
| **201** | Single AppClipDefaultExperienceLocalization |  -  |
| **409** | Request entity error(s) |  -  |


## appClipDefaultExperienceLocalizationsDeleteInstance

> appClipDefaultExperienceLocalizationsDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppClipDefaultExperienceLocalizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppClipDefaultExperienceLocalizationsApi apiInstance = new AppClipDefaultExperienceLocalizationsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.appClipDefaultExperienceLocalizationsDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppClipDefaultExperienceLocalizationsApi#appClipDefaultExperienceLocalizationsDeleteInstance");
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


## appClipDefaultExperienceLocalizationsGetInstance

> AppClipDefaultExperienceLocalizationResponse appClipDefaultExperienceLocalizationsGetInstance(id, fieldsAppClipDefaultExperienceLocalizations, include, fieldsAppClipHeaderImages)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppClipDefaultExperienceLocalizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppClipDefaultExperienceLocalizationsApi apiInstance = new AppClipDefaultExperienceLocalizationsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAppClipDefaultExperienceLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type appClipDefaultExperienceLocalizations
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsAppClipHeaderImages = Arrays.asList(); // List<String> | the fields to include for returned resources of type appClipHeaderImages
        try {
            AppClipDefaultExperienceLocalizationResponse result = apiInstance.appClipDefaultExperienceLocalizationsGetInstance(id, fieldsAppClipDefaultExperienceLocalizations, include, fieldsAppClipHeaderImages);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppClipDefaultExperienceLocalizationsApi#appClipDefaultExperienceLocalizationsGetInstance");
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
| **fieldsAppClipDefaultExperienceLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type appClipDefaultExperienceLocalizations | [optional] [enum: appClipDefaultExperience, appClipHeaderImage, locale, subtitle] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: appClipDefaultExperience, appClipHeaderImage] |
| **fieldsAppClipHeaderImages** | **List&lt;String&gt;**| the fields to include for returned resources of type appClipHeaderImages | [optional] [enum: appClipDefaultExperienceLocalization, assetDeliveryState, fileName, fileSize, imageAsset, sourceFileChecksum, uploadOperations, uploaded] |

### Return type

[**AppClipDefaultExperienceLocalizationResponse**](AppClipDefaultExperienceLocalizationResponse.md)

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
| **200** | Single AppClipDefaultExperienceLocalization |  -  |


## appClipDefaultExperienceLocalizationsUpdateInstance

> AppClipDefaultExperienceLocalizationResponse appClipDefaultExperienceLocalizationsUpdateInstance(id, appClipDefaultExperienceLocalizationUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppClipDefaultExperienceLocalizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppClipDefaultExperienceLocalizationsApi apiInstance = new AppClipDefaultExperienceLocalizationsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        AppClipDefaultExperienceLocalizationUpdateRequest appClipDefaultExperienceLocalizationUpdateRequest = new AppClipDefaultExperienceLocalizationUpdateRequest(); // AppClipDefaultExperienceLocalizationUpdateRequest | AppClipDefaultExperienceLocalization representation
        try {
            AppClipDefaultExperienceLocalizationResponse result = apiInstance.appClipDefaultExperienceLocalizationsUpdateInstance(id, appClipDefaultExperienceLocalizationUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppClipDefaultExperienceLocalizationsApi#appClipDefaultExperienceLocalizationsUpdateInstance");
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
| **appClipDefaultExperienceLocalizationUpdateRequest** | [**AppClipDefaultExperienceLocalizationUpdateRequest**](AppClipDefaultExperienceLocalizationUpdateRequest.md)| AppClipDefaultExperienceLocalization representation | |

### Return type

[**AppClipDefaultExperienceLocalizationResponse**](AppClipDefaultExperienceLocalizationResponse.md)

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
| **200** | Single AppClipDefaultExperienceLocalization |  -  |
| **409** | Request entity error(s) |  -  |

