# AlternativeDistributionPackagesApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**alternativeDistributionPackagesCreateInstance**](AlternativeDistributionPackagesApi.md#alternativeDistributionPackagesCreateInstance) | **POST** /v1/alternativeDistributionPackages |  |
| [**alternativeDistributionPackagesGetInstance**](AlternativeDistributionPackagesApi.md#alternativeDistributionPackagesGetInstance) | **GET** /v1/alternativeDistributionPackages/{id} |  |
| [**alternativeDistributionPackagesVersionsGetToManyRelated**](AlternativeDistributionPackagesApi.md#alternativeDistributionPackagesVersionsGetToManyRelated) | **GET** /v1/alternativeDistributionPackages/{id}/versions |  |



## alternativeDistributionPackagesCreateInstance

> AlternativeDistributionPackageResponse alternativeDistributionPackagesCreateInstance(alternativeDistributionPackageCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AlternativeDistributionPackagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AlternativeDistributionPackagesApi apiInstance = new AlternativeDistributionPackagesApi(defaultClient);
        AlternativeDistributionPackageCreateRequest alternativeDistributionPackageCreateRequest = new AlternativeDistributionPackageCreateRequest(); // AlternativeDistributionPackageCreateRequest | AlternativeDistributionPackage representation
        try {
            AlternativeDistributionPackageResponse result = apiInstance.alternativeDistributionPackagesCreateInstance(alternativeDistributionPackageCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlternativeDistributionPackagesApi#alternativeDistributionPackagesCreateInstance");
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
| **alternativeDistributionPackageCreateRequest** | [**AlternativeDistributionPackageCreateRequest**](AlternativeDistributionPackageCreateRequest.md)| AlternativeDistributionPackage representation | |

### Return type

[**AlternativeDistributionPackageResponse**](AlternativeDistributionPackageResponse.md)

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
| **201** | Single AlternativeDistributionPackage |  -  |
| **409** | Request entity error(s) |  -  |


## alternativeDistributionPackagesGetInstance

> AlternativeDistributionPackageResponse alternativeDistributionPackagesGetInstance(id, fieldsAlternativeDistributionPackages, include, fieldsAlternativeDistributionPackageVersions, limitVersions)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AlternativeDistributionPackagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AlternativeDistributionPackagesApi apiInstance = new AlternativeDistributionPackagesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAlternativeDistributionPackages = Arrays.asList(); // List<String> | the fields to include for returned resources of type alternativeDistributionPackages
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsAlternativeDistributionPackageVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type alternativeDistributionPackageVersions
        Integer limitVersions = 56; // Integer | maximum number of related versions returned (when they are included)
        try {
            AlternativeDistributionPackageResponse result = apiInstance.alternativeDistributionPackagesGetInstance(id, fieldsAlternativeDistributionPackages, include, fieldsAlternativeDistributionPackageVersions, limitVersions);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlternativeDistributionPackagesApi#alternativeDistributionPackagesGetInstance");
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
| **fieldsAlternativeDistributionPackages** | **List&lt;String&gt;**| the fields to include for returned resources of type alternativeDistributionPackages | [optional] [enum: appStoreVersion, versions] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: versions] |
| **fieldsAlternativeDistributionPackageVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type alternativeDistributionPackageVersions | [optional] [enum: alternativeDistributionPackage, deltas, fileChecksum, state, url, urlExpirationDate, variants, version] |
| **limitVersions** | **Integer**| maximum number of related versions returned (when they are included) | [optional] |

### Return type

[**AlternativeDistributionPackageResponse**](AlternativeDistributionPackageResponse.md)

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
| **200** | Single AlternativeDistributionPackage |  -  |


## alternativeDistributionPackagesVersionsGetToManyRelated

> AlternativeDistributionPackageVersionsResponse alternativeDistributionPackagesVersionsGetToManyRelated(id, filterState, fieldsAlternativeDistributionPackageVariants, fieldsAlternativeDistributionPackages, fieldsAlternativeDistributionPackageVersions, fieldsAlternativeDistributionPackageDeltas, limit, limitVariants, limitDeltas, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AlternativeDistributionPackagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AlternativeDistributionPackagesApi apiInstance = new AlternativeDistributionPackagesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> filterState = Arrays.asList(); // List<String> | filter by attribute 'state'
        List<String> fieldsAlternativeDistributionPackageVariants = Arrays.asList(); // List<String> | the fields to include for returned resources of type alternativeDistributionPackageVariants
        List<String> fieldsAlternativeDistributionPackages = Arrays.asList(); // List<String> | the fields to include for returned resources of type alternativeDistributionPackages
        List<String> fieldsAlternativeDistributionPackageVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type alternativeDistributionPackageVersions
        List<String> fieldsAlternativeDistributionPackageDeltas = Arrays.asList(); // List<String> | the fields to include for returned resources of type alternativeDistributionPackageDeltas
        Integer limit = 56; // Integer | maximum resources per page
        Integer limitVariants = 56; // Integer | maximum number of related variants returned (when they are included)
        Integer limitDeltas = 56; // Integer | maximum number of related deltas returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            AlternativeDistributionPackageVersionsResponse result = apiInstance.alternativeDistributionPackagesVersionsGetToManyRelated(id, filterState, fieldsAlternativeDistributionPackageVariants, fieldsAlternativeDistributionPackages, fieldsAlternativeDistributionPackageVersions, fieldsAlternativeDistributionPackageDeltas, limit, limitVariants, limitDeltas, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AlternativeDistributionPackagesApi#alternativeDistributionPackagesVersionsGetToManyRelated");
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
| **filterState** | **List&lt;String&gt;**| filter by attribute &#39;state&#39; | [optional] [enum: COMPLETED, REPLACED] |
| **fieldsAlternativeDistributionPackageVariants** | **List&lt;String&gt;**| the fields to include for returned resources of type alternativeDistributionPackageVariants | [optional] [enum: alternativeDistributionKeyBlob, fileChecksum, url, urlExpirationDate] |
| **fieldsAlternativeDistributionPackages** | **List&lt;String&gt;**| the fields to include for returned resources of type alternativeDistributionPackages | [optional] [enum: appStoreVersion, versions] |
| **fieldsAlternativeDistributionPackageVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type alternativeDistributionPackageVersions | [optional] [enum: alternativeDistributionPackage, deltas, fileChecksum, state, url, urlExpirationDate, variants, version] |
| **fieldsAlternativeDistributionPackageDeltas** | **List&lt;String&gt;**| the fields to include for returned resources of type alternativeDistributionPackageDeltas | [optional] [enum: alternativeDistributionKeyBlob, fileChecksum, url, urlExpirationDate] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **limitVariants** | **Integer**| maximum number of related variants returned (when they are included) | [optional] |
| **limitDeltas** | **Integer**| maximum number of related deltas returned (when they are included) | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: alternativeDistributionPackage, deltas, variants] |

### Return type

[**AlternativeDistributionPackageVersionsResponse**](AlternativeDistributionPackageVersionsResponse.md)

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
| **200** | List of AlternativeDistributionPackageVersions |  -  |

