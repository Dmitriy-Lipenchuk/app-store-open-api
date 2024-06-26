package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.GameCenterLeaderboardSetCreateRequest;
import org.openapitools.client.model.GameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest;
import org.openapitools.client.model.GameCenterLeaderboardSetGameCenterLeaderboardsLinkagesResponse;
import org.openapitools.client.model.GameCenterLeaderboardSetGroupLeaderboardSetLinkageRequest;
import org.openapitools.client.model.GameCenterLeaderboardSetGroupLeaderboardSetLinkageResponse;
import org.openapitools.client.model.GameCenterLeaderboardSetLocalizationsResponse;
import org.openapitools.client.model.GameCenterLeaderboardSetReleasesResponse;
import org.openapitools.client.model.GameCenterLeaderboardSetResponse;
import org.openapitools.client.model.GameCenterLeaderboardSetUpdateRequest;
import org.openapitools.client.model.GameCenterLeaderboardsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class GameCenterLeaderboardSetsApi {
  private ApiClient apiClient;

  public GameCenterLeaderboardSetsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GameCenterLeaderboardSetsApi(ApiClient apiClient) {
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
   * @param gameCenterLeaderboardSetCreateRequest GameCenterLeaderboardSet representation (required)
   * @return GameCenterLeaderboardSetResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single GameCenterLeaderboardSet </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterLeaderboardSetResponse gameCenterLeaderboardSetsCreateInstance(GameCenterLeaderboardSetCreateRequest gameCenterLeaderboardSetCreateRequest) throws ApiException {
    return gameCenterLeaderboardSetsCreateInstanceWithHttpInfo(gameCenterLeaderboardSetCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param gameCenterLeaderboardSetCreateRequest GameCenterLeaderboardSet representation (required)
   * @return ApiResponse&lt;GameCenterLeaderboardSetResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single GameCenterLeaderboardSet </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterLeaderboardSetResponse> gameCenterLeaderboardSetsCreateInstanceWithHttpInfo(GameCenterLeaderboardSetCreateRequest gameCenterLeaderboardSetCreateRequest) throws ApiException {
    // Check required parameters
    if (gameCenterLeaderboardSetCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gameCenterLeaderboardSetCreateRequest' when calling gameCenterLeaderboardSetsCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterLeaderboardSetResponse> localVarReturnType = new GenericType<GameCenterLeaderboardSetResponse>() {};
    return apiClient.invokeAPI("GameCenterLeaderboardSetsApi.gameCenterLeaderboardSetsCreateInstance", "/v1/gameCenterLeaderboardSets", "POST", new ArrayList<>(), gameCenterLeaderboardSetCreateRequest,
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
  public void gameCenterLeaderboardSetsDeleteInstance(String id) throws ApiException {
    gameCenterLeaderboardSetsDeleteInstanceWithHttpInfo(id);
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
  public ApiResponse<Void> gameCenterLeaderboardSetsDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterLeaderboardSetsDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterLeaderboardSets/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("GameCenterLeaderboardSetsApi.gameCenterLeaderboardSetsDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest List of related linkages (required)
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
  public void gameCenterLeaderboardSetsGameCenterLeaderboardsCreateToManyRelationship(String id, GameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest gameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest) throws ApiException {
    gameCenterLeaderboardSetsGameCenterLeaderboardsCreateToManyRelationshipWithHttpInfo(id, gameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest);
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest List of related linkages (required)
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
  public ApiResponse<Void> gameCenterLeaderboardSetsGameCenterLeaderboardsCreateToManyRelationshipWithHttpInfo(String id, GameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest gameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterLeaderboardSetsGameCenterLeaderboardsCreateToManyRelationship");
    }
    if (gameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest' when calling gameCenterLeaderboardSetsGameCenterLeaderboardsCreateToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterLeaderboardSets/{id}/relationships/gameCenterLeaderboards"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("GameCenterLeaderboardSetsApi.gameCenterLeaderboardSetsGameCenterLeaderboardsCreateToManyRelationship", localVarPath, "POST", new ArrayList<>(), gameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest List of related linkages (required)
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
  public void gameCenterLeaderboardSetsGameCenterLeaderboardsDeleteToManyRelationship(String id, GameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest gameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest) throws ApiException {
    gameCenterLeaderboardSetsGameCenterLeaderboardsDeleteToManyRelationshipWithHttpInfo(id, gameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest);
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest List of related linkages (required)
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
  public ApiResponse<Void> gameCenterLeaderboardSetsGameCenterLeaderboardsDeleteToManyRelationshipWithHttpInfo(String id, GameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest gameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterLeaderboardSetsGameCenterLeaderboardsDeleteToManyRelationship");
    }
    if (gameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest' when calling gameCenterLeaderboardSetsGameCenterLeaderboardsDeleteToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterLeaderboardSets/{id}/relationships/gameCenterLeaderboards"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("GameCenterLeaderboardSetsApi.gameCenterLeaderboardSetsGameCenterLeaderboardsDeleteToManyRelationship", localVarPath, "DELETE", new ArrayList<>(), gameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest,
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
  public GameCenterLeaderboardsResponse gameCenterLeaderboardSetsGameCenterLeaderboardsGetToManyRelated(String id, List<String> filterArchived, List<String> filterReferenceName, List<String> filterId, List<String> fieldsGameCenterLeaderboardLocalizations, List<String> fieldsGameCenterLeaderboardSets, List<String> fieldsGameCenterGroups, List<String> fieldsGameCenterDetails, List<String> fieldsGameCenterLeaderboards, List<String> fieldsGameCenterLeaderboardReleases, Integer limit, Integer limitGameCenterLeaderboardSets, Integer limitLocalizations, Integer limitReleases, List<String> include) throws ApiException {
    return gameCenterLeaderboardSetsGameCenterLeaderboardsGetToManyRelatedWithHttpInfo(id, filterArchived, filterReferenceName, filterId, fieldsGameCenterLeaderboardLocalizations, fieldsGameCenterLeaderboardSets, fieldsGameCenterGroups, fieldsGameCenterDetails, fieldsGameCenterLeaderboards, fieldsGameCenterLeaderboardReleases, limit, limitGameCenterLeaderboardSets, limitLocalizations, limitReleases, include).getData();
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
  public ApiResponse<GameCenterLeaderboardsResponse> gameCenterLeaderboardSetsGameCenterLeaderboardsGetToManyRelatedWithHttpInfo(String id, List<String> filterArchived, List<String> filterReferenceName, List<String> filterId, List<String> fieldsGameCenterLeaderboardLocalizations, List<String> fieldsGameCenterLeaderboardSets, List<String> fieldsGameCenterGroups, List<String> fieldsGameCenterDetails, List<String> fieldsGameCenterLeaderboards, List<String> fieldsGameCenterLeaderboardReleases, Integer limit, Integer limitGameCenterLeaderboardSets, Integer limitLocalizations, Integer limitReleases, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterLeaderboardSetsGameCenterLeaderboardsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterLeaderboardSets/{id}/gameCenterLeaderboards"
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
    return apiClient.invokeAPI("GameCenterLeaderboardSetsApi.gameCenterLeaderboardSetsGameCenterLeaderboardsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param limit maximum resources per page (optional)
   * @return GameCenterLeaderboardSetGameCenterLeaderboardsLinkagesResponse
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
  public GameCenterLeaderboardSetGameCenterLeaderboardsLinkagesResponse gameCenterLeaderboardSetsGameCenterLeaderboardsGetToManyRelationship(String id, Integer limit) throws ApiException {
    return gameCenterLeaderboardSetsGameCenterLeaderboardsGetToManyRelationshipWithHttpInfo(id, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;GameCenterLeaderboardSetGameCenterLeaderboardsLinkagesResponse&gt;
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
  public ApiResponse<GameCenterLeaderboardSetGameCenterLeaderboardsLinkagesResponse> gameCenterLeaderboardSetsGameCenterLeaderboardsGetToManyRelationshipWithHttpInfo(String id, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterLeaderboardSetsGameCenterLeaderboardsGetToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterLeaderboardSets/{id}/relationships/gameCenterLeaderboards"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "limit", limit)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterLeaderboardSetGameCenterLeaderboardsLinkagesResponse> localVarReturnType = new GenericType<GameCenterLeaderboardSetGameCenterLeaderboardsLinkagesResponse>() {};
    return apiClient.invokeAPI("GameCenterLeaderboardSetsApi.gameCenterLeaderboardSetsGameCenterLeaderboardsGetToManyRelationship", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest List of related linkages (required)
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
  public void gameCenterLeaderboardSetsGameCenterLeaderboardsReplaceToManyRelationship(String id, GameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest gameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest) throws ApiException {
    gameCenterLeaderboardSetsGameCenterLeaderboardsReplaceToManyRelationshipWithHttpInfo(id, gameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest);
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest List of related linkages (required)
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
  public ApiResponse<Void> gameCenterLeaderboardSetsGameCenterLeaderboardsReplaceToManyRelationshipWithHttpInfo(String id, GameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest gameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterLeaderboardSetsGameCenterLeaderboardsReplaceToManyRelationship");
    }
    if (gameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest' when calling gameCenterLeaderboardSetsGameCenterLeaderboardsReplaceToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterLeaderboardSets/{id}/relationships/gameCenterLeaderboards"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("GameCenterLeaderboardSetsApi.gameCenterLeaderboardSetsGameCenterLeaderboardsReplaceToManyRelationship", localVarPath, "PATCH", new ArrayList<>(), gameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterLeaderboardSets the fields to include for returned resources of type gameCenterLeaderboardSets (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsGameCenterLeaderboardSetLocalizations the fields to include for returned resources of type gameCenterLeaderboardSetLocalizations (optional)
   * @param fieldsGameCenterLeaderboardSetReleases the fields to include for returned resources of type gameCenterLeaderboardSetReleases (optional)
   * @param fieldsGameCenterLeaderboards the fields to include for returned resources of type gameCenterLeaderboards (optional)
   * @param limitGameCenterLeaderboards maximum number of related gameCenterLeaderboards returned (when they are included) (optional)
   * @param limitLocalizations maximum number of related localizations returned (when they are included) (optional)
   * @param limitReleases maximum number of related releases returned (when they are included) (optional)
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
  public GameCenterLeaderboardSetResponse gameCenterLeaderboardSetsGetInstance(String id, List<String> fieldsGameCenterLeaderboardSets, List<String> include, List<String> fieldsGameCenterLeaderboardSetLocalizations, List<String> fieldsGameCenterLeaderboardSetReleases, List<String> fieldsGameCenterLeaderboards, Integer limitGameCenterLeaderboards, Integer limitLocalizations, Integer limitReleases) throws ApiException {
    return gameCenterLeaderboardSetsGetInstanceWithHttpInfo(id, fieldsGameCenterLeaderboardSets, include, fieldsGameCenterLeaderboardSetLocalizations, fieldsGameCenterLeaderboardSetReleases, fieldsGameCenterLeaderboards, limitGameCenterLeaderboards, limitLocalizations, limitReleases).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterLeaderboardSets the fields to include for returned resources of type gameCenterLeaderboardSets (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsGameCenterLeaderboardSetLocalizations the fields to include for returned resources of type gameCenterLeaderboardSetLocalizations (optional)
   * @param fieldsGameCenterLeaderboardSetReleases the fields to include for returned resources of type gameCenterLeaderboardSetReleases (optional)
   * @param fieldsGameCenterLeaderboards the fields to include for returned resources of type gameCenterLeaderboards (optional)
   * @param limitGameCenterLeaderboards maximum number of related gameCenterLeaderboards returned (when they are included) (optional)
   * @param limitLocalizations maximum number of related localizations returned (when they are included) (optional)
   * @param limitReleases maximum number of related releases returned (when they are included) (optional)
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
  public ApiResponse<GameCenterLeaderboardSetResponse> gameCenterLeaderboardSetsGetInstanceWithHttpInfo(String id, List<String> fieldsGameCenterLeaderboardSets, List<String> include, List<String> fieldsGameCenterLeaderboardSetLocalizations, List<String> fieldsGameCenterLeaderboardSetReleases, List<String> fieldsGameCenterLeaderboards, Integer limitGameCenterLeaderboards, Integer limitLocalizations, Integer limitReleases) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterLeaderboardSetsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterLeaderboardSets/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardSets]", fieldsGameCenterLeaderboardSets)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardSetLocalizations]", fieldsGameCenterLeaderboardSetLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardSetReleases]", fieldsGameCenterLeaderboardSetReleases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboards]", fieldsGameCenterLeaderboards));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[gameCenterLeaderboards]", limitGameCenterLeaderboards));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[localizations]", limitLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[releases]", limitReleases));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterLeaderboardSetResponse> localVarReturnType = new GenericType<GameCenterLeaderboardSetResponse>() {};
    return apiClient.invokeAPI("GameCenterLeaderboardSetsApi.gameCenterLeaderboardSetsGetInstance", localVarPath, "GET", localVarQueryParams, null,
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
  public GameCenterLeaderboardSetResponse gameCenterLeaderboardSetsGroupLeaderboardSetGetToOneRelated(String id, List<String> fieldsGameCenterLeaderboardSetLocalizations, List<String> fieldsGameCenterLeaderboardSetReleases, List<String> fieldsGameCenterLeaderboardSets, List<String> fieldsGameCenterGroups, List<String> fieldsGameCenterDetails, List<String> fieldsGameCenterLeaderboards, Integer limitLocalizations, Integer limitGameCenterLeaderboards, Integer limitReleases, List<String> include) throws ApiException {
    return gameCenterLeaderboardSetsGroupLeaderboardSetGetToOneRelatedWithHttpInfo(id, fieldsGameCenterLeaderboardSetLocalizations, fieldsGameCenterLeaderboardSetReleases, fieldsGameCenterLeaderboardSets, fieldsGameCenterGroups, fieldsGameCenterDetails, fieldsGameCenterLeaderboards, limitLocalizations, limitGameCenterLeaderboards, limitReleases, include).getData();
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
  public ApiResponse<GameCenterLeaderboardSetResponse> gameCenterLeaderboardSetsGroupLeaderboardSetGetToOneRelatedWithHttpInfo(String id, List<String> fieldsGameCenterLeaderboardSetLocalizations, List<String> fieldsGameCenterLeaderboardSetReleases, List<String> fieldsGameCenterLeaderboardSets, List<String> fieldsGameCenterGroups, List<String> fieldsGameCenterDetails, List<String> fieldsGameCenterLeaderboards, Integer limitLocalizations, Integer limitGameCenterLeaderboards, Integer limitReleases, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterLeaderboardSetsGroupLeaderboardSetGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterLeaderboardSets/{id}/groupLeaderboardSet"
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
    return apiClient.invokeAPI("GameCenterLeaderboardSetsApi.gameCenterLeaderboardSetsGroupLeaderboardSetGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @return GameCenterLeaderboardSetGroupLeaderboardSetLinkageResponse
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
  public GameCenterLeaderboardSetGroupLeaderboardSetLinkageResponse gameCenterLeaderboardSetsGroupLeaderboardSetGetToOneRelationship(String id) throws ApiException {
    return gameCenterLeaderboardSetsGroupLeaderboardSetGetToOneRelationshipWithHttpInfo(id).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @return ApiResponse&lt;GameCenterLeaderboardSetGroupLeaderboardSetLinkageResponse&gt;
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
  public ApiResponse<GameCenterLeaderboardSetGroupLeaderboardSetLinkageResponse> gameCenterLeaderboardSetsGroupLeaderboardSetGetToOneRelationshipWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterLeaderboardSetsGroupLeaderboardSetGetToOneRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterLeaderboardSets/{id}/relationships/groupLeaderboardSet"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterLeaderboardSetGroupLeaderboardSetLinkageResponse> localVarReturnType = new GenericType<GameCenterLeaderboardSetGroupLeaderboardSetLinkageResponse>() {};
    return apiClient.invokeAPI("GameCenterLeaderboardSetsApi.gameCenterLeaderboardSetsGroupLeaderboardSetGetToOneRelationship", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterLeaderboardSetGroupLeaderboardSetLinkageRequest Related linkage (required)
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
  public void gameCenterLeaderboardSetsGroupLeaderboardSetUpdateToOneRelationship(String id, GameCenterLeaderboardSetGroupLeaderboardSetLinkageRequest gameCenterLeaderboardSetGroupLeaderboardSetLinkageRequest) throws ApiException {
    gameCenterLeaderboardSetsGroupLeaderboardSetUpdateToOneRelationshipWithHttpInfo(id, gameCenterLeaderboardSetGroupLeaderboardSetLinkageRequest);
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterLeaderboardSetGroupLeaderboardSetLinkageRequest Related linkage (required)
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
  public ApiResponse<Void> gameCenterLeaderboardSetsGroupLeaderboardSetUpdateToOneRelationshipWithHttpInfo(String id, GameCenterLeaderboardSetGroupLeaderboardSetLinkageRequest gameCenterLeaderboardSetGroupLeaderboardSetLinkageRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterLeaderboardSetsGroupLeaderboardSetUpdateToOneRelationship");
    }
    if (gameCenterLeaderboardSetGroupLeaderboardSetLinkageRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gameCenterLeaderboardSetGroupLeaderboardSetLinkageRequest' when calling gameCenterLeaderboardSetsGroupLeaderboardSetUpdateToOneRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterLeaderboardSets/{id}/relationships/groupLeaderboardSet"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("GameCenterLeaderboardSetsApi.gameCenterLeaderboardSetsGroupLeaderboardSetUpdateToOneRelationship", localVarPath, "PATCH", new ArrayList<>(), gameCenterLeaderboardSetGroupLeaderboardSetLinkageRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterLeaderboardSetLocalizations the fields to include for returned resources of type gameCenterLeaderboardSetLocalizations (optional)
   * @param fieldsGameCenterLeaderboardSets the fields to include for returned resources of type gameCenterLeaderboardSets (optional)
   * @param fieldsGameCenterLeaderboardSetImages the fields to include for returned resources of type gameCenterLeaderboardSetImages (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return GameCenterLeaderboardSetLocalizationsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of GameCenterLeaderboardSetLocalizations </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterLeaderboardSetLocalizationsResponse gameCenterLeaderboardSetsLocalizationsGetToManyRelated(String id, List<String> fieldsGameCenterLeaderboardSetLocalizations, List<String> fieldsGameCenterLeaderboardSets, List<String> fieldsGameCenterLeaderboardSetImages, Integer limit, List<String> include) throws ApiException {
    return gameCenterLeaderboardSetsLocalizationsGetToManyRelatedWithHttpInfo(id, fieldsGameCenterLeaderboardSetLocalizations, fieldsGameCenterLeaderboardSets, fieldsGameCenterLeaderboardSetImages, limit, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterLeaderboardSetLocalizations the fields to include for returned resources of type gameCenterLeaderboardSetLocalizations (optional)
   * @param fieldsGameCenterLeaderboardSets the fields to include for returned resources of type gameCenterLeaderboardSets (optional)
   * @param fieldsGameCenterLeaderboardSetImages the fields to include for returned resources of type gameCenterLeaderboardSetImages (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;GameCenterLeaderboardSetLocalizationsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of GameCenterLeaderboardSetLocalizations </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterLeaderboardSetLocalizationsResponse> gameCenterLeaderboardSetsLocalizationsGetToManyRelatedWithHttpInfo(String id, List<String> fieldsGameCenterLeaderboardSetLocalizations, List<String> fieldsGameCenterLeaderboardSets, List<String> fieldsGameCenterLeaderboardSetImages, Integer limit, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterLeaderboardSetsLocalizationsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterLeaderboardSets/{id}/localizations"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardSetLocalizations]", fieldsGameCenterLeaderboardSetLocalizations)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardSets]", fieldsGameCenterLeaderboardSets));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardSetImages]", fieldsGameCenterLeaderboardSetImages));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterLeaderboardSetLocalizationsResponse> localVarReturnType = new GenericType<GameCenterLeaderboardSetLocalizationsResponse>() {};
    return apiClient.invokeAPI("GameCenterLeaderboardSetsApi.gameCenterLeaderboardSetsLocalizationsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterLive filter by attribute &#39;live&#39; (optional)
   * @param filterGameCenterDetail filter by id(s) of related &#39;gameCenterDetail&#39; (optional)
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
  public GameCenterLeaderboardSetReleasesResponse gameCenterLeaderboardSetsReleasesGetToManyRelated(String id, List<String> filterLive, List<String> filterGameCenterDetail, List<String> fieldsGameCenterLeaderboardSetReleases, List<String> fieldsGameCenterLeaderboardSets, List<String> fieldsGameCenterDetails, Integer limit, List<String> include) throws ApiException {
    return gameCenterLeaderboardSetsReleasesGetToManyRelatedWithHttpInfo(id, filterLive, filterGameCenterDetail, fieldsGameCenterLeaderboardSetReleases, fieldsGameCenterLeaderboardSets, fieldsGameCenterDetails, limit, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterLive filter by attribute &#39;live&#39; (optional)
   * @param filterGameCenterDetail filter by id(s) of related &#39;gameCenterDetail&#39; (optional)
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
  public ApiResponse<GameCenterLeaderboardSetReleasesResponse> gameCenterLeaderboardSetsReleasesGetToManyRelatedWithHttpInfo(String id, List<String> filterLive, List<String> filterGameCenterDetail, List<String> fieldsGameCenterLeaderboardSetReleases, List<String> fieldsGameCenterLeaderboardSets, List<String> fieldsGameCenterDetails, Integer limit, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterLeaderboardSetsReleasesGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterLeaderboardSets/{id}/releases"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[live]", filterLive)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[gameCenterDetail]", filterGameCenterDetail));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardSetReleases]", fieldsGameCenterLeaderboardSetReleases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardSets]", fieldsGameCenterLeaderboardSets));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterDetails]", fieldsGameCenterDetails));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterLeaderboardSetReleasesResponse> localVarReturnType = new GenericType<GameCenterLeaderboardSetReleasesResponse>() {};
    return apiClient.invokeAPI("GameCenterLeaderboardSetsApi.gameCenterLeaderboardSetsReleasesGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterLeaderboardSetUpdateRequest GameCenterLeaderboardSet representation (required)
   * @return GameCenterLeaderboardSetResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterLeaderboardSet </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterLeaderboardSetResponse gameCenterLeaderboardSetsUpdateInstance(String id, GameCenterLeaderboardSetUpdateRequest gameCenterLeaderboardSetUpdateRequest) throws ApiException {
    return gameCenterLeaderboardSetsUpdateInstanceWithHttpInfo(id, gameCenterLeaderboardSetUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterLeaderboardSetUpdateRequest GameCenterLeaderboardSet representation (required)
   * @return ApiResponse&lt;GameCenterLeaderboardSetResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterLeaderboardSet </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterLeaderboardSetResponse> gameCenterLeaderboardSetsUpdateInstanceWithHttpInfo(String id, GameCenterLeaderboardSetUpdateRequest gameCenterLeaderboardSetUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterLeaderboardSetsUpdateInstance");
    }
    if (gameCenterLeaderboardSetUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gameCenterLeaderboardSetUpdateRequest' when calling gameCenterLeaderboardSetsUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterLeaderboardSets/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterLeaderboardSetResponse> localVarReturnType = new GenericType<GameCenterLeaderboardSetResponse>() {};
    return apiClient.invokeAPI("GameCenterLeaderboardSetsApi.gameCenterLeaderboardSetsUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), gameCenterLeaderboardSetUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
