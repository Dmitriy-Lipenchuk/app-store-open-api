package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.BuildsResponse;
import org.openapitools.client.model.CiBuildActionsResponse;
import org.openapitools.client.model.CiBuildRunCreateRequest;
import org.openapitools.client.model.CiBuildRunResponse;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class CiBuildRunsApi {
  private ApiClient apiClient;

  public CiBuildRunsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CiBuildRunsApi(ApiClient apiClient) {
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
   * @param fieldsCiBuildRuns the fields to include for returned resources of type ciBuildRuns (optional)
   * @param fieldsCiBuildActions the fields to include for returned resources of type ciBuildActions (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return CiBuildActionsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of CiBuildActions </td><td>  -  </td></tr>
     </table>
   */
  public CiBuildActionsResponse ciBuildRunsActionsGetToManyRelated(String id, List<String> fieldsCiBuildRuns, List<String> fieldsCiBuildActions, Integer limit, List<String> include) throws ApiException {
    return ciBuildRunsActionsGetToManyRelatedWithHttpInfo(id, fieldsCiBuildRuns, fieldsCiBuildActions, limit, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsCiBuildRuns the fields to include for returned resources of type ciBuildRuns (optional)
   * @param fieldsCiBuildActions the fields to include for returned resources of type ciBuildActions (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;CiBuildActionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of CiBuildActions </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CiBuildActionsResponse> ciBuildRunsActionsGetToManyRelatedWithHttpInfo(String id, List<String> fieldsCiBuildRuns, List<String> fieldsCiBuildActions, Integer limit, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling ciBuildRunsActionsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/ciBuildRuns/{id}/actions"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[ciBuildRuns]", fieldsCiBuildRuns)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[ciBuildActions]", fieldsCiBuildActions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<CiBuildActionsResponse> localVarReturnType = new GenericType<CiBuildActionsResponse>() {};
    return apiClient.invokeAPI("CiBuildRunsApi.ciBuildRunsActionsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
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
   * @param fieldsBuildBundles the fields to include for returned resources of type buildBundles (optional)
   * @param fieldsBuildIcons the fields to include for returned resources of type buildIcons (optional)
   * @param fieldsBetaAppReviewSubmissions the fields to include for returned resources of type betaAppReviewSubmissions (optional)
   * @param fieldsBuildBetaDetails the fields to include for returned resources of type buildBetaDetails (optional)
   * @param fieldsBetaTesters the fields to include for returned resources of type betaTesters (optional)
   * @param fieldsPreReleaseVersions the fields to include for returned resources of type preReleaseVersions (optional)
   * @param fieldsBetaBuildLocalizations the fields to include for returned resources of type betaBuildLocalizations (optional)
   * @param fieldsAppStoreVersions the fields to include for returned resources of type appStoreVersions (optional)
   * @param fieldsAppEncryptionDeclarations the fields to include for returned resources of type appEncryptionDeclarations (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @param fieldsBetaGroups the fields to include for returned resources of type betaGroups (optional)
   * @param limit maximum resources per page (optional)
   * @param limitIndividualTesters maximum number of related individualTesters returned (when they are included) (optional)
   * @param limitBetaGroups maximum number of related betaGroups returned (when they are included) (optional)
   * @param limitBetaBuildLocalizations maximum number of related betaBuildLocalizations returned (when they are included) (optional)
   * @param limitIcons maximum number of related icons returned (when they are included) (optional)
   * @param limitBuildBundles maximum number of related buildBundles returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return BuildsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of Builds </td><td>  -  </td></tr>
     </table>
   */
  public BuildsResponse ciBuildRunsBuildsGetToManyRelated(String id, List<String> filterBetaAppReviewSubmissionBetaReviewState, List<String> filterBuildAudienceType, List<String> filterExpired, List<String> filterPreReleaseVersionPlatform, List<String> filterPreReleaseVersionVersion, List<String> filterProcessingState, List<String> filterUsesNonExemptEncryption, List<String> filterVersion, List<String> filterApp, List<String> filterAppStoreVersion, List<String> filterBetaGroups, List<String> filterPreReleaseVersion, List<String> filterId, List<String> sort, List<String> fieldsBuildBundles, List<String> fieldsBuildIcons, List<String> fieldsBetaAppReviewSubmissions, List<String> fieldsBuildBetaDetails, List<String> fieldsBetaTesters, List<String> fieldsPreReleaseVersions, List<String> fieldsBetaBuildLocalizations, List<String> fieldsAppStoreVersions, List<String> fieldsAppEncryptionDeclarations, List<String> fieldsApps, List<String> fieldsBuilds, List<String> fieldsBetaGroups, Integer limit, Integer limitIndividualTesters, Integer limitBetaGroups, Integer limitBetaBuildLocalizations, Integer limitIcons, Integer limitBuildBundles, List<String> include) throws ApiException {
    return ciBuildRunsBuildsGetToManyRelatedWithHttpInfo(id, filterBetaAppReviewSubmissionBetaReviewState, filterBuildAudienceType, filterExpired, filterPreReleaseVersionPlatform, filterPreReleaseVersionVersion, filterProcessingState, filterUsesNonExemptEncryption, filterVersion, filterApp, filterAppStoreVersion, filterBetaGroups, filterPreReleaseVersion, filterId, sort, fieldsBuildBundles, fieldsBuildIcons, fieldsBetaAppReviewSubmissions, fieldsBuildBetaDetails, fieldsBetaTesters, fieldsPreReleaseVersions, fieldsBetaBuildLocalizations, fieldsAppStoreVersions, fieldsAppEncryptionDeclarations, fieldsApps, fieldsBuilds, fieldsBetaGroups, limit, limitIndividualTesters, limitBetaGroups, limitBetaBuildLocalizations, limitIcons, limitBuildBundles, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
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
   * @param fieldsBuildBundles the fields to include for returned resources of type buildBundles (optional)
   * @param fieldsBuildIcons the fields to include for returned resources of type buildIcons (optional)
   * @param fieldsBetaAppReviewSubmissions the fields to include for returned resources of type betaAppReviewSubmissions (optional)
   * @param fieldsBuildBetaDetails the fields to include for returned resources of type buildBetaDetails (optional)
   * @param fieldsBetaTesters the fields to include for returned resources of type betaTesters (optional)
   * @param fieldsPreReleaseVersions the fields to include for returned resources of type preReleaseVersions (optional)
   * @param fieldsBetaBuildLocalizations the fields to include for returned resources of type betaBuildLocalizations (optional)
   * @param fieldsAppStoreVersions the fields to include for returned resources of type appStoreVersions (optional)
   * @param fieldsAppEncryptionDeclarations the fields to include for returned resources of type appEncryptionDeclarations (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @param fieldsBetaGroups the fields to include for returned resources of type betaGroups (optional)
   * @param limit maximum resources per page (optional)
   * @param limitIndividualTesters maximum number of related individualTesters returned (when they are included) (optional)
   * @param limitBetaGroups maximum number of related betaGroups returned (when they are included) (optional)
   * @param limitBetaBuildLocalizations maximum number of related betaBuildLocalizations returned (when they are included) (optional)
   * @param limitIcons maximum number of related icons returned (when they are included) (optional)
   * @param limitBuildBundles maximum number of related buildBundles returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;BuildsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of Builds </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BuildsResponse> ciBuildRunsBuildsGetToManyRelatedWithHttpInfo(String id, List<String> filterBetaAppReviewSubmissionBetaReviewState, List<String> filterBuildAudienceType, List<String> filterExpired, List<String> filterPreReleaseVersionPlatform, List<String> filterPreReleaseVersionVersion, List<String> filterProcessingState, List<String> filterUsesNonExemptEncryption, List<String> filterVersion, List<String> filterApp, List<String> filterAppStoreVersion, List<String> filterBetaGroups, List<String> filterPreReleaseVersion, List<String> filterId, List<String> sort, List<String> fieldsBuildBundles, List<String> fieldsBuildIcons, List<String> fieldsBetaAppReviewSubmissions, List<String> fieldsBuildBetaDetails, List<String> fieldsBetaTesters, List<String> fieldsPreReleaseVersions, List<String> fieldsBetaBuildLocalizations, List<String> fieldsAppStoreVersions, List<String> fieldsAppEncryptionDeclarations, List<String> fieldsApps, List<String> fieldsBuilds, List<String> fieldsBetaGroups, Integer limit, Integer limitIndividualTesters, Integer limitBetaGroups, Integer limitBetaBuildLocalizations, Integer limitIcons, Integer limitBuildBundles, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling ciBuildRunsBuildsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/ciBuildRuns/{id}/builds"
            .replaceAll("\\{id}", apiClient.escapeString(id));

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
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[buildBundles]", fieldsBuildBundles));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[buildIcons]", fieldsBuildIcons));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[betaAppReviewSubmissions]", fieldsBetaAppReviewSubmissions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[buildBetaDetails]", fieldsBuildBetaDetails));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[betaTesters]", fieldsBetaTesters));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[preReleaseVersions]", fieldsPreReleaseVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[betaBuildLocalizations]", fieldsBetaBuildLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersions]", fieldsAppStoreVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appEncryptionDeclarations]", fieldsAppEncryptionDeclarations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[apps]", fieldsApps));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[builds]", fieldsBuilds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[betaGroups]", fieldsBetaGroups));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[individualTesters]", limitIndividualTesters));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[betaGroups]", limitBetaGroups));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[betaBuildLocalizations]", limitBetaBuildLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[icons]", limitIcons));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[buildBundles]", limitBuildBundles));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BuildsResponse> localVarReturnType = new GenericType<BuildsResponse>() {};
    return apiClient.invokeAPI("CiBuildRunsApi.ciBuildRunsBuildsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param ciBuildRunCreateRequest CiBuildRun representation (required)
   * @return CiBuildRunResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single CiBuildRun </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public CiBuildRunResponse ciBuildRunsCreateInstance(CiBuildRunCreateRequest ciBuildRunCreateRequest) throws ApiException {
    return ciBuildRunsCreateInstanceWithHttpInfo(ciBuildRunCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param ciBuildRunCreateRequest CiBuildRun representation (required)
   * @return ApiResponse&lt;CiBuildRunResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single CiBuildRun </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CiBuildRunResponse> ciBuildRunsCreateInstanceWithHttpInfo(CiBuildRunCreateRequest ciBuildRunCreateRequest) throws ApiException {
    // Check required parameters
    if (ciBuildRunCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'ciBuildRunCreateRequest' when calling ciBuildRunsCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<CiBuildRunResponse> localVarReturnType = new GenericType<CiBuildRunResponse>() {};
    return apiClient.invokeAPI("CiBuildRunsApi.ciBuildRunsCreateInstance", "/v1/ciBuildRuns", "POST", new ArrayList<>(), ciBuildRunCreateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsCiBuildRuns the fields to include for returned resources of type ciBuildRuns (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsCiBuildActions the fields to include for returned resources of type ciBuildActions (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @param limitBuilds maximum number of related builds returned (when they are included) (optional)
   * @return CiBuildRunResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single CiBuildRun </td><td>  -  </td></tr>
     </table>
   */
  public CiBuildRunResponse ciBuildRunsGetInstance(String id, List<String> fieldsCiBuildRuns, List<String> include, List<String> fieldsCiBuildActions, List<String> fieldsBuilds, Integer limitBuilds) throws ApiException {
    return ciBuildRunsGetInstanceWithHttpInfo(id, fieldsCiBuildRuns, include, fieldsCiBuildActions, fieldsBuilds, limitBuilds).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsCiBuildRuns the fields to include for returned resources of type ciBuildRuns (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsCiBuildActions the fields to include for returned resources of type ciBuildActions (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @param limitBuilds maximum number of related builds returned (when they are included) (optional)
   * @return ApiResponse&lt;CiBuildRunResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single CiBuildRun </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CiBuildRunResponse> ciBuildRunsGetInstanceWithHttpInfo(String id, List<String> fieldsCiBuildRuns, List<String> include, List<String> fieldsCiBuildActions, List<String> fieldsBuilds, Integer limitBuilds) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling ciBuildRunsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/ciBuildRuns/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[ciBuildRuns]", fieldsCiBuildRuns)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[ciBuildActions]", fieldsCiBuildActions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[builds]", fieldsBuilds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[builds]", limitBuilds));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<CiBuildRunResponse> localVarReturnType = new GenericType<CiBuildRunResponse>() {};
    return apiClient.invokeAPI("CiBuildRunsApi.ciBuildRunsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
