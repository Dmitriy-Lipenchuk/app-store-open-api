package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.AgeRatingDeclarationResponse;
import org.openapitools.client.model.AppCategoryResponse;
import org.openapitools.client.model.AppInfoLocalizationsResponse;
import org.openapitools.client.model.AppInfoResponse;
import org.openapitools.client.model.AppInfoUpdateRequest;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppInfosApi {
  private ApiClient apiClient;

  public AppInfosApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AppInfosApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAgeRatingDeclarations the fields to include for returned resources of type ageRatingDeclarations (optional)
   * @return AgeRatingDeclarationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AgeRatingDeclaration </td><td>  -  </td></tr>
     </table>
   */
  public AgeRatingDeclarationResponse appInfosAgeRatingDeclarationGetToOneRelated(String id, List<String> fieldsAgeRatingDeclarations) throws ApiException {
    return appInfosAgeRatingDeclarationGetToOneRelatedWithHttpInfo(id, fieldsAgeRatingDeclarations).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAgeRatingDeclarations the fields to include for returned resources of type ageRatingDeclarations (optional)
   * @return ApiResponse&lt;AgeRatingDeclarationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AgeRatingDeclaration </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AgeRatingDeclarationResponse> appInfosAgeRatingDeclarationGetToOneRelatedWithHttpInfo(String id, List<String> fieldsAgeRatingDeclarations) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appInfosAgeRatingDeclarationGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/appInfos/{id}/ageRatingDeclaration"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[ageRatingDeclarations]", fieldsAgeRatingDeclarations)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AgeRatingDeclarationResponse> localVarReturnType = new GenericType<AgeRatingDeclarationResponse>() {};
    return apiClient.invokeAPI("AppInfosApi.appInfosAgeRatingDeclarationGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterLocale filter by attribute &#39;locale&#39; (optional)
   * @param fieldsAppInfos the fields to include for returned resources of type appInfos (optional)
   * @param fieldsAppInfoLocalizations the fields to include for returned resources of type appInfoLocalizations (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AppInfoLocalizationsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppInfoLocalizations </td><td>  -  </td></tr>
     </table>
   */
  public AppInfoLocalizationsResponse appInfosAppInfoLocalizationsGetToManyRelated(String id, List<String> filterLocale, List<String> fieldsAppInfos, List<String> fieldsAppInfoLocalizations, Integer limit, List<String> include) throws ApiException {
    return appInfosAppInfoLocalizationsGetToManyRelatedWithHttpInfo(id, filterLocale, fieldsAppInfos, fieldsAppInfoLocalizations, limit, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterLocale filter by attribute &#39;locale&#39; (optional)
   * @param fieldsAppInfos the fields to include for returned resources of type appInfos (optional)
   * @param fieldsAppInfoLocalizations the fields to include for returned resources of type appInfoLocalizations (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AppInfoLocalizationsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppInfoLocalizations </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppInfoLocalizationsResponse> appInfosAppInfoLocalizationsGetToManyRelatedWithHttpInfo(String id, List<String> filterLocale, List<String> fieldsAppInfos, List<String> fieldsAppInfoLocalizations, Integer limit, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appInfosAppInfoLocalizationsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/appInfos/{id}/appInfoLocalizations"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[locale]", filterLocale)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appInfos]", fieldsAppInfos));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appInfoLocalizations]", fieldsAppInfoLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppInfoLocalizationsResponse> localVarReturnType = new GenericType<AppInfoLocalizationsResponse>() {};
    return apiClient.invokeAPI("AppInfosApi.appInfosAppInfoLocalizationsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppInfos the fields to include for returned resources of type appInfos (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsAgeRatingDeclarations the fields to include for returned resources of type ageRatingDeclarations (optional)
   * @param fieldsAppInfoLocalizations the fields to include for returned resources of type appInfoLocalizations (optional)
   * @param fieldsAppCategories the fields to include for returned resources of type appCategories (optional)
   * @param limitAppInfoLocalizations maximum number of related appInfoLocalizations returned (when they are included) (optional)
   * @return AppInfoResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppInfo </td><td>  -  </td></tr>
     </table>
   */
  public AppInfoResponse appInfosGetInstance(String id, List<String> fieldsAppInfos, List<String> include, List<String> fieldsAgeRatingDeclarations, List<String> fieldsAppInfoLocalizations, List<String> fieldsAppCategories, Integer limitAppInfoLocalizations) throws ApiException {
    return appInfosGetInstanceWithHttpInfo(id, fieldsAppInfos, include, fieldsAgeRatingDeclarations, fieldsAppInfoLocalizations, fieldsAppCategories, limitAppInfoLocalizations).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppInfos the fields to include for returned resources of type appInfos (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsAgeRatingDeclarations the fields to include for returned resources of type ageRatingDeclarations (optional)
   * @param fieldsAppInfoLocalizations the fields to include for returned resources of type appInfoLocalizations (optional)
   * @param fieldsAppCategories the fields to include for returned resources of type appCategories (optional)
   * @param limitAppInfoLocalizations maximum number of related appInfoLocalizations returned (when they are included) (optional)
   * @return ApiResponse&lt;AppInfoResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppInfo </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppInfoResponse> appInfosGetInstanceWithHttpInfo(String id, List<String> fieldsAppInfos, List<String> include, List<String> fieldsAgeRatingDeclarations, List<String> fieldsAppInfoLocalizations, List<String> fieldsAppCategories, Integer limitAppInfoLocalizations) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appInfosGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appInfos/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appInfos]", fieldsAppInfos)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[ageRatingDeclarations]", fieldsAgeRatingDeclarations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appInfoLocalizations]", fieldsAppInfoLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appCategories]", fieldsAppCategories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appInfoLocalizations]", limitAppInfoLocalizations));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppInfoResponse> localVarReturnType = new GenericType<AppInfoResponse>() {};
    return apiClient.invokeAPI("AppInfosApi.appInfosGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppCategories the fields to include for returned resources of type appCategories (optional)
   * @param limitSubcategories maximum number of related subcategories returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AppCategoryResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppCategory </td><td>  -  </td></tr>
     </table>
   */
  public AppCategoryResponse appInfosPrimaryCategoryGetToOneRelated(String id, List<String> fieldsAppCategories, Integer limitSubcategories, List<String> include) throws ApiException {
    return appInfosPrimaryCategoryGetToOneRelatedWithHttpInfo(id, fieldsAppCategories, limitSubcategories, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppCategories the fields to include for returned resources of type appCategories (optional)
   * @param limitSubcategories maximum number of related subcategories returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AppCategoryResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppCategory </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppCategoryResponse> appInfosPrimaryCategoryGetToOneRelatedWithHttpInfo(String id, List<String> fieldsAppCategories, Integer limitSubcategories, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appInfosPrimaryCategoryGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/appInfos/{id}/primaryCategory"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appCategories]", fieldsAppCategories)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[subcategories]", limitSubcategories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppCategoryResponse> localVarReturnType = new GenericType<AppCategoryResponse>() {};
    return apiClient.invokeAPI("AppInfosApi.appInfosPrimaryCategoryGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppCategories the fields to include for returned resources of type appCategories (optional)
   * @param limitSubcategories maximum number of related subcategories returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AppCategoryResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppCategory </td><td>  -  </td></tr>
     </table>
   */
  public AppCategoryResponse appInfosPrimarySubcategoryOneGetToOneRelated(String id, List<String> fieldsAppCategories, Integer limitSubcategories, List<String> include) throws ApiException {
    return appInfosPrimarySubcategoryOneGetToOneRelatedWithHttpInfo(id, fieldsAppCategories, limitSubcategories, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppCategories the fields to include for returned resources of type appCategories (optional)
   * @param limitSubcategories maximum number of related subcategories returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AppCategoryResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppCategory </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppCategoryResponse> appInfosPrimarySubcategoryOneGetToOneRelatedWithHttpInfo(String id, List<String> fieldsAppCategories, Integer limitSubcategories, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appInfosPrimarySubcategoryOneGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/appInfos/{id}/primarySubcategoryOne"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appCategories]", fieldsAppCategories)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[subcategories]", limitSubcategories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppCategoryResponse> localVarReturnType = new GenericType<AppCategoryResponse>() {};
    return apiClient.invokeAPI("AppInfosApi.appInfosPrimarySubcategoryOneGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppCategories the fields to include for returned resources of type appCategories (optional)
   * @param limitSubcategories maximum number of related subcategories returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AppCategoryResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppCategory </td><td>  -  </td></tr>
     </table>
   */
  public AppCategoryResponse appInfosPrimarySubcategoryTwoGetToOneRelated(String id, List<String> fieldsAppCategories, Integer limitSubcategories, List<String> include) throws ApiException {
    return appInfosPrimarySubcategoryTwoGetToOneRelatedWithHttpInfo(id, fieldsAppCategories, limitSubcategories, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppCategories the fields to include for returned resources of type appCategories (optional)
   * @param limitSubcategories maximum number of related subcategories returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AppCategoryResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppCategory </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppCategoryResponse> appInfosPrimarySubcategoryTwoGetToOneRelatedWithHttpInfo(String id, List<String> fieldsAppCategories, Integer limitSubcategories, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appInfosPrimarySubcategoryTwoGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/appInfos/{id}/primarySubcategoryTwo"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appCategories]", fieldsAppCategories)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[subcategories]", limitSubcategories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppCategoryResponse> localVarReturnType = new GenericType<AppCategoryResponse>() {};
    return apiClient.invokeAPI("AppInfosApi.appInfosPrimarySubcategoryTwoGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppCategories the fields to include for returned resources of type appCategories (optional)
   * @param limitSubcategories maximum number of related subcategories returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AppCategoryResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppCategory </td><td>  -  </td></tr>
     </table>
   */
  public AppCategoryResponse appInfosSecondaryCategoryGetToOneRelated(String id, List<String> fieldsAppCategories, Integer limitSubcategories, List<String> include) throws ApiException {
    return appInfosSecondaryCategoryGetToOneRelatedWithHttpInfo(id, fieldsAppCategories, limitSubcategories, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppCategories the fields to include for returned resources of type appCategories (optional)
   * @param limitSubcategories maximum number of related subcategories returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AppCategoryResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppCategory </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppCategoryResponse> appInfosSecondaryCategoryGetToOneRelatedWithHttpInfo(String id, List<String> fieldsAppCategories, Integer limitSubcategories, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appInfosSecondaryCategoryGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/appInfos/{id}/secondaryCategory"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appCategories]", fieldsAppCategories)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[subcategories]", limitSubcategories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppCategoryResponse> localVarReturnType = new GenericType<AppCategoryResponse>() {};
    return apiClient.invokeAPI("AppInfosApi.appInfosSecondaryCategoryGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppCategories the fields to include for returned resources of type appCategories (optional)
   * @param limitSubcategories maximum number of related subcategories returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AppCategoryResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppCategory </td><td>  -  </td></tr>
     </table>
   */
  public AppCategoryResponse appInfosSecondarySubcategoryOneGetToOneRelated(String id, List<String> fieldsAppCategories, Integer limitSubcategories, List<String> include) throws ApiException {
    return appInfosSecondarySubcategoryOneGetToOneRelatedWithHttpInfo(id, fieldsAppCategories, limitSubcategories, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppCategories the fields to include for returned resources of type appCategories (optional)
   * @param limitSubcategories maximum number of related subcategories returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AppCategoryResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppCategory </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppCategoryResponse> appInfosSecondarySubcategoryOneGetToOneRelatedWithHttpInfo(String id, List<String> fieldsAppCategories, Integer limitSubcategories, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appInfosSecondarySubcategoryOneGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/appInfos/{id}/secondarySubcategoryOne"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appCategories]", fieldsAppCategories)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[subcategories]", limitSubcategories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppCategoryResponse> localVarReturnType = new GenericType<AppCategoryResponse>() {};
    return apiClient.invokeAPI("AppInfosApi.appInfosSecondarySubcategoryOneGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppCategories the fields to include for returned resources of type appCategories (optional)
   * @param limitSubcategories maximum number of related subcategories returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AppCategoryResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppCategory </td><td>  -  </td></tr>
     </table>
   */
  public AppCategoryResponse appInfosSecondarySubcategoryTwoGetToOneRelated(String id, List<String> fieldsAppCategories, Integer limitSubcategories, List<String> include) throws ApiException {
    return appInfosSecondarySubcategoryTwoGetToOneRelatedWithHttpInfo(id, fieldsAppCategories, limitSubcategories, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppCategories the fields to include for returned resources of type appCategories (optional)
   * @param limitSubcategories maximum number of related subcategories returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AppCategoryResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppCategory </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppCategoryResponse> appInfosSecondarySubcategoryTwoGetToOneRelatedWithHttpInfo(String id, List<String> fieldsAppCategories, Integer limitSubcategories, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appInfosSecondarySubcategoryTwoGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/appInfos/{id}/secondarySubcategoryTwo"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appCategories]", fieldsAppCategories)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[subcategories]", limitSubcategories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppCategoryResponse> localVarReturnType = new GenericType<AppCategoryResponse>() {};
    return apiClient.invokeAPI("AppInfosApi.appInfosSecondarySubcategoryTwoGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appInfoUpdateRequest AppInfo representation (required)
   * @return AppInfoResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppInfo </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public AppInfoResponse appInfosUpdateInstance(String id, AppInfoUpdateRequest appInfoUpdateRequest) throws ApiException {
    return appInfosUpdateInstanceWithHttpInfo(id, appInfoUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appInfoUpdateRequest AppInfo representation (required)
   * @return ApiResponse&lt;AppInfoResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppInfo </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppInfoResponse> appInfosUpdateInstanceWithHttpInfo(String id, AppInfoUpdateRequest appInfoUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appInfosUpdateInstance");
    }
    if (appInfoUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appInfoUpdateRequest' when calling appInfosUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appInfos/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppInfoResponse> localVarReturnType = new GenericType<AppInfoResponse>() {};
    return apiClient.invokeAPI("AppInfosApi.appInfosUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), appInfoUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
