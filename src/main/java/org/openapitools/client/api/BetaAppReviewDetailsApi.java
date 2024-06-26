package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.AppWithoutIncludesResponse;
import org.openapitools.client.model.BetaAppReviewDetailResponse;
import org.openapitools.client.model.BetaAppReviewDetailUpdateRequest;
import org.openapitools.client.model.BetaAppReviewDetailsResponse;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class BetaAppReviewDetailsApi {
  private ApiClient apiClient;

  public BetaAppReviewDetailsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BetaAppReviewDetailsApi(ApiClient apiClient) {
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
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @return AppWithoutIncludesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single App with get </td><td>  -  </td></tr>
     </table>
   */
  public AppWithoutIncludesResponse betaAppReviewDetailsAppGetToOneRelated(String id, List<String> fieldsApps) throws ApiException {
    return betaAppReviewDetailsAppGetToOneRelatedWithHttpInfo(id, fieldsApps).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @return ApiResponse&lt;AppWithoutIncludesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single App with get </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppWithoutIncludesResponse> betaAppReviewDetailsAppGetToOneRelatedWithHttpInfo(String id, List<String> fieldsApps) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling betaAppReviewDetailsAppGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/betaAppReviewDetails/{id}/app"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[apps]", fieldsApps)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppWithoutIncludesResponse> localVarReturnType = new GenericType<AppWithoutIncludesResponse>() {};
    return apiClient.invokeAPI("BetaAppReviewDetailsApi.betaAppReviewDetailsAppGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param filterApp filter by id(s) of related &#39;app&#39; (required)
   * @param fieldsBetaAppReviewDetails the fields to include for returned resources of type betaAppReviewDetails (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @return BetaAppReviewDetailsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of BetaAppReviewDetails </td><td>  -  </td></tr>
     </table>
   */
  public BetaAppReviewDetailsResponse betaAppReviewDetailsGetCollection(List<String> filterApp, List<String> fieldsBetaAppReviewDetails, Integer limit, List<String> include, List<String> fieldsApps) throws ApiException {
    return betaAppReviewDetailsGetCollectionWithHttpInfo(filterApp, fieldsBetaAppReviewDetails, limit, include, fieldsApps).getData();
  }

  /**
   * 
   * 
   * @param filterApp filter by id(s) of related &#39;app&#39; (required)
   * @param fieldsBetaAppReviewDetails the fields to include for returned resources of type betaAppReviewDetails (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @return ApiResponse&lt;BetaAppReviewDetailsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of BetaAppReviewDetails </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BetaAppReviewDetailsResponse> betaAppReviewDetailsGetCollectionWithHttpInfo(List<String> filterApp, List<String> fieldsBetaAppReviewDetails, Integer limit, List<String> include, List<String> fieldsApps) throws ApiException {
    // Check required parameters
    if (filterApp == null) {
      throw new ApiException(400, "Missing the required parameter 'filterApp' when calling betaAppReviewDetailsGetCollection");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[app]", filterApp)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[betaAppReviewDetails]", fieldsBetaAppReviewDetails));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[apps]", fieldsApps));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BetaAppReviewDetailsResponse> localVarReturnType = new GenericType<BetaAppReviewDetailsResponse>() {};
    return apiClient.invokeAPI("BetaAppReviewDetailsApi.betaAppReviewDetailsGetCollection", "/v1/betaAppReviewDetails", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBetaAppReviewDetails the fields to include for returned resources of type betaAppReviewDetails (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @return BetaAppReviewDetailResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single BetaAppReviewDetail </td><td>  -  </td></tr>
     </table>
   */
  public BetaAppReviewDetailResponse betaAppReviewDetailsGetInstance(String id, List<String> fieldsBetaAppReviewDetails, List<String> include, List<String> fieldsApps) throws ApiException {
    return betaAppReviewDetailsGetInstanceWithHttpInfo(id, fieldsBetaAppReviewDetails, include, fieldsApps).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBetaAppReviewDetails the fields to include for returned resources of type betaAppReviewDetails (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @return ApiResponse&lt;BetaAppReviewDetailResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single BetaAppReviewDetail </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BetaAppReviewDetailResponse> betaAppReviewDetailsGetInstanceWithHttpInfo(String id, List<String> fieldsBetaAppReviewDetails, List<String> include, List<String> fieldsApps) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling betaAppReviewDetailsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/betaAppReviewDetails/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[betaAppReviewDetails]", fieldsBetaAppReviewDetails)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[apps]", fieldsApps));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BetaAppReviewDetailResponse> localVarReturnType = new GenericType<BetaAppReviewDetailResponse>() {};
    return apiClient.invokeAPI("BetaAppReviewDetailsApi.betaAppReviewDetailsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param betaAppReviewDetailUpdateRequest BetaAppReviewDetail representation (required)
   * @return BetaAppReviewDetailResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single BetaAppReviewDetail </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public BetaAppReviewDetailResponse betaAppReviewDetailsUpdateInstance(String id, BetaAppReviewDetailUpdateRequest betaAppReviewDetailUpdateRequest) throws ApiException {
    return betaAppReviewDetailsUpdateInstanceWithHttpInfo(id, betaAppReviewDetailUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param betaAppReviewDetailUpdateRequest BetaAppReviewDetail representation (required)
   * @return ApiResponse&lt;BetaAppReviewDetailResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single BetaAppReviewDetail </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BetaAppReviewDetailResponse> betaAppReviewDetailsUpdateInstanceWithHttpInfo(String id, BetaAppReviewDetailUpdateRequest betaAppReviewDetailUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling betaAppReviewDetailsUpdateInstance");
    }
    if (betaAppReviewDetailUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'betaAppReviewDetailUpdateRequest' when calling betaAppReviewDetailsUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/betaAppReviewDetails/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BetaAppReviewDetailResponse> localVarReturnType = new GenericType<BetaAppReviewDetailResponse>() {};
    return apiClient.invokeAPI("BetaAppReviewDetailsApi.betaAppReviewDetailsUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), betaAppReviewDetailUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
