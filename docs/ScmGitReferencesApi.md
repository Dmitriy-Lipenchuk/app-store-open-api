# ScmGitReferencesApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**scmGitReferencesGetInstance**](ScmGitReferencesApi.md#scmGitReferencesGetInstance) | **GET** /v1/scmGitReferences/{id} |  |



## scmGitReferencesGetInstance

> ScmGitReferenceResponse scmGitReferencesGetInstance(id, fieldsScmGitReferences, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.ScmGitReferencesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        ScmGitReferencesApi apiInstance = new ScmGitReferencesApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsScmGitReferences = Arrays.asList(); // List<String> | the fields to include for returned resources of type scmGitReferences
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            ScmGitReferenceResponse result = apiInstance.scmGitReferencesGetInstance(id, fieldsScmGitReferences, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScmGitReferencesApi#scmGitReferencesGetInstance");
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
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: repository] |

### Return type

[**ScmGitReferenceResponse**](ScmGitReferenceResponse.md)

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
| **200** | Single ScmGitReference |  -  |

