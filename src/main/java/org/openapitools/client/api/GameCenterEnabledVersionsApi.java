package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.GameCenterEnabledVersionCompatibleVersionsLinkagesRequest;
import org.openapitools.client.model.GameCenterEnabledVersionCompatibleVersionsLinkagesResponse;
import org.openapitools.client.model.GameCenterEnabledVersionsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class GameCenterEnabledVersionsApi {
  private ApiClient apiClient;

  public GameCenterEnabledVersionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GameCenterEnabledVersionsApi(ApiClient apiClient) {
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
   * @param id the id of the requested resource (required)
   * @param gameCenterEnabledVersionCompatibleVersionsLinkagesRequest List of related linkages (required)
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
   * @deprecated
   */
  @Deprecated
  public void gameCenterEnabledVersionsCompatibleVersionsCreateToManyRelationship(String id, GameCenterEnabledVersionCompatibleVersionsLinkagesRequest gameCenterEnabledVersionCompatibleVersionsLinkagesRequest) throws ApiException {
    gameCenterEnabledVersionsCompatibleVersionsCreateToManyRelationshipWithHttpInfo(id, gameCenterEnabledVersionCompatibleVersionsLinkagesRequest);
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterEnabledVersionCompatibleVersionsLinkagesRequest List of related linkages (required)
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
   * @deprecated
   */
  @Deprecated
  public ApiResponse<Void> gameCenterEnabledVersionsCompatibleVersionsCreateToManyRelationshipWithHttpInfo(String id, GameCenterEnabledVersionCompatibleVersionsLinkagesRequest gameCenterEnabledVersionCompatibleVersionsLinkagesRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterEnabledVersionsCompatibleVersionsCreateToManyRelationship");
    }
    if (gameCenterEnabledVersionCompatibleVersionsLinkagesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gameCenterEnabledVersionCompatibleVersionsLinkagesRequest' when calling gameCenterEnabledVersionsCompatibleVersionsCreateToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterEnabledVersions/{id}/relationships/compatibleVersions"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("GameCenterEnabledVersionsApi.gameCenterEnabledVersionsCompatibleVersionsCreateToManyRelationship", localVarPath, "POST", new ArrayList<>(), gameCenterEnabledVersionCompatibleVersionsLinkagesRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterEnabledVersionCompatibleVersionsLinkagesRequest List of related linkages (required)
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
   * @deprecated
   */
  @Deprecated
  public void gameCenterEnabledVersionsCompatibleVersionsDeleteToManyRelationship(String id, GameCenterEnabledVersionCompatibleVersionsLinkagesRequest gameCenterEnabledVersionCompatibleVersionsLinkagesRequest) throws ApiException {
    gameCenterEnabledVersionsCompatibleVersionsDeleteToManyRelationshipWithHttpInfo(id, gameCenterEnabledVersionCompatibleVersionsLinkagesRequest);
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterEnabledVersionCompatibleVersionsLinkagesRequest List of related linkages (required)
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
   * @deprecated
   */
  @Deprecated
  public ApiResponse<Void> gameCenterEnabledVersionsCompatibleVersionsDeleteToManyRelationshipWithHttpInfo(String id, GameCenterEnabledVersionCompatibleVersionsLinkagesRequest gameCenterEnabledVersionCompatibleVersionsLinkagesRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterEnabledVersionsCompatibleVersionsDeleteToManyRelationship");
    }
    if (gameCenterEnabledVersionCompatibleVersionsLinkagesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gameCenterEnabledVersionCompatibleVersionsLinkagesRequest' when calling gameCenterEnabledVersionsCompatibleVersionsDeleteToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterEnabledVersions/{id}/relationships/compatibleVersions"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("GameCenterEnabledVersionsApi.gameCenterEnabledVersionsCompatibleVersionsDeleteToManyRelationship", localVarPath, "DELETE", new ArrayList<>(), gameCenterEnabledVersionCompatibleVersionsLinkagesRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterPlatform filter by attribute &#39;platform&#39; (optional)
   * @param filterVersionString filter by attribute &#39;versionString&#39; (optional)
   * @param filterApp filter by id(s) of related &#39;app&#39; (optional)
   * @param filterId filter by id(s) (optional)
   * @param sort comma-separated list of sort expressions; resources will be sorted as specified (optional)
   * @param fieldsGameCenterEnabledVersions the fields to include for returned resources of type gameCenterEnabledVersions (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param limit maximum resources per page (optional)
   * @param limitCompatibleVersions maximum number of related compatibleVersions returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return GameCenterEnabledVersionsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of GameCenterEnabledVersions </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public GameCenterEnabledVersionsResponse gameCenterEnabledVersionsCompatibleVersionsGetToManyRelated(String id, List<String> filterPlatform, List<String> filterVersionString, List<String> filterApp, List<String> filterId, List<String> sort, List<String> fieldsGameCenterEnabledVersions, List<String> fieldsApps, Integer limit, Integer limitCompatibleVersions, List<String> include) throws ApiException {
    return gameCenterEnabledVersionsCompatibleVersionsGetToManyRelatedWithHttpInfo(id, filterPlatform, filterVersionString, filterApp, filterId, sort, fieldsGameCenterEnabledVersions, fieldsApps, limit, limitCompatibleVersions, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterPlatform filter by attribute &#39;platform&#39; (optional)
   * @param filterVersionString filter by attribute &#39;versionString&#39; (optional)
   * @param filterApp filter by id(s) of related &#39;app&#39; (optional)
   * @param filterId filter by id(s) (optional)
   * @param sort comma-separated list of sort expressions; resources will be sorted as specified (optional)
   * @param fieldsGameCenterEnabledVersions the fields to include for returned resources of type gameCenterEnabledVersions (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param limit maximum resources per page (optional)
   * @param limitCompatibleVersions maximum number of related compatibleVersions returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;GameCenterEnabledVersionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of GameCenterEnabledVersions </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public ApiResponse<GameCenterEnabledVersionsResponse> gameCenterEnabledVersionsCompatibleVersionsGetToManyRelatedWithHttpInfo(String id, List<String> filterPlatform, List<String> filterVersionString, List<String> filterApp, List<String> filterId, List<String> sort, List<String> fieldsGameCenterEnabledVersions, List<String> fieldsApps, Integer limit, Integer limitCompatibleVersions, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterEnabledVersionsCompatibleVersionsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterEnabledVersions/{id}/compatibleVersions"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[platform]", filterPlatform)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[versionString]", filterVersionString));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[app]", filterApp));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[id]", filterId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterEnabledVersions]", fieldsGameCenterEnabledVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[apps]", fieldsApps));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[compatibleVersions]", limitCompatibleVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterEnabledVersionsResponse> localVarReturnType = new GenericType<GameCenterEnabledVersionsResponse>() {};
    return apiClient.invokeAPI("GameCenterEnabledVersionsApi.gameCenterEnabledVersionsCompatibleVersionsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param limit maximum resources per page (optional)
   * @return GameCenterEnabledVersionCompatibleVersionsLinkagesResponse
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
   * @deprecated
   */
  @Deprecated
  public GameCenterEnabledVersionCompatibleVersionsLinkagesResponse gameCenterEnabledVersionsCompatibleVersionsGetToManyRelationship(String id, Integer limit) throws ApiException {
    return gameCenterEnabledVersionsCompatibleVersionsGetToManyRelationshipWithHttpInfo(id, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;GameCenterEnabledVersionCompatibleVersionsLinkagesResponse&gt;
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
   * @deprecated
   */
  @Deprecated
  public ApiResponse<GameCenterEnabledVersionCompatibleVersionsLinkagesResponse> gameCenterEnabledVersionsCompatibleVersionsGetToManyRelationshipWithHttpInfo(String id, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterEnabledVersionsCompatibleVersionsGetToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterEnabledVersions/{id}/relationships/compatibleVersions"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "limit", limit)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterEnabledVersionCompatibleVersionsLinkagesResponse> localVarReturnType = new GenericType<GameCenterEnabledVersionCompatibleVersionsLinkagesResponse>() {};
    return apiClient.invokeAPI("GameCenterEnabledVersionsApi.gameCenterEnabledVersionsCompatibleVersionsGetToManyRelationship", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterEnabledVersionCompatibleVersionsLinkagesRequest List of related linkages (required)
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
   * @deprecated
   */
  @Deprecated
  public void gameCenterEnabledVersionsCompatibleVersionsReplaceToManyRelationship(String id, GameCenterEnabledVersionCompatibleVersionsLinkagesRequest gameCenterEnabledVersionCompatibleVersionsLinkagesRequest) throws ApiException {
    gameCenterEnabledVersionsCompatibleVersionsReplaceToManyRelationshipWithHttpInfo(id, gameCenterEnabledVersionCompatibleVersionsLinkagesRequest);
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterEnabledVersionCompatibleVersionsLinkagesRequest List of related linkages (required)
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
   * @deprecated
   */
  @Deprecated
  public ApiResponse<Void> gameCenterEnabledVersionsCompatibleVersionsReplaceToManyRelationshipWithHttpInfo(String id, GameCenterEnabledVersionCompatibleVersionsLinkagesRequest gameCenterEnabledVersionCompatibleVersionsLinkagesRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterEnabledVersionsCompatibleVersionsReplaceToManyRelationship");
    }
    if (gameCenterEnabledVersionCompatibleVersionsLinkagesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gameCenterEnabledVersionCompatibleVersionsLinkagesRequest' when calling gameCenterEnabledVersionsCompatibleVersionsReplaceToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterEnabledVersions/{id}/relationships/compatibleVersions"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("GameCenterEnabledVersionsApi.gameCenterEnabledVersionsCompatibleVersionsReplaceToManyRelationship", localVarPath, "PATCH", new ArrayList<>(), gameCenterEnabledVersionCompatibleVersionsLinkagesRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
}
