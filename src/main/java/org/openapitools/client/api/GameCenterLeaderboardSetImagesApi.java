package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.GameCenterLeaderboardSetImageCreateRequest;
import org.openapitools.client.model.GameCenterLeaderboardSetImageResponse;
import org.openapitools.client.model.GameCenterLeaderboardSetImageUpdateRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class GameCenterLeaderboardSetImagesApi {
  private ApiClient apiClient;

  public GameCenterLeaderboardSetImagesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GameCenterLeaderboardSetImagesApi(ApiClient apiClient) {
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
   * @param gameCenterLeaderboardSetImageCreateRequest GameCenterLeaderboardSetImage representation (required)
   * @return GameCenterLeaderboardSetImageResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single GameCenterLeaderboardSetImage </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterLeaderboardSetImageResponse gameCenterLeaderboardSetImagesCreateInstance(GameCenterLeaderboardSetImageCreateRequest gameCenterLeaderboardSetImageCreateRequest) throws ApiException {
    return gameCenterLeaderboardSetImagesCreateInstanceWithHttpInfo(gameCenterLeaderboardSetImageCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param gameCenterLeaderboardSetImageCreateRequest GameCenterLeaderboardSetImage representation (required)
   * @return ApiResponse&lt;GameCenterLeaderboardSetImageResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single GameCenterLeaderboardSetImage </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterLeaderboardSetImageResponse> gameCenterLeaderboardSetImagesCreateInstanceWithHttpInfo(GameCenterLeaderboardSetImageCreateRequest gameCenterLeaderboardSetImageCreateRequest) throws ApiException {
    // Check required parameters
    if (gameCenterLeaderboardSetImageCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gameCenterLeaderboardSetImageCreateRequest' when calling gameCenterLeaderboardSetImagesCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterLeaderboardSetImageResponse> localVarReturnType = new GenericType<GameCenterLeaderboardSetImageResponse>() {};
    return apiClient.invokeAPI("GameCenterLeaderboardSetImagesApi.gameCenterLeaderboardSetImagesCreateInstance", "/v1/gameCenterLeaderboardSetImages", "POST", new ArrayList<>(), gameCenterLeaderboardSetImageCreateRequest,
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
  public void gameCenterLeaderboardSetImagesDeleteInstance(String id) throws ApiException {
    gameCenterLeaderboardSetImagesDeleteInstanceWithHttpInfo(id);
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
  public ApiResponse<Void> gameCenterLeaderboardSetImagesDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterLeaderboardSetImagesDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterLeaderboardSetImages/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("GameCenterLeaderboardSetImagesApi.gameCenterLeaderboardSetImagesDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
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
  public GameCenterLeaderboardSetImageResponse gameCenterLeaderboardSetImagesGetInstance(String id, List<String> fieldsGameCenterLeaderboardSetImages, List<String> include) throws ApiException {
    return gameCenterLeaderboardSetImagesGetInstanceWithHttpInfo(id, fieldsGameCenterLeaderboardSetImages, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
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
  public ApiResponse<GameCenterLeaderboardSetImageResponse> gameCenterLeaderboardSetImagesGetInstanceWithHttpInfo(String id, List<String> fieldsGameCenterLeaderboardSetImages, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterLeaderboardSetImagesGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterLeaderboardSetImages/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardSetImages]", fieldsGameCenterLeaderboardSetImages)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterLeaderboardSetImageResponse> localVarReturnType = new GenericType<GameCenterLeaderboardSetImageResponse>() {};
    return apiClient.invokeAPI("GameCenterLeaderboardSetImagesApi.gameCenterLeaderboardSetImagesGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterLeaderboardSetImageUpdateRequest GameCenterLeaderboardSetImage representation (required)
   * @return GameCenterLeaderboardSetImageResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterLeaderboardSetImage </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterLeaderboardSetImageResponse gameCenterLeaderboardSetImagesUpdateInstance(String id, GameCenterLeaderboardSetImageUpdateRequest gameCenterLeaderboardSetImageUpdateRequest) throws ApiException {
    return gameCenterLeaderboardSetImagesUpdateInstanceWithHttpInfo(id, gameCenterLeaderboardSetImageUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterLeaderboardSetImageUpdateRequest GameCenterLeaderboardSetImage representation (required)
   * @return ApiResponse&lt;GameCenterLeaderboardSetImageResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterLeaderboardSetImage </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterLeaderboardSetImageResponse> gameCenterLeaderboardSetImagesUpdateInstanceWithHttpInfo(String id, GameCenterLeaderboardSetImageUpdateRequest gameCenterLeaderboardSetImageUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterLeaderboardSetImagesUpdateInstance");
    }
    if (gameCenterLeaderboardSetImageUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gameCenterLeaderboardSetImageUpdateRequest' when calling gameCenterLeaderboardSetImagesUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterLeaderboardSetImages/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterLeaderboardSetImageResponse> localVarReturnType = new GenericType<GameCenterLeaderboardSetImageResponse>() {};
    return apiClient.invokeAPI("GameCenterLeaderboardSetImagesApi.gameCenterLeaderboardSetImagesUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), gameCenterLeaderboardSetImageUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
