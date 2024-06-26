# SubscriptionPricePointsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**subscriptionPricePointsEqualizationsGetToManyRelated**](SubscriptionPricePointsApi.md#subscriptionPricePointsEqualizationsGetToManyRelated) | **GET** /v1/subscriptionPricePoints/{id}/equalizations |  |
| [**subscriptionPricePointsGetInstance**](SubscriptionPricePointsApi.md#subscriptionPricePointsGetInstance) | **GET** /v1/subscriptionPricePoints/{id} |  |



## subscriptionPricePointsEqualizationsGetToManyRelated

> SubscriptionPricePointsResponse subscriptionPricePointsEqualizationsGetToManyRelated(id, filterSubscription, filterTerritory, fieldsSubscriptionPricePoints, fieldsTerritories, limit, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionPricePointsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionPricePointsApi apiInstance = new SubscriptionPricePointsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> filterSubscription = Arrays.asList(); // List<String> | filter by id(s) of related 'subscription'
        List<String> filterTerritory = Arrays.asList(); // List<String> | filter by id(s) of related 'territory'
        List<String> fieldsSubscriptionPricePoints = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionPricePoints
        List<String> fieldsTerritories = Arrays.asList(); // List<String> | the fields to include for returned resources of type territories
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            SubscriptionPricePointsResponse result = apiInstance.subscriptionPricePointsEqualizationsGetToManyRelated(id, filterSubscription, filterTerritory, fieldsSubscriptionPricePoints, fieldsTerritories, limit, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionPricePointsApi#subscriptionPricePointsEqualizationsGetToManyRelated");
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
| **filterSubscription** | **List&lt;String&gt;**| filter by id(s) of related &#39;subscription&#39; | [optional] |
| **filterTerritory** | **List&lt;String&gt;**| filter by id(s) of related &#39;territory&#39; | [optional] |
| **fieldsSubscriptionPricePoints** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionPricePoints | [optional] [enum: customerPrice, equalizations, proceeds, proceedsYear2, subscription, territory] |
| **fieldsTerritories** | **List&lt;String&gt;**| the fields to include for returned resources of type territories | [optional] [enum: currency] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: territory] |

### Return type

[**SubscriptionPricePointsResponse**](SubscriptionPricePointsResponse.md)

### Authorization

[itc-bearer-token](../README.md#itc-bearer-token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/csv

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Parameter error(s) |  -  |
| **401** | Unauthorized error(s) |  -  |
| **403** | Forbidden error |  -  |
| **404** | Not found error |  -  |
| **200** | List of SubscriptionPricePoints |  -  |


## subscriptionPricePointsGetInstance

> SubscriptionPricePointResponse subscriptionPricePointsGetInstance(id, fieldsSubscriptionPricePoints, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionPricePointsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionPricePointsApi apiInstance = new SubscriptionPricePointsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsSubscriptionPricePoints = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionPricePoints
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            SubscriptionPricePointResponse result = apiInstance.subscriptionPricePointsGetInstance(id, fieldsSubscriptionPricePoints, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionPricePointsApi#subscriptionPricePointsGetInstance");
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
| **fieldsSubscriptionPricePoints** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionPricePoints | [optional] [enum: customerPrice, equalizations, proceeds, proceedsYear2, subscription, territory] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: territory] |

### Return type

[**SubscriptionPricePointResponse**](SubscriptionPricePointResponse.md)

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
| **200** | Single SubscriptionPricePoint |  -  |

