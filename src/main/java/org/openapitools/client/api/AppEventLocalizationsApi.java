package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.AppEventLocalizationCreateRequest;
import org.openapitools.client.model.AppEventLocalizationResponse;
import org.openapitools.client.model.AppEventLocalizationUpdateRequest;
import org.openapitools.client.model.AppEventScreenshotsResponse;
import org.openapitools.client.model.AppEventVideoClipsResponse;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppEventLocalizationsApi {
  private ApiClient apiClient;

  public AppEventLocalizationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AppEventLocalizationsApi(ApiClient apiClient) {
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
   * @param fieldsAppEventScreenshots the fields to include for returned resources of type appEventScreenshots (optional)
   * @param fieldsAppEventLocalizations the fields to include for returned resources of type appEventLocalizations (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AppEventScreenshotsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppEventScreenshots </td><td>  -  </td></tr>
     </table>
   */
  public AppEventScreenshotsResponse appEventLocalizationsAppEventScreenshotsGetToManyRelated(String id, List<String> fieldsAppEventScreenshots, List<String> fieldsAppEventLocalizations, Integer limit, List<String> include) throws ApiException {
    return appEventLocalizationsAppEventScreenshotsGetToManyRelatedWithHttpInfo(id, fieldsAppEventScreenshots, fieldsAppEventLocalizations, limit, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppEventScreenshots the fields to include for returned resources of type appEventScreenshots (optional)
   * @param fieldsAppEventLocalizations the fields to include for returned resources of type appEventLocalizations (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AppEventScreenshotsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppEventScreenshots </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppEventScreenshotsResponse> appEventLocalizationsAppEventScreenshotsGetToManyRelatedWithHttpInfo(String id, List<String> fieldsAppEventScreenshots, List<String> fieldsAppEventLocalizations, Integer limit, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appEventLocalizationsAppEventScreenshotsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/appEventLocalizations/{id}/appEventScreenshots"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appEventScreenshots]", fieldsAppEventScreenshots)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appEventLocalizations]", fieldsAppEventLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppEventScreenshotsResponse> localVarReturnType = new GenericType<AppEventScreenshotsResponse>() {};
    return apiClient.invokeAPI("AppEventLocalizationsApi.appEventLocalizationsAppEventScreenshotsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppEventVideoClips the fields to include for returned resources of type appEventVideoClips (optional)
   * @param fieldsAppEventLocalizations the fields to include for returned resources of type appEventLocalizations (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AppEventVideoClipsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppEventVideoClips </td><td>  -  </td></tr>
     </table>
   */
  public AppEventVideoClipsResponse appEventLocalizationsAppEventVideoClipsGetToManyRelated(String id, List<String> fieldsAppEventVideoClips, List<String> fieldsAppEventLocalizations, Integer limit, List<String> include) throws ApiException {
    return appEventLocalizationsAppEventVideoClipsGetToManyRelatedWithHttpInfo(id, fieldsAppEventVideoClips, fieldsAppEventLocalizations, limit, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppEventVideoClips the fields to include for returned resources of type appEventVideoClips (optional)
   * @param fieldsAppEventLocalizations the fields to include for returned resources of type appEventLocalizations (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AppEventVideoClipsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppEventVideoClips </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppEventVideoClipsResponse> appEventLocalizationsAppEventVideoClipsGetToManyRelatedWithHttpInfo(String id, List<String> fieldsAppEventVideoClips, List<String> fieldsAppEventLocalizations, Integer limit, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appEventLocalizationsAppEventVideoClipsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/appEventLocalizations/{id}/appEventVideoClips"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appEventVideoClips]", fieldsAppEventVideoClips)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appEventLocalizations]", fieldsAppEventLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppEventVideoClipsResponse> localVarReturnType = new GenericType<AppEventVideoClipsResponse>() {};
    return apiClient.invokeAPI("AppEventLocalizationsApi.appEventLocalizationsAppEventVideoClipsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param appEventLocalizationCreateRequest AppEventLocalization representation (required)
   * @return AppEventLocalizationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AppEventLocalization </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public AppEventLocalizationResponse appEventLocalizationsCreateInstance(AppEventLocalizationCreateRequest appEventLocalizationCreateRequest) throws ApiException {
    return appEventLocalizationsCreateInstanceWithHttpInfo(appEventLocalizationCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param appEventLocalizationCreateRequest AppEventLocalization representation (required)
   * @return ApiResponse&lt;AppEventLocalizationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AppEventLocalization </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppEventLocalizationResponse> appEventLocalizationsCreateInstanceWithHttpInfo(AppEventLocalizationCreateRequest appEventLocalizationCreateRequest) throws ApiException {
    // Check required parameters
    if (appEventLocalizationCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appEventLocalizationCreateRequest' when calling appEventLocalizationsCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppEventLocalizationResponse> localVarReturnType = new GenericType<AppEventLocalizationResponse>() {};
    return apiClient.invokeAPI("AppEventLocalizationsApi.appEventLocalizationsCreateInstance", "/v1/appEventLocalizations", "POST", new ArrayList<>(), appEventLocalizationCreateRequest,
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
  public void appEventLocalizationsDeleteInstance(String id) throws ApiException {
    appEventLocalizationsDeleteInstanceWithHttpInfo(id);
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
  public ApiResponse<Void> appEventLocalizationsDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appEventLocalizationsDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appEventLocalizations/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("AppEventLocalizationsApi.appEventLocalizationsDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppEventLocalizations the fields to include for returned resources of type appEventLocalizations (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsAppEventScreenshots the fields to include for returned resources of type appEventScreenshots (optional)
   * @param fieldsAppEventVideoClips the fields to include for returned resources of type appEventVideoClips (optional)
   * @param limitAppEventScreenshots maximum number of related appEventScreenshots returned (when they are included) (optional)
   * @param limitAppEventVideoClips maximum number of related appEventVideoClips returned (when they are included) (optional)
   * @return AppEventLocalizationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppEventLocalization </td><td>  -  </td></tr>
     </table>
   */
  public AppEventLocalizationResponse appEventLocalizationsGetInstance(String id, List<String> fieldsAppEventLocalizations, List<String> include, List<String> fieldsAppEventScreenshots, List<String> fieldsAppEventVideoClips, Integer limitAppEventScreenshots, Integer limitAppEventVideoClips) throws ApiException {
    return appEventLocalizationsGetInstanceWithHttpInfo(id, fieldsAppEventLocalizations, include, fieldsAppEventScreenshots, fieldsAppEventVideoClips, limitAppEventScreenshots, limitAppEventVideoClips).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppEventLocalizations the fields to include for returned resources of type appEventLocalizations (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsAppEventScreenshots the fields to include for returned resources of type appEventScreenshots (optional)
   * @param fieldsAppEventVideoClips the fields to include for returned resources of type appEventVideoClips (optional)
   * @param limitAppEventScreenshots maximum number of related appEventScreenshots returned (when they are included) (optional)
   * @param limitAppEventVideoClips maximum number of related appEventVideoClips returned (when they are included) (optional)
   * @return ApiResponse&lt;AppEventLocalizationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppEventLocalization </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppEventLocalizationResponse> appEventLocalizationsGetInstanceWithHttpInfo(String id, List<String> fieldsAppEventLocalizations, List<String> include, List<String> fieldsAppEventScreenshots, List<String> fieldsAppEventVideoClips, Integer limitAppEventScreenshots, Integer limitAppEventVideoClips) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appEventLocalizationsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appEventLocalizations/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appEventLocalizations]", fieldsAppEventLocalizations)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appEventScreenshots]", fieldsAppEventScreenshots));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appEventVideoClips]", fieldsAppEventVideoClips));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appEventScreenshots]", limitAppEventScreenshots));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appEventVideoClips]", limitAppEventVideoClips));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppEventLocalizationResponse> localVarReturnType = new GenericType<AppEventLocalizationResponse>() {};
    return apiClient.invokeAPI("AppEventLocalizationsApi.appEventLocalizationsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appEventLocalizationUpdateRequest AppEventLocalization representation (required)
   * @return AppEventLocalizationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppEventLocalization </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public AppEventLocalizationResponse appEventLocalizationsUpdateInstance(String id, AppEventLocalizationUpdateRequest appEventLocalizationUpdateRequest) throws ApiException {
    return appEventLocalizationsUpdateInstanceWithHttpInfo(id, appEventLocalizationUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appEventLocalizationUpdateRequest AppEventLocalization representation (required)
   * @return ApiResponse&lt;AppEventLocalizationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppEventLocalization </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppEventLocalizationResponse> appEventLocalizationsUpdateInstanceWithHttpInfo(String id, AppEventLocalizationUpdateRequest appEventLocalizationUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appEventLocalizationsUpdateInstance");
    }
    if (appEventLocalizationUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appEventLocalizationUpdateRequest' when calling appEventLocalizationsUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appEventLocalizations/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppEventLocalizationResponse> localVarReturnType = new GenericType<AppEventLocalizationResponse>() {};
    return apiClient.invokeAPI("AppEventLocalizationsApi.appEventLocalizationsUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), appEventLocalizationUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
