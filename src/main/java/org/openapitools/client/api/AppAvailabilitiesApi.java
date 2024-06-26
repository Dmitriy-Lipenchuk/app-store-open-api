package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.AppAvailabilityCreateRequest;
import org.openapitools.client.model.AppAvailabilityResponse;
import org.openapitools.client.model.AppAvailabilityV2CreateRequest;
import org.openapitools.client.model.AppAvailabilityV2Response;
import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.TerritoriesResponse;
import org.openapitools.client.model.TerritoryAvailabilitiesResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppAvailabilitiesApi {
  private ApiClient apiClient;

  public AppAvailabilitiesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AppAvailabilitiesApi(ApiClient apiClient) {
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
   * @deprecated
   */
  @Deprecated
  public TerritoriesResponse appAvailabilitiesAvailableTerritoriesGetToManyRelated(String id, List<String> fieldsTerritories, Integer limit) throws ApiException {
    return appAvailabilitiesAvailableTerritoriesGetToManyRelatedWithHttpInfo(id, fieldsTerritories, limit).getData();
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
   * @deprecated
   */
  @Deprecated
  public ApiResponse<TerritoriesResponse> appAvailabilitiesAvailableTerritoriesGetToManyRelatedWithHttpInfo(String id, List<String> fieldsTerritories, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appAvailabilitiesAvailableTerritoriesGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/appAvailabilities/{id}/availableTerritories"
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
    return apiClient.invokeAPI("AppAvailabilitiesApi.appAvailabilitiesAvailableTerritoriesGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param appAvailabilityCreateRequest AppAvailability representation (required)
   * @return AppAvailabilityResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AppAvailability </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public AppAvailabilityResponse appAvailabilitiesCreateInstance(AppAvailabilityCreateRequest appAvailabilityCreateRequest) throws ApiException {
    return appAvailabilitiesCreateInstanceWithHttpInfo(appAvailabilityCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param appAvailabilityCreateRequest AppAvailability representation (required)
   * @return ApiResponse&lt;AppAvailabilityResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AppAvailability </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public ApiResponse<AppAvailabilityResponse> appAvailabilitiesCreateInstanceWithHttpInfo(AppAvailabilityCreateRequest appAvailabilityCreateRequest) throws ApiException {
    // Check required parameters
    if (appAvailabilityCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appAvailabilityCreateRequest' when calling appAvailabilitiesCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppAvailabilityResponse> localVarReturnType = new GenericType<AppAvailabilityResponse>() {};
    return apiClient.invokeAPI("AppAvailabilitiesApi.appAvailabilitiesCreateInstance", "/v1/appAvailabilities", "POST", new ArrayList<>(), appAvailabilityCreateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppAvailabilities the fields to include for returned resources of type appAvailabilities (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limitAvailableTerritories maximum number of related availableTerritories returned (when they are included) (optional)
   * @return AppAvailabilityResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppAvailability </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public AppAvailabilityResponse appAvailabilitiesGetInstance(String id, List<String> fieldsAppAvailabilities, List<String> include, List<String> fieldsTerritories, Integer limitAvailableTerritories) throws ApiException {
    return appAvailabilitiesGetInstanceWithHttpInfo(id, fieldsAppAvailabilities, include, fieldsTerritories, limitAvailableTerritories).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppAvailabilities the fields to include for returned resources of type appAvailabilities (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limitAvailableTerritories maximum number of related availableTerritories returned (when they are included) (optional)
   * @return ApiResponse&lt;AppAvailabilityResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppAvailability </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public ApiResponse<AppAvailabilityResponse> appAvailabilitiesGetInstanceWithHttpInfo(String id, List<String> fieldsAppAvailabilities, List<String> include, List<String> fieldsTerritories, Integer limitAvailableTerritories) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appAvailabilitiesGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appAvailabilities/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appAvailabilities]", fieldsAppAvailabilities)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[territories]", fieldsTerritories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[availableTerritories]", limitAvailableTerritories));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppAvailabilityResponse> localVarReturnType = new GenericType<AppAvailabilityResponse>() {};
    return apiClient.invokeAPI("AppAvailabilitiesApi.appAvailabilitiesGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param appAvailabilityV2CreateRequest AppAvailability representation (required)
   * @return AppAvailabilityV2Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AppAvailability </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public AppAvailabilityV2Response appAvailabilitiesV2CreateInstance(AppAvailabilityV2CreateRequest appAvailabilityV2CreateRequest) throws ApiException {
    return appAvailabilitiesV2CreateInstanceWithHttpInfo(appAvailabilityV2CreateRequest).getData();
  }

  /**
   * 
   * 
   * @param appAvailabilityV2CreateRequest AppAvailability representation (required)
   * @return ApiResponse&lt;AppAvailabilityV2Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AppAvailability </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppAvailabilityV2Response> appAvailabilitiesV2CreateInstanceWithHttpInfo(AppAvailabilityV2CreateRequest appAvailabilityV2CreateRequest) throws ApiException {
    // Check required parameters
    if (appAvailabilityV2CreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appAvailabilityV2CreateRequest' when calling appAvailabilitiesV2CreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppAvailabilityV2Response> localVarReturnType = new GenericType<AppAvailabilityV2Response>() {};
    return apiClient.invokeAPI("AppAvailabilitiesApi.appAvailabilitiesV2CreateInstance", "/v2/appAvailabilities", "POST", new ArrayList<>(), appAvailabilityV2CreateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppAvailabilities the fields to include for returned resources of type appAvailabilities (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsTerritoryAvailabilities the fields to include for returned resources of type territoryAvailabilities (optional)
   * @param limitTerritoryAvailabilities maximum number of related territoryAvailabilities returned (when they are included) (optional)
   * @return AppAvailabilityV2Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppAvailability </td><td>  -  </td></tr>
     </table>
   */
  public AppAvailabilityV2Response appAvailabilitiesV2GetInstance(String id, List<String> fieldsAppAvailabilities, List<String> include, List<String> fieldsTerritoryAvailabilities, Integer limitTerritoryAvailabilities) throws ApiException {
    return appAvailabilitiesV2GetInstanceWithHttpInfo(id, fieldsAppAvailabilities, include, fieldsTerritoryAvailabilities, limitTerritoryAvailabilities).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppAvailabilities the fields to include for returned resources of type appAvailabilities (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsTerritoryAvailabilities the fields to include for returned resources of type territoryAvailabilities (optional)
   * @param limitTerritoryAvailabilities maximum number of related territoryAvailabilities returned (when they are included) (optional)
   * @return ApiResponse&lt;AppAvailabilityV2Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppAvailability </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppAvailabilityV2Response> appAvailabilitiesV2GetInstanceWithHttpInfo(String id, List<String> fieldsAppAvailabilities, List<String> include, List<String> fieldsTerritoryAvailabilities, Integer limitTerritoryAvailabilities) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appAvailabilitiesV2GetInstance");
    }

    // Path parameters
    String localVarPath = "/v2/appAvailabilities/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appAvailabilities]", fieldsAppAvailabilities)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[territoryAvailabilities]", fieldsTerritoryAvailabilities));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[territoryAvailabilities]", limitTerritoryAvailabilities));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppAvailabilityV2Response> localVarReturnType = new GenericType<AppAvailabilityV2Response>() {};
    return apiClient.invokeAPI("AppAvailabilitiesApi.appAvailabilitiesV2GetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsTerritoryAvailabilities the fields to include for returned resources of type territoryAvailabilities (optional)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return TerritoryAvailabilitiesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of TerritoryAvailabilities </td><td>  -  </td></tr>
     </table>
   */
  public TerritoryAvailabilitiesResponse appAvailabilitiesV2TerritoryAvailabilitiesGetToManyRelated(String id, List<String> fieldsTerritoryAvailabilities, List<String> fieldsTerritories, Integer limit, List<String> include) throws ApiException {
    return appAvailabilitiesV2TerritoryAvailabilitiesGetToManyRelatedWithHttpInfo(id, fieldsTerritoryAvailabilities, fieldsTerritories, limit, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsTerritoryAvailabilities the fields to include for returned resources of type territoryAvailabilities (optional)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;TerritoryAvailabilitiesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of TerritoryAvailabilities </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TerritoryAvailabilitiesResponse> appAvailabilitiesV2TerritoryAvailabilitiesGetToManyRelatedWithHttpInfo(String id, List<String> fieldsTerritoryAvailabilities, List<String> fieldsTerritories, Integer limit, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appAvailabilitiesV2TerritoryAvailabilitiesGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v2/appAvailabilities/{id}/territoryAvailabilities"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[territoryAvailabilities]", fieldsTerritoryAvailabilities)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[territories]", fieldsTerritories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<TerritoryAvailabilitiesResponse> localVarReturnType = new GenericType<TerritoryAvailabilitiesResponse>() {};
    return apiClient.invokeAPI("AppAvailabilitiesApi.appAvailabilitiesV2TerritoryAvailabilitiesGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
