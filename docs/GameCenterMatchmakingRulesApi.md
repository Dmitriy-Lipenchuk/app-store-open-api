# GameCenterMatchmakingRulesApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**gameCenterMatchmakingRulesCreateInstance**](GameCenterMatchmakingRulesApi.md#gameCenterMatchmakingRulesCreateInstance) | **POST** /v1/gameCenterMatchmakingRules |  |
| [**gameCenterMatchmakingRulesDeleteInstance**](GameCenterMatchmakingRulesApi.md#gameCenterMatchmakingRulesDeleteInstance) | **DELETE** /v1/gameCenterMatchmakingRules/{id} |  |
| [**gameCenterMatchmakingRulesMatchmakingBooleanRuleResultsGetMetrics**](GameCenterMatchmakingRulesApi.md#gameCenterMatchmakingRulesMatchmakingBooleanRuleResultsGetMetrics) | **GET** /v1/gameCenterMatchmakingRules/{id}/metrics/matchmakingBooleanRuleResults |  |
| [**gameCenterMatchmakingRulesMatchmakingNumberRuleResultsGetMetrics**](GameCenterMatchmakingRulesApi.md#gameCenterMatchmakingRulesMatchmakingNumberRuleResultsGetMetrics) | **GET** /v1/gameCenterMatchmakingRules/{id}/metrics/matchmakingNumberRuleResults |  |
| [**gameCenterMatchmakingRulesMatchmakingRuleErrorsGetMetrics**](GameCenterMatchmakingRulesApi.md#gameCenterMatchmakingRulesMatchmakingRuleErrorsGetMetrics) | **GET** /v1/gameCenterMatchmakingRules/{id}/metrics/matchmakingRuleErrors |  |
| [**gameCenterMatchmakingRulesUpdateInstance**](GameCenterMatchmakingRulesApi.md#gameCenterMatchmakingRulesUpdateInstance) | **PATCH** /v1/gameCenterMatchmakingRules/{id} |  |



## gameCenterMatchmakingRulesCreateInstance

> GameCenterMatchmakingRuleResponse gameCenterMatchmakingRulesCreateInstance(gameCenterMatchmakingRuleCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterMatchmakingRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterMatchmakingRulesApi apiInstance = new GameCenterMatchmakingRulesApi(defaultClient);
        GameCenterMatchmakingRuleCreateRequest gameCenterMatchmakingRuleCreateRequest = new GameCenterMatchmakingRuleCreateRequest(); // GameCenterMatchmakingRuleCreateRequest | GameCenterMatchmakingRule representation
        try {
            GameCenterMatchmakingRuleResponse result = apiInstance.gameCenterMatchmakingRulesCreateInstance(gameCenterMatchmakingRuleCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterMatchmakingRulesApi#gameCenterMatchmakingRulesCreateInstance");
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
| **gameCenterMatchmakingRuleCreateRequest** | [**GameCenterMatchmakingRuleCreateRequest**](GameCenterMatchmakingRuleCreateRequest.md)| GameCenterMatchmakingRule representation | |

### Return type

[**GameCenterMatchmakingRuleResponse**](GameCenterMatchmakingRuleResponse.md)

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
| **201** | Single GameCenterMatchmakingRule |  -  |
| **409** | Request entity error(s) |  -  |


## gameCenterMatchmakingRulesDeleteInstance

> gameCenterMatchmakingRulesDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterMatchmakingRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterMatchmakingRulesApi apiInstance = new GameCenterMatchmakingRulesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.gameCenterMatchmakingRulesDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterMatchmakingRulesApi#gameCenterMatchmakingRulesDeleteInstance");
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


## gameCenterMatchmakingRulesMatchmakingBooleanRuleResultsGetMetrics

> GameCenterMatchmakingBooleanRuleResultsV1MetricResponse gameCenterMatchmakingRulesMatchmakingBooleanRuleResultsGetMetrics(id, granularity, limit, groupBy, filterResult, filterGameCenterMatchmakingQueue, sort)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterMatchmakingRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterMatchmakingRulesApi apiInstance = new GameCenterMatchmakingRulesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        String granularity = "P1D"; // String | the granularity of the per-group dataset
        Integer limit = 56; // Integer | maximum number of groups to return per page
        List<String> groupBy = Arrays.asList(); // List<String> | the dimension by which to group the results
        String filterResult = "filterResult_example"; // String | filter by 'result' attribute dimension
        String filterGameCenterMatchmakingQueue = "filterGameCenterMatchmakingQueue_example"; // String | filter by 'gameCenterMatchmakingQueue' relationship dimension
        List<String> sort = Arrays.asList(); // List<String> | comma-separated list of sort expressions; metrics will be sorted as specified
        try {
            GameCenterMatchmakingBooleanRuleResultsV1MetricResponse result = apiInstance.gameCenterMatchmakingRulesMatchmakingBooleanRuleResultsGetMetrics(id, granularity, limit, groupBy, filterResult, filterGameCenterMatchmakingQueue, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterMatchmakingRulesApi#gameCenterMatchmakingRulesMatchmakingBooleanRuleResultsGetMetrics");
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
| **groupBy** | **List&lt;String&gt;**| the dimension by which to group the results | [optional] [enum: gameCenterMatchmakingQueue, result] |
| **filterResult** | **String**| filter by &#39;result&#39; attribute dimension | [optional] |
| **filterGameCenterMatchmakingQueue** | **String**| filter by &#39;gameCenterMatchmakingQueue&#39; relationship dimension | [optional] |
| **sort** | **List&lt;String&gt;**| comma-separated list of sort expressions; metrics will be sorted as specified | [optional] [enum: count, -count] |

### Return type

[**GameCenterMatchmakingBooleanRuleResultsV1MetricResponse**](GameCenterMatchmakingBooleanRuleResultsV1MetricResponse.md)

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


## gameCenterMatchmakingRulesMatchmakingNumberRuleResultsGetMetrics

> GameCenterMatchmakingNumberRuleResultsV1MetricResponse gameCenterMatchmakingRulesMatchmakingNumberRuleResultsGetMetrics(id, granularity, limit, groupBy, filterGameCenterMatchmakingQueue, sort)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterMatchmakingRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterMatchmakingRulesApi apiInstance = new GameCenterMatchmakingRulesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        String granularity = "P1D"; // String | the granularity of the per-group dataset
        Integer limit = 56; // Integer | maximum number of groups to return per page
        List<String> groupBy = Arrays.asList(); // List<String> | the dimension by which to group the results
        String filterGameCenterMatchmakingQueue = "filterGameCenterMatchmakingQueue_example"; // String | filter by 'gameCenterMatchmakingQueue' relationship dimension
        List<String> sort = Arrays.asList(); // List<String> | comma-separated list of sort expressions; metrics will be sorted as specified
        try {
            GameCenterMatchmakingNumberRuleResultsV1MetricResponse result = apiInstance.gameCenterMatchmakingRulesMatchmakingNumberRuleResultsGetMetrics(id, granularity, limit, groupBy, filterGameCenterMatchmakingQueue, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterMatchmakingRulesApi#gameCenterMatchmakingRulesMatchmakingNumberRuleResultsGetMetrics");
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
| **groupBy** | **List&lt;String&gt;**| the dimension by which to group the results | [optional] [enum: gameCenterMatchmakingQueue] |
| **filterGameCenterMatchmakingQueue** | **String**| filter by &#39;gameCenterMatchmakingQueue&#39; relationship dimension | [optional] |
| **sort** | **List&lt;String&gt;**| comma-separated list of sort expressions; metrics will be sorted as specified | [optional] [enum: averageResult, -averageResult, count, -count, p50Result, -p50Result, p95Result, -p95Result] |

### Return type

[**GameCenterMatchmakingNumberRuleResultsV1MetricResponse**](GameCenterMatchmakingNumberRuleResultsV1MetricResponse.md)

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


## gameCenterMatchmakingRulesMatchmakingRuleErrorsGetMetrics

> GameCenterMatchmakingRuleErrorsV1MetricResponse gameCenterMatchmakingRulesMatchmakingRuleErrorsGetMetrics(id, granularity, limit, groupBy, filterGameCenterMatchmakingQueue, sort)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterMatchmakingRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterMatchmakingRulesApi apiInstance = new GameCenterMatchmakingRulesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        String granularity = "P1D"; // String | the granularity of the per-group dataset
        Integer limit = 56; // Integer | maximum number of groups to return per page
        List<String> groupBy = Arrays.asList(); // List<String> | the dimension by which to group the results
        String filterGameCenterMatchmakingQueue = "filterGameCenterMatchmakingQueue_example"; // String | filter by 'gameCenterMatchmakingQueue' relationship dimension
        List<String> sort = Arrays.asList(); // List<String> | comma-separated list of sort expressions; metrics will be sorted as specified
        try {
            GameCenterMatchmakingRuleErrorsV1MetricResponse result = apiInstance.gameCenterMatchmakingRulesMatchmakingRuleErrorsGetMetrics(id, granularity, limit, groupBy, filterGameCenterMatchmakingQueue, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterMatchmakingRulesApi#gameCenterMatchmakingRulesMatchmakingRuleErrorsGetMetrics");
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
| **groupBy** | **List&lt;String&gt;**| the dimension by which to group the results | [optional] [enum: gameCenterMatchmakingQueue] |
| **filterGameCenterMatchmakingQueue** | **String**| filter by &#39;gameCenterMatchmakingQueue&#39; relationship dimension | [optional] |
| **sort** | **List&lt;String&gt;**| comma-separated list of sort expressions; metrics will be sorted as specified | [optional] [enum: count, -count] |

### Return type

[**GameCenterMatchmakingRuleErrorsV1MetricResponse**](GameCenterMatchmakingRuleErrorsV1MetricResponse.md)

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


## gameCenterMatchmakingRulesUpdateInstance

> GameCenterMatchmakingRuleResponse gameCenterMatchmakingRulesUpdateInstance(id, gameCenterMatchmakingRuleUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterMatchmakingRulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterMatchmakingRulesApi apiInstance = new GameCenterMatchmakingRulesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        GameCenterMatchmakingRuleUpdateRequest gameCenterMatchmakingRuleUpdateRequest = new GameCenterMatchmakingRuleUpdateRequest(); // GameCenterMatchmakingRuleUpdateRequest | GameCenterMatchmakingRule representation
        try {
            GameCenterMatchmakingRuleResponse result = apiInstance.gameCenterMatchmakingRulesUpdateInstance(id, gameCenterMatchmakingRuleUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterMatchmakingRulesApi#gameCenterMatchmakingRulesUpdateInstance");
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
| **gameCenterMatchmakingRuleUpdateRequest** | [**GameCenterMatchmakingRuleUpdateRequest**](GameCenterMatchmakingRuleUpdateRequest.md)| GameCenterMatchmakingRule representation | |

### Return type

[**GameCenterMatchmakingRuleResponse**](GameCenterMatchmakingRuleResponse.md)

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
| **200** | Single GameCenterMatchmakingRule |  -  |
| **409** | Request entity error(s) |  -  |

