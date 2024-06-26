package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.AppWithoutIncludesResponse;
import org.openapitools.client.model.BuildsWithoutIncludesResponse;
import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.PreReleaseVersionsResponse;
import org.openapitools.client.model.PrereleaseVersionResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class PreReleaseVersionsApi {
  private ApiClient apiClient;

  public PreReleaseVersionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PreReleaseVersionsApi(ApiClient apiClient) {
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
  public AppWithoutIncludesResponse preReleaseVersionsAppGetToOneRelated(String id, List<String> fieldsApps) throws ApiException {
    return preReleaseVersionsAppGetToOneRelatedWithHttpInfo(id, fieldsApps).getData();
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
  public ApiResponse<AppWithoutIncludesResponse> preReleaseVersionsAppGetToOneRelatedWithHttpInfo(String id, List<String> fieldsApps) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling preReleaseVersionsAppGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/preReleaseVersions/{id}/app"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[apps]", fieldsApps)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppWithoutIncludesResponse> localVarReturnType = new GenericType<AppWithoutIncludesResponse>() {};
    return apiClient.invokeAPI("PreReleaseVersionsApi.preReleaseVersionsAppGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
  public BuildsWithoutIncludesResponse preReleaseVersionsBuildsGetToManyRelated(String id, List<String> fieldsBuilds, Integer limit) throws ApiException {
    return preReleaseVersionsBuildsGetToManyRelatedWithHttpInfo(id, fieldsBuilds, limit).getData();
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
  public ApiResponse<BuildsWithoutIncludesResponse> preReleaseVersionsBuildsGetToManyRelatedWithHttpInfo(String id, List<String> fieldsBuilds, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling preReleaseVersionsBuildsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/preReleaseVersions/{id}/builds"
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
    return apiClient.invokeAPI("PreReleaseVersionsApi.preReleaseVersionsBuildsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param filterBuildsExpired filter by attribute &#39;builds.expired&#39; (optional)
   * @param filterBuildsProcessingState filter by attribute &#39;builds.processingState&#39; (optional)
   * @param filterBuildsVersion filter by attribute &#39;builds.version&#39; (optional)
   * @param filterPlatform filter by attribute &#39;platform&#39; (optional)
   * @param filterVersion filter by attribute &#39;version&#39; (optional)
   * @param filterApp filter by id(s) of related &#39;app&#39; (optional)
   * @param filterBuilds filter by id(s) of related &#39;builds&#39; (optional)
   * @param sort comma-separated list of sort expressions; resources will be sorted as specified (optional)
   * @param fieldsPreReleaseVersions the fields to include for returned resources of type preReleaseVersions (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @param limitBuilds maximum number of related builds returned (when they are included) (optional)
   * @return PreReleaseVersionsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of PreReleaseVersions </td><td>  -  </td></tr>
     </table>
   */
  public PreReleaseVersionsResponse preReleaseVersionsGetCollection(List<String> filterBuildsExpired, List<String> filterBuildsProcessingState, List<String> filterBuildsVersion, List<String> filterPlatform, List<String> filterVersion, List<String> filterApp, List<String> filterBuilds, List<String> sort, List<String> fieldsPreReleaseVersions, Integer limit, List<String> include, List<String> fieldsApps, List<String> fieldsBuilds, Integer limitBuilds) throws ApiException {
    return preReleaseVersionsGetCollectionWithHttpInfo(filterBuildsExpired, filterBuildsProcessingState, filterBuildsVersion, filterPlatform, filterVersion, filterApp, filterBuilds, sort, fieldsPreReleaseVersions, limit, include, fieldsApps, fieldsBuilds, limitBuilds).getData();
  }

  /**
   * 
   * 
   * @param filterBuildsExpired filter by attribute &#39;builds.expired&#39; (optional)
   * @param filterBuildsProcessingState filter by attribute &#39;builds.processingState&#39; (optional)
   * @param filterBuildsVersion filter by attribute &#39;builds.version&#39; (optional)
   * @param filterPlatform filter by attribute &#39;platform&#39; (optional)
   * @param filterVersion filter by attribute &#39;version&#39; (optional)
   * @param filterApp filter by id(s) of related &#39;app&#39; (optional)
   * @param filterBuilds filter by id(s) of related &#39;builds&#39; (optional)
   * @param sort comma-separated list of sort expressions; resources will be sorted as specified (optional)
   * @param fieldsPreReleaseVersions the fields to include for returned resources of type preReleaseVersions (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @param limitBuilds maximum number of related builds returned (when they are included) (optional)
   * @return ApiResponse&lt;PreReleaseVersionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of PreReleaseVersions </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PreReleaseVersionsResponse> preReleaseVersionsGetCollectionWithHttpInfo(List<String> filterBuildsExpired, List<String> filterBuildsProcessingState, List<String> filterBuildsVersion, List<String> filterPlatform, List<String> filterVersion, List<String> filterApp, List<String> filterBuilds, List<String> sort, List<String> fieldsPreReleaseVersions, Integer limit, List<String> include, List<String> fieldsApps, List<String> fieldsBuilds, Integer limitBuilds) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[builds.expired]", filterBuildsExpired)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[builds.processingState]", filterBuildsProcessingState));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[builds.version]", filterBuildsVersion));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[platform]", filterPlatform));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[version]", filterVersion));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[app]", filterApp));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[builds]", filterBuilds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[preReleaseVersions]", fieldsPreReleaseVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[apps]", fieldsApps));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[builds]", fieldsBuilds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[builds]", limitBuilds));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<PreReleaseVersionsResponse> localVarReturnType = new GenericType<PreReleaseVersionsResponse>() {};
    return apiClient.invokeAPI("PreReleaseVersionsApi.preReleaseVersionsGetCollection", "/v1/preReleaseVersions", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsPreReleaseVersions the fields to include for returned resources of type preReleaseVersions (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @param limitBuilds maximum number of related builds returned (when they are included) (optional)
   * @return PrereleaseVersionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single PrereleaseVersion </td><td>  -  </td></tr>
     </table>
   */
  public PrereleaseVersionResponse preReleaseVersionsGetInstance(String id, List<String> fieldsPreReleaseVersions, List<String> include, List<String> fieldsApps, List<String> fieldsBuilds, Integer limitBuilds) throws ApiException {
    return preReleaseVersionsGetInstanceWithHttpInfo(id, fieldsPreReleaseVersions, include, fieldsApps, fieldsBuilds, limitBuilds).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsPreReleaseVersions the fields to include for returned resources of type preReleaseVersions (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @param limitBuilds maximum number of related builds returned (when they are included) (optional)
   * @return ApiResponse&lt;PrereleaseVersionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single PrereleaseVersion </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PrereleaseVersionResponse> preReleaseVersionsGetInstanceWithHttpInfo(String id, List<String> fieldsPreReleaseVersions, List<String> include, List<String> fieldsApps, List<String> fieldsBuilds, Integer limitBuilds) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling preReleaseVersionsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/preReleaseVersions/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[preReleaseVersions]", fieldsPreReleaseVersions)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[apps]", fieldsApps));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[builds]", fieldsBuilds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[builds]", limitBuilds));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<PrereleaseVersionResponse> localVarReturnType = new GenericType<PrereleaseVersionResponse>() {};
    return apiClient.invokeAPI("PreReleaseVersionsApi.preReleaseVersionsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
