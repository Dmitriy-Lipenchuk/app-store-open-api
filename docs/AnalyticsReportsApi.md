# AnalyticsReportsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**analyticsReportsGetInstance**](AnalyticsReportsApi.md#analyticsReportsGetInstance) | **GET** /v1/analyticsReports/{id} |  |
| [**analyticsReportsInstancesGetToManyRelated**](AnalyticsReportsApi.md#analyticsReportsInstancesGetToManyRelated) | **GET** /v1/analyticsReports/{id}/instances |  |



## analyticsReportsGetInstance

> AnalyticsReportResponse analyticsReportsGetInstance(id, fieldsAnalyticsReports, fieldsAnalyticsReportInstances)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AnalyticsReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AnalyticsReportsApi apiInstance = new AnalyticsReportsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAnalyticsReports = Arrays.asList(); // List<String> | the fields to include for returned resources of type analyticsReports
        List<String> fieldsAnalyticsReportInstances = Arrays.asList(); // List<String> | the fields to include for returned resources of type analyticsReportInstances
        try {
            AnalyticsReportResponse result = apiInstance.analyticsReportsGetInstance(id, fieldsAnalyticsReports, fieldsAnalyticsReportInstances);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnalyticsReportsApi#analyticsReportsGetInstance");
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
| **fieldsAnalyticsReports** | **List&lt;String&gt;**| the fields to include for returned resources of type analyticsReports | [optional] [enum: category, instances, name] |
| **fieldsAnalyticsReportInstances** | **List&lt;String&gt;**| the fields to include for returned resources of type analyticsReportInstances | [optional] [enum: granularity, processingDate, segments] |

### Return type

[**AnalyticsReportResponse**](AnalyticsReportResponse.md)

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
| **200** | Single AnalyticsReport |  -  |


## analyticsReportsInstancesGetToManyRelated

> AnalyticsReportInstancesResponse analyticsReportsInstancesGetToManyRelated(id, filterGranularity, filterProcessingDate, fieldsAnalyticsReportInstances, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AnalyticsReportsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AnalyticsReportsApi apiInstance = new AnalyticsReportsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> filterGranularity = Arrays.asList(); // List<String> | filter by attribute 'granularity'
        List<String> filterProcessingDate = Arrays.asList(); // List<String> | filter by attribute 'processingDate'
        List<String> fieldsAnalyticsReportInstances = Arrays.asList(); // List<String> | the fields to include for returned resources of type analyticsReportInstances
        Integer limit = 56; // Integer | maximum resources per page
        try {
            AnalyticsReportInstancesResponse result = apiInstance.analyticsReportsInstancesGetToManyRelated(id, filterGranularity, filterProcessingDate, fieldsAnalyticsReportInstances, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnalyticsReportsApi#analyticsReportsInstancesGetToManyRelated");
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
| **filterGranularity** | **List&lt;String&gt;**| filter by attribute &#39;granularity&#39; | [optional] [enum: DAILY, WEEKLY, MONTHLY] |
| **filterProcessingDate** | **List&lt;String&gt;**| filter by attribute &#39;processingDate&#39; | [optional] |
| **fieldsAnalyticsReportInstances** | **List&lt;String&gt;**| the fields to include for returned resources of type analyticsReportInstances | [optional] [enum: granularity, processingDate, segments] |
| **limit** | **Integer**| maximum resources per page | [optional] |

### Return type

[**AnalyticsReportInstancesResponse**](AnalyticsReportInstancesResponse.md)

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
| **200** | List of AnalyticsReportInstances |  -  |

