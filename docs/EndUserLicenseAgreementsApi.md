# EndUserLicenseAgreementsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**endUserLicenseAgreementsCreateInstance**](EndUserLicenseAgreementsApi.md#endUserLicenseAgreementsCreateInstance) | **POST** /v1/endUserLicenseAgreements |  |
| [**endUserLicenseAgreementsDeleteInstance**](EndUserLicenseAgreementsApi.md#endUserLicenseAgreementsDeleteInstance) | **DELETE** /v1/endUserLicenseAgreements/{id} |  |
| [**endUserLicenseAgreementsGetInstance**](EndUserLicenseAgreementsApi.md#endUserLicenseAgreementsGetInstance) | **GET** /v1/endUserLicenseAgreements/{id} |  |
| [**endUserLicenseAgreementsTerritoriesGetToManyRelated**](EndUserLicenseAgreementsApi.md#endUserLicenseAgreementsTerritoriesGetToManyRelated) | **GET** /v1/endUserLicenseAgreements/{id}/territories |  |
| [**endUserLicenseAgreementsUpdateInstance**](EndUserLicenseAgreementsApi.md#endUserLicenseAgreementsUpdateInstance) | **PATCH** /v1/endUserLicenseAgreements/{id} |  |



## endUserLicenseAgreementsCreateInstance

> EndUserLicenseAgreementResponse endUserLicenseAgreementsCreateInstance(endUserLicenseAgreementCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.EndUserLicenseAgreementsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        EndUserLicenseAgreementsApi apiInstance = new EndUserLicenseAgreementsApi(defaultClient);
        EndUserLicenseAgreementCreateRequest endUserLicenseAgreementCreateRequest = new EndUserLicenseAgreementCreateRequest(); // EndUserLicenseAgreementCreateRequest | EndUserLicenseAgreement representation
        try {
            EndUserLicenseAgreementResponse result = apiInstance.endUserLicenseAgreementsCreateInstance(endUserLicenseAgreementCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EndUserLicenseAgreementsApi#endUserLicenseAgreementsCreateInstance");
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
| **endUserLicenseAgreementCreateRequest** | [**EndUserLicenseAgreementCreateRequest**](EndUserLicenseAgreementCreateRequest.md)| EndUserLicenseAgreement representation | |

### Return type

[**EndUserLicenseAgreementResponse**](EndUserLicenseAgreementResponse.md)

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
| **201** | Single EndUserLicenseAgreement |  -  |
| **409** | Request entity error(s) |  -  |


## endUserLicenseAgreementsDeleteInstance

> endUserLicenseAgreementsDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.EndUserLicenseAgreementsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        EndUserLicenseAgreementsApi apiInstance = new EndUserLicenseAgreementsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.endUserLicenseAgreementsDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling EndUserLicenseAgreementsApi#endUserLicenseAgreementsDeleteInstance");
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


## endUserLicenseAgreementsGetInstance

> EndUserLicenseAgreementResponse endUserLicenseAgreementsGetInstance(id, fieldsEndUserLicenseAgreements, include, fieldsTerritories, limitTerritories)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.EndUserLicenseAgreementsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        EndUserLicenseAgreementsApi apiInstance = new EndUserLicenseAgreementsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsEndUserLicenseAgreements = Arrays.asList(); // List<String> | the fields to include for returned resources of type endUserLicenseAgreements
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsTerritories = Arrays.asList(); // List<String> | the fields to include for returned resources of type territories
        Integer limitTerritories = 56; // Integer | maximum number of related territories returned (when they are included)
        try {
            EndUserLicenseAgreementResponse result = apiInstance.endUserLicenseAgreementsGetInstance(id, fieldsEndUserLicenseAgreements, include, fieldsTerritories, limitTerritories);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EndUserLicenseAgreementsApi#endUserLicenseAgreementsGetInstance");
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
| **fieldsEndUserLicenseAgreements** | **List&lt;String&gt;**| the fields to include for returned resources of type endUserLicenseAgreements | [optional] [enum: agreementText, app, territories] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: app, territories] |
| **fieldsTerritories** | **List&lt;String&gt;**| the fields to include for returned resources of type territories | [optional] [enum: currency] |
| **limitTerritories** | **Integer**| maximum number of related territories returned (when they are included) | [optional] |

### Return type

[**EndUserLicenseAgreementResponse**](EndUserLicenseAgreementResponse.md)

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
| **200** | Single EndUserLicenseAgreement |  -  |


## endUserLicenseAgreementsTerritoriesGetToManyRelated

> TerritoriesWithoutIncludesResponse endUserLicenseAgreementsTerritoriesGetToManyRelated(id, fieldsTerritories, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.EndUserLicenseAgreementsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        EndUserLicenseAgreementsApi apiInstance = new EndUserLicenseAgreementsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsTerritories = Arrays.asList(); // List<String> | the fields to include for returned resources of type territories
        Integer limit = 56; // Integer | maximum resources per page
        try {
            TerritoriesWithoutIncludesResponse result = apiInstance.endUserLicenseAgreementsTerritoriesGetToManyRelated(id, fieldsTerritories, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EndUserLicenseAgreementsApi#endUserLicenseAgreementsTerritoriesGetToManyRelated");
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

[**TerritoriesWithoutIncludesResponse**](TerritoriesWithoutIncludesResponse.md)

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
| **200** | List of Territories with get |  -  |


## endUserLicenseAgreementsUpdateInstance

> EndUserLicenseAgreementResponse endUserLicenseAgreementsUpdateInstance(id, endUserLicenseAgreementUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.EndUserLicenseAgreementsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        EndUserLicenseAgreementsApi apiInstance = new EndUserLicenseAgreementsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        EndUserLicenseAgreementUpdateRequest endUserLicenseAgreementUpdateRequest = new EndUserLicenseAgreementUpdateRequest(); // EndUserLicenseAgreementUpdateRequest | EndUserLicenseAgreement representation
        try {
            EndUserLicenseAgreementResponse result = apiInstance.endUserLicenseAgreementsUpdateInstance(id, endUserLicenseAgreementUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EndUserLicenseAgreementsApi#endUserLicenseAgreementsUpdateInstance");
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
| **endUserLicenseAgreementUpdateRequest** | [**EndUserLicenseAgreementUpdateRequest**](EndUserLicenseAgreementUpdateRequest.md)| EndUserLicenseAgreement representation | |

### Return type

[**EndUserLicenseAgreementResponse**](EndUserLicenseAgreementResponse.md)

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
| **200** | Single EndUserLicenseAgreement |  -  |
| **409** | Request entity error(s) |  -  |

