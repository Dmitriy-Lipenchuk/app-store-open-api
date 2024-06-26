package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.BundleIdWithoutIncludesResponse;
import org.openapitools.client.model.CertificatesWithoutIncludesResponse;
import org.openapitools.client.model.DevicesWithoutIncludesResponse;
import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.ProfileCreateRequest;
import org.openapitools.client.model.ProfileResponse;
import org.openapitools.client.model.ProfilesResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class ProfilesApi {
  private ApiClient apiClient;

  public ProfilesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProfilesApi(ApiClient apiClient) {
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
   * @param fieldsBundleIds the fields to include for returned resources of type bundleIds (optional)
   * @return BundleIdWithoutIncludesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single BundleId with get </td><td>  -  </td></tr>
     </table>
   */
  public BundleIdWithoutIncludesResponse profilesBundleIdGetToOneRelated(String id, List<String> fieldsBundleIds) throws ApiException {
    return profilesBundleIdGetToOneRelatedWithHttpInfo(id, fieldsBundleIds).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBundleIds the fields to include for returned resources of type bundleIds (optional)
   * @return ApiResponse&lt;BundleIdWithoutIncludesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single BundleId with get </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BundleIdWithoutIncludesResponse> profilesBundleIdGetToOneRelatedWithHttpInfo(String id, List<String> fieldsBundleIds) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling profilesBundleIdGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/profiles/{id}/bundleId"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[bundleIds]", fieldsBundleIds)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BundleIdWithoutIncludesResponse> localVarReturnType = new GenericType<BundleIdWithoutIncludesResponse>() {};
    return apiClient.invokeAPI("ProfilesApi.profilesBundleIdGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsCertificates the fields to include for returned resources of type certificates (optional)
   * @param limit maximum resources per page (optional)
   * @return CertificatesWithoutIncludesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of Certificates with get </td><td>  -  </td></tr>
     </table>
   */
  public CertificatesWithoutIncludesResponse profilesCertificatesGetToManyRelated(String id, List<String> fieldsCertificates, Integer limit) throws ApiException {
    return profilesCertificatesGetToManyRelatedWithHttpInfo(id, fieldsCertificates, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsCertificates the fields to include for returned resources of type certificates (optional)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;CertificatesWithoutIncludesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of Certificates with get </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CertificatesWithoutIncludesResponse> profilesCertificatesGetToManyRelatedWithHttpInfo(String id, List<String> fieldsCertificates, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling profilesCertificatesGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/profiles/{id}/certificates"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[certificates]", fieldsCertificates)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<CertificatesWithoutIncludesResponse> localVarReturnType = new GenericType<CertificatesWithoutIncludesResponse>() {};
    return apiClient.invokeAPI("ProfilesApi.profilesCertificatesGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param profileCreateRequest Profile representation (required)
   * @return ProfileResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single Profile </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ProfileResponse profilesCreateInstance(ProfileCreateRequest profileCreateRequest) throws ApiException {
    return profilesCreateInstanceWithHttpInfo(profileCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param profileCreateRequest Profile representation (required)
   * @return ApiResponse&lt;ProfileResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single Profile </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ProfileResponse> profilesCreateInstanceWithHttpInfo(ProfileCreateRequest profileCreateRequest) throws ApiException {
    // Check required parameters
    if (profileCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'profileCreateRequest' when calling profilesCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<ProfileResponse> localVarReturnType = new GenericType<ProfileResponse>() {};
    return apiClient.invokeAPI("ProfilesApi.profilesCreateInstance", "/v1/profiles", "POST", new ArrayList<>(), profileCreateRequest,
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
  public void profilesDeleteInstance(String id) throws ApiException {
    profilesDeleteInstanceWithHttpInfo(id);
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
  public ApiResponse<Void> profilesDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling profilesDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/profiles/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("ProfilesApi.profilesDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsDevices the fields to include for returned resources of type devices (optional)
   * @param limit maximum resources per page (optional)
   * @return DevicesWithoutIncludesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of Devices with get </td><td>  -  </td></tr>
     </table>
   */
  public DevicesWithoutIncludesResponse profilesDevicesGetToManyRelated(String id, List<String> fieldsDevices, Integer limit) throws ApiException {
    return profilesDevicesGetToManyRelatedWithHttpInfo(id, fieldsDevices, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsDevices the fields to include for returned resources of type devices (optional)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;DevicesWithoutIncludesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of Devices with get </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DevicesWithoutIncludesResponse> profilesDevicesGetToManyRelatedWithHttpInfo(String id, List<String> fieldsDevices, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling profilesDevicesGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/profiles/{id}/devices"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[devices]", fieldsDevices)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<DevicesWithoutIncludesResponse> localVarReturnType = new GenericType<DevicesWithoutIncludesResponse>() {};
    return apiClient.invokeAPI("ProfilesApi.profilesDevicesGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param filterName filter by attribute &#39;name&#39; (optional)
   * @param filterProfileState filter by attribute &#39;profileState&#39; (optional)
   * @param filterProfileType filter by attribute &#39;profileType&#39; (optional)
   * @param filterId filter by id(s) (optional)
   * @param sort comma-separated list of sort expressions; resources will be sorted as specified (optional)
   * @param fieldsProfiles the fields to include for returned resources of type profiles (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsCertificates the fields to include for returned resources of type certificates (optional)
   * @param fieldsDevices the fields to include for returned resources of type devices (optional)
   * @param fieldsBundleIds the fields to include for returned resources of type bundleIds (optional)
   * @param limitCertificates maximum number of related certificates returned (when they are included) (optional)
   * @param limitDevices maximum number of related devices returned (when they are included) (optional)
   * @return ProfilesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of Profiles </td><td>  -  </td></tr>
     </table>
   */
  public ProfilesResponse profilesGetCollection(List<String> filterName, List<String> filterProfileState, List<String> filterProfileType, List<String> filterId, List<String> sort, List<String> fieldsProfiles, Integer limit, List<String> include, List<String> fieldsCertificates, List<String> fieldsDevices, List<String> fieldsBundleIds, Integer limitCertificates, Integer limitDevices) throws ApiException {
    return profilesGetCollectionWithHttpInfo(filterName, filterProfileState, filterProfileType, filterId, sort, fieldsProfiles, limit, include, fieldsCertificates, fieldsDevices, fieldsBundleIds, limitCertificates, limitDevices).getData();
  }

  /**
   * 
   * 
   * @param filterName filter by attribute &#39;name&#39; (optional)
   * @param filterProfileState filter by attribute &#39;profileState&#39; (optional)
   * @param filterProfileType filter by attribute &#39;profileType&#39; (optional)
   * @param filterId filter by id(s) (optional)
   * @param sort comma-separated list of sort expressions; resources will be sorted as specified (optional)
   * @param fieldsProfiles the fields to include for returned resources of type profiles (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsCertificates the fields to include for returned resources of type certificates (optional)
   * @param fieldsDevices the fields to include for returned resources of type devices (optional)
   * @param fieldsBundleIds the fields to include for returned resources of type bundleIds (optional)
   * @param limitCertificates maximum number of related certificates returned (when they are included) (optional)
   * @param limitDevices maximum number of related devices returned (when they are included) (optional)
   * @return ApiResponse&lt;ProfilesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of Profiles </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ProfilesResponse> profilesGetCollectionWithHttpInfo(List<String> filterName, List<String> filterProfileState, List<String> filterProfileType, List<String> filterId, List<String> sort, List<String> fieldsProfiles, Integer limit, List<String> include, List<String> fieldsCertificates, List<String> fieldsDevices, List<String> fieldsBundleIds, Integer limitCertificates, Integer limitDevices) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[name]", filterName)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[profileState]", filterProfileState));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[profileType]", filterProfileType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[id]", filterId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[profiles]", fieldsProfiles));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[certificates]", fieldsCertificates));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[devices]", fieldsDevices));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[bundleIds]", fieldsBundleIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[certificates]", limitCertificates));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[devices]", limitDevices));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<ProfilesResponse> localVarReturnType = new GenericType<ProfilesResponse>() {};
    return apiClient.invokeAPI("ProfilesApi.profilesGetCollection", "/v1/profiles", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsProfiles the fields to include for returned resources of type profiles (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsCertificates the fields to include for returned resources of type certificates (optional)
   * @param fieldsDevices the fields to include for returned resources of type devices (optional)
   * @param fieldsBundleIds the fields to include for returned resources of type bundleIds (optional)
   * @param limitCertificates maximum number of related certificates returned (when they are included) (optional)
   * @param limitDevices maximum number of related devices returned (when they are included) (optional)
   * @return ProfileResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single Profile </td><td>  -  </td></tr>
     </table>
   */
  public ProfileResponse profilesGetInstance(String id, List<String> fieldsProfiles, List<String> include, List<String> fieldsCertificates, List<String> fieldsDevices, List<String> fieldsBundleIds, Integer limitCertificates, Integer limitDevices) throws ApiException {
    return profilesGetInstanceWithHttpInfo(id, fieldsProfiles, include, fieldsCertificates, fieldsDevices, fieldsBundleIds, limitCertificates, limitDevices).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsProfiles the fields to include for returned resources of type profiles (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsCertificates the fields to include for returned resources of type certificates (optional)
   * @param fieldsDevices the fields to include for returned resources of type devices (optional)
   * @param fieldsBundleIds the fields to include for returned resources of type bundleIds (optional)
   * @param limitCertificates maximum number of related certificates returned (when they are included) (optional)
   * @param limitDevices maximum number of related devices returned (when they are included) (optional)
   * @return ApiResponse&lt;ProfileResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single Profile </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ProfileResponse> profilesGetInstanceWithHttpInfo(String id, List<String> fieldsProfiles, List<String> include, List<String> fieldsCertificates, List<String> fieldsDevices, List<String> fieldsBundleIds, Integer limitCertificates, Integer limitDevices) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling profilesGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/profiles/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[profiles]", fieldsProfiles)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[certificates]", fieldsCertificates));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[devices]", fieldsDevices));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[bundleIds]", fieldsBundleIds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[certificates]", limitCertificates));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[devices]", limitDevices));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<ProfileResponse> localVarReturnType = new GenericType<ProfileResponse>() {};
    return apiClient.invokeAPI("ProfilesApi.profilesGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
