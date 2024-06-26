package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.ScmProviderResponse;
import org.openapitools.client.model.ScmProvidersResponse;
import org.openapitools.client.model.ScmRepositoriesResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class ScmProvidersApi {
  private ApiClient apiClient;

  public ScmProvidersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ScmProvidersApi(ApiClient apiClient) {
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
   * @param fieldsScmProviders the fields to include for returned resources of type scmProviders (optional)
   * @param limit maximum resources per page (optional)
   * @param fieldsScmRepositories the fields to include for returned resources of type scmRepositories (optional)
   * @return ScmProvidersResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of ScmProviders </td><td>  -  </td></tr>
     </table>
   */
  public ScmProvidersResponse scmProvidersGetCollection(List<String> fieldsScmProviders, Integer limit, List<String> fieldsScmRepositories) throws ApiException {
    return scmProvidersGetCollectionWithHttpInfo(fieldsScmProviders, limit, fieldsScmRepositories).getData();
  }

  /**
   * 
   * 
   * @param fieldsScmProviders the fields to include for returned resources of type scmProviders (optional)
   * @param limit maximum resources per page (optional)
   * @param fieldsScmRepositories the fields to include for returned resources of type scmRepositories (optional)
   * @return ApiResponse&lt;ScmProvidersResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of ScmProviders </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ScmProvidersResponse> scmProvidersGetCollectionWithHttpInfo(List<String> fieldsScmProviders, Integer limit, List<String> fieldsScmRepositories) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[scmProviders]", fieldsScmProviders)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[scmRepositories]", fieldsScmRepositories));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<ScmProvidersResponse> localVarReturnType = new GenericType<ScmProvidersResponse>() {};
    return apiClient.invokeAPI("ScmProvidersApi.scmProvidersGetCollection", "/v1/scmProviders", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsScmProviders the fields to include for returned resources of type scmProviders (optional)
   * @param fieldsScmRepositories the fields to include for returned resources of type scmRepositories (optional)
   * @return ScmProviderResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single ScmProvider </td><td>  -  </td></tr>
     </table>
   */
  public ScmProviderResponse scmProvidersGetInstance(String id, List<String> fieldsScmProviders, List<String> fieldsScmRepositories) throws ApiException {
    return scmProvidersGetInstanceWithHttpInfo(id, fieldsScmProviders, fieldsScmRepositories).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsScmProviders the fields to include for returned resources of type scmProviders (optional)
   * @param fieldsScmRepositories the fields to include for returned resources of type scmRepositories (optional)
   * @return ApiResponse&lt;ScmProviderResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single ScmProvider </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ScmProviderResponse> scmProvidersGetInstanceWithHttpInfo(String id, List<String> fieldsScmProviders, List<String> fieldsScmRepositories) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling scmProvidersGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/scmProviders/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[scmProviders]", fieldsScmProviders)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[scmRepositories]", fieldsScmRepositories));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<ScmProviderResponse> localVarReturnType = new GenericType<ScmProviderResponse>() {};
    return apiClient.invokeAPI("ScmProvidersApi.scmProvidersGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterId filter by id(s) (optional)
   * @param fieldsScmGitReferences the fields to include for returned resources of type scmGitReferences (optional)
   * @param fieldsScmProviders the fields to include for returned resources of type scmProviders (optional)
   * @param fieldsScmRepositories the fields to include for returned resources of type scmRepositories (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ScmRepositoriesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of ScmRepositories </td><td>  -  </td></tr>
     </table>
   */
  public ScmRepositoriesResponse scmProvidersRepositoriesGetToManyRelated(String id, List<String> filterId, List<String> fieldsScmGitReferences, List<String> fieldsScmProviders, List<String> fieldsScmRepositories, Integer limit, List<String> include) throws ApiException {
    return scmProvidersRepositoriesGetToManyRelatedWithHttpInfo(id, filterId, fieldsScmGitReferences, fieldsScmProviders, fieldsScmRepositories, limit, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterId filter by id(s) (optional)
   * @param fieldsScmGitReferences the fields to include for returned resources of type scmGitReferences (optional)
   * @param fieldsScmProviders the fields to include for returned resources of type scmProviders (optional)
   * @param fieldsScmRepositories the fields to include for returned resources of type scmRepositories (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;ScmRepositoriesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of ScmRepositories </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ScmRepositoriesResponse> scmProvidersRepositoriesGetToManyRelatedWithHttpInfo(String id, List<String> filterId, List<String> fieldsScmGitReferences, List<String> fieldsScmProviders, List<String> fieldsScmRepositories, Integer limit, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling scmProvidersRepositoriesGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/scmProviders/{id}/repositories"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[id]", filterId)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[scmGitReferences]", fieldsScmGitReferences));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[scmProviders]", fieldsScmProviders));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[scmRepositories]", fieldsScmRepositories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<ScmRepositoriesResponse> localVarReturnType = new GenericType<ScmRepositoriesResponse>() {};
    return apiClient.invokeAPI("ScmProvidersApi.scmProvidersRepositoriesGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
