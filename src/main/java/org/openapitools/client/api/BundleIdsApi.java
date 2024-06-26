package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.AppWithoutIncludesResponse;
import org.openapitools.client.model.BundleIdCapabilitiesWithoutIncludesResponse;
import org.openapitools.client.model.BundleIdCreateRequest;
import org.openapitools.client.model.BundleIdResponse;
import org.openapitools.client.model.BundleIdUpdateRequest;
import org.openapitools.client.model.BundleIdsResponse;
import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.ProfilesWithoutIncludesResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class BundleIdsApi {
  private ApiClient apiClient;

  public BundleIdsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BundleIdsApi(ApiClient apiClient) {
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
  public AppWithoutIncludesResponse bundleIdsAppGetToOneRelated(String id, List<String> fieldsApps) throws ApiException {
    return bundleIdsAppGetToOneRelatedWithHttpInfo(id, fieldsApps).getData();
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
  public ApiResponse<AppWithoutIncludesResponse> bundleIdsAppGetToOneRelatedWithHttpInfo(String id, List<String> fieldsApps) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling bundleIdsAppGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/bundleIds/{id}/app"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[apps]", fieldsApps)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppWithoutIncludesResponse> localVarReturnType = new GenericType<AppWithoutIncludesResponse>() {};
    return apiClient.invokeAPI("BundleIdsApi.bundleIdsAppGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBundleIdCapabilities the fields to include for returned resources of type bundleIdCapabilities (optional)
   * @param limit maximum resources per page (optional)
   * @return BundleIdCapabilitiesWithoutIncludesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of BundleIdCapabilities with get </td><td>  -  </td></tr>
     </table>
   */
  public BundleIdCapabilitiesWithoutIncludesResponse bundleIdsBundleIdCapabilitiesGetToManyRelated(String id, List<String> fieldsBundleIdCapabilities, Integer limit) throws ApiException {
    return bundleIdsBundleIdCapabilitiesGetToManyRelatedWithHttpInfo(id, fieldsBundleIdCapabilities, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBundleIdCapabilities the fields to include for returned resources of type bundleIdCapabilities (optional)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;BundleIdCapabilitiesWithoutIncludesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of BundleIdCapabilities with get </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BundleIdCapabilitiesWithoutIncludesResponse> bundleIdsBundleIdCapabilitiesGetToManyRelatedWithHttpInfo(String id, List<String> fieldsBundleIdCapabilities, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling bundleIdsBundleIdCapabilitiesGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/bundleIds/{id}/bundleIdCapabilities"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[bundleIdCapabilities]", fieldsBundleIdCapabilities)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BundleIdCapabilitiesWithoutIncludesResponse> localVarReturnType = new GenericType<BundleIdCapabilitiesWithoutIncludesResponse>() {};
    return apiClient.invokeAPI("BundleIdsApi.bundleIdsBundleIdCapabilitiesGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param bundleIdCreateRequest BundleId representation (required)
   * @return BundleIdResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single BundleId </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public BundleIdResponse bundleIdsCreateInstance(BundleIdCreateRequest bundleIdCreateRequest) throws ApiException {
    return bundleIdsCreateInstanceWithHttpInfo(bundleIdCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param bundleIdCreateRequest BundleId representation (required)
   * @return ApiResponse&lt;BundleIdResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single BundleId </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BundleIdResponse> bundleIdsCreateInstanceWithHttpInfo(BundleIdCreateRequest bundleIdCreateRequest) throws ApiException {
    // Check required parameters
    if (bundleIdCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'bundleIdCreateRequest' when calling bundleIdsCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BundleIdResponse> localVarReturnType = new GenericType<BundleIdResponse>() {};
    return apiClient.invokeAPI("BundleIdsApi.bundleIdsCreateInstance", "/v1/bundleIds", "POST", new ArrayList<>(), bundleIdCreateRequest,
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
  public void bundleIdsDeleteInstance(String id) throws ApiException {
    bundleIdsDeleteInstanceWithHttpInfo(id);
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
  public ApiResponse<Void> bundleIdsDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling bundleIdsDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/bundleIds/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("BundleIdsApi.bundleIdsDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param filterIdentifier filter by attribute &#39;identifier&#39; (optional)
   * @param filterName filter by attribute &#39;name&#39; (optional)
   * @param filterPlatform filter by attribute &#39;platform&#39; (optional)
   * @param filterSeedId filter by attribute &#39;seedId&#39; (optional)
   * @param filterId filter by id(s) (optional)
   * @param sort comma-separated list of sort expressions; resources will be sorted as specified (optional)
   * @param fieldsBundleIds the fields to include for returned resources of type bundleIds (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsBundleIdCapabilities the fields to include for returned resources of type bundleIdCapabilities (optional)
   * @param fieldsProfiles the fields to include for returned resources of type profiles (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param limitBundleIdCapabilities maximum number of related bundleIdCapabilities returned (when they are included) (optional)
   * @param limitProfiles maximum number of related profiles returned (when they are included) (optional)
   * @return BundleIdsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of BundleIds </td><td>  -  </td></tr>
     </table>
   */
  public BundleIdsResponse bundleIdsGetCollection(List<String> filterIdentifier, List<String> filterName, List<String> filterPlatform, List<String> filterSeedId, List<String> filterId, List<String> sort, List<String> fieldsBundleIds, Integer limit, List<String> include, List<String> fieldsBundleIdCapabilities, List<String> fieldsProfiles, List<String> fieldsApps, Integer limitBundleIdCapabilities, Integer limitProfiles) throws ApiException {
    return bundleIdsGetCollectionWithHttpInfo(filterIdentifier, filterName, filterPlatform, filterSeedId, filterId, sort, fieldsBundleIds, limit, include, fieldsBundleIdCapabilities, fieldsProfiles, fieldsApps, limitBundleIdCapabilities, limitProfiles).getData();
  }

  /**
   * 
   * 
   * @param filterIdentifier filter by attribute &#39;identifier&#39; (optional)
   * @param filterName filter by attribute &#39;name&#39; (optional)
   * @param filterPlatform filter by attribute &#39;platform&#39; (optional)
   * @param filterSeedId filter by attribute &#39;seedId&#39; (optional)
   * @param filterId filter by id(s) (optional)
   * @param sort comma-separated list of sort expressions; resources will be sorted as specified (optional)
   * @param fieldsBundleIds the fields to include for returned resources of type bundleIds (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsBundleIdCapabilities the fields to include for returned resources of type bundleIdCapabilities (optional)
   * @param fieldsProfiles the fields to include for returned resources of type profiles (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param limitBundleIdCapabilities maximum number of related bundleIdCapabilities returned (when they are included) (optional)
   * @param limitProfiles maximum number of related profiles returned (when they are included) (optional)
   * @return ApiResponse&lt;BundleIdsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of BundleIds </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BundleIdsResponse> bundleIdsGetCollectionWithHttpInfo(List<String> filterIdentifier, List<String> filterName, List<String> filterPlatform, List<String> filterSeedId, List<String> filterId, List<String> sort, List<String> fieldsBundleIds, Integer limit, List<String> include, List<String> fieldsBundleIdCapabilities, List<String> fieldsProfiles, List<String> fieldsApps, Integer limitBundleIdCapabilities, Integer limitProfiles) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[identifier]", filterIdentifier)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[name]", filterName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[platform]", filterPlatform));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[seedId]", filterSeedId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[id]", filterId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[bundleIds]", fieldsBundleIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[bundleIdCapabilities]", fieldsBundleIdCapabilities));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[profiles]", fieldsProfiles));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[apps]", fieldsApps));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[bundleIdCapabilities]", limitBundleIdCapabilities));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[profiles]", limitProfiles));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BundleIdsResponse> localVarReturnType = new GenericType<BundleIdsResponse>() {};
    return apiClient.invokeAPI("BundleIdsApi.bundleIdsGetCollection", "/v1/bundleIds", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBundleIds the fields to include for returned resources of type bundleIds (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsBundleIdCapabilities the fields to include for returned resources of type bundleIdCapabilities (optional)
   * @param fieldsProfiles the fields to include for returned resources of type profiles (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param limitBundleIdCapabilities maximum number of related bundleIdCapabilities returned (when they are included) (optional)
   * @param limitProfiles maximum number of related profiles returned (when they are included) (optional)
   * @return BundleIdResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single BundleId </td><td>  -  </td></tr>
     </table>
   */
  public BundleIdResponse bundleIdsGetInstance(String id, List<String> fieldsBundleIds, List<String> include, List<String> fieldsBundleIdCapabilities, List<String> fieldsProfiles, List<String> fieldsApps, Integer limitBundleIdCapabilities, Integer limitProfiles) throws ApiException {
    return bundleIdsGetInstanceWithHttpInfo(id, fieldsBundleIds, include, fieldsBundleIdCapabilities, fieldsProfiles, fieldsApps, limitBundleIdCapabilities, limitProfiles).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBundleIds the fields to include for returned resources of type bundleIds (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsBundleIdCapabilities the fields to include for returned resources of type bundleIdCapabilities (optional)
   * @param fieldsProfiles the fields to include for returned resources of type profiles (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param limitBundleIdCapabilities maximum number of related bundleIdCapabilities returned (when they are included) (optional)
   * @param limitProfiles maximum number of related profiles returned (when they are included) (optional)
   * @return ApiResponse&lt;BundleIdResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single BundleId </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BundleIdResponse> bundleIdsGetInstanceWithHttpInfo(String id, List<String> fieldsBundleIds, List<String> include, List<String> fieldsBundleIdCapabilities, List<String> fieldsProfiles, List<String> fieldsApps, Integer limitBundleIdCapabilities, Integer limitProfiles) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling bundleIdsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/bundleIds/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[bundleIds]", fieldsBundleIds)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[bundleIdCapabilities]", fieldsBundleIdCapabilities));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[profiles]", fieldsProfiles));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[apps]", fieldsApps));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[bundleIdCapabilities]", limitBundleIdCapabilities));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[profiles]", limitProfiles));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BundleIdResponse> localVarReturnType = new GenericType<BundleIdResponse>() {};
    return apiClient.invokeAPI("BundleIdsApi.bundleIdsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsProfiles the fields to include for returned resources of type profiles (optional)
   * @param limit maximum resources per page (optional)
   * @return ProfilesWithoutIncludesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of Profiles with get </td><td>  -  </td></tr>
     </table>
   */
  public ProfilesWithoutIncludesResponse bundleIdsProfilesGetToManyRelated(String id, List<String> fieldsProfiles, Integer limit) throws ApiException {
    return bundleIdsProfilesGetToManyRelatedWithHttpInfo(id, fieldsProfiles, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsProfiles the fields to include for returned resources of type profiles (optional)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;ProfilesWithoutIncludesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of Profiles with get </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ProfilesWithoutIncludesResponse> bundleIdsProfilesGetToManyRelatedWithHttpInfo(String id, List<String> fieldsProfiles, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling bundleIdsProfilesGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/bundleIds/{id}/profiles"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[profiles]", fieldsProfiles)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<ProfilesWithoutIncludesResponse> localVarReturnType = new GenericType<ProfilesWithoutIncludesResponse>() {};
    return apiClient.invokeAPI("BundleIdsApi.bundleIdsProfilesGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param bundleIdUpdateRequest BundleId representation (required)
   * @return BundleIdResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single BundleId </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public BundleIdResponse bundleIdsUpdateInstance(String id, BundleIdUpdateRequest bundleIdUpdateRequest) throws ApiException {
    return bundleIdsUpdateInstanceWithHttpInfo(id, bundleIdUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param bundleIdUpdateRequest BundleId representation (required)
   * @return ApiResponse&lt;BundleIdResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single BundleId </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BundleIdResponse> bundleIdsUpdateInstanceWithHttpInfo(String id, BundleIdUpdateRequest bundleIdUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling bundleIdsUpdateInstance");
    }
    if (bundleIdUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'bundleIdUpdateRequest' when calling bundleIdsUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/bundleIds/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BundleIdResponse> localVarReturnType = new GenericType<BundleIdResponse>() {};
    return apiClient.invokeAPI("BundleIdsApi.bundleIdsUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), bundleIdUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
