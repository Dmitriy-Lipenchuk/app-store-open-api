# InAppPurchasePriceSchedulesApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**inAppPurchasePriceSchedulesAutomaticPricesGetToManyRelated**](InAppPurchasePriceSchedulesApi.md#inAppPurchasePriceSchedulesAutomaticPricesGetToManyRelated) | **GET** /v1/inAppPurchasePriceSchedules/{id}/automaticPrices |  |
| [**inAppPurchasePriceSchedulesBaseTerritoryGetToOneRelated**](InAppPurchasePriceSchedulesApi.md#inAppPurchasePriceSchedulesBaseTerritoryGetToOneRelated) | **GET** /v1/inAppPurchasePriceSchedules/{id}/baseTerritory |  |
| [**inAppPurchasePriceSchedulesCreateInstance**](InAppPurchasePriceSchedulesApi.md#inAppPurchasePriceSchedulesCreateInstance) | **POST** /v1/inAppPurchasePriceSchedules |  |
| [**inAppPurchasePriceSchedulesGetInstance**](InAppPurchasePriceSchedulesApi.md#inAppPurchasePriceSchedulesGetInstance) | **GET** /v1/inAppPurchasePriceSchedules/{id} |  |
| [**inAppPurchasePriceSchedulesManualPricesGetToManyRelated**](InAppPurchasePriceSchedulesApi.md#inAppPurchasePriceSchedulesManualPricesGetToManyRelated) | **GET** /v1/inAppPurchasePriceSchedules/{id}/manualPrices |  |



## inAppPurchasePriceSchedulesAutomaticPricesGetToManyRelated

> InAppPurchasePricesResponse inAppPurchasePriceSchedulesAutomaticPricesGetToManyRelated(id, filterTerritory, fieldsInAppPurchasePricePoints, fieldsInAppPurchasePrices, fieldsTerritories, limit, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.InAppPurchasePriceSchedulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        InAppPurchasePriceSchedulesApi apiInstance = new InAppPurchasePriceSchedulesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> filterTerritory = Arrays.asList(); // List<String> | filter by id(s) of related 'territory'
        List<String> fieldsInAppPurchasePricePoints = Arrays.asList(); // List<String> | the fields to include for returned resources of type inAppPurchasePricePoints
        List<String> fieldsInAppPurchasePrices = Arrays.asList(); // List<String> | the fields to include for returned resources of type inAppPurchasePrices
        List<String> fieldsTerritories = Arrays.asList(); // List<String> | the fields to include for returned resources of type territories
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            InAppPurchasePricesResponse result = apiInstance.inAppPurchasePriceSchedulesAutomaticPricesGetToManyRelated(id, filterTerritory, fieldsInAppPurchasePricePoints, fieldsInAppPurchasePrices, fieldsTerritories, limit, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InAppPurchasePriceSchedulesApi#inAppPurchasePriceSchedulesAutomaticPricesGetToManyRelated");
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
| **filterTerritory** | **List&lt;String&gt;**| filter by id(s) of related &#39;territory&#39; | [optional] |
| **fieldsInAppPurchasePricePoints** | **List&lt;String&gt;**| the fields to include for returned resources of type inAppPurchasePricePoints | [optional] [enum: customerPrice, inAppPurchaseV2, proceeds, territory] |
| **fieldsInAppPurchasePrices** | **List&lt;String&gt;**| the fields to include for returned resources of type inAppPurchasePrices | [optional] [enum: endDate, inAppPurchasePricePoint, inAppPurchaseV2, manual, startDate, territory] |
| **fieldsTerritories** | **List&lt;String&gt;**| the fields to include for returned resources of type territories | [optional] [enum: currency] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: inAppPurchasePricePoint, territory] |

### Return type

[**InAppPurchasePricesResponse**](InAppPurchasePricesResponse.md)

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
| **200** | List of InAppPurchasePrices |  -  |


## inAppPurchasePriceSchedulesBaseTerritoryGetToOneRelated

> TerritoryResponse inAppPurchasePriceSchedulesBaseTerritoryGetToOneRelated(id, fieldsTerritories)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.InAppPurchasePriceSchedulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        InAppPurchasePriceSchedulesApi apiInstance = new InAppPurchasePriceSchedulesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsTerritories = Arrays.asList(); // List<String> | the fields to include for returned resources of type territories
        try {
            TerritoryResponse result = apiInstance.inAppPurchasePriceSchedulesBaseTerritoryGetToOneRelated(id, fieldsTerritories);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InAppPurchasePriceSchedulesApi#inAppPurchasePriceSchedulesBaseTerritoryGetToOneRelated");
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


## inAppPurchasePriceSchedulesCreateInstance

> InAppPurchasePriceScheduleResponse inAppPurchasePriceSchedulesCreateInstance(inAppPurchasePriceScheduleCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.InAppPurchasePriceSchedulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        InAppPurchasePriceSchedulesApi apiInstance = new InAppPurchasePriceSchedulesApi(defaultClient);
        InAppPurchasePriceScheduleCreateRequest inAppPurchasePriceScheduleCreateRequest = new InAppPurchasePriceScheduleCreateRequest(); // InAppPurchasePriceScheduleCreateRequest | InAppPurchasePriceSchedule representation
        try {
            InAppPurchasePriceScheduleResponse result = apiInstance.inAppPurchasePriceSchedulesCreateInstance(inAppPurchasePriceScheduleCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InAppPurchasePriceSchedulesApi#inAppPurchasePriceSchedulesCreateInstance");
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
| **inAppPurchasePriceScheduleCreateRequest** | [**InAppPurchasePriceScheduleCreateRequest**](InAppPurchasePriceScheduleCreateRequest.md)| InAppPurchasePriceSchedule representation | |

### Return type

[**InAppPurchasePriceScheduleResponse**](InAppPurchasePriceScheduleResponse.md)

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
| **201** | Single InAppPurchasePriceSchedule |  -  |
| **409** | Request entity error(s) |  -  |


## inAppPurchasePriceSchedulesGetInstance

> InAppPurchasePriceScheduleResponse inAppPurchasePriceSchedulesGetInstance(id, fieldsInAppPurchasePriceSchedules, include, fieldsInAppPurchasePrices, fieldsTerritories, limitAutomaticPrices, limitManualPrices)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.InAppPurchasePriceSchedulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        InAppPurchasePriceSchedulesApi apiInstance = new InAppPurchasePriceSchedulesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsInAppPurchasePriceSchedules = Arrays.asList(); // List<String> | the fields to include for returned resources of type inAppPurchasePriceSchedules
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsInAppPurchasePrices = Arrays.asList(); // List<String> | the fields to include for returned resources of type inAppPurchasePrices
        List<String> fieldsTerritories = Arrays.asList(); // List<String> | the fields to include for returned resources of type territories
        Integer limitAutomaticPrices = 56; // Integer | maximum number of related automaticPrices returned (when they are included)
        Integer limitManualPrices = 56; // Integer | maximum number of related manualPrices returned (when they are included)
        try {
            InAppPurchasePriceScheduleResponse result = apiInstance.inAppPurchasePriceSchedulesGetInstance(id, fieldsInAppPurchasePriceSchedules, include, fieldsInAppPurchasePrices, fieldsTerritories, limitAutomaticPrices, limitManualPrices);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InAppPurchasePriceSchedulesApi#inAppPurchasePriceSchedulesGetInstance");
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
| **fieldsInAppPurchasePriceSchedules** | **List&lt;String&gt;**| the fields to include for returned resources of type inAppPurchasePriceSchedules | [optional] [enum: automaticPrices, baseTerritory, inAppPurchase, manualPrices] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: automaticPrices, baseTerritory, inAppPurchase, manualPrices] |
| **fieldsInAppPurchasePrices** | **List&lt;String&gt;**| the fields to include for returned resources of type inAppPurchasePrices | [optional] [enum: endDate, inAppPurchasePricePoint, inAppPurchaseV2, manual, startDate, territory] |
| **fieldsTerritories** | **List&lt;String&gt;**| the fields to include for returned resources of type territories | [optional] [enum: currency] |
| **limitAutomaticPrices** | **Integer**| maximum number of related automaticPrices returned (when they are included) | [optional] |
| **limitManualPrices** | **Integer**| maximum number of related manualPrices returned (when they are included) | [optional] |

### Return type

[**InAppPurchasePriceScheduleResponse**](InAppPurchasePriceScheduleResponse.md)

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
| **200** | Single InAppPurchasePriceSchedule |  -  |


## inAppPurchasePriceSchedulesManualPricesGetToManyRelated

> InAppPurchasePricesResponse inAppPurchasePriceSchedulesManualPricesGetToManyRelated(id, filterTerritory, fieldsInAppPurchasePricePoints, fieldsInAppPurchasePrices, fieldsTerritories, limit, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.InAppPurchasePriceSchedulesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        InAppPurchasePriceSchedulesApi apiInstance = new InAppPurchasePriceSchedulesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> filterTerritory = Arrays.asList(); // List<String> | filter by id(s) of related 'territory'
        List<String> fieldsInAppPurchasePricePoints = Arrays.asList(); // List<String> | the fields to include for returned resources of type inAppPurchasePricePoints
        List<String> fieldsInAppPurchasePrices = Arrays.asList(); // List<String> | the fields to include for returned resources of type inAppPurchasePrices
        List<String> fieldsTerritories = Arrays.asList(); // List<String> | the fields to include for returned resources of type territories
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            InAppPurchasePricesResponse result = apiInstance.inAppPurchasePriceSchedulesManualPricesGetToManyRelated(id, filterTerritory, fieldsInAppPurchasePricePoints, fieldsInAppPurchasePrices, fieldsTerritories, limit, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InAppPurchasePriceSchedulesApi#inAppPurchasePriceSchedulesManualPricesGetToManyRelated");
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
| **filterTerritory** | **List&lt;String&gt;**| filter by id(s) of related &#39;territory&#39; | [optional] |
| **fieldsInAppPurchasePricePoints** | **List&lt;String&gt;**| the fields to include for returned resources of type inAppPurchasePricePoints | [optional] [enum: customerPrice, inAppPurchaseV2, proceeds, territory] |
| **fieldsInAppPurchasePrices** | **List&lt;String&gt;**| the fields to include for returned resources of type inAppPurchasePrices | [optional] [enum: endDate, inAppPurchasePricePoint, inAppPurchaseV2, manual, startDate, territory] |
| **fieldsTerritories** | **List&lt;String&gt;**| the fields to include for returned resources of type territories | [optional] [enum: currency] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: inAppPurchasePricePoint, territory] |

### Return type

[**InAppPurchasePricesResponse**](InAppPurchasePricesResponse.md)

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
| **200** | List of InAppPurchasePrices |  -  |

