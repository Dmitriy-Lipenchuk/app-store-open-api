package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.AppCustomProductPageCreateRequest;
import org.openapitools.client.model.AppCustomProductPageResponse;
import org.openapitools.client.model.AppCustomProductPageUpdateRequest;
import org.openapitools.client.model.AppCustomProductPageVersionsResponse;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppCustomProductPagesApi {
  private ApiClient apiClient;

  public AppCustomProductPagesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AppCustomProductPagesApi(ApiClient apiClient) {
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
   * @param filterState filter by attribute &#39;state&#39; (optional)
   * @param fieldsAppCustomProductPageLocalizations the fields to include for returned resources of type appCustomProductPageLocalizations (optional)
   * @param fieldsAppCustomProductPageVersions the fields to include for returned resources of type appCustomProductPageVersions (optional)
   * @param fieldsAppCustomProductPages the fields to include for returned resources of type appCustomProductPages (optional)
   * @param limit maximum resources per page (optional)
   * @param limitAppCustomProductPageLocalizations maximum number of related appCustomProductPageLocalizations returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AppCustomProductPageVersionsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppCustomProductPageVersions </td><td>  -  </td></tr>
     </table>
   */
  public AppCustomProductPageVersionsResponse appCustomProductPagesAppCustomProductPageVersionsGetToManyRelated(String id, List<String> filterState, List<String> fieldsAppCustomProductPageLocalizations, List<String> fieldsAppCustomProductPageVersions, List<String> fieldsAppCustomProductPages, Integer limit, Integer limitAppCustomProductPageLocalizations, List<String> include) throws ApiException {
    return appCustomProductPagesAppCustomProductPageVersionsGetToManyRelatedWithHttpInfo(id, filterState, fieldsAppCustomProductPageLocalizations, fieldsAppCustomProductPageVersions, fieldsAppCustomProductPages, limit, limitAppCustomProductPageLocalizations, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterState filter by attribute &#39;state&#39; (optional)
   * @param fieldsAppCustomProductPageLocalizations the fields to include for returned resources of type appCustomProductPageLocalizations (optional)
   * @param fieldsAppCustomProductPageVersions the fields to include for returned resources of type appCustomProductPageVersions (optional)
   * @param fieldsAppCustomProductPages the fields to include for returned resources of type appCustomProductPages (optional)
   * @param limit maximum resources per page (optional)
   * @param limitAppCustomProductPageLocalizations maximum number of related appCustomProductPageLocalizations returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AppCustomProductPageVersionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppCustomProductPageVersions </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppCustomProductPageVersionsResponse> appCustomProductPagesAppCustomProductPageVersionsGetToManyRelatedWithHttpInfo(String id, List<String> filterState, List<String> fieldsAppCustomProductPageLocalizations, List<String> fieldsAppCustomProductPageVersions, List<String> fieldsAppCustomProductPages, Integer limit, Integer limitAppCustomProductPageLocalizations, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appCustomProductPagesAppCustomProductPageVersionsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/appCustomProductPages/{id}/appCustomProductPageVersions"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[state]", filterState)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appCustomProductPageLocalizations]", fieldsAppCustomProductPageLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appCustomProductPageVersions]", fieldsAppCustomProductPageVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appCustomProductPages]", fieldsAppCustomProductPages));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appCustomProductPageLocalizations]", limitAppCustomProductPageLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppCustomProductPageVersionsResponse> localVarReturnType = new GenericType<AppCustomProductPageVersionsResponse>() {};
    return apiClient.invokeAPI("AppCustomProductPagesApi.appCustomProductPagesAppCustomProductPageVersionsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param appCustomProductPageCreateRequest AppCustomProductPage representation (required)
   * @return AppCustomProductPageResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AppCustomProductPage </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public AppCustomProductPageResponse appCustomProductPagesCreateInstance(AppCustomProductPageCreateRequest appCustomProductPageCreateRequest) throws ApiException {
    return appCustomProductPagesCreateInstanceWithHttpInfo(appCustomProductPageCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param appCustomProductPageCreateRequest AppCustomProductPage representation (required)
   * @return ApiResponse&lt;AppCustomProductPageResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AppCustomProductPage </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppCustomProductPageResponse> appCustomProductPagesCreateInstanceWithHttpInfo(AppCustomProductPageCreateRequest appCustomProductPageCreateRequest) throws ApiException {
    // Check required parameters
    if (appCustomProductPageCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appCustomProductPageCreateRequest' when calling appCustomProductPagesCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppCustomProductPageResponse> localVarReturnType = new GenericType<AppCustomProductPageResponse>() {};
    return apiClient.invokeAPI("AppCustomProductPagesApi.appCustomProductPagesCreateInstance", "/v1/appCustomProductPages", "POST", new ArrayList<>(), appCustomProductPageCreateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success (no content) </td><td>  -  </td></tr>
     </table>
   */
  public void appCustomProductPagesDeleteInstance(String id) throws ApiException {
    appCustomProductPagesDeleteInstanceWithHttpInfo(id);
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success (no content) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> appCustomProductPagesDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appCustomProductPagesDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appCustomProductPages/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("AppCustomProductPagesApi.appCustomProductPagesDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppCustomProductPages the fields to include for returned resources of type appCustomProductPages (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsAppCustomProductPageVersions the fields to include for returned resources of type appCustomProductPageVersions (optional)
   * @param limitAppCustomProductPageVersions maximum number of related appCustomProductPageVersions returned (when they are included) (optional)
   * @return AppCustomProductPageResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppCustomProductPage </td><td>  -  </td></tr>
     </table>
   */
  public AppCustomProductPageResponse appCustomProductPagesGetInstance(String id, List<String> fieldsAppCustomProductPages, List<String> include, List<String> fieldsAppCustomProductPageVersions, Integer limitAppCustomProductPageVersions) throws ApiException {
    return appCustomProductPagesGetInstanceWithHttpInfo(id, fieldsAppCustomProductPages, include, fieldsAppCustomProductPageVersions, limitAppCustomProductPageVersions).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppCustomProductPages the fields to include for returned resources of type appCustomProductPages (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsAppCustomProductPageVersions the fields to include for returned resources of type appCustomProductPageVersions (optional)
   * @param limitAppCustomProductPageVersions maximum number of related appCustomProductPageVersions returned (when they are included) (optional)
   * @return ApiResponse&lt;AppCustomProductPageResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppCustomProductPage </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppCustomProductPageResponse> appCustomProductPagesGetInstanceWithHttpInfo(String id, List<String> fieldsAppCustomProductPages, List<String> include, List<String> fieldsAppCustomProductPageVersions, Integer limitAppCustomProductPageVersions) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appCustomProductPagesGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appCustomProductPages/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appCustomProductPages]", fieldsAppCustomProductPages)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appCustomProductPageVersions]", fieldsAppCustomProductPageVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appCustomProductPageVersions]", limitAppCustomProductPageVersions));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppCustomProductPageResponse> localVarReturnType = new GenericType<AppCustomProductPageResponse>() {};
    return apiClient.invokeAPI("AppCustomProductPagesApi.appCustomProductPagesGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appCustomProductPageUpdateRequest AppCustomProductPage representation (required)
   * @return AppCustomProductPageResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppCustomProductPage </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public AppCustomProductPageResponse appCustomProductPagesUpdateInstance(String id, AppCustomProductPageUpdateRequest appCustomProductPageUpdateRequest) throws ApiException {
    return appCustomProductPagesUpdateInstanceWithHttpInfo(id, appCustomProductPageUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appCustomProductPageUpdateRequest AppCustomProductPage representation (required)
   * @return ApiResponse&lt;AppCustomProductPageResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppCustomProductPage </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppCustomProductPageResponse> appCustomProductPagesUpdateInstanceWithHttpInfo(String id, AppCustomProductPageUpdateRequest appCustomProductPageUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appCustomProductPagesUpdateInstance");
    }
    if (appCustomProductPageUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appCustomProductPageUpdateRequest' when calling appCustomProductPagesUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appCustomProductPages/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppCustomProductPageResponse> localVarReturnType = new GenericType<AppCustomProductPageResponse>() {};
    return apiClient.invokeAPI("AppCustomProductPagesApi.appCustomProductPagesUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), appCustomProductPageUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
