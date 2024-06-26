package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.GameCenterMatchmakingQueuesResponse;
import org.openapitools.client.model.GameCenterMatchmakingRuleSetCreateRequest;
import org.openapitools.client.model.GameCenterMatchmakingRuleSetResponse;
import org.openapitools.client.model.GameCenterMatchmakingRuleSetUpdateRequest;
import org.openapitools.client.model.GameCenterMatchmakingRuleSetsResponse;
import org.openapitools.client.model.GameCenterMatchmakingRulesResponse;
import org.openapitools.client.model.GameCenterMatchmakingTeamsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class GameCenterMatchmakingRuleSetsApi {
  private ApiClient apiClient;

  public GameCenterMatchmakingRuleSetsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GameCenterMatchmakingRuleSetsApi(ApiClient apiClient) {
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
   * @param gameCenterMatchmakingRuleSetCreateRequest GameCenterMatchmakingRuleSet representation (required)
   * @return GameCenterMatchmakingRuleSetResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single GameCenterMatchmakingRuleSet </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterMatchmakingRuleSetResponse gameCenterMatchmakingRuleSetsCreateInstance(GameCenterMatchmakingRuleSetCreateRequest gameCenterMatchmakingRuleSetCreateRequest) throws ApiException {
    return gameCenterMatchmakingRuleSetsCreateInstanceWithHttpInfo(gameCenterMatchmakingRuleSetCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param gameCenterMatchmakingRuleSetCreateRequest GameCenterMatchmakingRuleSet representation (required)
   * @return ApiResponse&lt;GameCenterMatchmakingRuleSetResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single GameCenterMatchmakingRuleSet </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterMatchmakingRuleSetResponse> gameCenterMatchmakingRuleSetsCreateInstanceWithHttpInfo(GameCenterMatchmakingRuleSetCreateRequest gameCenterMatchmakingRuleSetCreateRequest) throws ApiException {
    // Check required parameters
    if (gameCenterMatchmakingRuleSetCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gameCenterMatchmakingRuleSetCreateRequest' when calling gameCenterMatchmakingRuleSetsCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterMatchmakingRuleSetResponse> localVarReturnType = new GenericType<GameCenterMatchmakingRuleSetResponse>() {};
    return apiClient.invokeAPI("GameCenterMatchmakingRuleSetsApi.gameCenterMatchmakingRuleSetsCreateInstance", "/v1/gameCenterMatchmakingRuleSets", "POST", new ArrayList<>(), gameCenterMatchmakingRuleSetCreateRequest,
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
  public void gameCenterMatchmakingRuleSetsDeleteInstance(String id) throws ApiException {
    gameCenterMatchmakingRuleSetsDeleteInstanceWithHttpInfo(id);
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
  public ApiResponse<Void> gameCenterMatchmakingRuleSetsDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterMatchmakingRuleSetsDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterMatchmakingRuleSets/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("GameCenterMatchmakingRuleSetsApi.gameCenterMatchmakingRuleSetsDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param fieldsGameCenterMatchmakingRuleSets the fields to include for returned resources of type gameCenterMatchmakingRuleSets (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsGameCenterMatchmakingQueues the fields to include for returned resources of type gameCenterMatchmakingQueues (optional)
   * @param fieldsGameCenterMatchmakingTeams the fields to include for returned resources of type gameCenterMatchmakingTeams (optional)
   * @param fieldsGameCenterMatchmakingRules the fields to include for returned resources of type gameCenterMatchmakingRules (optional)
   * @param limitMatchmakingQueues maximum number of related matchmakingQueues returned (when they are included) (optional)
   * @param limitRules maximum number of related rules returned (when they are included) (optional)
   * @param limitTeams maximum number of related teams returned (when they are included) (optional)
   * @return GameCenterMatchmakingRuleSetsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of GameCenterMatchmakingRuleSets </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterMatchmakingRuleSetsResponse gameCenterMatchmakingRuleSetsGetCollection(List<String> fieldsGameCenterMatchmakingRuleSets, Integer limit, List<String> include, List<String> fieldsGameCenterMatchmakingQueues, List<String> fieldsGameCenterMatchmakingTeams, List<String> fieldsGameCenterMatchmakingRules, Integer limitMatchmakingQueues, Integer limitRules, Integer limitTeams) throws ApiException {
    return gameCenterMatchmakingRuleSetsGetCollectionWithHttpInfo(fieldsGameCenterMatchmakingRuleSets, limit, include, fieldsGameCenterMatchmakingQueues, fieldsGameCenterMatchmakingTeams, fieldsGameCenterMatchmakingRules, limitMatchmakingQueues, limitRules, limitTeams).getData();
  }

  /**
   * 
   * 
   * @param fieldsGameCenterMatchmakingRuleSets the fields to include for returned resources of type gameCenterMatchmakingRuleSets (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsGameCenterMatchmakingQueues the fields to include for returned resources of type gameCenterMatchmakingQueues (optional)
   * @param fieldsGameCenterMatchmakingTeams the fields to include for returned resources of type gameCenterMatchmakingTeams (optional)
   * @param fieldsGameCenterMatchmakingRules the fields to include for returned resources of type gameCenterMatchmakingRules (optional)
   * @param limitMatchmakingQueues maximum number of related matchmakingQueues returned (when they are included) (optional)
   * @param limitRules maximum number of related rules returned (when they are included) (optional)
   * @param limitTeams maximum number of related teams returned (when they are included) (optional)
   * @return ApiResponse&lt;GameCenterMatchmakingRuleSetsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of GameCenterMatchmakingRuleSets </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterMatchmakingRuleSetsResponse> gameCenterMatchmakingRuleSetsGetCollectionWithHttpInfo(List<String> fieldsGameCenterMatchmakingRuleSets, Integer limit, List<String> include, List<String> fieldsGameCenterMatchmakingQueues, List<String> fieldsGameCenterMatchmakingTeams, List<String> fieldsGameCenterMatchmakingRules, Integer limitMatchmakingQueues, Integer limitRules, Integer limitTeams) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[gameCenterMatchmakingRuleSets]", fieldsGameCenterMatchmakingRuleSets)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterMatchmakingQueues]", fieldsGameCenterMatchmakingQueues));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterMatchmakingTeams]", fieldsGameCenterMatchmakingTeams));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterMatchmakingRules]", fieldsGameCenterMatchmakingRules));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[matchmakingQueues]", limitMatchmakingQueues));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[rules]", limitRules));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[teams]", limitTeams));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterMatchmakingRuleSetsResponse> localVarReturnType = new GenericType<GameCenterMatchmakingRuleSetsResponse>() {};
    return apiClient.invokeAPI("GameCenterMatchmakingRuleSetsApi.gameCenterMatchmakingRuleSetsGetCollection", "/v1/gameCenterMatchmakingRuleSets", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterMatchmakingRuleSets the fields to include for returned resources of type gameCenterMatchmakingRuleSets (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsGameCenterMatchmakingQueues the fields to include for returned resources of type gameCenterMatchmakingQueues (optional)
   * @param fieldsGameCenterMatchmakingTeams the fields to include for returned resources of type gameCenterMatchmakingTeams (optional)
   * @param fieldsGameCenterMatchmakingRules the fields to include for returned resources of type gameCenterMatchmakingRules (optional)
   * @param limitMatchmakingQueues maximum number of related matchmakingQueues returned (when they are included) (optional)
   * @param limitRules maximum number of related rules returned (when they are included) (optional)
   * @param limitTeams maximum number of related teams returned (when they are included) (optional)
   * @return GameCenterMatchmakingRuleSetResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterMatchmakingRuleSet </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterMatchmakingRuleSetResponse gameCenterMatchmakingRuleSetsGetInstance(String id, List<String> fieldsGameCenterMatchmakingRuleSets, List<String> include, List<String> fieldsGameCenterMatchmakingQueues, List<String> fieldsGameCenterMatchmakingTeams, List<String> fieldsGameCenterMatchmakingRules, Integer limitMatchmakingQueues, Integer limitRules, Integer limitTeams) throws ApiException {
    return gameCenterMatchmakingRuleSetsGetInstanceWithHttpInfo(id, fieldsGameCenterMatchmakingRuleSets, include, fieldsGameCenterMatchmakingQueues, fieldsGameCenterMatchmakingTeams, fieldsGameCenterMatchmakingRules, limitMatchmakingQueues, limitRules, limitTeams).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterMatchmakingRuleSets the fields to include for returned resources of type gameCenterMatchmakingRuleSets (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsGameCenterMatchmakingQueues the fields to include for returned resources of type gameCenterMatchmakingQueues (optional)
   * @param fieldsGameCenterMatchmakingTeams the fields to include for returned resources of type gameCenterMatchmakingTeams (optional)
   * @param fieldsGameCenterMatchmakingRules the fields to include for returned resources of type gameCenterMatchmakingRules (optional)
   * @param limitMatchmakingQueues maximum number of related matchmakingQueues returned (when they are included) (optional)
   * @param limitRules maximum number of related rules returned (when they are included) (optional)
   * @param limitTeams maximum number of related teams returned (when they are included) (optional)
   * @return ApiResponse&lt;GameCenterMatchmakingRuleSetResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterMatchmakingRuleSet </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterMatchmakingRuleSetResponse> gameCenterMatchmakingRuleSetsGetInstanceWithHttpInfo(String id, List<String> fieldsGameCenterMatchmakingRuleSets, List<String> include, List<String> fieldsGameCenterMatchmakingQueues, List<String> fieldsGameCenterMatchmakingTeams, List<String> fieldsGameCenterMatchmakingRules, Integer limitMatchmakingQueues, Integer limitRules, Integer limitTeams) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterMatchmakingRuleSetsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterMatchmakingRuleSets/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[gameCenterMatchmakingRuleSets]", fieldsGameCenterMatchmakingRuleSets)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterMatchmakingQueues]", fieldsGameCenterMatchmakingQueues));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterMatchmakingTeams]", fieldsGameCenterMatchmakingTeams));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterMatchmakingRules]", fieldsGameCenterMatchmakingRules));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[matchmakingQueues]", limitMatchmakingQueues));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[rules]", limitRules));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[teams]", limitTeams));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterMatchmakingRuleSetResponse> localVarReturnType = new GenericType<GameCenterMatchmakingRuleSetResponse>() {};
    return apiClient.invokeAPI("GameCenterMatchmakingRuleSetsApi.gameCenterMatchmakingRuleSetsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterMatchmakingQueues the fields to include for returned resources of type gameCenterMatchmakingQueues (optional)
   * @param fieldsGameCenterMatchmakingRuleSets the fields to include for returned resources of type gameCenterMatchmakingRuleSets (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return GameCenterMatchmakingQueuesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of GameCenterMatchmakingQueues </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterMatchmakingQueuesResponse gameCenterMatchmakingRuleSetsMatchmakingQueuesGetToManyRelated(String id, List<String> fieldsGameCenterMatchmakingQueues, List<String> fieldsGameCenterMatchmakingRuleSets, Integer limit, List<String> include) throws ApiException {
    return gameCenterMatchmakingRuleSetsMatchmakingQueuesGetToManyRelatedWithHttpInfo(id, fieldsGameCenterMatchmakingQueues, fieldsGameCenterMatchmakingRuleSets, limit, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterMatchmakingQueues the fields to include for returned resources of type gameCenterMatchmakingQueues (optional)
   * @param fieldsGameCenterMatchmakingRuleSets the fields to include for returned resources of type gameCenterMatchmakingRuleSets (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;GameCenterMatchmakingQueuesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of GameCenterMatchmakingQueues </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterMatchmakingQueuesResponse> gameCenterMatchmakingRuleSetsMatchmakingQueuesGetToManyRelatedWithHttpInfo(String id, List<String> fieldsGameCenterMatchmakingQueues, List<String> fieldsGameCenterMatchmakingRuleSets, Integer limit, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterMatchmakingRuleSetsMatchmakingQueuesGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterMatchmakingRuleSets/{id}/matchmakingQueues"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[gameCenterMatchmakingQueues]", fieldsGameCenterMatchmakingQueues)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterMatchmakingRuleSets]", fieldsGameCenterMatchmakingRuleSets));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterMatchmakingQueuesResponse> localVarReturnType = new GenericType<GameCenterMatchmakingQueuesResponse>() {};
    return apiClient.invokeAPI("GameCenterMatchmakingRuleSetsApi.gameCenterMatchmakingRuleSetsMatchmakingQueuesGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterMatchmakingRules the fields to include for returned resources of type gameCenterMatchmakingRules (optional)
   * @param limit maximum resources per page (optional)
   * @return GameCenterMatchmakingRulesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of GameCenterMatchmakingRules </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterMatchmakingRulesResponse gameCenterMatchmakingRuleSetsRulesGetToManyRelated(String id, List<String> fieldsGameCenterMatchmakingRules, Integer limit) throws ApiException {
    return gameCenterMatchmakingRuleSetsRulesGetToManyRelatedWithHttpInfo(id, fieldsGameCenterMatchmakingRules, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterMatchmakingRules the fields to include for returned resources of type gameCenterMatchmakingRules (optional)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;GameCenterMatchmakingRulesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of GameCenterMatchmakingRules </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterMatchmakingRulesResponse> gameCenterMatchmakingRuleSetsRulesGetToManyRelatedWithHttpInfo(String id, List<String> fieldsGameCenterMatchmakingRules, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterMatchmakingRuleSetsRulesGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterMatchmakingRuleSets/{id}/rules"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[gameCenterMatchmakingRules]", fieldsGameCenterMatchmakingRules)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterMatchmakingRulesResponse> localVarReturnType = new GenericType<GameCenterMatchmakingRulesResponse>() {};
    return apiClient.invokeAPI("GameCenterMatchmakingRuleSetsApi.gameCenterMatchmakingRuleSetsRulesGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterMatchmakingTeams the fields to include for returned resources of type gameCenterMatchmakingTeams (optional)
   * @param limit maximum resources per page (optional)
   * @return GameCenterMatchmakingTeamsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of GameCenterMatchmakingTeams </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterMatchmakingTeamsResponse gameCenterMatchmakingRuleSetsTeamsGetToManyRelated(String id, List<String> fieldsGameCenterMatchmakingTeams, Integer limit) throws ApiException {
    return gameCenterMatchmakingRuleSetsTeamsGetToManyRelatedWithHttpInfo(id, fieldsGameCenterMatchmakingTeams, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterMatchmakingTeams the fields to include for returned resources of type gameCenterMatchmakingTeams (optional)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;GameCenterMatchmakingTeamsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of GameCenterMatchmakingTeams </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterMatchmakingTeamsResponse> gameCenterMatchmakingRuleSetsTeamsGetToManyRelatedWithHttpInfo(String id, List<String> fieldsGameCenterMatchmakingTeams, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterMatchmakingRuleSetsTeamsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterMatchmakingRuleSets/{id}/teams"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[gameCenterMatchmakingTeams]", fieldsGameCenterMatchmakingTeams)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterMatchmakingTeamsResponse> localVarReturnType = new GenericType<GameCenterMatchmakingTeamsResponse>() {};
    return apiClient.invokeAPI("GameCenterMatchmakingRuleSetsApi.gameCenterMatchmakingRuleSetsTeamsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterMatchmakingRuleSetUpdateRequest GameCenterMatchmakingRuleSet representation (required)
   * @return GameCenterMatchmakingRuleSetResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterMatchmakingRuleSet </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterMatchmakingRuleSetResponse gameCenterMatchmakingRuleSetsUpdateInstance(String id, GameCenterMatchmakingRuleSetUpdateRequest gameCenterMatchmakingRuleSetUpdateRequest) throws ApiException {
    return gameCenterMatchmakingRuleSetsUpdateInstanceWithHttpInfo(id, gameCenterMatchmakingRuleSetUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterMatchmakingRuleSetUpdateRequest GameCenterMatchmakingRuleSet representation (required)
   * @return ApiResponse&lt;GameCenterMatchmakingRuleSetResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterMatchmakingRuleSet </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterMatchmakingRuleSetResponse> gameCenterMatchmakingRuleSetsUpdateInstanceWithHttpInfo(String id, GameCenterMatchmakingRuleSetUpdateRequest gameCenterMatchmakingRuleSetUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterMatchmakingRuleSetsUpdateInstance");
    }
    if (gameCenterMatchmakingRuleSetUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gameCenterMatchmakingRuleSetUpdateRequest' when calling gameCenterMatchmakingRuleSetsUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterMatchmakingRuleSets/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterMatchmakingRuleSetResponse> localVarReturnType = new GenericType<GameCenterMatchmakingRuleSetResponse>() {};
    return apiClient.invokeAPI("GameCenterMatchmakingRuleSetsApi.gameCenterMatchmakingRuleSetsUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), gameCenterMatchmakingRuleSetUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
