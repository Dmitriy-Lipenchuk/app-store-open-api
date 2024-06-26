package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.InAppPurchasePriceScheduleCreateRequest;
import org.openapitools.client.model.InAppPurchasePriceScheduleResponse;
import org.openapitools.client.model.InAppPurchasePricesResponse;
import org.openapitools.client.model.TerritoryResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class InAppPurchasePriceSchedulesApi {
  private ApiClient apiClient;

  public InAppPurchasePriceSchedulesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public InAppPurchasePriceSchedulesApi(ApiClient apiClient) {
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
   * @param fieldsInAppPurchasePricePoints the fields to include for returned resources of type inAppPurchasePricePoints (optional)
   * @param fieldsInAppPurchasePrices the fields to include for returned resources of type inAppPurchasePrices (optional)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return InAppPurchasePricesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of InAppPurchasePrices </td><td>  -  </td></tr>
     </table>
   */
  public InAppPurchasePricesResponse inAppPurchasePriceSchedulesAutomaticPricesGetToManyRelated(String id, List<String> filterTerritory, List<String> fieldsInAppPurchasePricePoints, List<String> fieldsInAppPurchasePrices, List<String> fieldsTerritories, Integer limit, List<String> include) throws ApiException {
    return inAppPurchasePriceSchedulesAutomaticPricesGetToManyRelatedWithHttpInfo(id, filterTerritory, fieldsInAppPurchasePricePoints, fieldsInAppPurchasePrices, fieldsTerritories, limit, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterTerritory filter by id(s) of related &#39;territory&#39; (optional)
   * @param fieldsInAppPurchasePricePoints the fields to include for returned resources of type inAppPurchasePricePoints (optional)
   * @param fieldsInAppPurchasePrices the fields to include for returned resources of type inAppPurchasePrices (optional)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;InAppPurchasePricesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of InAppPurchasePrices </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InAppPurchasePricesResponse> inAppPurchasePriceSchedulesAutomaticPricesGetToManyRelatedWithHttpInfo(String id, List<String> filterTerritory, List<String> fieldsInAppPurchasePricePoints, List<String> fieldsInAppPurchasePrices, List<String> fieldsTerritories, Integer limit, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling inAppPurchasePriceSchedulesAutomaticPricesGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/inAppPurchasePriceSchedules/{id}/automaticPrices"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[territory]", filterTerritory)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[inAppPurchasePricePoints]", fieldsInAppPurchasePricePoints));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[inAppPurchasePrices]", fieldsInAppPurchasePrices));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[territories]", fieldsTerritories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<InAppPurchasePricesResponse> localVarReturnType = new GenericType<InAppPurchasePricesResponse>() {};
    return apiClient.invokeAPI("InAppPurchasePriceSchedulesApi.inAppPurchasePriceSchedulesAutomaticPricesGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
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
  public TerritoryResponse inAppPurchasePriceSchedulesBaseTerritoryGetToOneRelated(String id, List<String> fieldsTerritories) throws ApiException {
    return inAppPurchasePriceSchedulesBaseTerritoryGetToOneRelatedWithHttpInfo(id, fieldsTerritories).getData();
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
  public ApiResponse<TerritoryResponse> inAppPurchasePriceSchedulesBaseTerritoryGetToOneRelatedWithHttpInfo(String id, List<String> fieldsTerritories) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling inAppPurchasePriceSchedulesBaseTerritoryGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/inAppPurchasePriceSchedules/{id}/baseTerritory"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[territories]", fieldsTerritories)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<TerritoryResponse> localVarReturnType = new GenericType<TerritoryResponse>() {};
    return apiClient.invokeAPI("InAppPurchasePriceSchedulesApi.inAppPurchasePriceSchedulesBaseTerritoryGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param inAppPurchasePriceScheduleCreateRequest InAppPurchasePriceSchedule representation (required)
   * @return InAppPurchasePriceScheduleResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single InAppPurchasePriceSchedule </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public InAppPurchasePriceScheduleResponse inAppPurchasePriceSchedulesCreateInstance(InAppPurchasePriceScheduleCreateRequest inAppPurchasePriceScheduleCreateRequest) throws ApiException {
    return inAppPurchasePriceSchedulesCreateInstanceWithHttpInfo(inAppPurchasePriceScheduleCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param inAppPurchasePriceScheduleCreateRequest InAppPurchasePriceSchedule representation (required)
   * @return ApiResponse&lt;InAppPurchasePriceScheduleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single InAppPurchasePriceSchedule </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InAppPurchasePriceScheduleResponse> inAppPurchasePriceSchedulesCreateInstanceWithHttpInfo(InAppPurchasePriceScheduleCreateRequest inAppPurchasePriceScheduleCreateRequest) throws ApiException {
    // Check required parameters
    if (inAppPurchasePriceScheduleCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'inAppPurchasePriceScheduleCreateRequest' when calling inAppPurchasePriceSchedulesCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<InAppPurchasePriceScheduleResponse> localVarReturnType = new GenericType<InAppPurchasePriceScheduleResponse>() {};
    return apiClient.invokeAPI("InAppPurchasePriceSchedulesApi.inAppPurchasePriceSchedulesCreateInstance", "/v1/inAppPurchasePriceSchedules", "POST", new ArrayList<>(), inAppPurchasePriceScheduleCreateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsInAppPurchasePriceSchedules the fields to include for returned resources of type inAppPurchasePriceSchedules (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsInAppPurchasePrices the fields to include for returned resources of type inAppPurchasePrices (optional)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limitAutomaticPrices maximum number of related automaticPrices returned (when they are included) (optional)
   * @param limitManualPrices maximum number of related manualPrices returned (when they are included) (optional)
   * @return InAppPurchasePriceScheduleResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single InAppPurchasePriceSchedule </td><td>  -  </td></tr>
     </table>
   */
  public InAppPurchasePriceScheduleResponse inAppPurchasePriceSchedulesGetInstance(String id, List<String> fieldsInAppPurchasePriceSchedules, List<String> include, List<String> fieldsInAppPurchasePrices, List<String> fieldsTerritories, Integer limitAutomaticPrices, Integer limitManualPrices) throws ApiException {
    return inAppPurchasePriceSchedulesGetInstanceWithHttpInfo(id, fieldsInAppPurchasePriceSchedules, include, fieldsInAppPurchasePrices, fieldsTerritories, limitAutomaticPrices, limitManualPrices).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsInAppPurchasePriceSchedules the fields to include for returned resources of type inAppPurchasePriceSchedules (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsInAppPurchasePrices the fields to include for returned resources of type inAppPurchasePrices (optional)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limitAutomaticPrices maximum number of related automaticPrices returned (when they are included) (optional)
   * @param limitManualPrices maximum number of related manualPrices returned (when they are included) (optional)
   * @return ApiResponse&lt;InAppPurchasePriceScheduleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single InAppPurchasePriceSchedule </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InAppPurchasePriceScheduleResponse> inAppPurchasePriceSchedulesGetInstanceWithHttpInfo(String id, List<String> fieldsInAppPurchasePriceSchedules, List<String> include, List<String> fieldsInAppPurchasePrices, List<String> fieldsTerritories, Integer limitAutomaticPrices, Integer limitManualPrices) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling inAppPurchasePriceSchedulesGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/inAppPurchasePriceSchedules/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[inAppPurchasePriceSchedules]", fieldsInAppPurchasePriceSchedules)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[inAppPurchasePrices]", fieldsInAppPurchasePrices));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[territories]", fieldsTerritories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[automaticPrices]", limitAutomaticPrices));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[manualPrices]", limitManualPrices));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<InAppPurchasePriceScheduleResponse> localVarReturnType = new GenericType<InAppPurchasePriceScheduleResponse>() {};
    return apiClient.invokeAPI("InAppPurchasePriceSchedulesApi.inAppPurchasePriceSchedulesGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterTerritory filter by id(s) of related &#39;territory&#39; (optional)
   * @param fieldsInAppPurchasePricePoints the fields to include for returned resources of type inAppPurchasePricePoints (optional)
   * @param fieldsInAppPurchasePrices the fields to include for returned resources of type inAppPurchasePrices (optional)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return InAppPurchasePricesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of InAppPurchasePrices </td><td>  -  </td></tr>
     </table>
   */
  public InAppPurchasePricesResponse inAppPurchasePriceSchedulesManualPricesGetToManyRelated(String id, List<String> filterTerritory, List<String> fieldsInAppPurchasePricePoints, List<String> fieldsInAppPurchasePrices, List<String> fieldsTerritories, Integer limit, List<String> include) throws ApiException {
    return inAppPurchasePriceSchedulesManualPricesGetToManyRelatedWithHttpInfo(id, filterTerritory, fieldsInAppPurchasePricePoints, fieldsInAppPurchasePrices, fieldsTerritories, limit, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterTerritory filter by id(s) of related &#39;territory&#39; (optional)
   * @param fieldsInAppPurchasePricePoints the fields to include for returned resources of type inAppPurchasePricePoints (optional)
   * @param fieldsInAppPurchasePrices the fields to include for returned resources of type inAppPurchasePrices (optional)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;InAppPurchasePricesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of InAppPurchasePrices </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InAppPurchasePricesResponse> inAppPurchasePriceSchedulesManualPricesGetToManyRelatedWithHttpInfo(String id, List<String> filterTerritory, List<String> fieldsInAppPurchasePricePoints, List<String> fieldsInAppPurchasePrices, List<String> fieldsTerritories, Integer limit, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling inAppPurchasePriceSchedulesManualPricesGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/inAppPurchasePriceSchedules/{id}/manualPrices"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[territory]", filterTerritory)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[inAppPurchasePricePoints]", fieldsInAppPurchasePricePoints));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[inAppPurchasePrices]", fieldsInAppPurchasePrices));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[territories]", fieldsTerritories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<InAppPurchasePricesResponse> localVarReturnType = new GenericType<InAppPurchasePricesResponse>() {};
    return apiClient.invokeAPI("InAppPurchasePriceSchedulesApi.inAppPurchasePriceSchedulesManualPricesGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
