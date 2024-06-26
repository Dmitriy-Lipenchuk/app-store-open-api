# CustomerReviewResponsesApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**customerReviewResponsesCreateInstance**](CustomerReviewResponsesApi.md#customerReviewResponsesCreateInstance) | **POST** /v1/customerReviewResponses |  |
| [**customerReviewResponsesDeleteInstance**](CustomerReviewResponsesApi.md#customerReviewResponsesDeleteInstance) | **DELETE** /v1/customerReviewResponses/{id} |  |
| [**customerReviewResponsesGetInstance**](CustomerReviewResponsesApi.md#customerReviewResponsesGetInstance) | **GET** /v1/customerReviewResponses/{id} |  |



## customerReviewResponsesCreateInstance

> CustomerReviewResponseV1Response customerReviewResponsesCreateInstance(customerReviewResponseV1CreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.CustomerReviewResponsesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        CustomerReviewResponsesApi apiInstance = new CustomerReviewResponsesApi(defaultClient);
        CustomerReviewResponseV1CreateRequest customerReviewResponseV1CreateRequest = new CustomerReviewResponseV1CreateRequest(); // CustomerReviewResponseV1CreateRequest | CustomerReviewResponse representation
        try {
            CustomerReviewResponseV1Response result = apiInstance.customerReviewResponsesCreateInstance(customerReviewResponseV1CreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerReviewResponsesApi#customerReviewResponsesCreateInstance");
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
| **customerReviewResponseV1CreateRequest** | [**CustomerReviewResponseV1CreateRequest**](CustomerReviewResponseV1CreateRequest.md)| CustomerReviewResponse representation | |

### Return type

[**CustomerReviewResponseV1Response**](CustomerReviewResponseV1Response.md)

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
| **201** | Single CustomerReviewResponse |  -  |
| **409** | Request entity error(s) |  -  |


## customerReviewResponsesDeleteInstance

> customerReviewResponsesDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.CustomerReviewResponsesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        CustomerReviewResponsesApi apiInstance = new CustomerReviewResponsesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.customerReviewResponsesDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerReviewResponsesApi#customerReviewResponsesDeleteInstance");
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


## customerReviewResponsesGetInstance

> CustomerReviewResponseV1Response customerReviewResponsesGetInstance(id, fieldsCustomerReviewResponses, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.CustomerReviewResponsesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        CustomerReviewResponsesApi apiInstance = new CustomerReviewResponsesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsCustomerReviewResponses = Arrays.asList(); // List<String> | the fields to include for returned resources of type customerReviewResponses
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            CustomerReviewResponseV1Response result = apiInstance.customerReviewResponsesGetInstance(id, fieldsCustomerReviewResponses, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerReviewResponsesApi#customerReviewResponsesGetInstance");
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
| **fieldsCustomerReviewResponses** | **List&lt;String&gt;**| the fields to include for returned resources of type customerReviewResponses | [optional] [enum: lastModifiedDate, responseBody, review, state] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: review] |

### Return type

[**CustomerReviewResponseV1Response**](CustomerReviewResponseV1Response.md)

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
| **200** | Single CustomerReviewResponse |  -  |

