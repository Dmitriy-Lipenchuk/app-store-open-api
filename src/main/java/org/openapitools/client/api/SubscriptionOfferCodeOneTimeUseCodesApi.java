package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.SubscriptionOfferCodeOneTimeUseCodeCreateRequest;
import org.openapitools.client.model.SubscriptionOfferCodeOneTimeUseCodeResponse;
import org.openapitools.client.model.SubscriptionOfferCodeOneTimeUseCodeUpdateRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class SubscriptionOfferCodeOneTimeUseCodesApi {
  private ApiClient apiClient;

  public SubscriptionOfferCodeOneTimeUseCodesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SubscriptionOfferCodeOneTimeUseCodesApi(ApiClient apiClient) {
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
   * @param subscriptionOfferCodeOneTimeUseCodeCreateRequest SubscriptionOfferCodeOneTimeUseCode representation (required)
   * @return SubscriptionOfferCodeOneTimeUseCodeResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single SubscriptionOfferCodeOneTimeUseCode </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public SubscriptionOfferCodeOneTimeUseCodeResponse subscriptionOfferCodeOneTimeUseCodesCreateInstance(SubscriptionOfferCodeOneTimeUseCodeCreateRequest subscriptionOfferCodeOneTimeUseCodeCreateRequest) throws ApiException {
    return subscriptionOfferCodeOneTimeUseCodesCreateInstanceWithHttpInfo(subscriptionOfferCodeOneTimeUseCodeCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param subscriptionOfferCodeOneTimeUseCodeCreateRequest SubscriptionOfferCodeOneTimeUseCode representation (required)
   * @return ApiResponse&lt;SubscriptionOfferCodeOneTimeUseCodeResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single SubscriptionOfferCodeOneTimeUseCode </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubscriptionOfferCodeOneTimeUseCodeResponse> subscriptionOfferCodeOneTimeUseCodesCreateInstanceWithHttpInfo(SubscriptionOfferCodeOneTimeUseCodeCreateRequest subscriptionOfferCodeOneTimeUseCodeCreateRequest) throws ApiException {
    // Check required parameters
    if (subscriptionOfferCodeOneTimeUseCodeCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'subscriptionOfferCodeOneTimeUseCodeCreateRequest' when calling subscriptionOfferCodeOneTimeUseCodesCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<SubscriptionOfferCodeOneTimeUseCodeResponse> localVarReturnType = new GenericType<SubscriptionOfferCodeOneTimeUseCodeResponse>() {};
    return apiClient.invokeAPI("SubscriptionOfferCodeOneTimeUseCodesApi.subscriptionOfferCodeOneTimeUseCodesCreateInstance", "/v1/subscriptionOfferCodeOneTimeUseCodes", "POST", new ArrayList<>(), subscriptionOfferCodeOneTimeUseCodeCreateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsSubscriptionOfferCodeOneTimeUseCodes the fields to include for returned resources of type subscriptionOfferCodeOneTimeUseCodes (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return SubscriptionOfferCodeOneTimeUseCodeResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single SubscriptionOfferCodeOneTimeUseCode </td><td>  -  </td></tr>
     </table>
   */
  public SubscriptionOfferCodeOneTimeUseCodeResponse subscriptionOfferCodeOneTimeUseCodesGetInstance(String id, List<String> fieldsSubscriptionOfferCodeOneTimeUseCodes, List<String> include) throws ApiException {
    return subscriptionOfferCodeOneTimeUseCodesGetInstanceWithHttpInfo(id, fieldsSubscriptionOfferCodeOneTimeUseCodes, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsSubscriptionOfferCodeOneTimeUseCodes the fields to include for returned resources of type subscriptionOfferCodeOneTimeUseCodes (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;SubscriptionOfferCodeOneTimeUseCodeResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single SubscriptionOfferCodeOneTimeUseCode </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubscriptionOfferCodeOneTimeUseCodeResponse> subscriptionOfferCodeOneTimeUseCodesGetInstanceWithHttpInfo(String id, List<String> fieldsSubscriptionOfferCodeOneTimeUseCodes, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionOfferCodeOneTimeUseCodesGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/subscriptionOfferCodeOneTimeUseCodes/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[subscriptionOfferCodeOneTimeUseCodes]", fieldsSubscriptionOfferCodeOneTimeUseCodes)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<SubscriptionOfferCodeOneTimeUseCodeResponse> localVarReturnType = new GenericType<SubscriptionOfferCodeOneTimeUseCodeResponse>() {};
    return apiClient.invokeAPI("SubscriptionOfferCodeOneTimeUseCodesApi.subscriptionOfferCodeOneTimeUseCodesGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param subscriptionOfferCodeOneTimeUseCodeUpdateRequest SubscriptionOfferCodeOneTimeUseCode representation (required)
   * @return SubscriptionOfferCodeOneTimeUseCodeResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single SubscriptionOfferCodeOneTimeUseCode </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public SubscriptionOfferCodeOneTimeUseCodeResponse subscriptionOfferCodeOneTimeUseCodesUpdateInstance(String id, SubscriptionOfferCodeOneTimeUseCodeUpdateRequest subscriptionOfferCodeOneTimeUseCodeUpdateRequest) throws ApiException {
    return subscriptionOfferCodeOneTimeUseCodesUpdateInstanceWithHttpInfo(id, subscriptionOfferCodeOneTimeUseCodeUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param subscriptionOfferCodeOneTimeUseCodeUpdateRequest SubscriptionOfferCodeOneTimeUseCode representation (required)
   * @return ApiResponse&lt;SubscriptionOfferCodeOneTimeUseCodeResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single SubscriptionOfferCodeOneTimeUseCode </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubscriptionOfferCodeOneTimeUseCodeResponse> subscriptionOfferCodeOneTimeUseCodesUpdateInstanceWithHttpInfo(String id, SubscriptionOfferCodeOneTimeUseCodeUpdateRequest subscriptionOfferCodeOneTimeUseCodeUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionOfferCodeOneTimeUseCodesUpdateInstance");
    }
    if (subscriptionOfferCodeOneTimeUseCodeUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'subscriptionOfferCodeOneTimeUseCodeUpdateRequest' when calling subscriptionOfferCodeOneTimeUseCodesUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/subscriptionOfferCodeOneTimeUseCodes/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<SubscriptionOfferCodeOneTimeUseCodeResponse> localVarReturnType = new GenericType<SubscriptionOfferCodeOneTimeUseCodeResponse>() {};
    return apiClient.invokeAPI("SubscriptionOfferCodeOneTimeUseCodesApi.subscriptionOfferCodeOneTimeUseCodesUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), subscriptionOfferCodeOneTimeUseCodeUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @return String
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single SubscriptionOfferCodeOneTimeUseCodeValue </td><td>  -  </td></tr>
     </table>
   */
  public String subscriptionOfferCodeOneTimeUseCodesValuesGetToOneRelated(String id) throws ApiException {
    return subscriptionOfferCodeOneTimeUseCodesValuesGetToOneRelatedWithHttpInfo(id).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single SubscriptionOfferCodeOneTimeUseCodeValue </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<String> subscriptionOfferCodeOneTimeUseCodesValuesGetToOneRelatedWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionOfferCodeOneTimeUseCodesValuesGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/subscriptionOfferCodeOneTimeUseCodes/{id}/values"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json", "text/csv");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<String> localVarReturnType = new GenericType<String>() {};
    return apiClient.invokeAPI("SubscriptionOfferCodeOneTimeUseCodesApi.subscriptionOfferCodeOneTimeUseCodesValuesGetToOneRelated", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
