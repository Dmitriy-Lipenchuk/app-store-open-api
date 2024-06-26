# AppInfosApi

All URIs are relative to *https://api.appstoreconnect.apple.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**appInfosAgeRatingDeclarationGetToOneRelated**](AppInfosApi.md#appInfosAgeRatingDeclarationGetToOneRelated) | **GET** /v1/appInfos/{id}/ageRatingDeclaration |  |
| [**appInfosAppInfoLocalizationsGetToManyRelated**](AppInfosApi.md#appInfosAppInfoLocalizationsGetToManyRelated) | **GET** /v1/appInfos/{id}/appInfoLocalizations |  |
| [**appInfosGetInstance**](AppInfosApi.md#appInfosGetInstance) | **GET** /v1/appInfos/{id} |  |
| [**appInfosPrimaryCategoryGetToOneRelated**](AppInfosApi.md#appInfosPrimaryCategoryGetToOneRelated) | **GET** /v1/appInfos/{id}/primaryCategory |  |
| [**appInfosPrimarySubcategoryOneGetToOneRelated**](AppInfosApi.md#appInfosPrimarySubcategoryOneGetToOneRelated) | **GET** /v1/appInfos/{id}/primarySubcategoryOne |  |
| [**appInfosPrimarySubcategoryTwoGetToOneRelated**](AppInfosApi.md#appInfosPrimarySubcategoryTwoGetToOneRelated) | **GET** /v1/appInfos/{id}/primarySubcategoryTwo |  |
| [**appInfosSecondaryCategoryGetToOneRelated**](AppInfosApi.md#appInfosSecondaryCategoryGetToOneRelated) | **GET** /v1/appInfos/{id}/secondaryCategory |  |
| [**appInfosSecondarySubcategoryOneGetToOneRelated**](AppInfosApi.md#appInfosSecondarySubcategoryOneGetToOneRelated) | **GET** /v1/appInfos/{id}/secondarySubcategoryOne |  |
| [**appInfosSecondarySubcategoryTwoGetToOneRelated**](AppInfosApi.md#appInfosSecondarySubcategoryTwoGetToOneRelated) | **GET** /v1/appInfos/{id}/secondarySubcategoryTwo |  |
| [**appInfosUpdateInstance**](AppInfosApi.md#appInfosUpdateInstance) | **PATCH** /v1/appInfos/{id} |  |



## appInfosAgeRatingDeclarationGetToOneRelated

> AgeRatingDeclarationResponse appInfosAgeRatingDeclarationGetToOneRelated(id, fieldsAgeRatingDeclarations)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppInfosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppInfosApi apiInstance = new AppInfosApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAgeRatingDeclarations = Arrays.asList(); // List<String> | the fields to include for returned resources of type ageRatingDeclarations
        try {
            AgeRatingDeclarationResponse result = apiInstance.appInfosAgeRatingDeclarationGetToOneRelated(id, fieldsAgeRatingDeclarations);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppInfosApi#appInfosAgeRatingDeclarationGetToOneRelated");
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
| **fieldsAgeRatingDeclarations** | **List&lt;String&gt;**| the fields to include for returned resources of type ageRatingDeclarations | [optional] [enum: ageRatingOverride, alcoholTobaccoOrDrugUseOrReferences, contests, gambling, gamblingAndContests, gamblingSimulated, horrorOrFearThemes, kidsAgeBand, matureOrSuggestiveThemes, medicalOrTreatmentInformation, profanityOrCrudeHumor, seventeenPlus, sexualContentGraphicAndNudity, sexualContentOrNudity, unrestrictedWebAccess, violenceCartoonOrFantasy, violenceRealistic, violenceRealisticProlongedGraphicOrSadistic] |

### Return type

[**AgeRatingDeclarationResponse**](AgeRatingDeclarationResponse.md)

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
| **200** | Single AgeRatingDeclaration |  -  |


## appInfosAppInfoLocalizationsGetToManyRelated

> AppInfoLocalizationsResponse appInfosAppInfoLocalizationsGetToManyRelated(id, filterLocale, fieldsAppInfos, fieldsAppInfoLocalizations, limit, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppInfosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppInfosApi apiInstance = new AppInfosApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> filterLocale = Arrays.asList(); // List<String> | filter by attribute 'locale'
        List<String> fieldsAppInfos = Arrays.asList(); // List<String> | the fields to include for returned resources of type appInfos
        List<String> fieldsAppInfoLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type appInfoLocalizations
        Integer limit = 56; // Integer | maximum resources per page
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            AppInfoLocalizationsResponse result = apiInstance.appInfosAppInfoLocalizationsGetToManyRelated(id, filterLocale, fieldsAppInfos, fieldsAppInfoLocalizations, limit, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppInfosApi#appInfosAppInfoLocalizationsGetToManyRelated");
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
| **filterLocale** | **List&lt;String&gt;**| filter by attribute &#39;locale&#39; | [optional] |
| **fieldsAppInfos** | **List&lt;String&gt;**| the fields to include for returned resources of type appInfos | [optional] [enum: ageRatingDeclaration, app, appInfoLocalizations, appStoreAgeRating, appStoreState, brazilAgeRating, brazilAgeRatingV2, kidsAgeBand, primaryCategory, primarySubcategoryOne, primarySubcategoryTwo, secondaryCategory, secondarySubcategoryOne, secondarySubcategoryTwo, state] |
| **fieldsAppInfoLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type appInfoLocalizations | [optional] [enum: appInfo, locale, name, privacyChoicesUrl, privacyPolicyText, privacyPolicyUrl, subtitle] |
| **limit** | **Integer**| maximum resources per page | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: appInfo] |

### Return type

[**AppInfoLocalizationsResponse**](AppInfoLocalizationsResponse.md)

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
| **200** | List of AppInfoLocalizations |  -  |


## appInfosGetInstance

> AppInfoResponse appInfosGetInstance(id, fieldsAppInfos, include, fieldsAgeRatingDeclarations, fieldsAppInfoLocalizations, fieldsAppCategories, limitAppInfoLocalizations)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppInfosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppInfosApi apiInstance = new AppInfosApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAppInfos = Arrays.asList(); // List<String> | the fields to include for returned resources of type appInfos
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        List<String> fieldsAgeRatingDeclarations = Arrays.asList(); // List<String> | the fields to include for returned resources of type ageRatingDeclarations
        List<String> fieldsAppInfoLocalizations = Arrays.asList(); // List<String> | the fields to include for returned resources of type appInfoLocalizations
        List<String> fieldsAppCategories = Arrays.asList(); // List<String> | the fields to include for returned resources of type appCategories
        Integer limitAppInfoLocalizations = 56; // Integer | maximum number of related appInfoLocalizations returned (when they are included)
        try {
            AppInfoResponse result = apiInstance.appInfosGetInstance(id, fieldsAppInfos, include, fieldsAgeRatingDeclarations, fieldsAppInfoLocalizations, fieldsAppCategories, limitAppInfoLocalizations);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppInfosApi#appInfosGetInstance");
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
| **fieldsAppInfos** | **List&lt;String&gt;**| the fields to include for returned resources of type appInfos | [optional] [enum: ageRatingDeclaration, app, appInfoLocalizations, appStoreAgeRating, appStoreState, brazilAgeRating, brazilAgeRatingV2, kidsAgeBand, primaryCategory, primarySubcategoryOne, primarySubcategoryTwo, secondaryCategory, secondarySubcategoryOne, secondarySubcategoryTwo, state] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: ageRatingDeclaration, app, appInfoLocalizations, primaryCategory, primarySubcategoryOne, primarySubcategoryTwo, secondaryCategory, secondarySubcategoryOne, secondarySubcategoryTwo] |
| **fieldsAgeRatingDeclarations** | **List&lt;String&gt;**| the fields to include for returned resources of type ageRatingDeclarations | [optional] [enum: ageRatingOverride, alcoholTobaccoOrDrugUseOrReferences, contests, gambling, gamblingAndContests, gamblingSimulated, horrorOrFearThemes, kidsAgeBand, matureOrSuggestiveThemes, medicalOrTreatmentInformation, profanityOrCrudeHumor, seventeenPlus, sexualContentGraphicAndNudity, sexualContentOrNudity, unrestrictedWebAccess, violenceCartoonOrFantasy, violenceRealistic, violenceRealisticProlongedGraphicOrSadistic] |
| **fieldsAppInfoLocalizations** | **List&lt;String&gt;**| the fields to include for returned resources of type appInfoLocalizations | [optional] [enum: appInfo, locale, name, privacyChoicesUrl, privacyPolicyText, privacyPolicyUrl, subtitle] |
| **fieldsAppCategories** | **List&lt;String&gt;**| the fields to include for returned resources of type appCategories | [optional] [enum: parent, platforms, subcategories] |
| **limitAppInfoLocalizations** | **Integer**| maximum number of related appInfoLocalizations returned (when they are included) | [optional] |

### Return type

[**AppInfoResponse**](AppInfoResponse.md)

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
| **200** | Single AppInfo |  -  |


## appInfosPrimaryCategoryGetToOneRelated

> AppCategoryResponse appInfosPrimaryCategoryGetToOneRelated(id, fieldsAppCategories, limitSubcategories, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppInfosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppInfosApi apiInstance = new AppInfosApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAppCategories = Arrays.asList(); // List<String> | the fields to include for returned resources of type appCategories
        Integer limitSubcategories = 56; // Integer | maximum number of related subcategories returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            AppCategoryResponse result = apiInstance.appInfosPrimaryCategoryGetToOneRelated(id, fieldsAppCategories, limitSubcategories, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppInfosApi#appInfosPrimaryCategoryGetToOneRelated");
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
| **fieldsAppCategories** | **List&lt;String&gt;**| the fields to include for returned resources of type appCategories | [optional] [enum: parent, platforms, subcategories] |
| **limitSubcategories** | **Integer**| maximum number of related subcategories returned (when they are included) | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: parent, subcategories] |

### Return type

[**AppCategoryResponse**](AppCategoryResponse.md)

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
| **200** | Single AppCategory |  -  |


## appInfosPrimarySubcategoryOneGetToOneRelated

> AppCategoryResponse appInfosPrimarySubcategoryOneGetToOneRelated(id, fieldsAppCategories, limitSubcategories, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppInfosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppInfosApi apiInstance = new AppInfosApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAppCategories = Arrays.asList(); // List<String> | the fields to include for returned resources of type appCategories
        Integer limitSubcategories = 56; // Integer | maximum number of related subcategories returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            AppCategoryResponse result = apiInstance.appInfosPrimarySubcategoryOneGetToOneRelated(id, fieldsAppCategories, limitSubcategories, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppInfosApi#appInfosPrimarySubcategoryOneGetToOneRelated");
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
| **fieldsAppCategories** | **List&lt;String&gt;**| the fields to include for returned resources of type appCategories | [optional] [enum: parent, platforms, subcategories] |
| **limitSubcategories** | **Integer**| maximum number of related subcategories returned (when they are included) | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: parent, subcategories] |

### Return type

[**AppCategoryResponse**](AppCategoryResponse.md)

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
| **200** | Single AppCategory |  -  |


## appInfosPrimarySubcategoryTwoGetToOneRelated

> AppCategoryResponse appInfosPrimarySubcategoryTwoGetToOneRelated(id, fieldsAppCategories, limitSubcategories, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppInfosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppInfosApi apiInstance = new AppInfosApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAppCategories = Arrays.asList(); // List<String> | the fields to include for returned resources of type appCategories
        Integer limitSubcategories = 56; // Integer | maximum number of related subcategories returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            AppCategoryResponse result = apiInstance.appInfosPrimarySubcategoryTwoGetToOneRelated(id, fieldsAppCategories, limitSubcategories, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppInfosApi#appInfosPrimarySubcategoryTwoGetToOneRelated");
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
| **fieldsAppCategories** | **List&lt;String&gt;**| the fields to include for returned resources of type appCategories | [optional] [enum: parent, platforms, subcategories] |
| **limitSubcategories** | **Integer**| maximum number of related subcategories returned (when they are included) | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: parent, subcategories] |

### Return type

[**AppCategoryResponse**](AppCategoryResponse.md)

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
| **200** | Single AppCategory |  -  |


## appInfosSecondaryCategoryGetToOneRelated

> AppCategoryResponse appInfosSecondaryCategoryGetToOneRelated(id, fieldsAppCategories, limitSubcategories, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppInfosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppInfosApi apiInstance = new AppInfosApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAppCategories = Arrays.asList(); // List<String> | the fields to include for returned resources of type appCategories
        Integer limitSubcategories = 56; // Integer | maximum number of related subcategories returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            AppCategoryResponse result = apiInstance.appInfosSecondaryCategoryGetToOneRelated(id, fieldsAppCategories, limitSubcategories, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppInfosApi#appInfosSecondaryCategoryGetToOneRelated");
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
| **fieldsAppCategories** | **List&lt;String&gt;**| the fields to include for returned resources of type appCategories | [optional] [enum: parent, platforms, subcategories] |
| **limitSubcategories** | **Integer**| maximum number of related subcategories returned (when they are included) | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: parent, subcategories] |

### Return type

[**AppCategoryResponse**](AppCategoryResponse.md)

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
| **200** | Single AppCategory |  -  |


## appInfosSecondarySubcategoryOneGetToOneRelated

> AppCategoryResponse appInfosSecondarySubcategoryOneGetToOneRelated(id, fieldsAppCategories, limitSubcategories, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppInfosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppInfosApi apiInstance = new AppInfosApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAppCategories = Arrays.asList(); // List<String> | the fields to include for returned resources of type appCategories
        Integer limitSubcategories = 56; // Integer | maximum number of related subcategories returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            AppCategoryResponse result = apiInstance.appInfosSecondarySubcategoryOneGetToOneRelated(id, fieldsAppCategories, limitSubcategories, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppInfosApi#appInfosSecondarySubcategoryOneGetToOneRelated");
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
| **fieldsAppCategories** | **List&lt;String&gt;**| the fields to include for returned resources of type appCategories | [optional] [enum: parent, platforms, subcategories] |
| **limitSubcategories** | **Integer**| maximum number of related subcategories returned (when they are included) | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: parent, subcategories] |

### Return type

[**AppCategoryResponse**](AppCategoryResponse.md)

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
| **200** | Single AppCategory |  -  |


## appInfosSecondarySubcategoryTwoGetToOneRelated

> AppCategoryResponse appInfosSecondarySubcategoryTwoGetToOneRelated(id, fieldsAppCategories, limitSubcategories, include)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppInfosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppInfosApi apiInstance = new AppInfosApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        List<String> fieldsAppCategories = Arrays.asList(); // List<String> | the fields to include for returned resources of type appCategories
        Integer limitSubcategories = 56; // Integer | maximum number of related subcategories returned (when they are included)
        List<String> include = Arrays.asList(); // List<String> | comma-separated list of relationships to include
        try {
            AppCategoryResponse result = apiInstance.appInfosSecondarySubcategoryTwoGetToOneRelated(id, fieldsAppCategories, limitSubcategories, include);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppInfosApi#appInfosSecondarySubcategoryTwoGetToOneRelated");
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
| **fieldsAppCategories** | **List&lt;String&gt;**| the fields to include for returned resources of type appCategories | [optional] [enum: parent, platforms, subcategories] |
| **limitSubcategories** | **Integer**| maximum number of related subcategories returned (when they are included) | [optional] |
| **include** | **List&lt;String&gt;**| comma-separated list of relationships to include | [optional] [enum: parent, subcategories] |

### Return type

[**AppCategoryResponse**](AppCategoryResponse.md)

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
| **200** | Single AppCategory |  -  |


## appInfosUpdateInstance

> AppInfoResponse appInfosUpdateInstance(id, appInfoUpdateRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.AppInfosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.appstoreconnect.apple.com");
        
        // Configure HTTP bearer authorization: itc-bearer-token
        HttpBearerAuth itc-bearer-token = (HttpBearerAuth) defaultClient.getAuthentication("itc-bearer-token");
        itc-bearer-token.setBearerToken("BEARER TOKEN");

        AppInfosApi apiInstance = new AppInfosApi(defaultClient);
        String id = "id_example"; // String | the id of the requested resource
        AppInfoUpdateRequest appInfoUpdateRequest = new AppInfoUpdateRequest(); // AppInfoUpdateRequest | AppInfo representation
        try {
            AppInfoResponse result = apiInstance.appInfosUpdateInstance(id, appInfoUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AppInfosApi#appInfosUpdateInstance");
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
| **appInfoUpdateRequest** | [**AppInfoUpdateRequest**](AppInfoUpdateRequest.md)| AppInfo representation | |

### Return type

[**AppInfoResponse**](AppInfoResponse.md)

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
| **200** | Single AppInfo |  -  |
| **409** | Request entity error(s) |  -  |

