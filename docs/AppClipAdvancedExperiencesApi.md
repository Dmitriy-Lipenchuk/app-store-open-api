# AppClipAdvancedExperiencesApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**appClipAdvancedExperiencesCreateInstance**](AppClipAdvancedExperiencesApi.md#appClipAdvancedExperiencesCreateInstance) | **POST** /v1/appClipAdvancedExperiences |  |
| [**appClipAdvancedExperiencesGetInstance**](AppClipAdvancedExperiencesApi.md#appClipAdvancedExperiencesGetInstance) | **GET** /v1/appClipAdvancedExperiences/{id} |  |
| [**appClipAdvancedExperiencesUpdateInstance**](AppClipAdvancedExperiencesApi.md#appClipAdvancedExperiencesUpdateInstance) | **PATCH** /v1/appClipAdvancedExperiences/{id} |  |



## appClipAdvancedExperiencesCreateInstance

> AppClipAdvancedExperienceResponse appClipAdvancedExperiencesCreateInstance(appClipAdvancedExperienceCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppClipAdvancedExperiencesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppClipAdvancedExperiencesApi apiInstance = new AppClipAdvancedExperiencesApi(defaultClient);
        AppClipAdvancedExperienceCreateRequest appClipAdvancedExperienceCreateRequest = new AppClipAdvancedExperienceCreateRequest(); // AppClipAdvancedExperienceCreateRequest | AppClipAdvancedExperience representation
        try {
            AppClipAdvancedExperienceResponse result = apiInstance.appClipAdvancedExperiencesCreateInstance(appClipAdvancedExperienceCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppClipAdvancedExperiencesApi#appClipAdvancedExperiencesCreateInstance");
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
| **appClipAdvancedExperienceCreateRequest** | [**AppClipAdvancedExperienceCreateRequest**](AppClipAdvancedExperienceCreateRequest.md)| AppClipAdvancedExperience representation | |

### Return type

[**AppClipAdvancedExperienceResponse**](AppClipAdvancedExperienceResponse.md)

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
| **201** | Single AppClipAdvancedExperience |  -  |
| **409** | Request entity error(s) |  -  |


## appClipAdvancedExperiencesGetInstance

> AppClipAdvancedExperienceResponse appClipAdvancedExperiencesGetInstance(id, fieldsAppClipAdvancedExperiences, include, limitLocalizations)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppClipAdvancedExperiencesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppClipAdvancedExperiencesApi apiInstance = new AppClipAdvancedExperiencesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAppClipAdvancedExperiences = Arrays.asList(); // List<String> | the fields to include for returned resources of type appClipAdvancedExperiences
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        Integer limitLocalizations = 56; // Integer | maximum number of related localizations returned (when they are included)
        try {
            AppClipAdvancedExperienceResponse result = apiInstance.appClipAdvancedExperiencesGetInstance(id, fieldsAppClipAdvancedExperiences, include, limitLocalizations);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppClipAdvancedExperiencesApi#appClipAdvancedExperiencesGetInstance");
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
| **fieldsAppClipAdvancedExperiences** | **List&lt;String&gt;**| the fields to include for returned resources of type appClipAdvancedExperiences | [optional] [enum: action, appClip, businessCategory, defaultLanguage, headerImage, isPoweredBy, link, localizations, place, placeStatus, removed, status, version] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: appClip, headerImage, localizations] |
| **limitLocalizations** | **Integer**| maximum number of related localizations returned (when they are included) | [optional] |

### Return type

[**AppClipAdvancedExperienceResponse**](AppClipAdvancedExperienceResponse.md)

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
| **200** | Single AppClipAdvancedExperience |  -  |


## appClipAdvancedExperiencesUpdateInstance

> AppClipAdvancedExperienceResponse appClipAdvancedExperiencesUpdateInstance(id, appClipAdvancedExperienceUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppClipAdvancedExperiencesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppClipAdvancedExperiencesApi apiInstance = new AppClipAdvancedExperiencesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        AppClipAdvancedExperienceUpdateRequest appClipAdvancedExperienceUpdateRequest = new AppClipAdvancedExperienceUpdateRequest(); // AppClipAdvancedExperienceUpdateRequest | AppClipAdvancedExperience representation
        try {
            AppClipAdvancedExperienceResponse result = apiInstance.appClipAdvancedExperiencesUpdateInstance(id, appClipAdvancedExperienceUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppClipAdvancedExperiencesApi#appClipAdvancedExperiencesUpdateInstance");
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
| **appClipAdvancedExperienceUpdateRequest** | [**AppClipAdvancedExperienceUpdateRequest**](AppClipAdvancedExperienceUpdateRequest.md)| AppClipAdvancedExperience representation | |

### Return type

[**AppClipAdvancedExperienceResponse**](AppClipAdvancedExperienceResponse.md)

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
| **200** | Single AppClipAdvancedExperience |  -  |
| **409** | Request entity error(s) |  -  |

