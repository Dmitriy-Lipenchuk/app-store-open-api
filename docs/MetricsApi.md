# MetricsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**appsBetaTesterUsagesGetMetrics**](MetricsApi.md#appsBetaTesterUsagesGetMetrics) | **GET** /v1/apps/{id}/metrics/betaTesterUsages |  |
| [**betaGroupsBetaTesterUsagesGetMetrics**](MetricsApi.md#betaGroupsBetaTesterUsagesGetMetrics) | **GET** /v1/betaGroups/{id}/metrics/betaTesterUsages |  |
| [**betaTestersBetaTesterUsagesGetMetrics**](MetricsApi.md#betaTestersBetaTesterUsagesGetMetrics) | **GET** /v1/betaTesters/{id}/metrics/betaTesterUsages |  |
| [**buildsBetaBuildUsagesGetMetrics**](MetricsApi.md#buildsBetaBuildUsagesGetMetrics) | **GET** /v1/builds/{id}/metrics/betaBuildUsages |  |
| [**gameCenterDetailsClassicMatchmakingRequestsGetMetrics**](MetricsApi.md#gameCenterDetailsClassicMatchmakingRequestsGetMetrics) | **GET** /v1/gameCenterDetails/{id}/metrics/classicMatchmakingRequests |  |
| [**gameCenterDetailsRuleBasedMatchmakingRequestsGetMetrics**](MetricsApi.md#gameCenterDetailsRuleBasedMatchmakingRequestsGetMetrics) | **GET** /v1/gameCenterDetails/{id}/metrics/ruleBasedMatchmakingRequests |  |
| [**gameCenterMatchmakingQueuesExperimentMatchmakingQueueSizesGetMetrics**](MetricsApi.md#gameCenterMatchmakingQueuesExperimentMatchmakingQueueSizesGetMetrics) | **GET** /v1/gameCenterMatchmakingQueues/{id}/metrics/experimentMatchmakingQueueSizes |  |
| [**gameCenterMatchmakingQueuesExperimentMatchmakingRequestsGetMetrics**](MetricsApi.md#gameCenterMatchmakingQueuesExperimentMatchmakingRequestsGetMetrics) | **GET** /v1/gameCenterMatchmakingQueues/{id}/metrics/experimentMatchmakingRequests |  |
| [**gameCenterMatchmakingQueuesMatchmakingQueueSizesGetMetrics**](MetricsApi.md#gameCenterMatchmakingQueuesMatchmakingQueueSizesGetMetrics) | **GET** /v1/gameCenterMatchmakingQueues/{id}/metrics/matchmakingQueueSizes |  |
| [**gameCenterMatchmakingQueuesMatchmakingRequestsGetMetrics**](MetricsApi.md#gameCenterMatchmakingQueuesMatchmakingRequestsGetMetrics) | **GET** /v1/gameCenterMatchmakingQueues/{id}/metrics/matchmakingRequests |  |
| [**gameCenterMatchmakingQueuesMatchmakingSessionsGetMetrics**](MetricsApi.md#gameCenterMatchmakingQueuesMatchmakingSessionsGetMetrics) | **GET** /v1/gameCenterMatchmakingQueues/{id}/metrics/matchmakingSessions |  |
| [**gameCenterMatchmakingRulesMatchmakingBooleanRuleResultsGetMetrics**](MetricsApi.md#gameCenterMatchmakingRulesMatchmakingBooleanRuleResultsGetMetrics) | **GET** /v1/gameCenterMatchmakingRules/{id}/metrics/matchmakingBooleanRuleResults |  |
| [**gameCenterMatchmakingRulesMatchmakingNumberRuleResultsGetMetrics**](MetricsApi.md#gameCenterMatchmakingRulesMatchmakingNumberRuleResultsGetMetrics) | **GET** /v1/gameCenterMatchmakingRules/{id}/metrics/matchmakingNumberRuleResults |  |
| [**gameCenterMatchmakingRulesMatchmakingRuleErrorsGetMetrics**](MetricsApi.md#gameCenterMatchmakingRulesMatchmakingRuleErrorsGetMetrics) | **GET** /v1/gameCenterMatchmakingRules/{id}/metrics/matchmakingRuleErrors |  |



## appsBetaTesterUsagesGetMetrics

> AppsBetaTesterUsagesV1MetricResponse appsBetaTesterUsagesGetMetrics(id, limit, groupBy, filterBetaTesters, period)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.MetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        MetricsApi apiInstance = new MetricsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        Integer limit = 56; // Integer | maximum number of groups to return per page
        List<String> groupBy = Arrays.asList(); // List<String> | the dimension by which to group the results
        String filterBetaTesters = "filterBetaTesters_example"; // String | filter by 'betaTesters' relationship dimension
        String period = "P7D"; // String | the duration of the reporting period
        try {
            AppsBetaTesterUsagesV1MetricResponse result = apiInstance.appsBetaTesterUsagesGetMetrics(id, limit, groupBy, filterBetaTesters, period);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsApi#appsBetaTesterUsagesGetMetrics");
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
| **limit** | **Integer**| maximum number of groups to return per page | [optional] |
| **groupBy** | **List&lt;String&gt;**| the dimension by which to group the results | [optional] [enum: betaTesters] |
| **filterBetaTesters** | **String**| filter by &#39;betaTesters&#39; relationship dimension | [optional] |
| **period** | **String**| the duration of the reporting period | [optional] [enum: P7D, P30D, P90D, P365D] |

### Return type

[**AppsBetaTesterUsagesV1MetricResponse**](AppsBetaTesterUsagesV1MetricResponse.md)

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


## betaGroupsBetaTesterUsagesGetMetrics

> AppsBetaTesterUsagesV1MetricResponse betaGroupsBetaTesterUsagesGetMetrics(id, limit, groupBy, filterBetaTesters, period)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.MetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        MetricsApi apiInstance = new MetricsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        Integer limit = 56; // Integer | maximum number of groups to return per page
        List<String> groupBy = Arrays.asList(); // List<String> | the dimension by which to group the results
        String filterBetaTesters = "filterBetaTesters_example"; // String | filter by 'betaTesters' relationship dimension
        String period = "P7D"; // String | the duration of the reporting period
        try {
            AppsBetaTesterUsagesV1MetricResponse result = apiInstance.betaGroupsBetaTesterUsagesGetMetrics(id, limit, groupBy, filterBetaTesters, period);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsApi#betaGroupsBetaTesterUsagesGetMetrics");
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
| **limit** | **Integer**| maximum number of groups to return per page | [optional] |
| **groupBy** | **List&lt;String&gt;**| the dimension by which to group the results | [optional] [enum: betaTesters] |
| **filterBetaTesters** | **String**| filter by &#39;betaTesters&#39; relationship dimension | [optional] |
| **period** | **String**| the duration of the reporting period | [optional] [enum: P7D, P30D, P90D, P365D] |

### Return type

[**AppsBetaTesterUsagesV1MetricResponse**](AppsBetaTesterUsagesV1MetricResponse.md)

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


## betaTestersBetaTesterUsagesGetMetrics

> BetaTesterUsagesV1MetricResponse betaTestersBetaTesterUsagesGetMetrics(id, filterApps, limit, period)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.MetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        MetricsApi apiInstance = new MetricsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        String filterApps = "filterApps_example"; // String | filter by 'apps' relationship dimension
        Integer limit = 56; // Integer | maximum number of groups to return per page
        String period = "P7D"; // String | the duration of the reporting period
        try {
            BetaTesterUsagesV1MetricResponse result = apiInstance.betaTestersBetaTesterUsagesGetMetrics(id, filterApps, limit, period);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsApi#betaTestersBetaTesterUsagesGetMetrics");
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
| **filterApps** | **String**| filter by &#39;apps&#39; relationship dimension | |
| **limit** | **Integer**| maximum number of groups to return per page | [optional] |
| **period** | **String**| the duration of the reporting period | [optional] [enum: P7D, P30D, P90D, P365D] |

### Return type

[**BetaTesterUsagesV1MetricResponse**](BetaTesterUsagesV1MetricResponse.md)

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


## buildsBetaBuildUsagesGetMetrics

> BetaBuildUsagesV1MetricResponse buildsBetaBuildUsagesGetMetrics(id, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.MetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        MetricsApi apiInstance = new MetricsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        Integer limit = 56; // Integer | maximum number of groups to return per page
        try {
            BetaBuildUsagesV1MetricResponse result = apiInstance.buildsBetaBuildUsagesGetMetrics(id, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsApi#buildsBetaBuildUsagesGetMetrics");
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
| **limit** | **Integer**| maximum number of groups to return per page | [optional] |

### Return type

[**BetaBuildUsagesV1MetricResponse**](BetaBuildUsagesV1MetricResponse.md)

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
import org.openapitools.client.api.MetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        MetricsApi apiInstance = new MetricsApi(defaultClient);
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
            System.err.println("Exception when calling MetricsApi#gameCenterDetailsClassicMatchmakingRequestsGetMetrics");
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
import org.openapitools.client.api.MetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        MetricsApi apiInstance = new MetricsApi(defaultClient);
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
            System.err.println("Exception when calling MetricsApi#gameCenterDetailsRuleBasedMatchmakingRequestsGetMetrics");
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


## gameCenterMatchmakingQueuesExperimentMatchmakingQueueSizesGetMetrics

> GameCenterMatchmakingQueueSizesV1MetricResponse gameCenterMatchmakingQueuesExperimentMatchmakingQueueSizesGetMetrics(id, granularity, limit, sort)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.MetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        MetricsApi apiInstance = new MetricsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        String granularity = "P1D"; // String | the granularity of the per-group dataset
        Integer limit = 56; // Integer | maximum number of groups to return per page
        List<String> sort = Arrays.asList(); // List<String> | comma-separated list of sort expressions; metrics will be sorted as specified
        try {
            GameCenterMatchmakingQueueSizesV1MetricResponse result = apiInstance.gameCenterMatchmakingQueuesExperimentMatchmakingQueueSizesGetMetrics(id, granularity, limit, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsApi#gameCenterMatchmakingQueuesExperimentMatchmakingQueueSizesGetMetrics");
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
| **sort** | **List&lt;String&gt;**| comma-separated list of sort expressions; metrics will be sorted as specified | [optional] [enum: averageNumberOfRequests, -averageNumberOfRequests, count, -count, p50NumberOfRequests, -p50NumberOfRequests, p95NumberOfRequests, -p95NumberOfRequests] |

### Return type

[**GameCenterMatchmakingQueueSizesV1MetricResponse**](GameCenterMatchmakingQueueSizesV1MetricResponse.md)

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


## gameCenterMatchmakingQueuesExperimentMatchmakingRequestsGetMetrics

> GameCenterMatchmakingQueueRequestsV1MetricResponse gameCenterMatchmakingQueuesExperimentMatchmakingRequestsGetMetrics(id, granularity, limit, groupBy, filterResult, filterGameCenterDetail, sort)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.MetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        MetricsApi apiInstance = new MetricsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        String granularity = "P1D"; // String | the granularity of the per-group dataset
        Integer limit = 56; // Integer | maximum number of groups to return per page
        List<String> groupBy = Arrays.asList(); // List<String> | the dimension by which to group the results
        String filterResult = "MATCHED"; // String | filter by 'result' attribute dimension
        String filterGameCenterDetail = "filterGameCenterDetail_example"; // String | filter by 'gameCenterDetail' relationship dimension
        List<String> sort = Arrays.asList(); // List<String> | comma-separated list of sort expressions; metrics will be sorted as specified
        try {
            GameCenterMatchmakingQueueRequestsV1MetricResponse result = apiInstance.gameCenterMatchmakingQueuesExperimentMatchmakingRequestsGetMetrics(id, granularity, limit, groupBy, filterResult, filterGameCenterDetail, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsApi#gameCenterMatchmakingQueuesExperimentMatchmakingRequestsGetMetrics");
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
| **groupBy** | **List&lt;String&gt;**| the dimension by which to group the results | [optional] [enum: gameCenterDetail, result] |
| **filterResult** | **String**| filter by &#39;result&#39; attribute dimension | [optional] [enum: MATCHED, CANCELED, EXPIRED] |
| **filterGameCenterDetail** | **String**| filter by &#39;gameCenterDetail&#39; relationship dimension | [optional] |
| **sort** | **List&lt;String&gt;**| comma-separated list of sort expressions; metrics will be sorted as specified | [optional] [enum: averageSecondsInQueue, -averageSecondsInQueue, count, -count, p50SecondsInQueue, -p50SecondsInQueue, p95SecondsInQueue, -p95SecondsInQueue] |

### Return type

[**GameCenterMatchmakingQueueRequestsV1MetricResponse**](GameCenterMatchmakingQueueRequestsV1MetricResponse.md)

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


## gameCenterMatchmakingQueuesMatchmakingQueueSizesGetMetrics

> GameCenterMatchmakingQueueSizesV1MetricResponse gameCenterMatchmakingQueuesMatchmakingQueueSizesGetMetrics(id, granularity, limit, sort)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.MetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        MetricsApi apiInstance = new MetricsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        String granularity = "P1D"; // String | the granularity of the per-group dataset
        Integer limit = 56; // Integer | maximum number of groups to return per page
        List<String> sort = Arrays.asList(); // List<String> | comma-separated list of sort expressions; metrics will be sorted as specified
        try {
            GameCenterMatchmakingQueueSizesV1MetricResponse result = apiInstance.gameCenterMatchmakingQueuesMatchmakingQueueSizesGetMetrics(id, granularity, limit, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsApi#gameCenterMatchmakingQueuesMatchmakingQueueSizesGetMetrics");
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
| **sort** | **List&lt;String&gt;**| comma-separated list of sort expressions; metrics will be sorted as specified | [optional] [enum: averageNumberOfRequests, -averageNumberOfRequests, count, -count, p50NumberOfRequests, -p50NumberOfRequests, p95NumberOfRequests, -p95NumberOfRequests] |

### Return type

[**GameCenterMatchmakingQueueSizesV1MetricResponse**](GameCenterMatchmakingQueueSizesV1MetricResponse.md)

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


## gameCenterMatchmakingQueuesMatchmakingRequestsGetMetrics

> GameCenterMatchmakingQueueRequestsV1MetricResponse gameCenterMatchmakingQueuesMatchmakingRequestsGetMetrics(id, granularity, limit, groupBy, filterResult, filterGameCenterDetail, sort)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.MetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        MetricsApi apiInstance = new MetricsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        String granularity = "P1D"; // String | the granularity of the per-group dataset
        Integer limit = 56; // Integer | maximum number of groups to return per page
        List<String> groupBy = Arrays.asList(); // List<String> | the dimension by which to group the results
        String filterResult = "MATCHED"; // String | filter by 'result' attribute dimension
        String filterGameCenterDetail = "filterGameCenterDetail_example"; // String | filter by 'gameCenterDetail' relationship dimension
        List<String> sort = Arrays.asList(); // List<String> | comma-separated list of sort expressions; metrics will be sorted as specified
        try {
            GameCenterMatchmakingQueueRequestsV1MetricResponse result = apiInstance.gameCenterMatchmakingQueuesMatchmakingRequestsGetMetrics(id, granularity, limit, groupBy, filterResult, filterGameCenterDetail, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsApi#gameCenterMatchmakingQueuesMatchmakingRequestsGetMetrics");
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
| **groupBy** | **List&lt;String&gt;**| the dimension by which to group the results | [optional] [enum: gameCenterDetail, result] |
| **filterResult** | **String**| filter by &#39;result&#39; attribute dimension | [optional] [enum: MATCHED, CANCELED, EXPIRED] |
| **filterGameCenterDetail** | **String**| filter by &#39;gameCenterDetail&#39; relationship dimension | [optional] |
| **sort** | **List&lt;String&gt;**| comma-separated list of sort expressions; metrics will be sorted as specified | [optional] [enum: averageSecondsInQueue, -averageSecondsInQueue, count, -count, p50SecondsInQueue, -p50SecondsInQueue, p95SecondsInQueue, -p95SecondsInQueue] |

### Return type

[**GameCenterMatchmakingQueueRequestsV1MetricResponse**](GameCenterMatchmakingQueueRequestsV1MetricResponse.md)

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


## gameCenterMatchmakingQueuesMatchmakingSessionsGetMetrics

> GameCenterMatchmakingSessionsV1MetricResponse gameCenterMatchmakingQueuesMatchmakingSessionsGetMetrics(id, granularity, limit, sort)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.MetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        MetricsApi apiInstance = new MetricsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        String granularity = "P1D"; // String | the granularity of the per-group dataset
        Integer limit = 56; // Integer | maximum number of groups to return per page
        List<String> sort = Arrays.asList(); // List<String> | comma-separated list of sort expressions; metrics will be sorted as specified
        try {
            GameCenterMatchmakingSessionsV1MetricResponse result = apiInstance.gameCenterMatchmakingQueuesMatchmakingSessionsGetMetrics(id, granularity, limit, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsApi#gameCenterMatchmakingQueuesMatchmakingSessionsGetMetrics");
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
| **sort** | **List&lt;String&gt;**| comma-separated list of sort expressions; metrics will be sorted as specified | [optional] [enum: averagePlayerCount, -averagePlayerCount, count, -count, p50PlayerCount, -p50PlayerCount, p95PlayerCount, -p95PlayerCount] |

### Return type

[**GameCenterMatchmakingSessionsV1MetricResponse**](GameCenterMatchmakingSessionsV1MetricResponse.md)

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
import org.openapitools.client.api.MetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        MetricsApi apiInstance = new MetricsApi(defaultClient);
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
            System.err.println("Exception when calling MetricsApi#gameCenterMatchmakingRulesMatchmakingBooleanRuleResultsGetMetrics");
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
import org.openapitools.client.api.MetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        MetricsApi apiInstance = new MetricsApi(defaultClient);
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
            System.err.println("Exception when calling MetricsApi#gameCenterMatchmakingRulesMatchmakingNumberRuleResultsGetMetrics");
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
import org.openapitools.client.api.MetricsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        MetricsApi apiInstance = new MetricsApi(defaultClient);
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
            System.err.println("Exception when calling MetricsApi#gameCenterMatchmakingRulesMatchmakingRuleErrorsGetMetrics");
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

