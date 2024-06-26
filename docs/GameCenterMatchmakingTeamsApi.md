# GameCenterMatchmakingTeamsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**gameCenterMatchmakingTeamsCreateInstance**](GameCenterMatchmakingTeamsApi.md#gameCenterMatchmakingTeamsCreateInstance) | **POST** /v1/gameCenterMatchmakingTeams |  |
| [**gameCenterMatchmakingTeamsDeleteInstance**](GameCenterMatchmakingTeamsApi.md#gameCenterMatchmakingTeamsDeleteInstance) | **DELETE** /v1/gameCenterMatchmakingTeams/{id} |  |
| [**gameCenterMatchmakingTeamsUpdateInstance**](GameCenterMatchmakingTeamsApi.md#gameCenterMatchmakingTeamsUpdateInstance) | **PATCH** /v1/gameCenterMatchmakingTeams/{id} |  |



## gameCenterMatchmakingTeamsCreateInstance

> GameCenterMatchmakingTeamResponse gameCenterMatchmakingTeamsCreateInstance(gameCenterMatchmakingTeamCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterMatchmakingTeamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterMatchmakingTeamsApi apiInstance = new GameCenterMatchmakingTeamsApi(defaultClient);
        GameCenterMatchmakingTeamCreateRequest gameCenterMatchmakingTeamCreateRequest = new GameCenterMatchmakingTeamCreateRequest(); // GameCenterMatchmakingTeamCreateRequest | GameCenterMatchmakingTeam representation
        try {
            GameCenterMatchmakingTeamResponse result = apiInstance.gameCenterMatchmakingTeamsCreateInstance(gameCenterMatchmakingTeamCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterMatchmakingTeamsApi#gameCenterMatchmakingTeamsCreateInstance");
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
| **gameCenterMatchmakingTeamCreateRequest** | [**GameCenterMatchmakingTeamCreateRequest**](GameCenterMatchmakingTeamCreateRequest.md)| GameCenterMatchmakingTeam representation | |

### Return type

[**GameCenterMatchmakingTeamResponse**](GameCenterMatchmakingTeamResponse.md)

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
| **201** | Single GameCenterMatchmakingTeam |  -  |
| **409** | Request entity error(s) |  -  |


## gameCenterMatchmakingTeamsDeleteInstance

> gameCenterMatchmakingTeamsDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterMatchmakingTeamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterMatchmakingTeamsApi apiInstance = new GameCenterMatchmakingTeamsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.gameCenterMatchmakingTeamsDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterMatchmakingTeamsApi#gameCenterMatchmakingTeamsDeleteInstance");
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


## gameCenterMatchmakingTeamsUpdateInstance

> GameCenterMatchmakingTeamResponse gameCenterMatchmakingTeamsUpdateInstance(id, gameCenterMatchmakingTeamUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterMatchmakingTeamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterMatchmakingTeamsApi apiInstance = new GameCenterMatchmakingTeamsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        GameCenterMatchmakingTeamUpdateRequest gameCenterMatchmakingTeamUpdateRequest = new GameCenterMatchmakingTeamUpdateRequest(); // GameCenterMatchmakingTeamUpdateRequest | GameCenterMatchmakingTeam representation
        try {
            GameCenterMatchmakingTeamResponse result = apiInstance.gameCenterMatchmakingTeamsUpdateInstance(id, gameCenterMatchmakingTeamUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterMatchmakingTeamsApi#gameCenterMatchmakingTeamsUpdateInstance");
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
| **gameCenterMatchmakingTeamUpdateRequest** | [**GameCenterMatchmakingTeamUpdateRequest**](GameCenterMatchmakingTeamUpdateRequest.md)| GameCenterMatchmakingTeam representation | |

### Return type

[**GameCenterMatchmakingTeamResponse**](GameCenterMatchmakingTeamResponse.md)

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
| **200** | Single GameCenterMatchmakingTeam |  -  |
| **409** | Request entity error(s) |  -  |

