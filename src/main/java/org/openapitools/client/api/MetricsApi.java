package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.AppsBetaTesterUsagesV1MetricResponse;
import org.openapitools.client.model.BetaBuildUsagesV1MetricResponse;
import org.openapitools.client.model.BetaTesterUsagesV1MetricResponse;
import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.GameCenterMatchmakingAppRequestsV1MetricResponse;
import org.openapitools.client.model.GameCenterMatchmakingBooleanRuleResultsV1MetricResponse;
import org.openapitools.client.model.GameCenterMatchmakingNumberRuleResultsV1MetricResponse;
import org.openapitools.client.model.GameCenterMatchmakingQueueRequestsV1MetricResponse;
import org.openapitools.client.model.GameCenterMatchmakingQueueSizesV1MetricResponse;
import org.openapitools.client.model.GameCenterMatchmakingRuleErrorsV1MetricResponse;
import org.openapitools.client.model.GameCenterMatchmakingSessionsV1MetricResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class MetricsApi {
  private ApiClient apiClient;

  public MetricsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MetricsApi(ApiClient apiClient) {
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
   * @param limit maximum number of groups to return per page (optional)
   * @param groupBy the dimension by which to group the results (optional)
   * @param filterBetaTesters filter by &#39;betaTesters&#39; relationship dimension (optional)
   * @param period the duration of the reporting period (optional)
   * @return AppsBetaTesterUsagesV1MetricResponse
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
  public AppsBetaTesterUsagesV1MetricResponse appsBetaTesterUsagesGetMetrics(String id, Integer limit, List<String> groupBy, String filterBetaTesters, String period) throws ApiException {
    return appsBetaTesterUsagesGetMetricsWithHttpInfo(id, limit, groupBy, filterBetaTesters, period).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param limit maximum number of groups to return per page (optional)
   * @param groupBy the dimension by which to group the results (optional)
   * @param filterBetaTesters filter by &#39;betaTesters&#39; relationship dimension (optional)
   * @param period the duration of the reporting period (optional)
   * @return ApiResponse&lt;AppsBetaTesterUsagesV1MetricResponse&gt;
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
  public ApiResponse<AppsBetaTesterUsagesV1MetricResponse> appsBetaTesterUsagesGetMetricsWithHttpInfo(String id, Integer limit, List<String> groupBy, String filterBetaTesters, String period) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appsBetaTesterUsagesGetMetrics");
    }

    // Path parameters
    String localVarPath = "/v1/apps/{id}/metrics/betaTesterUsages"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "limit", limit)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "groupBy", groupBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[betaTesters]", filterBetaTesters));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "period", period));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppsBetaTesterUsagesV1MetricResponse> localVarReturnType = new GenericType<AppsBetaTesterUsagesV1MetricResponse>() {};
    return apiClient.invokeAPI("MetricsApi.appsBetaTesterUsagesGetMetrics", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param limit maximum number of groups to return per page (optional)
   * @param groupBy the dimension by which to group the results (optional)
   * @param filterBetaTesters filter by &#39;betaTesters&#39; relationship dimension (optional)
   * @param period the duration of the reporting period (optional)
   * @return AppsBetaTesterUsagesV1MetricResponse
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
  public AppsBetaTesterUsagesV1MetricResponse betaGroupsBetaTesterUsagesGetMetrics(String id, Integer limit, List<String> groupBy, String filterBetaTesters, String period) throws ApiException {
    return betaGroupsBetaTesterUsagesGetMetricsWithHttpInfo(id, limit, groupBy, filterBetaTesters, period).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param limit maximum number of groups to return per page (optional)
   * @param groupBy the dimension by which to group the results (optional)
   * @param filterBetaTesters filter by &#39;betaTesters&#39; relationship dimension (optional)
   * @param period the duration of the reporting period (optional)
   * @return ApiResponse&lt;AppsBetaTesterUsagesV1MetricResponse&gt;
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
  public ApiResponse<AppsBetaTesterUsagesV1MetricResponse> betaGroupsBetaTesterUsagesGetMetricsWithHttpInfo(String id, Integer limit, List<String> groupBy, String filterBetaTesters, String period) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling betaGroupsBetaTesterUsagesGetMetrics");
    }

    // Path parameters
    String localVarPath = "/v1/betaGroups/{id}/metrics/betaTesterUsages"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "limit", limit)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "groupBy", groupBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[betaTesters]", filterBetaTesters));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "period", period));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppsBetaTesterUsagesV1MetricResponse> localVarReturnType = new GenericType<AppsBetaTesterUsagesV1MetricResponse>() {};
    return apiClient.invokeAPI("MetricsApi.betaGroupsBetaTesterUsagesGetMetrics", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterApps filter by &#39;apps&#39; relationship dimension (required)
   * @param limit maximum number of groups to return per page (optional)
   * @param period the duration of the reporting period (optional)
   * @return BetaTesterUsagesV1MetricResponse
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
  public BetaTesterUsagesV1MetricResponse betaTestersBetaTesterUsagesGetMetrics(String id, String filterApps, Integer limit, String period) throws ApiException {
    return betaTestersBetaTesterUsagesGetMetricsWithHttpInfo(id, filterApps, limit, period).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterApps filter by &#39;apps&#39; relationship dimension (required)
   * @param limit maximum number of groups to return per page (optional)
   * @param period the duration of the reporting period (optional)
   * @return ApiResponse&lt;BetaTesterUsagesV1MetricResponse&gt;
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
  public ApiResponse<BetaTesterUsagesV1MetricResponse> betaTestersBetaTesterUsagesGetMetricsWithHttpInfo(String id, String filterApps, Integer limit, String period) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling betaTestersBetaTesterUsagesGetMetrics");
    }
    if (filterApps == null) {
      throw new ApiException(400, "Missing the required parameter 'filterApps' when calling betaTestersBetaTesterUsagesGetMetrics");
    }

    // Path parameters
    String localVarPath = "/v1/betaTesters/{id}/metrics/betaTesterUsages"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "limit", limit)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[apps]", filterApps));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "period", period));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BetaTesterUsagesV1MetricResponse> localVarReturnType = new GenericType<BetaTesterUsagesV1MetricResponse>() {};
    return apiClient.invokeAPI("MetricsApi.betaTestersBetaTesterUsagesGetMetrics", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param limit maximum number of groups to return per page (optional)
   * @return BetaBuildUsagesV1MetricResponse
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
  public BetaBuildUsagesV1MetricResponse buildsBetaBuildUsagesGetMetrics(String id, Integer limit) throws ApiException {
    return buildsBetaBuildUsagesGetMetricsWithHttpInfo(id, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param limit maximum number of groups to return per page (optional)
   * @return ApiResponse&lt;BetaBuildUsagesV1MetricResponse&gt;
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
  public ApiResponse<BetaBuildUsagesV1MetricResponse> buildsBetaBuildUsagesGetMetricsWithHttpInfo(String id, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling buildsBetaBuildUsagesGetMetrics");
    }

    // Path parameters
    String localVarPath = "/v1/builds/{id}/metrics/betaBuildUsages"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "limit", limit)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BetaBuildUsagesV1MetricResponse> localVarReturnType = new GenericType<BetaBuildUsagesV1MetricResponse>() {};
    return apiClient.invokeAPI("MetricsApi.buildsBetaBuildUsagesGetMetrics", localVarPath, "GET", localVarQueryParams, null,
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
   * @param sort comma-separated list of sort expressions; metrics will be sorted as specified (optional)
   * @return GameCenterMatchmakingAppRequestsV1MetricResponse
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
  public GameCenterMatchmakingAppRequestsV1MetricResponse gameCenterDetailsClassicMatchmakingRequestsGetMetrics(String id, String granularity, Integer limit, List<String> groupBy, String filterResult, List<String> sort) throws ApiException {
    return gameCenterDetailsClassicMatchmakingRequestsGetMetricsWithHttpInfo(id, granularity, limit, groupBy, filterResult, sort).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param granularity the granularity of the per-group dataset (required)
   * @param limit maximum number of groups to return per page (optional)
   * @param groupBy the dimension by which to group the results (optional)
   * @param filterResult filter by &#39;result&#39; attribute dimension (optional)
   * @param sort comma-separated list of sort expressions; metrics will be sorted as specified (optional)
   * @return ApiResponse&lt;GameCenterMatchmakingAppRequestsV1MetricResponse&gt;
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
  public ApiResponse<GameCenterMatchmakingAppRequestsV1MetricResponse> gameCenterDetailsClassicMatchmakingRequestsGetMetricsWithHttpInfo(String id, String granularity, Integer limit, List<String> groupBy, String filterResult, List<String> sort) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterDetailsClassicMatchmakingRequestsGetMetrics");
    }
    if (granularity == null) {
      throw new ApiException(400, "Missing the required parameter 'granularity' when calling gameCenterDetailsClassicMatchmakingRequestsGetMetrics");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterDetails/{id}/metrics/classicMatchmakingRequests"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "limit", limit)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "granularity", granularity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "groupBy", groupBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[result]", filterResult));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "sort", sort));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterMatchmakingAppRequestsV1MetricResponse> localVarReturnType = new GenericType<GameCenterMatchmakingAppRequestsV1MetricResponse>() {};
    return apiClient.invokeAPI("MetricsApi.gameCenterDetailsClassicMatchmakingRequestsGetMetrics", localVarPath, "GET", localVarQueryParams, null,
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
   * @param sort comma-separated list of sort expressions; metrics will be sorted as specified (optional)
   * @return GameCenterMatchmakingAppRequestsV1MetricResponse
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
  public GameCenterMatchmakingAppRequestsV1MetricResponse gameCenterDetailsRuleBasedMatchmakingRequestsGetMetrics(String id, String granularity, Integer limit, List<String> groupBy, String filterResult, List<String> sort) throws ApiException {
    return gameCenterDetailsRuleBasedMatchmakingRequestsGetMetricsWithHttpInfo(id, granularity, limit, groupBy, filterResult, sort).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param granularity the granularity of the per-group dataset (required)
   * @param limit maximum number of groups to return per page (optional)
   * @param groupBy the dimension by which to group the results (optional)
   * @param filterResult filter by &#39;result&#39; attribute dimension (optional)
   * @param sort comma-separated list of sort expressions; metrics will be sorted as specified (optional)
   * @return ApiResponse&lt;GameCenterMatchmakingAppRequestsV1MetricResponse&gt;
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
  public ApiResponse<GameCenterMatchmakingAppRequestsV1MetricResponse> gameCenterDetailsRuleBasedMatchmakingRequestsGetMetricsWithHttpInfo(String id, String granularity, Integer limit, List<String> groupBy, String filterResult, List<String> sort) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterDetailsRuleBasedMatchmakingRequestsGetMetrics");
    }
    if (granularity == null) {
      throw new ApiException(400, "Missing the required parameter 'granularity' when calling gameCenterDetailsRuleBasedMatchmakingRequestsGetMetrics");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterDetails/{id}/metrics/ruleBasedMatchmakingRequests"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "limit", limit)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "granularity", granularity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "groupBy", groupBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[result]", filterResult));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "sort", sort));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterMatchmakingAppRequestsV1MetricResponse> localVarReturnType = new GenericType<GameCenterMatchmakingAppRequestsV1MetricResponse>() {};
    return apiClient.invokeAPI("MetricsApi.gameCenterDetailsRuleBasedMatchmakingRequestsGetMetrics", localVarPath, "GET", localVarQueryParams, null,
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
    return apiClient.invokeAPI("MetricsApi.gameCenterMatchmakingQueuesExperimentMatchmakingQueueSizesGetMetrics", localVarPath, "GET", localVarQueryParams, null,
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
    return apiClient.invokeAPI("MetricsApi.gameCenterMatchmakingQueuesExperimentMatchmakingRequestsGetMetrics", localVarPath, "GET", localVarQueryParams, null,
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
    return apiClient.invokeAPI("MetricsApi.gameCenterMatchmakingQueuesMatchmakingQueueSizesGetMetrics", localVarPath, "GET", localVarQueryParams, null,
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
    return apiClient.invokeAPI("MetricsApi.gameCenterMatchmakingQueuesMatchmakingRequestsGetMetrics", localVarPath, "GET", localVarQueryParams, null,
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
    return apiClient.invokeAPI("MetricsApi.gameCenterMatchmakingQueuesMatchmakingSessionsGetMetrics", localVarPath, "GET", localVarQueryParams, null,
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
   * @param filterGameCenterMatchmakingQueue filter by &#39;gameCenterMatchmakingQueue&#39; relationship dimension (optional)
   * @param sort comma-separated list of sort expressions; metrics will be sorted as specified (optional)
   * @return GameCenterMatchmakingBooleanRuleResultsV1MetricResponse
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
  public GameCenterMatchmakingBooleanRuleResultsV1MetricResponse gameCenterMatchmakingRulesMatchmakingBooleanRuleResultsGetMetrics(String id, String granularity, Integer limit, List<String> groupBy, String filterResult, String filterGameCenterMatchmakingQueue, List<String> sort) throws ApiException {
    return gameCenterMatchmakingRulesMatchmakingBooleanRuleResultsGetMetricsWithHttpInfo(id, granularity, limit, groupBy, filterResult, filterGameCenterMatchmakingQueue, sort).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param granularity the granularity of the per-group dataset (required)
   * @param limit maximum number of groups to return per page (optional)
   * @param groupBy the dimension by which to group the results (optional)
   * @param filterResult filter by &#39;result&#39; attribute dimension (optional)
   * @param filterGameCenterMatchmakingQueue filter by &#39;gameCenterMatchmakingQueue&#39; relationship dimension (optional)
   * @param sort comma-separated list of sort expressions; metrics will be sorted as specified (optional)
   * @return ApiResponse&lt;GameCenterMatchmakingBooleanRuleResultsV1MetricResponse&gt;
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
  public ApiResponse<GameCenterMatchmakingBooleanRuleResultsV1MetricResponse> gameCenterMatchmakingRulesMatchmakingBooleanRuleResultsGetMetricsWithHttpInfo(String id, String granularity, Integer limit, List<String> groupBy, String filterResult, String filterGameCenterMatchmakingQueue, List<String> sort) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterMatchmakingRulesMatchmakingBooleanRuleResultsGetMetrics");
    }
    if (granularity == null) {
      throw new ApiException(400, "Missing the required parameter 'granularity' when calling gameCenterMatchmakingRulesMatchmakingBooleanRuleResultsGetMetrics");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterMatchmakingRules/{id}/metrics/matchmakingBooleanRuleResults"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "limit", limit)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "granularity", granularity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "groupBy", groupBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[result]", filterResult));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[gameCenterMatchmakingQueue]", filterGameCenterMatchmakingQueue));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "sort", sort));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterMatchmakingBooleanRuleResultsV1MetricResponse> localVarReturnType = new GenericType<GameCenterMatchmakingBooleanRuleResultsV1MetricResponse>() {};
    return apiClient.invokeAPI("MetricsApi.gameCenterMatchmakingRulesMatchmakingBooleanRuleResultsGetMetrics", localVarPath, "GET", localVarQueryParams, null,
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
   * @param filterGameCenterMatchmakingQueue filter by &#39;gameCenterMatchmakingQueue&#39; relationship dimension (optional)
   * @param sort comma-separated list of sort expressions; metrics will be sorted as specified (optional)
   * @return GameCenterMatchmakingNumberRuleResultsV1MetricResponse
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
  public GameCenterMatchmakingNumberRuleResultsV1MetricResponse gameCenterMatchmakingRulesMatchmakingNumberRuleResultsGetMetrics(String id, String granularity, Integer limit, List<String> groupBy, String filterGameCenterMatchmakingQueue, List<String> sort) throws ApiException {
    return gameCenterMatchmakingRulesMatchmakingNumberRuleResultsGetMetricsWithHttpInfo(id, granularity, limit, groupBy, filterGameCenterMatchmakingQueue, sort).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param granularity the granularity of the per-group dataset (required)
   * @param limit maximum number of groups to return per page (optional)
   * @param groupBy the dimension by which to group the results (optional)
   * @param filterGameCenterMatchmakingQueue filter by &#39;gameCenterMatchmakingQueue&#39; relationship dimension (optional)
   * @param sort comma-separated list of sort expressions; metrics will be sorted as specified (optional)
   * @return ApiResponse&lt;GameCenterMatchmakingNumberRuleResultsV1MetricResponse&gt;
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
  public ApiResponse<GameCenterMatchmakingNumberRuleResultsV1MetricResponse> gameCenterMatchmakingRulesMatchmakingNumberRuleResultsGetMetricsWithHttpInfo(String id, String granularity, Integer limit, List<String> groupBy, String filterGameCenterMatchmakingQueue, List<String> sort) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterMatchmakingRulesMatchmakingNumberRuleResultsGetMetrics");
    }
    if (granularity == null) {
      throw new ApiException(400, "Missing the required parameter 'granularity' when calling gameCenterMatchmakingRulesMatchmakingNumberRuleResultsGetMetrics");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterMatchmakingRules/{id}/metrics/matchmakingNumberRuleResults"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "limit", limit)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "granularity", granularity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "groupBy", groupBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[gameCenterMatchmakingQueue]", filterGameCenterMatchmakingQueue));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "sort", sort));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterMatchmakingNumberRuleResultsV1MetricResponse> localVarReturnType = new GenericType<GameCenterMatchmakingNumberRuleResultsV1MetricResponse>() {};
    return apiClient.invokeAPI("MetricsApi.gameCenterMatchmakingRulesMatchmakingNumberRuleResultsGetMetrics", localVarPath, "GET", localVarQueryParams, null,
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
   * @param filterGameCenterMatchmakingQueue filter by &#39;gameCenterMatchmakingQueue&#39; relationship dimension (optional)
   * @param sort comma-separated list of sort expressions; metrics will be sorted as specified (optional)
   * @return GameCenterMatchmakingRuleErrorsV1MetricResponse
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
  public GameCenterMatchmakingRuleErrorsV1MetricResponse gameCenterMatchmakingRulesMatchmakingRuleErrorsGetMetrics(String id, String granularity, Integer limit, List<String> groupBy, String filterGameCenterMatchmakingQueue, List<String> sort) throws ApiException {
    return gameCenterMatchmakingRulesMatchmakingRuleErrorsGetMetricsWithHttpInfo(id, granularity, limit, groupBy, filterGameCenterMatchmakingQueue, sort).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param granularity the granularity of the per-group dataset (required)
   * @param limit maximum number of groups to return per page (optional)
   * @param groupBy the dimension by which to group the results (optional)
   * @param filterGameCenterMatchmakingQueue filter by &#39;gameCenterMatchmakingQueue&#39; relationship dimension (optional)
   * @param sort comma-separated list of sort expressions; metrics will be sorted as specified (optional)
   * @return ApiResponse&lt;GameCenterMatchmakingRuleErrorsV1MetricResponse&gt;
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
  public ApiResponse<GameCenterMatchmakingRuleErrorsV1MetricResponse> gameCenterMatchmakingRulesMatchmakingRuleErrorsGetMetricsWithHttpInfo(String id, String granularity, Integer limit, List<String> groupBy, String filterGameCenterMatchmakingQueue, List<String> sort) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterMatchmakingRulesMatchmakingRuleErrorsGetMetrics");
    }
    if (granularity == null) {
      throw new ApiException(400, "Missing the required parameter 'granularity' when calling gameCenterMatchmakingRulesMatchmakingRuleErrorsGetMetrics");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterMatchmakingRules/{id}/metrics/matchmakingRuleErrors"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "limit", limit)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "granularity", granularity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "groupBy", groupBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[gameCenterMatchmakingQueue]", filterGameCenterMatchmakingQueue));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "sort", sort));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterMatchmakingRuleErrorsV1MetricResponse> localVarReturnType = new GenericType<GameCenterMatchmakingRuleErrorsV1MetricResponse>() {};
    return apiClient.invokeAPI("MetricsApi.gameCenterMatchmakingRulesMatchmakingRuleErrorsGetMetrics", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
