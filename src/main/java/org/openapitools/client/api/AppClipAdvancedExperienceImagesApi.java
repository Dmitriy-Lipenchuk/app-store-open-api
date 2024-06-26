package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.AppClipAdvancedExperienceImageCreateRequest;
import org.openapitools.client.model.AppClipAdvancedExperienceImageResponse;
import org.openapitools.client.model.AppClipAdvancedExperienceImageUpdateRequest;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppClipAdvancedExperienceImagesApi {
  private ApiClient apiClient;

  public AppClipAdvancedExperienceImagesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AppClipAdvancedExperienceImagesApi(ApiClient apiClient) {
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
   * @param appClipAdvancedExperienceImageCreateRequest AppClipAdvancedExperienceImage representation (required)
   * @return AppClipAdvancedExperienceImageResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AppClipAdvancedExperienceImage </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public AppClipAdvancedExperienceImageResponse appClipAdvancedExperienceImagesCreateInstance(AppClipAdvancedExperienceImageCreateRequest appClipAdvancedExperienceImageCreateRequest) throws ApiException {
    return appClipAdvancedExperienceImagesCreateInstanceWithHttpInfo(appClipAdvancedExperienceImageCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param appClipAdvancedExperienceImageCreateRequest AppClipAdvancedExperienceImage representation (required)
   * @return ApiResponse&lt;AppClipAdvancedExperienceImageResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AppClipAdvancedExperienceImage </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppClipAdvancedExperienceImageResponse> appClipAdvancedExperienceImagesCreateInstanceWithHttpInfo(AppClipAdvancedExperienceImageCreateRequest appClipAdvancedExperienceImageCreateRequest) throws ApiException {
    // Check required parameters
    if (appClipAdvancedExperienceImageCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appClipAdvancedExperienceImageCreateRequest' when calling appClipAdvancedExperienceImagesCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppClipAdvancedExperienceImageResponse> localVarReturnType = new GenericType<AppClipAdvancedExperienceImageResponse>() {};
    return apiClient.invokeAPI("AppClipAdvancedExperienceImagesApi.appClipAdvancedExperienceImagesCreateInstance", "/v1/appClipAdvancedExperienceImages", "POST", new ArrayList<>(), appClipAdvancedExperienceImageCreateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppClipAdvancedExperienceImages the fields to include for returned resources of type appClipAdvancedExperienceImages (optional)
   * @return AppClipAdvancedExperienceImageResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppClipAdvancedExperienceImage </td><td>  -  </td></tr>
     </table>
   */
  public AppClipAdvancedExperienceImageResponse appClipAdvancedExperienceImagesGetInstance(String id, List<String> fieldsAppClipAdvancedExperienceImages) throws ApiException {
    return appClipAdvancedExperienceImagesGetInstanceWithHttpInfo(id, fieldsAppClipAdvancedExperienceImages).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppClipAdvancedExperienceImages the fields to include for returned resources of type appClipAdvancedExperienceImages (optional)
   * @return ApiResponse&lt;AppClipAdvancedExperienceImageResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppClipAdvancedExperienceImage </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppClipAdvancedExperienceImageResponse> appClipAdvancedExperienceImagesGetInstanceWithHttpInfo(String id, List<String> fieldsAppClipAdvancedExperienceImages) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appClipAdvancedExperienceImagesGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appClipAdvancedExperienceImages/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appClipAdvancedExperienceImages]", fieldsAppClipAdvancedExperienceImages)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppClipAdvancedExperienceImageResponse> localVarReturnType = new GenericType<AppClipAdvancedExperienceImageResponse>() {};
    return apiClient.invokeAPI("AppClipAdvancedExperienceImagesApi.appClipAdvancedExperienceImagesGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appClipAdvancedExperienceImageUpdateRequest AppClipAdvancedExperienceImage representation (required)
   * @return AppClipAdvancedExperienceImageResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppClipAdvancedExperienceImage </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public AppClipAdvancedExperienceImageResponse appClipAdvancedExperienceImagesUpdateInstance(String id, AppClipAdvancedExperienceImageUpdateRequest appClipAdvancedExperienceImageUpdateRequest) throws ApiException {
    return appClipAdvancedExperienceImagesUpdateInstanceWithHttpInfo(id, appClipAdvancedExperienceImageUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appClipAdvancedExperienceImageUpdateRequest AppClipAdvancedExperienceImage representation (required)
   * @return ApiResponse&lt;AppClipAdvancedExperienceImageResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppClipAdvancedExperienceImage </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppClipAdvancedExperienceImageResponse> appClipAdvancedExperienceImagesUpdateInstanceWithHttpInfo(String id, AppClipAdvancedExperienceImageUpdateRequest appClipAdvancedExperienceImageUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appClipAdvancedExperienceImagesUpdateInstance");
    }
    if (appClipAdvancedExperienceImageUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appClipAdvancedExperienceImageUpdateRequest' when calling appClipAdvancedExperienceImagesUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appClipAdvancedExperienceImages/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppClipAdvancedExperienceImageResponse> localVarReturnType = new GenericType<AppClipAdvancedExperienceImageResponse>() {};
    return apiClient.invokeAPI("AppClipAdvancedExperienceImagesApi.appClipAdvancedExperienceImagesUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), appClipAdvancedExperienceImageUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
