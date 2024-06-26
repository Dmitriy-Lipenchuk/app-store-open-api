package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.GameCenterPlayerAchievementSubmissionCreateRequest;
import org.openapitools.client.model.GameCenterPlayerAchievementSubmissionResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class GameCenterPlayerAchievementSubmissionsApi {
  private ApiClient apiClient;

  public GameCenterPlayerAchievementSubmissionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GameCenterPlayerAchievementSubmissionsApi(ApiClient apiClient) {
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
   * @param gameCenterPlayerAchievementSubmissionCreateRequest GameCenterPlayerAchievementSubmission representation (required)
   * @return GameCenterPlayerAchievementSubmissionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single GameCenterPlayerAchievementSubmission </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterPlayerAchievementSubmissionResponse gameCenterPlayerAchievementSubmissionsCreateInstance(GameCenterPlayerAchievementSubmissionCreateRequest gameCenterPlayerAchievementSubmissionCreateRequest) throws ApiException {
    return gameCenterPlayerAchievementSubmissionsCreateInstanceWithHttpInfo(gameCenterPlayerAchievementSubmissionCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param gameCenterPlayerAchievementSubmissionCreateRequest GameCenterPlayerAchievementSubmission representation (required)
   * @return ApiResponse&lt;GameCenterPlayerAchievementSubmissionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single GameCenterPlayerAchievementSubmission </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterPlayerAchievementSubmissionResponse> gameCenterPlayerAchievementSubmissionsCreateInstanceWithHttpInfo(GameCenterPlayerAchievementSubmissionCreateRequest gameCenterPlayerAchievementSubmissionCreateRequest) throws ApiException {
    // Check required parameters
    if (gameCenterPlayerAchievementSubmissionCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gameCenterPlayerAchievementSubmissionCreateRequest' when calling gameCenterPlayerAchievementSubmissionsCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterPlayerAchievementSubmissionResponse> localVarReturnType = new GenericType<GameCenterPlayerAchievementSubmissionResponse>() {};
    return apiClient.invokeAPI("GameCenterPlayerAchievementSubmissionsApi.gameCenterPlayerAchievementSubmissionsCreateInstance", "/v1/gameCenterPlayerAchievementSubmissions", "POST", new ArrayList<>(), gameCenterPlayerAchievementSubmissionCreateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
