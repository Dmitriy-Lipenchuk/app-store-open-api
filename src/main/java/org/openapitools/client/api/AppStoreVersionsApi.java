package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.AgeRatingDeclarationWithoutIncludesResponse;
import org.openapitools.client.model.AlternativeDistributionPackageResponse;
import org.openapitools.client.model.AppClipDefaultExperienceResponse;
import org.openapitools.client.model.AppStoreReviewDetailResponse;
import org.openapitools.client.model.AppStoreVersionAppClipDefaultExperienceLinkageRequest;
import org.openapitools.client.model.AppStoreVersionAppClipDefaultExperienceLinkageResponse;
import org.openapitools.client.model.AppStoreVersionBuildLinkageRequest;
import org.openapitools.client.model.AppStoreVersionBuildLinkageResponse;
import org.openapitools.client.model.AppStoreVersionCreateRequest;
import org.openapitools.client.model.AppStoreVersionExperimentsResponse;
import org.openapitools.client.model.AppStoreVersionExperimentsV2Response;
import org.openapitools.client.model.AppStoreVersionLocalizationsResponse;
import org.openapitools.client.model.AppStoreVersionPhasedReleaseWithoutIncludesResponse;
import org.openapitools.client.model.AppStoreVersionResponse;
import org.openapitools.client.model.AppStoreVersionSubmissionResponse;
import org.openapitools.client.model.AppStoreVersionUpdateRequest;
import org.openapitools.client.model.BuildWithoutIncludesResponse;
import org.openapitools.client.model.CustomerReviewsResponse;
import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.RoutingAppCoverageWithoutIncludesResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppStoreVersionsApi {
  private ApiClient apiClient;

  public AppStoreVersionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AppStoreVersionsApi(ApiClient apiClient) {
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
   * @return AgeRatingDeclarationWithoutIncludesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AgeRatingDeclaration with get </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public AgeRatingDeclarationWithoutIncludesResponse appStoreVersionsAgeRatingDeclarationGetToOneRelated(String id, List<String> fieldsAgeRatingDeclarations) throws ApiException {
    return appStoreVersionsAgeRatingDeclarationGetToOneRelatedWithHttpInfo(id, fieldsAgeRatingDeclarations).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAgeRatingDeclarations the fields to include for returned resources of type ageRatingDeclarations (optional)
   * @return ApiResponse&lt;AgeRatingDeclarationWithoutIncludesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AgeRatingDeclaration with get </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public ApiResponse<AgeRatingDeclarationWithoutIncludesResponse> appStoreVersionsAgeRatingDeclarationGetToOneRelatedWithHttpInfo(String id, List<String> fieldsAgeRatingDeclarations) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appStoreVersionsAgeRatingDeclarationGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/appStoreVersions/{id}/ageRatingDeclaration"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[ageRatingDeclarations]", fieldsAgeRatingDeclarations)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AgeRatingDeclarationWithoutIncludesResponse> localVarReturnType = new GenericType<AgeRatingDeclarationWithoutIncludesResponse>() {};
    return apiClient.invokeAPI("AppStoreVersionsApi.appStoreVersionsAgeRatingDeclarationGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAlternativeDistributionPackages the fields to include for returned resources of type alternativeDistributionPackages (optional)
   * @param fieldsAlternativeDistributionPackageVersions the fields to include for returned resources of type alternativeDistributionPackageVersions (optional)
   * @param limitVersions maximum number of related versions returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AlternativeDistributionPackageResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AlternativeDistributionPackage </td><td>  -  </td></tr>
     </table>
   */
  public AlternativeDistributionPackageResponse appStoreVersionsAlternativeDistributionPackageGetToOneRelated(String id, List<String> fieldsAlternativeDistributionPackages, List<String> fieldsAlternativeDistributionPackageVersions, Integer limitVersions, List<String> include) throws ApiException {
    return appStoreVersionsAlternativeDistributionPackageGetToOneRelatedWithHttpInfo(id, fieldsAlternativeDistributionPackages, fieldsAlternativeDistributionPackageVersions, limitVersions, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAlternativeDistributionPackages the fields to include for returned resources of type alternativeDistributionPackages (optional)
   * @param fieldsAlternativeDistributionPackageVersions the fields to include for returned resources of type alternativeDistributionPackageVersions (optional)
   * @param limitVersions maximum number of related versions returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AlternativeDistributionPackageResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AlternativeDistributionPackage </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AlternativeDistributionPackageResponse> appStoreVersionsAlternativeDistributionPackageGetToOneRelatedWithHttpInfo(String id, List<String> fieldsAlternativeDistributionPackages, List<String> fieldsAlternativeDistributionPackageVersions, Integer limitVersions, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appStoreVersionsAlternativeDistributionPackageGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/appStoreVersions/{id}/alternativeDistributionPackage"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[alternativeDistributionPackages]", fieldsAlternativeDistributionPackages)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[alternativeDistributionPackageVersions]", fieldsAlternativeDistributionPackageVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[versions]", limitVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AlternativeDistributionPackageResponse> localVarReturnType = new GenericType<AlternativeDistributionPackageResponse>() {};
    return apiClient.invokeAPI("AppStoreVersionsApi.appStoreVersionsAlternativeDistributionPackageGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppClips the fields to include for returned resources of type appClips (optional)
   * @param fieldsAppClipAppStoreReviewDetails the fields to include for returned resources of type appClipAppStoreReviewDetails (optional)
   * @param fieldsAppStoreVersions the fields to include for returned resources of type appStoreVersions (optional)
   * @param fieldsAppClipDefaultExperiences the fields to include for returned resources of type appClipDefaultExperiences (optional)
   * @param fieldsAppClipDefaultExperienceLocalizations the fields to include for returned resources of type appClipDefaultExperienceLocalizations (optional)
   * @param limitAppClipDefaultExperienceLocalizations maximum number of related appClipDefaultExperienceLocalizations returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AppClipDefaultExperienceResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppClipDefaultExperience </td><td>  -  </td></tr>
     </table>
   */
  public AppClipDefaultExperienceResponse appStoreVersionsAppClipDefaultExperienceGetToOneRelated(String id, List<String> fieldsAppClips, List<String> fieldsAppClipAppStoreReviewDetails, List<String> fieldsAppStoreVersions, List<String> fieldsAppClipDefaultExperiences, List<String> fieldsAppClipDefaultExperienceLocalizations, Integer limitAppClipDefaultExperienceLocalizations, List<String> include) throws ApiException {
    return appStoreVersionsAppClipDefaultExperienceGetToOneRelatedWithHttpInfo(id, fieldsAppClips, fieldsAppClipAppStoreReviewDetails, fieldsAppStoreVersions, fieldsAppClipDefaultExperiences, fieldsAppClipDefaultExperienceLocalizations, limitAppClipDefaultExperienceLocalizations, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppClips the fields to include for returned resources of type appClips (optional)
   * @param fieldsAppClipAppStoreReviewDetails the fields to include for returned resources of type appClipAppStoreReviewDetails (optional)
   * @param fieldsAppStoreVersions the fields to include for returned resources of type appStoreVersions (optional)
   * @param fieldsAppClipDefaultExperiences the fields to include for returned resources of type appClipDefaultExperiences (optional)
   * @param fieldsAppClipDefaultExperienceLocalizations the fields to include for returned resources of type appClipDefaultExperienceLocalizations (optional)
   * @param limitAppClipDefaultExperienceLocalizations maximum number of related appClipDefaultExperienceLocalizations returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AppClipDefaultExperienceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppClipDefaultExperience </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppClipDefaultExperienceResponse> appStoreVersionsAppClipDefaultExperienceGetToOneRelatedWithHttpInfo(String id, List<String> fieldsAppClips, List<String> fieldsAppClipAppStoreReviewDetails, List<String> fieldsAppStoreVersions, List<String> fieldsAppClipDefaultExperiences, List<String> fieldsAppClipDefaultExperienceLocalizations, Integer limitAppClipDefaultExperienceLocalizations, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appStoreVersionsAppClipDefaultExperienceGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/appStoreVersions/{id}/appClipDefaultExperience"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appClips]", fieldsAppClips)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appClipAppStoreReviewDetails]", fieldsAppClipAppStoreReviewDetails));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersions]", fieldsAppStoreVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appClipDefaultExperiences]", fieldsAppClipDefaultExperiences));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appClipDefaultExperienceLocalizations]", fieldsAppClipDefaultExperienceLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appClipDefaultExperienceLocalizations]", limitAppClipDefaultExperienceLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppClipDefaultExperienceResponse> localVarReturnType = new GenericType<AppClipDefaultExperienceResponse>() {};
    return apiClient.invokeAPI("AppStoreVersionsApi.appStoreVersionsAppClipDefaultExperienceGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @return AppStoreVersionAppClipDefaultExperienceLinkageResponse
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
  public AppStoreVersionAppClipDefaultExperienceLinkageResponse appStoreVersionsAppClipDefaultExperienceGetToOneRelationship(String id) throws ApiException {
    return appStoreVersionsAppClipDefaultExperienceGetToOneRelationshipWithHttpInfo(id).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @return ApiResponse&lt;AppStoreVersionAppClipDefaultExperienceLinkageResponse&gt;
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
  public ApiResponse<AppStoreVersionAppClipDefaultExperienceLinkageResponse> appStoreVersionsAppClipDefaultExperienceGetToOneRelationshipWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appStoreVersionsAppClipDefaultExperienceGetToOneRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/appStoreVersions/{id}/relationships/appClipDefaultExperience"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppStoreVersionAppClipDefaultExperienceLinkageResponse> localVarReturnType = new GenericType<AppStoreVersionAppClipDefaultExperienceLinkageResponse>() {};
    return apiClient.invokeAPI("AppStoreVersionsApi.appStoreVersionsAppClipDefaultExperienceGetToOneRelationship", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appStoreVersionAppClipDefaultExperienceLinkageRequest Related linkage (required)
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
  public void appStoreVersionsAppClipDefaultExperienceUpdateToOneRelationship(String id, AppStoreVersionAppClipDefaultExperienceLinkageRequest appStoreVersionAppClipDefaultExperienceLinkageRequest) throws ApiException {
    appStoreVersionsAppClipDefaultExperienceUpdateToOneRelationshipWithHttpInfo(id, appStoreVersionAppClipDefaultExperienceLinkageRequest);
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appStoreVersionAppClipDefaultExperienceLinkageRequest Related linkage (required)
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
  public ApiResponse<Void> appStoreVersionsAppClipDefaultExperienceUpdateToOneRelationshipWithHttpInfo(String id, AppStoreVersionAppClipDefaultExperienceLinkageRequest appStoreVersionAppClipDefaultExperienceLinkageRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appStoreVersionsAppClipDefaultExperienceUpdateToOneRelationship");
    }
    if (appStoreVersionAppClipDefaultExperienceLinkageRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appStoreVersionAppClipDefaultExperienceLinkageRequest' when calling appStoreVersionsAppClipDefaultExperienceUpdateToOneRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/appStoreVersions/{id}/relationships/appClipDefaultExperience"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("AppStoreVersionsApi.appStoreVersionsAppClipDefaultExperienceUpdateToOneRelationship", localVarPath, "PATCH", new ArrayList<>(), appStoreVersionAppClipDefaultExperienceLinkageRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppStoreReviewDetails the fields to include for returned resources of type appStoreReviewDetails (optional)
   * @param fieldsAppStoreVersions the fields to include for returned resources of type appStoreVersions (optional)
   * @param fieldsAppStoreReviewAttachments the fields to include for returned resources of type appStoreReviewAttachments (optional)
   * @param limitAppStoreReviewAttachments maximum number of related appStoreReviewAttachments returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AppStoreReviewDetailResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppStoreReviewDetail </td><td>  -  </td></tr>
     </table>
   */
  public AppStoreReviewDetailResponse appStoreVersionsAppStoreReviewDetailGetToOneRelated(String id, List<String> fieldsAppStoreReviewDetails, List<String> fieldsAppStoreVersions, List<String> fieldsAppStoreReviewAttachments, Integer limitAppStoreReviewAttachments, List<String> include) throws ApiException {
    return appStoreVersionsAppStoreReviewDetailGetToOneRelatedWithHttpInfo(id, fieldsAppStoreReviewDetails, fieldsAppStoreVersions, fieldsAppStoreReviewAttachments, limitAppStoreReviewAttachments, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppStoreReviewDetails the fields to include for returned resources of type appStoreReviewDetails (optional)
   * @param fieldsAppStoreVersions the fields to include for returned resources of type appStoreVersions (optional)
   * @param fieldsAppStoreReviewAttachments the fields to include for returned resources of type appStoreReviewAttachments (optional)
   * @param limitAppStoreReviewAttachments maximum number of related appStoreReviewAttachments returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AppStoreReviewDetailResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppStoreReviewDetail </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppStoreReviewDetailResponse> appStoreVersionsAppStoreReviewDetailGetToOneRelatedWithHttpInfo(String id, List<String> fieldsAppStoreReviewDetails, List<String> fieldsAppStoreVersions, List<String> fieldsAppStoreReviewAttachments, Integer limitAppStoreReviewAttachments, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appStoreVersionsAppStoreReviewDetailGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/appStoreVersions/{id}/appStoreReviewDetail"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appStoreReviewDetails]", fieldsAppStoreReviewDetails)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersions]", fieldsAppStoreVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreReviewAttachments]", fieldsAppStoreReviewAttachments));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appStoreReviewAttachments]", limitAppStoreReviewAttachments));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppStoreReviewDetailResponse> localVarReturnType = new GenericType<AppStoreReviewDetailResponse>() {};
    return apiClient.invokeAPI("AppStoreVersionsApi.appStoreVersionsAppStoreReviewDetailGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterState filter by attribute &#39;state&#39; (optional)
   * @param fieldsAppStoreVersionExperiments the fields to include for returned resources of type appStoreVersionExperiments (optional)
   * @param fieldsAppStoreVersionExperimentTreatments the fields to include for returned resources of type appStoreVersionExperimentTreatments (optional)
   * @param fieldsAppStoreVersions the fields to include for returned resources of type appStoreVersions (optional)
   * @param limit maximum resources per page (optional)
   * @param limitAppStoreVersionExperimentTreatments maximum number of related appStoreVersionExperimentTreatments returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AppStoreVersionExperimentsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppStoreVersionExperiments </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public AppStoreVersionExperimentsResponse appStoreVersionsAppStoreVersionExperimentsGetToManyRelated(String id, List<String> filterState, List<String> fieldsAppStoreVersionExperiments, List<String> fieldsAppStoreVersionExperimentTreatments, List<String> fieldsAppStoreVersions, Integer limit, Integer limitAppStoreVersionExperimentTreatments, List<String> include) throws ApiException {
    return appStoreVersionsAppStoreVersionExperimentsGetToManyRelatedWithHttpInfo(id, filterState, fieldsAppStoreVersionExperiments, fieldsAppStoreVersionExperimentTreatments, fieldsAppStoreVersions, limit, limitAppStoreVersionExperimentTreatments, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterState filter by attribute &#39;state&#39; (optional)
   * @param fieldsAppStoreVersionExperiments the fields to include for returned resources of type appStoreVersionExperiments (optional)
   * @param fieldsAppStoreVersionExperimentTreatments the fields to include for returned resources of type appStoreVersionExperimentTreatments (optional)
   * @param fieldsAppStoreVersions the fields to include for returned resources of type appStoreVersions (optional)
   * @param limit maximum resources per page (optional)
   * @param limitAppStoreVersionExperimentTreatments maximum number of related appStoreVersionExperimentTreatments returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AppStoreVersionExperimentsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppStoreVersionExperiments </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public ApiResponse<AppStoreVersionExperimentsResponse> appStoreVersionsAppStoreVersionExperimentsGetToManyRelatedWithHttpInfo(String id, List<String> filterState, List<String> fieldsAppStoreVersionExperiments, List<String> fieldsAppStoreVersionExperimentTreatments, List<String> fieldsAppStoreVersions, Integer limit, Integer limitAppStoreVersionExperimentTreatments, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appStoreVersionsAppStoreVersionExperimentsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/appStoreVersions/{id}/appStoreVersionExperiments"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[state]", filterState)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersionExperiments]", fieldsAppStoreVersionExperiments));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersionExperimentTreatments]", fieldsAppStoreVersionExperimentTreatments));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersions]", fieldsAppStoreVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appStoreVersionExperimentTreatments]", limitAppStoreVersionExperimentTreatments));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppStoreVersionExperimentsResponse> localVarReturnType = new GenericType<AppStoreVersionExperimentsResponse>() {};
    return apiClient.invokeAPI("AppStoreVersionsApi.appStoreVersionsAppStoreVersionExperimentsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterState filter by attribute &#39;state&#39; (optional)
   * @param fieldsAppStoreVersionExperiments the fields to include for returned resources of type appStoreVersionExperiments (optional)
   * @param fieldsAppStoreVersionExperimentTreatments the fields to include for returned resources of type appStoreVersionExperimentTreatments (optional)
   * @param fieldsAppStoreVersions the fields to include for returned resources of type appStoreVersions (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param limit maximum resources per page (optional)
   * @param limitControlVersions maximum number of related controlVersions returned (when they are included) (optional)
   * @param limitAppStoreVersionExperimentTreatments maximum number of related appStoreVersionExperimentTreatments returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AppStoreVersionExperimentsV2Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppStoreVersionExperiments </td><td>  -  </td></tr>
     </table>
   */
  public AppStoreVersionExperimentsV2Response appStoreVersionsAppStoreVersionExperimentsV2GetToManyRelated(String id, List<String> filterState, List<String> fieldsAppStoreVersionExperiments, List<String> fieldsAppStoreVersionExperimentTreatments, List<String> fieldsAppStoreVersions, List<String> fieldsApps, Integer limit, Integer limitControlVersions, Integer limitAppStoreVersionExperimentTreatments, List<String> include) throws ApiException {
    return appStoreVersionsAppStoreVersionExperimentsV2GetToManyRelatedWithHttpInfo(id, filterState, fieldsAppStoreVersionExperiments, fieldsAppStoreVersionExperimentTreatments, fieldsAppStoreVersions, fieldsApps, limit, limitControlVersions, limitAppStoreVersionExperimentTreatments, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterState filter by attribute &#39;state&#39; (optional)
   * @param fieldsAppStoreVersionExperiments the fields to include for returned resources of type appStoreVersionExperiments (optional)
   * @param fieldsAppStoreVersionExperimentTreatments the fields to include for returned resources of type appStoreVersionExperimentTreatments (optional)
   * @param fieldsAppStoreVersions the fields to include for returned resources of type appStoreVersions (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param limit maximum resources per page (optional)
   * @param limitControlVersions maximum number of related controlVersions returned (when they are included) (optional)
   * @param limitAppStoreVersionExperimentTreatments maximum number of related appStoreVersionExperimentTreatments returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AppStoreVersionExperimentsV2Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppStoreVersionExperiments </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppStoreVersionExperimentsV2Response> appStoreVersionsAppStoreVersionExperimentsV2GetToManyRelatedWithHttpInfo(String id, List<String> filterState, List<String> fieldsAppStoreVersionExperiments, List<String> fieldsAppStoreVersionExperimentTreatments, List<String> fieldsAppStoreVersions, List<String> fieldsApps, Integer limit, Integer limitControlVersions, Integer limitAppStoreVersionExperimentTreatments, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appStoreVersionsAppStoreVersionExperimentsV2GetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/appStoreVersions/{id}/appStoreVersionExperimentsV2"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[state]", filterState)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersionExperiments]", fieldsAppStoreVersionExperiments));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersionExperimentTreatments]", fieldsAppStoreVersionExperimentTreatments));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersions]", fieldsAppStoreVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[apps]", fieldsApps));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[controlVersions]", limitControlVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appStoreVersionExperimentTreatments]", limitAppStoreVersionExperimentTreatments));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppStoreVersionExperimentsV2Response> localVarReturnType = new GenericType<AppStoreVersionExperimentsV2Response>() {};
    return apiClient.invokeAPI("AppStoreVersionsApi.appStoreVersionsAppStoreVersionExperimentsV2GetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterLocale filter by attribute &#39;locale&#39; (optional)
   * @param fieldsAppScreenshotSets the fields to include for returned resources of type appScreenshotSets (optional)
   * @param fieldsAppStoreVersions the fields to include for returned resources of type appStoreVersions (optional)
   * @param fieldsAppPreviewSets the fields to include for returned resources of type appPreviewSets (optional)
   * @param fieldsAppStoreVersionLocalizations the fields to include for returned resources of type appStoreVersionLocalizations (optional)
   * @param limit maximum resources per page (optional)
   * @param limitAppScreenshotSets maximum number of related appScreenshotSets returned (when they are included) (optional)
   * @param limitAppPreviewSets maximum number of related appPreviewSets returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AppStoreVersionLocalizationsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppStoreVersionLocalizations </td><td>  -  </td></tr>
     </table>
   */
  public AppStoreVersionLocalizationsResponse appStoreVersionsAppStoreVersionLocalizationsGetToManyRelated(String id, List<String> filterLocale, List<String> fieldsAppScreenshotSets, List<String> fieldsAppStoreVersions, List<String> fieldsAppPreviewSets, List<String> fieldsAppStoreVersionLocalizations, Integer limit, Integer limitAppScreenshotSets, Integer limitAppPreviewSets, List<String> include) throws ApiException {
    return appStoreVersionsAppStoreVersionLocalizationsGetToManyRelatedWithHttpInfo(id, filterLocale, fieldsAppScreenshotSets, fieldsAppStoreVersions, fieldsAppPreviewSets, fieldsAppStoreVersionLocalizations, limit, limitAppScreenshotSets, limitAppPreviewSets, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterLocale filter by attribute &#39;locale&#39; (optional)
   * @param fieldsAppScreenshotSets the fields to include for returned resources of type appScreenshotSets (optional)
   * @param fieldsAppStoreVersions the fields to include for returned resources of type appStoreVersions (optional)
   * @param fieldsAppPreviewSets the fields to include for returned resources of type appPreviewSets (optional)
   * @param fieldsAppStoreVersionLocalizations the fields to include for returned resources of type appStoreVersionLocalizations (optional)
   * @param limit maximum resources per page (optional)
   * @param limitAppScreenshotSets maximum number of related appScreenshotSets returned (when they are included) (optional)
   * @param limitAppPreviewSets maximum number of related appPreviewSets returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AppStoreVersionLocalizationsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppStoreVersionLocalizations </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppStoreVersionLocalizationsResponse> appStoreVersionsAppStoreVersionLocalizationsGetToManyRelatedWithHttpInfo(String id, List<String> filterLocale, List<String> fieldsAppScreenshotSets, List<String> fieldsAppStoreVersions, List<String> fieldsAppPreviewSets, List<String> fieldsAppStoreVersionLocalizations, Integer limit, Integer limitAppScreenshotSets, Integer limitAppPreviewSets, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appStoreVersionsAppStoreVersionLocalizationsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/appStoreVersions/{id}/appStoreVersionLocalizations"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[locale]", filterLocale)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appScreenshotSets]", fieldsAppScreenshotSets));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersions]", fieldsAppStoreVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appPreviewSets]", fieldsAppPreviewSets));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersionLocalizations]", fieldsAppStoreVersionLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appScreenshotSets]", limitAppScreenshotSets));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appPreviewSets]", limitAppPreviewSets));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppStoreVersionLocalizationsResponse> localVarReturnType = new GenericType<AppStoreVersionLocalizationsResponse>() {};
    return apiClient.invokeAPI("AppStoreVersionsApi.appStoreVersionsAppStoreVersionLocalizationsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppStoreVersionPhasedReleases the fields to include for returned resources of type appStoreVersionPhasedReleases (optional)
   * @return AppStoreVersionPhasedReleaseWithoutIncludesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppStoreVersionPhasedRelease with get </td><td>  -  </td></tr>
     </table>
   */
  public AppStoreVersionPhasedReleaseWithoutIncludesResponse appStoreVersionsAppStoreVersionPhasedReleaseGetToOneRelated(String id, List<String> fieldsAppStoreVersionPhasedReleases) throws ApiException {
    return appStoreVersionsAppStoreVersionPhasedReleaseGetToOneRelatedWithHttpInfo(id, fieldsAppStoreVersionPhasedReleases).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppStoreVersionPhasedReleases the fields to include for returned resources of type appStoreVersionPhasedReleases (optional)
   * @return ApiResponse&lt;AppStoreVersionPhasedReleaseWithoutIncludesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppStoreVersionPhasedRelease with get </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppStoreVersionPhasedReleaseWithoutIncludesResponse> appStoreVersionsAppStoreVersionPhasedReleaseGetToOneRelatedWithHttpInfo(String id, List<String> fieldsAppStoreVersionPhasedReleases) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appStoreVersionsAppStoreVersionPhasedReleaseGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/appStoreVersions/{id}/appStoreVersionPhasedRelease"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appStoreVersionPhasedReleases]", fieldsAppStoreVersionPhasedReleases)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppStoreVersionPhasedReleaseWithoutIncludesResponse> localVarReturnType = new GenericType<AppStoreVersionPhasedReleaseWithoutIncludesResponse>() {};
    return apiClient.invokeAPI("AppStoreVersionsApi.appStoreVersionsAppStoreVersionPhasedReleaseGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppStoreVersionSubmissions the fields to include for returned resources of type appStoreVersionSubmissions (optional)
   * @param fieldsAppStoreVersions the fields to include for returned resources of type appStoreVersions (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AppStoreVersionSubmissionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppStoreVersionSubmission </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public AppStoreVersionSubmissionResponse appStoreVersionsAppStoreVersionSubmissionGetToOneRelated(String id, List<String> fieldsAppStoreVersionSubmissions, List<String> fieldsAppStoreVersions, List<String> include) throws ApiException {
    return appStoreVersionsAppStoreVersionSubmissionGetToOneRelatedWithHttpInfo(id, fieldsAppStoreVersionSubmissions, fieldsAppStoreVersions, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppStoreVersionSubmissions the fields to include for returned resources of type appStoreVersionSubmissions (optional)
   * @param fieldsAppStoreVersions the fields to include for returned resources of type appStoreVersions (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AppStoreVersionSubmissionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppStoreVersionSubmission </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public ApiResponse<AppStoreVersionSubmissionResponse> appStoreVersionsAppStoreVersionSubmissionGetToOneRelatedWithHttpInfo(String id, List<String> fieldsAppStoreVersionSubmissions, List<String> fieldsAppStoreVersions, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appStoreVersionsAppStoreVersionSubmissionGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/appStoreVersions/{id}/appStoreVersionSubmission"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appStoreVersionSubmissions]", fieldsAppStoreVersionSubmissions)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersions]", fieldsAppStoreVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppStoreVersionSubmissionResponse> localVarReturnType = new GenericType<AppStoreVersionSubmissionResponse>() {};
    return apiClient.invokeAPI("AppStoreVersionsApi.appStoreVersionsAppStoreVersionSubmissionGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @return BuildWithoutIncludesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single Build with get </td><td>  -  </td></tr>
     </table>
   */
  public BuildWithoutIncludesResponse appStoreVersionsBuildGetToOneRelated(String id, List<String> fieldsBuilds) throws ApiException {
    return appStoreVersionsBuildGetToOneRelatedWithHttpInfo(id, fieldsBuilds).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @return ApiResponse&lt;BuildWithoutIncludesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single Build with get </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BuildWithoutIncludesResponse> appStoreVersionsBuildGetToOneRelatedWithHttpInfo(String id, List<String> fieldsBuilds) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appStoreVersionsBuildGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/appStoreVersions/{id}/build"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[builds]", fieldsBuilds)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BuildWithoutIncludesResponse> localVarReturnType = new GenericType<BuildWithoutIncludesResponse>() {};
    return apiClient.invokeAPI("AppStoreVersionsApi.appStoreVersionsBuildGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @return AppStoreVersionBuildLinkageResponse
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
  public AppStoreVersionBuildLinkageResponse appStoreVersionsBuildGetToOneRelationship(String id) throws ApiException {
    return appStoreVersionsBuildGetToOneRelationshipWithHttpInfo(id).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @return ApiResponse&lt;AppStoreVersionBuildLinkageResponse&gt;
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
  public ApiResponse<AppStoreVersionBuildLinkageResponse> appStoreVersionsBuildGetToOneRelationshipWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appStoreVersionsBuildGetToOneRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/appStoreVersions/{id}/relationships/build"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppStoreVersionBuildLinkageResponse> localVarReturnType = new GenericType<AppStoreVersionBuildLinkageResponse>() {};
    return apiClient.invokeAPI("AppStoreVersionsApi.appStoreVersionsBuildGetToOneRelationship", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appStoreVersionBuildLinkageRequest Related linkage (required)
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
  public void appStoreVersionsBuildUpdateToOneRelationship(String id, AppStoreVersionBuildLinkageRequest appStoreVersionBuildLinkageRequest) throws ApiException {
    appStoreVersionsBuildUpdateToOneRelationshipWithHttpInfo(id, appStoreVersionBuildLinkageRequest);
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appStoreVersionBuildLinkageRequest Related linkage (required)
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
  public ApiResponse<Void> appStoreVersionsBuildUpdateToOneRelationshipWithHttpInfo(String id, AppStoreVersionBuildLinkageRequest appStoreVersionBuildLinkageRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appStoreVersionsBuildUpdateToOneRelationship");
    }
    if (appStoreVersionBuildLinkageRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appStoreVersionBuildLinkageRequest' when calling appStoreVersionsBuildUpdateToOneRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/appStoreVersions/{id}/relationships/build"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("AppStoreVersionsApi.appStoreVersionsBuildUpdateToOneRelationship", localVarPath, "PATCH", new ArrayList<>(), appStoreVersionBuildLinkageRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param appStoreVersionCreateRequest AppStoreVersion representation (required)
   * @return AppStoreVersionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AppStoreVersion </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public AppStoreVersionResponse appStoreVersionsCreateInstance(AppStoreVersionCreateRequest appStoreVersionCreateRequest) throws ApiException {
    return appStoreVersionsCreateInstanceWithHttpInfo(appStoreVersionCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param appStoreVersionCreateRequest AppStoreVersion representation (required)
   * @return ApiResponse&lt;AppStoreVersionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AppStoreVersion </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppStoreVersionResponse> appStoreVersionsCreateInstanceWithHttpInfo(AppStoreVersionCreateRequest appStoreVersionCreateRequest) throws ApiException {
    // Check required parameters
    if (appStoreVersionCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appStoreVersionCreateRequest' when calling appStoreVersionsCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppStoreVersionResponse> localVarReturnType = new GenericType<AppStoreVersionResponse>() {};
    return apiClient.invokeAPI("AppStoreVersionsApi.appStoreVersionsCreateInstance", "/v1/appStoreVersions", "POST", new ArrayList<>(), appStoreVersionCreateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterRating filter by attribute &#39;rating&#39; (optional)
   * @param filterTerritory filter by attribute &#39;territory&#39; (optional)
   * @param existsPublishedResponse filter by publishedResponse (optional)
   * @param sort comma-separated list of sort expressions; resources will be sorted as specified (optional)
   * @param fieldsCustomerReviews the fields to include for returned resources of type customerReviews (optional)
   * @param fieldsCustomerReviewResponses the fields to include for returned resources of type customerReviewResponses (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return CustomerReviewsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of CustomerReviews </td><td>  -  </td></tr>
     </table>
   */
  public CustomerReviewsResponse appStoreVersionsCustomerReviewsGetToManyRelated(String id, List<String> filterRating, List<String> filterTerritory, Boolean existsPublishedResponse, List<String> sort, List<String> fieldsCustomerReviews, List<String> fieldsCustomerReviewResponses, Integer limit, List<String> include) throws ApiException {
    return appStoreVersionsCustomerReviewsGetToManyRelatedWithHttpInfo(id, filterRating, filterTerritory, existsPublishedResponse, sort, fieldsCustomerReviews, fieldsCustomerReviewResponses, limit, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterRating filter by attribute &#39;rating&#39; (optional)
   * @param filterTerritory filter by attribute &#39;territory&#39; (optional)
   * @param existsPublishedResponse filter by publishedResponse (optional)
   * @param sort comma-separated list of sort expressions; resources will be sorted as specified (optional)
   * @param fieldsCustomerReviews the fields to include for returned resources of type customerReviews (optional)
   * @param fieldsCustomerReviewResponses the fields to include for returned resources of type customerReviewResponses (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;CustomerReviewsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of CustomerReviews </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CustomerReviewsResponse> appStoreVersionsCustomerReviewsGetToManyRelatedWithHttpInfo(String id, List<String> filterRating, List<String> filterTerritory, Boolean existsPublishedResponse, List<String> sort, List<String> fieldsCustomerReviews, List<String> fieldsCustomerReviewResponses, Integer limit, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appStoreVersionsCustomerReviewsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/appStoreVersions/{id}/customerReviews"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[rating]", filterRating)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[territory]", filterTerritory));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "exists[publishedResponse]", existsPublishedResponse));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[customerReviews]", fieldsCustomerReviews));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[customerReviewResponses]", fieldsCustomerReviewResponses));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<CustomerReviewsResponse> localVarReturnType = new GenericType<CustomerReviewsResponse>() {};
    return apiClient.invokeAPI("AppStoreVersionsApi.appStoreVersionsCustomerReviewsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
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
  public void appStoreVersionsDeleteInstance(String id) throws ApiException {
    appStoreVersionsDeleteInstanceWithHttpInfo(id);
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
  public ApiResponse<Void> appStoreVersionsDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appStoreVersionsDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appStoreVersions/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("AppStoreVersionsApi.appStoreVersionsDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppStoreVersions the fields to include for returned resources of type appStoreVersions (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsAppStoreVersionExperiments the fields to include for returned resources of type appStoreVersionExperiments (optional)
   * @param fieldsAppStoreVersionSubmissions the fields to include for returned resources of type appStoreVersionSubmissions (optional)
   * @param fieldsAgeRatingDeclarations the fields to include for returned resources of type ageRatingDeclarations (optional)
   * @param fieldsAlternativeDistributionPackages the fields to include for returned resources of type alternativeDistributionPackages (optional)
   * @param fieldsCustomerReviews the fields to include for returned resources of type customerReviews (optional)
   * @param fieldsAppStoreReviewDetails the fields to include for returned resources of type appStoreReviewDetails (optional)
   * @param fieldsAppClipDefaultExperiences the fields to include for returned resources of type appClipDefaultExperiences (optional)
   * @param fieldsRoutingAppCoverages the fields to include for returned resources of type routingAppCoverages (optional)
   * @param fieldsAppStoreVersionPhasedReleases the fields to include for returned resources of type appStoreVersionPhasedReleases (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @param fieldsAppStoreVersionLocalizations the fields to include for returned resources of type appStoreVersionLocalizations (optional)
   * @param limitAppStoreVersionExperiments maximum number of related appStoreVersionExperiments returned (when they are included) (optional)
   * @param limitAppStoreVersionExperimentsV2 maximum number of related appStoreVersionExperimentsV2 returned (when they are included) (optional)
   * @param limitAppStoreVersionLocalizations maximum number of related appStoreVersionLocalizations returned (when they are included) (optional)
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
  public AppStoreVersionResponse appStoreVersionsGetInstance(String id, List<String> fieldsAppStoreVersions, List<String> include, List<String> fieldsAppStoreVersionExperiments, List<String> fieldsAppStoreVersionSubmissions, List<String> fieldsAgeRatingDeclarations, List<String> fieldsAlternativeDistributionPackages, List<String> fieldsCustomerReviews, List<String> fieldsAppStoreReviewDetails, List<String> fieldsAppClipDefaultExperiences, List<String> fieldsRoutingAppCoverages, List<String> fieldsAppStoreVersionPhasedReleases, List<String> fieldsBuilds, List<String> fieldsAppStoreVersionLocalizations, Integer limitAppStoreVersionExperiments, Integer limitAppStoreVersionExperimentsV2, Integer limitAppStoreVersionLocalizations) throws ApiException {
    return appStoreVersionsGetInstanceWithHttpInfo(id, fieldsAppStoreVersions, include, fieldsAppStoreVersionExperiments, fieldsAppStoreVersionSubmissions, fieldsAgeRatingDeclarations, fieldsAlternativeDistributionPackages, fieldsCustomerReviews, fieldsAppStoreReviewDetails, fieldsAppClipDefaultExperiences, fieldsRoutingAppCoverages, fieldsAppStoreVersionPhasedReleases, fieldsBuilds, fieldsAppStoreVersionLocalizations, limitAppStoreVersionExperiments, limitAppStoreVersionExperimentsV2, limitAppStoreVersionLocalizations).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppStoreVersions the fields to include for returned resources of type appStoreVersions (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsAppStoreVersionExperiments the fields to include for returned resources of type appStoreVersionExperiments (optional)
   * @param fieldsAppStoreVersionSubmissions the fields to include for returned resources of type appStoreVersionSubmissions (optional)
   * @param fieldsAgeRatingDeclarations the fields to include for returned resources of type ageRatingDeclarations (optional)
   * @param fieldsAlternativeDistributionPackages the fields to include for returned resources of type alternativeDistributionPackages (optional)
   * @param fieldsCustomerReviews the fields to include for returned resources of type customerReviews (optional)
   * @param fieldsAppStoreReviewDetails the fields to include for returned resources of type appStoreReviewDetails (optional)
   * @param fieldsAppClipDefaultExperiences the fields to include for returned resources of type appClipDefaultExperiences (optional)
   * @param fieldsRoutingAppCoverages the fields to include for returned resources of type routingAppCoverages (optional)
   * @param fieldsAppStoreVersionPhasedReleases the fields to include for returned resources of type appStoreVersionPhasedReleases (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @param fieldsAppStoreVersionLocalizations the fields to include for returned resources of type appStoreVersionLocalizations (optional)
   * @param limitAppStoreVersionExperiments maximum number of related appStoreVersionExperiments returned (when they are included) (optional)
   * @param limitAppStoreVersionExperimentsV2 maximum number of related appStoreVersionExperimentsV2 returned (when they are included) (optional)
   * @param limitAppStoreVersionLocalizations maximum number of related appStoreVersionLocalizations returned (when they are included) (optional)
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
  public ApiResponse<AppStoreVersionResponse> appStoreVersionsGetInstanceWithHttpInfo(String id, List<String> fieldsAppStoreVersions, List<String> include, List<String> fieldsAppStoreVersionExperiments, List<String> fieldsAppStoreVersionSubmissions, List<String> fieldsAgeRatingDeclarations, List<String> fieldsAlternativeDistributionPackages, List<String> fieldsCustomerReviews, List<String> fieldsAppStoreReviewDetails, List<String> fieldsAppClipDefaultExperiences, List<String> fieldsRoutingAppCoverages, List<String> fieldsAppStoreVersionPhasedReleases, List<String> fieldsBuilds, List<String> fieldsAppStoreVersionLocalizations, Integer limitAppStoreVersionExperiments, Integer limitAppStoreVersionExperimentsV2, Integer limitAppStoreVersionLocalizations) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appStoreVersionsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appStoreVersions/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appStoreVersions]", fieldsAppStoreVersions)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersionExperiments]", fieldsAppStoreVersionExperiments));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersionSubmissions]", fieldsAppStoreVersionSubmissions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[ageRatingDeclarations]", fieldsAgeRatingDeclarations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[alternativeDistributionPackages]", fieldsAlternativeDistributionPackages));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[customerReviews]", fieldsCustomerReviews));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreReviewDetails]", fieldsAppStoreReviewDetails));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appClipDefaultExperiences]", fieldsAppClipDefaultExperiences));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[routingAppCoverages]", fieldsRoutingAppCoverages));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersionPhasedReleases]", fieldsAppStoreVersionPhasedReleases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[builds]", fieldsBuilds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersionLocalizations]", fieldsAppStoreVersionLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appStoreVersionExperiments]", limitAppStoreVersionExperiments));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appStoreVersionExperimentsV2]", limitAppStoreVersionExperimentsV2));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appStoreVersionLocalizations]", limitAppStoreVersionLocalizations));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppStoreVersionResponse> localVarReturnType = new GenericType<AppStoreVersionResponse>() {};
    return apiClient.invokeAPI("AppStoreVersionsApi.appStoreVersionsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsRoutingAppCoverages the fields to include for returned resources of type routingAppCoverages (optional)
   * @return RoutingAppCoverageWithoutIncludesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single RoutingAppCoverage with get </td><td>  -  </td></tr>
     </table>
   */
  public RoutingAppCoverageWithoutIncludesResponse appStoreVersionsRoutingAppCoverageGetToOneRelated(String id, List<String> fieldsRoutingAppCoverages) throws ApiException {
    return appStoreVersionsRoutingAppCoverageGetToOneRelatedWithHttpInfo(id, fieldsRoutingAppCoverages).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsRoutingAppCoverages the fields to include for returned resources of type routingAppCoverages (optional)
   * @return ApiResponse&lt;RoutingAppCoverageWithoutIncludesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single RoutingAppCoverage with get </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RoutingAppCoverageWithoutIncludesResponse> appStoreVersionsRoutingAppCoverageGetToOneRelatedWithHttpInfo(String id, List<String> fieldsRoutingAppCoverages) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appStoreVersionsRoutingAppCoverageGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/appStoreVersions/{id}/routingAppCoverage"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[routingAppCoverages]", fieldsRoutingAppCoverages)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<RoutingAppCoverageWithoutIncludesResponse> localVarReturnType = new GenericType<RoutingAppCoverageWithoutIncludesResponse>() {};
    return apiClient.invokeAPI("AppStoreVersionsApi.appStoreVersionsRoutingAppCoverageGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appStoreVersionUpdateRequest AppStoreVersion representation (required)
   * @return AppStoreVersionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppStoreVersion </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public AppStoreVersionResponse appStoreVersionsUpdateInstance(String id, AppStoreVersionUpdateRequest appStoreVersionUpdateRequest) throws ApiException {
    return appStoreVersionsUpdateInstanceWithHttpInfo(id, appStoreVersionUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appStoreVersionUpdateRequest AppStoreVersion representation (required)
   * @return ApiResponse&lt;AppStoreVersionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppStoreVersion </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppStoreVersionResponse> appStoreVersionsUpdateInstanceWithHttpInfo(String id, AppStoreVersionUpdateRequest appStoreVersionUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appStoreVersionsUpdateInstance");
    }
    if (appStoreVersionUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appStoreVersionUpdateRequest' when calling appStoreVersionsUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appStoreVersions/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppStoreVersionResponse> localVarReturnType = new GenericType<AppStoreVersionResponse>() {};
    return apiClient.invokeAPI("AppStoreVersionsApi.appStoreVersionsUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), appStoreVersionUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
