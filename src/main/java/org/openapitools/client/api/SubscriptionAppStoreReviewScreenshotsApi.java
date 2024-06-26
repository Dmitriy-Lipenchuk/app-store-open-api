package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.SubscriptionAppStoreReviewScreenshotCreateRequest;
import org.openapitools.client.model.SubscriptionAppStoreReviewScreenshotResponse;
import org.openapitools.client.model.SubscriptionAppStoreReviewScreenshotUpdateRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class SubscriptionAppStoreReviewScreenshotsApi {
  private ApiClient apiClient;

  public SubscriptionAppStoreReviewScreenshotsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SubscriptionAppStoreReviewScreenshotsApi(ApiClient apiClient) {
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
   * @param subscriptionAppStoreReviewScreenshotCreateRequest SubscriptionAppStoreReviewScreenshot representation (required)
   * @return SubscriptionAppStoreReviewScreenshotResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single SubscriptionAppStoreReviewScreenshot </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public SubscriptionAppStoreReviewScreenshotResponse subscriptionAppStoreReviewScreenshotsCreateInstance(SubscriptionAppStoreReviewScreenshotCreateRequest subscriptionAppStoreReviewScreenshotCreateRequest) throws ApiException {
    return subscriptionAppStoreReviewScreenshotsCreateInstanceWithHttpInfo(subscriptionAppStoreReviewScreenshotCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param subscriptionAppStoreReviewScreenshotCreateRequest SubscriptionAppStoreReviewScreenshot representation (required)
   * @return ApiResponse&lt;SubscriptionAppStoreReviewScreenshotResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single SubscriptionAppStoreReviewScreenshot </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubscriptionAppStoreReviewScreenshotResponse> subscriptionAppStoreReviewScreenshotsCreateInstanceWithHttpInfo(SubscriptionAppStoreReviewScreenshotCreateRequest subscriptionAppStoreReviewScreenshotCreateRequest) throws ApiException {
    // Check required parameters
    if (subscriptionAppStoreReviewScreenshotCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'subscriptionAppStoreReviewScreenshotCreateRequest' when calling subscriptionAppStoreReviewScreenshotsCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<SubscriptionAppStoreReviewScreenshotResponse> localVarReturnType = new GenericType<SubscriptionAppStoreReviewScreenshotResponse>() {};
    return apiClient.invokeAPI("SubscriptionAppStoreReviewScreenshotsApi.subscriptionAppStoreReviewScreenshotsCreateInstance", "/v1/subscriptionAppStoreReviewScreenshots", "POST", new ArrayList<>(), subscriptionAppStoreReviewScreenshotCreateRequest,
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
  public void subscriptionAppStoreReviewScreenshotsDeleteInstance(String id) throws ApiException {
    subscriptionAppStoreReviewScreenshotsDeleteInstanceWithHttpInfo(id);
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
  public ApiResponse<Void> subscriptionAppStoreReviewScreenshotsDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionAppStoreReviewScreenshotsDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/subscriptionAppStoreReviewScreenshots/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("SubscriptionAppStoreReviewScreenshotsApi.subscriptionAppStoreReviewScreenshotsDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsSubscriptionAppStoreReviewScreenshots the fields to include for returned resources of type subscriptionAppStoreReviewScreenshots (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return SubscriptionAppStoreReviewScreenshotResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single SubscriptionAppStoreReviewScreenshot </td><td>  -  </td></tr>
     </table>
   */
  public SubscriptionAppStoreReviewScreenshotResponse subscriptionAppStoreReviewScreenshotsGetInstance(String id, List<String> fieldsSubscriptionAppStoreReviewScreenshots, List<String> include) throws ApiException {
    return subscriptionAppStoreReviewScreenshotsGetInstanceWithHttpInfo(id, fieldsSubscriptionAppStoreReviewScreenshots, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsSubscriptionAppStoreReviewScreenshots the fields to include for returned resources of type subscriptionAppStoreReviewScreenshots (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;SubscriptionAppStoreReviewScreenshotResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single SubscriptionAppStoreReviewScreenshot </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubscriptionAppStoreReviewScreenshotResponse> subscriptionAppStoreReviewScreenshotsGetInstanceWithHttpInfo(String id, List<String> fieldsSubscriptionAppStoreReviewScreenshots, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionAppStoreReviewScreenshotsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/subscriptionAppStoreReviewScreenshots/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[subscriptionAppStoreReviewScreenshots]", fieldsSubscriptionAppStoreReviewScreenshots)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<SubscriptionAppStoreReviewScreenshotResponse> localVarReturnType = new GenericType<SubscriptionAppStoreReviewScreenshotResponse>() {};
    return apiClient.invokeAPI("SubscriptionAppStoreReviewScreenshotsApi.subscriptionAppStoreReviewScreenshotsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param subscriptionAppStoreReviewScreenshotUpdateRequest SubscriptionAppStoreReviewScreenshot representation (required)
   * @return SubscriptionAppStoreReviewScreenshotResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single SubscriptionAppStoreReviewScreenshot </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public SubscriptionAppStoreReviewScreenshotResponse subscriptionAppStoreReviewScreenshotsUpdateInstance(String id, SubscriptionAppStoreReviewScreenshotUpdateRequest subscriptionAppStoreReviewScreenshotUpdateRequest) throws ApiException {
    return subscriptionAppStoreReviewScreenshotsUpdateInstanceWithHttpInfo(id, subscriptionAppStoreReviewScreenshotUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param subscriptionAppStoreReviewScreenshotUpdateRequest SubscriptionAppStoreReviewScreenshot representation (required)
   * @return ApiResponse&lt;SubscriptionAppStoreReviewScreenshotResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single SubscriptionAppStoreReviewScreenshot </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubscriptionAppStoreReviewScreenshotResponse> subscriptionAppStoreReviewScreenshotsUpdateInstanceWithHttpInfo(String id, SubscriptionAppStoreReviewScreenshotUpdateRequest subscriptionAppStoreReviewScreenshotUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionAppStoreReviewScreenshotsUpdateInstance");
    }
    if (subscriptionAppStoreReviewScreenshotUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'subscriptionAppStoreReviewScreenshotUpdateRequest' when calling subscriptionAppStoreReviewScreenshotsUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/subscriptionAppStoreReviewScreenshots/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<SubscriptionAppStoreReviewScreenshotResponse> localVarReturnType = new GenericType<SubscriptionAppStoreReviewScreenshotResponse>() {};
    return apiClient.invokeAPI("SubscriptionAppStoreReviewScreenshotsApi.subscriptionAppStoreReviewScreenshotsUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), subscriptionAppStoreReviewScreenshotUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
