# AppAvailabilitiesApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**appAvailabilitiesAvailableTerritoriesGetToManyRelated**](AppAvailabilitiesApi.md#appAvailabilitiesAvailableTerritoriesGetToManyRelated) | **GET** /v1/appAvailabilities/{id}/availableTerritories |  |
| [**appAvailabilitiesCreateInstance**](AppAvailabilitiesApi.md#appAvailabilitiesCreateInstance) | **POST** /v1/appAvailabilities |  |
| [**appAvailabilitiesGetInstance**](AppAvailabilitiesApi.md#appAvailabilitiesGetInstance) | **GET** /v1/appAvailabilities/{id} |  |
| [**appAvailabilitiesV2CreateInstance**](AppAvailabilitiesApi.md#appAvailabilitiesV2CreateInstance) | **POST** /v2/appAvailabilities |  |
| [**appAvailabilitiesV2GetInstance**](AppAvailabilitiesApi.md#appAvailabilitiesV2GetInstance) | **GET** /v2/appAvailabilities/{id} |  |
| [**appAvailabilitiesV2TerritoryAvailabilitiesGetToManyRelated**](AppAvailabilitiesApi.md#appAvailabilitiesV2TerritoryAvailabilitiesGetToManyRelated) | **GET** /v2/appAvailabilities/{id}/territoryAvailabilities |  |



## appAvailabilitiesAvailableTerritoriesGetToManyRelated

> TerritoriesResponse appAvailabilitiesAvailableTerritoriesGetToManyRelated(id, fieldsTerritories, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppAvailabilitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppAvailabilitiesApi apiInstance = new AppAvailabilitiesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsTerritories = Arrays.asList(); // List<String> | the fields to include for returned resources of type territories
        Integer limit = 56; // Integer | maximum resources per page
        try {
            TerritoriesResponse result = apiInstance.appAvailabilitiesAvailableTerritoriesGetToManyRelated(id, fieldsTerritories, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppAvailabilitiesApi#appAvailabilitiesAvailableTerritoriesGetToManyRelated");
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


## appAvailabilitiesCreateInstance

> AppAvailabilityResponse appAvailabilitiesCreateInstance(appAvailabilityCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppAvailabilitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppAvailabilitiesApi apiInstance = new AppAvailabilitiesApi(defaultClient);
        AppAvailabilityCreateRequest appAvailabilityCreateRequest = new AppAvailabilityCreateRequest(); // AppAvailabilityCreateRequest | AppAvailability representation
        try {
            AppAvailabilityResponse result = apiInstance.appAvailabilitiesCreateInstance(appAvailabilityCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppAvailabilitiesApi#appAvailabilitiesCreateInstance");
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
| **appAvailabilityCreateRequest** | [**AppAvailabilityCreateRequest**](AppAvailabilityCreateRequest.md)| AppAvailability representation | |

### Return type

[**AppAvailabilityResponse**](AppAvailabilityResponse.md)

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
| **201** | Single AppAvailability |  -  |
| **409** | Request entity error(s) |  -  |


## appAvailabilitiesGetInstance

> AppAvailabilityResponse appAvailabilitiesGetInstance(id, fieldsAppAvailabilities, include, fieldsTerritories, limitAvailableTerritories)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppAvailabilitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppAvailabilitiesApi apiInstance = new AppAvailabilitiesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAppAvailabilities = Arrays.asList(); // List<String> | the fields to include for returned resources of type appAvailabilities
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsTerritories = Arrays.asList(); // List<String> | the fields to include for returned resources of type territories
        Integer limitAvailableTerritories = 56; // Integer | maximum number of related availableTerritories returned (when they are included)
        try {
            AppAvailabilityResponse result = apiInstance.appAvailabilitiesGetInstance(id, fieldsAppAvailabilities, include, fieldsTerritories, limitAvailableTerritories);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppAvailabilitiesApi#appAvailabilitiesGetInstance");
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
| **fieldsAppAvailabilities** | **List&lt;String&gt;**| the fields to include for returned resources of type appAvailabilities | [optional] [enum: app, availableInNewTerritories, availableTerritories] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: app, availableTerritories] |
| **fieldsTerritories** | **List&lt;String&gt;**| the fields to include for returned resources of type territories | [optional] [enum: currency] |
| **limitAvailableTerritories** | **Integer**| maximum number of related availableTerritories returned (when they are included) | [optional] |

### Return type

[**AppAvailabilityResponse**](AppAvailabilityResponse.md)

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
| **200** | Single AppAvailability |  -  |


## appAvailabilitiesV2CreateInstance

> AppAvailabilityV2Response appAvailabilitiesV2CreateInstance(appAvailabilityV2CreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppAvailabilitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppAvailabilitiesApi apiInstance = new AppAvailabilitiesApi(defaultClient);
        AppAvailabilityV2CreateRequest appAvailabilityV2CreateRequest = new AppAvailabilityV2CreateRequest(); // AppAvailabilityV2CreateRequest | AppAvailability representation
        try {
            AppAvailabilityV2Response result = apiInstance.appAvailabilitiesV2CreateInstance(appAvailabilityV2CreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppAvailabilitiesApi#appAvailabilitiesV2CreateInstance");
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
| **appAvailabilityV2CreateRequest** | [**AppAvailabilityV2CreateRequest**](AppAvailabilityV2CreateRequest.md)| AppAvailability representation | |

### Return type

[**AppAvailabilityV2Response**](AppAvailabilityV2Response.md)

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
| **201** | Single AppAvailability |  -  |
| **409** | Request entity error(s) |  -  |


## appAvailabilitiesV2GetInstance

> AppAvailabilityV2Response appAvailabilitiesV2GetInstance(id, fieldsAppAvailabilities, include, fieldsTerritoryAvailabilities, limitTerritoryAvailabilities)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppAvailabilitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppAvailabilitiesApi apiInstance = new AppAvailabilitiesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAppAvailabilities = Arrays.asList(); // List<String> | the fields to include for returned resources of type appAvailabilities
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsTerritoryAvailabilities = Arrays.asList(); // List<String> | the fields to include for returned resources of type territoryAvailabilities
        Integer limitTerritoryAvailabilities = 56; // Integer | maximum number of related territoryAvailabilities returned (when they are included)
        try {
            AppAvailabilityV2Response result = apiInstance.appAvailabilitiesV2GetInstance(id, fieldsAppAvailabilities, include, fieldsTerritoryAvailabilities, limitTerritoryAvailabilities);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppAvailabilitiesApi#appAvailabilitiesV2GetInstance");
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
| **fieldsAppAvailabilities** | **List&lt;String&gt;**| the fields to include for returned resources of type appAvailabilities | [optional] [enum: app, availableInNewTerritories, territoryAvailabilities] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: territoryAvailabilities] |
| **fieldsTerritoryAvailabilities** | **List&lt;String&gt;**| the fields to include for returned resources of type territoryAvailabilities | [optional] [enum: available, contentStatuses, preOrderEnabled, preOrderPublishDate, releaseDate, territory] |
| **limitTerritoryAvailabilities** | **Integer**| maximum number of related territoryAvailabilities returned (when they are included) | [optional] |

### Return type

[**AppAvailabilityV2Response**](AppAvailabilityV2Response.md)

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
| **200** | Single AppAvailability |  -  |


## appAvailabilitiesV2TerritoryAvailabilitiesGetToManyRelated

> TerritoryAvailabilitiesResponse appAvailabilitiesV2TerritoryAvailabilitiesGetToManyRelated(id, fieldsTerritoryAvailabilities, fieldsTerritories, limit, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppAvailabilitiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppAvailabilitiesApi apiInstance = new AppAvailabilitiesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsTerritoryAvailabilities = Arrays.asList(); // List<String> | the fields to include for returned resources of type territoryAvailabilities
        List<String> fieldsTerritories = Arrays.asList(); // List<String> | the fields to include for returned resources of type territories
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            TerritoryAvailabilitiesResponse result = apiInstance.appAvailabilitiesV2TerritoryAvailabilitiesGetToManyRelated(id, fieldsTerritoryAvailabilities, fieldsTerritories, limit, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppAvailabilitiesApi#appAvailabilitiesV2TerritoryAvailabilitiesGetToManyRelated");
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
| **fieldsTerritoryAvailabilities** | **List&lt;String&gt;**| the fields to include for returned resources of type territoryAvailabilities | [optional] [enum: available, contentStatuses, preOrderEnabled, preOrderPublishDate, releaseDate, territory] |
| **fieldsTerritories** | **List&lt;String&gt;**| the fields to include for returned resources of type territories | [optional] [enum: currency] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: territory] |

### Return type

[**TerritoryAvailabilitiesResponse**](TerritoryAvailabilitiesResponse.md)

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
| **200** | List of TerritoryAvailabilities |  -  |

