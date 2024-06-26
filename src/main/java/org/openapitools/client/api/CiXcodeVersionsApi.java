package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.CiMacOsVersionsResponse;
import org.openapitools.client.model.CiXcodeVersionResponse;
import org.openapitools.client.model.CiXcodeVersionsResponse;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class CiXcodeVersionsApi {
  private ApiClient apiClient;

  public CiXcodeVersionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CiXcodeVersionsApi(ApiClient apiClient) {
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
   * @param fieldsCiXcodeVersions the fields to include for returned resources of type ciXcodeVersions (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsCiMacOsVersions the fields to include for returned resources of type ciMacOsVersions (optional)
   * @param limitMacOsVersions maximum number of related macOsVersions returned (when they are included) (optional)
   * @return CiXcodeVersionsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of CiXcodeVersions </td><td>  -  </td></tr>
     </table>
   */
  public CiXcodeVersionsResponse ciXcodeVersionsGetCollection(List<String> fieldsCiXcodeVersions, Integer limit, List<String> include, List<String> fieldsCiMacOsVersions, Integer limitMacOsVersions) throws ApiException {
    return ciXcodeVersionsGetCollectionWithHttpInfo(fieldsCiXcodeVersions, limit, include, fieldsCiMacOsVersions, limitMacOsVersions).getData();
  }

  /**
   * 
   * 
   * @param fieldsCiXcodeVersions the fields to include for returned resources of type ciXcodeVersions (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsCiMacOsVersions the fields to include for returned resources of type ciMacOsVersions (optional)
   * @param limitMacOsVersions maximum number of related macOsVersions returned (when they are included) (optional)
   * @return ApiResponse&lt;CiXcodeVersionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of CiXcodeVersions </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CiXcodeVersionsResponse> ciXcodeVersionsGetCollectionWithHttpInfo(List<String> fieldsCiXcodeVersions, Integer limit, List<String> include, List<String> fieldsCiMacOsVersions, Integer limitMacOsVersions) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[ciXcodeVersions]", fieldsCiXcodeVersions)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[ciMacOsVersions]", fieldsCiMacOsVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[macOsVersions]", limitMacOsVersions));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<CiXcodeVersionsResponse> localVarReturnType = new GenericType<CiXcodeVersionsResponse>() {};
    return apiClient.invokeAPI("CiXcodeVersionsApi.ciXcodeVersionsGetCollection", "/v1/ciXcodeVersions", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsCiXcodeVersions the fields to include for returned resources of type ciXcodeVersions (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsCiMacOsVersions the fields to include for returned resources of type ciMacOsVersions (optional)
   * @param limitMacOsVersions maximum number of related macOsVersions returned (when they are included) (optional)
   * @return CiXcodeVersionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single CiXcodeVersion </td><td>  -  </td></tr>
     </table>
   */
  public CiXcodeVersionResponse ciXcodeVersionsGetInstance(String id, List<String> fieldsCiXcodeVersions, List<String> include, List<String> fieldsCiMacOsVersions, Integer limitMacOsVersions) throws ApiException {
    return ciXcodeVersionsGetInstanceWithHttpInfo(id, fieldsCiXcodeVersions, include, fieldsCiMacOsVersions, limitMacOsVersions).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsCiXcodeVersions the fields to include for returned resources of type ciXcodeVersions (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsCiMacOsVersions the fields to include for returned resources of type ciMacOsVersions (optional)
   * @param limitMacOsVersions maximum number of related macOsVersions returned (when they are included) (optional)
   * @return ApiResponse&lt;CiXcodeVersionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single CiXcodeVersion </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CiXcodeVersionResponse> ciXcodeVersionsGetInstanceWithHttpInfo(String id, List<String> fieldsCiXcodeVersions, List<String> include, List<String> fieldsCiMacOsVersions, Integer limitMacOsVersions) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling ciXcodeVersionsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/ciXcodeVersions/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[ciXcodeVersions]", fieldsCiXcodeVersions)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[ciMacOsVersions]", fieldsCiMacOsVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[macOsVersions]", limitMacOsVersions));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<CiXcodeVersionResponse> localVarReturnType = new GenericType<CiXcodeVersionResponse>() {};
    return apiClient.invokeAPI("CiXcodeVersionsApi.ciXcodeVersionsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsCiXcodeVersions the fields to include for returned resources of type ciXcodeVersions (optional)
   * @param fieldsCiMacOsVersions the fields to include for returned resources of type ciMacOsVersions (optional)
   * @param limit maximum resources per page (optional)
   * @param limitXcodeVersions maximum number of related xcodeVersions returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return CiMacOsVersionsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of CiMacOsVersions </td><td>  -  </td></tr>
     </table>
   */
  public CiMacOsVersionsResponse ciXcodeVersionsMacOsVersionsGetToManyRelated(String id, List<String> fieldsCiXcodeVersions, List<String> fieldsCiMacOsVersions, Integer limit, Integer limitXcodeVersions, List<String> include) throws ApiException {
    return ciXcodeVersionsMacOsVersionsGetToManyRelatedWithHttpInfo(id, fieldsCiXcodeVersions, fieldsCiMacOsVersions, limit, limitXcodeVersions, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsCiXcodeVersions the fields to include for returned resources of type ciXcodeVersions (optional)
   * @param fieldsCiMacOsVersions the fields to include for returned resources of type ciMacOsVersions (optional)
   * @param limit maximum resources per page (optional)
   * @param limitXcodeVersions maximum number of related xcodeVersions returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;CiMacOsVersionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of CiMacOsVersions </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CiMacOsVersionsResponse> ciXcodeVersionsMacOsVersionsGetToManyRelatedWithHttpInfo(String id, List<String> fieldsCiXcodeVersions, List<String> fieldsCiMacOsVersions, Integer limit, Integer limitXcodeVersions, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling ciXcodeVersionsMacOsVersionsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/ciXcodeVersions/{id}/macOsVersions"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[ciXcodeVersions]", fieldsCiXcodeVersions)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[ciMacOsVersions]", fieldsCiMacOsVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[xcodeVersions]", limitXcodeVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<CiMacOsVersionsResponse> localVarReturnType = new GenericType<CiMacOsVersionsResponse>() {};
    return apiClient.invokeAPI("CiXcodeVersionsApi.ciXcodeVersionsMacOsVersionsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
