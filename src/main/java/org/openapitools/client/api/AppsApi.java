package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.AlternativeDistributionKeyResponse;
import org.openapitools.client.model.AnalyticsReportRequestsResponse;
import org.openapitools.client.model.AppAvailabilityResponse;
import org.openapitools.client.model.AppBetaTestersLinkagesRequest;
import org.openapitools.client.model.AppClipsResponse;
import org.openapitools.client.model.AppCustomProductPagesResponse;
import org.openapitools.client.model.AppEncryptionDeclarationsResponse;
import org.openapitools.client.model.AppEventsResponse;
import org.openapitools.client.model.AppInfosResponse;
import org.openapitools.client.model.AppPreOrderWithoutIncludesResponse;
import org.openapitools.client.model.AppPricePointsV3Response;
import org.openapitools.client.model.AppPriceScheduleResponse;
import org.openapitools.client.model.AppPromotedPurchasesLinkagesRequest;
import org.openapitools.client.model.AppPromotedPurchasesLinkagesResponse;
import org.openapitools.client.model.AppResponse;
import org.openapitools.client.model.AppStoreVersionExperimentsV2Response;
import org.openapitools.client.model.AppStoreVersionsResponse;
import org.openapitools.client.model.AppUpdateRequest;
import org.openapitools.client.model.AppsBetaTesterUsagesV1MetricResponse;
import org.openapitools.client.model.AppsResponse;
import org.openapitools.client.model.BetaAppLocalizationsWithoutIncludesResponse;
import org.openapitools.client.model.BetaAppReviewDetailWithoutIncludesResponse;
import org.openapitools.client.model.BetaGroupsWithoutIncludesResponse;
import org.openapitools.client.model.BetaLicenseAgreementWithoutIncludesResponse;
import org.openapitools.client.model.BuildsWithoutIncludesResponse;
import org.openapitools.client.model.CiProductResponse;
import org.openapitools.client.model.CustomerReviewsResponse;
import org.openapitools.client.model.EndUserLicenseAgreementWithoutIncludesResponse;
import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.GameCenterDetailResponse;
import org.openapitools.client.model.GameCenterEnabledVersionsResponse;
import org.openapitools.client.model.InAppPurchasesResponse;
import org.openapitools.client.model.InAppPurchasesV2Response;
import org.openapitools.client.model.MarketplaceSearchDetailResponse;
import org.openapitools.client.model.PreReleaseVersionsWithoutIncludesResponse;
import org.openapitools.client.model.PromotedPurchasesResponse;
import org.openapitools.client.model.ReviewSubmissionsResponse;
import org.openapitools.client.model.SubscriptionGracePeriodResponse;
import org.openapitools.client.model.SubscriptionGroupsResponse;
import org.openapitools.client.model.XcodeMetrics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppsApi {
  private ApiClient apiClient;

  public AppsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AppsApi(ApiClient apiClient) {
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
   * @param fieldsAlternativeDistributionKeys the fields to include for returned resources of type alternativeDistributionKeys (optional)
   * @return AlternativeDistributionKeyResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AlternativeDistributionKey </td><td>  -  </td></tr>
     </table>
   */
  public AlternativeDistributionKeyResponse appsAlternativeDistributionKeyGetToOneRelated(String id, List<String> fieldsAlternativeDistributionKeys) throws ApiException {
    return appsAlternativeDistributionKeyGetToOneRelatedWithHttpInfo(id, fieldsAlternativeDistributionKeys).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAlternativeDistributionKeys the fields to include for returned resources of type alternativeDistributionKeys (optional)
   * @return ApiResponse&lt;AlternativeDistributionKeyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AlternativeDistributionKey </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AlternativeDistributionKeyResponse> appsAlternativeDistributionKeyGetToOneRelatedWithHttpInfo(String id, List<String> fieldsAlternativeDistributionKeys) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appsAlternativeDistributionKeyGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/apps/{id}/alternativeDistributionKey"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[alternativeDistributionKeys]", fieldsAlternativeDistributionKeys)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AlternativeDistributionKeyResponse> localVarReturnType = new GenericType<AlternativeDistributionKeyResponse>() {};
    return apiClient.invokeAPI("AppsApi.appsAlternativeDistributionKeyGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterAccessType filter by attribute &#39;accessType&#39; (optional)
   * @param fieldsAnalyticsReportRequests the fields to include for returned resources of type analyticsReportRequests (optional)
   * @param fieldsAnalyticsReports the fields to include for returned resources of type analyticsReports (optional)
   * @param limit maximum resources per page (optional)
   * @param limitReports maximum number of related reports returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AnalyticsReportRequestsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AnalyticsReportRequests </td><td>  -  </td></tr>
     </table>
   */
  public AnalyticsReportRequestsResponse appsAnalyticsReportRequestsGetToManyRelated(String id, List<String> filterAccessType, List<String> fieldsAnalyticsReportRequests, List<String> fieldsAnalyticsReports, Integer limit, Integer limitReports, List<String> include) throws ApiException {
    return appsAnalyticsReportRequestsGetToManyRelatedWithHttpInfo(id, filterAccessType, fieldsAnalyticsReportRequests, fieldsAnalyticsReports, limit, limitReports, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterAccessType filter by attribute &#39;accessType&#39; (optional)
   * @param fieldsAnalyticsReportRequests the fields to include for returned resources of type analyticsReportRequests (optional)
   * @param fieldsAnalyticsReports the fields to include for returned resources of type analyticsReports (optional)
   * @param limit maximum resources per page (optional)
   * @param limitReports maximum number of related reports returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AnalyticsReportRequestsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AnalyticsReportRequests </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AnalyticsReportRequestsResponse> appsAnalyticsReportRequestsGetToManyRelatedWithHttpInfo(String id, List<String> filterAccessType, List<String> fieldsAnalyticsReportRequests, List<String> fieldsAnalyticsReports, Integer limit, Integer limitReports, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appsAnalyticsReportRequestsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/apps/{id}/analyticsReportRequests"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[accessType]", filterAccessType)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[analyticsReportRequests]", fieldsAnalyticsReportRequests));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[analyticsReports]", fieldsAnalyticsReports));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[reports]", limitReports));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AnalyticsReportRequestsResponse> localVarReturnType = new GenericType<AnalyticsReportRequestsResponse>() {};
    return apiClient.invokeAPI("AppsApi.appsAnalyticsReportRequestsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppAvailabilities the fields to include for returned resources of type appAvailabilities (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limitAvailableTerritories maximum number of related availableTerritories returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AppAvailabilityResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppAvailability </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public AppAvailabilityResponse appsAppAvailabilityGetToOneRelated(String id, List<String> fieldsAppAvailabilities, List<String> fieldsApps, List<String> fieldsTerritories, Integer limitAvailableTerritories, List<String> include) throws ApiException {
    return appsAppAvailabilityGetToOneRelatedWithHttpInfo(id, fieldsAppAvailabilities, fieldsApps, fieldsTerritories, limitAvailableTerritories, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppAvailabilities the fields to include for returned resources of type appAvailabilities (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limitAvailableTerritories maximum number of related availableTerritories returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AppAvailabilityResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppAvailability </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public ApiResponse<AppAvailabilityResponse> appsAppAvailabilityGetToOneRelatedWithHttpInfo(String id, List<String> fieldsAppAvailabilities, List<String> fieldsApps, List<String> fieldsTerritories, Integer limitAvailableTerritories, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appsAppAvailabilityGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/apps/{id}/appAvailability"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appAvailabilities]", fieldsAppAvailabilities)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[apps]", fieldsApps));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[territories]", fieldsTerritories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[availableTerritories]", limitAvailableTerritories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppAvailabilityResponse> localVarReturnType = new GenericType<AppAvailabilityResponse>() {};
    return apiClient.invokeAPI("AppsApi.appsAppAvailabilityGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterBundleId filter by attribute &#39;bundleId&#39; (optional)
   * @param fieldsAppClips the fields to include for returned resources of type appClips (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param fieldsAppClipDefaultExperiences the fields to include for returned resources of type appClipDefaultExperiences (optional)
   * @param limit maximum resources per page (optional)
   * @param limitAppClipDefaultExperiences maximum number of related appClipDefaultExperiences returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AppClipsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppClips </td><td>  -  </td></tr>
     </table>
   */
  public AppClipsResponse appsAppClipsGetToManyRelated(String id, List<String> filterBundleId, List<String> fieldsAppClips, List<String> fieldsApps, List<String> fieldsAppClipDefaultExperiences, Integer limit, Integer limitAppClipDefaultExperiences, List<String> include) throws ApiException {
    return appsAppClipsGetToManyRelatedWithHttpInfo(id, filterBundleId, fieldsAppClips, fieldsApps, fieldsAppClipDefaultExperiences, limit, limitAppClipDefaultExperiences, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterBundleId filter by attribute &#39;bundleId&#39; (optional)
   * @param fieldsAppClips the fields to include for returned resources of type appClips (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param fieldsAppClipDefaultExperiences the fields to include for returned resources of type appClipDefaultExperiences (optional)
   * @param limit maximum resources per page (optional)
   * @param limitAppClipDefaultExperiences maximum number of related appClipDefaultExperiences returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AppClipsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppClips </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppClipsResponse> appsAppClipsGetToManyRelatedWithHttpInfo(String id, List<String> filterBundleId, List<String> fieldsAppClips, List<String> fieldsApps, List<String> fieldsAppClipDefaultExperiences, Integer limit, Integer limitAppClipDefaultExperiences, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appsAppClipsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/apps/{id}/appClips"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[bundleId]", filterBundleId)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appClips]", fieldsAppClips));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[apps]", fieldsApps));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appClipDefaultExperiences]", fieldsAppClipDefaultExperiences));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appClipDefaultExperiences]", limitAppClipDefaultExperiences));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppClipsResponse> localVarReturnType = new GenericType<AppClipsResponse>() {};
    return apiClient.invokeAPI("AppsApi.appsAppClipsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterVisible filter by attribute &#39;visible&#39; (optional)
   * @param fieldsAppCustomProductPages the fields to include for returned resources of type appCustomProductPages (optional)
   * @param fieldsAppCustomProductPageVersions the fields to include for returned resources of type appCustomProductPageVersions (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param limit maximum resources per page (optional)
   * @param limitAppCustomProductPageVersions maximum number of related appCustomProductPageVersions returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AppCustomProductPagesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppCustomProductPages </td><td>  -  </td></tr>
     </table>
   */
  public AppCustomProductPagesResponse appsAppCustomProductPagesGetToManyRelated(String id, List<String> filterVisible, List<String> fieldsAppCustomProductPages, List<String> fieldsAppCustomProductPageVersions, List<String> fieldsApps, Integer limit, Integer limitAppCustomProductPageVersions, List<String> include) throws ApiException {
    return appsAppCustomProductPagesGetToManyRelatedWithHttpInfo(id, filterVisible, fieldsAppCustomProductPages, fieldsAppCustomProductPageVersions, fieldsApps, limit, limitAppCustomProductPageVersions, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterVisible filter by attribute &#39;visible&#39; (optional)
   * @param fieldsAppCustomProductPages the fields to include for returned resources of type appCustomProductPages (optional)
   * @param fieldsAppCustomProductPageVersions the fields to include for returned resources of type appCustomProductPageVersions (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param limit maximum resources per page (optional)
   * @param limitAppCustomProductPageVersions maximum number of related appCustomProductPageVersions returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AppCustomProductPagesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppCustomProductPages </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppCustomProductPagesResponse> appsAppCustomProductPagesGetToManyRelatedWithHttpInfo(String id, List<String> filterVisible, List<String> fieldsAppCustomProductPages, List<String> fieldsAppCustomProductPageVersions, List<String> fieldsApps, Integer limit, Integer limitAppCustomProductPageVersions, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appsAppCustomProductPagesGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/apps/{id}/appCustomProductPages"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[visible]", filterVisible)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appCustomProductPages]", fieldsAppCustomProductPages));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appCustomProductPageVersions]", fieldsAppCustomProductPageVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[apps]", fieldsApps));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appCustomProductPageVersions]", limitAppCustomProductPageVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppCustomProductPagesResponse> localVarReturnType = new GenericType<AppCustomProductPagesResponse>() {};
    return apiClient.invokeAPI("AppsApi.appsAppCustomProductPagesGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterPlatform filter by attribute &#39;platform&#39; (optional)
   * @param filterBuilds filter by id(s) of related &#39;builds&#39; (optional)
   * @param fieldsAppEncryptionDeclarations the fields to include for returned resources of type appEncryptionDeclarations (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param fieldsAppEncryptionDeclarationDocuments the fields to include for returned resources of type appEncryptionDeclarationDocuments (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @param limit maximum resources per page (optional)
   * @param limitBuilds maximum number of related builds returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AppEncryptionDeclarationsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppEncryptionDeclarations </td><td>  -  </td></tr>
     </table>
   */
  public AppEncryptionDeclarationsResponse appsAppEncryptionDeclarationsGetToManyRelated(String id, List<String> filterPlatform, List<String> filterBuilds, List<String> fieldsAppEncryptionDeclarations, List<String> fieldsApps, List<String> fieldsAppEncryptionDeclarationDocuments, List<String> fieldsBuilds, Integer limit, Integer limitBuilds, List<String> include) throws ApiException {
    return appsAppEncryptionDeclarationsGetToManyRelatedWithHttpInfo(id, filterPlatform, filterBuilds, fieldsAppEncryptionDeclarations, fieldsApps, fieldsAppEncryptionDeclarationDocuments, fieldsBuilds, limit, limitBuilds, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterPlatform filter by attribute &#39;platform&#39; (optional)
   * @param filterBuilds filter by id(s) of related &#39;builds&#39; (optional)
   * @param fieldsAppEncryptionDeclarations the fields to include for returned resources of type appEncryptionDeclarations (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param fieldsAppEncryptionDeclarationDocuments the fields to include for returned resources of type appEncryptionDeclarationDocuments (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @param limit maximum resources per page (optional)
   * @param limitBuilds maximum number of related builds returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AppEncryptionDeclarationsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppEncryptionDeclarations </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppEncryptionDeclarationsResponse> appsAppEncryptionDeclarationsGetToManyRelatedWithHttpInfo(String id, List<String> filterPlatform, List<String> filterBuilds, List<String> fieldsAppEncryptionDeclarations, List<String> fieldsApps, List<String> fieldsAppEncryptionDeclarationDocuments, List<String> fieldsBuilds, Integer limit, Integer limitBuilds, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appsAppEncryptionDeclarationsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/apps/{id}/appEncryptionDeclarations"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[platform]", filterPlatform)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[builds]", filterBuilds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appEncryptionDeclarations]", fieldsAppEncryptionDeclarations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[apps]", fieldsApps));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appEncryptionDeclarationDocuments]", fieldsAppEncryptionDeclarationDocuments));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[builds]", fieldsBuilds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[builds]", limitBuilds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppEncryptionDeclarationsResponse> localVarReturnType = new GenericType<AppEncryptionDeclarationsResponse>() {};
    return apiClient.invokeAPI("AppsApi.appsAppEncryptionDeclarationsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterEventState filter by attribute &#39;eventState&#39; (optional)
   * @param filterId filter by id(s) (optional)
   * @param fieldsAppEventLocalizations the fields to include for returned resources of type appEventLocalizations (optional)
   * @param fieldsAppEvents the fields to include for returned resources of type appEvents (optional)
   * @param limit maximum resources per page (optional)
   * @param limitLocalizations maximum number of related localizations returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AppEventsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppEvents </td><td>  -  </td></tr>
     </table>
   */
  public AppEventsResponse appsAppEventsGetToManyRelated(String id, List<String> filterEventState, List<String> filterId, List<String> fieldsAppEventLocalizations, List<String> fieldsAppEvents, Integer limit, Integer limitLocalizations, List<String> include) throws ApiException {
    return appsAppEventsGetToManyRelatedWithHttpInfo(id, filterEventState, filterId, fieldsAppEventLocalizations, fieldsAppEvents, limit, limitLocalizations, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterEventState filter by attribute &#39;eventState&#39; (optional)
   * @param filterId filter by id(s) (optional)
   * @param fieldsAppEventLocalizations the fields to include for returned resources of type appEventLocalizations (optional)
   * @param fieldsAppEvents the fields to include for returned resources of type appEvents (optional)
   * @param limit maximum resources per page (optional)
   * @param limitLocalizations maximum number of related localizations returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AppEventsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppEvents </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppEventsResponse> appsAppEventsGetToManyRelatedWithHttpInfo(String id, List<String> filterEventState, List<String> filterId, List<String> fieldsAppEventLocalizations, List<String> fieldsAppEvents, Integer limit, Integer limitLocalizations, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appsAppEventsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/apps/{id}/appEvents"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[eventState]", filterEventState)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[id]", filterId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appEventLocalizations]", fieldsAppEventLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appEvents]", fieldsAppEvents));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[localizations]", limitLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppEventsResponse> localVarReturnType = new GenericType<AppEventsResponse>() {};
    return apiClient.invokeAPI("AppsApi.appsAppEventsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAgeRatingDeclarations the fields to include for returned resources of type ageRatingDeclarations (optional)
   * @param fieldsAppInfos the fields to include for returned resources of type appInfos (optional)
   * @param fieldsAppInfoLocalizations the fields to include for returned resources of type appInfoLocalizations (optional)
   * @param fieldsAppCategories the fields to include for returned resources of type appCategories (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param limit maximum resources per page (optional)
   * @param limitAppInfoLocalizations maximum number of related appInfoLocalizations returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AppInfosResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppInfos </td><td>  -  </td></tr>
     </table>
   */
  public AppInfosResponse appsAppInfosGetToManyRelated(String id, List<String> fieldsAgeRatingDeclarations, List<String> fieldsAppInfos, List<String> fieldsAppInfoLocalizations, List<String> fieldsAppCategories, List<String> fieldsApps, Integer limit, Integer limitAppInfoLocalizations, List<String> include) throws ApiException {
    return appsAppInfosGetToManyRelatedWithHttpInfo(id, fieldsAgeRatingDeclarations, fieldsAppInfos, fieldsAppInfoLocalizations, fieldsAppCategories, fieldsApps, limit, limitAppInfoLocalizations, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAgeRatingDeclarations the fields to include for returned resources of type ageRatingDeclarations (optional)
   * @param fieldsAppInfos the fields to include for returned resources of type appInfos (optional)
   * @param fieldsAppInfoLocalizations the fields to include for returned resources of type appInfoLocalizations (optional)
   * @param fieldsAppCategories the fields to include for returned resources of type appCategories (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param limit maximum resources per page (optional)
   * @param limitAppInfoLocalizations maximum number of related appInfoLocalizations returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AppInfosResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppInfos </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppInfosResponse> appsAppInfosGetToManyRelatedWithHttpInfo(String id, List<String> fieldsAgeRatingDeclarations, List<String> fieldsAppInfos, List<String> fieldsAppInfoLocalizations, List<String> fieldsAppCategories, List<String> fieldsApps, Integer limit, Integer limitAppInfoLocalizations, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appsAppInfosGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/apps/{id}/appInfos"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[ageRatingDeclarations]", fieldsAgeRatingDeclarations)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appInfos]", fieldsAppInfos));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appInfoLocalizations]", fieldsAppInfoLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appCategories]", fieldsAppCategories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[apps]", fieldsApps));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appInfoLocalizations]", limitAppInfoLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppInfosResponse> localVarReturnType = new GenericType<AppInfosResponse>() {};
    return apiClient.invokeAPI("AppsApi.appsAppInfosGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterTerritory filter by id(s) of related &#39;territory&#39; (optional)
   * @param fieldsAppPricePoints the fields to include for returned resources of type appPricePoints (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AppPricePointsV3Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppPricePoints </td><td>  -  </td></tr>
     </table>
   */
  public AppPricePointsV3Response appsAppPricePointsGetToManyRelated(String id, List<String> filterTerritory, List<String> fieldsAppPricePoints, List<String> fieldsApps, List<String> fieldsTerritories, Integer limit, List<String> include) throws ApiException {
    return appsAppPricePointsGetToManyRelatedWithHttpInfo(id, filterTerritory, fieldsAppPricePoints, fieldsApps, fieldsTerritories, limit, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterTerritory filter by id(s) of related &#39;territory&#39; (optional)
   * @param fieldsAppPricePoints the fields to include for returned resources of type appPricePoints (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AppPricePointsV3Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppPricePoints </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppPricePointsV3Response> appsAppPricePointsGetToManyRelatedWithHttpInfo(String id, List<String> filterTerritory, List<String> fieldsAppPricePoints, List<String> fieldsApps, List<String> fieldsTerritories, Integer limit, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appsAppPricePointsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/apps/{id}/appPricePoints"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[territory]", filterTerritory)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appPricePoints]", fieldsAppPricePoints));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[apps]", fieldsApps));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[territories]", fieldsTerritories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json", "text/csv");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppPricePointsV3Response> localVarReturnType = new GenericType<AppPricePointsV3Response>() {};
    return apiClient.invokeAPI("AppsApi.appsAppPricePointsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppPrices the fields to include for returned resources of type appPrices (optional)
   * @param fieldsAppPriceSchedules the fields to include for returned resources of type appPriceSchedules (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limitManualPrices maximum number of related manualPrices returned (when they are included) (optional)
   * @param limitAutomaticPrices maximum number of related automaticPrices returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AppPriceScheduleResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppPriceSchedule </td><td>  -  </td></tr>
     </table>
   */
  public AppPriceScheduleResponse appsAppPriceScheduleGetToOneRelated(String id, List<String> fieldsAppPrices, List<String> fieldsAppPriceSchedules, List<String> fieldsApps, List<String> fieldsTerritories, Integer limitManualPrices, Integer limitAutomaticPrices, List<String> include) throws ApiException {
    return appsAppPriceScheduleGetToOneRelatedWithHttpInfo(id, fieldsAppPrices, fieldsAppPriceSchedules, fieldsApps, fieldsTerritories, limitManualPrices, limitAutomaticPrices, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppPrices the fields to include for returned resources of type appPrices (optional)
   * @param fieldsAppPriceSchedules the fields to include for returned resources of type appPriceSchedules (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limitManualPrices maximum number of related manualPrices returned (when they are included) (optional)
   * @param limitAutomaticPrices maximum number of related automaticPrices returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AppPriceScheduleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppPriceSchedule </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppPriceScheduleResponse> appsAppPriceScheduleGetToOneRelatedWithHttpInfo(String id, List<String> fieldsAppPrices, List<String> fieldsAppPriceSchedules, List<String> fieldsApps, List<String> fieldsTerritories, Integer limitManualPrices, Integer limitAutomaticPrices, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appsAppPriceScheduleGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/apps/{id}/appPriceSchedule"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appPrices]", fieldsAppPrices)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appPriceSchedules]", fieldsAppPriceSchedules));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[apps]", fieldsApps));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[territories]", fieldsTerritories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[manualPrices]", limitManualPrices));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[automaticPrices]", limitAutomaticPrices));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppPriceScheduleResponse> localVarReturnType = new GenericType<AppPriceScheduleResponse>() {};
    return apiClient.invokeAPI("AppsApi.appsAppPriceScheduleGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
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
  public AppStoreVersionExperimentsV2Response appsAppStoreVersionExperimentsV2GetToManyRelated(String id, List<String> filterState, List<String> fieldsAppStoreVersionExperiments, List<String> fieldsAppStoreVersionExperimentTreatments, List<String> fieldsAppStoreVersions, List<String> fieldsApps, Integer limit, Integer limitControlVersions, Integer limitAppStoreVersionExperimentTreatments, List<String> include) throws ApiException {
    return appsAppStoreVersionExperimentsV2GetToManyRelatedWithHttpInfo(id, filterState, fieldsAppStoreVersionExperiments, fieldsAppStoreVersionExperimentTreatments, fieldsAppStoreVersions, fieldsApps, limit, limitControlVersions, limitAppStoreVersionExperimentTreatments, include).getData();
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
  public ApiResponse<AppStoreVersionExperimentsV2Response> appsAppStoreVersionExperimentsV2GetToManyRelatedWithHttpInfo(String id, List<String> filterState, List<String> fieldsAppStoreVersionExperiments, List<String> fieldsAppStoreVersionExperimentTreatments, List<String> fieldsAppStoreVersions, List<String> fieldsApps, Integer limit, Integer limitControlVersions, Integer limitAppStoreVersionExperimentTreatments, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appsAppStoreVersionExperimentsV2GetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/apps/{id}/appStoreVersionExperimentsV2"
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
    return apiClient.invokeAPI("AppsApi.appsAppStoreVersionExperimentsV2GetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterAppStoreState filter by attribute &#39;appStoreState&#39; (optional)
   * @param filterAppVersionState filter by attribute &#39;appVersionState&#39; (optional)
   * @param filterPlatform filter by attribute &#39;platform&#39; (optional)
   * @param filterVersionString filter by attribute &#39;versionString&#39; (optional)
   * @param filterId filter by id(s) (optional)
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
   * @param limit maximum resources per page (optional)
   * @param limitAppStoreVersionLocalizations maximum number of related appStoreVersionLocalizations returned (when they are included) (optional)
   * @param limitAppStoreVersionExperiments maximum number of related appStoreVersionExperiments returned (when they are included) (optional)
   * @param limitAppStoreVersionExperimentsV2 maximum number of related appStoreVersionExperimentsV2 returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AppStoreVersionsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppStoreVersions </td><td>  -  </td></tr>
     </table>
   */
  public AppStoreVersionsResponse appsAppStoreVersionsGetToManyRelated(String id, List<String> filterAppStoreState, List<String> filterAppVersionState, List<String> filterPlatform, List<String> filterVersionString, List<String> filterId, List<String> fieldsAgeRatingDeclarations, List<String> fieldsAppStoreReviewDetails, List<String> fieldsAppStoreVersionLocalizations, List<String> fieldsAppStoreVersionExperiments, List<String> fieldsAppStoreVersionSubmissions, List<String> fieldsAlternativeDistributionPackages, List<String> fieldsAppStoreVersions, List<String> fieldsApps, List<String> fieldsRoutingAppCoverages, List<String> fieldsAppClipDefaultExperiences, List<String> fieldsAppStoreVersionPhasedReleases, List<String> fieldsBuilds, Integer limit, Integer limitAppStoreVersionLocalizations, Integer limitAppStoreVersionExperiments, Integer limitAppStoreVersionExperimentsV2, List<String> include) throws ApiException {
    return appsAppStoreVersionsGetToManyRelatedWithHttpInfo(id, filterAppStoreState, filterAppVersionState, filterPlatform, filterVersionString, filterId, fieldsAgeRatingDeclarations, fieldsAppStoreReviewDetails, fieldsAppStoreVersionLocalizations, fieldsAppStoreVersionExperiments, fieldsAppStoreVersionSubmissions, fieldsAlternativeDistributionPackages, fieldsAppStoreVersions, fieldsApps, fieldsRoutingAppCoverages, fieldsAppClipDefaultExperiences, fieldsAppStoreVersionPhasedReleases, fieldsBuilds, limit, limitAppStoreVersionLocalizations, limitAppStoreVersionExperiments, limitAppStoreVersionExperimentsV2, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterAppStoreState filter by attribute &#39;appStoreState&#39; (optional)
   * @param filterAppVersionState filter by attribute &#39;appVersionState&#39; (optional)
   * @param filterPlatform filter by attribute &#39;platform&#39; (optional)
   * @param filterVersionString filter by attribute &#39;versionString&#39; (optional)
   * @param filterId filter by id(s) (optional)
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
   * @param limit maximum resources per page (optional)
   * @param limitAppStoreVersionLocalizations maximum number of related appStoreVersionLocalizations returned (when they are included) (optional)
   * @param limitAppStoreVersionExperiments maximum number of related appStoreVersionExperiments returned (when they are included) (optional)
   * @param limitAppStoreVersionExperimentsV2 maximum number of related appStoreVersionExperimentsV2 returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AppStoreVersionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppStoreVersions </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppStoreVersionsResponse> appsAppStoreVersionsGetToManyRelatedWithHttpInfo(String id, List<String> filterAppStoreState, List<String> filterAppVersionState, List<String> filterPlatform, List<String> filterVersionString, List<String> filterId, List<String> fieldsAgeRatingDeclarations, List<String> fieldsAppStoreReviewDetails, List<String> fieldsAppStoreVersionLocalizations, List<String> fieldsAppStoreVersionExperiments, List<String> fieldsAppStoreVersionSubmissions, List<String> fieldsAlternativeDistributionPackages, List<String> fieldsAppStoreVersions, List<String> fieldsApps, List<String> fieldsRoutingAppCoverages, List<String> fieldsAppClipDefaultExperiences, List<String> fieldsAppStoreVersionPhasedReleases, List<String> fieldsBuilds, Integer limit, Integer limitAppStoreVersionLocalizations, Integer limitAppStoreVersionExperiments, Integer limitAppStoreVersionExperimentsV2, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appsAppStoreVersionsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/apps/{id}/appStoreVersions"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[appStoreState]", filterAppStoreState)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[appVersionState]", filterAppVersionState));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[platform]", filterPlatform));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[versionString]", filterVersionString));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[id]", filterId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[ageRatingDeclarations]", fieldsAgeRatingDeclarations));
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appStoreVersionLocalizations]", limitAppStoreVersionLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appStoreVersionExperiments]", limitAppStoreVersionExperiments));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appStoreVersionExperimentsV2]", limitAppStoreVersionExperimentsV2));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppStoreVersionsResponse> localVarReturnType = new GenericType<AppStoreVersionsResponse>() {};
    return apiClient.invokeAPI("AppsApi.appsAppStoreVersionsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBetaAppLocalizations the fields to include for returned resources of type betaAppLocalizations (optional)
   * @param limit maximum resources per page (optional)
   * @return BetaAppLocalizationsWithoutIncludesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of BetaAppLocalizations with get </td><td>  -  </td></tr>
     </table>
   */
  public BetaAppLocalizationsWithoutIncludesResponse appsBetaAppLocalizationsGetToManyRelated(String id, List<String> fieldsBetaAppLocalizations, Integer limit) throws ApiException {
    return appsBetaAppLocalizationsGetToManyRelatedWithHttpInfo(id, fieldsBetaAppLocalizations, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBetaAppLocalizations the fields to include for returned resources of type betaAppLocalizations (optional)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;BetaAppLocalizationsWithoutIncludesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of BetaAppLocalizations with get </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BetaAppLocalizationsWithoutIncludesResponse> appsBetaAppLocalizationsGetToManyRelatedWithHttpInfo(String id, List<String> fieldsBetaAppLocalizations, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appsBetaAppLocalizationsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/apps/{id}/betaAppLocalizations"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[betaAppLocalizations]", fieldsBetaAppLocalizations)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BetaAppLocalizationsWithoutIncludesResponse> localVarReturnType = new GenericType<BetaAppLocalizationsWithoutIncludesResponse>() {};
    return apiClient.invokeAPI("AppsApi.appsBetaAppLocalizationsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBetaAppReviewDetails the fields to include for returned resources of type betaAppReviewDetails (optional)
   * @return BetaAppReviewDetailWithoutIncludesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single BetaAppReviewDetail with get </td><td>  -  </td></tr>
     </table>
   */
  public BetaAppReviewDetailWithoutIncludesResponse appsBetaAppReviewDetailGetToOneRelated(String id, List<String> fieldsBetaAppReviewDetails) throws ApiException {
    return appsBetaAppReviewDetailGetToOneRelatedWithHttpInfo(id, fieldsBetaAppReviewDetails).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBetaAppReviewDetails the fields to include for returned resources of type betaAppReviewDetails (optional)
   * @return ApiResponse&lt;BetaAppReviewDetailWithoutIncludesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single BetaAppReviewDetail with get </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BetaAppReviewDetailWithoutIncludesResponse> appsBetaAppReviewDetailGetToOneRelatedWithHttpInfo(String id, List<String> fieldsBetaAppReviewDetails) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appsBetaAppReviewDetailGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/apps/{id}/betaAppReviewDetail"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[betaAppReviewDetails]", fieldsBetaAppReviewDetails)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BetaAppReviewDetailWithoutIncludesResponse> localVarReturnType = new GenericType<BetaAppReviewDetailWithoutIncludesResponse>() {};
    return apiClient.invokeAPI("AppsApi.appsBetaAppReviewDetailGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBetaGroups the fields to include for returned resources of type betaGroups (optional)
   * @param limit maximum resources per page (optional)
   * @return BetaGroupsWithoutIncludesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of BetaGroups with get </td><td>  -  </td></tr>
     </table>
   */
  public BetaGroupsWithoutIncludesResponse appsBetaGroupsGetToManyRelated(String id, List<String> fieldsBetaGroups, Integer limit) throws ApiException {
    return appsBetaGroupsGetToManyRelatedWithHttpInfo(id, fieldsBetaGroups, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBetaGroups the fields to include for returned resources of type betaGroups (optional)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;BetaGroupsWithoutIncludesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of BetaGroups with get </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BetaGroupsWithoutIncludesResponse> appsBetaGroupsGetToManyRelatedWithHttpInfo(String id, List<String> fieldsBetaGroups, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appsBetaGroupsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/apps/{id}/betaGroups"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[betaGroups]", fieldsBetaGroups)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BetaGroupsWithoutIncludesResponse> localVarReturnType = new GenericType<BetaGroupsWithoutIncludesResponse>() {};
    return apiClient.invokeAPI("AppsApi.appsBetaGroupsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBetaLicenseAgreements the fields to include for returned resources of type betaLicenseAgreements (optional)
   * @return BetaLicenseAgreementWithoutIncludesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single BetaLicenseAgreement with get </td><td>  -  </td></tr>
     </table>
   */
  public BetaLicenseAgreementWithoutIncludesResponse appsBetaLicenseAgreementGetToOneRelated(String id, List<String> fieldsBetaLicenseAgreements) throws ApiException {
    return appsBetaLicenseAgreementGetToOneRelatedWithHttpInfo(id, fieldsBetaLicenseAgreements).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBetaLicenseAgreements the fields to include for returned resources of type betaLicenseAgreements (optional)
   * @return ApiResponse&lt;BetaLicenseAgreementWithoutIncludesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single BetaLicenseAgreement with get </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BetaLicenseAgreementWithoutIncludesResponse> appsBetaLicenseAgreementGetToOneRelatedWithHttpInfo(String id, List<String> fieldsBetaLicenseAgreements) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appsBetaLicenseAgreementGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/apps/{id}/betaLicenseAgreement"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[betaLicenseAgreements]", fieldsBetaLicenseAgreements)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BetaLicenseAgreementWithoutIncludesResponse> localVarReturnType = new GenericType<BetaLicenseAgreementWithoutIncludesResponse>() {};
    return apiClient.invokeAPI("AppsApi.appsBetaLicenseAgreementGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param limit maximum number of groups to return per page (optional)
   * @param groupBy the dimension by which to group the results (optional)
   * @param filterBetaTesters filter by &#39;betaTesters&#39; relationship dimension (optional)
   * @param period the duration of the reporting period (optional)
   * @return AppsBetaTesterUsagesV1MetricResponse
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
  public AppsBetaTesterUsagesV1MetricResponse appsBetaTesterUsagesGetMetrics(String id, Integer limit, List<String> groupBy, String filterBetaTesters, String period) throws ApiException {
    return appsBetaTesterUsagesGetMetricsWithHttpInfo(id, limit, groupBy, filterBetaTesters, period).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param limit maximum number of groups to return per page (optional)
   * @param groupBy the dimension by which to group the results (optional)
   * @param filterBetaTesters filter by &#39;betaTesters&#39; relationship dimension (optional)
   * @param period the duration of the reporting period (optional)
   * @return ApiResponse&lt;AppsBetaTesterUsagesV1MetricResponse&gt;
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
  public ApiResponse<AppsBetaTesterUsagesV1MetricResponse> appsBetaTesterUsagesGetMetricsWithHttpInfo(String id, Integer limit, List<String> groupBy, String filterBetaTesters, String period) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appsBetaTesterUsagesGetMetrics");
    }

    // Path parameters
    String localVarPath = "/v1/apps/{id}/metrics/betaTesterUsages"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "limit", limit)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "groupBy", groupBy));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[betaTesters]", filterBetaTesters));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "period", period));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppsBetaTesterUsagesV1MetricResponse> localVarReturnType = new GenericType<AppsBetaTesterUsagesV1MetricResponse>() {};
    return apiClient.invokeAPI("AppsApi.appsBetaTesterUsagesGetMetrics", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appBetaTestersLinkagesRequest List of related linkages (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> Accepted for future completion </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success (no content) </td><td>  -  </td></tr>
     </table>
   */
  public void appsBetaTestersDeleteToManyRelationship(String id, AppBetaTestersLinkagesRequest appBetaTestersLinkagesRequest) throws ApiException {
    appsBetaTestersDeleteToManyRelationshipWithHttpInfo(id, appBetaTestersLinkagesRequest);
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appBetaTestersLinkagesRequest List of related linkages (required)
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
       <tr><td> 202 </td><td> Accepted for future completion </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success (no content) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> appsBetaTestersDeleteToManyRelationshipWithHttpInfo(String id, AppBetaTestersLinkagesRequest appBetaTestersLinkagesRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appsBetaTestersDeleteToManyRelationship");
    }
    if (appBetaTestersLinkagesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appBetaTestersLinkagesRequest' when calling appsBetaTestersDeleteToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/apps/{id}/relationships/betaTesters"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("AppsApi.appsBetaTestersDeleteToManyRelationship", localVarPath, "DELETE", new ArrayList<>(), appBetaTestersLinkagesRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @param limit maximum resources per page (optional)
   * @return BuildsWithoutIncludesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of Builds with get </td><td>  -  </td></tr>
     </table>
   */
  public BuildsWithoutIncludesResponse appsBuildsGetToManyRelated(String id, List<String> fieldsBuilds, Integer limit) throws ApiException {
    return appsBuildsGetToManyRelatedWithHttpInfo(id, fieldsBuilds, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;BuildsWithoutIncludesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of Builds with get </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BuildsWithoutIncludesResponse> appsBuildsGetToManyRelatedWithHttpInfo(String id, List<String> fieldsBuilds, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appsBuildsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/apps/{id}/builds"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[builds]", fieldsBuilds)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BuildsWithoutIncludesResponse> localVarReturnType = new GenericType<BuildsWithoutIncludesResponse>() {};
    return apiClient.invokeAPI("AppsApi.appsBuildsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsCiProducts the fields to include for returned resources of type ciProducts (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param fieldsScmRepositories the fields to include for returned resources of type scmRepositories (optional)
   * @param fieldsBundleIds the fields to include for returned resources of type bundleIds (optional)
   * @param limitPrimaryRepositories maximum number of related primaryRepositories returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
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
  public CiProductResponse appsCiProductGetToOneRelated(String id, List<String> fieldsCiProducts, List<String> fieldsApps, List<String> fieldsScmRepositories, List<String> fieldsBundleIds, Integer limitPrimaryRepositories, List<String> include) throws ApiException {
    return appsCiProductGetToOneRelatedWithHttpInfo(id, fieldsCiProducts, fieldsApps, fieldsScmRepositories, fieldsBundleIds, limitPrimaryRepositories, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsCiProducts the fields to include for returned resources of type ciProducts (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param fieldsScmRepositories the fields to include for returned resources of type scmRepositories (optional)
   * @param fieldsBundleIds the fields to include for returned resources of type bundleIds (optional)
   * @param limitPrimaryRepositories maximum number of related primaryRepositories returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
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
  public ApiResponse<CiProductResponse> appsCiProductGetToOneRelatedWithHttpInfo(String id, List<String> fieldsCiProducts, List<String> fieldsApps, List<String> fieldsScmRepositories, List<String> fieldsBundleIds, Integer limitPrimaryRepositories, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appsCiProductGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/apps/{id}/ciProduct"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[ciProducts]", fieldsCiProducts)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[apps]", fieldsApps));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[scmRepositories]", fieldsScmRepositories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[bundleIds]", fieldsBundleIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[primaryRepositories]", limitPrimaryRepositories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<CiProductResponse> localVarReturnType = new GenericType<CiProductResponse>() {};
    return apiClient.invokeAPI("AppsApi.appsCiProductGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
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
  public CustomerReviewsResponse appsCustomerReviewsGetToManyRelated(String id, List<String> filterRating, List<String> filterTerritory, Boolean existsPublishedResponse, List<String> sort, List<String> fieldsCustomerReviews, List<String> fieldsCustomerReviewResponses, Integer limit, List<String> include) throws ApiException {
    return appsCustomerReviewsGetToManyRelatedWithHttpInfo(id, filterRating, filterTerritory, existsPublishedResponse, sort, fieldsCustomerReviews, fieldsCustomerReviewResponses, limit, include).getData();
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
  public ApiResponse<CustomerReviewsResponse> appsCustomerReviewsGetToManyRelatedWithHttpInfo(String id, List<String> filterRating, List<String> filterTerritory, Boolean existsPublishedResponse, List<String> sort, List<String> fieldsCustomerReviews, List<String> fieldsCustomerReviewResponses, Integer limit, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appsCustomerReviewsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/apps/{id}/customerReviews"
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
    return apiClient.invokeAPI("AppsApi.appsCustomerReviewsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsEndUserLicenseAgreements the fields to include for returned resources of type endUserLicenseAgreements (optional)
   * @return EndUserLicenseAgreementWithoutIncludesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single EndUserLicenseAgreement with get </td><td>  -  </td></tr>
     </table>
   */
  public EndUserLicenseAgreementWithoutIncludesResponse appsEndUserLicenseAgreementGetToOneRelated(String id, List<String> fieldsEndUserLicenseAgreements) throws ApiException {
    return appsEndUserLicenseAgreementGetToOneRelatedWithHttpInfo(id, fieldsEndUserLicenseAgreements).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsEndUserLicenseAgreements the fields to include for returned resources of type endUserLicenseAgreements (optional)
   * @return ApiResponse&lt;EndUserLicenseAgreementWithoutIncludesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single EndUserLicenseAgreement with get </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EndUserLicenseAgreementWithoutIncludesResponse> appsEndUserLicenseAgreementGetToOneRelatedWithHttpInfo(String id, List<String> fieldsEndUserLicenseAgreements) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appsEndUserLicenseAgreementGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/apps/{id}/endUserLicenseAgreement"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[endUserLicenseAgreements]", fieldsEndUserLicenseAgreements)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<EndUserLicenseAgreementWithoutIncludesResponse> localVarReturnType = new GenericType<EndUserLicenseAgreementWithoutIncludesResponse>() {};
    return apiClient.invokeAPI("AppsApi.appsEndUserLicenseAgreementGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterAchievementReleases the fields to include for returned resources of type gameCenterAchievementReleases (optional)
   * @param fieldsGameCenterLeaderboardSetReleases the fields to include for returned resources of type gameCenterLeaderboardSetReleases (optional)
   * @param fieldsGameCenterLeaderboardSets the fields to include for returned resources of type gameCenterLeaderboardSets (optional)
   * @param fieldsGameCenterGroups the fields to include for returned resources of type gameCenterGroups (optional)
   * @param fieldsGameCenterDetails the fields to include for returned resources of type gameCenterDetails (optional)
   * @param fieldsGameCenterLeaderboards the fields to include for returned resources of type gameCenterLeaderboards (optional)
   * @param fieldsGameCenterAppVersions the fields to include for returned resources of type gameCenterAppVersions (optional)
   * @param fieldsGameCenterAchievements the fields to include for returned resources of type gameCenterAchievements (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param fieldsGameCenterLeaderboardReleases the fields to include for returned resources of type gameCenterLeaderboardReleases (optional)
   * @param limitGameCenterAppVersions maximum number of related gameCenterAppVersions returned (when they are included) (optional)
   * @param limitGameCenterLeaderboards maximum number of related gameCenterLeaderboards returned (when they are included) (optional)
   * @param limitGameCenterLeaderboardSets maximum number of related gameCenterLeaderboardSets returned (when they are included) (optional)
   * @param limitGameCenterAchievements maximum number of related gameCenterAchievements returned (when they are included) (optional)
   * @param limitAchievementReleases maximum number of related achievementReleases returned (when they are included) (optional)
   * @param limitLeaderboardReleases maximum number of related leaderboardReleases returned (when they are included) (optional)
   * @param limitLeaderboardSetReleases maximum number of related leaderboardSetReleases returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return GameCenterDetailResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterDetail </td><td>  -  </td></tr>
     </table>
   */
  public GameCenterDetailResponse appsGameCenterDetailGetToOneRelated(String id, List<String> fieldsGameCenterAchievementReleases, List<String> fieldsGameCenterLeaderboardSetReleases, List<String> fieldsGameCenterLeaderboardSets, List<String> fieldsGameCenterGroups, List<String> fieldsGameCenterDetails, List<String> fieldsGameCenterLeaderboards, List<String> fieldsGameCenterAppVersions, List<String> fieldsGameCenterAchievements, List<String> fieldsApps, List<String> fieldsGameCenterLeaderboardReleases, Integer limitGameCenterAppVersions, Integer limitGameCenterLeaderboards, Integer limitGameCenterLeaderboardSets, Integer limitGameCenterAchievements, Integer limitAchievementReleases, Integer limitLeaderboardReleases, Integer limitLeaderboardSetReleases, List<String> include) throws ApiException {
    return appsGameCenterDetailGetToOneRelatedWithHttpInfo(id, fieldsGameCenterAchievementReleases, fieldsGameCenterLeaderboardSetReleases, fieldsGameCenterLeaderboardSets, fieldsGameCenterGroups, fieldsGameCenterDetails, fieldsGameCenterLeaderboards, fieldsGameCenterAppVersions, fieldsGameCenterAchievements, fieldsApps, fieldsGameCenterLeaderboardReleases, limitGameCenterAppVersions, limitGameCenterLeaderboards, limitGameCenterLeaderboardSets, limitGameCenterAchievements, limitAchievementReleases, limitLeaderboardReleases, limitLeaderboardSetReleases, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsGameCenterAchievementReleases the fields to include for returned resources of type gameCenterAchievementReleases (optional)
   * @param fieldsGameCenterLeaderboardSetReleases the fields to include for returned resources of type gameCenterLeaderboardSetReleases (optional)
   * @param fieldsGameCenterLeaderboardSets the fields to include for returned resources of type gameCenterLeaderboardSets (optional)
   * @param fieldsGameCenterGroups the fields to include for returned resources of type gameCenterGroups (optional)
   * @param fieldsGameCenterDetails the fields to include for returned resources of type gameCenterDetails (optional)
   * @param fieldsGameCenterLeaderboards the fields to include for returned resources of type gameCenterLeaderboards (optional)
   * @param fieldsGameCenterAppVersions the fields to include for returned resources of type gameCenterAppVersions (optional)
   * @param fieldsGameCenterAchievements the fields to include for returned resources of type gameCenterAchievements (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param fieldsGameCenterLeaderboardReleases the fields to include for returned resources of type gameCenterLeaderboardReleases (optional)
   * @param limitGameCenterAppVersions maximum number of related gameCenterAppVersions returned (when they are included) (optional)
   * @param limitGameCenterLeaderboards maximum number of related gameCenterLeaderboards returned (when they are included) (optional)
   * @param limitGameCenterLeaderboardSets maximum number of related gameCenterLeaderboardSets returned (when they are included) (optional)
   * @param limitGameCenterAchievements maximum number of related gameCenterAchievements returned (when they are included) (optional)
   * @param limitAchievementReleases maximum number of related achievementReleases returned (when they are included) (optional)
   * @param limitLeaderboardReleases maximum number of related leaderboardReleases returned (when they are included) (optional)
   * @param limitLeaderboardSetReleases maximum number of related leaderboardSetReleases returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;GameCenterDetailResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single GameCenterDetail </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<GameCenterDetailResponse> appsGameCenterDetailGetToOneRelatedWithHttpInfo(String id, List<String> fieldsGameCenterAchievementReleases, List<String> fieldsGameCenterLeaderboardSetReleases, List<String> fieldsGameCenterLeaderboardSets, List<String> fieldsGameCenterGroups, List<String> fieldsGameCenterDetails, List<String> fieldsGameCenterLeaderboards, List<String> fieldsGameCenterAppVersions, List<String> fieldsGameCenterAchievements, List<String> fieldsApps, List<String> fieldsGameCenterLeaderboardReleases, Integer limitGameCenterAppVersions, Integer limitGameCenterLeaderboards, Integer limitGameCenterLeaderboardSets, Integer limitGameCenterAchievements, Integer limitAchievementReleases, Integer limitLeaderboardReleases, Integer limitLeaderboardSetReleases, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appsGameCenterDetailGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/apps/{id}/gameCenterDetail"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[gameCenterAchievementReleases]", fieldsGameCenterAchievementReleases)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardSetReleases]", fieldsGameCenterLeaderboardSetReleases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardSets]", fieldsGameCenterLeaderboardSets));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterGroups]", fieldsGameCenterGroups));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterDetails]", fieldsGameCenterDetails));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboards]", fieldsGameCenterLeaderboards));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterAppVersions]", fieldsGameCenterAppVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterAchievements]", fieldsGameCenterAchievements));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[apps]", fieldsApps));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterLeaderboardReleases]", fieldsGameCenterLeaderboardReleases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[gameCenterAppVersions]", limitGameCenterAppVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[gameCenterLeaderboards]", limitGameCenterLeaderboards));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[gameCenterLeaderboardSets]", limitGameCenterLeaderboardSets));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[gameCenterAchievements]", limitGameCenterAchievements));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[achievementReleases]", limitAchievementReleases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[leaderboardReleases]", limitLeaderboardReleases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[leaderboardSetReleases]", limitLeaderboardSetReleases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<GameCenterDetailResponse> localVarReturnType = new GenericType<GameCenterDetailResponse>() {};
    return apiClient.invokeAPI("AppsApi.appsGameCenterDetailGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterPlatform filter by attribute &#39;platform&#39; (optional)
   * @param filterVersionString filter by attribute &#39;versionString&#39; (optional)
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
  public GameCenterEnabledVersionsResponse appsGameCenterEnabledVersionsGetToManyRelated(String id, List<String> filterPlatform, List<String> filterVersionString, List<String> filterId, List<String> sort, List<String> fieldsGameCenterEnabledVersions, List<String> fieldsApps, Integer limit, Integer limitCompatibleVersions, List<String> include) throws ApiException {
    return appsGameCenterEnabledVersionsGetToManyRelatedWithHttpInfo(id, filterPlatform, filterVersionString, filterId, sort, fieldsGameCenterEnabledVersions, fieldsApps, limit, limitCompatibleVersions, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterPlatform filter by attribute &#39;platform&#39; (optional)
   * @param filterVersionString filter by attribute &#39;versionString&#39; (optional)
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
  public ApiResponse<GameCenterEnabledVersionsResponse> appsGameCenterEnabledVersionsGetToManyRelatedWithHttpInfo(String id, List<String> filterPlatform, List<String> filterVersionString, List<String> filterId, List<String> sort, List<String> fieldsGameCenterEnabledVersions, List<String> fieldsApps, Integer limit, Integer limitCompatibleVersions, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appsGameCenterEnabledVersionsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/apps/{id}/gameCenterEnabledVersions"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[platform]", filterPlatform)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[versionString]", filterVersionString));
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
    return apiClient.invokeAPI("AppsApi.appsGameCenterEnabledVersionsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param filterAppStoreVersionsAppStoreState filter by attribute &#39;appStoreVersions.appStoreState&#39; (optional)
   * @param filterAppStoreVersionsAppVersionState filter by attribute &#39;appStoreVersions.appVersionState&#39; (optional)
   * @param filterAppStoreVersionsPlatform filter by attribute &#39;appStoreVersions.platform&#39; (optional)
   * @param filterBundleId filter by attribute &#39;bundleId&#39; (optional)
   * @param filterName filter by attribute &#39;name&#39; (optional)
   * @param filterSku filter by attribute &#39;sku&#39; (optional)
   * @param filterAppStoreVersions filter by id(s) of related &#39;appStoreVersions&#39; (optional)
   * @param filterId filter by id(s) (optional)
   * @param existsGameCenterEnabledVersions filter by existence or non-existence of related &#39;gameCenterEnabledVersions&#39; (optional)
   * @param sort comma-separated list of sort expressions; resources will be sorted as specified (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsBetaAppReviewDetails the fields to include for returned resources of type betaAppReviewDetails (optional)
   * @param fieldsGameCenterDetails the fields to include for returned resources of type gameCenterDetails (optional)
   * @param fieldsAppPriceSchedules the fields to include for returned resources of type appPriceSchedules (optional)
   * @param fieldsCiProducts the fields to include for returned resources of type ciProducts (optional)
   * @param fieldsAlternativeDistributionKeys the fields to include for returned resources of type alternativeDistributionKeys (optional)
   * @param fieldsReviewSubmissions the fields to include for returned resources of type reviewSubmissions (optional)
   * @param fieldsBetaGroups the fields to include for returned resources of type betaGroups (optional)
   * @param fieldsPromotedPurchases the fields to include for returned resources of type promotedPurchases (optional)
   * @param fieldsAppAvailabilities the fields to include for returned resources of type appAvailabilities (optional)
   * @param fieldsCustomerReviews the fields to include for returned resources of type customerReviews (optional)
   * @param fieldsAppEvents the fields to include for returned resources of type appEvents (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @param fieldsBetaLicenseAgreements the fields to include for returned resources of type betaLicenseAgreements (optional)
   * @param fieldsMarketplaceSearchDetails the fields to include for returned resources of type marketplaceSearchDetails (optional)
   * @param fieldsAppClips the fields to include for returned resources of type appClips (optional)
   * @param fieldsAppInfos the fields to include for returned resources of type appInfos (optional)
   * @param fieldsBetaAppLocalizations the fields to include for returned resources of type betaAppLocalizations (optional)
   * @param fieldsAppPricePoints the fields to include for returned resources of type appPricePoints (optional)
   * @param fieldsInAppPurchases the fields to include for returned resources of type inAppPurchases (optional)
   * @param fieldsPreReleaseVersions the fields to include for returned resources of type preReleaseVersions (optional)
   * @param fieldsSubscriptionGroups the fields to include for returned resources of type subscriptionGroups (optional)
   * @param fieldsAnalyticsReportRequests the fields to include for returned resources of type analyticsReportRequests (optional)
   * @param fieldsAppPreOrders the fields to include for returned resources of type appPreOrders (optional)
   * @param fieldsAppStoreVersionExperiments the fields to include for returned resources of type appStoreVersionExperiments (optional)
   * @param fieldsGameCenterEnabledVersions the fields to include for returned resources of type gameCenterEnabledVersions (optional)
   * @param fieldsSubscriptionGracePeriods the fields to include for returned resources of type subscriptionGracePeriods (optional)
   * @param fieldsEndUserLicenseAgreements the fields to include for returned resources of type endUserLicenseAgreements (optional)
   * @param fieldsAppStoreVersions the fields to include for returned resources of type appStoreVersions (optional)
   * @param fieldsAppCustomProductPages the fields to include for returned resources of type appCustomProductPages (optional)
   * @param fieldsAppEncryptionDeclarations the fields to include for returned resources of type appEncryptionDeclarations (optional)
   * @param fieldsPerfPowerMetrics the fields to include for returned resources of type perfPowerMetrics (optional)
   * @param limitAppClips maximum number of related appClips returned (when they are included) (optional)
   * @param limitAppCustomProductPages maximum number of related appCustomProductPages returned (when they are included) (optional)
   * @param limitAppEncryptionDeclarations maximum number of related appEncryptionDeclarations returned (when they are included) (optional)
   * @param limitAppEvents maximum number of related appEvents returned (when they are included) (optional)
   * @param limitAppInfos maximum number of related appInfos returned (when they are included) (optional)
   * @param limitAppStoreVersionExperimentsV2 maximum number of related appStoreVersionExperimentsV2 returned (when they are included) (optional)
   * @param limitAppStoreVersions maximum number of related appStoreVersions returned (when they are included) (optional)
   * @param limitBetaAppLocalizations maximum number of related betaAppLocalizations returned (when they are included) (optional)
   * @param limitBetaGroups maximum number of related betaGroups returned (when they are included) (optional)
   * @param limitBuilds maximum number of related builds returned (when they are included) (optional)
   * @param limitGameCenterEnabledVersions maximum number of related gameCenterEnabledVersions returned (when they are included) (optional)
   * @param limitInAppPurchases maximum number of related inAppPurchases returned (when they are included) (optional)
   * @param limitInAppPurchasesV2 maximum number of related inAppPurchasesV2 returned (when they are included) (optional)
   * @param limitPreReleaseVersions maximum number of related preReleaseVersions returned (when they are included) (optional)
   * @param limitPromotedPurchases maximum number of related promotedPurchases returned (when they are included) (optional)
   * @param limitReviewSubmissions maximum number of related reviewSubmissions returned (when they are included) (optional)
   * @param limitSubscriptionGroups maximum number of related subscriptionGroups returned (when they are included) (optional)
   * @return AppsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of Apps </td><td>  -  </td></tr>
     </table>
   */
  public AppsResponse appsGetCollection(List<String> filterAppStoreVersionsAppStoreState, List<String> filterAppStoreVersionsAppVersionState, List<String> filterAppStoreVersionsPlatform, List<String> filterBundleId, List<String> filterName, List<String> filterSku, List<String> filterAppStoreVersions, List<String> filterId, Boolean existsGameCenterEnabledVersions, List<String> sort, List<String> fieldsApps, Integer limit, List<String> include, List<String> fieldsBetaAppReviewDetails, List<String> fieldsGameCenterDetails, List<String> fieldsAppPriceSchedules, List<String> fieldsCiProducts, List<String> fieldsAlternativeDistributionKeys, List<String> fieldsReviewSubmissions, List<String> fieldsBetaGroups, List<String> fieldsPromotedPurchases, List<String> fieldsAppAvailabilities, List<String> fieldsCustomerReviews, List<String> fieldsAppEvents, List<String> fieldsBuilds, List<String> fieldsBetaLicenseAgreements, List<String> fieldsMarketplaceSearchDetails, List<String> fieldsAppClips, List<String> fieldsAppInfos, List<String> fieldsBetaAppLocalizations, List<String> fieldsAppPricePoints, List<String> fieldsInAppPurchases, List<String> fieldsPreReleaseVersions, List<String> fieldsSubscriptionGroups, List<String> fieldsAnalyticsReportRequests, List<String> fieldsAppPreOrders, List<String> fieldsAppStoreVersionExperiments, List<String> fieldsGameCenterEnabledVersions, List<String> fieldsSubscriptionGracePeriods, List<String> fieldsEndUserLicenseAgreements, List<String> fieldsAppStoreVersions, List<String> fieldsAppCustomProductPages, List<String> fieldsAppEncryptionDeclarations, List<String> fieldsPerfPowerMetrics, Integer limitAppClips, Integer limitAppCustomProductPages, Integer limitAppEncryptionDeclarations, Integer limitAppEvents, Integer limitAppInfos, Integer limitAppStoreVersionExperimentsV2, Integer limitAppStoreVersions, Integer limitBetaAppLocalizations, Integer limitBetaGroups, Integer limitBuilds, Integer limitGameCenterEnabledVersions, Integer limitInAppPurchases, Integer limitInAppPurchasesV2, Integer limitPreReleaseVersions, Integer limitPromotedPurchases, Integer limitReviewSubmissions, Integer limitSubscriptionGroups) throws ApiException {
    return appsGetCollectionWithHttpInfo(filterAppStoreVersionsAppStoreState, filterAppStoreVersionsAppVersionState, filterAppStoreVersionsPlatform, filterBundleId, filterName, filterSku, filterAppStoreVersions, filterId, existsGameCenterEnabledVersions, sort, fieldsApps, limit, include, fieldsBetaAppReviewDetails, fieldsGameCenterDetails, fieldsAppPriceSchedules, fieldsCiProducts, fieldsAlternativeDistributionKeys, fieldsReviewSubmissions, fieldsBetaGroups, fieldsPromotedPurchases, fieldsAppAvailabilities, fieldsCustomerReviews, fieldsAppEvents, fieldsBuilds, fieldsBetaLicenseAgreements, fieldsMarketplaceSearchDetails, fieldsAppClips, fieldsAppInfos, fieldsBetaAppLocalizations, fieldsAppPricePoints, fieldsInAppPurchases, fieldsPreReleaseVersions, fieldsSubscriptionGroups, fieldsAnalyticsReportRequests, fieldsAppPreOrders, fieldsAppStoreVersionExperiments, fieldsGameCenterEnabledVersions, fieldsSubscriptionGracePeriods, fieldsEndUserLicenseAgreements, fieldsAppStoreVersions, fieldsAppCustomProductPages, fieldsAppEncryptionDeclarations, fieldsPerfPowerMetrics, limitAppClips, limitAppCustomProductPages, limitAppEncryptionDeclarations, limitAppEvents, limitAppInfos, limitAppStoreVersionExperimentsV2, limitAppStoreVersions, limitBetaAppLocalizations, limitBetaGroups, limitBuilds, limitGameCenterEnabledVersions, limitInAppPurchases, limitInAppPurchasesV2, limitPreReleaseVersions, limitPromotedPurchases, limitReviewSubmissions, limitSubscriptionGroups).getData();
  }

  /**
   * 
   * 
   * @param filterAppStoreVersionsAppStoreState filter by attribute &#39;appStoreVersions.appStoreState&#39; (optional)
   * @param filterAppStoreVersionsAppVersionState filter by attribute &#39;appStoreVersions.appVersionState&#39; (optional)
   * @param filterAppStoreVersionsPlatform filter by attribute &#39;appStoreVersions.platform&#39; (optional)
   * @param filterBundleId filter by attribute &#39;bundleId&#39; (optional)
   * @param filterName filter by attribute &#39;name&#39; (optional)
   * @param filterSku filter by attribute &#39;sku&#39; (optional)
   * @param filterAppStoreVersions filter by id(s) of related &#39;appStoreVersions&#39; (optional)
   * @param filterId filter by id(s) (optional)
   * @param existsGameCenterEnabledVersions filter by existence or non-existence of related &#39;gameCenterEnabledVersions&#39; (optional)
   * @param sort comma-separated list of sort expressions; resources will be sorted as specified (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsBetaAppReviewDetails the fields to include for returned resources of type betaAppReviewDetails (optional)
   * @param fieldsGameCenterDetails the fields to include for returned resources of type gameCenterDetails (optional)
   * @param fieldsAppPriceSchedules the fields to include for returned resources of type appPriceSchedules (optional)
   * @param fieldsCiProducts the fields to include for returned resources of type ciProducts (optional)
   * @param fieldsAlternativeDistributionKeys the fields to include for returned resources of type alternativeDistributionKeys (optional)
   * @param fieldsReviewSubmissions the fields to include for returned resources of type reviewSubmissions (optional)
   * @param fieldsBetaGroups the fields to include for returned resources of type betaGroups (optional)
   * @param fieldsPromotedPurchases the fields to include for returned resources of type promotedPurchases (optional)
   * @param fieldsAppAvailabilities the fields to include for returned resources of type appAvailabilities (optional)
   * @param fieldsCustomerReviews the fields to include for returned resources of type customerReviews (optional)
   * @param fieldsAppEvents the fields to include for returned resources of type appEvents (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @param fieldsBetaLicenseAgreements the fields to include for returned resources of type betaLicenseAgreements (optional)
   * @param fieldsMarketplaceSearchDetails the fields to include for returned resources of type marketplaceSearchDetails (optional)
   * @param fieldsAppClips the fields to include for returned resources of type appClips (optional)
   * @param fieldsAppInfos the fields to include for returned resources of type appInfos (optional)
   * @param fieldsBetaAppLocalizations the fields to include for returned resources of type betaAppLocalizations (optional)
   * @param fieldsAppPricePoints the fields to include for returned resources of type appPricePoints (optional)
   * @param fieldsInAppPurchases the fields to include for returned resources of type inAppPurchases (optional)
   * @param fieldsPreReleaseVersions the fields to include for returned resources of type preReleaseVersions (optional)
   * @param fieldsSubscriptionGroups the fields to include for returned resources of type subscriptionGroups (optional)
   * @param fieldsAnalyticsReportRequests the fields to include for returned resources of type analyticsReportRequests (optional)
   * @param fieldsAppPreOrders the fields to include for returned resources of type appPreOrders (optional)
   * @param fieldsAppStoreVersionExperiments the fields to include for returned resources of type appStoreVersionExperiments (optional)
   * @param fieldsGameCenterEnabledVersions the fields to include for returned resources of type gameCenterEnabledVersions (optional)
   * @param fieldsSubscriptionGracePeriods the fields to include for returned resources of type subscriptionGracePeriods (optional)
   * @param fieldsEndUserLicenseAgreements the fields to include for returned resources of type endUserLicenseAgreements (optional)
   * @param fieldsAppStoreVersions the fields to include for returned resources of type appStoreVersions (optional)
   * @param fieldsAppCustomProductPages the fields to include for returned resources of type appCustomProductPages (optional)
   * @param fieldsAppEncryptionDeclarations the fields to include for returned resources of type appEncryptionDeclarations (optional)
   * @param fieldsPerfPowerMetrics the fields to include for returned resources of type perfPowerMetrics (optional)
   * @param limitAppClips maximum number of related appClips returned (when they are included) (optional)
   * @param limitAppCustomProductPages maximum number of related appCustomProductPages returned (when they are included) (optional)
   * @param limitAppEncryptionDeclarations maximum number of related appEncryptionDeclarations returned (when they are included) (optional)
   * @param limitAppEvents maximum number of related appEvents returned (when they are included) (optional)
   * @param limitAppInfos maximum number of related appInfos returned (when they are included) (optional)
   * @param limitAppStoreVersionExperimentsV2 maximum number of related appStoreVersionExperimentsV2 returned (when they are included) (optional)
   * @param limitAppStoreVersions maximum number of related appStoreVersions returned (when they are included) (optional)
   * @param limitBetaAppLocalizations maximum number of related betaAppLocalizations returned (when they are included) (optional)
   * @param limitBetaGroups maximum number of related betaGroups returned (when they are included) (optional)
   * @param limitBuilds maximum number of related builds returned (when they are included) (optional)
   * @param limitGameCenterEnabledVersions maximum number of related gameCenterEnabledVersions returned (when they are included) (optional)
   * @param limitInAppPurchases maximum number of related inAppPurchases returned (when they are included) (optional)
   * @param limitInAppPurchasesV2 maximum number of related inAppPurchasesV2 returned (when they are included) (optional)
   * @param limitPreReleaseVersions maximum number of related preReleaseVersions returned (when they are included) (optional)
   * @param limitPromotedPurchases maximum number of related promotedPurchases returned (when they are included) (optional)
   * @param limitReviewSubmissions maximum number of related reviewSubmissions returned (when they are included) (optional)
   * @param limitSubscriptionGroups maximum number of related subscriptionGroups returned (when they are included) (optional)
   * @return ApiResponse&lt;AppsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of Apps </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppsResponse> appsGetCollectionWithHttpInfo(List<String> filterAppStoreVersionsAppStoreState, List<String> filterAppStoreVersionsAppVersionState, List<String> filterAppStoreVersionsPlatform, List<String> filterBundleId, List<String> filterName, List<String> filterSku, List<String> filterAppStoreVersions, List<String> filterId, Boolean existsGameCenterEnabledVersions, List<String> sort, List<String> fieldsApps, Integer limit, List<String> include, List<String> fieldsBetaAppReviewDetails, List<String> fieldsGameCenterDetails, List<String> fieldsAppPriceSchedules, List<String> fieldsCiProducts, List<String> fieldsAlternativeDistributionKeys, List<String> fieldsReviewSubmissions, List<String> fieldsBetaGroups, List<String> fieldsPromotedPurchases, List<String> fieldsAppAvailabilities, List<String> fieldsCustomerReviews, List<String> fieldsAppEvents, List<String> fieldsBuilds, List<String> fieldsBetaLicenseAgreements, List<String> fieldsMarketplaceSearchDetails, List<String> fieldsAppClips, List<String> fieldsAppInfos, List<String> fieldsBetaAppLocalizations, List<String> fieldsAppPricePoints, List<String> fieldsInAppPurchases, List<String> fieldsPreReleaseVersions, List<String> fieldsSubscriptionGroups, List<String> fieldsAnalyticsReportRequests, List<String> fieldsAppPreOrders, List<String> fieldsAppStoreVersionExperiments, List<String> fieldsGameCenterEnabledVersions, List<String> fieldsSubscriptionGracePeriods, List<String> fieldsEndUserLicenseAgreements, List<String> fieldsAppStoreVersions, List<String> fieldsAppCustomProductPages, List<String> fieldsAppEncryptionDeclarations, List<String> fieldsPerfPowerMetrics, Integer limitAppClips, Integer limitAppCustomProductPages, Integer limitAppEncryptionDeclarations, Integer limitAppEvents, Integer limitAppInfos, Integer limitAppStoreVersionExperimentsV2, Integer limitAppStoreVersions, Integer limitBetaAppLocalizations, Integer limitBetaGroups, Integer limitBuilds, Integer limitGameCenterEnabledVersions, Integer limitInAppPurchases, Integer limitInAppPurchasesV2, Integer limitPreReleaseVersions, Integer limitPromotedPurchases, Integer limitReviewSubmissions, Integer limitSubscriptionGroups) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[appStoreVersions.appStoreState]", filterAppStoreVersionsAppStoreState)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[appStoreVersions.appVersionState]", filterAppStoreVersionsAppVersionState));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[appStoreVersions.platform]", filterAppStoreVersionsPlatform));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[bundleId]", filterBundleId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[name]", filterName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[sku]", filterSku));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[appStoreVersions]", filterAppStoreVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[id]", filterId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "exists[gameCenterEnabledVersions]", existsGameCenterEnabledVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[apps]", fieldsApps));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[betaAppReviewDetails]", fieldsBetaAppReviewDetails));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterDetails]", fieldsGameCenterDetails));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appPriceSchedules]", fieldsAppPriceSchedules));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[ciProducts]", fieldsCiProducts));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[alternativeDistributionKeys]", fieldsAlternativeDistributionKeys));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[reviewSubmissions]", fieldsReviewSubmissions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[betaGroups]", fieldsBetaGroups));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[promotedPurchases]", fieldsPromotedPurchases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appAvailabilities]", fieldsAppAvailabilities));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[customerReviews]", fieldsCustomerReviews));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appEvents]", fieldsAppEvents));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[builds]", fieldsBuilds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[betaLicenseAgreements]", fieldsBetaLicenseAgreements));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[marketplaceSearchDetails]", fieldsMarketplaceSearchDetails));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appClips]", fieldsAppClips));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appInfos]", fieldsAppInfos));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[betaAppLocalizations]", fieldsBetaAppLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appPricePoints]", fieldsAppPricePoints));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[inAppPurchases]", fieldsInAppPurchases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[preReleaseVersions]", fieldsPreReleaseVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptionGroups]", fieldsSubscriptionGroups));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[analyticsReportRequests]", fieldsAnalyticsReportRequests));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appPreOrders]", fieldsAppPreOrders));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersionExperiments]", fieldsAppStoreVersionExperiments));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterEnabledVersions]", fieldsGameCenterEnabledVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptionGracePeriods]", fieldsSubscriptionGracePeriods));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[endUserLicenseAgreements]", fieldsEndUserLicenseAgreements));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersions]", fieldsAppStoreVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appCustomProductPages]", fieldsAppCustomProductPages));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appEncryptionDeclarations]", fieldsAppEncryptionDeclarations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[perfPowerMetrics]", fieldsPerfPowerMetrics));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appClips]", limitAppClips));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appCustomProductPages]", limitAppCustomProductPages));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appEncryptionDeclarations]", limitAppEncryptionDeclarations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appEvents]", limitAppEvents));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appInfos]", limitAppInfos));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appStoreVersionExperimentsV2]", limitAppStoreVersionExperimentsV2));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appStoreVersions]", limitAppStoreVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[betaAppLocalizations]", limitBetaAppLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[betaGroups]", limitBetaGroups));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[builds]", limitBuilds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[gameCenterEnabledVersions]", limitGameCenterEnabledVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[inAppPurchases]", limitInAppPurchases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[inAppPurchasesV2]", limitInAppPurchasesV2));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[preReleaseVersions]", limitPreReleaseVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[promotedPurchases]", limitPromotedPurchases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[reviewSubmissions]", limitReviewSubmissions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[subscriptionGroups]", limitSubscriptionGroups));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppsResponse> localVarReturnType = new GenericType<AppsResponse>() {};
    return apiClient.invokeAPI("AppsApi.appsGetCollection", "/v1/apps", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsBetaAppReviewDetails the fields to include for returned resources of type betaAppReviewDetails (optional)
   * @param fieldsGameCenterDetails the fields to include for returned resources of type gameCenterDetails (optional)
   * @param fieldsAppPriceSchedules the fields to include for returned resources of type appPriceSchedules (optional)
   * @param fieldsCiProducts the fields to include for returned resources of type ciProducts (optional)
   * @param fieldsAlternativeDistributionKeys the fields to include for returned resources of type alternativeDistributionKeys (optional)
   * @param fieldsReviewSubmissions the fields to include for returned resources of type reviewSubmissions (optional)
   * @param fieldsBetaGroups the fields to include for returned resources of type betaGroups (optional)
   * @param fieldsPromotedPurchases the fields to include for returned resources of type promotedPurchases (optional)
   * @param fieldsAppAvailabilities the fields to include for returned resources of type appAvailabilities (optional)
   * @param fieldsCustomerReviews the fields to include for returned resources of type customerReviews (optional)
   * @param fieldsAppEvents the fields to include for returned resources of type appEvents (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @param fieldsBetaLicenseAgreements the fields to include for returned resources of type betaLicenseAgreements (optional)
   * @param fieldsMarketplaceSearchDetails the fields to include for returned resources of type marketplaceSearchDetails (optional)
   * @param fieldsAppClips the fields to include for returned resources of type appClips (optional)
   * @param fieldsAppInfos the fields to include for returned resources of type appInfos (optional)
   * @param fieldsBetaAppLocalizations the fields to include for returned resources of type betaAppLocalizations (optional)
   * @param fieldsAppPricePoints the fields to include for returned resources of type appPricePoints (optional)
   * @param fieldsInAppPurchases the fields to include for returned resources of type inAppPurchases (optional)
   * @param fieldsPreReleaseVersions the fields to include for returned resources of type preReleaseVersions (optional)
   * @param fieldsSubscriptionGroups the fields to include for returned resources of type subscriptionGroups (optional)
   * @param fieldsAnalyticsReportRequests the fields to include for returned resources of type analyticsReportRequests (optional)
   * @param fieldsAppPreOrders the fields to include for returned resources of type appPreOrders (optional)
   * @param fieldsAppStoreVersionExperiments the fields to include for returned resources of type appStoreVersionExperiments (optional)
   * @param fieldsGameCenterEnabledVersions the fields to include for returned resources of type gameCenterEnabledVersions (optional)
   * @param fieldsSubscriptionGracePeriods the fields to include for returned resources of type subscriptionGracePeriods (optional)
   * @param fieldsEndUserLicenseAgreements the fields to include for returned resources of type endUserLicenseAgreements (optional)
   * @param fieldsAppStoreVersions the fields to include for returned resources of type appStoreVersions (optional)
   * @param fieldsAppCustomProductPages the fields to include for returned resources of type appCustomProductPages (optional)
   * @param fieldsAppEncryptionDeclarations the fields to include for returned resources of type appEncryptionDeclarations (optional)
   * @param fieldsPerfPowerMetrics the fields to include for returned resources of type perfPowerMetrics (optional)
   * @param limitAppClips maximum number of related appClips returned (when they are included) (optional)
   * @param limitAppCustomProductPages maximum number of related appCustomProductPages returned (when they are included) (optional)
   * @param limitAppEncryptionDeclarations maximum number of related appEncryptionDeclarations returned (when they are included) (optional)
   * @param limitAppEvents maximum number of related appEvents returned (when they are included) (optional)
   * @param limitAppInfos maximum number of related appInfos returned (when they are included) (optional)
   * @param limitAppStoreVersionExperimentsV2 maximum number of related appStoreVersionExperimentsV2 returned (when they are included) (optional)
   * @param limitAppStoreVersions maximum number of related appStoreVersions returned (when they are included) (optional)
   * @param limitBetaAppLocalizations maximum number of related betaAppLocalizations returned (when they are included) (optional)
   * @param limitBetaGroups maximum number of related betaGroups returned (when they are included) (optional)
   * @param limitBuilds maximum number of related builds returned (when they are included) (optional)
   * @param limitGameCenterEnabledVersions maximum number of related gameCenterEnabledVersions returned (when they are included) (optional)
   * @param limitInAppPurchases maximum number of related inAppPurchases returned (when they are included) (optional)
   * @param limitInAppPurchasesV2 maximum number of related inAppPurchasesV2 returned (when they are included) (optional)
   * @param limitPreReleaseVersions maximum number of related preReleaseVersions returned (when they are included) (optional)
   * @param limitPromotedPurchases maximum number of related promotedPurchases returned (when they are included) (optional)
   * @param limitReviewSubmissions maximum number of related reviewSubmissions returned (when they are included) (optional)
   * @param limitSubscriptionGroups maximum number of related subscriptionGroups returned (when they are included) (optional)
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
  public AppResponse appsGetInstance(String id, List<String> fieldsApps, List<String> include, List<String> fieldsBetaAppReviewDetails, List<String> fieldsGameCenterDetails, List<String> fieldsAppPriceSchedules, List<String> fieldsCiProducts, List<String> fieldsAlternativeDistributionKeys, List<String> fieldsReviewSubmissions, List<String> fieldsBetaGroups, List<String> fieldsPromotedPurchases, List<String> fieldsAppAvailabilities, List<String> fieldsCustomerReviews, List<String> fieldsAppEvents, List<String> fieldsBuilds, List<String> fieldsBetaLicenseAgreements, List<String> fieldsMarketplaceSearchDetails, List<String> fieldsAppClips, List<String> fieldsAppInfos, List<String> fieldsBetaAppLocalizations, List<String> fieldsAppPricePoints, List<String> fieldsInAppPurchases, List<String> fieldsPreReleaseVersions, List<String> fieldsSubscriptionGroups, List<String> fieldsAnalyticsReportRequests, List<String> fieldsAppPreOrders, List<String> fieldsAppStoreVersionExperiments, List<String> fieldsGameCenterEnabledVersions, List<String> fieldsSubscriptionGracePeriods, List<String> fieldsEndUserLicenseAgreements, List<String> fieldsAppStoreVersions, List<String> fieldsAppCustomProductPages, List<String> fieldsAppEncryptionDeclarations, List<String> fieldsPerfPowerMetrics, Integer limitAppClips, Integer limitAppCustomProductPages, Integer limitAppEncryptionDeclarations, Integer limitAppEvents, Integer limitAppInfos, Integer limitAppStoreVersionExperimentsV2, Integer limitAppStoreVersions, Integer limitBetaAppLocalizations, Integer limitBetaGroups, Integer limitBuilds, Integer limitGameCenterEnabledVersions, Integer limitInAppPurchases, Integer limitInAppPurchasesV2, Integer limitPreReleaseVersions, Integer limitPromotedPurchases, Integer limitReviewSubmissions, Integer limitSubscriptionGroups) throws ApiException {
    return appsGetInstanceWithHttpInfo(id, fieldsApps, include, fieldsBetaAppReviewDetails, fieldsGameCenterDetails, fieldsAppPriceSchedules, fieldsCiProducts, fieldsAlternativeDistributionKeys, fieldsReviewSubmissions, fieldsBetaGroups, fieldsPromotedPurchases, fieldsAppAvailabilities, fieldsCustomerReviews, fieldsAppEvents, fieldsBuilds, fieldsBetaLicenseAgreements, fieldsMarketplaceSearchDetails, fieldsAppClips, fieldsAppInfos, fieldsBetaAppLocalizations, fieldsAppPricePoints, fieldsInAppPurchases, fieldsPreReleaseVersions, fieldsSubscriptionGroups, fieldsAnalyticsReportRequests, fieldsAppPreOrders, fieldsAppStoreVersionExperiments, fieldsGameCenterEnabledVersions, fieldsSubscriptionGracePeriods, fieldsEndUserLicenseAgreements, fieldsAppStoreVersions, fieldsAppCustomProductPages, fieldsAppEncryptionDeclarations, fieldsPerfPowerMetrics, limitAppClips, limitAppCustomProductPages, limitAppEncryptionDeclarations, limitAppEvents, limitAppInfos, limitAppStoreVersionExperimentsV2, limitAppStoreVersions, limitBetaAppLocalizations, limitBetaGroups, limitBuilds, limitGameCenterEnabledVersions, limitInAppPurchases, limitInAppPurchasesV2, limitPreReleaseVersions, limitPromotedPurchases, limitReviewSubmissions, limitSubscriptionGroups).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsBetaAppReviewDetails the fields to include for returned resources of type betaAppReviewDetails (optional)
   * @param fieldsGameCenterDetails the fields to include for returned resources of type gameCenterDetails (optional)
   * @param fieldsAppPriceSchedules the fields to include for returned resources of type appPriceSchedules (optional)
   * @param fieldsCiProducts the fields to include for returned resources of type ciProducts (optional)
   * @param fieldsAlternativeDistributionKeys the fields to include for returned resources of type alternativeDistributionKeys (optional)
   * @param fieldsReviewSubmissions the fields to include for returned resources of type reviewSubmissions (optional)
   * @param fieldsBetaGroups the fields to include for returned resources of type betaGroups (optional)
   * @param fieldsPromotedPurchases the fields to include for returned resources of type promotedPurchases (optional)
   * @param fieldsAppAvailabilities the fields to include for returned resources of type appAvailabilities (optional)
   * @param fieldsCustomerReviews the fields to include for returned resources of type customerReviews (optional)
   * @param fieldsAppEvents the fields to include for returned resources of type appEvents (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @param fieldsBetaLicenseAgreements the fields to include for returned resources of type betaLicenseAgreements (optional)
   * @param fieldsMarketplaceSearchDetails the fields to include for returned resources of type marketplaceSearchDetails (optional)
   * @param fieldsAppClips the fields to include for returned resources of type appClips (optional)
   * @param fieldsAppInfos the fields to include for returned resources of type appInfos (optional)
   * @param fieldsBetaAppLocalizations the fields to include for returned resources of type betaAppLocalizations (optional)
   * @param fieldsAppPricePoints the fields to include for returned resources of type appPricePoints (optional)
   * @param fieldsInAppPurchases the fields to include for returned resources of type inAppPurchases (optional)
   * @param fieldsPreReleaseVersions the fields to include for returned resources of type preReleaseVersions (optional)
   * @param fieldsSubscriptionGroups the fields to include for returned resources of type subscriptionGroups (optional)
   * @param fieldsAnalyticsReportRequests the fields to include for returned resources of type analyticsReportRequests (optional)
   * @param fieldsAppPreOrders the fields to include for returned resources of type appPreOrders (optional)
   * @param fieldsAppStoreVersionExperiments the fields to include for returned resources of type appStoreVersionExperiments (optional)
   * @param fieldsGameCenterEnabledVersions the fields to include for returned resources of type gameCenterEnabledVersions (optional)
   * @param fieldsSubscriptionGracePeriods the fields to include for returned resources of type subscriptionGracePeriods (optional)
   * @param fieldsEndUserLicenseAgreements the fields to include for returned resources of type endUserLicenseAgreements (optional)
   * @param fieldsAppStoreVersions the fields to include for returned resources of type appStoreVersions (optional)
   * @param fieldsAppCustomProductPages the fields to include for returned resources of type appCustomProductPages (optional)
   * @param fieldsAppEncryptionDeclarations the fields to include for returned resources of type appEncryptionDeclarations (optional)
   * @param fieldsPerfPowerMetrics the fields to include for returned resources of type perfPowerMetrics (optional)
   * @param limitAppClips maximum number of related appClips returned (when they are included) (optional)
   * @param limitAppCustomProductPages maximum number of related appCustomProductPages returned (when they are included) (optional)
   * @param limitAppEncryptionDeclarations maximum number of related appEncryptionDeclarations returned (when they are included) (optional)
   * @param limitAppEvents maximum number of related appEvents returned (when they are included) (optional)
   * @param limitAppInfos maximum number of related appInfos returned (when they are included) (optional)
   * @param limitAppStoreVersionExperimentsV2 maximum number of related appStoreVersionExperimentsV2 returned (when they are included) (optional)
   * @param limitAppStoreVersions maximum number of related appStoreVersions returned (when they are included) (optional)
   * @param limitBetaAppLocalizations maximum number of related betaAppLocalizations returned (when they are included) (optional)
   * @param limitBetaGroups maximum number of related betaGroups returned (when they are included) (optional)
   * @param limitBuilds maximum number of related builds returned (when they are included) (optional)
   * @param limitGameCenterEnabledVersions maximum number of related gameCenterEnabledVersions returned (when they are included) (optional)
   * @param limitInAppPurchases maximum number of related inAppPurchases returned (when they are included) (optional)
   * @param limitInAppPurchasesV2 maximum number of related inAppPurchasesV2 returned (when they are included) (optional)
   * @param limitPreReleaseVersions maximum number of related preReleaseVersions returned (when they are included) (optional)
   * @param limitPromotedPurchases maximum number of related promotedPurchases returned (when they are included) (optional)
   * @param limitReviewSubmissions maximum number of related reviewSubmissions returned (when they are included) (optional)
   * @param limitSubscriptionGroups maximum number of related subscriptionGroups returned (when they are included) (optional)
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
  public ApiResponse<AppResponse> appsGetInstanceWithHttpInfo(String id, List<String> fieldsApps, List<String> include, List<String> fieldsBetaAppReviewDetails, List<String> fieldsGameCenterDetails, List<String> fieldsAppPriceSchedules, List<String> fieldsCiProducts, List<String> fieldsAlternativeDistributionKeys, List<String> fieldsReviewSubmissions, List<String> fieldsBetaGroups, List<String> fieldsPromotedPurchases, List<String> fieldsAppAvailabilities, List<String> fieldsCustomerReviews, List<String> fieldsAppEvents, List<String> fieldsBuilds, List<String> fieldsBetaLicenseAgreements, List<String> fieldsMarketplaceSearchDetails, List<String> fieldsAppClips, List<String> fieldsAppInfos, List<String> fieldsBetaAppLocalizations, List<String> fieldsAppPricePoints, List<String> fieldsInAppPurchases, List<String> fieldsPreReleaseVersions, List<String> fieldsSubscriptionGroups, List<String> fieldsAnalyticsReportRequests, List<String> fieldsAppPreOrders, List<String> fieldsAppStoreVersionExperiments, List<String> fieldsGameCenterEnabledVersions, List<String> fieldsSubscriptionGracePeriods, List<String> fieldsEndUserLicenseAgreements, List<String> fieldsAppStoreVersions, List<String> fieldsAppCustomProductPages, List<String> fieldsAppEncryptionDeclarations, List<String> fieldsPerfPowerMetrics, Integer limitAppClips, Integer limitAppCustomProductPages, Integer limitAppEncryptionDeclarations, Integer limitAppEvents, Integer limitAppInfos, Integer limitAppStoreVersionExperimentsV2, Integer limitAppStoreVersions, Integer limitBetaAppLocalizations, Integer limitBetaGroups, Integer limitBuilds, Integer limitGameCenterEnabledVersions, Integer limitInAppPurchases, Integer limitInAppPurchasesV2, Integer limitPreReleaseVersions, Integer limitPromotedPurchases, Integer limitReviewSubmissions, Integer limitSubscriptionGroups) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/apps/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[apps]", fieldsApps)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[betaAppReviewDetails]", fieldsBetaAppReviewDetails));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterDetails]", fieldsGameCenterDetails));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appPriceSchedules]", fieldsAppPriceSchedules));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[ciProducts]", fieldsCiProducts));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[alternativeDistributionKeys]", fieldsAlternativeDistributionKeys));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[reviewSubmissions]", fieldsReviewSubmissions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[betaGroups]", fieldsBetaGroups));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[promotedPurchases]", fieldsPromotedPurchases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appAvailabilities]", fieldsAppAvailabilities));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[customerReviews]", fieldsCustomerReviews));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appEvents]", fieldsAppEvents));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[builds]", fieldsBuilds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[betaLicenseAgreements]", fieldsBetaLicenseAgreements));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[marketplaceSearchDetails]", fieldsMarketplaceSearchDetails));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appClips]", fieldsAppClips));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appInfos]", fieldsAppInfos));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[betaAppLocalizations]", fieldsBetaAppLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appPricePoints]", fieldsAppPricePoints));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[inAppPurchases]", fieldsInAppPurchases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[preReleaseVersions]", fieldsPreReleaseVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptionGroups]", fieldsSubscriptionGroups));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[analyticsReportRequests]", fieldsAnalyticsReportRequests));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appPreOrders]", fieldsAppPreOrders));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersionExperiments]", fieldsAppStoreVersionExperiments));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[gameCenterEnabledVersions]", fieldsGameCenterEnabledVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptionGracePeriods]", fieldsSubscriptionGracePeriods));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[endUserLicenseAgreements]", fieldsEndUserLicenseAgreements));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersions]", fieldsAppStoreVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appCustomProductPages]", fieldsAppCustomProductPages));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appEncryptionDeclarations]", fieldsAppEncryptionDeclarations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[perfPowerMetrics]", fieldsPerfPowerMetrics));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appClips]", limitAppClips));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appCustomProductPages]", limitAppCustomProductPages));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appEncryptionDeclarations]", limitAppEncryptionDeclarations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appEvents]", limitAppEvents));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appInfos]", limitAppInfos));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appStoreVersionExperimentsV2]", limitAppStoreVersionExperimentsV2));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appStoreVersions]", limitAppStoreVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[betaAppLocalizations]", limitBetaAppLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[betaGroups]", limitBetaGroups));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[builds]", limitBuilds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[gameCenterEnabledVersions]", limitGameCenterEnabledVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[inAppPurchases]", limitInAppPurchases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[inAppPurchasesV2]", limitInAppPurchasesV2));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[preReleaseVersions]", limitPreReleaseVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[promotedPurchases]", limitPromotedPurchases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[reviewSubmissions]", limitReviewSubmissions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[subscriptionGroups]", limitSubscriptionGroups));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppResponse> localVarReturnType = new GenericType<AppResponse>() {};
    return apiClient.invokeAPI("AppsApi.appsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterInAppPurchaseType filter by attribute &#39;inAppPurchaseType&#39; (optional)
   * @param filterCanBeSubmitted filter by canBeSubmitted (optional)
   * @param sort comma-separated list of sort expressions; resources will be sorted as specified (optional)
   * @param fieldsInAppPurchases the fields to include for returned resources of type inAppPurchases (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param limit maximum resources per page (optional)
   * @param limitApps maximum number of related apps returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return InAppPurchasesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of InAppPurchases </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public InAppPurchasesResponse appsInAppPurchasesGetToManyRelated(String id, List<String> filterInAppPurchaseType, List<String> filterCanBeSubmitted, List<String> sort, List<String> fieldsInAppPurchases, List<String> fieldsApps, Integer limit, Integer limitApps, List<String> include) throws ApiException {
    return appsInAppPurchasesGetToManyRelatedWithHttpInfo(id, filterInAppPurchaseType, filterCanBeSubmitted, sort, fieldsInAppPurchases, fieldsApps, limit, limitApps, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterInAppPurchaseType filter by attribute &#39;inAppPurchaseType&#39; (optional)
   * @param filterCanBeSubmitted filter by canBeSubmitted (optional)
   * @param sort comma-separated list of sort expressions; resources will be sorted as specified (optional)
   * @param fieldsInAppPurchases the fields to include for returned resources of type inAppPurchases (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param limit maximum resources per page (optional)
   * @param limitApps maximum number of related apps returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;InAppPurchasesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of InAppPurchases </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public ApiResponse<InAppPurchasesResponse> appsInAppPurchasesGetToManyRelatedWithHttpInfo(String id, List<String> filterInAppPurchaseType, List<String> filterCanBeSubmitted, List<String> sort, List<String> fieldsInAppPurchases, List<String> fieldsApps, Integer limit, Integer limitApps, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appsInAppPurchasesGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/apps/{id}/inAppPurchases"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[inAppPurchaseType]", filterInAppPurchaseType)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[canBeSubmitted]", filterCanBeSubmitted));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[inAppPurchases]", fieldsInAppPurchases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[apps]", fieldsApps));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[apps]", limitApps));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<InAppPurchasesResponse> localVarReturnType = new GenericType<InAppPurchasesResponse>() {};
    return apiClient.invokeAPI("AppsApi.appsInAppPurchasesGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterInAppPurchaseType filter by attribute &#39;inAppPurchaseType&#39; (optional)
   * @param filterName filter by attribute &#39;name&#39; (optional)
   * @param filterProductId filter by attribute &#39;productId&#39; (optional)
   * @param filterState filter by attribute &#39;state&#39; (optional)
   * @param sort comma-separated list of sort expressions; resources will be sorted as specified (optional)
   * @param fieldsInAppPurchaseAppStoreReviewScreenshots the fields to include for returned resources of type inAppPurchaseAppStoreReviewScreenshots (optional)
   * @param fieldsInAppPurchaseAvailabilities the fields to include for returned resources of type inAppPurchaseAvailabilities (optional)
   * @param fieldsPromotedPurchases the fields to include for returned resources of type promotedPurchases (optional)
   * @param fieldsInAppPurchaseLocalizations the fields to include for returned resources of type inAppPurchaseLocalizations (optional)
   * @param fieldsInAppPurchases the fields to include for returned resources of type inAppPurchases (optional)
   * @param fieldsInAppPurchasePriceSchedules the fields to include for returned resources of type inAppPurchasePriceSchedules (optional)
   * @param fieldsInAppPurchaseContents the fields to include for returned resources of type inAppPurchaseContents (optional)
   * @param limit maximum resources per page (optional)
   * @param limitInAppPurchaseLocalizations maximum number of related inAppPurchaseLocalizations returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return InAppPurchasesV2Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of InAppPurchases </td><td>  -  </td></tr>
     </table>
   */
  public InAppPurchasesV2Response appsInAppPurchasesV2GetToManyRelated(String id, List<String> filterInAppPurchaseType, List<String> filterName, List<String> filterProductId, List<String> filterState, List<String> sort, List<String> fieldsInAppPurchaseAppStoreReviewScreenshots, List<String> fieldsInAppPurchaseAvailabilities, List<String> fieldsPromotedPurchases, List<String> fieldsInAppPurchaseLocalizations, List<String> fieldsInAppPurchases, List<String> fieldsInAppPurchasePriceSchedules, List<String> fieldsInAppPurchaseContents, Integer limit, Integer limitInAppPurchaseLocalizations, List<String> include) throws ApiException {
    return appsInAppPurchasesV2GetToManyRelatedWithHttpInfo(id, filterInAppPurchaseType, filterName, filterProductId, filterState, sort, fieldsInAppPurchaseAppStoreReviewScreenshots, fieldsInAppPurchaseAvailabilities, fieldsPromotedPurchases, fieldsInAppPurchaseLocalizations, fieldsInAppPurchases, fieldsInAppPurchasePriceSchedules, fieldsInAppPurchaseContents, limit, limitInAppPurchaseLocalizations, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterInAppPurchaseType filter by attribute &#39;inAppPurchaseType&#39; (optional)
   * @param filterName filter by attribute &#39;name&#39; (optional)
   * @param filterProductId filter by attribute &#39;productId&#39; (optional)
   * @param filterState filter by attribute &#39;state&#39; (optional)
   * @param sort comma-separated list of sort expressions; resources will be sorted as specified (optional)
   * @param fieldsInAppPurchaseAppStoreReviewScreenshots the fields to include for returned resources of type inAppPurchaseAppStoreReviewScreenshots (optional)
   * @param fieldsInAppPurchaseAvailabilities the fields to include for returned resources of type inAppPurchaseAvailabilities (optional)
   * @param fieldsPromotedPurchases the fields to include for returned resources of type promotedPurchases (optional)
   * @param fieldsInAppPurchaseLocalizations the fields to include for returned resources of type inAppPurchaseLocalizations (optional)
   * @param fieldsInAppPurchases the fields to include for returned resources of type inAppPurchases (optional)
   * @param fieldsInAppPurchasePriceSchedules the fields to include for returned resources of type inAppPurchasePriceSchedules (optional)
   * @param fieldsInAppPurchaseContents the fields to include for returned resources of type inAppPurchaseContents (optional)
   * @param limit maximum resources per page (optional)
   * @param limitInAppPurchaseLocalizations maximum number of related inAppPurchaseLocalizations returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;InAppPurchasesV2Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of InAppPurchases </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InAppPurchasesV2Response> appsInAppPurchasesV2GetToManyRelatedWithHttpInfo(String id, List<String> filterInAppPurchaseType, List<String> filterName, List<String> filterProductId, List<String> filterState, List<String> sort, List<String> fieldsInAppPurchaseAppStoreReviewScreenshots, List<String> fieldsInAppPurchaseAvailabilities, List<String> fieldsPromotedPurchases, List<String> fieldsInAppPurchaseLocalizations, List<String> fieldsInAppPurchases, List<String> fieldsInAppPurchasePriceSchedules, List<String> fieldsInAppPurchaseContents, Integer limit, Integer limitInAppPurchaseLocalizations, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appsInAppPurchasesV2GetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/apps/{id}/inAppPurchasesV2"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[inAppPurchaseType]", filterInAppPurchaseType)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[name]", filterName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[productId]", filterProductId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[state]", filterState));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[inAppPurchaseAppStoreReviewScreenshots]", fieldsInAppPurchaseAppStoreReviewScreenshots));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[inAppPurchaseAvailabilities]", fieldsInAppPurchaseAvailabilities));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[promotedPurchases]", fieldsPromotedPurchases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[inAppPurchaseLocalizations]", fieldsInAppPurchaseLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[inAppPurchases]", fieldsInAppPurchases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[inAppPurchasePriceSchedules]", fieldsInAppPurchasePriceSchedules));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[inAppPurchaseContents]", fieldsInAppPurchaseContents));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[inAppPurchaseLocalizations]", limitInAppPurchaseLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<InAppPurchasesV2Response> localVarReturnType = new GenericType<InAppPurchasesV2Response>() {};
    return apiClient.invokeAPI("AppsApi.appsInAppPurchasesV2GetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsMarketplaceSearchDetails the fields to include for returned resources of type marketplaceSearchDetails (optional)
   * @return MarketplaceSearchDetailResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single MarketplaceSearchDetail </td><td>  -  </td></tr>
     </table>
   */
  public MarketplaceSearchDetailResponse appsMarketplaceSearchDetailGetToOneRelated(String id, List<String> fieldsMarketplaceSearchDetails) throws ApiException {
    return appsMarketplaceSearchDetailGetToOneRelatedWithHttpInfo(id, fieldsMarketplaceSearchDetails).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsMarketplaceSearchDetails the fields to include for returned resources of type marketplaceSearchDetails (optional)
   * @return ApiResponse&lt;MarketplaceSearchDetailResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single MarketplaceSearchDetail </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MarketplaceSearchDetailResponse> appsMarketplaceSearchDetailGetToOneRelatedWithHttpInfo(String id, List<String> fieldsMarketplaceSearchDetails) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appsMarketplaceSearchDetailGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/apps/{id}/marketplaceSearchDetail"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[marketplaceSearchDetails]", fieldsMarketplaceSearchDetails)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<MarketplaceSearchDetailResponse> localVarReturnType = new GenericType<MarketplaceSearchDetailResponse>() {};
    return apiClient.invokeAPI("AppsApi.appsMarketplaceSearchDetailGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
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
  public XcodeMetrics appsPerfPowerMetricsGetToManyRelated(String id, List<String> filterDeviceType, List<String> filterMetricType, List<String> filterPlatform) throws ApiException {
    return appsPerfPowerMetricsGetToManyRelatedWithHttpInfo(id, filterDeviceType, filterMetricType, filterPlatform).getData();
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
  public ApiResponse<XcodeMetrics> appsPerfPowerMetricsGetToManyRelatedWithHttpInfo(String id, List<String> filterDeviceType, List<String> filterMetricType, List<String> filterPlatform) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appsPerfPowerMetricsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/apps/{id}/perfPowerMetrics"
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
    return apiClient.invokeAPI("AppsApi.appsPerfPowerMetricsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppPreOrders the fields to include for returned resources of type appPreOrders (optional)
   * @return AppPreOrderWithoutIncludesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppPreOrder with get </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public AppPreOrderWithoutIncludesResponse appsPreOrderGetToOneRelated(String id, List<String> fieldsAppPreOrders) throws ApiException {
    return appsPreOrderGetToOneRelatedWithHttpInfo(id, fieldsAppPreOrders).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppPreOrders the fields to include for returned resources of type appPreOrders (optional)
   * @return ApiResponse&lt;AppPreOrderWithoutIncludesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppPreOrder with get </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public ApiResponse<AppPreOrderWithoutIncludesResponse> appsPreOrderGetToOneRelatedWithHttpInfo(String id, List<String> fieldsAppPreOrders) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appsPreOrderGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/apps/{id}/preOrder"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appPreOrders]", fieldsAppPreOrders)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppPreOrderWithoutIncludesResponse> localVarReturnType = new GenericType<AppPreOrderWithoutIncludesResponse>() {};
    return apiClient.invokeAPI("AppsApi.appsPreOrderGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsPreReleaseVersions the fields to include for returned resources of type preReleaseVersions (optional)
   * @param limit maximum resources per page (optional)
   * @return PreReleaseVersionsWithoutIncludesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of PreReleaseVersions with get </td><td>  -  </td></tr>
     </table>
   */
  public PreReleaseVersionsWithoutIncludesResponse appsPreReleaseVersionsGetToManyRelated(String id, List<String> fieldsPreReleaseVersions, Integer limit) throws ApiException {
    return appsPreReleaseVersionsGetToManyRelatedWithHttpInfo(id, fieldsPreReleaseVersions, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsPreReleaseVersions the fields to include for returned resources of type preReleaseVersions (optional)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;PreReleaseVersionsWithoutIncludesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of PreReleaseVersions with get </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PreReleaseVersionsWithoutIncludesResponse> appsPreReleaseVersionsGetToManyRelatedWithHttpInfo(String id, List<String> fieldsPreReleaseVersions, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appsPreReleaseVersionsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/apps/{id}/preReleaseVersions"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[preReleaseVersions]", fieldsPreReleaseVersions)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<PreReleaseVersionsWithoutIncludesResponse> localVarReturnType = new GenericType<PreReleaseVersionsWithoutIncludesResponse>() {};
    return apiClient.invokeAPI("AppsApi.appsPreReleaseVersionsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsPromotedPurchases the fields to include for returned resources of type promotedPurchases (optional)
   * @param fieldsSubscriptions the fields to include for returned resources of type subscriptions (optional)
   * @param fieldsInAppPurchases the fields to include for returned resources of type inAppPurchases (optional)
   * @param fieldsPromotedPurchaseImages the fields to include for returned resources of type promotedPurchaseImages (optional)
   * @param limit maximum resources per page (optional)
   * @param limitPromotionImages maximum number of related promotionImages returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return PromotedPurchasesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of PromotedPurchases </td><td>  -  </td></tr>
     </table>
   */
  public PromotedPurchasesResponse appsPromotedPurchasesGetToManyRelated(String id, List<String> fieldsPromotedPurchases, List<String> fieldsSubscriptions, List<String> fieldsInAppPurchases, List<String> fieldsPromotedPurchaseImages, Integer limit, Integer limitPromotionImages, List<String> include) throws ApiException {
    return appsPromotedPurchasesGetToManyRelatedWithHttpInfo(id, fieldsPromotedPurchases, fieldsSubscriptions, fieldsInAppPurchases, fieldsPromotedPurchaseImages, limit, limitPromotionImages, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsPromotedPurchases the fields to include for returned resources of type promotedPurchases (optional)
   * @param fieldsSubscriptions the fields to include for returned resources of type subscriptions (optional)
   * @param fieldsInAppPurchases the fields to include for returned resources of type inAppPurchases (optional)
   * @param fieldsPromotedPurchaseImages the fields to include for returned resources of type promotedPurchaseImages (optional)
   * @param limit maximum resources per page (optional)
   * @param limitPromotionImages maximum number of related promotionImages returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;PromotedPurchasesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of PromotedPurchases </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PromotedPurchasesResponse> appsPromotedPurchasesGetToManyRelatedWithHttpInfo(String id, List<String> fieldsPromotedPurchases, List<String> fieldsSubscriptions, List<String> fieldsInAppPurchases, List<String> fieldsPromotedPurchaseImages, Integer limit, Integer limitPromotionImages, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appsPromotedPurchasesGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/apps/{id}/promotedPurchases"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[promotedPurchases]", fieldsPromotedPurchases)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptions]", fieldsSubscriptions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[inAppPurchases]", fieldsInAppPurchases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[promotedPurchaseImages]", fieldsPromotedPurchaseImages));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[promotionImages]", limitPromotionImages));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<PromotedPurchasesResponse> localVarReturnType = new GenericType<PromotedPurchasesResponse>() {};
    return apiClient.invokeAPI("AppsApi.appsPromotedPurchasesGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param limit maximum resources per page (optional)
   * @return AppPromotedPurchasesLinkagesResponse
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
  public AppPromotedPurchasesLinkagesResponse appsPromotedPurchasesGetToManyRelationship(String id, Integer limit) throws ApiException {
    return appsPromotedPurchasesGetToManyRelationshipWithHttpInfo(id, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;AppPromotedPurchasesLinkagesResponse&gt;
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
  public ApiResponse<AppPromotedPurchasesLinkagesResponse> appsPromotedPurchasesGetToManyRelationshipWithHttpInfo(String id, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appsPromotedPurchasesGetToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/apps/{id}/relationships/promotedPurchases"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "limit", limit)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppPromotedPurchasesLinkagesResponse> localVarReturnType = new GenericType<AppPromotedPurchasesLinkagesResponse>() {};
    return apiClient.invokeAPI("AppsApi.appsPromotedPurchasesGetToManyRelationship", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appPromotedPurchasesLinkagesRequest List of related linkages (required)
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
  public void appsPromotedPurchasesReplaceToManyRelationship(String id, AppPromotedPurchasesLinkagesRequest appPromotedPurchasesLinkagesRequest) throws ApiException {
    appsPromotedPurchasesReplaceToManyRelationshipWithHttpInfo(id, appPromotedPurchasesLinkagesRequest);
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appPromotedPurchasesLinkagesRequest List of related linkages (required)
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
  public ApiResponse<Void> appsPromotedPurchasesReplaceToManyRelationshipWithHttpInfo(String id, AppPromotedPurchasesLinkagesRequest appPromotedPurchasesLinkagesRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appsPromotedPurchasesReplaceToManyRelationship");
    }
    if (appPromotedPurchasesLinkagesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appPromotedPurchasesLinkagesRequest' when calling appsPromotedPurchasesReplaceToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/apps/{id}/relationships/promotedPurchases"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("AppsApi.appsPromotedPurchasesReplaceToManyRelationship", localVarPath, "PATCH", new ArrayList<>(), appPromotedPurchasesLinkagesRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterPlatform filter by attribute &#39;platform&#39; (optional)
   * @param filterState filter by attribute &#39;state&#39; (optional)
   * @param fieldsReviewSubmissionItems the fields to include for returned resources of type reviewSubmissionItems (optional)
   * @param fieldsActors the fields to include for returned resources of type actors (optional)
   * @param fieldsAppStoreVersions the fields to include for returned resources of type appStoreVersions (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param fieldsReviewSubmissions the fields to include for returned resources of type reviewSubmissions (optional)
   * @param limit maximum resources per page (optional)
   * @param limitItems maximum number of related items returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ReviewSubmissionsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of ReviewSubmissions </td><td>  -  </td></tr>
     </table>
   */
  public ReviewSubmissionsResponse appsReviewSubmissionsGetToManyRelated(String id, List<String> filterPlatform, List<String> filterState, List<String> fieldsReviewSubmissionItems, List<String> fieldsActors, List<String> fieldsAppStoreVersions, List<String> fieldsApps, List<String> fieldsReviewSubmissions, Integer limit, Integer limitItems, List<String> include) throws ApiException {
    return appsReviewSubmissionsGetToManyRelatedWithHttpInfo(id, filterPlatform, filterState, fieldsReviewSubmissionItems, fieldsActors, fieldsAppStoreVersions, fieldsApps, fieldsReviewSubmissions, limit, limitItems, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterPlatform filter by attribute &#39;platform&#39; (optional)
   * @param filterState filter by attribute &#39;state&#39; (optional)
   * @param fieldsReviewSubmissionItems the fields to include for returned resources of type reviewSubmissionItems (optional)
   * @param fieldsActors the fields to include for returned resources of type actors (optional)
   * @param fieldsAppStoreVersions the fields to include for returned resources of type appStoreVersions (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param fieldsReviewSubmissions the fields to include for returned resources of type reviewSubmissions (optional)
   * @param limit maximum resources per page (optional)
   * @param limitItems maximum number of related items returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;ReviewSubmissionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of ReviewSubmissions </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ReviewSubmissionsResponse> appsReviewSubmissionsGetToManyRelatedWithHttpInfo(String id, List<String> filterPlatform, List<String> filterState, List<String> fieldsReviewSubmissionItems, List<String> fieldsActors, List<String> fieldsAppStoreVersions, List<String> fieldsApps, List<String> fieldsReviewSubmissions, Integer limit, Integer limitItems, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appsReviewSubmissionsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/apps/{id}/reviewSubmissions"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[platform]", filterPlatform)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[state]", filterState));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[reviewSubmissionItems]", fieldsReviewSubmissionItems));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[actors]", fieldsActors));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersions]", fieldsAppStoreVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[apps]", fieldsApps));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[reviewSubmissions]", fieldsReviewSubmissions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[items]", limitItems));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<ReviewSubmissionsResponse> localVarReturnType = new GenericType<ReviewSubmissionsResponse>() {};
    return apiClient.invokeAPI("AppsApi.appsReviewSubmissionsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsSubscriptionGracePeriods the fields to include for returned resources of type subscriptionGracePeriods (optional)
   * @return SubscriptionGracePeriodResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single SubscriptionGracePeriod </td><td>  -  </td></tr>
     </table>
   */
  public SubscriptionGracePeriodResponse appsSubscriptionGracePeriodGetToOneRelated(String id, List<String> fieldsSubscriptionGracePeriods) throws ApiException {
    return appsSubscriptionGracePeriodGetToOneRelatedWithHttpInfo(id, fieldsSubscriptionGracePeriods).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsSubscriptionGracePeriods the fields to include for returned resources of type subscriptionGracePeriods (optional)
   * @return ApiResponse&lt;SubscriptionGracePeriodResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single SubscriptionGracePeriod </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubscriptionGracePeriodResponse> appsSubscriptionGracePeriodGetToOneRelatedWithHttpInfo(String id, List<String> fieldsSubscriptionGracePeriods) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appsSubscriptionGracePeriodGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/apps/{id}/subscriptionGracePeriod"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[subscriptionGracePeriods]", fieldsSubscriptionGracePeriods)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<SubscriptionGracePeriodResponse> localVarReturnType = new GenericType<SubscriptionGracePeriodResponse>() {};
    return apiClient.invokeAPI("AppsApi.appsSubscriptionGracePeriodGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterReferenceName filter by attribute &#39;referenceName&#39; (optional)
   * @param filterSubscriptionsState filter by attribute &#39;subscriptions.state&#39; (optional)
   * @param sort comma-separated list of sort expressions; resources will be sorted as specified (optional)
   * @param fieldsSubscriptions the fields to include for returned resources of type subscriptions (optional)
   * @param fieldsSubscriptionGroups the fields to include for returned resources of type subscriptionGroups (optional)
   * @param fieldsSubscriptionGroupLocalizations the fields to include for returned resources of type subscriptionGroupLocalizations (optional)
   * @param limit maximum resources per page (optional)
   * @param limitSubscriptions maximum number of related subscriptions returned (when they are included) (optional)
   * @param limitSubscriptionGroupLocalizations maximum number of related subscriptionGroupLocalizations returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return SubscriptionGroupsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of SubscriptionGroups </td><td>  -  </td></tr>
     </table>
   */
  public SubscriptionGroupsResponse appsSubscriptionGroupsGetToManyRelated(String id, List<String> filterReferenceName, List<String> filterSubscriptionsState, List<String> sort, List<String> fieldsSubscriptions, List<String> fieldsSubscriptionGroups, List<String> fieldsSubscriptionGroupLocalizations, Integer limit, Integer limitSubscriptions, Integer limitSubscriptionGroupLocalizations, List<String> include) throws ApiException {
    return appsSubscriptionGroupsGetToManyRelatedWithHttpInfo(id, filterReferenceName, filterSubscriptionsState, sort, fieldsSubscriptions, fieldsSubscriptionGroups, fieldsSubscriptionGroupLocalizations, limit, limitSubscriptions, limitSubscriptionGroupLocalizations, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterReferenceName filter by attribute &#39;referenceName&#39; (optional)
   * @param filterSubscriptionsState filter by attribute &#39;subscriptions.state&#39; (optional)
   * @param sort comma-separated list of sort expressions; resources will be sorted as specified (optional)
   * @param fieldsSubscriptions the fields to include for returned resources of type subscriptions (optional)
   * @param fieldsSubscriptionGroups the fields to include for returned resources of type subscriptionGroups (optional)
   * @param fieldsSubscriptionGroupLocalizations the fields to include for returned resources of type subscriptionGroupLocalizations (optional)
   * @param limit maximum resources per page (optional)
   * @param limitSubscriptions maximum number of related subscriptions returned (when they are included) (optional)
   * @param limitSubscriptionGroupLocalizations maximum number of related subscriptionGroupLocalizations returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;SubscriptionGroupsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of SubscriptionGroups </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubscriptionGroupsResponse> appsSubscriptionGroupsGetToManyRelatedWithHttpInfo(String id, List<String> filterReferenceName, List<String> filterSubscriptionsState, List<String> sort, List<String> fieldsSubscriptions, List<String> fieldsSubscriptionGroups, List<String> fieldsSubscriptionGroupLocalizations, Integer limit, Integer limitSubscriptions, Integer limitSubscriptionGroupLocalizations, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appsSubscriptionGroupsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/apps/{id}/subscriptionGroups"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[referenceName]", filterReferenceName)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[subscriptions.state]", filterSubscriptionsState));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptions]", fieldsSubscriptions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptionGroups]", fieldsSubscriptionGroups));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptionGroupLocalizations]", fieldsSubscriptionGroupLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[subscriptions]", limitSubscriptions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[subscriptionGroupLocalizations]", limitSubscriptionGroupLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<SubscriptionGroupsResponse> localVarReturnType = new GenericType<SubscriptionGroupsResponse>() {};
    return apiClient.invokeAPI("AppsApi.appsSubscriptionGroupsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appUpdateRequest App representation (required)
   * @return AppResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single App </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public AppResponse appsUpdateInstance(String id, AppUpdateRequest appUpdateRequest) throws ApiException {
    return appsUpdateInstanceWithHttpInfo(id, appUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appUpdateRequest App representation (required)
   * @return ApiResponse&lt;AppResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single App </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppResponse> appsUpdateInstanceWithHttpInfo(String id, AppUpdateRequest appUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appsUpdateInstance");
    }
    if (appUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appUpdateRequest' when calling appsUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/apps/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppResponse> localVarReturnType = new GenericType<AppResponse>() {};
    return apiClient.invokeAPI("AppsApi.appsUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), appUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
