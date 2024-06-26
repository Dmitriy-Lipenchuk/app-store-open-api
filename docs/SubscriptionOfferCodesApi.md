# SubscriptionOfferCodesApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**subscriptionOfferCodesCreateInstance**](SubscriptionOfferCodesApi.md#subscriptionOfferCodesCreateInstance) | **POST** /v1/subscriptionOfferCodes |  |
| [**subscriptionOfferCodesCustomCodesGetToManyRelated**](SubscriptionOfferCodesApi.md#subscriptionOfferCodesCustomCodesGetToManyRelated) | **GET** /v1/subscriptionOfferCodes/{id}/customCodes |  |
| [**subscriptionOfferCodesGetInstance**](SubscriptionOfferCodesApi.md#subscriptionOfferCodesGetInstance) | **GET** /v1/subscriptionOfferCodes/{id} |  |
| [**subscriptionOfferCodesOneTimeUseCodesGetToManyRelated**](SubscriptionOfferCodesApi.md#subscriptionOfferCodesOneTimeUseCodesGetToManyRelated) | **GET** /v1/subscriptionOfferCodes/{id}/oneTimeUseCodes |  |
| [**subscriptionOfferCodesPricesGetToManyRelated**](SubscriptionOfferCodesApi.md#subscriptionOfferCodesPricesGetToManyRelated) | **GET** /v1/subscriptionOfferCodes/{id}/prices |  |
| [**subscriptionOfferCodesUpdateInstance**](SubscriptionOfferCodesApi.md#subscriptionOfferCodesUpdateInstance) | **PATCH** /v1/subscriptionOfferCodes/{id} |  |



## subscriptionOfferCodesCreateInstance

> SubscriptionOfferCodeResponse subscriptionOfferCodesCreateInstance(subscriptionOfferCodeCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionOfferCodesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionOfferCodesApi apiInstance = new SubscriptionOfferCodesApi(defaultClient);
        SubscriptionOfferCodeCreateRequest subscriptionOfferCodeCreateRequest = new SubscriptionOfferCodeCreateRequest(); // SubscriptionOfferCodeCreateRequest | SubscriptionOfferCode representation
        try {
            SubscriptionOfferCodeResponse result = apiInstance.subscriptionOfferCodesCreateInstance(subscriptionOfferCodeCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionOfferCodesApi#subscriptionOfferCodesCreateInstance");
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
| **subscriptionOfferCodeCreateRequest** | [**SubscriptionOfferCodeCreateRequest**](SubscriptionOfferCodeCreateRequest.md)| SubscriptionOfferCode representation | |

### Return type

[**SubscriptionOfferCodeResponse**](SubscriptionOfferCodeResponse.md)

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
| **201** | Single SubscriptionOfferCode |  -  |
| **409** | Request entity error(s) |  -  |


## subscriptionOfferCodesCustomCodesGetToManyRelated

> SubscriptionOfferCodeCustomCodesResponse subscriptionOfferCodesCustomCodesGetToManyRelated(id, fieldsSubscriptionOfferCodeCustomCodes, fieldsSubscriptionOfferCodes, limit, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionOfferCodesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionOfferCodesApi apiInstance = new SubscriptionOfferCodesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsSubscriptionOfferCodeCustomCodes = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionOfferCodeCustomCodes
        List<String> fieldsSubscriptionOfferCodes = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionOfferCodes
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            SubscriptionOfferCodeCustomCodesResponse result = apiInstance.subscriptionOfferCodesCustomCodesGetToManyRelated(id, fieldsSubscriptionOfferCodeCustomCodes, fieldsSubscriptionOfferCodes, limit, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionOfferCodesApi#subscriptionOfferCodesCustomCodesGetToManyRelated");
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
| **fieldsSubscriptionOfferCodeCustomCodes** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionOfferCodeCustomCodes | [optional] [enum: active, createdDate, customCode, expirationDate, numberOfCodes, offerCode] |
| **fieldsSubscriptionOfferCodes** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionOfferCodes | [optional] [enum: active, customCodes, customerEligibilities, duration, name, numberOfPeriods, offerEligibility, offerMode, oneTimeUseCodes, prices, subscription, totalNumberOfCodes] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: offerCode] |

### Return type

[**SubscriptionOfferCodeCustomCodesResponse**](SubscriptionOfferCodeCustomCodesResponse.md)

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
| **200** | List of SubscriptionOfferCodeCustomCodes |  -  |


## subscriptionOfferCodesGetInstance

> SubscriptionOfferCodeResponse subscriptionOfferCodesGetInstance(id, fieldsSubscriptionOfferCodes, include, fieldsSubscriptionOfferCodeCustomCodes, fieldsSubscriptionOfferCodeOneTimeUseCodes, fieldsSubscriptionOfferCodePrices, limitCustomCodes, limitOneTimeUseCodes, limitPrices)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionOfferCodesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionOfferCodesApi apiInstance = new SubscriptionOfferCodesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsSubscriptionOfferCodes = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionOfferCodes
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsSubscriptionOfferCodeCustomCodes = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionOfferCodeCustomCodes
        List<String> fieldsSubscriptionOfferCodeOneTimeUseCodes = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionOfferCodeOneTimeUseCodes
        List<String> fieldsSubscriptionOfferCodePrices = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionOfferCodePrices
        Integer limitCustomCodes = 56; // Integer | maximum number of related customCodes returned (when they are included)
        Integer limitOneTimeUseCodes = 56; // Integer | maximum number of related oneTimeUseCodes returned (when they are included)
        Integer limitPrices = 56; // Integer | maximum number of related prices returned (when they are included)
        try {
            SubscriptionOfferCodeResponse result = apiInstance.subscriptionOfferCodesGetInstance(id, fieldsSubscriptionOfferCodes, include, fieldsSubscriptionOfferCodeCustomCodes, fieldsSubscriptionOfferCodeOneTimeUseCodes, fieldsSubscriptionOfferCodePrices, limitCustomCodes, limitOneTimeUseCodes, limitPrices);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionOfferCodesApi#subscriptionOfferCodesGetInstance");
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
| **fieldsSubscriptionOfferCodes** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionOfferCodes | [optional] [enum: active, customCodes, customerEligibilities, duration, name, numberOfPeriods, offerEligibility, offerMode, oneTimeUseCodes, prices, subscription, totalNumberOfCodes] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: customCodes, oneTimeUseCodes, prices, subscription] |
| **fieldsSubscriptionOfferCodeCustomCodes** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionOfferCodeCustomCodes | [optional] [enum: active, createdDate, customCode, expirationDate, numberOfCodes, offerCode] |
| **fieldsSubscriptionOfferCodeOneTimeUseCodes** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionOfferCodeOneTimeUseCodes | [optional] [enum: active, createdDate, expirationDate, numberOfCodes, offerCode, values] |
| **fieldsSubscriptionOfferCodePrices** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionOfferCodePrices | [optional] [enum: subscriptionPricePoint, territory] |
| **limitCustomCodes** | **Integer**| maximum number of related customCodes returned (when they are included) | [optional] |
| **limitOneTimeUseCodes** | **Integer**| maximum number of related oneTimeUseCodes returned (when they are included) | [optional] |
| **limitPrices** | **Integer**| maximum number of related prices returned (when they are included) | [optional] |

### Return type

[**SubscriptionOfferCodeResponse**](SubscriptionOfferCodeResponse.md)

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
| **200** | Single SubscriptionOfferCode |  -  |


## subscriptionOfferCodesOneTimeUseCodesGetToManyRelated

> SubscriptionOfferCodeOneTimeUseCodesResponse subscriptionOfferCodesOneTimeUseCodesGetToManyRelated(id, fieldsSubscriptionOfferCodes, fieldsSubscriptionOfferCodeOneTimeUseCodes, limit, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionOfferCodesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionOfferCodesApi apiInstance = new SubscriptionOfferCodesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsSubscriptionOfferCodes = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionOfferCodes
        List<String> fieldsSubscriptionOfferCodeOneTimeUseCodes = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionOfferCodeOneTimeUseCodes
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            SubscriptionOfferCodeOneTimeUseCodesResponse result = apiInstance.subscriptionOfferCodesOneTimeUseCodesGetToManyRelated(id, fieldsSubscriptionOfferCodes, fieldsSubscriptionOfferCodeOneTimeUseCodes, limit, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionOfferCodesApi#subscriptionOfferCodesOneTimeUseCodesGetToManyRelated");
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
| **fieldsSubscriptionOfferCodes** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionOfferCodes | [optional] [enum: active, customCodes, customerEligibilities, duration, name, numberOfPeriods, offerEligibility, offerMode, oneTimeUseCodes, prices, subscription, totalNumberOfCodes] |
| **fieldsSubscriptionOfferCodeOneTimeUseCodes** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionOfferCodeOneTimeUseCodes | [optional] [enum: active, createdDate, expirationDate, numberOfCodes, offerCode, values] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: offerCode] |

### Return type

[**SubscriptionOfferCodeOneTimeUseCodesResponse**](SubscriptionOfferCodeOneTimeUseCodesResponse.md)

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
| **200** | List of SubscriptionOfferCodeOneTimeUseCodes |  -  |


## subscriptionOfferCodesPricesGetToManyRelated

> SubscriptionOfferCodePricesResponse subscriptionOfferCodesPricesGetToManyRelated(id, filterTerritory, fieldsSubscriptionPricePoints, fieldsTerritories, fieldsSubscriptionOfferCodePrices, limit, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionOfferCodesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionOfferCodesApi apiInstance = new SubscriptionOfferCodesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> filterTerritory = Arrays.asList(); // List<String> | filter by id(s) of related 'territory'
        List<String> fieldsSubscriptionPricePoints = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionPricePoints
        List<String> fieldsTerritories = Arrays.asList(); // List<String> | the fields to include for returned resources of type territories
        List<String> fieldsSubscriptionOfferCodePrices = Arrays.asList(); // List<String> | the fields to include for returned resources of type subscriptionOfferCodePrices
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            SubscriptionOfferCodePricesResponse result = apiInstance.subscriptionOfferCodesPricesGetToManyRelated(id, filterTerritory, fieldsSubscriptionPricePoints, fieldsTerritories, fieldsSubscriptionOfferCodePrices, limit, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionOfferCodesApi#subscriptionOfferCodesPricesGetToManyRelated");
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
| **fieldsSubscriptionPricePoints** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionPricePoints | [optional] [enum: customerPrice, equalizations, proceeds, proceedsYear2, subscription, territory] |
| **fieldsTerritories** | **List&lt;String&gt;**| the fields to include for returned resources of type territories | [optional] [enum: currency] |
| **fieldsSubscriptionOfferCodePrices** | **List&lt;String&gt;**| the fields to include for returned resources of type subscriptionOfferCodePrices | [optional] [enum: subscriptionPricePoint, territory] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: subscriptionPricePoint, territory] |

### Return type

[**SubscriptionOfferCodePricesResponse**](SubscriptionOfferCodePricesResponse.md)

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
| **200** | List of SubscriptionOfferCodePrices |  -  |


## subscriptionOfferCodesUpdateInstance

> SubscriptionOfferCodeResponse subscriptionOfferCodesUpdateInstance(id, subscriptionOfferCodeUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.SubscriptionOfferCodesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        SubscriptionOfferCodesApi apiInstance = new SubscriptionOfferCodesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        SubscriptionOfferCodeUpdateRequest subscriptionOfferCodeUpdateRequest = new SubscriptionOfferCodeUpdateRequest(); // SubscriptionOfferCodeUpdateRequest | SubscriptionOfferCode representation
        try {
            SubscriptionOfferCodeResponse result = apiInstance.subscriptionOfferCodesUpdateInstance(id, subscriptionOfferCodeUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionOfferCodesApi#subscriptionOfferCodesUpdateInstance");
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
| **subscriptionOfferCodeUpdateRequest** | [**SubscriptionOfferCodeUpdateRequest**](SubscriptionOfferCodeUpdateRequest.md)| SubscriptionOfferCode representation | |

### Return type

[**SubscriptionOfferCodeResponse**](SubscriptionOfferCodeResponse.md)

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
| **200** | Single SubscriptionOfferCode |  -  |
| **409** | Request entity error(s) |  -  |

