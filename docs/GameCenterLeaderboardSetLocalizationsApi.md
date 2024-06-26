# GameCenterLeaderboardSetLocalizationsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**gameCenterLeaderboardSetLocalizationsCreateInstance**](GameCenterLeaderboardSetLocalizationsApi.md#gameCenterLeaderboardSetLocalizationsCreateInstance) | **POST** /v1/gameCenterLeaderboardSetLocalizations |  |
| [**gameCenterLeaderboardSetLocalizationsDeleteInstance**](GameCenterLeaderboardSetLocalizationsApi.md#gameCenterLeaderboardSetLocalizationsDeleteInstance) | **DELETE** /v1/gameCenterLeaderboardSetLocalizations/{id} |  |
| [**gameCenterLeaderboardSetLocalizationsGameCenterLeaderboardSetImageGetToOneRelated**](GameCenterLeaderboardSetLocalizationsApi.md#gameCenterLeaderboardSetLocalizationsGameCenterLeaderboardSetImageGetToOneRelated) | **GET** /v1/gameCenterLeaderboardSetLocalizations/{id}/gameCenterLeaderboardSetImage |  |
| [**gameCenterLeaderboardSetLocalizationsGetInstance**](GameCenterLeaderboardSetLocalizationsApi.md#gameCenterLeaderboardSetLocalizationsGetInstance) | **GET** /v1/gameCenterLeaderboardSetLocalizations/{id} |  |
| [**gameCenterLeaderboardSetLocalizationsUpdateInstance**](GameCenterLeaderboardSetLocalizationsApi.md#gameCenterLeaderboardSetLocalizationsUpdateInstance) | **PATCH** /v1/gameCenterLeaderboardSetLocalizations/{id} |  |



## gameCenterLeaderboardSetLocalizationsCreateInstance

> GameCenterLeaderboardSetLocalizationResponse gameCenterLeaderboardSetLocalizationsCreateInstance(gameCenterLeaderboardSetLocalizationCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardSetLocalizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardSetLocalizationsApi apiInstance = new GameCenterLeaderboardSetLocalizationsApi(defaultClient);
        GameCenterLeaderboardSetLocalizationCreateRequest gameCenterLeaderboardSetLocalizationCreateRequest = new GameCenterLeaderboardSetLocalizationCreateRequest(); // GameCenterLeaderboardSetLocalizationCreateRequest | GameCenterLeaderboardSetLocalization representation
        try {
            GameCenterLeaderboardSetLocalizationResponse result = apiInstance.gameCenterLeaderboardSetLocalizationsCreateInstance(gameCenterLeaderboardSetLocalizationCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardSetLocalizationsApi#gameCenterLeaderboardSetLocalizationsCreateInstance");
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
| **gameCenterLeaderboardSetLocalizationCreateRequest** | [**GameCenterLeaderboardSetLocalizationCreateRequest**](GameCenterLeaderboardSetLocalizationCreateRequest.md)| GameCenterLeaderboardSetLocalization representation | |

### Return type

[**GameCenterLeaderboardSetLocalizationResponse**](GameCenterLeaderboardSetLocalizationResponse.md)

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
| **201** | Single GameCenterLeaderboardSetLocalization |  -  |
| **409** | Request entity error(s) |  -  |


## gameCenterLeaderboardSetLocalizationsDeleteInstance

> gameCenterLeaderboardSetLocalizationsDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardSetLocalizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardSetLocalizationsApi apiInstance = new GameCenterLeaderboardSetLocalizationsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.gameCenterLeaderboardSetLocalizationsDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardSetLocalizationsApi#gameCenterLeaderboardSetLocalizationsDeleteInstance");
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


## gameCenterLeaderboardSetLocalizationsGameCenterLeaderboardSetImageGetToOneRelated

> GameCenterLeaderboardSetImageResponse gameCenterLeaderboardSetLocalizationsGameCenterLeaderboardSetImageGetToOneRelated(id, fieldsGameCenterLeaderboardSetLocalizations, fieldsGameCenterLeaderboardSetImages, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardSetLocalizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardSetLocalizationsApi apiInstance = new GameCenterLeaderboardSetLocalizationsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsGameCenterLeaderboardSetLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardSetLocalizations
        List<String> fieldsGameCenterLeaderboardSetImages = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardSetImages
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            GameCenterLeaderboardSetImageResponse result = apiInstance.gameCenterLeaderboardSetLocalizationsGameCenterLeaderboardSetImageGetToOneRelated(id, fieldsGameCenterLeaderboardSetLocalizations, fieldsGameCenterLeaderboardSetImages, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardSetLocalizationsApi#gameCenterLeaderboardSetLocalizationsGameCenterLeaderboardSetImageGetToOneRelated");
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
| **fieldsGameCenterLeaderboardSetLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboardSetLocalizations | [optional] [enum: gameCenterLeaderboardSet, gameCenterLeaderboardSetImage, locale, name] |
| **fieldsGameCenterLeaderboardSetImages** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboardSetImages | [optional] [enum: assetDeliveryState, fileName, fileSize, gameCenterLeaderboardSetLocalization, imageAsset, uploadOperations, uploaded] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: gameCenterLeaderboardSetLocalization] |

### Return type

[**GameCenterLeaderboardSetImageResponse**](GameCenterLeaderboardSetImageResponse.md)

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
| **200** | Single GameCenterLeaderboardSetImage |  -  |


## gameCenterLeaderboardSetLocalizationsGetInstance

> GameCenterLeaderboardSetLocalizationResponse gameCenterLeaderboardSetLocalizationsGetInstance(id, fieldsGameCenterLeaderboardSetLocalizations, include, fieldsGameCenterLeaderboardSetImages)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardSetLocalizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardSetLocalizationsApi apiInstance = new GameCenterLeaderboardSetLocalizationsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsGameCenterLeaderboardSetLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardSetLocalizations
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsGameCenterLeaderboardSetImages = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardSetImages
        try {
            GameCenterLeaderboardSetLocalizationResponse result = apiInstance.gameCenterLeaderboardSetLocalizationsGetInstance(id, fieldsGameCenterLeaderboardSetLocalizations, include, fieldsGameCenterLeaderboardSetImages);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardSetLocalizationsApi#gameCenterLeaderboardSetLocalizationsGetInstance");
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
| **fieldsGameCenterLeaderboardSetLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboardSetLocalizations | [optional] [enum: gameCenterLeaderboardSet, gameCenterLeaderboardSetImage, locale, name] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: gameCenterLeaderboardSet, gameCenterLeaderboardSetImage] |
| **fieldsGameCenterLeaderboardSetImages** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboardSetImages | [optional] [enum: assetDeliveryState, fileName, fileSize, gameCenterLeaderboardSetLocalization, imageAsset, uploadOperations, uploaded] |

### Return type

[**GameCenterLeaderboardSetLocalizationResponse**](GameCenterLeaderboardSetLocalizationResponse.md)

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
| **200** | Single GameCenterLeaderboardSetLocalization |  -  |


## gameCenterLeaderboardSetLocalizationsUpdateInstance

> GameCenterLeaderboardSetLocalizationResponse gameCenterLeaderboardSetLocalizationsUpdateInstance(id, gameCenterLeaderboardSetLocalizationUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardSetLocalizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardSetLocalizationsApi apiInstance = new GameCenterLeaderboardSetLocalizationsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        GameCenterLeaderboardSetLocalizationUpdateRequest gameCenterLeaderboardSetLocalizationUpdateRequest = new GameCenterLeaderboardSetLocalizationUpdateRequest(); // GameCenterLeaderboardSetLocalizationUpdateRequest | GameCenterLeaderboardSetLocalization representation
        try {
            GameCenterLeaderboardSetLocalizationResponse result = apiInstance.gameCenterLeaderboardSetLocalizationsUpdateInstance(id, gameCenterLeaderboardSetLocalizationUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardSetLocalizationsApi#gameCenterLeaderboardSetLocalizationsUpdateInstance");
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
| **gameCenterLeaderboardSetLocalizationUpdateRequest** | [**GameCenterLeaderboardSetLocalizationUpdateRequest**](GameCenterLeaderboardSetLocalizationUpdateRequest.md)| GameCenterLeaderboardSetLocalization representation | |

### Return type

[**GameCenterLeaderboardSetLocalizationResponse**](GameCenterLeaderboardSetLocalizationResponse.md)

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
| **200** | Single GameCenterLeaderboardSetLocalization |  -  |
| **409** | Request entity error(s) |  -  |

