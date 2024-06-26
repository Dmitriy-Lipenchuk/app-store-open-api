package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.SubscriptionOfferCodeCustomCodeCreateRequest;
import org.openapitools.client.model.SubscriptionOfferCodeCustomCodeResponse;
import org.openapitools.client.model.SubscriptionOfferCodeCustomCodeUpdateRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class SubscriptionOfferCodeCustomCodesApi {
  private ApiClient apiClient;

  public SubscriptionOfferCodeCustomCodesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SubscriptionOfferCodeCustomCodesApi(ApiClient apiClient) {
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
   * @param subscriptionOfferCodeCustomCodeCreateRequest SubscriptionOfferCodeCustomCode representation (required)
   * @return SubscriptionOfferCodeCustomCodeResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single SubscriptionOfferCodeCustomCode </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public SubscriptionOfferCodeCustomCodeResponse subscriptionOfferCodeCustomCodesCreateInstance(SubscriptionOfferCodeCustomCodeCreateRequest subscriptionOfferCodeCustomCodeCreateRequest) throws ApiException {
    return subscriptionOfferCodeCustomCodesCreateInstanceWithHttpInfo(subscriptionOfferCodeCustomCodeCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param subscriptionOfferCodeCustomCodeCreateRequest SubscriptionOfferCodeCustomCode representation (required)
   * @return ApiResponse&lt;SubscriptionOfferCodeCustomCodeResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single SubscriptionOfferCodeCustomCode </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubscriptionOfferCodeCustomCodeResponse> subscriptionOfferCodeCustomCodesCreateInstanceWithHttpInfo(SubscriptionOfferCodeCustomCodeCreateRequest subscriptionOfferCodeCustomCodeCreateRequest) throws ApiException {
    // Check required parameters
    if (subscriptionOfferCodeCustomCodeCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'subscriptionOfferCodeCustomCodeCreateRequest' when calling subscriptionOfferCodeCustomCodesCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<SubscriptionOfferCodeCustomCodeResponse> localVarReturnType = new GenericType<SubscriptionOfferCodeCustomCodeResponse>() {};
    return apiClient.invokeAPI("SubscriptionOfferCodeCustomCodesApi.subscriptionOfferCodeCustomCodesCreateInstance", "/v1/subscriptionOfferCodeCustomCodes", "POST", new ArrayList<>(), subscriptionOfferCodeCustomCodeCreateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsSubscriptionOfferCodeCustomCodes the fields to include for returned resources of type subscriptionOfferCodeCustomCodes (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return SubscriptionOfferCodeCustomCodeResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single SubscriptionOfferCodeCustomCode </td><td>  -  </td></tr>
     </table>
   */
  public SubscriptionOfferCodeCustomCodeResponse subscriptionOfferCodeCustomCodesGetInstance(String id, List<String> fieldsSubscriptionOfferCodeCustomCodes, List<String> include) throws ApiException {
    return subscriptionOfferCodeCustomCodesGetInstanceWithHttpInfo(id, fieldsSubscriptionOfferCodeCustomCodes, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsSubscriptionOfferCodeCustomCodes the fields to include for returned resources of type subscriptionOfferCodeCustomCodes (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;SubscriptionOfferCodeCustomCodeResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single SubscriptionOfferCodeCustomCode </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubscriptionOfferCodeCustomCodeResponse> subscriptionOfferCodeCustomCodesGetInstanceWithHttpInfo(String id, List<String> fieldsSubscriptionOfferCodeCustomCodes, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionOfferCodeCustomCodesGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/subscriptionOfferCodeCustomCodes/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[subscriptionOfferCodeCustomCodes]", fieldsSubscriptionOfferCodeCustomCodes)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<SubscriptionOfferCodeCustomCodeResponse> localVarReturnType = new GenericType<SubscriptionOfferCodeCustomCodeResponse>() {};
    return apiClient.invokeAPI("SubscriptionOfferCodeCustomCodesApi.subscriptionOfferCodeCustomCodesGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param subscriptionOfferCodeCustomCodeUpdateRequest SubscriptionOfferCodeCustomCode representation (required)
   * @return SubscriptionOfferCodeCustomCodeResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single SubscriptionOfferCodeCustomCode </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public SubscriptionOfferCodeCustomCodeResponse subscriptionOfferCodeCustomCodesUpdateInstance(String id, SubscriptionOfferCodeCustomCodeUpdateRequest subscriptionOfferCodeCustomCodeUpdateRequest) throws ApiException {
    return subscriptionOfferCodeCustomCodesUpdateInstanceWithHttpInfo(id, subscriptionOfferCodeCustomCodeUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param subscriptionOfferCodeCustomCodeUpdateRequest SubscriptionOfferCodeCustomCode representation (required)
   * @return ApiResponse&lt;SubscriptionOfferCodeCustomCodeResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single SubscriptionOfferCodeCustomCode </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubscriptionOfferCodeCustomCodeResponse> subscriptionOfferCodeCustomCodesUpdateInstanceWithHttpInfo(String id, SubscriptionOfferCodeCustomCodeUpdateRequest subscriptionOfferCodeCustomCodeUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionOfferCodeCustomCodesUpdateInstance");
    }
    if (subscriptionOfferCodeCustomCodeUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'subscriptionOfferCodeCustomCodeUpdateRequest' when calling subscriptionOfferCodeCustomCodesUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/subscriptionOfferCodeCustomCodes/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<SubscriptionOfferCodeCustomCodeResponse> localVarReturnType = new GenericType<SubscriptionOfferCodeCustomCodeResponse>() {};
    return apiClient.invokeAPI("SubscriptionOfferCodeCustomCodesApi.subscriptionOfferCodeCustomCodesUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), subscriptionOfferCodeCustomCodeUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
