package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.AnalyticsReportInstanceResponse;
import org.openapitools.client.model.AnalyticsReportSegmentsResponse;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AnalyticsReportInstancesApi {
  private ApiClient apiClient;

  public AnalyticsReportInstancesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AnalyticsReportInstancesApi(ApiClient apiClient) {
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
   * @param fieldsAnalyticsReportInstances the fields to include for returned resources of type analyticsReportInstances (optional)
   * @param fieldsAnalyticsReportSegments the fields to include for returned resources of type analyticsReportSegments (optional)
   * @return AnalyticsReportInstanceResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AnalyticsReportInstance </td><td>  -  </td></tr>
     </table>
   */
  public AnalyticsReportInstanceResponse analyticsReportInstancesGetInstance(String id, List<String> fieldsAnalyticsReportInstances, List<String> fieldsAnalyticsReportSegments) throws ApiException {
    return analyticsReportInstancesGetInstanceWithHttpInfo(id, fieldsAnalyticsReportInstances, fieldsAnalyticsReportSegments).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAnalyticsReportInstances the fields to include for returned resources of type analyticsReportInstances (optional)
   * @param fieldsAnalyticsReportSegments the fields to include for returned resources of type analyticsReportSegments (optional)
   * @return ApiResponse&lt;AnalyticsReportInstanceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AnalyticsReportInstance </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AnalyticsReportInstanceResponse> analyticsReportInstancesGetInstanceWithHttpInfo(String id, List<String> fieldsAnalyticsReportInstances, List<String> fieldsAnalyticsReportSegments) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling analyticsReportInstancesGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/analyticsReportInstances/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[analyticsReportInstances]", fieldsAnalyticsReportInstances)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[analyticsReportSegments]", fieldsAnalyticsReportSegments));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AnalyticsReportInstanceResponse> localVarReturnType = new GenericType<AnalyticsReportInstanceResponse>() {};
    return apiClient.invokeAPI("AnalyticsReportInstancesApi.analyticsReportInstancesGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAnalyticsReportSegments the fields to include for returned resources of type analyticsReportSegments (optional)
   * @param limit maximum resources per page (optional)
   * @return AnalyticsReportSegmentsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AnalyticsReportSegments </td><td>  -  </td></tr>
     </table>
   */
  public AnalyticsReportSegmentsResponse analyticsReportInstancesSegmentsGetToManyRelated(String id, List<String> fieldsAnalyticsReportSegments, Integer limit) throws ApiException {
    return analyticsReportInstancesSegmentsGetToManyRelatedWithHttpInfo(id, fieldsAnalyticsReportSegments, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAnalyticsReportSegments the fields to include for returned resources of type analyticsReportSegments (optional)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;AnalyticsReportSegmentsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AnalyticsReportSegments </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AnalyticsReportSegmentsResponse> analyticsReportInstancesSegmentsGetToManyRelatedWithHttpInfo(String id, List<String> fieldsAnalyticsReportSegments, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling analyticsReportInstancesSegmentsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/analyticsReportInstances/{id}/segments"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[analyticsReportSegments]", fieldsAnalyticsReportSegments)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AnalyticsReportSegmentsResponse> localVarReturnType = new GenericType<AnalyticsReportSegmentsResponse>() {};
    return apiClient.invokeAPI("AnalyticsReportInstancesApi.analyticsReportInstancesSegmentsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
