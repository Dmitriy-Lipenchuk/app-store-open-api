package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.ScmGitReferencesResponse;
import org.openapitools.client.model.ScmPullRequestsResponse;
import org.openapitools.client.model.ScmRepositoriesResponse;
import org.openapitools.client.model.ScmRepositoryResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class ScmRepositoriesApi {
  private ApiClient apiClient;

  public ScmRepositoriesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ScmRepositoriesApi(ApiClient apiClient) {
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
   * @param filterId filter by id(s) (optional)
   * @param fieldsScmRepositories the fields to include for returned resources of type scmRepositories (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsScmGitReferences the fields to include for returned resources of type scmGitReferences (optional)
   * @param fieldsScmPullRequests the fields to include for returned resources of type scmPullRequests (optional)
   * @return ScmRepositoriesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of ScmRepositories </td><td>  -  </td></tr>
     </table>
   */
  public ScmRepositoriesResponse scmRepositoriesGetCollection(List<String> filterId, List<String> fieldsScmRepositories, Integer limit, List<String> include, List<String> fieldsScmGitReferences, List<String> fieldsScmPullRequests) throws ApiException {
    return scmRepositoriesGetCollectionWithHttpInfo(filterId, fieldsScmRepositories, limit, include, fieldsScmGitReferences, fieldsScmPullRequests).getData();
  }

  /**
   * 
   * 
   * @param filterId filter by id(s) (optional)
   * @param fieldsScmRepositories the fields to include for returned resources of type scmRepositories (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsScmGitReferences the fields to include for returned resources of type scmGitReferences (optional)
   * @param fieldsScmPullRequests the fields to include for returned resources of type scmPullRequests (optional)
   * @return ApiResponse&lt;ScmRepositoriesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of ScmRepositories </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ScmRepositoriesResponse> scmRepositoriesGetCollectionWithHttpInfo(List<String> filterId, List<String> fieldsScmRepositories, Integer limit, List<String> include, List<String> fieldsScmGitReferences, List<String> fieldsScmPullRequests) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[id]", filterId)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[scmRepositories]", fieldsScmRepositories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[scmGitReferences]", fieldsScmGitReferences));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[scmPullRequests]", fieldsScmPullRequests));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<ScmRepositoriesResponse> localVarReturnType = new GenericType<ScmRepositoriesResponse>() {};
    return apiClient.invokeAPI("ScmRepositoriesApi.scmRepositoriesGetCollection", "/v1/scmRepositories", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsScmRepositories the fields to include for returned resources of type scmRepositories (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsScmGitReferences the fields to include for returned resources of type scmGitReferences (optional)
   * @param fieldsScmPullRequests the fields to include for returned resources of type scmPullRequests (optional)
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
  public ScmRepositoryResponse scmRepositoriesGetInstance(String id, List<String> fieldsScmRepositories, List<String> include, List<String> fieldsScmGitReferences, List<String> fieldsScmPullRequests) throws ApiException {
    return scmRepositoriesGetInstanceWithHttpInfo(id, fieldsScmRepositories, include, fieldsScmGitReferences, fieldsScmPullRequests).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsScmRepositories the fields to include for returned resources of type scmRepositories (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsScmGitReferences the fields to include for returned resources of type scmGitReferences (optional)
   * @param fieldsScmPullRequests the fields to include for returned resources of type scmPullRequests (optional)
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
  public ApiResponse<ScmRepositoryResponse> scmRepositoriesGetInstanceWithHttpInfo(String id, List<String> fieldsScmRepositories, List<String> include, List<String> fieldsScmGitReferences, List<String> fieldsScmPullRequests) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling scmRepositoriesGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/scmRepositories/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[scmRepositories]", fieldsScmRepositories)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[scmGitReferences]", fieldsScmGitReferences));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[scmPullRequests]", fieldsScmPullRequests));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<ScmRepositoryResponse> localVarReturnType = new GenericType<ScmRepositoryResponse>() {};
    return apiClient.invokeAPI("ScmRepositoriesApi.scmRepositoriesGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsScmGitReferences the fields to include for returned resources of type scmGitReferences (optional)
   * @param fieldsScmRepositories the fields to include for returned resources of type scmRepositories (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ScmGitReferencesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of ScmGitReferences </td><td>  -  </td></tr>
     </table>
   */
  public ScmGitReferencesResponse scmRepositoriesGitReferencesGetToManyRelated(String id, List<String> fieldsScmGitReferences, List<String> fieldsScmRepositories, Integer limit, List<String> include) throws ApiException {
    return scmRepositoriesGitReferencesGetToManyRelatedWithHttpInfo(id, fieldsScmGitReferences, fieldsScmRepositories, limit, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsScmGitReferences the fields to include for returned resources of type scmGitReferences (optional)
   * @param fieldsScmRepositories the fields to include for returned resources of type scmRepositories (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;ScmGitReferencesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of ScmGitReferences </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ScmGitReferencesResponse> scmRepositoriesGitReferencesGetToManyRelatedWithHttpInfo(String id, List<String> fieldsScmGitReferences, List<String> fieldsScmRepositories, Integer limit, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling scmRepositoriesGitReferencesGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/scmRepositories/{id}/gitReferences"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[scmGitReferences]", fieldsScmGitReferences)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[scmRepositories]", fieldsScmRepositories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<ScmGitReferencesResponse> localVarReturnType = new GenericType<ScmGitReferencesResponse>() {};
    return apiClient.invokeAPI("ScmRepositoriesApi.scmRepositoriesGitReferencesGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsScmPullRequests the fields to include for returned resources of type scmPullRequests (optional)
   * @param fieldsScmRepositories the fields to include for returned resources of type scmRepositories (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ScmPullRequestsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of ScmPullRequests </td><td>  -  </td></tr>
     </table>
   */
  public ScmPullRequestsResponse scmRepositoriesPullRequestsGetToManyRelated(String id, List<String> fieldsScmPullRequests, List<String> fieldsScmRepositories, Integer limit, List<String> include) throws ApiException {
    return scmRepositoriesPullRequestsGetToManyRelatedWithHttpInfo(id, fieldsScmPullRequests, fieldsScmRepositories, limit, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsScmPullRequests the fields to include for returned resources of type scmPullRequests (optional)
   * @param fieldsScmRepositories the fields to include for returned resources of type scmRepositories (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;ScmPullRequestsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of ScmPullRequests </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ScmPullRequestsResponse> scmRepositoriesPullRequestsGetToManyRelatedWithHttpInfo(String id, List<String> fieldsScmPullRequests, List<String> fieldsScmRepositories, Integer limit, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling scmRepositoriesPullRequestsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/scmRepositories/{id}/pullRequests"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[scmPullRequests]", fieldsScmPullRequests)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[scmRepositories]", fieldsScmRepositories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<ScmPullRequestsResponse> localVarReturnType = new GenericType<ScmPullRequestsResponse>() {};
    return apiClient.invokeAPI("ScmRepositoriesApi.scmRepositoriesPullRequestsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
