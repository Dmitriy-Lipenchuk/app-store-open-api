# ScmRepositoriesApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**scmRepositoriesGetCollection**](ScmRepositoriesApi.md#scmRepositoriesGetCollection) | **GET** /v1/scmRepositories |  |
| [**scmRepositoriesGetInstance**](ScmRepositoriesApi.md#scmRepositoriesGetInstance) | **GET** /v1/scmRepositories/{id} |  |
| [**scmRepositoriesGitReferencesGetToManyRelated**](ScmRepositoriesApi.md#scmRepositoriesGitReferencesGetToManyRelated) | **GET** /v1/scmRepositories/{id}/gitReferences |  |
| [**scmRepositoriesPullRequestsGetToManyRelated**](ScmRepositoriesApi.md#scmRepositoriesPullRequestsGetToManyRelated) | **GET** /v1/scmRepositories/{id}/pullRequests |  |



## scmRepositoriesGetCollection

> ScmRepositoriesResponse scmRepositoriesGetCollection(filterId, fieldsScmRepositories, limit, include, fieldsScmGitReferences, fieldsScmPullRequests)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.ScmRepositoriesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        ScmRepositoriesApi apiInstance = new ScmRepositoriesApi(defaultClient);
        List<String> filterId = Arrays.asList(); // List<String> | filter by id(s)
        List<String> fieldsScmRepositories = Arrays.asList(); // List<String> | the fields to include for returned resources of type scmRepositories
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsScmGitReferences = Arrays.asList(); // List<String> | the fields to include for returned resources of type scmGitReferences
        List<String> fieldsScmPullRequests = Arrays.asList(); // List<String> | the fields to include for returned resources of type scmPullRequests
        try {
            ScmRepositoriesResponse result = apiInstance.scmRepositoriesGetCollection(filterId, fieldsScmRepositories, limit, include, fieldsScmGitReferences, fieldsScmPullRequests);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScmRepositoriesApi#scmRepositoriesGetCollection");
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
| **filterId** | **List&lt;String&gt;**| filter by id(s) | [optional] |
| **fieldsScmRepositories** | **List&lt;String&gt;**| the fields to include for returned resources of type scmRepositories | [optional] [enum: defaultBranch, gitReferences, httpCloneUrl, lastAccessedDate, ownerName, pullRequests, repositoryName, scmProvider, sshCloneUrl] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: defaultBranch, scmProvider] |
| **fieldsScmGitReferences** | **List&lt;String&gt;**| the fields to include for returned resources of type scmGitReferences | [optional] [enum: canonicalName, isDeleted, kind, name, repository] |
| **fieldsScmPullRequests** | **List&lt;String&gt;**| the fields to include for returned resources of type scmPullRequests | [optional] [enum: destinationBranchName, destinationRepositoryName, destinationRepositoryOwner, isClosed, isCrossRepository, number, repository, sourceBranchName, sourceRepositoryName, sourceRepositoryOwner, title, webUrl] |

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
| **200** | List of ScmRepositories |  -  |


## scmRepositoriesGetInstance

> ScmRepositoryResponse scmRepositoriesGetInstance(id, fieldsScmRepositories, include, fieldsScmGitReferences, fieldsScmPullRequests)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.ScmRepositoriesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        ScmRepositoriesApi apiInstance = new ScmRepositoriesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsScmRepositories = Arrays.asList(); // List<String> | the fields to include for returned resources of type scmRepositories
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsScmGitReferences = Arrays.asList(); // List<String> | the fields to include for returned resources of type scmGitReferences
        List<String> fieldsScmPullRequests = Arrays.asList(); // List<String> | the fields to include for returned resources of type scmPullRequests
        try {
            ScmRepositoryResponse result = apiInstance.scmRepositoriesGetInstance(id, fieldsScmRepositories, include, fieldsScmGitReferences, fieldsScmPullRequests);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScmRepositoriesApi#scmRepositoriesGetInstance");
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
| **fieldsScmRepositories** | **List&lt;String&gt;**| the fields to include for returned resources of type scmRepositories | [optional] [enum: defaultBranch, gitReferences, httpCloneUrl, lastAccessedDate, ownerName, pullRequests, repositoryName, scmProvider, sshCloneUrl] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: defaultBranch, scmProvider] |
| **fieldsScmGitReferences** | **List&lt;String&gt;**| the fields to include for returned resources of type scmGitReferences | [optional] [enum: canonicalName, isDeleted, kind, name, repository] |
| **fieldsScmPullRequests** | **List&lt;String&gt;**| the fields to include for returned resources of type scmPullRequests | [optional] [enum: destinationBranchName, destinationRepositoryName, destinationRepositoryOwner, isClosed, isCrossRepository, number, repository, sourceBranchName, sourceRepositoryName, sourceRepositoryOwner, title, webUrl] |

### Return type

[**ScmRepositoryResponse**](ScmRepositoryResponse.md)

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
| **200** | Single ScmRepository |  -  |


## scmRepositoriesGitReferencesGetToManyRelated

> ScmGitReferencesResponse scmRepositoriesGitReferencesGetToManyRelated(id, fieldsScmGitReferences, fieldsScmRepositories, limit, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.ScmRepositoriesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        ScmRepositoriesApi apiInstance = new ScmRepositoriesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsScmGitReferences = Arrays.asList(); // List<String> | the fields to include for returned resources of type scmGitReferences
        List<String> fieldsScmRepositories = Arrays.asList(); // List<String> | the fields to include for returned resources of type scmRepositories
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            ScmGitReferencesResponse result = apiInstance.scmRepositoriesGitReferencesGetToManyRelated(id, fieldsScmGitReferences, fieldsScmRepositories, limit, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScmRepositoriesApi#scmRepositoriesGitReferencesGetToManyRelated");
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
| **fieldsScmGitReferences** | **List&lt;String&gt;**| the fields to include for returned resources of type scmGitReferences | [optional] [enum: canonicalName, isDeleted, kind, name, repository] |
| **fieldsScmRepositories** | **List&lt;String&gt;**| the fields to include for returned resources of type scmRepositories | [optional] [enum: defaultBranch, gitReferences, httpCloneUrl, lastAccessedDate, ownerName, pullRequests, repositoryName, scmProvider, sshCloneUrl] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: repository] |

### Return type

[**ScmGitReferencesResponse**](ScmGitReferencesResponse.md)

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
| **200** | List of ScmGitReferences |  -  |


## scmRepositoriesPullRequestsGetToManyRelated

> ScmPullRequestsResponse scmRepositoriesPullRequestsGetToManyRelated(id, fieldsScmPullRequests, fieldsScmRepositories, limit, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.ScmRepositoriesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        ScmRepositoriesApi apiInstance = new ScmRepositoriesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsScmPullRequests = Arrays.asList(); // List<String> | the fields to include for returned resources of type scmPullRequests
        List<String> fieldsScmRepositories = Arrays.asList(); // List<String> | the fields to include for returned resources of type scmRepositories
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            ScmPullRequestsResponse result = apiInstance.scmRepositoriesPullRequestsGetToManyRelated(id, fieldsScmPullRequests, fieldsScmRepositories, limit, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScmRepositoriesApi#scmRepositoriesPullRequestsGetToManyRelated");
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
| **fieldsScmPullRequests** | **List&lt;String&gt;**| the fields to include for returned resources of type scmPullRequests | [optional] [enum: destinationBranchName, destinationRepositoryName, destinationRepositoryOwner, isClosed, isCrossRepository, number, repository, sourceBranchName, sourceRepositoryName, sourceRepositoryOwner, title, webUrl] |
| **fieldsScmRepositories** | **List&lt;String&gt;**| the fields to include for returned resources of type scmRepositories | [optional] [enum: defaultBranch, gitReferences, httpCloneUrl, lastAccessedDate, ownerName, pullRequests, repositoryName, scmProvider, sshCloneUrl] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: repository] |

### Return type

[**ScmPullRequestsResponse**](ScmPullRequestsResponse.md)

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
| **200** | List of ScmPullRequests |  -  |

