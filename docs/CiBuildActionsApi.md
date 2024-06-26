# CiBuildActionsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ciBuildActionsArtifactsGetToManyRelated**](CiBuildActionsApi.md#ciBuildActionsArtifactsGetToManyRelated) | **GET** /v1/ciBuildActions/{id}/artifacts |  |
| [**ciBuildActionsBuildRunGetToOneRelated**](CiBuildActionsApi.md#ciBuildActionsBuildRunGetToOneRelated) | **GET** /v1/ciBuildActions/{id}/buildRun |  |
| [**ciBuildActionsGetInstance**](CiBuildActionsApi.md#ciBuildActionsGetInstance) | **GET** /v1/ciBuildActions/{id} |  |
| [**ciBuildActionsIssuesGetToManyRelated**](CiBuildActionsApi.md#ciBuildActionsIssuesGetToManyRelated) | **GET** /v1/ciBuildActions/{id}/issues |  |
| [**ciBuildActionsTestResultsGetToManyRelated**](CiBuildActionsApi.md#ciBuildActionsTestResultsGetToManyRelated) | **GET** /v1/ciBuildActions/{id}/testResults |  |



## ciBuildActionsArtifactsGetToManyRelated

> CiArtifactsResponse ciBuildActionsArtifactsGetToManyRelated(id, fieldsCiArtifacts, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.CiBuildActionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        CiBuildActionsApi apiInstance = new CiBuildActionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsCiArtifacts = Arrays.asList(); // List<String> | the fields to include for returned resources of type ciArtifacts
        Integer limit = 56; // Integer | maximum resources per page
        try {
            CiArtifactsResponse result = apiInstance.ciBuildActionsArtifactsGetToManyRelated(id, fieldsCiArtifacts, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CiBuildActionsApi#ciBuildActionsArtifactsGetToManyRelated");
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
| **fieldsCiArtifacts** | **List&lt;String&gt;**| the fields to include for returned resources of type ciArtifacts | [optional] [enum: downloadUrl, fileName, fileSize, fileType] |
| **limit** | **Integer**| maximum resources per page | [optional] |

### Return type

[**CiArtifactsResponse**](CiArtifactsResponse.md)

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
| **200** | List of CiArtifacts |  -  |


## ciBuildActionsBuildRunGetToOneRelated

> CiBuildRunResponse ciBuildActionsBuildRunGetToOneRelated(id, fieldsScmGitReferences, fieldsCiBuildRuns, fieldsCiWorkflows, fieldsScmPullRequests, fieldsCiProducts, fieldsBuilds, limitBuilds, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.CiBuildActionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        CiBuildActionsApi apiInstance = new CiBuildActionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsScmGitReferences = Arrays.asList(); // List<String> | the fields to include for returned resources of type scmGitReferences
        List<String> fieldsCiBuildRuns = Arrays.asList(); // List<String> | the fields to include for returned resources of type ciBuildRuns
        List<String> fieldsCiWorkflows = Arrays.asList(); // List<String> | the fields to include for returned resources of type ciWorkflows
        List<String> fieldsScmPullRequests = Arrays.asList(); // List<String> | the fields to include for returned resources of type scmPullRequests
        List<String> fieldsCiProducts = Arrays.asList(); // List<String> | the fields to include for returned resources of type ciProducts
        List<String> fieldsBuilds = Arrays.asList(); // List<String> | the fields to include for returned resources of type builds
        Integer limitBuilds = 56; // Integer | maximum number of related builds returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            CiBuildRunResponse result = apiInstance.ciBuildActionsBuildRunGetToOneRelated(id, fieldsScmGitReferences, fieldsCiBuildRuns, fieldsCiWorkflows, fieldsScmPullRequests, fieldsCiProducts, fieldsBuilds, limitBuilds, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CiBuildActionsApi#ciBuildActionsBuildRunGetToOneRelated");
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
| **fieldsCiBuildRuns** | **List&lt;String&gt;**| the fields to include for returned resources of type ciBuildRuns | [optional] [enum: actions, buildRun, builds, cancelReason, clean, completionStatus, createdDate, destinationBranch, destinationCommit, executionProgress, finishedDate, isPullRequestBuild, issueCounts, number, product, pullRequest, sourceBranchOrTag, sourceCommit, startReason, startedDate, workflow] |
| **fieldsCiWorkflows** | **List&lt;String&gt;**| the fields to include for returned resources of type ciWorkflows | [optional] [enum: actions, branchStartCondition, buildRuns, clean, containerFilePath, description, isEnabled, isLockedForEditing, lastModifiedDate, macOsVersion, manualBranchStartCondition, manualPullRequestStartCondition, manualTagStartCondition, name, product, pullRequestStartCondition, repository, scheduledStartCondition, tagStartCondition, xcodeVersion] |
| **fieldsScmPullRequests** | **List&lt;String&gt;**| the fields to include for returned resources of type scmPullRequests | [optional] [enum: destinationBranchName, destinationRepositoryName, destinationRepositoryOwner, isClosed, isCrossRepository, number, repository, sourceBranchName, sourceRepositoryName, sourceRepositoryOwner, title, webUrl] |
| **fieldsCiProducts** | **List&lt;String&gt;**| the fields to include for returned resources of type ciProducts | [optional] [enum: additionalRepositories, app, buildRuns, bundleId, createdDate, name, primaryRepositories, productType, workflows] |
| **fieldsBuilds** | **List&lt;String&gt;**| the fields to include for returned resources of type builds | [optional] [enum: app, appEncryptionDeclaration, appStoreVersion, betaAppReviewSubmission, betaBuildLocalizations, betaGroups, buildAudienceType, buildBetaDetail, buildBundles, computedMinMacOsVersion, diagnosticSignatures, expirationDate, expired, iconAssetToken, icons, individualTesters, lsMinimumSystemVersion, minOsVersion, perfPowerMetrics, preReleaseVersion, processingState, uploadedDate, usesNonExemptEncryption, version] |
| **limitBuilds** | **Integer**| maximum number of related builds returned (when they are included) | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: builds, destinationBranch, product, pullRequest, sourceBranchOrTag, workflow] |

### Return type

[**CiBuildRunResponse**](CiBuildRunResponse.md)

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
| **200** | Single CiBuildRun |  -  |


## ciBuildActionsGetInstance

> CiBuildActionResponse ciBuildActionsGetInstance(id, fieldsCiBuildActions, include, fieldsCiIssues, fieldsCiBuildRuns, fieldsCiTestResults, fieldsCiArtifacts)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.CiBuildActionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        CiBuildActionsApi apiInstance = new CiBuildActionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsCiBuildActions = Arrays.asList(); // List<String> | the fields to include for returned resources of type ciBuildActions
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsCiIssues = Arrays.asList(); // List<String> | the fields to include for returned resources of type ciIssues
        List<String> fieldsCiBuildRuns = Arrays.asList(); // List<String> | the fields to include for returned resources of type ciBuildRuns
        List<String> fieldsCiTestResults = Arrays.asList(); // List<String> | the fields to include for returned resources of type ciTestResults
        List<String> fieldsCiArtifacts = Arrays.asList(); // List<String> | the fields to include for returned resources of type ciArtifacts
        try {
            CiBuildActionResponse result = apiInstance.ciBuildActionsGetInstance(id, fieldsCiBuildActions, include, fieldsCiIssues, fieldsCiBuildRuns, fieldsCiTestResults, fieldsCiArtifacts);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CiBuildActionsApi#ciBuildActionsGetInstance");
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
| **fieldsCiBuildActions** | **List&lt;String&gt;**| the fields to include for returned resources of type ciBuildActions | [optional] [enum: actionType, artifacts, buildRun, completionStatus, executionProgress, finishedDate, isRequiredToPass, issueCounts, issues, name, startedDate, testResults] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: buildRun] |
| **fieldsCiIssues** | **List&lt;String&gt;**| the fields to include for returned resources of type ciIssues | [optional] [enum: category, fileSource, issueType, message] |
| **fieldsCiBuildRuns** | **List&lt;String&gt;**| the fields to include for returned resources of type ciBuildRuns | [optional] [enum: actions, buildRun, builds, cancelReason, clean, completionStatus, createdDate, destinationBranch, destinationCommit, executionProgress, finishedDate, isPullRequestBuild, issueCounts, number, product, pullRequest, sourceBranchOrTag, sourceCommit, startReason, startedDate, workflow] |
| **fieldsCiTestResults** | **List&lt;String&gt;**| the fields to include for returned resources of type ciTestResults | [optional] [enum: className, destinationTestResults, fileSource, message, name, status] |
| **fieldsCiArtifacts** | **List&lt;String&gt;**| the fields to include for returned resources of type ciArtifacts | [optional] [enum: downloadUrl, fileName, fileSize, fileType] |

### Return type

[**CiBuildActionResponse**](CiBuildActionResponse.md)

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
| **200** | Single CiBuildAction |  -  |


## ciBuildActionsIssuesGetToManyRelated

> CiIssuesResponse ciBuildActionsIssuesGetToManyRelated(id, fieldsCiIssues, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.CiBuildActionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        CiBuildActionsApi apiInstance = new CiBuildActionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsCiIssues = Arrays.asList(); // List<String> | the fields to include for returned resources of type ciIssues
        Integer limit = 56; // Integer | maximum resources per page
        try {
            CiIssuesResponse result = apiInstance.ciBuildActionsIssuesGetToManyRelated(id, fieldsCiIssues, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CiBuildActionsApi#ciBuildActionsIssuesGetToManyRelated");
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
| **fieldsCiIssues** | **List&lt;String&gt;**| the fields to include for returned resources of type ciIssues | [optional] [enum: category, fileSource, issueType, message] |
| **limit** | **Integer**| maximum resources per page | [optional] |

### Return type

[**CiIssuesResponse**](CiIssuesResponse.md)

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
| **200** | List of CiIssues |  -  |


## ciBuildActionsTestResultsGetToManyRelated

> CiTestResultsResponse ciBuildActionsTestResultsGetToManyRelated(id, fieldsCiTestResults, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.CiBuildActionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        CiBuildActionsApi apiInstance = new CiBuildActionsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsCiTestResults = Arrays.asList(); // List<String> | the fields to include for returned resources of type ciTestResults
        Integer limit = 56; // Integer | maximum resources per page
        try {
            CiTestResultsResponse result = apiInstance.ciBuildActionsTestResultsGetToManyRelated(id, fieldsCiTestResults, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CiBuildActionsApi#ciBuildActionsTestResultsGetToManyRelated");
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
| **fieldsCiTestResults** | **List&lt;String&gt;**| the fields to include for returned resources of type ciTestResults | [optional] [enum: className, destinationTestResults, fileSource, message, name, status] |
| **limit** | **Integer**| maximum resources per page | [optional] |

### Return type

[**CiTestResultsResponse**](CiTestResultsResponse.md)

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
| **200** | List of CiTestResults |  -  |

