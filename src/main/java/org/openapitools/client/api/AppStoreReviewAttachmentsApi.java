package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.AppStoreReviewAttachmentCreateRequest;
import org.openapitools.client.model.AppStoreReviewAttachmentResponse;
import org.openapitools.client.model.AppStoreReviewAttachmentUpdateRequest;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppStoreReviewAttachmentsApi {
  private ApiClient apiClient;

  public AppStoreReviewAttachmentsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AppStoreReviewAttachmentsApi(ApiClient apiClient) {
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
   * @param appStoreReviewAttachmentCreateRequest AppStoreReviewAttachment representation (required)
   * @return AppStoreReviewAttachmentResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AppStoreReviewAttachment </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public AppStoreReviewAttachmentResponse appStoreReviewAttachmentsCreateInstance(AppStoreReviewAttachmentCreateRequest appStoreReviewAttachmentCreateRequest) throws ApiException {
    return appStoreReviewAttachmentsCreateInstanceWithHttpInfo(appStoreReviewAttachmentCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param appStoreReviewAttachmentCreateRequest AppStoreReviewAttachment representation (required)
   * @return ApiResponse&lt;AppStoreReviewAttachmentResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AppStoreReviewAttachment </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppStoreReviewAttachmentResponse> appStoreReviewAttachmentsCreateInstanceWithHttpInfo(AppStoreReviewAttachmentCreateRequest appStoreReviewAttachmentCreateRequest) throws ApiException {
    // Check required parameters
    if (appStoreReviewAttachmentCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appStoreReviewAttachmentCreateRequest' when calling appStoreReviewAttachmentsCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppStoreReviewAttachmentResponse> localVarReturnType = new GenericType<AppStoreReviewAttachmentResponse>() {};
    return apiClient.invokeAPI("AppStoreReviewAttachmentsApi.appStoreReviewAttachmentsCreateInstance", "/v1/appStoreReviewAttachments", "POST", new ArrayList<>(), appStoreReviewAttachmentCreateRequest,
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
  public void appStoreReviewAttachmentsDeleteInstance(String id) throws ApiException {
    appStoreReviewAttachmentsDeleteInstanceWithHttpInfo(id);
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
  public ApiResponse<Void> appStoreReviewAttachmentsDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appStoreReviewAttachmentsDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appStoreReviewAttachments/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("AppStoreReviewAttachmentsApi.appStoreReviewAttachmentsDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppStoreReviewAttachments the fields to include for returned resources of type appStoreReviewAttachments (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AppStoreReviewAttachmentResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppStoreReviewAttachment </td><td>  -  </td></tr>
     </table>
   */
  public AppStoreReviewAttachmentResponse appStoreReviewAttachmentsGetInstance(String id, List<String> fieldsAppStoreReviewAttachments, List<String> include) throws ApiException {
    return appStoreReviewAttachmentsGetInstanceWithHttpInfo(id, fieldsAppStoreReviewAttachments, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppStoreReviewAttachments the fields to include for returned resources of type appStoreReviewAttachments (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AppStoreReviewAttachmentResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppStoreReviewAttachment </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppStoreReviewAttachmentResponse> appStoreReviewAttachmentsGetInstanceWithHttpInfo(String id, List<String> fieldsAppStoreReviewAttachments, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appStoreReviewAttachmentsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appStoreReviewAttachments/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appStoreReviewAttachments]", fieldsAppStoreReviewAttachments)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppStoreReviewAttachmentResponse> localVarReturnType = new GenericType<AppStoreReviewAttachmentResponse>() {};
    return apiClient.invokeAPI("AppStoreReviewAttachmentsApi.appStoreReviewAttachmentsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appStoreReviewAttachmentUpdateRequest AppStoreReviewAttachment representation (required)
   * @return AppStoreReviewAttachmentResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppStoreReviewAttachment </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public AppStoreReviewAttachmentResponse appStoreReviewAttachmentsUpdateInstance(String id, AppStoreReviewAttachmentUpdateRequest appStoreReviewAttachmentUpdateRequest) throws ApiException {
    return appStoreReviewAttachmentsUpdateInstanceWithHttpInfo(id, appStoreReviewAttachmentUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appStoreReviewAttachmentUpdateRequest AppStoreReviewAttachment representation (required)
   * @return ApiResponse&lt;AppStoreReviewAttachmentResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppStoreReviewAttachment </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppStoreReviewAttachmentResponse> appStoreReviewAttachmentsUpdateInstanceWithHttpInfo(String id, AppStoreReviewAttachmentUpdateRequest appStoreReviewAttachmentUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appStoreReviewAttachmentsUpdateInstance");
    }
    if (appStoreReviewAttachmentUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appStoreReviewAttachmentUpdateRequest' when calling appStoreReviewAttachmentsUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appStoreReviewAttachments/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppStoreReviewAttachmentResponse> localVarReturnType = new GenericType<AppStoreReviewAttachmentResponse>() {};
    return apiClient.invokeAPI("AppStoreReviewAttachmentsApi.appStoreReviewAttachmentsUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), appStoreReviewAttachmentUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
