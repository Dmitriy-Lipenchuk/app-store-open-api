# ScmPullRequestsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**scmPullRequestsGetInstance**](ScmPullRequestsApi.md#scmPullRequestsGetInstance) | **GET** /v1/scmPullRequests/{id} |  |



## scmPullRequestsGetInstance

> ScmPullRequestResponse scmPullRequestsGetInstance(id, fieldsScmPullRequests, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.ScmPullRequestsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        ScmPullRequestsApi apiInstance = new ScmPullRequestsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsScmPullRequests = Arrays.asList(); // List<String> | the fields to include for returned resources of type scmPullRequests
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            ScmPullRequestResponse result = apiInstance.scmPullRequestsGetInstance(id, fieldsScmPullRequests, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScmPullRequestsApi#scmPullRequestsGetInstance");
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
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: repository] |

### Return type

[**ScmPullRequestResponse**](ScmPullRequestResponse.md)

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
| **200** | Single ScmPullRequest |  -  |

