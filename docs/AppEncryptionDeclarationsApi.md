# AppEncryptionDeclarationsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**appEncryptionDeclarationsAppEncryptionDeclarationDocumentGetToOneRelated**](AppEncryptionDeclarationsApi.md#appEncryptionDeclarationsAppEncryptionDeclarationDocumentGetToOneRelated) | **GET** /v1/appEncryptionDeclarations/{id}/appEncryptionDeclarationDocument |  |
| [**appEncryptionDeclarationsAppGetToOneRelated**](AppEncryptionDeclarationsApi.md#appEncryptionDeclarationsAppGetToOneRelated) | **GET** /v1/appEncryptionDeclarations/{id}/app |  |
| [**appEncryptionDeclarationsBuildsCreateToManyRelationship**](AppEncryptionDeclarationsApi.md#appEncryptionDeclarationsBuildsCreateToManyRelationship) | **POST** /v1/appEncryptionDeclarations/{id}/relationships/builds |  |
| [**appEncryptionDeclarationsGetCollection**](AppEncryptionDeclarationsApi.md#appEncryptionDeclarationsGetCollection) | **GET** /v1/appEncryptionDeclarations |  |
| [**appEncryptionDeclarationsGetInstance**](AppEncryptionDeclarationsApi.md#appEncryptionDeclarationsGetInstance) | **GET** /v1/appEncryptionDeclarations/{id} |  |



## appEncryptionDeclarationsAppEncryptionDeclarationDocumentGetToOneRelated

> AppEncryptionDeclarationDocumentResponse appEncryptionDeclarationsAppEncryptionDeclarationDocumentGetToOneRelated(id, fieldsAppEncryptionDeclarationDocuments)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppEncryptionDeclarationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppEncryptionDeclarationsApi apiInstance = new AppEncryptionDeclarationsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAppEncryptionDeclarationDocuments = Arrays.asList(); // List<String> | the fields to include for returned resources of type appEncryptionDeclarationDocuments
        try {
            AppEncryptionDeclarationDocumentResponse result = apiInstance.appEncryptionDeclarationsAppEncryptionDeclarationDocumentGetToOneRelated(id, fieldsAppEncryptionDeclarationDocuments);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppEncryptionDeclarationsApi#appEncryptionDeclarationsAppEncryptionDeclarationDocumentGetToOneRelated");
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
| **fieldsAppEncryptionDeclarationDocuments** | **List&lt;String&gt;**| the fields to include for returned resources of type appEncryptionDeclarationDocuments | [optional] [enum: appEncryptionDeclaration, assetDeliveryState, assetToken, downloadUrl, fileName, fileSize, sourceFileChecksum, uploadOperations, uploaded] |

### Return type

[**AppEncryptionDeclarationDocumentResponse**](AppEncryptionDeclarationDocumentResponse.md)

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
| **200** | Single AppEncryptionDeclarationDocument |  -  |


## appEncryptionDeclarationsAppGetToOneRelated

> AppWithoutIncludesResponse appEncryptionDeclarationsAppGetToOneRelated(id, fieldsApps)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppEncryptionDeclarationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppEncryptionDeclarationsApi apiInstance = new AppEncryptionDeclarationsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsApps = Arrays.asList(); // List<String> | the fields to include for returned resources of type apps
        try {
            AppWithoutIncludesResponse result = apiInstance.appEncryptionDeclarationsAppGetToOneRelated(id, fieldsApps);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppEncryptionDeclarationsApi#appEncryptionDeclarationsAppGetToOneRelated");
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
| **fieldsApps** | **List&lt;String&gt;**| the fields to include for returned resources of type apps | [optional] [enum: alternativeDistributionKey, analyticsReportRequests, appAvailability, appClips, appCustomProductPages, appEncryptionDeclarations, appEvents, appInfos, appPricePoints, appPriceSchedule, appStoreVersionExperimentsV2, appStoreVersions, betaAppLocalizations, betaAppReviewDetail, betaGroups, betaLicenseAgreement, betaTesters, builds, bundleId, ciProduct, contentRightsDeclaration, customerReviews, endUserLicenseAgreement, gameCenterDetail, gameCenterEnabledVersions, inAppPurchases, inAppPurchasesV2, isOrEverWasMadeForKids, marketplaceSearchDetail, name, perfPowerMetrics, preOrder, preReleaseVersions, primaryLocale, promotedPurchases, reviewSubmissions, sku, subscriptionGracePeriod, subscriptionGroups, subscriptionStatusUrl, subscriptionStatusUrlForSandbox, subscriptionStatusUrlVersion, subscriptionStatusUrlVersionForSandbox] |

### Return type

[**AppWithoutIncludesResponse**](AppWithoutIncludesResponse.md)

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
| **200** | Single App with get |  -  |


## appEncryptionDeclarationsBuildsCreateToManyRelationship

> appEncryptionDeclarationsBuildsCreateToManyRelationship(id, appEncryptionDeclarationBuildsLinkagesRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppEncryptionDeclarationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppEncryptionDeclarationsApi apiInstance = new AppEncryptionDeclarationsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        AppEncryptionDeclarationBuildsLinkagesRequest appEncryptionDeclarationBuildsLinkagesRequest = new AppEncryptionDeclarationBuildsLinkagesRequest(); // AppEncryptionDeclarationBuildsLinkagesRequest | List of related linkages
        try {
            apiInstance.appEncryptionDeclarationsBuildsCreateToManyRelationship(id, appEncryptionDeclarationBuildsLinkagesRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppEncryptionDeclarationsApi#appEncryptionDeclarationsBuildsCreateToManyRelationship");
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
| **appEncryptionDeclarationBuildsLinkagesRequest** | [**AppEncryptionDeclarationBuildsLinkagesRequest**](AppEncryptionDeclarationBuildsLinkagesRequest.md)| List of related linkages | |

### Return type

null (empty response body)

### Authorization

[itc-bearer-token](../README.md#itc-bearer-token)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **401** | Unauthorized error(s) |  -  |
| **403** | Forbidden error |  -  |
| **404** | Not found error |  -  |
| **422** | Unprocessable request entity error(s) |  -  |
| **409** | Request entity error(s) |  -  |
| **204** | Success (no content) |  -  |


## appEncryptionDeclarationsGetCollection

> AppEncryptionDeclarationsResponse appEncryptionDeclarationsGetCollection(filterPlatform, filterApp, filterBuilds, fieldsAppEncryptionDeclarations, limit, include, fieldsAppEncryptionDeclarationDocuments, fieldsApps, limitBuilds)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppEncryptionDeclarationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppEncryptionDeclarationsApi apiInstance = new AppEncryptionDeclarationsApi(defaultClient);
        List<String> filterPlatform = Arrays.asList(); // List<String> | filter by attribute 'platform'
        List<String> filterApp = Arrays.asList(); // List<String> | filter by id(s) of related 'app'
        List<String> filterBuilds = Arrays.asList(); // List<String> | filter by id(s) of related 'builds'
        List<String> fieldsAppEncryptionDeclarations = Arrays.asList(); // List<String> | the fields to include for returned resources of type appEncryptionDeclarations
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsAppEncryptionDeclarationDocuments = Arrays.asList(); // List<String> | the fields to include for returned resources of type appEncryptionDeclarationDocuments
        List<String> fieldsApps = Arrays.asList(); // List<String> | the fields to include for returned resources of type apps
        Integer limitBuilds = 56; // Integer | maximum number of related builds returned (when they are included)
        try {
            AppEncryptionDeclarationsResponse result = apiInstance.appEncryptionDeclarationsGetCollection(filterPlatform, filterApp, filterBuilds, fieldsAppEncryptionDeclarations, limit, include, fieldsAppEncryptionDeclarationDocuments, fieldsApps, limitBuilds);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppEncryptionDeclarationsApi#appEncryptionDeclarationsGetCollection");
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
| **filterPlatform** | **List&lt;String&gt;**| filter by attribute &#39;platform&#39; | [optional] [enum: IOS, MAC_OS, TV_OS, VISION_OS] |
| **filterApp** | **List&lt;String&gt;**| filter by id(s) of related &#39;app&#39; | [optional] |
| **filterBuilds** | **List&lt;String&gt;**| filter by id(s) of related &#39;builds&#39; | [optional] |
| **fieldsAppEncryptionDeclarations** | **List&lt;String&gt;**| the fields to include for returned resources of type appEncryptionDeclarations | [optional] [enum: app, appDescription, appEncryptionDeclarationDocument, appEncryptionDeclarationState, availableOnFrenchStore, builds, codeValue, containsProprietaryCryptography, containsThirdPartyCryptography, createdDate, documentName, documentType, documentUrl, exempt, platform, uploadedDate, usesEncryption] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: app, appEncryptionDeclarationDocument, builds] |
| **fieldsAppEncryptionDeclarationDocuments** | **List&lt;String&gt;**| the fields to include for returned resources of type appEncryptionDeclarationDocuments | [optional] [enum: appEncryptionDeclaration, assetDeliveryState, assetToken, downloadUrl, fileName, fileSize, sourceFileChecksum, uploadOperations, uploaded] |
| **fieldsApps** | **List&lt;String&gt;**| the fields to include for returned resources of type apps | [optional] [enum: alternativeDistributionKey, analyticsReportRequests, appAvailability, appClips, appCustomProductPages, appEncryptionDeclarations, appEvents, appInfos, appPricePoints, appPriceSchedule, appStoreVersionExperimentsV2, appStoreVersions, betaAppLocalizations, betaAppReviewDetail, betaGroups, betaLicenseAgreement, betaTesters, builds, bundleId, ciProduct, contentRightsDeclaration, customerReviews, endUserLicenseAgreement, gameCenterDetail, gameCenterEnabledVersions, inAppPurchases, inAppPurchasesV2, isOrEverWasMadeForKids, marketplaceSearchDetail, name, perfPowerMetrics, preOrder, preReleaseVersions, primaryLocale, promotedPurchases, reviewSubmissions, sku, subscriptionGracePeriod, subscriptionGroups, subscriptionStatusUrl, subscriptionStatusUrlForSandbox, subscriptionStatusUrlVersion, subscriptionStatusUrlVersionForSandbox] |
| **limitBuilds** | **Integer**| maximum number of related builds returned (when they are included) | [optional] |

### Return type

[**AppEncryptionDeclarationsResponse**](AppEncryptionDeclarationsResponse.md)

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
| **200** | List of AppEncryptionDeclarations |  -  |


## appEncryptionDeclarationsGetInstance

> AppEncryptionDeclarationResponse appEncryptionDeclarationsGetInstance(id, fieldsAppEncryptionDeclarations, include, fieldsAppEncryptionDeclarationDocuments, fieldsApps, limitBuilds)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppEncryptionDeclarationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppEncryptionDeclarationsApi apiInstance = new AppEncryptionDeclarationsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAppEncryptionDeclarations = Arrays.asList(); // List<String> | the fields to include for returned resources of type appEncryptionDeclarations
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsAppEncryptionDeclarationDocuments = Arrays.asList(); // List<String> | the fields to include for returned resources of type appEncryptionDeclarationDocuments
        List<String> fieldsApps = Arrays.asList(); // List<String> | the fields to include for returned resources of type apps
        Integer limitBuilds = 56; // Integer | maximum number of related builds returned (when they are included)
        try {
            AppEncryptionDeclarationResponse result = apiInstance.appEncryptionDeclarationsGetInstance(id, fieldsAppEncryptionDeclarations, include, fieldsAppEncryptionDeclarationDocuments, fieldsApps, limitBuilds);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppEncryptionDeclarationsApi#appEncryptionDeclarationsGetInstance");
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
| **fieldsAppEncryptionDeclarations** | **List&lt;String&gt;**| the fields to include for returned resources of type appEncryptionDeclarations | [optional] [enum: app, appDescription, appEncryptionDeclarationDocument, appEncryptionDeclarationState, availableOnFrenchStore, builds, codeValue, containsProprietaryCryptography, containsThirdPartyCryptography, createdDate, documentName, documentType, documentUrl, exempt, platform, uploadedDate, usesEncryption] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: app, appEncryptionDeclarationDocument, builds] |
| **fieldsAppEncryptionDeclarationDocuments** | **List&lt;String&gt;**| the fields to include for returned resources of type appEncryptionDeclarationDocuments | [optional] [enum: appEncryptionDeclaration, assetDeliveryState, assetToken, downloadUrl, fileName, fileSize, sourceFileChecksum, uploadOperations, uploaded] |
| **fieldsApps** | **List&lt;String&gt;**| the fields to include for returned resources of type apps | [optional] [enum: alternativeDistributionKey, analyticsReportRequests, appAvailability, appClips, appCustomProductPages, appEncryptionDeclarations, appEvents, appInfos, appPricePoints, appPriceSchedule, appStoreVersionExperimentsV2, appStoreVersions, betaAppLocalizations, betaAppReviewDetail, betaGroups, betaLicenseAgreement, betaTesters, builds, bundleId, ciProduct, contentRightsDeclaration, customerReviews, endUserLicenseAgreement, gameCenterDetail, gameCenterEnabledVersions, inAppPurchases, inAppPurchasesV2, isOrEverWasMadeForKids, marketplaceSearchDetail, name, perfPowerMetrics, preOrder, preReleaseVersions, primaryLocale, promotedPurchases, reviewSubmissions, sku, subscriptionGracePeriod, subscriptionGroups, subscriptionStatusUrl, subscriptionStatusUrlForSandbox, subscriptionStatusUrlVersion, subscriptionStatusUrlVersionForSandbox] |
| **limitBuilds** | **Integer**| maximum number of related builds returned (when they are included) | [optional] |

### Return type

[**AppEncryptionDeclarationResponse**](AppEncryptionDeclarationResponse.md)

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
| **200** | Single AppEncryptionDeclaration |  -  |

