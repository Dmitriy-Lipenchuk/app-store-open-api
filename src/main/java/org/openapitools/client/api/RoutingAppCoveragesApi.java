package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.RoutingAppCoverageCreateRequest;
import org.openapitools.client.model.RoutingAppCoverageResponse;
import org.openapitools.client.model.RoutingAppCoverageUpdateRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class RoutingAppCoveragesApi {
  private ApiClient apiClient;

  public RoutingAppCoveragesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RoutingAppCoveragesApi(ApiClient apiClient) {
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
   * @param routingAppCoverageCreateRequest RoutingAppCoverage representation (required)
   * @return RoutingAppCoverageResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single RoutingAppCoverage </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public RoutingAppCoverageResponse routingAppCoveragesCreateInstance(RoutingAppCoverageCreateRequest routingAppCoverageCreateRequest) throws ApiException {
    return routingAppCoveragesCreateInstanceWithHttpInfo(routingAppCoverageCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param routingAppCoverageCreateRequest RoutingAppCoverage representation (required)
   * @return ApiResponse&lt;RoutingAppCoverageResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single RoutingAppCoverage </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RoutingAppCoverageResponse> routingAppCoveragesCreateInstanceWithHttpInfo(RoutingAppCoverageCreateRequest routingAppCoverageCreateRequest) throws ApiException {
    // Check required parameters
    if (routingAppCoverageCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'routingAppCoverageCreateRequest' when calling routingAppCoveragesCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<RoutingAppCoverageResponse> localVarReturnType = new GenericType<RoutingAppCoverageResponse>() {};
    return apiClient.invokeAPI("RoutingAppCoveragesApi.routingAppCoveragesCreateInstance", "/v1/routingAppCoverages", "POST", new ArrayList<>(), routingAppCoverageCreateRequest,
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
  public void routingAppCoveragesDeleteInstance(String id) throws ApiException {
    routingAppCoveragesDeleteInstanceWithHttpInfo(id);
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
  public ApiResponse<Void> routingAppCoveragesDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling routingAppCoveragesDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/routingAppCoverages/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("RoutingAppCoveragesApi.routingAppCoveragesDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsRoutingAppCoverages the fields to include for returned resources of type routingAppCoverages (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return RoutingAppCoverageResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single RoutingAppCoverage </td><td>  -  </td></tr>
     </table>
   */
  public RoutingAppCoverageResponse routingAppCoveragesGetInstance(String id, List<String> fieldsRoutingAppCoverages, List<String> include) throws ApiException {
    return routingAppCoveragesGetInstanceWithHttpInfo(id, fieldsRoutingAppCoverages, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsRoutingAppCoverages the fields to include for returned resources of type routingAppCoverages (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;RoutingAppCoverageResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single RoutingAppCoverage </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RoutingAppCoverageResponse> routingAppCoveragesGetInstanceWithHttpInfo(String id, List<String> fieldsRoutingAppCoverages, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling routingAppCoveragesGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/routingAppCoverages/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[routingAppCoverages]", fieldsRoutingAppCoverages)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<RoutingAppCoverageResponse> localVarReturnType = new GenericType<RoutingAppCoverageResponse>() {};
    return apiClient.invokeAPI("RoutingAppCoveragesApi.routingAppCoveragesGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param routingAppCoverageUpdateRequest RoutingAppCoverage representation (required)
   * @return RoutingAppCoverageResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single RoutingAppCoverage </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public RoutingAppCoverageResponse routingAppCoveragesUpdateInstance(String id, RoutingAppCoverageUpdateRequest routingAppCoverageUpdateRequest) throws ApiException {
    return routingAppCoveragesUpdateInstanceWithHttpInfo(id, routingAppCoverageUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param routingAppCoverageUpdateRequest RoutingAppCoverage representation (required)
   * @return ApiResponse&lt;RoutingAppCoverageResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single RoutingAppCoverage </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<RoutingAppCoverageResponse> routingAppCoveragesUpdateInstanceWithHttpInfo(String id, RoutingAppCoverageUpdateRequest routingAppCoverageUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling routingAppCoveragesUpdateInstance");
    }
    if (routingAppCoverageUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'routingAppCoverageUpdateRequest' when calling routingAppCoveragesUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/routingAppCoverages/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<RoutingAppCoverageResponse> localVarReturnType = new GenericType<RoutingAppCoverageResponse>() {};
    return apiClient.invokeAPI("RoutingAppCoveragesApi.routingAppCoveragesUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), routingAppCoverageUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
