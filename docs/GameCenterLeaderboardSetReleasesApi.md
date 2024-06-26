# GameCenterLeaderboardSetReleasesApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**gameCenterLeaderboardSetReleasesCreateInstance**](GameCenterLeaderboardSetReleasesApi.md#gameCenterLeaderboardSetReleasesCreateInstance) | **POST** /v1/gameCenterLeaderboardSetReleases |  |
| [**gameCenterLeaderboardSetReleasesDeleteInstance**](GameCenterLeaderboardSetReleasesApi.md#gameCenterLeaderboardSetReleasesDeleteInstance) | **DELETE** /v1/gameCenterLeaderboardSetReleases/{id} |  |
| [**gameCenterLeaderboardSetReleasesGetInstance**](GameCenterLeaderboardSetReleasesApi.md#gameCenterLeaderboardSetReleasesGetInstance) | **GET** /v1/gameCenterLeaderboardSetReleases/{id} |  |



## gameCenterLeaderboardSetReleasesCreateInstance

> GameCenterLeaderboardSetReleaseResponse gameCenterLeaderboardSetReleasesCreateInstance(gameCenterLeaderboardSetReleaseCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardSetReleasesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardSetReleasesApi apiInstance = new GameCenterLeaderboardSetReleasesApi(defaultClient);
        GameCenterLeaderboardSetReleaseCreateRequest gameCenterLeaderboardSetReleaseCreateRequest = new GameCenterLeaderboardSetReleaseCreateRequest(); // GameCenterLeaderboardSetReleaseCreateRequest | GameCenterLeaderboardSetRelease representation
        try {
            GameCenterLeaderboardSetReleaseResponse result = apiInstance.gameCenterLeaderboardSetReleasesCreateInstance(gameCenterLeaderboardSetReleaseCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardSetReleasesApi#gameCenterLeaderboardSetReleasesCreateInstance");
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
| **gameCenterLeaderboardSetReleaseCreateRequest** | [**GameCenterLeaderboardSetReleaseCreateRequest**](GameCenterLeaderboardSetReleaseCreateRequest.md)| GameCenterLeaderboardSetRelease representation | |

### Return type

[**GameCenterLeaderboardSetReleaseResponse**](GameCenterLeaderboardSetReleaseResponse.md)

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
| **201** | Single GameCenterLeaderboardSetRelease |  -  |
| **409** | Request entity error(s) |  -  |


## gameCenterLeaderboardSetReleasesDeleteInstance

> gameCenterLeaderboardSetReleasesDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardSetReleasesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardSetReleasesApi apiInstance = new GameCenterLeaderboardSetReleasesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.gameCenterLeaderboardSetReleasesDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardSetReleasesApi#gameCenterLeaderboardSetReleasesDeleteInstance");
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


## gameCenterLeaderboardSetReleasesGetInstance

> GameCenterLeaderboardSetReleaseResponse gameCenterLeaderboardSetReleasesGetInstance(id, fieldsGameCenterLeaderboardSetReleases, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardSetReleasesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardSetReleasesApi apiInstance = new GameCenterLeaderboardSetReleasesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsGameCenterLeaderboardSetReleases = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardSetReleases
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            GameCenterLeaderboardSetReleaseResponse result = apiInstance.gameCenterLeaderboardSetReleasesGetInstance(id, fieldsGameCenterLeaderboardSetReleases, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardSetReleasesApi#gameCenterLeaderboardSetReleasesGetInstance");
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
| **fieldsGameCenterLeaderboardSetReleases** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboardSetReleases | [optional] [enum: gameCenterDetail, gameCenterLeaderboardSet, live] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: gameCenterDetail, gameCenterLeaderboardSet] |

### Return type

[**GameCenterLeaderboardSetReleaseResponse**](GameCenterLeaderboardSetReleaseResponse.md)

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
| **200** | Single GameCenterLeaderboardSetRelease |  -  |

