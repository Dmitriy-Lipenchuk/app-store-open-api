# GameCenterLeaderboardSetsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**gameCenterLeaderboardSetsCreateInstance**](GameCenterLeaderboardSetsApi.md#gameCenterLeaderboardSetsCreateInstance) | **POST** /v1/gameCenterLeaderboardSets |  |
| [**gameCenterLeaderboardSetsDeleteInstance**](GameCenterLeaderboardSetsApi.md#gameCenterLeaderboardSetsDeleteInstance) | **DELETE** /v1/gameCenterLeaderboardSets/{id} |  |
| [**gameCenterLeaderboardSetsGameCenterLeaderboardsCreateToManyRelationship**](GameCenterLeaderboardSetsApi.md#gameCenterLeaderboardSetsGameCenterLeaderboardsCreateToManyRelationship) | **POST** /v1/gameCenterLeaderboardSets/{id}/relationships/gameCenterLeaderboards |  |
| [**gameCenterLeaderboardSetsGameCenterLeaderboardsDeleteToManyRelationship**](GameCenterLeaderboardSetsApi.md#gameCenterLeaderboardSetsGameCenterLeaderboardsDeleteToManyRelationship) | **DELETE** /v1/gameCenterLeaderboardSets/{id}/relationships/gameCenterLeaderboards |  |
| [**gameCenterLeaderboardSetsGameCenterLeaderboardsGetToManyRelated**](GameCenterLeaderboardSetsApi.md#gameCenterLeaderboardSetsGameCenterLeaderboardsGetToManyRelated) | **GET** /v1/gameCenterLeaderboardSets/{id}/gameCenterLeaderboards |  |
| [**gameCenterLeaderboardSetsGameCenterLeaderboardsGetToManyRelationship**](GameCenterLeaderboardSetsApi.md#gameCenterLeaderboardSetsGameCenterLeaderboardsGetToManyRelationship) | **GET** /v1/gameCenterLeaderboardSets/{id}/relationships/gameCenterLeaderboards |  |
| [**gameCenterLeaderboardSetsGameCenterLeaderboardsReplaceToManyRelationship**](GameCenterLeaderboardSetsApi.md#gameCenterLeaderboardSetsGameCenterLeaderboardsReplaceToManyRelationship) | **PATCH** /v1/gameCenterLeaderboardSets/{id}/relationships/gameCenterLeaderboards |  |
| [**gameCenterLeaderboardSetsGetInstance**](GameCenterLeaderboardSetsApi.md#gameCenterLeaderboardSetsGetInstance) | **GET** /v1/gameCenterLeaderboardSets/{id} |  |
| [**gameCenterLeaderboardSetsGroupLeaderboardSetGetToOneRelated**](GameCenterLeaderboardSetsApi.md#gameCenterLeaderboardSetsGroupLeaderboardSetGetToOneRelated) | **GET** /v1/gameCenterLeaderboardSets/{id}/groupLeaderboardSet |  |
| [**gameCenterLeaderboardSetsGroupLeaderboardSetGetToOneRelationship**](GameCenterLeaderboardSetsApi.md#gameCenterLeaderboardSetsGroupLeaderboardSetGetToOneRelationship) | **GET** /v1/gameCenterLeaderboardSets/{id}/relationships/groupLeaderboardSet |  |
| [**gameCenterLeaderboardSetsGroupLeaderboardSetUpdateToOneRelationship**](GameCenterLeaderboardSetsApi.md#gameCenterLeaderboardSetsGroupLeaderboardSetUpdateToOneRelationship) | **PATCH** /v1/gameCenterLeaderboardSets/{id}/relationships/groupLeaderboardSet |  |
| [**gameCenterLeaderboardSetsLocalizationsGetToManyRelated**](GameCenterLeaderboardSetsApi.md#gameCenterLeaderboardSetsLocalizationsGetToManyRelated) | **GET** /v1/gameCenterLeaderboardSets/{id}/localizations |  |
| [**gameCenterLeaderboardSetsReleasesGetToManyRelated**](GameCenterLeaderboardSetsApi.md#gameCenterLeaderboardSetsReleasesGetToManyRelated) | **GET** /v1/gameCenterLeaderboardSets/{id}/releases |  |
| [**gameCenterLeaderboardSetsUpdateInstance**](GameCenterLeaderboardSetsApi.md#gameCenterLeaderboardSetsUpdateInstance) | **PATCH** /v1/gameCenterLeaderboardSets/{id} |  |



## gameCenterLeaderboardSetsCreateInstance

> GameCenterLeaderboardSetResponse gameCenterLeaderboardSetsCreateInstance(gameCenterLeaderboardSetCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardSetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardSetsApi apiInstance = new GameCenterLeaderboardSetsApi(defaultClient);
        GameCenterLeaderboardSetCreateRequest gameCenterLeaderboardSetCreateRequest = new GameCenterLeaderboardSetCreateRequest(); // GameCenterLeaderboardSetCreateRequest | GameCenterLeaderboardSet representation
        try {
            GameCenterLeaderboardSetResponse result = apiInstance.gameCenterLeaderboardSetsCreateInstance(gameCenterLeaderboardSetCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardSetsApi#gameCenterLeaderboardSetsCreateInstance");
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
| **gameCenterLeaderboardSetCreateRequest** | [**GameCenterLeaderboardSetCreateRequest**](GameCenterLeaderboardSetCreateRequest.md)| GameCenterLeaderboardSet representation | |

### Return type

[**GameCenterLeaderboardSetResponse**](GameCenterLeaderboardSetResponse.md)

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
| **201** | Single GameCenterLeaderboardSet |  -  |
| **409** | Request entity error(s) |  -  |


## gameCenterLeaderboardSetsDeleteInstance

> gameCenterLeaderboardSetsDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardSetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardSetsApi apiInstance = new GameCenterLeaderboardSetsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.gameCenterLeaderboardSetsDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardSetsApi#gameCenterLeaderboardSetsDeleteInstance");
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


## gameCenterLeaderboardSetsGameCenterLeaderboardsCreateToManyRelationship

> gameCenterLeaderboardSetsGameCenterLeaderboardsCreateToManyRelationship(id, gameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardSetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardSetsApi apiInstance = new GameCenterLeaderboardSetsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        GameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest gameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest = new GameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest(); // GameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest | List of related linkages
        try {
            apiInstance.gameCenterLeaderboardSetsGameCenterLeaderboardsCreateToManyRelationship(id, gameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardSetsApi#gameCenterLeaderboardSetsGameCenterLeaderboardsCreateToManyRelationship");
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
| **gameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest** | [**GameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest**](GameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest.md)| List of related linkages | |

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


## gameCenterLeaderboardSetsGameCenterLeaderboardsDeleteToManyRelationship

> gameCenterLeaderboardSetsGameCenterLeaderboardsDeleteToManyRelationship(id, gameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardSetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardSetsApi apiInstance = new GameCenterLeaderboardSetsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        GameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest gameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest = new GameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest(); // GameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest | List of related linkages
        try {
            apiInstance.gameCenterLeaderboardSetsGameCenterLeaderboardsDeleteToManyRelationship(id, gameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardSetsApi#gameCenterLeaderboardSetsGameCenterLeaderboardsDeleteToManyRelationship");
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
| **gameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest** | [**GameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest**](GameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest.md)| List of related linkages | |

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


## gameCenterLeaderboardSetsGameCenterLeaderboardsGetToManyRelated

> GameCenterLeaderboardsResponse gameCenterLeaderboardSetsGameCenterLeaderboardsGetToManyRelated(id, filterArchived, filterReferenceName, filterId, fieldsGameCenterLeaderboardLocalizations, fieldsGameCenterLeaderboardSets, fieldsGameCenterGroups, fieldsGameCenterDetails, fieldsGameCenterLeaderboards, fieldsGameCenterLeaderboardReleases, limit, limitGameCenterLeaderboardSets, limitLocalizations, limitReleases, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardSetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardSetsApi apiInstance = new GameCenterLeaderboardSetsApi(defaultClient);
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
            GameCenterLeaderboardsResponse result = apiInstance.gameCenterLeaderboardSetsGameCenterLeaderboardsGetToManyRelated(id, filterArchived, filterReferenceName, filterId, fieldsGameCenterLeaderboardLocalizations, fieldsGameCenterLeaderboardSets, fieldsGameCenterGroups, fieldsGameCenterDetails, fieldsGameCenterLeaderboards, fieldsGameCenterLeaderboardReleases, limit, limitGameCenterLeaderboardSets, limitLocalizations, limitReleases, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardSetsApi#gameCenterLeaderboardSetsGameCenterLeaderboardsGetToManyRelated");
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


## gameCenterLeaderboardSetsGameCenterLeaderboardsGetToManyRelationship

> GameCenterLeaderboardSetGameCenterLeaderboardsLinkagesResponse gameCenterLeaderboardSetsGameCenterLeaderboardsGetToManyRelationship(id, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardSetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardSetsApi apiInstance = new GameCenterLeaderboardSetsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        Integer limit = 56; // Integer | maximum resources per page
        try {
            GameCenterLeaderboardSetGameCenterLeaderboardsLinkagesResponse result = apiInstance.gameCenterLeaderboardSetsGameCenterLeaderboardsGetToManyRelationship(id, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardSetsApi#gameCenterLeaderboardSetsGameCenterLeaderboardsGetToManyRelationship");
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

[**GameCenterLeaderboardSetGameCenterLeaderboardsLinkagesResponse**](GameCenterLeaderboardSetGameCenterLeaderboardsLinkagesResponse.md)

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


## gameCenterLeaderboardSetsGameCenterLeaderboardsReplaceToManyRelationship

> gameCenterLeaderboardSetsGameCenterLeaderboardsReplaceToManyRelationship(id, gameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardSetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardSetsApi apiInstance = new GameCenterLeaderboardSetsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        GameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest gameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest = new GameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest(); // GameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest | List of related linkages
        try {
            apiInstance.gameCenterLeaderboardSetsGameCenterLeaderboardsReplaceToManyRelationship(id, gameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardSetsApi#gameCenterLeaderboardSetsGameCenterLeaderboardsReplaceToManyRelationship");
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
| **gameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest** | [**GameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest**](GameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest.md)| List of related linkages | |

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


## gameCenterLeaderboardSetsGetInstance

> GameCenterLeaderboardSetResponse gameCenterLeaderboardSetsGetInstance(id, fieldsGameCenterLeaderboardSets, include, fieldsGameCenterLeaderboardSetLocalizations, fieldsGameCenterLeaderboardSetReleases, fieldsGameCenterLeaderboards, limitGameCenterLeaderboards, limitLocalizations, limitReleases)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardSetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardSetsApi apiInstance = new GameCenterLeaderboardSetsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsGameCenterLeaderboardSets = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardSets
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsGameCenterLeaderboardSetLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardSetLocalizations
        List<String> fieldsGameCenterLeaderboardSetReleases = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardSetReleases
        List<String> fieldsGameCenterLeaderboards = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboards
        Integer limitGameCenterLeaderboards = 56; // Integer | maximum number of related gameCenterLeaderboards returned (when they are included)
        Integer limitLocalizations = 56; // Integer | maximum number of related localizations returned (when they are included)
        Integer limitReleases = 56; // Integer | maximum number of related releases returned (when they are included)
        try {
            GameCenterLeaderboardSetResponse result = apiInstance.gameCenterLeaderboardSetsGetInstance(id, fieldsGameCenterLeaderboardSets, include, fieldsGameCenterLeaderboardSetLocalizations, fieldsGameCenterLeaderboardSetReleases, fieldsGameCenterLeaderboards, limitGameCenterLeaderboards, limitLocalizations, limitReleases);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardSetsApi#gameCenterLeaderboardSetsGetInstance");
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
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: gameCenterDetail, gameCenterGroup, gameCenterLeaderboards, groupLeaderboardSet, localizations, releases] |
| **fieldsGameCenterLeaderboardSetLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboardSetLocalizations | [optional] [enum: gameCenterLeaderboardSet, gameCenterLeaderboardSetImage, locale, name] |
| **fieldsGameCenterLeaderboardSetReleases** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboardSetReleases | [optional] [enum: gameCenterDetail, gameCenterLeaderboardSet, live] |
| **fieldsGameCenterLeaderboards** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboards | [optional] [enum: archived, defaultFormatter, gameCenterDetail, gameCenterGroup, gameCenterLeaderboardSets, groupLeaderboard, localizations, recurrenceDuration, recurrenceRule, recurrenceStartDate, referenceName, releases, scoreRangeEnd, scoreRangeStart, scoreSortType, submissionType, vendorIdentifier] |
| **limitGameCenterLeaderboards** | **Integer**| maximum number of related gameCenterLeaderboards returned (when they are included) | [optional] |
| **limitLocalizations** | **Integer**| maximum number of related localizations returned (when they are included) | [optional] |
| **limitReleases** | **Integer**| maximum number of related releases returned (when they are included) | [optional] |

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


## gameCenterLeaderboardSetsGroupLeaderboardSetGetToOneRelated

> GameCenterLeaderboardSetResponse gameCenterLeaderboardSetsGroupLeaderboardSetGetToOneRelated(id, fieldsGameCenterLeaderboardSetLocalizations, fieldsGameCenterLeaderboardSetReleases, fieldsGameCenterLeaderboardSets, fieldsGameCenterGroups, fieldsGameCenterDetails, fieldsGameCenterLeaderboards, limitLocalizations, limitGameCenterLeaderboards, limitReleases, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardSetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardSetsApi apiInstance = new GameCenterLeaderboardSetsApi(defaultClient);
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
            GameCenterLeaderboardSetResponse result = apiInstance.gameCenterLeaderboardSetsGroupLeaderboardSetGetToOneRelated(id, fieldsGameCenterLeaderboardSetLocalizations, fieldsGameCenterLeaderboardSetReleases, fieldsGameCenterLeaderboardSets, fieldsGameCenterGroups, fieldsGameCenterDetails, fieldsGameCenterLeaderboards, limitLocalizations, limitGameCenterLeaderboards, limitReleases, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardSetsApi#gameCenterLeaderboardSetsGroupLeaderboardSetGetToOneRelated");
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


## gameCenterLeaderboardSetsGroupLeaderboardSetGetToOneRelationship

> GameCenterLeaderboardSetGroupLeaderboardSetLinkageResponse gameCenterLeaderboardSetsGroupLeaderboardSetGetToOneRelationship(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardSetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardSetsApi apiInstance = new GameCenterLeaderboardSetsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            GameCenterLeaderboardSetGroupLeaderboardSetLinkageResponse result = apiInstance.gameCenterLeaderboardSetsGroupLeaderboardSetGetToOneRelationship(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardSetsApi#gameCenterLeaderboardSetsGroupLeaderboardSetGetToOneRelationship");
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

[**GameCenterLeaderboardSetGroupLeaderboardSetLinkageResponse**](GameCenterLeaderboardSetGroupLeaderboardSetLinkageResponse.md)

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
| **200** | Related linkage |  -  |


## gameCenterLeaderboardSetsGroupLeaderboardSetUpdateToOneRelationship

> gameCenterLeaderboardSetsGroupLeaderboardSetUpdateToOneRelationship(id, gameCenterLeaderboardSetGroupLeaderboardSetLinkageRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardSetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardSetsApi apiInstance = new GameCenterLeaderboardSetsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        GameCenterLeaderboardSetGroupLeaderboardSetLinkageRequest gameCenterLeaderboardSetGroupLeaderboardSetLinkageRequest = new GameCenterLeaderboardSetGroupLeaderboardSetLinkageRequest(); // GameCenterLeaderboardSetGroupLeaderboardSetLinkageRequest | Related linkage
        try {
            apiInstance.gameCenterLeaderboardSetsGroupLeaderboardSetUpdateToOneRelationship(id, gameCenterLeaderboardSetGroupLeaderboardSetLinkageRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardSetsApi#gameCenterLeaderboardSetsGroupLeaderboardSetUpdateToOneRelationship");
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
| **gameCenterLeaderboardSetGroupLeaderboardSetLinkageRequest** | [**GameCenterLeaderboardSetGroupLeaderboardSetLinkageRequest**](GameCenterLeaderboardSetGroupLeaderboardSetLinkageRequest.md)| Related linkage | |

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


## gameCenterLeaderboardSetsLocalizationsGetToManyRelated

> GameCenterLeaderboardSetLocalizationsResponse gameCenterLeaderboardSetsLocalizationsGetToManyRelated(id, fieldsGameCenterLeaderboardSetLocalizations, fieldsGameCenterLeaderboardSets, fieldsGameCenterLeaderboardSetImages, limit, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardSetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardSetsApi apiInstance = new GameCenterLeaderboardSetsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsGameCenterLeaderboardSetLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardSetLocalizations
        List<String> fieldsGameCenterLeaderboardSets = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardSets
        List<String> fieldsGameCenterLeaderboardSetImages = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardSetImages
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            GameCenterLeaderboardSetLocalizationsResponse result = apiInstance.gameCenterLeaderboardSetsLocalizationsGetToManyRelated(id, fieldsGameCenterLeaderboardSetLocalizations, fieldsGameCenterLeaderboardSets, fieldsGameCenterLeaderboardSetImages, limit, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardSetsApi#gameCenterLeaderboardSetsLocalizationsGetToManyRelated");
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
| **fieldsGameCenterLeaderboardSets** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboardSets | [optional] [enum: gameCenterDetail, gameCenterGroup, gameCenterLeaderboards, groupLeaderboardSet, localizations, referenceName, releases, vendorIdentifier] |
| **fieldsGameCenterLeaderboardSetImages** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboardSetImages | [optional] [enum: assetDeliveryState, fileName, fileSize, gameCenterLeaderboardSetLocalization, imageAsset, uploadOperations, uploaded] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: gameCenterLeaderboardSet, gameCenterLeaderboardSetImage] |

### Return type

[**GameCenterLeaderboardSetLocalizationsResponse**](GameCenterLeaderboardSetLocalizationsResponse.md)

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
| **200** | List of GameCenterLeaderboardSetLocalizations |  -  |


## gameCenterLeaderboardSetsReleasesGetToManyRelated

> GameCenterLeaderboardSetReleasesResponse gameCenterLeaderboardSetsReleasesGetToManyRelated(id, filterLive, filterGameCenterDetail, fieldsGameCenterLeaderboardSetReleases, fieldsGameCenterLeaderboardSets, fieldsGameCenterDetails, limit, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardSetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardSetsApi apiInstance = new GameCenterLeaderboardSetsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> filterLive = Arrays.asList(); // List<String> | filter by attribute 'live'
        List<String> filterGameCenterDetail = Arrays.asList(); // List<String> | filter by id(s) of related 'gameCenterDetail'
        List<String> fieldsGameCenterLeaderboardSetReleases = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardSetReleases
        List<String> fieldsGameCenterLeaderboardSets = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardSets
        List<String> fieldsGameCenterDetails = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterDetails
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            GameCenterLeaderboardSetReleasesResponse result = apiInstance.gameCenterLeaderboardSetsReleasesGetToManyRelated(id, filterLive, filterGameCenterDetail, fieldsGameCenterLeaderboardSetReleases, fieldsGameCenterLeaderboardSets, fieldsGameCenterDetails, limit, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardSetsApi#gameCenterLeaderboardSetsReleasesGetToManyRelated");
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
| **filterGameCenterDetail** | **List&lt;String&gt;**| filter by id(s) of related &#39;gameCenterDetail&#39; | [optional] |
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


## gameCenterLeaderboardSetsUpdateInstance

> GameCenterLeaderboardSetResponse gameCenterLeaderboardSetsUpdateInstance(id, gameCenterLeaderboardSetUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardSetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardSetsApi apiInstance = new GameCenterLeaderboardSetsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        GameCenterLeaderboardSetUpdateRequest gameCenterLeaderboardSetUpdateRequest = new GameCenterLeaderboardSetUpdateRequest(); // GameCenterLeaderboardSetUpdateRequest | GameCenterLeaderboardSet representation
        try {
            GameCenterLeaderboardSetResponse result = apiInstance.gameCenterLeaderboardSetsUpdateInstance(id, gameCenterLeaderboardSetUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardSetsApi#gameCenterLeaderboardSetsUpdateInstance");
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
| **gameCenterLeaderboardSetUpdateRequest** | [**GameCenterLeaderboardSetUpdateRequest**](GameCenterLeaderboardSetUpdateRequest.md)| GameCenterLeaderboardSet representation | |

### Return type

[**GameCenterLeaderboardSetResponse**](GameCenterLeaderboardSetResponse.md)

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
| **200** | Single GameCenterLeaderboardSet |  -  |
| **409** | Request entity error(s) |  -  |

