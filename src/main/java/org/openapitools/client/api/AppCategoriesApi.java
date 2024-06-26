package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.AppCategoriesResponse;
import org.openapitools.client.model.AppCategoriesWithoutIncludesResponse;
import org.openapitools.client.model.AppCategoryResponse;
import org.openapitools.client.model.AppCategoryWithoutIncludesResponse;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppCategoriesApi {
  private ApiClient apiClient;

  public AppCategoriesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AppCategoriesApi(ApiClient apiClient) {
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
   * @param filterPlatforms filter by attribute &#39;platforms&#39; (optional)
   * @param existsParent filter by existence or non-existence of related &#39;parent&#39; (optional)
   * @param fieldsAppCategories the fields to include for returned resources of type appCategories (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param limitSubcategories maximum number of related subcategories returned (when they are included) (optional)
   * @return AppCategoriesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppCategories </td><td>  -  </td></tr>
     </table>
   */
  public AppCategoriesResponse appCategoriesGetCollection(List<String> filterPlatforms, Boolean existsParent, List<String> fieldsAppCategories, Integer limit, List<String> include, Integer limitSubcategories) throws ApiException {
    return appCategoriesGetCollectionWithHttpInfo(filterPlatforms, existsParent, fieldsAppCategories, limit, include, limitSubcategories).getData();
  }

  /**
   * 
   * 
   * @param filterPlatforms filter by attribute &#39;platforms&#39; (optional)
   * @param existsParent filter by existence or non-existence of related &#39;parent&#39; (optional)
   * @param fieldsAppCategories the fields to include for returned resources of type appCategories (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param limitSubcategories maximum number of related subcategories returned (when they are included) (optional)
   * @return ApiResponse&lt;AppCategoriesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppCategories </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppCategoriesResponse> appCategoriesGetCollectionWithHttpInfo(List<String> filterPlatforms, Boolean existsParent, List<String> fieldsAppCategories, Integer limit, List<String> include, Integer limitSubcategories) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[platforms]", filterPlatforms)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "exists[parent]", existsParent));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appCategories]", fieldsAppCategories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[subcategories]", limitSubcategories));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppCategoriesResponse> localVarReturnType = new GenericType<AppCategoriesResponse>() {};
    return apiClient.invokeAPI("AppCategoriesApi.appCategoriesGetCollection", "/v1/appCategories", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppCategories the fields to include for returned resources of type appCategories (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param limitSubcategories maximum number of related subcategories returned (when they are included) (optional)
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
  public AppCategoryResponse appCategoriesGetInstance(String id, List<String> fieldsAppCategories, List<String> include, Integer limitSubcategories) throws ApiException {
    return appCategoriesGetInstanceWithHttpInfo(id, fieldsAppCategories, include, limitSubcategories).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppCategories the fields to include for returned resources of type appCategories (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param limitSubcategories maximum number of related subcategories returned (when they are included) (optional)
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
  public ApiResponse<AppCategoryResponse> appCategoriesGetInstanceWithHttpInfo(String id, List<String> fieldsAppCategories, List<String> include, Integer limitSubcategories) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appCategoriesGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appCategories/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appCategories]", fieldsAppCategories)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[subcategories]", limitSubcategories));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppCategoryResponse> localVarReturnType = new GenericType<AppCategoryResponse>() {};
    return apiClient.invokeAPI("AppCategoriesApi.appCategoriesGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppCategories the fields to include for returned resources of type appCategories (optional)
   * @return AppCategoryWithoutIncludesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppCategory with get </td><td>  -  </td></tr>
     </table>
   */
  public AppCategoryWithoutIncludesResponse appCategoriesParentGetToOneRelated(String id, List<String> fieldsAppCategories) throws ApiException {
    return appCategoriesParentGetToOneRelatedWithHttpInfo(id, fieldsAppCategories).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppCategories the fields to include for returned resources of type appCategories (optional)
   * @return ApiResponse&lt;AppCategoryWithoutIncludesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppCategory with get </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppCategoryWithoutIncludesResponse> appCategoriesParentGetToOneRelatedWithHttpInfo(String id, List<String> fieldsAppCategories) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appCategoriesParentGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/appCategories/{id}/parent"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appCategories]", fieldsAppCategories)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppCategoryWithoutIncludesResponse> localVarReturnType = new GenericType<AppCategoryWithoutIncludesResponse>() {};
    return apiClient.invokeAPI("AppCategoriesApi.appCategoriesParentGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppCategories the fields to include for returned resources of type appCategories (optional)
   * @param limit maximum resources per page (optional)
   * @return AppCategoriesWithoutIncludesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppCategories with get </td><td>  -  </td></tr>
     </table>
   */
  public AppCategoriesWithoutIncludesResponse appCategoriesSubcategoriesGetToManyRelated(String id, List<String> fieldsAppCategories, Integer limit) throws ApiException {
    return appCategoriesSubcategoriesGetToManyRelatedWithHttpInfo(id, fieldsAppCategories, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppCategories the fields to include for returned resources of type appCategories (optional)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;AppCategoriesWithoutIncludesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppCategories with get </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppCategoriesWithoutIncludesResponse> appCategoriesSubcategoriesGetToManyRelatedWithHttpInfo(String id, List<String> fieldsAppCategories, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appCategoriesSubcategoriesGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/appCategories/{id}/subcategories"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appCategories]", fieldsAppCategories)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppCategoriesWithoutIncludesResponse> localVarReturnType = new GenericType<AppCategoriesWithoutIncludesResponse>() {};
    return apiClient.invokeAPI("AppCategoriesApi.appCategoriesSubcategoriesGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
