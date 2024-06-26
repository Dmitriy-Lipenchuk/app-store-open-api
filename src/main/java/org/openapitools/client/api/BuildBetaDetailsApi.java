package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.BuildBetaDetailResponse;
import org.openapitools.client.model.BuildBetaDetailUpdateRequest;
import org.openapitools.client.model.BuildBetaDetailsResponse;
import org.openapitools.client.model.BuildWithoutIncludesResponse;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class BuildBetaDetailsApi {
  private ApiClient apiClient;

  public BuildBetaDetailsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BuildBetaDetailsApi(ApiClient apiClient) {
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
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @return BuildWithoutIncludesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single Build with get </td><td>  -  </td></tr>
     </table>
   */
  public BuildWithoutIncludesResponse buildBetaDetailsBuildGetToOneRelated(String id, List<String> fieldsBuilds) throws ApiException {
    return buildBetaDetailsBuildGetToOneRelatedWithHttpInfo(id, fieldsBuilds).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @return ApiResponse&lt;BuildWithoutIncludesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single Build with get </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BuildWithoutIncludesResponse> buildBetaDetailsBuildGetToOneRelatedWithHttpInfo(String id, List<String> fieldsBuilds) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling buildBetaDetailsBuildGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/buildBetaDetails/{id}/build"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[builds]", fieldsBuilds)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BuildWithoutIncludesResponse> localVarReturnType = new GenericType<BuildWithoutIncludesResponse>() {};
    return apiClient.invokeAPI("BuildBetaDetailsApi.buildBetaDetailsBuildGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param filterBuild filter by id(s) of related &#39;build&#39; (optional)
   * @param filterId filter by id(s) (optional)
   * @param fieldsBuildBetaDetails the fields to include for returned resources of type buildBetaDetails (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @return BuildBetaDetailsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of BuildBetaDetails </td><td>  -  </td></tr>
     </table>
   */
  public BuildBetaDetailsResponse buildBetaDetailsGetCollection(List<String> filterBuild, List<String> filterId, List<String> fieldsBuildBetaDetails, Integer limit, List<String> include, List<String> fieldsBuilds) throws ApiException {
    return buildBetaDetailsGetCollectionWithHttpInfo(filterBuild, filterId, fieldsBuildBetaDetails, limit, include, fieldsBuilds).getData();
  }

  /**
   * 
   * 
   * @param filterBuild filter by id(s) of related &#39;build&#39; (optional)
   * @param filterId filter by id(s) (optional)
   * @param fieldsBuildBetaDetails the fields to include for returned resources of type buildBetaDetails (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @return ApiResponse&lt;BuildBetaDetailsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of BuildBetaDetails </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BuildBetaDetailsResponse> buildBetaDetailsGetCollectionWithHttpInfo(List<String> filterBuild, List<String> filterId, List<String> fieldsBuildBetaDetails, Integer limit, List<String> include, List<String> fieldsBuilds) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[build]", filterBuild)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[id]", filterId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[buildBetaDetails]", fieldsBuildBetaDetails));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[builds]", fieldsBuilds));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BuildBetaDetailsResponse> localVarReturnType = new GenericType<BuildBetaDetailsResponse>() {};
    return apiClient.invokeAPI("BuildBetaDetailsApi.buildBetaDetailsGetCollection", "/v1/buildBetaDetails", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBuildBetaDetails the fields to include for returned resources of type buildBetaDetails (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @return BuildBetaDetailResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single BuildBetaDetail </td><td>  -  </td></tr>
     </table>
   */
  public BuildBetaDetailResponse buildBetaDetailsGetInstance(String id, List<String> fieldsBuildBetaDetails, List<String> include, List<String> fieldsBuilds) throws ApiException {
    return buildBetaDetailsGetInstanceWithHttpInfo(id, fieldsBuildBetaDetails, include, fieldsBuilds).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBuildBetaDetails the fields to include for returned resources of type buildBetaDetails (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @return ApiResponse&lt;BuildBetaDetailResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single BuildBetaDetail </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BuildBetaDetailResponse> buildBetaDetailsGetInstanceWithHttpInfo(String id, List<String> fieldsBuildBetaDetails, List<String> include, List<String> fieldsBuilds) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling buildBetaDetailsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/buildBetaDetails/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[buildBetaDetails]", fieldsBuildBetaDetails)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[builds]", fieldsBuilds));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BuildBetaDetailResponse> localVarReturnType = new GenericType<BuildBetaDetailResponse>() {};
    return apiClient.invokeAPI("BuildBetaDetailsApi.buildBetaDetailsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param buildBetaDetailUpdateRequest BuildBetaDetail representation (required)
   * @return BuildBetaDetailResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single BuildBetaDetail </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public BuildBetaDetailResponse buildBetaDetailsUpdateInstance(String id, BuildBetaDetailUpdateRequest buildBetaDetailUpdateRequest) throws ApiException {
    return buildBetaDetailsUpdateInstanceWithHttpInfo(id, buildBetaDetailUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param buildBetaDetailUpdateRequest BuildBetaDetail representation (required)
   * @return ApiResponse&lt;BuildBetaDetailResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single BuildBetaDetail </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BuildBetaDetailResponse> buildBetaDetailsUpdateInstanceWithHttpInfo(String id, BuildBetaDetailUpdateRequest buildBetaDetailUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling buildBetaDetailsUpdateInstance");
    }
    if (buildBetaDetailUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'buildBetaDetailUpdateRequest' when calling buildBetaDetailsUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/buildBetaDetails/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BuildBetaDetailResponse> localVarReturnType = new GenericType<BuildBetaDetailResponse>() {};
    return apiClient.invokeAPI("BuildBetaDetailsApi.buildBetaDetailsUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), buildBetaDetailUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
