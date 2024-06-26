package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.AppClipDomainStatusResponse;
import org.openapitools.client.model.BetaAppClipInvocationsResponse;
import org.openapitools.client.model.BuildBundleFileSizesResponse;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class BuildBundlesApi {
  private ApiClient apiClient;

  public BuildBundlesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BuildBundlesApi(ApiClient apiClient) {
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
   * @param fieldsAppClipDomainStatuses the fields to include for returned resources of type appClipDomainStatuses (optional)
   * @return AppClipDomainStatusResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppClipDomainStatus </td><td>  -  </td></tr>
     </table>
   */
  public AppClipDomainStatusResponse buildBundlesAppClipDomainCacheStatusGetToOneRelated(String id, List<String> fieldsAppClipDomainStatuses) throws ApiException {
    return buildBundlesAppClipDomainCacheStatusGetToOneRelatedWithHttpInfo(id, fieldsAppClipDomainStatuses).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppClipDomainStatuses the fields to include for returned resources of type appClipDomainStatuses (optional)
   * @return ApiResponse&lt;AppClipDomainStatusResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppClipDomainStatus </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppClipDomainStatusResponse> buildBundlesAppClipDomainCacheStatusGetToOneRelatedWithHttpInfo(String id, List<String> fieldsAppClipDomainStatuses) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling buildBundlesAppClipDomainCacheStatusGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/buildBundles/{id}/appClipDomainCacheStatus"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appClipDomainStatuses]", fieldsAppClipDomainStatuses)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppClipDomainStatusResponse> localVarReturnType = new GenericType<AppClipDomainStatusResponse>() {};
    return apiClient.invokeAPI("BuildBundlesApi.buildBundlesAppClipDomainCacheStatusGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppClipDomainStatuses the fields to include for returned resources of type appClipDomainStatuses (optional)
   * @return AppClipDomainStatusResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppClipDomainStatus </td><td>  -  </td></tr>
     </table>
   */
  public AppClipDomainStatusResponse buildBundlesAppClipDomainDebugStatusGetToOneRelated(String id, List<String> fieldsAppClipDomainStatuses) throws ApiException {
    return buildBundlesAppClipDomainDebugStatusGetToOneRelatedWithHttpInfo(id, fieldsAppClipDomainStatuses).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppClipDomainStatuses the fields to include for returned resources of type appClipDomainStatuses (optional)
   * @return ApiResponse&lt;AppClipDomainStatusResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppClipDomainStatus </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppClipDomainStatusResponse> buildBundlesAppClipDomainDebugStatusGetToOneRelatedWithHttpInfo(String id, List<String> fieldsAppClipDomainStatuses) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling buildBundlesAppClipDomainDebugStatusGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/buildBundles/{id}/appClipDomainDebugStatus"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appClipDomainStatuses]", fieldsAppClipDomainStatuses)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppClipDomainStatusResponse> localVarReturnType = new GenericType<AppClipDomainStatusResponse>() {};
    return apiClient.invokeAPI("BuildBundlesApi.buildBundlesAppClipDomainDebugStatusGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBetaAppClipInvocations the fields to include for returned resources of type betaAppClipInvocations (optional)
   * @param fieldsBetaAppClipInvocationLocalizations the fields to include for returned resources of type betaAppClipInvocationLocalizations (optional)
   * @param limit maximum resources per page (optional)
   * @param limitBetaAppClipInvocationLocalizations maximum number of related betaAppClipInvocationLocalizations returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return BetaAppClipInvocationsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of BetaAppClipInvocations </td><td>  -  </td></tr>
     </table>
   */
  public BetaAppClipInvocationsResponse buildBundlesBetaAppClipInvocationsGetToManyRelated(String id, List<String> fieldsBetaAppClipInvocations, List<String> fieldsBetaAppClipInvocationLocalizations, Integer limit, Integer limitBetaAppClipInvocationLocalizations, List<String> include) throws ApiException {
    return buildBundlesBetaAppClipInvocationsGetToManyRelatedWithHttpInfo(id, fieldsBetaAppClipInvocations, fieldsBetaAppClipInvocationLocalizations, limit, limitBetaAppClipInvocationLocalizations, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBetaAppClipInvocations the fields to include for returned resources of type betaAppClipInvocations (optional)
   * @param fieldsBetaAppClipInvocationLocalizations the fields to include for returned resources of type betaAppClipInvocationLocalizations (optional)
   * @param limit maximum resources per page (optional)
   * @param limitBetaAppClipInvocationLocalizations maximum number of related betaAppClipInvocationLocalizations returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;BetaAppClipInvocationsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of BetaAppClipInvocations </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BetaAppClipInvocationsResponse> buildBundlesBetaAppClipInvocationsGetToManyRelatedWithHttpInfo(String id, List<String> fieldsBetaAppClipInvocations, List<String> fieldsBetaAppClipInvocationLocalizations, Integer limit, Integer limitBetaAppClipInvocationLocalizations, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling buildBundlesBetaAppClipInvocationsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/buildBundles/{id}/betaAppClipInvocations"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[betaAppClipInvocations]", fieldsBetaAppClipInvocations)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[betaAppClipInvocationLocalizations]", fieldsBetaAppClipInvocationLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[betaAppClipInvocationLocalizations]", limitBetaAppClipInvocationLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BetaAppClipInvocationsResponse> localVarReturnType = new GenericType<BetaAppClipInvocationsResponse>() {};
    return apiClient.invokeAPI("BuildBundlesApi.buildBundlesBetaAppClipInvocationsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBuildBundleFileSizes the fields to include for returned resources of type buildBundleFileSizes (optional)
   * @param limit maximum resources per page (optional)
   * @return BuildBundleFileSizesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of BuildBundleFileSizes </td><td>  -  </td></tr>
     </table>
   */
  public BuildBundleFileSizesResponse buildBundlesBuildBundleFileSizesGetToManyRelated(String id, List<String> fieldsBuildBundleFileSizes, Integer limit) throws ApiException {
    return buildBundlesBuildBundleFileSizesGetToManyRelatedWithHttpInfo(id, fieldsBuildBundleFileSizes, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBuildBundleFileSizes the fields to include for returned resources of type buildBundleFileSizes (optional)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;BuildBundleFileSizesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of BuildBundleFileSizes </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BuildBundleFileSizesResponse> buildBundlesBuildBundleFileSizesGetToManyRelatedWithHttpInfo(String id, List<String> fieldsBuildBundleFileSizes, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling buildBundlesBuildBundleFileSizesGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/buildBundles/{id}/buildBundleFileSizes"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[buildBundleFileSizes]", fieldsBuildBundleFileSizes)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BuildBundleFileSizesResponse> localVarReturnType = new GenericType<BuildBundleFileSizesResponse>() {};
    return apiClient.invokeAPI("BuildBundlesApi.buildBundlesBuildBundleFileSizesGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
