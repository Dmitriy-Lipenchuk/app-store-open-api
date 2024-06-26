package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.GameCenterAchievementImageResponse;
import org.openapitools.client.model.GameCenterAchievementLocalizationCreateRequest;
import org.openapitools.client.model.GameCenterAchievementLocalizationResponse;
import org.openapitools.client.model.GameCenterAchievementLocalizationUpdateRequest;
import org.openapitools.client.model.GameCenterAchievementResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class GameCenterAchievementLocalizationsApi {
  private ApiClient apiClient;

  public GameCenterAchievementLocalizationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GameCenterAchievementLocalizationsApi(ApiClient apiClient) {
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
   * @param gameCenterAchievementLocalizationCreateRequest GameCenterAchievementLocalization representation (required)
   * @return GameCenterAchievementLocalizationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single GameCenterAchievementLocalization </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterAchievementLocalizationResponse gameCenterAchievementLocalizationsCreateInstance(GameCenterAchievementLocalizationCreateRequest gameCenterAchievementLocalizationCreateRequest) throws ApiException {
    return gameCenterAchievementLocalizationsCreateInstanceWithHttpInfo(gameCenterAchievementLocalizationCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param gameCenterAchievementLocalizationCreateRequest GameCenterAchievementLocalization representation (required)
   * @return ApiResponse&lt;GameCenterAchievementLocalizationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single GameCenterAchievementLocalization </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterAchievementLocalizationResponse> gameCenterAchievementLocalizationsCreateInstanceWithHttpInfo(GameCenterAchievementLocalizationCreateRequest gameCenterAchievementLocalizationCreateRequest) throws ApiException {
    // Check required parameters
    if (gameCenterAchievementLocalizationCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gameCenterAchievementLocalizationCreateRequest' when calling gameCenterAchievementLocalizationsCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterAchievementLocalizationResponse> localVarReturnType = new GenericType<GameCenterAchievementLocalizationResponse>() {};
    return apiClient.invokeAPI("GameCenterAchievementLocalizationsApi.gameCenterAchievementLocalizationsCreateInstance", "/v1/gameCenterAchievementLocalizations", "POST", new ArrayList<>(), gameCenterAchievementLocalizationCreateRequest,
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
  public void gameCenterAchievementLocalizationsDeleteInstance(String id) throws ApiException {
    gameCenterAchievementLocalizationsDeleteInstanceWithHttpInfo(id);
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
  public ApiResponse<Void> gameCenterAchievementLocalizationsDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterAchievementLocalizationsDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterAchievementLocalizations/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("GameCenterAchievementLocalizationsApi.gameCenterAchievementLocalizationsDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
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
  public GameCenterAchievementResponse gameCenterAchievementLocalizationsGameCenterAchievementGetToOneRelated(String id, List<String> fieldsGameCenterAchievementReleases, List<String> fieldsGameCenterGroups, List<String> fieldsGameCenterDetails, List<String> fieldsGameCenterAchievementLocalizations, List<String> fieldsGameCenterAchievements, Integer limitLocalizations, Integer limitReleases, List<String> include) throws ApiException {
    return gameCenterAchievementLocalizationsGameCenterAchievementGetToOneRelatedWithHttpInfo(id, fieldsGameCenterAchievementReleases, fieldsGameCenterGroups, fieldsGameCenterDetails, fieldsGameCenterAchievementLocalizations, fieldsGameCenterAchievements, limitLocalizations, limitReleases, include).getData();
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
  public ApiResponse<GameCenterAchievementResponse> gameCenterAchievementLocalizationsGameCenterAchievementGetToOneRelatedWithHttpInfo(String id, List<String> fieldsGameCenterAchievementReleases, List<String> fieldsGameCenterGroups, List<String> fieldsGameCenterDetails, List<String> fieldsGameCenterAchievementLocalizations, List<String> fieldsGameCenterAchievements, Integer limitLocalizations, Integer limitReleases, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterAchievementLocalizationsGameCenterAchievementGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterAchievementLocalizations/{id}/gameCenterAchievement"
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
    return apiClient.invokeAPI("GameCenterAchievementLocalizationsApi.gameCenterAchievementLocalizationsGameCenterAchievementGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterAchievementImages the fields to include for returned resources of type gameCenterAchievementImages (optional)
   * @param fieldsGameCenterAchievementLocalizations the fields to include for returned resources of type gameCenterAchievementLocalizations (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return GameCenterAchievementImageResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterAchievementImage </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterAchievementImageResponse gameCenterAchievementLocalizationsGameCenterAchievementImageGetToOneRelated(String id, List<String> fieldsGameCenterAchievementImages, List<String> fieldsGameCenterAchievementLocalizations, List<String> include) throws ApiException {
    return gameCenterAchievementLocalizationsGameCenterAchievementImageGetToOneRelatedWithHttpInfo(id, fieldsGameCenterAchievementImages, fieldsGameCenterAchievementLocalizations, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterAchievementImages the fields to include for returned resources of type gameCenterAchievementImages (optional)
   * @param fieldsGameCenterAchievementLocalizations the fields to include for returned resources of type gameCenterAchievementLocalizations (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;GameCenterAchievementImageResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterAchievementImage </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterAchievementImageResponse> gameCenterAchievementLocalizationsGameCenterAchievementImageGetToOneRelatedWithHttpInfo(String id, List<String> fieldsGameCenterAchievementImages, List<String> fieldsGameCenterAchievementLocalizations, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterAchievementLocalizationsGameCenterAchievementImageGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterAchievementLocalizations/{id}/gameCenterAchievementImage"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[gameCenterAchievementImages]", fieldsGameCenterAchievementImages)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterAchievementLocalizations]", fieldsGameCenterAchievementLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterAchievementImageResponse> localVarReturnType = new GenericType<GameCenterAchievementImageResponse>() {};
    return apiClient.invokeAPI("GameCenterAchievementLocalizationsApi.gameCenterAchievementLocalizationsGameCenterAchievementImageGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterAchievementLocalizations the fields to include for returned resources of type gameCenterAchievementLocalizations (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsGameCenterAchievementImages the fields to include for returned resources of type gameCenterAchievementImages (optional)
   * @param fieldsGameCenterAchievements the fields to include for returned resources of type gameCenterAchievements (optional)
   * @return GameCenterAchievementLocalizationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterAchievementLocalization </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterAchievementLocalizationResponse gameCenterAchievementLocalizationsGetInstance(String id, List<String> fieldsGameCenterAchievementLocalizations, List<String> include, List<String> fieldsGameCenterAchievementImages, List<String> fieldsGameCenterAchievements) throws ApiException {
    return gameCenterAchievementLocalizationsGetInstanceWithHttpInfo(id, fieldsGameCenterAchievementLocalizations, include, fieldsGameCenterAchievementImages, fieldsGameCenterAchievements).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterAchievementLocalizations the fields to include for returned resources of type gameCenterAchievementLocalizations (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsGameCenterAchievementImages the fields to include for returned resources of type gameCenterAchievementImages (optional)
   * @param fieldsGameCenterAchievements the fields to include for returned resources of type gameCenterAchievements (optional)
   * @return ApiResponse&lt;GameCenterAchievementLocalizationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterAchievementLocalization </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterAchievementLocalizationResponse> gameCenterAchievementLocalizationsGetInstanceWithHttpInfo(String id, List<String> fieldsGameCenterAchievementLocalizations, List<String> include, List<String> fieldsGameCenterAchievementImages, List<String> fieldsGameCenterAchievements) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterAchievementLocalizationsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterAchievementLocalizations/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[gameCenterAchievementLocalizations]", fieldsGameCenterAchievementLocalizations)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterAchievementImages]", fieldsGameCenterAchievementImages));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterAchievements]", fieldsGameCenterAchievements));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterAchievementLocalizationResponse> localVarReturnType = new GenericType<GameCenterAchievementLocalizationResponse>() {};
    return apiClient.invokeAPI("GameCenterAchievementLocalizationsApi.gameCenterAchievementLocalizationsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterAchievementLocalizationUpdateRequest GameCenterAchievementLocalization representation (required)
   * @return GameCenterAchievementLocalizationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterAchievementLocalization </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterAchievementLocalizationResponse gameCenterAchievementLocalizationsUpdateInstance(String id, GameCenterAchievementLocalizationUpdateRequest gameCenterAchievementLocalizationUpdateRequest) throws ApiException {
    return gameCenterAchievementLocalizationsUpdateInstanceWithHttpInfo(id, gameCenterAchievementLocalizationUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterAchievementLocalizationUpdateRequest GameCenterAchievementLocalization representation (required)
   * @return ApiResponse&lt;GameCenterAchievementLocalizationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterAchievementLocalization </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterAchievementLocalizationResponse> gameCenterAchievementLocalizationsUpdateInstanceWithHttpInfo(String id, GameCenterAchievementLocalizationUpdateRequest gameCenterAchievementLocalizationUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterAchievementLocalizationsUpdateInstance");
    }
    if (gameCenterAchievementLocalizationUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gameCenterAchievementLocalizationUpdateRequest' when calling gameCenterAchievementLocalizationsUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterAchievementLocalizations/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterAchievementLocalizationResponse> localVarReturnType = new GenericType<GameCenterAchievementLocalizationResponse>() {};
    return apiClient.invokeAPI("GameCenterAchievementLocalizationsApi.gameCenterAchievementLocalizationsUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), gameCenterAchievementLocalizationUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
