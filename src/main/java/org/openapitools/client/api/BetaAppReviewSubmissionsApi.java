package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.BetaAppReviewSubmissionCreateRequest;
import org.openapitools.client.model.BetaAppReviewSubmissionResponse;
import org.openapitools.client.model.BetaAppReviewSubmissionsResponse;
import org.openapitools.client.model.BuildWithoutIncludesResponse;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class BetaAppReviewSubmissionsApi {
  private ApiClient apiClient;

  public BetaAppReviewSubmissionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BetaAppReviewSubmissionsApi(ApiClient apiClient) {
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
  public BuildWithoutIncludesResponse betaAppReviewSubmissionsBuildGetToOneRelated(String id, List<String> fieldsBuilds) throws ApiException {
    return betaAppReviewSubmissionsBuildGetToOneRelatedWithHttpInfo(id, fieldsBuilds).getData();
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
  public ApiResponse<BuildWithoutIncludesResponse> betaAppReviewSubmissionsBuildGetToOneRelatedWithHttpInfo(String id, List<String> fieldsBuilds) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling betaAppReviewSubmissionsBuildGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/betaAppReviewSubmissions/{id}/build"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[builds]", fieldsBuilds)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BuildWithoutIncludesResponse> localVarReturnType = new GenericType<BuildWithoutIncludesResponse>() {};
    return apiClient.invokeAPI("BetaAppReviewSubmissionsApi.betaAppReviewSubmissionsBuildGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param betaAppReviewSubmissionCreateRequest BetaAppReviewSubmission representation (required)
   * @return BetaAppReviewSubmissionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single BetaAppReviewSubmission </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public BetaAppReviewSubmissionResponse betaAppReviewSubmissionsCreateInstance(BetaAppReviewSubmissionCreateRequest betaAppReviewSubmissionCreateRequest) throws ApiException {
    return betaAppReviewSubmissionsCreateInstanceWithHttpInfo(betaAppReviewSubmissionCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param betaAppReviewSubmissionCreateRequest BetaAppReviewSubmission representation (required)
   * @return ApiResponse&lt;BetaAppReviewSubmissionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single BetaAppReviewSubmission </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BetaAppReviewSubmissionResponse> betaAppReviewSubmissionsCreateInstanceWithHttpInfo(BetaAppReviewSubmissionCreateRequest betaAppReviewSubmissionCreateRequest) throws ApiException {
    // Check required parameters
    if (betaAppReviewSubmissionCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'betaAppReviewSubmissionCreateRequest' when calling betaAppReviewSubmissionsCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BetaAppReviewSubmissionResponse> localVarReturnType = new GenericType<BetaAppReviewSubmissionResponse>() {};
    return apiClient.invokeAPI("BetaAppReviewSubmissionsApi.betaAppReviewSubmissionsCreateInstance", "/v1/betaAppReviewSubmissions", "POST", new ArrayList<>(), betaAppReviewSubmissionCreateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param filterBuild filter by id(s) of related &#39;build&#39; (required)
   * @param filterBetaReviewState filter by attribute &#39;betaReviewState&#39; (optional)
   * @param fieldsBetaAppReviewSubmissions the fields to include for returned resources of type betaAppReviewSubmissions (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @return BetaAppReviewSubmissionsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of BetaAppReviewSubmissions </td><td>  -  </td></tr>
     </table>
   */
  public BetaAppReviewSubmissionsResponse betaAppReviewSubmissionsGetCollection(List<String> filterBuild, List<String> filterBetaReviewState, List<String> fieldsBetaAppReviewSubmissions, Integer limit, List<String> include, List<String> fieldsBuilds) throws ApiException {
    return betaAppReviewSubmissionsGetCollectionWithHttpInfo(filterBuild, filterBetaReviewState, fieldsBetaAppReviewSubmissions, limit, include, fieldsBuilds).getData();
  }

  /**
   * 
   * 
   * @param filterBuild filter by id(s) of related &#39;build&#39; (required)
   * @param filterBetaReviewState filter by attribute &#39;betaReviewState&#39; (optional)
   * @param fieldsBetaAppReviewSubmissions the fields to include for returned resources of type betaAppReviewSubmissions (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @return ApiResponse&lt;BetaAppReviewSubmissionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of BetaAppReviewSubmissions </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BetaAppReviewSubmissionsResponse> betaAppReviewSubmissionsGetCollectionWithHttpInfo(List<String> filterBuild, List<String> filterBetaReviewState, List<String> fieldsBetaAppReviewSubmissions, Integer limit, List<String> include, List<String> fieldsBuilds) throws ApiException {
    // Check required parameters
    if (filterBuild == null) {
      throw new ApiException(400, "Missing the required parameter 'filterBuild' when calling betaAppReviewSubmissionsGetCollection");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[betaReviewState]", filterBetaReviewState)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[build]", filterBuild));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[betaAppReviewSubmissions]", fieldsBetaAppReviewSubmissions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[builds]", fieldsBuilds));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BetaAppReviewSubmissionsResponse> localVarReturnType = new GenericType<BetaAppReviewSubmissionsResponse>() {};
    return apiClient.invokeAPI("BetaAppReviewSubmissionsApi.betaAppReviewSubmissionsGetCollection", "/v1/betaAppReviewSubmissions", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBetaAppReviewSubmissions the fields to include for returned resources of type betaAppReviewSubmissions (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @return BetaAppReviewSubmissionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single BetaAppReviewSubmission </td><td>  -  </td></tr>
     </table>
   */
  public BetaAppReviewSubmissionResponse betaAppReviewSubmissionsGetInstance(String id, List<String> fieldsBetaAppReviewSubmissions, List<String> include, List<String> fieldsBuilds) throws ApiException {
    return betaAppReviewSubmissionsGetInstanceWithHttpInfo(id, fieldsBetaAppReviewSubmissions, include, fieldsBuilds).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBetaAppReviewSubmissions the fields to include for returned resources of type betaAppReviewSubmissions (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @return ApiResponse&lt;BetaAppReviewSubmissionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single BetaAppReviewSubmission </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BetaAppReviewSubmissionResponse> betaAppReviewSubmissionsGetInstanceWithHttpInfo(String id, List<String> fieldsBetaAppReviewSubmissions, List<String> include, List<String> fieldsBuilds) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling betaAppReviewSubmissionsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/betaAppReviewSubmissions/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[betaAppReviewSubmissions]", fieldsBetaAppReviewSubmissions)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[builds]", fieldsBuilds));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BetaAppReviewSubmissionResponse> localVarReturnType = new GenericType<BetaAppReviewSubmissionResponse>() {};
    return apiClient.invokeAPI("BetaAppReviewSubmissionsApi.betaAppReviewSubmissionsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
