# AppPriceSchedulesApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**appPriceSchedulesAutomaticPricesGetToManyRelated**](AppPriceSchedulesApi.md#appPriceSchedulesAutomaticPricesGetToManyRelated) | **GET** /v1/appPriceSchedules/{id}/automaticPrices |  |
| [**appPriceSchedulesBaseTerritoryGetToOneRelated**](AppPriceSchedulesApi.md#appPriceSchedulesBaseTerritoryGetToOneRelated) | **GET** /v1/appPriceSchedules/{id}/baseTerritory |  |
| [**appPriceSchedulesCreateInstance**](AppPriceSchedulesApi.md#appPriceSchedulesCreateInstance) | **POST** /v1/appPriceSchedules |  |
| [**appPriceSchedulesGetInstance**](AppPriceSchedulesApi.md#appPriceSchedulesGetInstance) | **GET** /v1/appPriceSchedules/{id} |  |
| [**appPriceSchedulesManualPricesGetToManyRelated**](AppPriceSchedulesApi.md#appPriceSchedulesManualPricesGetToManyRelated) | **GET** /v1/appPriceSchedules/{id}/manualPrices |  |



## appPriceSchedulesAutomaticPricesGetToManyRelated

> AppPricesV2Response appPriceSchedulesAutomaticPricesGetToManyRelated(id, filterEndDate, filterStartDate, filterTerritory, fieldsAppPrices, fieldsAppPricePoints, fieldsTerritories, limit, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppPriceSchedulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppPriceSchedulesApi apiInstance = new AppPriceSchedulesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> filterEndDate = Arrays.asList(); // List<String> | filter by attribute 'endDate'
        List<String> filterStartDate = Arrays.asList(); // List<String> | filter by attribute 'startDate'
        List<String> filterTerritory = Arrays.asList(); // List<String> | filter by id(s) of related 'territory'
        List<String> fieldsAppPrices = Arrays.asList(); // List<String> | the fields to include for returned resources of type appPrices
        List<String> fieldsAppPricePoints = Arrays.asList(); // List<String> | the fields to include for returned resources of type appPricePoints
        List<String> fieldsTerritories = Arrays.asList(); // List<String> | the fields to include for returned resources of type territories
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            AppPricesV2Response result = apiInstance.appPriceSchedulesAutomaticPricesGetToManyRelated(id, filterEndDate, filterStartDate, filterTerritory, fieldsAppPrices, fieldsAppPricePoints, fieldsTerritories, limit, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppPriceSchedulesApi#appPriceSchedulesAutomaticPricesGetToManyRelated");
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
| **filterEndDate** | **List&lt;String&gt;**| filter by attribute &#39;endDate&#39; | [optional] |
| **filterStartDate** | **List&lt;String&gt;**| filter by attribute &#39;startDate&#39; | [optional] |
| **filterTerritory** | **List&lt;String&gt;**| filter by id(s) of related &#39;territory&#39; | [optional] |
| **fieldsAppPrices** | **List&lt;String&gt;**| the fields to include for returned resources of type appPrices | [optional] [enum: appPricePoint, endDate, manual, startDate, territory] |
| **fieldsAppPricePoints** | **List&lt;String&gt;**| the fields to include for returned resources of type appPricePoints | [optional] [enum: app, customerPrice, equalizations, proceeds, territory] |
| **fieldsTerritories** | **List&lt;String&gt;**| the fields to include for returned resources of type territories | [optional] [enum: currency] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: appPricePoint, territory] |

### Return type

[**AppPricesV2Response**](AppPricesV2Response.md)

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
| **200** | List of AppPrices |  -  |


## appPriceSchedulesBaseTerritoryGetToOneRelated

> TerritoryResponse appPriceSchedulesBaseTerritoryGetToOneRelated(id, fieldsTerritories)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppPriceSchedulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppPriceSchedulesApi apiInstance = new AppPriceSchedulesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsTerritories = Arrays.asList(); // List<String> | the fields to include for returned resources of type territories
        try {
            TerritoryResponse result = apiInstance.appPriceSchedulesBaseTerritoryGetToOneRelated(id, fieldsTerritories);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppPriceSchedulesApi#appPriceSchedulesBaseTerritoryGetToOneRelated");
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

### Return type

[**TerritoryResponse**](TerritoryResponse.md)

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
| **200** | Single Territory |  -  |


## appPriceSchedulesCreateInstance

> AppPriceScheduleResponse appPriceSchedulesCreateInstance(appPriceScheduleCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppPriceSchedulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppPriceSchedulesApi apiInstance = new AppPriceSchedulesApi(defaultClient);
        AppPriceScheduleCreateRequest appPriceScheduleCreateRequest = new AppPriceScheduleCreateRequest(); // AppPriceScheduleCreateRequest | AppPriceSchedule representation
        try {
            AppPriceScheduleResponse result = apiInstance.appPriceSchedulesCreateInstance(appPriceScheduleCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppPriceSchedulesApi#appPriceSchedulesCreateInstance");
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
| **appPriceScheduleCreateRequest** | [**AppPriceScheduleCreateRequest**](AppPriceScheduleCreateRequest.md)| AppPriceSchedule representation | |

### Return type

[**AppPriceScheduleResponse**](AppPriceScheduleResponse.md)

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
| **201** | Single AppPriceSchedule |  -  |
| **409** | Request entity error(s) |  -  |


## appPriceSchedulesGetInstance

> AppPriceScheduleResponse appPriceSchedulesGetInstance(id, fieldsAppPriceSchedules, include, fieldsAppPrices, fieldsTerritories, limitAutomaticPrices, limitManualPrices)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppPriceSchedulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppPriceSchedulesApi apiInstance = new AppPriceSchedulesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAppPriceSchedules = Arrays.asList(); // List<String> | the fields to include for returned resources of type appPriceSchedules
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsAppPrices = Arrays.asList(); // List<String> | the fields to include for returned resources of type appPrices
        List<String> fieldsTerritories = Arrays.asList(); // List<String> | the fields to include for returned resources of type territories
        Integer limitAutomaticPrices = 56; // Integer | maximum number of related automaticPrices returned (when they are included)
        Integer limitManualPrices = 56; // Integer | maximum number of related manualPrices returned (when they are included)
        try {
            AppPriceScheduleResponse result = apiInstance.appPriceSchedulesGetInstance(id, fieldsAppPriceSchedules, include, fieldsAppPrices, fieldsTerritories, limitAutomaticPrices, limitManualPrices);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppPriceSchedulesApi#appPriceSchedulesGetInstance");
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
| **fieldsAppPriceSchedules** | **List&lt;String&gt;**| the fields to include for returned resources of type appPriceSchedules | [optional] [enum: app, automaticPrices, baseTerritory, manualPrices] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: app, automaticPrices, baseTerritory, manualPrices] |
| **fieldsAppPrices** | **List&lt;String&gt;**| the fields to include for returned resources of type appPrices | [optional] [enum: appPricePoint, endDate, manual, startDate, territory] |
| **fieldsTerritories** | **List&lt;String&gt;**| the fields to include for returned resources of type territories | [optional] [enum: currency] |
| **limitAutomaticPrices** | **Integer**| maximum number of related automaticPrices returned (when they are included) | [optional] |
| **limitManualPrices** | **Integer**| maximum number of related manualPrices returned (when they are included) | [optional] |

### Return type

[**AppPriceScheduleResponse**](AppPriceScheduleResponse.md)

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
| **200** | Single AppPriceSchedule |  -  |


## appPriceSchedulesManualPricesGetToManyRelated

> AppPricesV2Response appPriceSchedulesManualPricesGetToManyRelated(id, filterEndDate, filterStartDate, filterTerritory, fieldsAppPrices, fieldsAppPricePoints, fieldsTerritories, limit, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppPriceSchedulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppPriceSchedulesApi apiInstance = new AppPriceSchedulesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> filterEndDate = Arrays.asList(); // List<String> | filter by attribute 'endDate'
        List<String> filterStartDate = Arrays.asList(); // List<String> | filter by attribute 'startDate'
        List<String> filterTerritory = Arrays.asList(); // List<String> | filter by id(s) of related 'territory'
        List<String> fieldsAppPrices = Arrays.asList(); // List<String> | the fields to include for returned resources of type appPrices
        List<String> fieldsAppPricePoints = Arrays.asList(); // List<String> | the fields to include for returned resources of type appPricePoints
        List<String> fieldsTerritories = Arrays.asList(); // List<String> | the fields to include for returned resources of type territories
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            AppPricesV2Response result = apiInstance.appPriceSchedulesManualPricesGetToManyRelated(id, filterEndDate, filterStartDate, filterTerritory, fieldsAppPrices, fieldsAppPricePoints, fieldsTerritories, limit, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppPriceSchedulesApi#appPriceSchedulesManualPricesGetToManyRelated");
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
| **filterEndDate** | **List&lt;String&gt;**| filter by attribute &#39;endDate&#39; | [optional] |
| **filterStartDate** | **List&lt;String&gt;**| filter by attribute &#39;startDate&#39; | [optional] |
| **filterTerritory** | **List&lt;String&gt;**| filter by id(s) of related &#39;territory&#39; | [optional] |
| **fieldsAppPrices** | **List&lt;String&gt;**| the fields to include for returned resources of type appPrices | [optional] [enum: appPricePoint, endDate, manual, startDate, territory] |
| **fieldsAppPricePoints** | **List&lt;String&gt;**| the fields to include for returned resources of type appPricePoints | [optional] [enum: app, customerPrice, equalizations, proceeds, territory] |
| **fieldsTerritories** | **List&lt;String&gt;**| the fields to include for returned resources of type territories | [optional] [enum: currency] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: appPricePoint, territory] |

### Return type

[**AppPricesV2Response**](AppPricesV2Response.md)

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
| **200** | List of AppPrices |  -  |

