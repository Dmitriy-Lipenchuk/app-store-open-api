package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.AppPreviewSetAppPreviewsLinkagesRequest;
import org.openapitools.client.model.AppPreviewSetAppPreviewsLinkagesResponse;
import org.openapitools.client.model.AppPreviewSetCreateRequest;
import org.openapitools.client.model.AppPreviewSetResponse;
import org.openapitools.client.model.AppPreviewsResponse;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppPreviewSetsApi {
  private ApiClient apiClient;

  public AppPreviewSetsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AppPreviewSetsApi(ApiClient apiClient) {
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
   * @param fieldsAppPreviews the fields to include for returned resources of type appPreviews (optional)
   * @param fieldsAppPreviewSets the fields to include for returned resources of type appPreviewSets (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AppPreviewsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppPreviews </td><td>  -  </td></tr>
     </table>
   */
  public AppPreviewsResponse appPreviewSetsAppPreviewsGetToManyRelated(String id, List<String> fieldsAppPreviews, List<String> fieldsAppPreviewSets, Integer limit, List<String> include) throws ApiException {
    return appPreviewSetsAppPreviewsGetToManyRelatedWithHttpInfo(id, fieldsAppPreviews, fieldsAppPreviewSets, limit, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppPreviews the fields to include for returned resources of type appPreviews (optional)
   * @param fieldsAppPreviewSets the fields to include for returned resources of type appPreviewSets (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AppPreviewsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppPreviews </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppPreviewsResponse> appPreviewSetsAppPreviewsGetToManyRelatedWithHttpInfo(String id, List<String> fieldsAppPreviews, List<String> fieldsAppPreviewSets, Integer limit, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appPreviewSetsAppPreviewsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/appPreviewSets/{id}/appPreviews"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appPreviews]", fieldsAppPreviews)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appPreviewSets]", fieldsAppPreviewSets));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppPreviewsResponse> localVarReturnType = new GenericType<AppPreviewsResponse>() {};
    return apiClient.invokeAPI("AppPreviewSetsApi.appPreviewSetsAppPreviewsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param limit maximum resources per page (optional)
   * @return AppPreviewSetAppPreviewsLinkagesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of related linkages </td><td>  -  </td></tr>
     </table>
   */
  public AppPreviewSetAppPreviewsLinkagesResponse appPreviewSetsAppPreviewsGetToManyRelationship(String id, Integer limit) throws ApiException {
    return appPreviewSetsAppPreviewsGetToManyRelationshipWithHttpInfo(id, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;AppPreviewSetAppPreviewsLinkagesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of related linkages </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppPreviewSetAppPreviewsLinkagesResponse> appPreviewSetsAppPreviewsGetToManyRelationshipWithHttpInfo(String id, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appPreviewSetsAppPreviewsGetToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/appPreviewSets/{id}/relationships/appPreviews"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "limit", limit)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppPreviewSetAppPreviewsLinkagesResponse> localVarReturnType = new GenericType<AppPreviewSetAppPreviewsLinkagesResponse>() {};
    return apiClient.invokeAPI("AppPreviewSetsApi.appPreviewSetsAppPreviewsGetToManyRelationship", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appPreviewSetAppPreviewsLinkagesRequest List of related linkages (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success (no content) </td><td>  -  </td></tr>
     </table>
   */
  public void appPreviewSetsAppPreviewsReplaceToManyRelationship(String id, AppPreviewSetAppPreviewsLinkagesRequest appPreviewSetAppPreviewsLinkagesRequest) throws ApiException {
    appPreviewSetsAppPreviewsReplaceToManyRelationshipWithHttpInfo(id, appPreviewSetAppPreviewsLinkagesRequest);
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appPreviewSetAppPreviewsLinkagesRequest List of related linkages (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success (no content) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> appPreviewSetsAppPreviewsReplaceToManyRelationshipWithHttpInfo(String id, AppPreviewSetAppPreviewsLinkagesRequest appPreviewSetAppPreviewsLinkagesRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appPreviewSetsAppPreviewsReplaceToManyRelationship");
    }
    if (appPreviewSetAppPreviewsLinkagesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appPreviewSetAppPreviewsLinkagesRequest' when calling appPreviewSetsAppPreviewsReplaceToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/appPreviewSets/{id}/relationships/appPreviews"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("AppPreviewSetsApi.appPreviewSetsAppPreviewsReplaceToManyRelationship", localVarPath, "PATCH", new ArrayList<>(), appPreviewSetAppPreviewsLinkagesRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param appPreviewSetCreateRequest AppPreviewSet representation (required)
   * @return AppPreviewSetResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AppPreviewSet </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public AppPreviewSetResponse appPreviewSetsCreateInstance(AppPreviewSetCreateRequest appPreviewSetCreateRequest) throws ApiException {
    return appPreviewSetsCreateInstanceWithHttpInfo(appPreviewSetCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param appPreviewSetCreateRequest AppPreviewSet representation (required)
   * @return ApiResponse&lt;AppPreviewSetResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AppPreviewSet </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppPreviewSetResponse> appPreviewSetsCreateInstanceWithHttpInfo(AppPreviewSetCreateRequest appPreviewSetCreateRequest) throws ApiException {
    // Check required parameters
    if (appPreviewSetCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appPreviewSetCreateRequest' when calling appPreviewSetsCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppPreviewSetResponse> localVarReturnType = new GenericType<AppPreviewSetResponse>() {};
    return apiClient.invokeAPI("AppPreviewSetsApi.appPreviewSetsCreateInstance", "/v1/appPreviewSets", "POST", new ArrayList<>(), appPreviewSetCreateRequest,
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
  public void appPreviewSetsDeleteInstance(String id) throws ApiException {
    appPreviewSetsDeleteInstanceWithHttpInfo(id);
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
  public ApiResponse<Void> appPreviewSetsDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appPreviewSetsDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appPreviewSets/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("AppPreviewSetsApi.appPreviewSetsDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppPreviewSets the fields to include for returned resources of type appPreviewSets (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsAppPreviews the fields to include for returned resources of type appPreviews (optional)
   * @param limitAppPreviews maximum number of related appPreviews returned (when they are included) (optional)
   * @return AppPreviewSetResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppPreviewSet </td><td>  -  </td></tr>
     </table>
   */
  public AppPreviewSetResponse appPreviewSetsGetInstance(String id, List<String> fieldsAppPreviewSets, List<String> include, List<String> fieldsAppPreviews, Integer limitAppPreviews) throws ApiException {
    return appPreviewSetsGetInstanceWithHttpInfo(id, fieldsAppPreviewSets, include, fieldsAppPreviews, limitAppPreviews).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppPreviewSets the fields to include for returned resources of type appPreviewSets (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsAppPreviews the fields to include for returned resources of type appPreviews (optional)
   * @param limitAppPreviews maximum number of related appPreviews returned (when they are included) (optional)
   * @return ApiResponse&lt;AppPreviewSetResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppPreviewSet </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppPreviewSetResponse> appPreviewSetsGetInstanceWithHttpInfo(String id, List<String> fieldsAppPreviewSets, List<String> include, List<String> fieldsAppPreviews, Integer limitAppPreviews) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appPreviewSetsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appPreviewSets/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appPreviewSets]", fieldsAppPreviewSets)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appPreviews]", fieldsAppPreviews));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appPreviews]", limitAppPreviews));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppPreviewSetResponse> localVarReturnType = new GenericType<AppPreviewSetResponse>() {};
    return apiClient.invokeAPI("AppPreviewSetsApi.appPreviewSetsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
