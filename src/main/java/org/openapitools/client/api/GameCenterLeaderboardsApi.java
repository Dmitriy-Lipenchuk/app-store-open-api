package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.GameCenterLeaderboardCreateRequest;
import org.openapitools.client.model.GameCenterLeaderboardGroupLeaderboardLinkageRequest;
import org.openapitools.client.model.GameCenterLeaderboardGroupLeaderboardLinkageResponse;
import org.openapitools.client.model.GameCenterLeaderboardLocalizationsResponse;
import org.openapitools.client.model.GameCenterLeaderboardReleasesResponse;
import org.openapitools.client.model.GameCenterLeaderboardResponse;
import org.openapitools.client.model.GameCenterLeaderboardUpdateRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class GameCenterLeaderboardsApi {
  private ApiClient apiClient;

  public GameCenterLeaderboardsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GameCenterLeaderboardsApi(ApiClient apiClient) {
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
   * @param gameCenterLeaderboardCreateRequest GameCenterLeaderboard representation (required)
   * @return GameCenterLeaderboardResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single GameCenterLeaderboard </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterLeaderboardResponse gameCenterLeaderboardsCreateInstance(GameCenterLeaderboardCreateRequest gameCenterLeaderboardCreateRequest) throws ApiException {
    return gameCenterLeaderboardsCreateInstanceWithHttpInfo(gameCenterLeaderboardCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param gameCenterLeaderboardCreateRequest GameCenterLeaderboard representation (required)
   * @return ApiResponse&lt;GameCenterLeaderboardResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single GameCenterLeaderboard </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterLeaderboardResponse> gameCenterLeaderboardsCreateInstanceWithHttpInfo(GameCenterLeaderboardCreateRequest gameCenterLeaderboardCreateRequest) throws ApiException {
    // Check required parameters
    if (gameCenterLeaderboardCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gameCenterLeaderboardCreateRequest' when calling gameCenterLeaderboardsCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterLeaderboardResponse> localVarReturnType = new GenericType<GameCenterLeaderboardResponse>() {};
    return apiClient.invokeAPI("GameCenterLeaderboardsApi.gameCenterLeaderboardsCreateInstance", "/v1/gameCenterLeaderboards", "POST", new ArrayList<>(), gameCenterLeaderboardCreateRequest,
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
  public void gameCenterLeaderboardsDeleteInstance(String id) throws ApiException {
    gameCenterLeaderboardsDeleteInstanceWithHttpInfo(id);
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
  public ApiResponse<Void> gameCenterLeaderboardsDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterLeaderboardsDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterLeaderboards/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("GameCenterLeaderboardsApi.gameCenterLeaderboardsDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterLeaderboards the fields to include for returned resources of type gameCenterLeaderboards (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsGameCenterLeaderboardLocalizations the fields to include for returned resources of type gameCenterLeaderboardLocalizations (optional)
   * @param fieldsGameCenterLeaderboardReleases the fields to include for returned resources of type gameCenterLeaderboardReleases (optional)
   * @param limitGameCenterLeaderboardSets maximum number of related gameCenterLeaderboardSets returned (when they are included) (optional)
   * @param limitLocalizations maximum number of related localizations returned (when they are included) (optional)
   * @param limitReleases maximum number of related releases returned (when they are included) (optional)
   * @return GameCenterLeaderboardResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterLeaderboard </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterLeaderboardResponse gameCenterLeaderboardsGetInstance(String id, List<String> fieldsGameCenterLeaderboards, List<String> include, List<String> fieldsGameCenterLeaderboardLocalizations, List<String> fieldsGameCenterLeaderboardReleases, Integer limitGameCenterLeaderboardSets, Integer limitLocalizations, Integer limitReleases) throws ApiException {
    return gameCenterLeaderboardsGetInstanceWithHttpInfo(id, fieldsGameCenterLeaderboards, include, fieldsGameCenterLeaderboardLocalizations, fieldsGameCenterLeaderboardReleases, limitGameCenterLeaderboardSets, limitLocalizations, limitReleases).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterLeaderboards the fields to include for returned resources of type gameCenterLeaderboards (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsGameCenterLeaderboardLocalizations the fields to include for returned resources of type gameCenterLeaderboardLocalizations (optional)
   * @param fieldsGameCenterLeaderboardReleases the fields to include for returned resources of type gameCenterLeaderboardReleases (optional)
   * @param limitGameCenterLeaderboardSets maximum number of related gameCenterLeaderboardSets returned (when they are included) (optional)
   * @param limitLocalizations maximum number of related localizations returned (when they are included) (optional)
   * @param limitReleases maximum number of related releases returned (when they are included) (optional)
   * @return ApiResponse&lt;GameCenterLeaderboardResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterLeaderboard </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterLeaderboardResponse> gameCenterLeaderboardsGetInstanceWithHttpInfo(String id, List<String> fieldsGameCenterLeaderboards, List<String> include, List<String> fieldsGameCenterLeaderboardLocalizations, List<String> fieldsGameCenterLeaderboardReleases, Integer limitGameCenterLeaderboardSets, Integer limitLocalizations, Integer limitReleases) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterLeaderboardsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterLeaderboards/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboards]", fieldsGameCenterLeaderboards)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardLocalizations]", fieldsGameCenterLeaderboardLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardReleases]", fieldsGameCenterLeaderboardReleases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[gameCenterLeaderboardSets]", limitGameCenterLeaderboardSets));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[localizations]", limitLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[releases]", limitReleases));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterLeaderboardResponse> localVarReturnType = new GenericType<GameCenterLeaderboardResponse>() {};
    return apiClient.invokeAPI("GameCenterLeaderboardsApi.gameCenterLeaderboardsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterLeaderboardLocalizations the fields to include for returned resources of type gameCenterLeaderboardLocalizations (optional)
   * @param fieldsGameCenterLeaderboardSets the fields to include for returned resources of type gameCenterLeaderboardSets (optional)
   * @param fieldsGameCenterGroups the fields to include for returned resources of type gameCenterGroups (optional)
   * @param fieldsGameCenterDetails the fields to include for returned resources of type gameCenterDetails (optional)
   * @param fieldsGameCenterLeaderboards the fields to include for returned resources of type gameCenterLeaderboards (optional)
   * @param fieldsGameCenterLeaderboardReleases the fields to include for returned resources of type gameCenterLeaderboardReleases (optional)
   * @param limitGameCenterLeaderboardSets maximum number of related gameCenterLeaderboardSets returned (when they are included) (optional)
   * @param limitLocalizations maximum number of related localizations returned (when they are included) (optional)
   * @param limitReleases maximum number of related releases returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return GameCenterLeaderboardResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterLeaderboard </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterLeaderboardResponse gameCenterLeaderboardsGroupLeaderboardGetToOneRelated(String id, List<String> fieldsGameCenterLeaderboardLocalizations, List<String> fieldsGameCenterLeaderboardSets, List<String> fieldsGameCenterGroups, List<String> fieldsGameCenterDetails, List<String> fieldsGameCenterLeaderboards, List<String> fieldsGameCenterLeaderboardReleases, Integer limitGameCenterLeaderboardSets, Integer limitLocalizations, Integer limitReleases, List<String> include) throws ApiException {
    return gameCenterLeaderboardsGroupLeaderboardGetToOneRelatedWithHttpInfo(id, fieldsGameCenterLeaderboardLocalizations, fieldsGameCenterLeaderboardSets, fieldsGameCenterGroups, fieldsGameCenterDetails, fieldsGameCenterLeaderboards, fieldsGameCenterLeaderboardReleases, limitGameCenterLeaderboardSets, limitLocalizations, limitReleases, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterLeaderboardLocalizations the fields to include for returned resources of type gameCenterLeaderboardLocalizations (optional)
   * @param fieldsGameCenterLeaderboardSets the fields to include for returned resources of type gameCenterLeaderboardSets (optional)
   * @param fieldsGameCenterGroups the fields to include for returned resources of type gameCenterGroups (optional)
   * @param fieldsGameCenterDetails the fields to include for returned resources of type gameCenterDetails (optional)
   * @param fieldsGameCenterLeaderboards the fields to include for returned resources of type gameCenterLeaderboards (optional)
   * @param fieldsGameCenterLeaderboardReleases the fields to include for returned resources of type gameCenterLeaderboardReleases (optional)
   * @param limitGameCenterLeaderboardSets maximum number of related gameCenterLeaderboardSets returned (when they are included) (optional)
   * @param limitLocalizations maximum number of related localizations returned (when they are included) (optional)
   * @param limitReleases maximum number of related releases returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;GameCenterLeaderboardResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterLeaderboard </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterLeaderboardResponse> gameCenterLeaderboardsGroupLeaderboardGetToOneRelatedWithHttpInfo(String id, List<String> fieldsGameCenterLeaderboardLocalizations, List<String> fieldsGameCenterLeaderboardSets, List<String> fieldsGameCenterGroups, List<String> fieldsGameCenterDetails, List<String> fieldsGameCenterLeaderboards, List<String> fieldsGameCenterLeaderboardReleases, Integer limitGameCenterLeaderboardSets, Integer limitLocalizations, Integer limitReleases, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterLeaderboardsGroupLeaderboardGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterLeaderboards/{id}/groupLeaderboard"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardLocalizations]", fieldsGameCenterLeaderboardLocalizations)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardSets]", fieldsGameCenterLeaderboardSets));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterGroups]", fieldsGameCenterGroups));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterDetails]", fieldsGameCenterDetails));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboards]", fieldsGameCenterLeaderboards));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardReleases]", fieldsGameCenterLeaderboardReleases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[gameCenterLeaderboardSets]", limitGameCenterLeaderboardSets));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[localizations]", limitLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[releases]", limitReleases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterLeaderboardResponse> localVarReturnType = new GenericType<GameCenterLeaderboardResponse>() {};
    return apiClient.invokeAPI("GameCenterLeaderboardsApi.gameCenterLeaderboardsGroupLeaderboardGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @return GameCenterLeaderboardGroupLeaderboardLinkageResponse
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
  public GameCenterLeaderboardGroupLeaderboardLinkageResponse gameCenterLeaderboardsGroupLeaderboardGetToOneRelationship(String id) throws ApiException {
    return gameCenterLeaderboardsGroupLeaderboardGetToOneRelationshipWithHttpInfo(id).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @return ApiResponse&lt;GameCenterLeaderboardGroupLeaderboardLinkageResponse&gt;
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
  public ApiResponse<GameCenterLeaderboardGroupLeaderboardLinkageResponse> gameCenterLeaderboardsGroupLeaderboardGetToOneRelationshipWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterLeaderboardsGroupLeaderboardGetToOneRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterLeaderboards/{id}/relationships/groupLeaderboard"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterLeaderboardGroupLeaderboardLinkageResponse> localVarReturnType = new GenericType<GameCenterLeaderboardGroupLeaderboardLinkageResponse>() {};
    return apiClient.invokeAPI("GameCenterLeaderboardsApi.gameCenterLeaderboardsGroupLeaderboardGetToOneRelationship", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterLeaderboardGroupLeaderboardLinkageRequest Related linkage (required)
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
  public void gameCenterLeaderboardsGroupLeaderboardUpdateToOneRelationship(String id, GameCenterLeaderboardGroupLeaderboardLinkageRequest gameCenterLeaderboardGroupLeaderboardLinkageRequest) throws ApiException {
    gameCenterLeaderboardsGroupLeaderboardUpdateToOneRelationshipWithHttpInfo(id, gameCenterLeaderboardGroupLeaderboardLinkageRequest);
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterLeaderboardGroupLeaderboardLinkageRequest Related linkage (required)
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
  public ApiResponse<Void> gameCenterLeaderboardsGroupLeaderboardUpdateToOneRelationshipWithHttpInfo(String id, GameCenterLeaderboardGroupLeaderboardLinkageRequest gameCenterLeaderboardGroupLeaderboardLinkageRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterLeaderboardsGroupLeaderboardUpdateToOneRelationship");
    }
    if (gameCenterLeaderboardGroupLeaderboardLinkageRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gameCenterLeaderboardGroupLeaderboardLinkageRequest' when calling gameCenterLeaderboardsGroupLeaderboardUpdateToOneRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterLeaderboards/{id}/relationships/groupLeaderboard"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("GameCenterLeaderboardsApi.gameCenterLeaderboardsGroupLeaderboardUpdateToOneRelationship", localVarPath, "PATCH", new ArrayList<>(), gameCenterLeaderboardGroupLeaderboardLinkageRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterLeaderboardLocalizations the fields to include for returned resources of type gameCenterLeaderboardLocalizations (optional)
   * @param fieldsGameCenterLeaderboardImages the fields to include for returned resources of type gameCenterLeaderboardImages (optional)
   * @param fieldsGameCenterLeaderboards the fields to include for returned resources of type gameCenterLeaderboards (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return GameCenterLeaderboardLocalizationsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of GameCenterLeaderboardLocalizations </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterLeaderboardLocalizationsResponse gameCenterLeaderboardsLocalizationsGetToManyRelated(String id, List<String> fieldsGameCenterLeaderboardLocalizations, List<String> fieldsGameCenterLeaderboardImages, List<String> fieldsGameCenterLeaderboards, Integer limit, List<String> include) throws ApiException {
    return gameCenterLeaderboardsLocalizationsGetToManyRelatedWithHttpInfo(id, fieldsGameCenterLeaderboardLocalizations, fieldsGameCenterLeaderboardImages, fieldsGameCenterLeaderboards, limit, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterLeaderboardLocalizations the fields to include for returned resources of type gameCenterLeaderboardLocalizations (optional)
   * @param fieldsGameCenterLeaderboardImages the fields to include for returned resources of type gameCenterLeaderboardImages (optional)
   * @param fieldsGameCenterLeaderboards the fields to include for returned resources of type gameCenterLeaderboards (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;GameCenterLeaderboardLocalizationsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of GameCenterLeaderboardLocalizations </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterLeaderboardLocalizationsResponse> gameCenterLeaderboardsLocalizationsGetToManyRelatedWithHttpInfo(String id, List<String> fieldsGameCenterLeaderboardLocalizations, List<String> fieldsGameCenterLeaderboardImages, List<String> fieldsGameCenterLeaderboards, Integer limit, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterLeaderboardsLocalizationsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterLeaderboards/{id}/localizations"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardLocalizations]", fieldsGameCenterLeaderboardLocalizations)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardImages]", fieldsGameCenterLeaderboardImages));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboards]", fieldsGameCenterLeaderboards));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterLeaderboardLocalizationsResponse> localVarReturnType = new GenericType<GameCenterLeaderboardLocalizationsResponse>() {};
    return apiClient.invokeAPI("GameCenterLeaderboardsApi.gameCenterLeaderboardsLocalizationsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterLive filter by attribute &#39;live&#39; (optional)
   * @param filterGameCenterDetail filter by id(s) of related &#39;gameCenterDetail&#39; (optional)
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
  public GameCenterLeaderboardReleasesResponse gameCenterLeaderboardsReleasesGetToManyRelated(String id, List<String> filterLive, List<String> filterGameCenterDetail, List<String> fieldsGameCenterDetails, List<String> fieldsGameCenterLeaderboards, List<String> fieldsGameCenterLeaderboardReleases, Integer limit, List<String> include) throws ApiException {
    return gameCenterLeaderboardsReleasesGetToManyRelatedWithHttpInfo(id, filterLive, filterGameCenterDetail, fieldsGameCenterDetails, fieldsGameCenterLeaderboards, fieldsGameCenterLeaderboardReleases, limit, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterLive filter by attribute &#39;live&#39; (optional)
   * @param filterGameCenterDetail filter by id(s) of related &#39;gameCenterDetail&#39; (optional)
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
  public ApiResponse<GameCenterLeaderboardReleasesResponse> gameCenterLeaderboardsReleasesGetToManyRelatedWithHttpInfo(String id, List<String> filterLive, List<String> filterGameCenterDetail, List<String> fieldsGameCenterDetails, List<String> fieldsGameCenterLeaderboards, List<String> fieldsGameCenterLeaderboardReleases, Integer limit, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterLeaderboardsReleasesGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterLeaderboards/{id}/releases"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[live]", filterLive)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[gameCenterDetail]", filterGameCenterDetail));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterDetails]", fieldsGameCenterDetails));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboards]", fieldsGameCenterLeaderboards));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardReleases]", fieldsGameCenterLeaderboardReleases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterLeaderboardReleasesResponse> localVarReturnType = new GenericType<GameCenterLeaderboardReleasesResponse>() {};
    return apiClient.invokeAPI("GameCenterLeaderboardsApi.gameCenterLeaderboardsReleasesGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterLeaderboardUpdateRequest GameCenterLeaderboard representation (required)
   * @return GameCenterLeaderboardResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterLeaderboard </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterLeaderboardResponse gameCenterLeaderboardsUpdateInstance(String id, GameCenterLeaderboardUpdateRequest gameCenterLeaderboardUpdateRequest) throws ApiException {
    return gameCenterLeaderboardsUpdateInstanceWithHttpInfo(id, gameCenterLeaderboardUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterLeaderboardUpdateRequest GameCenterLeaderboard representation (required)
   * @return ApiResponse&lt;GameCenterLeaderboardResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterLeaderboard </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterLeaderboardResponse> gameCenterLeaderboardsUpdateInstanceWithHttpInfo(String id, GameCenterLeaderboardUpdateRequest gameCenterLeaderboardUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterLeaderboardsUpdateInstance");
    }
    if (gameCenterLeaderboardUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gameCenterLeaderboardUpdateRequest' when calling gameCenterLeaderboardsUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterLeaderboards/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterLeaderboardResponse> localVarReturnType = new GenericType<GameCenterLeaderboardResponse>() {};
    return apiClient.invokeAPI("GameCenterLeaderboardsApi.gameCenterLeaderboardsUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), gameCenterLeaderboardUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
