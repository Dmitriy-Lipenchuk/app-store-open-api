package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.AppClipDefaultExperienceLocalizationCreateRequest;
import org.openapitools.client.model.AppClipDefaultExperienceLocalizationResponse;
import org.openapitools.client.model.AppClipDefaultExperienceLocalizationUpdateRequest;
import org.openapitools.client.model.AppClipHeaderImageResponse;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppClipDefaultExperienceLocalizationsApi {
  private ApiClient apiClient;

  public AppClipDefaultExperienceLocalizationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AppClipDefaultExperienceLocalizationsApi(ApiClient apiClient) {
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
   * @param fieldsAppClipHeaderImages the fields to include for returned resources of type appClipHeaderImages (optional)
   * @param fieldsAppClipDefaultExperienceLocalizations the fields to include for returned resources of type appClipDefaultExperienceLocalizations (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AppClipHeaderImageResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppClipHeaderImage </td><td>  -  </td></tr>
     </table>
   */
  public AppClipHeaderImageResponse appClipDefaultExperienceLocalizationsAppClipHeaderImageGetToOneRelated(String id, List<String> fieldsAppClipHeaderImages, List<String> fieldsAppClipDefaultExperienceLocalizations, List<String> include) throws ApiException {
    return appClipDefaultExperienceLocalizationsAppClipHeaderImageGetToOneRelatedWithHttpInfo(id, fieldsAppClipHeaderImages, fieldsAppClipDefaultExperienceLocalizations, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppClipHeaderImages the fields to include for returned resources of type appClipHeaderImages (optional)
   * @param fieldsAppClipDefaultExperienceLocalizations the fields to include for returned resources of type appClipDefaultExperienceLocalizations (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AppClipHeaderImageResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppClipHeaderImage </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppClipHeaderImageResponse> appClipDefaultExperienceLocalizationsAppClipHeaderImageGetToOneRelatedWithHttpInfo(String id, List<String> fieldsAppClipHeaderImages, List<String> fieldsAppClipDefaultExperienceLocalizations, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appClipDefaultExperienceLocalizationsAppClipHeaderImageGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/appClipDefaultExperienceLocalizations/{id}/appClipHeaderImage"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appClipHeaderImages]", fieldsAppClipHeaderImages)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appClipDefaultExperienceLocalizations]", fieldsAppClipDefaultExperienceLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppClipHeaderImageResponse> localVarReturnType = new GenericType<AppClipHeaderImageResponse>() {};
    return apiClient.invokeAPI("AppClipDefaultExperienceLocalizationsApi.appClipDefaultExperienceLocalizationsAppClipHeaderImageGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param appClipDefaultExperienceLocalizationCreateRequest AppClipDefaultExperienceLocalization representation (required)
   * @return AppClipDefaultExperienceLocalizationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AppClipDefaultExperienceLocalization </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public AppClipDefaultExperienceLocalizationResponse appClipDefaultExperienceLocalizationsCreateInstance(AppClipDefaultExperienceLocalizationCreateRequest appClipDefaultExperienceLocalizationCreateRequest) throws ApiException {
    return appClipDefaultExperienceLocalizationsCreateInstanceWithHttpInfo(appClipDefaultExperienceLocalizationCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param appClipDefaultExperienceLocalizationCreateRequest AppClipDefaultExperienceLocalization representation (required)
   * @return ApiResponse&lt;AppClipDefaultExperienceLocalizationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AppClipDefaultExperienceLocalization </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppClipDefaultExperienceLocalizationResponse> appClipDefaultExperienceLocalizationsCreateInstanceWithHttpInfo(AppClipDefaultExperienceLocalizationCreateRequest appClipDefaultExperienceLocalizationCreateRequest) throws ApiException {
    // Check required parameters
    if (appClipDefaultExperienceLocalizationCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appClipDefaultExperienceLocalizationCreateRequest' when calling appClipDefaultExperienceLocalizationsCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppClipDefaultExperienceLocalizationResponse> localVarReturnType = new GenericType<AppClipDefaultExperienceLocalizationResponse>() {};
    return apiClient.invokeAPI("AppClipDefaultExperienceLocalizationsApi.appClipDefaultExperienceLocalizationsCreateInstance", "/v1/appClipDefaultExperienceLocalizations", "POST", new ArrayList<>(), appClipDefaultExperienceLocalizationCreateRequest,
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
  public void appClipDefaultExperienceLocalizationsDeleteInstance(String id) throws ApiException {
    appClipDefaultExperienceLocalizationsDeleteInstanceWithHttpInfo(id);
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
  public ApiResponse<Void> appClipDefaultExperienceLocalizationsDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appClipDefaultExperienceLocalizationsDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appClipDefaultExperienceLocalizations/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("AppClipDefaultExperienceLocalizationsApi.appClipDefaultExperienceLocalizationsDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppClipDefaultExperienceLocalizations the fields to include for returned resources of type appClipDefaultExperienceLocalizations (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsAppClipHeaderImages the fields to include for returned resources of type appClipHeaderImages (optional)
   * @return AppClipDefaultExperienceLocalizationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppClipDefaultExperienceLocalization </td><td>  -  </td></tr>
     </table>
   */
  public AppClipDefaultExperienceLocalizationResponse appClipDefaultExperienceLocalizationsGetInstance(String id, List<String> fieldsAppClipDefaultExperienceLocalizations, List<String> include, List<String> fieldsAppClipHeaderImages) throws ApiException {
    return appClipDefaultExperienceLocalizationsGetInstanceWithHttpInfo(id, fieldsAppClipDefaultExperienceLocalizations, include, fieldsAppClipHeaderImages).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppClipDefaultExperienceLocalizations the fields to include for returned resources of type appClipDefaultExperienceLocalizations (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsAppClipHeaderImages the fields to include for returned resources of type appClipHeaderImages (optional)
   * @return ApiResponse&lt;AppClipDefaultExperienceLocalizationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppClipDefaultExperienceLocalization </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppClipDefaultExperienceLocalizationResponse> appClipDefaultExperienceLocalizationsGetInstanceWithHttpInfo(String id, List<String> fieldsAppClipDefaultExperienceLocalizations, List<String> include, List<String> fieldsAppClipHeaderImages) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appClipDefaultExperienceLocalizationsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appClipDefaultExperienceLocalizations/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appClipDefaultExperienceLocalizations]", fieldsAppClipDefaultExperienceLocalizations)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appClipHeaderImages]", fieldsAppClipHeaderImages));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppClipDefaultExperienceLocalizationResponse> localVarReturnType = new GenericType<AppClipDefaultExperienceLocalizationResponse>() {};
    return apiClient.invokeAPI("AppClipDefaultExperienceLocalizationsApi.appClipDefaultExperienceLocalizationsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appClipDefaultExperienceLocalizationUpdateRequest AppClipDefaultExperienceLocalization representation (required)
   * @return AppClipDefaultExperienceLocalizationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppClipDefaultExperienceLocalization </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public AppClipDefaultExperienceLocalizationResponse appClipDefaultExperienceLocalizationsUpdateInstance(String id, AppClipDefaultExperienceLocalizationUpdateRequest appClipDefaultExperienceLocalizationUpdateRequest) throws ApiException {
    return appClipDefaultExperienceLocalizationsUpdateInstanceWithHttpInfo(id, appClipDefaultExperienceLocalizationUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appClipDefaultExperienceLocalizationUpdateRequest AppClipDefaultExperienceLocalization representation (required)
   * @return ApiResponse&lt;AppClipDefaultExperienceLocalizationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppClipDefaultExperienceLocalization </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppClipDefaultExperienceLocalizationResponse> appClipDefaultExperienceLocalizationsUpdateInstanceWithHttpInfo(String id, AppClipDefaultExperienceLocalizationUpdateRequest appClipDefaultExperienceLocalizationUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appClipDefaultExperienceLocalizationsUpdateInstance");
    }
    if (appClipDefaultExperienceLocalizationUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appClipDefaultExperienceLocalizationUpdateRequest' when calling appClipDefaultExperienceLocalizationsUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appClipDefaultExperienceLocalizations/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppClipDefaultExperienceLocalizationResponse> localVarReturnType = new GenericType<AppClipDefaultExperienceLocalizationResponse>() {};
    return apiClient.invokeAPI("AppClipDefaultExperienceLocalizationsApi.appClipDefaultExperienceLocalizationsUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), appClipDefaultExperienceLocalizationUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
