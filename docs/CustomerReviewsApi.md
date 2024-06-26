# CustomerReviewsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**customerReviewsGetInstance**](CustomerReviewsApi.md#customerReviewsGetInstance) | **GET** /v1/customerReviews/{id} |  |
| [**customerReviewsResponseGetToOneRelated**](CustomerReviewsApi.md#customerReviewsResponseGetToOneRelated) | **GET** /v1/customerReviews/{id}/response |  |



## customerReviewsGetInstance

> CustomerReviewResponse customerReviewsGetInstance(id, fieldsCustomerReviews, include, fieldsCustomerReviewResponses)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.CustomerReviewsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        CustomerReviewsApi apiInstance = new CustomerReviewsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsCustomerReviews = Arrays.asList(); // List<String> | the fields to include for returned resources of type customerReviews
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsCustomerReviewResponses = Arrays.asList(); // List<String> | the fields to include for returned resources of type customerReviewResponses
        try {
            CustomerReviewResponse result = apiInstance.customerReviewsGetInstance(id, fieldsCustomerReviews, include, fieldsCustomerReviewResponses);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerReviewsApi#customerReviewsGetInstance");
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
| **fieldsCustomerReviews** | **List&lt;String&gt;**| the fields to include for returned resources of type customerReviews | [optional] [enum: body, createdDate, rating, response, reviewerNickname, territory, title] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: response] |
| **fieldsCustomerReviewResponses** | **List&lt;String&gt;**| the fields to include for returned resources of type customerReviewResponses | [optional] [enum: lastModifiedDate, responseBody, review, state] |

### Return type

[**CustomerReviewResponse**](CustomerReviewResponse.md)

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
| **200** | Single CustomerReview |  -  |


## customerReviewsResponseGetToOneRelated

> CustomerReviewResponseV1Response customerReviewsResponseGetToOneRelated(id, fieldsCustomerReviews, fieldsCustomerReviewResponses, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.CustomerReviewsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        CustomerReviewsApi apiInstance = new CustomerReviewsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsCustomerReviews = Arrays.asList(); // List<String> | the fields to include for returned resources of type customerReviews
        List<String> fieldsCustomerReviewResponses = Arrays.asList(); // List<String> | the fields to include for returned resources of type customerReviewResponses
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            CustomerReviewResponseV1Response result = apiInstance.customerReviewsResponseGetToOneRelated(id, fieldsCustomerReviews, fieldsCustomerReviewResponses, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerReviewsApi#customerReviewsResponseGetToOneRelated");
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
| **fieldsCustomerReviews** | **List&lt;String&gt;**| the fields to include for returned resources of type customerReviews | [optional] [enum: body, createdDate, rating, response, reviewerNickname, territory, title] |
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

