package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.AlternativeDistributionDomainCreateRequest;
import org.openapitools.client.model.AlternativeDistributionDomainResponse;
import org.openapitools.client.model.AlternativeDistributionDomainsResponse;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AlternativeDistributionDomainsApi {
  private ApiClient apiClient;

  public AlternativeDistributionDomainsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AlternativeDistributionDomainsApi(ApiClient apiClient) {
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
   * @param alternativeDistributionDomainCreateRequest AlternativeDistributionDomain representation (required)
   * @return AlternativeDistributionDomainResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AlternativeDistributionDomain </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public AlternativeDistributionDomainResponse alternativeDistributionDomainsCreateInstance(AlternativeDistributionDomainCreateRequest alternativeDistributionDomainCreateRequest) throws ApiException {
    return alternativeDistributionDomainsCreateInstanceWithHttpInfo(alternativeDistributionDomainCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param alternativeDistributionDomainCreateRequest AlternativeDistributionDomain representation (required)
   * @return ApiResponse&lt;AlternativeDistributionDomainResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AlternativeDistributionDomain </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AlternativeDistributionDomainResponse> alternativeDistributionDomainsCreateInstanceWithHttpInfo(AlternativeDistributionDomainCreateRequest alternativeDistributionDomainCreateRequest) throws ApiException {
    // Check required parameters
    if (alternativeDistributionDomainCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'alternativeDistributionDomainCreateRequest' when calling alternativeDistributionDomainsCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AlternativeDistributionDomainResponse> localVarReturnType = new GenericType<AlternativeDistributionDomainResponse>() {};
    return apiClient.invokeAPI("AlternativeDistributionDomainsApi.alternativeDistributionDomainsCreateInstance", "/v1/alternativeDistributionDomains", "POST", new ArrayList<>(), alternativeDistributionDomainCreateRequest,
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
  public void alternativeDistributionDomainsDeleteInstance(String id) throws ApiException {
    alternativeDistributionDomainsDeleteInstanceWithHttpInfo(id);
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
  public ApiResponse<Void> alternativeDistributionDomainsDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling alternativeDistributionDomainsDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/alternativeDistributionDomains/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("AlternativeDistributionDomainsApi.alternativeDistributionDomainsDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param fieldsAlternativeDistributionDomains the fields to include for returned resources of type alternativeDistributionDomains (optional)
   * @param limit maximum resources per page (optional)
   * @return AlternativeDistributionDomainsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AlternativeDistributionDomains </td><td>  -  </td></tr>
     </table>
   */
  public AlternativeDistributionDomainsResponse alternativeDistributionDomainsGetCollection(List<String> fieldsAlternativeDistributionDomains, Integer limit) throws ApiException {
    return alternativeDistributionDomainsGetCollectionWithHttpInfo(fieldsAlternativeDistributionDomains, limit).getData();
  }

  /**
   * 
   * 
   * @param fieldsAlternativeDistributionDomains the fields to include for returned resources of type alternativeDistributionDomains (optional)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;AlternativeDistributionDomainsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AlternativeDistributionDomains </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AlternativeDistributionDomainsResponse> alternativeDistributionDomainsGetCollectionWithHttpInfo(List<String> fieldsAlternativeDistributionDomains, Integer limit) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[alternativeDistributionDomains]", fieldsAlternativeDistributionDomains)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AlternativeDistributionDomainsResponse> localVarReturnType = new GenericType<AlternativeDistributionDomainsResponse>() {};
    return apiClient.invokeAPI("AlternativeDistributionDomainsApi.alternativeDistributionDomainsGetCollection", "/v1/alternativeDistributionDomains", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAlternativeDistributionDomains the fields to include for returned resources of type alternativeDistributionDomains (optional)
   * @return AlternativeDistributionDomainResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AlternativeDistributionDomain </td><td>  -  </td></tr>
     </table>
   */
  public AlternativeDistributionDomainResponse alternativeDistributionDomainsGetInstance(String id, List<String> fieldsAlternativeDistributionDomains) throws ApiException {
    return alternativeDistributionDomainsGetInstanceWithHttpInfo(id, fieldsAlternativeDistributionDomains).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAlternativeDistributionDomains the fields to include for returned resources of type alternativeDistributionDomains (optional)
   * @return ApiResponse&lt;AlternativeDistributionDomainResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AlternativeDistributionDomain </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AlternativeDistributionDomainResponse> alternativeDistributionDomainsGetInstanceWithHttpInfo(String id, List<String> fieldsAlternativeDistributionDomains) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling alternativeDistributionDomainsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/alternativeDistributionDomains/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[alternativeDistributionDomains]", fieldsAlternativeDistributionDomains)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AlternativeDistributionDomainResponse> localVarReturnType = new GenericType<AlternativeDistributionDomainResponse>() {};
    return apiClient.invokeAPI("AlternativeDistributionDomainsApi.alternativeDistributionDomainsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
