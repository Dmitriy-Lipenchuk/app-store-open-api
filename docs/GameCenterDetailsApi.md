# GameCenterDetailsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**gameCenterDetailsAchievementReleasesGetToManyRelated**](GameCenterDetailsApi.md#gameCenterDetailsAchievementReleasesGetToManyRelated) | **GET** /v1/gameCenterDetails/{id}/achievementReleases |  |
| [**gameCenterDetailsClassicMatchmakingRequestsGetMetrics**](GameCenterDetailsApi.md#gameCenterDetailsClassicMatchmakingRequestsGetMetrics) | **GET** /v1/gameCenterDetails/{id}/metrics/classicMatchmakingRequests |  |
| [**gameCenterDetailsCreateInstance**](GameCenterDetailsApi.md#gameCenterDetailsCreateInstance) | **POST** /v1/gameCenterDetails |  |
| [**gameCenterDetailsGameCenterAchievementsGetToManyRelated**](GameCenterDetailsApi.md#gameCenterDetailsGameCenterAchievementsGetToManyRelated) | **GET** /v1/gameCenterDetails/{id}/gameCenterAchievements |  |
| [**gameCenterDetailsGameCenterAchievementsGetToManyRelationship**](GameCenterDetailsApi.md#gameCenterDetailsGameCenterAchievementsGetToManyRelationship) | **GET** /v1/gameCenterDetails/{id}/relationships/gameCenterAchievements |  |
| [**gameCenterDetailsGameCenterAchievementsReplaceToManyRelationship**](GameCenterDetailsApi.md#gameCenterDetailsGameCenterAchievementsReplaceToManyRelationship) | **PATCH** /v1/gameCenterDetails/{id}/relationships/gameCenterAchievements |  |
| [**gameCenterDetailsGameCenterAppVersionsGetToManyRelated**](GameCenterDetailsApi.md#gameCenterDetailsGameCenterAppVersionsGetToManyRelated) | **GET** /v1/gameCenterDetails/{id}/gameCenterAppVersions |  |
| [**gameCenterDetailsGameCenterGroupGetToOneRelated**](GameCenterDetailsApi.md#gameCenterDetailsGameCenterGroupGetToOneRelated) | **GET** /v1/gameCenterDetails/{id}/gameCenterGroup |  |
| [**gameCenterDetailsGameCenterLeaderboardSetsGetToManyRelated**](GameCenterDetailsApi.md#gameCenterDetailsGameCenterLeaderboardSetsGetToManyRelated) | **GET** /v1/gameCenterDetails/{id}/gameCenterLeaderboardSets |  |
| [**gameCenterDetailsGameCenterLeaderboardSetsGetToManyRelationship**](GameCenterDetailsApi.md#gameCenterDetailsGameCenterLeaderboardSetsGetToManyRelationship) | **GET** /v1/gameCenterDetails/{id}/relationships/gameCenterLeaderboardSets |  |
| [**gameCenterDetailsGameCenterLeaderboardSetsReplaceToManyRelationship**](GameCenterDetailsApi.md#gameCenterDetailsGameCenterLeaderboardSetsReplaceToManyRelationship) | **PATCH** /v1/gameCenterDetails/{id}/relationships/gameCenterLeaderboardSets |  |
| [**gameCenterDetailsGameCenterLeaderboardsGetToManyRelated**](GameCenterDetailsApi.md#gameCenterDetailsGameCenterLeaderboardsGetToManyRelated) | **GET** /v1/gameCenterDetails/{id}/gameCenterLeaderboards |  |
| [**gameCenterDetailsGameCenterLeaderboardsGetToManyRelationship**](GameCenterDetailsApi.md#gameCenterDetailsGameCenterLeaderboardsGetToManyRelationship) | **GET** /v1/gameCenterDetails/{id}/relationships/gameCenterLeaderboards |  |
| [**gameCenterDetailsGameCenterLeaderboardsReplaceToManyRelationship**](GameCenterDetailsApi.md#gameCenterDetailsGameCenterLeaderboardsReplaceToManyRelationship) | **PATCH** /v1/gameCenterDetails/{id}/relationships/gameCenterLeaderboards |  |
| [**gameCenterDetailsGetInstance**](GameCenterDetailsApi.md#gameCenterDetailsGetInstance) | **GET** /v1/gameCenterDetails/{id} |  |
| [**gameCenterDetailsLeaderboardReleasesGetToManyRelated**](GameCenterDetailsApi.md#gameCenterDetailsLeaderboardReleasesGetToManyRelated) | **GET** /v1/gameCenterDetails/{id}/leaderboardReleases |  |
| [**gameCenterDetailsLeaderboardSetReleasesGetToManyRelated**](GameCenterDetailsApi.md#gameCenterDetailsLeaderboardSetReleasesGetToManyRelated) | **GET** /v1/gameCenterDetails/{id}/leaderboardSetReleases |  |
| [**gameCenterDetailsRuleBasedMatchmakingRequestsGetMetrics**](GameCenterDetailsApi.md#gameCenterDetailsRuleBasedMatchmakingRequestsGetMetrics) | **GET** /v1/gameCenterDetails/{id}/metrics/ruleBasedMatchmakingRequests |  |
| [**gameCenterDetailsUpdateInstance**](GameCenterDetailsApi.md#gameCenterDetailsUpdateInstance) | **PATCH** /v1/gameCenterDetails/{id} |  |



## gameCenterDetailsAchievementReleasesGetToManyRelated

> GameCenterAchievementReleasesResponse gameCenterDetailsAchievementReleasesGetToManyRelated(id, filterLive, filterGameCenterAchievement, fieldsGameCenterAchievementReleases, fieldsGameCenterDetails, fieldsGameCenterAchievements, limit, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterDetailsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterDetailsApi apiInstance = new GameCenterDetailsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> filterLive = Arrays.asList(); // List<String> | filter by attribute 'live'
        List<String> filterGameCenterAchievement = Arrays.asList(); // List<String> | filter by id(s) of related 'gameCenterAchievement'
        List<String> fieldsGameCenterAchievementReleases = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterAchievementReleases
        List<String> fieldsGameCenterDetails = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterDetails
        List<String> fieldsGameCenterAchievements = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterAchievements
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            GameCenterAchievementReleasesResponse result = apiInstance.gameCenterDetailsAchievementReleasesGetToManyRelated(id, filterLive, filterGameCenterAchievement, fieldsGameCenterAchievementReleases, fieldsGameCenterDetails, fieldsGameCenterAchievements, limit, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterDetailsApi#gameCenterDetailsAchievementReleasesGetToManyRelated");
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
| **filterLive** | **List&lt;String&gt;**| filter by attribute &#39;live&#39; | [optional] |
| **filterGameCenterAchievement** | **List&lt;String&gt;**| filter by id(s) of related &#39;gameCenterAchievement&#39; | [optional] |
| **fieldsGameCenterAchievementReleases** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterAchievementReleases | [optional] [enum: gameCenterAchievement, gameCenterDetail, live] |
| **fieldsGameCenterDetails** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterDetails | [optional] [enum: achievementReleases, app, arcadeEnabled, challengeEnabled, defaultGroupLeaderboard, defaultLeaderboard, gameCenterAchievements, gameCenterAppVersions, gameCenterGroup, gameCenterLeaderboardSets, gameCenterLeaderboards, leaderboardReleases, leaderboardSetReleases] |
| **fieldsGameCenterAchievements** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterAchievements | [optional] [enum: archived, gameCenterDetail, gameCenterGroup, groupAchievement, localizations, points, referenceName, releases, repeatable, showBeforeEarned, vendorIdentifier] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: gameCenterAchievement, gameCenterDetail] |

### Return type

[**GameCenterAchievementReleasesResponse**](GameCenterAchievementReleasesResponse.md)

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
| **200** | List of GameCenterAchievementReleases |  -  |


## gameCenterDetailsClassicMatchmakingRequestsGetMetrics

> GameCenterMatchmakingAppRequestsV1MetricResponse gameCenterDetailsClassicMatchmakingRequestsGetMetrics(id, granularity, limit, groupBy, filterResult, sort)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterDetailsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterDetailsApi apiInstance = new GameCenterDetailsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        String granularity = "P1D"; // String | the granularity of the per-group dataset
        Integer limit = 56; // Integer | maximum number of groups to return per page
        List<String> groupBy = Arrays.asList(); // List<String> | the dimension by which to group the results
        String filterResult = "MATCHED"; // String | filter by 'result' attribute dimension
        List<String> sort = Arrays.asList(); // List<String> | comma-separated list of sort expressions; metrics will be sorted as specified
        try {
            GameCenterMatchmakingAppRequestsV1MetricResponse result = apiInstance.gameCenterDetailsClassicMatchmakingRequestsGetMetrics(id, granularity, limit, groupBy, filterResult, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterDetailsApi#gameCenterDetailsClassicMatchmakingRequestsGetMetrics");
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
| **granularity** | **String**| the granularity of the per-group dataset | [enum: P1D, PT1H, PT15M] |
| **limit** | **Integer**| maximum number of groups to return per page | [optional] |
| **groupBy** | **List&lt;String&gt;**| the dimension by which to group the results | [optional] [enum: result] |
| **filterResult** | **String**| filter by &#39;result&#39; attribute dimension | [optional] [enum: MATCHED, CANCELED, EXPIRED] |
| **sort** | **List&lt;String&gt;**| comma-separated list of sort expressions; metrics will be sorted as specified | [optional] [enum: averageSecondsInQueue, -averageSecondsInQueue, count, -count, p50SecondsInQueue, -p50SecondsInQueue, p95SecondsInQueue, -p95SecondsInQueue] |

### Return type

[**GameCenterMatchmakingAppRequestsV1MetricResponse**](GameCenterMatchmakingAppRequestsV1MetricResponse.md)

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
| **200** | Metrics data response |  -  |


## gameCenterDetailsCreateInstance

> GameCenterDetailResponse gameCenterDetailsCreateInstance(gameCenterDetailCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterDetailsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterDetailsApi apiInstance = new GameCenterDetailsApi(defaultClient);
        GameCenterDetailCreateRequest gameCenterDetailCreateRequest = new GameCenterDetailCreateRequest(); // GameCenterDetailCreateRequest | GameCenterDetail representation
        try {
            GameCenterDetailResponse result = apiInstance.gameCenterDetailsCreateInstance(gameCenterDetailCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterDetailsApi#gameCenterDetailsCreateInstance");
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
| **gameCenterDetailCreateRequest** | [**GameCenterDetailCreateRequest**](GameCenterDetailCreateRequest.md)| GameCenterDetail representation | |

### Return type

[**GameCenterDetailResponse**](GameCenterDetailResponse.md)

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
| **201** | Single GameCenterDetail |  -  |
| **409** | Request entity error(s) |  -  |


## gameCenterDetailsGameCenterAchievementsGetToManyRelated

> GameCenterAchievementsResponse gameCenterDetailsGameCenterAchievementsGetToManyRelated(id, filterArchived, filterReferenceName, filterId, fieldsGameCenterAchievementReleases, fieldsGameCenterGroups, fieldsGameCenterDetails, fieldsGameCenterAchievementLocalizations, fieldsGameCenterAchievements, limit, limitLocalizations, limitReleases, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterDetailsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterDetailsApi apiInstance = new GameCenterDetailsApi(defaultClient);
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
            GameCenterAchievementsResponse result = apiInstance.gameCenterDetailsGameCenterAchievementsGetToManyRelated(id, filterArchived, filterReferenceName, filterId, fieldsGameCenterAchievementReleases, fieldsGameCenterGroups, fieldsGameCenterDetails, fieldsGameCenterAchievementLocalizations, fieldsGameCenterAchievements, limit, limitLocalizations, limitReleases, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterDetailsApi#gameCenterDetailsGameCenterAchievementsGetToManyRelated");
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


## gameCenterDetailsGameCenterAchievementsGetToManyRelationship

> GameCenterDetailGameCenterAchievementsLinkagesResponse gameCenterDetailsGameCenterAchievementsGetToManyRelationship(id, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterDetailsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterDetailsApi apiInstance = new GameCenterDetailsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        Integer limit = 56; // Integer | maximum resources per page
        try {
            GameCenterDetailGameCenterAchievementsLinkagesResponse result = apiInstance.gameCenterDetailsGameCenterAchievementsGetToManyRelationship(id, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterDetailsApi#gameCenterDetailsGameCenterAchievementsGetToManyRelationship");
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

[**GameCenterDetailGameCenterAchievementsLinkagesResponse**](GameCenterDetailGameCenterAchievementsLinkagesResponse.md)

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


## gameCenterDetailsGameCenterAchievementsReplaceToManyRelationship

> gameCenterDetailsGameCenterAchievementsReplaceToManyRelationship(id, gameCenterDetailGameCenterAchievementsLinkagesRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterDetailsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterDetailsApi apiInstance = new GameCenterDetailsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        GameCenterDetailGameCenterAchievementsLinkagesRequest gameCenterDetailGameCenterAchievementsLinkagesRequest = new GameCenterDetailGameCenterAchievementsLinkagesRequest(); // GameCenterDetailGameCenterAchievementsLinkagesRequest | List of related linkages
        try {
            apiInstance.gameCenterDetailsGameCenterAchievementsReplaceToManyRelationship(id, gameCenterDetailGameCenterAchievementsLinkagesRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterDetailsApi#gameCenterDetailsGameCenterAchievementsReplaceToManyRelationship");
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
| **gameCenterDetailGameCenterAchievementsLinkagesRequest** | [**GameCenterDetailGameCenterAchievementsLinkagesRequest**](GameCenterDetailGameCenterAchievementsLinkagesRequest.md)| List of related linkages | |

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


## gameCenterDetailsGameCenterAppVersionsGetToManyRelated

> GameCenterAppVersionsResponse gameCenterDetailsGameCenterAppVersionsGetToManyRelated(id, filterEnabled, fieldsAppStoreVersions, fieldsGameCenterAppVersions, limit, limitCompatibilityVersions, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterDetailsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterDetailsApi apiInstance = new GameCenterDetailsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> filterEnabled = Arrays.asList(); // List<String> | filter by attribute 'enabled'
        List<String> fieldsAppStoreVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type appStoreVersions
        List<String> fieldsGameCenterAppVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterAppVersions
        Integer limit = 56; // Integer | maximum resources per page
        Integer limitCompatibilityVersions = 56; // Integer | maximum number of related compatibilityVersions returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            GameCenterAppVersionsResponse result = apiInstance.gameCenterDetailsGameCenterAppVersionsGetToManyRelated(id, filterEnabled, fieldsAppStoreVersions, fieldsGameCenterAppVersions, limit, limitCompatibilityVersions, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterDetailsApi#gameCenterDetailsGameCenterAppVersionsGetToManyRelated");
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
| **filterEnabled** | **List&lt;String&gt;**| filter by attribute &#39;enabled&#39; | [optional] |
| **fieldsAppStoreVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type appStoreVersions | [optional] [enum: ageRatingDeclaration, alternativeDistributionPackage, app, appClipDefaultExperience, appStoreReviewDetail, appStoreState, appStoreVersionExperiments, appStoreVersionExperimentsV2, appStoreVersionLocalizations, appStoreVersionPhasedRelease, appStoreVersionSubmission, appVersionState, build, copyright, createdDate, customerReviews, downloadable, earliestReleaseDate, platform, releaseType, reviewType, routingAppCoverage, versionString] |
| **fieldsGameCenterAppVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterAppVersions | [optional] [enum: appStoreVersion, compatibilityVersions, enabled] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **limitCompatibilityVersions** | **Integer**| maximum number of related compatibilityVersions returned (when they are included) | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: appStoreVersion, compatibilityVersions] |

### Return type

[**GameCenterAppVersionsResponse**](GameCenterAppVersionsResponse.md)

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
| **200** | List of GameCenterAppVersions |  -  |


## gameCenterDetailsGameCenterGroupGetToOneRelated

> GameCenterGroupResponse gameCenterDetailsGameCenterGroupGetToOneRelated(id, fieldsGameCenterLeaderboardSets, fieldsGameCenterGroups, fieldsGameCenterDetails, fieldsGameCenterLeaderboards, fieldsGameCenterAchievements, limitGameCenterDetails, limitGameCenterLeaderboards, limitGameCenterLeaderboardSets, limitGameCenterAchievements, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterDetailsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterDetailsApi apiInstance = new GameCenterDetailsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsGameCenterLeaderboardSets = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardSets
        List<String> fieldsGameCenterGroups = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterGroups
        List<String> fieldsGameCenterDetails = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterDetails
        List<String> fieldsGameCenterLeaderboards = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboards
        List<String> fieldsGameCenterAchievements = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterAchievements
        Integer limitGameCenterDetails = 56; // Integer | maximum number of related gameCenterDetails returned (when they are included)
        Integer limitGameCenterLeaderboards = 56; // Integer | maximum number of related gameCenterLeaderboards returned (when they are included)
        Integer limitGameCenterLeaderboardSets = 56; // Integer | maximum number of related gameCenterLeaderboardSets returned (when they are included)
        Integer limitGameCenterAchievements = 56; // Integer | maximum number of related gameCenterAchievements returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            GameCenterGroupResponse result = apiInstance.gameCenterDetailsGameCenterGroupGetToOneRelated(id, fieldsGameCenterLeaderboardSets, fieldsGameCenterGroups, fieldsGameCenterDetails, fieldsGameCenterLeaderboards, fieldsGameCenterAchievements, limitGameCenterDetails, limitGameCenterLeaderboards, limitGameCenterLeaderboardSets, limitGameCenterAchievements, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterDetailsApi#gameCenterDetailsGameCenterGroupGetToOneRelated");
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
| **fieldsGameCenterLeaderboardSets** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboardSets | [optional] [enum: gameCenterDetail, gameCenterGroup, gameCenterLeaderboards, groupLeaderboardSet, localizations, referenceName, releases, vendorIdentifier] |
| **fieldsGameCenterGroups** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterGroups | [optional] [enum: gameCenterAchievements, gameCenterDetails, gameCenterLeaderboardSets, gameCenterLeaderboards, referenceName] |
| **fieldsGameCenterDetails** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterDetails | [optional] [enum: achievementReleases, app, arcadeEnabled, challengeEnabled, defaultGroupLeaderboard, defaultLeaderboard, gameCenterAchievements, gameCenterAppVersions, gameCenterGroup, gameCenterLeaderboardSets, gameCenterLeaderboards, leaderboardReleases, leaderboardSetReleases] |
| **fieldsGameCenterLeaderboards** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboards | [optional] [enum: archived, defaultFormatter, gameCenterDetail, gameCenterGroup, gameCenterLeaderboardSets, groupLeaderboard, localizations, recurrenceDuration, recurrenceRule, recurrenceStartDate, referenceName, releases, scoreRangeEnd, scoreRangeStart, scoreSortType, submissionType, vendorIdentifier] |
| **fieldsGameCenterAchievements** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterAchievements | [optional] [enum: archived, gameCenterDetail, gameCenterGroup, groupAchievement, localizations, points, referenceName, releases, repeatable, showBeforeEarned, vendorIdentifier] |
| **limitGameCenterDetails** | **Integer**| maximum number of related gameCenterDetails returned (when they are included) | [optional] |
| **limitGameCenterLeaderboards** | **Integer**| maximum number of related gameCenterLeaderboards returned (when they are included) | [optional] |
| **limitGameCenterLeaderboardSets** | **Integer**| maximum number of related gameCenterLeaderboardSets returned (when they are included) | [optional] |
| **limitGameCenterAchievements** | **Integer**| maximum number of related gameCenterAchievements returned (when they are included) | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: gameCenterAchievements, gameCenterDetails, gameCenterLeaderboardSets, gameCenterLeaderboards] |

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


## gameCenterDetailsGameCenterLeaderboardSetsGetToManyRelated

> GameCenterLeaderboardSetsResponse gameCenterDetailsGameCenterLeaderboardSetsGetToManyRelated(id, filterReferenceName, filterId, fieldsGameCenterLeaderboardSetLocalizations, fieldsGameCenterLeaderboardSetReleases, fieldsGameCenterLeaderboardSets, fieldsGameCenterGroups, fieldsGameCenterDetails, fieldsGameCenterLeaderboards, limit, limitLocalizations, limitGameCenterLeaderboards, limitReleases, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterDetailsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterDetailsApi apiInstance = new GameCenterDetailsApi(defaultClient);
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
            GameCenterLeaderboardSetsResponse result = apiInstance.gameCenterDetailsGameCenterLeaderboardSetsGetToManyRelated(id, filterReferenceName, filterId, fieldsGameCenterLeaderboardSetLocalizations, fieldsGameCenterLeaderboardSetReleases, fieldsGameCenterLeaderboardSets, fieldsGameCenterGroups, fieldsGameCenterDetails, fieldsGameCenterLeaderboards, limit, limitLocalizations, limitGameCenterLeaderboards, limitReleases, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterDetailsApi#gameCenterDetailsGameCenterLeaderboardSetsGetToManyRelated");
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


## gameCenterDetailsGameCenterLeaderboardSetsGetToManyRelationship

> GameCenterDetailGameCenterLeaderboardSetsLinkagesResponse gameCenterDetailsGameCenterLeaderboardSetsGetToManyRelationship(id, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterDetailsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterDetailsApi apiInstance = new GameCenterDetailsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        Integer limit = 56; // Integer | maximum resources per page
        try {
            GameCenterDetailGameCenterLeaderboardSetsLinkagesResponse result = apiInstance.gameCenterDetailsGameCenterLeaderboardSetsGetToManyRelationship(id, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterDetailsApi#gameCenterDetailsGameCenterLeaderboardSetsGetToManyRelationship");
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

[**GameCenterDetailGameCenterLeaderboardSetsLinkagesResponse**](GameCenterDetailGameCenterLeaderboardSetsLinkagesResponse.md)

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


## gameCenterDetailsGameCenterLeaderboardSetsReplaceToManyRelationship

> gameCenterDetailsGameCenterLeaderboardSetsReplaceToManyRelationship(id, gameCenterDetailGameCenterLeaderboardSetsLinkagesRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterDetailsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterDetailsApi apiInstance = new GameCenterDetailsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        GameCenterDetailGameCenterLeaderboardSetsLinkagesRequest gameCenterDetailGameCenterLeaderboardSetsLinkagesRequest = new GameCenterDetailGameCenterLeaderboardSetsLinkagesRequest(); // GameCenterDetailGameCenterLeaderboardSetsLinkagesRequest | List of related linkages
        try {
            apiInstance.gameCenterDetailsGameCenterLeaderboardSetsReplaceToManyRelationship(id, gameCenterDetailGameCenterLeaderboardSetsLinkagesRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterDetailsApi#gameCenterDetailsGameCenterLeaderboardSetsReplaceToManyRelationship");
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
| **gameCenterDetailGameCenterLeaderboardSetsLinkagesRequest** | [**GameCenterDetailGameCenterLeaderboardSetsLinkagesRequest**](GameCenterDetailGameCenterLeaderboardSetsLinkagesRequest.md)| List of related linkages | |

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


## gameCenterDetailsGameCenterLeaderboardsGetToManyRelated

> GameCenterLeaderboardsResponse gameCenterDetailsGameCenterLeaderboardsGetToManyRelated(id, filterArchived, filterReferenceName, filterId, fieldsGameCenterLeaderboardLocalizations, fieldsGameCenterLeaderboardSets, fieldsGameCenterGroups, fieldsGameCenterDetails, fieldsGameCenterLeaderboards, fieldsGameCenterLeaderboardReleases, limit, limitGameCenterLeaderboardSets, limitLocalizations, limitReleases, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterDetailsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterDetailsApi apiInstance = new GameCenterDetailsApi(defaultClient);
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
            GameCenterLeaderboardsResponse result = apiInstance.gameCenterDetailsGameCenterLeaderboardsGetToManyRelated(id, filterArchived, filterReferenceName, filterId, fieldsGameCenterLeaderboardLocalizations, fieldsGameCenterLeaderboardSets, fieldsGameCenterGroups, fieldsGameCenterDetails, fieldsGameCenterLeaderboards, fieldsGameCenterLeaderboardReleases, limit, limitGameCenterLeaderboardSets, limitLocalizations, limitReleases, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterDetailsApi#gameCenterDetailsGameCenterLeaderboardsGetToManyRelated");
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


## gameCenterDetailsGameCenterLeaderboardsGetToManyRelationship

> GameCenterDetailGameCenterLeaderboardsLinkagesResponse gameCenterDetailsGameCenterLeaderboardsGetToManyRelationship(id, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterDetailsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterDetailsApi apiInstance = new GameCenterDetailsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        Integer limit = 56; // Integer | maximum resources per page
        try {
            GameCenterDetailGameCenterLeaderboardsLinkagesResponse result = apiInstance.gameCenterDetailsGameCenterLeaderboardsGetToManyRelationship(id, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterDetailsApi#gameCenterDetailsGameCenterLeaderboardsGetToManyRelationship");
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

[**GameCenterDetailGameCenterLeaderboardsLinkagesResponse**](GameCenterDetailGameCenterLeaderboardsLinkagesResponse.md)

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


## gameCenterDetailsGameCenterLeaderboardsReplaceToManyRelationship

> gameCenterDetailsGameCenterLeaderboardsReplaceToManyRelationship(id, gameCenterDetailGameCenterLeaderboardsLinkagesRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterDetailsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterDetailsApi apiInstance = new GameCenterDetailsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        GameCenterDetailGameCenterLeaderboardsLinkagesRequest gameCenterDetailGameCenterLeaderboardsLinkagesRequest = new GameCenterDetailGameCenterLeaderboardsLinkagesRequest(); // GameCenterDetailGameCenterLeaderboardsLinkagesRequest | List of related linkages
        try {
            apiInstance.gameCenterDetailsGameCenterLeaderboardsReplaceToManyRelationship(id, gameCenterDetailGameCenterLeaderboardsLinkagesRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterDetailsApi#gameCenterDetailsGameCenterLeaderboardsReplaceToManyRelationship");
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
| **gameCenterDetailGameCenterLeaderboardsLinkagesRequest** | [**GameCenterDetailGameCenterLeaderboardsLinkagesRequest**](GameCenterDetailGameCenterLeaderboardsLinkagesRequest.md)| List of related linkages | |

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


## gameCenterDetailsGetInstance

> GameCenterDetailResponse gameCenterDetailsGetInstance(id, fieldsGameCenterDetails, include, fieldsGameCenterAchievementReleases, fieldsGameCenterLeaderboardSetReleases, fieldsGameCenterLeaderboardSets, fieldsGameCenterGroups, fieldsGameCenterLeaderboards, fieldsGameCenterAchievements, fieldsGameCenterAppVersions, fieldsGameCenterLeaderboardReleases, limitAchievementReleases, limitGameCenterAchievements, limitGameCenterAppVersions, limitGameCenterLeaderboardSets, limitGameCenterLeaderboards, limitLeaderboardReleases, limitLeaderboardSetReleases)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterDetailsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterDetailsApi apiInstance = new GameCenterDetailsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsGameCenterDetails = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterDetails
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsGameCenterAchievementReleases = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterAchievementReleases
        List<String> fieldsGameCenterLeaderboardSetReleases = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardSetReleases
        List<String> fieldsGameCenterLeaderboardSets = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardSets
        List<String> fieldsGameCenterGroups = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterGroups
        List<String> fieldsGameCenterLeaderboards = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboards
        List<String> fieldsGameCenterAchievements = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterAchievements
        List<String> fieldsGameCenterAppVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterAppVersions
        List<String> fieldsGameCenterLeaderboardReleases = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardReleases
        Integer limitAchievementReleases = 56; // Integer | maximum number of related achievementReleases returned (when they are included)
        Integer limitGameCenterAchievements = 56; // Integer | maximum number of related gameCenterAchievements returned (when they are included)
        Integer limitGameCenterAppVersions = 56; // Integer | maximum number of related gameCenterAppVersions returned (when they are included)
        Integer limitGameCenterLeaderboardSets = 56; // Integer | maximum number of related gameCenterLeaderboardSets returned (when they are included)
        Integer limitGameCenterLeaderboards = 56; // Integer | maximum number of related gameCenterLeaderboards returned (when they are included)
        Integer limitLeaderboardReleases = 56; // Integer | maximum number of related leaderboardReleases returned (when they are included)
        Integer limitLeaderboardSetReleases = 56; // Integer | maximum number of related leaderboardSetReleases returned (when they are included)
        try {
            GameCenterDetailResponse result = apiInstance.gameCenterDetailsGetInstance(id, fieldsGameCenterDetails, include, fieldsGameCenterAchievementReleases, fieldsGameCenterLeaderboardSetReleases, fieldsGameCenterLeaderboardSets, fieldsGameCenterGroups, fieldsGameCenterLeaderboards, fieldsGameCenterAchievements, fieldsGameCenterAppVersions, fieldsGameCenterLeaderboardReleases, limitAchievementReleases, limitGameCenterAchievements, limitGameCenterAppVersions, limitGameCenterLeaderboardSets, limitGameCenterLeaderboards, limitLeaderboardReleases, limitLeaderboardSetReleases);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterDetailsApi#gameCenterDetailsGetInstance");
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
| **fieldsGameCenterDetails** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterDetails | [optional] [enum: achievementReleases, app, arcadeEnabled, challengeEnabled, defaultGroupLeaderboard, defaultLeaderboard, gameCenterAchievements, gameCenterAppVersions, gameCenterGroup, gameCenterLeaderboardSets, gameCenterLeaderboards, leaderboardReleases, leaderboardSetReleases] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: achievementReleases, app, defaultGroupLeaderboard, defaultLeaderboard, gameCenterAchievements, gameCenterAppVersions, gameCenterGroup, gameCenterLeaderboardSets, gameCenterLeaderboards, leaderboardReleases, leaderboardSetReleases] |
| **fieldsGameCenterAchievementReleases** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterAchievementReleases | [optional] [enum: gameCenterAchievement, gameCenterDetail, live] |
| **fieldsGameCenterLeaderboardSetReleases** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboardSetReleases | [optional] [enum: gameCenterDetail, gameCenterLeaderboardSet, live] |
| **fieldsGameCenterLeaderboardSets** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboardSets | [optional] [enum: gameCenterDetail, gameCenterGroup, gameCenterLeaderboards, groupLeaderboardSet, localizations, referenceName, releases, vendorIdentifier] |
| **fieldsGameCenterGroups** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterGroups | [optional] [enum: gameCenterAchievements, gameCenterDetails, gameCenterLeaderboardSets, gameCenterLeaderboards, referenceName] |
| **fieldsGameCenterLeaderboards** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboards | [optional] [enum: archived, defaultFormatter, gameCenterDetail, gameCenterGroup, gameCenterLeaderboardSets, groupLeaderboard, localizations, recurrenceDuration, recurrenceRule, recurrenceStartDate, referenceName, releases, scoreRangeEnd, scoreRangeStart, scoreSortType, submissionType, vendorIdentifier] |
| **fieldsGameCenterAchievements** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterAchievements | [optional] [enum: archived, gameCenterDetail, gameCenterGroup, groupAchievement, localizations, points, referenceName, releases, repeatable, showBeforeEarned, vendorIdentifier] |
| **fieldsGameCenterAppVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterAppVersions | [optional] [enum: appStoreVersion, compatibilityVersions, enabled] |
| **fieldsGameCenterLeaderboardReleases** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboardReleases | [optional] [enum: gameCenterDetail, gameCenterLeaderboard, live] |
| **limitAchievementReleases** | **Integer**| maximum number of related achievementReleases returned (when they are included) | [optional] |
| **limitGameCenterAchievements** | **Integer**| maximum number of related gameCenterAchievements returned (when they are included) | [optional] |
| **limitGameCenterAppVersions** | **Integer**| maximum number of related gameCenterAppVersions returned (when they are included) | [optional] |
| **limitGameCenterLeaderboardSets** | **Integer**| maximum number of related gameCenterLeaderboardSets returned (when they are included) | [optional] |
| **limitGameCenterLeaderboards** | **Integer**| maximum number of related gameCenterLeaderboards returned (when they are included) | [optional] |
| **limitLeaderboardReleases** | **Integer**| maximum number of related leaderboardReleases returned (when they are included) | [optional] |
| **limitLeaderboardSetReleases** | **Integer**| maximum number of related leaderboardSetReleases returned (when they are included) | [optional] |

### Return type

[**GameCenterDetailResponse**](GameCenterDetailResponse.md)

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
| **200** | Single GameCenterDetail |  -  |


## gameCenterDetailsLeaderboardReleasesGetToManyRelated

> GameCenterLeaderboardReleasesResponse gameCenterDetailsLeaderboardReleasesGetToManyRelated(id, filterLive, filterGameCenterLeaderboard, fieldsGameCenterDetails, fieldsGameCenterLeaderboards, fieldsGameCenterLeaderboardReleases, limit, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterDetailsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterDetailsApi apiInstance = new GameCenterDetailsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> filterLive = Arrays.asList(); // List<String> | filter by attribute 'live'
        List<String> filterGameCenterLeaderboard = Arrays.asList(); // List<String> | filter by id(s) of related 'gameCenterLeaderboard'
        List<String> fieldsGameCenterDetails = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterDetails
        List<String> fieldsGameCenterLeaderboards = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboards
        List<String> fieldsGameCenterLeaderboardReleases = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardReleases
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            GameCenterLeaderboardReleasesResponse result = apiInstance.gameCenterDetailsLeaderboardReleasesGetToManyRelated(id, filterLive, filterGameCenterLeaderboard, fieldsGameCenterDetails, fieldsGameCenterLeaderboards, fieldsGameCenterLeaderboardReleases, limit, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterDetailsApi#gameCenterDetailsLeaderboardReleasesGetToManyRelated");
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
| **filterLive** | **List&lt;String&gt;**| filter by attribute &#39;live&#39; | [optional] |
| **filterGameCenterLeaderboard** | **List&lt;String&gt;**| filter by id(s) of related &#39;gameCenterLeaderboard&#39; | [optional] |
| **fieldsGameCenterDetails** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterDetails | [optional] [enum: achievementReleases, app, arcadeEnabled, challengeEnabled, defaultGroupLeaderboard, defaultLeaderboard, gameCenterAchievements, gameCenterAppVersions, gameCenterGroup, gameCenterLeaderboardSets, gameCenterLeaderboards, leaderboardReleases, leaderboardSetReleases] |
| **fieldsGameCenterLeaderboards** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboards | [optional] [enum: archived, defaultFormatter, gameCenterDetail, gameCenterGroup, gameCenterLeaderboardSets, groupLeaderboard, localizations, recurrenceDuration, recurrenceRule, recurrenceStartDate, referenceName, releases, scoreRangeEnd, scoreRangeStart, scoreSortType, submissionType, vendorIdentifier] |
| **fieldsGameCenterLeaderboardReleases** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboardReleases | [optional] [enum: gameCenterDetail, gameCenterLeaderboard, live] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: gameCenterDetail, gameCenterLeaderboard] |

### Return type

[**GameCenterLeaderboardReleasesResponse**](GameCenterLeaderboardReleasesResponse.md)

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
| **200** | List of GameCenterLeaderboardReleases |  -  |


## gameCenterDetailsLeaderboardSetReleasesGetToManyRelated

> GameCenterLeaderboardSetReleasesResponse gameCenterDetailsLeaderboardSetReleasesGetToManyRelated(id, filterLive, filterGameCenterLeaderboardSet, fieldsGameCenterLeaderboardSetReleases, fieldsGameCenterLeaderboardSets, fieldsGameCenterDetails, limit, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterDetailsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterDetailsApi apiInstance = new GameCenterDetailsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> filterLive = Arrays.asList(); // List<String> | filter by attribute 'live'
        List<String> filterGameCenterLeaderboardSet = Arrays.asList(); // List<String> | filter by id(s) of related 'gameCenterLeaderboardSet'
        List<String> fieldsGameCenterLeaderboardSetReleases = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardSetReleases
        List<String> fieldsGameCenterLeaderboardSets = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardSets
        List<String> fieldsGameCenterDetails = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterDetails
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            GameCenterLeaderboardSetReleasesResponse result = apiInstance.gameCenterDetailsLeaderboardSetReleasesGetToManyRelated(id, filterLive, filterGameCenterLeaderboardSet, fieldsGameCenterLeaderboardSetReleases, fieldsGameCenterLeaderboardSets, fieldsGameCenterDetails, limit, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterDetailsApi#gameCenterDetailsLeaderboardSetReleasesGetToManyRelated");
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
| **filterLive** | **List&lt;String&gt;**| filter by attribute &#39;live&#39; | [optional] |
| **filterGameCenterLeaderboardSet** | **List&lt;String&gt;**| filter by id(s) of related &#39;gameCenterLeaderboardSet&#39; | [optional] |
| **fieldsGameCenterLeaderboardSetReleases** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboardSetReleases | [optional] [enum: gameCenterDetail, gameCenterLeaderboardSet, live] |
| **fieldsGameCenterLeaderboardSets** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboardSets | [optional] [enum: gameCenterDetail, gameCenterGroup, gameCenterLeaderboards, groupLeaderboardSet, localizations, referenceName, releases, vendorIdentifier] |
| **fieldsGameCenterDetails** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterDetails | [optional] [enum: achievementReleases, app, arcadeEnabled, challengeEnabled, defaultGroupLeaderboard, defaultLeaderboard, gameCenterAchievements, gameCenterAppVersions, gameCenterGroup, gameCenterLeaderboardSets, gameCenterLeaderboards, leaderboardReleases, leaderboardSetReleases] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: gameCenterDetail, gameCenterLeaderboardSet] |

### Return type

[**GameCenterLeaderboardSetReleasesResponse**](GameCenterLeaderboardSetReleasesResponse.md)

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
| **200** | List of GameCenterLeaderboardSetReleases |  -  |


## gameCenterDetailsRuleBasedMatchmakingRequestsGetMetrics

> GameCenterMatchmakingAppRequestsV1MetricResponse gameCenterDetailsRuleBasedMatchmakingRequestsGetMetrics(id, granularity, limit, groupBy, filterResult, sort)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterDetailsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterDetailsApi apiInstance = new GameCenterDetailsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        String granularity = "P1D"; // String | the granularity of the per-group dataset
        Integer limit = 56; // Integer | maximum number of groups to return per page
        List<String> groupBy = Arrays.asList(); // List<String> | the dimension by which to group the results
        String filterResult = "MATCHED"; // String | filter by 'result' attribute dimension
        List<String> sort = Arrays.asList(); // List<String> | comma-separated list of sort expressions; metrics will be sorted as specified
        try {
            GameCenterMatchmakingAppRequestsV1MetricResponse result = apiInstance.gameCenterDetailsRuleBasedMatchmakingRequestsGetMetrics(id, granularity, limit, groupBy, filterResult, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterDetailsApi#gameCenterDetailsRuleBasedMatchmakingRequestsGetMetrics");
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
| **granularity** | **String**| the granularity of the per-group dataset | [enum: P1D, PT1H, PT15M] |
| **limit** | **Integer**| maximum number of groups to return per page | [optional] |
| **groupBy** | **List&lt;String&gt;**| the dimension by which to group the results | [optional] [enum: result] |
| **filterResult** | **String**| filter by &#39;result&#39; attribute dimension | [optional] [enum: MATCHED, CANCELED, EXPIRED] |
| **sort** | **List&lt;String&gt;**| comma-separated list of sort expressions; metrics will be sorted as specified | [optional] [enum: averageSecondsInQueue, -averageSecondsInQueue, count, -count, p50SecondsInQueue, -p50SecondsInQueue, p95SecondsInQueue, -p95SecondsInQueue] |

### Return type

[**GameCenterMatchmakingAppRequestsV1MetricResponse**](GameCenterMatchmakingAppRequestsV1MetricResponse.md)

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
| **200** | Metrics data response |  -  |


## gameCenterDetailsUpdateInstance

> GameCenterDetailResponse gameCenterDetailsUpdateInstance(id, gameCenterDetailUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterDetailsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterDetailsApi apiInstance = new GameCenterDetailsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        GameCenterDetailUpdateRequest gameCenterDetailUpdateRequest = new GameCenterDetailUpdateRequest(); // GameCenterDetailUpdateRequest | GameCenterDetail representation
        try {
            GameCenterDetailResponse result = apiInstance.gameCenterDetailsUpdateInstance(id, gameCenterDetailUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterDetailsApi#gameCenterDetailsUpdateInstance");
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
| **gameCenterDetailUpdateRequest** | [**GameCenterDetailUpdateRequest**](GameCenterDetailUpdateRequest.md)| GameCenterDetail representation | |

### Return type

[**GameCenterDetailResponse**](GameCenterDetailResponse.md)

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
| **200** | Single GameCenterDetail |  -  |
| **409** | Request entity error(s) |  -  |

