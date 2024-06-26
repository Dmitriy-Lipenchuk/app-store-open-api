# GameCenterLeaderboardLocalizationsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**gameCenterLeaderboardLocalizationsCreateInstance**](GameCenterLeaderboardLocalizationsApi.md#gameCenterLeaderboardLocalizationsCreateInstance) | **POST** /v1/gameCenterLeaderboardLocalizations |  |
| [**gameCenterLeaderboardLocalizationsDeleteInstance**](GameCenterLeaderboardLocalizationsApi.md#gameCenterLeaderboardLocalizationsDeleteInstance) | **DELETE** /v1/gameCenterLeaderboardLocalizations/{id} |  |
| [**gameCenterLeaderboardLocalizationsGameCenterLeaderboardImageGetToOneRelated**](GameCenterLeaderboardLocalizationsApi.md#gameCenterLeaderboardLocalizationsGameCenterLeaderboardImageGetToOneRelated) | **GET** /v1/gameCenterLeaderboardLocalizations/{id}/gameCenterLeaderboardImage |  |
| [**gameCenterLeaderboardLocalizationsGetInstance**](GameCenterLeaderboardLocalizationsApi.md#gameCenterLeaderboardLocalizationsGetInstance) | **GET** /v1/gameCenterLeaderboardLocalizations/{id} |  |
| [**gameCenterLeaderboardLocalizationsUpdateInstance**](GameCenterLeaderboardLocalizationsApi.md#gameCenterLeaderboardLocalizationsUpdateInstance) | **PATCH** /v1/gameCenterLeaderboardLocalizations/{id} |  |



## gameCenterLeaderboardLocalizationsCreateInstance

> GameCenterLeaderboardLocalizationResponse gameCenterLeaderboardLocalizationsCreateInstance(gameCenterLeaderboardLocalizationCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardLocalizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardLocalizationsApi apiInstance = new GameCenterLeaderboardLocalizationsApi(defaultClient);
        GameCenterLeaderboardLocalizationCreateRequest gameCenterLeaderboardLocalizationCreateRequest = new GameCenterLeaderboardLocalizationCreateRequest(); // GameCenterLeaderboardLocalizationCreateRequest | GameCenterLeaderboardLocalization representation
        try {
            GameCenterLeaderboardLocalizationResponse result = apiInstance.gameCenterLeaderboardLocalizationsCreateInstance(gameCenterLeaderboardLocalizationCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardLocalizationsApi#gameCenterLeaderboardLocalizationsCreateInstance");
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
| **gameCenterLeaderboardLocalizationCreateRequest** | [**GameCenterLeaderboardLocalizationCreateRequest**](GameCenterLeaderboardLocalizationCreateRequest.md)| GameCenterLeaderboardLocalization representation | |

### Return type

[**GameCenterLeaderboardLocalizationResponse**](GameCenterLeaderboardLocalizationResponse.md)

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
| **201** | Single GameCenterLeaderboardLocalization |  -  |
| **409** | Request entity error(s) |  -  |


## gameCenterLeaderboardLocalizationsDeleteInstance

> gameCenterLeaderboardLocalizationsDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardLocalizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardLocalizationsApi apiInstance = new GameCenterLeaderboardLocalizationsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.gameCenterLeaderboardLocalizationsDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardLocalizationsApi#gameCenterLeaderboardLocalizationsDeleteInstance");
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


## gameCenterLeaderboardLocalizationsGameCenterLeaderboardImageGetToOneRelated

> GameCenterLeaderboardImageResponse gameCenterLeaderboardLocalizationsGameCenterLeaderboardImageGetToOneRelated(id, fieldsGameCenterLeaderboardImages, fieldsGameCenterLeaderboardLocalizations, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardLocalizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardLocalizationsApi apiInstance = new GameCenterLeaderboardLocalizationsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsGameCenterLeaderboardImages = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardImages
        List<String> fieldsGameCenterLeaderboardLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardLocalizations
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            GameCenterLeaderboardImageResponse result = apiInstance.gameCenterLeaderboardLocalizationsGameCenterLeaderboardImageGetToOneRelated(id, fieldsGameCenterLeaderboardImages, fieldsGameCenterLeaderboardLocalizations, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardLocalizationsApi#gameCenterLeaderboardLocalizationsGameCenterLeaderboardImageGetToOneRelated");
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
| **fieldsGameCenterLeaderboardImages** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboardImages | [optional] [enum: assetDeliveryState, fileName, fileSize, gameCenterLeaderboardLocalization, imageAsset, uploadOperations, uploaded] |
| **fieldsGameCenterLeaderboardLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboardLocalizations | [optional] [enum: formatterOverride, formatterSuffix, formatterSuffixSingular, gameCenterLeaderboard, gameCenterLeaderboardImage, locale, name] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: gameCenterLeaderboardLocalization] |

### Return type

[**GameCenterLeaderboardImageResponse**](GameCenterLeaderboardImageResponse.md)

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
| **200** | Single GameCenterLeaderboardImage |  -  |


## gameCenterLeaderboardLocalizationsGetInstance

> GameCenterLeaderboardLocalizationResponse gameCenterLeaderboardLocalizationsGetInstance(id, fieldsGameCenterLeaderboardLocalizations, include, fieldsGameCenterLeaderboardImages)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardLocalizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardLocalizationsApi apiInstance = new GameCenterLeaderboardLocalizationsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsGameCenterLeaderboardLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardLocalizations
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsGameCenterLeaderboardImages = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardImages
        try {
            GameCenterLeaderboardLocalizationResponse result = apiInstance.gameCenterLeaderboardLocalizationsGetInstance(id, fieldsGameCenterLeaderboardLocalizations, include, fieldsGameCenterLeaderboardImages);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardLocalizationsApi#gameCenterLeaderboardLocalizationsGetInstance");
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
| **fieldsGameCenterLeaderboardLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboardLocalizations | [optional] [enum: formatterOverride, formatterSuffix, formatterSuffixSingular, gameCenterLeaderboard, gameCenterLeaderboardImage, locale, name] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: gameCenterLeaderboard, gameCenterLeaderboardImage] |
| **fieldsGameCenterLeaderboardImages** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboardImages | [optional] [enum: assetDeliveryState, fileName, fileSize, gameCenterLeaderboardLocalization, imageAsset, uploadOperations, uploaded] |

### Return type

[**GameCenterLeaderboardLocalizationResponse**](GameCenterLeaderboardLocalizationResponse.md)

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
| **200** | Single GameCenterLeaderboardLocalization |  -  |


## gameCenterLeaderboardLocalizationsUpdateInstance

> GameCenterLeaderboardLocalizationResponse gameCenterLeaderboardLocalizationsUpdateInstance(id, gameCenterLeaderboardLocalizationUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardLocalizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardLocalizationsApi apiInstance = new GameCenterLeaderboardLocalizationsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        GameCenterLeaderboardLocalizationUpdateRequest gameCenterLeaderboardLocalizationUpdateRequest = new GameCenterLeaderboardLocalizationUpdateRequest(); // GameCenterLeaderboardLocalizationUpdateRequest | GameCenterLeaderboardLocalization representation
        try {
            GameCenterLeaderboardLocalizationResponse result = apiInstance.gameCenterLeaderboardLocalizationsUpdateInstance(id, gameCenterLeaderboardLocalizationUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardLocalizationsApi#gameCenterLeaderboardLocalizationsUpdateInstance");
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
| **gameCenterLeaderboardLocalizationUpdateRequest** | [**GameCenterLeaderboardLocalizationUpdateRequest**](GameCenterLeaderboardLocalizationUpdateRequest.md)| GameCenterLeaderboardLocalization representation | |

### Return type

[**GameCenterLeaderboardLocalizationResponse**](GameCenterLeaderboardLocalizationResponse.md)

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
| **200** | Single GameCenterLeaderboardLocalization |  -  |
| **409** | Request entity error(s) |  -  |

