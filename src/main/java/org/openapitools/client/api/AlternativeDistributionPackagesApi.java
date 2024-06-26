package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.AlternativeDistributionPackageCreateRequest;
import org.openapitools.client.model.AlternativeDistributionPackageResponse;
import org.openapitools.client.model.AlternativeDistributionPackageVersionsResponse;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AlternativeDistributionPackagesApi {
  private ApiClient apiClient;

  public AlternativeDistributionPackagesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AlternativeDistributionPackagesApi(ApiClient apiClient) {
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
   * @param alternativeDistributionPackageCreateRequest AlternativeDistributionPackage representation (required)
   * @return AlternativeDistributionPackageResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AlternativeDistributionPackage </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public AlternativeDistributionPackageResponse alternativeDistributionPackagesCreateInstance(AlternativeDistributionPackageCreateRequest alternativeDistributionPackageCreateRequest) throws ApiException {
    return alternativeDistributionPackagesCreateInstanceWithHttpInfo(alternativeDistributionPackageCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param alternativeDistributionPackageCreateRequest AlternativeDistributionPackage representation (required)
   * @return ApiResponse&lt;AlternativeDistributionPackageResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AlternativeDistributionPackage </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AlternativeDistributionPackageResponse> alternativeDistributionPackagesCreateInstanceWithHttpInfo(AlternativeDistributionPackageCreateRequest alternativeDistributionPackageCreateRequest) throws ApiException {
    // Check required parameters
    if (alternativeDistributionPackageCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'alternativeDistributionPackageCreateRequest' when calling alternativeDistributionPackagesCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AlternativeDistributionPackageResponse> localVarReturnType = new GenericType<AlternativeDistributionPackageResponse>() {};
    return apiClient.invokeAPI("AlternativeDistributionPackagesApi.alternativeDistributionPackagesCreateInstance", "/v1/alternativeDistributionPackages", "POST", new ArrayList<>(), alternativeDistributionPackageCreateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAlternativeDistributionPackages the fields to include for returned resources of type alternativeDistributionPackages (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsAlternativeDistributionPackageVersions the fields to include for returned resources of type alternativeDistributionPackageVersions (optional)
   * @param limitVersions maximum number of related versions returned (when they are included) (optional)
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
  public AlternativeDistributionPackageResponse alternativeDistributionPackagesGetInstance(String id, List<String> fieldsAlternativeDistributionPackages, List<String> include, List<String> fieldsAlternativeDistributionPackageVersions, Integer limitVersions) throws ApiException {
    return alternativeDistributionPackagesGetInstanceWithHttpInfo(id, fieldsAlternativeDistributionPackages, include, fieldsAlternativeDistributionPackageVersions, limitVersions).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAlternativeDistributionPackages the fields to include for returned resources of type alternativeDistributionPackages (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsAlternativeDistributionPackageVersions the fields to include for returned resources of type alternativeDistributionPackageVersions (optional)
   * @param limitVersions maximum number of related versions returned (when they are included) (optional)
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
  public ApiResponse<AlternativeDistributionPackageResponse> alternativeDistributionPackagesGetInstanceWithHttpInfo(String id, List<String> fieldsAlternativeDistributionPackages, List<String> include, List<String> fieldsAlternativeDistributionPackageVersions, Integer limitVersions) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling alternativeDistributionPackagesGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/alternativeDistributionPackages/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[alternativeDistributionPackages]", fieldsAlternativeDistributionPackages)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[alternativeDistributionPackageVersions]", fieldsAlternativeDistributionPackageVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[versions]", limitVersions));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AlternativeDistributionPackageResponse> localVarReturnType = new GenericType<AlternativeDistributionPackageResponse>() {};
    return apiClient.invokeAPI("AlternativeDistributionPackagesApi.alternativeDistributionPackagesGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterState filter by attribute &#39;state&#39; (optional)
   * @param fieldsAlternativeDistributionPackageVariants the fields to include for returned resources of type alternativeDistributionPackageVariants (optional)
   * @param fieldsAlternativeDistributionPackages the fields to include for returned resources of type alternativeDistributionPackages (optional)
   * @param fieldsAlternativeDistributionPackageVersions the fields to include for returned resources of type alternativeDistributionPackageVersions (optional)
   * @param fieldsAlternativeDistributionPackageDeltas the fields to include for returned resources of type alternativeDistributionPackageDeltas (optional)
   * @param limit maximum resources per page (optional)
   * @param limitVariants maximum number of related variants returned (when they are included) (optional)
   * @param limitDeltas maximum number of related deltas returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AlternativeDistributionPackageVersionsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AlternativeDistributionPackageVersions </td><td>  -  </td></tr>
     </table>
   */
  public AlternativeDistributionPackageVersionsResponse alternativeDistributionPackagesVersionsGetToManyRelated(String id, List<String> filterState, List<String> fieldsAlternativeDistributionPackageVariants, List<String> fieldsAlternativeDistributionPackages, List<String> fieldsAlternativeDistributionPackageVersions, List<String> fieldsAlternativeDistributionPackageDeltas, Integer limit, Integer limitVariants, Integer limitDeltas, List<String> include) throws ApiException {
    return alternativeDistributionPackagesVersionsGetToManyRelatedWithHttpInfo(id, filterState, fieldsAlternativeDistributionPackageVariants, fieldsAlternativeDistributionPackages, fieldsAlternativeDistributionPackageVersions, fieldsAlternativeDistributionPackageDeltas, limit, limitVariants, limitDeltas, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterState filter by attribute &#39;state&#39; (optional)
   * @param fieldsAlternativeDistributionPackageVariants the fields to include for returned resources of type alternativeDistributionPackageVariants (optional)
   * @param fieldsAlternativeDistributionPackages the fields to include for returned resources of type alternativeDistributionPackages (optional)
   * @param fieldsAlternativeDistributionPackageVersions the fields to include for returned resources of type alternativeDistributionPackageVersions (optional)
   * @param fieldsAlternativeDistributionPackageDeltas the fields to include for returned resources of type alternativeDistributionPackageDeltas (optional)
   * @param limit maximum resources per page (optional)
   * @param limitVariants maximum number of related variants returned (when they are included) (optional)
   * @param limitDeltas maximum number of related deltas returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AlternativeDistributionPackageVersionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AlternativeDistributionPackageVersions </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AlternativeDistributionPackageVersionsResponse> alternativeDistributionPackagesVersionsGetToManyRelatedWithHttpInfo(String id, List<String> filterState, List<String> fieldsAlternativeDistributionPackageVariants, List<String> fieldsAlternativeDistributionPackages, List<String> fieldsAlternativeDistributionPackageVersions, List<String> fieldsAlternativeDistributionPackageDeltas, Integer limit, Integer limitVariants, Integer limitDeltas, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling alternativeDistributionPackagesVersionsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/alternativeDistributionPackages/{id}/versions"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[state]", filterState)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[alternativeDistributionPackageVariants]", fieldsAlternativeDistributionPackageVariants));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[alternativeDistributionPackages]", fieldsAlternativeDistributionPackages));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[alternativeDistributionPackageVersions]", fieldsAlternativeDistributionPackageVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[alternativeDistributionPackageDeltas]", fieldsAlternativeDistributionPackageDeltas));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[variants]", limitVariants));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[deltas]", limitDeltas));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AlternativeDistributionPackageVersionsResponse> localVarReturnType = new GenericType<AlternativeDistributionPackageVersionsResponse>() {};
    return apiClient.invokeAPI("AlternativeDistributionPackagesApi.alternativeDistributionPackagesVersionsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
