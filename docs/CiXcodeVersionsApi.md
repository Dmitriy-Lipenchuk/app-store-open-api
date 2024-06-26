# CiXcodeVersionsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ciXcodeVersionsGetCollection**](CiXcodeVersionsApi.md#ciXcodeVersionsGetCollection) | **GET** /v1/ciXcodeVersions |  |
| [**ciXcodeVersionsGetInstance**](CiXcodeVersionsApi.md#ciXcodeVersionsGetInstance) | **GET** /v1/ciXcodeVersions/{id} |  |
| [**ciXcodeVersionsMacOsVersionsGetToManyRelated**](CiXcodeVersionsApi.md#ciXcodeVersionsMacOsVersionsGetToManyRelated) | **GET** /v1/ciXcodeVersions/{id}/macOsVersions |  |



## ciXcodeVersionsGetCollection

> CiXcodeVersionsResponse ciXcodeVersionsGetCollection(fieldsCiXcodeVersions, limit, include, fieldsCiMacOsVersions, limitMacOsVersions)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.CiXcodeVersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        CiXcodeVersionsApi apiInstance = new CiXcodeVersionsApi(defaultClient);
        List<String> fieldsCiXcodeVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type ciXcodeVersions
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsCiMacOsVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type ciMacOsVersions
        Integer limitMacOsVersions = 56; // Integer | maximum number of related macOsVersions returned (when they are included)
        try {
            CiXcodeVersionsResponse result = apiInstance.ciXcodeVersionsGetCollection(fieldsCiXcodeVersions, limit, include, fieldsCiMacOsVersions, limitMacOsVersions);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CiXcodeVersionsApi#ciXcodeVersionsGetCollection");
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
| **fieldsCiXcodeVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type ciXcodeVersions | [optional] [enum: macOsVersions, name, testDestinations, version] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: macOsVersions] |
| **fieldsCiMacOsVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type ciMacOsVersions | [optional] [enum: name, version, xcodeVersions] |
| **limitMacOsVersions** | **Integer**| maximum number of related macOsVersions returned (when they are included) | [optional] |

### Return type

[**CiXcodeVersionsResponse**](CiXcodeVersionsResponse.md)

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
| **200** | List of CiXcodeVersions |  -  |


## ciXcodeVersionsGetInstance

> CiXcodeVersionResponse ciXcodeVersionsGetInstance(id, fieldsCiXcodeVersions, include, fieldsCiMacOsVersions, limitMacOsVersions)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.CiXcodeVersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        CiXcodeVersionsApi apiInstance = new CiXcodeVersionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsCiXcodeVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type ciXcodeVersions
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsCiMacOsVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type ciMacOsVersions
        Integer limitMacOsVersions = 56; // Integer | maximum number of related macOsVersions returned (when they are included)
        try {
            CiXcodeVersionResponse result = apiInstance.ciXcodeVersionsGetInstance(id, fieldsCiXcodeVersions, include, fieldsCiMacOsVersions, limitMacOsVersions);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CiXcodeVersionsApi#ciXcodeVersionsGetInstance");
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
| **fieldsCiXcodeVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type ciXcodeVersions | [optional] [enum: macOsVersions, name, testDestinations, version] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: macOsVersions] |
| **fieldsCiMacOsVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type ciMacOsVersions | [optional] [enum: name, version, xcodeVersions] |
| **limitMacOsVersions** | **Integer**| maximum number of related macOsVersions returned (when they are included) | [optional] |

### Return type

[**CiXcodeVersionResponse**](CiXcodeVersionResponse.md)

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
| **200** | Single CiXcodeVersion |  -  |


## ciXcodeVersionsMacOsVersionsGetToManyRelated

> CiMacOsVersionsResponse ciXcodeVersionsMacOsVersionsGetToManyRelated(id, fieldsCiXcodeVersions, fieldsCiMacOsVersions, limit, limitXcodeVersions, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.CiXcodeVersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        CiXcodeVersionsApi apiInstance = new CiXcodeVersionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsCiXcodeVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type ciXcodeVersions
        List<String> fieldsCiMacOsVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type ciMacOsVersions
        Integer limit = 56; // Integer | maximum resources per page
        Integer limitXcodeVersions = 56; // Integer | maximum number of related xcodeVersions returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            CiMacOsVersionsResponse result = apiInstance.ciXcodeVersionsMacOsVersionsGetToManyRelated(id, fieldsCiXcodeVersions, fieldsCiMacOsVersions, limit, limitXcodeVersions, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CiXcodeVersionsApi#ciXcodeVersionsMacOsVersionsGetToManyRelated");
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
| **fieldsCiXcodeVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type ciXcodeVersions | [optional] [enum: macOsVersions, name, testDestinations, version] |
| **fieldsCiMacOsVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type ciMacOsVersions | [optional] [enum: name, version, xcodeVersions] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **limitXcodeVersions** | **Integer**| maximum number of related xcodeVersions returned (when they are included) | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: xcodeVersions] |

### Return type

[**CiMacOsVersionsResponse**](CiMacOsVersionsResponse.md)

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
| **200** | List of CiMacOsVersions |  -  |

