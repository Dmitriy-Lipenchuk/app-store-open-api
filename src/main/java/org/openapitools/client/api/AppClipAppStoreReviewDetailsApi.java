package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.AppClipAppStoreReviewDetailCreateRequest;
import org.openapitools.client.model.AppClipAppStoreReviewDetailResponse;
import org.openapitools.client.model.AppClipAppStoreReviewDetailUpdateRequest;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppClipAppStoreReviewDetailsApi {
  private ApiClient apiClient;

  public AppClipAppStoreReviewDetailsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AppClipAppStoreReviewDetailsApi(ApiClient apiClient) {
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
   * @param appClipAppStoreReviewDetailCreateRequest AppClipAppStoreReviewDetail representation (required)
   * @return AppClipAppStoreReviewDetailResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AppClipAppStoreReviewDetail </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public AppClipAppStoreReviewDetailResponse appClipAppStoreReviewDetailsCreateInstance(AppClipAppStoreReviewDetailCreateRequest appClipAppStoreReviewDetailCreateRequest) throws ApiException {
    return appClipAppStoreReviewDetailsCreateInstanceWithHttpInfo(appClipAppStoreReviewDetailCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param appClipAppStoreReviewDetailCreateRequest AppClipAppStoreReviewDetail representation (required)
   * @return ApiResponse&lt;AppClipAppStoreReviewDetailResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AppClipAppStoreReviewDetail </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppClipAppStoreReviewDetailResponse> appClipAppStoreReviewDetailsCreateInstanceWithHttpInfo(AppClipAppStoreReviewDetailCreateRequest appClipAppStoreReviewDetailCreateRequest) throws ApiException {
    // Check required parameters
    if (appClipAppStoreReviewDetailCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appClipAppStoreReviewDetailCreateRequest' when calling appClipAppStoreReviewDetailsCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppClipAppStoreReviewDetailResponse> localVarReturnType = new GenericType<AppClipAppStoreReviewDetailResponse>() {};
    return apiClient.invokeAPI("AppClipAppStoreReviewDetailsApi.appClipAppStoreReviewDetailsCreateInstance", "/v1/appClipAppStoreReviewDetails", "POST", new ArrayList<>(), appClipAppStoreReviewDetailCreateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppClipAppStoreReviewDetails the fields to include for returned resources of type appClipAppStoreReviewDetails (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AppClipAppStoreReviewDetailResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppClipAppStoreReviewDetail </td><td>  -  </td></tr>
     </table>
   */
  public AppClipAppStoreReviewDetailResponse appClipAppStoreReviewDetailsGetInstance(String id, List<String> fieldsAppClipAppStoreReviewDetails, List<String> include) throws ApiException {
    return appClipAppStoreReviewDetailsGetInstanceWithHttpInfo(id, fieldsAppClipAppStoreReviewDetails, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppClipAppStoreReviewDetails the fields to include for returned resources of type appClipAppStoreReviewDetails (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AppClipAppStoreReviewDetailResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppClipAppStoreReviewDetail </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppClipAppStoreReviewDetailResponse> appClipAppStoreReviewDetailsGetInstanceWithHttpInfo(String id, List<String> fieldsAppClipAppStoreReviewDetails, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appClipAppStoreReviewDetailsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appClipAppStoreReviewDetails/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appClipAppStoreReviewDetails]", fieldsAppClipAppStoreReviewDetails)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppClipAppStoreReviewDetailResponse> localVarReturnType = new GenericType<AppClipAppStoreReviewDetailResponse>() {};
    return apiClient.invokeAPI("AppClipAppStoreReviewDetailsApi.appClipAppStoreReviewDetailsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appClipAppStoreReviewDetailUpdateRequest AppClipAppStoreReviewDetail representation (required)
   * @return AppClipAppStoreReviewDetailResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppClipAppStoreReviewDetail </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public AppClipAppStoreReviewDetailResponse appClipAppStoreReviewDetailsUpdateInstance(String id, AppClipAppStoreReviewDetailUpdateRequest appClipAppStoreReviewDetailUpdateRequest) throws ApiException {
    return appClipAppStoreReviewDetailsUpdateInstanceWithHttpInfo(id, appClipAppStoreReviewDetailUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appClipAppStoreReviewDetailUpdateRequest AppClipAppStoreReviewDetail representation (required)
   * @return ApiResponse&lt;AppClipAppStoreReviewDetailResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppClipAppStoreReviewDetail </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppClipAppStoreReviewDetailResponse> appClipAppStoreReviewDetailsUpdateInstanceWithHttpInfo(String id, AppClipAppStoreReviewDetailUpdateRequest appClipAppStoreReviewDetailUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appClipAppStoreReviewDetailsUpdateInstance");
    }
    if (appClipAppStoreReviewDetailUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appClipAppStoreReviewDetailUpdateRequest' when calling appClipAppStoreReviewDetailsUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appClipAppStoreReviewDetails/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppClipAppStoreReviewDetailResponse> localVarReturnType = new GenericType<AppClipAppStoreReviewDetailResponse>() {};
    return apiClient.invokeAPI("AppClipAppStoreReviewDetailsApi.appClipAppStoreReviewDetailsUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), appClipAppStoreReviewDetailUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
