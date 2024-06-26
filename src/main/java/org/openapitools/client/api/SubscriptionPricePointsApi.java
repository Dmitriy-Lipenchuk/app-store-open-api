package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.SubscriptionPricePointResponse;
import org.openapitools.client.model.SubscriptionPricePointsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class SubscriptionPricePointsApi {
  private ApiClient apiClient;

  public SubscriptionPricePointsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SubscriptionPricePointsApi(ApiClient apiClient) {
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
   * @param filterSubscription filter by id(s) of related &#39;subscription&#39; (optional)
   * @param filterTerritory filter by id(s) of related &#39;territory&#39; (optional)
   * @param fieldsSubscriptionPricePoints the fields to include for returned resources of type subscriptionPricePoints (optional)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return SubscriptionPricePointsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of SubscriptionPricePoints </td><td>  -  </td></tr>
     </table>
   */
  public SubscriptionPricePointsResponse subscriptionPricePointsEqualizationsGetToManyRelated(String id, List<String> filterSubscription, List<String> filterTerritory, List<String> fieldsSubscriptionPricePoints, List<String> fieldsTerritories, Integer limit, List<String> include) throws ApiException {
    return subscriptionPricePointsEqualizationsGetToManyRelatedWithHttpInfo(id, filterSubscription, filterTerritory, fieldsSubscriptionPricePoints, fieldsTerritories, limit, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterSubscription filter by id(s) of related &#39;subscription&#39; (optional)
   * @param filterTerritory filter by id(s) of related &#39;territory&#39; (optional)
   * @param fieldsSubscriptionPricePoints the fields to include for returned resources of type subscriptionPricePoints (optional)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;SubscriptionPricePointsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of SubscriptionPricePoints </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubscriptionPricePointsResponse> subscriptionPricePointsEqualizationsGetToManyRelatedWithHttpInfo(String id, List<String> filterSubscription, List<String> filterTerritory, List<String> fieldsSubscriptionPricePoints, List<String> fieldsTerritories, Integer limit, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionPricePointsEqualizationsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/subscriptionPricePoints/{id}/equalizations"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[subscription]", filterSubscription)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[territory]", filterTerritory));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptionPricePoints]", fieldsSubscriptionPricePoints));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[territories]", fieldsTerritories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json", "text/csv");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<SubscriptionPricePointsResponse> localVarReturnType = new GenericType<SubscriptionPricePointsResponse>() {};
    return apiClient.invokeAPI("SubscriptionPricePointsApi.subscriptionPricePointsEqualizationsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsSubscriptionPricePoints the fields to include for returned resources of type subscriptionPricePoints (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return SubscriptionPricePointResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single SubscriptionPricePoint </td><td>  -  </td></tr>
     </table>
   */
  public SubscriptionPricePointResponse subscriptionPricePointsGetInstance(String id, List<String> fieldsSubscriptionPricePoints, List<String> include) throws ApiException {
    return subscriptionPricePointsGetInstanceWithHttpInfo(id, fieldsSubscriptionPricePoints, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsSubscriptionPricePoints the fields to include for returned resources of type subscriptionPricePoints (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;SubscriptionPricePointResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single SubscriptionPricePoint </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubscriptionPricePointResponse> subscriptionPricePointsGetInstanceWithHttpInfo(String id, List<String> fieldsSubscriptionPricePoints, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionPricePointsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/subscriptionPricePoints/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[subscriptionPricePoints]", fieldsSubscriptionPricePoints)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<SubscriptionPricePointResponse> localVarReturnType = new GenericType<SubscriptionPricePointResponse>() {};
    return apiClient.invokeAPI("SubscriptionPricePointsApi.subscriptionPricePointsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
