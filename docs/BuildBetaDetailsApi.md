# BuildBetaDetailsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**buildBetaDetailsBuildGetToOneRelated**](BuildBetaDetailsApi.md#buildBetaDetailsBuildGetToOneRelated) | **GET** /v1/buildBetaDetails/{id}/build |  |
| [**buildBetaDetailsGetCollection**](BuildBetaDetailsApi.md#buildBetaDetailsGetCollection) | **GET** /v1/buildBetaDetails |  |
| [**buildBetaDetailsGetInstance**](BuildBetaDetailsApi.md#buildBetaDetailsGetInstance) | **GET** /v1/buildBetaDetails/{id} |  |
| [**buildBetaDetailsUpdateInstance**](BuildBetaDetailsApi.md#buildBetaDetailsUpdateInstance) | **PATCH** /v1/buildBetaDetails/{id} |  |



## buildBetaDetailsBuildGetToOneRelated

> BuildWithoutIncludesResponse buildBetaDetailsBuildGetToOneRelated(id, fieldsBuilds)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BuildBetaDetailsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BuildBetaDetailsApi apiInstance = new BuildBetaDetailsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsBuilds = Arrays.asList(); // List<String> | the fields to include for returned resources of type builds
        try {
            BuildWithoutIncludesResponse result = apiInstance.buildBetaDetailsBuildGetToOneRelated(id, fieldsBuilds);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BuildBetaDetailsApi#buildBetaDetailsBuildGetToOneRelated");
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
| **fieldsBuilds** | **List&lt;String&gt;**| the fields to include for returned resources of type builds | [optional] [enum: app, appEncryptionDeclaration, appStoreVersion, betaAppReviewSubmission, betaBuildLocalizations, betaGroups, buildAudienceType, buildBetaDetail, buildBundles, computedMinMacOsVersion, diagnosticSignatures, expirationDate, expired, iconAssetToken, icons, individualTesters, lsMinimumSystemVersion, minOsVersion, perfPowerMetrics, preReleaseVersion, processingState, uploadedDate, usesNonExemptEncryption, version] |

### Return type

[**BuildWithoutIncludesResponse**](BuildWithoutIncludesResponse.md)

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
| **200** | Single Build with get |  -  |


## buildBetaDetailsGetCollection

> BuildBetaDetailsResponse buildBetaDetailsGetCollection(filterBuild, filterId, fieldsBuildBetaDetails, limit, include, fieldsBuilds)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BuildBetaDetailsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BuildBetaDetailsApi apiInstance = new BuildBetaDetailsApi(defaultClient);
        List<String> filterBuild = Arrays.asList(); // List<String> | filter by id(s) of related 'build'
        List<String> filterId = Arrays.asList(); // List<String> | filter by id(s)
        List<String> fieldsBuildBetaDetails = Arrays.asList(); // List<String> | the fields to include for returned resources of type buildBetaDetails
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsBuilds = Arrays.asList(); // List<String> | the fields to include for returned resources of type builds
        try {
            BuildBetaDetailsResponse result = apiInstance.buildBetaDetailsGetCollection(filterBuild, filterId, fieldsBuildBetaDetails, limit, include, fieldsBuilds);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BuildBetaDetailsApi#buildBetaDetailsGetCollection");
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
| **filterBuild** | **List&lt;String&gt;**| filter by id(s) of related &#39;build&#39; | [optional] |
| **filterId** | **List&lt;String&gt;**| filter by id(s) | [optional] |
| **fieldsBuildBetaDetails** | **List&lt;String&gt;**| the fields to include for returned resources of type buildBetaDetails | [optional] [enum: autoNotifyEnabled, build, externalBuildState, internalBuildState] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: build] |
| **fieldsBuilds** | **List&lt;String&gt;**| the fields to include for returned resources of type builds | [optional] [enum: app, appEncryptionDeclaration, appStoreVersion, betaAppReviewSubmission, betaBuildLocalizations, betaGroups, buildAudienceType, buildBetaDetail, buildBundles, computedMinMacOsVersion, diagnosticSignatures, expirationDate, expired, iconAssetToken, icons, individualTesters, lsMinimumSystemVersion, minOsVersion, perfPowerMetrics, preReleaseVersion, processingState, uploadedDate, usesNonExemptEncryption, version] |

### Return type

[**BuildBetaDetailsResponse**](BuildBetaDetailsResponse.md)

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
| **200** | List of BuildBetaDetails |  -  |


## buildBetaDetailsGetInstance

> BuildBetaDetailResponse buildBetaDetailsGetInstance(id, fieldsBuildBetaDetails, include, fieldsBuilds)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BuildBetaDetailsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BuildBetaDetailsApi apiInstance = new BuildBetaDetailsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsBuildBetaDetails = Arrays.asList(); // List<String> | the fields to include for returned resources of type buildBetaDetails
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsBuilds = Arrays.asList(); // List<String> | the fields to include for returned resources of type builds
        try {
            BuildBetaDetailResponse result = apiInstance.buildBetaDetailsGetInstance(id, fieldsBuildBetaDetails, include, fieldsBuilds);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BuildBetaDetailsApi#buildBetaDetailsGetInstance");
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
| **fieldsBuildBetaDetails** | **List&lt;String&gt;**| the fields to include for returned resources of type buildBetaDetails | [optional] [enum: autoNotifyEnabled, build, externalBuildState, internalBuildState] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: build] |
| **fieldsBuilds** | **List&lt;String&gt;**| the fields to include for returned resources of type builds | [optional] [enum: app, appEncryptionDeclaration, appStoreVersion, betaAppReviewSubmission, betaBuildLocalizations, betaGroups, buildAudienceType, buildBetaDetail, buildBundles, computedMinMacOsVersion, diagnosticSignatures, expirationDate, expired, iconAssetToken, icons, individualTesters, lsMinimumSystemVersion, minOsVersion, perfPowerMetrics, preReleaseVersion, processingState, uploadedDate, usesNonExemptEncryption, version] |

### Return type

[**BuildBetaDetailResponse**](BuildBetaDetailResponse.md)

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
| **200** | Single BuildBetaDetail |  -  |


## buildBetaDetailsUpdateInstance

> BuildBetaDetailResponse buildBetaDetailsUpdateInstance(id, buildBetaDetailUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.BuildBetaDetailsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        BuildBetaDetailsApi apiInstance = new BuildBetaDetailsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        BuildBetaDetailUpdateRequest buildBetaDetailUpdateRequest = new BuildBetaDetailUpdateRequest(); // BuildBetaDetailUpdateRequest | BuildBetaDetail representation
        try {
            BuildBetaDetailResponse result = apiInstance.buildBetaDetailsUpdateInstance(id, buildBetaDetailUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BuildBetaDetailsApi#buildBetaDetailsUpdateInstance");
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
| **buildBetaDetailUpdateRequest** | [**BuildBetaDetailUpdateRequest**](BuildBetaDetailUpdateRequest.md)| BuildBetaDetail representation | |

### Return type

[**BuildBetaDetailResponse**](BuildBetaDetailResponse.md)

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
| **200** | Single BuildBetaDetail |  -  |
| **409** | Request entity error(s) |  -  |

