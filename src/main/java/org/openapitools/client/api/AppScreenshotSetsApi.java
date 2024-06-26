package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.AppScreenshotSetAppScreenshotsLinkagesRequest;
import org.openapitools.client.model.AppScreenshotSetAppScreenshotsLinkagesResponse;
import org.openapitools.client.model.AppScreenshotSetCreateRequest;
import org.openapitools.client.model.AppScreenshotSetResponse;
import org.openapitools.client.model.AppScreenshotsResponse;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppScreenshotSetsApi {
  private ApiClient apiClient;

  public AppScreenshotSetsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AppScreenshotSetsApi(ApiClient apiClient) {
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
   * @param fieldsAppScreenshotSets the fields to include for returned resources of type appScreenshotSets (optional)
   * @param fieldsAppScreenshots the fields to include for returned resources of type appScreenshots (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AppScreenshotsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppScreenshots </td><td>  -  </td></tr>
     </table>
   */
  public AppScreenshotsResponse appScreenshotSetsAppScreenshotsGetToManyRelated(String id, List<String> fieldsAppScreenshotSets, List<String> fieldsAppScreenshots, Integer limit, List<String> include) throws ApiException {
    return appScreenshotSetsAppScreenshotsGetToManyRelatedWithHttpInfo(id, fieldsAppScreenshotSets, fieldsAppScreenshots, limit, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppScreenshotSets the fields to include for returned resources of type appScreenshotSets (optional)
   * @param fieldsAppScreenshots the fields to include for returned resources of type appScreenshots (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AppScreenshotsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppScreenshots </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppScreenshotsResponse> appScreenshotSetsAppScreenshotsGetToManyRelatedWithHttpInfo(String id, List<String> fieldsAppScreenshotSets, List<String> fieldsAppScreenshots, Integer limit, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appScreenshotSetsAppScreenshotsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/appScreenshotSets/{id}/appScreenshots"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appScreenshotSets]", fieldsAppScreenshotSets)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appScreenshots]", fieldsAppScreenshots));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppScreenshotsResponse> localVarReturnType = new GenericType<AppScreenshotsResponse>() {};
    return apiClient.invokeAPI("AppScreenshotSetsApi.appScreenshotSetsAppScreenshotsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param limit maximum resources per page (optional)
   * @return AppScreenshotSetAppScreenshotsLinkagesResponse
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
  public AppScreenshotSetAppScreenshotsLinkagesResponse appScreenshotSetsAppScreenshotsGetToManyRelationship(String id, Integer limit) throws ApiException {
    return appScreenshotSetsAppScreenshotsGetToManyRelationshipWithHttpInfo(id, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;AppScreenshotSetAppScreenshotsLinkagesResponse&gt;
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
  public ApiResponse<AppScreenshotSetAppScreenshotsLinkagesResponse> appScreenshotSetsAppScreenshotsGetToManyRelationshipWithHttpInfo(String id, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appScreenshotSetsAppScreenshotsGetToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/appScreenshotSets/{id}/relationships/appScreenshots"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "limit", limit)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppScreenshotSetAppScreenshotsLinkagesResponse> localVarReturnType = new GenericType<AppScreenshotSetAppScreenshotsLinkagesResponse>() {};
    return apiClient.invokeAPI("AppScreenshotSetsApi.appScreenshotSetsAppScreenshotsGetToManyRelationship", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appScreenshotSetAppScreenshotsLinkagesRequest List of related linkages (required)
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
  public void appScreenshotSetsAppScreenshotsReplaceToManyRelationship(String id, AppScreenshotSetAppScreenshotsLinkagesRequest appScreenshotSetAppScreenshotsLinkagesRequest) throws ApiException {
    appScreenshotSetsAppScreenshotsReplaceToManyRelationshipWithHttpInfo(id, appScreenshotSetAppScreenshotsLinkagesRequest);
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appScreenshotSetAppScreenshotsLinkagesRequest List of related linkages (required)
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
  public ApiResponse<Void> appScreenshotSetsAppScreenshotsReplaceToManyRelationshipWithHttpInfo(String id, AppScreenshotSetAppScreenshotsLinkagesRequest appScreenshotSetAppScreenshotsLinkagesRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appScreenshotSetsAppScreenshotsReplaceToManyRelationship");
    }
    if (appScreenshotSetAppScreenshotsLinkagesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appScreenshotSetAppScreenshotsLinkagesRequest' when calling appScreenshotSetsAppScreenshotsReplaceToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/appScreenshotSets/{id}/relationships/appScreenshots"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("AppScreenshotSetsApi.appScreenshotSetsAppScreenshotsReplaceToManyRelationship", localVarPath, "PATCH", new ArrayList<>(), appScreenshotSetAppScreenshotsLinkagesRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param appScreenshotSetCreateRequest AppScreenshotSet representation (required)
   * @return AppScreenshotSetResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AppScreenshotSet </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public AppScreenshotSetResponse appScreenshotSetsCreateInstance(AppScreenshotSetCreateRequest appScreenshotSetCreateRequest) throws ApiException {
    return appScreenshotSetsCreateInstanceWithHttpInfo(appScreenshotSetCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param appScreenshotSetCreateRequest AppScreenshotSet representation (required)
   * @return ApiResponse&lt;AppScreenshotSetResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AppScreenshotSet </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppScreenshotSetResponse> appScreenshotSetsCreateInstanceWithHttpInfo(AppScreenshotSetCreateRequest appScreenshotSetCreateRequest) throws ApiException {
    // Check required parameters
    if (appScreenshotSetCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appScreenshotSetCreateRequest' when calling appScreenshotSetsCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppScreenshotSetResponse> localVarReturnType = new GenericType<AppScreenshotSetResponse>() {};
    return apiClient.invokeAPI("AppScreenshotSetsApi.appScreenshotSetsCreateInstance", "/v1/appScreenshotSets", "POST", new ArrayList<>(), appScreenshotSetCreateRequest,
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
  public void appScreenshotSetsDeleteInstance(String id) throws ApiException {
    appScreenshotSetsDeleteInstanceWithHttpInfo(id);
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
  public ApiResponse<Void> appScreenshotSetsDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appScreenshotSetsDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appScreenshotSets/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("AppScreenshotSetsApi.appScreenshotSetsDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppScreenshotSets the fields to include for returned resources of type appScreenshotSets (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsAppScreenshots the fields to include for returned resources of type appScreenshots (optional)
   * @param limitAppScreenshots maximum number of related appScreenshots returned (when they are included) (optional)
   * @return AppScreenshotSetResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppScreenshotSet </td><td>  -  </td></tr>
     </table>
   */
  public AppScreenshotSetResponse appScreenshotSetsGetInstance(String id, List<String> fieldsAppScreenshotSets, List<String> include, List<String> fieldsAppScreenshots, Integer limitAppScreenshots) throws ApiException {
    return appScreenshotSetsGetInstanceWithHttpInfo(id, fieldsAppScreenshotSets, include, fieldsAppScreenshots, limitAppScreenshots).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppScreenshotSets the fields to include for returned resources of type appScreenshotSets (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsAppScreenshots the fields to include for returned resources of type appScreenshots (optional)
   * @param limitAppScreenshots maximum number of related appScreenshots returned (when they are included) (optional)
   * @return ApiResponse&lt;AppScreenshotSetResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppScreenshotSet </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppScreenshotSetResponse> appScreenshotSetsGetInstanceWithHttpInfo(String id, List<String> fieldsAppScreenshotSets, List<String> include, List<String> fieldsAppScreenshots, Integer limitAppScreenshots) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appScreenshotSetsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appScreenshotSets/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appScreenshotSets]", fieldsAppScreenshotSets)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appScreenshots]", fieldsAppScreenshots));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appScreenshots]", limitAppScreenshots));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppScreenshotSetResponse> localVarReturnType = new GenericType<AppScreenshotSetResponse>() {};
    return apiClient.invokeAPI("AppScreenshotSetsApi.appScreenshotSetsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
