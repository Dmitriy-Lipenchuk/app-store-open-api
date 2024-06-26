# AnalyticsReportInstancesApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**analyticsReportInstancesGetInstance**](AnalyticsReportInstancesApi.md#analyticsReportInstancesGetInstance) | **GET** /v1/analyticsReportInstances/{id} |  |
| [**analyticsReportInstancesSegmentsGetToManyRelated**](AnalyticsReportInstancesApi.md#analyticsReportInstancesSegmentsGetToManyRelated) | **GET** /v1/analyticsReportInstances/{id}/segments |  |



## analyticsReportInstancesGetInstance

> AnalyticsReportInstanceResponse analyticsReportInstancesGetInstance(id, fieldsAnalyticsReportInstances, fieldsAnalyticsReportSegments)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AnalyticsReportInstancesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AnalyticsReportInstancesApi apiInstance = new AnalyticsReportInstancesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAnalyticsReportInstances = Arrays.asList(); // List<String> | the fields to include for returned resources of type analyticsReportInstances
        List<String> fieldsAnalyticsReportSegments = Arrays.asList(); // List<String> | the fields to include for returned resources of type analyticsReportSegments
        try {
            AnalyticsReportInstanceResponse result = apiInstance.analyticsReportInstancesGetInstance(id, fieldsAnalyticsReportInstances, fieldsAnalyticsReportSegments);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnalyticsReportInstancesApi#analyticsReportInstancesGetInstance");
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
| **fieldsAnalyticsReportInstances** | **List&lt;String&gt;**| the fields to include for returned resources of type analyticsReportInstances | [optional] [enum: granularity, processingDate, segments] |
| **fieldsAnalyticsReportSegments** | **List&lt;String&gt;**| the fields to include for returned resources of type analyticsReportSegments | [optional] [enum: checksum, sizeInBytes, url] |

### Return type

[**AnalyticsReportInstanceResponse**](AnalyticsReportInstanceResponse.md)

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
| **200** | Single AnalyticsReportInstance |  -  |


## analyticsReportInstancesSegmentsGetToManyRelated

> AnalyticsReportSegmentsResponse analyticsReportInstancesSegmentsGetToManyRelated(id, fieldsAnalyticsReportSegments, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AnalyticsReportInstancesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AnalyticsReportInstancesApi apiInstance = new AnalyticsReportInstancesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAnalyticsReportSegments = Arrays.asList(); // List<String> | the fields to include for returned resources of type analyticsReportSegments
        Integer limit = 56; // Integer | maximum resources per page
        try {
            AnalyticsReportSegmentsResponse result = apiInstance.analyticsReportInstancesSegmentsGetToManyRelated(id, fieldsAnalyticsReportSegments, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnalyticsReportInstancesApi#analyticsReportInstancesSegmentsGetToManyRelated");
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
| **fieldsAnalyticsReportSegments** | **List&lt;String&gt;**| the fields to include for returned resources of type analyticsReportSegments | [optional] [enum: checksum, sizeInBytes, url] |
| **limit** | **Integer**| maximum resources per page | [optional] |

### Return type

[**AnalyticsReportSegmentsResponse**](AnalyticsReportSegmentsResponse.md)

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
| **200** | List of AnalyticsReportSegments |  -  |

