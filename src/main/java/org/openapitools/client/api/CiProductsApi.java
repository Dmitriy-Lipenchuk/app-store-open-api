package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.AppResponse;
import org.openapitools.client.model.CiBuildRunsResponse;
import org.openapitools.client.model.CiProductResponse;
import org.openapitools.client.model.CiProductsResponse;
import org.openapitools.client.model.CiWorkflowsResponse;
import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.ScmRepositoriesResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class CiProductsApi {
  private ApiClient apiClient;

  public CiProductsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CiProductsApi(ApiClient apiClient) {
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
   * @param filterId filter by id(s) (optional)
   * @param fieldsScmGitReferences the fields to include for returned resources of type scmGitReferences (optional)
   * @param fieldsScmProviders the fields to include for returned resources of type scmProviders (optional)
   * @param fieldsScmRepositories the fields to include for returned resources of type scmRepositories (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ScmRepositoriesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of ScmRepositories </td><td>  -  </td></tr>
     </table>
   */
  public ScmRepositoriesResponse ciProductsAdditionalRepositoriesGetToManyRelated(String id, List<String> filterId, List<String> fieldsScmGitReferences, List<String> fieldsScmProviders, List<String> fieldsScmRepositories, Integer limit, List<String> include) throws ApiException {
    return ciProductsAdditionalRepositoriesGetToManyRelatedWithHttpInfo(id, filterId, fieldsScmGitReferences, fieldsScmProviders, fieldsScmRepositories, limit, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterId filter by id(s) (optional)
   * @param fieldsScmGitReferences the fields to include for returned resources of type scmGitReferences (optional)
   * @param fieldsScmProviders the fields to include for returned resources of type scmProviders (optional)
   * @param fieldsScmRepositories the fields to include for returned resources of type scmRepositories (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;ScmRepositoriesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of ScmRepositories </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ScmRepositoriesResponse> ciProductsAdditionalRepositoriesGetToManyRelatedWithHttpInfo(String id, List<String> filterId, List<String> fieldsScmGitReferences, List<String> fieldsScmProviders, List<String> fieldsScmRepositories, Integer limit, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling ciProductsAdditionalRepositoriesGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/ciProducts/{id}/additionalRepositories"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[id]", filterId)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[scmGitReferences]", fieldsScmGitReferences));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[scmProviders]", fieldsScmProviders));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[scmRepositories]", fieldsScmRepositories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<ScmRepositoriesResponse> localVarReturnType = new GenericType<ScmRepositoriesResponse>() {};
    return apiClient.invokeAPI("CiProductsApi.ciProductsAdditionalRepositoriesGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBetaAppReviewDetails the fields to include for returned resources of type betaAppReviewDetails (optional)
   * @param fieldsGameCenterDetails the fields to include for returned resources of type gameCenterDetails (optional)
   * @param fieldsCiProducts the fields to include for returned resources of type ciProducts (optional)
   * @param fieldsReviewSubmissions the fields to include for returned resources of type reviewSubmissions (optional)
   * @param fieldsBetaGroups the fields to include for returned resources of type betaGroups (optional)
   * @param fieldsPromotedPurchases the fields to include for returned resources of type promotedPurchases (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param fieldsAppEvents the fields to include for returned resources of type appEvents (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @param fieldsBetaLicenseAgreements the fields to include for returned resources of type betaLicenseAgreements (optional)
   * @param fieldsAppClips the fields to include for returned resources of type appClips (optional)
   * @param fieldsBetaAppLocalizations the fields to include for returned resources of type betaAppLocalizations (optional)
   * @param fieldsAppInfos the fields to include for returned resources of type appInfos (optional)
   * @param fieldsPreReleaseVersions the fields to include for returned resources of type preReleaseVersions (optional)
   * @param fieldsInAppPurchases the fields to include for returned resources of type inAppPurchases (optional)
   * @param fieldsSubscriptionGroups the fields to include for returned resources of type subscriptionGroups (optional)
   * @param fieldsAppPreOrders the fields to include for returned resources of type appPreOrders (optional)
   * @param fieldsGameCenterEnabledVersions the fields to include for returned resources of type gameCenterEnabledVersions (optional)
   * @param fieldsAppStoreVersionExperiments the fields to include for returned resources of type appStoreVersionExperiments (optional)
   * @param fieldsSubscriptionGracePeriods the fields to include for returned resources of type subscriptionGracePeriods (optional)
   * @param fieldsEndUserLicenseAgreements the fields to include for returned resources of type endUserLicenseAgreements (optional)
   * @param fieldsAppStoreVersions the fields to include for returned resources of type appStoreVersions (optional)
   * @param fieldsAppEncryptionDeclarations the fields to include for returned resources of type appEncryptionDeclarations (optional)
   * @param fieldsAppCustomProductPages the fields to include for returned resources of type appCustomProductPages (optional)
   * @param limitAppEncryptionDeclarations maximum number of related appEncryptionDeclarations returned (when they are included) (optional)
   * @param limitBetaGroups maximum number of related betaGroups returned (when they are included) (optional)
   * @param limitAppStoreVersions maximum number of related appStoreVersions returned (when they are included) (optional)
   * @param limitPreReleaseVersions maximum number of related preReleaseVersions returned (when they are included) (optional)
   * @param limitBetaAppLocalizations maximum number of related betaAppLocalizations returned (when they are included) (optional)
   * @param limitBuilds maximum number of related builds returned (when they are included) (optional)
   * @param limitAppInfos maximum number of related appInfos returned (when they are included) (optional)
   * @param limitAppClips maximum number of related appClips returned (when they are included) (optional)
   * @param limitInAppPurchases maximum number of related inAppPurchases returned (when they are included) (optional)
   * @param limitSubscriptionGroups maximum number of related subscriptionGroups returned (when they are included) (optional)
   * @param limitGameCenterEnabledVersions maximum number of related gameCenterEnabledVersions returned (when they are included) (optional)
   * @param limitAppCustomProductPages maximum number of related appCustomProductPages returned (when they are included) (optional)
   * @param limitInAppPurchasesV2 maximum number of related inAppPurchasesV2 returned (when they are included) (optional)
   * @param limitPromotedPurchases maximum number of related promotedPurchases returned (when they are included) (optional)
   * @param limitAppEvents maximum number of related appEvents returned (when they are included) (optional)
   * @param limitReviewSubmissions maximum number of related reviewSubmissions returned (when they are included) (optional)
   * @param limitAppStoreVersionExperimentsV2 maximum number of related appStoreVersionExperimentsV2 returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AppResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single App </td><td>  -  </td></tr>
     </table>
   */
  public AppResponse ciProductsAppGetToOneRelated(String id, List<String> fieldsBetaAppReviewDetails, List<String> fieldsGameCenterDetails, List<String> fieldsCiProducts, List<String> fieldsReviewSubmissions, List<String> fieldsBetaGroups, List<String> fieldsPromotedPurchases, List<String> fieldsApps, List<String> fieldsAppEvents, List<String> fieldsBuilds, List<String> fieldsBetaLicenseAgreements, List<String> fieldsAppClips, List<String> fieldsBetaAppLocalizations, List<String> fieldsAppInfos, List<String> fieldsPreReleaseVersions, List<String> fieldsInAppPurchases, List<String> fieldsSubscriptionGroups, List<String> fieldsAppPreOrders, List<String> fieldsGameCenterEnabledVersions, List<String> fieldsAppStoreVersionExperiments, List<String> fieldsSubscriptionGracePeriods, List<String> fieldsEndUserLicenseAgreements, List<String> fieldsAppStoreVersions, List<String> fieldsAppEncryptionDeclarations, List<String> fieldsAppCustomProductPages, Integer limitAppEncryptionDeclarations, Integer limitBetaGroups, Integer limitAppStoreVersions, Integer limitPreReleaseVersions, Integer limitBetaAppLocalizations, Integer limitBuilds, Integer limitAppInfos, Integer limitAppClips, Integer limitInAppPurchases, Integer limitSubscriptionGroups, Integer limitGameCenterEnabledVersions, Integer limitAppCustomProductPages, Integer limitInAppPurchasesV2, Integer limitPromotedPurchases, Integer limitAppEvents, Integer limitReviewSubmissions, Integer limitAppStoreVersionExperimentsV2, List<String> include) throws ApiException {
    return ciProductsAppGetToOneRelatedWithHttpInfo(id, fieldsBetaAppReviewDetails, fieldsGameCenterDetails, fieldsCiProducts, fieldsReviewSubmissions, fieldsBetaGroups, fieldsPromotedPurchases, fieldsApps, fieldsAppEvents, fieldsBuilds, fieldsBetaLicenseAgreements, fieldsAppClips, fieldsBetaAppLocalizations, fieldsAppInfos, fieldsPreReleaseVersions, fieldsInAppPurchases, fieldsSubscriptionGroups, fieldsAppPreOrders, fieldsGameCenterEnabledVersions, fieldsAppStoreVersionExperiments, fieldsSubscriptionGracePeriods, fieldsEndUserLicenseAgreements, fieldsAppStoreVersions, fieldsAppEncryptionDeclarations, fieldsAppCustomProductPages, limitAppEncryptionDeclarations, limitBetaGroups, limitAppStoreVersions, limitPreReleaseVersions, limitBetaAppLocalizations, limitBuilds, limitAppInfos, limitAppClips, limitInAppPurchases, limitSubscriptionGroups, limitGameCenterEnabledVersions, limitAppCustomProductPages, limitInAppPurchasesV2, limitPromotedPurchases, limitAppEvents, limitReviewSubmissions, limitAppStoreVersionExperimentsV2, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBetaAppReviewDetails the fields to include for returned resources of type betaAppReviewDetails (optional)
   * @param fieldsGameCenterDetails the fields to include for returned resources of type gameCenterDetails (optional)
   * @param fieldsCiProducts the fields to include for returned resources of type ciProducts (optional)
   * @param fieldsReviewSubmissions the fields to include for returned resources of type reviewSubmissions (optional)
   * @param fieldsBetaGroups the fields to include for returned resources of type betaGroups (optional)
   * @param fieldsPromotedPurchases the fields to include for returned resources of type promotedPurchases (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param fieldsAppEvents the fields to include for returned resources of type appEvents (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @param fieldsBetaLicenseAgreements the fields to include for returned resources of type betaLicenseAgreements (optional)
   * @param fieldsAppClips the fields to include for returned resources of type appClips (optional)
   * @param fieldsBetaAppLocalizations the fields to include for returned resources of type betaAppLocalizations (optional)
   * @param fieldsAppInfos the fields to include for returned resources of type appInfos (optional)
   * @param fieldsPreReleaseVersions the fields to include for returned resources of type preReleaseVersions (optional)
   * @param fieldsInAppPurchases the fields to include for returned resources of type inAppPurchases (optional)
   * @param fieldsSubscriptionGroups the fields to include for returned resources of type subscriptionGroups (optional)
   * @param fieldsAppPreOrders the fields to include for returned resources of type appPreOrders (optional)
   * @param fieldsGameCenterEnabledVersions the fields to include for returned resources of type gameCenterEnabledVersions (optional)
   * @param fieldsAppStoreVersionExperiments the fields to include for returned resources of type appStoreVersionExperiments (optional)
   * @param fieldsSubscriptionGracePeriods the fields to include for returned resources of type subscriptionGracePeriods (optional)
   * @param fieldsEndUserLicenseAgreements the fields to include for returned resources of type endUserLicenseAgreements (optional)
   * @param fieldsAppStoreVersions the fields to include for returned resources of type appStoreVersions (optional)
   * @param fieldsAppEncryptionDeclarations the fields to include for returned resources of type appEncryptionDeclarations (optional)
   * @param fieldsAppCustomProductPages the fields to include for returned resources of type appCustomProductPages (optional)
   * @param limitAppEncryptionDeclarations maximum number of related appEncryptionDeclarations returned (when they are included) (optional)
   * @param limitBetaGroups maximum number of related betaGroups returned (when they are included) (optional)
   * @param limitAppStoreVersions maximum number of related appStoreVersions returned (when they are included) (optional)
   * @param limitPreReleaseVersions maximum number of related preReleaseVersions returned (when they are included) (optional)
   * @param limitBetaAppLocalizations maximum number of related betaAppLocalizations returned (when they are included) (optional)
   * @param limitBuilds maximum number of related builds returned (when they are included) (optional)
   * @param limitAppInfos maximum number of related appInfos returned (when they are included) (optional)
   * @param limitAppClips maximum number of related appClips returned (when they are included) (optional)
   * @param limitInAppPurchases maximum number of related inAppPurchases returned (when they are included) (optional)
   * @param limitSubscriptionGroups maximum number of related subscriptionGroups returned (when they are included) (optional)
   * @param limitGameCenterEnabledVersions maximum number of related gameCenterEnabledVersions returned (when they are included) (optional)
   * @param limitAppCustomProductPages maximum number of related appCustomProductPages returned (when they are included) (optional)
   * @param limitInAppPurchasesV2 maximum number of related inAppPurchasesV2 returned (when they are included) (optional)
   * @param limitPromotedPurchases maximum number of related promotedPurchases returned (when they are included) (optional)
   * @param limitAppEvents maximum number of related appEvents returned (when they are included) (optional)
   * @param limitReviewSubmissions maximum number of related reviewSubmissions returned (when they are included) (optional)
   * @param limitAppStoreVersionExperimentsV2 maximum number of related appStoreVersionExperimentsV2 returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AppResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single App </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppResponse> ciProductsAppGetToOneRelatedWithHttpInfo(String id, List<String> fieldsBetaAppReviewDetails, List<String> fieldsGameCenterDetails, List<String> fieldsCiProducts, List<String> fieldsReviewSubmissions, List<String> fieldsBetaGroups, List<String> fieldsPromotedPurchases, List<String> fieldsApps, List<String> fieldsAppEvents, List<String> fieldsBuilds, List<String> fieldsBetaLicenseAgreements, List<String> fieldsAppClips, List<String> fieldsBetaAppLocalizations, List<String> fieldsAppInfos, List<String> fieldsPreReleaseVersions, List<String> fieldsInAppPurchases, List<String> fieldsSubscriptionGroups, List<String> fieldsAppPreOrders, List<String> fieldsGameCenterEnabledVersions, List<String> fieldsAppStoreVersionExperiments, List<String> fieldsSubscriptionGracePeriods, List<String> fieldsEndUserLicenseAgreements, List<String> fieldsAppStoreVersions, List<String> fieldsAppEncryptionDeclarations, List<String> fieldsAppCustomProductPages, Integer limitAppEncryptionDeclarations, Integer limitBetaGroups, Integer limitAppStoreVersions, Integer limitPreReleaseVersions, Integer limitBetaAppLocalizations, Integer limitBuilds, Integer limitAppInfos, Integer limitAppClips, Integer limitInAppPurchases, Integer limitSubscriptionGroups, Integer limitGameCenterEnabledVersions, Integer limitAppCustomProductPages, Integer limitInAppPurchasesV2, Integer limitPromotedPurchases, Integer limitAppEvents, Integer limitReviewSubmissions, Integer limitAppStoreVersionExperimentsV2, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling ciProductsAppGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/ciProducts/{id}/app"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[betaAppReviewDetails]", fieldsBetaAppReviewDetails)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterDetails]", fieldsGameCenterDetails));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[ciProducts]", fieldsCiProducts));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[reviewSubmissions]", fieldsReviewSubmissions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[betaGroups]", fieldsBetaGroups));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[promotedPurchases]", fieldsPromotedPurchases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[apps]", fieldsApps));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appEvents]", fieldsAppEvents));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[builds]", fieldsBuilds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[betaLicenseAgreements]", fieldsBetaLicenseAgreements));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appClips]", fieldsAppClips));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[betaAppLocalizations]", fieldsBetaAppLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appInfos]", fieldsAppInfos));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[preReleaseVersions]", fieldsPreReleaseVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[inAppPurchases]", fieldsInAppPurchases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptionGroups]", fieldsSubscriptionGroups));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appPreOrders]", fieldsAppPreOrders));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterEnabledVersions]", fieldsGameCenterEnabledVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersionExperiments]", fieldsAppStoreVersionExperiments));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptionGracePeriods]", fieldsSubscriptionGracePeriods));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[endUserLicenseAgreements]", fieldsEndUserLicenseAgreements));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersions]", fieldsAppStoreVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appEncryptionDeclarations]", fieldsAppEncryptionDeclarations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appCustomProductPages]", fieldsAppCustomProductPages));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appEncryptionDeclarations]", limitAppEncryptionDeclarations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[betaGroups]", limitBetaGroups));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appStoreVersions]", limitAppStoreVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[preReleaseVersions]", limitPreReleaseVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[betaAppLocalizations]", limitBetaAppLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[builds]", limitBuilds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appInfos]", limitAppInfos));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appClips]", limitAppClips));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[inAppPurchases]", limitInAppPurchases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[subscriptionGroups]", limitSubscriptionGroups));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[gameCenterEnabledVersions]", limitGameCenterEnabledVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appCustomProductPages]", limitAppCustomProductPages));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[inAppPurchasesV2]", limitInAppPurchasesV2));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[promotedPurchases]", limitPromotedPurchases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appEvents]", limitAppEvents));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[reviewSubmissions]", limitReviewSubmissions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appStoreVersionExperimentsV2]", limitAppStoreVersionExperimentsV2));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppResponse> localVarReturnType = new GenericType<AppResponse>() {};
    return apiClient.invokeAPI("CiProductsApi.ciProductsAppGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterBuilds filter by id(s) of related &#39;builds&#39; (optional)
   * @param sort comma-separated list of sort expressions; resources will be sorted as specified (optional)
   * @param fieldsScmGitReferences the fields to include for returned resources of type scmGitReferences (optional)
   * @param fieldsCiBuildRuns the fields to include for returned resources of type ciBuildRuns (optional)
   * @param fieldsCiWorkflows the fields to include for returned resources of type ciWorkflows (optional)
   * @param fieldsScmPullRequests the fields to include for returned resources of type scmPullRequests (optional)
   * @param fieldsCiProducts the fields to include for returned resources of type ciProducts (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @param limit maximum resources per page (optional)
   * @param limitBuilds maximum number of related builds returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return CiBuildRunsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of CiBuildRuns </td><td>  -  </td></tr>
     </table>
   */
  public CiBuildRunsResponse ciProductsBuildRunsGetToManyRelated(String id, List<String> filterBuilds, List<String> sort, List<String> fieldsScmGitReferences, List<String> fieldsCiBuildRuns, List<String> fieldsCiWorkflows, List<String> fieldsScmPullRequests, List<String> fieldsCiProducts, List<String> fieldsBuilds, Integer limit, Integer limitBuilds, List<String> include) throws ApiException {
    return ciProductsBuildRunsGetToManyRelatedWithHttpInfo(id, filterBuilds, sort, fieldsScmGitReferences, fieldsCiBuildRuns, fieldsCiWorkflows, fieldsScmPullRequests, fieldsCiProducts, fieldsBuilds, limit, limitBuilds, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterBuilds filter by id(s) of related &#39;builds&#39; (optional)
   * @param sort comma-separated list of sort expressions; resources will be sorted as specified (optional)
   * @param fieldsScmGitReferences the fields to include for returned resources of type scmGitReferences (optional)
   * @param fieldsCiBuildRuns the fields to include for returned resources of type ciBuildRuns (optional)
   * @param fieldsCiWorkflows the fields to include for returned resources of type ciWorkflows (optional)
   * @param fieldsScmPullRequests the fields to include for returned resources of type scmPullRequests (optional)
   * @param fieldsCiProducts the fields to include for returned resources of type ciProducts (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @param limit maximum resources per page (optional)
   * @param limitBuilds maximum number of related builds returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;CiBuildRunsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of CiBuildRuns </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CiBuildRunsResponse> ciProductsBuildRunsGetToManyRelatedWithHttpInfo(String id, List<String> filterBuilds, List<String> sort, List<String> fieldsScmGitReferences, List<String> fieldsCiBuildRuns, List<String> fieldsCiWorkflows, List<String> fieldsScmPullRequests, List<String> fieldsCiProducts, List<String> fieldsBuilds, Integer limit, Integer limitBuilds, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling ciProductsBuildRunsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/ciProducts/{id}/buildRuns"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[builds]", filterBuilds)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[scmGitReferences]", fieldsScmGitReferences));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[ciBuildRuns]", fieldsCiBuildRuns));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[ciWorkflows]", fieldsCiWorkflows));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[scmPullRequests]", fieldsScmPullRequests));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[ciProducts]", fieldsCiProducts));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[builds]", fieldsBuilds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[builds]", limitBuilds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<CiBuildRunsResponse> localVarReturnType = new GenericType<CiBuildRunsResponse>() {};
    return apiClient.invokeAPI("CiProductsApi.ciProductsBuildRunsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
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
  public void ciProductsDeleteInstance(String id) throws ApiException {
    ciProductsDeleteInstanceWithHttpInfo(id);
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
  public ApiResponse<Void> ciProductsDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling ciProductsDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/ciProducts/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("CiProductsApi.ciProductsDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param filterProductType filter by attribute &#39;productType&#39; (optional)
   * @param filterApp filter by id(s) of related &#39;app&#39; (optional)
   * @param fieldsCiProducts the fields to include for returned resources of type ciProducts (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsCiBuildRuns the fields to include for returned resources of type ciBuildRuns (optional)
   * @param fieldsCiWorkflows the fields to include for returned resources of type ciWorkflows (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param fieldsScmRepositories the fields to include for returned resources of type scmRepositories (optional)
   * @param limitPrimaryRepositories maximum number of related primaryRepositories returned (when they are included) (optional)
   * @return CiProductsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of CiProducts </td><td>  -  </td></tr>
     </table>
   */
  public CiProductsResponse ciProductsGetCollection(List<String> filterProductType, List<String> filterApp, List<String> fieldsCiProducts, Integer limit, List<String> include, List<String> fieldsCiBuildRuns, List<String> fieldsCiWorkflows, List<String> fieldsApps, List<String> fieldsScmRepositories, Integer limitPrimaryRepositories) throws ApiException {
    return ciProductsGetCollectionWithHttpInfo(filterProductType, filterApp, fieldsCiProducts, limit, include, fieldsCiBuildRuns, fieldsCiWorkflows, fieldsApps, fieldsScmRepositories, limitPrimaryRepositories).getData();
  }

  /**
   * 
   * 
   * @param filterProductType filter by attribute &#39;productType&#39; (optional)
   * @param filterApp filter by id(s) of related &#39;app&#39; (optional)
   * @param fieldsCiProducts the fields to include for returned resources of type ciProducts (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsCiBuildRuns the fields to include for returned resources of type ciBuildRuns (optional)
   * @param fieldsCiWorkflows the fields to include for returned resources of type ciWorkflows (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param fieldsScmRepositories the fields to include for returned resources of type scmRepositories (optional)
   * @param limitPrimaryRepositories maximum number of related primaryRepositories returned (when they are included) (optional)
   * @return ApiResponse&lt;CiProductsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of CiProducts </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CiProductsResponse> ciProductsGetCollectionWithHttpInfo(List<String> filterProductType, List<String> filterApp, List<String> fieldsCiProducts, Integer limit, List<String> include, List<String> fieldsCiBuildRuns, List<String> fieldsCiWorkflows, List<String> fieldsApps, List<String> fieldsScmRepositories, Integer limitPrimaryRepositories) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[productType]", filterProductType)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[app]", filterApp));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[ciProducts]", fieldsCiProducts));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[ciBuildRuns]", fieldsCiBuildRuns));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[ciWorkflows]", fieldsCiWorkflows));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[apps]", fieldsApps));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[scmRepositories]", fieldsScmRepositories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[primaryRepositories]", limitPrimaryRepositories));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<CiProductsResponse> localVarReturnType = new GenericType<CiProductsResponse>() {};
    return apiClient.invokeAPI("CiProductsApi.ciProductsGetCollection", "/v1/ciProducts", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsCiProducts the fields to include for returned resources of type ciProducts (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsCiBuildRuns the fields to include for returned resources of type ciBuildRuns (optional)
   * @param fieldsCiWorkflows the fields to include for returned resources of type ciWorkflows (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param fieldsScmRepositories the fields to include for returned resources of type scmRepositories (optional)
   * @param limitPrimaryRepositories maximum number of related primaryRepositories returned (when they are included) (optional)
   * @return CiProductResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single CiProduct </td><td>  -  </td></tr>
     </table>
   */
  public CiProductResponse ciProductsGetInstance(String id, List<String> fieldsCiProducts, List<String> include, List<String> fieldsCiBuildRuns, List<String> fieldsCiWorkflows, List<String> fieldsApps, List<String> fieldsScmRepositories, Integer limitPrimaryRepositories) throws ApiException {
    return ciProductsGetInstanceWithHttpInfo(id, fieldsCiProducts, include, fieldsCiBuildRuns, fieldsCiWorkflows, fieldsApps, fieldsScmRepositories, limitPrimaryRepositories).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsCiProducts the fields to include for returned resources of type ciProducts (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsCiBuildRuns the fields to include for returned resources of type ciBuildRuns (optional)
   * @param fieldsCiWorkflows the fields to include for returned resources of type ciWorkflows (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param fieldsScmRepositories the fields to include for returned resources of type scmRepositories (optional)
   * @param limitPrimaryRepositories maximum number of related primaryRepositories returned (when they are included) (optional)
   * @return ApiResponse&lt;CiProductResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single CiProduct </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CiProductResponse> ciProductsGetInstanceWithHttpInfo(String id, List<String> fieldsCiProducts, List<String> include, List<String> fieldsCiBuildRuns, List<String> fieldsCiWorkflows, List<String> fieldsApps, List<String> fieldsScmRepositories, Integer limitPrimaryRepositories) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling ciProductsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/ciProducts/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[ciProducts]", fieldsCiProducts)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[ciBuildRuns]", fieldsCiBuildRuns));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[ciWorkflows]", fieldsCiWorkflows));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[apps]", fieldsApps));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[scmRepositories]", fieldsScmRepositories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[primaryRepositories]", limitPrimaryRepositories));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<CiProductResponse> localVarReturnType = new GenericType<CiProductResponse>() {};
    return apiClient.invokeAPI("CiProductsApi.ciProductsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterId filter by id(s) (optional)
   * @param fieldsScmGitReferences the fields to include for returned resources of type scmGitReferences (optional)
   * @param fieldsScmProviders the fields to include for returned resources of type scmProviders (optional)
   * @param fieldsScmRepositories the fields to include for returned resources of type scmRepositories (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ScmRepositoriesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of ScmRepositories </td><td>  -  </td></tr>
     </table>
   */
  public ScmRepositoriesResponse ciProductsPrimaryRepositoriesGetToManyRelated(String id, List<String> filterId, List<String> fieldsScmGitReferences, List<String> fieldsScmProviders, List<String> fieldsScmRepositories, Integer limit, List<String> include) throws ApiException {
    return ciProductsPrimaryRepositoriesGetToManyRelatedWithHttpInfo(id, filterId, fieldsScmGitReferences, fieldsScmProviders, fieldsScmRepositories, limit, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterId filter by id(s) (optional)
   * @param fieldsScmGitReferences the fields to include for returned resources of type scmGitReferences (optional)
   * @param fieldsScmProviders the fields to include for returned resources of type scmProviders (optional)
   * @param fieldsScmRepositories the fields to include for returned resources of type scmRepositories (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;ScmRepositoriesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of ScmRepositories </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ScmRepositoriesResponse> ciProductsPrimaryRepositoriesGetToManyRelatedWithHttpInfo(String id, List<String> filterId, List<String> fieldsScmGitReferences, List<String> fieldsScmProviders, List<String> fieldsScmRepositories, Integer limit, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling ciProductsPrimaryRepositoriesGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/ciProducts/{id}/primaryRepositories"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[id]", filterId)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[scmGitReferences]", fieldsScmGitReferences));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[scmProviders]", fieldsScmProviders));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[scmRepositories]", fieldsScmRepositories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<ScmRepositoriesResponse> localVarReturnType = new GenericType<ScmRepositoriesResponse>() {};
    return apiClient.invokeAPI("CiProductsApi.ciProductsPrimaryRepositoriesGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsCiXcodeVersions the fields to include for returned resources of type ciXcodeVersions (optional)
   * @param fieldsCiWorkflows the fields to include for returned resources of type ciWorkflows (optional)
   * @param fieldsCiMacOsVersions the fields to include for returned resources of type ciMacOsVersions (optional)
   * @param fieldsCiProducts the fields to include for returned resources of type ciProducts (optional)
   * @param fieldsScmRepositories the fields to include for returned resources of type scmRepositories (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return CiWorkflowsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of CiWorkflows </td><td>  -  </td></tr>
     </table>
   */
  public CiWorkflowsResponse ciProductsWorkflowsGetToManyRelated(String id, List<String> fieldsCiXcodeVersions, List<String> fieldsCiWorkflows, List<String> fieldsCiMacOsVersions, List<String> fieldsCiProducts, List<String> fieldsScmRepositories, Integer limit, List<String> include) throws ApiException {
    return ciProductsWorkflowsGetToManyRelatedWithHttpInfo(id, fieldsCiXcodeVersions, fieldsCiWorkflows, fieldsCiMacOsVersions, fieldsCiProducts, fieldsScmRepositories, limit, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsCiXcodeVersions the fields to include for returned resources of type ciXcodeVersions (optional)
   * @param fieldsCiWorkflows the fields to include for returned resources of type ciWorkflows (optional)
   * @param fieldsCiMacOsVersions the fields to include for returned resources of type ciMacOsVersions (optional)
   * @param fieldsCiProducts the fields to include for returned resources of type ciProducts (optional)
   * @param fieldsScmRepositories the fields to include for returned resources of type scmRepositories (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;CiWorkflowsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of CiWorkflows </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CiWorkflowsResponse> ciProductsWorkflowsGetToManyRelatedWithHttpInfo(String id, List<String> fieldsCiXcodeVersions, List<String> fieldsCiWorkflows, List<String> fieldsCiMacOsVersions, List<String> fieldsCiProducts, List<String> fieldsScmRepositories, Integer limit, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling ciProductsWorkflowsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/ciProducts/{id}/workflows"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[ciXcodeVersions]", fieldsCiXcodeVersions)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[ciWorkflows]", fieldsCiWorkflows));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[ciMacOsVersions]", fieldsCiMacOsVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[ciProducts]", fieldsCiProducts));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[scmRepositories]", fieldsScmRepositories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<CiWorkflowsResponse> localVarReturnType = new GenericType<CiWorkflowsResponse>() {};
    return apiClient.invokeAPI("CiProductsApi.ciProductsWorkflowsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
