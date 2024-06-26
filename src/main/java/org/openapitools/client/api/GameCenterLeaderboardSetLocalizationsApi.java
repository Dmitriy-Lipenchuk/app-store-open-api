package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.GameCenterLeaderboardSetImageResponse;
import org.openapitools.client.model.GameCenterLeaderboardSetLocalizationCreateRequest;
import org.openapitools.client.model.GameCenterLeaderboardSetLocalizationResponse;
import org.openapitools.client.model.GameCenterLeaderboardSetLocalizationUpdateRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class GameCenterLeaderboardSetLocalizationsApi {
  private ApiClient apiClient;

  public GameCenterLeaderboardSetLocalizationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GameCenterLeaderboardSetLocalizationsApi(ApiClient apiClient) {
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
   * @param gameCenterLeaderboardSetLocalizationCreateRequest GameCenterLeaderboardSetLocalization representation (required)
   * @return GameCenterLeaderboardSetLocalizationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single GameCenterLeaderboardSetLocalization </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterLeaderboardSetLocalizationResponse gameCenterLeaderboardSetLocalizationsCreateInstance(GameCenterLeaderboardSetLocalizationCreateRequest gameCenterLeaderboardSetLocalizationCreateRequest) throws ApiException {
    return gameCenterLeaderboardSetLocalizationsCreateInstanceWithHttpInfo(gameCenterLeaderboardSetLocalizationCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param gameCenterLeaderboardSetLocalizationCreateRequest GameCenterLeaderboardSetLocalization representation (required)
   * @return ApiResponse&lt;GameCenterLeaderboardSetLocalizationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single GameCenterLeaderboardSetLocalization </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterLeaderboardSetLocalizationResponse> gameCenterLeaderboardSetLocalizationsCreateInstanceWithHttpInfo(GameCenterLeaderboardSetLocalizationCreateRequest gameCenterLeaderboardSetLocalizationCreateRequest) throws ApiException {
    // Check required parameters
    if (gameCenterLeaderboardSetLocalizationCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gameCenterLeaderboardSetLocalizationCreateRequest' when calling gameCenterLeaderboardSetLocalizationsCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterLeaderboardSetLocalizationResponse> localVarReturnType = new GenericType<GameCenterLeaderboardSetLocalizationResponse>() {};
    return apiClient.invokeAPI("GameCenterLeaderboardSetLocalizationsApi.gameCenterLeaderboardSetLocalizationsCreateInstance", "/v1/gameCenterLeaderboardSetLocalizations", "POST", new ArrayList<>(), gameCenterLeaderboardSetLocalizationCreateRequest,
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
  public void gameCenterLeaderboardSetLocalizationsDeleteInstance(String id) throws ApiException {
    gameCenterLeaderboardSetLocalizationsDeleteInstanceWithHttpInfo(id);
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
  public ApiResponse<Void> gameCenterLeaderboardSetLocalizationsDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterLeaderboardSetLocalizationsDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterLeaderboardSetLocalizations/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("GameCenterLeaderboardSetLocalizationsApi.gameCenterLeaderboardSetLocalizationsDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterLeaderboardSetLocalizations the fields to include for returned resources of type gameCenterLeaderboardSetLocalizations (optional)
   * @param fieldsGameCenterLeaderboardSetImages the fields to include for returned resources of type gameCenterLeaderboardSetImages (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return GameCenterLeaderboardSetImageResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterLeaderboardSetImage </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterLeaderboardSetImageResponse gameCenterLeaderboardSetLocalizationsGameCenterLeaderboardSetImageGetToOneRelated(String id, List<String> fieldsGameCenterLeaderboardSetLocalizations, List<String> fieldsGameCenterLeaderboardSetImages, List<String> include) throws ApiException {
    return gameCenterLeaderboardSetLocalizationsGameCenterLeaderboardSetImageGetToOneRelatedWithHttpInfo(id, fieldsGameCenterLeaderboardSetLocalizations, fieldsGameCenterLeaderboardSetImages, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterLeaderboardSetLocalizations the fields to include for returned resources of type gameCenterLeaderboardSetLocalizations (optional)
   * @param fieldsGameCenterLeaderboardSetImages the fields to include for returned resources of type gameCenterLeaderboardSetImages (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;GameCenterLeaderboardSetImageResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterLeaderboardSetImage </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterLeaderboardSetImageResponse> gameCenterLeaderboardSetLocalizationsGameCenterLeaderboardSetImageGetToOneRelatedWithHttpInfo(String id, List<String> fieldsGameCenterLeaderboardSetLocalizations, List<String> fieldsGameCenterLeaderboardSetImages, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterLeaderboardSetLocalizationsGameCenterLeaderboardSetImageGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterLeaderboardSetLocalizations/{id}/gameCenterLeaderboardSetImage"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardSetLocalizations]", fieldsGameCenterLeaderboardSetLocalizations)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardSetImages]", fieldsGameCenterLeaderboardSetImages));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterLeaderboardSetImageResponse> localVarReturnType = new GenericType<GameCenterLeaderboardSetImageResponse>() {};
    return apiClient.invokeAPI("GameCenterLeaderboardSetLocalizationsApi.gameCenterLeaderboardSetLocalizationsGameCenterLeaderboardSetImageGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterLeaderboardSetLocalizations the fields to include for returned resources of type gameCenterLeaderboardSetLocalizations (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsGameCenterLeaderboardSetImages the fields to include for returned resources of type gameCenterLeaderboardSetImages (optional)
   * @return GameCenterLeaderboardSetLocalizationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterLeaderboardSetLocalization </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterLeaderboardSetLocalizationResponse gameCenterLeaderboardSetLocalizationsGetInstance(String id, List<String> fieldsGameCenterLeaderboardSetLocalizations, List<String> include, List<String> fieldsGameCenterLeaderboardSetImages) throws ApiException {
    return gameCenterLeaderboardSetLocalizationsGetInstanceWithHttpInfo(id, fieldsGameCenterLeaderboardSetLocalizations, include, fieldsGameCenterLeaderboardSetImages).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterLeaderboardSetLocalizations the fields to include for returned resources of type gameCenterLeaderboardSetLocalizations (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsGameCenterLeaderboardSetImages the fields to include for returned resources of type gameCenterLeaderboardSetImages (optional)
   * @return ApiResponse&lt;GameCenterLeaderboardSetLocalizationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterLeaderboardSetLocalization </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterLeaderboardSetLocalizationResponse> gameCenterLeaderboardSetLocalizationsGetInstanceWithHttpInfo(String id, List<String> fieldsGameCenterLeaderboardSetLocalizations, List<String> include, List<String> fieldsGameCenterLeaderboardSetImages) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterLeaderboardSetLocalizationsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterLeaderboardSetLocalizations/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardSetLocalizations]", fieldsGameCenterLeaderboardSetLocalizations)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardSetImages]", fieldsGameCenterLeaderboardSetImages));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterLeaderboardSetLocalizationResponse> localVarReturnType = new GenericType<GameCenterLeaderboardSetLocalizationResponse>() {};
    return apiClient.invokeAPI("GameCenterLeaderboardSetLocalizationsApi.gameCenterLeaderboardSetLocalizationsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterLeaderboardSetLocalizationUpdateRequest GameCenterLeaderboardSetLocalization representation (required)
   * @return GameCenterLeaderboardSetLocalizationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterLeaderboardSetLocalization </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterLeaderboardSetLocalizationResponse gameCenterLeaderboardSetLocalizationsUpdateInstance(String id, GameCenterLeaderboardSetLocalizationUpdateRequest gameCenterLeaderboardSetLocalizationUpdateRequest) throws ApiException {
    return gameCenterLeaderboardSetLocalizationsUpdateInstanceWithHttpInfo(id, gameCenterLeaderboardSetLocalizationUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterLeaderboardSetLocalizationUpdateRequest GameCenterLeaderboardSetLocalization representation (required)
   * @return ApiResponse&lt;GameCenterLeaderboardSetLocalizationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterLeaderboardSetLocalization </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterLeaderboardSetLocalizationResponse> gameCenterLeaderboardSetLocalizationsUpdateInstanceWithHttpInfo(String id, GameCenterLeaderboardSetLocalizationUpdateRequest gameCenterLeaderboardSetLocalizationUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterLeaderboardSetLocalizationsUpdateInstance");
    }
    if (gameCenterLeaderboardSetLocalizationUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gameCenterLeaderboardSetLocalizationUpdateRequest' when calling gameCenterLeaderboardSetLocalizationsUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterLeaderboardSetLocalizations/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterLeaderboardSetLocalizationResponse> localVarReturnType = new GenericType<GameCenterLeaderboardSetLocalizationResponse>() {};
    return apiClient.invokeAPI("GameCenterLeaderboardSetLocalizationsApi.gameCenterLeaderboardSetLocalizationsUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), gameCenterLeaderboardSetLocalizationUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
