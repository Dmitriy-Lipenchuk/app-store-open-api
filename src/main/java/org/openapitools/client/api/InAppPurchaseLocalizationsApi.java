package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.InAppPurchaseLocalizationCreateRequest;
import org.openapitools.client.model.InAppPurchaseLocalizationResponse;
import org.openapitools.client.model.InAppPurchaseLocalizationUpdateRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class InAppPurchaseLocalizationsApi {
  private ApiClient apiClient;

  public InAppPurchaseLocalizationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public InAppPurchaseLocalizationsApi(ApiClient apiClient) {
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
   * @param inAppPurchaseLocalizationCreateRequest InAppPurchaseLocalization representation (required)
   * @return InAppPurchaseLocalizationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single InAppPurchaseLocalization </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public InAppPurchaseLocalizationResponse inAppPurchaseLocalizationsCreateInstance(InAppPurchaseLocalizationCreateRequest inAppPurchaseLocalizationCreateRequest) throws ApiException {
    return inAppPurchaseLocalizationsCreateInstanceWithHttpInfo(inAppPurchaseLocalizationCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param inAppPurchaseLocalizationCreateRequest InAppPurchaseLocalization representation (required)
   * @return ApiResponse&lt;InAppPurchaseLocalizationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single InAppPurchaseLocalization </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InAppPurchaseLocalizationResponse> inAppPurchaseLocalizationsCreateInstanceWithHttpInfo(InAppPurchaseLocalizationCreateRequest inAppPurchaseLocalizationCreateRequest) throws ApiException {
    // Check required parameters
    if (inAppPurchaseLocalizationCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'inAppPurchaseLocalizationCreateRequest' when calling inAppPurchaseLocalizationsCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<InAppPurchaseLocalizationResponse> localVarReturnType = new GenericType<InAppPurchaseLocalizationResponse>() {};
    return apiClient.invokeAPI("InAppPurchaseLocalizationsApi.inAppPurchaseLocalizationsCreateInstance", "/v1/inAppPurchaseLocalizations", "POST", new ArrayList<>(), inAppPurchaseLocalizationCreateRequest,
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
  public void inAppPurchaseLocalizationsDeleteInstance(String id) throws ApiException {
    inAppPurchaseLocalizationsDeleteInstanceWithHttpInfo(id);
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
  public ApiResponse<Void> inAppPurchaseLocalizationsDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling inAppPurchaseLocalizationsDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/inAppPurchaseLocalizations/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("InAppPurchaseLocalizationsApi.inAppPurchaseLocalizationsDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsInAppPurchaseLocalizations the fields to include for returned resources of type inAppPurchaseLocalizations (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return InAppPurchaseLocalizationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single InAppPurchaseLocalization </td><td>  -  </td></tr>
     </table>
   */
  public InAppPurchaseLocalizationResponse inAppPurchaseLocalizationsGetInstance(String id, List<String> fieldsInAppPurchaseLocalizations, List<String> include) throws ApiException {
    return inAppPurchaseLocalizationsGetInstanceWithHttpInfo(id, fieldsInAppPurchaseLocalizations, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsInAppPurchaseLocalizations the fields to include for returned resources of type inAppPurchaseLocalizations (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;InAppPurchaseLocalizationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single InAppPurchaseLocalization </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InAppPurchaseLocalizationResponse> inAppPurchaseLocalizationsGetInstanceWithHttpInfo(String id, List<String> fieldsInAppPurchaseLocalizations, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling inAppPurchaseLocalizationsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/inAppPurchaseLocalizations/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[inAppPurchaseLocalizations]", fieldsInAppPurchaseLocalizations)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<InAppPurchaseLocalizationResponse> localVarReturnType = new GenericType<InAppPurchaseLocalizationResponse>() {};
    return apiClient.invokeAPI("InAppPurchaseLocalizationsApi.inAppPurchaseLocalizationsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param inAppPurchaseLocalizationUpdateRequest InAppPurchaseLocalization representation (required)
   * @return InAppPurchaseLocalizationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single InAppPurchaseLocalization </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public InAppPurchaseLocalizationResponse inAppPurchaseLocalizationsUpdateInstance(String id, InAppPurchaseLocalizationUpdateRequest inAppPurchaseLocalizationUpdateRequest) throws ApiException {
    return inAppPurchaseLocalizationsUpdateInstanceWithHttpInfo(id, inAppPurchaseLocalizationUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param inAppPurchaseLocalizationUpdateRequest InAppPurchaseLocalization representation (required)
   * @return ApiResponse&lt;InAppPurchaseLocalizationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single InAppPurchaseLocalization </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InAppPurchaseLocalizationResponse> inAppPurchaseLocalizationsUpdateInstanceWithHttpInfo(String id, InAppPurchaseLocalizationUpdateRequest inAppPurchaseLocalizationUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling inAppPurchaseLocalizationsUpdateInstance");
    }
    if (inAppPurchaseLocalizationUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'inAppPurchaseLocalizationUpdateRequest' when calling inAppPurchaseLocalizationsUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/inAppPurchaseLocalizations/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<InAppPurchaseLocalizationResponse> localVarReturnType = new GenericType<InAppPurchaseLocalizationResponse>() {};
    return apiClient.invokeAPI("InAppPurchaseLocalizationsApi.inAppPurchaseLocalizationsUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), inAppPurchaseLocalizationUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
