package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.GameCenterAchievementReleasesResponse;
import org.openapitools.client.model.GameCenterAchievementsResponse;
import org.openapitools.client.model.GameCenterAppVersionsResponse;
import org.openapitools.client.model.GameCenterDetailCreateRequest;
import org.openapitools.client.model.GameCenterDetailGameCenterAchievementsLinkagesRequest;
import org.openapitools.client.model.GameCenterDetailGameCenterAchievementsLinkagesResponse;
import org.openapitools.client.model.GameCenterDetailGameCenterLeaderboardSetsLinkagesRequest;
import org.openapitools.client.model.GameCenterDetailGameCenterLeaderboardSetsLinkagesResponse;
import org.openapitools.client.model.GameCenterDetailGameCenterLeaderboardsLinkagesRequest;
import org.openapitools.client.model.GameCenterDetailGameCenterLeaderboardsLinkagesResponse;
import org.openapitools.client.model.GameCenterDetailResponse;
import org.openapitools.client.model.GameCenterDetailUpdateRequest;
import org.openapitools.client.model.GameCenterGroupResponse;
import org.openapitools.client.model.GameCenterLeaderboardReleasesResponse;
import org.openapitools.client.model.GameCenterLeaderboardSetReleasesResponse;
import org.openapitools.client.model.GameCenterLeaderboardSetsResponse;
import org.openapitools.client.model.GameCenterLeaderboardsResponse;
import org.openapitools.client.model.GameCenterMatchmakingAppRequestsV1MetricResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class GameCenterDetailsApi {
  private ApiClient apiClient;

  public GameCenterDetailsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GameCenterDetailsApi(ApiClient apiClient) {
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
   * @param filterLive filter by attribute &#39;live&#39; (optional)
   * @param filterGameCenterAchievement filter by id(s) of related &#39;gameCenterAchievement&#39; (optional)
   * @param fieldsGameCenterAchievementReleases the fields to include for returned resources of type gameCenterAchievementReleases (optional)
   * @param fieldsGameCenterDetails the fields to include for returned resources of type gameCenterDetails (optional)
   * @param fieldsGameCenterAchievements the fields to include for returned resources of type gameCenterAchievements (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return GameCenterAchievementReleasesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of GameCenterAchievementReleases </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterAchievementReleasesResponse gameCenterDetailsAchievementReleasesGetToManyRelated(String id, List<String> filterLive, List<String> filterGameCenterAchievement, List<String> fieldsGameCenterAchievementReleases, List<String> fieldsGameCenterDetails, List<String> fieldsGameCenterAchievements, Integer limit, List<String> include) throws ApiException {
    return gameCenterDetailsAchievementReleasesGetToManyRelatedWithHttpInfo(id, filterLive, filterGameCenterAchievement, fieldsGameCenterAchievementReleases, fieldsGameCenterDetails, fieldsGameCenterAchievements, limit, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterLive filter by attribute &#39;live&#39; (optional)
   * @param filterGameCenterAchievement filter by id(s) of related &#39;gameCenterAchievement&#39; (optional)
   * @param fieldsGameCenterAchievementReleases the fields to include for returned resources of type gameCenterAchievementReleases (optional)
   * @param fieldsGameCenterDetails the fields to include for returned resources of type gameCenterDetails (optional)
   * @param fieldsGameCenterAchievements the fields to include for returned resources of type gameCenterAchievements (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;GameCenterAchievementReleasesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of GameCenterAchievementReleases </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterAchievementReleasesResponse> gameCenterDetailsAchievementReleasesGetToManyRelatedWithHttpInfo(String id, List<String> filterLive, List<String> filterGameCenterAchievement, List<String> fieldsGameCenterAchievementReleases, List<String> fieldsGameCenterDetails, List<String> fieldsGameCenterAchievements, Integer limit, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterDetailsAchievementReleasesGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterDetails/{id}/achievementReleases"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[live]", filterLive)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[gameCenterAchievement]", filterGameCenterAchievement));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterAchievementReleases]", fieldsGameCenterAchievementReleases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterDetails]", fieldsGameCenterDetails));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterAchievements]", fieldsGameCenterAchievements));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterAchievementReleasesResponse> localVarReturnType = new GenericType<GameCenterAchievementReleasesResponse>() {};
    return apiClient.invokeAPI("GameCenterDetailsApi.gameCenterDetailsAchievementReleasesGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
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
    return apiClient.invokeAPI("GameCenterDetailsApi.gameCenterDetailsClassicMatchmakingRequestsGetMetrics", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param gameCenterDetailCreateRequest GameCenterDetail representation (required)
   * @return GameCenterDetailResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single GameCenterDetail </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterDetailResponse gameCenterDetailsCreateInstance(GameCenterDetailCreateRequest gameCenterDetailCreateRequest) throws ApiException {
    return gameCenterDetailsCreateInstanceWithHttpInfo(gameCenterDetailCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param gameCenterDetailCreateRequest GameCenterDetail representation (required)
   * @return ApiResponse&lt;GameCenterDetailResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single GameCenterDetail </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterDetailResponse> gameCenterDetailsCreateInstanceWithHttpInfo(GameCenterDetailCreateRequest gameCenterDetailCreateRequest) throws ApiException {
    // Check required parameters
    if (gameCenterDetailCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gameCenterDetailCreateRequest' when calling gameCenterDetailsCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterDetailResponse> localVarReturnType = new GenericType<GameCenterDetailResponse>() {};
    return apiClient.invokeAPI("GameCenterDetailsApi.gameCenterDetailsCreateInstance", "/v1/gameCenterDetails", "POST", new ArrayList<>(), gameCenterDetailCreateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterArchived filter by attribute &#39;archived&#39; (optional)
   * @param filterReferenceName filter by attribute &#39;referenceName&#39; (optional)
   * @param filterId filter by id(s) (optional)
   * @param fieldsGameCenterAchievementReleases the fields to include for returned resources of type gameCenterAchievementReleases (optional)
   * @param fieldsGameCenterGroups the fields to include for returned resources of type gameCenterGroups (optional)
   * @param fieldsGameCenterDetails the fields to include for returned resources of type gameCenterDetails (optional)
   * @param fieldsGameCenterAchievementLocalizations the fields to include for returned resources of type gameCenterAchievementLocalizations (optional)
   * @param fieldsGameCenterAchievements the fields to include for returned resources of type gameCenterAchievements (optional)
   * @param limit maximum resources per page (optional)
   * @param limitLocalizations maximum number of related localizations returned (when they are included) (optional)
   * @param limitReleases maximum number of related releases returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return GameCenterAchievementsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of GameCenterAchievements </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterAchievementsResponse gameCenterDetailsGameCenterAchievementsGetToManyRelated(String id, List<String> filterArchived, List<String> filterReferenceName, List<String> filterId, List<String> fieldsGameCenterAchievementReleases, List<String> fieldsGameCenterGroups, List<String> fieldsGameCenterDetails, List<String> fieldsGameCenterAchievementLocalizations, List<String> fieldsGameCenterAchievements, Integer limit, Integer limitLocalizations, Integer limitReleases, List<String> include) throws ApiException {
    return gameCenterDetailsGameCenterAchievementsGetToManyRelatedWithHttpInfo(id, filterArchived, filterReferenceName, filterId, fieldsGameCenterAchievementReleases, fieldsGameCenterGroups, fieldsGameCenterDetails, fieldsGameCenterAchievementLocalizations, fieldsGameCenterAchievements, limit, limitLocalizations, limitReleases, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterArchived filter by attribute &#39;archived&#39; (optional)
   * @param filterReferenceName filter by attribute &#39;referenceName&#39; (optional)
   * @param filterId filter by id(s) (optional)
   * @param fieldsGameCenterAchievementReleases the fields to include for returned resources of type gameCenterAchievementReleases (optional)
   * @param fieldsGameCenterGroups the fields to include for returned resources of type gameCenterGroups (optional)
   * @param fieldsGameCenterDetails the fields to include for returned resources of type gameCenterDetails (optional)
   * @param fieldsGameCenterAchievementLocalizations the fields to include for returned resources of type gameCenterAchievementLocalizations (optional)
   * @param fieldsGameCenterAchievements the fields to include for returned resources of type gameCenterAchievements (optional)
   * @param limit maximum resources per page (optional)
   * @param limitLocalizations maximum number of related localizations returned (when they are included) (optional)
   * @param limitReleases maximum number of related releases returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;GameCenterAchievementsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of GameCenterAchievements </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterAchievementsResponse> gameCenterDetailsGameCenterAchievementsGetToManyRelatedWithHttpInfo(String id, List<String> filterArchived, List<String> filterReferenceName, List<String> filterId, List<String> fieldsGameCenterAchievementReleases, List<String> fieldsGameCenterGroups, List<String> fieldsGameCenterDetails, List<String> fieldsGameCenterAchievementLocalizations, List<String> fieldsGameCenterAchievements, Integer limit, Integer limitLocalizations, Integer limitReleases, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterDetailsGameCenterAchievementsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterDetails/{id}/gameCenterAchievements"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[archived]", filterArchived)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[referenceName]", filterReferenceName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[id]", filterId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterAchievementReleases]", fieldsGameCenterAchievementReleases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterGroups]", fieldsGameCenterGroups));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterDetails]", fieldsGameCenterDetails));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterAchievementLocalizations]", fieldsGameCenterAchievementLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterAchievements]", fieldsGameCenterAchievements));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[localizations]", limitLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[releases]", limitReleases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterAchievementsResponse> localVarReturnType = new GenericType<GameCenterAchievementsResponse>() {};
    return apiClient.invokeAPI("GameCenterDetailsApi.gameCenterDetailsGameCenterAchievementsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param limit maximum resources per page (optional)
   * @return GameCenterDetailGameCenterAchievementsLinkagesResponse
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
  public GameCenterDetailGameCenterAchievementsLinkagesResponse gameCenterDetailsGameCenterAchievementsGetToManyRelationship(String id, Integer limit) throws ApiException {
    return gameCenterDetailsGameCenterAchievementsGetToManyRelationshipWithHttpInfo(id, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;GameCenterDetailGameCenterAchievementsLinkagesResponse&gt;
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
  public ApiResponse<GameCenterDetailGameCenterAchievementsLinkagesResponse> gameCenterDetailsGameCenterAchievementsGetToManyRelationshipWithHttpInfo(String id, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterDetailsGameCenterAchievementsGetToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterDetails/{id}/relationships/gameCenterAchievements"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "limit", limit)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterDetailGameCenterAchievementsLinkagesResponse> localVarReturnType = new GenericType<GameCenterDetailGameCenterAchievementsLinkagesResponse>() {};
    return apiClient.invokeAPI("GameCenterDetailsApi.gameCenterDetailsGameCenterAchievementsGetToManyRelationship", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterDetailGameCenterAchievementsLinkagesRequest List of related linkages (required)
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
  public void gameCenterDetailsGameCenterAchievementsReplaceToManyRelationship(String id, GameCenterDetailGameCenterAchievementsLinkagesRequest gameCenterDetailGameCenterAchievementsLinkagesRequest) throws ApiException {
    gameCenterDetailsGameCenterAchievementsReplaceToManyRelationshipWithHttpInfo(id, gameCenterDetailGameCenterAchievementsLinkagesRequest);
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterDetailGameCenterAchievementsLinkagesRequest List of related linkages (required)
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
  public ApiResponse<Void> gameCenterDetailsGameCenterAchievementsReplaceToManyRelationshipWithHttpInfo(String id, GameCenterDetailGameCenterAchievementsLinkagesRequest gameCenterDetailGameCenterAchievementsLinkagesRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterDetailsGameCenterAchievementsReplaceToManyRelationship");
    }
    if (gameCenterDetailGameCenterAchievementsLinkagesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gameCenterDetailGameCenterAchievementsLinkagesRequest' when calling gameCenterDetailsGameCenterAchievementsReplaceToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterDetails/{id}/relationships/gameCenterAchievements"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("GameCenterDetailsApi.gameCenterDetailsGameCenterAchievementsReplaceToManyRelationship", localVarPath, "PATCH", new ArrayList<>(), gameCenterDetailGameCenterAchievementsLinkagesRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterEnabled filter by attribute &#39;enabled&#39; (optional)
   * @param fieldsAppStoreVersions the fields to include for returned resources of type appStoreVersions (optional)
   * @param fieldsGameCenterAppVersions the fields to include for returned resources of type gameCenterAppVersions (optional)
   * @param limit maximum resources per page (optional)
   * @param limitCompatibilityVersions maximum number of related compatibilityVersions returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return GameCenterAppVersionsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of GameCenterAppVersions </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterAppVersionsResponse gameCenterDetailsGameCenterAppVersionsGetToManyRelated(String id, List<String> filterEnabled, List<String> fieldsAppStoreVersions, List<String> fieldsGameCenterAppVersions, Integer limit, Integer limitCompatibilityVersions, List<String> include) throws ApiException {
    return gameCenterDetailsGameCenterAppVersionsGetToManyRelatedWithHttpInfo(id, filterEnabled, fieldsAppStoreVersions, fieldsGameCenterAppVersions, limit, limitCompatibilityVersions, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterEnabled filter by attribute &#39;enabled&#39; (optional)
   * @param fieldsAppStoreVersions the fields to include for returned resources of type appStoreVersions (optional)
   * @param fieldsGameCenterAppVersions the fields to include for returned resources of type gameCenterAppVersions (optional)
   * @param limit maximum resources per page (optional)
   * @param limitCompatibilityVersions maximum number of related compatibilityVersions returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;GameCenterAppVersionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of GameCenterAppVersions </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterAppVersionsResponse> gameCenterDetailsGameCenterAppVersionsGetToManyRelatedWithHttpInfo(String id, List<String> filterEnabled, List<String> fieldsAppStoreVersions, List<String> fieldsGameCenterAppVersions, Integer limit, Integer limitCompatibilityVersions, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterDetailsGameCenterAppVersionsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterDetails/{id}/gameCenterAppVersions"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[enabled]", filterEnabled)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersions]", fieldsAppStoreVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterAppVersions]", fieldsGameCenterAppVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[compatibilityVersions]", limitCompatibilityVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterAppVersionsResponse> localVarReturnType = new GenericType<GameCenterAppVersionsResponse>() {};
    return apiClient.invokeAPI("GameCenterDetailsApi.gameCenterDetailsGameCenterAppVersionsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterLeaderboardSets the fields to include for returned resources of type gameCenterLeaderboardSets (optional)
   * @param fieldsGameCenterGroups the fields to include for returned resources of type gameCenterGroups (optional)
   * @param fieldsGameCenterDetails the fields to include for returned resources of type gameCenterDetails (optional)
   * @param fieldsGameCenterLeaderboards the fields to include for returned resources of type gameCenterLeaderboards (optional)
   * @param fieldsGameCenterAchievements the fields to include for returned resources of type gameCenterAchievements (optional)
   * @param limitGameCenterDetails maximum number of related gameCenterDetails returned (when they are included) (optional)
   * @param limitGameCenterLeaderboards maximum number of related gameCenterLeaderboards returned (when they are included) (optional)
   * @param limitGameCenterLeaderboardSets maximum number of related gameCenterLeaderboardSets returned (when they are included) (optional)
   * @param limitGameCenterAchievements maximum number of related gameCenterAchievements returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return GameCenterGroupResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterGroup </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterGroupResponse gameCenterDetailsGameCenterGroupGetToOneRelated(String id, List<String> fieldsGameCenterLeaderboardSets, List<String> fieldsGameCenterGroups, List<String> fieldsGameCenterDetails, List<String> fieldsGameCenterLeaderboards, List<String> fieldsGameCenterAchievements, Integer limitGameCenterDetails, Integer limitGameCenterLeaderboards, Integer limitGameCenterLeaderboardSets, Integer limitGameCenterAchievements, List<String> include) throws ApiException {
    return gameCenterDetailsGameCenterGroupGetToOneRelatedWithHttpInfo(id, fieldsGameCenterLeaderboardSets, fieldsGameCenterGroups, fieldsGameCenterDetails, fieldsGameCenterLeaderboards, fieldsGameCenterAchievements, limitGameCenterDetails, limitGameCenterLeaderboards, limitGameCenterLeaderboardSets, limitGameCenterAchievements, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterLeaderboardSets the fields to include for returned resources of type gameCenterLeaderboardSets (optional)
   * @param fieldsGameCenterGroups the fields to include for returned resources of type gameCenterGroups (optional)
   * @param fieldsGameCenterDetails the fields to include for returned resources of type gameCenterDetails (optional)
   * @param fieldsGameCenterLeaderboards the fields to include for returned resources of type gameCenterLeaderboards (optional)
   * @param fieldsGameCenterAchievements the fields to include for returned resources of type gameCenterAchievements (optional)
   * @param limitGameCenterDetails maximum number of related gameCenterDetails returned (when they are included) (optional)
   * @param limitGameCenterLeaderboards maximum number of related gameCenterLeaderboards returned (when they are included) (optional)
   * @param limitGameCenterLeaderboardSets maximum number of related gameCenterLeaderboardSets returned (when they are included) (optional)
   * @param limitGameCenterAchievements maximum number of related gameCenterAchievements returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;GameCenterGroupResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterGroup </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterGroupResponse> gameCenterDetailsGameCenterGroupGetToOneRelatedWithHttpInfo(String id, List<String> fieldsGameCenterLeaderboardSets, List<String> fieldsGameCenterGroups, List<String> fieldsGameCenterDetails, List<String> fieldsGameCenterLeaderboards, List<String> fieldsGameCenterAchievements, Integer limitGameCenterDetails, Integer limitGameCenterLeaderboards, Integer limitGameCenterLeaderboardSets, Integer limitGameCenterAchievements, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterDetailsGameCenterGroupGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterDetails/{id}/gameCenterGroup"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardSets]", fieldsGameCenterLeaderboardSets)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterGroups]", fieldsGameCenterGroups));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterDetails]", fieldsGameCenterDetails));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboards]", fieldsGameCenterLeaderboards));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterAchievements]", fieldsGameCenterAchievements));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[gameCenterDetails]", limitGameCenterDetails));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[gameCenterLeaderboards]", limitGameCenterLeaderboards));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[gameCenterLeaderboardSets]", limitGameCenterLeaderboardSets));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[gameCenterAchievements]", limitGameCenterAchievements));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterGroupResponse> localVarReturnType = new GenericType<GameCenterGroupResponse>() {};
    return apiClient.invokeAPI("GameCenterDetailsApi.gameCenterDetailsGameCenterGroupGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterReferenceName filter by attribute &#39;referenceName&#39; (optional)
   * @param filterId filter by id(s) (optional)
   * @param fieldsGameCenterLeaderboardSetLocalizations the fields to include for returned resources of type gameCenterLeaderboardSetLocalizations (optional)
   * @param fieldsGameCenterLeaderboardSetReleases the fields to include for returned resources of type gameCenterLeaderboardSetReleases (optional)
   * @param fieldsGameCenterLeaderboardSets the fields to include for returned resources of type gameCenterLeaderboardSets (optional)
   * @param fieldsGameCenterGroups the fields to include for returned resources of type gameCenterGroups (optional)
   * @param fieldsGameCenterDetails the fields to include for returned resources of type gameCenterDetails (optional)
   * @param fieldsGameCenterLeaderboards the fields to include for returned resources of type gameCenterLeaderboards (optional)
   * @param limit maximum resources per page (optional)
   * @param limitLocalizations maximum number of related localizations returned (when they are included) (optional)
   * @param limitGameCenterLeaderboards maximum number of related gameCenterLeaderboards returned (when they are included) (optional)
   * @param limitReleases maximum number of related releases returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return GameCenterLeaderboardSetsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of GameCenterLeaderboardSets </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterLeaderboardSetsResponse gameCenterDetailsGameCenterLeaderboardSetsGetToManyRelated(String id, List<String> filterReferenceName, List<String> filterId, List<String> fieldsGameCenterLeaderboardSetLocalizations, List<String> fieldsGameCenterLeaderboardSetReleases, List<String> fieldsGameCenterLeaderboardSets, List<String> fieldsGameCenterGroups, List<String> fieldsGameCenterDetails, List<String> fieldsGameCenterLeaderboards, Integer limit, Integer limitLocalizations, Integer limitGameCenterLeaderboards, Integer limitReleases, List<String> include) throws ApiException {
    return gameCenterDetailsGameCenterLeaderboardSetsGetToManyRelatedWithHttpInfo(id, filterReferenceName, filterId, fieldsGameCenterLeaderboardSetLocalizations, fieldsGameCenterLeaderboardSetReleases, fieldsGameCenterLeaderboardSets, fieldsGameCenterGroups, fieldsGameCenterDetails, fieldsGameCenterLeaderboards, limit, limitLocalizations, limitGameCenterLeaderboards, limitReleases, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterReferenceName filter by attribute &#39;referenceName&#39; (optional)
   * @param filterId filter by id(s) (optional)
   * @param fieldsGameCenterLeaderboardSetLocalizations the fields to include for returned resources of type gameCenterLeaderboardSetLocalizations (optional)
   * @param fieldsGameCenterLeaderboardSetReleases the fields to include for returned resources of type gameCenterLeaderboardSetReleases (optional)
   * @param fieldsGameCenterLeaderboardSets the fields to include for returned resources of type gameCenterLeaderboardSets (optional)
   * @param fieldsGameCenterGroups the fields to include for returned resources of type gameCenterGroups (optional)
   * @param fieldsGameCenterDetails the fields to include for returned resources of type gameCenterDetails (optional)
   * @param fieldsGameCenterLeaderboards the fields to include for returned resources of type gameCenterLeaderboards (optional)
   * @param limit maximum resources per page (optional)
   * @param limitLocalizations maximum number of related localizations returned (when they are included) (optional)
   * @param limitGameCenterLeaderboards maximum number of related gameCenterLeaderboards returned (when they are included) (optional)
   * @param limitReleases maximum number of related releases returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;GameCenterLeaderboardSetsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of GameCenterLeaderboardSets </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterLeaderboardSetsResponse> gameCenterDetailsGameCenterLeaderboardSetsGetToManyRelatedWithHttpInfo(String id, List<String> filterReferenceName, List<String> filterId, List<String> fieldsGameCenterLeaderboardSetLocalizations, List<String> fieldsGameCenterLeaderboardSetReleases, List<String> fieldsGameCenterLeaderboardSets, List<String> fieldsGameCenterGroups, List<String> fieldsGameCenterDetails, List<String> fieldsGameCenterLeaderboards, Integer limit, Integer limitLocalizations, Integer limitGameCenterLeaderboards, Integer limitReleases, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterDetailsGameCenterLeaderboardSetsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterDetails/{id}/gameCenterLeaderboardSets"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[referenceName]", filterReferenceName)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[id]", filterId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardSetLocalizations]", fieldsGameCenterLeaderboardSetLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardSetReleases]", fieldsGameCenterLeaderboardSetReleases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardSets]", fieldsGameCenterLeaderboardSets));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterGroups]", fieldsGameCenterGroups));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterDetails]", fieldsGameCenterDetails));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboards]", fieldsGameCenterLeaderboards));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[localizations]", limitLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[gameCenterLeaderboards]", limitGameCenterLeaderboards));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[releases]", limitReleases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterLeaderboardSetsResponse> localVarReturnType = new GenericType<GameCenterLeaderboardSetsResponse>() {};
    return apiClient.invokeAPI("GameCenterDetailsApi.gameCenterDetailsGameCenterLeaderboardSetsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param limit maximum resources per page (optional)
   * @return GameCenterDetailGameCenterLeaderboardSetsLinkagesResponse
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
  public GameCenterDetailGameCenterLeaderboardSetsLinkagesResponse gameCenterDetailsGameCenterLeaderboardSetsGetToManyRelationship(String id, Integer limit) throws ApiException {
    return gameCenterDetailsGameCenterLeaderboardSetsGetToManyRelationshipWithHttpInfo(id, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;GameCenterDetailGameCenterLeaderboardSetsLinkagesResponse&gt;
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
  public ApiResponse<GameCenterDetailGameCenterLeaderboardSetsLinkagesResponse> gameCenterDetailsGameCenterLeaderboardSetsGetToManyRelationshipWithHttpInfo(String id, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterDetailsGameCenterLeaderboardSetsGetToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterDetails/{id}/relationships/gameCenterLeaderboardSets"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "limit", limit)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterDetailGameCenterLeaderboardSetsLinkagesResponse> localVarReturnType = new GenericType<GameCenterDetailGameCenterLeaderboardSetsLinkagesResponse>() {};
    return apiClient.invokeAPI("GameCenterDetailsApi.gameCenterDetailsGameCenterLeaderboardSetsGetToManyRelationship", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterDetailGameCenterLeaderboardSetsLinkagesRequest List of related linkages (required)
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
  public void gameCenterDetailsGameCenterLeaderboardSetsReplaceToManyRelationship(String id, GameCenterDetailGameCenterLeaderboardSetsLinkagesRequest gameCenterDetailGameCenterLeaderboardSetsLinkagesRequest) throws ApiException {
    gameCenterDetailsGameCenterLeaderboardSetsReplaceToManyRelationshipWithHttpInfo(id, gameCenterDetailGameCenterLeaderboardSetsLinkagesRequest);
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterDetailGameCenterLeaderboardSetsLinkagesRequest List of related linkages (required)
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
  public ApiResponse<Void> gameCenterDetailsGameCenterLeaderboardSetsReplaceToManyRelationshipWithHttpInfo(String id, GameCenterDetailGameCenterLeaderboardSetsLinkagesRequest gameCenterDetailGameCenterLeaderboardSetsLinkagesRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterDetailsGameCenterLeaderboardSetsReplaceToManyRelationship");
    }
    if (gameCenterDetailGameCenterLeaderboardSetsLinkagesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gameCenterDetailGameCenterLeaderboardSetsLinkagesRequest' when calling gameCenterDetailsGameCenterLeaderboardSetsReplaceToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterDetails/{id}/relationships/gameCenterLeaderboardSets"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("GameCenterDetailsApi.gameCenterDetailsGameCenterLeaderboardSetsReplaceToManyRelationship", localVarPath, "PATCH", new ArrayList<>(), gameCenterDetailGameCenterLeaderboardSetsLinkagesRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterArchived filter by attribute &#39;archived&#39; (optional)
   * @param filterReferenceName filter by attribute &#39;referenceName&#39; (optional)
   * @param filterId filter by id(s) (optional)
   * @param fieldsGameCenterLeaderboardLocalizations the fields to include for returned resources of type gameCenterLeaderboardLocalizations (optional)
   * @param fieldsGameCenterLeaderboardSets the fields to include for returned resources of type gameCenterLeaderboardSets (optional)
   * @param fieldsGameCenterGroups the fields to include for returned resources of type gameCenterGroups (optional)
   * @param fieldsGameCenterDetails the fields to include for returned resources of type gameCenterDetails (optional)
   * @param fieldsGameCenterLeaderboards the fields to include for returned resources of type gameCenterLeaderboards (optional)
   * @param fieldsGameCenterLeaderboardReleases the fields to include for returned resources of type gameCenterLeaderboardReleases (optional)
   * @param limit maximum resources per page (optional)
   * @param limitGameCenterLeaderboardSets maximum number of related gameCenterLeaderboardSets returned (when they are included) (optional)
   * @param limitLocalizations maximum number of related localizations returned (when they are included) (optional)
   * @param limitReleases maximum number of related releases returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return GameCenterLeaderboardsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of GameCenterLeaderboards </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterLeaderboardsResponse gameCenterDetailsGameCenterLeaderboardsGetToManyRelated(String id, List<String> filterArchived, List<String> filterReferenceName, List<String> filterId, List<String> fieldsGameCenterLeaderboardLocalizations, List<String> fieldsGameCenterLeaderboardSets, List<String> fieldsGameCenterGroups, List<String> fieldsGameCenterDetails, List<String> fieldsGameCenterLeaderboards, List<String> fieldsGameCenterLeaderboardReleases, Integer limit, Integer limitGameCenterLeaderboardSets, Integer limitLocalizations, Integer limitReleases, List<String> include) throws ApiException {
    return gameCenterDetailsGameCenterLeaderboardsGetToManyRelatedWithHttpInfo(id, filterArchived, filterReferenceName, filterId, fieldsGameCenterLeaderboardLocalizations, fieldsGameCenterLeaderboardSets, fieldsGameCenterGroups, fieldsGameCenterDetails, fieldsGameCenterLeaderboards, fieldsGameCenterLeaderboardReleases, limit, limitGameCenterLeaderboardSets, limitLocalizations, limitReleases, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterArchived filter by attribute &#39;archived&#39; (optional)
   * @param filterReferenceName filter by attribute &#39;referenceName&#39; (optional)
   * @param filterId filter by id(s) (optional)
   * @param fieldsGameCenterLeaderboardLocalizations the fields to include for returned resources of type gameCenterLeaderboardLocalizations (optional)
   * @param fieldsGameCenterLeaderboardSets the fields to include for returned resources of type gameCenterLeaderboardSets (optional)
   * @param fieldsGameCenterGroups the fields to include for returned resources of type gameCenterGroups (optional)
   * @param fieldsGameCenterDetails the fields to include for returned resources of type gameCenterDetails (optional)
   * @param fieldsGameCenterLeaderboards the fields to include for returned resources of type gameCenterLeaderboards (optional)
   * @param fieldsGameCenterLeaderboardReleases the fields to include for returned resources of type gameCenterLeaderboardReleases (optional)
   * @param limit maximum resources per page (optional)
   * @param limitGameCenterLeaderboardSets maximum number of related gameCenterLeaderboardSets returned (when they are included) (optional)
   * @param limitLocalizations maximum number of related localizations returned (when they are included) (optional)
   * @param limitReleases maximum number of related releases returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;GameCenterLeaderboardsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of GameCenterLeaderboards </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterLeaderboardsResponse> gameCenterDetailsGameCenterLeaderboardsGetToManyRelatedWithHttpInfo(String id, List<String> filterArchived, List<String> filterReferenceName, List<String> filterId, List<String> fieldsGameCenterLeaderboardLocalizations, List<String> fieldsGameCenterLeaderboardSets, List<String> fieldsGameCenterGroups, List<String> fieldsGameCenterDetails, List<String> fieldsGameCenterLeaderboards, List<String> fieldsGameCenterLeaderboardReleases, Integer limit, Integer limitGameCenterLeaderboardSets, Integer limitLocalizations, Integer limitReleases, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterDetailsGameCenterLeaderboardsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterDetails/{id}/gameCenterLeaderboards"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[archived]", filterArchived)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[referenceName]", filterReferenceName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[id]", filterId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardLocalizations]", fieldsGameCenterLeaderboardLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardSets]", fieldsGameCenterLeaderboardSets));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterGroups]", fieldsGameCenterGroups));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterDetails]", fieldsGameCenterDetails));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboards]", fieldsGameCenterLeaderboards));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardReleases]", fieldsGameCenterLeaderboardReleases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[gameCenterLeaderboardSets]", limitGameCenterLeaderboardSets));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[localizations]", limitLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[releases]", limitReleases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterLeaderboardsResponse> localVarReturnType = new GenericType<GameCenterLeaderboardsResponse>() {};
    return apiClient.invokeAPI("GameCenterDetailsApi.gameCenterDetailsGameCenterLeaderboardsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param limit maximum resources per page (optional)
   * @return GameCenterDetailGameCenterLeaderboardsLinkagesResponse
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
  public GameCenterDetailGameCenterLeaderboardsLinkagesResponse gameCenterDetailsGameCenterLeaderboardsGetToManyRelationship(String id, Integer limit) throws ApiException {
    return gameCenterDetailsGameCenterLeaderboardsGetToManyRelationshipWithHttpInfo(id, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;GameCenterDetailGameCenterLeaderboardsLinkagesResponse&gt;
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
  public ApiResponse<GameCenterDetailGameCenterLeaderboardsLinkagesResponse> gameCenterDetailsGameCenterLeaderboardsGetToManyRelationshipWithHttpInfo(String id, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterDetailsGameCenterLeaderboardsGetToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterDetails/{id}/relationships/gameCenterLeaderboards"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "limit", limit)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterDetailGameCenterLeaderboardsLinkagesResponse> localVarReturnType = new GenericType<GameCenterDetailGameCenterLeaderboardsLinkagesResponse>() {};
    return apiClient.invokeAPI("GameCenterDetailsApi.gameCenterDetailsGameCenterLeaderboardsGetToManyRelationship", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterDetailGameCenterLeaderboardsLinkagesRequest List of related linkages (required)
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
  public void gameCenterDetailsGameCenterLeaderboardsReplaceToManyRelationship(String id, GameCenterDetailGameCenterLeaderboardsLinkagesRequest gameCenterDetailGameCenterLeaderboardsLinkagesRequest) throws ApiException {
    gameCenterDetailsGameCenterLeaderboardsReplaceToManyRelationshipWithHttpInfo(id, gameCenterDetailGameCenterLeaderboardsLinkagesRequest);
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterDetailGameCenterLeaderboardsLinkagesRequest List of related linkages (required)
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
  public ApiResponse<Void> gameCenterDetailsGameCenterLeaderboardsReplaceToManyRelationshipWithHttpInfo(String id, GameCenterDetailGameCenterLeaderboardsLinkagesRequest gameCenterDetailGameCenterLeaderboardsLinkagesRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterDetailsGameCenterLeaderboardsReplaceToManyRelationship");
    }
    if (gameCenterDetailGameCenterLeaderboardsLinkagesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gameCenterDetailGameCenterLeaderboardsLinkagesRequest' when calling gameCenterDetailsGameCenterLeaderboardsReplaceToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterDetails/{id}/relationships/gameCenterLeaderboards"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("GameCenterDetailsApi.gameCenterDetailsGameCenterLeaderboardsReplaceToManyRelationship", localVarPath, "PATCH", new ArrayList<>(), gameCenterDetailGameCenterLeaderboardsLinkagesRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterDetails the fields to include for returned resources of type gameCenterDetails (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsGameCenterAchievementReleases the fields to include for returned resources of type gameCenterAchievementReleases (optional)
   * @param fieldsGameCenterLeaderboardSetReleases the fields to include for returned resources of type gameCenterLeaderboardSetReleases (optional)
   * @param fieldsGameCenterLeaderboardSets the fields to include for returned resources of type gameCenterLeaderboardSets (optional)
   * @param fieldsGameCenterGroups the fields to include for returned resources of type gameCenterGroups (optional)
   * @param fieldsGameCenterLeaderboards the fields to include for returned resources of type gameCenterLeaderboards (optional)
   * @param fieldsGameCenterAchievements the fields to include for returned resources of type gameCenterAchievements (optional)
   * @param fieldsGameCenterAppVersions the fields to include for returned resources of type gameCenterAppVersions (optional)
   * @param fieldsGameCenterLeaderboardReleases the fields to include for returned resources of type gameCenterLeaderboardReleases (optional)
   * @param limitAchievementReleases maximum number of related achievementReleases returned (when they are included) (optional)
   * @param limitGameCenterAchievements maximum number of related gameCenterAchievements returned (when they are included) (optional)
   * @param limitGameCenterAppVersions maximum number of related gameCenterAppVersions returned (when they are included) (optional)
   * @param limitGameCenterLeaderboardSets maximum number of related gameCenterLeaderboardSets returned (when they are included) (optional)
   * @param limitGameCenterLeaderboards maximum number of related gameCenterLeaderboards returned (when they are included) (optional)
   * @param limitLeaderboardReleases maximum number of related leaderboardReleases returned (when they are included) (optional)
   * @param limitLeaderboardSetReleases maximum number of related leaderboardSetReleases returned (when they are included) (optional)
   * @return GameCenterDetailResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterDetail </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterDetailResponse gameCenterDetailsGetInstance(String id, List<String> fieldsGameCenterDetails, List<String> include, List<String> fieldsGameCenterAchievementReleases, List<String> fieldsGameCenterLeaderboardSetReleases, List<String> fieldsGameCenterLeaderboardSets, List<String> fieldsGameCenterGroups, List<String> fieldsGameCenterLeaderboards, List<String> fieldsGameCenterAchievements, List<String> fieldsGameCenterAppVersions, List<String> fieldsGameCenterLeaderboardReleases, Integer limitAchievementReleases, Integer limitGameCenterAchievements, Integer limitGameCenterAppVersions, Integer limitGameCenterLeaderboardSets, Integer limitGameCenterLeaderboards, Integer limitLeaderboardReleases, Integer limitLeaderboardSetReleases) throws ApiException {
    return gameCenterDetailsGetInstanceWithHttpInfo(id, fieldsGameCenterDetails, include, fieldsGameCenterAchievementReleases, fieldsGameCenterLeaderboardSetReleases, fieldsGameCenterLeaderboardSets, fieldsGameCenterGroups, fieldsGameCenterLeaderboards, fieldsGameCenterAchievements, fieldsGameCenterAppVersions, fieldsGameCenterLeaderboardReleases, limitAchievementReleases, limitGameCenterAchievements, limitGameCenterAppVersions, limitGameCenterLeaderboardSets, limitGameCenterLeaderboards, limitLeaderboardReleases, limitLeaderboardSetReleases).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterDetails the fields to include for returned resources of type gameCenterDetails (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsGameCenterAchievementReleases the fields to include for returned resources of type gameCenterAchievementReleases (optional)
   * @param fieldsGameCenterLeaderboardSetReleases the fields to include for returned resources of type gameCenterLeaderboardSetReleases (optional)
   * @param fieldsGameCenterLeaderboardSets the fields to include for returned resources of type gameCenterLeaderboardSets (optional)
   * @param fieldsGameCenterGroups the fields to include for returned resources of type gameCenterGroups (optional)
   * @param fieldsGameCenterLeaderboards the fields to include for returned resources of type gameCenterLeaderboards (optional)
   * @param fieldsGameCenterAchievements the fields to include for returned resources of type gameCenterAchievements (optional)
   * @param fieldsGameCenterAppVersions the fields to include for returned resources of type gameCenterAppVersions (optional)
   * @param fieldsGameCenterLeaderboardReleases the fields to include for returned resources of type gameCenterLeaderboardReleases (optional)
   * @param limitAchievementReleases maximum number of related achievementReleases returned (when they are included) (optional)
   * @param limitGameCenterAchievements maximum number of related gameCenterAchievements returned (when they are included) (optional)
   * @param limitGameCenterAppVersions maximum number of related gameCenterAppVersions returned (when they are included) (optional)
   * @param limitGameCenterLeaderboardSets maximum number of related gameCenterLeaderboardSets returned (when they are included) (optional)
   * @param limitGameCenterLeaderboards maximum number of related gameCenterLeaderboards returned (when they are included) (optional)
   * @param limitLeaderboardReleases maximum number of related leaderboardReleases returned (when they are included) (optional)
   * @param limitLeaderboardSetReleases maximum number of related leaderboardSetReleases returned (when they are included) (optional)
   * @return ApiResponse&lt;GameCenterDetailResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterDetail </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterDetailResponse> gameCenterDetailsGetInstanceWithHttpInfo(String id, List<String> fieldsGameCenterDetails, List<String> include, List<String> fieldsGameCenterAchievementReleases, List<String> fieldsGameCenterLeaderboardSetReleases, List<String> fieldsGameCenterLeaderboardSets, List<String> fieldsGameCenterGroups, List<String> fieldsGameCenterLeaderboards, List<String> fieldsGameCenterAchievements, List<String> fieldsGameCenterAppVersions, List<String> fieldsGameCenterLeaderboardReleases, Integer limitAchievementReleases, Integer limitGameCenterAchievements, Integer limitGameCenterAppVersions, Integer limitGameCenterLeaderboardSets, Integer limitGameCenterLeaderboards, Integer limitLeaderboardReleases, Integer limitLeaderboardSetReleases) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterDetailsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterDetails/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[gameCenterDetails]", fieldsGameCenterDetails)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterAchievementReleases]", fieldsGameCenterAchievementReleases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardSetReleases]", fieldsGameCenterLeaderboardSetReleases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardSets]", fieldsGameCenterLeaderboardSets));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterGroups]", fieldsGameCenterGroups));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboards]", fieldsGameCenterLeaderboards));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterAchievements]", fieldsGameCenterAchievements));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterAppVersions]", fieldsGameCenterAppVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardReleases]", fieldsGameCenterLeaderboardReleases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[achievementReleases]", limitAchievementReleases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[gameCenterAchievements]", limitGameCenterAchievements));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[gameCenterAppVersions]", limitGameCenterAppVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[gameCenterLeaderboardSets]", limitGameCenterLeaderboardSets));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[gameCenterLeaderboards]", limitGameCenterLeaderboards));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[leaderboardReleases]", limitLeaderboardReleases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[leaderboardSetReleases]", limitLeaderboardSetReleases));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterDetailResponse> localVarReturnType = new GenericType<GameCenterDetailResponse>() {};
    return apiClient.invokeAPI("GameCenterDetailsApi.gameCenterDetailsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterLive filter by attribute &#39;live&#39; (optional)
   * @param filterGameCenterLeaderboard filter by id(s) of related &#39;gameCenterLeaderboard&#39; (optional)
   * @param fieldsGameCenterDetails the fields to include for returned resources of type gameCenterDetails (optional)
   * @param fieldsGameCenterLeaderboards the fields to include for returned resources of type gameCenterLeaderboards (optional)
   * @param fieldsGameCenterLeaderboardReleases the fields to include for returned resources of type gameCenterLeaderboardReleases (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return GameCenterLeaderboardReleasesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of GameCenterLeaderboardReleases </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterLeaderboardReleasesResponse gameCenterDetailsLeaderboardReleasesGetToManyRelated(String id, List<String> filterLive, List<String> filterGameCenterLeaderboard, List<String> fieldsGameCenterDetails, List<String> fieldsGameCenterLeaderboards, List<String> fieldsGameCenterLeaderboardReleases, Integer limit, List<String> include) throws ApiException {
    return gameCenterDetailsLeaderboardReleasesGetToManyRelatedWithHttpInfo(id, filterLive, filterGameCenterLeaderboard, fieldsGameCenterDetails, fieldsGameCenterLeaderboards, fieldsGameCenterLeaderboardReleases, limit, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterLive filter by attribute &#39;live&#39; (optional)
   * @param filterGameCenterLeaderboard filter by id(s) of related &#39;gameCenterLeaderboard&#39; (optional)
   * @param fieldsGameCenterDetails the fields to include for returned resources of type gameCenterDetails (optional)
   * @param fieldsGameCenterLeaderboards the fields to include for returned resources of type gameCenterLeaderboards (optional)
   * @param fieldsGameCenterLeaderboardReleases the fields to include for returned resources of type gameCenterLeaderboardReleases (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;GameCenterLeaderboardReleasesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of GameCenterLeaderboardReleases </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterLeaderboardReleasesResponse> gameCenterDetailsLeaderboardReleasesGetToManyRelatedWithHttpInfo(String id, List<String> filterLive, List<String> filterGameCenterLeaderboard, List<String> fieldsGameCenterDetails, List<String> fieldsGameCenterLeaderboards, List<String> fieldsGameCenterLeaderboardReleases, Integer limit, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterDetailsLeaderboardReleasesGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterDetails/{id}/leaderboardReleases"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[live]", filterLive)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[gameCenterLeaderboard]", filterGameCenterLeaderboard));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterDetails]", fieldsGameCenterDetails));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboards]", fieldsGameCenterLeaderboards));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardReleases]", fieldsGameCenterLeaderboardReleases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterLeaderboardReleasesResponse> localVarReturnType = new GenericType<GameCenterLeaderboardReleasesResponse>() {};
    return apiClient.invokeAPI("GameCenterDetailsApi.gameCenterDetailsLeaderboardReleasesGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterLive filter by attribute &#39;live&#39; (optional)
   * @param filterGameCenterLeaderboardSet filter by id(s) of related &#39;gameCenterLeaderboardSet&#39; (optional)
   * @param fieldsGameCenterLeaderboardSetReleases the fields to include for returned resources of type gameCenterLeaderboardSetReleases (optional)
   * @param fieldsGameCenterLeaderboardSets the fields to include for returned resources of type gameCenterLeaderboardSets (optional)
   * @param fieldsGameCenterDetails the fields to include for returned resources of type gameCenterDetails (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return GameCenterLeaderboardSetReleasesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of GameCenterLeaderboardSetReleases </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterLeaderboardSetReleasesResponse gameCenterDetailsLeaderboardSetReleasesGetToManyRelated(String id, List<String> filterLive, List<String> filterGameCenterLeaderboardSet, List<String> fieldsGameCenterLeaderboardSetReleases, List<String> fieldsGameCenterLeaderboardSets, List<String> fieldsGameCenterDetails, Integer limit, List<String> include) throws ApiException {
    return gameCenterDetailsLeaderboardSetReleasesGetToManyRelatedWithHttpInfo(id, filterLive, filterGameCenterLeaderboardSet, fieldsGameCenterLeaderboardSetReleases, fieldsGameCenterLeaderboardSets, fieldsGameCenterDetails, limit, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterLive filter by attribute &#39;live&#39; (optional)
   * @param filterGameCenterLeaderboardSet filter by id(s) of related &#39;gameCenterLeaderboardSet&#39; (optional)
   * @param fieldsGameCenterLeaderboardSetReleases the fields to include for returned resources of type gameCenterLeaderboardSetReleases (optional)
   * @param fieldsGameCenterLeaderboardSets the fields to include for returned resources of type gameCenterLeaderboardSets (optional)
   * @param fieldsGameCenterDetails the fields to include for returned resources of type gameCenterDetails (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;GameCenterLeaderboardSetReleasesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of GameCenterLeaderboardSetReleases </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterLeaderboardSetReleasesResponse> gameCenterDetailsLeaderboardSetReleasesGetToManyRelatedWithHttpInfo(String id, List<String> filterLive, List<String> filterGameCenterLeaderboardSet, List<String> fieldsGameCenterLeaderboardSetReleases, List<String> fieldsGameCenterLeaderboardSets, List<String> fieldsGameCenterDetails, Integer limit, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterDetailsLeaderboardSetReleasesGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterDetails/{id}/leaderboardSetReleases"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[live]", filterLive)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[gameCenterLeaderboardSet]", filterGameCenterLeaderboardSet));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardSetReleases]", fieldsGameCenterLeaderboardSetReleases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardSets]", fieldsGameCenterLeaderboardSets));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterDetails]", fieldsGameCenterDetails));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterLeaderboardSetReleasesResponse> localVarReturnType = new GenericType<GameCenterLeaderboardSetReleasesResponse>() {};
    return apiClient.invokeAPI("GameCenterDetailsApi.gameCenterDetailsLeaderboardSetReleasesGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
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
    return apiClient.invokeAPI("GameCenterDetailsApi.gameCenterDetailsRuleBasedMatchmakingRequestsGetMetrics", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterDetailUpdateRequest GameCenterDetail representation (required)
   * @return GameCenterDetailResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterDetail </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterDetailResponse gameCenterDetailsUpdateInstance(String id, GameCenterDetailUpdateRequest gameCenterDetailUpdateRequest) throws ApiException {
    return gameCenterDetailsUpdateInstanceWithHttpInfo(id, gameCenterDetailUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterDetailUpdateRequest GameCenterDetail representation (required)
   * @return ApiResponse&lt;GameCenterDetailResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterDetail </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterDetailResponse> gameCenterDetailsUpdateInstanceWithHttpInfo(String id, GameCenterDetailUpdateRequest gameCenterDetailUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterDetailsUpdateInstance");
    }
    if (gameCenterDetailUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gameCenterDetailUpdateRequest' when calling gameCenterDetailsUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterDetails/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterDetailResponse> localVarReturnType = new GenericType<GameCenterDetailResponse>() {};
    return apiClient.invokeAPI("GameCenterDetailsApi.gameCenterDetailsUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), gameCenterDetailUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
