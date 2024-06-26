package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.SubscriptionAvailabilityCreateRequest;
import org.openapitools.client.model.SubscriptionAvailabilityResponse;
import org.openapitools.client.model.TerritoriesResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class SubscriptionAvailabilitiesApi {
  private ApiClient apiClient;

  public SubscriptionAvailabilitiesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SubscriptionAvailabilitiesApi(ApiClient apiClient) {
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
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limit maximum resources per page (optional)
   * @return TerritoriesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of Territories </td><td>  -  </td></tr>
     </table>
   */
  public TerritoriesResponse subscriptionAvailabilitiesAvailableTerritoriesGetToManyRelated(String id, List<String> fieldsTerritories, Integer limit) throws ApiException {
    return subscriptionAvailabilitiesAvailableTerritoriesGetToManyRelatedWithHttpInfo(id, fieldsTerritories, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;TerritoriesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of Territories </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TerritoriesResponse> subscriptionAvailabilitiesAvailableTerritoriesGetToManyRelatedWithHttpInfo(String id, List<String> fieldsTerritories, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionAvailabilitiesAvailableTerritoriesGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/subscriptionAvailabilities/{id}/availableTerritories"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[territories]", fieldsTerritories)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<TerritoriesResponse> localVarReturnType = new GenericType<TerritoriesResponse>() {};
    return apiClient.invokeAPI("SubscriptionAvailabilitiesApi.subscriptionAvailabilitiesAvailableTerritoriesGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param subscriptionAvailabilityCreateRequest SubscriptionAvailability representation (required)
   * @return SubscriptionAvailabilityResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single SubscriptionAvailability </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public SubscriptionAvailabilityResponse subscriptionAvailabilitiesCreateInstance(SubscriptionAvailabilityCreateRequest subscriptionAvailabilityCreateRequest) throws ApiException {
    return subscriptionAvailabilitiesCreateInstanceWithHttpInfo(subscriptionAvailabilityCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param subscriptionAvailabilityCreateRequest SubscriptionAvailability representation (required)
   * @return ApiResponse&lt;SubscriptionAvailabilityResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single SubscriptionAvailability </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubscriptionAvailabilityResponse> subscriptionAvailabilitiesCreateInstanceWithHttpInfo(SubscriptionAvailabilityCreateRequest subscriptionAvailabilityCreateRequest) throws ApiException {
    // Check required parameters
    if (subscriptionAvailabilityCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'subscriptionAvailabilityCreateRequest' when calling subscriptionAvailabilitiesCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<SubscriptionAvailabilityResponse> localVarReturnType = new GenericType<SubscriptionAvailabilityResponse>() {};
    return apiClient.invokeAPI("SubscriptionAvailabilitiesApi.subscriptionAvailabilitiesCreateInstance", "/v1/subscriptionAvailabilities", "POST", new ArrayList<>(), subscriptionAvailabilityCreateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsSubscriptionAvailabilities the fields to include for returned resources of type subscriptionAvailabilities (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limitAvailableTerritories maximum number of related availableTerritories returned (when they are included) (optional)
   * @return SubscriptionAvailabilityResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single SubscriptionAvailability </td><td>  -  </td></tr>
     </table>
   */
  public SubscriptionAvailabilityResponse subscriptionAvailabilitiesGetInstance(String id, List<String> fieldsSubscriptionAvailabilities, List<String> include, List<String> fieldsTerritories, Integer limitAvailableTerritories) throws ApiException {
    return subscriptionAvailabilitiesGetInstanceWithHttpInfo(id, fieldsSubscriptionAvailabilities, include, fieldsTerritories, limitAvailableTerritories).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsSubscriptionAvailabilities the fields to include for returned resources of type subscriptionAvailabilities (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limitAvailableTerritories maximum number of related availableTerritories returned (when they are included) (optional)
   * @return ApiResponse&lt;SubscriptionAvailabilityResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single SubscriptionAvailability </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubscriptionAvailabilityResponse> subscriptionAvailabilitiesGetInstanceWithHttpInfo(String id, List<String> fieldsSubscriptionAvailabilities, List<String> include, List<String> fieldsTerritories, Integer limitAvailableTerritories) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionAvailabilitiesGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/subscriptionAvailabilities/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[subscriptionAvailabilities]", fieldsSubscriptionAvailabilities)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[territories]", fieldsTerritories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[availableTerritories]", limitAvailableTerritories));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<SubscriptionAvailabilityResponse> localVarReturnType = new GenericType<SubscriptionAvailabilityResponse>() {};
    return apiClient.invokeAPI("SubscriptionAvailabilitiesApi.subscriptionAvailabilitiesGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
