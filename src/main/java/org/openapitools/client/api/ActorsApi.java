package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.ActorResponse;
import org.openapitools.client.model.ActorsResponse;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class ActorsApi {
  private ApiClient apiClient;

  public ActorsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ActorsApi(ApiClient apiClient) {
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
   * @param filterId filter by id(s) (required)
   * @param fieldsActors the fields to include for returned resources of type actors (optional)
   * @param limit maximum resources per page (optional)
   * @return ActorsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of Actors </td><td>  -  </td></tr>
     </table>
   */
  public ActorsResponse actorsGetCollection(List<String> filterId, List<String> fieldsActors, Integer limit) throws ApiException {
    return actorsGetCollectionWithHttpInfo(filterId, fieldsActors, limit).getData();
  }

  /**
   * 
   * 
   * @param filterId filter by id(s) (required)
   * @param fieldsActors the fields to include for returned resources of type actors (optional)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;ActorsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of Actors </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ActorsResponse> actorsGetCollectionWithHttpInfo(List<String> filterId, List<String> fieldsActors, Integer limit) throws ApiException {
    // Check required parameters
    if (filterId == null) {
      throw new ApiException(400, "Missing the required parameter 'filterId' when calling actorsGetCollection");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[id]", filterId)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[actors]", fieldsActors));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<ActorsResponse> localVarReturnType = new GenericType<ActorsResponse>() {};
    return apiClient.invokeAPI("ActorsApi.actorsGetCollection", "/v1/actors", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsActors the fields to include for returned resources of type actors (optional)
   * @return ActorResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single Actor </td><td>  -  </td></tr>
     </table>
   */
  public ActorResponse actorsGetInstance(String id, List<String> fieldsActors) throws ApiException {
    return actorsGetInstanceWithHttpInfo(id, fieldsActors).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsActors the fields to include for returned resources of type actors (optional)
   * @return ApiResponse&lt;ActorResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single Actor </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ActorResponse> actorsGetInstanceWithHttpInfo(String id, List<String> fieldsActors) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling actorsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/actors/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[actors]", fieldsActors)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<ActorResponse> localVarReturnType = new GenericType<ActorResponse>() {};
    return apiClient.invokeAPI("ActorsApi.actorsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
