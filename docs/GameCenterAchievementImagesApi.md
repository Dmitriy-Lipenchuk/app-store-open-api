# GameCenterAchievementImagesApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**gameCenterAchievementImagesCreateInstance**](GameCenterAchievementImagesApi.md#gameCenterAchievementImagesCreateInstance) | **POST** /v1/gameCenterAchievementImages |  |
| [**gameCenterAchievementImagesDeleteInstance**](GameCenterAchievementImagesApi.md#gameCenterAchievementImagesDeleteInstance) | **DELETE** /v1/gameCenterAchievementImages/{id} |  |
| [**gameCenterAchievementImagesGetInstance**](GameCenterAchievementImagesApi.md#gameCenterAchievementImagesGetInstance) | **GET** /v1/gameCenterAchievementImages/{id} |  |
| [**gameCenterAchievementImagesUpdateInstance**](GameCenterAchievementImagesApi.md#gameCenterAchievementImagesUpdateInstance) | **PATCH** /v1/gameCenterAchievementImages/{id} |  |



## gameCenterAchievementImagesCreateInstance

> GameCenterAchievementImageResponse gameCenterAchievementImagesCreateInstance(gameCenterAchievementImageCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterAchievementImagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterAchievementImagesApi apiInstance = new GameCenterAchievementImagesApi(defaultClient);
        GameCenterAchievementImageCreateRequest gameCenterAchievementImageCreateRequest = new GameCenterAchievementImageCreateRequest(); // GameCenterAchievementImageCreateRequest | GameCenterAchievementImage representation
        try {
            GameCenterAchievementImageResponse result = apiInstance.gameCenterAchievementImagesCreateInstance(gameCenterAchievementImageCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterAchievementImagesApi#gameCenterAchievementImagesCreateInstance");
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
| **gameCenterAchievementImageCreateRequest** | [**GameCenterAchievementImageCreateRequest**](GameCenterAchievementImageCreateRequest.md)| GameCenterAchievementImage representation | |

### Return type

[**GameCenterAchievementImageResponse**](GameCenterAchievementImageResponse.md)

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
| **201** | Single GameCenterAchievementImage |  -  |
| **409** | Request entity error(s) |  -  |


## gameCenterAchievementImagesDeleteInstance

> gameCenterAchievementImagesDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterAchievementImagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterAchievementImagesApi apiInstance = new GameCenterAchievementImagesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.gameCenterAchievementImagesDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterAchievementImagesApi#gameCenterAchievementImagesDeleteInstance");
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


## gameCenterAchievementImagesGetInstance

> GameCenterAchievementImageResponse gameCenterAchievementImagesGetInstance(id, fieldsGameCenterAchievementImages, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterAchievementImagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterAchievementImagesApi apiInstance = new GameCenterAchievementImagesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsGameCenterAchievementImages = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterAchievementImages
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            GameCenterAchievementImageResponse result = apiInstance.gameCenterAchievementImagesGetInstance(id, fieldsGameCenterAchievementImages, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterAchievementImagesApi#gameCenterAchievementImagesGetInstance");
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
| **fieldsGameCenterAchievementImages** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterAchievementImages | [optional] [enum: assetDeliveryState, fileName, fileSize, gameCenterAchievementLocalization, imageAsset, uploadOperations, uploaded] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: gameCenterAchievementLocalization] |

### Return type

[**GameCenterAchievementImageResponse**](GameCenterAchievementImageResponse.md)

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
| **200** | Single GameCenterAchievementImage |  -  |


## gameCenterAchievementImagesUpdateInstance

> GameCenterAchievementImageResponse gameCenterAchievementImagesUpdateInstance(id, gameCenterAchievementImageUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterAchievementImagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterAchievementImagesApi apiInstance = new GameCenterAchievementImagesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        GameCenterAchievementImageUpdateRequest gameCenterAchievementImageUpdateRequest = new GameCenterAchievementImageUpdateRequest(); // GameCenterAchievementImageUpdateRequest | GameCenterAchievementImage representation
        try {
            GameCenterAchievementImageResponse result = apiInstance.gameCenterAchievementImagesUpdateInstance(id, gameCenterAchievementImageUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterAchievementImagesApi#gameCenterAchievementImagesUpdateInstance");
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
| **gameCenterAchievementImageUpdateRequest** | [**GameCenterAchievementImageUpdateRequest**](GameCenterAchievementImageUpdateRequest.md)| GameCenterAchievementImage representation | |

### Return type

[**GameCenterAchievementImageResponse**](GameCenterAchievementImageResponse.md)

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
| **200** | Single GameCenterAchievementImage |  -  |
| **409** | Request entity error(s) |  -  |

