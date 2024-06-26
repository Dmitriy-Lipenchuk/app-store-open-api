package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.MarketplaceDomainCreateRequest;
import org.openapitools.client.model.MarketplaceDomainResponse;
import org.openapitools.client.model.MarketplaceDomainsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class MarketplaceDomainsApi {
  private ApiClient apiClient;

  public MarketplaceDomainsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MarketplaceDomainsApi(ApiClient apiClient) {
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
   * @param marketplaceDomainCreateRequest MarketplaceDomain representation (required)
   * @return MarketplaceDomainResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single MarketplaceDomain </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public MarketplaceDomainResponse marketplaceDomainsCreateInstance(MarketplaceDomainCreateRequest marketplaceDomainCreateRequest) throws ApiException {
    return marketplaceDomainsCreateInstanceWithHttpInfo(marketplaceDomainCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param marketplaceDomainCreateRequest MarketplaceDomain representation (required)
   * @return ApiResponse&lt;MarketplaceDomainResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single MarketplaceDomain </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public ApiResponse<MarketplaceDomainResponse> marketplaceDomainsCreateInstanceWithHttpInfo(MarketplaceDomainCreateRequest marketplaceDomainCreateRequest) throws ApiException {
    // Check required parameters
    if (marketplaceDomainCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'marketplaceDomainCreateRequest' when calling marketplaceDomainsCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<MarketplaceDomainResponse> localVarReturnType = new GenericType<MarketplaceDomainResponse>() {};
    return apiClient.invokeAPI("MarketplaceDomainsApi.marketplaceDomainsCreateInstance", "/v1/marketplaceDomains", "POST", new ArrayList<>(), marketplaceDomainCreateRequest,
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
   * @deprecated
   */
  @Deprecated
  public void marketplaceDomainsDeleteInstance(String id) throws ApiException {
    marketplaceDomainsDeleteInstanceWithHttpInfo(id);
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
   * @deprecated
   */
  @Deprecated
  public ApiResponse<Void> marketplaceDomainsDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling marketplaceDomainsDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/marketplaceDomains/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("MarketplaceDomainsApi.marketplaceDomainsDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param fieldsMarketplaceDomains the fields to include for returned resources of type marketplaceDomains (optional)
   * @param limit maximum resources per page (optional)
   * @return MarketplaceDomainsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of MarketplaceDomains </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public MarketplaceDomainsResponse marketplaceDomainsGetCollection(List<String> fieldsMarketplaceDomains, Integer limit) throws ApiException {
    return marketplaceDomainsGetCollectionWithHttpInfo(fieldsMarketplaceDomains, limit).getData();
  }

  /**
   * 
   * 
   * @param fieldsMarketplaceDomains the fields to include for returned resources of type marketplaceDomains (optional)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;MarketplaceDomainsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of MarketplaceDomains </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public ApiResponse<MarketplaceDomainsResponse> marketplaceDomainsGetCollectionWithHttpInfo(List<String> fieldsMarketplaceDomains, Integer limit) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[marketplaceDomains]", fieldsMarketplaceDomains)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<MarketplaceDomainsResponse> localVarReturnType = new GenericType<MarketplaceDomainsResponse>() {};
    return apiClient.invokeAPI("MarketplaceDomainsApi.marketplaceDomainsGetCollection", "/v1/marketplaceDomains", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsMarketplaceDomains the fields to include for returned resources of type marketplaceDomains (optional)
   * @return MarketplaceDomainResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single MarketplaceDomain </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public MarketplaceDomainResponse marketplaceDomainsGetInstance(String id, List<String> fieldsMarketplaceDomains) throws ApiException {
    return marketplaceDomainsGetInstanceWithHttpInfo(id, fieldsMarketplaceDomains).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsMarketplaceDomains the fields to include for returned resources of type marketplaceDomains (optional)
   * @return ApiResponse&lt;MarketplaceDomainResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single MarketplaceDomain </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public ApiResponse<MarketplaceDomainResponse> marketplaceDomainsGetInstanceWithHttpInfo(String id, List<String> fieldsMarketplaceDomains) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling marketplaceDomainsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/marketplaceDomains/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[marketplaceDomains]", fieldsMarketplaceDomains)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<MarketplaceDomainResponse> localVarReturnType = new GenericType<MarketplaceDomainResponse>() {};
    return apiClient.invokeAPI("MarketplaceDomainsApi.marketplaceDomainsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
