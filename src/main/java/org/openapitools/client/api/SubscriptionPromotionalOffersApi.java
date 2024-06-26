package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.SubscriptionPromotionalOfferCreateRequest;
import org.openapitools.client.model.SubscriptionPromotionalOfferPricesResponse;
import org.openapitools.client.model.SubscriptionPromotionalOfferResponse;
import org.openapitools.client.model.SubscriptionPromotionalOfferUpdateRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class SubscriptionPromotionalOffersApi {
  private ApiClient apiClient;

  public SubscriptionPromotionalOffersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SubscriptionPromotionalOffersApi(ApiClient apiClient) {
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
   * @param subscriptionPromotionalOfferCreateRequest SubscriptionPromotionalOffer representation (required)
   * @return SubscriptionPromotionalOfferResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single SubscriptionPromotionalOffer </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public SubscriptionPromotionalOfferResponse subscriptionPromotionalOffersCreateInstance(SubscriptionPromotionalOfferCreateRequest subscriptionPromotionalOfferCreateRequest) throws ApiException {
    return subscriptionPromotionalOffersCreateInstanceWithHttpInfo(subscriptionPromotionalOfferCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param subscriptionPromotionalOfferCreateRequest SubscriptionPromotionalOffer representation (required)
   * @return ApiResponse&lt;SubscriptionPromotionalOfferResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single SubscriptionPromotionalOffer </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubscriptionPromotionalOfferResponse> subscriptionPromotionalOffersCreateInstanceWithHttpInfo(SubscriptionPromotionalOfferCreateRequest subscriptionPromotionalOfferCreateRequest) throws ApiException {
    // Check required parameters
    if (subscriptionPromotionalOfferCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'subscriptionPromotionalOfferCreateRequest' when calling subscriptionPromotionalOffersCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<SubscriptionPromotionalOfferResponse> localVarReturnType = new GenericType<SubscriptionPromotionalOfferResponse>() {};
    return apiClient.invokeAPI("SubscriptionPromotionalOffersApi.subscriptionPromotionalOffersCreateInstance", "/v1/subscriptionPromotionalOffers", "POST", new ArrayList<>(), subscriptionPromotionalOfferCreateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success (no content) </td><td>  -  </td></tr>
     </table>
   */
  public void subscriptionPromotionalOffersDeleteInstance(String id) throws ApiException {
    subscriptionPromotionalOffersDeleteInstanceWithHttpInfo(id);
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success (no content) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> subscriptionPromotionalOffersDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionPromotionalOffersDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/subscriptionPromotionalOffers/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("SubscriptionPromotionalOffersApi.subscriptionPromotionalOffersDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsSubscriptionPromotionalOffers the fields to include for returned resources of type subscriptionPromotionalOffers (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsSubscriptionPromotionalOfferPrices the fields to include for returned resources of type subscriptionPromotionalOfferPrices (optional)
   * @param limitPrices maximum number of related prices returned (when they are included) (optional)
   * @return SubscriptionPromotionalOfferResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single SubscriptionPromotionalOffer </td><td>  -  </td></tr>
     </table>
   */
  public SubscriptionPromotionalOfferResponse subscriptionPromotionalOffersGetInstance(String id, List<String> fieldsSubscriptionPromotionalOffers, List<String> include, List<String> fieldsSubscriptionPromotionalOfferPrices, Integer limitPrices) throws ApiException {
    return subscriptionPromotionalOffersGetInstanceWithHttpInfo(id, fieldsSubscriptionPromotionalOffers, include, fieldsSubscriptionPromotionalOfferPrices, limitPrices).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsSubscriptionPromotionalOffers the fields to include for returned resources of type subscriptionPromotionalOffers (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsSubscriptionPromotionalOfferPrices the fields to include for returned resources of type subscriptionPromotionalOfferPrices (optional)
   * @param limitPrices maximum number of related prices returned (when they are included) (optional)
   * @return ApiResponse&lt;SubscriptionPromotionalOfferResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single SubscriptionPromotionalOffer </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubscriptionPromotionalOfferResponse> subscriptionPromotionalOffersGetInstanceWithHttpInfo(String id, List<String> fieldsSubscriptionPromotionalOffers, List<String> include, List<String> fieldsSubscriptionPromotionalOfferPrices, Integer limitPrices) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionPromotionalOffersGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/subscriptionPromotionalOffers/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[subscriptionPromotionalOffers]", fieldsSubscriptionPromotionalOffers)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptionPromotionalOfferPrices]", fieldsSubscriptionPromotionalOfferPrices));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[prices]", limitPrices));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<SubscriptionPromotionalOfferResponse> localVarReturnType = new GenericType<SubscriptionPromotionalOfferResponse>() {};
    return apiClient.invokeAPI("SubscriptionPromotionalOffersApi.subscriptionPromotionalOffersGetInstance", localVarPath, "GET", localVarQueryParams, null,
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
   * @param fieldsSubscriptionPromotionalOfferPrices the fields to include for returned resources of type subscriptionPromotionalOfferPrices (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return SubscriptionPromotionalOfferPricesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of SubscriptionPromotionalOfferPrices </td><td>  -  </td></tr>
     </table>
   */
  public SubscriptionPromotionalOfferPricesResponse subscriptionPromotionalOffersPricesGetToManyRelated(String id, List<String> filterTerritory, List<String> fieldsSubscriptionPricePoints, List<String> fieldsTerritories, List<String> fieldsSubscriptionPromotionalOfferPrices, Integer limit, List<String> include) throws ApiException {
    return subscriptionPromotionalOffersPricesGetToManyRelatedWithHttpInfo(id, filterTerritory, fieldsSubscriptionPricePoints, fieldsTerritories, fieldsSubscriptionPromotionalOfferPrices, limit, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterTerritory filter by id(s) of related &#39;territory&#39; (optional)
   * @param fieldsSubscriptionPricePoints the fields to include for returned resources of type subscriptionPricePoints (optional)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param fieldsSubscriptionPromotionalOfferPrices the fields to include for returned resources of type subscriptionPromotionalOfferPrices (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;SubscriptionPromotionalOfferPricesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of SubscriptionPromotionalOfferPrices </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubscriptionPromotionalOfferPricesResponse> subscriptionPromotionalOffersPricesGetToManyRelatedWithHttpInfo(String id, List<String> filterTerritory, List<String> fieldsSubscriptionPricePoints, List<String> fieldsTerritories, List<String> fieldsSubscriptionPromotionalOfferPrices, Integer limit, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionPromotionalOffersPricesGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/subscriptionPromotionalOffers/{id}/prices"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[territory]", filterTerritory)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptionPricePoints]", fieldsSubscriptionPricePoints));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[territories]", fieldsTerritories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptionPromotionalOfferPrices]", fieldsSubscriptionPromotionalOfferPrices));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<SubscriptionPromotionalOfferPricesResponse> localVarReturnType = new GenericType<SubscriptionPromotionalOfferPricesResponse>() {};
    return apiClient.invokeAPI("SubscriptionPromotionalOffersApi.subscriptionPromotionalOffersPricesGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param subscriptionPromotionalOfferUpdateRequest SubscriptionPromotionalOffer representation (required)
   * @return SubscriptionPromotionalOfferResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single SubscriptionPromotionalOffer </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public SubscriptionPromotionalOfferResponse subscriptionPromotionalOffersUpdateInstance(String id, SubscriptionPromotionalOfferUpdateRequest subscriptionPromotionalOfferUpdateRequest) throws ApiException {
    return subscriptionPromotionalOffersUpdateInstanceWithHttpInfo(id, subscriptionPromotionalOfferUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param subscriptionPromotionalOfferUpdateRequest SubscriptionPromotionalOffer representation (required)
   * @return ApiResponse&lt;SubscriptionPromotionalOfferResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single SubscriptionPromotionalOffer </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubscriptionPromotionalOfferResponse> subscriptionPromotionalOffersUpdateInstanceWithHttpInfo(String id, SubscriptionPromotionalOfferUpdateRequest subscriptionPromotionalOfferUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionPromotionalOffersUpdateInstance");
    }
    if (subscriptionPromotionalOfferUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'subscriptionPromotionalOfferUpdateRequest' when calling subscriptionPromotionalOffersUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/subscriptionPromotionalOffers/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<SubscriptionPromotionalOfferResponse> localVarReturnType = new GenericType<SubscriptionPromotionalOfferResponse>() {};
    return apiClient.invokeAPI("SubscriptionPromotionalOffersApi.subscriptionPromotionalOffersUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), subscriptionPromotionalOfferUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
