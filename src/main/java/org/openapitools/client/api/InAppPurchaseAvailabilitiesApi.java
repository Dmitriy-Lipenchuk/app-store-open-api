package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.InAppPurchaseAvailabilityCreateRequest;
import org.openapitools.client.model.InAppPurchaseAvailabilityResponse;
import org.openapitools.client.model.TerritoriesResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class InAppPurchaseAvailabilitiesApi {
  private ApiClient apiClient;

  public InAppPurchaseAvailabilitiesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public InAppPurchaseAvailabilitiesApi(ApiClient apiClient) {
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
  public TerritoriesResponse inAppPurchaseAvailabilitiesAvailableTerritoriesGetToManyRelated(String id, List<String> fieldsTerritories, Integer limit) throws ApiException {
    return inAppPurchaseAvailabilitiesAvailableTerritoriesGetToManyRelatedWithHttpInfo(id, fieldsTerritories, limit).getData();
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
  public ApiResponse<TerritoriesResponse> inAppPurchaseAvailabilitiesAvailableTerritoriesGetToManyRelatedWithHttpInfo(String id, List<String> fieldsTerritories, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling inAppPurchaseAvailabilitiesAvailableTerritoriesGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/inAppPurchaseAvailabilities/{id}/availableTerritories"
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
    return apiClient.invokeAPI("InAppPurchaseAvailabilitiesApi.inAppPurchaseAvailabilitiesAvailableTerritoriesGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param inAppPurchaseAvailabilityCreateRequest InAppPurchaseAvailability representation (required)
   * @return InAppPurchaseAvailabilityResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single InAppPurchaseAvailability </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public InAppPurchaseAvailabilityResponse inAppPurchaseAvailabilitiesCreateInstance(InAppPurchaseAvailabilityCreateRequest inAppPurchaseAvailabilityCreateRequest) throws ApiException {
    return inAppPurchaseAvailabilitiesCreateInstanceWithHttpInfo(inAppPurchaseAvailabilityCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param inAppPurchaseAvailabilityCreateRequest InAppPurchaseAvailability representation (required)
   * @return ApiResponse&lt;InAppPurchaseAvailabilityResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single InAppPurchaseAvailability </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InAppPurchaseAvailabilityResponse> inAppPurchaseAvailabilitiesCreateInstanceWithHttpInfo(InAppPurchaseAvailabilityCreateRequest inAppPurchaseAvailabilityCreateRequest) throws ApiException {
    // Check required parameters
    if (inAppPurchaseAvailabilityCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'inAppPurchaseAvailabilityCreateRequest' when calling inAppPurchaseAvailabilitiesCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<InAppPurchaseAvailabilityResponse> localVarReturnType = new GenericType<InAppPurchaseAvailabilityResponse>() {};
    return apiClient.invokeAPI("InAppPurchaseAvailabilitiesApi.inAppPurchaseAvailabilitiesCreateInstance", "/v1/inAppPurchaseAvailabilities", "POST", new ArrayList<>(), inAppPurchaseAvailabilityCreateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsInAppPurchaseAvailabilities the fields to include for returned resources of type inAppPurchaseAvailabilities (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limitAvailableTerritories maximum number of related availableTerritories returned (when they are included) (optional)
   * @return InAppPurchaseAvailabilityResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single InAppPurchaseAvailability </td><td>  -  </td></tr>
     </table>
   */
  public InAppPurchaseAvailabilityResponse inAppPurchaseAvailabilitiesGetInstance(String id, List<String> fieldsInAppPurchaseAvailabilities, List<String> include, List<String> fieldsTerritories, Integer limitAvailableTerritories) throws ApiException {
    return inAppPurchaseAvailabilitiesGetInstanceWithHttpInfo(id, fieldsInAppPurchaseAvailabilities, include, fieldsTerritories, limitAvailableTerritories).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsInAppPurchaseAvailabilities the fields to include for returned resources of type inAppPurchaseAvailabilities (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limitAvailableTerritories maximum number of related availableTerritories returned (when they are included) (optional)
   * @return ApiResponse&lt;InAppPurchaseAvailabilityResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single InAppPurchaseAvailability </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InAppPurchaseAvailabilityResponse> inAppPurchaseAvailabilitiesGetInstanceWithHttpInfo(String id, List<String> fieldsInAppPurchaseAvailabilities, List<String> include, List<String> fieldsTerritories, Integer limitAvailableTerritories) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling inAppPurchaseAvailabilitiesGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/inAppPurchaseAvailabilities/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[inAppPurchaseAvailabilities]", fieldsInAppPurchaseAvailabilities)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[territories]", fieldsTerritories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[availableTerritories]", limitAvailableTerritories));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<InAppPurchaseAvailabilityResponse> localVarReturnType = new GenericType<InAppPurchaseAvailabilityResponse>() {};
    return apiClient.invokeAPI("InAppPurchaseAvailabilitiesApi.inAppPurchaseAvailabilitiesGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
