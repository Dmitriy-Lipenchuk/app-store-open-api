package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.AlternativeDistributionPackageDeltasResponse;
import org.openapitools.client.model.AlternativeDistributionPackageVariantsResponse;
import org.openapitools.client.model.AlternativeDistributionPackageVersionResponse;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AlternativeDistributionPackageVersionsApi {
  private ApiClient apiClient;

  public AlternativeDistributionPackageVersionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AlternativeDistributionPackageVersionsApi(ApiClient apiClient) {
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
   * @param fieldsAlternativeDistributionPackageDeltas the fields to include for returned resources of type alternativeDistributionPackageDeltas (optional)
   * @param limit maximum resources per page (optional)
   * @return AlternativeDistributionPackageDeltasResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AlternativeDistributionPackageDeltas </td><td>  -  </td></tr>
     </table>
   */
  public AlternativeDistributionPackageDeltasResponse alternativeDistributionPackageVersionsDeltasGetToManyRelated(String id, List<String> fieldsAlternativeDistributionPackageDeltas, Integer limit) throws ApiException {
    return alternativeDistributionPackageVersionsDeltasGetToManyRelatedWithHttpInfo(id, fieldsAlternativeDistributionPackageDeltas, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAlternativeDistributionPackageDeltas the fields to include for returned resources of type alternativeDistributionPackageDeltas (optional)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;AlternativeDistributionPackageDeltasResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AlternativeDistributionPackageDeltas </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AlternativeDistributionPackageDeltasResponse> alternativeDistributionPackageVersionsDeltasGetToManyRelatedWithHttpInfo(String id, List<String> fieldsAlternativeDistributionPackageDeltas, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling alternativeDistributionPackageVersionsDeltasGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/alternativeDistributionPackageVersions/{id}/deltas"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[alternativeDistributionPackageDeltas]", fieldsAlternativeDistributionPackageDeltas)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AlternativeDistributionPackageDeltasResponse> localVarReturnType = new GenericType<AlternativeDistributionPackageDeltasResponse>() {};
    return apiClient.invokeAPI("AlternativeDistributionPackageVersionsApi.alternativeDistributionPackageVersionsDeltasGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAlternativeDistributionPackageVersions the fields to include for returned resources of type alternativeDistributionPackageVersions (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsAlternativeDistributionPackageVariants the fields to include for returned resources of type alternativeDistributionPackageVariants (optional)
   * @param fieldsAlternativeDistributionPackageDeltas the fields to include for returned resources of type alternativeDistributionPackageDeltas (optional)
   * @param limitDeltas maximum number of related deltas returned (when they are included) (optional)
   * @param limitVariants maximum number of related variants returned (when they are included) (optional)
   * @return AlternativeDistributionPackageVersionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AlternativeDistributionPackageVersion </td><td>  -  </td></tr>
     </table>
   */
  public AlternativeDistributionPackageVersionResponse alternativeDistributionPackageVersionsGetInstance(String id, List<String> fieldsAlternativeDistributionPackageVersions, List<String> include, List<String> fieldsAlternativeDistributionPackageVariants, List<String> fieldsAlternativeDistributionPackageDeltas, Integer limitDeltas, Integer limitVariants) throws ApiException {
    return alternativeDistributionPackageVersionsGetInstanceWithHttpInfo(id, fieldsAlternativeDistributionPackageVersions, include, fieldsAlternativeDistributionPackageVariants, fieldsAlternativeDistributionPackageDeltas, limitDeltas, limitVariants).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAlternativeDistributionPackageVersions the fields to include for returned resources of type alternativeDistributionPackageVersions (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsAlternativeDistributionPackageVariants the fields to include for returned resources of type alternativeDistributionPackageVariants (optional)
   * @param fieldsAlternativeDistributionPackageDeltas the fields to include for returned resources of type alternativeDistributionPackageDeltas (optional)
   * @param limitDeltas maximum number of related deltas returned (when they are included) (optional)
   * @param limitVariants maximum number of related variants returned (when they are included) (optional)
   * @return ApiResponse&lt;AlternativeDistributionPackageVersionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AlternativeDistributionPackageVersion </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AlternativeDistributionPackageVersionResponse> alternativeDistributionPackageVersionsGetInstanceWithHttpInfo(String id, List<String> fieldsAlternativeDistributionPackageVersions, List<String> include, List<String> fieldsAlternativeDistributionPackageVariants, List<String> fieldsAlternativeDistributionPackageDeltas, Integer limitDeltas, Integer limitVariants) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling alternativeDistributionPackageVersionsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/alternativeDistributionPackageVersions/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[alternativeDistributionPackageVersions]", fieldsAlternativeDistributionPackageVersions)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[alternativeDistributionPackageVariants]", fieldsAlternativeDistributionPackageVariants));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[alternativeDistributionPackageDeltas]", fieldsAlternativeDistributionPackageDeltas));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[deltas]", limitDeltas));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[variants]", limitVariants));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AlternativeDistributionPackageVersionResponse> localVarReturnType = new GenericType<AlternativeDistributionPackageVersionResponse>() {};
    return apiClient.invokeAPI("AlternativeDistributionPackageVersionsApi.alternativeDistributionPackageVersionsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAlternativeDistributionPackageVariants the fields to include for returned resources of type alternativeDistributionPackageVariants (optional)
   * @param limit maximum resources per page (optional)
   * @return AlternativeDistributionPackageVariantsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AlternativeDistributionPackageVariants </td><td>  -  </td></tr>
     </table>
   */
  public AlternativeDistributionPackageVariantsResponse alternativeDistributionPackageVersionsVariantsGetToManyRelated(String id, List<String> fieldsAlternativeDistributionPackageVariants, Integer limit) throws ApiException {
    return alternativeDistributionPackageVersionsVariantsGetToManyRelatedWithHttpInfo(id, fieldsAlternativeDistributionPackageVariants, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAlternativeDistributionPackageVariants the fields to include for returned resources of type alternativeDistributionPackageVariants (optional)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;AlternativeDistributionPackageVariantsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AlternativeDistributionPackageVariants </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AlternativeDistributionPackageVariantsResponse> alternativeDistributionPackageVersionsVariantsGetToManyRelatedWithHttpInfo(String id, List<String> fieldsAlternativeDistributionPackageVariants, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling alternativeDistributionPackageVersionsVariantsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/alternativeDistributionPackageVersions/{id}/variants"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[alternativeDistributionPackageVariants]", fieldsAlternativeDistributionPackageVariants)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AlternativeDistributionPackageVariantsResponse> localVarReturnType = new GenericType<AlternativeDistributionPackageVariantsResponse>() {};
    return apiClient.invokeAPI("AlternativeDistributionPackageVersionsApi.alternativeDistributionPackageVersionsVariantsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
