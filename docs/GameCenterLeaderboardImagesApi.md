# GameCenterLeaderboardImagesApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**gameCenterLeaderboardImagesCreateInstance**](GameCenterLeaderboardImagesApi.md#gameCenterLeaderboardImagesCreateInstance) | **POST** /v1/gameCenterLeaderboardImages |  |
| [**gameCenterLeaderboardImagesDeleteInstance**](GameCenterLeaderboardImagesApi.md#gameCenterLeaderboardImagesDeleteInstance) | **DELETE** /v1/gameCenterLeaderboardImages/{id} |  |
| [**gameCenterLeaderboardImagesGetInstance**](GameCenterLeaderboardImagesApi.md#gameCenterLeaderboardImagesGetInstance) | **GET** /v1/gameCenterLeaderboardImages/{id} |  |
| [**gameCenterLeaderboardImagesUpdateInstance**](GameCenterLeaderboardImagesApi.md#gameCenterLeaderboardImagesUpdateInstance) | **PATCH** /v1/gameCenterLeaderboardImages/{id} |  |



## gameCenterLeaderboardImagesCreateInstance

> GameCenterLeaderboardImageResponse gameCenterLeaderboardImagesCreateInstance(gameCenterLeaderboardImageCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardImagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardImagesApi apiInstance = new GameCenterLeaderboardImagesApi(defaultClient);
        GameCenterLeaderboardImageCreateRequest gameCenterLeaderboardImageCreateRequest = new GameCenterLeaderboardImageCreateRequest(); // GameCenterLeaderboardImageCreateRequest | GameCenterLeaderboardImage representation
        try {
            GameCenterLeaderboardImageResponse result = apiInstance.gameCenterLeaderboardImagesCreateInstance(gameCenterLeaderboardImageCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardImagesApi#gameCenterLeaderboardImagesCreateInstance");
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
| **gameCenterLeaderboardImageCreateRequest** | [**GameCenterLeaderboardImageCreateRequest**](GameCenterLeaderboardImageCreateRequest.md)| GameCenterLeaderboardImage representation | |

### Return type

[**GameCenterLeaderboardImageResponse**](GameCenterLeaderboardImageResponse.md)

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
| **201** | Single GameCenterLeaderboardImage |  -  |
| **409** | Request entity error(s) |  -  |


## gameCenterLeaderboardImagesDeleteInstance

> gameCenterLeaderboardImagesDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardImagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardImagesApi apiInstance = new GameCenterLeaderboardImagesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.gameCenterLeaderboardImagesDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardImagesApi#gameCenterLeaderboardImagesDeleteInstance");
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


## gameCenterLeaderboardImagesGetInstance

> GameCenterLeaderboardImageResponse gameCenterLeaderboardImagesGetInstance(id, fieldsGameCenterLeaderboardImages, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardImagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardImagesApi apiInstance = new GameCenterLeaderboardImagesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsGameCenterLeaderboardImages = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardImages
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            GameCenterLeaderboardImageResponse result = apiInstance.gameCenterLeaderboardImagesGetInstance(id, fieldsGameCenterLeaderboardImages, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardImagesApi#gameCenterLeaderboardImagesGetInstance");
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


## gameCenterLeaderboardImagesUpdateInstance

> GameCenterLeaderboardImageResponse gameCenterLeaderboardImagesUpdateInstance(id, gameCenterLeaderboardImageUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardImagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardImagesApi apiInstance = new GameCenterLeaderboardImagesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        GameCenterLeaderboardImageUpdateRequest gameCenterLeaderboardImageUpdateRequest = new GameCenterLeaderboardImageUpdateRequest(); // GameCenterLeaderboardImageUpdateRequest | GameCenterLeaderboardImage representation
        try {
            GameCenterLeaderboardImageResponse result = apiInstance.gameCenterLeaderboardImagesUpdateInstance(id, gameCenterLeaderboardImageUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardImagesApi#gameCenterLeaderboardImagesUpdateInstance");
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
| **gameCenterLeaderboardImageUpdateRequest** | [**GameCenterLeaderboardImageUpdateRequest**](GameCenterLeaderboardImageUpdateRequest.md)| GameCenterLeaderboardImage representation | |

### Return type

[**GameCenterLeaderboardImageResponse**](GameCenterLeaderboardImageResponse.md)

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
| **200** | Single GameCenterLeaderboardImage |  -  |
| **409** | Request entity error(s) |  -  |

