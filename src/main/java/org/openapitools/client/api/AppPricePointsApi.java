package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.AppPricePointV3Response;
import org.openapitools.client.model.AppPricePointsV3Response;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppPricePointsApi {
  private ApiClient apiClient;

  public AppPricePointsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AppPricePointsApi(ApiClient apiClient) {
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
   * @param filterTerritory filter by id(s) of related &#39;territory&#39; (optional)
   * @param fieldsAppPricePoints the fields to include for returned resources of type appPricePoints (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AppPricePointsV3Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppPricePoints </td><td>  -  </td></tr>
     </table>
   */
  public AppPricePointsV3Response appPricePointsV3EqualizationsGetToManyRelated(String id, List<String> filterTerritory, List<String> fieldsAppPricePoints, List<String> fieldsApps, List<String> fieldsTerritories, Integer limit, List<String> include) throws ApiException {
    return appPricePointsV3EqualizationsGetToManyRelatedWithHttpInfo(id, filterTerritory, fieldsAppPricePoints, fieldsApps, fieldsTerritories, limit, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterTerritory filter by id(s) of related &#39;territory&#39; (optional)
   * @param fieldsAppPricePoints the fields to include for returned resources of type appPricePoints (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AppPricePointsV3Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppPricePoints </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppPricePointsV3Response> appPricePointsV3EqualizationsGetToManyRelatedWithHttpInfo(String id, List<String> filterTerritory, List<String> fieldsAppPricePoints, List<String> fieldsApps, List<String> fieldsTerritories, Integer limit, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appPricePointsV3EqualizationsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v3/appPricePoints/{id}/equalizations"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[territory]", filterTerritory)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appPricePoints]", fieldsAppPricePoints));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[apps]", fieldsApps));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[territories]", fieldsTerritories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json", "text/csv");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppPricePointsV3Response> localVarReturnType = new GenericType<AppPricePointsV3Response>() {};
    return apiClient.invokeAPI("AppPricePointsApi.appPricePointsV3EqualizationsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppPricePoints the fields to include for returned resources of type appPricePoints (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AppPricePointV3Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppPricePoint </td><td>  -  </td></tr>
     </table>
   */
  public AppPricePointV3Response appPricePointsV3GetInstance(String id, List<String> fieldsAppPricePoints, List<String> include) throws ApiException {
    return appPricePointsV3GetInstanceWithHttpInfo(id, fieldsAppPricePoints, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppPricePoints the fields to include for returned resources of type appPricePoints (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AppPricePointV3Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppPricePoint </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppPricePointV3Response> appPricePointsV3GetInstanceWithHttpInfo(String id, List<String> fieldsAppPricePoints, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appPricePointsV3GetInstance");
    }

    // Path parameters
    String localVarPath = "/v3/appPricePoints/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appPricePoints]", fieldsAppPricePoints)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppPricePointV3Response> localVarReturnType = new GenericType<AppPricePointV3Response>() {};
    return apiClient.invokeAPI("AppPricePointsApi.appPricePointsV3GetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
