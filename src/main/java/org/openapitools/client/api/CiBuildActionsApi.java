package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.CiArtifactsResponse;
import org.openapitools.client.model.CiBuildActionResponse;
import org.openapitools.client.model.CiBuildRunResponse;
import org.openapitools.client.model.CiIssuesResponse;
import org.openapitools.client.model.CiTestResultsResponse;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class CiBuildActionsApi {
  private ApiClient apiClient;

  public CiBuildActionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CiBuildActionsApi(ApiClient apiClient) {
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
   * @param fieldsCiArtifacts the fields to include for returned resources of type ciArtifacts (optional)
   * @param limit maximum resources per page (optional)
   * @return CiArtifactsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of CiArtifacts </td><td>  -  </td></tr>
     </table>
   */
  public CiArtifactsResponse ciBuildActionsArtifactsGetToManyRelated(String id, List<String> fieldsCiArtifacts, Integer limit) throws ApiException {
    return ciBuildActionsArtifactsGetToManyRelatedWithHttpInfo(id, fieldsCiArtifacts, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsCiArtifacts the fields to include for returned resources of type ciArtifacts (optional)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;CiArtifactsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of CiArtifacts </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CiArtifactsResponse> ciBuildActionsArtifactsGetToManyRelatedWithHttpInfo(String id, List<String> fieldsCiArtifacts, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling ciBuildActionsArtifactsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/ciBuildActions/{id}/artifacts"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[ciArtifacts]", fieldsCiArtifacts)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<CiArtifactsResponse> localVarReturnType = new GenericType<CiArtifactsResponse>() {};
    return apiClient.invokeAPI("CiBuildActionsApi.ciBuildActionsArtifactsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsScmGitReferences the fields to include for returned resources of type scmGitReferences (optional)
   * @param fieldsCiBuildRuns the fields to include for returned resources of type ciBuildRuns (optional)
   * @param fieldsCiWorkflows the fields to include for returned resources of type ciWorkflows (optional)
   * @param fieldsScmPullRequests the fields to include for returned resources of type scmPullRequests (optional)
   * @param fieldsCiProducts the fields to include for returned resources of type ciProducts (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @param limitBuilds maximum number of related builds returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return CiBuildRunResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single CiBuildRun </td><td>  -  </td></tr>
     </table>
   */
  public CiBuildRunResponse ciBuildActionsBuildRunGetToOneRelated(String id, List<String> fieldsScmGitReferences, List<String> fieldsCiBuildRuns, List<String> fieldsCiWorkflows, List<String> fieldsScmPullRequests, List<String> fieldsCiProducts, List<String> fieldsBuilds, Integer limitBuilds, List<String> include) throws ApiException {
    return ciBuildActionsBuildRunGetToOneRelatedWithHttpInfo(id, fieldsScmGitReferences, fieldsCiBuildRuns, fieldsCiWorkflows, fieldsScmPullRequests, fieldsCiProducts, fieldsBuilds, limitBuilds, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsScmGitReferences the fields to include for returned resources of type scmGitReferences (optional)
   * @param fieldsCiBuildRuns the fields to include for returned resources of type ciBuildRuns (optional)
   * @param fieldsCiWorkflows the fields to include for returned resources of type ciWorkflows (optional)
   * @param fieldsScmPullRequests the fields to include for returned resources of type scmPullRequests (optional)
   * @param fieldsCiProducts the fields to include for returned resources of type ciProducts (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @param limitBuilds maximum number of related builds returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;CiBuildRunResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single CiBuildRun </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CiBuildRunResponse> ciBuildActionsBuildRunGetToOneRelatedWithHttpInfo(String id, List<String> fieldsScmGitReferences, List<String> fieldsCiBuildRuns, List<String> fieldsCiWorkflows, List<String> fieldsScmPullRequests, List<String> fieldsCiProducts, List<String> fieldsBuilds, Integer limitBuilds, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling ciBuildActionsBuildRunGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/ciBuildActions/{id}/buildRun"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[scmGitReferences]", fieldsScmGitReferences)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[ciBuildRuns]", fieldsCiBuildRuns));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[ciWorkflows]", fieldsCiWorkflows));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[scmPullRequests]", fieldsScmPullRequests));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[ciProducts]", fieldsCiProducts));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[builds]", fieldsBuilds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[builds]", limitBuilds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<CiBuildRunResponse> localVarReturnType = new GenericType<CiBuildRunResponse>() {};
    return apiClient.invokeAPI("CiBuildActionsApi.ciBuildActionsBuildRunGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsCiBuildActions the fields to include for returned resources of type ciBuildActions (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsCiIssues the fields to include for returned resources of type ciIssues (optional)
   * @param fieldsCiBuildRuns the fields to include for returned resources of type ciBuildRuns (optional)
   * @param fieldsCiTestResults the fields to include for returned resources of type ciTestResults (optional)
   * @param fieldsCiArtifacts the fields to include for returned resources of type ciArtifacts (optional)
   * @return CiBuildActionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single CiBuildAction </td><td>  -  </td></tr>
     </table>
   */
  public CiBuildActionResponse ciBuildActionsGetInstance(String id, List<String> fieldsCiBuildActions, List<String> include, List<String> fieldsCiIssues, List<String> fieldsCiBuildRuns, List<String> fieldsCiTestResults, List<String> fieldsCiArtifacts) throws ApiException {
    return ciBuildActionsGetInstanceWithHttpInfo(id, fieldsCiBuildActions, include, fieldsCiIssues, fieldsCiBuildRuns, fieldsCiTestResults, fieldsCiArtifacts).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsCiBuildActions the fields to include for returned resources of type ciBuildActions (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsCiIssues the fields to include for returned resources of type ciIssues (optional)
   * @param fieldsCiBuildRuns the fields to include for returned resources of type ciBuildRuns (optional)
   * @param fieldsCiTestResults the fields to include for returned resources of type ciTestResults (optional)
   * @param fieldsCiArtifacts the fields to include for returned resources of type ciArtifacts (optional)
   * @return ApiResponse&lt;CiBuildActionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single CiBuildAction </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CiBuildActionResponse> ciBuildActionsGetInstanceWithHttpInfo(String id, List<String> fieldsCiBuildActions, List<String> include, List<String> fieldsCiIssues, List<String> fieldsCiBuildRuns, List<String> fieldsCiTestResults, List<String> fieldsCiArtifacts) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling ciBuildActionsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/ciBuildActions/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[ciBuildActions]", fieldsCiBuildActions)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[ciIssues]", fieldsCiIssues));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[ciBuildRuns]", fieldsCiBuildRuns));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[ciTestResults]", fieldsCiTestResults));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[ciArtifacts]", fieldsCiArtifacts));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<CiBuildActionResponse> localVarReturnType = new GenericType<CiBuildActionResponse>() {};
    return apiClient.invokeAPI("CiBuildActionsApi.ciBuildActionsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsCiIssues the fields to include for returned resources of type ciIssues (optional)
   * @param limit maximum resources per page (optional)
   * @return CiIssuesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of CiIssues </td><td>  -  </td></tr>
     </table>
   */
  public CiIssuesResponse ciBuildActionsIssuesGetToManyRelated(String id, List<String> fieldsCiIssues, Integer limit) throws ApiException {
    return ciBuildActionsIssuesGetToManyRelatedWithHttpInfo(id, fieldsCiIssues, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsCiIssues the fields to include for returned resources of type ciIssues (optional)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;CiIssuesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of CiIssues </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CiIssuesResponse> ciBuildActionsIssuesGetToManyRelatedWithHttpInfo(String id, List<String> fieldsCiIssues, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling ciBuildActionsIssuesGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/ciBuildActions/{id}/issues"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[ciIssues]", fieldsCiIssues)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<CiIssuesResponse> localVarReturnType = new GenericType<CiIssuesResponse>() {};
    return apiClient.invokeAPI("CiBuildActionsApi.ciBuildActionsIssuesGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsCiTestResults the fields to include for returned resources of type ciTestResults (optional)
   * @param limit maximum resources per page (optional)
   * @return CiTestResultsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of CiTestResults </td><td>  -  </td></tr>
     </table>
   */
  public CiTestResultsResponse ciBuildActionsTestResultsGetToManyRelated(String id, List<String> fieldsCiTestResults, Integer limit) throws ApiException {
    return ciBuildActionsTestResultsGetToManyRelatedWithHttpInfo(id, fieldsCiTestResults, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsCiTestResults the fields to include for returned resources of type ciTestResults (optional)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;CiTestResultsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of CiTestResults </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CiTestResultsResponse> ciBuildActionsTestResultsGetToManyRelatedWithHttpInfo(String id, List<String> fieldsCiTestResults, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling ciBuildActionsTestResultsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/ciBuildActions/{id}/testResults"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[ciTestResults]", fieldsCiTestResults)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<CiTestResultsResponse> localVarReturnType = new GenericType<CiTestResultsResponse>() {};
    return apiClient.invokeAPI("CiBuildActionsApi.ciBuildActionsTestResultsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
