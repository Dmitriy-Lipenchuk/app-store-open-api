# CiWorkflowsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ciWorkflowsBuildRunsGetToManyRelated**](CiWorkflowsApi.md#ciWorkflowsBuildRunsGetToManyRelated) | **GET** /v1/ciWorkflows/{id}/buildRuns |  |
| [**ciWorkflowsCreateInstance**](CiWorkflowsApi.md#ciWorkflowsCreateInstance) | **POST** /v1/ciWorkflows |  |
| [**ciWorkflowsDeleteInstance**](CiWorkflowsApi.md#ciWorkflowsDeleteInstance) | **DELETE** /v1/ciWorkflows/{id} |  |
| [**ciWorkflowsGetInstance**](CiWorkflowsApi.md#ciWorkflowsGetInstance) | **GET** /v1/ciWorkflows/{id} |  |
| [**ciWorkflowsRepositoryGetToOneRelated**](CiWorkflowsApi.md#ciWorkflowsRepositoryGetToOneRelated) | **GET** /v1/ciWorkflows/{id}/repository |  |
| [**ciWorkflowsUpdateInstance**](CiWorkflowsApi.md#ciWorkflowsUpdateInstance) | **PATCH** /v1/ciWorkflows/{id} |  |



## ciWorkflowsBuildRunsGetToManyRelated

> CiBuildRunsResponse ciWorkflowsBuildRunsGetToManyRelated(id, filterBuilds, sort, fieldsScmGitReferences, fieldsCiBuildRuns, fieldsCiWorkflows, fieldsScmPullRequests, fieldsCiProducts, fieldsBuilds, limit, limitBuilds, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.CiWorkflowsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        CiWorkflowsApi apiInstance = new CiWorkflowsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> filterBuilds = Arrays.asList(); // List<String> | filter by id(s) of related 'builds'
        List<String> sort = Arrays.asList(); // List<String> | comma-separated list of sort expressions; resources will be sorted as specified
        List<String> fieldsScmGitReferences = Arrays.asList(); // List<String> | the fields to include for returned resources of type scmGitReferences
        List<String> fieldsCiBuildRuns = Arrays.asList(); // List<String> | the fields to include for returned resources of type ciBuildRuns
        List<String> fieldsCiWorkflows = Arrays.asList(); // List<String> | the fields to include for returned resources of type ciWorkflows
        List<String> fieldsScmPullRequests = Arrays.asList(); // List<String> | the fields to include for returned resources of type scmPullRequests
        List<String> fieldsCiProducts = Arrays.asList(); // List<String> | the fields to include for returned resources of type ciProducts
        List<String> fieldsBuilds = Arrays.asList(); // List<String> | the fields to include for returned resources of type builds
        Integer limit = 56; // Integer | maximum resources per page
        Integer limitBuilds = 56; // Integer | maximum number of related builds returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            CiBuildRunsResponse result = apiInstance.ciWorkflowsBuildRunsGetToManyRelated(id, filterBuilds, sort, fieldsScmGitReferences, fieldsCiBuildRuns, fieldsCiWorkflows, fieldsScmPullRequests, fieldsCiProducts, fieldsBuilds, limit, limitBuilds, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CiWorkflowsApi#ciWorkflowsBuildRunsGetToManyRelated");
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
| **filterBuilds** | **List&lt;String&gt;**| filter by id(s) of related &#39;builds&#39; | [optional] |
| **sort** | **List&lt;String&gt;**| comma-separated list of sort expressions; resources will be sorted as specified | [optional] [enum: number, -number] |
| **fieldsScmGitReferences** | **List&lt;String&gt;**| the fields to include for returned resources of type scmGitReferences | [optional] [enum: canonicalName, isDeleted, kind, name, repository] |
| **fieldsCiBuildRuns** | **List&lt;String&gt;**| the fields to include for returned resources of type ciBuildRuns | [optional] [enum: actions, buildRun, builds, cancelReason, clean, completionStatus, createdDate, destinationBranch, destinationCommit, executionProgress, finishedDate, isPullRequestBuild, issueCounts, number, product, pullRequest, sourceBranchOrTag, sourceCommit, startReason, startedDate, workflow] |
| **fieldsCiWorkflows** | **List&lt;String&gt;**| the fields to include for returned resources of type ciWorkflows | [optional] [enum: actions, branchStartCondition, buildRuns, clean, containerFilePath, description, isEnabled, isLockedForEditing, lastModifiedDate, macOsVersion, manualBranchStartCondition, manualPullRequestStartCondition, manualTagStartCondition, name, product, pullRequestStartCondition, repository, scheduledStartCondition, tagStartCondition, xcodeVersion] |
| **fieldsScmPullRequests** | **List&lt;String&gt;**| the fields to include for returned resources of type scmPullRequests | [optional] [enum: destinationBranchName, destinationRepositoryName, destinationRepositoryOwner, isClosed, isCrossRepository, number, repository, sourceBranchName, sourceRepositoryName, sourceRepositoryOwner, title, webUrl] |
| **fieldsCiProducts** | **List&lt;String&gt;**| the fields to include for returned resources of type ciProducts | [optional] [enum: additionalRepositories, app, buildRuns, bundleId, createdDate, name, primaryRepositories, productType, workflows] |
| **fieldsBuilds** | **List&lt;String&gt;**| the fields to include for returned resources of type builds | [optional] [enum: app, appEncryptionDeclaration, appStoreVersion, betaAppReviewSubmission, betaBuildLocalizations, betaGroups, buildAudienceType, buildBetaDetail, buildBundles, computedMinMacOsVersion, diagnosticSignatures, expirationDate, expired, iconAssetToken, icons, individualTesters, lsMinimumSystemVersion, minOsVersion, perfPowerMetrics, preReleaseVersion, processingState, uploadedDate, usesNonExemptEncryption, version] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **limitBuilds** | **Integer**| maximum number of related builds returned (when they are included) | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: builds, destinationBranch, product, pullRequest, sourceBranchOrTag, workflow] |

### Return type

[**CiBuildRunsResponse**](CiBuildRunsResponse.md)

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
| **200** | List of CiBuildRuns |  -  |


## ciWorkflowsCreateInstance

> CiWorkflowResponse ciWorkflowsCreateInstance(ciWorkflowCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.CiWorkflowsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        CiWorkflowsApi apiInstance = new CiWorkflowsApi(defaultClient);
        CiWorkflowCreateRequest ciWorkflowCreateRequest = new CiWorkflowCreateRequest(); // CiWorkflowCreateRequest | CiWorkflow representation
        try {
            CiWorkflowResponse result = apiInstance.ciWorkflowsCreateInstance(ciWorkflowCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CiWorkflowsApi#ciWorkflowsCreateInstance");
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
| **ciWorkflowCreateRequest** | [**CiWorkflowCreateRequest**](CiWorkflowCreateRequest.md)| CiWorkflow representation | |

### Return type

[**CiWorkflowResponse**](CiWorkflowResponse.md)

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
| **201** | Single CiWorkflow |  -  |
| **409** | Request entity error(s) |  -  |


## ciWorkflowsDeleteInstance

> ciWorkflowsDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.CiWorkflowsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        CiWorkflowsApi apiInstance = new CiWorkflowsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.ciWorkflowsDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling CiWorkflowsApi#ciWorkflowsDeleteInstance");
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


## ciWorkflowsGetInstance

> CiWorkflowResponse ciWorkflowsGetInstance(id, fieldsCiWorkflows, include, fieldsCiBuildRuns, fieldsScmRepositories)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.CiWorkflowsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        CiWorkflowsApi apiInstance = new CiWorkflowsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsCiWorkflows = Arrays.asList(); // List<String> | the fields to include for returned resources of type ciWorkflows
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsCiBuildRuns = Arrays.asList(); // List<String> | the fields to include for returned resources of type ciBuildRuns
        List<String> fieldsScmRepositories = Arrays.asList(); // List<String> | the fields to include for returned resources of type scmRepositories
        try {
            CiWorkflowResponse result = apiInstance.ciWorkflowsGetInstance(id, fieldsCiWorkflows, include, fieldsCiBuildRuns, fieldsScmRepositories);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CiWorkflowsApi#ciWorkflowsGetInstance");
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
| **fieldsCiWorkflows** | **List&lt;String&gt;**| the fields to include for returned resources of type ciWorkflows | [optional] [enum: actions, branchStartCondition, buildRuns, clean, containerFilePath, description, isEnabled, isLockedForEditing, lastModifiedDate, macOsVersion, manualBranchStartCondition, manualPullRequestStartCondition, manualTagStartCondition, name, product, pullRequestStartCondition, repository, scheduledStartCondition, tagStartCondition, xcodeVersion] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: macOsVersion, product, repository, xcodeVersion] |
| **fieldsCiBuildRuns** | **List&lt;String&gt;**| the fields to include for returned resources of type ciBuildRuns | [optional] [enum: actions, buildRun, builds, cancelReason, clean, completionStatus, createdDate, destinationBranch, destinationCommit, executionProgress, finishedDate, isPullRequestBuild, issueCounts, number, product, pullRequest, sourceBranchOrTag, sourceCommit, startReason, startedDate, workflow] |
| **fieldsScmRepositories** | **List&lt;String&gt;**| the fields to include for returned resources of type scmRepositories | [optional] [enum: defaultBranch, gitReferences, httpCloneUrl, lastAccessedDate, ownerName, pullRequests, repositoryName, scmProvider, sshCloneUrl] |

### Return type

[**CiWorkflowResponse**](CiWorkflowResponse.md)

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
| **200** | Single CiWorkflow |  -  |


## ciWorkflowsRepositoryGetToOneRelated

> ScmRepositoryResponse ciWorkflowsRepositoryGetToOneRelated(id, fieldsScmGitReferences, fieldsScmProviders, fieldsScmRepositories, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.CiWorkflowsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        CiWorkflowsApi apiInstance = new CiWorkflowsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsScmGitReferences = Arrays.asList(); // List<String> | the fields to include for returned resources of type scmGitReferences
        List<String> fieldsScmProviders = Arrays.asList(); // List<String> | the fields to include for returned resources of type scmProviders
        List<String> fieldsScmRepositories = Arrays.asList(); // List<String> | the fields to include for returned resources of type scmRepositories
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            ScmRepositoryResponse result = apiInstance.ciWorkflowsRepositoryGetToOneRelated(id, fieldsScmGitReferences, fieldsScmProviders, fieldsScmRepositories, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CiWorkflowsApi#ciWorkflowsRepositoryGetToOneRelated");
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
| **fieldsScmProviders** | **List&lt;String&gt;**| the fields to include for returned resources of type scmProviders | [optional] [enum: repositories, scmProviderType, url] |
| **fieldsScmRepositories** | **List&lt;String&gt;**| the fields to include for returned resources of type scmRepositories | [optional] [enum: defaultBranch, gitReferences, httpCloneUrl, lastAccessedDate, ownerName, pullRequests, repositoryName, scmProvider, sshCloneUrl] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: defaultBranch, scmProvider] |

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


## ciWorkflowsUpdateInstance

> CiWorkflowResponse ciWorkflowsUpdateInstance(id, ciWorkflowUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.CiWorkflowsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        CiWorkflowsApi apiInstance = new CiWorkflowsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        CiWorkflowUpdateRequest ciWorkflowUpdateRequest = new CiWorkflowUpdateRequest(); // CiWorkflowUpdateRequest | CiWorkflow representation
        try {
            CiWorkflowResponse result = apiInstance.ciWorkflowsUpdateInstance(id, ciWorkflowUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CiWorkflowsApi#ciWorkflowsUpdateInstance");
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
| **ciWorkflowUpdateRequest** | [**CiWorkflowUpdateRequest**](CiWorkflowUpdateRequest.md)| CiWorkflow representation | |

### Return type

[**CiWorkflowResponse**](CiWorkflowResponse.md)

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
| **200** | Single CiWorkflow |  -  |
| **409** | Request entity error(s) |  -  |

