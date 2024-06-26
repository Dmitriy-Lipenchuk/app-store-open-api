package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.AnalyticsReportInstancesResponse;
import org.openapitools.client.model.AnalyticsReportResponse;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AnalyticsReportsApi {
  private ApiClient apiClient;

  public AnalyticsReportsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AnalyticsReportsApi(ApiClient apiClient) {
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
   * @param fieldsAnalyticsReports the fields to include for returned resources of type analyticsReports (optional)
   * @param fieldsAnalyticsReportInstances the fields to include for returned resources of type analyticsReportInstances (optional)
   * @return AnalyticsReportResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AnalyticsReport </td><td>  -  </td></tr>
     </table>
   */
  public AnalyticsReportResponse analyticsReportsGetInstance(String id, List<String> fieldsAnalyticsReports, List<String> fieldsAnalyticsReportInstances) throws ApiException {
    return analyticsReportsGetInstanceWithHttpInfo(id, fieldsAnalyticsReports, fieldsAnalyticsReportInstances).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAnalyticsReports the fields to include for returned resources of type analyticsReports (optional)
   * @param fieldsAnalyticsReportInstances the fields to include for returned resources of type analyticsReportInstances (optional)
   * @return ApiResponse&lt;AnalyticsReportResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AnalyticsReport </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AnalyticsReportResponse> analyticsReportsGetInstanceWithHttpInfo(String id, List<String> fieldsAnalyticsReports, List<String> fieldsAnalyticsReportInstances) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling analyticsReportsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/analyticsReports/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[analyticsReports]", fieldsAnalyticsReports)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[analyticsReportInstances]", fieldsAnalyticsReportInstances));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AnalyticsReportResponse> localVarReturnType = new GenericType<AnalyticsReportResponse>() {};
    return apiClient.invokeAPI("AnalyticsReportsApi.analyticsReportsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterGranularity filter by attribute &#39;granularity&#39; (optional)
   * @param filterProcessingDate filter by attribute &#39;processingDate&#39; (optional)
   * @param fieldsAnalyticsReportInstances the fields to include for returned resources of type analyticsReportInstances (optional)
   * @param limit maximum resources per page (optional)
   * @return AnalyticsReportInstancesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AnalyticsReportInstances </td><td>  -  </td></tr>
     </table>
   */
  public AnalyticsReportInstancesResponse analyticsReportsInstancesGetToManyRelated(String id, List<String> filterGranularity, List<String> filterProcessingDate, List<String> fieldsAnalyticsReportInstances, Integer limit) throws ApiException {
    return analyticsReportsInstancesGetToManyRelatedWithHttpInfo(id, filterGranularity, filterProcessingDate, fieldsAnalyticsReportInstances, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterGranularity filter by attribute &#39;granularity&#39; (optional)
   * @param filterProcessingDate filter by attribute &#39;processingDate&#39; (optional)
   * @param fieldsAnalyticsReportInstances the fields to include for returned resources of type analyticsReportInstances (optional)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;AnalyticsReportInstancesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AnalyticsReportInstances </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AnalyticsReportInstancesResponse> analyticsReportsInstancesGetToManyRelatedWithHttpInfo(String id, List<String> filterGranularity, List<String> filterProcessingDate, List<String> fieldsAnalyticsReportInstances, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling analyticsReportsInstancesGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/analyticsReports/{id}/instances"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[granularity]", filterGranularity)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[processingDate]", filterProcessingDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[analyticsReportInstances]", fieldsAnalyticsReportInstances));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AnalyticsReportInstancesResponse> localVarReturnType = new GenericType<AnalyticsReportInstancesResponse>() {};
    return apiClient.invokeAPI("AnalyticsReportsApi.analyticsReportsInstancesGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
