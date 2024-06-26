# GameCenterGroupsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**gameCenterGroupsCreateInstance**](GameCenterGroupsApi.md#gameCenterGroupsCreateInstance) | **POST** /v1/gameCenterGroups |  |
| [**gameCenterGroupsDeleteInstance**](GameCenterGroupsApi.md#gameCenterGroupsDeleteInstance) | **DELETE** /v1/gameCenterGroups/{id} |  |
| [**gameCenterGroupsGameCenterAchievementsGetToManyRelated**](GameCenterGroupsApi.md#gameCenterGroupsGameCenterAchievementsGetToManyRelated) | **GET** /v1/gameCenterGroups/{id}/gameCenterAchievements |  |
| [**gameCenterGroupsGameCenterAchievementsGetToManyRelationship**](GameCenterGroupsApi.md#gameCenterGroupsGameCenterAchievementsGetToManyRelationship) | **GET** /v1/gameCenterGroups/{id}/relationships/gameCenterAchievements |  |
| [**gameCenterGroupsGameCenterAchievementsReplaceToManyRelationship**](GameCenterGroupsApi.md#gameCenterGroupsGameCenterAchievementsReplaceToManyRelationship) | **PATCH** /v1/gameCenterGroups/{id}/relationships/gameCenterAchievements |  |
| [**gameCenterGroupsGameCenterDetailsGetToManyRelated**](GameCenterGroupsApi.md#gameCenterGroupsGameCenterDetailsGetToManyRelated) | **GET** /v1/gameCenterGroups/{id}/gameCenterDetails |  |
| [**gameCenterGroupsGameCenterLeaderboardSetsGetToManyRelated**](GameCenterGroupsApi.md#gameCenterGroupsGameCenterLeaderboardSetsGetToManyRelated) | **GET** /v1/gameCenterGroups/{id}/gameCenterLeaderboardSets |  |
| [**gameCenterGroupsGameCenterLeaderboardSetsGetToManyRelationship**](GameCenterGroupsApi.md#gameCenterGroupsGameCenterLeaderboardSetsGetToManyRelationship) | **GET** /v1/gameCenterGroups/{id}/relationships/gameCenterLeaderboardSets |  |
| [**gameCenterGroupsGameCenterLeaderboardSetsReplaceToManyRelationship**](GameCenterGroupsApi.md#gameCenterGroupsGameCenterLeaderboardSetsReplaceToManyRelationship) | **PATCH** /v1/gameCenterGroups/{id}/relationships/gameCenterLeaderboardSets |  |
| [**gameCenterGroupsGameCenterLeaderboardsGetToManyRelated**](GameCenterGroupsApi.md#gameCenterGroupsGameCenterLeaderboardsGetToManyRelated) | **GET** /v1/gameCenterGroups/{id}/gameCenterLeaderboards |  |
| [**gameCenterGroupsGameCenterLeaderboardsGetToManyRelationship**](GameCenterGroupsApi.md#gameCenterGroupsGameCenterLeaderboardsGetToManyRelationship) | **GET** /v1/gameCenterGroups/{id}/relationships/gameCenterLeaderboards |  |
| [**gameCenterGroupsGameCenterLeaderboardsReplaceToManyRelationship**](GameCenterGroupsApi.md#gameCenterGroupsGameCenterLeaderboardsReplaceToManyRelationship) | **PATCH** /v1/gameCenterGroups/{id}/relationships/gameCenterLeaderboards |  |
| [**gameCenterGroupsGetCollection**](GameCenterGroupsApi.md#gameCenterGroupsGetCollection) | **GET** /v1/gameCenterGroups |  |
| [**gameCenterGroupsGetInstance**](GameCenterGroupsApi.md#gameCenterGroupsGetInstance) | **GET** /v1/gameCenterGroups/{id} |  |
| [**gameCenterGroupsUpdateInstance**](GameCenterGroupsApi.md#gameCenterGroupsUpdateInstance) | **PATCH** /v1/gameCenterGroups/{id} |  |



## gameCenterGroupsCreateInstance

> GameCenterGroupResponse gameCenterGroupsCreateInstance(gameCenterGroupCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterGroupsApi apiInstance = new GameCenterGroupsApi(defaultClient);
        GameCenterGroupCreateRequest gameCenterGroupCreateRequest = new GameCenterGroupCreateRequest(); // GameCenterGroupCreateRequest | GameCenterGroup representation
        try {
            GameCenterGroupResponse result = apiInstance.gameCenterGroupsCreateInstance(gameCenterGroupCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterGroupsApi#gameCenterGroupsCreateInstance");
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
| **gameCenterGroupCreateRequest** | [**GameCenterGroupCreateRequest**](GameCenterGroupCreateRequest.md)| GameCenterGroup representation | |

### Return type

[**GameCenterGroupResponse**](GameCenterGroupResponse.md)

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
| **201** | Single GameCenterGroup |  -  |
| **409** | Request entity error(s) |  -  |


## gameCenterGroupsDeleteInstance

> gameCenterGroupsDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterGroupsApi apiInstance = new GameCenterGroupsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.gameCenterGroupsDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterGroupsApi#gameCenterGroupsDeleteInstance");
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


## gameCenterGroupsGameCenterAchievementsGetToManyRelated

> GameCenterAchievementsResponse gameCenterGroupsGameCenterAchievementsGetToManyRelated(id, filterArchived, filterReferenceName, filterId, fieldsGameCenterAchievementReleases, fieldsGameCenterGroups, fieldsGameCenterDetails, fieldsGameCenterAchievementLocalizations, fieldsGameCenterAchievements, limit, limitLocalizations, limitReleases, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterGroupsApi apiInstance = new GameCenterGroupsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> filterArchived = Arrays.asList(); // List<String> | filter by attribute 'archived'
        List<String> filterReferenceName = Arrays.asList(); // List<String> | filter by attribute 'referenceName'
        List<String> filterId = Arrays.asList(); // List<String> | filter by id(s)
        List<String> fieldsGameCenterAchievementReleases = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterAchievementReleases
        List<String> fieldsGameCenterGroups = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterGroups
        List<String> fieldsGameCenterDetails = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterDetails
        List<String> fieldsGameCenterAchievementLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterAchievementLocalizations
        List<String> fieldsGameCenterAchievements = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterAchievements
        Integer limit = 56; // Integer | maximum resources per page
        Integer limitLocalizations = 56; // Integer | maximum number of related localizations returned (when they are included)
        Integer limitReleases = 56; // Integer | maximum number of related releases returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            GameCenterAchievementsResponse result = apiInstance.gameCenterGroupsGameCenterAchievementsGetToManyRelated(id, filterArchived, filterReferenceName, filterId, fieldsGameCenterAchievementReleases, fieldsGameCenterGroups, fieldsGameCenterDetails, fieldsGameCenterAchievementLocalizations, fieldsGameCenterAchievements, limit, limitLocalizations, limitReleases, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterGroupsApi#gameCenterGroupsGameCenterAchievementsGetToManyRelated");
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
| **filterArchived** | **List&lt;String&gt;**| filter by attribute &#39;archived&#39; | [optional] |
| **filterReferenceName** | **List&lt;String&gt;**| filter by attribute &#39;referenceName&#39; | [optional] |
| **filterId** | **List&lt;String&gt;**| filter by id(s) | [optional] |
| **fieldsGameCenterAchievementReleases** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterAchievementReleases | [optional] [enum: gameCenterAchievement, gameCenterDetail, live] |
| **fieldsGameCenterGroups** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterGroups | [optional] [enum: gameCenterAchievements, gameCenterDetails, gameCenterLeaderboardSets, gameCenterLeaderboards, referenceName] |
| **fieldsGameCenterDetails** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterDetails | [optional] [enum: achievementReleases, app, arcadeEnabled, challengeEnabled, defaultGroupLeaderboard, defaultLeaderboard, gameCenterAchievements, gameCenterAppVersions, gameCenterGroup, gameCenterLeaderboardSets, gameCenterLeaderboards, leaderboardReleases, leaderboardSetReleases] |
| **fieldsGameCenterAchievementLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterAchievementLocalizations | [optional] [enum: afterEarnedDescription, beforeEarnedDescription, gameCenterAchievement, gameCenterAchievementImage, locale, name] |
| **fieldsGameCenterAchievements** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterAchievements | [optional] [enum: archived, gameCenterDetail, gameCenterGroup, groupAchievement, localizations, points, referenceName, releases, repeatable, showBeforeEarned, vendorIdentifier] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **limitLocalizations** | **Integer**| maximum number of related localizations returned (when they are included) | [optional] |
| **limitReleases** | **Integer**| maximum number of related releases returned (when they are included) | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: gameCenterDetail, gameCenterGroup, groupAchievement, localizations, releases] |

### Return type

[**GameCenterAchievementsResponse**](GameCenterAchievementsResponse.md)

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
| **200** | List of GameCenterAchievements |  -  |


## gameCenterGroupsGameCenterAchievementsGetToManyRelationship

> GameCenterGroupGameCenterAchievementsLinkagesResponse gameCenterGroupsGameCenterAchievementsGetToManyRelationship(id, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterGroupsApi apiInstance = new GameCenterGroupsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        Integer limit = 56; // Integer | maximum resources per page
        try {
            GameCenterGroupGameCenterAchievementsLinkagesResponse result = apiInstance.gameCenterGroupsGameCenterAchievementsGetToManyRelationship(id, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterGroupsApi#gameCenterGroupsGameCenterAchievementsGetToManyRelationship");
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
| **limit** | **Integer**| maximum resources per page | [optional] |

### Return type

[**GameCenterGroupGameCenterAchievementsLinkagesResponse**](GameCenterGroupGameCenterAchievementsLinkagesResponse.md)

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
| **200** | List of related linkages |  -  |


## gameCenterGroupsGameCenterAchievementsReplaceToManyRelationship

> gameCenterGroupsGameCenterAchievementsReplaceToManyRelationship(id, gameCenterGroupGameCenterAchievementsLinkagesRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterGroupsApi apiInstance = new GameCenterGroupsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        GameCenterGroupGameCenterAchievementsLinkagesRequest gameCenterGroupGameCenterAchievementsLinkagesRequest = new GameCenterGroupGameCenterAchievementsLinkagesRequest(); // GameCenterGroupGameCenterAchievementsLinkagesRequest | List of related linkages
        try {
            apiInstance.gameCenterGroupsGameCenterAchievementsReplaceToManyRelationship(id, gameCenterGroupGameCenterAchievementsLinkagesRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterGroupsApi#gameCenterGroupsGameCenterAchievementsReplaceToManyRelationship");
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
| **gameCenterGroupGameCenterAchievementsLinkagesRequest** | [**GameCenterGroupGameCenterAchievementsLinkagesRequest**](GameCenterGroupGameCenterAchievementsLinkagesRequest.md)| List of related linkages | |

### Return type

null (empty response body)

### Authorization

[itc-bearer-token](../README.md#itc-bearer-token)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | Unauthorized error(s) |  -  |
| **403** | Forbidden error |  -  |
| **404** | Not found error |  -  |
| **422** | Unprocessable request entity error(s) |  -  |
| **409** | Request entity error(s) |  -  |
| **204** | Success (no content) |  -  |


## gameCenterGroupsGameCenterDetailsGetToManyRelated

> GameCenterDetailsResponse gameCenterGroupsGameCenterDetailsGetToManyRelated(id, filterGameCenterAppVersionsEnabled, fieldsGameCenterAchievementReleases, fieldsGameCenterLeaderboardSetReleases, fieldsGameCenterLeaderboardSets, fieldsGameCenterGroups, fieldsGameCenterDetails, fieldsGameCenterLeaderboards, fieldsGameCenterAppVersions, fieldsGameCenterAchievements, fieldsApps, fieldsGameCenterLeaderboardReleases, limit, limitGameCenterAppVersions, limitGameCenterLeaderboards, limitGameCenterLeaderboardSets, limitGameCenterAchievements, limitAchievementReleases, limitLeaderboardReleases, limitLeaderboardSetReleases, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterGroupsApi apiInstance = new GameCenterGroupsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> filterGameCenterAppVersionsEnabled = Arrays.asList(); // List<String> | filter by attribute 'gameCenterAppVersions.enabled'
        List<String> fieldsGameCenterAchievementReleases = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterAchievementReleases
        List<String> fieldsGameCenterLeaderboardSetReleases = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardSetReleases
        List<String> fieldsGameCenterLeaderboardSets = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardSets
        List<String> fieldsGameCenterGroups = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterGroups
        List<String> fieldsGameCenterDetails = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterDetails
        List<String> fieldsGameCenterLeaderboards = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboards
        List<String> fieldsGameCenterAppVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterAppVersions
        List<String> fieldsGameCenterAchievements = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterAchievements
        List<String> fieldsApps = Arrays.asList(); // List<String> | the fields to include for returned resources of type apps
        List<String> fieldsGameCenterLeaderboardReleases = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardReleases
        Integer limit = 56; // Integer | maximum resources per page
        Integer limitGameCenterAppVersions = 56; // Integer | maximum number of related gameCenterAppVersions returned (when they are included)
        Integer limitGameCenterLeaderboards = 56; // Integer | maximum number of related gameCenterLeaderboards returned (when they are included)
        Integer limitGameCenterLeaderboardSets = 56; // Integer | maximum number of related gameCenterLeaderboardSets returned (when they are included)
        Integer limitGameCenterAchievements = 56; // Integer | maximum number of related gameCenterAchievements returned (when they are included)
        Integer limitAchievementReleases = 56; // Integer | maximum number of related achievementReleases returned (when they are included)
        Integer limitLeaderboardReleases = 56; // Integer | maximum number of related leaderboardReleases returned (when they are included)
        Integer limitLeaderboardSetReleases = 56; // Integer | maximum number of related leaderboardSetReleases returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            GameCenterDetailsResponse result = apiInstance.gameCenterGroupsGameCenterDetailsGetToManyRelated(id, filterGameCenterAppVersionsEnabled, fieldsGameCenterAchievementReleases, fieldsGameCenterLeaderboardSetReleases, fieldsGameCenterLeaderboardSets, fieldsGameCenterGroups, fieldsGameCenterDetails, fieldsGameCenterLeaderboards, fieldsGameCenterAppVersions, fieldsGameCenterAchievements, fieldsApps, fieldsGameCenterLeaderboardReleases, limit, limitGameCenterAppVersions, limitGameCenterLeaderboards, limitGameCenterLeaderboardSets, limitGameCenterAchievements, limitAchievementReleases, limitLeaderboardReleases, limitLeaderboardSetReleases, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterGroupsApi#gameCenterGroupsGameCenterDetailsGetToManyRelated");
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
| **filterGameCenterAppVersionsEnabled** | **List&lt;String&gt;**| filter by attribute &#39;gameCenterAppVersions.enabled&#39; | [optional] |
| **fieldsGameCenterAchievementReleases** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterAchievementReleases | [optional] [enum: gameCenterAchievement, gameCenterDetail, live] |
| **fieldsGameCenterLeaderboardSetReleases** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboardSetReleases | [optional] [enum: gameCenterDetail, gameCenterLeaderboardSet, live] |
| **fieldsGameCenterLeaderboardSets** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboardSets | [optional] [enum: gameCenterDetail, gameCenterGroup, gameCenterLeaderboards, groupLeaderboardSet, localizations, referenceName, releases, vendorIdentifier] |
| **fieldsGameCenterGroups** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterGroups | [optional] [enum: gameCenterAchievements, gameCenterDetails, gameCenterLeaderboardSets, gameCenterLeaderboards, referenceName] |
| **fieldsGameCenterDetails** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterDetails | [optional] [enum: achievementReleases, app, arcadeEnabled, challengeEnabled, defaultGroupLeaderboard, defaultLeaderboard, gameCenterAchievements, gameCenterAppVersions, gameCenterGroup, gameCenterLeaderboardSets, gameCenterLeaderboards, leaderboardReleases, leaderboardSetReleases] |
| **fieldsGameCenterLeaderboards** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboards | [optional] [enum: archived, defaultFormatter, gameCenterDetail, gameCenterGroup, gameCenterLeaderboardSets, groupLeaderboard, localizations, recurrenceDuration, recurrenceRule, recurrenceStartDate, referenceName, releases, scoreRangeEnd, scoreRangeStart, scoreSortType, submissionType, vendorIdentifier] |
| **fieldsGameCenterAppVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterAppVersions | [optional] [enum: appStoreVersion, compatibilityVersions, enabled] |
| **fieldsGameCenterAchievements** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterAchievements | [optional] [enum: archived, gameCenterDetail, gameCenterGroup, groupAchievement, localizations, points, referenceName, releases, repeatable, showBeforeEarned, vendorIdentifier] |
| **fieldsApps** | **List&lt;String&gt;**| the fields to include for returned resources of type apps | [optional] [enum: alternativeDistributionKey, analyticsReportRequests, appAvailability, appClips, appCustomProductPages, appEncryptionDeclarations, appEvents, appInfos, appPricePoints, appPriceSchedule, appStoreVersionExperimentsV2, appStoreVersions, betaAppLocalizations, betaAppReviewDetail, betaGroups, betaLicenseAgreement, betaTesters, builds, bundleId, ciProduct, contentRightsDeclaration, customerReviews, endUserLicenseAgreement, gameCenterDetail, gameCenterEnabledVersions, inAppPurchases, inAppPurchasesV2, isOrEverWasMadeForKids, marketplaceSearchDetail, name, perfPowerMetrics, preOrder, preReleaseVersions, primaryLocale, promotedPurchases, reviewSubmissions, sku, subscriptionGracePeriod, subscriptionGroups, subscriptionStatusUrl, subscriptionStatusUrlForSandbox, subscriptionStatusUrlVersion, subscriptionStatusUrlVersionForSandbox] |
| **fieldsGameCenterLeaderboardReleases** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboardReleases | [optional] [enum: gameCenterDetail, gameCenterLeaderboard, live] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **limitGameCenterAppVersions** | **Integer**| maximum number of related gameCenterAppVersions returned (when they are included) | [optional] |
| **limitGameCenterLeaderboards** | **Integer**| maximum number of related gameCenterLeaderboards returned (when they are included) | [optional] |
| **limitGameCenterLeaderboardSets** | **Integer**| maximum number of related gameCenterLeaderboardSets returned (when they are included) | [optional] |
| **limitGameCenterAchievements** | **Integer**| maximum number of related gameCenterAchievements returned (when they are included) | [optional] |
| **limitAchievementReleases** | **Integer**| maximum number of related achievementReleases returned (when they are included) | [optional] |
| **limitLeaderboardReleases** | **Integer**| maximum number of related leaderboardReleases returned (when they are included) | [optional] |
| **limitLeaderboardSetReleases** | **Integer**| maximum number of related leaderboardSetReleases returned (when they are included) | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: achievementReleases, app, defaultGroupLeaderboard, defaultLeaderboard, gameCenterAchievements, gameCenterAppVersions, gameCenterGroup, gameCenterLeaderboardSets, gameCenterLeaderboards, leaderboardReleases, leaderboardSetReleases] |

### Return type

[**GameCenterDetailsResponse**](GameCenterDetailsResponse.md)

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
| **200** | List of GameCenterDetails |  -  |


## gameCenterGroupsGameCenterLeaderboardSetsGetToManyRelated

> GameCenterLeaderboardSetsResponse gameCenterGroupsGameCenterLeaderboardSetsGetToManyRelated(id, filterReferenceName, filterId, fieldsGameCenterLeaderboardSetLocalizations, fieldsGameCenterLeaderboardSetReleases, fieldsGameCenterLeaderboardSets, fieldsGameCenterGroups, fieldsGameCenterDetails, fieldsGameCenterLeaderboards, limit, limitLocalizations, limitGameCenterLeaderboards, limitReleases, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterGroupsApi apiInstance = new GameCenterGroupsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> filterReferenceName = Arrays.asList(); // List<String> | filter by attribute 'referenceName'
        List<String> filterId = Arrays.asList(); // List<String> | filter by id(s)
        List<String> fieldsGameCenterLeaderboardSetLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardSetLocalizations
        List<String> fieldsGameCenterLeaderboardSetReleases = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardSetReleases
        List<String> fieldsGameCenterLeaderboardSets = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardSets
        List<String> fieldsGameCenterGroups = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterGroups
        List<String> fieldsGameCenterDetails = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterDetails
        List<String> fieldsGameCenterLeaderboards = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboards
        Integer limit = 56; // Integer | maximum resources per page
        Integer limitLocalizations = 56; // Integer | maximum number of related localizations returned (when they are included)
        Integer limitGameCenterLeaderboards = 56; // Integer | maximum number of related gameCenterLeaderboards returned (when they are included)
        Integer limitReleases = 56; // Integer | maximum number of related releases returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            GameCenterLeaderboardSetsResponse result = apiInstance.gameCenterGroupsGameCenterLeaderboardSetsGetToManyRelated(id, filterReferenceName, filterId, fieldsGameCenterLeaderboardSetLocalizations, fieldsGameCenterLeaderboardSetReleases, fieldsGameCenterLeaderboardSets, fieldsGameCenterGroups, fieldsGameCenterDetails, fieldsGameCenterLeaderboards, limit, limitLocalizations, limitGameCenterLeaderboards, limitReleases, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterGroupsApi#gameCenterGroupsGameCenterLeaderboardSetsGetToManyRelated");
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
| **filterReferenceName** | **List&lt;String&gt;**| filter by attribute &#39;referenceName&#39; | [optional] |
| **filterId** | **List&lt;String&gt;**| filter by id(s) | [optional] |
| **fieldsGameCenterLeaderboardSetLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboardSetLocalizations | [optional] [enum: gameCenterLeaderboardSet, gameCenterLeaderboardSetImage, locale, name] |
| **fieldsGameCenterLeaderboardSetReleases** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboardSetReleases | [optional] [enum: gameCenterDetail, gameCenterLeaderboardSet, live] |
| **fieldsGameCenterLeaderboardSets** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboardSets | [optional] [enum: gameCenterDetail, gameCenterGroup, gameCenterLeaderboards, groupLeaderboardSet, localizations, referenceName, releases, vendorIdentifier] |
| **fieldsGameCenterGroups** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterGroups | [optional] [enum: gameCenterAchievements, gameCenterDetails, gameCenterLeaderboardSets, gameCenterLeaderboards, referenceName] |
| **fieldsGameCenterDetails** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterDetails | [optional] [enum: achievementReleases, app, arcadeEnabled, challengeEnabled, defaultGroupLeaderboard, defaultLeaderboard, gameCenterAchievements, gameCenterAppVersions, gameCenterGroup, gameCenterLeaderboardSets, gameCenterLeaderboards, leaderboardReleases, leaderboardSetReleases] |
| **fieldsGameCenterLeaderboards** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboards | [optional] [enum: archived, defaultFormatter, gameCenterDetail, gameCenterGroup, gameCenterLeaderboardSets, groupLeaderboard, localizations, recurrenceDuration, recurrenceRule, recurrenceStartDate, referenceName, releases, scoreRangeEnd, scoreRangeStart, scoreSortType, submissionType, vendorIdentifier] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **limitLocalizations** | **Integer**| maximum number of related localizations returned (when they are included) | [optional] |
| **limitGameCenterLeaderboards** | **Integer**| maximum number of related gameCenterLeaderboards returned (when they are included) | [optional] |
| **limitReleases** | **Integer**| maximum number of related releases returned (when they are included) | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: gameCenterDetail, gameCenterGroup, gameCenterLeaderboards, groupLeaderboardSet, localizations, releases] |

### Return type

[**GameCenterLeaderboardSetsResponse**](GameCenterLeaderboardSetsResponse.md)

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
| **200** | List of GameCenterLeaderboardSets |  -  |


## gameCenterGroupsGameCenterLeaderboardSetsGetToManyRelationship

> GameCenterGroupGameCenterLeaderboardSetsLinkagesResponse gameCenterGroupsGameCenterLeaderboardSetsGetToManyRelationship(id, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterGroupsApi apiInstance = new GameCenterGroupsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        Integer limit = 56; // Integer | maximum resources per page
        try {
            GameCenterGroupGameCenterLeaderboardSetsLinkagesResponse result = apiInstance.gameCenterGroupsGameCenterLeaderboardSetsGetToManyRelationship(id, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterGroupsApi#gameCenterGroupsGameCenterLeaderboardSetsGetToManyRelationship");
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
| **limit** | **Integer**| maximum resources per page | [optional] |

### Return type

[**GameCenterGroupGameCenterLeaderboardSetsLinkagesResponse**](GameCenterGroupGameCenterLeaderboardSetsLinkagesResponse.md)

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
| **200** | List of related linkages |  -  |


## gameCenterGroupsGameCenterLeaderboardSetsReplaceToManyRelationship

> gameCenterGroupsGameCenterLeaderboardSetsReplaceToManyRelationship(id, gameCenterGroupGameCenterLeaderboardSetsLinkagesRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterGroupsApi apiInstance = new GameCenterGroupsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        GameCenterGroupGameCenterLeaderboardSetsLinkagesRequest gameCenterGroupGameCenterLeaderboardSetsLinkagesRequest = new GameCenterGroupGameCenterLeaderboardSetsLinkagesRequest(); // GameCenterGroupGameCenterLeaderboardSetsLinkagesRequest | List of related linkages
        try {
            apiInstance.gameCenterGroupsGameCenterLeaderboardSetsReplaceToManyRelationship(id, gameCenterGroupGameCenterLeaderboardSetsLinkagesRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterGroupsApi#gameCenterGroupsGameCenterLeaderboardSetsReplaceToManyRelationship");
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
| **gameCenterGroupGameCenterLeaderboardSetsLinkagesRequest** | [**GameCenterGroupGameCenterLeaderboardSetsLinkagesRequest**](GameCenterGroupGameCenterLeaderboardSetsLinkagesRequest.md)| List of related linkages | |

### Return type

null (empty response body)

### Authorization

[itc-bearer-token](../README.md#itc-bearer-token)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | Unauthorized error(s) |  -  |
| **403** | Forbidden error |  -  |
| **404** | Not found error |  -  |
| **422** | Unprocessable request entity error(s) |  -  |
| **409** | Request entity error(s) |  -  |
| **204** | Success (no content) |  -  |


## gameCenterGroupsGameCenterLeaderboardsGetToManyRelated

> GameCenterLeaderboardsResponse gameCenterGroupsGameCenterLeaderboardsGetToManyRelated(id, filterArchived, filterReferenceName, filterId, fieldsGameCenterLeaderboardLocalizations, fieldsGameCenterLeaderboardSets, fieldsGameCenterGroups, fieldsGameCenterDetails, fieldsGameCenterLeaderboards, fieldsGameCenterLeaderboardReleases, limit, limitGameCenterLeaderboardSets, limitLocalizations, limitReleases, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterGroupsApi apiInstance = new GameCenterGroupsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> filterArchived = Arrays.asList(); // List<String> | filter by attribute 'archived'
        List<String> filterReferenceName = Arrays.asList(); // List<String> | filter by attribute 'referenceName'
        List<String> filterId = Arrays.asList(); // List<String> | filter by id(s)
        List<String> fieldsGameCenterLeaderboardLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardLocalizations
        List<String> fieldsGameCenterLeaderboardSets = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardSets
        List<String> fieldsGameCenterGroups = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterGroups
        List<String> fieldsGameCenterDetails = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterDetails
        List<String> fieldsGameCenterLeaderboards = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboards
        List<String> fieldsGameCenterLeaderboardReleases = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardReleases
        Integer limit = 56; // Integer | maximum resources per page
        Integer limitGameCenterLeaderboardSets = 56; // Integer | maximum number of related gameCenterLeaderboardSets returned (when they are included)
        Integer limitLocalizations = 56; // Integer | maximum number of related localizations returned (when they are included)
        Integer limitReleases = 56; // Integer | maximum number of related releases returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            GameCenterLeaderboardsResponse result = apiInstance.gameCenterGroupsGameCenterLeaderboardsGetToManyRelated(id, filterArchived, filterReferenceName, filterId, fieldsGameCenterLeaderboardLocalizations, fieldsGameCenterLeaderboardSets, fieldsGameCenterGroups, fieldsGameCenterDetails, fieldsGameCenterLeaderboards, fieldsGameCenterLeaderboardReleases, limit, limitGameCenterLeaderboardSets, limitLocalizations, limitReleases, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterGroupsApi#gameCenterGroupsGameCenterLeaderboardsGetToManyRelated");
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
| **filterArchived** | **List&lt;String&gt;**| filter by attribute &#39;archived&#39; | [optional] |
| **filterReferenceName** | **List&lt;String&gt;**| filter by attribute &#39;referenceName&#39; | [optional] |
| **filterId** | **List&lt;String&gt;**| filter by id(s) | [optional] |
| **fieldsGameCenterLeaderboardLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboardLocalizations | [optional] [enum: formatterOverride, formatterSuffix, formatterSuffixSingular, gameCenterLeaderboard, gameCenterLeaderboardImage, locale, name] |
| **fieldsGameCenterLeaderboardSets** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboardSets | [optional] [enum: gameCenterDetail, gameCenterGroup, gameCenterLeaderboards, groupLeaderboardSet, localizations, referenceName, releases, vendorIdentifier] |
| **fieldsGameCenterGroups** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterGroups | [optional] [enum: gameCenterAchievements, gameCenterDetails, gameCenterLeaderboardSets, gameCenterLeaderboards, referenceName] |
| **fieldsGameCenterDetails** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterDetails | [optional] [enum: achievementReleases, app, arcadeEnabled, challengeEnabled, defaultGroupLeaderboard, defaultLeaderboard, gameCenterAchievements, gameCenterAppVersions, gameCenterGroup, gameCenterLeaderboardSets, gameCenterLeaderboards, leaderboardReleases, leaderboardSetReleases] |
| **fieldsGameCenterLeaderboards** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboards | [optional] [enum: archived, defaultFormatter, gameCenterDetail, gameCenterGroup, gameCenterLeaderboardSets, groupLeaderboard, localizations, recurrenceDuration, recurrenceRule, recurrenceStartDate, referenceName, releases, scoreRangeEnd, scoreRangeStart, scoreSortType, submissionType, vendorIdentifier] |
| **fieldsGameCenterLeaderboardReleases** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboardReleases | [optional] [enum: gameCenterDetail, gameCenterLeaderboard, live] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **limitGameCenterLeaderboardSets** | **Integer**| maximum number of related gameCenterLeaderboardSets returned (when they are included) | [optional] |
| **limitLocalizations** | **Integer**| maximum number of related localizations returned (when they are included) | [optional] |
| **limitReleases** | **Integer**| maximum number of related releases returned (when they are included) | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: gameCenterDetail, gameCenterGroup, gameCenterLeaderboardSets, groupLeaderboard, localizations, releases] |

### Return type

[**GameCenterLeaderboardsResponse**](GameCenterLeaderboardsResponse.md)

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
| **200** | List of GameCenterLeaderboards |  -  |


## gameCenterGroupsGameCenterLeaderboardsGetToManyRelationship

> GameCenterGroupGameCenterLeaderboardsLinkagesResponse gameCenterGroupsGameCenterLeaderboardsGetToManyRelationship(id, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterGroupsApi apiInstance = new GameCenterGroupsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        Integer limit = 56; // Integer | maximum resources per page
        try {
            GameCenterGroupGameCenterLeaderboardsLinkagesResponse result = apiInstance.gameCenterGroupsGameCenterLeaderboardsGetToManyRelationship(id, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterGroupsApi#gameCenterGroupsGameCenterLeaderboardsGetToManyRelationship");
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
| **limit** | **Integer**| maximum resources per page | [optional] |

### Return type

[**GameCenterGroupGameCenterLeaderboardsLinkagesResponse**](GameCenterGroupGameCenterLeaderboardsLinkagesResponse.md)

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
| **200** | List of related linkages |  -  |


## gameCenterGroupsGameCenterLeaderboardsReplaceToManyRelationship

> gameCenterGroupsGameCenterLeaderboardsReplaceToManyRelationship(id, gameCenterGroupGameCenterLeaderboardsLinkagesRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterGroupsApi apiInstance = new GameCenterGroupsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        GameCenterGroupGameCenterLeaderboardsLinkagesRequest gameCenterGroupGameCenterLeaderboardsLinkagesRequest = new GameCenterGroupGameCenterLeaderboardsLinkagesRequest(); // GameCenterGroupGameCenterLeaderboardsLinkagesRequest | List of related linkages
        try {
            apiInstance.gameCenterGroupsGameCenterLeaderboardsReplaceToManyRelationship(id, gameCenterGroupGameCenterLeaderboardsLinkagesRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterGroupsApi#gameCenterGroupsGameCenterLeaderboardsReplaceToManyRelationship");
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
| **gameCenterGroupGameCenterLeaderboardsLinkagesRequest** | [**GameCenterGroupGameCenterLeaderboardsLinkagesRequest**](GameCenterGroupGameCenterLeaderboardsLinkagesRequest.md)| List of related linkages | |

### Return type

null (empty response body)

### Authorization

[itc-bearer-token](../README.md#itc-bearer-token)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | Unauthorized error(s) |  -  |
| **403** | Forbidden error |  -  |
| **404** | Not found error |  -  |
| **422** | Unprocessable request entity error(s) |  -  |
| **409** | Request entity error(s) |  -  |
| **204** | Success (no content) |  -  |


## gameCenterGroupsGetCollection

> GameCenterGroupsResponse gameCenterGroupsGetCollection(filterGameCenterDetails, fieldsGameCenterGroups, limit, include, fieldsGameCenterLeaderboardSets, fieldsGameCenterDetails, fieldsGameCenterLeaderboards, fieldsGameCenterAchievements, limitGameCenterAchievements, limitGameCenterDetails, limitGameCenterLeaderboardSets, limitGameCenterLeaderboards)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterGroupsApi apiInstance = new GameCenterGroupsApi(defaultClient);
        List<String> filterGameCenterDetails = Arrays.asList(); // List<String> | filter by id(s) of related 'gameCenterDetails'
        List<String> fieldsGameCenterGroups = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterGroups
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsGameCenterLeaderboardSets = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardSets
        List<String> fieldsGameCenterDetails = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterDetails
        List<String> fieldsGameCenterLeaderboards = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboards
        List<String> fieldsGameCenterAchievements = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterAchievements
        Integer limitGameCenterAchievements = 56; // Integer | maximum number of related gameCenterAchievements returned (when they are included)
        Integer limitGameCenterDetails = 56; // Integer | maximum number of related gameCenterDetails returned (when they are included)
        Integer limitGameCenterLeaderboardSets = 56; // Integer | maximum number of related gameCenterLeaderboardSets returned (when they are included)
        Integer limitGameCenterLeaderboards = 56; // Integer | maximum number of related gameCenterLeaderboards returned (when they are included)
        try {
            GameCenterGroupsResponse result = apiInstance.gameCenterGroupsGetCollection(filterGameCenterDetails, fieldsGameCenterGroups, limit, include, fieldsGameCenterLeaderboardSets, fieldsGameCenterDetails, fieldsGameCenterLeaderboards, fieldsGameCenterAchievements, limitGameCenterAchievements, limitGameCenterDetails, limitGameCenterLeaderboardSets, limitGameCenterLeaderboards);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterGroupsApi#gameCenterGroupsGetCollection");
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
| **filterGameCenterDetails** | **List&lt;String&gt;**| filter by id(s) of related &#39;gameCenterDetails&#39; | [optional] |
| **fieldsGameCenterGroups** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterGroups | [optional] [enum: gameCenterAchievements, gameCenterDetails, gameCenterLeaderboardSets, gameCenterLeaderboards, referenceName] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: gameCenterAchievements, gameCenterDetails, gameCenterLeaderboardSets, gameCenterLeaderboards] |
| **fieldsGameCenterLeaderboardSets** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboardSets | [optional] [enum: gameCenterDetail, gameCenterGroup, gameCenterLeaderboards, groupLeaderboardSet, localizations, referenceName, releases, vendorIdentifier] |
| **fieldsGameCenterDetails** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterDetails | [optional] [enum: achievementReleases, app, arcadeEnabled, challengeEnabled, defaultGroupLeaderboard, defaultLeaderboard, gameCenterAchievements, gameCenterAppVersions, gameCenterGroup, gameCenterLeaderboardSets, gameCenterLeaderboards, leaderboardReleases, leaderboardSetReleases] |
| **fieldsGameCenterLeaderboards** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboards | [optional] [enum: archived, defaultFormatter, gameCenterDetail, gameCenterGroup, gameCenterLeaderboardSets, groupLeaderboard, localizations, recurrenceDuration, recurrenceRule, recurrenceStartDate, referenceName, releases, scoreRangeEnd, scoreRangeStart, scoreSortType, submissionType, vendorIdentifier] |
| **fieldsGameCenterAchievements** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterAchievements | [optional] [enum: archived, gameCenterDetail, gameCenterGroup, groupAchievement, localizations, points, referenceName, releases, repeatable, showBeforeEarned, vendorIdentifier] |
| **limitGameCenterAchievements** | **Integer**| maximum number of related gameCenterAchievements returned (when they are included) | [optional] |
| **limitGameCenterDetails** | **Integer**| maximum number of related gameCenterDetails returned (when they are included) | [optional] |
| **limitGameCenterLeaderboardSets** | **Integer**| maximum number of related gameCenterLeaderboardSets returned (when they are included) | [optional] |
| **limitGameCenterLeaderboards** | **Integer**| maximum number of related gameCenterLeaderboards returned (when they are included) | [optional] |

### Return type

[**GameCenterGroupsResponse**](GameCenterGroupsResponse.md)

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
| **200** | List of GameCenterGroups |  -  |


## gameCenterGroupsGetInstance

> GameCenterGroupResponse gameCenterGroupsGetInstance(id, fieldsGameCenterGroups, include, fieldsGameCenterLeaderboardSets, fieldsGameCenterDetails, fieldsGameCenterLeaderboards, fieldsGameCenterAchievements, limitGameCenterAchievements, limitGameCenterDetails, limitGameCenterLeaderboardSets, limitGameCenterLeaderboards)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterGroupsApi apiInstance = new GameCenterGroupsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsGameCenterGroups = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterGroups
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsGameCenterLeaderboardSets = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardSets
        List<String> fieldsGameCenterDetails = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterDetails
        List<String> fieldsGameCenterLeaderboards = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboards
        List<String> fieldsGameCenterAchievements = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterAchievements
        Integer limitGameCenterAchievements = 56; // Integer | maximum number of related gameCenterAchievements returned (when they are included)
        Integer limitGameCenterDetails = 56; // Integer | maximum number of related gameCenterDetails returned (when they are included)
        Integer limitGameCenterLeaderboardSets = 56; // Integer | maximum number of related gameCenterLeaderboardSets returned (when they are included)
        Integer limitGameCenterLeaderboards = 56; // Integer | maximum number of related gameCenterLeaderboards returned (when they are included)
        try {
            GameCenterGroupResponse result = apiInstance.gameCenterGroupsGetInstance(id, fieldsGameCenterGroups, include, fieldsGameCenterLeaderboardSets, fieldsGameCenterDetails, fieldsGameCenterLeaderboards, fieldsGameCenterAchievements, limitGameCenterAchievements, limitGameCenterDetails, limitGameCenterLeaderboardSets, limitGameCenterLeaderboards);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterGroupsApi#gameCenterGroupsGetInstance");
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
| **fieldsGameCenterGroups** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterGroups | [optional] [enum: gameCenterAchievements, gameCenterDetails, gameCenterLeaderboardSets, gameCenterLeaderboards, referenceName] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: gameCenterAchievements, gameCenterDetails, gameCenterLeaderboardSets, gameCenterLeaderboards] |
| **fieldsGameCenterLeaderboardSets** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboardSets | [optional] [enum: gameCenterDetail, gameCenterGroup, gameCenterLeaderboards, groupLeaderboardSet, localizations, referenceName, releases, vendorIdentifier] |
| **fieldsGameCenterDetails** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterDetails | [optional] [enum: achievementReleases, app, arcadeEnabled, challengeEnabled, defaultGroupLeaderboard, defaultLeaderboard, gameCenterAchievements, gameCenterAppVersions, gameCenterGroup, gameCenterLeaderboardSets, gameCenterLeaderboards, leaderboardReleases, leaderboardSetReleases] |
| **fieldsGameCenterLeaderboards** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboards | [optional] [enum: archived, defaultFormatter, gameCenterDetail, gameCenterGroup, gameCenterLeaderboardSets, groupLeaderboard, localizations, recurrenceDuration, recurrenceRule, recurrenceStartDate, referenceName, releases, scoreRangeEnd, scoreRangeStart, scoreSortType, submissionType, vendorIdentifier] |
| **fieldsGameCenterAchievements** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterAchievements | [optional] [enum: archived, gameCenterDetail, gameCenterGroup, groupAchievement, localizations, points, referenceName, releases, repeatable, showBeforeEarned, vendorIdentifier] |
| **limitGameCenterAchievements** | **Integer**| maximum number of related gameCenterAchievements returned (when they are included) | [optional] |
| **limitGameCenterDetails** | **Integer**| maximum number of related gameCenterDetails returned (when they are included) | [optional] |
| **limitGameCenterLeaderboardSets** | **Integer**| maximum number of related gameCenterLeaderboardSets returned (when they are included) | [optional] |
| **limitGameCenterLeaderboards** | **Integer**| maximum number of related gameCenterLeaderboards returned (when they are included) | [optional] |

### Return type

[**GameCenterGroupResponse**](GameCenterGroupResponse.md)

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
| **200** | Single GameCenterGroup |  -  |


## gameCenterGroupsUpdateInstance

> GameCenterGroupResponse gameCenterGroupsUpdateInstance(id, gameCenterGroupUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterGroupsApi apiInstance = new GameCenterGroupsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        GameCenterGroupUpdateRequest gameCenterGroupUpdateRequest = new GameCenterGroupUpdateRequest(); // GameCenterGroupUpdateRequest | GameCenterGroup representation
        try {
            GameCenterGroupResponse result = apiInstance.gameCenterGroupsUpdateInstance(id, gameCenterGroupUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterGroupsApi#gameCenterGroupsUpdateInstance");
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
| **gameCenterGroupUpdateRequest** | [**GameCenterGroupUpdateRequest**](GameCenterGroupUpdateRequest.md)| GameCenterGroup representation | |

### Return type

[**GameCenterGroupResponse**](GameCenterGroupResponse.md)

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
| **200** | Single GameCenterGroup |  -  |
| **409** | Request entity error(s) |  -  |

