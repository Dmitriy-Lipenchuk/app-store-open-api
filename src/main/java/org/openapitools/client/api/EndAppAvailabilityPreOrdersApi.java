package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.EndAppAvailabilityPreOrderCreateRequest;
import org.openapitools.client.model.EndAppAvailabilityPreOrderResponse;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class EndAppAvailabilityPreOrdersApi {
  private ApiClient apiClient;

  public EndAppAvailabilityPreOrdersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EndAppAvailabilityPreOrdersApi(ApiClient apiClient) {
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
   * @param endAppAvailabilityPreOrderCreateRequest EndAppAvailabilityPreOrder representation (required)
   * @return EndAppAvailabilityPreOrderResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single EndAppAvailabilityPreOrder </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public EndAppAvailabilityPreOrderResponse endAppAvailabilityPreOrdersCreateInstance(EndAppAvailabilityPreOrderCreateRequest endAppAvailabilityPreOrderCreateRequest) throws ApiException {
    return endAppAvailabilityPreOrdersCreateInstanceWithHttpInfo(endAppAvailabilityPreOrderCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param endAppAvailabilityPreOrderCreateRequest EndAppAvailabilityPreOrder representation (required)
   * @return ApiResponse&lt;EndAppAvailabilityPreOrderResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single EndAppAvailabilityPreOrder </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EndAppAvailabilityPreOrderResponse> endAppAvailabilityPreOrdersCreateInstanceWithHttpInfo(EndAppAvailabilityPreOrderCreateRequest endAppAvailabilityPreOrderCreateRequest) throws ApiException {
    // Check required parameters
    if (endAppAvailabilityPreOrderCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'endAppAvailabilityPreOrderCreateRequest' when calling endAppAvailabilityPreOrdersCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<EndAppAvailabilityPreOrderResponse> localVarReturnType = new GenericType<EndAppAvailabilityPreOrderResponse>() {};
    return apiClient.invokeAPI("EndAppAvailabilityPreOrdersApi.endAppAvailabilityPreOrdersCreateInstance", "/v1/endAppAvailabilityPreOrders", "POST", new ArrayList<>(), endAppAvailabilityPreOrderCreateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
