package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.GameCenterMatchmakingQueueCreateRequest;
import org.openapitools.client.model.GameCenterMatchmakingQueueRequestsV1MetricResponse;
import org.openapitools.client.model.GameCenterMatchmakingQueueResponse;
import org.openapitools.client.model.GameCenterMatchmakingQueueSizesV1MetricResponse;
import org.openapitools.client.model.GameCenterMatchmakingQueueUpdateRequest;
import org.openapitools.client.model.GameCenterMatchmakingQueuesResponse;
import org.openapitools.client.model.GameCenterMatchmakingSessionsV1MetricResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class GameCenterMatchmakingQueuesApi {
  private ApiClient apiClient;

  public GameCenterMatchmakingQueuesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GameCenterMatchmakingQueuesApi(ApiClient apiClient) {
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
   * @param gameCenterMatchmakingQueueCreateRequest GameCenterMatchmakingQueue representation (required)
   * @return GameCenterMatchmakingQueueResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single GameCenterMatchmakingQueue </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterMatchmakingQueueResponse gameCenterMatchmakingQueuesCreateInstance(GameCenterMatchmakingQueueCreateRequest gameCenterMatchmakingQueueCreateRequest) throws ApiException {
    return gameCenterMatchmakingQueuesCreateInstanceWithHttpInfo(gameCenterMatchmakingQueueCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param gameCenterMatchmakingQueueCreateRequest GameCenterMatchmakingQueue representation (required)
   * @return ApiResponse&lt;GameCenterMatchmakingQueueResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single GameCenterMatchmakingQueue </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterMatchmakingQueueResponse> gameCenterMatchmakingQueuesCreateInstanceWithHttpInfo(GameCenterMatchmakingQueueCreateRequest gameCenterMatchmakingQueueCreateRequest) throws ApiException {
    // Check required parameters
    if (gameCenterMatchmakingQueueCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gameCenterMatchmakingQueueCreateRequest' when calling gameCenterMatchmakingQueuesCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterMatchmakingQueueResponse> localVarReturnType = new GenericType<GameCenterMatchmakingQueueResponse>() {};
    return apiClient.invokeAPI("GameCenterMatchmakingQueuesApi.gameCenterMatchmakingQueuesCreateInstance", "/v1/gameCenterMatchmakingQueues", "POST", new ArrayList<>(), gameCenterMatchmakingQueueCreateRequest,
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
  public void gameCenterMatchmakingQueuesDeleteInstance(String id) throws ApiException {
    gameCenterMatchmakingQueuesDeleteInstanceWithHttpInfo(id);
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
  public ApiResponse<Void> gameCenterMatchmakingQueuesDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterMatchmakingQueuesDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterMatchmakingQueues/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("GameCenterMatchmakingQueuesApi.gameCenterMatchmakingQueuesDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param granularity the granularity of the per-group dataset (required)
   * @param limit maximum number of groups to return per page (optional)
   * @param sort comma-separated list of sort expressions; metrics will be sorted as specified (optional)
   * @return GameCenterMatchmakingQueueSizesV1MetricResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Metrics data response </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterMatchmakingQueueSizesV1MetricResponse gameCenterMatchmakingQueuesExperimentMatchmakingQueueSizesGetMetrics(String id, String granularity, Integer limit, List<String> sort) throws ApiException {
    return gameCenterMatchmakingQueuesExperimentMatchmakingQueueSizesGetMetricsWithHttpInfo(id, granularity, limit, sort).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param granularity the granularity of the per-group dataset (required)
   * @param limit maximum number of groups to return per page (optional)
   * @param sort comma-separated list of sort expressions; metrics will be sorted as specified (optional)
   * @return ApiResponse&lt;GameCenterMatchmakingQueueSizesV1MetricResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Metrics data response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterMatchmakingQueueSizesV1MetricResponse> gameCenterMatchmakingQueuesExperimentMatchmakingQueueSizesGetMetricsWithHttpInfo(String id, String granularity, Integer limit, List<String> sort) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterMatchmakingQueuesExperimentMatchmakingQueueSizesGetMetrics");
    }
    if (granularity == null) {
      throw new ApiException(400, "Missing the required parameter 'granularity' when calling gameCenterMatchmakingQueuesExperimentMatchmakingQueueSizesGetMetrics");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterMatchmakingQueues/{id}/metrics/experimentMatchmakingQueueSizes"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "limit", limit)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "granularity", granularity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "sort", sort));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterMatchmakingQueueSizesV1MetricResponse> localVarReturnType = new GenericType<GameCenterMatchmakingQueueSizesV1MetricResponse>() {};
    return apiClient.invokeAPI("GameCenterMatchmakingQueuesApi.gameCenterMatchmakingQueuesExperimentMatchmakingQueueSizesGetMetrics", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param granularity the granularity of the per-group dataset (required)
   * @param limit maximum number of groups to return per page (optional)
   * @param groupBy the dimension by which to group the results (optional)
   * @param filterResult filter by &#39;result&#39; attribute dimension (optional)
   * @param filterGameCenterDetail filter by &#39;gameCenterDetail&#39; relationship dimension (optional)
   * @param sort comma-separated list of sort expressions; metrics will be sorted as specified (optional)
   * @return GameCenterMatchmakingQueueRequestsV1MetricResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Metrics data response </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterMatchmakingQueueRequestsV1MetricResponse gameCenterMatchmakingQueuesExperimentMatchmakingRequestsGetMetrics(String id, String granularity, Integer limit, List<String> groupBy, String filterResult, String filterGameCenterDetail, List<String> sort) throws ApiException {
    return gameCenterMatchmakingQueuesExperimentMatchmakingRequestsGetMetricsWithHttpInfo(id, granularity, limit, groupBy, filterResult, filterGameCenterDetail, sort).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param granularity the granularity of the per-group dataset (required)
   * @param limit maximum number of groups to return per page (optional)
   * @param groupBy the dimension by which to group the results (optional)
   * @param filterResult filter by &#39;result&#39; attribute dimension (optional)
   * @param filterGameCenterDetail filter by &#39;gameCenterDetail&#39; relationship dimension (optional)
   * @param sort comma-separated list of sort expressions; metrics will be sorted as specified (optional)
   * @return ApiResponse&lt;GameCenterMatchmakingQueueRequestsV1MetricResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Metrics data response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterMatchmakingQueueRequestsV1MetricResponse> gameCenterMatchmakingQueuesExperimentMatchmakingRequestsGetMetricsWithHttpInfo(String id, String granularity, Integer limit, List<String> groupBy, String filterResult, String filterGameCenterDetail, List<String> sort) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterMatchmakingQueuesExperimentMatchmakingRequestsGetMetrics");
    }
    if (granularity == null) {
      throw new ApiException(400, "Missing the required parameter 'granularity' when calling gameCenterMatchmakingQueuesExperimentMatchmakingRequestsGetMetrics");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterMatchmakingQueues/{id}/metrics/experimentMatchmakingRequests"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "limit", limit)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "granularity", granularity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "groupBy", groupBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[result]", filterResult));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[gameCenterDetail]", filterGameCenterDetail));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "sort", sort));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterMatchmakingQueueRequestsV1MetricResponse> localVarReturnType = new GenericType<GameCenterMatchmakingQueueRequestsV1MetricResponse>() {};
    return apiClient.invokeAPI("GameCenterMatchmakingQueuesApi.gameCenterMatchmakingQueuesExperimentMatchmakingRequestsGetMetrics", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param fieldsGameCenterMatchmakingQueues the fields to include for returned resources of type gameCenterMatchmakingQueues (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return GameCenterMatchmakingQueuesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of GameCenterMatchmakingQueues </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterMatchmakingQueuesResponse gameCenterMatchmakingQueuesGetCollection(List<String> fieldsGameCenterMatchmakingQueues, Integer limit, List<String> include) throws ApiException {
    return gameCenterMatchmakingQueuesGetCollectionWithHttpInfo(fieldsGameCenterMatchmakingQueues, limit, include).getData();
  }

  /**
   * 
   * 
   * @param fieldsGameCenterMatchmakingQueues the fields to include for returned resources of type gameCenterMatchmakingQueues (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;GameCenterMatchmakingQueuesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of GameCenterMatchmakingQueues </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterMatchmakingQueuesResponse> gameCenterMatchmakingQueuesGetCollectionWithHttpInfo(List<String> fieldsGameCenterMatchmakingQueues, Integer limit, List<String> include) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[gameCenterMatchmakingQueues]", fieldsGameCenterMatchmakingQueues)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterMatchmakingQueuesResponse> localVarReturnType = new GenericType<GameCenterMatchmakingQueuesResponse>() {};
    return apiClient.invokeAPI("GameCenterMatchmakingQueuesApi.gameCenterMatchmakingQueuesGetCollection", "/v1/gameCenterMatchmakingQueues", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterMatchmakingQueues the fields to include for returned resources of type gameCenterMatchmakingQueues (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return GameCenterMatchmakingQueueResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterMatchmakingQueue </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterMatchmakingQueueResponse gameCenterMatchmakingQueuesGetInstance(String id, List<String> fieldsGameCenterMatchmakingQueues, List<String> include) throws ApiException {
    return gameCenterMatchmakingQueuesGetInstanceWithHttpInfo(id, fieldsGameCenterMatchmakingQueues, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterMatchmakingQueues the fields to include for returned resources of type gameCenterMatchmakingQueues (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;GameCenterMatchmakingQueueResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterMatchmakingQueue </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterMatchmakingQueueResponse> gameCenterMatchmakingQueuesGetInstanceWithHttpInfo(String id, List<String> fieldsGameCenterMatchmakingQueues, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterMatchmakingQueuesGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterMatchmakingQueues/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[gameCenterMatchmakingQueues]", fieldsGameCenterMatchmakingQueues)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterMatchmakingQueueResponse> localVarReturnType = new GenericType<GameCenterMatchmakingQueueResponse>() {};
    return apiClient.invokeAPI("GameCenterMatchmakingQueuesApi.gameCenterMatchmakingQueuesGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param granularity the granularity of the per-group dataset (required)
   * @param limit maximum number of groups to return per page (optional)
   * @param sort comma-separated list of sort expressions; metrics will be sorted as specified (optional)
   * @return GameCenterMatchmakingQueueSizesV1MetricResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Metrics data response </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterMatchmakingQueueSizesV1MetricResponse gameCenterMatchmakingQueuesMatchmakingQueueSizesGetMetrics(String id, String granularity, Integer limit, List<String> sort) throws ApiException {
    return gameCenterMatchmakingQueuesMatchmakingQueueSizesGetMetricsWithHttpInfo(id, granularity, limit, sort).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param granularity the granularity of the per-group dataset (required)
   * @param limit maximum number of groups to return per page (optional)
   * @param sort comma-separated list of sort expressions; metrics will be sorted as specified (optional)
   * @return ApiResponse&lt;GameCenterMatchmakingQueueSizesV1MetricResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Metrics data response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterMatchmakingQueueSizesV1MetricResponse> gameCenterMatchmakingQueuesMatchmakingQueueSizesGetMetricsWithHttpInfo(String id, String granularity, Integer limit, List<String> sort) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterMatchmakingQueuesMatchmakingQueueSizesGetMetrics");
    }
    if (granularity == null) {
      throw new ApiException(400, "Missing the required parameter 'granularity' when calling gameCenterMatchmakingQueuesMatchmakingQueueSizesGetMetrics");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterMatchmakingQueues/{id}/metrics/matchmakingQueueSizes"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "limit", limit)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "granularity", granularity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "sort", sort));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterMatchmakingQueueSizesV1MetricResponse> localVarReturnType = new GenericType<GameCenterMatchmakingQueueSizesV1MetricResponse>() {};
    return apiClient.invokeAPI("GameCenterMatchmakingQueuesApi.gameCenterMatchmakingQueuesMatchmakingQueueSizesGetMetrics", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param granularity the granularity of the per-group dataset (required)
   * @param limit maximum number of groups to return per page (optional)
   * @param groupBy the dimension by which to group the results (optional)
   * @param filterResult filter by &#39;result&#39; attribute dimension (optional)
   * @param filterGameCenterDetail filter by &#39;gameCenterDetail&#39; relationship dimension (optional)
   * @param sort comma-separated list of sort expressions; metrics will be sorted as specified (optional)
   * @return GameCenterMatchmakingQueueRequestsV1MetricResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Metrics data response </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterMatchmakingQueueRequestsV1MetricResponse gameCenterMatchmakingQueuesMatchmakingRequestsGetMetrics(String id, String granularity, Integer limit, List<String> groupBy, String filterResult, String filterGameCenterDetail, List<String> sort) throws ApiException {
    return gameCenterMatchmakingQueuesMatchmakingRequestsGetMetricsWithHttpInfo(id, granularity, limit, groupBy, filterResult, filterGameCenterDetail, sort).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param granularity the granularity of the per-group dataset (required)
   * @param limit maximum number of groups to return per page (optional)
   * @param groupBy the dimension by which to group the results (optional)
   * @param filterResult filter by &#39;result&#39; attribute dimension (optional)
   * @param filterGameCenterDetail filter by &#39;gameCenterDetail&#39; relationship dimension (optional)
   * @param sort comma-separated list of sort expressions; metrics will be sorted as specified (optional)
   * @return ApiResponse&lt;GameCenterMatchmakingQueueRequestsV1MetricResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Metrics data response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterMatchmakingQueueRequestsV1MetricResponse> gameCenterMatchmakingQueuesMatchmakingRequestsGetMetricsWithHttpInfo(String id, String granularity, Integer limit, List<String> groupBy, String filterResult, String filterGameCenterDetail, List<String> sort) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterMatchmakingQueuesMatchmakingRequestsGetMetrics");
    }
    if (granularity == null) {
      throw new ApiException(400, "Missing the required parameter 'granularity' when calling gameCenterMatchmakingQueuesMatchmakingRequestsGetMetrics");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterMatchmakingQueues/{id}/metrics/matchmakingRequests"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "limit", limit)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "granularity", granularity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "groupBy", groupBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[result]", filterResult));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[gameCenterDetail]", filterGameCenterDetail));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "sort", sort));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterMatchmakingQueueRequestsV1MetricResponse> localVarReturnType = new GenericType<GameCenterMatchmakingQueueRequestsV1MetricResponse>() {};
    return apiClient.invokeAPI("GameCenterMatchmakingQueuesApi.gameCenterMatchmakingQueuesMatchmakingRequestsGetMetrics", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param granularity the granularity of the per-group dataset (required)
   * @param limit maximum number of groups to return per page (optional)
   * @param sort comma-separated list of sort expressions; metrics will be sorted as specified (optional)
   * @return GameCenterMatchmakingSessionsV1MetricResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Metrics data response </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterMatchmakingSessionsV1MetricResponse gameCenterMatchmakingQueuesMatchmakingSessionsGetMetrics(String id, String granularity, Integer limit, List<String> sort) throws ApiException {
    return gameCenterMatchmakingQueuesMatchmakingSessionsGetMetricsWithHttpInfo(id, granularity, limit, sort).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param granularity the granularity of the per-group dataset (required)
   * @param limit maximum number of groups to return per page (optional)
   * @param sort comma-separated list of sort expressions; metrics will be sorted as specified (optional)
   * @return ApiResponse&lt;GameCenterMatchmakingSessionsV1MetricResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Metrics data response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterMatchmakingSessionsV1MetricResponse> gameCenterMatchmakingQueuesMatchmakingSessionsGetMetricsWithHttpInfo(String id, String granularity, Integer limit, List<String> sort) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterMatchmakingQueuesMatchmakingSessionsGetMetrics");
    }
    if (granularity == null) {
      throw new ApiException(400, "Missing the required parameter 'granularity' when calling gameCenterMatchmakingQueuesMatchmakingSessionsGetMetrics");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterMatchmakingQueues/{id}/metrics/matchmakingSessions"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "limit", limit)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "granularity", granularity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "sort", sort));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterMatchmakingSessionsV1MetricResponse> localVarReturnType = new GenericType<GameCenterMatchmakingSessionsV1MetricResponse>() {};
    return apiClient.invokeAPI("GameCenterMatchmakingQueuesApi.gameCenterMatchmakingQueuesMatchmakingSessionsGetMetrics", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterMatchmakingQueueUpdateRequest GameCenterMatchmakingQueue representation (required)
   * @return GameCenterMatchmakingQueueResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterMatchmakingQueue </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterMatchmakingQueueResponse gameCenterMatchmakingQueuesUpdateInstance(String id, GameCenterMatchmakingQueueUpdateRequest gameCenterMatchmakingQueueUpdateRequest) throws ApiException {
    return gameCenterMatchmakingQueuesUpdateInstanceWithHttpInfo(id, gameCenterMatchmakingQueueUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterMatchmakingQueueUpdateRequest GameCenterMatchmakingQueue representation (required)
   * @return ApiResponse&lt;GameCenterMatchmakingQueueResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterMatchmakingQueue </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterMatchmakingQueueResponse> gameCenterMatchmakingQueuesUpdateInstanceWithHttpInfo(String id, GameCenterMatchmakingQueueUpdateRequest gameCenterMatchmakingQueueUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterMatchmakingQueuesUpdateInstance");
    }
    if (gameCenterMatchmakingQueueUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gameCenterMatchmakingQueueUpdateRequest' when calling gameCenterMatchmakingQueuesUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterMatchmakingQueues/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterMatchmakingQueueResponse> localVarReturnType = new GenericType<GameCenterMatchmakingQueueResponse>() {};
    return apiClient.invokeAPI("GameCenterMatchmakingQueuesApi.gameCenterMatchmakingQueuesUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), gameCenterMatchmakingQueueUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
