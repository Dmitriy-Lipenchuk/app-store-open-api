# ActorsApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**actorsGetCollection**](ActorsApi.md#actorsGetCollection) | **GET** /v1/actors |  |
| [**actorsGetInstance**](ActorsApi.md#actorsGetInstance) | **GET** /v1/actors/{id} |  |



## actorsGetCollection

> ActorsResponse actorsGetCollection(filterId, fieldsActors, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.ActorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        ActorsApi apiInstance = new ActorsApi(defaultClient);
        List<String> filterId = Arrays.asList(); // List<String> | filter by id(s)
        List<String> fieldsActors = Arrays.asList(); // List<String> | the fields to include for returned resources of type actors
        Integer limit = 56; // Integer | maximum resources per page
        try {
            ActorsResponse result = apiInstance.actorsGetCollection(filterId, fieldsActors, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActorsApi#actorsGetCollection");
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
| **filterId** | **List&lt;String&gt;**| filter by id(s) | |
| **fieldsActors** | **List&lt;String&gt;**| the fields to include for returned resources of type actors | [optional] [enum: actorType, apiKeyId, userEmail, userFirstName, userLastName] |
| **limit** | **Integer**| maximum resources per page | [optional] |

### Return type

[**ActorsResponse**](ActorsResponse.md)

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
| **200** | List of Actors |  -  |


## actorsGetInstance

> ActorResponse actorsGetInstance(id, fieldsActors)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.ActorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        ActorsApi apiInstance = new ActorsApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsActors = Arrays.asList(); // List<String> | the fields to include for returned resources of type actors
        try {
            ActorResponse result = apiInstance.actorsGetInstance(id, fieldsActors);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActorsApi#actorsGetInstance");
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
| **fieldsActors** | **List&lt;String&gt;**| the fields to include for returned resources of type actors | [optional] [enum: actorType, apiKeyId, userEmail, userFirstName, userLastName] |

### Return type

[**ActorResponse**](ActorResponse.md)

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
| **200** | Single Actor |  -  |

