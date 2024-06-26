package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.SubscriptionOfferCodeCreateRequest;
import org.openapitools.client.model.SubscriptionOfferCodeCustomCodesResponse;
import org.openapitools.client.model.SubscriptionOfferCodeOneTimeUseCodesResponse;
import org.openapitools.client.model.SubscriptionOfferCodePricesResponse;
import org.openapitools.client.model.SubscriptionOfferCodeResponse;
import org.openapitools.client.model.SubscriptionOfferCodeUpdateRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class SubscriptionOfferCodesApi {
  private ApiClient apiClient;

  public SubscriptionOfferCodesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SubscriptionOfferCodesApi(ApiClient apiClient) {
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
   * @param subscriptionOfferCodeCreateRequest SubscriptionOfferCode representation (required)
   * @return SubscriptionOfferCodeResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single SubscriptionOfferCode </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public SubscriptionOfferCodeResponse subscriptionOfferCodesCreateInstance(SubscriptionOfferCodeCreateRequest subscriptionOfferCodeCreateRequest) throws ApiException {
    return subscriptionOfferCodesCreateInstanceWithHttpInfo(subscriptionOfferCodeCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param subscriptionOfferCodeCreateRequest SubscriptionOfferCode representation (required)
   * @return ApiResponse&lt;SubscriptionOfferCodeResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single SubscriptionOfferCode </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubscriptionOfferCodeResponse> subscriptionOfferCodesCreateInstanceWithHttpInfo(SubscriptionOfferCodeCreateRequest subscriptionOfferCodeCreateRequest) throws ApiException {
    // Check required parameters
    if (subscriptionOfferCodeCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'subscriptionOfferCodeCreateRequest' when calling subscriptionOfferCodesCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<SubscriptionOfferCodeResponse> localVarReturnType = new GenericType<SubscriptionOfferCodeResponse>() {};
    return apiClient.invokeAPI("SubscriptionOfferCodesApi.subscriptionOfferCodesCreateInstance", "/v1/subscriptionOfferCodes", "POST", new ArrayList<>(), subscriptionOfferCodeCreateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsSubscriptionOfferCodeCustomCodes the fields to include for returned resources of type subscriptionOfferCodeCustomCodes (optional)
   * @param fieldsSubscriptionOfferCodes the fields to include for returned resources of type subscriptionOfferCodes (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return SubscriptionOfferCodeCustomCodesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of SubscriptionOfferCodeCustomCodes </td><td>  -  </td></tr>
     </table>
   */
  public SubscriptionOfferCodeCustomCodesResponse subscriptionOfferCodesCustomCodesGetToManyRelated(String id, List<String> fieldsSubscriptionOfferCodeCustomCodes, List<String> fieldsSubscriptionOfferCodes, Integer limit, List<String> include) throws ApiException {
    return subscriptionOfferCodesCustomCodesGetToManyRelatedWithHttpInfo(id, fieldsSubscriptionOfferCodeCustomCodes, fieldsSubscriptionOfferCodes, limit, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsSubscriptionOfferCodeCustomCodes the fields to include for returned resources of type subscriptionOfferCodeCustomCodes (optional)
   * @param fieldsSubscriptionOfferCodes the fields to include for returned resources of type subscriptionOfferCodes (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;SubscriptionOfferCodeCustomCodesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of SubscriptionOfferCodeCustomCodes </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubscriptionOfferCodeCustomCodesResponse> subscriptionOfferCodesCustomCodesGetToManyRelatedWithHttpInfo(String id, List<String> fieldsSubscriptionOfferCodeCustomCodes, List<String> fieldsSubscriptionOfferCodes, Integer limit, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionOfferCodesCustomCodesGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/subscriptionOfferCodes/{id}/customCodes"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[subscriptionOfferCodeCustomCodes]", fieldsSubscriptionOfferCodeCustomCodes)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptionOfferCodes]", fieldsSubscriptionOfferCodes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<SubscriptionOfferCodeCustomCodesResponse> localVarReturnType = new GenericType<SubscriptionOfferCodeCustomCodesResponse>() {};
    return apiClient.invokeAPI("SubscriptionOfferCodesApi.subscriptionOfferCodesCustomCodesGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsSubscriptionOfferCodes the fields to include for returned resources of type subscriptionOfferCodes (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsSubscriptionOfferCodeCustomCodes the fields to include for returned resources of type subscriptionOfferCodeCustomCodes (optional)
   * @param fieldsSubscriptionOfferCodeOneTimeUseCodes the fields to include for returned resources of type subscriptionOfferCodeOneTimeUseCodes (optional)
   * @param fieldsSubscriptionOfferCodePrices the fields to include for returned resources of type subscriptionOfferCodePrices (optional)
   * @param limitCustomCodes maximum number of related customCodes returned (when they are included) (optional)
   * @param limitOneTimeUseCodes maximum number of related oneTimeUseCodes returned (when they are included) (optional)
   * @param limitPrices maximum number of related prices returned (when they are included) (optional)
   * @return SubscriptionOfferCodeResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single SubscriptionOfferCode </td><td>  -  </td></tr>
     </table>
   */
  public SubscriptionOfferCodeResponse subscriptionOfferCodesGetInstance(String id, List<String> fieldsSubscriptionOfferCodes, List<String> include, List<String> fieldsSubscriptionOfferCodeCustomCodes, List<String> fieldsSubscriptionOfferCodeOneTimeUseCodes, List<String> fieldsSubscriptionOfferCodePrices, Integer limitCustomCodes, Integer limitOneTimeUseCodes, Integer limitPrices) throws ApiException {
    return subscriptionOfferCodesGetInstanceWithHttpInfo(id, fieldsSubscriptionOfferCodes, include, fieldsSubscriptionOfferCodeCustomCodes, fieldsSubscriptionOfferCodeOneTimeUseCodes, fieldsSubscriptionOfferCodePrices, limitCustomCodes, limitOneTimeUseCodes, limitPrices).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsSubscriptionOfferCodes the fields to include for returned resources of type subscriptionOfferCodes (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsSubscriptionOfferCodeCustomCodes the fields to include for returned resources of type subscriptionOfferCodeCustomCodes (optional)
   * @param fieldsSubscriptionOfferCodeOneTimeUseCodes the fields to include for returned resources of type subscriptionOfferCodeOneTimeUseCodes (optional)
   * @param fieldsSubscriptionOfferCodePrices the fields to include for returned resources of type subscriptionOfferCodePrices (optional)
   * @param limitCustomCodes maximum number of related customCodes returned (when they are included) (optional)
   * @param limitOneTimeUseCodes maximum number of related oneTimeUseCodes returned (when they are included) (optional)
   * @param limitPrices maximum number of related prices returned (when they are included) (optional)
   * @return ApiResponse&lt;SubscriptionOfferCodeResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single SubscriptionOfferCode </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubscriptionOfferCodeResponse> subscriptionOfferCodesGetInstanceWithHttpInfo(String id, List<String> fieldsSubscriptionOfferCodes, List<String> include, List<String> fieldsSubscriptionOfferCodeCustomCodes, List<String> fieldsSubscriptionOfferCodeOneTimeUseCodes, List<String> fieldsSubscriptionOfferCodePrices, Integer limitCustomCodes, Integer limitOneTimeUseCodes, Integer limitPrices) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionOfferCodesGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/subscriptionOfferCodes/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[subscriptionOfferCodes]", fieldsSubscriptionOfferCodes)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptionOfferCodeCustomCodes]", fieldsSubscriptionOfferCodeCustomCodes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptionOfferCodeOneTimeUseCodes]", fieldsSubscriptionOfferCodeOneTimeUseCodes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptionOfferCodePrices]", fieldsSubscriptionOfferCodePrices));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[customCodes]", limitCustomCodes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[oneTimeUseCodes]", limitOneTimeUseCodes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[prices]", limitPrices));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<SubscriptionOfferCodeResponse> localVarReturnType = new GenericType<SubscriptionOfferCodeResponse>() {};
    return apiClient.invokeAPI("SubscriptionOfferCodesApi.subscriptionOfferCodesGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsSubscriptionOfferCodes the fields to include for returned resources of type subscriptionOfferCodes (optional)
   * @param fieldsSubscriptionOfferCodeOneTimeUseCodes the fields to include for returned resources of type subscriptionOfferCodeOneTimeUseCodes (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return SubscriptionOfferCodeOneTimeUseCodesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of SubscriptionOfferCodeOneTimeUseCodes </td><td>  -  </td></tr>
     </table>
   */
  public SubscriptionOfferCodeOneTimeUseCodesResponse subscriptionOfferCodesOneTimeUseCodesGetToManyRelated(String id, List<String> fieldsSubscriptionOfferCodes, List<String> fieldsSubscriptionOfferCodeOneTimeUseCodes, Integer limit, List<String> include) throws ApiException {
    return subscriptionOfferCodesOneTimeUseCodesGetToManyRelatedWithHttpInfo(id, fieldsSubscriptionOfferCodes, fieldsSubscriptionOfferCodeOneTimeUseCodes, limit, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsSubscriptionOfferCodes the fields to include for returned resources of type subscriptionOfferCodes (optional)
   * @param fieldsSubscriptionOfferCodeOneTimeUseCodes the fields to include for returned resources of type subscriptionOfferCodeOneTimeUseCodes (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;SubscriptionOfferCodeOneTimeUseCodesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of SubscriptionOfferCodeOneTimeUseCodes </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubscriptionOfferCodeOneTimeUseCodesResponse> subscriptionOfferCodesOneTimeUseCodesGetToManyRelatedWithHttpInfo(String id, List<String> fieldsSubscriptionOfferCodes, List<String> fieldsSubscriptionOfferCodeOneTimeUseCodes, Integer limit, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionOfferCodesOneTimeUseCodesGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/subscriptionOfferCodes/{id}/oneTimeUseCodes"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[subscriptionOfferCodes]", fieldsSubscriptionOfferCodes)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptionOfferCodeOneTimeUseCodes]", fieldsSubscriptionOfferCodeOneTimeUseCodes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<SubscriptionOfferCodeOneTimeUseCodesResponse> localVarReturnType = new GenericType<SubscriptionOfferCodeOneTimeUseCodesResponse>() {};
    return apiClient.invokeAPI("SubscriptionOfferCodesApi.subscriptionOfferCodesOneTimeUseCodesGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterTerritory filter by id(s) of related &#39;territory&#39; (optional)
   * @param fieldsSubscriptionPricePoints the fields to include for returned resources of type subscriptionPricePoints (optional)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param fieldsSubscriptionOfferCodePrices the fields to include for returned resources of type subscriptionOfferCodePrices (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return SubscriptionOfferCodePricesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of SubscriptionOfferCodePrices </td><td>  -  </td></tr>
     </table>
   */
  public SubscriptionOfferCodePricesResponse subscriptionOfferCodesPricesGetToManyRelated(String id, List<String> filterTerritory, List<String> fieldsSubscriptionPricePoints, List<String> fieldsTerritories, List<String> fieldsSubscriptionOfferCodePrices, Integer limit, List<String> include) throws ApiException {
    return subscriptionOfferCodesPricesGetToManyRelatedWithHttpInfo(id, filterTerritory, fieldsSubscriptionPricePoints, fieldsTerritories, fieldsSubscriptionOfferCodePrices, limit, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterTerritory filter by id(s) of related &#39;territory&#39; (optional)
   * @param fieldsSubscriptionPricePoints the fields to include for returned resources of type subscriptionPricePoints (optional)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param fieldsSubscriptionOfferCodePrices the fields to include for returned resources of type subscriptionOfferCodePrices (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;SubscriptionOfferCodePricesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of SubscriptionOfferCodePrices </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubscriptionOfferCodePricesResponse> subscriptionOfferCodesPricesGetToManyRelatedWithHttpInfo(String id, List<String> filterTerritory, List<String> fieldsSubscriptionPricePoints, List<String> fieldsTerritories, List<String> fieldsSubscriptionOfferCodePrices, Integer limit, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionOfferCodesPricesGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/subscriptionOfferCodes/{id}/prices"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[territory]", filterTerritory)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptionPricePoints]", fieldsSubscriptionPricePoints));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[territories]", fieldsTerritories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptionOfferCodePrices]", fieldsSubscriptionOfferCodePrices));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<SubscriptionOfferCodePricesResponse> localVarReturnType = new GenericType<SubscriptionOfferCodePricesResponse>() {};
    return apiClient.invokeAPI("SubscriptionOfferCodesApi.subscriptionOfferCodesPricesGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param subscriptionOfferCodeUpdateRequest SubscriptionOfferCode representation (required)
   * @return SubscriptionOfferCodeResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single SubscriptionOfferCode </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public SubscriptionOfferCodeResponse subscriptionOfferCodesUpdateInstance(String id, SubscriptionOfferCodeUpdateRequest subscriptionOfferCodeUpdateRequest) throws ApiException {
    return subscriptionOfferCodesUpdateInstanceWithHttpInfo(id, subscriptionOfferCodeUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param subscriptionOfferCodeUpdateRequest SubscriptionOfferCode representation (required)
   * @return ApiResponse&lt;SubscriptionOfferCodeResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single SubscriptionOfferCode </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubscriptionOfferCodeResponse> subscriptionOfferCodesUpdateInstanceWithHttpInfo(String id, SubscriptionOfferCodeUpdateRequest subscriptionOfferCodeUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionOfferCodesUpdateInstance");
    }
    if (subscriptionOfferCodeUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'subscriptionOfferCodeUpdateRequest' when calling subscriptionOfferCodesUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/subscriptionOfferCodes/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<SubscriptionOfferCodeResponse> localVarReturnType = new GenericType<SubscriptionOfferCodeResponse>() {};
    return apiClient.invokeAPI("SubscriptionOfferCodesApi.subscriptionOfferCodesUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), subscriptionOfferCodeUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
