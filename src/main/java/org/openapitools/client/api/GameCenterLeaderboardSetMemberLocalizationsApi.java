package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.GameCenterLeaderboardResponse;
import org.openapitools.client.model.GameCenterLeaderboardSetMemberLocalizationCreateRequest;
import org.openapitools.client.model.GameCenterLeaderboardSetMemberLocalizationResponse;
import org.openapitools.client.model.GameCenterLeaderboardSetMemberLocalizationUpdateRequest;
import org.openapitools.client.model.GameCenterLeaderboardSetMemberLocalizationsResponse;
import org.openapitools.client.model.GameCenterLeaderboardSetResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class GameCenterLeaderboardSetMemberLocalizationsApi {
  private ApiClient apiClient;

  public GameCenterLeaderboardSetMemberLocalizationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GameCenterLeaderboardSetMemberLocalizationsApi(ApiClient apiClient) {
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
   * @param gameCenterLeaderboardSetMemberLocalizationCreateRequest GameCenterLeaderboardSetMemberLocalization representation (required)
   * @return GameCenterLeaderboardSetMemberLocalizationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single GameCenterLeaderboardSetMemberLocalization </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterLeaderboardSetMemberLocalizationResponse gameCenterLeaderboardSetMemberLocalizationsCreateInstance(GameCenterLeaderboardSetMemberLocalizationCreateRequest gameCenterLeaderboardSetMemberLocalizationCreateRequest) throws ApiException {
    return gameCenterLeaderboardSetMemberLocalizationsCreateInstanceWithHttpInfo(gameCenterLeaderboardSetMemberLocalizationCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param gameCenterLeaderboardSetMemberLocalizationCreateRequest GameCenterLeaderboardSetMemberLocalization representation (required)
   * @return ApiResponse&lt;GameCenterLeaderboardSetMemberLocalizationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single GameCenterLeaderboardSetMemberLocalization </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterLeaderboardSetMemberLocalizationResponse> gameCenterLeaderboardSetMemberLocalizationsCreateInstanceWithHttpInfo(GameCenterLeaderboardSetMemberLocalizationCreateRequest gameCenterLeaderboardSetMemberLocalizationCreateRequest) throws ApiException {
    // Check required parameters
    if (gameCenterLeaderboardSetMemberLocalizationCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gameCenterLeaderboardSetMemberLocalizationCreateRequest' when calling gameCenterLeaderboardSetMemberLocalizationsCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterLeaderboardSetMemberLocalizationResponse> localVarReturnType = new GenericType<GameCenterLeaderboardSetMemberLocalizationResponse>() {};
    return apiClient.invokeAPI("GameCenterLeaderboardSetMemberLocalizationsApi.gameCenterLeaderboardSetMemberLocalizationsCreateInstance", "/v1/gameCenterLeaderboardSetMemberLocalizations", "POST", new ArrayList<>(), gameCenterLeaderboardSetMemberLocalizationCreateRequest,
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
  public void gameCenterLeaderboardSetMemberLocalizationsDeleteInstance(String id) throws ApiException {
    gameCenterLeaderboardSetMemberLocalizationsDeleteInstanceWithHttpInfo(id);
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
  public ApiResponse<Void> gameCenterLeaderboardSetMemberLocalizationsDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterLeaderboardSetMemberLocalizationsDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterLeaderboardSetMemberLocalizations/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("GameCenterLeaderboardSetMemberLocalizationsApi.gameCenterLeaderboardSetMemberLocalizationsDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
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
  public GameCenterLeaderboardResponse gameCenterLeaderboardSetMemberLocalizationsGameCenterLeaderboardGetToOneRelated(String id, List<String> fieldsGameCenterLeaderboardLocalizations, List<String> fieldsGameCenterLeaderboardSets, List<String> fieldsGameCenterGroups, List<String> fieldsGameCenterDetails, List<String> fieldsGameCenterLeaderboards, List<String> fieldsGameCenterLeaderboardReleases, Integer limitGameCenterLeaderboardSets, Integer limitLocalizations, Integer limitReleases, List<String> include) throws ApiException {
    return gameCenterLeaderboardSetMemberLocalizationsGameCenterLeaderboardGetToOneRelatedWithHttpInfo(id, fieldsGameCenterLeaderboardLocalizations, fieldsGameCenterLeaderboardSets, fieldsGameCenterGroups, fieldsGameCenterDetails, fieldsGameCenterLeaderboards, fieldsGameCenterLeaderboardReleases, limitGameCenterLeaderboardSets, limitLocalizations, limitReleases, include).getData();
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
  public ApiResponse<GameCenterLeaderboardResponse> gameCenterLeaderboardSetMemberLocalizationsGameCenterLeaderboardGetToOneRelatedWithHttpInfo(String id, List<String> fieldsGameCenterLeaderboardLocalizations, List<String> fieldsGameCenterLeaderboardSets, List<String> fieldsGameCenterGroups, List<String> fieldsGameCenterDetails, List<String> fieldsGameCenterLeaderboards, List<String> fieldsGameCenterLeaderboardReleases, Integer limitGameCenterLeaderboardSets, Integer limitLocalizations, Integer limitReleases, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterLeaderboardSetMemberLocalizationsGameCenterLeaderboardGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterLeaderboardSetMemberLocalizations/{id}/gameCenterLeaderboard"
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
    return apiClient.invokeAPI("GameCenterLeaderboardSetMemberLocalizationsApi.gameCenterLeaderboardSetMemberLocalizationsGameCenterLeaderboardGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterLeaderboardSetLocalizations the fields to include for returned resources of type gameCenterLeaderboardSetLocalizations (optional)
   * @param fieldsGameCenterLeaderboardSetReleases the fields to include for returned resources of type gameCenterLeaderboardSetReleases (optional)
   * @param fieldsGameCenterLeaderboardSets the fields to include for returned resources of type gameCenterLeaderboardSets (optional)
   * @param fieldsGameCenterGroups the fields to include for returned resources of type gameCenterGroups (optional)
   * @param fieldsGameCenterDetails the fields to include for returned resources of type gameCenterDetails (optional)
   * @param fieldsGameCenterLeaderboards the fields to include for returned resources of type gameCenterLeaderboards (optional)
   * @param limitLocalizations maximum number of related localizations returned (when they are included) (optional)
   * @param limitGameCenterLeaderboards maximum number of related gameCenterLeaderboards returned (when they are included) (optional)
   * @param limitReleases maximum number of related releases returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return GameCenterLeaderboardSetResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterLeaderboardSet </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterLeaderboardSetResponse gameCenterLeaderboardSetMemberLocalizationsGameCenterLeaderboardSetGetToOneRelated(String id, List<String> fieldsGameCenterLeaderboardSetLocalizations, List<String> fieldsGameCenterLeaderboardSetReleases, List<String> fieldsGameCenterLeaderboardSets, List<String> fieldsGameCenterGroups, List<String> fieldsGameCenterDetails, List<String> fieldsGameCenterLeaderboards, Integer limitLocalizations, Integer limitGameCenterLeaderboards, Integer limitReleases, List<String> include) throws ApiException {
    return gameCenterLeaderboardSetMemberLocalizationsGameCenterLeaderboardSetGetToOneRelatedWithHttpInfo(id, fieldsGameCenterLeaderboardSetLocalizations, fieldsGameCenterLeaderboardSetReleases, fieldsGameCenterLeaderboardSets, fieldsGameCenterGroups, fieldsGameCenterDetails, fieldsGameCenterLeaderboards, limitLocalizations, limitGameCenterLeaderboards, limitReleases, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterLeaderboardSetLocalizations the fields to include for returned resources of type gameCenterLeaderboardSetLocalizations (optional)
   * @param fieldsGameCenterLeaderboardSetReleases the fields to include for returned resources of type gameCenterLeaderboardSetReleases (optional)
   * @param fieldsGameCenterLeaderboardSets the fields to include for returned resources of type gameCenterLeaderboardSets (optional)
   * @param fieldsGameCenterGroups the fields to include for returned resources of type gameCenterGroups (optional)
   * @param fieldsGameCenterDetails the fields to include for returned resources of type gameCenterDetails (optional)
   * @param fieldsGameCenterLeaderboards the fields to include for returned resources of type gameCenterLeaderboards (optional)
   * @param limitLocalizations maximum number of related localizations returned (when they are included) (optional)
   * @param limitGameCenterLeaderboards maximum number of related gameCenterLeaderboards returned (when they are included) (optional)
   * @param limitReleases maximum number of related releases returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;GameCenterLeaderboardSetResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterLeaderboardSet </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterLeaderboardSetResponse> gameCenterLeaderboardSetMemberLocalizationsGameCenterLeaderboardSetGetToOneRelatedWithHttpInfo(String id, List<String> fieldsGameCenterLeaderboardSetLocalizations, List<String> fieldsGameCenterLeaderboardSetReleases, List<String> fieldsGameCenterLeaderboardSets, List<String> fieldsGameCenterGroups, List<String> fieldsGameCenterDetails, List<String> fieldsGameCenterLeaderboards, Integer limitLocalizations, Integer limitGameCenterLeaderboards, Integer limitReleases, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterLeaderboardSetMemberLocalizationsGameCenterLeaderboardSetGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterLeaderboardSetMemberLocalizations/{id}/gameCenterLeaderboardSet"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardSetLocalizations]", fieldsGameCenterLeaderboardSetLocalizations)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardSetReleases]", fieldsGameCenterLeaderboardSetReleases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardSets]", fieldsGameCenterLeaderboardSets));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterGroups]", fieldsGameCenterGroups));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterDetails]", fieldsGameCenterDetails));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboards]", fieldsGameCenterLeaderboards));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[localizations]", limitLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[gameCenterLeaderboards]", limitGameCenterLeaderboards));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[releases]", limitReleases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterLeaderboardSetResponse> localVarReturnType = new GenericType<GameCenterLeaderboardSetResponse>() {};
    return apiClient.invokeAPI("GameCenterLeaderboardSetMemberLocalizationsApi.gameCenterLeaderboardSetMemberLocalizationsGameCenterLeaderboardSetGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param filterGameCenterLeaderboard filter by id(s) of related &#39;gameCenterLeaderboard&#39; (required)
   * @param filterGameCenterLeaderboardSet filter by id(s) of related &#39;gameCenterLeaderboardSet&#39; (required)
   * @param fieldsGameCenterLeaderboardSetMemberLocalizations the fields to include for returned resources of type gameCenterLeaderboardSetMemberLocalizations (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsGameCenterLeaderboardSets the fields to include for returned resources of type gameCenterLeaderboardSets (optional)
   * @param fieldsGameCenterLeaderboards the fields to include for returned resources of type gameCenterLeaderboards (optional)
   * @return GameCenterLeaderboardSetMemberLocalizationsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of GameCenterLeaderboardSetMemberLocalizations </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterLeaderboardSetMemberLocalizationsResponse gameCenterLeaderboardSetMemberLocalizationsGetCollection(List<String> filterGameCenterLeaderboard, List<String> filterGameCenterLeaderboardSet, List<String> fieldsGameCenterLeaderboardSetMemberLocalizations, Integer limit, List<String> include, List<String> fieldsGameCenterLeaderboardSets, List<String> fieldsGameCenterLeaderboards) throws ApiException {
    return gameCenterLeaderboardSetMemberLocalizationsGetCollectionWithHttpInfo(filterGameCenterLeaderboard, filterGameCenterLeaderboardSet, fieldsGameCenterLeaderboardSetMemberLocalizations, limit, include, fieldsGameCenterLeaderboardSets, fieldsGameCenterLeaderboards).getData();
  }

  /**
   * 
   * 
   * @param filterGameCenterLeaderboard filter by id(s) of related &#39;gameCenterLeaderboard&#39; (required)
   * @param filterGameCenterLeaderboardSet filter by id(s) of related &#39;gameCenterLeaderboardSet&#39; (required)
   * @param fieldsGameCenterLeaderboardSetMemberLocalizations the fields to include for returned resources of type gameCenterLeaderboardSetMemberLocalizations (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsGameCenterLeaderboardSets the fields to include for returned resources of type gameCenterLeaderboardSets (optional)
   * @param fieldsGameCenterLeaderboards the fields to include for returned resources of type gameCenterLeaderboards (optional)
   * @return ApiResponse&lt;GameCenterLeaderboardSetMemberLocalizationsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of GameCenterLeaderboardSetMemberLocalizations </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterLeaderboardSetMemberLocalizationsResponse> gameCenterLeaderboardSetMemberLocalizationsGetCollectionWithHttpInfo(List<String> filterGameCenterLeaderboard, List<String> filterGameCenterLeaderboardSet, List<String> fieldsGameCenterLeaderboardSetMemberLocalizations, Integer limit, List<String> include, List<String> fieldsGameCenterLeaderboardSets, List<String> fieldsGameCenterLeaderboards) throws ApiException {
    // Check required parameters
    if (filterGameCenterLeaderboard == null) {
      throw new ApiException(400, "Missing the required parameter 'filterGameCenterLeaderboard' when calling gameCenterLeaderboardSetMemberLocalizationsGetCollection");
    }
    if (filterGameCenterLeaderboardSet == null) {
      throw new ApiException(400, "Missing the required parameter 'filterGameCenterLeaderboardSet' when calling gameCenterLeaderboardSetMemberLocalizationsGetCollection");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[gameCenterLeaderboard]", filterGameCenterLeaderboard)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[gameCenterLeaderboardSet]", filterGameCenterLeaderboardSet));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardSetMemberLocalizations]", fieldsGameCenterLeaderboardSetMemberLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardSets]", fieldsGameCenterLeaderboardSets));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboards]", fieldsGameCenterLeaderboards));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterLeaderboardSetMemberLocalizationsResponse> localVarReturnType = new GenericType<GameCenterLeaderboardSetMemberLocalizationsResponse>() {};
    return apiClient.invokeAPI("GameCenterLeaderboardSetMemberLocalizationsApi.gameCenterLeaderboardSetMemberLocalizationsGetCollection", "/v1/gameCenterLeaderboardSetMemberLocalizations", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterLeaderboardSetMemberLocalizationUpdateRequest GameCenterLeaderboardSetMemberLocalization representation (required)
   * @return GameCenterLeaderboardSetMemberLocalizationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterLeaderboardSetMemberLocalization </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterLeaderboardSetMemberLocalizationResponse gameCenterLeaderboardSetMemberLocalizationsUpdateInstance(String id, GameCenterLeaderboardSetMemberLocalizationUpdateRequest gameCenterLeaderboardSetMemberLocalizationUpdateRequest) throws ApiException {
    return gameCenterLeaderboardSetMemberLocalizationsUpdateInstanceWithHttpInfo(id, gameCenterLeaderboardSetMemberLocalizationUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterLeaderboardSetMemberLocalizationUpdateRequest GameCenterLeaderboardSetMemberLocalization representation (required)
   * @return ApiResponse&lt;GameCenterLeaderboardSetMemberLocalizationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterLeaderboardSetMemberLocalization </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterLeaderboardSetMemberLocalizationResponse> gameCenterLeaderboardSetMemberLocalizationsUpdateInstanceWithHttpInfo(String id, GameCenterLeaderboardSetMemberLocalizationUpdateRequest gameCenterLeaderboardSetMemberLocalizationUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterLeaderboardSetMemberLocalizationsUpdateInstance");
    }
    if (gameCenterLeaderboardSetMemberLocalizationUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gameCenterLeaderboardSetMemberLocalizationUpdateRequest' when calling gameCenterLeaderboardSetMemberLocalizationsUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterLeaderboardSetMemberLocalizations/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterLeaderboardSetMemberLocalizationResponse> localVarReturnType = new GenericType<GameCenterLeaderboardSetMemberLocalizationResponse>() {};
    return apiClient.invokeAPI("GameCenterLeaderboardSetMemberLocalizationsApi.gameCenterLeaderboardSetMemberLocalizationsUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), gameCenterLeaderboardSetMemberLocalizationUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
