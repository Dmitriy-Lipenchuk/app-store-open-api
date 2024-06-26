# GameCenterMatchmakingRuleSetsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**gameCenterMatchmakingRuleSetsCreateInstance**](GameCenterMatchmakingRuleSetsApi.md#gameCenterMatchmakingRuleSetsCreateInstance) | **POST** /v1/gameCenterMatchmakingRuleSets |  |
| [**gameCenterMatchmakingRuleSetsDeleteInstance**](GameCenterMatchmakingRuleSetsApi.md#gameCenterMatchmakingRuleSetsDeleteInstance) | **DELETE** /v1/gameCenterMatchmakingRuleSets/{id} |  |
| [**gameCenterMatchmakingRuleSetsGetCollection**](GameCenterMatchmakingRuleSetsApi.md#gameCenterMatchmakingRuleSetsGetCollection) | **GET** /v1/gameCenterMatchmakingRuleSets |  |
| [**gameCenterMatchmakingRuleSetsGetInstance**](GameCenterMatchmakingRuleSetsApi.md#gameCenterMatchmakingRuleSetsGetInstance) | **GET** /v1/gameCenterMatchmakingRuleSets/{id} |  |
| [**gameCenterMatchmakingRuleSetsMatchmakingQueuesGetToManyRelated**](GameCenterMatchmakingRuleSetsApi.md#gameCenterMatchmakingRuleSetsMatchmakingQueuesGetToManyRelated) | **GET** /v1/gameCenterMatchmakingRuleSets/{id}/matchmakingQueues |  |
| [**gameCenterMatchmakingRuleSetsRulesGetToManyRelated**](GameCenterMatchmakingRuleSetsApi.md#gameCenterMatchmakingRuleSetsRulesGetToManyRelated) | **GET** /v1/gameCenterMatchmakingRuleSets/{id}/rules |  |
| [**gameCenterMatchmakingRuleSetsTeamsGetToManyRelated**](GameCenterMatchmakingRuleSetsApi.md#gameCenterMatchmakingRuleSetsTeamsGetToManyRelated) | **GET** /v1/gameCenterMatchmakingRuleSets/{id}/teams |  |
| [**gameCenterMatchmakingRuleSetsUpdateInstance**](GameCenterMatchmakingRuleSetsApi.md#gameCenterMatchmakingRuleSetsUpdateInstance) | **PATCH** /v1/gameCenterMatchmakingRuleSets/{id} |  |



## gameCenterMatchmakingRuleSetsCreateInstance

> GameCenterMatchmakingRuleSetResponse gameCenterMatchmakingRuleSetsCreateInstance(gameCenterMatchmakingRuleSetCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterMatchmakingRuleSetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterMatchmakingRuleSetsApi apiInstance = new GameCenterMatchmakingRuleSetsApi(defaultClient);
        GameCenterMatchmakingRuleSetCreateRequest gameCenterMatchmakingRuleSetCreateRequest = new GameCenterMatchmakingRuleSetCreateRequest(); // GameCenterMatchmakingRuleSetCreateRequest | GameCenterMatchmakingRuleSet representation
        try {
            GameCenterMatchmakingRuleSetResponse result = apiInstance.gameCenterMatchmakingRuleSetsCreateInstance(gameCenterMatchmakingRuleSetCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterMatchmakingRuleSetsApi#gameCenterMatchmakingRuleSetsCreateInstance");
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
| **gameCenterMatchmakingRuleSetCreateRequest** | [**GameCenterMatchmakingRuleSetCreateRequest**](GameCenterMatchmakingRuleSetCreateRequest.md)| GameCenterMatchmakingRuleSet representation | |

### Return type

[**GameCenterMatchmakingRuleSetResponse**](GameCenterMatchmakingRuleSetResponse.md)

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
| **201** | Single GameCenterMatchmakingRuleSet |  -  |
| **409** | Request entity error(s) |  -  |


## gameCenterMatchmakingRuleSetsDeleteInstance

> gameCenterMatchmakingRuleSetsDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterMatchmakingRuleSetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterMatchmakingRuleSetsApi apiInstance = new GameCenterMatchmakingRuleSetsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.gameCenterMatchmakingRuleSetsDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterMatchmakingRuleSetsApi#gameCenterMatchmakingRuleSetsDeleteInstance");
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


## gameCenterMatchmakingRuleSetsGetCollection

> GameCenterMatchmakingRuleSetsResponse gameCenterMatchmakingRuleSetsGetCollection(fieldsGameCenterMatchmakingRuleSets, limit, include, fieldsGameCenterMatchmakingQueues, fieldsGameCenterMatchmakingTeams, fieldsGameCenterMatchmakingRules, limitMatchmakingQueues, limitRules, limitTeams)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterMatchmakingRuleSetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterMatchmakingRuleSetsApi apiInstance = new GameCenterMatchmakingRuleSetsApi(defaultClient);
        List<String> fieldsGameCenterMatchmakingRuleSets = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterMatchmakingRuleSets
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsGameCenterMatchmakingQueues = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterMatchmakingQueues
        List<String> fieldsGameCenterMatchmakingTeams = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterMatchmakingTeams
        List<String> fieldsGameCenterMatchmakingRules = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterMatchmakingRules
        Integer limitMatchmakingQueues = 56; // Integer | maximum number of related matchmakingQueues returned (when they are included)
        Integer limitRules = 56; // Integer | maximum number of related rules returned (when they are included)
        Integer limitTeams = 56; // Integer | maximum number of related teams returned (when they are included)
        try {
            GameCenterMatchmakingRuleSetsResponse result = apiInstance.gameCenterMatchmakingRuleSetsGetCollection(fieldsGameCenterMatchmakingRuleSets, limit, include, fieldsGameCenterMatchmakingQueues, fieldsGameCenterMatchmakingTeams, fieldsGameCenterMatchmakingRules, limitMatchmakingQueues, limitRules, limitTeams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterMatchmakingRuleSetsApi#gameCenterMatchmakingRuleSetsGetCollection");
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
| **fieldsGameCenterMatchmakingRuleSets** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterMatchmakingRuleSets | [optional] [enum: matchmakingQueues, maxPlayers, minPlayers, referenceName, ruleLanguageVersion, rules, teams] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: matchmakingQueues, rules, teams] |
| **fieldsGameCenterMatchmakingQueues** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterMatchmakingQueues | [optional] [enum: classicMatchmakingBundleIds, experimentRuleSet, referenceName, ruleSet] |
| **fieldsGameCenterMatchmakingTeams** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterMatchmakingTeams | [optional] [enum: maxPlayers, minPlayers, referenceName, ruleSet] |
| **fieldsGameCenterMatchmakingRules** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterMatchmakingRules | [optional] [enum: description, expression, referenceName, ruleSet, type, weight] |
| **limitMatchmakingQueues** | **Integer**| maximum number of related matchmakingQueues returned (when they are included) | [optional] |
| **limitRules** | **Integer**| maximum number of related rules returned (when they are included) | [optional] |
| **limitTeams** | **Integer**| maximum number of related teams returned (when they are included) | [optional] |

### Return type

[**GameCenterMatchmakingRuleSetsResponse**](GameCenterMatchmakingRuleSetsResponse.md)

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
| **200** | List of GameCenterMatchmakingRuleSets |  -  |


## gameCenterMatchmakingRuleSetsGetInstance

> GameCenterMatchmakingRuleSetResponse gameCenterMatchmakingRuleSetsGetInstance(id, fieldsGameCenterMatchmakingRuleSets, include, fieldsGameCenterMatchmakingQueues, fieldsGameCenterMatchmakingTeams, fieldsGameCenterMatchmakingRules, limitMatchmakingQueues, limitRules, limitTeams)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterMatchmakingRuleSetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterMatchmakingRuleSetsApi apiInstance = new GameCenterMatchmakingRuleSetsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsGameCenterMatchmakingRuleSets = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterMatchmakingRuleSets
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsGameCenterMatchmakingQueues = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterMatchmakingQueues
        List<String> fieldsGameCenterMatchmakingTeams = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterMatchmakingTeams
        List<String> fieldsGameCenterMatchmakingRules = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterMatchmakingRules
        Integer limitMatchmakingQueues = 56; // Integer | maximum number of related matchmakingQueues returned (when they are included)
        Integer limitRules = 56; // Integer | maximum number of related rules returned (when they are included)
        Integer limitTeams = 56; // Integer | maximum number of related teams returned (when they are included)
        try {
            GameCenterMatchmakingRuleSetResponse result = apiInstance.gameCenterMatchmakingRuleSetsGetInstance(id, fieldsGameCenterMatchmakingRuleSets, include, fieldsGameCenterMatchmakingQueues, fieldsGameCenterMatchmakingTeams, fieldsGameCenterMatchmakingRules, limitMatchmakingQueues, limitRules, limitTeams);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterMatchmakingRuleSetsApi#gameCenterMatchmakingRuleSetsGetInstance");
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
| **fieldsGameCenterMatchmakingRuleSets** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterMatchmakingRuleSets | [optional] [enum: matchmakingQueues, maxPlayers, minPlayers, referenceName, ruleLanguageVersion, rules, teams] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: matchmakingQueues, rules, teams] |
| **fieldsGameCenterMatchmakingQueues** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterMatchmakingQueues | [optional] [enum: classicMatchmakingBundleIds, experimentRuleSet, referenceName, ruleSet] |
| **fieldsGameCenterMatchmakingTeams** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterMatchmakingTeams | [optional] [enum: maxPlayers, minPlayers, referenceName, ruleSet] |
| **fieldsGameCenterMatchmakingRules** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterMatchmakingRules | [optional] [enum: description, expression, referenceName, ruleSet, type, weight] |
| **limitMatchmakingQueues** | **Integer**| maximum number of related matchmakingQueues returned (when they are included) | [optional] |
| **limitRules** | **Integer**| maximum number of related rules returned (when they are included) | [optional] |
| **limitTeams** | **Integer**| maximum number of related teams returned (when they are included) | [optional] |

### Return type

[**GameCenterMatchmakingRuleSetResponse**](GameCenterMatchmakingRuleSetResponse.md)

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
| **200** | Single GameCenterMatchmakingRuleSet |  -  |


## gameCenterMatchmakingRuleSetsMatchmakingQueuesGetToManyRelated

> GameCenterMatchmakingQueuesResponse gameCenterMatchmakingRuleSetsMatchmakingQueuesGetToManyRelated(id, fieldsGameCenterMatchmakingQueues, fieldsGameCenterMatchmakingRuleSets, limit, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterMatchmakingRuleSetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterMatchmakingRuleSetsApi apiInstance = new GameCenterMatchmakingRuleSetsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsGameCenterMatchmakingQueues = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterMatchmakingQueues
        List<String> fieldsGameCenterMatchmakingRuleSets = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterMatchmakingRuleSets
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            GameCenterMatchmakingQueuesResponse result = apiInstance.gameCenterMatchmakingRuleSetsMatchmakingQueuesGetToManyRelated(id, fieldsGameCenterMatchmakingQueues, fieldsGameCenterMatchmakingRuleSets, limit, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterMatchmakingRuleSetsApi#gameCenterMatchmakingRuleSetsMatchmakingQueuesGetToManyRelated");
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
| **fieldsGameCenterMatchmakingQueues** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterMatchmakingQueues | [optional] [enum: classicMatchmakingBundleIds, experimentRuleSet, referenceName, ruleSet] |
| **fieldsGameCenterMatchmakingRuleSets** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterMatchmakingRuleSets | [optional] [enum: matchmakingQueues, maxPlayers, minPlayers, referenceName, ruleLanguageVersion, rules, teams] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: experimentRuleSet, ruleSet] |

### Return type

[**GameCenterMatchmakingQueuesResponse**](GameCenterMatchmakingQueuesResponse.md)

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
| **200** | List of GameCenterMatchmakingQueues |  -  |


## gameCenterMatchmakingRuleSetsRulesGetToManyRelated

> GameCenterMatchmakingRulesResponse gameCenterMatchmakingRuleSetsRulesGetToManyRelated(id, fieldsGameCenterMatchmakingRules, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterMatchmakingRuleSetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterMatchmakingRuleSetsApi apiInstance = new GameCenterMatchmakingRuleSetsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsGameCenterMatchmakingRules = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterMatchmakingRules
        Integer limit = 56; // Integer | maximum resources per page
        try {
            GameCenterMatchmakingRulesResponse result = apiInstance.gameCenterMatchmakingRuleSetsRulesGetToManyRelated(id, fieldsGameCenterMatchmakingRules, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterMatchmakingRuleSetsApi#gameCenterMatchmakingRuleSetsRulesGetToManyRelated");
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
| **fieldsGameCenterMatchmakingRules** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterMatchmakingRules | [optional] [enum: description, expression, referenceName, ruleSet, type, weight] |
| **limit** | **Integer**| maximum resources per page | [optional] |

### Return type

[**GameCenterMatchmakingRulesResponse**](GameCenterMatchmakingRulesResponse.md)

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
| **200** | List of GameCenterMatchmakingRules |  -  |


## gameCenterMatchmakingRuleSetsTeamsGetToManyRelated

> GameCenterMatchmakingTeamsResponse gameCenterMatchmakingRuleSetsTeamsGetToManyRelated(id, fieldsGameCenterMatchmakingTeams, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterMatchmakingRuleSetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterMatchmakingRuleSetsApi apiInstance = new GameCenterMatchmakingRuleSetsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsGameCenterMatchmakingTeams = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterMatchmakingTeams
        Integer limit = 56; // Integer | maximum resources per page
        try {
            GameCenterMatchmakingTeamsResponse result = apiInstance.gameCenterMatchmakingRuleSetsTeamsGetToManyRelated(id, fieldsGameCenterMatchmakingTeams, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterMatchmakingRuleSetsApi#gameCenterMatchmakingRuleSetsTeamsGetToManyRelated");
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
| **fieldsGameCenterMatchmakingTeams** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterMatchmakingTeams | [optional] [enum: maxPlayers, minPlayers, referenceName, ruleSet] |
| **limit** | **Integer**| maximum resources per page | [optional] |

### Return type

[**GameCenterMatchmakingTeamsResponse**](GameCenterMatchmakingTeamsResponse.md)

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
| **200** | List of GameCenterMatchmakingTeams |  -  |


## gameCenterMatchmakingRuleSetsUpdateInstance

> GameCenterMatchmakingRuleSetResponse gameCenterMatchmakingRuleSetsUpdateInstance(id, gameCenterMatchmakingRuleSetUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterMatchmakingRuleSetsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterMatchmakingRuleSetsApi apiInstance = new GameCenterMatchmakingRuleSetsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        GameCenterMatchmakingRuleSetUpdateRequest gameCenterMatchmakingRuleSetUpdateRequest = new GameCenterMatchmakingRuleSetUpdateRequest(); // GameCenterMatchmakingRuleSetUpdateRequest | GameCenterMatchmakingRuleSet representation
        try {
            GameCenterMatchmakingRuleSetResponse result = apiInstance.gameCenterMatchmakingRuleSetsUpdateInstance(id, gameCenterMatchmakingRuleSetUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterMatchmakingRuleSetsApi#gameCenterMatchmakingRuleSetsUpdateInstance");
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
| **gameCenterMatchmakingRuleSetUpdateRequest** | [**GameCenterMatchmakingRuleSetUpdateRequest**](GameCenterMatchmakingRuleSetUpdateRequest.md)| GameCenterMatchmakingRuleSet representation | |

### Return type

[**GameCenterMatchmakingRuleSetResponse**](GameCenterMatchmakingRuleSetResponse.md)

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
| **200** | Single GameCenterMatchmakingRuleSet |  -  |
| **409** | Request entity error(s) |  -  |

