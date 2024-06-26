package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.ErrorResponse;
import java.io.File;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class FinanceReportsApi {
  private ApiClient apiClient;

  public FinanceReportsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FinanceReportsApi(ApiClient apiClient) {
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
   * @param filterRegionCode filter by attribute &#39;regionCode&#39; (required)
   * @param filterReportDate filter by attribute &#39;reportDate&#39; (required)
   * @param filterReportType filter by attribute &#39;reportType&#39; (required)
   * @param filterVendorNumber filter by attribute &#39;vendorNumber&#39; (required)
   * @return File
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of FinanceReports </td><td>  -  </td></tr>
     </table>
   */
  public File financeReportsGetCollection(List<String> filterRegionCode, List<String> filterReportDate, List<String> filterReportType, List<String> filterVendorNumber) throws ApiException {
    return financeReportsGetCollectionWithHttpInfo(filterRegionCode, filterReportDate, filterReportType, filterVendorNumber).getData();
  }

  /**
   * 
   * 
   * @param filterRegionCode filter by attribute &#39;regionCode&#39; (required)
   * @param filterReportDate filter by attribute &#39;reportDate&#39; (required)
   * @param filterReportType filter by attribute &#39;reportType&#39; (required)
   * @param filterVendorNumber filter by attribute &#39;vendorNumber&#39; (required)
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of FinanceReports </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<File> financeReportsGetCollectionWithHttpInfo(List<String> filterRegionCode, List<String> filterReportDate, List<String> filterReportType, List<String> filterVendorNumber) throws ApiException {
    // Check required parameters
    if (filterRegionCode == null) {
      throw new ApiException(400, "Missing the required parameter 'filterRegionCode' when calling financeReportsGetCollection");
    }
    if (filterReportDate == null) {
      throw new ApiException(400, "Missing the required parameter 'filterReportDate' when calling financeReportsGetCollection");
    }
    if (filterReportType == null) {
      throw new ApiException(400, "Missing the required parameter 'filterReportType' when calling financeReportsGetCollection");
    }
    if (filterVendorNumber == null) {
      throw new ApiException(400, "Missing the required parameter 'filterVendorNumber' when calling financeReportsGetCollection");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[regionCode]", filterRegionCode)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[reportDate]", filterReportDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[reportType]", filterReportType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[vendorNumber]", filterVendorNumber));

    String localVarAccept = apiClient.selectHeaderAccept("application/json", "application/a-gzip");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<File> localVarReturnType = new GenericType<File>() {};
    return apiClient.invokeAPI("FinanceReportsApi.financeReportsGetCollection", "/v1/financeReports", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
