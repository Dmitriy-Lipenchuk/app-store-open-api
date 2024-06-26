# InAppPurchaseLocalizationsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**inAppPurchaseLocalizationsCreateInstance**](InAppPurchaseLocalizationsApi.md#inAppPurchaseLocalizationsCreateInstance) | **POST** /v1/inAppPurchaseLocalizations |  |
| [**inAppPurchaseLocalizationsDeleteInstance**](InAppPurchaseLocalizationsApi.md#inAppPurchaseLocalizationsDeleteInstance) | **DELETE** /v1/inAppPurchaseLocalizations/{id} |  |
| [**inAppPurchaseLocalizationsGetInstance**](InAppPurchaseLocalizationsApi.md#inAppPurchaseLocalizationsGetInstance) | **GET** /v1/inAppPurchaseLocalizations/{id} |  |
| [**inAppPurchaseLocalizationsUpdateInstance**](InAppPurchaseLocalizationsApi.md#inAppPurchaseLocalizationsUpdateInstance) | **PATCH** /v1/inAppPurchaseLocalizations/{id} |  |



## inAppPurchaseLocalizationsCreateInstance

> InAppPurchaseLocalizationResponse inAppPurchaseLocalizationsCreateInstance(inAppPurchaseLocalizationCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.InAppPurchaseLocalizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        InAppPurchaseLocalizationsApi apiInstance = new InAppPurchaseLocalizationsApi(defaultClient);
        InAppPurchaseLocalizationCreateRequest inAppPurchaseLocalizationCreateRequest = new InAppPurchaseLocalizationCreateRequest(); // InAppPurchaseLocalizationCreateRequest | InAppPurchaseLocalization representation
        try {
            InAppPurchaseLocalizationResponse result = apiInstance.inAppPurchaseLocalizationsCreateInstance(inAppPurchaseLocalizationCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InAppPurchaseLocalizationsApi#inAppPurchaseLocalizationsCreateInstance");
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
| **inAppPurchaseLocalizationCreateRequest** | [**InAppPurchaseLocalizationCreateRequest**](InAppPurchaseLocalizationCreateRequest.md)| InAppPurchaseLocalization representation | |

### Return type

[**InAppPurchaseLocalizationResponse**](InAppPurchaseLocalizationResponse.md)

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
| **201** | Single InAppPurchaseLocalization |  -  |
| **409** | Request entity error(s) |  -  |


## inAppPurchaseLocalizationsDeleteInstance

> inAppPurchaseLocalizationsDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.InAppPurchaseLocalizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        InAppPurchaseLocalizationsApi apiInstance = new InAppPurchaseLocalizationsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.inAppPurchaseLocalizationsDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling InAppPurchaseLocalizationsApi#inAppPurchaseLocalizationsDeleteInstance");
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


## inAppPurchaseLocalizationsGetInstance

> InAppPurchaseLocalizationResponse inAppPurchaseLocalizationsGetInstance(id, fieldsInAppPurchaseLocalizations, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.InAppPurchaseLocalizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        InAppPurchaseLocalizationsApi apiInstance = new InAppPurchaseLocalizationsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsInAppPurchaseLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type inAppPurchaseLocalizations
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            InAppPurchaseLocalizationResponse result = apiInstance.inAppPurchaseLocalizationsGetInstance(id, fieldsInAppPurchaseLocalizations, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InAppPurchaseLocalizationsApi#inAppPurchaseLocalizationsGetInstance");
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
| **fieldsInAppPurchaseLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type inAppPurchaseLocalizations | [optional] [enum: description, inAppPurchaseV2, locale, name, state] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: inAppPurchaseV2] |

### Return type

[**InAppPurchaseLocalizationResponse**](InAppPurchaseLocalizationResponse.md)

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
| **200** | Single InAppPurchaseLocalization |  -  |


## inAppPurchaseLocalizationsUpdateInstance

> InAppPurchaseLocalizationResponse inAppPurchaseLocalizationsUpdateInstance(id, inAppPurchaseLocalizationUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.InAppPurchaseLocalizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        InAppPurchaseLocalizationsApi apiInstance = new InAppPurchaseLocalizationsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        InAppPurchaseLocalizationUpdateRequest inAppPurchaseLocalizationUpdateRequest = new InAppPurchaseLocalizationUpdateRequest(); // InAppPurchaseLocalizationUpdateRequest | InAppPurchaseLocalization representation
        try {
            InAppPurchaseLocalizationResponse result = apiInstance.inAppPurchaseLocalizationsUpdateInstance(id, inAppPurchaseLocalizationUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InAppPurchaseLocalizationsApi#inAppPurchaseLocalizationsUpdateInstance");
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
| **inAppPurchaseLocalizationUpdateRequest** | [**InAppPurchaseLocalizationUpdateRequest**](InAppPurchaseLocalizationUpdateRequest.md)| InAppPurchaseLocalization representation | |

### Return type

[**InAppPurchaseLocalizationResponse**](InAppPurchaseLocalizationResponse.md)

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
| **200** | Single InAppPurchaseLocalization |  -  |
| **409** | Request entity error(s) |  -  |

