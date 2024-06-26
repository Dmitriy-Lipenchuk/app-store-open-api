# AppEncryptionDeclarationDocumentsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**appEncryptionDeclarationDocumentsCreateInstance**](AppEncryptionDeclarationDocumentsApi.md#appEncryptionDeclarationDocumentsCreateInstance) | **POST** /v1/appEncryptionDeclarationDocuments |  |
| [**appEncryptionDeclarationDocumentsGetInstance**](AppEncryptionDeclarationDocumentsApi.md#appEncryptionDeclarationDocumentsGetInstance) | **GET** /v1/appEncryptionDeclarationDocuments/{id} |  |
| [**appEncryptionDeclarationDocumentsUpdateInstance**](AppEncryptionDeclarationDocumentsApi.md#appEncryptionDeclarationDocumentsUpdateInstance) | **PATCH** /v1/appEncryptionDeclarationDocuments/{id} |  |



## appEncryptionDeclarationDocumentsCreateInstance

> AppEncryptionDeclarationDocumentResponse appEncryptionDeclarationDocumentsCreateInstance(appEncryptionDeclarationDocumentCreateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppEncryptionDeclarationDocumentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppEncryptionDeclarationDocumentsApi apiInstance = new AppEncryptionDeclarationDocumentsApi(defaultClient);
        AppEncryptionDeclarationDocumentCreateRequest appEncryptionDeclarationDocumentCreateRequest = new AppEncryptionDeclarationDocumentCreateRequest(); // AppEncryptionDeclarationDocumentCreateRequest | AppEncryptionDeclarationDocument representation
        try {
            AppEncryptionDeclarationDocumentResponse result = apiInstance.appEncryptionDeclarationDocumentsCreateInstance(appEncryptionDeclarationDocumentCreateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppEncryptionDeclarationDocumentsApi#appEncryptionDeclarationDocumentsCreateInstance");
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
| **appEncryptionDeclarationDocumentCreateRequest** | [**AppEncryptionDeclarationDocumentCreateRequest**](AppEncryptionDeclarationDocumentCreateRequest.md)| AppEncryptionDeclarationDocument representation | |

### Return type

[**AppEncryptionDeclarationDocumentResponse**](AppEncryptionDeclarationDocumentResponse.md)

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
| **201** | Single AppEncryptionDeclarationDocument |  -  |
| **409** | Request entity error(s) |  -  |


## appEncryptionDeclarationDocumentsGetInstance

> AppEncryptionDeclarationDocumentResponse appEncryptionDeclarationDocumentsGetInstance(id, fieldsAppEncryptionDeclarationDocuments)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppEncryptionDeclarationDocumentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppEncryptionDeclarationDocumentsApi apiInstance = new AppEncryptionDeclarationDocumentsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAppEncryptionDeclarationDocuments = Arrays.asList(); // List<String> | the fields to include for returned resources of type appEncryptionDeclarationDocuments
        try {
            AppEncryptionDeclarationDocumentResponse result = apiInstance.appEncryptionDeclarationDocumentsGetInstance(id, fieldsAppEncryptionDeclarationDocuments);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppEncryptionDeclarationDocumentsApi#appEncryptionDeclarationDocumentsGetInstance");
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


## appEncryptionDeclarationDocumentsUpdateInstance

> AppEncryptionDeclarationDocumentResponse appEncryptionDeclarationDocumentsUpdateInstance(id, appEncryptionDeclarationDocumentUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppEncryptionDeclarationDocumentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppEncryptionDeclarationDocumentsApi apiInstance = new AppEncryptionDeclarationDocumentsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        AppEncryptionDeclarationDocumentUpdateRequest appEncryptionDeclarationDocumentUpdateRequest = new AppEncryptionDeclarationDocumentUpdateRequest(); // AppEncryptionDeclarationDocumentUpdateRequest | AppEncryptionDeclarationDocument representation
        try {
            AppEncryptionDeclarationDocumentResponse result = apiInstance.appEncryptionDeclarationDocumentsUpdateInstance(id, appEncryptionDeclarationDocumentUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppEncryptionDeclarationDocumentsApi#appEncryptionDeclarationDocumentsUpdateInstance");
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
| **appEncryptionDeclarationDocumentUpdateRequest** | [**AppEncryptionDeclarationDocumentUpdateRequest**](AppEncryptionDeclarationDocumentUpdateRequest.md)| AppEncryptionDeclarationDocument representation | |

### Return type

[**AppEncryptionDeclarationDocumentResponse**](AppEncryptionDeclarationDocumentResponse.md)

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
| **200** | Single AppEncryptionDeclarationDocument |  -  |
| **409** | Request entity error(s) |  -  |

