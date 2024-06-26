# ScmProvidersApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**scmProvidersGetCollection**](ScmProvidersApi.md#scmProvidersGetCollection) | **GET** /v1/scmProviders |  |
| [**scmProvidersGetInstance**](ScmProvidersApi.md#scmProvidersGetInstance) | **GET** /v1/scmProviders/{id} |  |
| [**scmProvidersRepositoriesGetToManyRelated**](ScmProvidersApi.md#scmProvidersRepositoriesGetToManyRelated) | **GET** /v1/scmProviders/{id}/repositories |  |



## scmProvidersGetCollection

> ScmProvidersResponse scmProvidersGetCollection(fieldsScmProviders, limit, fieldsScmRepositories)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.ScmProvidersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        ScmProvidersApi apiInstance = new ScmProvidersApi(defaultClient);
        List<String> fieldsScmProviders = Arrays.asList(); // List<String> | the fields to include for returned resources of type scmProviders
        Integer limit = 56; // Integer | maximum resources per page
        List<String> fieldsScmRepositories = Arrays.asList(); // List<String> | the fields to include for returned resources of type scmRepositories
        try {
            ScmProvidersResponse result = apiInstance.scmProvidersGetCollection(fieldsScmProviders, limit, fieldsScmRepositories);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScmProvidersApi#scmProvidersGetCollection");
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
| **fieldsScmProviders** | **List&lt;String&gt;**| the fields to include for returned resources of type scmProviders | [optional] [enum: repositories, scmProviderType, url] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **fieldsScmRepositories** | **List&lt;String&gt;**| the fields to include for returned resources of type scmRepositories | [optional] [enum: defaultBranch, gitReferences, httpCloneUrl, lastAccessedDate, ownerName, pullRequests, repositoryName, scmProvider, sshCloneUrl] |

### Return type

[**ScmProvidersResponse**](ScmProvidersResponse.md)

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
| **200** | List of ScmProviders |  -  |


## scmProvidersGetInstance

> ScmProviderResponse scmProvidersGetInstance(id, fieldsScmProviders, fieldsScmRepositories)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.ScmProvidersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        ScmProvidersApi apiInstance = new ScmProvidersApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsScmProviders = Arrays.asList(); // List<String> | the fields to include for returned resources of type scmProviders
        List<String> fieldsScmRepositories = Arrays.asList(); // List<String> | the fields to include for returned resources of type scmRepositories
        try {
            ScmProviderResponse result = apiInstance.scmProvidersGetInstance(id, fieldsScmProviders, fieldsScmRepositories);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScmProvidersApi#scmProvidersGetInstance");
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
| **fieldsScmProviders** | **List&lt;String&gt;**| the fields to include for returned resources of type scmProviders | [optional] [enum: repositories, scmProviderType, url] |
| **fieldsScmRepositories** | **List&lt;String&gt;**| the fields to include for returned resources of type scmRepositories | [optional] [enum: defaultBranch, gitReferences, httpCloneUrl, lastAccessedDate, ownerName, pullRequests, repositoryName, scmProvider, sshCloneUrl] |

### Return type

[**ScmProviderResponse**](ScmProviderResponse.md)

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
| **200** | Single ScmProvider |  -  |


## scmProvidersRepositoriesGetToManyRelated

> ScmRepositoriesResponse scmProvidersRepositoriesGetToManyRelated(id, filterId, fieldsScmGitReferences, fieldsScmProviders, fieldsScmRepositories, limit, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.ScmProvidersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        ScmProvidersApi apiInstance = new ScmProvidersApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> filterId = Arrays.asList(); // List<String> | filter by id(s)
        List<String> fieldsScmGitReferences = Arrays.asList(); // List<String> | the fields to include for returned resources of type scmGitReferences
        List<String> fieldsScmProviders = Arrays.asList(); // List<String> | the fields to include for returned resources of type scmProviders
        List<String> fieldsScmRepositories = Arrays.asList(); // List<String> | the fields to include for returned resources of type scmRepositories
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            ScmRepositoriesResponse result = apiInstance.scmProvidersRepositoriesGetToManyRelated(id, filterId, fieldsScmGitReferences, fieldsScmProviders, fieldsScmRepositories, limit, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScmProvidersApi#scmProvidersRepositoriesGetToManyRelated");
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
| **filterId** | **List&lt;String&gt;**| filter by id(s) | [optional] |
| **fieldsScmGitReferences** | **List&lt;String&gt;**| the fields to include for returned resources of type scmGitReferences | [optional] [enum: canonicalName, isDeleted, kind, name, repository] |
| **fieldsScmProviders** | **List&lt;String&gt;**| the fields to include for returned resources of type scmProviders | [optional] [enum: repositories, scmProviderType, url] |
| **fieldsScmRepositories** | **List&lt;String&gt;**| the fields to include for returned resources of type scmRepositories | [optional] [enum: defaultBranch, gitReferences, httpCloneUrl, lastAccessedDate, ownerName, pullRequests, repositoryName, scmProvider, sshCloneUrl] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: defaultBranch, scmProvider] |

### Return type

[**ScmRepositoriesResponse**](ScmRepositoriesResponse.md)

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
| **200** | List of ScmRepositories |  -  |

