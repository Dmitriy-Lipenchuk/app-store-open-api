# UsersApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**usersDeleteInstance**](UsersApi.md#usersDeleteInstance) | **DELETE** /v1/users/{id} |  |
| [**usersGetCollection**](UsersApi.md#usersGetCollection) | **GET** /v1/users |  |
| [**usersGetInstance**](UsersApi.md#usersGetInstance) | **GET** /v1/users/{id} |  |
| [**usersUpdateInstance**](UsersApi.md#usersUpdateInstance) | **PATCH** /v1/users/{id} |  |
| [**usersVisibleAppsCreateToManyRelationship**](UsersApi.md#usersVisibleAppsCreateToManyRelationship) | **POST** /v1/users/{id}/relationships/visibleApps |  |
| [**usersVisibleAppsDeleteToManyRelationship**](UsersApi.md#usersVisibleAppsDeleteToManyRelationship) | **DELETE** /v1/users/{id}/relationships/visibleApps |  |
| [**usersVisibleAppsGetToManyRelated**](UsersApi.md#usersVisibleAppsGetToManyRelated) | **GET** /v1/users/{id}/visibleApps |  |
| [**usersVisibleAppsGetToManyRelationship**](UsersApi.md#usersVisibleAppsGetToManyRelationship) | **GET** /v1/users/{id}/relationships/visibleApps |  |
| [**usersVisibleAppsReplaceToManyRelationship**](UsersApi.md#usersVisibleAppsReplaceToManyRelationship) | **PATCH** /v1/users/{id}/relationships/visibleApps |  |



## usersDeleteInstance

> usersDeleteInstance(id)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        try {
            apiInstance.usersDeleteInstance(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#usersDeleteInstance");
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


## usersGetCollection

> UsersResponse usersGetCollection(filterRoles, filterUsername, filterVisibleApps, sort, fieldsUsers, limit, include, fieldsApps, limitVisibleApps)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        UsersApi apiInstance = new UsersApi(defaultClient);
        List<String> filterRoles = Arrays.asList(); // List<String> | filter by attribute 'roles'
        List<String> filterUsername = Arrays.asList(); // List<String> | filter by attribute 'username'
        List<String> filterVisibleApps = Arrays.asList(); // List<String> | filter by id(s) of related 'visibleApps'
        List<String> sort = Arrays.asList(); // List<String> | comma-separated list of sort expressions; resources will be sorted as specified
        List<String> fieldsUsers = Arrays.asList(); // List<String> | the fields to include for returned resources of type users
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsApps = Arrays.asList(); // List<String> | the fields to include for returned resources of type apps
        Integer limitVisibleApps = 56; // Integer | maximum number of related visibleApps returned (when they are included)
        try {
            UsersResponse result = apiInstance.usersGetCollection(filterRoles, filterUsername, filterVisibleApps, sort, fieldsUsers, limit, include, fieldsApps, limitVisibleApps);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#usersGetCollection");
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
| **filterRoles** | **List&lt;String&gt;**| filter by attribute &#39;roles&#39; | [optional] [enum: ADMIN, FINANCE, ACCOUNT_HOLDER, SALES, MARKETING, APP_MANAGER, DEVELOPER, ACCESS_TO_REPORTS, CUSTOMER_SUPPORT, CREATE_APPS, CLOUD_MANAGED_DEVELOPER_ID, CLOUD_MANAGED_APP_DISTRIBUTION, GENERATE_INDIVIDUAL_KEYS] |
| **filterUsername** | **List&lt;String&gt;**| filter by attribute &#39;username&#39; | [optional] |
| **filterVisibleApps** | **List&lt;String&gt;**| filter by id(s) of related &#39;visibleApps&#39; | [optional] |
| **sort** | **List&lt;String&gt;**| comma-separated list of sort expressions; resources will be sorted as specified | [optional] [enum: lastName, -lastName, username, -username] |
| **fieldsUsers** | **List&lt;String&gt;**| the fields to include for returned resources of type users | [optional] [enum: allAppsVisible, firstName, lastName, provisioningAllowed, roles, username, visibleApps] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: visibleApps] |
| **fieldsApps** | **List&lt;String&gt;**| the fields to include for returned resources of type apps | [optional] [enum: alternativeDistributionKey, analyticsReportRequests, appAvailability, appClips, appCustomProductPages, appEncryptionDeclarations, appEvents, appInfos, appPricePoints, appPriceSchedule, appStoreVersionExperimentsV2, appStoreVersions, betaAppLocalizations, betaAppReviewDetail, betaGroups, betaLicenseAgreement, betaTesters, builds, bundleId, ciProduct, contentRightsDeclaration, customerReviews, endUserLicenseAgreement, gameCenterDetail, gameCenterEnabledVersions, inAppPurchases, inAppPurchasesV2, isOrEverWasMadeForKids, marketplaceSearchDetail, name, perfPowerMetrics, preOrder, preReleaseVersions, primaryLocale, promotedPurchases, reviewSubmissions, sku, subscriptionGracePeriod, subscriptionGroups, subscriptionStatusUrl, subscriptionStatusUrlForSandbox, subscriptionStatusUrlVersion, subscriptionStatusUrlVersionForSandbox] |
| **limitVisibleApps** | **Integer**| maximum number of related visibleApps returned (when they are included) | [optional] |

### Return type

[**UsersResponse**](UsersResponse.md)

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
| **200** | List of Users |  -  |


## usersGetInstance

> UserResponse usersGetInstance(id, fieldsUsers, include, fieldsApps, limitVisibleApps)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsUsers = Arrays.asList(); // List<String> | the fields to include for returned resources of type users
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsApps = Arrays.asList(); // List<String> | the fields to include for returned resources of type apps
        Integer limitVisibleApps = 56; // Integer | maximum number of related visibleApps returned (when they are included)
        try {
            UserResponse result = apiInstance.usersGetInstance(id, fieldsUsers, include, fieldsApps, limitVisibleApps);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#usersGetInstance");
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
| **fieldsUsers** | **List&lt;String&gt;**| the fields to include for returned resources of type users | [optional] [enum: allAppsVisible, firstName, lastName, provisioningAllowed, roles, username, visibleApps] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: visibleApps] |
| **fieldsApps** | **List&lt;String&gt;**| the fields to include for returned resources of type apps | [optional] [enum: alternativeDistributionKey, analyticsReportRequests, appAvailability, appClips, appCustomProductPages, appEncryptionDeclarations, appEvents, appInfos, appPricePoints, appPriceSchedule, appStoreVersionExperimentsV2, appStoreVersions, betaAppLocalizations, betaAppReviewDetail, betaGroups, betaLicenseAgreement, betaTesters, builds, bundleId, ciProduct, contentRightsDeclaration, customerReviews, endUserLicenseAgreement, gameCenterDetail, gameCenterEnabledVersions, inAppPurchases, inAppPurchasesV2, isOrEverWasMadeForKids, marketplaceSearchDetail, name, perfPowerMetrics, preOrder, preReleaseVersions, primaryLocale, promotedPurchases, reviewSubmissions, sku, subscriptionGracePeriod, subscriptionGroups, subscriptionStatusUrl, subscriptionStatusUrlForSandbox, subscriptionStatusUrlVersion, subscriptionStatusUrlVersionForSandbox] |
| **limitVisibleApps** | **Integer**| maximum number of related visibleApps returned (when they are included) | [optional] |

### Return type

[**UserResponse**](UserResponse.md)

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
| **200** | Single User |  -  |


## usersUpdateInstance

> UserResponse usersUpdateInstance(id, userUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        UserUpdateRequest userUpdateRequest = new UserUpdateRequest(); // UserUpdateRequest | User representation
        try {
            UserResponse result = apiInstance.usersUpdateInstance(id, userUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#usersUpdateInstance");
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
| **userUpdateRequest** | [**UserUpdateRequest**](UserUpdateRequest.md)| User representation | |

### Return type

[**UserResponse**](UserResponse.md)

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
| **200** | Single User |  -  |
| **409** | Request entity error(s) |  -  |


## usersVisibleAppsCreateToManyRelationship

> usersVisibleAppsCreateToManyRelationship(id, userVisibleAppsLinkagesRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        UserVisibleAppsLinkagesRequest userVisibleAppsLinkagesRequest = new UserVisibleAppsLinkagesRequest(); // UserVisibleAppsLinkagesRequest | List of related linkages
        try {
            apiInstance.usersVisibleAppsCreateToManyRelationship(id, userVisibleAppsLinkagesRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#usersVisibleAppsCreateToManyRelationship");
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
| **userVisibleAppsLinkagesRequest** | [**UserVisibleAppsLinkagesRequest**](UserVisibleAppsLinkagesRequest.md)| List of related linkages | |

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


## usersVisibleAppsDeleteToManyRelationship

> usersVisibleAppsDeleteToManyRelationship(id, userVisibleAppsLinkagesRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        UserVisibleAppsLinkagesRequest userVisibleAppsLinkagesRequest = new UserVisibleAppsLinkagesRequest(); // UserVisibleAppsLinkagesRequest | List of related linkages
        try {
            apiInstance.usersVisibleAppsDeleteToManyRelationship(id, userVisibleAppsLinkagesRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#usersVisibleAppsDeleteToManyRelationship");
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
| **userVisibleAppsLinkagesRequest** | [**UserVisibleAppsLinkagesRequest**](UserVisibleAppsLinkagesRequest.md)| List of related linkages | |

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


## usersVisibleAppsGetToManyRelated

> AppsWithoutIncludesResponse usersVisibleAppsGetToManyRelated(id, fieldsApps, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsApps = Arrays.asList(); // List<String> | the fields to include for returned resources of type apps
        Integer limit = 56; // Integer | maximum resources per page
        try {
            AppsWithoutIncludesResponse result = apiInstance.usersVisibleAppsGetToManyRelated(id, fieldsApps, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#usersVisibleAppsGetToManyRelated");
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
| **limit** | **Integer**| maximum resources per page | [optional] |

### Return type

[**AppsWithoutIncludesResponse**](AppsWithoutIncludesResponse.md)

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
| **200** | List of Apps with get |  -  |


## usersVisibleAppsGetToManyRelationship

> UserVisibleAppsLinkagesResponse usersVisibleAppsGetToManyRelationship(id, limit)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        Integer limit = 56; // Integer | maximum resources per page
        try {
            UserVisibleAppsLinkagesResponse result = apiInstance.usersVisibleAppsGetToManyRelationship(id, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#usersVisibleAppsGetToManyRelationship");
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
| **limit** | **Integer**| maximum resources per page | [optional] |

### Return type

[**UserVisibleAppsLinkagesResponse**](UserVisibleAppsLinkagesResponse.md)

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
| **200** | List of related linkages |  -  |


## usersVisibleAppsReplaceToManyRelationship

> usersVisibleAppsReplaceToManyRelationship(id, userVisibleAppsLinkagesRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        UserVisibleAppsLinkagesRequest userVisibleAppsLinkagesRequest = new UserVisibleAppsLinkagesRequest(); // UserVisibleAppsLinkagesRequest | List of related linkages
        try {
            apiInstance.usersVisibleAppsReplaceToManyRelationship(id, userVisibleAppsLinkagesRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#usersVisibleAppsReplaceToManyRelationship");
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
| **userVisibleAppsLinkagesRequest** | [**UserVisibleAppsLinkagesRequest**](UserVisibleAppsLinkagesRequest.md)| List of related linkages | |

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

