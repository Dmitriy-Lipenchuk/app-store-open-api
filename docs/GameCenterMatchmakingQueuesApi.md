# GameCenterMatchmakingQueuesApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**gameCenterMatchmakingQueuesCreateInstance**](GameCenterMatchmakingQueuesApi.md#gameCenterMatchmakingQueuesCreateInstance) | **POST** /v1/gameCenterMatchmakingQueues |  |
| [**gameCenterMatchmakingQueuesDeleteInstance**](GameCenterMatchmakingQueuesApi.md#gameCenterMatchmakingQueuesDeleteInstance) | **DELETE** /v1/gameCenterMatchmakingQueues/{id} |  |
| [**gameCenterMatchmakingQueuesExperimentMatchmakingQueueSizesGetMetrics**](GameCenterMatchmakingQueuesApi.md#gameCenterMatchmakingQueuesExperimentMatchmakingQueueSizesGetMetrics) | **GET** /v1/gameCenterMatchmakingQueues/{id}/metrics/experimentMatchmakingQueueSizes |  |
| [**gameCenterMatchmakingQueuesExperimentMatchmakingRequestsGetMetrics**](GameCenterMatchmakingQueuesApi.md#gameCenterMatchmakingQueuesExperimentMatchmakingRequestsGetMetrics) | **GET** /v1/gameCenterMatchmakingQueues/{id}/metrics/experimentMatchmakingRequests |  |
| [**gameCenterMatchmakingQueuesGetCollection**](GameCenterMatchmakingQueuesApi.md#gameCenterMatchmakingQueuesGetCollection) | **GET** /v1/gameCenterMatchmakingQueues |  |
| [**gameCenterMatchmakingQueuesGetInstance**](GameCenterMatchmakingQueuesApi.md#gameCenterMatchmakingQueuesGetInstance) | **GET** /v1/gameCenterMatchmakingQueues/{id} |  |
| [**gameCenterMatchmakingQueuesMatchmakingQueueSizesGetMetrics**](GameCenterMatchmakingQueuesApi.md#gameCenterMatchmakingQueuesMatchmakingQueueSizesGetMetrics) | **GET** /v1/gameCenterMatchmakingQueues/{id}/metrics/matchmakingQueueSizes |  |
| [**gameCenterMatchmakingQueuesMatchmakingRequestsGetMetrics**](GameCenterMatchmakingQueuesApi.md#gameCenterMatchmakingQueuesMatchmakingRequestsGetMetrics) | **GET** /v1/gameCenterMatchmakingQueues/{id}/metrics/matchmakingRequests |  |
| [**gameCenterMatchmakingQueuesMatchmakingSessionsGetMetrics**](GameCenterMatchmakingQueuesApi.md#gameCenterMatchmakingQueuesMatchmakingSessionsGetMetrics) | **GET** /v1/gameCenterMatchmakingQueues/{id}/metrics/matchmakingSessions |  |
| [**gameCenterMatchmakingQueuesUpdateInstance**](GameCenterMatchmakingQueuesApi.md#gameCenterMatchmakingQueuesUpdateInstance) | **PATCH** /v1/gameCenterMatchmakingQueues/{id} |  |



## gameCenterMatchmakingQueuesCreateInstance

> GameCenterMatchmakingQueueResponse gameCenterMatchmakingQueuesCreateInstance(gameCenterMatchmakingQueueCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterMatchmakingQueuesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterMatchmakingQueuesApi apiInstance = new GameCenterMatchmakingQueuesApi(defaultClient);
        GameCenterMatchmakingQueueCreateRequest gameCenterMatchmakingQueueCreateRequest = new GameCenterMatchmakingQueueCreateRequest(); // GameCenterMatchmakingQueueCreateRequest | GameCenterMatchmakingQueue representation
        try {
            GameCenterMatchmakingQueueResponse result = apiInstance.gameCenterMatchmakingQueuesCreateInstance(gameCenterMatchmakingQueueCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterMatchmakingQueuesApi#gameCenterMatchmakingQueuesCreateInstance");
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
| **gameCenterMatchmakingQueueCreateRequest** | [**GameCenterMatchmakingQueueCreateRequest**](GameCenterMatchmakingQueueCreateRequest.md)| GameCenterMatchmakingQueue representation | |

### Return type

[**GameCenterMatchmakingQueueResponse**](GameCenterMatchmakingQueueResponse.md)

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
| **201** | Single GameCenterMatchmakingQueue |  -  |
| **409** | Request entity error(s) |  -  |


## gameCenterMatchmakingQueuesDeleteInstance

> gameCenterMatchmakingQueuesDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterMatchmakingQueuesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterMatchmakingQueuesApi apiInstance = new GameCenterMatchmakingQueuesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.gameCenterMatchmakingQueuesDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterMatchmakingQueuesApi#gameCenterMatchmakingQueuesDeleteInstance");
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
import org.openapitools.client.api.GameCenterMatchmakingQueuesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterMatchmakingQueuesApi apiInstance = new GameCenterMatchmakingQueuesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        String granularity = "P1D"; // String | the granularity of the per-group dataset
        Integer limit = 56; // Integer | maximum number of groups to return per page
        List<String> sort = Arrays.asList(); // List<String> | comma-separated list of sort expressions; metrics will be sorted as specified
        try {
            GameCenterMatchmakingQueueSizesV1MetricResponse result = apiInstance.gameCenterMatchmakingQueuesExperimentMatchmakingQueueSizesGetMetrics(id, granularity, limit, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterMatchmakingQueuesApi#gameCenterMatchmakingQueuesExperimentMatchmakingQueueSizesGetMetrics");
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
import org.openapitools.client.api.GameCenterMatchmakingQueuesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterMatchmakingQueuesApi apiInstance = new GameCenterMatchmakingQueuesApi(defaultClient);
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
            System.err.println("Exception when calling GameCenterMatchmakingQueuesApi#gameCenterMatchmakingQueuesExperimentMatchmakingRequestsGetMetrics");
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


## gameCenterMatchmakingQueuesGetCollection

> GameCenterMatchmakingQueuesResponse gameCenterMatchmakingQueuesGetCollection(fieldsGameCenterMatchmakingQueues, limit, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterMatchmakingQueuesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterMatchmakingQueuesApi apiInstance = new GameCenterMatchmakingQueuesApi(defaultClient);
        List<String> fieldsGameCenterMatchmakingQueues = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterMatchmakingQueues
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            GameCenterMatchmakingQueuesResponse result = apiInstance.gameCenterMatchmakingQueuesGetCollection(fieldsGameCenterMatchmakingQueues, limit, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterMatchmakingQueuesApi#gameCenterMatchmakingQueuesGetCollection");
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
| **fieldsGameCenterMatchmakingQueues** | **List&lt;String&gt;**| the fields to include for returned resources of type gameCenterMatchmakingQueues | [optional] [enum: classicMatchmakingBundleIds, experimentRuleSet, referenceName, ruleSet] |
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
| **200** | List of GameCenterMatchmakingQueues |  -  |


## gameCenterMatchmakingQueuesGetInstance

> GameCenterMatchmakingQueueResponse gameCenterMatchmakingQueuesGetInstance(id, fieldsGameCenterMatchmakingQueues, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterMatchmakingQueuesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterMatchmakingQueuesApi apiInstance = new GameCenterMatchmakingQueuesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsGameCenterMatchmakingQueues = Arrays.asList(); // List<String> | the fields to include for returned resources of type gameCenterMatchmakingQueues
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            GameCenterMatchmakingQueueResponse result = apiInstance.gameCenterMatchmakingQueuesGetInstance(id, fieldsGameCenterMatchmakingQueues, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterMatchmakingQueuesApi#gameCenterMatchmakingQueuesGetInstance");
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
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: experimentRuleSet, ruleSet] |

### Return type

[**GameCenterMatchmakingQueueResponse**](GameCenterMatchmakingQueueResponse.md)

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
| **200** | Single GameCenterMatchmakingQueue |  -  |


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
import org.openapitools.client.api.GameCenterMatchmakingQueuesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterMatchmakingQueuesApi apiInstance = new GameCenterMatchmakingQueuesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        String granularity = "P1D"; // String | the granularity of the per-group dataset
        Integer limit = 56; // Integer | maximum number of groups to return per page
        List<String> sort = Arrays.asList(); // List<String> | comma-separated list of sort expressions; metrics will be sorted as specified
        try {
            GameCenterMatchmakingQueueSizesV1MetricResponse result = apiInstance.gameCenterMatchmakingQueuesMatchmakingQueueSizesGetMetrics(id, granularity, limit, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterMatchmakingQueuesApi#gameCenterMatchmakingQueuesMatchmakingQueueSizesGetMetrics");
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
import org.openapitools.client.api.GameCenterMatchmakingQueuesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterMatchmakingQueuesApi apiInstance = new GameCenterMatchmakingQueuesApi(defaultClient);
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
            System.err.println("Exception when calling GameCenterMatchmakingQueuesApi#gameCenterMatchmakingQueuesMatchmakingRequestsGetMetrics");
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
import org.openapitools.client.api.GameCenterMatchmakingQueuesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterMatchmakingQueuesApi apiInstance = new GameCenterMatchmakingQueuesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        String granularity = "P1D"; // String | the granularity of the per-group dataset
        Integer limit = 56; // Integer | maximum number of groups to return per page
        List<String> sort = Arrays.asList(); // List<String> | comma-separated list of sort expressions; metrics will be sorted as specified
        try {
            GameCenterMatchmakingSessionsV1MetricResponse result = apiInstance.gameCenterMatchmakingQueuesMatchmakingSessionsGetMetrics(id, granularity, limit, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterMatchmakingQueuesApi#gameCenterMatchmakingQueuesMatchmakingSessionsGetMetrics");
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


## gameCenterMatchmakingQueuesUpdateInstance

> GameCenterMatchmakingQueueResponse gameCenterMatchmakingQueuesUpdateInstance(id, gameCenterMatchmakingQueueUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.GameCenterMatchmakingQueuesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        GameCenterMatchmakingQueuesApi apiInstance = new GameCenterMatchmakingQueuesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        GameCenterMatchmakingQueueUpdateRequest gameCenterMatchmakingQueueUpdateRequest = new GameCenterMatchmakingQueueUpdateRequest(); // GameCenterMatchmakingQueueUpdateRequest | GameCenterMatchmakingQueue representation
        try {
            GameCenterMatchmakingQueueResponse result = apiInstance.gameCenterMatchmakingQueuesUpdateInstance(id, gameCenterMatchmakingQueueUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameCenterMatchmakingQueuesApi#gameCenterMatchmakingQueuesUpdateInstance");
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
| **gameCenterMatchmakingQueueUpdateRequest** | [**GameCenterMatchmakingQueueUpdateRequest**](GameCenterMatchmakingQueueUpdateRequest.md)| GameCenterMatchmakingQueue representation | |

### Return type

[**GameCenterMatchmakingQueueResponse**](GameCenterMatchmakingQueueResponse.md)

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
| **200** | Single GameCenterMatchmakingQueue |  -  |
| **409** | Request entity error(s) |  -  |

