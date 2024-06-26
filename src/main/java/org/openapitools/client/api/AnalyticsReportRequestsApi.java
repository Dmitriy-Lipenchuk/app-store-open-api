package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.AnalyticsReportRequestCreateRequest;
import org.openapitools.client.model.AnalyticsReportRequestResponse;
import org.openapitools.client.model.AnalyticsReportsResponse;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AnalyticsReportRequestsApi {
  private ApiClient apiClient;

  public AnalyticsReportRequestsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AnalyticsReportRequestsApi(ApiClient apiClient) {
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
   * @param analyticsReportRequestCreateRequest AnalyticsReportRequest representation (required)
   * @return AnalyticsReportRequestResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AnalyticsReportRequest </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public AnalyticsReportRequestResponse analyticsReportRequestsCreateInstance(AnalyticsReportRequestCreateRequest analyticsReportRequestCreateRequest) throws ApiException {
    return analyticsReportRequestsCreateInstanceWithHttpInfo(analyticsReportRequestCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param analyticsReportRequestCreateRequest AnalyticsReportRequest representation (required)
   * @return ApiResponse&lt;AnalyticsReportRequestResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AnalyticsReportRequest </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AnalyticsReportRequestResponse> analyticsReportRequestsCreateInstanceWithHttpInfo(AnalyticsReportRequestCreateRequest analyticsReportRequestCreateRequest) throws ApiException {
    // Check required parameters
    if (analyticsReportRequestCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'analyticsReportRequestCreateRequest' when calling analyticsReportRequestsCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AnalyticsReportRequestResponse> localVarReturnType = new GenericType<AnalyticsReportRequestResponse>() {};
    return apiClient.invokeAPI("AnalyticsReportRequestsApi.analyticsReportRequestsCreateInstance", "/v1/analyticsReportRequests", "POST", new ArrayList<>(), analyticsReportRequestCreateRequest,
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
  public void analyticsReportRequestsDeleteInstance(String id) throws ApiException {
    analyticsReportRequestsDeleteInstanceWithHttpInfo(id);
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
  public ApiResponse<Void> analyticsReportRequestsDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling analyticsReportRequestsDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/analyticsReportRequests/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("AnalyticsReportRequestsApi.analyticsReportRequestsDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAnalyticsReportRequests the fields to include for returned resources of type analyticsReportRequests (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsAnalyticsReports the fields to include for returned resources of type analyticsReports (optional)
   * @param limitReports maximum number of related reports returned (when they are included) (optional)
   * @return AnalyticsReportRequestResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AnalyticsReportRequest </td><td>  -  </td></tr>
     </table>
   */
  public AnalyticsReportRequestResponse analyticsReportRequestsGetInstance(String id, List<String> fieldsAnalyticsReportRequests, List<String> include, List<String> fieldsAnalyticsReports, Integer limitReports) throws ApiException {
    return analyticsReportRequestsGetInstanceWithHttpInfo(id, fieldsAnalyticsReportRequests, include, fieldsAnalyticsReports, limitReports).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAnalyticsReportRequests the fields to include for returned resources of type analyticsReportRequests (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsAnalyticsReports the fields to include for returned resources of type analyticsReports (optional)
   * @param limitReports maximum number of related reports returned (when they are included) (optional)
   * @return ApiResponse&lt;AnalyticsReportRequestResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AnalyticsReportRequest </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AnalyticsReportRequestResponse> analyticsReportRequestsGetInstanceWithHttpInfo(String id, List<String> fieldsAnalyticsReportRequests, List<String> include, List<String> fieldsAnalyticsReports, Integer limitReports) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling analyticsReportRequestsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/analyticsReportRequests/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[analyticsReportRequests]", fieldsAnalyticsReportRequests)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[analyticsReports]", fieldsAnalyticsReports));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[reports]", limitReports));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AnalyticsReportRequestResponse> localVarReturnType = new GenericType<AnalyticsReportRequestResponse>() {};
    return apiClient.invokeAPI("AnalyticsReportRequestsApi.analyticsReportRequestsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterCategory filter by attribute &#39;category&#39; (optional)
   * @param filterName filter by attribute &#39;name&#39; (optional)
   * @param fieldsAnalyticsReports the fields to include for returned resources of type analyticsReports (optional)
   * @param limit maximum resources per page (optional)
   * @return AnalyticsReportsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AnalyticsReports </td><td>  -  </td></tr>
     </table>
   */
  public AnalyticsReportsResponse analyticsReportRequestsReportsGetToManyRelated(String id, List<String> filterCategory, List<String> filterName, List<String> fieldsAnalyticsReports, Integer limit) throws ApiException {
    return analyticsReportRequestsReportsGetToManyRelatedWithHttpInfo(id, filterCategory, filterName, fieldsAnalyticsReports, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterCategory filter by attribute &#39;category&#39; (optional)
   * @param filterName filter by attribute &#39;name&#39; (optional)
   * @param fieldsAnalyticsReports the fields to include for returned resources of type analyticsReports (optional)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;AnalyticsReportsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AnalyticsReports </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AnalyticsReportsResponse> analyticsReportRequestsReportsGetToManyRelatedWithHttpInfo(String id, List<String> filterCategory, List<String> filterName, List<String> fieldsAnalyticsReports, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling analyticsReportRequestsReportsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/analyticsReportRequests/{id}/reports"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[category]", filterCategory)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[name]", filterName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[analyticsReports]", fieldsAnalyticsReports));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AnalyticsReportsResponse> localVarReturnType = new GenericType<AnalyticsReportsResponse>() {};
    return apiClient.invokeAPI("AnalyticsReportRequestsApi.analyticsReportRequestsReportsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
