# GameCenterLeaderboardSetMemberLocalizationsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**gameCenterLeaderboardSetMemberLocalizationsCreateInstance**](GameCenterLeaderboardSetMemberLocalizationsApi.md#gameCenterLeaderboardSetMemberLocalizationsCreateInstance) | **POST** /v1/gameCenterLeaderboardSetMemberLocalizations |  |
| [**gameCenterLeaderboardSetMemberLocalizationsDeleteInstance**](GameCenterLeaderboardSetMemberLocalizationsApi.md#gameCenterLeaderboardSetMemberLocalizationsDeleteInstance) | **DELETE** /v1/gameCenterLeaderboardSetMemberLocalizations/{id} |  |
| [**gameCenterLeaderboardSetMemberLocalizationsGameCenterLeaderboardGetToOneRelated**](GameCenterLeaderboardSetMemberLocalizationsApi.md#gameCenterLeaderboardSetMemberLocalizationsGameCenterLeaderboardGetToOneRelated) | **GET** /v1/gameCenterLeaderboardSetMemberLocalizations/{id}/gameCenterLeaderboard |  |
| [**gameCenterLeaderboardSetMemberLocalizationsGameCenterLeaderboardSetGetToOneRelated**](GameCenterLeaderboardSetMemberLocalizationsApi.md#gameCenterLeaderboardSetMemberLocalizationsGameCenterLeaderboardSetGetToOneRelated) | **GET** /v1/gameCenterLeaderboardSetMemberLocalizations/{id}/gameCenterLeaderboardSet |  |
| [**gameCenterLeaderboardSetMemberLocalizationsGetCollection**](GameCenterLeaderboardSetMemberLocalizationsApi.md#gameCenterLeaderboardSetMemberLocalizationsGetCollection) | **GET** /v1/gameCenterLeaderboardSetMemberLocalizations |  |
| [**gameCenterLeaderboardSetMemberLocalizationsUpdateInstance**](GameCenterLeaderboardSetMemberLocalizationsApi.md#gameCenterLeaderboardSetMemberLocalizationsUpdateInstance) | **PATCH** /v1/gameCenterLeaderboardSetMemberLocalizations/{id} |  |



## gameCenterLeaderboardSetMemberLocalizationsCreateInstance

> GameCenterLeaderboardSetMemberLocalizationResponse gameCenterLeaderboardSetMemberLocalizationsCreateInstance(gameCenterLeaderboardSetMemberLocalizationCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardSetMemberLocalizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardSetMemberLocalizationsApi apiInstance = new GameCenterLeaderboardSetMemberLocalizationsApi(defaultClient);
        GameCenterLeaderboardSetMemberLocalizationCreateRequest gameCenterLeaderboardSetMemberLocalizationCreateRequest = new GameCenterLeaderboardSetMemberLocalizationCreateRequest(); // GameCenterLeaderboardSetMemberLocalizationCreateRequest | GameCenterLeaderboardSetMemberLocalization representation
        try {
            GameCenterLeaderboardSetMemberLocalizationResponse result = apiInstance.gameCenterLeaderboardSetMemberLocalizationsCreateInstance(gameCenterLeaderboardSetMemberLocalizationCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardSetMemberLocalizationsApi#gameCenterLeaderboardSetMemberLocalizationsCreateInstance");
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
| **gameCenterLeaderboardSetMemberLocalizationCreateRequest** | [**GameCenterLeaderboardSetMemberLocalizationCreateRequest**](GameCenterLeaderboardSetMemberLocalizationCreateRequest.md)| GameCenterLeaderboardSetMemberLocalization representation | |

### Return type

[**GameCenterLeaderboardSetMemberLocalizationResponse**](GameCenterLeaderboardSetMemberLocalizationResponse.md)

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
| **201** | Single GameCenterLeaderboardSetMemberLocalization |  -  |
| **409** | Request entity error(s) |  -  |


## gameCenterLeaderboardSetMemberLocalizationsDeleteInstance

> gameCenterLeaderboardSetMemberLocalizationsDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardSetMemberLocalizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardSetMemberLocalizationsApi apiInstance = new GameCenterLeaderboardSetMemberLocalizationsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.gameCenterLeaderboardSetMemberLocalizationsDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardSetMemberLocalizationsApi#gameCenterLeaderboardSetMemberLocalizationsDeleteInstance");
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


## gameCenterLeaderboardSetMemberLocalizationsGameCenterLeaderboardGetToOneRelated

> GameCenterLeaderboardResponse gameCenterLeaderboardSetMemberLocalizationsGameCenterLeaderboardGetToOneRelated(id, fieldsGameCenterLeaderboardLocalizations, fieldsGameCenterLeaderboardSets, fieldsGameCenterGroups, fieldsGameCenterDetails, fieldsGameCenterLeaderboards, fieldsGameCenterLeaderboardReleases, limitGameCenterLeaderboardSets, limitLocalizations, limitReleases, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardSetMemberLocalizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardSetMemberLocalizationsApi apiInstance = new GameCenterLeaderboardSetMemberLocalizationsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsGameCenterLeaderboardLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardLocalizations
        List<String> fieldsGameCenterLeaderboardSets = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardSets
        List<String> fieldsGameCenterGroups = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterGroups
        List<String> fieldsGameCenterDetails = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterDetails
        List<String> fieldsGameCenterLeaderboards = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboards
        List<String> fieldsGameCenterLeaderboardReleases = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardReleases
        Integer limitGameCenterLeaderboardSets = 56; // Integer | maximum number of related gameCenterLeaderboardSets returned (when they are included)
        Integer limitLocalizations = 56; // Integer | maximum number of related localizations returned (when they are included)
        Integer limitReleases = 56; // Integer | maximum number of related releases returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            GameCenterLeaderboardResponse result = apiInstance.gameCenterLeaderboardSetMemberLocalizationsGameCenterLeaderboardGetToOneRelated(id, fieldsGameCenterLeaderboardLocalizations, fieldsGameCenterLeaderboardSets, fieldsGameCenterGroups, fieldsGameCenterDetails, fieldsGameCenterLeaderboards, fieldsGameCenterLeaderboardReleases, limitGameCenterLeaderboardSets, limitLocalizations, limitReleases, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardSetMemberLocalizationsApi#gameCenterLeaderboardSetMemberLocalizationsGameCenterLeaderboardGetToOneRelated");
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
| **fieldsGameCenterLeaderboardSets** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboardSets | [optional] [enum: gameCenterDetail, gameCenterGroup, gameCenterLeaderboards, groupLeaderboardSet, localizations, referenceName, releases, vendorIdentifier] |
| **fieldsGameCenterGroups** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterGroups | [optional] [enum: gameCenterAchievements, gameCenterDetails, gameCenterLeaderboardSets, gameCenterLeaderboards, referenceName] |
| **fieldsGameCenterDetails** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterDetails | [optional] [enum: achievementReleases, app, arcadeEnabled, challengeEnabled, defaultGroupLeaderboard, defaultLeaderboard, gameCenterAchievements, gameCenterAppVersions, gameCenterGroup, gameCenterLeaderboardSets, gameCenterLeaderboards, leaderboardReleases, leaderboardSetReleases] |
| **fieldsGameCenterLeaderboards** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboards | [optional] [enum: archived, defaultFormatter, gameCenterDetail, gameCenterGroup, gameCenterLeaderboardSets, groupLeaderboard, localizations, recurrenceDuration, recurrenceRule, recurrenceStartDate, referenceName, releases, scoreRangeEnd, scoreRangeStart, scoreSortType, submissionType, vendorIdentifier] |
| **fieldsGameCenterLeaderboardReleases** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboardReleases | [optional] [enum: gameCenterDetail, gameCenterLeaderboard, live] |
| **limitGameCenterLeaderboardSets** | **Integer**| maximum number of related gameCenterLeaderboardSets returned (when they are included) | [optional] |
| **limitLocalizations** | **Integer**| maximum number of related localizations returned (when they are included) | [optional] |
| **limitReleases** | **Integer**| maximum number of related releases returned (when they are included) | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: gameCenterDetail, gameCenterGroup, gameCenterLeaderboardSets, groupLeaderboard, localizations, releases] |

### Return type

[**GameCenterLeaderboardResponse**](GameCenterLeaderboardResponse.md)

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
| **200** | Single GameCenterLeaderboard |  -  |


## gameCenterLeaderboardSetMemberLocalizationsGameCenterLeaderboardSetGetToOneRelated

> GameCenterLeaderboardSetResponse gameCenterLeaderboardSetMemberLocalizationsGameCenterLeaderboardSetGetToOneRelated(id, fieldsGameCenterLeaderboardSetLocalizations, fieldsGameCenterLeaderboardSetReleases, fieldsGameCenterLeaderboardSets, fieldsGameCenterGroups, fieldsGameCenterDetails, fieldsGameCenterLeaderboards, limitLocalizations, limitGameCenterLeaderboards, limitReleases, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardSetMemberLocalizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardSetMemberLocalizationsApi apiInstance = new GameCenterLeaderboardSetMemberLocalizationsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsGameCenterLeaderboardSetLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardSetLocalizations
        List<String> fieldsGameCenterLeaderboardSetReleases = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardSetReleases
        List<String> fieldsGameCenterLeaderboardSets = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardSets
        List<String> fieldsGameCenterGroups = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterGroups
        List<String> fieldsGameCenterDetails = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterDetails
        List<String> fieldsGameCenterLeaderboards = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboards
        Integer limitLocalizations = 56; // Integer | maximum number of related localizations returned (when they are included)
        Integer limitGameCenterLeaderboards = 56; // Integer | maximum number of related gameCenterLeaderboards returned (when they are included)
        Integer limitReleases = 56; // Integer | maximum number of related releases returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            GameCenterLeaderboardSetResponse result = apiInstance.gameCenterLeaderboardSetMemberLocalizationsGameCenterLeaderboardSetGetToOneRelated(id, fieldsGameCenterLeaderboardSetLocalizations, fieldsGameCenterLeaderboardSetReleases, fieldsGameCenterLeaderboardSets, fieldsGameCenterGroups, fieldsGameCenterDetails, fieldsGameCenterLeaderboards, limitLocalizations, limitGameCenterLeaderboards, limitReleases, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardSetMemberLocalizationsApi#gameCenterLeaderboardSetMemberLocalizationsGameCenterLeaderboardSetGetToOneRelated");
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
| **fieldsGameCenterLeaderboardSetLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboardSetLocalizations | [optional] [enum: gameCenterLeaderboardSet, gameCenterLeaderboardSetImage, locale, name] |
| **fieldsGameCenterLeaderboardSetReleases** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboardSetReleases | [optional] [enum: gameCenterDetail, gameCenterLeaderboardSet, live] |
| **fieldsGameCenterLeaderboardSets** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboardSets | [optional] [enum: gameCenterDetail, gameCenterGroup, gameCenterLeaderboards, groupLeaderboardSet, localizations, referenceName, releases, vendorIdentifier] |
| **fieldsGameCenterGroups** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterGroups | [optional] [enum: gameCenterAchievements, gameCenterDetails, gameCenterLeaderboardSets, gameCenterLeaderboards, referenceName] |
| **fieldsGameCenterDetails** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterDetails | [optional] [enum: achievementReleases, app, arcadeEnabled, challengeEnabled, defaultGroupLeaderboard, defaultLeaderboard, gameCenterAchievements, gameCenterAppVersions, gameCenterGroup, gameCenterLeaderboardSets, gameCenterLeaderboards, leaderboardReleases, leaderboardSetReleases] |
| **fieldsGameCenterLeaderboards** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboards | [optional] [enum: archived, defaultFormatter, gameCenterDetail, gameCenterGroup, gameCenterLeaderboardSets, groupLeaderboard, localizations, recurrenceDuration, recurrenceRule, recurrenceStartDate, referenceName, releases, scoreRangeEnd, scoreRangeStart, scoreSortType, submissionType, vendorIdentifier] |
| **limitLocalizations** | **Integer**| maximum number of related localizations returned (when they are included) | [optional] |
| **limitGameCenterLeaderboards** | **Integer**| maximum number of related gameCenterLeaderboards returned (when they are included) | [optional] |
| **limitReleases** | **Integer**| maximum number of related releases returned (when they are included) | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: gameCenterDetail, gameCenterGroup, gameCenterLeaderboards, groupLeaderboardSet, localizations, releases] |

### Return type

[**GameCenterLeaderboardSetResponse**](GameCenterLeaderboardSetResponse.md)

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
| **200** | Single GameCenterLeaderboardSet |  -  |


## gameCenterLeaderboardSetMemberLocalizationsGetCollection

> GameCenterLeaderboardSetMemberLocalizationsResponse gameCenterLeaderboardSetMemberLocalizationsGetCollection(filterGameCenterLeaderboard, filterGameCenterLeaderboardSet, fieldsGameCenterLeaderboardSetMemberLocalizations, limit, include, fieldsGameCenterLeaderboardSets, fieldsGameCenterLeaderboards)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardSetMemberLocalizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardSetMemberLocalizationsApi apiInstance = new GameCenterLeaderboardSetMemberLocalizationsApi(defaultClient);
        List<String> filterGameCenterLeaderboard = Arrays.asList(); // List<String> | filter by id(s) of related 'gameCenterLeaderboard'
        List<String> filterGameCenterLeaderboardSet = Arrays.asList(); // List<String> | filter by id(s) of related 'gameCenterLeaderboardSet'
        List<String> fieldsGameCenterLeaderboardSetMemberLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardSetMemberLocalizations
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsGameCenterLeaderboardSets = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardSets
        List<String> fieldsGameCenterLeaderboards = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboards
        try {
            GameCenterLeaderboardSetMemberLocalizationsResponse result = apiInstance.gameCenterLeaderboardSetMemberLocalizationsGetCollection(filterGameCenterLeaderboard, filterGameCenterLeaderboardSet, fieldsGameCenterLeaderboardSetMemberLocalizations, limit, include, fieldsGameCenterLeaderboardSets, fieldsGameCenterLeaderboards);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardSetMemberLocalizationsApi#gameCenterLeaderboardSetMemberLocalizationsGetCollection");
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
| **filterGameCenterLeaderboard** | **List&lt;String&gt;**| filter by id(s) of related &#39;gameCenterLeaderboard&#39; | |
| **filterGameCenterLeaderboardSet** | **List&lt;String&gt;**| filter by id(s) of related &#39;gameCenterLeaderboardSet&#39; | |
| **fieldsGameCenterLeaderboardSetMemberLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboardSetMemberLocalizations | [optional] [enum: gameCenterLeaderboard, gameCenterLeaderboardSet, locale, name] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: gameCenterLeaderboard, gameCenterLeaderboardSet] |
| **fieldsGameCenterLeaderboardSets** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboardSets | [optional] [enum: gameCenterDetail, gameCenterGroup, gameCenterLeaderboards, groupLeaderboardSet, localizations, referenceName, releases, vendorIdentifier] |
| **fieldsGameCenterLeaderboards** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboards | [optional] [enum: archived, defaultFormatter, gameCenterDetail, gameCenterGroup, gameCenterLeaderboardSets, groupLeaderboard, localizations, recurrenceDuration, recurrenceRule, recurrenceStartDate, referenceName, releases, scoreRangeEnd, scoreRangeStart, scoreSortType, submissionType, vendorIdentifier] |

### Return type

[**GameCenterLeaderboardSetMemberLocalizationsResponse**](GameCenterLeaderboardSetMemberLocalizationsResponse.md)

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
| **200** | List of GameCenterLeaderboardSetMemberLocalizations |  -  |


## gameCenterLeaderboardSetMemberLocalizationsUpdateInstance

> GameCenterLeaderboardSetMemberLocalizationResponse gameCenterLeaderboardSetMemberLocalizationsUpdateInstance(id, gameCenterLeaderboardSetMemberLocalizationUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardSetMemberLocalizationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardSetMemberLocalizationsApi apiInstance = new GameCenterLeaderboardSetMemberLocalizationsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        GameCenterLeaderboardSetMemberLocalizationUpdateRequest gameCenterLeaderboardSetMemberLocalizationUpdateRequest = new GameCenterLeaderboardSetMemberLocalizationUpdateRequest(); // GameCenterLeaderboardSetMemberLocalizationUpdateRequest | GameCenterLeaderboardSetMemberLocalization representation
        try {
            GameCenterLeaderboardSetMemberLocalizationResponse result = apiInstance.gameCenterLeaderboardSetMemberLocalizationsUpdateInstance(id, gameCenterLeaderboardSetMemberLocalizationUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardSetMemberLocalizationsApi#gameCenterLeaderboardSetMemberLocalizationsUpdateInstance");
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
| **gameCenterLeaderboardSetMemberLocalizationUpdateRequest** | [**GameCenterLeaderboardSetMemberLocalizationUpdateRequest**](GameCenterLeaderboardSetMemberLocalizationUpdateRequest.md)| GameCenterLeaderboardSetMemberLocalization representation | |

### Return type

[**GameCenterLeaderboardSetMemberLocalizationResponse**](GameCenterLeaderboardSetMemberLocalizationResponse.md)

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
| **200** | Single GameCenterLeaderboardSetMemberLocalization |  -  |
| **409** | Request entity error(s) |  -  |

