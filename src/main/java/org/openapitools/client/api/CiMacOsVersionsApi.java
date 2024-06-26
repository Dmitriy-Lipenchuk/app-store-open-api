package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.CiMacOsVersionResponse;
import org.openapitools.client.model.CiMacOsVersionsResponse;
import org.openapitools.client.model.CiXcodeVersionsResponse;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class CiMacOsVersionsApi {
  private ApiClient apiClient;

  public CiMacOsVersionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CiMacOsVersionsApi(ApiClient apiClient) {
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
   * @param fieldsCiMacOsVersions the fields to include for returned resources of type ciMacOsVersions (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsCiXcodeVersions the fields to include for returned resources of type ciXcodeVersions (optional)
   * @param limitXcodeVersions maximum number of related xcodeVersions returned (when they are included) (optional)
   * @return CiMacOsVersionsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of CiMacOsVersions </td><td>  -  </td></tr>
     </table>
   */
  public CiMacOsVersionsResponse ciMacOsVersionsGetCollection(List<String> fieldsCiMacOsVersions, Integer limit, List<String> include, List<String> fieldsCiXcodeVersions, Integer limitXcodeVersions) throws ApiException {
    return ciMacOsVersionsGetCollectionWithHttpInfo(fieldsCiMacOsVersions, limit, include, fieldsCiXcodeVersions, limitXcodeVersions).getData();
  }

  /**
   * 
   * 
   * @param fieldsCiMacOsVersions the fields to include for returned resources of type ciMacOsVersions (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsCiXcodeVersions the fields to include for returned resources of type ciXcodeVersions (optional)
   * @param limitXcodeVersions maximum number of related xcodeVersions returned (when they are included) (optional)
   * @return ApiResponse&lt;CiMacOsVersionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of CiMacOsVersions </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CiMacOsVersionsResponse> ciMacOsVersionsGetCollectionWithHttpInfo(List<String> fieldsCiMacOsVersions, Integer limit, List<String> include, List<String> fieldsCiXcodeVersions, Integer limitXcodeVersions) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[ciMacOsVersions]", fieldsCiMacOsVersions)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[ciXcodeVersions]", fieldsCiXcodeVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[xcodeVersions]", limitXcodeVersions));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<CiMacOsVersionsResponse> localVarReturnType = new GenericType<CiMacOsVersionsResponse>() {};
    return apiClient.invokeAPI("CiMacOsVersionsApi.ciMacOsVersionsGetCollection", "/v1/ciMacOsVersions", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsCiMacOsVersions the fields to include for returned resources of type ciMacOsVersions (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsCiXcodeVersions the fields to include for returned resources of type ciXcodeVersions (optional)
   * @param limitXcodeVersions maximum number of related xcodeVersions returned (when they are included) (optional)
   * @return CiMacOsVersionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single CiMacOsVersion </td><td>  -  </td></tr>
     </table>
   */
  public CiMacOsVersionResponse ciMacOsVersionsGetInstance(String id, List<String> fieldsCiMacOsVersions, List<String> include, List<String> fieldsCiXcodeVersions, Integer limitXcodeVersions) throws ApiException {
    return ciMacOsVersionsGetInstanceWithHttpInfo(id, fieldsCiMacOsVersions, include, fieldsCiXcodeVersions, limitXcodeVersions).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsCiMacOsVersions the fields to include for returned resources of type ciMacOsVersions (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsCiXcodeVersions the fields to include for returned resources of type ciXcodeVersions (optional)
   * @param limitXcodeVersions maximum number of related xcodeVersions returned (when they are included) (optional)
   * @return ApiResponse&lt;CiMacOsVersionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single CiMacOsVersion </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CiMacOsVersionResponse> ciMacOsVersionsGetInstanceWithHttpInfo(String id, List<String> fieldsCiMacOsVersions, List<String> include, List<String> fieldsCiXcodeVersions, Integer limitXcodeVersions) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling ciMacOsVersionsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/ciMacOsVersions/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[ciMacOsVersions]", fieldsCiMacOsVersions)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[ciXcodeVersions]", fieldsCiXcodeVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[xcodeVersions]", limitXcodeVersions));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<CiMacOsVersionResponse> localVarReturnType = new GenericType<CiMacOsVersionResponse>() {};
    return apiClient.invokeAPI("CiMacOsVersionsApi.ciMacOsVersionsGetInstance", localVarPath, "GET", localVarQueryParams, null,
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
   * @param limitMacOsVersions maximum number of related macOsVersions returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return CiXcodeVersionsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of CiXcodeVersions </td><td>  -  </td></tr>
     </table>
   */
  public CiXcodeVersionsResponse ciMacOsVersionsXcodeVersionsGetToManyRelated(String id, List<String> fieldsCiXcodeVersions, List<String> fieldsCiMacOsVersions, Integer limit, Integer limitMacOsVersions, List<String> include) throws ApiException {
    return ciMacOsVersionsXcodeVersionsGetToManyRelatedWithHttpInfo(id, fieldsCiXcodeVersions, fieldsCiMacOsVersions, limit, limitMacOsVersions, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsCiXcodeVersions the fields to include for returned resources of type ciXcodeVersions (optional)
   * @param fieldsCiMacOsVersions the fields to include for returned resources of type ciMacOsVersions (optional)
   * @param limit maximum resources per page (optional)
   * @param limitMacOsVersions maximum number of related macOsVersions returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;CiXcodeVersionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of CiXcodeVersions </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CiXcodeVersionsResponse> ciMacOsVersionsXcodeVersionsGetToManyRelatedWithHttpInfo(String id, List<String> fieldsCiXcodeVersions, List<String> fieldsCiMacOsVersions, Integer limit, Integer limitMacOsVersions, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling ciMacOsVersionsXcodeVersionsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/ciMacOsVersions/{id}/xcodeVersions"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[ciXcodeVersions]", fieldsCiXcodeVersions)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[ciMacOsVersions]", fieldsCiMacOsVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[macOsVersions]", limitMacOsVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<CiXcodeVersionsResponse> localVarReturnType = new GenericType<CiXcodeVersionsResponse>() {};
    return apiClient.invokeAPI("CiMacOsVersionsApi.ciMacOsVersionsXcodeVersionsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
