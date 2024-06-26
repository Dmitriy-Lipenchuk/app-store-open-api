package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.AnalyticsReportSegmentResponse;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AnalyticsReportSegmentsApi {
  private ApiClient apiClient;

  public AnalyticsReportSegmentsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AnalyticsReportSegmentsApi(ApiClient apiClient) {
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
   * @param fieldsAnalyticsReportSegments the fields to include for returned resources of type analyticsReportSegments (optional)
   * @return AnalyticsReportSegmentResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AnalyticsReportSegment </td><td>  -  </td></tr>
     </table>
   */
  public AnalyticsReportSegmentResponse analyticsReportSegmentsGetInstance(String id, List<String> fieldsAnalyticsReportSegments) throws ApiException {
    return analyticsReportSegmentsGetInstanceWithHttpInfo(id, fieldsAnalyticsReportSegments).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAnalyticsReportSegments the fields to include for returned resources of type analyticsReportSegments (optional)
   * @return ApiResponse&lt;AnalyticsReportSegmentResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AnalyticsReportSegment </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AnalyticsReportSegmentResponse> analyticsReportSegmentsGetInstanceWithHttpInfo(String id, List<String> fieldsAnalyticsReportSegments) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling analyticsReportSegmentsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/analyticsReportSegments/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[analyticsReportSegments]", fieldsAnalyticsReportSegments)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AnalyticsReportSegmentResponse> localVarReturnType = new GenericType<AnalyticsReportSegmentResponse>() {};
    return apiClient.invokeAPI("AnalyticsReportSegmentsApi.analyticsReportSegmentsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
