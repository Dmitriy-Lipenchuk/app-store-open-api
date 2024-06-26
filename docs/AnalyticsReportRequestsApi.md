# AnalyticsReportRequestsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**analyticsReportRequestsCreateInstance**](AnalyticsReportRequestsApi.md#analyticsReportRequestsCreateInstance) | **POST** /v1/analyticsReportRequests |  |
| [**analyticsReportRequestsDeleteInstance**](AnalyticsReportRequestsApi.md#analyticsReportRequestsDeleteInstance) | **DELETE** /v1/analyticsReportRequests/{id} |  |
| [**analyticsReportRequestsGetInstance**](AnalyticsReportRequestsApi.md#analyticsReportRequestsGetInstance) | **GET** /v1/analyticsReportRequests/{id} |  |
| [**analyticsReportRequestsReportsGetToManyRelated**](AnalyticsReportRequestsApi.md#analyticsReportRequestsReportsGetToManyRelated) | **GET** /v1/analyticsReportRequests/{id}/reports |  |



## analyticsReportRequestsCreateInstance

> AnalyticsReportRequestResponse analyticsReportRequestsCreateInstance(analyticsReportRequestCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AnalyticsReportRequestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AnalyticsReportRequestsApi apiInstance = new AnalyticsReportRequestsApi(defaultClient);
        AnalyticsReportRequestCreateRequest analyticsReportRequestCreateRequest = new AnalyticsReportRequestCreateRequest(); // AnalyticsReportRequestCreateRequest | AnalyticsReportRequest representation
        try {
            AnalyticsReportRequestResponse result = apiInstance.analyticsReportRequestsCreateInstance(analyticsReportRequestCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnalyticsReportRequestsApi#analyticsReportRequestsCreateInstance");
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
| **analyticsReportRequestCreateRequest** | [**AnalyticsReportRequestCreateRequest**](AnalyticsReportRequestCreateRequest.md)| AnalyticsReportRequest representation | |

### Return type

[**AnalyticsReportRequestResponse**](AnalyticsReportRequestResponse.md)

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
| **201** | Single AnalyticsReportRequest |  -  |
| **409** | Request entity error(s) |  -  |


## analyticsReportRequestsDeleteInstance

> analyticsReportRequestsDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AnalyticsReportRequestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AnalyticsReportRequestsApi apiInstance = new AnalyticsReportRequestsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.analyticsReportRequestsDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnalyticsReportRequestsApi#analyticsReportRequestsDeleteInstance");
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


## analyticsReportRequestsGetInstance

> AnalyticsReportRequestResponse analyticsReportRequestsGetInstance(id, fieldsAnalyticsReportRequests, include, fieldsAnalyticsReports, limitReports)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AnalyticsReportRequestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AnalyticsReportRequestsApi apiInstance = new AnalyticsReportRequestsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAnalyticsReportRequests = Arrays.asList(); // List<String> | the fields to include for returned resources of type analyticsReportRequests
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsAnalyticsReports = Arrays.asList(); // List<String> | the fields to include for returned resources of type analyticsReports
        Integer limitReports = 56; // Integer | maximum number of related reports returned (when they are included)
        try {
            AnalyticsReportRequestResponse result = apiInstance.analyticsReportRequestsGetInstance(id, fieldsAnalyticsReportRequests, include, fieldsAnalyticsReports, limitReports);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnalyticsReportRequestsApi#analyticsReportRequestsGetInstance");
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
| **fieldsAnalyticsReportRequests** | **List&lt;String&gt;**| the fields to include for returned resources of type analyticsReportRequests | [optional] [enum: accessType, app, reports, stoppedDueToInactivity] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: reports] |
| **fieldsAnalyticsReports** | **List&lt;String&gt;**| the fields to include for returned resources of type analyticsReports | [optional] [enum: category, instances, name] |
| **limitReports** | **Integer**| maximum number of related reports returned (when they are included) | [optional] |

### Return type

[**AnalyticsReportRequestResponse**](AnalyticsReportRequestResponse.md)

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
| **200** | Single AnalyticsReportRequest |  -  |


## analyticsReportRequestsReportsGetToManyRelated

> AnalyticsReportsResponse analyticsReportRequestsReportsGetToManyRelated(id, filterCategory, filterName, fieldsAnalyticsReports, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AnalyticsReportRequestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AnalyticsReportRequestsApi apiInstance = new AnalyticsReportRequestsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> filterCategory = Arrays.asList(); // List<String> | filter by attribute 'category'
        List<String> filterName = Arrays.asList(); // List<String> | filter by attribute 'name'
        List<String> fieldsAnalyticsReports = Arrays.asList(); // List<String> | the fields to include for returned resources of type analyticsReports
        Integer limit = 56; // Integer | maximum resources per page
        try {
            AnalyticsReportsResponse result = apiInstance.analyticsReportRequestsReportsGetToManyRelated(id, filterCategory, filterName, fieldsAnalyticsReports, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnalyticsReportRequestsApi#analyticsReportRequestsReportsGetToManyRelated");
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
| **filterCategory** | **List&lt;String&gt;**| filter by attribute &#39;category&#39; | [optional] [enum: APP_USAGE, APP_STORE_ENGAGEMENT, COMMERCE, FRAMEWORK_USAGE, PERFORMANCE] |
| **filterName** | **List&lt;String&gt;**| filter by attribute &#39;name&#39; | [optional] |
| **fieldsAnalyticsReports** | **List&lt;String&gt;**| the fields to include for returned resources of type analyticsReports | [optional] [enum: category, instances, name] |
| **limit** | **Integer**| maximum resources per page | [optional] |

### Return type

[**AnalyticsReportsResponse**](AnalyticsReportsResponse.md)

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
| **200** | List of AnalyticsReports |  -  |

