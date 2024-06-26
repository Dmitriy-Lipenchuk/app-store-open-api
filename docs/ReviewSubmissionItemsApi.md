# ReviewSubmissionItemsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**reviewSubmissionItemsCreateInstance**](ReviewSubmissionItemsApi.md#reviewSubmissionItemsCreateInstance) | **POST** /v1/reviewSubmissionItems |  |
| [**reviewSubmissionItemsDeleteInstance**](ReviewSubmissionItemsApi.md#reviewSubmissionItemsDeleteInstance) | **DELETE** /v1/reviewSubmissionItems/{id} |  |
| [**reviewSubmissionItemsUpdateInstance**](ReviewSubmissionItemsApi.md#reviewSubmissionItemsUpdateInstance) | **PATCH** /v1/reviewSubmissionItems/{id} |  |



## reviewSubmissionItemsCreateInstance

> ReviewSubmissionItemResponse reviewSubmissionItemsCreateInstance(reviewSubmissionItemCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.ReviewSubmissionItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        ReviewSubmissionItemsApi apiInstance = new ReviewSubmissionItemsApi(defaultClient);
        ReviewSubmissionItemCreateRequest reviewSubmissionItemCreateRequest = new ReviewSubmissionItemCreateRequest(); // ReviewSubmissionItemCreateRequest | ReviewSubmissionItem representation
        try {
            ReviewSubmissionItemResponse result = apiInstance.reviewSubmissionItemsCreateInstance(reviewSubmissionItemCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReviewSubmissionItemsApi#reviewSubmissionItemsCreateInstance");
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
| **reviewSubmissionItemCreateRequest** | [**ReviewSubmissionItemCreateRequest**](ReviewSubmissionItemCreateRequest.md)| ReviewSubmissionItem representation | |

### Return type

[**ReviewSubmissionItemResponse**](ReviewSubmissionItemResponse.md)

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
| **201** | Single ReviewSubmissionItem |  -  |
| **409** | Request entity error(s) |  -  |


## reviewSubmissionItemsDeleteInstance

> reviewSubmissionItemsDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.ReviewSubmissionItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        ReviewSubmissionItemsApi apiInstance = new ReviewSubmissionItemsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.reviewSubmissionItemsDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReviewSubmissionItemsApi#reviewSubmissionItemsDeleteInstance");
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


## reviewSubmissionItemsUpdateInstance

> ReviewSubmissionItemResponse reviewSubmissionItemsUpdateInstance(id, reviewSubmissionItemUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.ReviewSubmissionItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        ReviewSubmissionItemsApi apiInstance = new ReviewSubmissionItemsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        ReviewSubmissionItemUpdateRequest reviewSubmissionItemUpdateRequest = new ReviewSubmissionItemUpdateRequest(); // ReviewSubmissionItemUpdateRequest | ReviewSubmissionItem representation
        try {
            ReviewSubmissionItemResponse result = apiInstance.reviewSubmissionItemsUpdateInstance(id, reviewSubmissionItemUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReviewSubmissionItemsApi#reviewSubmissionItemsUpdateInstance");
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
| **reviewSubmissionItemUpdateRequest** | [**ReviewSubmissionItemUpdateRequest**](ReviewSubmissionItemUpdateRequest.md)| ReviewSubmissionItem representation | |

### Return type

[**ReviewSubmissionItemResponse**](ReviewSubmissionItemResponse.md)

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
| **200** | Single ReviewSubmissionItem |  -  |
| **409** | Request entity error(s) |  -  |

