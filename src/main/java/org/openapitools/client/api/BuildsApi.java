package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.AppEncryptionDeclarationWithoutIncludesResponse;
import org.openapitools.client.model.AppStoreVersionResponse;
import org.openapitools.client.model.AppWithoutIncludesResponse;
import org.openapitools.client.model.BetaAppReviewSubmissionWithoutIncludesResponse;
import org.openapitools.client.model.BetaBuildLocalizationsWithoutIncludesResponse;
import org.openapitools.client.model.BetaBuildUsagesV1MetricResponse;
import org.openapitools.client.model.BetaTestersWithoutIncludesResponse;
import org.openapitools.client.model.BuildAppEncryptionDeclarationLinkageRequest;
import org.openapitools.client.model.BuildAppEncryptionDeclarationLinkageResponse;
import org.openapitools.client.model.BuildBetaDetailResponse;
import org.openapitools.client.model.BuildBetaGroupsLinkagesRequest;
import org.openapitools.client.model.BuildIconsWithoutIncludesResponse;
import org.openapitools.client.model.BuildIndividualTestersLinkagesRequest;
import org.openapitools.client.model.BuildIndividualTestersLinkagesResponse;
import org.openapitools.client.model.BuildResponse;
import org.openapitools.client.model.BuildUpdateRequest;
import org.openapitools.client.model.BuildsResponse;
import org.openapitools.client.model.DiagnosticSignaturesResponse;
import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.PrereleaseVersionWithoutIncludesResponse;
import org.openapitools.client.model.XcodeMetrics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class BuildsApi {
  private ApiClient apiClient;

  public BuildsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BuildsApi(ApiClient apiClient) {
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
   * @param fieldsAppEncryptionDeclarations the fields to include for returned resources of type appEncryptionDeclarations (optional)
   * @return AppEncryptionDeclarationWithoutIncludesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppEncryptionDeclaration with get </td><td>  -  </td></tr>
     </table>
   */
  public AppEncryptionDeclarationWithoutIncludesResponse buildsAppEncryptionDeclarationGetToOneRelated(String id, List<String> fieldsAppEncryptionDeclarations) throws ApiException {
    return buildsAppEncryptionDeclarationGetToOneRelatedWithHttpInfo(id, fieldsAppEncryptionDeclarations).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppEncryptionDeclarations the fields to include for returned resources of type appEncryptionDeclarations (optional)
   * @return ApiResponse&lt;AppEncryptionDeclarationWithoutIncludesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppEncryptionDeclaration with get </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppEncryptionDeclarationWithoutIncludesResponse> buildsAppEncryptionDeclarationGetToOneRelatedWithHttpInfo(String id, List<String> fieldsAppEncryptionDeclarations) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling buildsAppEncryptionDeclarationGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/builds/{id}/appEncryptionDeclaration"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appEncryptionDeclarations]", fieldsAppEncryptionDeclarations)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppEncryptionDeclarationWithoutIncludesResponse> localVarReturnType = new GenericType<AppEncryptionDeclarationWithoutIncludesResponse>() {};
    return apiClient.invokeAPI("BuildsApi.buildsAppEncryptionDeclarationGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @return BuildAppEncryptionDeclarationLinkageResponse
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
  public BuildAppEncryptionDeclarationLinkageResponse buildsAppEncryptionDeclarationGetToOneRelationship(String id) throws ApiException {
    return buildsAppEncryptionDeclarationGetToOneRelationshipWithHttpInfo(id).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @return ApiResponse&lt;BuildAppEncryptionDeclarationLinkageResponse&gt;
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
  public ApiResponse<BuildAppEncryptionDeclarationLinkageResponse> buildsAppEncryptionDeclarationGetToOneRelationshipWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling buildsAppEncryptionDeclarationGetToOneRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/builds/{id}/relationships/appEncryptionDeclaration"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BuildAppEncryptionDeclarationLinkageResponse> localVarReturnType = new GenericType<BuildAppEncryptionDeclarationLinkageResponse>() {};
    return apiClient.invokeAPI("BuildsApi.buildsAppEncryptionDeclarationGetToOneRelationship", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param buildAppEncryptionDeclarationLinkageRequest Related linkage (required)
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
  public void buildsAppEncryptionDeclarationUpdateToOneRelationship(String id, BuildAppEncryptionDeclarationLinkageRequest buildAppEncryptionDeclarationLinkageRequest) throws ApiException {
    buildsAppEncryptionDeclarationUpdateToOneRelationshipWithHttpInfo(id, buildAppEncryptionDeclarationLinkageRequest);
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param buildAppEncryptionDeclarationLinkageRequest Related linkage (required)
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
  public ApiResponse<Void> buildsAppEncryptionDeclarationUpdateToOneRelationshipWithHttpInfo(String id, BuildAppEncryptionDeclarationLinkageRequest buildAppEncryptionDeclarationLinkageRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling buildsAppEncryptionDeclarationUpdateToOneRelationship");
    }
    if (buildAppEncryptionDeclarationLinkageRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'buildAppEncryptionDeclarationLinkageRequest' when calling buildsAppEncryptionDeclarationUpdateToOneRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/builds/{id}/relationships/appEncryptionDeclaration"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("BuildsApi.buildsAppEncryptionDeclarationUpdateToOneRelationship", localVarPath, "PATCH", new ArrayList<>(), buildAppEncryptionDeclarationLinkageRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @return AppWithoutIncludesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single App with get </td><td>  -  </td></tr>
     </table>
   */
  public AppWithoutIncludesResponse buildsAppGetToOneRelated(String id, List<String> fieldsApps) throws ApiException {
    return buildsAppGetToOneRelatedWithHttpInfo(id, fieldsApps).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @return ApiResponse&lt;AppWithoutIncludesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single App with get </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppWithoutIncludesResponse> buildsAppGetToOneRelatedWithHttpInfo(String id, List<String> fieldsApps) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling buildsAppGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/builds/{id}/app"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[apps]", fieldsApps)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppWithoutIncludesResponse> localVarReturnType = new GenericType<AppWithoutIncludesResponse>() {};
    return apiClient.invokeAPI("BuildsApi.buildsAppGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
  public AppStoreVersionResponse buildsAppStoreVersionGetToOneRelated(String id, List<String> fieldsAgeRatingDeclarations, List<String> fieldsAppStoreReviewDetails, List<String> fieldsAppStoreVersionLocalizations, List<String> fieldsAppStoreVersionExperiments, List<String> fieldsAppStoreVersionSubmissions, List<String> fieldsAlternativeDistributionPackages, List<String> fieldsAppStoreVersions, List<String> fieldsApps, List<String> fieldsRoutingAppCoverages, List<String> fieldsAppClipDefaultExperiences, List<String> fieldsAppStoreVersionPhasedReleases, List<String> fieldsBuilds, Integer limitAppStoreVersionLocalizations, Integer limitAppStoreVersionExperiments, Integer limitAppStoreVersionExperimentsV2, List<String> include) throws ApiException {
    return buildsAppStoreVersionGetToOneRelatedWithHttpInfo(id, fieldsAgeRatingDeclarations, fieldsAppStoreReviewDetails, fieldsAppStoreVersionLocalizations, fieldsAppStoreVersionExperiments, fieldsAppStoreVersionSubmissions, fieldsAlternativeDistributionPackages, fieldsAppStoreVersions, fieldsApps, fieldsRoutingAppCoverages, fieldsAppClipDefaultExperiences, fieldsAppStoreVersionPhasedReleases, fieldsBuilds, limitAppStoreVersionLocalizations, limitAppStoreVersionExperiments, limitAppStoreVersionExperimentsV2, include).getData();
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
  public ApiResponse<AppStoreVersionResponse> buildsAppStoreVersionGetToOneRelatedWithHttpInfo(String id, List<String> fieldsAgeRatingDeclarations, List<String> fieldsAppStoreReviewDetails, List<String> fieldsAppStoreVersionLocalizations, List<String> fieldsAppStoreVersionExperiments, List<String> fieldsAppStoreVersionSubmissions, List<String> fieldsAlternativeDistributionPackages, List<String> fieldsAppStoreVersions, List<String> fieldsApps, List<String> fieldsRoutingAppCoverages, List<String> fieldsAppClipDefaultExperiences, List<String> fieldsAppStoreVersionPhasedReleases, List<String> fieldsBuilds, Integer limitAppStoreVersionLocalizations, Integer limitAppStoreVersionExperiments, Integer limitAppStoreVersionExperimentsV2, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling buildsAppStoreVersionGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/builds/{id}/appStoreVersion"
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
    return apiClient.invokeAPI("BuildsApi.buildsAppStoreVersionGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBetaAppReviewSubmissions the fields to include for returned resources of type betaAppReviewSubmissions (optional)
   * @return BetaAppReviewSubmissionWithoutIncludesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single BetaAppReviewSubmission with get </td><td>  -  </td></tr>
     </table>
   */
  public BetaAppReviewSubmissionWithoutIncludesResponse buildsBetaAppReviewSubmissionGetToOneRelated(String id, List<String> fieldsBetaAppReviewSubmissions) throws ApiException {
    return buildsBetaAppReviewSubmissionGetToOneRelatedWithHttpInfo(id, fieldsBetaAppReviewSubmissions).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBetaAppReviewSubmissions the fields to include for returned resources of type betaAppReviewSubmissions (optional)
   * @return ApiResponse&lt;BetaAppReviewSubmissionWithoutIncludesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single BetaAppReviewSubmission with get </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BetaAppReviewSubmissionWithoutIncludesResponse> buildsBetaAppReviewSubmissionGetToOneRelatedWithHttpInfo(String id, List<String> fieldsBetaAppReviewSubmissions) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling buildsBetaAppReviewSubmissionGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/builds/{id}/betaAppReviewSubmission"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[betaAppReviewSubmissions]", fieldsBetaAppReviewSubmissions)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BetaAppReviewSubmissionWithoutIncludesResponse> localVarReturnType = new GenericType<BetaAppReviewSubmissionWithoutIncludesResponse>() {};
    return apiClient.invokeAPI("BuildsApi.buildsBetaAppReviewSubmissionGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBetaBuildLocalizations the fields to include for returned resources of type betaBuildLocalizations (optional)
   * @param limit maximum resources per page (optional)
   * @return BetaBuildLocalizationsWithoutIncludesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of BetaBuildLocalizations with get </td><td>  -  </td></tr>
     </table>
   */
  public BetaBuildLocalizationsWithoutIncludesResponse buildsBetaBuildLocalizationsGetToManyRelated(String id, List<String> fieldsBetaBuildLocalizations, Integer limit) throws ApiException {
    return buildsBetaBuildLocalizationsGetToManyRelatedWithHttpInfo(id, fieldsBetaBuildLocalizations, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBetaBuildLocalizations the fields to include for returned resources of type betaBuildLocalizations (optional)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;BetaBuildLocalizationsWithoutIncludesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of BetaBuildLocalizations with get </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BetaBuildLocalizationsWithoutIncludesResponse> buildsBetaBuildLocalizationsGetToManyRelatedWithHttpInfo(String id, List<String> fieldsBetaBuildLocalizations, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling buildsBetaBuildLocalizationsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/builds/{id}/betaBuildLocalizations"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[betaBuildLocalizations]", fieldsBetaBuildLocalizations)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BetaBuildLocalizationsWithoutIncludesResponse> localVarReturnType = new GenericType<BetaBuildLocalizationsWithoutIncludesResponse>() {};
    return apiClient.invokeAPI("BuildsApi.buildsBetaBuildLocalizationsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param limit maximum number of groups to return per page (optional)
   * @return BetaBuildUsagesV1MetricResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Metrics data response </td><td>  -  </td></tr>
     </table>
   */
  public BetaBuildUsagesV1MetricResponse buildsBetaBuildUsagesGetMetrics(String id, Integer limit) throws ApiException {
    return buildsBetaBuildUsagesGetMetricsWithHttpInfo(id, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param limit maximum number of groups to return per page (optional)
   * @return ApiResponse&lt;BetaBuildUsagesV1MetricResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Metrics data response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BetaBuildUsagesV1MetricResponse> buildsBetaBuildUsagesGetMetricsWithHttpInfo(String id, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling buildsBetaBuildUsagesGetMetrics");
    }

    // Path parameters
    String localVarPath = "/v1/builds/{id}/metrics/betaBuildUsages"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "limit", limit)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BetaBuildUsagesV1MetricResponse> localVarReturnType = new GenericType<BetaBuildUsagesV1MetricResponse>() {};
    return apiClient.invokeAPI("BuildsApi.buildsBetaBuildUsagesGetMetrics", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param buildBetaGroupsLinkagesRequest List of related linkages (required)
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
  public void buildsBetaGroupsCreateToManyRelationship(String id, BuildBetaGroupsLinkagesRequest buildBetaGroupsLinkagesRequest) throws ApiException {
    buildsBetaGroupsCreateToManyRelationshipWithHttpInfo(id, buildBetaGroupsLinkagesRequest);
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param buildBetaGroupsLinkagesRequest List of related linkages (required)
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
  public ApiResponse<Void> buildsBetaGroupsCreateToManyRelationshipWithHttpInfo(String id, BuildBetaGroupsLinkagesRequest buildBetaGroupsLinkagesRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling buildsBetaGroupsCreateToManyRelationship");
    }
    if (buildBetaGroupsLinkagesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'buildBetaGroupsLinkagesRequest' when calling buildsBetaGroupsCreateToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/builds/{id}/relationships/betaGroups"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("BuildsApi.buildsBetaGroupsCreateToManyRelationship", localVarPath, "POST", new ArrayList<>(), buildBetaGroupsLinkagesRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param buildBetaGroupsLinkagesRequest List of related linkages (required)
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
  public void buildsBetaGroupsDeleteToManyRelationship(String id, BuildBetaGroupsLinkagesRequest buildBetaGroupsLinkagesRequest) throws ApiException {
    buildsBetaGroupsDeleteToManyRelationshipWithHttpInfo(id, buildBetaGroupsLinkagesRequest);
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param buildBetaGroupsLinkagesRequest List of related linkages (required)
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
  public ApiResponse<Void> buildsBetaGroupsDeleteToManyRelationshipWithHttpInfo(String id, BuildBetaGroupsLinkagesRequest buildBetaGroupsLinkagesRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling buildsBetaGroupsDeleteToManyRelationship");
    }
    if (buildBetaGroupsLinkagesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'buildBetaGroupsLinkagesRequest' when calling buildsBetaGroupsDeleteToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/builds/{id}/relationships/betaGroups"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("BuildsApi.buildsBetaGroupsDeleteToManyRelationship", localVarPath, "DELETE", new ArrayList<>(), buildBetaGroupsLinkagesRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBuildBetaDetails the fields to include for returned resources of type buildBetaDetails (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return BuildBetaDetailResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single BuildBetaDetail </td><td>  -  </td></tr>
     </table>
   */
  public BuildBetaDetailResponse buildsBuildBetaDetailGetToOneRelated(String id, List<String> fieldsBuildBetaDetails, List<String> fieldsBuilds, List<String> include) throws ApiException {
    return buildsBuildBetaDetailGetToOneRelatedWithHttpInfo(id, fieldsBuildBetaDetails, fieldsBuilds, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBuildBetaDetails the fields to include for returned resources of type buildBetaDetails (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;BuildBetaDetailResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single BuildBetaDetail </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BuildBetaDetailResponse> buildsBuildBetaDetailGetToOneRelatedWithHttpInfo(String id, List<String> fieldsBuildBetaDetails, List<String> fieldsBuilds, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling buildsBuildBetaDetailGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/builds/{id}/buildBetaDetail"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[buildBetaDetails]", fieldsBuildBetaDetails)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[builds]", fieldsBuilds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BuildBetaDetailResponse> localVarReturnType = new GenericType<BuildBetaDetailResponse>() {};
    return apiClient.invokeAPI("BuildsApi.buildsBuildBetaDetailGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterDiagnosticType filter by attribute &#39;diagnosticType&#39; (optional)
   * @param fieldsDiagnosticSignatures the fields to include for returned resources of type diagnosticSignatures (optional)
   * @param limit maximum resources per page (optional)
   * @return DiagnosticSignaturesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of DiagnosticSignatures </td><td>  -  </td></tr>
     </table>
   */
  public DiagnosticSignaturesResponse buildsDiagnosticSignaturesGetToManyRelated(String id, List<String> filterDiagnosticType, List<String> fieldsDiagnosticSignatures, Integer limit) throws ApiException {
    return buildsDiagnosticSignaturesGetToManyRelatedWithHttpInfo(id, filterDiagnosticType, fieldsDiagnosticSignatures, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterDiagnosticType filter by attribute &#39;diagnosticType&#39; (optional)
   * @param fieldsDiagnosticSignatures the fields to include for returned resources of type diagnosticSignatures (optional)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;DiagnosticSignaturesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of DiagnosticSignatures </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DiagnosticSignaturesResponse> buildsDiagnosticSignaturesGetToManyRelatedWithHttpInfo(String id, List<String> filterDiagnosticType, List<String> fieldsDiagnosticSignatures, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling buildsDiagnosticSignaturesGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/builds/{id}/diagnosticSignatures"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[diagnosticType]", filterDiagnosticType)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[diagnosticSignatures]", fieldsDiagnosticSignatures));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<DiagnosticSignaturesResponse> localVarReturnType = new GenericType<DiagnosticSignaturesResponse>() {};
    return apiClient.invokeAPI("BuildsApi.buildsDiagnosticSignaturesGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param filterBetaAppReviewSubmissionBetaReviewState filter by attribute &#39;betaAppReviewSubmission.betaReviewState&#39; (optional)
   * @param filterBuildAudienceType filter by attribute &#39;buildAudienceType&#39; (optional)
   * @param filterExpired filter by attribute &#39;expired&#39; (optional)
   * @param filterPreReleaseVersionPlatform filter by attribute &#39;preReleaseVersion.platform&#39; (optional)
   * @param filterPreReleaseVersionVersion filter by attribute &#39;preReleaseVersion.version&#39; (optional)
   * @param filterProcessingState filter by attribute &#39;processingState&#39; (optional)
   * @param filterUsesNonExemptEncryption filter by attribute &#39;usesNonExemptEncryption&#39; (optional)
   * @param filterVersion filter by attribute &#39;version&#39; (optional)
   * @param filterApp filter by id(s) of related &#39;app&#39; (optional)
   * @param filterAppStoreVersion filter by id(s) of related &#39;appStoreVersion&#39; (optional)
   * @param filterBetaGroups filter by id(s) of related &#39;betaGroups&#39; (optional)
   * @param filterPreReleaseVersion filter by id(s) of related &#39;preReleaseVersion&#39; (optional)
   * @param filterId filter by id(s) (optional)
   * @param sort comma-separated list of sort expressions; resources will be sorted as specified (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsDiagnosticSignatures the fields to include for returned resources of type diagnosticSignatures (optional)
   * @param fieldsBuildIcons the fields to include for returned resources of type buildIcons (optional)
   * @param fieldsBuildBetaDetails the fields to include for returned resources of type buildBetaDetails (optional)
   * @param fieldsBetaAppReviewSubmissions the fields to include for returned resources of type betaAppReviewSubmissions (optional)
   * @param fieldsBetaTesters the fields to include for returned resources of type betaTesters (optional)
   * @param fieldsAppStoreVersions the fields to include for returned resources of type appStoreVersions (optional)
   * @param fieldsBetaBuildLocalizations the fields to include for returned resources of type betaBuildLocalizations (optional)
   * @param fieldsPreReleaseVersions the fields to include for returned resources of type preReleaseVersions (optional)
   * @param fieldsAppEncryptionDeclarations the fields to include for returned resources of type appEncryptionDeclarations (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param fieldsPerfPowerMetrics the fields to include for returned resources of type perfPowerMetrics (optional)
   * @param limitBetaBuildLocalizations maximum number of related betaBuildLocalizations returned (when they are included) (optional)
   * @param limitBetaGroups maximum number of related betaGroups returned (when they are included) (optional)
   * @param limitBuildBundles maximum number of related buildBundles returned (when they are included) (optional)
   * @param limitIcons maximum number of related icons returned (when they are included) (optional)
   * @param limitIndividualTesters maximum number of related individualTesters returned (when they are included) (optional)
   * @return BuildsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of Builds </td><td>  -  </td></tr>
     </table>
   */
  public BuildsResponse buildsGetCollection(List<String> filterBetaAppReviewSubmissionBetaReviewState, List<String> filterBuildAudienceType, List<String> filterExpired, List<String> filterPreReleaseVersionPlatform, List<String> filterPreReleaseVersionVersion, List<String> filterProcessingState, List<String> filterUsesNonExemptEncryption, List<String> filterVersion, List<String> filterApp, List<String> filterAppStoreVersion, List<String> filterBetaGroups, List<String> filterPreReleaseVersion, List<String> filterId, List<String> sort, List<String> fieldsBuilds, Integer limit, List<String> include, List<String> fieldsDiagnosticSignatures, List<String> fieldsBuildIcons, List<String> fieldsBuildBetaDetails, List<String> fieldsBetaAppReviewSubmissions, List<String> fieldsBetaTesters, List<String> fieldsAppStoreVersions, List<String> fieldsBetaBuildLocalizations, List<String> fieldsPreReleaseVersions, List<String> fieldsAppEncryptionDeclarations, List<String> fieldsApps, List<String> fieldsPerfPowerMetrics, Integer limitBetaBuildLocalizations, Integer limitBetaGroups, Integer limitBuildBundles, Integer limitIcons, Integer limitIndividualTesters) throws ApiException {
    return buildsGetCollectionWithHttpInfo(filterBetaAppReviewSubmissionBetaReviewState, filterBuildAudienceType, filterExpired, filterPreReleaseVersionPlatform, filterPreReleaseVersionVersion, filterProcessingState, filterUsesNonExemptEncryption, filterVersion, filterApp, filterAppStoreVersion, filterBetaGroups, filterPreReleaseVersion, filterId, sort, fieldsBuilds, limit, include, fieldsDiagnosticSignatures, fieldsBuildIcons, fieldsBuildBetaDetails, fieldsBetaAppReviewSubmissions, fieldsBetaTesters, fieldsAppStoreVersions, fieldsBetaBuildLocalizations, fieldsPreReleaseVersions, fieldsAppEncryptionDeclarations, fieldsApps, fieldsPerfPowerMetrics, limitBetaBuildLocalizations, limitBetaGroups, limitBuildBundles, limitIcons, limitIndividualTesters).getData();
  }

  /**
   * 
   * 
   * @param filterBetaAppReviewSubmissionBetaReviewState filter by attribute &#39;betaAppReviewSubmission.betaReviewState&#39; (optional)
   * @param filterBuildAudienceType filter by attribute &#39;buildAudienceType&#39; (optional)
   * @param filterExpired filter by attribute &#39;expired&#39; (optional)
   * @param filterPreReleaseVersionPlatform filter by attribute &#39;preReleaseVersion.platform&#39; (optional)
   * @param filterPreReleaseVersionVersion filter by attribute &#39;preReleaseVersion.version&#39; (optional)
   * @param filterProcessingState filter by attribute &#39;processingState&#39; (optional)
   * @param filterUsesNonExemptEncryption filter by attribute &#39;usesNonExemptEncryption&#39; (optional)
   * @param filterVersion filter by attribute &#39;version&#39; (optional)
   * @param filterApp filter by id(s) of related &#39;app&#39; (optional)
   * @param filterAppStoreVersion filter by id(s) of related &#39;appStoreVersion&#39; (optional)
   * @param filterBetaGroups filter by id(s) of related &#39;betaGroups&#39; (optional)
   * @param filterPreReleaseVersion filter by id(s) of related &#39;preReleaseVersion&#39; (optional)
   * @param filterId filter by id(s) (optional)
   * @param sort comma-separated list of sort expressions; resources will be sorted as specified (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsDiagnosticSignatures the fields to include for returned resources of type diagnosticSignatures (optional)
   * @param fieldsBuildIcons the fields to include for returned resources of type buildIcons (optional)
   * @param fieldsBuildBetaDetails the fields to include for returned resources of type buildBetaDetails (optional)
   * @param fieldsBetaAppReviewSubmissions the fields to include for returned resources of type betaAppReviewSubmissions (optional)
   * @param fieldsBetaTesters the fields to include for returned resources of type betaTesters (optional)
   * @param fieldsAppStoreVersions the fields to include for returned resources of type appStoreVersions (optional)
   * @param fieldsBetaBuildLocalizations the fields to include for returned resources of type betaBuildLocalizations (optional)
   * @param fieldsPreReleaseVersions the fields to include for returned resources of type preReleaseVersions (optional)
   * @param fieldsAppEncryptionDeclarations the fields to include for returned resources of type appEncryptionDeclarations (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param fieldsPerfPowerMetrics the fields to include for returned resources of type perfPowerMetrics (optional)
   * @param limitBetaBuildLocalizations maximum number of related betaBuildLocalizations returned (when they are included) (optional)
   * @param limitBetaGroups maximum number of related betaGroups returned (when they are included) (optional)
   * @param limitBuildBundles maximum number of related buildBundles returned (when they are included) (optional)
   * @param limitIcons maximum number of related icons returned (when they are included) (optional)
   * @param limitIndividualTesters maximum number of related individualTesters returned (when they are included) (optional)
   * @return ApiResponse&lt;BuildsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of Builds </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BuildsResponse> buildsGetCollectionWithHttpInfo(List<String> filterBetaAppReviewSubmissionBetaReviewState, List<String> filterBuildAudienceType, List<String> filterExpired, List<String> filterPreReleaseVersionPlatform, List<String> filterPreReleaseVersionVersion, List<String> filterProcessingState, List<String> filterUsesNonExemptEncryption, List<String> filterVersion, List<String> filterApp, List<String> filterAppStoreVersion, List<String> filterBetaGroups, List<String> filterPreReleaseVersion, List<String> filterId, List<String> sort, List<String> fieldsBuilds, Integer limit, List<String> include, List<String> fieldsDiagnosticSignatures, List<String> fieldsBuildIcons, List<String> fieldsBuildBetaDetails, List<String> fieldsBetaAppReviewSubmissions, List<String> fieldsBetaTesters, List<String> fieldsAppStoreVersions, List<String> fieldsBetaBuildLocalizations, List<String> fieldsPreReleaseVersions, List<String> fieldsAppEncryptionDeclarations, List<String> fieldsApps, List<String> fieldsPerfPowerMetrics, Integer limitBetaBuildLocalizations, Integer limitBetaGroups, Integer limitBuildBundles, Integer limitIcons, Integer limitIndividualTesters) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[betaAppReviewSubmission.betaReviewState]", filterBetaAppReviewSubmissionBetaReviewState)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[buildAudienceType]", filterBuildAudienceType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[expired]", filterExpired));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[preReleaseVersion.platform]", filterPreReleaseVersionPlatform));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[preReleaseVersion.version]", filterPreReleaseVersionVersion));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[processingState]", filterProcessingState));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[usesNonExemptEncryption]", filterUsesNonExemptEncryption));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[version]", filterVersion));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[app]", filterApp));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[appStoreVersion]", filterAppStoreVersion));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[betaGroups]", filterBetaGroups));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[preReleaseVersion]", filterPreReleaseVersion));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[id]", filterId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[builds]", fieldsBuilds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[diagnosticSignatures]", fieldsDiagnosticSignatures));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[buildIcons]", fieldsBuildIcons));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[buildBetaDetails]", fieldsBuildBetaDetails));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[betaAppReviewSubmissions]", fieldsBetaAppReviewSubmissions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[betaTesters]", fieldsBetaTesters));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersions]", fieldsAppStoreVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[betaBuildLocalizations]", fieldsBetaBuildLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[preReleaseVersions]", fieldsPreReleaseVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appEncryptionDeclarations]", fieldsAppEncryptionDeclarations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[apps]", fieldsApps));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[perfPowerMetrics]", fieldsPerfPowerMetrics));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[betaBuildLocalizations]", limitBetaBuildLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[betaGroups]", limitBetaGroups));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[buildBundles]", limitBuildBundles));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[icons]", limitIcons));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[individualTesters]", limitIndividualTesters));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BuildsResponse> localVarReturnType = new GenericType<BuildsResponse>() {};
    return apiClient.invokeAPI("BuildsApi.buildsGetCollection", "/v1/builds", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsDiagnosticSignatures the fields to include for returned resources of type diagnosticSignatures (optional)
   * @param fieldsBuildIcons the fields to include for returned resources of type buildIcons (optional)
   * @param fieldsBuildBetaDetails the fields to include for returned resources of type buildBetaDetails (optional)
   * @param fieldsBetaAppReviewSubmissions the fields to include for returned resources of type betaAppReviewSubmissions (optional)
   * @param fieldsBetaTesters the fields to include for returned resources of type betaTesters (optional)
   * @param fieldsAppStoreVersions the fields to include for returned resources of type appStoreVersions (optional)
   * @param fieldsBetaBuildLocalizations the fields to include for returned resources of type betaBuildLocalizations (optional)
   * @param fieldsPreReleaseVersions the fields to include for returned resources of type preReleaseVersions (optional)
   * @param fieldsAppEncryptionDeclarations the fields to include for returned resources of type appEncryptionDeclarations (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param fieldsPerfPowerMetrics the fields to include for returned resources of type perfPowerMetrics (optional)
   * @param limitBetaBuildLocalizations maximum number of related betaBuildLocalizations returned (when they are included) (optional)
   * @param limitBetaGroups maximum number of related betaGroups returned (when they are included) (optional)
   * @param limitBuildBundles maximum number of related buildBundles returned (when they are included) (optional)
   * @param limitIcons maximum number of related icons returned (when they are included) (optional)
   * @param limitIndividualTesters maximum number of related individualTesters returned (when they are included) (optional)
   * @return BuildResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single Build </td><td>  -  </td></tr>
     </table>
   */
  public BuildResponse buildsGetInstance(String id, List<String> fieldsBuilds, List<String> include, List<String> fieldsDiagnosticSignatures, List<String> fieldsBuildIcons, List<String> fieldsBuildBetaDetails, List<String> fieldsBetaAppReviewSubmissions, List<String> fieldsBetaTesters, List<String> fieldsAppStoreVersions, List<String> fieldsBetaBuildLocalizations, List<String> fieldsPreReleaseVersions, List<String> fieldsAppEncryptionDeclarations, List<String> fieldsApps, List<String> fieldsPerfPowerMetrics, Integer limitBetaBuildLocalizations, Integer limitBetaGroups, Integer limitBuildBundles, Integer limitIcons, Integer limitIndividualTesters) throws ApiException {
    return buildsGetInstanceWithHttpInfo(id, fieldsBuilds, include, fieldsDiagnosticSignatures, fieldsBuildIcons, fieldsBuildBetaDetails, fieldsBetaAppReviewSubmissions, fieldsBetaTesters, fieldsAppStoreVersions, fieldsBetaBuildLocalizations, fieldsPreReleaseVersions, fieldsAppEncryptionDeclarations, fieldsApps, fieldsPerfPowerMetrics, limitBetaBuildLocalizations, limitBetaGroups, limitBuildBundles, limitIcons, limitIndividualTesters).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsDiagnosticSignatures the fields to include for returned resources of type diagnosticSignatures (optional)
   * @param fieldsBuildIcons the fields to include for returned resources of type buildIcons (optional)
   * @param fieldsBuildBetaDetails the fields to include for returned resources of type buildBetaDetails (optional)
   * @param fieldsBetaAppReviewSubmissions the fields to include for returned resources of type betaAppReviewSubmissions (optional)
   * @param fieldsBetaTesters the fields to include for returned resources of type betaTesters (optional)
   * @param fieldsAppStoreVersions the fields to include for returned resources of type appStoreVersions (optional)
   * @param fieldsBetaBuildLocalizations the fields to include for returned resources of type betaBuildLocalizations (optional)
   * @param fieldsPreReleaseVersions the fields to include for returned resources of type preReleaseVersions (optional)
   * @param fieldsAppEncryptionDeclarations the fields to include for returned resources of type appEncryptionDeclarations (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param fieldsPerfPowerMetrics the fields to include for returned resources of type perfPowerMetrics (optional)
   * @param limitBetaBuildLocalizations maximum number of related betaBuildLocalizations returned (when they are included) (optional)
   * @param limitBetaGroups maximum number of related betaGroups returned (when they are included) (optional)
   * @param limitBuildBundles maximum number of related buildBundles returned (when they are included) (optional)
   * @param limitIcons maximum number of related icons returned (when they are included) (optional)
   * @param limitIndividualTesters maximum number of related individualTesters returned (when they are included) (optional)
   * @return ApiResponse&lt;BuildResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single Build </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BuildResponse> buildsGetInstanceWithHttpInfo(String id, List<String> fieldsBuilds, List<String> include, List<String> fieldsDiagnosticSignatures, List<String> fieldsBuildIcons, List<String> fieldsBuildBetaDetails, List<String> fieldsBetaAppReviewSubmissions, List<String> fieldsBetaTesters, List<String> fieldsAppStoreVersions, List<String> fieldsBetaBuildLocalizations, List<String> fieldsPreReleaseVersions, List<String> fieldsAppEncryptionDeclarations, List<String> fieldsApps, List<String> fieldsPerfPowerMetrics, Integer limitBetaBuildLocalizations, Integer limitBetaGroups, Integer limitBuildBundles, Integer limitIcons, Integer limitIndividualTesters) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling buildsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/builds/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[builds]", fieldsBuilds)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[diagnosticSignatures]", fieldsDiagnosticSignatures));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[buildIcons]", fieldsBuildIcons));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[buildBetaDetails]", fieldsBuildBetaDetails));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[betaAppReviewSubmissions]", fieldsBetaAppReviewSubmissions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[betaTesters]", fieldsBetaTesters));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersions]", fieldsAppStoreVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[betaBuildLocalizations]", fieldsBetaBuildLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[preReleaseVersions]", fieldsPreReleaseVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appEncryptionDeclarations]", fieldsAppEncryptionDeclarations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[apps]", fieldsApps));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[perfPowerMetrics]", fieldsPerfPowerMetrics));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[betaBuildLocalizations]", limitBetaBuildLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[betaGroups]", limitBetaGroups));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[buildBundles]", limitBuildBundles));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[icons]", limitIcons));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[individualTesters]", limitIndividualTesters));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BuildResponse> localVarReturnType = new GenericType<BuildResponse>() {};
    return apiClient.invokeAPI("BuildsApi.buildsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBuildIcons the fields to include for returned resources of type buildIcons (optional)
   * @param limit maximum resources per page (optional)
   * @return BuildIconsWithoutIncludesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of BuildIcons with get </td><td>  -  </td></tr>
     </table>
   */
  public BuildIconsWithoutIncludesResponse buildsIconsGetToManyRelated(String id, List<String> fieldsBuildIcons, Integer limit) throws ApiException {
    return buildsIconsGetToManyRelatedWithHttpInfo(id, fieldsBuildIcons, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBuildIcons the fields to include for returned resources of type buildIcons (optional)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;BuildIconsWithoutIncludesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of BuildIcons with get </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BuildIconsWithoutIncludesResponse> buildsIconsGetToManyRelatedWithHttpInfo(String id, List<String> fieldsBuildIcons, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling buildsIconsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/builds/{id}/icons"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[buildIcons]", fieldsBuildIcons)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BuildIconsWithoutIncludesResponse> localVarReturnType = new GenericType<BuildIconsWithoutIncludesResponse>() {};
    return apiClient.invokeAPI("BuildsApi.buildsIconsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param buildIndividualTestersLinkagesRequest List of related linkages (required)
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
  public void buildsIndividualTestersCreateToManyRelationship(String id, BuildIndividualTestersLinkagesRequest buildIndividualTestersLinkagesRequest) throws ApiException {
    buildsIndividualTestersCreateToManyRelationshipWithHttpInfo(id, buildIndividualTestersLinkagesRequest);
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param buildIndividualTestersLinkagesRequest List of related linkages (required)
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
  public ApiResponse<Void> buildsIndividualTestersCreateToManyRelationshipWithHttpInfo(String id, BuildIndividualTestersLinkagesRequest buildIndividualTestersLinkagesRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling buildsIndividualTestersCreateToManyRelationship");
    }
    if (buildIndividualTestersLinkagesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'buildIndividualTestersLinkagesRequest' when calling buildsIndividualTestersCreateToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/builds/{id}/relationships/individualTesters"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("BuildsApi.buildsIndividualTestersCreateToManyRelationship", localVarPath, "POST", new ArrayList<>(), buildIndividualTestersLinkagesRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param buildIndividualTestersLinkagesRequest List of related linkages (required)
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
  public void buildsIndividualTestersDeleteToManyRelationship(String id, BuildIndividualTestersLinkagesRequest buildIndividualTestersLinkagesRequest) throws ApiException {
    buildsIndividualTestersDeleteToManyRelationshipWithHttpInfo(id, buildIndividualTestersLinkagesRequest);
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param buildIndividualTestersLinkagesRequest List of related linkages (required)
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
  public ApiResponse<Void> buildsIndividualTestersDeleteToManyRelationshipWithHttpInfo(String id, BuildIndividualTestersLinkagesRequest buildIndividualTestersLinkagesRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling buildsIndividualTestersDeleteToManyRelationship");
    }
    if (buildIndividualTestersLinkagesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'buildIndividualTestersLinkagesRequest' when calling buildsIndividualTestersDeleteToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/builds/{id}/relationships/individualTesters"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("BuildsApi.buildsIndividualTestersDeleteToManyRelationship", localVarPath, "DELETE", new ArrayList<>(), buildIndividualTestersLinkagesRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBetaTesters the fields to include for returned resources of type betaTesters (optional)
   * @param limit maximum resources per page (optional)
   * @return BetaTestersWithoutIncludesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of BetaTesters with get </td><td>  -  </td></tr>
     </table>
   */
  public BetaTestersWithoutIncludesResponse buildsIndividualTestersGetToManyRelated(String id, List<String> fieldsBetaTesters, Integer limit) throws ApiException {
    return buildsIndividualTestersGetToManyRelatedWithHttpInfo(id, fieldsBetaTesters, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBetaTesters the fields to include for returned resources of type betaTesters (optional)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;BetaTestersWithoutIncludesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of BetaTesters with get </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BetaTestersWithoutIncludesResponse> buildsIndividualTestersGetToManyRelatedWithHttpInfo(String id, List<String> fieldsBetaTesters, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling buildsIndividualTestersGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/builds/{id}/individualTesters"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[betaTesters]", fieldsBetaTesters)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BetaTestersWithoutIncludesResponse> localVarReturnType = new GenericType<BetaTestersWithoutIncludesResponse>() {};
    return apiClient.invokeAPI("BuildsApi.buildsIndividualTestersGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param limit maximum resources per page (optional)
   * @return BuildIndividualTestersLinkagesResponse
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
  public BuildIndividualTestersLinkagesResponse buildsIndividualTestersGetToManyRelationship(String id, Integer limit) throws ApiException {
    return buildsIndividualTestersGetToManyRelationshipWithHttpInfo(id, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;BuildIndividualTestersLinkagesResponse&gt;
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
  public ApiResponse<BuildIndividualTestersLinkagesResponse> buildsIndividualTestersGetToManyRelationshipWithHttpInfo(String id, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling buildsIndividualTestersGetToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/builds/{id}/relationships/individualTesters"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "limit", limit)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BuildIndividualTestersLinkagesResponse> localVarReturnType = new GenericType<BuildIndividualTestersLinkagesResponse>() {};
    return apiClient.invokeAPI("BuildsApi.buildsIndividualTestersGetToManyRelationship", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterDeviceType filter by attribute &#39;deviceType&#39; (optional)
   * @param filterMetricType filter by attribute &#39;metricType&#39; (optional)
   * @param filterPlatform filter by attribute &#39;platform&#39; (optional)
   * @return XcodeMetrics
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of PerfPowerMetrics </td><td>  -  </td></tr>
     </table>
   */
  public XcodeMetrics buildsPerfPowerMetricsGetToManyRelated(String id, List<String> filterDeviceType, List<String> filterMetricType, List<String> filterPlatform) throws ApiException {
    return buildsPerfPowerMetricsGetToManyRelatedWithHttpInfo(id, filterDeviceType, filterMetricType, filterPlatform).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterDeviceType filter by attribute &#39;deviceType&#39; (optional)
   * @param filterMetricType filter by attribute &#39;metricType&#39; (optional)
   * @param filterPlatform filter by attribute &#39;platform&#39; (optional)
   * @return ApiResponse&lt;XcodeMetrics&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of PerfPowerMetrics </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<XcodeMetrics> buildsPerfPowerMetricsGetToManyRelatedWithHttpInfo(String id, List<String> filterDeviceType, List<String> filterMetricType, List<String> filterPlatform) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling buildsPerfPowerMetricsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/builds/{id}/perfPowerMetrics"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[deviceType]", filterDeviceType)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[metricType]", filterMetricType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[platform]", filterPlatform));

    String localVarAccept = apiClient.selectHeaderAccept("application/json", "application/vnd.apple.xcode-metrics+json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<XcodeMetrics> localVarReturnType = new GenericType<XcodeMetrics>() {};
    return apiClient.invokeAPI("BuildsApi.buildsPerfPowerMetricsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsPreReleaseVersions the fields to include for returned resources of type preReleaseVersions (optional)
   * @return PrereleaseVersionWithoutIncludesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single PrereleaseVersion with get </td><td>  -  </td></tr>
     </table>
   */
  public PrereleaseVersionWithoutIncludesResponse buildsPreReleaseVersionGetToOneRelated(String id, List<String> fieldsPreReleaseVersions) throws ApiException {
    return buildsPreReleaseVersionGetToOneRelatedWithHttpInfo(id, fieldsPreReleaseVersions).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsPreReleaseVersions the fields to include for returned resources of type preReleaseVersions (optional)
   * @return ApiResponse&lt;PrereleaseVersionWithoutIncludesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single PrereleaseVersion with get </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PrereleaseVersionWithoutIncludesResponse> buildsPreReleaseVersionGetToOneRelatedWithHttpInfo(String id, List<String> fieldsPreReleaseVersions) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling buildsPreReleaseVersionGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/builds/{id}/preReleaseVersion"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[preReleaseVersions]", fieldsPreReleaseVersions)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<PrereleaseVersionWithoutIncludesResponse> localVarReturnType = new GenericType<PrereleaseVersionWithoutIncludesResponse>() {};
    return apiClient.invokeAPI("BuildsApi.buildsPreReleaseVersionGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param buildUpdateRequest Build representation (required)
   * @return BuildResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single Build </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public BuildResponse buildsUpdateInstance(String id, BuildUpdateRequest buildUpdateRequest) throws ApiException {
    return buildsUpdateInstanceWithHttpInfo(id, buildUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param buildUpdateRequest Build representation (required)
   * @return ApiResponse&lt;BuildResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single Build </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BuildResponse> buildsUpdateInstanceWithHttpInfo(String id, BuildUpdateRequest buildUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling buildsUpdateInstance");
    }
    if (buildUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'buildUpdateRequest' when calling buildsUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/builds/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BuildResponse> localVarReturnType = new GenericType<BuildResponse>() {};
    return apiClient.invokeAPI("BuildsApi.buildsUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), buildUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
