# GameCenterAchievementsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**gameCenterAchievementsCreateInstance**](GameCenterAchievementsApi.md#gameCenterAchievementsCreateInstance) | **POST** /v1/gameCenterAchievements |  |
| [**gameCenterAchievementsDeleteInstance**](GameCenterAchievementsApi.md#gameCenterAchievementsDeleteInstance) | **DELETE** /v1/gameCenterAchievements/{id} |  |
| [**gameCenterAchievementsGetInstance**](GameCenterAchievementsApi.md#gameCenterAchievementsGetInstance) | **GET** /v1/gameCenterAchievements/{id} |  |
| [**gameCenterAchievementsGroupAchievementGetToOneRelated**](GameCenterAchievementsApi.md#gameCenterAchievementsGroupAchievementGetToOneRelated) | **GET** /v1/gameCenterAchievements/{id}/groupAchievement |  |
| [**gameCenterAchievementsGroupAchievementGetToOneRelationship**](GameCenterAchievementsApi.md#gameCenterAchievementsGroupAchievementGetToOneRelationship) | **GET** /v1/gameCenterAchievements/{id}/relationships/groupAchievement |  |
| [**gameCenterAchievementsGroupAchievementUpdateToOneRelationship**](GameCenterAchievementsApi.md#gameCenterAchievementsGroupAchievementUpdateToOneRelationship) | **PATCH** /v1/gameCenterAchievements/{id}/relationships/groupAchievement |  |
| [**gameCenterAchievementsLocalizationsGetToManyRelated**](GameCenterAchievementsApi.md#gameCenterAchievementsLocalizationsGetToManyRelated) | **GET** /v1/gameCenterAchievements/{id}/localizations |  |
| [**gameCenterAchievementsReleasesGetToManyRelated**](GameCenterAchievementsApi.md#gameCenterAchievementsReleasesGetToManyRelated) | **GET** /v1/gameCenterAchievements/{id}/releases |  |
| [**gameCenterAchievementsUpdateInstance**](GameCenterAchievementsApi.md#gameCenterAchievementsUpdateInstance) | **PATCH** /v1/gameCenterAchievements/{id} |  |



## gameCenterAchievementsCreateInstance

> GameCenterAchievementResponse gameCenterAchievementsCreateInstance(gameCenterAchievementCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterAchievementsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterAchievementsApi apiInstance = new GameCenterAchievementsApi(defaultClient);
        GameCenterAchievementCreateRequest gameCenterAchievementCreateRequest = new GameCenterAchievementCreateRequest(); // GameCenterAchievementCreateRequest | GameCenterAchievement representation
        try {
            GameCenterAchievementResponse result = apiInstance.gameCenterAchievementsCreateInstance(gameCenterAchievementCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterAchievementsApi#gameCenterAchievementsCreateInstance");
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
| **gameCenterAchievementCreateRequest** | [**GameCenterAchievementCreateRequest**](GameCenterAchievementCreateRequest.md)| GameCenterAchievement representation | |

### Return type

[**GameCenterAchievementResponse**](GameCenterAchievementResponse.md)

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
| **201** | Single GameCenterAchievement |  -  |
| **409** | Request entity error(s) |  -  |


## gameCenterAchievementsDeleteInstance

> gameCenterAchievementsDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterAchievementsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterAchievementsApi apiInstance = new GameCenterAchievementsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.gameCenterAchievementsDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterAchievementsApi#gameCenterAchievementsDeleteInstance");
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


## gameCenterAchievementsGetInstance

> GameCenterAchievementResponse gameCenterAchievementsGetInstance(id, fieldsGameCenterAchievements, include, fieldsGameCenterAchievementReleases, fieldsGameCenterAchievementLocalizations, limitLocalizations, limitReleases)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterAchievementsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterAchievementsApi apiInstance = new GameCenterAchievementsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsGameCenterAchievements = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterAchievements
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsGameCenterAchievementReleases = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterAchievementReleases
        List<String> fieldsGameCenterAchievementLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterAchievementLocalizations
        Integer limitLocalizations = 56; // Integer | maximum number of related localizations returned (when they are included)
        Integer limitReleases = 56; // Integer | maximum number of related releases returned (when they are included)
        try {
            GameCenterAchievementResponse result = apiInstance.gameCenterAchievementsGetInstance(id, fieldsGameCenterAchievements, include, fieldsGameCenterAchievementReleases, fieldsGameCenterAchievementLocalizations, limitLocalizations, limitReleases);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterAchievementsApi#gameCenterAchievementsGetInstance");
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
| **fieldsGameCenterAchievements** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterAchievements | [optional] [enum: archived, gameCenterDetail, gameCenterGroup, groupAchievement, localizations, points, referenceName, releases, repeatable, showBeforeEarned, vendorIdentifier] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: gameCenterDetail, gameCenterGroup, groupAchievement, localizations, releases] |
| **fieldsGameCenterAchievementReleases** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterAchievementReleases | [optional] [enum: gameCenterAchievement, gameCenterDetail, live] |
| **fieldsGameCenterAchievementLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterAchievementLocalizations | [optional] [enum: afterEarnedDescription, beforeEarnedDescription, gameCenterAchievement, gameCenterAchievementImage, locale, name] |
| **limitLocalizations** | **Integer**| maximum number of related localizations returned (when they are included) | [optional] |
| **limitReleases** | **Integer**| maximum number of related releases returned (when they are included) | [optional] |

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


## gameCenterAchievementsGroupAchievementGetToOneRelated

> GameCenterAchievementResponse gameCenterAchievementsGroupAchievementGetToOneRelated(id, fieldsGameCenterAchievementReleases, fieldsGameCenterGroups, fieldsGameCenterDetails, fieldsGameCenterAchievementLocalizations, fieldsGameCenterAchievements, limitLocalizations, limitReleases, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterAchievementsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterAchievementsApi apiInstance = new GameCenterAchievementsApi(defaultClient);
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
            GameCenterAchievementResponse result = apiInstance.gameCenterAchievementsGroupAchievementGetToOneRelated(id, fieldsGameCenterAchievementReleases, fieldsGameCenterGroups, fieldsGameCenterDetails, fieldsGameCenterAchievementLocalizations, fieldsGameCenterAchievements, limitLocalizations, limitReleases, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterAchievementsApi#gameCenterAchievementsGroupAchievementGetToOneRelated");
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


## gameCenterAchievementsGroupAchievementGetToOneRelationship

> GameCenterAchievementGroupAchievementLinkageResponse gameCenterAchievementsGroupAchievementGetToOneRelationship(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterAchievementsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterAchievementsApi apiInstance = new GameCenterAchievementsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            GameCenterAchievementGroupAchievementLinkageResponse result = apiInstance.gameCenterAchievementsGroupAchievementGetToOneRelationship(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterAchievementsApi#gameCenterAchievementsGroupAchievementGetToOneRelationship");
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

[**GameCenterAchievementGroupAchievementLinkageResponse**](GameCenterAchievementGroupAchievementLinkageResponse.md)

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


## gameCenterAchievementsGroupAchievementUpdateToOneRelationship

> gameCenterAchievementsGroupAchievementUpdateToOneRelationship(id, gameCenterAchievementGroupAchievementLinkageRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterAchievementsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterAchievementsApi apiInstance = new GameCenterAchievementsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        GameCenterAchievementGroupAchievementLinkageRequest gameCenterAchievementGroupAchievementLinkageRequest = new GameCenterAchievementGroupAchievementLinkageRequest(); // GameCenterAchievementGroupAchievementLinkageRequest | Related linkage
        try {
            apiInstance.gameCenterAchievementsGroupAchievementUpdateToOneRelationship(id, gameCenterAchievementGroupAchievementLinkageRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterAchievementsApi#gameCenterAchievementsGroupAchievementUpdateToOneRelationship");
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
| **gameCenterAchievementGroupAchievementLinkageRequest** | [**GameCenterAchievementGroupAchievementLinkageRequest**](GameCenterAchievementGroupAchievementLinkageRequest.md)| Related linkage | |

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


## gameCenterAchievementsLocalizationsGetToManyRelated

> GameCenterAchievementLocalizationsResponse gameCenterAchievementsLocalizationsGetToManyRelated(id, fieldsGameCenterAchievementImages, fieldsGameCenterAchievementLocalizations, fieldsGameCenterAchievements, limit, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterAchievementsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterAchievementsApi apiInstance = new GameCenterAchievementsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsGameCenterAchievementImages = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterAchievementImages
        List<String> fieldsGameCenterAchievementLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterAchievementLocalizations
        List<String> fieldsGameCenterAchievements = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterAchievements
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            GameCenterAchievementLocalizationsResponse result = apiInstance.gameCenterAchievementsLocalizationsGetToManyRelated(id, fieldsGameCenterAchievementImages, fieldsGameCenterAchievementLocalizations, fieldsGameCenterAchievements, limit, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterAchievementsApi#gameCenterAchievementsLocalizationsGetToManyRelated");
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
| **fieldsGameCenterAchievements** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterAchievements | [optional] [enum: archived, gameCenterDetail, gameCenterGroup, groupAchievement, localizations, points, referenceName, releases, repeatable, showBeforeEarned, vendorIdentifier] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: gameCenterAchievement, gameCenterAchievementImage] |

### Return type

[**GameCenterAchievementLocalizationsResponse**](GameCenterAchievementLocalizationsResponse.md)

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
| **200** | List of GameCenterAchievementLocalizations |  -  |


## gameCenterAchievementsReleasesGetToManyRelated

> GameCenterAchievementReleasesResponse gameCenterAchievementsReleasesGetToManyRelated(id, filterLive, filterGameCenterDetail, fieldsGameCenterAchievementReleases, fieldsGameCenterDetails, fieldsGameCenterAchievements, limit, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterAchievementsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterAchievementsApi apiInstance = new GameCenterAchievementsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> filterLive = Arrays.asList(); // List<String> | filter by attribute 'live'
        List<String> filterGameCenterDetail = Arrays.asList(); // List<String> | filter by id(s) of related 'gameCenterDetail'
        List<String> fieldsGameCenterAchievementReleases = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterAchievementReleases
        List<String> fieldsGameCenterDetails = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterDetails
        List<String> fieldsGameCenterAchievements = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterAchievements
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            GameCenterAchievementReleasesResponse result = apiInstance.gameCenterAchievementsReleasesGetToManyRelated(id, filterLive, filterGameCenterDetail, fieldsGameCenterAchievementReleases, fieldsGameCenterDetails, fieldsGameCenterAchievements, limit, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterAchievementsApi#gameCenterAchievementsReleasesGetToManyRelated");
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


## gameCenterAchievementsUpdateInstance

> GameCenterAchievementResponse gameCenterAchievementsUpdateInstance(id, gameCenterAchievementUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterAchievementsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterAchievementsApi apiInstance = new GameCenterAchievementsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        GameCenterAchievementUpdateRequest gameCenterAchievementUpdateRequest = new GameCenterAchievementUpdateRequest(); // GameCenterAchievementUpdateRequest | GameCenterAchievement representation
        try {
            GameCenterAchievementResponse result = apiInstance.gameCenterAchievementsUpdateInstance(id, gameCenterAchievementUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterAchievementsApi#gameCenterAchievementsUpdateInstance");
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
| **gameCenterAchievementUpdateRequest** | [**GameCenterAchievementUpdateRequest**](GameCenterAchievementUpdateRequest.md)| GameCenterAchievement representation | |

### Return type

[**GameCenterAchievementResponse**](GameCenterAchievementResponse.md)

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
| **200** | Single GameCenterAchievement |  -  |
| **409** | Request entity error(s) |  -  |

