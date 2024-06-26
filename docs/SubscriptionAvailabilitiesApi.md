# SubscriptionAvailabilitiesApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**subscriptionAvailabilitiesAvailableTerritoriesGetToManyRelated**](SubscriptionAvailabilitiesApi.md#subscriptionAvailabilitiesAvailableTerritoriesGetToManyRelated) | **GET** /v1/subscriptionAvailabilities/{id}/availableTerritories |  |
| [**subscriptionAvailabilitiesCreateInstance**](SubscriptionAvailabilitiesApi.md#subscriptionAvailabilitiesCreateInstance) | **POST** /v1/subscriptionAvailabilities |  |
| [**subscriptionAvailabilitiesGetInstance**](SubscriptionAvailabilitiesApi.md#subscriptionAvailabilitiesGetInstance) | **GET** /v1/subscriptionAvailabilities/{id} |  |



## subscriptionAvailabilitiesAvailableTerritoriesGetToManyRelated

> TerritoriesResponse subscriptionAvailabilitiesAvailableTerritoriesGetToManyRelated(id, fieldsTerritories, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionAvailabilitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionAvailabilitiesApi apiInstance = new SubscriptionAvailabilitiesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsTerritories = Arrays.asList(); // List<String> | the fields to include for returned resources of type territories
        Integer limit = 56; // Integer | maximum resources per page
        try {
            TerritoriesResponse result = apiInstance.subscriptionAvailabilitiesAvailableTerritoriesGetToManyRelated(id, fieldsTerritories, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionAvailabilitiesApi#subscriptionAvailabilitiesAvailableTerritoriesGetToManyRelated");
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
| **fieldsTerritories** | **List&lt;String&gt;**| the fields to include for returned resources of type territories | [optional] [enum: currency] |
| **limit** | **Integer**| maximum resources per page | [optional] |

### Return type

[**TerritoriesResponse**](TerritoriesResponse.md)

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
| **200** | List of Territories |  -  |


## subscriptionAvailabilitiesCreateInstance

> SubscriptionAvailabilityResponse subscriptionAvailabilitiesCreateInstance(subscriptionAvailabilityCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionAvailabilitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionAvailabilitiesApi apiInstance = new SubscriptionAvailabilitiesApi(defaultClient);
        SubscriptionAvailabilityCreateRequest subscriptionAvailabilityCreateRequest = new SubscriptionAvailabilityCreateRequest(); // SubscriptionAvailabilityCreateRequest | SubscriptionAvailability representation
        try {
            SubscriptionAvailabilityResponse result = apiInstance.subscriptionAvailabilitiesCreateInstance(subscriptionAvailabilityCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionAvailabilitiesApi#subscriptionAvailabilitiesCreateInstance");
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
| **subscriptionAvailabilityCreateRequest** | [**SubscriptionAvailabilityCreateRequest**](SubscriptionAvailabilityCreateRequest.md)| SubscriptionAvailability representation | |

### Return type

[**SubscriptionAvailabilityResponse**](SubscriptionAvailabilityResponse.md)

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
| **201** | Single SubscriptionAvailability |  -  |
| **409** | Request entity error(s) |  -  |


## subscriptionAvailabilitiesGetInstance

> SubscriptionAvailabilityResponse subscriptionAvailabilitiesGetInstance(id, fieldsSubscriptionAvailabilities, include, fieldsTerritories, limitAvailableTerritories)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionAvailabilitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionAvailabilitiesApi apiInstance = new SubscriptionAvailabilitiesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsSubscriptionAvailabilities = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionAvailabilities
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsTerritories = Arrays.asList(); // List<String> | the fields to include for returned resources of type territories
        Integer limitAvailableTerritories = 56; // Integer | maximum number of related availableTerritories returned (when they are included)
        try {
            SubscriptionAvailabilityResponse result = apiInstance.subscriptionAvailabilitiesGetInstance(id, fieldsSubscriptionAvailabilities, include, fieldsTerritories, limitAvailableTerritories);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionAvailabilitiesApi#subscriptionAvailabilitiesGetInstance");
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
| **fieldsSubscriptionAvailabilities** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionAvailabilities | [optional] [enum: availableInNewTerritories, availableTerritories, subscription] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: availableTerritories, subscription] |
| **fieldsTerritories** | **List&lt;String&gt;**| the fields to include for returned resources of type territories | [optional] [enum: currency] |
| **limitAvailableTerritories** | **Integer**| maximum number of related availableTerritories returned (when they are included) | [optional] |

### Return type

[**SubscriptionAvailabilityResponse**](SubscriptionAvailabilityResponse.md)

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
| **200** | Single SubscriptionAvailability |  -  |

