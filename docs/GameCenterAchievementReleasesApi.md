# GameCenterAchievementReleasesApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**gameCenterAchievementReleasesCreateInstance**](GameCenterAchievementReleasesApi.md#gameCenterAchievementReleasesCreateInstance) | **POST** /v1/gameCenterAchievementReleases |  |
| [**gameCenterAchievementReleasesDeleteInstance**](GameCenterAchievementReleasesApi.md#gameCenterAchievementReleasesDeleteInstance) | **DELETE** /v1/gameCenterAchievementReleases/{id} |  |
| [**gameCenterAchievementReleasesGetInstance**](GameCenterAchievementReleasesApi.md#gameCenterAchievementReleasesGetInstance) | **GET** /v1/gameCenterAchievementReleases/{id} |  |



## gameCenterAchievementReleasesCreateInstance

> GameCenterAchievementReleaseResponse gameCenterAchievementReleasesCreateInstance(gameCenterAchievementReleaseCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterAchievementReleasesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterAchievementReleasesApi apiInstance = new GameCenterAchievementReleasesApi(defaultClient);
        GameCenterAchievementReleaseCreateRequest gameCenterAchievementReleaseCreateRequest = new GameCenterAchievementReleaseCreateRequest(); // GameCenterAchievementReleaseCreateRequest | GameCenterAchievementRelease representation
        try {
            GameCenterAchievementReleaseResponse result = apiInstance.gameCenterAchievementReleasesCreateInstance(gameCenterAchievementReleaseCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterAchievementReleasesApi#gameCenterAchievementReleasesCreateInstance");
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
| **gameCenterAchievementReleaseCreateRequest** | [**GameCenterAchievementReleaseCreateRequest**](GameCenterAchievementReleaseCreateRequest.md)| GameCenterAchievementRelease representation | |

### Return type

[**GameCenterAchievementReleaseResponse**](GameCenterAchievementReleaseResponse.md)

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
| **201** | Single GameCenterAchievementRelease |  -  |
| **409** | Request entity error(s) |  -  |


## gameCenterAchievementReleasesDeleteInstance

> gameCenterAchievementReleasesDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterAchievementReleasesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterAchievementReleasesApi apiInstance = new GameCenterAchievementReleasesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.gameCenterAchievementReleasesDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterAchievementReleasesApi#gameCenterAchievementReleasesDeleteInstance");
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


## gameCenterAchievementReleasesGetInstance

> GameCenterAchievementReleaseResponse gameCenterAchievementReleasesGetInstance(id, fieldsGameCenterAchievementReleases, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterAchievementReleasesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterAchievementReleasesApi apiInstance = new GameCenterAchievementReleasesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsGameCenterAchievementReleases = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterAchievementReleases
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            GameCenterAchievementReleaseResponse result = apiInstance.gameCenterAchievementReleasesGetInstance(id, fieldsGameCenterAchievementReleases, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterAchievementReleasesApi#gameCenterAchievementReleasesGetInstance");
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
| **fieldsGameCenterAchievementReleases** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterAchievementReleases | [optional] [enum: gameCenterAchievement, gameCenterDetail, live] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: gameCenterAchievement, gameCenterDetail] |

### Return type

[**GameCenterAchievementReleaseResponse**](GameCenterAchievementReleaseResponse.md)

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
| **200** | Single GameCenterAchievementRelease |  -  |

