package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.InAppPurchaseAppStoreReviewScreenshotCreateRequest;
import org.openapitools.client.model.InAppPurchaseAppStoreReviewScreenshotResponse;
import org.openapitools.client.model.InAppPurchaseAppStoreReviewScreenshotUpdateRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class InAppPurchaseAppStoreReviewScreenshotsApi {
  private ApiClient apiClient;

  public InAppPurchaseAppStoreReviewScreenshotsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public InAppPurchaseAppStoreReviewScreenshotsApi(ApiClient apiClient) {
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
   * @param inAppPurchaseAppStoreReviewScreenshotCreateRequest InAppPurchaseAppStoreReviewScreenshot representation (required)
   * @return InAppPurchaseAppStoreReviewScreenshotResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single InAppPurchaseAppStoreReviewScreenshot </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public InAppPurchaseAppStoreReviewScreenshotResponse inAppPurchaseAppStoreReviewScreenshotsCreateInstance(InAppPurchaseAppStoreReviewScreenshotCreateRequest inAppPurchaseAppStoreReviewScreenshotCreateRequest) throws ApiException {
    return inAppPurchaseAppStoreReviewScreenshotsCreateInstanceWithHttpInfo(inAppPurchaseAppStoreReviewScreenshotCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param inAppPurchaseAppStoreReviewScreenshotCreateRequest InAppPurchaseAppStoreReviewScreenshot representation (required)
   * @return ApiResponse&lt;InAppPurchaseAppStoreReviewScreenshotResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single InAppPurchaseAppStoreReviewScreenshot </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InAppPurchaseAppStoreReviewScreenshotResponse> inAppPurchaseAppStoreReviewScreenshotsCreateInstanceWithHttpInfo(InAppPurchaseAppStoreReviewScreenshotCreateRequest inAppPurchaseAppStoreReviewScreenshotCreateRequest) throws ApiException {
    // Check required parameters
    if (inAppPurchaseAppStoreReviewScreenshotCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'inAppPurchaseAppStoreReviewScreenshotCreateRequest' when calling inAppPurchaseAppStoreReviewScreenshotsCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<InAppPurchaseAppStoreReviewScreenshotResponse> localVarReturnType = new GenericType<InAppPurchaseAppStoreReviewScreenshotResponse>() {};
    return apiClient.invokeAPI("InAppPurchaseAppStoreReviewScreenshotsApi.inAppPurchaseAppStoreReviewScreenshotsCreateInstance", "/v1/inAppPurchaseAppStoreReviewScreenshots", "POST", new ArrayList<>(), inAppPurchaseAppStoreReviewScreenshotCreateRequest,
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
  public void inAppPurchaseAppStoreReviewScreenshotsDeleteInstance(String id) throws ApiException {
    inAppPurchaseAppStoreReviewScreenshotsDeleteInstanceWithHttpInfo(id);
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
  public ApiResponse<Void> inAppPurchaseAppStoreReviewScreenshotsDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling inAppPurchaseAppStoreReviewScreenshotsDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/inAppPurchaseAppStoreReviewScreenshots/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("InAppPurchaseAppStoreReviewScreenshotsApi.inAppPurchaseAppStoreReviewScreenshotsDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsInAppPurchaseAppStoreReviewScreenshots the fields to include for returned resources of type inAppPurchaseAppStoreReviewScreenshots (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return InAppPurchaseAppStoreReviewScreenshotResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single InAppPurchaseAppStoreReviewScreenshot </td><td>  -  </td></tr>
     </table>
   */
  public InAppPurchaseAppStoreReviewScreenshotResponse inAppPurchaseAppStoreReviewScreenshotsGetInstance(String id, List<String> fieldsInAppPurchaseAppStoreReviewScreenshots, List<String> include) throws ApiException {
    return inAppPurchaseAppStoreReviewScreenshotsGetInstanceWithHttpInfo(id, fieldsInAppPurchaseAppStoreReviewScreenshots, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsInAppPurchaseAppStoreReviewScreenshots the fields to include for returned resources of type inAppPurchaseAppStoreReviewScreenshots (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;InAppPurchaseAppStoreReviewScreenshotResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single InAppPurchaseAppStoreReviewScreenshot </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InAppPurchaseAppStoreReviewScreenshotResponse> inAppPurchaseAppStoreReviewScreenshotsGetInstanceWithHttpInfo(String id, List<String> fieldsInAppPurchaseAppStoreReviewScreenshots, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling inAppPurchaseAppStoreReviewScreenshotsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/inAppPurchaseAppStoreReviewScreenshots/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[inAppPurchaseAppStoreReviewScreenshots]", fieldsInAppPurchaseAppStoreReviewScreenshots)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<InAppPurchaseAppStoreReviewScreenshotResponse> localVarReturnType = new GenericType<InAppPurchaseAppStoreReviewScreenshotResponse>() {};
    return apiClient.invokeAPI("InAppPurchaseAppStoreReviewScreenshotsApi.inAppPurchaseAppStoreReviewScreenshotsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param inAppPurchaseAppStoreReviewScreenshotUpdateRequest InAppPurchaseAppStoreReviewScreenshot representation (required)
   * @return InAppPurchaseAppStoreReviewScreenshotResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single InAppPurchaseAppStoreReviewScreenshot </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public InAppPurchaseAppStoreReviewScreenshotResponse inAppPurchaseAppStoreReviewScreenshotsUpdateInstance(String id, InAppPurchaseAppStoreReviewScreenshotUpdateRequest inAppPurchaseAppStoreReviewScreenshotUpdateRequest) throws ApiException {
    return inAppPurchaseAppStoreReviewScreenshotsUpdateInstanceWithHttpInfo(id, inAppPurchaseAppStoreReviewScreenshotUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param inAppPurchaseAppStoreReviewScreenshotUpdateRequest InAppPurchaseAppStoreReviewScreenshot representation (required)
   * @return ApiResponse&lt;InAppPurchaseAppStoreReviewScreenshotResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single InAppPurchaseAppStoreReviewScreenshot </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InAppPurchaseAppStoreReviewScreenshotResponse> inAppPurchaseAppStoreReviewScreenshotsUpdateInstanceWithHttpInfo(String id, InAppPurchaseAppStoreReviewScreenshotUpdateRequest inAppPurchaseAppStoreReviewScreenshotUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling inAppPurchaseAppStoreReviewScreenshotsUpdateInstance");
    }
    if (inAppPurchaseAppStoreReviewScreenshotUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'inAppPurchaseAppStoreReviewScreenshotUpdateRequest' when calling inAppPurchaseAppStoreReviewScreenshotsUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/inAppPurchaseAppStoreReviewScreenshots/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<InAppPurchaseAppStoreReviewScreenshotResponse> localVarReturnType = new GenericType<InAppPurchaseAppStoreReviewScreenshotResponse>() {};
    return apiClient.invokeAPI("InAppPurchaseAppStoreReviewScreenshotsApi.inAppPurchaseAppStoreReviewScreenshotsUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), inAppPurchaseAppStoreReviewScreenshotUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
