# AlternativeDistributionPackageVersionsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**alternativeDistributionPackageVersionsDeltasGetToManyRelated**](AlternativeDistributionPackageVersionsApi.md#alternativeDistributionPackageVersionsDeltasGetToManyRelated) | **GET** /v1/alternativeDistributionPackageVersions/{id}/deltas |  |
| [**alternativeDistributionPackageVersionsGetInstance**](AlternativeDistributionPackageVersionsApi.md#alternativeDistributionPackageVersionsGetInstance) | **GET** /v1/alternativeDistributionPackageVersions/{id} |  |
| [**alternativeDistributionPackageVersionsVariantsGetToManyRelated**](AlternativeDistributionPackageVersionsApi.md#alternativeDistributionPackageVersionsVariantsGetToManyRelated) | **GET** /v1/alternativeDistributionPackageVersions/{id}/variants |  |



## alternativeDistributionPackageVersionsDeltasGetToManyRelated

> AlternativeDistributionPackageDeltasResponse alternativeDistributionPackageVersionsDeltasGetToManyRelated(id, fieldsAlternativeDistributionPackageDeltas, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AlternativeDistributionPackageVersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AlternativeDistributionPackageVersionsApi apiInstance = new AlternativeDistributionPackageVersionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAlternativeDistributionPackageDeltas = Arrays.asList(); // List<String> | the fields to include for returned resources of type alternativeDistributionPackageDeltas
        Integer limit = 56; // Integer | maximum resources per page
        try {
            AlternativeDistributionPackageDeltasResponse result = apiInstance.alternativeDistributionPackageVersionsDeltasGetToManyRelated(id, fieldsAlternativeDistributionPackageDeltas, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlternativeDistributionPackageVersionsApi#alternativeDistributionPackageVersionsDeltasGetToManyRelated");
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
| **fieldsAlternativeDistributionPackageDeltas** | **List&lt;String&gt;**| the fields to include for returned resources of type alternativeDistributionPackageDeltas | [optional] [enum: alternativeDistributionKeyBlob, fileChecksum, url, urlExpirationDate] |
| **limit** | **Integer**| maximum resources per page | [optional] |

### Return type

[**AlternativeDistributionPackageDeltasResponse**](AlternativeDistributionPackageDeltasResponse.md)

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
| **200** | List of AlternativeDistributionPackageDeltas |  -  |


## alternativeDistributionPackageVersionsGetInstance

> AlternativeDistributionPackageVersionResponse alternativeDistributionPackageVersionsGetInstance(id, fieldsAlternativeDistributionPackageVersions, include, fieldsAlternativeDistributionPackageVariants, fieldsAlternativeDistributionPackageDeltas, limitDeltas, limitVariants)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AlternativeDistributionPackageVersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AlternativeDistributionPackageVersionsApi apiInstance = new AlternativeDistributionPackageVersionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAlternativeDistributionPackageVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type alternativeDistributionPackageVersions
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsAlternativeDistributionPackageVariants = Arrays.asList(); // List<String> | the fields to include for returned resources of type alternativeDistributionPackageVariants
        List<String> fieldsAlternativeDistributionPackageDeltas = Arrays.asList(); // List<String> | the fields to include for returned resources of type alternativeDistributionPackageDeltas
        Integer limitDeltas = 56; // Integer | maximum number of related deltas returned (when they are included)
        Integer limitVariants = 56; // Integer | maximum number of related variants returned (when they are included)
        try {
            AlternativeDistributionPackageVersionResponse result = apiInstance.alternativeDistributionPackageVersionsGetInstance(id, fieldsAlternativeDistributionPackageVersions, include, fieldsAlternativeDistributionPackageVariants, fieldsAlternativeDistributionPackageDeltas, limitDeltas, limitVariants);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlternativeDistributionPackageVersionsApi#alternativeDistributionPackageVersionsGetInstance");
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
| **fieldsAlternativeDistributionPackageVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type alternativeDistributionPackageVersions | [optional] [enum: alternativeDistributionPackage, deltas, fileChecksum, state, url, urlExpirationDate, variants, version] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: alternativeDistributionPackage, deltas, variants] |
| **fieldsAlternativeDistributionPackageVariants** | **List&lt;String&gt;**| the fields to include for returned resources of type alternativeDistributionPackageVariants | [optional] [enum: alternativeDistributionKeyBlob, fileChecksum, url, urlExpirationDate] |
| **fieldsAlternativeDistributionPackageDeltas** | **List&lt;String&gt;**| the fields to include for returned resources of type alternativeDistributionPackageDeltas | [optional] [enum: alternativeDistributionKeyBlob, fileChecksum, url, urlExpirationDate] |
| **limitDeltas** | **Integer**| maximum number of related deltas returned (when they are included) | [optional] |
| **limitVariants** | **Integer**| maximum number of related variants returned (when they are included) | [optional] |

### Return type

[**AlternativeDistributionPackageVersionResponse**](AlternativeDistributionPackageVersionResponse.md)

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
| **200** | Single AlternativeDistributionPackageVersion |  -  |


## alternativeDistributionPackageVersionsVariantsGetToManyRelated

> AlternativeDistributionPackageVariantsResponse alternativeDistributionPackageVersionsVariantsGetToManyRelated(id, fieldsAlternativeDistributionPackageVariants, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AlternativeDistributionPackageVersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AlternativeDistributionPackageVersionsApi apiInstance = new AlternativeDistributionPackageVersionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAlternativeDistributionPackageVariants = Arrays.asList(); // List<String> | the fields to include for returned resources of type alternativeDistributionPackageVariants
        Integer limit = 56; // Integer | maximum resources per page
        try {
            AlternativeDistributionPackageVariantsResponse result = apiInstance.alternativeDistributionPackageVersionsVariantsGetToManyRelated(id, fieldsAlternativeDistributionPackageVariants, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlternativeDistributionPackageVersionsApi#alternativeDistributionPackageVersionsVariantsGetToManyRelated");
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
| **fieldsAlternativeDistributionPackageVariants** | **List&lt;String&gt;**| the fields to include for returned resources of type alternativeDistributionPackageVariants | [optional] [enum: alternativeDistributionKeyBlob, fileChecksum, url, urlExpirationDate] |
| **limit** | **Integer**| maximum resources per page | [optional] |

### Return type

[**AlternativeDistributionPackageVariantsResponse**](AlternativeDistributionPackageVariantsResponse.md)

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
| **200** | List of AlternativeDistributionPackageVariants |  -  |

