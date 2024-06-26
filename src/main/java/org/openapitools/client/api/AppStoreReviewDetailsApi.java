package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.AppStoreReviewAttachmentsResponse;
import org.openapitools.client.model.AppStoreReviewDetailCreateRequest;
import org.openapitools.client.model.AppStoreReviewDetailResponse;
import org.openapitools.client.model.AppStoreReviewDetailUpdateRequest;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppStoreReviewDetailsApi {
  private ApiClient apiClient;

  public AppStoreReviewDetailsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AppStoreReviewDetailsApi(ApiClient apiClient) {
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
   * @param id the id of the requested resource (required)
   * @param fieldsAppStoreReviewDetails the fields to include for returned resources of type appStoreReviewDetails (optional)
   * @param fieldsAppStoreReviewAttachments the fields to include for returned resources of type appStoreReviewAttachments (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AppStoreReviewAttachmentsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppStoreReviewAttachments </td><td>  -  </td></tr>
     </table>
   */
  public AppStoreReviewAttachmentsResponse appStoreReviewDetailsAppStoreReviewAttachmentsGetToManyRelated(String id, List<String> fieldsAppStoreReviewDetails, List<String> fieldsAppStoreReviewAttachments, Integer limit, List<String> include) throws ApiException {
    return appStoreReviewDetailsAppStoreReviewAttachmentsGetToManyRelatedWithHttpInfo(id, fieldsAppStoreReviewDetails, fieldsAppStoreReviewAttachments, limit, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppStoreReviewDetails the fields to include for returned resources of type appStoreReviewDetails (optional)
   * @param fieldsAppStoreReviewAttachments the fields to include for returned resources of type appStoreReviewAttachments (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AppStoreReviewAttachmentsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppStoreReviewAttachments </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppStoreReviewAttachmentsResponse> appStoreReviewDetailsAppStoreReviewAttachmentsGetToManyRelatedWithHttpInfo(String id, List<String> fieldsAppStoreReviewDetails, List<String> fieldsAppStoreReviewAttachments, Integer limit, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appStoreReviewDetailsAppStoreReviewAttachmentsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/appStoreReviewDetails/{id}/appStoreReviewAttachments"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appStoreReviewDetails]", fieldsAppStoreReviewDetails)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreReviewAttachments]", fieldsAppStoreReviewAttachments));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppStoreReviewAttachmentsResponse> localVarReturnType = new GenericType<AppStoreReviewAttachmentsResponse>() {};
    return apiClient.invokeAPI("AppStoreReviewDetailsApi.appStoreReviewDetailsAppStoreReviewAttachmentsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param appStoreReviewDetailCreateRequest AppStoreReviewDetail representation (required)
   * @return AppStoreReviewDetailResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AppStoreReviewDetail </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public AppStoreReviewDetailResponse appStoreReviewDetailsCreateInstance(AppStoreReviewDetailCreateRequest appStoreReviewDetailCreateRequest) throws ApiException {
    return appStoreReviewDetailsCreateInstanceWithHttpInfo(appStoreReviewDetailCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param appStoreReviewDetailCreateRequest AppStoreReviewDetail representation (required)
   * @return ApiResponse&lt;AppStoreReviewDetailResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AppStoreReviewDetail </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppStoreReviewDetailResponse> appStoreReviewDetailsCreateInstanceWithHttpInfo(AppStoreReviewDetailCreateRequest appStoreReviewDetailCreateRequest) throws ApiException {
    // Check required parameters
    if (appStoreReviewDetailCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appStoreReviewDetailCreateRequest' when calling appStoreReviewDetailsCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppStoreReviewDetailResponse> localVarReturnType = new GenericType<AppStoreReviewDetailResponse>() {};
    return apiClient.invokeAPI("AppStoreReviewDetailsApi.appStoreReviewDetailsCreateInstance", "/v1/appStoreReviewDetails", "POST", new ArrayList<>(), appStoreReviewDetailCreateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppStoreReviewDetails the fields to include for returned resources of type appStoreReviewDetails (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsAppStoreReviewAttachments the fields to include for returned resources of type appStoreReviewAttachments (optional)
   * @param limitAppStoreReviewAttachments maximum number of related appStoreReviewAttachments returned (when they are included) (optional)
   * @return AppStoreReviewDetailResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppStoreReviewDetail </td><td>  -  </td></tr>
     </table>
   */
  public AppStoreReviewDetailResponse appStoreReviewDetailsGetInstance(String id, List<String> fieldsAppStoreReviewDetails, List<String> include, List<String> fieldsAppStoreReviewAttachments, Integer limitAppStoreReviewAttachments) throws ApiException {
    return appStoreReviewDetailsGetInstanceWithHttpInfo(id, fieldsAppStoreReviewDetails, include, fieldsAppStoreReviewAttachments, limitAppStoreReviewAttachments).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppStoreReviewDetails the fields to include for returned resources of type appStoreReviewDetails (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsAppStoreReviewAttachments the fields to include for returned resources of type appStoreReviewAttachments (optional)
   * @param limitAppStoreReviewAttachments maximum number of related appStoreReviewAttachments returned (when they are included) (optional)
   * @return ApiResponse&lt;AppStoreReviewDetailResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppStoreReviewDetail </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppStoreReviewDetailResponse> appStoreReviewDetailsGetInstanceWithHttpInfo(String id, List<String> fieldsAppStoreReviewDetails, List<String> include, List<String> fieldsAppStoreReviewAttachments, Integer limitAppStoreReviewAttachments) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appStoreReviewDetailsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appStoreReviewDetails/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appStoreReviewDetails]", fieldsAppStoreReviewDetails)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreReviewAttachments]", fieldsAppStoreReviewAttachments));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appStoreReviewAttachments]", limitAppStoreReviewAttachments));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppStoreReviewDetailResponse> localVarReturnType = new GenericType<AppStoreReviewDetailResponse>() {};
    return apiClient.invokeAPI("AppStoreReviewDetailsApi.appStoreReviewDetailsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appStoreReviewDetailUpdateRequest AppStoreReviewDetail representation (required)
   * @return AppStoreReviewDetailResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppStoreReviewDetail </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public AppStoreReviewDetailResponse appStoreReviewDetailsUpdateInstance(String id, AppStoreReviewDetailUpdateRequest appStoreReviewDetailUpdateRequest) throws ApiException {
    return appStoreReviewDetailsUpdateInstanceWithHttpInfo(id, appStoreReviewDetailUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appStoreReviewDetailUpdateRequest AppStoreReviewDetail representation (required)
   * @return ApiResponse&lt;AppStoreReviewDetailResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppStoreReviewDetail </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppStoreReviewDetailResponse> appStoreReviewDetailsUpdateInstanceWithHttpInfo(String id, AppStoreReviewDetailUpdateRequest appStoreReviewDetailUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appStoreReviewDetailsUpdateInstance");
    }
    if (appStoreReviewDetailUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appStoreReviewDetailUpdateRequest' when calling appStoreReviewDetailsUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appStoreReviewDetails/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppStoreReviewDetailResponse> localVarReturnType = new GenericType<AppStoreReviewDetailResponse>() {};
    return apiClient.invokeAPI("AppStoreReviewDetailsApi.appStoreReviewDetailsUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), appStoreReviewDetailUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
