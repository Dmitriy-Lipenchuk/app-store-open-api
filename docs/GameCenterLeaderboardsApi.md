# GameCenterLeaderboardsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**gameCenterLeaderboardsCreateInstance**](GameCenterLeaderboardsApi.md#gameCenterLeaderboardsCreateInstance) | **POST** /v1/gameCenterLeaderboards |  |
| [**gameCenterLeaderboardsDeleteInstance**](GameCenterLeaderboardsApi.md#gameCenterLeaderboardsDeleteInstance) | **DELETE** /v1/gameCenterLeaderboards/{id} |  |
| [**gameCenterLeaderboardsGetInstance**](GameCenterLeaderboardsApi.md#gameCenterLeaderboardsGetInstance) | **GET** /v1/gameCenterLeaderboards/{id} |  |
| [**gameCenterLeaderboardsGroupLeaderboardGetToOneRelated**](GameCenterLeaderboardsApi.md#gameCenterLeaderboardsGroupLeaderboardGetToOneRelated) | **GET** /v1/gameCenterLeaderboards/{id}/groupLeaderboard |  |
| [**gameCenterLeaderboardsGroupLeaderboardGetToOneRelationship**](GameCenterLeaderboardsApi.md#gameCenterLeaderboardsGroupLeaderboardGetToOneRelationship) | **GET** /v1/gameCenterLeaderboards/{id}/relationships/groupLeaderboard |  |
| [**gameCenterLeaderboardsGroupLeaderboardUpdateToOneRelationship**](GameCenterLeaderboardsApi.md#gameCenterLeaderboardsGroupLeaderboardUpdateToOneRelationship) | **PATCH** /v1/gameCenterLeaderboards/{id}/relationships/groupLeaderboard |  |
| [**gameCenterLeaderboardsLocalizationsGetToManyRelated**](GameCenterLeaderboardsApi.md#gameCenterLeaderboardsLocalizationsGetToManyRelated) | **GET** /v1/gameCenterLeaderboards/{id}/localizations |  |
| [**gameCenterLeaderboardsReleasesGetToManyRelated**](GameCenterLeaderboardsApi.md#gameCenterLeaderboardsReleasesGetToManyRelated) | **GET** /v1/gameCenterLeaderboards/{id}/releases |  |
| [**gameCenterLeaderboardsUpdateInstance**](GameCenterLeaderboardsApi.md#gameCenterLeaderboardsUpdateInstance) | **PATCH** /v1/gameCenterLeaderboards/{id} |  |



## gameCenterLeaderboardsCreateInstance

> GameCenterLeaderboardResponse gameCenterLeaderboardsCreateInstance(gameCenterLeaderboardCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardsApi apiInstance = new GameCenterLeaderboardsApi(defaultClient);
        GameCenterLeaderboardCreateRequest gameCenterLeaderboardCreateRequest = new GameCenterLeaderboardCreateRequest(); // GameCenterLeaderboardCreateRequest | GameCenterLeaderboard representation
        try {
            GameCenterLeaderboardResponse result = apiInstance.gameCenterLeaderboardsCreateInstance(gameCenterLeaderboardCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardsApi#gameCenterLeaderboardsCreateInstance");
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
| **gameCenterLeaderboardCreateRequest** | [**GameCenterLeaderboardCreateRequest**](GameCenterLeaderboardCreateRequest.md)| GameCenterLeaderboard representation | |

### Return type

[**GameCenterLeaderboardResponse**](GameCenterLeaderboardResponse.md)

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
| **201** | Single GameCenterLeaderboard |  -  |
| **409** | Request entity error(s) |  -  |


## gameCenterLeaderboardsDeleteInstance

> gameCenterLeaderboardsDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardsApi apiInstance = new GameCenterLeaderboardsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.gameCenterLeaderboardsDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardsApi#gameCenterLeaderboardsDeleteInstance");
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


## gameCenterLeaderboardsGetInstance

> GameCenterLeaderboardResponse gameCenterLeaderboardsGetInstance(id, fieldsGameCenterLeaderboards, include, fieldsGameCenterLeaderboardLocalizations, fieldsGameCenterLeaderboardReleases, limitGameCenterLeaderboardSets, limitLocalizations, limitReleases)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardsApi apiInstance = new GameCenterLeaderboardsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsGameCenterLeaderboards = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboards
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsGameCenterLeaderboardLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardLocalizations
        List<String> fieldsGameCenterLeaderboardReleases = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardReleases
        Integer limitGameCenterLeaderboardSets = 56; // Integer | maximum number of related gameCenterLeaderboardSets returned (when they are included)
        Integer limitLocalizations = 56; // Integer | maximum number of related localizations returned (when they are included)
        Integer limitReleases = 56; // Integer | maximum number of related releases returned (when they are included)
        try {
            GameCenterLeaderboardResponse result = apiInstance.gameCenterLeaderboardsGetInstance(id, fieldsGameCenterLeaderboards, include, fieldsGameCenterLeaderboardLocalizations, fieldsGameCenterLeaderboardReleases, limitGameCenterLeaderboardSets, limitLocalizations, limitReleases);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardsApi#gameCenterLeaderboardsGetInstance");
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
| **fieldsGameCenterLeaderboards** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboards | [optional] [enum: archived, defaultFormatter, gameCenterDetail, gameCenterGroup, gameCenterLeaderboardSets, groupLeaderboard, localizations, recurrenceDuration, recurrenceRule, recurrenceStartDate, referenceName, releases, scoreRangeEnd, scoreRangeStart, scoreSortType, submissionType, vendorIdentifier] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: gameCenterDetail, gameCenterGroup, gameCenterLeaderboardSets, groupLeaderboard, localizations, releases] |
| **fieldsGameCenterLeaderboardLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboardLocalizations | [optional] [enum: formatterOverride, formatterSuffix, formatterSuffixSingular, gameCenterLeaderboard, gameCenterLeaderboardImage, locale, name] |
| **fieldsGameCenterLeaderboardReleases** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboardReleases | [optional] [enum: gameCenterDetail, gameCenterLeaderboard, live] |
| **limitGameCenterLeaderboardSets** | **Integer**| maximum number of related gameCenterLeaderboardSets returned (when they are included) | [optional] |
| **limitLocalizations** | **Integer**| maximum number of related localizations returned (when they are included) | [optional] |
| **limitReleases** | **Integer**| maximum number of related releases returned (when they are included) | [optional] |

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


## gameCenterLeaderboardsGroupLeaderboardGetToOneRelated

> GameCenterLeaderboardResponse gameCenterLeaderboardsGroupLeaderboardGetToOneRelated(id, fieldsGameCenterLeaderboardLocalizations, fieldsGameCenterLeaderboardSets, fieldsGameCenterGroups, fieldsGameCenterDetails, fieldsGameCenterLeaderboards, fieldsGameCenterLeaderboardReleases, limitGameCenterLeaderboardSets, limitLocalizations, limitReleases, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardsApi apiInstance = new GameCenterLeaderboardsApi(defaultClient);
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
            GameCenterLeaderboardResponse result = apiInstance.gameCenterLeaderboardsGroupLeaderboardGetToOneRelated(id, fieldsGameCenterLeaderboardLocalizations, fieldsGameCenterLeaderboardSets, fieldsGameCenterGroups, fieldsGameCenterDetails, fieldsGameCenterLeaderboards, fieldsGameCenterLeaderboardReleases, limitGameCenterLeaderboardSets, limitLocalizations, limitReleases, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardsApi#gameCenterLeaderboardsGroupLeaderboardGetToOneRelated");
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


## gameCenterLeaderboardsGroupLeaderboardGetToOneRelationship

> GameCenterLeaderboardGroupLeaderboardLinkageResponse gameCenterLeaderboardsGroupLeaderboardGetToOneRelationship(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardsApi apiInstance = new GameCenterLeaderboardsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            GameCenterLeaderboardGroupLeaderboardLinkageResponse result = apiInstance.gameCenterLeaderboardsGroupLeaderboardGetToOneRelationship(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardsApi#gameCenterLeaderboardsGroupLeaderboardGetToOneRelationship");
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

[**GameCenterLeaderboardGroupLeaderboardLinkageResponse**](GameCenterLeaderboardGroupLeaderboardLinkageResponse.md)

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


## gameCenterLeaderboardsGroupLeaderboardUpdateToOneRelationship

> gameCenterLeaderboardsGroupLeaderboardUpdateToOneRelationship(id, gameCenterLeaderboardGroupLeaderboardLinkageRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardsApi apiInstance = new GameCenterLeaderboardsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        GameCenterLeaderboardGroupLeaderboardLinkageRequest gameCenterLeaderboardGroupLeaderboardLinkageRequest = new GameCenterLeaderboardGroupLeaderboardLinkageRequest(); // GameCenterLeaderboardGroupLeaderboardLinkageRequest | Related linkage
        try {
            apiInstance.gameCenterLeaderboardsGroupLeaderboardUpdateToOneRelationship(id, gameCenterLeaderboardGroupLeaderboardLinkageRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardsApi#gameCenterLeaderboardsGroupLeaderboardUpdateToOneRelationship");
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
| **gameCenterLeaderboardGroupLeaderboardLinkageRequest** | [**GameCenterLeaderboardGroupLeaderboardLinkageRequest**](GameCenterLeaderboardGroupLeaderboardLinkageRequest.md)| Related linkage | |

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


## gameCenterLeaderboardsLocalizationsGetToManyRelated

> GameCenterLeaderboardLocalizationsResponse gameCenterLeaderboardsLocalizationsGetToManyRelated(id, fieldsGameCenterLeaderboardLocalizations, fieldsGameCenterLeaderboardImages, fieldsGameCenterLeaderboards, limit, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardsApi apiInstance = new GameCenterLeaderboardsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsGameCenterLeaderboardLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardLocalizations
        List<String> fieldsGameCenterLeaderboardImages = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardImages
        List<String> fieldsGameCenterLeaderboards = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboards
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            GameCenterLeaderboardLocalizationsResponse result = apiInstance.gameCenterLeaderboardsLocalizationsGetToManyRelated(id, fieldsGameCenterLeaderboardLocalizations, fieldsGameCenterLeaderboardImages, fieldsGameCenterLeaderboards, limit, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardsApi#gameCenterLeaderboardsLocalizationsGetToManyRelated");
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
| **fieldsGameCenterLeaderboardImages** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboardImages | [optional] [enum: assetDeliveryState, fileName, fileSize, gameCenterLeaderboardLocalization, imageAsset, uploadOperations, uploaded] |
| **fieldsGameCenterLeaderboards** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterLeaderboards | [optional] [enum: archived, defaultFormatter, gameCenterDetail, gameCenterGroup, gameCenterLeaderboardSets, groupLeaderboard, localizations, recurrenceDuration, recurrenceRule, recurrenceStartDate, referenceName, releases, scoreRangeEnd, scoreRangeStart, scoreSortType, submissionType, vendorIdentifier] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: gameCenterLeaderboard, gameCenterLeaderboardImage] |

### Return type

[**GameCenterLeaderboardLocalizationsResponse**](GameCenterLeaderboardLocalizationsResponse.md)

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
| **200** | List of GameCenterLeaderboardLocalizations |  -  |


## gameCenterLeaderboardsReleasesGetToManyRelated

> GameCenterLeaderboardReleasesResponse gameCenterLeaderboardsReleasesGetToManyRelated(id, filterLive, filterGameCenterDetail, fieldsGameCenterDetails, fieldsGameCenterLeaderboards, fieldsGameCenterLeaderboardReleases, limit, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardsApi apiInstance = new GameCenterLeaderboardsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> filterLive = Arrays.asList(); // List<String> | filter by attribute 'live'
        List<String> filterGameCenterDetail = Arrays.asList(); // List<String> | filter by id(s) of related 'gameCenterDetail'
        List<String> fieldsGameCenterDetails = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterDetails
        List<String> fieldsGameCenterLeaderboards = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboards
        List<String> fieldsGameCenterLeaderboardReleases = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterLeaderboardReleases
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            GameCenterLeaderboardReleasesResponse result = apiInstance.gameCenterLeaderboardsReleasesGetToManyRelated(id, filterLive, filterGameCenterDetail, fieldsGameCenterDetails, fieldsGameCenterLeaderboards, fieldsGameCenterLeaderboardReleases, limit, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardsApi#gameCenterLeaderboardsReleasesGetToManyRelated");
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


## gameCenterLeaderboardsUpdateInstance

> GameCenterLeaderboardResponse gameCenterLeaderboardsUpdateInstance(id, gameCenterLeaderboardUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterLeaderboardsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterLeaderboardsApi apiInstance = new GameCenterLeaderboardsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        GameCenterLeaderboardUpdateRequest gameCenterLeaderboardUpdateRequest = new GameCenterLeaderboardUpdateRequest(); // GameCenterLeaderboardUpdateRequest | GameCenterLeaderboard representation
        try {
            GameCenterLeaderboardResponse result = apiInstance.gameCenterLeaderboardsUpdateInstance(id, gameCenterLeaderboardUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterLeaderboardsApi#gameCenterLeaderboardsUpdateInstance");
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
| **gameCenterLeaderboardUpdateRequest** | [**GameCenterLeaderboardUpdateRequest**](GameCenterLeaderboardUpdateRequest.md)| GameCenterLeaderboard representation | |

### Return type

[**GameCenterLeaderboardResponse**](GameCenterLeaderboardResponse.md)

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
| **200** | Single GameCenterLeaderboard |  -  |
| **409** | Request entity error(s) |  -  |

