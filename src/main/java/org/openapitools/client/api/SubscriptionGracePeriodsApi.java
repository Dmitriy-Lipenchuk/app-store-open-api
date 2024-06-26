package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.SubscriptionGracePeriodResponse;
import org.openapitools.client.model.SubscriptionGracePeriodUpdateRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class SubscriptionGracePeriodsApi {
  private ApiClient apiClient;

  public SubscriptionGracePeriodsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SubscriptionGracePeriodsApi(ApiClient apiClient) {
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
   * @param fieldsSubscriptionGracePeriods the fields to include for returned resources of type subscriptionGracePeriods (optional)
   * @return SubscriptionGracePeriodResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single SubscriptionGracePeriod </td><td>  -  </td></tr>
     </table>
   */
  public SubscriptionGracePeriodResponse subscriptionGracePeriodsGetInstance(String id, List<String> fieldsSubscriptionGracePeriods) throws ApiException {
    return subscriptionGracePeriodsGetInstanceWithHttpInfo(id, fieldsSubscriptionGracePeriods).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsSubscriptionGracePeriods the fields to include for returned resources of type subscriptionGracePeriods (optional)
   * @return ApiResponse&lt;SubscriptionGracePeriodResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single SubscriptionGracePeriod </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubscriptionGracePeriodResponse> subscriptionGracePeriodsGetInstanceWithHttpInfo(String id, List<String> fieldsSubscriptionGracePeriods) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionGracePeriodsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/subscriptionGracePeriods/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[subscriptionGracePeriods]", fieldsSubscriptionGracePeriods)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<SubscriptionGracePeriodResponse> localVarReturnType = new GenericType<SubscriptionGracePeriodResponse>() {};
    return apiClient.invokeAPI("SubscriptionGracePeriodsApi.subscriptionGracePeriodsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param subscriptionGracePeriodUpdateRequest SubscriptionGracePeriod representation (required)
   * @return SubscriptionGracePeriodResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single SubscriptionGracePeriod </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public SubscriptionGracePeriodResponse subscriptionGracePeriodsUpdateInstance(String id, SubscriptionGracePeriodUpdateRequest subscriptionGracePeriodUpdateRequest) throws ApiException {
    return subscriptionGracePeriodsUpdateInstanceWithHttpInfo(id, subscriptionGracePeriodUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param subscriptionGracePeriodUpdateRequest SubscriptionGracePeriod representation (required)
   * @return ApiResponse&lt;SubscriptionGracePeriodResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single SubscriptionGracePeriod </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubscriptionGracePeriodResponse> subscriptionGracePeriodsUpdateInstanceWithHttpInfo(String id, SubscriptionGracePeriodUpdateRequest subscriptionGracePeriodUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionGracePeriodsUpdateInstance");
    }
    if (subscriptionGracePeriodUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'subscriptionGracePeriodUpdateRequest' when calling subscriptionGracePeriodsUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/subscriptionGracePeriods/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<SubscriptionGracePeriodResponse> localVarReturnType = new GenericType<SubscriptionGracePeriodResponse>() {};
    return apiClient.invokeAPI("SubscriptionGracePeriodsApi.subscriptionGracePeriodsUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), subscriptionGracePeriodUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
