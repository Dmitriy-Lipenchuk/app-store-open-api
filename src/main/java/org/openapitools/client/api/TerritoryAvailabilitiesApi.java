package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.TerritoryAvailabilityResponse;
import org.openapitools.client.model.TerritoryAvailabilityUpdateRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class TerritoryAvailabilitiesApi {
  private ApiClient apiClient;

  public TerritoryAvailabilitiesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TerritoryAvailabilitiesApi(ApiClient apiClient) {
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
   * @param territoryAvailabilityUpdateRequest TerritoryAvailability representation (required)
   * @return TerritoryAvailabilityResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single TerritoryAvailability </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public TerritoryAvailabilityResponse territoryAvailabilitiesUpdateInstance(String id, TerritoryAvailabilityUpdateRequest territoryAvailabilityUpdateRequest) throws ApiException {
    return territoryAvailabilitiesUpdateInstanceWithHttpInfo(id, territoryAvailabilityUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param territoryAvailabilityUpdateRequest TerritoryAvailability representation (required)
   * @return ApiResponse&lt;TerritoryAvailabilityResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single TerritoryAvailability </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TerritoryAvailabilityResponse> territoryAvailabilitiesUpdateInstanceWithHttpInfo(String id, TerritoryAvailabilityUpdateRequest territoryAvailabilityUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling territoryAvailabilitiesUpdateInstance");
    }
    if (territoryAvailabilityUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'territoryAvailabilityUpdateRequest' when calling territoryAvailabilitiesUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/territoryAvailabilities/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<TerritoryAvailabilityResponse> localVarReturnType = new GenericType<TerritoryAvailabilityResponse>() {};
    return apiClient.invokeAPI("TerritoryAvailabilitiesApi.territoryAvailabilitiesUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), territoryAvailabilityUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
