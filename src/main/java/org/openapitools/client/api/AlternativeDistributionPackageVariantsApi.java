package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.AlternativeDistributionPackageVariantResponse;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AlternativeDistributionPackageVariantsApi {
  private ApiClient apiClient;

  public AlternativeDistributionPackageVariantsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AlternativeDistributionPackageVariantsApi(ApiClient apiClient) {
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
   * @param fieldsAlternativeDistributionPackageVariants the fields to include for returned resources of type alternativeDistributionPackageVariants (optional)
   * @return AlternativeDistributionPackageVariantResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AlternativeDistributionPackageVariant </td><td>  -  </td></tr>
     </table>
   */
  public AlternativeDistributionPackageVariantResponse alternativeDistributionPackageVariantsGetInstance(String id, List<String> fieldsAlternativeDistributionPackageVariants) throws ApiException {
    return alternativeDistributionPackageVariantsGetInstanceWithHttpInfo(id, fieldsAlternativeDistributionPackageVariants).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAlternativeDistributionPackageVariants the fields to include for returned resources of type alternativeDistributionPackageVariants (optional)
   * @return ApiResponse&lt;AlternativeDistributionPackageVariantResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AlternativeDistributionPackageVariant </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AlternativeDistributionPackageVariantResponse> alternativeDistributionPackageVariantsGetInstanceWithHttpInfo(String id, List<String> fieldsAlternativeDistributionPackageVariants) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling alternativeDistributionPackageVariantsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/alternativeDistributionPackageVariants/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[alternativeDistributionPackageVariants]", fieldsAlternativeDistributionPackageVariants)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AlternativeDistributionPackageVariantResponse> localVarReturnType = new GenericType<AlternativeDistributionPackageVariantResponse>() {};
    return apiClient.invokeAPI("AlternativeDistributionPackageVariantsApi.alternativeDistributionPackageVariantsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
