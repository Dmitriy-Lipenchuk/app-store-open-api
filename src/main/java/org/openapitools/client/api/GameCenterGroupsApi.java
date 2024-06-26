package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.GameCenterAchievementsResponse;
import org.openapitools.client.model.GameCenterDetailsResponse;
import org.openapitools.client.model.GameCenterGroupCreateRequest;
import org.openapitools.client.model.GameCenterGroupGameCenterAchievementsLinkagesRequest;
import org.openapitools.client.model.GameCenterGroupGameCenterAchievementsLinkagesResponse;
import org.openapitools.client.model.GameCenterGroupGameCenterLeaderboardSetsLinkagesRequest;
import org.openapitools.client.model.GameCenterGroupGameCenterLeaderboardSetsLinkagesResponse;
import org.openapitools.client.model.GameCenterGroupGameCenterLeaderboardsLinkagesRequest;
import org.openapitools.client.model.GameCenterGroupGameCenterLeaderboardsLinkagesResponse;
import org.openapitools.client.model.GameCenterGroupResponse;
import org.openapitools.client.model.GameCenterGroupUpdateRequest;
import org.openapitools.client.model.GameCenterGroupsResponse;
import org.openapitools.client.model.GameCenterLeaderboardSetsResponse;
import org.openapitools.client.model.GameCenterLeaderboardsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class GameCenterGroupsApi {
  private ApiClient apiClient;

  public GameCenterGroupsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GameCenterGroupsApi(ApiClient apiClient) {
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
   * @param gameCenterGroupCreateRequest GameCenterGroup representation (required)
   * @return GameCenterGroupResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single GameCenterGroup </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterGroupResponse gameCenterGroupsCreateInstance(GameCenterGroupCreateRequest gameCenterGroupCreateRequest) throws ApiException {
    return gameCenterGroupsCreateInstanceWithHttpInfo(gameCenterGroupCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param gameCenterGroupCreateRequest GameCenterGroup representation (required)
   * @return ApiResponse&lt;GameCenterGroupResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single GameCenterGroup </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterGroupResponse> gameCenterGroupsCreateInstanceWithHttpInfo(GameCenterGroupCreateRequest gameCenterGroupCreateRequest) throws ApiException {
    // Check required parameters
    if (gameCenterGroupCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gameCenterGroupCreateRequest' when calling gameCenterGroupsCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterGroupResponse> localVarReturnType = new GenericType<GameCenterGroupResponse>() {};
    return apiClient.invokeAPI("GameCenterGroupsApi.gameCenterGroupsCreateInstance", "/v1/gameCenterGroups", "POST", new ArrayList<>(), gameCenterGroupCreateRequest,
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
  public void gameCenterGroupsDeleteInstance(String id) throws ApiException {
    gameCenterGroupsDeleteInstanceWithHttpInfo(id);
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
  public ApiResponse<Void> gameCenterGroupsDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterGroupsDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterGroups/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("GameCenterGroupsApi.gameCenterGroupsDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
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
  public GameCenterAchievementsResponse gameCenterGroupsGameCenterAchievementsGetToManyRelated(String id, List<String> filterArchived, List<String> filterReferenceName, List<String> filterId, List<String> fieldsGameCenterAchievementReleases, List<String> fieldsGameCenterGroups, List<String> fieldsGameCenterDetails, List<String> fieldsGameCenterAchievementLocalizations, List<String> fieldsGameCenterAchievements, Integer limit, Integer limitLocalizations, Integer limitReleases, List<String> include) throws ApiException {
    return gameCenterGroupsGameCenterAchievementsGetToManyRelatedWithHttpInfo(id, filterArchived, filterReferenceName, filterId, fieldsGameCenterAchievementReleases, fieldsGameCenterGroups, fieldsGameCenterDetails, fieldsGameCenterAchievementLocalizations, fieldsGameCenterAchievements, limit, limitLocalizations, limitReleases, include).getData();
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
  public ApiResponse<GameCenterAchievementsResponse> gameCenterGroupsGameCenterAchievementsGetToManyRelatedWithHttpInfo(String id, List<String> filterArchived, List<String> filterReferenceName, List<String> filterId, List<String> fieldsGameCenterAchievementReleases, List<String> fieldsGameCenterGroups, List<String> fieldsGameCenterDetails, List<String> fieldsGameCenterAchievementLocalizations, List<String> fieldsGameCenterAchievements, Integer limit, Integer limitLocalizations, Integer limitReleases, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterGroupsGameCenterAchievementsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterGroups/{id}/gameCenterAchievements"
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
    return apiClient.invokeAPI("GameCenterGroupsApi.gameCenterGroupsGameCenterAchievementsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param limit maximum resources per page (optional)
   * @return GameCenterGroupGameCenterAchievementsLinkagesResponse
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
  public GameCenterGroupGameCenterAchievementsLinkagesResponse gameCenterGroupsGameCenterAchievementsGetToManyRelationship(String id, Integer limit) throws ApiException {
    return gameCenterGroupsGameCenterAchievementsGetToManyRelationshipWithHttpInfo(id, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;GameCenterGroupGameCenterAchievementsLinkagesResponse&gt;
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
  public ApiResponse<GameCenterGroupGameCenterAchievementsLinkagesResponse> gameCenterGroupsGameCenterAchievementsGetToManyRelationshipWithHttpInfo(String id, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterGroupsGameCenterAchievementsGetToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterGroups/{id}/relationships/gameCenterAchievements"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "limit", limit)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterGroupGameCenterAchievementsLinkagesResponse> localVarReturnType = new GenericType<GameCenterGroupGameCenterAchievementsLinkagesResponse>() {};
    return apiClient.invokeAPI("GameCenterGroupsApi.gameCenterGroupsGameCenterAchievementsGetToManyRelationship", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterGroupGameCenterAchievementsLinkagesRequest List of related linkages (required)
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
  public void gameCenterGroupsGameCenterAchievementsReplaceToManyRelationship(String id, GameCenterGroupGameCenterAchievementsLinkagesRequest gameCenterGroupGameCenterAchievementsLinkagesRequest) throws ApiException {
    gameCenterGroupsGameCenterAchievementsReplaceToManyRelationshipWithHttpInfo(id, gameCenterGroupGameCenterAchievementsLinkagesRequest);
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterGroupGameCenterAchievementsLinkagesRequest List of related linkages (required)
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
  public ApiResponse<Void> gameCenterGroupsGameCenterAchievementsReplaceToManyRelationshipWithHttpInfo(String id, GameCenterGroupGameCenterAchievementsLinkagesRequest gameCenterGroupGameCenterAchievementsLinkagesRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterGroupsGameCenterAchievementsReplaceToManyRelationship");
    }
    if (gameCenterGroupGameCenterAchievementsLinkagesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gameCenterGroupGameCenterAchievementsLinkagesRequest' when calling gameCenterGroupsGameCenterAchievementsReplaceToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterGroups/{id}/relationships/gameCenterAchievements"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("GameCenterGroupsApi.gameCenterGroupsGameCenterAchievementsReplaceToManyRelationship", localVarPath, "PATCH", new ArrayList<>(), gameCenterGroupGameCenterAchievementsLinkagesRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterGameCenterAppVersionsEnabled filter by attribute &#39;gameCenterAppVersions.enabled&#39; (optional)
   * @param fieldsGameCenterAchievementReleases the fields to include for returned resources of type gameCenterAchievementReleases (optional)
   * @param fieldsGameCenterLeaderboardSetReleases the fields to include for returned resources of type gameCenterLeaderboardSetReleases (optional)
   * @param fieldsGameCenterLeaderboardSets the fields to include for returned resources of type gameCenterLeaderboardSets (optional)
   * @param fieldsGameCenterGroups the fields to include for returned resources of type gameCenterGroups (optional)
   * @param fieldsGameCenterDetails the fields to include for returned resources of type gameCenterDetails (optional)
   * @param fieldsGameCenterLeaderboards the fields to include for returned resources of type gameCenterLeaderboards (optional)
   * @param fieldsGameCenterAppVersions the fields to include for returned resources of type gameCenterAppVersions (optional)
   * @param fieldsGameCenterAchievements the fields to include for returned resources of type gameCenterAchievements (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param fieldsGameCenterLeaderboardReleases the fields to include for returned resources of type gameCenterLeaderboardReleases (optional)
   * @param limit maximum resources per page (optional)
   * @param limitGameCenterAppVersions maximum number of related gameCenterAppVersions returned (when they are included) (optional)
   * @param limitGameCenterLeaderboards maximum number of related gameCenterLeaderboards returned (when they are included) (optional)
   * @param limitGameCenterLeaderboardSets maximum number of related gameCenterLeaderboardSets returned (when they are included) (optional)
   * @param limitGameCenterAchievements maximum number of related gameCenterAchievements returned (when they are included) (optional)
   * @param limitAchievementReleases maximum number of related achievementReleases returned (when they are included) (optional)
   * @param limitLeaderboardReleases maximum number of related leaderboardReleases returned (when they are included) (optional)
   * @param limitLeaderboardSetReleases maximum number of related leaderboardSetReleases returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return GameCenterDetailsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of GameCenterDetails </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterDetailsResponse gameCenterGroupsGameCenterDetailsGetToManyRelated(String id, List<String> filterGameCenterAppVersionsEnabled, List<String> fieldsGameCenterAchievementReleases, List<String> fieldsGameCenterLeaderboardSetReleases, List<String> fieldsGameCenterLeaderboardSets, List<String> fieldsGameCenterGroups, List<String> fieldsGameCenterDetails, List<String> fieldsGameCenterLeaderboards, List<String> fieldsGameCenterAppVersions, List<String> fieldsGameCenterAchievements, List<String> fieldsApps, List<String> fieldsGameCenterLeaderboardReleases, Integer limit, Integer limitGameCenterAppVersions, Integer limitGameCenterLeaderboards, Integer limitGameCenterLeaderboardSets, Integer limitGameCenterAchievements, Integer limitAchievementReleases, Integer limitLeaderboardReleases, Integer limitLeaderboardSetReleases, List<String> include) throws ApiException {
    return gameCenterGroupsGameCenterDetailsGetToManyRelatedWithHttpInfo(id, filterGameCenterAppVersionsEnabled, fieldsGameCenterAchievementReleases, fieldsGameCenterLeaderboardSetReleases, fieldsGameCenterLeaderboardSets, fieldsGameCenterGroups, fieldsGameCenterDetails, fieldsGameCenterLeaderboards, fieldsGameCenterAppVersions, fieldsGameCenterAchievements, fieldsApps, fieldsGameCenterLeaderboardReleases, limit, limitGameCenterAppVersions, limitGameCenterLeaderboards, limitGameCenterLeaderboardSets, limitGameCenterAchievements, limitAchievementReleases, limitLeaderboardReleases, limitLeaderboardSetReleases, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterGameCenterAppVersionsEnabled filter by attribute &#39;gameCenterAppVersions.enabled&#39; (optional)
   * @param fieldsGameCenterAchievementReleases the fields to include for returned resources of type gameCenterAchievementReleases (optional)
   * @param fieldsGameCenterLeaderboardSetReleases the fields to include for returned resources of type gameCenterLeaderboardSetReleases (optional)
   * @param fieldsGameCenterLeaderboardSets the fields to include for returned resources of type gameCenterLeaderboardSets (optional)
   * @param fieldsGameCenterGroups the fields to include for returned resources of type gameCenterGroups (optional)
   * @param fieldsGameCenterDetails the fields to include for returned resources of type gameCenterDetails (optional)
   * @param fieldsGameCenterLeaderboards the fields to include for returned resources of type gameCenterLeaderboards (optional)
   * @param fieldsGameCenterAppVersions the fields to include for returned resources of type gameCenterAppVersions (optional)
   * @param fieldsGameCenterAchievements the fields to include for returned resources of type gameCenterAchievements (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param fieldsGameCenterLeaderboardReleases the fields to include for returned resources of type gameCenterLeaderboardReleases (optional)
   * @param limit maximum resources per page (optional)
   * @param limitGameCenterAppVersions maximum number of related gameCenterAppVersions returned (when they are included) (optional)
   * @param limitGameCenterLeaderboards maximum number of related gameCenterLeaderboards returned (when they are included) (optional)
   * @param limitGameCenterLeaderboardSets maximum number of related gameCenterLeaderboardSets returned (when they are included) (optional)
   * @param limitGameCenterAchievements maximum number of related gameCenterAchievements returned (when they are included) (optional)
   * @param limitAchievementReleases maximum number of related achievementReleases returned (when they are included) (optional)
   * @param limitLeaderboardReleases maximum number of related leaderboardReleases returned (when they are included) (optional)
   * @param limitLeaderboardSetReleases maximum number of related leaderboardSetReleases returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;GameCenterDetailsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of GameCenterDetails </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterDetailsResponse> gameCenterGroupsGameCenterDetailsGetToManyRelatedWithHttpInfo(String id, List<String> filterGameCenterAppVersionsEnabled, List<String> fieldsGameCenterAchievementReleases, List<String> fieldsGameCenterLeaderboardSetReleases, List<String> fieldsGameCenterLeaderboardSets, List<String> fieldsGameCenterGroups, List<String> fieldsGameCenterDetails, List<String> fieldsGameCenterLeaderboards, List<String> fieldsGameCenterAppVersions, List<String> fieldsGameCenterAchievements, List<String> fieldsApps, List<String> fieldsGameCenterLeaderboardReleases, Integer limit, Integer limitGameCenterAppVersions, Integer limitGameCenterLeaderboards, Integer limitGameCenterLeaderboardSets, Integer limitGameCenterAchievements, Integer limitAchievementReleases, Integer limitLeaderboardReleases, Integer limitLeaderboardSetReleases, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterGroupsGameCenterDetailsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterGroups/{id}/gameCenterDetails"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[gameCenterAppVersions.enabled]", filterGameCenterAppVersionsEnabled)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterAchievementReleases]", fieldsGameCenterAchievementReleases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardSetReleases]", fieldsGameCenterLeaderboardSetReleases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardSets]", fieldsGameCenterLeaderboardSets));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterGroups]", fieldsGameCenterGroups));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterDetails]", fieldsGameCenterDetails));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboards]", fieldsGameCenterLeaderboards));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterAppVersions]", fieldsGameCenterAppVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterAchievements]", fieldsGameCenterAchievements));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[apps]", fieldsApps));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardReleases]", fieldsGameCenterLeaderboardReleases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[gameCenterAppVersions]", limitGameCenterAppVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[gameCenterLeaderboards]", limitGameCenterLeaderboards));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[gameCenterLeaderboardSets]", limitGameCenterLeaderboardSets));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[gameCenterAchievements]", limitGameCenterAchievements));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[achievementReleases]", limitAchievementReleases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[leaderboardReleases]", limitLeaderboardReleases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[leaderboardSetReleases]", limitLeaderboardSetReleases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterDetailsResponse> localVarReturnType = new GenericType<GameCenterDetailsResponse>() {};
    return apiClient.invokeAPI("GameCenterGroupsApi.gameCenterGroupsGameCenterDetailsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
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
  public GameCenterLeaderboardSetsResponse gameCenterGroupsGameCenterLeaderboardSetsGetToManyRelated(String id, List<String> filterReferenceName, List<String> filterId, List<String> fieldsGameCenterLeaderboardSetLocalizations, List<String> fieldsGameCenterLeaderboardSetReleases, List<String> fieldsGameCenterLeaderboardSets, List<String> fieldsGameCenterGroups, List<String> fieldsGameCenterDetails, List<String> fieldsGameCenterLeaderboards, Integer limit, Integer limitLocalizations, Integer limitGameCenterLeaderboards, Integer limitReleases, List<String> include) throws ApiException {
    return gameCenterGroupsGameCenterLeaderboardSetsGetToManyRelatedWithHttpInfo(id, filterReferenceName, filterId, fieldsGameCenterLeaderboardSetLocalizations, fieldsGameCenterLeaderboardSetReleases, fieldsGameCenterLeaderboardSets, fieldsGameCenterGroups, fieldsGameCenterDetails, fieldsGameCenterLeaderboards, limit, limitLocalizations, limitGameCenterLeaderboards, limitReleases, include).getData();
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
  public ApiResponse<GameCenterLeaderboardSetsResponse> gameCenterGroupsGameCenterLeaderboardSetsGetToManyRelatedWithHttpInfo(String id, List<String> filterReferenceName, List<String> filterId, List<String> fieldsGameCenterLeaderboardSetLocalizations, List<String> fieldsGameCenterLeaderboardSetReleases, List<String> fieldsGameCenterLeaderboardSets, List<String> fieldsGameCenterGroups, List<String> fieldsGameCenterDetails, List<String> fieldsGameCenterLeaderboards, Integer limit, Integer limitLocalizations, Integer limitGameCenterLeaderboards, Integer limitReleases, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterGroupsGameCenterLeaderboardSetsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterGroups/{id}/gameCenterLeaderboardSets"
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
    return apiClient.invokeAPI("GameCenterGroupsApi.gameCenterGroupsGameCenterLeaderboardSetsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param limit maximum resources per page (optional)
   * @return GameCenterGroupGameCenterLeaderboardSetsLinkagesResponse
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
  public GameCenterGroupGameCenterLeaderboardSetsLinkagesResponse gameCenterGroupsGameCenterLeaderboardSetsGetToManyRelationship(String id, Integer limit) throws ApiException {
    return gameCenterGroupsGameCenterLeaderboardSetsGetToManyRelationshipWithHttpInfo(id, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;GameCenterGroupGameCenterLeaderboardSetsLinkagesResponse&gt;
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
  public ApiResponse<GameCenterGroupGameCenterLeaderboardSetsLinkagesResponse> gameCenterGroupsGameCenterLeaderboardSetsGetToManyRelationshipWithHttpInfo(String id, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterGroupsGameCenterLeaderboardSetsGetToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterGroups/{id}/relationships/gameCenterLeaderboardSets"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "limit", limit)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterGroupGameCenterLeaderboardSetsLinkagesResponse> localVarReturnType = new GenericType<GameCenterGroupGameCenterLeaderboardSetsLinkagesResponse>() {};
    return apiClient.invokeAPI("GameCenterGroupsApi.gameCenterGroupsGameCenterLeaderboardSetsGetToManyRelationship", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterGroupGameCenterLeaderboardSetsLinkagesRequest List of related linkages (required)
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
  public void gameCenterGroupsGameCenterLeaderboardSetsReplaceToManyRelationship(String id, GameCenterGroupGameCenterLeaderboardSetsLinkagesRequest gameCenterGroupGameCenterLeaderboardSetsLinkagesRequest) throws ApiException {
    gameCenterGroupsGameCenterLeaderboardSetsReplaceToManyRelationshipWithHttpInfo(id, gameCenterGroupGameCenterLeaderboardSetsLinkagesRequest);
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterGroupGameCenterLeaderboardSetsLinkagesRequest List of related linkages (required)
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
  public ApiResponse<Void> gameCenterGroupsGameCenterLeaderboardSetsReplaceToManyRelationshipWithHttpInfo(String id, GameCenterGroupGameCenterLeaderboardSetsLinkagesRequest gameCenterGroupGameCenterLeaderboardSetsLinkagesRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterGroupsGameCenterLeaderboardSetsReplaceToManyRelationship");
    }
    if (gameCenterGroupGameCenterLeaderboardSetsLinkagesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gameCenterGroupGameCenterLeaderboardSetsLinkagesRequest' when calling gameCenterGroupsGameCenterLeaderboardSetsReplaceToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterGroups/{id}/relationships/gameCenterLeaderboardSets"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("GameCenterGroupsApi.gameCenterGroupsGameCenterLeaderboardSetsReplaceToManyRelationship", localVarPath, "PATCH", new ArrayList<>(), gameCenterGroupGameCenterLeaderboardSetsLinkagesRequest,
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
  public GameCenterLeaderboardsResponse gameCenterGroupsGameCenterLeaderboardsGetToManyRelated(String id, List<String> filterArchived, List<String> filterReferenceName, List<String> filterId, List<String> fieldsGameCenterLeaderboardLocalizations, List<String> fieldsGameCenterLeaderboardSets, List<String> fieldsGameCenterGroups, List<String> fieldsGameCenterDetails, List<String> fieldsGameCenterLeaderboards, List<String> fieldsGameCenterLeaderboardReleases, Integer limit, Integer limitGameCenterLeaderboardSets, Integer limitLocalizations, Integer limitReleases, List<String> include) throws ApiException {
    return gameCenterGroupsGameCenterLeaderboardsGetToManyRelatedWithHttpInfo(id, filterArchived, filterReferenceName, filterId, fieldsGameCenterLeaderboardLocalizations, fieldsGameCenterLeaderboardSets, fieldsGameCenterGroups, fieldsGameCenterDetails, fieldsGameCenterLeaderboards, fieldsGameCenterLeaderboardReleases, limit, limitGameCenterLeaderboardSets, limitLocalizations, limitReleases, include).getData();
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
  public ApiResponse<GameCenterLeaderboardsResponse> gameCenterGroupsGameCenterLeaderboardsGetToManyRelatedWithHttpInfo(String id, List<String> filterArchived, List<String> filterReferenceName, List<String> filterId, List<String> fieldsGameCenterLeaderboardLocalizations, List<String> fieldsGameCenterLeaderboardSets, List<String> fieldsGameCenterGroups, List<String> fieldsGameCenterDetails, List<String> fieldsGameCenterLeaderboards, List<String> fieldsGameCenterLeaderboardReleases, Integer limit, Integer limitGameCenterLeaderboardSets, Integer limitLocalizations, Integer limitReleases, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterGroupsGameCenterLeaderboardsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterGroups/{id}/gameCenterLeaderboards"
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
    return apiClient.invokeAPI("GameCenterGroupsApi.gameCenterGroupsGameCenterLeaderboardsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param limit maximum resources per page (optional)
   * @return GameCenterGroupGameCenterLeaderboardsLinkagesResponse
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
  public GameCenterGroupGameCenterLeaderboardsLinkagesResponse gameCenterGroupsGameCenterLeaderboardsGetToManyRelationship(String id, Integer limit) throws ApiException {
    return gameCenterGroupsGameCenterLeaderboardsGetToManyRelationshipWithHttpInfo(id, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;GameCenterGroupGameCenterLeaderboardsLinkagesResponse&gt;
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
  public ApiResponse<GameCenterGroupGameCenterLeaderboardsLinkagesResponse> gameCenterGroupsGameCenterLeaderboardsGetToManyRelationshipWithHttpInfo(String id, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterGroupsGameCenterLeaderboardsGetToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterGroups/{id}/relationships/gameCenterLeaderboards"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "limit", limit)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterGroupGameCenterLeaderboardsLinkagesResponse> localVarReturnType = new GenericType<GameCenterGroupGameCenterLeaderboardsLinkagesResponse>() {};
    return apiClient.invokeAPI("GameCenterGroupsApi.gameCenterGroupsGameCenterLeaderboardsGetToManyRelationship", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterGroupGameCenterLeaderboardsLinkagesRequest List of related linkages (required)
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
  public void gameCenterGroupsGameCenterLeaderboardsReplaceToManyRelationship(String id, GameCenterGroupGameCenterLeaderboardsLinkagesRequest gameCenterGroupGameCenterLeaderboardsLinkagesRequest) throws ApiException {
    gameCenterGroupsGameCenterLeaderboardsReplaceToManyRelationshipWithHttpInfo(id, gameCenterGroupGameCenterLeaderboardsLinkagesRequest);
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterGroupGameCenterLeaderboardsLinkagesRequest List of related linkages (required)
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
  public ApiResponse<Void> gameCenterGroupsGameCenterLeaderboardsReplaceToManyRelationshipWithHttpInfo(String id, GameCenterGroupGameCenterLeaderboardsLinkagesRequest gameCenterGroupGameCenterLeaderboardsLinkagesRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterGroupsGameCenterLeaderboardsReplaceToManyRelationship");
    }
    if (gameCenterGroupGameCenterLeaderboardsLinkagesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gameCenterGroupGameCenterLeaderboardsLinkagesRequest' when calling gameCenterGroupsGameCenterLeaderboardsReplaceToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterGroups/{id}/relationships/gameCenterLeaderboards"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("GameCenterGroupsApi.gameCenterGroupsGameCenterLeaderboardsReplaceToManyRelationship", localVarPath, "PATCH", new ArrayList<>(), gameCenterGroupGameCenterLeaderboardsLinkagesRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param filterGameCenterDetails filter by id(s) of related &#39;gameCenterDetails&#39; (optional)
   * @param fieldsGameCenterGroups the fields to include for returned resources of type gameCenterGroups (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsGameCenterLeaderboardSets the fields to include for returned resources of type gameCenterLeaderboardSets (optional)
   * @param fieldsGameCenterDetails the fields to include for returned resources of type gameCenterDetails (optional)
   * @param fieldsGameCenterLeaderboards the fields to include for returned resources of type gameCenterLeaderboards (optional)
   * @param fieldsGameCenterAchievements the fields to include for returned resources of type gameCenterAchievements (optional)
   * @param limitGameCenterAchievements maximum number of related gameCenterAchievements returned (when they are included) (optional)
   * @param limitGameCenterDetails maximum number of related gameCenterDetails returned (when they are included) (optional)
   * @param limitGameCenterLeaderboardSets maximum number of related gameCenterLeaderboardSets returned (when they are included) (optional)
   * @param limitGameCenterLeaderboards maximum number of related gameCenterLeaderboards returned (when they are included) (optional)
   * @return GameCenterGroupsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of GameCenterGroups </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterGroupsResponse gameCenterGroupsGetCollection(List<String> filterGameCenterDetails, List<String> fieldsGameCenterGroups, Integer limit, List<String> include, List<String> fieldsGameCenterLeaderboardSets, List<String> fieldsGameCenterDetails, List<String> fieldsGameCenterLeaderboards, List<String> fieldsGameCenterAchievements, Integer limitGameCenterAchievements, Integer limitGameCenterDetails, Integer limitGameCenterLeaderboardSets, Integer limitGameCenterLeaderboards) throws ApiException {
    return gameCenterGroupsGetCollectionWithHttpInfo(filterGameCenterDetails, fieldsGameCenterGroups, limit, include, fieldsGameCenterLeaderboardSets, fieldsGameCenterDetails, fieldsGameCenterLeaderboards, fieldsGameCenterAchievements, limitGameCenterAchievements, limitGameCenterDetails, limitGameCenterLeaderboardSets, limitGameCenterLeaderboards).getData();
  }

  /**
   * 
   * 
   * @param filterGameCenterDetails filter by id(s) of related &#39;gameCenterDetails&#39; (optional)
   * @param fieldsGameCenterGroups the fields to include for returned resources of type gameCenterGroups (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsGameCenterLeaderboardSets the fields to include for returned resources of type gameCenterLeaderboardSets (optional)
   * @param fieldsGameCenterDetails the fields to include for returned resources of type gameCenterDetails (optional)
   * @param fieldsGameCenterLeaderboards the fields to include for returned resources of type gameCenterLeaderboards (optional)
   * @param fieldsGameCenterAchievements the fields to include for returned resources of type gameCenterAchievements (optional)
   * @param limitGameCenterAchievements maximum number of related gameCenterAchievements returned (when they are included) (optional)
   * @param limitGameCenterDetails maximum number of related gameCenterDetails returned (when they are included) (optional)
   * @param limitGameCenterLeaderboardSets maximum number of related gameCenterLeaderboardSets returned (when they are included) (optional)
   * @param limitGameCenterLeaderboards maximum number of related gameCenterLeaderboards returned (when they are included) (optional)
   * @return ApiResponse&lt;GameCenterGroupsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of GameCenterGroups </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterGroupsResponse> gameCenterGroupsGetCollectionWithHttpInfo(List<String> filterGameCenterDetails, List<String> fieldsGameCenterGroups, Integer limit, List<String> include, List<String> fieldsGameCenterLeaderboardSets, List<String> fieldsGameCenterDetails, List<String> fieldsGameCenterLeaderboards, List<String> fieldsGameCenterAchievements, Integer limitGameCenterAchievements, Integer limitGameCenterDetails, Integer limitGameCenterLeaderboardSets, Integer limitGameCenterLeaderboards) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[gameCenterDetails]", filterGameCenterDetails)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterGroups]", fieldsGameCenterGroups));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardSets]", fieldsGameCenterLeaderboardSets));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterDetails]", fieldsGameCenterDetails));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboards]", fieldsGameCenterLeaderboards));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterAchievements]", fieldsGameCenterAchievements));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[gameCenterAchievements]", limitGameCenterAchievements));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[gameCenterDetails]", limitGameCenterDetails));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[gameCenterLeaderboardSets]", limitGameCenterLeaderboardSets));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[gameCenterLeaderboards]", limitGameCenterLeaderboards));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterGroupsResponse> localVarReturnType = new GenericType<GameCenterGroupsResponse>() {};
    return apiClient.invokeAPI("GameCenterGroupsApi.gameCenterGroupsGetCollection", "/v1/gameCenterGroups", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterGroups the fields to include for returned resources of type gameCenterGroups (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsGameCenterLeaderboardSets the fields to include for returned resources of type gameCenterLeaderboardSets (optional)
   * @param fieldsGameCenterDetails the fields to include for returned resources of type gameCenterDetails (optional)
   * @param fieldsGameCenterLeaderboards the fields to include for returned resources of type gameCenterLeaderboards (optional)
   * @param fieldsGameCenterAchievements the fields to include for returned resources of type gameCenterAchievements (optional)
   * @param limitGameCenterAchievements maximum number of related gameCenterAchievements returned (when they are included) (optional)
   * @param limitGameCenterDetails maximum number of related gameCenterDetails returned (when they are included) (optional)
   * @param limitGameCenterLeaderboardSets maximum number of related gameCenterLeaderboardSets returned (when they are included) (optional)
   * @param limitGameCenterLeaderboards maximum number of related gameCenterLeaderboards returned (when they are included) (optional)
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
  public GameCenterGroupResponse gameCenterGroupsGetInstance(String id, List<String> fieldsGameCenterGroups, List<String> include, List<String> fieldsGameCenterLeaderboardSets, List<String> fieldsGameCenterDetails, List<String> fieldsGameCenterLeaderboards, List<String> fieldsGameCenterAchievements, Integer limitGameCenterAchievements, Integer limitGameCenterDetails, Integer limitGameCenterLeaderboardSets, Integer limitGameCenterLeaderboards) throws ApiException {
    return gameCenterGroupsGetInstanceWithHttpInfo(id, fieldsGameCenterGroups, include, fieldsGameCenterLeaderboardSets, fieldsGameCenterDetails, fieldsGameCenterLeaderboards, fieldsGameCenterAchievements, limitGameCenterAchievements, limitGameCenterDetails, limitGameCenterLeaderboardSets, limitGameCenterLeaderboards).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterGroups the fields to include for returned resources of type gameCenterGroups (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsGameCenterLeaderboardSets the fields to include for returned resources of type gameCenterLeaderboardSets (optional)
   * @param fieldsGameCenterDetails the fields to include for returned resources of type gameCenterDetails (optional)
   * @param fieldsGameCenterLeaderboards the fields to include for returned resources of type gameCenterLeaderboards (optional)
   * @param fieldsGameCenterAchievements the fields to include for returned resources of type gameCenterAchievements (optional)
   * @param limitGameCenterAchievements maximum number of related gameCenterAchievements returned (when they are included) (optional)
   * @param limitGameCenterDetails maximum number of related gameCenterDetails returned (when they are included) (optional)
   * @param limitGameCenterLeaderboardSets maximum number of related gameCenterLeaderboardSets returned (when they are included) (optional)
   * @param limitGameCenterLeaderboards maximum number of related gameCenterLeaderboards returned (when they are included) (optional)
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
  public ApiResponse<GameCenterGroupResponse> gameCenterGroupsGetInstanceWithHttpInfo(String id, List<String> fieldsGameCenterGroups, List<String> include, List<String> fieldsGameCenterLeaderboardSets, List<String> fieldsGameCenterDetails, List<String> fieldsGameCenterLeaderboards, List<String> fieldsGameCenterAchievements, Integer limitGameCenterAchievements, Integer limitGameCenterDetails, Integer limitGameCenterLeaderboardSets, Integer limitGameCenterLeaderboards) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterGroupsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterGroups/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[gameCenterGroups]", fieldsGameCenterGroups)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardSets]", fieldsGameCenterLeaderboardSets));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterDetails]", fieldsGameCenterDetails));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboards]", fieldsGameCenterLeaderboards));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterAchievements]", fieldsGameCenterAchievements));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[gameCenterAchievements]", limitGameCenterAchievements));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[gameCenterDetails]", limitGameCenterDetails));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[gameCenterLeaderboardSets]", limitGameCenterLeaderboardSets));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[gameCenterLeaderboards]", limitGameCenterLeaderboards));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterGroupResponse> localVarReturnType = new GenericType<GameCenterGroupResponse>() {};
    return apiClient.invokeAPI("GameCenterGroupsApi.gameCenterGroupsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterGroupUpdateRequest GameCenterGroup representation (required)
   * @return GameCenterGroupResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterGroup </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterGroupResponse gameCenterGroupsUpdateInstance(String id, GameCenterGroupUpdateRequest gameCenterGroupUpdateRequest) throws ApiException {
    return gameCenterGroupsUpdateInstanceWithHttpInfo(id, gameCenterGroupUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterGroupUpdateRequest GameCenterGroup representation (required)
   * @return ApiResponse&lt;GameCenterGroupResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterGroup </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterGroupResponse> gameCenterGroupsUpdateInstanceWithHttpInfo(String id, GameCenterGroupUpdateRequest gameCenterGroupUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterGroupsUpdateInstance");
    }
    if (gameCenterGroupUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gameCenterGroupUpdateRequest' when calling gameCenterGroupsUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterGroups/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterGroupResponse> localVarReturnType = new GenericType<GameCenterGroupResponse>() {};
    return apiClient.invokeAPI("GameCenterGroupsApi.gameCenterGroupsUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), gameCenterGroupUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
