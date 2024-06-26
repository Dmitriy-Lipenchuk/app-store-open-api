# CiMacOsVersionsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ciMacOsVersionsGetCollection**](CiMacOsVersionsApi.md#ciMacOsVersionsGetCollection) | **GET** /v1/ciMacOsVersions |  |
| [**ciMacOsVersionsGetInstance**](CiMacOsVersionsApi.md#ciMacOsVersionsGetInstance) | **GET** /v1/ciMacOsVersions/{id} |  |
| [**ciMacOsVersionsXcodeVersionsGetToManyRelated**](CiMacOsVersionsApi.md#ciMacOsVersionsXcodeVersionsGetToManyRelated) | **GET** /v1/ciMacOsVersions/{id}/xcodeVersions |  |



## ciMacOsVersionsGetCollection

> CiMacOsVersionsResponse ciMacOsVersionsGetCollection(fieldsCiMacOsVersions, limit, include, fieldsCiXcodeVersions, limitXcodeVersions)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.CiMacOsVersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        CiMacOsVersionsApi apiInstance = new CiMacOsVersionsApi(defaultClient);
        List<String> fieldsCiMacOsVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type ciMacOsVersions
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsCiXcodeVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type ciXcodeVersions
        Integer limitXcodeVersions = 56; // Integer | maximum number of related xcodeVersions returned (when they are included)
        try {
            CiMacOsVersionsResponse result = apiInstance.ciMacOsVersionsGetCollection(fieldsCiMacOsVersions, limit, include, fieldsCiXcodeVersions, limitXcodeVersions);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CiMacOsVersionsApi#ciMacOsVersionsGetCollection");
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
| **fieldsCiMacOsVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type ciMacOsVersions | [optional] [enum: name, version, xcodeVersions] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: xcodeVersions] |
| **fieldsCiXcodeVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type ciXcodeVersions | [optional] [enum: macOsVersions, name, testDestinations, version] |
| **limitXcodeVersions** | **Integer**| maximum number of related xcodeVersions returned (when they are included) | [optional] |

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
| **200** | List of CiMacOsVersions |  -  |


## ciMacOsVersionsGetInstance

> CiMacOsVersionResponse ciMacOsVersionsGetInstance(id, fieldsCiMacOsVersions, include, fieldsCiXcodeVersions, limitXcodeVersions)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.CiMacOsVersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        CiMacOsVersionsApi apiInstance = new CiMacOsVersionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsCiMacOsVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type ciMacOsVersions
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsCiXcodeVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type ciXcodeVersions
        Integer limitXcodeVersions = 56; // Integer | maximum number of related xcodeVersions returned (when they are included)
        try {
            CiMacOsVersionResponse result = apiInstance.ciMacOsVersionsGetInstance(id, fieldsCiMacOsVersions, include, fieldsCiXcodeVersions, limitXcodeVersions);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CiMacOsVersionsApi#ciMacOsVersionsGetInstance");
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
| **fieldsCiMacOsVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type ciMacOsVersions | [optional] [enum: name, version, xcodeVersions] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: xcodeVersions] |
| **fieldsCiXcodeVersions** | **List&lt;String&gt;**| the fields to include for returned resources of type ciXcodeVersions | [optional] [enum: macOsVersions, name, testDestinations, version] |
| **limitXcodeVersions** | **Integer**| maximum number of related xcodeVersions returned (when they are included) | [optional] |

### Return type

[**CiMacOsVersionResponse**](CiMacOsVersionResponse.md)

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
| **200** | Single CiMacOsVersion |  -  |


## ciMacOsVersionsXcodeVersionsGetToManyRelated

> CiXcodeVersionsResponse ciMacOsVersionsXcodeVersionsGetToManyRelated(id, fieldsCiXcodeVersions, fieldsCiMacOsVersions, limit, limitMacOsVersions, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.CiMacOsVersionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        CiMacOsVersionsApi apiInstance = new CiMacOsVersionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsCiXcodeVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type ciXcodeVersions
        List<String> fieldsCiMacOsVersions = Arrays.asList(); // List<String> | the fields to include for returned resources of type ciMacOsVersions
        Integer limit = 56; // Integer | maximum resources per page
        Integer limitMacOsVersions = 56; // Integer | maximum number of related macOsVersions returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            CiXcodeVersionsResponse result = apiInstance.ciMacOsVersionsXcodeVersionsGetToManyRelated(id, fieldsCiXcodeVersions, fieldsCiMacOsVersions, limit, limitMacOsVersions, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CiMacOsVersionsApi#ciMacOsVersionsXcodeVersionsGetToManyRelated");
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
| **limitMacOsVersions** | **Integer**| maximum number of related macOsVersions returned (when they are included) | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: macOsVersions] |

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
| **404** | Not found error |  -  |
| **200** | List of CiXcodeVersions |  -  |

