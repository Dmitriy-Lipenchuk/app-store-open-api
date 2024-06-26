package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.GameCenterLeaderboardImageResponse;
import org.openapitools.client.model.GameCenterLeaderboardLocalizationCreateRequest;
import org.openapitools.client.model.GameCenterLeaderboardLocalizationResponse;
import org.openapitools.client.model.GameCenterLeaderboardLocalizationUpdateRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class GameCenterLeaderboardLocalizationsApi {
  private ApiClient apiClient;

  public GameCenterLeaderboardLocalizationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GameCenterLeaderboardLocalizationsApi(ApiClient apiClient) {
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
   * @param gameCenterLeaderboardLocalizationCreateRequest GameCenterLeaderboardLocalization representation (required)
   * @return GameCenterLeaderboardLocalizationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single GameCenterLeaderboardLocalization </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterLeaderboardLocalizationResponse gameCenterLeaderboardLocalizationsCreateInstance(GameCenterLeaderboardLocalizationCreateRequest gameCenterLeaderboardLocalizationCreateRequest) throws ApiException {
    return gameCenterLeaderboardLocalizationsCreateInstanceWithHttpInfo(gameCenterLeaderboardLocalizationCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param gameCenterLeaderboardLocalizationCreateRequest GameCenterLeaderboardLocalization representation (required)
   * @return ApiResponse&lt;GameCenterLeaderboardLocalizationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single GameCenterLeaderboardLocalization </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterLeaderboardLocalizationResponse> gameCenterLeaderboardLocalizationsCreateInstanceWithHttpInfo(GameCenterLeaderboardLocalizationCreateRequest gameCenterLeaderboardLocalizationCreateRequest) throws ApiException {
    // Check required parameters
    if (gameCenterLeaderboardLocalizationCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gameCenterLeaderboardLocalizationCreateRequest' when calling gameCenterLeaderboardLocalizationsCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterLeaderboardLocalizationResponse> localVarReturnType = new GenericType<GameCenterLeaderboardLocalizationResponse>() {};
    return apiClient.invokeAPI("GameCenterLeaderboardLocalizationsApi.gameCenterLeaderboardLocalizationsCreateInstance", "/v1/gameCenterLeaderboardLocalizations", "POST", new ArrayList<>(), gameCenterLeaderboardLocalizationCreateRequest,
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
  public void gameCenterLeaderboardLocalizationsDeleteInstance(String id) throws ApiException {
    gameCenterLeaderboardLocalizationsDeleteInstanceWithHttpInfo(id);
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
  public ApiResponse<Void> gameCenterLeaderboardLocalizationsDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterLeaderboardLocalizationsDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterLeaderboardLocalizations/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("GameCenterLeaderboardLocalizationsApi.gameCenterLeaderboardLocalizationsDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterLeaderboardImages the fields to include for returned resources of type gameCenterLeaderboardImages (optional)
   * @param fieldsGameCenterLeaderboardLocalizations the fields to include for returned resources of type gameCenterLeaderboardLocalizations (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return GameCenterLeaderboardImageResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterLeaderboardImage </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterLeaderboardImageResponse gameCenterLeaderboardLocalizationsGameCenterLeaderboardImageGetToOneRelated(String id, List<String> fieldsGameCenterLeaderboardImages, List<String> fieldsGameCenterLeaderboardLocalizations, List<String> include) throws ApiException {
    return gameCenterLeaderboardLocalizationsGameCenterLeaderboardImageGetToOneRelatedWithHttpInfo(id, fieldsGameCenterLeaderboardImages, fieldsGameCenterLeaderboardLocalizations, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterLeaderboardImages the fields to include for returned resources of type gameCenterLeaderboardImages (optional)
   * @param fieldsGameCenterLeaderboardLocalizations the fields to include for returned resources of type gameCenterLeaderboardLocalizations (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;GameCenterLeaderboardImageResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterLeaderboardImage </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterLeaderboardImageResponse> gameCenterLeaderboardLocalizationsGameCenterLeaderboardImageGetToOneRelatedWithHttpInfo(String id, List<String> fieldsGameCenterLeaderboardImages, List<String> fieldsGameCenterLeaderboardLocalizations, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterLeaderboardLocalizationsGameCenterLeaderboardImageGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterLeaderboardLocalizations/{id}/gameCenterLeaderboardImage"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardImages]", fieldsGameCenterLeaderboardImages)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardLocalizations]", fieldsGameCenterLeaderboardLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterLeaderboardImageResponse> localVarReturnType = new GenericType<GameCenterLeaderboardImageResponse>() {};
    return apiClient.invokeAPI("GameCenterLeaderboardLocalizationsApi.gameCenterLeaderboardLocalizationsGameCenterLeaderboardImageGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterLeaderboardLocalizations the fields to include for returned resources of type gameCenterLeaderboardLocalizations (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsGameCenterLeaderboardImages the fields to include for returned resources of type gameCenterLeaderboardImages (optional)
   * @return GameCenterLeaderboardLocalizationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterLeaderboardLocalization </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterLeaderboardLocalizationResponse gameCenterLeaderboardLocalizationsGetInstance(String id, List<String> fieldsGameCenterLeaderboardLocalizations, List<String> include, List<String> fieldsGameCenterLeaderboardImages) throws ApiException {
    return gameCenterLeaderboardLocalizationsGetInstanceWithHttpInfo(id, fieldsGameCenterLeaderboardLocalizations, include, fieldsGameCenterLeaderboardImages).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterLeaderboardLocalizations the fields to include for returned resources of type gameCenterLeaderboardLocalizations (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsGameCenterLeaderboardImages the fields to include for returned resources of type gameCenterLeaderboardImages (optional)
   * @return ApiResponse&lt;GameCenterLeaderboardLocalizationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterLeaderboardLocalization </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterLeaderboardLocalizationResponse> gameCenterLeaderboardLocalizationsGetInstanceWithHttpInfo(String id, List<String> fieldsGameCenterLeaderboardLocalizations, List<String> include, List<String> fieldsGameCenterLeaderboardImages) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterLeaderboardLocalizationsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterLeaderboardLocalizations/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardLocalizations]", fieldsGameCenterLeaderboardLocalizations)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardImages]", fieldsGameCenterLeaderboardImages));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterLeaderboardLocalizationResponse> localVarReturnType = new GenericType<GameCenterLeaderboardLocalizationResponse>() {};
    return apiClient.invokeAPI("GameCenterLeaderboardLocalizationsApi.gameCenterLeaderboardLocalizationsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterLeaderboardLocalizationUpdateRequest GameCenterLeaderboardLocalization representation (required)
   * @return GameCenterLeaderboardLocalizationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterLeaderboardLocalization </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterLeaderboardLocalizationResponse gameCenterLeaderboardLocalizationsUpdateInstance(String id, GameCenterLeaderboardLocalizationUpdateRequest gameCenterLeaderboardLocalizationUpdateRequest) throws ApiException {
    return gameCenterLeaderboardLocalizationsUpdateInstanceWithHttpInfo(id, gameCenterLeaderboardLocalizationUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterLeaderboardLocalizationUpdateRequest GameCenterLeaderboardLocalization representation (required)
   * @return ApiResponse&lt;GameCenterLeaderboardLocalizationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterLeaderboardLocalization </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterLeaderboardLocalizationResponse> gameCenterLeaderboardLocalizationsUpdateInstanceWithHttpInfo(String id, GameCenterLeaderboardLocalizationUpdateRequest gameCenterLeaderboardLocalizationUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterLeaderboardLocalizationsUpdateInstance");
    }
    if (gameCenterLeaderboardLocalizationUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gameCenterLeaderboardLocalizationUpdateRequest' when calling gameCenterLeaderboardLocalizationsUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterLeaderboardLocalizations/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterLeaderboardLocalizationResponse> localVarReturnType = new GenericType<GameCenterLeaderboardLocalizationResponse>() {};
    return apiClient.invokeAPI("GameCenterLeaderboardLocalizationsApi.gameCenterLeaderboardLocalizationsUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), gameCenterLeaderboardLocalizationUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
