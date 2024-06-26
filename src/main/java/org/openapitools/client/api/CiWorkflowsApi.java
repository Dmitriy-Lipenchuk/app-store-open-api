package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.CiBuildRunsResponse;
import org.openapitools.client.model.CiWorkflowCreateRequest;
import org.openapitools.client.model.CiWorkflowResponse;
import org.openapitools.client.model.CiWorkflowUpdateRequest;
import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.ScmRepositoryResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class CiWorkflowsApi {
  private ApiClient apiClient;

  public CiWorkflowsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CiWorkflowsApi(ApiClient apiClient) {
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
   * @param filterBuilds filter by id(s) of related &#39;builds&#39; (optional)
   * @param sort comma-separated list of sort expressions; resources will be sorted as specified (optional)
   * @param fieldsScmGitReferences the fields to include for returned resources of type scmGitReferences (optional)
   * @param fieldsCiBuildRuns the fields to include for returned resources of type ciBuildRuns (optional)
   * @param fieldsCiWorkflows the fields to include for returned resources of type ciWorkflows (optional)
   * @param fieldsScmPullRequests the fields to include for returned resources of type scmPullRequests (optional)
   * @param fieldsCiProducts the fields to include for returned resources of type ciProducts (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @param limit maximum resources per page (optional)
   * @param limitBuilds maximum number of related builds returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return CiBuildRunsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of CiBuildRuns </td><td>  -  </td></tr>
     </table>
   */
  public CiBuildRunsResponse ciWorkflowsBuildRunsGetToManyRelated(String id, List<String> filterBuilds, List<String> sort, List<String> fieldsScmGitReferences, List<String> fieldsCiBuildRuns, List<String> fieldsCiWorkflows, List<String> fieldsScmPullRequests, List<String> fieldsCiProducts, List<String> fieldsBuilds, Integer limit, Integer limitBuilds, List<String> include) throws ApiException {
    return ciWorkflowsBuildRunsGetToManyRelatedWithHttpInfo(id, filterBuilds, sort, fieldsScmGitReferences, fieldsCiBuildRuns, fieldsCiWorkflows, fieldsScmPullRequests, fieldsCiProducts, fieldsBuilds, limit, limitBuilds, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterBuilds filter by id(s) of related &#39;builds&#39; (optional)
   * @param sort comma-separated list of sort expressions; resources will be sorted as specified (optional)
   * @param fieldsScmGitReferences the fields to include for returned resources of type scmGitReferences (optional)
   * @param fieldsCiBuildRuns the fields to include for returned resources of type ciBuildRuns (optional)
   * @param fieldsCiWorkflows the fields to include for returned resources of type ciWorkflows (optional)
   * @param fieldsScmPullRequests the fields to include for returned resources of type scmPullRequests (optional)
   * @param fieldsCiProducts the fields to include for returned resources of type ciProducts (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @param limit maximum resources per page (optional)
   * @param limitBuilds maximum number of related builds returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;CiBuildRunsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of CiBuildRuns </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CiBuildRunsResponse> ciWorkflowsBuildRunsGetToManyRelatedWithHttpInfo(String id, List<String> filterBuilds, List<String> sort, List<String> fieldsScmGitReferences, List<String> fieldsCiBuildRuns, List<String> fieldsCiWorkflows, List<String> fieldsScmPullRequests, List<String> fieldsCiProducts, List<String> fieldsBuilds, Integer limit, Integer limitBuilds, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling ciWorkflowsBuildRunsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/ciWorkflows/{id}/buildRuns"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[builds]", filterBuilds)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[scmGitReferences]", fieldsScmGitReferences));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[ciBuildRuns]", fieldsCiBuildRuns));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[ciWorkflows]", fieldsCiWorkflows));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[scmPullRequests]", fieldsScmPullRequests));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[ciProducts]", fieldsCiProducts));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[builds]", fieldsBuilds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[builds]", limitBuilds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<CiBuildRunsResponse> localVarReturnType = new GenericType<CiBuildRunsResponse>() {};
    return apiClient.invokeAPI("CiWorkflowsApi.ciWorkflowsBuildRunsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param ciWorkflowCreateRequest CiWorkflow representation (required)
   * @return CiWorkflowResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single CiWorkflow </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public CiWorkflowResponse ciWorkflowsCreateInstance(CiWorkflowCreateRequest ciWorkflowCreateRequest) throws ApiException {
    return ciWorkflowsCreateInstanceWithHttpInfo(ciWorkflowCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param ciWorkflowCreateRequest CiWorkflow representation (required)
   * @return ApiResponse&lt;CiWorkflowResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single CiWorkflow </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CiWorkflowResponse> ciWorkflowsCreateInstanceWithHttpInfo(CiWorkflowCreateRequest ciWorkflowCreateRequest) throws ApiException {
    // Check required parameters
    if (ciWorkflowCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'ciWorkflowCreateRequest' when calling ciWorkflowsCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<CiWorkflowResponse> localVarReturnType = new GenericType<CiWorkflowResponse>() {};
    return apiClient.invokeAPI("CiWorkflowsApi.ciWorkflowsCreateInstance", "/v1/ciWorkflows", "POST", new ArrayList<>(), ciWorkflowCreateRequest,
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
  public void ciWorkflowsDeleteInstance(String id) throws ApiException {
    ciWorkflowsDeleteInstanceWithHttpInfo(id);
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
  public ApiResponse<Void> ciWorkflowsDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling ciWorkflowsDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/ciWorkflows/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("CiWorkflowsApi.ciWorkflowsDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsCiWorkflows the fields to include for returned resources of type ciWorkflows (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsCiBuildRuns the fields to include for returned resources of type ciBuildRuns (optional)
   * @param fieldsScmRepositories the fields to include for returned resources of type scmRepositories (optional)
   * @return CiWorkflowResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single CiWorkflow </td><td>  -  </td></tr>
     </table>
   */
  public CiWorkflowResponse ciWorkflowsGetInstance(String id, List<String> fieldsCiWorkflows, List<String> include, List<String> fieldsCiBuildRuns, List<String> fieldsScmRepositories) throws ApiException {
    return ciWorkflowsGetInstanceWithHttpInfo(id, fieldsCiWorkflows, include, fieldsCiBuildRuns, fieldsScmRepositories).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsCiWorkflows the fields to include for returned resources of type ciWorkflows (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsCiBuildRuns the fields to include for returned resources of type ciBuildRuns (optional)
   * @param fieldsScmRepositories the fields to include for returned resources of type scmRepositories (optional)
   * @return ApiResponse&lt;CiWorkflowResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single CiWorkflow </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CiWorkflowResponse> ciWorkflowsGetInstanceWithHttpInfo(String id, List<String> fieldsCiWorkflows, List<String> include, List<String> fieldsCiBuildRuns, List<String> fieldsScmRepositories) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling ciWorkflowsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/ciWorkflows/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[ciWorkflows]", fieldsCiWorkflows)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[ciBuildRuns]", fieldsCiBuildRuns));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[scmRepositories]", fieldsScmRepositories));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<CiWorkflowResponse> localVarReturnType = new GenericType<CiWorkflowResponse>() {};
    return apiClient.invokeAPI("CiWorkflowsApi.ciWorkflowsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsScmGitReferences the fields to include for returned resources of type scmGitReferences (optional)
   * @param fieldsScmProviders the fields to include for returned resources of type scmProviders (optional)
   * @param fieldsScmRepositories the fields to include for returned resources of type scmRepositories (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ScmRepositoryResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single ScmRepository </td><td>  -  </td></tr>
     </table>
   */
  public ScmRepositoryResponse ciWorkflowsRepositoryGetToOneRelated(String id, List<String> fieldsScmGitReferences, List<String> fieldsScmProviders, List<String> fieldsScmRepositories, List<String> include) throws ApiException {
    return ciWorkflowsRepositoryGetToOneRelatedWithHttpInfo(id, fieldsScmGitReferences, fieldsScmProviders, fieldsScmRepositories, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsScmGitReferences the fields to include for returned resources of type scmGitReferences (optional)
   * @param fieldsScmProviders the fields to include for returned resources of type scmProviders (optional)
   * @param fieldsScmRepositories the fields to include for returned resources of type scmRepositories (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;ScmRepositoryResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single ScmRepository </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ScmRepositoryResponse> ciWorkflowsRepositoryGetToOneRelatedWithHttpInfo(String id, List<String> fieldsScmGitReferences, List<String> fieldsScmProviders, List<String> fieldsScmRepositories, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling ciWorkflowsRepositoryGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/ciWorkflows/{id}/repository"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[scmGitReferences]", fieldsScmGitReferences)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[scmProviders]", fieldsScmProviders));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[scmRepositories]", fieldsScmRepositories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<ScmRepositoryResponse> localVarReturnType = new GenericType<ScmRepositoryResponse>() {};
    return apiClient.invokeAPI("CiWorkflowsApi.ciWorkflowsRepositoryGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param ciWorkflowUpdateRequest CiWorkflow representation (required)
   * @return CiWorkflowResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single CiWorkflow </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public CiWorkflowResponse ciWorkflowsUpdateInstance(String id, CiWorkflowUpdateRequest ciWorkflowUpdateRequest) throws ApiException {
    return ciWorkflowsUpdateInstanceWithHttpInfo(id, ciWorkflowUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param ciWorkflowUpdateRequest CiWorkflow representation (required)
   * @return ApiResponse&lt;CiWorkflowResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single CiWorkflow </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CiWorkflowResponse> ciWorkflowsUpdateInstanceWithHttpInfo(String id, CiWorkflowUpdateRequest ciWorkflowUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling ciWorkflowsUpdateInstance");
    }
    if (ciWorkflowUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'ciWorkflowUpdateRequest' when calling ciWorkflowsUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/ciWorkflows/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<CiWorkflowResponse> localVarReturnType = new GenericType<CiWorkflowResponse>() {};
    return apiClient.invokeAPI("CiWorkflowsApi.ciWorkflowsUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), ciWorkflowUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
