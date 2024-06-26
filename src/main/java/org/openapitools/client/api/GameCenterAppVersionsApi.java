package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.AppStoreVersionResponse;
import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.GameCenterAppVersionCompatibilityVersionsLinkagesRequest;
import org.openapitools.client.model.GameCenterAppVersionCompatibilityVersionsLinkagesResponse;
import org.openapitools.client.model.GameCenterAppVersionCreateRequest;
import org.openapitools.client.model.GameCenterAppVersionResponse;
import org.openapitools.client.model.GameCenterAppVersionUpdateRequest;
import org.openapitools.client.model.GameCenterAppVersionsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class GameCenterAppVersionsApi {
  private ApiClient apiClient;

  public GameCenterAppVersionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GameCenterAppVersionsApi(ApiClient apiClient) {
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
   * @param fieldsAgeRatingDeclarations the fields to include for returned resources of type ageRatingDeclarations (optional)
   * @param fieldsAppStoreReviewDetails the fields to include for returned resources of type appStoreReviewDetails (optional)
   * @param fieldsAppStoreVersionLocalizations the fields to include for returned resources of type appStoreVersionLocalizations (optional)
   * @param fieldsAppStoreVersionExperiments the fields to include for returned resources of type appStoreVersionExperiments (optional)
   * @param fieldsAppStoreVersionSubmissions the fields to include for returned resources of type appStoreVersionSubmissions (optional)
   * @param fieldsAlternativeDistributionPackages the fields to include for returned resources of type alternativeDistributionPackages (optional)
   * @param fieldsAppStoreVersions the fields to include for returned resources of type appStoreVersions (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param fieldsRoutingAppCoverages the fields to include for returned resources of type routingAppCoverages (optional)
   * @param fieldsAppClipDefaultExperiences the fields to include for returned resources of type appClipDefaultExperiences (optional)
   * @param fieldsAppStoreVersionPhasedReleases the fields to include for returned resources of type appStoreVersionPhasedReleases (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @param limitAppStoreVersionLocalizations maximum number of related appStoreVersionLocalizations returned (when they are included) (optional)
   * @param limitAppStoreVersionExperiments maximum number of related appStoreVersionExperiments returned (when they are included) (optional)
   * @param limitAppStoreVersionExperimentsV2 maximum number of related appStoreVersionExperimentsV2 returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AppStoreVersionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppStoreVersion </td><td>  -  </td></tr>
     </table>
   */
  public AppStoreVersionResponse gameCenterAppVersionsAppStoreVersionGetToOneRelated(String id, List<String> fieldsAgeRatingDeclarations, List<String> fieldsAppStoreReviewDetails, List<String> fieldsAppStoreVersionLocalizations, List<String> fieldsAppStoreVersionExperiments, List<String> fieldsAppStoreVersionSubmissions, List<String> fieldsAlternativeDistributionPackages, List<String> fieldsAppStoreVersions, List<String> fieldsApps, List<String> fieldsRoutingAppCoverages, List<String> fieldsAppClipDefaultExperiences, List<String> fieldsAppStoreVersionPhasedReleases, List<String> fieldsBuilds, Integer limitAppStoreVersionLocalizations, Integer limitAppStoreVersionExperiments, Integer limitAppStoreVersionExperimentsV2, List<String> include) throws ApiException {
    return gameCenterAppVersionsAppStoreVersionGetToOneRelatedWithHttpInfo(id, fieldsAgeRatingDeclarations, fieldsAppStoreReviewDetails, fieldsAppStoreVersionLocalizations, fieldsAppStoreVersionExperiments, fieldsAppStoreVersionSubmissions, fieldsAlternativeDistributionPackages, fieldsAppStoreVersions, fieldsApps, fieldsRoutingAppCoverages, fieldsAppClipDefaultExperiences, fieldsAppStoreVersionPhasedReleases, fieldsBuilds, limitAppStoreVersionLocalizations, limitAppStoreVersionExperiments, limitAppStoreVersionExperimentsV2, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAgeRatingDeclarations the fields to include for returned resources of type ageRatingDeclarations (optional)
   * @param fieldsAppStoreReviewDetails the fields to include for returned resources of type appStoreReviewDetails (optional)
   * @param fieldsAppStoreVersionLocalizations the fields to include for returned resources of type appStoreVersionLocalizations (optional)
   * @param fieldsAppStoreVersionExperiments the fields to include for returned resources of type appStoreVersionExperiments (optional)
   * @param fieldsAppStoreVersionSubmissions the fields to include for returned resources of type appStoreVersionSubmissions (optional)
   * @param fieldsAlternativeDistributionPackages the fields to include for returned resources of type alternativeDistributionPackages (optional)
   * @param fieldsAppStoreVersions the fields to include for returned resources of type appStoreVersions (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param fieldsRoutingAppCoverages the fields to include for returned resources of type routingAppCoverages (optional)
   * @param fieldsAppClipDefaultExperiences the fields to include for returned resources of type appClipDefaultExperiences (optional)
   * @param fieldsAppStoreVersionPhasedReleases the fields to include for returned resources of type appStoreVersionPhasedReleases (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @param limitAppStoreVersionLocalizations maximum number of related appStoreVersionLocalizations returned (when they are included) (optional)
   * @param limitAppStoreVersionExperiments maximum number of related appStoreVersionExperiments returned (when they are included) (optional)
   * @param limitAppStoreVersionExperimentsV2 maximum number of related appStoreVersionExperimentsV2 returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AppStoreVersionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppStoreVersion </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppStoreVersionResponse> gameCenterAppVersionsAppStoreVersionGetToOneRelatedWithHttpInfo(String id, List<String> fieldsAgeRatingDeclarations, List<String> fieldsAppStoreReviewDetails, List<String> fieldsAppStoreVersionLocalizations, List<String> fieldsAppStoreVersionExperiments, List<String> fieldsAppStoreVersionSubmissions, List<String> fieldsAlternativeDistributionPackages, List<String> fieldsAppStoreVersions, List<String> fieldsApps, List<String> fieldsRoutingAppCoverages, List<String> fieldsAppClipDefaultExperiences, List<String> fieldsAppStoreVersionPhasedReleases, List<String> fieldsBuilds, Integer limitAppStoreVersionLocalizations, Integer limitAppStoreVersionExperiments, Integer limitAppStoreVersionExperimentsV2, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterAppVersionsAppStoreVersionGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterAppVersions/{id}/appStoreVersion"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[ageRatingDeclarations]", fieldsAgeRatingDeclarations)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreReviewDetails]", fieldsAppStoreReviewDetails));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersionLocalizations]", fieldsAppStoreVersionLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersionExperiments]", fieldsAppStoreVersionExperiments));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersionSubmissions]", fieldsAppStoreVersionSubmissions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[alternativeDistributionPackages]", fieldsAlternativeDistributionPackages));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersions]", fieldsAppStoreVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[apps]", fieldsApps));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[routingAppCoverages]", fieldsRoutingAppCoverages));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appClipDefaultExperiences]", fieldsAppClipDefaultExperiences));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersionPhasedReleases]", fieldsAppStoreVersionPhasedReleases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[builds]", fieldsBuilds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appStoreVersionLocalizations]", limitAppStoreVersionLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appStoreVersionExperiments]", limitAppStoreVersionExperiments));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appStoreVersionExperimentsV2]", limitAppStoreVersionExperimentsV2));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppStoreVersionResponse> localVarReturnType = new GenericType<AppStoreVersionResponse>() {};
    return apiClient.invokeAPI("GameCenterAppVersionsApi.gameCenterAppVersionsAppStoreVersionGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterAppVersionCompatibilityVersionsLinkagesRequest List of related linkages (required)
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
  public void gameCenterAppVersionsCompatibilityVersionsCreateToManyRelationship(String id, GameCenterAppVersionCompatibilityVersionsLinkagesRequest gameCenterAppVersionCompatibilityVersionsLinkagesRequest) throws ApiException {
    gameCenterAppVersionsCompatibilityVersionsCreateToManyRelationshipWithHttpInfo(id, gameCenterAppVersionCompatibilityVersionsLinkagesRequest);
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterAppVersionCompatibilityVersionsLinkagesRequest List of related linkages (required)
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
  public ApiResponse<Void> gameCenterAppVersionsCompatibilityVersionsCreateToManyRelationshipWithHttpInfo(String id, GameCenterAppVersionCompatibilityVersionsLinkagesRequest gameCenterAppVersionCompatibilityVersionsLinkagesRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterAppVersionsCompatibilityVersionsCreateToManyRelationship");
    }
    if (gameCenterAppVersionCompatibilityVersionsLinkagesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gameCenterAppVersionCompatibilityVersionsLinkagesRequest' when calling gameCenterAppVersionsCompatibilityVersionsCreateToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterAppVersions/{id}/relationships/compatibilityVersions"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("GameCenterAppVersionsApi.gameCenterAppVersionsCompatibilityVersionsCreateToManyRelationship", localVarPath, "POST", new ArrayList<>(), gameCenterAppVersionCompatibilityVersionsLinkagesRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterAppVersionCompatibilityVersionsLinkagesRequest List of related linkages (required)
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
  public void gameCenterAppVersionsCompatibilityVersionsDeleteToManyRelationship(String id, GameCenterAppVersionCompatibilityVersionsLinkagesRequest gameCenterAppVersionCompatibilityVersionsLinkagesRequest) throws ApiException {
    gameCenterAppVersionsCompatibilityVersionsDeleteToManyRelationshipWithHttpInfo(id, gameCenterAppVersionCompatibilityVersionsLinkagesRequest);
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterAppVersionCompatibilityVersionsLinkagesRequest List of related linkages (required)
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
  public ApiResponse<Void> gameCenterAppVersionsCompatibilityVersionsDeleteToManyRelationshipWithHttpInfo(String id, GameCenterAppVersionCompatibilityVersionsLinkagesRequest gameCenterAppVersionCompatibilityVersionsLinkagesRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterAppVersionsCompatibilityVersionsDeleteToManyRelationship");
    }
    if (gameCenterAppVersionCompatibilityVersionsLinkagesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gameCenterAppVersionCompatibilityVersionsLinkagesRequest' when calling gameCenterAppVersionsCompatibilityVersionsDeleteToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterAppVersions/{id}/relationships/compatibilityVersions"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("GameCenterAppVersionsApi.gameCenterAppVersionsCompatibilityVersionsDeleteToManyRelationship", localVarPath, "DELETE", new ArrayList<>(), gameCenterAppVersionCompatibilityVersionsLinkagesRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterEnabled filter by attribute &#39;enabled&#39; (optional)
   * @param fieldsAppStoreVersions the fields to include for returned resources of type appStoreVersions (optional)
   * @param fieldsGameCenterAppVersions the fields to include for returned resources of type gameCenterAppVersions (optional)
   * @param limit maximum resources per page (optional)
   * @param limitCompatibilityVersions maximum number of related compatibilityVersions returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return GameCenterAppVersionsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of GameCenterAppVersions </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterAppVersionsResponse gameCenterAppVersionsCompatibilityVersionsGetToManyRelated(String id, List<String> filterEnabled, List<String> fieldsAppStoreVersions, List<String> fieldsGameCenterAppVersions, Integer limit, Integer limitCompatibilityVersions, List<String> include) throws ApiException {
    return gameCenterAppVersionsCompatibilityVersionsGetToManyRelatedWithHttpInfo(id, filterEnabled, fieldsAppStoreVersions, fieldsGameCenterAppVersions, limit, limitCompatibilityVersions, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterEnabled filter by attribute &#39;enabled&#39; (optional)
   * @param fieldsAppStoreVersions the fields to include for returned resources of type appStoreVersions (optional)
   * @param fieldsGameCenterAppVersions the fields to include for returned resources of type gameCenterAppVersions (optional)
   * @param limit maximum resources per page (optional)
   * @param limitCompatibilityVersions maximum number of related compatibilityVersions returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;GameCenterAppVersionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of GameCenterAppVersions </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterAppVersionsResponse> gameCenterAppVersionsCompatibilityVersionsGetToManyRelatedWithHttpInfo(String id, List<String> filterEnabled, List<String> fieldsAppStoreVersions, List<String> fieldsGameCenterAppVersions, Integer limit, Integer limitCompatibilityVersions, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterAppVersionsCompatibilityVersionsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterAppVersions/{id}/compatibilityVersions"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[enabled]", filterEnabled)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersions]", fieldsAppStoreVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterAppVersions]", fieldsGameCenterAppVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[compatibilityVersions]", limitCompatibilityVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterAppVersionsResponse> localVarReturnType = new GenericType<GameCenterAppVersionsResponse>() {};
    return apiClient.invokeAPI("GameCenterAppVersionsApi.gameCenterAppVersionsCompatibilityVersionsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param limit maximum resources per page (optional)
   * @return GameCenterAppVersionCompatibilityVersionsLinkagesResponse
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
  public GameCenterAppVersionCompatibilityVersionsLinkagesResponse gameCenterAppVersionsCompatibilityVersionsGetToManyRelationship(String id, Integer limit) throws ApiException {
    return gameCenterAppVersionsCompatibilityVersionsGetToManyRelationshipWithHttpInfo(id, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;GameCenterAppVersionCompatibilityVersionsLinkagesResponse&gt;
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
  public ApiResponse<GameCenterAppVersionCompatibilityVersionsLinkagesResponse> gameCenterAppVersionsCompatibilityVersionsGetToManyRelationshipWithHttpInfo(String id, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterAppVersionsCompatibilityVersionsGetToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterAppVersions/{id}/relationships/compatibilityVersions"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "limit", limit)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterAppVersionCompatibilityVersionsLinkagesResponse> localVarReturnType = new GenericType<GameCenterAppVersionCompatibilityVersionsLinkagesResponse>() {};
    return apiClient.invokeAPI("GameCenterAppVersionsApi.gameCenterAppVersionsCompatibilityVersionsGetToManyRelationship", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param gameCenterAppVersionCreateRequest GameCenterAppVersion representation (required)
   * @return GameCenterAppVersionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single GameCenterAppVersion </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterAppVersionResponse gameCenterAppVersionsCreateInstance(GameCenterAppVersionCreateRequest gameCenterAppVersionCreateRequest) throws ApiException {
    return gameCenterAppVersionsCreateInstanceWithHttpInfo(gameCenterAppVersionCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param gameCenterAppVersionCreateRequest GameCenterAppVersion representation (required)
   * @return ApiResponse&lt;GameCenterAppVersionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single GameCenterAppVersion </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterAppVersionResponse> gameCenterAppVersionsCreateInstanceWithHttpInfo(GameCenterAppVersionCreateRequest gameCenterAppVersionCreateRequest) throws ApiException {
    // Check required parameters
    if (gameCenterAppVersionCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gameCenterAppVersionCreateRequest' when calling gameCenterAppVersionsCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterAppVersionResponse> localVarReturnType = new GenericType<GameCenterAppVersionResponse>() {};
    return apiClient.invokeAPI("GameCenterAppVersionsApi.gameCenterAppVersionsCreateInstance", "/v1/gameCenterAppVersions", "POST", new ArrayList<>(), gameCenterAppVersionCreateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterAppVersions the fields to include for returned resources of type gameCenterAppVersions (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsAppStoreVersions the fields to include for returned resources of type appStoreVersions (optional)
   * @param limitCompatibilityVersions maximum number of related compatibilityVersions returned (when they are included) (optional)
   * @return GameCenterAppVersionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterAppVersion </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterAppVersionResponse gameCenterAppVersionsGetInstance(String id, List<String> fieldsGameCenterAppVersions, List<String> include, List<String> fieldsAppStoreVersions, Integer limitCompatibilityVersions) throws ApiException {
    return gameCenterAppVersionsGetInstanceWithHttpInfo(id, fieldsGameCenterAppVersions, include, fieldsAppStoreVersions, limitCompatibilityVersions).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterAppVersions the fields to include for returned resources of type gameCenterAppVersions (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsAppStoreVersions the fields to include for returned resources of type appStoreVersions (optional)
   * @param limitCompatibilityVersions maximum number of related compatibilityVersions returned (when they are included) (optional)
   * @return ApiResponse&lt;GameCenterAppVersionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterAppVersion </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterAppVersionResponse> gameCenterAppVersionsGetInstanceWithHttpInfo(String id, List<String> fieldsGameCenterAppVersions, List<String> include, List<String> fieldsAppStoreVersions, Integer limitCompatibilityVersions) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterAppVersionsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterAppVersions/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[gameCenterAppVersions]", fieldsGameCenterAppVersions)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersions]", fieldsAppStoreVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[compatibilityVersions]", limitCompatibilityVersions));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterAppVersionResponse> localVarReturnType = new GenericType<GameCenterAppVersionResponse>() {};
    return apiClient.invokeAPI("GameCenterAppVersionsApi.gameCenterAppVersionsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterAppVersionUpdateRequest GameCenterAppVersion representation (required)
   * @return GameCenterAppVersionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterAppVersion </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterAppVersionResponse gameCenterAppVersionsUpdateInstance(String id, GameCenterAppVersionUpdateRequest gameCenterAppVersionUpdateRequest) throws ApiException {
    return gameCenterAppVersionsUpdateInstanceWithHttpInfo(id, gameCenterAppVersionUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param gameCenterAppVersionUpdateRequest GameCenterAppVersion representation (required)
   * @return ApiResponse&lt;GameCenterAppVersionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterAppVersion </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterAppVersionResponse> gameCenterAppVersionsUpdateInstanceWithHttpInfo(String id, GameCenterAppVersionUpdateRequest gameCenterAppVersionUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling gameCenterAppVersionsUpdateInstance");
    }
    if (gameCenterAppVersionUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'gameCenterAppVersionUpdateRequest' when calling gameCenterAppVersionsUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/gameCenterAppVersions/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterAppVersionResponse> localVarReturnType = new GenericType<GameCenterAppVersionResponse>() {};
    return apiClient.invokeAPI("GameCenterAppVersionsApi.gameCenterAppVersionsUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), gameCenterAppVersionUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
