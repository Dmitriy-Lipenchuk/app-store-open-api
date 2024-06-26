package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.MarketplaceWebhookCreateRequest;
import org.openapitools.client.model.MarketplaceWebhookResponse;
import org.openapitools.client.model.MarketplaceWebhookUpdateRequest;
import org.openapitools.client.model.MarketplaceWebhooksResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class MarketplaceWebhooksApi {
  private ApiClient apiClient;

  public MarketplaceWebhooksApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MarketplaceWebhooksApi(ApiClient apiClient) {
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
   * @param marketplaceWebhookCreateRequest MarketplaceWebhook representation (required)
   * @return MarketplaceWebhookResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single MarketplaceWebhook </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public MarketplaceWebhookResponse marketplaceWebhooksCreateInstance(MarketplaceWebhookCreateRequest marketplaceWebhookCreateRequest) throws ApiException {
    return marketplaceWebhooksCreateInstanceWithHttpInfo(marketplaceWebhookCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param marketplaceWebhookCreateRequest MarketplaceWebhook representation (required)
   * @return ApiResponse&lt;MarketplaceWebhookResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single MarketplaceWebhook </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MarketplaceWebhookResponse> marketplaceWebhooksCreateInstanceWithHttpInfo(MarketplaceWebhookCreateRequest marketplaceWebhookCreateRequest) throws ApiException {
    // Check required parameters
    if (marketplaceWebhookCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'marketplaceWebhookCreateRequest' when calling marketplaceWebhooksCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<MarketplaceWebhookResponse> localVarReturnType = new GenericType<MarketplaceWebhookResponse>() {};
    return apiClient.invokeAPI("MarketplaceWebhooksApi.marketplaceWebhooksCreateInstance", "/v1/marketplaceWebhooks", "POST", new ArrayList<>(), marketplaceWebhookCreateRequest,
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
  public void marketplaceWebhooksDeleteInstance(String id) throws ApiException {
    marketplaceWebhooksDeleteInstanceWithHttpInfo(id);
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
  public ApiResponse<Void> marketplaceWebhooksDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling marketplaceWebhooksDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/marketplaceWebhooks/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("MarketplaceWebhooksApi.marketplaceWebhooksDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param fieldsMarketplaceWebhooks the fields to include for returned resources of type marketplaceWebhooks (optional)
   * @param limit maximum resources per page (optional)
   * @return MarketplaceWebhooksResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of MarketplaceWebhooks </td><td>  -  </td></tr>
     </table>
   */
  public MarketplaceWebhooksResponse marketplaceWebhooksGetCollection(List<String> fieldsMarketplaceWebhooks, Integer limit) throws ApiException {
    return marketplaceWebhooksGetCollectionWithHttpInfo(fieldsMarketplaceWebhooks, limit).getData();
  }

  /**
   * 
   * 
   * @param fieldsMarketplaceWebhooks the fields to include for returned resources of type marketplaceWebhooks (optional)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;MarketplaceWebhooksResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of MarketplaceWebhooks </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MarketplaceWebhooksResponse> marketplaceWebhooksGetCollectionWithHttpInfo(List<String> fieldsMarketplaceWebhooks, Integer limit) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[marketplaceWebhooks]", fieldsMarketplaceWebhooks)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<MarketplaceWebhooksResponse> localVarReturnType = new GenericType<MarketplaceWebhooksResponse>() {};
    return apiClient.invokeAPI("MarketplaceWebhooksApi.marketplaceWebhooksGetCollection", "/v1/marketplaceWebhooks", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param marketplaceWebhookUpdateRequest MarketplaceWebhook representation (required)
   * @return MarketplaceWebhookResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single MarketplaceWebhook </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public MarketplaceWebhookResponse marketplaceWebhooksUpdateInstance(String id, MarketplaceWebhookUpdateRequest marketplaceWebhookUpdateRequest) throws ApiException {
    return marketplaceWebhooksUpdateInstanceWithHttpInfo(id, marketplaceWebhookUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param marketplaceWebhookUpdateRequest MarketplaceWebhook representation (required)
   * @return ApiResponse&lt;MarketplaceWebhookResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single MarketplaceWebhook </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<MarketplaceWebhookResponse> marketplaceWebhooksUpdateInstanceWithHttpInfo(String id, MarketplaceWebhookUpdateRequest marketplaceWebhookUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling marketplaceWebhooksUpdateInstance");
    }
    if (marketplaceWebhookUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'marketplaceWebhookUpdateRequest' when calling marketplaceWebhooksUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/marketplaceWebhooks/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<MarketplaceWebhookResponse> localVarReturnType = new GenericType<MarketplaceWebhookResponse>() {};
    return apiClient.invokeAPI("MarketplaceWebhooksApi.marketplaceWebhooksUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), marketplaceWebhookUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
