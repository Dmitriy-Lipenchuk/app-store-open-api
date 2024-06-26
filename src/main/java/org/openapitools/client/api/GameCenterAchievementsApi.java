package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.GameCenterAchievementCreateRequest;
import org.openapitools.client.model.GameCenterAchievementGroupAchievementLinkageRequest;
import org.openapitools.client.model.GameCenterAchievementGroupAchievementLinkageResponse;
import org.openapitools.client.model.GameCenterAchievementLocalizationsResponse;
import org.openapitools.client.model.GameCenterAchievementReleasesResponse;
import org.openapitools.client.model.GameCenterAchievementResponse;
import org.openapitools.client.model.GameCenterAchievementUpdateRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class GameCenterAchievementsApi {
  private ApiClient apiClient;

  public GameCenterAchievementsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GameCenterAchievementsApi(ApiClient apiClient) {
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
   * @param gameCenterAchievementCreateRequest GameCenterAchievement representation (required)
   * @return GameCenterAchievementResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single GameCenterAchievement </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterAchievementResponse gameCenterAchievementsCreateInstance(GameCenterAchievementCreateRequest gameCenterAchievementCreateRequest) throws ApiException {
    return gameCenterAchievementsCreateInstanceWithHttpInfo(gameCenterAchievementCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param gameCenterAchievementCreateRequest GameCenterAchievement representation (required)
   * @return ApiResponse&lt;GameCenterAchievementResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single GameCenterAchievement </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterAchievementResponse> gameCenterAchievementsCreateInstanceWithHttpInfo(GameCenterAchievementCreateRequest gameCenterAchievementCreateRequest) throws ApiException {
    // Check required parameters
    if (gameCenterAchievementCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gameCenterAchievementCreateRequest' when calling gameCenterAchievementsCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterAchievementResponse> localVarReturnType = new GenericType<GameCenterAchievementResponse>() {};
    return apiClient.invokeAPI("GameCenterAchievementsApi.gameCenterAchievementsCreateInstance", "/v1/gameCenterAchievements", "POST", new ArrayList<>(), gameCenterAchievementCreateRequest,
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
  public void gameCenterAchievementsDeleteInstance(String id) throws ApiException {
    gameCenterAchievementsDeleteInstanceWithHttpInfo(id);
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
  public ApiResponse<Void> gameCenterAchievementsDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterAchievementsDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterAchievements/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("GameCenterAchievementsApi.gameCenterAchievementsDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterAchievements the fields to include for returned resources of type gameCenterAchievements (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsGameCenterAchievementReleases the fields to include for returned resources of type gameCenterAchievementReleases (optional)
   * @param fieldsGameCenterAchievementLocalizations the fields to include for returned resources of type gameCenterAchievementLocalizations (optional)
   * @param limitLocalizations maximum number of related localizations returned (when they are included) (optional)
   * @param limitReleases maximum number of related releases returned (when they are included) (optional)
   * @return GameCenterAchievementResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterAchievement </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterAchievementResponse gameCenterAchievementsGetInstance(String id, List<String> fieldsGameCenterAchievements, List<String> include, List<String> fieldsGameCenterAchievementReleases, List<String> fieldsGameCenterAchievementLocalizations, Integer limitLocalizations, Integer limitReleases) throws ApiException {
    return gameCenterAchievementsGetInstanceWithHttpInfo(id, fieldsGameCenterAchievements, include, fieldsGameCenterAchievementReleases, fieldsGameCenterAchievementLocalizations, limitLocalizations, limitReleases).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterAchievements the fields to include for returned resources of type gameCenterAchievements (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsGameCenterAchievementReleases the fields to include for returned resources of type gameCenterAchievementReleases (optional)
   * @param fieldsGameCenterAchievementLocalizations the fields to include for returned resources of type gameCenterAchievementLocalizations (optional)
   * @param limitLocalizations maximum number of related localizations returned (when they are included) (optional)
   * @param limitReleases maximum number of related releases returned (when they are included) (optional)
   * @return ApiResponse&lt;GameCenterAchievementResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterAchievement </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterAchievementResponse> gameCenterAchievementsGetInstanceWithHttpInfo(String id, List<String> fieldsGameCenterAchievements, List<String> include, List<String> fieldsGameCenterAchievementReleases, List<String> fieldsGameCenterAchievementLocalizations, Integer limitLocalizations, Integer limitReleases) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterAchievementsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterAchievements/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[gameCenterAchievements]", fieldsGameCenterAchievements)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterAchievementReleases]", fieldsGameCenterAchievementReleases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterAchievementLocalizations]", fieldsGameCenterAchievementLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[localizations]", limitLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[releases]", limitReleases));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterAchievementResponse> localVarReturnType = new GenericType<GameCenterAchievementResponse>() {};
    return apiClient.invokeAPI("GameCenterAchievementsApi.gameCenterAchievementsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterAchievementReleases the fields to include for returned resources of type gameCenterAchievementReleases (optional)
   * @param fieldsGameCenterGroups the fields to include for returned resources of type gameCenterGroups (optional)
   * @param fieldsGameCenterDetails the fields to include for returned resources of type gameCenterDetails (optional)
   * @param fieldsGameCenterAchievementLocalizations the fields to include for returned resources of type gameCenterAchievementLocalizations (optional)
   * @param fieldsGameCenterAchievements the fields to include for returned resources of type gameCenterAchievements (optional)
   * @param limitLocalizations maximum number of related localizations returned (when they are included) (optional)
   * @param limitReleases maximum number of related releases returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return GameCenterAchievementResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterAchievement </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterAchievementResponse gameCenterAchievementsGroupAchievementGetToOneRelated(String id, List<String> fieldsGameCenterAchievementReleases, List<String> fieldsGameCenterGroups, List<String> fieldsGameCenterDetails, List<String> fieldsGameCenterAchievementLocalizations, List<String> fieldsGameCenterAchievements, Integer limitLocalizations, Integer limitReleases, List<String> include) throws ApiException {
    return gameCenterAchievementsGroupAchievementGetToOneRelatedWithHttpInfo(id, fieldsGameCenterAchievementReleases, fieldsGameCenterGroups, fieldsGameCenterDetails, fieldsGameCenterAchievementLocalizations, fieldsGameCenterAchievements, limitLocalizations, limitReleases, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterAchievementReleases the fields to include for returned resources of type gameCenterAchievementReleases (optional)
   * @param fieldsGameCenterGroups the fields to include for returned resources of type gameCenterGroups (optional)
   * @param fieldsGameCenterDetails the fields to include for returned resources of type gameCenterDetails (optional)
   * @param fieldsGameCenterAchievementLocalizations the fields to include for returned resources of type gameCenterAchievementLocalizations (optional)
   * @param fieldsGameCenterAchievements the fields to include for returned resources of type gameCenterAchievements (optional)
   * @param limitLocalizations maximum number of related localizations returned (when they are included) (optional)
   * @param limitReleases maximum number of related releases returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;GameCenterAchievementResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterAchievement </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterAchievementResponse> gameCenterAchievementsGroupAchievementGetToOneRelatedWithHttpInfo(String id, List<String> fieldsGameCenterAchievementReleases, List<String> fieldsGameCenterGroups, List<String> fieldsGameCenterDetails, List<String> fieldsGameCenterAchievementLocalizations, List<String> fieldsGameCenterAchievements, Integer limitLocalizations, Integer limitReleases, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterAchievementsGroupAchievementGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterAchievements/{id}/groupAchievement"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[gameCenterAchievementReleases]", fieldsGameCenterAchievementReleases)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterGroups]", fieldsGameCenterGroups));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterDetails]", fieldsGameCenterDetails));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterAchievementLocalizations]", fieldsGameCenterAchievementLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterAchievements]", fieldsGameCenterAchievements));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[localizations]", limitLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[releases]", limitReleases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterAchievementResponse> localVarReturnType = new GenericType<GameCenterAchievementResponse>() {};
    return apiClient.invokeAPI("GameCenterAchievementsApi.gameCenterAchievementsGroupAchievementGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @return GameCenterAchievementGroupAchievementLinkageResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Related linkage </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterAchievementGroupAchievementLinkageResponse gameCenterAchievementsGroupAchievementGetToOneRelationship(String id) throws ApiException {
    return gameCenterAchievementsGroupAchievementGetToOneRelationshipWithHttpInfo(id).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @return ApiResponse&lt;GameCenterAchievementGroupAchievementLinkageResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Related linkage </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterAchievementGroupAchievementLinkageResponse> gameCenterAchievementsGroupAchievementGetToOneRelationshipWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterAchievementsGroupAchievementGetToOneRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterAchievements/{id}/relationships/groupAchievement"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterAchievementGroupAchievementLinkageResponse> localVarReturnType = new GenericType<GameCenterAchievementGroupAchievementLinkageResponse>() {};
    return apiClient.invokeAPI("GameCenterAchievementsApi.gameCenterAchievementsGroupAchievementGetToOneRelationship", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterAchievementGroupAchievementLinkageRequest Related linkage (required)
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
  public void gameCenterAchievementsGroupAchievementUpdateToOneRelationship(String id, GameCenterAchievementGroupAchievementLinkageRequest gameCenterAchievementGroupAchievementLinkageRequest) throws ApiException {
    gameCenterAchievementsGroupAchievementUpdateToOneRelationshipWithHttpInfo(id, gameCenterAchievementGroupAchievementLinkageRequest);
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterAchievementGroupAchievementLinkageRequest Related linkage (required)
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
  public ApiResponse<Void> gameCenterAchievementsGroupAchievementUpdateToOneRelationshipWithHttpInfo(String id, GameCenterAchievementGroupAchievementLinkageRequest gameCenterAchievementGroupAchievementLinkageRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterAchievementsGroupAchievementUpdateToOneRelationship");
    }
    if (gameCenterAchievementGroupAchievementLinkageRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gameCenterAchievementGroupAchievementLinkageRequest' when calling gameCenterAchievementsGroupAchievementUpdateToOneRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterAchievements/{id}/relationships/groupAchievement"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("GameCenterAchievementsApi.gameCenterAchievementsGroupAchievementUpdateToOneRelationship", localVarPath, "PATCH", new ArrayList<>(), gameCenterAchievementGroupAchievementLinkageRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterAchievementImages the fields to include for returned resources of type gameCenterAchievementImages (optional)
   * @param fieldsGameCenterAchievementLocalizations the fields to include for returned resources of type gameCenterAchievementLocalizations (optional)
   * @param fieldsGameCenterAchievements the fields to include for returned resources of type gameCenterAchievements (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return GameCenterAchievementLocalizationsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of GameCenterAchievementLocalizations </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterAchievementLocalizationsResponse gameCenterAchievementsLocalizationsGetToManyRelated(String id, List<String> fieldsGameCenterAchievementImages, List<String> fieldsGameCenterAchievementLocalizations, List<String> fieldsGameCenterAchievements, Integer limit, List<String> include) throws ApiException {
    return gameCenterAchievementsLocalizationsGetToManyRelatedWithHttpInfo(id, fieldsGameCenterAchievementImages, fieldsGameCenterAchievementLocalizations, fieldsGameCenterAchievements, limit, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterAchievementImages the fields to include for returned resources of type gameCenterAchievementImages (optional)
   * @param fieldsGameCenterAchievementLocalizations the fields to include for returned resources of type gameCenterAchievementLocalizations (optional)
   * @param fieldsGameCenterAchievements the fields to include for returned resources of type gameCenterAchievements (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;GameCenterAchievementLocalizationsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of GameCenterAchievementLocalizations </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterAchievementLocalizationsResponse> gameCenterAchievementsLocalizationsGetToManyRelatedWithHttpInfo(String id, List<String> fieldsGameCenterAchievementImages, List<String> fieldsGameCenterAchievementLocalizations, List<String> fieldsGameCenterAchievements, Integer limit, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterAchievementsLocalizationsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterAchievements/{id}/localizations"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[gameCenterAchievementImages]", fieldsGameCenterAchievementImages)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterAchievementLocalizations]", fieldsGameCenterAchievementLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterAchievements]", fieldsGameCenterAchievements));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterAchievementLocalizationsResponse> localVarReturnType = new GenericType<GameCenterAchievementLocalizationsResponse>() {};
    return apiClient.invokeAPI("GameCenterAchievementsApi.gameCenterAchievementsLocalizationsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterLive filter by attribute &#39;live&#39; (optional)
   * @param filterGameCenterDetail filter by id(s) of related &#39;gameCenterDetail&#39; (optional)
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
  public GameCenterAchievementReleasesResponse gameCenterAchievementsReleasesGetToManyRelated(String id, List<String> filterLive, List<String> filterGameCenterDetail, List<String> fieldsGameCenterAchievementReleases, List<String> fieldsGameCenterDetails, List<String> fieldsGameCenterAchievements, Integer limit, List<String> include) throws ApiException {
    return gameCenterAchievementsReleasesGetToManyRelatedWithHttpInfo(id, filterLive, filterGameCenterDetail, fieldsGameCenterAchievementReleases, fieldsGameCenterDetails, fieldsGameCenterAchievements, limit, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterLive filter by attribute &#39;live&#39; (optional)
   * @param filterGameCenterDetail filter by id(s) of related &#39;gameCenterDetail&#39; (optional)
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
  public ApiResponse<GameCenterAchievementReleasesResponse> gameCenterAchievementsReleasesGetToManyRelatedWithHttpInfo(String id, List<String> filterLive, List<String> filterGameCenterDetail, List<String> fieldsGameCenterAchievementReleases, List<String> fieldsGameCenterDetails, List<String> fieldsGameCenterAchievements, Integer limit, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterAchievementsReleasesGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterAchievements/{id}/releases"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[live]", filterLive)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[gameCenterDetail]", filterGameCenterDetail));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterAchievementReleases]", fieldsGameCenterAchievementReleases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterDetails]", fieldsGameCenterDetails));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterAchievements]", fieldsGameCenterAchievements));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterAchievementReleasesResponse> localVarReturnType = new GenericType<GameCenterAchievementReleasesResponse>() {};
    return apiClient.invokeAPI("GameCenterAchievementsApi.gameCenterAchievementsReleasesGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterAchievementUpdateRequest GameCenterAchievement representation (required)
   * @return GameCenterAchievementResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterAchievement </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterAchievementResponse gameCenterAchievementsUpdateInstance(String id, GameCenterAchievementUpdateRequest gameCenterAchievementUpdateRequest) throws ApiException {
    return gameCenterAchievementsUpdateInstanceWithHttpInfo(id, gameCenterAchievementUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterAchievementUpdateRequest GameCenterAchievement representation (required)
   * @return ApiResponse&lt;GameCenterAchievementResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterAchievement </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterAchievementResponse> gameCenterAchievementsUpdateInstanceWithHttpInfo(String id, GameCenterAchievementUpdateRequest gameCenterAchievementUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterAchievementsUpdateInstance");
    }
    if (gameCenterAchievementUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gameCenterAchievementUpdateRequest' when calling gameCenterAchievementsUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterAchievements/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterAchievementResponse> localVarReturnType = new GenericType<GameCenterAchievementResponse>() {};
    return apiClient.invokeAPI("GameCenterAchievementsApi.gameCenterAchievementsUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), gameCenterAchievementUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
