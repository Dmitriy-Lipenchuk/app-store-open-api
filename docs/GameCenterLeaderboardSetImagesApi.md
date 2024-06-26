# GameCenterLeaderboardSetImagesApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**gameCenterLeaderboardSetImagesCreateInstance**](GameCenterLeaderboardSetImagesApi.md#gameCenterLeaderboardSetImagesCreateInstance) | **POST** /v1/gameCenterLeaderboardSetImages |  |
| [**gameCenterLeaderboardSetImagesDeleteInstance**](GameCenterLeaderboardSetImagesApi.md#gameCenterLeaderboardSetImagesDeleteInstance) | **DELETE** /v1/gameCenterLeaderboardSetImages/{id} |  |
| [**gameCenterLeaderboardSetImagesGetInstance**](GameCenterLeaderboardSetImagesApi.md#gameCenterLeaderboardSetImagesGetInstance) | **GET** /v1/gameCenterLeaderboardSetImages/{id} |  |
| [**gameCenterLeaderboardSetImagesUpdateInstance**](GameCenterLeaderboardSetImagesApi.md#gameCenterLeaderboardSetImagesUpdateInstance) | **PATCH** /v1/gameCenterLeaderboardSetImages/{id} |  |



## gameCenterLeaderboardSetImagesCreateInstance

> GameCenterLeaderboardSetImageResponse gameCenterLeaderboardSetImagesCreateInstance(gameCenterLeaderboardSetImageCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardSetImagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardSetImagesApi apiInstance = new GameCenterLeaderboardSetImagesApi(defaultClient);
        GameCenterLeaderboardSetImageCreateRequest gameCenterLeaderboardSetImageCreateRequest = new GameCenterLeaderboardSetImageCreateRequest(); // GameCenterLeaderboardSetImageCreateRequest | GameCenterLeaderboardSetImage representation
        try {
            GameCenterLeaderboardSetImageResponse result = apiInstance.gameCenterLeaderboardSetImagesCreateInstance(gameCenterLeaderboardSetImageCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardSetImagesApi#gameCenterLeaderboardSetImagesCreateInstance");
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
| **gameCenterLeaderboardSetImageCreateRequest** | [**GameCenterLeaderboardSetImageCreateRequest**](GameCenterLeaderboardSetImageCreateRequest.md)| GameCenterLeaderboardSetImage representation | |

### Return type

[**GameCenterLeaderboardSetImageResponse**](GameCenterLeaderboardSetImageResponse.md)

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
| **201** | Single GameCenterLeaderboardSetImage |  -  |
| **409** | Request entity error(s) |  -  |


## gameCenterLeaderboardSetImagesDeleteInstance

> gameCenterLeaderboardSetImagesDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardSetImagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardSetImagesApi apiInstance = new GameCenterLeaderboardSetImagesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.gameCenterLeaderboardSetImagesDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardSetImagesApi#gameCenterLeaderboardSetImagesDeleteInstance");
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


## gameCenterLeaderboardSetImagesGetInstance

> GameCenterLeaderboardSetImageResponse gameCenterLeaderboardSetImagesGetInstance(id, fieldsGameCenterLeaderboardSetImages, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardSetImagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardSetImagesApi apiInstance = new GameCenterLeaderboardSetImagesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsGameCenterLeaderboardSetImages = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardSetImages
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            GameCenterLeaderboardSetImageResponse result = apiInstance.gameCenterLeaderboardSetImagesGetInstance(id, fieldsGameCenterLeaderboardSetImages, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardSetImagesApi#gameCenterLeaderboardSetImagesGetInstance");
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


## gameCenterLeaderboardSetImagesUpdateInstance

> GameCenterLeaderboardSetImageResponse gameCenterLeaderboardSetImagesUpdateInstance(id, gameCenterLeaderboardSetImageUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardSetImagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardSetImagesApi apiInstance = new GameCenterLeaderboardSetImagesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        GameCenterLeaderboardSetImageUpdateRequest gameCenterLeaderboardSetImageUpdateRequest = new GameCenterLeaderboardSetImageUpdateRequest(); // GameCenterLeaderboardSetImageUpdateRequest | GameCenterLeaderboardSetImage representation
        try {
            GameCenterLeaderboardSetImageResponse result = apiInstance.gameCenterLeaderboardSetImagesUpdateInstance(id, gameCenterLeaderboardSetImageUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardSetImagesApi#gameCenterLeaderboardSetImagesUpdateInstance");
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
| **gameCenterLeaderboardSetImageUpdateRequest** | [**GameCenterLeaderboardSetImageUpdateRequest**](GameCenterLeaderboardSetImageUpdateRequest.md)| GameCenterLeaderboardSetImage representation | |

### Return type

[**GameCenterLeaderboardSetImageResponse**](GameCenterLeaderboardSetImageResponse.md)

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
| **200** | Single GameCenterLeaderboardSetImage |  -  |
| **409** | Request entity error(s) |  -  |

