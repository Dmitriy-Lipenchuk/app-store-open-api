package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.AppWithoutIncludesResponse;
import org.openapitools.client.model.AppsBetaTesterUsagesV1MetricResponse;
import org.openapitools.client.model.BetaGroupBetaTestersLinkagesRequest;
import org.openapitools.client.model.BetaGroupBetaTestersLinkagesResponse;
import org.openapitools.client.model.BetaGroupBuildsLinkagesRequest;
import org.openapitools.client.model.BetaGroupBuildsLinkagesResponse;
import org.openapitools.client.model.BetaGroupCreateRequest;
import org.openapitools.client.model.BetaGroupResponse;
import org.openapitools.client.model.BetaGroupUpdateRequest;
import org.openapitools.client.model.BetaGroupsResponse;
import org.openapitools.client.model.BetaTestersWithoutIncludesResponse;
import org.openapitools.client.model.BuildsWithoutIncludesResponse;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class BetaGroupsApi {
  private ApiClient apiClient;

  public BetaGroupsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BetaGroupsApi(ApiClient apiClient) {
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
  public AppWithoutIncludesResponse betaGroupsAppGetToOneRelated(String id, List<String> fieldsApps) throws ApiException {
    return betaGroupsAppGetToOneRelatedWithHttpInfo(id, fieldsApps).getData();
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
  public ApiResponse<AppWithoutIncludesResponse> betaGroupsAppGetToOneRelatedWithHttpInfo(String id, List<String> fieldsApps) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling betaGroupsAppGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/betaGroups/{id}/app"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[apps]", fieldsApps)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppWithoutIncludesResponse> localVarReturnType = new GenericType<AppWithoutIncludesResponse>() {};
    return apiClient.invokeAPI("BetaGroupsApi.betaGroupsAppGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
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
    return apiClient.invokeAPI("BetaGroupsApi.betaGroupsBetaTesterUsagesGetMetrics", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param betaGroupBetaTestersLinkagesRequest List of related linkages (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success (no content) </td><td>  -  </td></tr>
     </table>
   */
  public void betaGroupsBetaTestersCreateToManyRelationship(String id, BetaGroupBetaTestersLinkagesRequest betaGroupBetaTestersLinkagesRequest) throws ApiException {
    betaGroupsBetaTestersCreateToManyRelationshipWithHttpInfo(id, betaGroupBetaTestersLinkagesRequest);
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param betaGroupBetaTestersLinkagesRequest List of related linkages (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success (no content) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> betaGroupsBetaTestersCreateToManyRelationshipWithHttpInfo(String id, BetaGroupBetaTestersLinkagesRequest betaGroupBetaTestersLinkagesRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling betaGroupsBetaTestersCreateToManyRelationship");
    }
    if (betaGroupBetaTestersLinkagesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'betaGroupBetaTestersLinkagesRequest' when calling betaGroupsBetaTestersCreateToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/betaGroups/{id}/relationships/betaTesters"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("BetaGroupsApi.betaGroupsBetaTestersCreateToManyRelationship", localVarPath, "POST", new ArrayList<>(), betaGroupBetaTestersLinkagesRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param betaGroupBetaTestersLinkagesRequest List of related linkages (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success (no content) </td><td>  -  </td></tr>
     </table>
   */
  public void betaGroupsBetaTestersDeleteToManyRelationship(String id, BetaGroupBetaTestersLinkagesRequest betaGroupBetaTestersLinkagesRequest) throws ApiException {
    betaGroupsBetaTestersDeleteToManyRelationshipWithHttpInfo(id, betaGroupBetaTestersLinkagesRequest);
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param betaGroupBetaTestersLinkagesRequest List of related linkages (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success (no content) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> betaGroupsBetaTestersDeleteToManyRelationshipWithHttpInfo(String id, BetaGroupBetaTestersLinkagesRequest betaGroupBetaTestersLinkagesRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling betaGroupsBetaTestersDeleteToManyRelationship");
    }
    if (betaGroupBetaTestersLinkagesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'betaGroupBetaTestersLinkagesRequest' when calling betaGroupsBetaTestersDeleteToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/betaGroups/{id}/relationships/betaTesters"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("BetaGroupsApi.betaGroupsBetaTestersDeleteToManyRelationship", localVarPath, "DELETE", new ArrayList<>(), betaGroupBetaTestersLinkagesRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBetaTesters the fields to include for returned resources of type betaTesters (optional)
   * @param limit maximum resources per page (optional)
   * @return BetaTestersWithoutIncludesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of BetaTesters with get </td><td>  -  </td></tr>
     </table>
   */
  public BetaTestersWithoutIncludesResponse betaGroupsBetaTestersGetToManyRelated(String id, List<String> fieldsBetaTesters, Integer limit) throws ApiException {
    return betaGroupsBetaTestersGetToManyRelatedWithHttpInfo(id, fieldsBetaTesters, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBetaTesters the fields to include for returned resources of type betaTesters (optional)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;BetaTestersWithoutIncludesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of BetaTesters with get </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BetaTestersWithoutIncludesResponse> betaGroupsBetaTestersGetToManyRelatedWithHttpInfo(String id, List<String> fieldsBetaTesters, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling betaGroupsBetaTestersGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/betaGroups/{id}/betaTesters"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[betaTesters]", fieldsBetaTesters)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BetaTestersWithoutIncludesResponse> localVarReturnType = new GenericType<BetaTestersWithoutIncludesResponse>() {};
    return apiClient.invokeAPI("BetaGroupsApi.betaGroupsBetaTestersGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param limit maximum resources per page (optional)
   * @return BetaGroupBetaTestersLinkagesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of related linkages </td><td>  -  </td></tr>
     </table>
   */
  public BetaGroupBetaTestersLinkagesResponse betaGroupsBetaTestersGetToManyRelationship(String id, Integer limit) throws ApiException {
    return betaGroupsBetaTestersGetToManyRelationshipWithHttpInfo(id, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;BetaGroupBetaTestersLinkagesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of related linkages </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BetaGroupBetaTestersLinkagesResponse> betaGroupsBetaTestersGetToManyRelationshipWithHttpInfo(String id, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling betaGroupsBetaTestersGetToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/betaGroups/{id}/relationships/betaTesters"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "limit", limit)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BetaGroupBetaTestersLinkagesResponse> localVarReturnType = new GenericType<BetaGroupBetaTestersLinkagesResponse>() {};
    return apiClient.invokeAPI("BetaGroupsApi.betaGroupsBetaTestersGetToManyRelationship", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param betaGroupBuildsLinkagesRequest List of related linkages (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success (no content) </td><td>  -  </td></tr>
     </table>
   */
  public void betaGroupsBuildsCreateToManyRelationship(String id, BetaGroupBuildsLinkagesRequest betaGroupBuildsLinkagesRequest) throws ApiException {
    betaGroupsBuildsCreateToManyRelationshipWithHttpInfo(id, betaGroupBuildsLinkagesRequest);
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param betaGroupBuildsLinkagesRequest List of related linkages (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success (no content) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> betaGroupsBuildsCreateToManyRelationshipWithHttpInfo(String id, BetaGroupBuildsLinkagesRequest betaGroupBuildsLinkagesRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling betaGroupsBuildsCreateToManyRelationship");
    }
    if (betaGroupBuildsLinkagesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'betaGroupBuildsLinkagesRequest' when calling betaGroupsBuildsCreateToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/betaGroups/{id}/relationships/builds"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("BetaGroupsApi.betaGroupsBuildsCreateToManyRelationship", localVarPath, "POST", new ArrayList<>(), betaGroupBuildsLinkagesRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param betaGroupBuildsLinkagesRequest List of related linkages (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success (no content) </td><td>  -  </td></tr>
     </table>
   */
  public void betaGroupsBuildsDeleteToManyRelationship(String id, BetaGroupBuildsLinkagesRequest betaGroupBuildsLinkagesRequest) throws ApiException {
    betaGroupsBuildsDeleteToManyRelationshipWithHttpInfo(id, betaGroupBuildsLinkagesRequest);
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param betaGroupBuildsLinkagesRequest List of related linkages (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success (no content) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> betaGroupsBuildsDeleteToManyRelationshipWithHttpInfo(String id, BetaGroupBuildsLinkagesRequest betaGroupBuildsLinkagesRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling betaGroupsBuildsDeleteToManyRelationship");
    }
    if (betaGroupBuildsLinkagesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'betaGroupBuildsLinkagesRequest' when calling betaGroupsBuildsDeleteToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/betaGroups/{id}/relationships/builds"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("BetaGroupsApi.betaGroupsBuildsDeleteToManyRelationship", localVarPath, "DELETE", new ArrayList<>(), betaGroupBuildsLinkagesRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @param limit maximum resources per page (optional)
   * @return BuildsWithoutIncludesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of Builds with get </td><td>  -  </td></tr>
     </table>
   */
  public BuildsWithoutIncludesResponse betaGroupsBuildsGetToManyRelated(String id, List<String> fieldsBuilds, Integer limit) throws ApiException {
    return betaGroupsBuildsGetToManyRelatedWithHttpInfo(id, fieldsBuilds, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;BuildsWithoutIncludesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of Builds with get </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BuildsWithoutIncludesResponse> betaGroupsBuildsGetToManyRelatedWithHttpInfo(String id, List<String> fieldsBuilds, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling betaGroupsBuildsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/betaGroups/{id}/builds"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[builds]", fieldsBuilds)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BuildsWithoutIncludesResponse> localVarReturnType = new GenericType<BuildsWithoutIncludesResponse>() {};
    return apiClient.invokeAPI("BetaGroupsApi.betaGroupsBuildsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param limit maximum resources per page (optional)
   * @return BetaGroupBuildsLinkagesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of related linkages </td><td>  -  </td></tr>
     </table>
   */
  public BetaGroupBuildsLinkagesResponse betaGroupsBuildsGetToManyRelationship(String id, Integer limit) throws ApiException {
    return betaGroupsBuildsGetToManyRelationshipWithHttpInfo(id, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;BetaGroupBuildsLinkagesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of related linkages </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BetaGroupBuildsLinkagesResponse> betaGroupsBuildsGetToManyRelationshipWithHttpInfo(String id, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling betaGroupsBuildsGetToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/betaGroups/{id}/relationships/builds"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "limit", limit)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BetaGroupBuildsLinkagesResponse> localVarReturnType = new GenericType<BetaGroupBuildsLinkagesResponse>() {};
    return apiClient.invokeAPI("BetaGroupsApi.betaGroupsBuildsGetToManyRelationship", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param betaGroupCreateRequest BetaGroup representation (required)
   * @return BetaGroupResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single BetaGroup </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public BetaGroupResponse betaGroupsCreateInstance(BetaGroupCreateRequest betaGroupCreateRequest) throws ApiException {
    return betaGroupsCreateInstanceWithHttpInfo(betaGroupCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param betaGroupCreateRequest BetaGroup representation (required)
   * @return ApiResponse&lt;BetaGroupResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single BetaGroup </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BetaGroupResponse> betaGroupsCreateInstanceWithHttpInfo(BetaGroupCreateRequest betaGroupCreateRequest) throws ApiException {
    // Check required parameters
    if (betaGroupCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'betaGroupCreateRequest' when calling betaGroupsCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BetaGroupResponse> localVarReturnType = new GenericType<BetaGroupResponse>() {};
    return apiClient.invokeAPI("BetaGroupsApi.betaGroupsCreateInstance", "/v1/betaGroups", "POST", new ArrayList<>(), betaGroupCreateRequest,
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
  public void betaGroupsDeleteInstance(String id) throws ApiException {
    betaGroupsDeleteInstanceWithHttpInfo(id);
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
  public ApiResponse<Void> betaGroupsDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling betaGroupsDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/betaGroups/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("BetaGroupsApi.betaGroupsDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param filterIsInternalGroup filter by attribute &#39;isInternalGroup&#39; (optional)
   * @param filterName filter by attribute &#39;name&#39; (optional)
   * @param filterPublicLink filter by attribute &#39;publicLink&#39; (optional)
   * @param filterPublicLinkEnabled filter by attribute &#39;publicLinkEnabled&#39; (optional)
   * @param filterPublicLinkLimitEnabled filter by attribute &#39;publicLinkLimitEnabled&#39; (optional)
   * @param filterApp filter by id(s) of related &#39;app&#39; (optional)
   * @param filterBuilds filter by id(s) of related &#39;builds&#39; (optional)
   * @param filterId filter by id(s) (optional)
   * @param sort comma-separated list of sort expressions; resources will be sorted as specified (optional)
   * @param fieldsBetaGroups the fields to include for returned resources of type betaGroups (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsBetaTesters the fields to include for returned resources of type betaTesters (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @param limitBetaTesters maximum number of related betaTesters returned (when they are included) (optional)
   * @param limitBuilds maximum number of related builds returned (when they are included) (optional)
   * @return BetaGroupsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of BetaGroups </td><td>  -  </td></tr>
     </table>
   */
  public BetaGroupsResponse betaGroupsGetCollection(List<String> filterIsInternalGroup, List<String> filterName, List<String> filterPublicLink, List<String> filterPublicLinkEnabled, List<String> filterPublicLinkLimitEnabled, List<String> filterApp, List<String> filterBuilds, List<String> filterId, List<String> sort, List<String> fieldsBetaGroups, Integer limit, List<String> include, List<String> fieldsBetaTesters, List<String> fieldsApps, List<String> fieldsBuilds, Integer limitBetaTesters, Integer limitBuilds) throws ApiException {
    return betaGroupsGetCollectionWithHttpInfo(filterIsInternalGroup, filterName, filterPublicLink, filterPublicLinkEnabled, filterPublicLinkLimitEnabled, filterApp, filterBuilds, filterId, sort, fieldsBetaGroups, limit, include, fieldsBetaTesters, fieldsApps, fieldsBuilds, limitBetaTesters, limitBuilds).getData();
  }

  /**
   * 
   * 
   * @param filterIsInternalGroup filter by attribute &#39;isInternalGroup&#39; (optional)
   * @param filterName filter by attribute &#39;name&#39; (optional)
   * @param filterPublicLink filter by attribute &#39;publicLink&#39; (optional)
   * @param filterPublicLinkEnabled filter by attribute &#39;publicLinkEnabled&#39; (optional)
   * @param filterPublicLinkLimitEnabled filter by attribute &#39;publicLinkLimitEnabled&#39; (optional)
   * @param filterApp filter by id(s) of related &#39;app&#39; (optional)
   * @param filterBuilds filter by id(s) of related &#39;builds&#39; (optional)
   * @param filterId filter by id(s) (optional)
   * @param sort comma-separated list of sort expressions; resources will be sorted as specified (optional)
   * @param fieldsBetaGroups the fields to include for returned resources of type betaGroups (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsBetaTesters the fields to include for returned resources of type betaTesters (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @param limitBetaTesters maximum number of related betaTesters returned (when they are included) (optional)
   * @param limitBuilds maximum number of related builds returned (when they are included) (optional)
   * @return ApiResponse&lt;BetaGroupsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of BetaGroups </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BetaGroupsResponse> betaGroupsGetCollectionWithHttpInfo(List<String> filterIsInternalGroup, List<String> filterName, List<String> filterPublicLink, List<String> filterPublicLinkEnabled, List<String> filterPublicLinkLimitEnabled, List<String> filterApp, List<String> filterBuilds, List<String> filterId, List<String> sort, List<String> fieldsBetaGroups, Integer limit, List<String> include, List<String> fieldsBetaTesters, List<String> fieldsApps, List<String> fieldsBuilds, Integer limitBetaTesters, Integer limitBuilds) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[isInternalGroup]", filterIsInternalGroup)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[name]", filterName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[publicLink]", filterPublicLink));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[publicLinkEnabled]", filterPublicLinkEnabled));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[publicLinkLimitEnabled]", filterPublicLinkLimitEnabled));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[app]", filterApp));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[builds]", filterBuilds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[id]", filterId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[betaGroups]", fieldsBetaGroups));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[betaTesters]", fieldsBetaTesters));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[apps]", fieldsApps));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[builds]", fieldsBuilds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[betaTesters]", limitBetaTesters));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[builds]", limitBuilds));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BetaGroupsResponse> localVarReturnType = new GenericType<BetaGroupsResponse>() {};
    return apiClient.invokeAPI("BetaGroupsApi.betaGroupsGetCollection", "/v1/betaGroups", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBetaGroups the fields to include for returned resources of type betaGroups (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsBetaTesters the fields to include for returned resources of type betaTesters (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @param limitBetaTesters maximum number of related betaTesters returned (when they are included) (optional)
   * @param limitBuilds maximum number of related builds returned (when they are included) (optional)
   * @return BetaGroupResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single BetaGroup </td><td>  -  </td></tr>
     </table>
   */
  public BetaGroupResponse betaGroupsGetInstance(String id, List<String> fieldsBetaGroups, List<String> include, List<String> fieldsBetaTesters, List<String> fieldsApps, List<String> fieldsBuilds, Integer limitBetaTesters, Integer limitBuilds) throws ApiException {
    return betaGroupsGetInstanceWithHttpInfo(id, fieldsBetaGroups, include, fieldsBetaTesters, fieldsApps, fieldsBuilds, limitBetaTesters, limitBuilds).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBetaGroups the fields to include for returned resources of type betaGroups (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsBetaTesters the fields to include for returned resources of type betaTesters (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @param limitBetaTesters maximum number of related betaTesters returned (when they are included) (optional)
   * @param limitBuilds maximum number of related builds returned (when they are included) (optional)
   * @return ApiResponse&lt;BetaGroupResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single BetaGroup </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BetaGroupResponse> betaGroupsGetInstanceWithHttpInfo(String id, List<String> fieldsBetaGroups, List<String> include, List<String> fieldsBetaTesters, List<String> fieldsApps, List<String> fieldsBuilds, Integer limitBetaTesters, Integer limitBuilds) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling betaGroupsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/betaGroups/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[betaGroups]", fieldsBetaGroups)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[betaTesters]", fieldsBetaTesters));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[apps]", fieldsApps));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[builds]", fieldsBuilds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[betaTesters]", limitBetaTesters));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[builds]", limitBuilds));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BetaGroupResponse> localVarReturnType = new GenericType<BetaGroupResponse>() {};
    return apiClient.invokeAPI("BetaGroupsApi.betaGroupsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param betaGroupUpdateRequest BetaGroup representation (required)
   * @return BetaGroupResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single BetaGroup </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public BetaGroupResponse betaGroupsUpdateInstance(String id, BetaGroupUpdateRequest betaGroupUpdateRequest) throws ApiException {
    return betaGroupsUpdateInstanceWithHttpInfo(id, betaGroupUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param betaGroupUpdateRequest BetaGroup representation (required)
   * @return ApiResponse&lt;BetaGroupResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single BetaGroup </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BetaGroupResponse> betaGroupsUpdateInstanceWithHttpInfo(String id, BetaGroupUpdateRequest betaGroupUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling betaGroupsUpdateInstance");
    }
    if (betaGroupUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'betaGroupUpdateRequest' when calling betaGroupsUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/betaGroups/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BetaGroupResponse> localVarReturnType = new GenericType<BetaGroupResponse>() {};
    return apiClient.invokeAPI("BetaGroupsApi.betaGroupsUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), betaGroupUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
