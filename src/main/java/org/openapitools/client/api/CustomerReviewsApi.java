package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.CustomerReviewResponse;
import org.openapitools.client.model.CustomerReviewResponseV1Response;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class CustomerReviewsApi {
  private ApiClient apiClient;

  public CustomerReviewsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CustomerReviewsApi(ApiClient apiClient) {
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
   * @param fieldsCustomerReviews the fields to include for returned resources of type customerReviews (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsCustomerReviewResponses the fields to include for returned resources of type customerReviewResponses (optional)
   * @return CustomerReviewResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single CustomerReview </td><td>  -  </td></tr>
     </table>
   */
  public CustomerReviewResponse customerReviewsGetInstance(String id, List<String> fieldsCustomerReviews, List<String> include, List<String> fieldsCustomerReviewResponses) throws ApiException {
    return customerReviewsGetInstanceWithHttpInfo(id, fieldsCustomerReviews, include, fieldsCustomerReviewResponses).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsCustomerReviews the fields to include for returned resources of type customerReviews (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsCustomerReviewResponses the fields to include for returned resources of type customerReviewResponses (optional)
   * @return ApiResponse&lt;CustomerReviewResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single CustomerReview </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CustomerReviewResponse> customerReviewsGetInstanceWithHttpInfo(String id, List<String> fieldsCustomerReviews, List<String> include, List<String> fieldsCustomerReviewResponses) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling customerReviewsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/customerReviews/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[customerReviews]", fieldsCustomerReviews)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[customerReviewResponses]", fieldsCustomerReviewResponses));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<CustomerReviewResponse> localVarReturnType = new GenericType<CustomerReviewResponse>() {};
    return apiClient.invokeAPI("CustomerReviewsApi.customerReviewsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsCustomerReviews the fields to include for returned resources of type customerReviews (optional)
   * @param fieldsCustomerReviewResponses the fields to include for returned resources of type customerReviewResponses (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return CustomerReviewResponseV1Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single CustomerReviewResponse </td><td>  -  </td></tr>
     </table>
   */
  public CustomerReviewResponseV1Response customerReviewsResponseGetToOneRelated(String id, List<String> fieldsCustomerReviews, List<String> fieldsCustomerReviewResponses, List<String> include) throws ApiException {
    return customerReviewsResponseGetToOneRelatedWithHttpInfo(id, fieldsCustomerReviews, fieldsCustomerReviewResponses, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsCustomerReviews the fields to include for returned resources of type customerReviews (optional)
   * @param fieldsCustomerReviewResponses the fields to include for returned resources of type customerReviewResponses (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;CustomerReviewResponseV1Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single CustomerReviewResponse </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<CustomerReviewResponseV1Response> customerReviewsResponseGetToOneRelatedWithHttpInfo(String id, List<String> fieldsCustomerReviews, List<String> fieldsCustomerReviewResponses, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling customerReviewsResponseGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/customerReviews/{id}/response"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[customerReviews]", fieldsCustomerReviews)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[customerReviewResponses]", fieldsCustomerReviewResponses));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<CustomerReviewResponseV1Response> localVarReturnType = new GenericType<CustomerReviewResponseV1Response>() {};
    return apiClient.invokeAPI("CustomerReviewsApi.customerReviewsResponseGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
