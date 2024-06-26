package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.AppPriceScheduleCreateRequest;
import org.openapitools.client.model.AppPriceScheduleResponse;
import org.openapitools.client.model.AppPricesV2Response;
import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.TerritoryResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppPriceSchedulesApi {
  private ApiClient apiClient;

  public AppPriceSchedulesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AppPriceSchedulesApi(ApiClient apiClient) {
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
   * @param filterEndDate filter by attribute &#39;endDate&#39; (optional)
   * @param filterStartDate filter by attribute &#39;startDate&#39; (optional)
   * @param filterTerritory filter by id(s) of related &#39;territory&#39; (optional)
   * @param fieldsAppPrices the fields to include for returned resources of type appPrices (optional)
   * @param fieldsAppPricePoints the fields to include for returned resources of type appPricePoints (optional)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AppPricesV2Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppPrices </td><td>  -  </td></tr>
     </table>
   */
  public AppPricesV2Response appPriceSchedulesAutomaticPricesGetToManyRelated(String id, List<String> filterEndDate, List<String> filterStartDate, List<String> filterTerritory, List<String> fieldsAppPrices, List<String> fieldsAppPricePoints, List<String> fieldsTerritories, Integer limit, List<String> include) throws ApiException {
    return appPriceSchedulesAutomaticPricesGetToManyRelatedWithHttpInfo(id, filterEndDate, filterStartDate, filterTerritory, fieldsAppPrices, fieldsAppPricePoints, fieldsTerritories, limit, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterEndDate filter by attribute &#39;endDate&#39; (optional)
   * @param filterStartDate filter by attribute &#39;startDate&#39; (optional)
   * @param filterTerritory filter by id(s) of related &#39;territory&#39; (optional)
   * @param fieldsAppPrices the fields to include for returned resources of type appPrices (optional)
   * @param fieldsAppPricePoints the fields to include for returned resources of type appPricePoints (optional)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AppPricesV2Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppPrices </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppPricesV2Response> appPriceSchedulesAutomaticPricesGetToManyRelatedWithHttpInfo(String id, List<String> filterEndDate, List<String> filterStartDate, List<String> filterTerritory, List<String> fieldsAppPrices, List<String> fieldsAppPricePoints, List<String> fieldsTerritories, Integer limit, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appPriceSchedulesAutomaticPricesGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/appPriceSchedules/{id}/automaticPrices"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[endDate]", filterEndDate)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[startDate]", filterStartDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[territory]", filterTerritory));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appPrices]", fieldsAppPrices));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appPricePoints]", fieldsAppPricePoints));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[territories]", fieldsTerritories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppPricesV2Response> localVarReturnType = new GenericType<AppPricesV2Response>() {};
    return apiClient.invokeAPI("AppPriceSchedulesApi.appPriceSchedulesAutomaticPricesGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @return TerritoryResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single Territory </td><td>  -  </td></tr>
     </table>
   */
  public TerritoryResponse appPriceSchedulesBaseTerritoryGetToOneRelated(String id, List<String> fieldsTerritories) throws ApiException {
    return appPriceSchedulesBaseTerritoryGetToOneRelatedWithHttpInfo(id, fieldsTerritories).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @return ApiResponse&lt;TerritoryResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single Territory </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TerritoryResponse> appPriceSchedulesBaseTerritoryGetToOneRelatedWithHttpInfo(String id, List<String> fieldsTerritories) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appPriceSchedulesBaseTerritoryGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/appPriceSchedules/{id}/baseTerritory"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[territories]", fieldsTerritories)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<TerritoryResponse> localVarReturnType = new GenericType<TerritoryResponse>() {};
    return apiClient.invokeAPI("AppPriceSchedulesApi.appPriceSchedulesBaseTerritoryGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param appPriceScheduleCreateRequest AppPriceSchedule representation (required)
   * @return AppPriceScheduleResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AppPriceSchedule </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public AppPriceScheduleResponse appPriceSchedulesCreateInstance(AppPriceScheduleCreateRequest appPriceScheduleCreateRequest) throws ApiException {
    return appPriceSchedulesCreateInstanceWithHttpInfo(appPriceScheduleCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param appPriceScheduleCreateRequest AppPriceSchedule representation (required)
   * @return ApiResponse&lt;AppPriceScheduleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AppPriceSchedule </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppPriceScheduleResponse> appPriceSchedulesCreateInstanceWithHttpInfo(AppPriceScheduleCreateRequest appPriceScheduleCreateRequest) throws ApiException {
    // Check required parameters
    if (appPriceScheduleCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appPriceScheduleCreateRequest' when calling appPriceSchedulesCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppPriceScheduleResponse> localVarReturnType = new GenericType<AppPriceScheduleResponse>() {};
    return apiClient.invokeAPI("AppPriceSchedulesApi.appPriceSchedulesCreateInstance", "/v1/appPriceSchedules", "POST", new ArrayList<>(), appPriceScheduleCreateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppPriceSchedules the fields to include for returned resources of type appPriceSchedules (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsAppPrices the fields to include for returned resources of type appPrices (optional)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limitAutomaticPrices maximum number of related automaticPrices returned (when they are included) (optional)
   * @param limitManualPrices maximum number of related manualPrices returned (when they are included) (optional)
   * @return AppPriceScheduleResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppPriceSchedule </td><td>  -  </td></tr>
     </table>
   */
  public AppPriceScheduleResponse appPriceSchedulesGetInstance(String id, List<String> fieldsAppPriceSchedules, List<String> include, List<String> fieldsAppPrices, List<String> fieldsTerritories, Integer limitAutomaticPrices, Integer limitManualPrices) throws ApiException {
    return appPriceSchedulesGetInstanceWithHttpInfo(id, fieldsAppPriceSchedules, include, fieldsAppPrices, fieldsTerritories, limitAutomaticPrices, limitManualPrices).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppPriceSchedules the fields to include for returned resources of type appPriceSchedules (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsAppPrices the fields to include for returned resources of type appPrices (optional)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limitAutomaticPrices maximum number of related automaticPrices returned (when they are included) (optional)
   * @param limitManualPrices maximum number of related manualPrices returned (when they are included) (optional)
   * @return ApiResponse&lt;AppPriceScheduleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppPriceSchedule </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppPriceScheduleResponse> appPriceSchedulesGetInstanceWithHttpInfo(String id, List<String> fieldsAppPriceSchedules, List<String> include, List<String> fieldsAppPrices, List<String> fieldsTerritories, Integer limitAutomaticPrices, Integer limitManualPrices) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appPriceSchedulesGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appPriceSchedules/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appPriceSchedules]", fieldsAppPriceSchedules)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appPrices]", fieldsAppPrices));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[territories]", fieldsTerritories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[automaticPrices]", limitAutomaticPrices));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[manualPrices]", limitManualPrices));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppPriceScheduleResponse> localVarReturnType = new GenericType<AppPriceScheduleResponse>() {};
    return apiClient.invokeAPI("AppPriceSchedulesApi.appPriceSchedulesGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterEndDate filter by attribute &#39;endDate&#39; (optional)
   * @param filterStartDate filter by attribute &#39;startDate&#39; (optional)
   * @param filterTerritory filter by id(s) of related &#39;territory&#39; (optional)
   * @param fieldsAppPrices the fields to include for returned resources of type appPrices (optional)
   * @param fieldsAppPricePoints the fields to include for returned resources of type appPricePoints (optional)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AppPricesV2Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppPrices </td><td>  -  </td></tr>
     </table>
   */
  public AppPricesV2Response appPriceSchedulesManualPricesGetToManyRelated(String id, List<String> filterEndDate, List<String> filterStartDate, List<String> filterTerritory, List<String> fieldsAppPrices, List<String> fieldsAppPricePoints, List<String> fieldsTerritories, Integer limit, List<String> include) throws ApiException {
    return appPriceSchedulesManualPricesGetToManyRelatedWithHttpInfo(id, filterEndDate, filterStartDate, filterTerritory, fieldsAppPrices, fieldsAppPricePoints, fieldsTerritories, limit, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterEndDate filter by attribute &#39;endDate&#39; (optional)
   * @param filterStartDate filter by attribute &#39;startDate&#39; (optional)
   * @param filterTerritory filter by id(s) of related &#39;territory&#39; (optional)
   * @param fieldsAppPrices the fields to include for returned resources of type appPrices (optional)
   * @param fieldsAppPricePoints the fields to include for returned resources of type appPricePoints (optional)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AppPricesV2Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppPrices </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppPricesV2Response> appPriceSchedulesManualPricesGetToManyRelatedWithHttpInfo(String id, List<String> filterEndDate, List<String> filterStartDate, List<String> filterTerritory, List<String> fieldsAppPrices, List<String> fieldsAppPricePoints, List<String> fieldsTerritories, Integer limit, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appPriceSchedulesManualPricesGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/appPriceSchedules/{id}/manualPrices"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[endDate]", filterEndDate)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[startDate]", filterStartDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[territory]", filterTerritory));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appPrices]", fieldsAppPrices));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appPricePoints]", fieldsAppPricePoints));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[territories]", fieldsTerritories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppPricesV2Response> localVarReturnType = new GenericType<AppPricesV2Response>() {};
    return apiClient.invokeAPI("AppPriceSchedulesApi.appPriceSchedulesManualPricesGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
