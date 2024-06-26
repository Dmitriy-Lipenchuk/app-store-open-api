# InAppPurchaseAvailabilitiesApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**inAppPurchaseAvailabilitiesAvailableTerritoriesGetToManyRelated**](InAppPurchaseAvailabilitiesApi.md#inAppPurchaseAvailabilitiesAvailableTerritoriesGetToManyRelated) | **GET** /v1/inAppPurchaseAvailabilities/{id}/availableTerritories |  |
| [**inAppPurchaseAvailabilitiesCreateInstance**](InAppPurchaseAvailabilitiesApi.md#inAppPurchaseAvailabilitiesCreateInstance) | **POST** /v1/inAppPurchaseAvailabilities |  |
| [**inAppPurchaseAvailabilitiesGetInstance**](InAppPurchaseAvailabilitiesApi.md#inAppPurchaseAvailabilitiesGetInstance) | **GET** /v1/inAppPurchaseAvailabilities/{id} |  |



## inAppPurchaseAvailabilitiesAvailableTerritoriesGetToManyRelated

> TerritoriesResponse inAppPurchaseAvailabilitiesAvailableTerritoriesGetToManyRelated(id, fieldsTerritories, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.InAppPurchaseAvailabilitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        InAppPurchaseAvailabilitiesApi apiInstance = new InAppPurchaseAvailabilitiesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsTerritories = Arrays.asList(); // List<String> | the fields to include for returned resources of type territories
        Integer limit = 56; // Integer | maximum resources per page
        try {
            TerritoriesResponse result = apiInstance.inAppPurchaseAvailabilitiesAvailableTerritoriesGetToManyRelated(id, fieldsTerritories, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InAppPurchaseAvailabilitiesApi#inAppPurchaseAvailabilitiesAvailableTerritoriesGetToManyRelated");
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


## inAppPurchaseAvailabilitiesCreateInstance

> InAppPurchaseAvailabilityResponse inAppPurchaseAvailabilitiesCreateInstance(inAppPurchaseAvailabilityCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.InAppPurchaseAvailabilitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        InAppPurchaseAvailabilitiesApi apiInstance = new InAppPurchaseAvailabilitiesApi(defaultClient);
        InAppPurchaseAvailabilityCreateRequest inAppPurchaseAvailabilityCreateRequest = new InAppPurchaseAvailabilityCreateRequest(); // InAppPurchaseAvailabilityCreateRequest | InAppPurchaseAvailability representation
        try {
            InAppPurchaseAvailabilityResponse result = apiInstance.inAppPurchaseAvailabilitiesCreateInstance(inAppPurchaseAvailabilityCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InAppPurchaseAvailabilitiesApi#inAppPurchaseAvailabilitiesCreateInstance");
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
| **inAppPurchaseAvailabilityCreateRequest** | [**InAppPurchaseAvailabilityCreateRequest**](InAppPurchaseAvailabilityCreateRequest.md)| InAppPurchaseAvailability representation | |

### Return type

[**InAppPurchaseAvailabilityResponse**](InAppPurchaseAvailabilityResponse.md)

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
| **201** | Single InAppPurchaseAvailability |  -  |
| **409** | Request entity error(s) |  -  |


## inAppPurchaseAvailabilitiesGetInstance

> InAppPurchaseAvailabilityResponse inAppPurchaseAvailabilitiesGetInstance(id, fieldsInAppPurchaseAvailabilities, include, fieldsTerritories, limitAvailableTerritories)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.InAppPurchaseAvailabilitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        InAppPurchaseAvailabilitiesApi apiInstance = new InAppPurchaseAvailabilitiesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsInAppPurchaseAvailabilities = Arrays.asList(); // List<String> | the fields to include for returned resources of type inAppPurchaseAvailabilities
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsTerritories = Arrays.asList(); // List<String> | the fields to include for returned resources of type territories
        Integer limitAvailableTerritories = 56; // Integer | maximum number of related availableTerritories returned (when they are included)
        try {
            InAppPurchaseAvailabilityResponse result = apiInstance.inAppPurchaseAvailabilitiesGetInstance(id, fieldsInAppPurchaseAvailabilities, include, fieldsTerritories, limitAvailableTerritories);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InAppPurchaseAvailabilitiesApi#inAppPurchaseAvailabilitiesGetInstance");
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
| **fieldsInAppPurchaseAvailabilities** | **List&lt;String&gt;**| the fields to include for returned resources of type inAppPurchaseAvailabilities | [optional] [enum: availableInNewTerritories, availableTerritories, inAppPurchase] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: availableTerritories] |
| **fieldsTerritories** | **List&lt;String&gt;**| the fields to include for returned resources of type territories | [optional] [enum: currency] |
| **limitAvailableTerritories** | **Integer**| maximum number of related availableTerritories returned (when they are included) | [optional] |

### Return type

[**InAppPurchaseAvailabilityResponse**](InAppPurchaseAvailabilityResponse.md)

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
| **200** | Single InAppPurchaseAvailability |  -  |

