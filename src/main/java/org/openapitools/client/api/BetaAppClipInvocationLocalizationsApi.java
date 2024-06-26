package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.BetaAppClipInvocationLocalizationCreateRequest;
import org.openapitools.client.model.BetaAppClipInvocationLocalizationResponse;
import org.openapitools.client.model.BetaAppClipInvocationLocalizationUpdateRequest;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class BetaAppClipInvocationLocalizationsApi {
  private ApiClient apiClient;

  public BetaAppClipInvocationLocalizationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BetaAppClipInvocationLocalizationsApi(ApiClient apiClient) {
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
   * @param betaAppClipInvocationLocalizationCreateRequest BetaAppClipInvocationLocalization representation (required)
   * @return BetaAppClipInvocationLocalizationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single BetaAppClipInvocationLocalization </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public BetaAppClipInvocationLocalizationResponse betaAppClipInvocationLocalizationsCreateInstance(BetaAppClipInvocationLocalizationCreateRequest betaAppClipInvocationLocalizationCreateRequest) throws ApiException {
    return betaAppClipInvocationLocalizationsCreateInstanceWithHttpInfo(betaAppClipInvocationLocalizationCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param betaAppClipInvocationLocalizationCreateRequest BetaAppClipInvocationLocalization representation (required)
   * @return ApiResponse&lt;BetaAppClipInvocationLocalizationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single BetaAppClipInvocationLocalization </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BetaAppClipInvocationLocalizationResponse> betaAppClipInvocationLocalizationsCreateInstanceWithHttpInfo(BetaAppClipInvocationLocalizationCreateRequest betaAppClipInvocationLocalizationCreateRequest) throws ApiException {
    // Check required parameters
    if (betaAppClipInvocationLocalizationCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'betaAppClipInvocationLocalizationCreateRequest' when calling betaAppClipInvocationLocalizationsCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BetaAppClipInvocationLocalizationResponse> localVarReturnType = new GenericType<BetaAppClipInvocationLocalizationResponse>() {};
    return apiClient.invokeAPI("BetaAppClipInvocationLocalizationsApi.betaAppClipInvocationLocalizationsCreateInstance", "/v1/betaAppClipInvocationLocalizations", "POST", new ArrayList<>(), betaAppClipInvocationLocalizationCreateRequest,
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
  public void betaAppClipInvocationLocalizationsDeleteInstance(String id) throws ApiException {
    betaAppClipInvocationLocalizationsDeleteInstanceWithHttpInfo(id);
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
  public ApiResponse<Void> betaAppClipInvocationLocalizationsDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling betaAppClipInvocationLocalizationsDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/betaAppClipInvocationLocalizations/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("BetaAppClipInvocationLocalizationsApi.betaAppClipInvocationLocalizationsDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param betaAppClipInvocationLocalizationUpdateRequest BetaAppClipInvocationLocalization representation (required)
   * @return BetaAppClipInvocationLocalizationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single BetaAppClipInvocationLocalization </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public BetaAppClipInvocationLocalizationResponse betaAppClipInvocationLocalizationsUpdateInstance(String id, BetaAppClipInvocationLocalizationUpdateRequest betaAppClipInvocationLocalizationUpdateRequest) throws ApiException {
    return betaAppClipInvocationLocalizationsUpdateInstanceWithHttpInfo(id, betaAppClipInvocationLocalizationUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param betaAppClipInvocationLocalizationUpdateRequest BetaAppClipInvocationLocalization representation (required)
   * @return ApiResponse&lt;BetaAppClipInvocationLocalizationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single BetaAppClipInvocationLocalization </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BetaAppClipInvocationLocalizationResponse> betaAppClipInvocationLocalizationsUpdateInstanceWithHttpInfo(String id, BetaAppClipInvocationLocalizationUpdateRequest betaAppClipInvocationLocalizationUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling betaAppClipInvocationLocalizationsUpdateInstance");
    }
    if (betaAppClipInvocationLocalizationUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'betaAppClipInvocationLocalizationUpdateRequest' when calling betaAppClipInvocationLocalizationsUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/betaAppClipInvocationLocalizations/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BetaAppClipInvocationLocalizationResponse> localVarReturnType = new GenericType<BetaAppClipInvocationLocalizationResponse>() {};
    return apiClient.invokeAPI("BetaAppClipInvocationLocalizationsApi.betaAppClipInvocationLocalizationsUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), betaAppClipInvocationLocalizationUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
