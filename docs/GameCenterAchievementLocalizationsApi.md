# GameCenterAchievementLocalizationsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**gameCenterAchievementLocalizationsCreateInstance**](GameCenterAchievementLocalizationsApi.md#gameCenterAchievementLocalizationsCreateInstance) | **POST** /v1/gameCenterAchievementLocalizations |  |
| [**gameCenterAchievementLocalizationsDeleteInstance**](GameCenterAchievementLocalizationsApi.md#gameCenterAchievementLocalizationsDeleteInstance) | **DELETE** /v1/gameCenterAchievementLocalizations/{id} |  |
| [**gameCenterAchievementLocalizationsGameCenterAchievementGetToOneRelated**](GameCenterAchievementLocalizationsApi.md#gameCenterAchievementLocalizationsGameCenterAchievementGetToOneRelated) | **GET** /v1/gameCenterAchievementLocalizations/{id}/gameCenterAchievement |  |
| [**gameCenterAchievementLocalizationsGameCenterAchievementImageGetToOneRelated**](GameCenterAchievementLocalizationsApi.md#gameCenterAchievementLocalizationsGameCenterAchievementImageGetToOneRelated) | **GET** /v1/gameCenterAchievementLocalizations/{id}/gameCenterAchievementImage |  |
| [**gameCenterAchievementLocalizationsGetInstance**](GameCenterAchievementLocalizationsApi.md#gameCenterAchievementLocalizationsGetInstance) | **GET** /v1/gameCenterAchievementLocalizations/{id} |  |
| [**gameCenterAchievementLocalizationsUpdateInstance**](GameCenterAchievementLocalizationsApi.md#gameCenterAchievementLocalizationsUpdateInstance) | **PATCH** /v1/gameCenterAchievementLocalizations/{id} |  |



## gameCenterAchievementLocalizationsCreateInstance

> GameCenterAchievementLocalizationResponse gameCenterAchievementLocalizationsCreateInstance(gameCenterAchievementLocalizationCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterAchievementLocalizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterAchievementLocalizationsApi apiInstance = new GameCenterAchievementLocalizationsApi(defaultClient);
        GameCenterAchievementLocalizationCreateRequest gameCenterAchievementLocalizationCreateRequest = new GameCenterAchievementLocalizationCreateRequest(); // GameCenterAchievementLocalizationCreateRequest | GameCenterAchievementLocalization representation
        try {
            GameCenterAchievementLocalizationResponse result = apiInstance.gameCenterAchievementLocalizationsCreateInstance(gameCenterAchievementLocalizationCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterAchievementLocalizationsApi#gameCenterAchievementLocalizationsCreateInstance");
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
| **gameCenterAchievementLocalizationCreateRequest** | [**GameCenterAchievementLocalizationCreateRequest**](GameCenterAchievementLocalizationCreateRequest.md)| GameCenterAchievementLocalization representation | |

### Return type

[**GameCenterAchievementLocalizationResponse**](GameCenterAchievementLocalizationResponse.md)

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
| **201** | Single GameCenterAchievementLocalization |  -  |
| **409** | Request entity error(s) |  -  |


## gameCenterAchievementLocalizationsDeleteInstance

> gameCenterAchievementLocalizationsDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterAchievementLocalizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterAchievementLocalizationsApi apiInstance = new GameCenterAchievementLocalizationsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.gameCenterAchievementLocalizationsDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterAchievementLocalizationsApi#gameCenterAchievementLocalizationsDeleteInstance");
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


## gameCenterAchievementLocalizationsGameCenterAchievementGetToOneRelated

> GameCenterAchievementResponse gameCenterAchievementLocalizationsGameCenterAchievementGetToOneRelated(id, fieldsGameCenterAchievementReleases, fieldsGameCenterGroups, fieldsGameCenterDetails, fieldsGameCenterAchievementLocalizations, fieldsGameCenterAchievements, limitLocalizations, limitReleases, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterAchievementLocalizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterAchievementLocalizationsApi apiInstance = new GameCenterAchievementLocalizationsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsGameCenterAchievementReleases = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterAchievementReleases
        List<String> fieldsGameCenterGroups = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterGroups
        List<String> fieldsGameCenterDetails = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterDetails
        List<String> fieldsGameCenterAchievementLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterAchievementLocalizations
        List<String> fieldsGameCenterAchievements = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterAchievements
        Integer limitLocalizations = 56; // Integer | maximum number of related localizations returned (when they are included)
        Integer limitReleases = 56; // Integer | maximum number of related releases returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            GameCenterAchievementResponse result = apiInstance.gameCenterAchievementLocalizationsGameCenterAchievementGetToOneRelated(id, fieldsGameCenterAchievementReleases, fieldsGameCenterGroups, fieldsGameCenterDetails, fieldsGameCenterAchievementLocalizations, fieldsGameCenterAchievements, limitLocalizations, limitReleases, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterAchievementLocalizationsApi#gameCenterAchievementLocalizationsGameCenterAchievementGetToOneRelated");
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
| **fieldsGameCenterGroups** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterGroups | [optional] [enum: gameCenterAchievements, gameCenterDetails, gameCenterLeaderboardSets, gameCenterLeaderboards, referenceName] |
| **fieldsGameCenterDetails** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterDetails | [optional] [enum: achievementReleases, app, arcadeEnabled, challengeEnabled, defaultGroupLeaderboard, defaultLeaderboard, gameCenterAchievements, gameCenterAppVersions, gameCenterGroup, gameCenterLeaderboardSets, gameCenterLeaderboards, leaderboardReleases, leaderboardSetReleases] |
| **fieldsGameCenterAchievementLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterAchievementLocalizations | [optional] [enum: afterEarnedDescription, beforeEarnedDescription, gameCenterAchievement, gameCenterAchievementImage, locale, name] |
| **fieldsGameCenterAchievements** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterAchievements | [optional] [enum: archived, gameCenterDetail, gameCenterGroup, groupAchievement, localizations, points, referenceName, releases, repeatable, showBeforeEarned, vendorIdentifier] |
| **limitLocalizations** | **Integer**| maximum number of related localizations returned (when they are included) | [optional] |
| **limitReleases** | **Integer**| maximum number of related releases returned (when they are included) | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: gameCenterDetail, gameCenterGroup, groupAchievement, localizations, releases] |

### Return type

[**GameCenterAchievementResponse**](GameCenterAchievementResponse.md)

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
| **200** | Single GameCenterAchievement |  -  |


## gameCenterAchievementLocalizationsGameCenterAchievementImageGetToOneRelated

> GameCenterAchievementImageResponse gameCenterAchievementLocalizationsGameCenterAchievementImageGetToOneRelated(id, fieldsGameCenterAchievementImages, fieldsGameCenterAchievementLocalizations, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterAchievementLocalizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterAchievementLocalizationsApi apiInstance = new GameCenterAchievementLocalizationsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsGameCenterAchievementImages = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterAchievementImages
        List<String> fieldsGameCenterAchievementLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterAchievementLocalizations
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            GameCenterAchievementImageResponse result = apiInstance.gameCenterAchievementLocalizationsGameCenterAchievementImageGetToOneRelated(id, fieldsGameCenterAchievementImages, fieldsGameCenterAchievementLocalizations, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterAchievementLocalizationsApi#gameCenterAchievementLocalizationsGameCenterAchievementImageGetToOneRelated");
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
| **fieldsGameCenterAchievementLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterAchievementLocalizations | [optional] [enum: afterEarnedDescription, beforeEarnedDescription, gameCenterAchievement, gameCenterAchievementImage, locale, name] |
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


## gameCenterAchievementLocalizationsGetInstance

> GameCenterAchievementLocalizationResponse gameCenterAchievementLocalizationsGetInstance(id, fieldsGameCenterAchievementLocalizations, include, fieldsGameCenterAchievementImages, fieldsGameCenterAchievements)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterAchievementLocalizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterAchievementLocalizationsApi apiInstance = new GameCenterAchievementLocalizationsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsGameCenterAchievementLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterAchievementLocalizations
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsGameCenterAchievementImages = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterAchievementImages
        List<String> fieldsGameCenterAchievements = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterAchievements
        try {
            GameCenterAchievementLocalizationResponse result = apiInstance.gameCenterAchievementLocalizationsGetInstance(id, fieldsGameCenterAchievementLocalizations, include, fieldsGameCenterAchievementImages, fieldsGameCenterAchievements);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterAchievementLocalizationsApi#gameCenterAchievementLocalizationsGetInstance");
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
| **fieldsGameCenterAchievementLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterAchievementLocalizations | [optional] [enum: afterEarnedDescription, beforeEarnedDescription, gameCenterAchievement, gameCenterAchievementImage, locale, name] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: gameCenterAchievement, gameCenterAchievementImage] |
| **fieldsGameCenterAchievementImages** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterAchievementImages | [optional] [enum: assetDeliveryState, fileName, fileSize, gameCenterAchievementLocalization, imageAsset, uploadOperations, uploaded] |
| **fieldsGameCenterAchievements** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterAchievements | [optional] [enum: archived, gameCenterDetail, gameCenterGroup, groupAchievement, localizations, points, referenceName, releases, repeatable, showBeforeEarned, vendorIdentifier] |

### Return type

[**GameCenterAchievementLocalizationResponse**](GameCenterAchievementLocalizationResponse.md)

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
| **200** | Single GameCenterAchievementLocalization |  -  |


## gameCenterAchievementLocalizationsUpdateInstance

> GameCenterAchievementLocalizationResponse gameCenterAchievementLocalizationsUpdateInstance(id, gameCenterAchievementLocalizationUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterAchievementLocalizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterAchievementLocalizationsApi apiInstance = new GameCenterAchievementLocalizationsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        GameCenterAchievementLocalizationUpdateRequest gameCenterAchievementLocalizationUpdateRequest = new GameCenterAchievementLocalizationUpdateRequest(); // GameCenterAchievementLocalizationUpdateRequest | GameCenterAchievementLocalization representation
        try {
            GameCenterAchievementLocalizationResponse result = apiInstance.gameCenterAchievementLocalizationsUpdateInstance(id, gameCenterAchievementLocalizationUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterAchievementLocalizationsApi#gameCenterAchievementLocalizationsUpdateInstance");
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
| **gameCenterAchievementLocalizationUpdateRequest** | [**GameCenterAchievementLocalizationUpdateRequest**](GameCenterAchievementLocalizationUpdateRequest.md)| GameCenterAchievementLocalization representation | |

### Return type

[**GameCenterAchievementLocalizationResponse**](GameCenterAchievementLocalizationResponse.md)

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
| **200** | Single GameCenterAchievementLocalization |  -  |
| **409** | Request entity error(s) |  -  |

