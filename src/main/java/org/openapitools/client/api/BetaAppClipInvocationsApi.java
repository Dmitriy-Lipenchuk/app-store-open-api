package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.BetaAppClipInvocationCreateRequest;
import org.openapitools.client.model.BetaAppClipInvocationResponse;
import org.openapitools.client.model.BetaAppClipInvocationUpdateRequest;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class BetaAppClipInvocationsApi {
  private ApiClient apiClient;

  public BetaAppClipInvocationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BetaAppClipInvocationsApi(ApiClient apiClient) {
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
   * @param betaAppClipInvocationCreateRequest BetaAppClipInvocation representation (required)
   * @return BetaAppClipInvocationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single BetaAppClipInvocation </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public BetaAppClipInvocationResponse betaAppClipInvocationsCreateInstance(BetaAppClipInvocationCreateRequest betaAppClipInvocationCreateRequest) throws ApiException {
    return betaAppClipInvocationsCreateInstanceWithHttpInfo(betaAppClipInvocationCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param betaAppClipInvocationCreateRequest BetaAppClipInvocation representation (required)
   * @return ApiResponse&lt;BetaAppClipInvocationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single BetaAppClipInvocation </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BetaAppClipInvocationResponse> betaAppClipInvocationsCreateInstanceWithHttpInfo(BetaAppClipInvocationCreateRequest betaAppClipInvocationCreateRequest) throws ApiException {
    // Check required parameters
    if (betaAppClipInvocationCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'betaAppClipInvocationCreateRequest' when calling betaAppClipInvocationsCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BetaAppClipInvocationResponse> localVarReturnType = new GenericType<BetaAppClipInvocationResponse>() {};
    return apiClient.invokeAPI("BetaAppClipInvocationsApi.betaAppClipInvocationsCreateInstance", "/v1/betaAppClipInvocations", "POST", new ArrayList<>(), betaAppClipInvocationCreateRequest,
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
  public void betaAppClipInvocationsDeleteInstance(String id) throws ApiException {
    betaAppClipInvocationsDeleteInstanceWithHttpInfo(id);
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
  public ApiResponse<Void> betaAppClipInvocationsDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling betaAppClipInvocationsDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/betaAppClipInvocations/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("BetaAppClipInvocationsApi.betaAppClipInvocationsDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBetaAppClipInvocations the fields to include for returned resources of type betaAppClipInvocations (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param limitBetaAppClipInvocationLocalizations maximum number of related betaAppClipInvocationLocalizations returned (when they are included) (optional)
   * @return BetaAppClipInvocationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single BetaAppClipInvocation </td><td>  -  </td></tr>
     </table>
   */
  public BetaAppClipInvocationResponse betaAppClipInvocationsGetInstance(String id, List<String> fieldsBetaAppClipInvocations, List<String> include, Integer limitBetaAppClipInvocationLocalizations) throws ApiException {
    return betaAppClipInvocationsGetInstanceWithHttpInfo(id, fieldsBetaAppClipInvocations, include, limitBetaAppClipInvocationLocalizations).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBetaAppClipInvocations the fields to include for returned resources of type betaAppClipInvocations (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param limitBetaAppClipInvocationLocalizations maximum number of related betaAppClipInvocationLocalizations returned (when they are included) (optional)
   * @return ApiResponse&lt;BetaAppClipInvocationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single BetaAppClipInvocation </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BetaAppClipInvocationResponse> betaAppClipInvocationsGetInstanceWithHttpInfo(String id, List<String> fieldsBetaAppClipInvocations, List<String> include, Integer limitBetaAppClipInvocationLocalizations) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling betaAppClipInvocationsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/betaAppClipInvocations/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[betaAppClipInvocations]", fieldsBetaAppClipInvocations)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[betaAppClipInvocationLocalizations]", limitBetaAppClipInvocationLocalizations));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BetaAppClipInvocationResponse> localVarReturnType = new GenericType<BetaAppClipInvocationResponse>() {};
    return apiClient.invokeAPI("BetaAppClipInvocationsApi.betaAppClipInvocationsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param betaAppClipInvocationUpdateRequest BetaAppClipInvocation representation (required)
   * @return BetaAppClipInvocationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single BetaAppClipInvocation </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public BetaAppClipInvocationResponse betaAppClipInvocationsUpdateInstance(String id, BetaAppClipInvocationUpdateRequest betaAppClipInvocationUpdateRequest) throws ApiException {
    return betaAppClipInvocationsUpdateInstanceWithHttpInfo(id, betaAppClipInvocationUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param betaAppClipInvocationUpdateRequest BetaAppClipInvocation representation (required)
   * @return ApiResponse&lt;BetaAppClipInvocationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single BetaAppClipInvocation </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BetaAppClipInvocationResponse> betaAppClipInvocationsUpdateInstanceWithHttpInfo(String id, BetaAppClipInvocationUpdateRequest betaAppClipInvocationUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling betaAppClipInvocationsUpdateInstance");
    }
    if (betaAppClipInvocationUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'betaAppClipInvocationUpdateRequest' when calling betaAppClipInvocationsUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/betaAppClipInvocations/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BetaAppClipInvocationResponse> localVarReturnType = new GenericType<BetaAppClipInvocationResponse>() {};
    return apiClient.invokeAPI("BetaAppClipInvocationsApi.betaAppClipInvocationsUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), betaAppClipInvocationUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
