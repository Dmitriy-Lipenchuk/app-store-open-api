# BuildBundlesApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**buildBundlesAppClipDomainCacheStatusGetToOneRelated**](BuildBundlesApi.md#buildBundlesAppClipDomainCacheStatusGetToOneRelated) | **GET** /v1/buildBundles/{id}/appClipDomainCacheStatus |  |
| [**buildBundlesAppClipDomainDebugStatusGetToOneRelated**](BuildBundlesApi.md#buildBundlesAppClipDomainDebugStatusGetToOneRelated) | **GET** /v1/buildBundles/{id}/appClipDomainDebugStatus |  |
| [**buildBundlesBetaAppClipInvocationsGetToManyRelated**](BuildBundlesApi.md#buildBundlesBetaAppClipInvocationsGetToManyRelated) | **GET** /v1/buildBundles/{id}/betaAppClipInvocations |  |
| [**buildBundlesBuildBundleFileSizesGetToManyRelated**](BuildBundlesApi.md#buildBundlesBuildBundleFileSizesGetToManyRelated) | **GET** /v1/buildBundles/{id}/buildBundleFileSizes |  |



## buildBundlesAppClipDomainCacheStatusGetToOneRelated

> AppClipDomainStatusResponse buildBundlesAppClipDomainCacheStatusGetToOneRelated(id, fieldsAppClipDomainStatuses)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BuildBundlesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BuildBundlesApi apiInstance = new BuildBundlesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAppClipDomainStatuses = Arrays.asList(); // List<String> | the fields to include for returned resources of type appClipDomainStatuses
        try {
            AppClipDomainStatusResponse result = apiInstance.buildBundlesAppClipDomainCacheStatusGetToOneRelated(id, fieldsAppClipDomainStatuses);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BuildBundlesApi#buildBundlesAppClipDomainCacheStatusGetToOneRelated");
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
| **fieldsAppClipDomainStatuses** | **List&lt;String&gt;**| the fields to include for returned resources of type appClipDomainStatuses | [optional] [enum: domains, lastUpdatedDate] |

### Return type

[**AppClipDomainStatusResponse**](AppClipDomainStatusResponse.md)

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
| **200** | Single AppClipDomainStatus |  -  |


## buildBundlesAppClipDomainDebugStatusGetToOneRelated

> AppClipDomainStatusResponse buildBundlesAppClipDomainDebugStatusGetToOneRelated(id, fieldsAppClipDomainStatuses)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BuildBundlesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BuildBundlesApi apiInstance = new BuildBundlesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAppClipDomainStatuses = Arrays.asList(); // List<String> | the fields to include for returned resources of type appClipDomainStatuses
        try {
            AppClipDomainStatusResponse result = apiInstance.buildBundlesAppClipDomainDebugStatusGetToOneRelated(id, fieldsAppClipDomainStatuses);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BuildBundlesApi#buildBundlesAppClipDomainDebugStatusGetToOneRelated");
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
| **fieldsAppClipDomainStatuses** | **List&lt;String&gt;**| the fields to include for returned resources of type appClipDomainStatuses | [optional] [enum: domains, lastUpdatedDate] |

### Return type

[**AppClipDomainStatusResponse**](AppClipDomainStatusResponse.md)

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
| **200** | Single AppClipDomainStatus |  -  |


## buildBundlesBetaAppClipInvocationsGetToManyRelated

> BetaAppClipInvocationsResponse buildBundlesBetaAppClipInvocationsGetToManyRelated(id, fieldsBetaAppClipInvocations, fieldsBetaAppClipInvocationLocalizations, limit, limitBetaAppClipInvocationLocalizations, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BuildBundlesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BuildBundlesApi apiInstance = new BuildBundlesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsBetaAppClipInvocations = Arrays.asList(); // List<String> | the fields to include for returned resources of type betaAppClipInvocations
        List<String> fieldsBetaAppClipInvocationLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type betaAppClipInvocationLocalizations
        Integer limit = 56; // Integer | maximum resources per page
        Integer limitBetaAppClipInvocationLocalizations = 56; // Integer | maximum number of related betaAppClipInvocationLocalizations returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            BetaAppClipInvocationsResponse result = apiInstance.buildBundlesBetaAppClipInvocationsGetToManyRelated(id, fieldsBetaAppClipInvocations, fieldsBetaAppClipInvocationLocalizations, limit, limitBetaAppClipInvocationLocalizations, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BuildBundlesApi#buildBundlesBetaAppClipInvocationsGetToManyRelated");
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
| **fieldsBetaAppClipInvocations** | **List&lt;String&gt;**| the fields to include for returned resources of type betaAppClipInvocations | [optional] [enum: betaAppClipInvocationLocalizations, buildBundle, url] |
| **fieldsBetaAppClipInvocationLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type betaAppClipInvocationLocalizations | [optional] [enum: betaAppClipInvocation, locale, title] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **limitBetaAppClipInvocationLocalizations** | **Integer**| maximum number of related betaAppClipInvocationLocalizations returned (when they are included) | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: betaAppClipInvocationLocalizations] |

### Return type

[**BetaAppClipInvocationsResponse**](BetaAppClipInvocationsResponse.md)

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
| **200** | List of BetaAppClipInvocations |  -  |


## buildBundlesBuildBundleFileSizesGetToManyRelated

> BuildBundleFileSizesResponse buildBundlesBuildBundleFileSizesGetToManyRelated(id, fieldsBuildBundleFileSizes, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BuildBundlesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BuildBundlesApi apiInstance = new BuildBundlesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsBuildBundleFileSizes = Arrays.asList(); // List<String> | the fields to include for returned resources of type buildBundleFileSizes
        Integer limit = 56; // Integer | maximum resources per page
        try {
            BuildBundleFileSizesResponse result = apiInstance.buildBundlesBuildBundleFileSizesGetToManyRelated(id, fieldsBuildBundleFileSizes, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BuildBundlesApi#buildBundlesBuildBundleFileSizesGetToManyRelated");
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
| **fieldsBuildBundleFileSizes** | **List&lt;String&gt;**| the fields to include for returned resources of type buildBundleFileSizes | [optional] [enum: deviceModel, downloadBytes, installBytes, osVersion] |
| **limit** | **Integer**| maximum resources per page | [optional] |

### Return type

[**BuildBundleFileSizesResponse**](BuildBundleFileSizesResponse.md)

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
| **200** | List of BuildBundleFileSizes |  -  |

