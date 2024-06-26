package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.GameCenterMatchmakingBooleanRuleResultsV1MetricResponse;
import org.openapitools.client.model.GameCenterMatchmakingNumberRuleResultsV1MetricResponse;
import org.openapitools.client.model.GameCenterMatchmakingRuleCreateRequest;
import org.openapitools.client.model.GameCenterMatchmakingRuleErrorsV1MetricResponse;
import org.openapitools.client.model.GameCenterMatchmakingRuleResponse;
import org.openapitools.client.model.GameCenterMatchmakingRuleUpdateRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class GameCenterMatchmakingRulesApi {
  private ApiClient apiClient;

  public GameCenterMatchmakingRulesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GameCenterMatchmakingRulesApi(ApiClient apiClient) {
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
   * @param gameCenterMatchmakingRuleCreateRequest GameCenterMatchmakingRule representation (required)
   * @return GameCenterMatchmakingRuleResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single GameCenterMatchmakingRule </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterMatchmakingRuleResponse gameCenterMatchmakingRulesCreateInstance(GameCenterMatchmakingRuleCreateRequest gameCenterMatchmakingRuleCreateRequest) throws ApiException {
    return gameCenterMatchmakingRulesCreateInstanceWithHttpInfo(gameCenterMatchmakingRuleCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param gameCenterMatchmakingRuleCreateRequest GameCenterMatchmakingRule representation (required)
   * @return ApiResponse&lt;GameCenterMatchmakingRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single GameCenterMatchmakingRule </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterMatchmakingRuleResponse> gameCenterMatchmakingRulesCreateInstanceWithHttpInfo(GameCenterMatchmakingRuleCreateRequest gameCenterMatchmakingRuleCreateRequest) throws ApiException {
    // Check required parameters
    if (gameCenterMatchmakingRuleCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gameCenterMatchmakingRuleCreateRequest' when calling gameCenterMatchmakingRulesCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterMatchmakingRuleResponse> localVarReturnType = new GenericType<GameCenterMatchmakingRuleResponse>() {};
    return apiClient.invokeAPI("GameCenterMatchmakingRulesApi.gameCenterMatchmakingRulesCreateInstance", "/v1/gameCenterMatchmakingRules", "POST", new ArrayList<>(), gameCenterMatchmakingRuleCreateRequest,
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
  public void gameCenterMatchmakingRulesDeleteInstance(String id) throws ApiException {
    gameCenterMatchmakingRulesDeleteInstanceWithHttpInfo(id);
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
  public ApiResponse<Void> gameCenterMatchmakingRulesDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterMatchmakingRulesDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterMatchmakingRules/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("GameCenterMatchmakingRulesApi.gameCenterMatchmakingRulesDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
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
    return apiClient.invokeAPI("GameCenterMatchmakingRulesApi.gameCenterMatchmakingRulesMatchmakingBooleanRuleResultsGetMetrics", localVarPath, "GET", localVarQueryParams, null,
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
    return apiClient.invokeAPI("GameCenterMatchmakingRulesApi.gameCenterMatchmakingRulesMatchmakingNumberRuleResultsGetMetrics", localVarPath, "GET", localVarQueryParams, null,
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
    return apiClient.invokeAPI("GameCenterMatchmakingRulesApi.gameCenterMatchmakingRulesMatchmakingRuleErrorsGetMetrics", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterMatchmakingRuleUpdateRequest GameCenterMatchmakingRule representation (required)
   * @return GameCenterMatchmakingRuleResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterMatchmakingRule </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterMatchmakingRuleResponse gameCenterMatchmakingRulesUpdateInstance(String id, GameCenterMatchmakingRuleUpdateRequest gameCenterMatchmakingRuleUpdateRequest) throws ApiException {
    return gameCenterMatchmakingRulesUpdateInstanceWithHttpInfo(id, gameCenterMatchmakingRuleUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterMatchmakingRuleUpdateRequest GameCenterMatchmakingRule representation (required)
   * @return ApiResponse&lt;GameCenterMatchmakingRuleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterMatchmakingRule </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterMatchmakingRuleResponse> gameCenterMatchmakingRulesUpdateInstanceWithHttpInfo(String id, GameCenterMatchmakingRuleUpdateRequest gameCenterMatchmakingRuleUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterMatchmakingRulesUpdateInstance");
    }
    if (gameCenterMatchmakingRuleUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gameCenterMatchmakingRuleUpdateRequest' when calling gameCenterMatchmakingRulesUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterMatchmakingRules/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterMatchmakingRuleResponse> localVarReturnType = new GenericType<GameCenterMatchmakingRuleResponse>() {};
    return apiClient.invokeAPI("GameCenterMatchmakingRulesApi.gameCenterMatchmakingRulesUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), gameCenterMatchmakingRuleUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
