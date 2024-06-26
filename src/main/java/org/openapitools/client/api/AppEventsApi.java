package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.AppEventCreateRequest;
import org.openapitools.client.model.AppEventLocalizationsResponse;
import org.openapitools.client.model.AppEventResponse;
import org.openapitools.client.model.AppEventUpdateRequest;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppEventsApi {
  private ApiClient apiClient;

  public AppEventsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AppEventsApi(ApiClient apiClient) {
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
   * @param appEventCreateRequest AppEvent representation (required)
   * @return AppEventResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AppEvent </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public AppEventResponse appEventsCreateInstance(AppEventCreateRequest appEventCreateRequest) throws ApiException {
    return appEventsCreateInstanceWithHttpInfo(appEventCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param appEventCreateRequest AppEvent representation (required)
   * @return ApiResponse&lt;AppEventResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AppEvent </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppEventResponse> appEventsCreateInstanceWithHttpInfo(AppEventCreateRequest appEventCreateRequest) throws ApiException {
    // Check required parameters
    if (appEventCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appEventCreateRequest' when calling appEventsCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppEventResponse> localVarReturnType = new GenericType<AppEventResponse>() {};
    return apiClient.invokeAPI("AppEventsApi.appEventsCreateInstance", "/v1/appEvents", "POST", new ArrayList<>(), appEventCreateRequest,
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
  public void appEventsDeleteInstance(String id) throws ApiException {
    appEventsDeleteInstanceWithHttpInfo(id);
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
  public ApiResponse<Void> appEventsDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appEventsDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appEvents/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("AppEventsApi.appEventsDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppEvents the fields to include for returned resources of type appEvents (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsAppEventLocalizations the fields to include for returned resources of type appEventLocalizations (optional)
   * @param limitLocalizations maximum number of related localizations returned (when they are included) (optional)
   * @return AppEventResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppEvent </td><td>  -  </td></tr>
     </table>
   */
  public AppEventResponse appEventsGetInstance(String id, List<String> fieldsAppEvents, List<String> include, List<String> fieldsAppEventLocalizations, Integer limitLocalizations) throws ApiException {
    return appEventsGetInstanceWithHttpInfo(id, fieldsAppEvents, include, fieldsAppEventLocalizations, limitLocalizations).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppEvents the fields to include for returned resources of type appEvents (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsAppEventLocalizations the fields to include for returned resources of type appEventLocalizations (optional)
   * @param limitLocalizations maximum number of related localizations returned (when they are included) (optional)
   * @return ApiResponse&lt;AppEventResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppEvent </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppEventResponse> appEventsGetInstanceWithHttpInfo(String id, List<String> fieldsAppEvents, List<String> include, List<String> fieldsAppEventLocalizations, Integer limitLocalizations) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appEventsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appEvents/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appEvents]", fieldsAppEvents)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appEventLocalizations]", fieldsAppEventLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[localizations]", limitLocalizations));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppEventResponse> localVarReturnType = new GenericType<AppEventResponse>() {};
    return apiClient.invokeAPI("AppEventsApi.appEventsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppEventScreenshots the fields to include for returned resources of type appEventScreenshots (optional)
   * @param fieldsAppEventVideoClips the fields to include for returned resources of type appEventVideoClips (optional)
   * @param fieldsAppEventLocalizations the fields to include for returned resources of type appEventLocalizations (optional)
   * @param fieldsAppEvents the fields to include for returned resources of type appEvents (optional)
   * @param limit maximum resources per page (optional)
   * @param limitAppEventScreenshots maximum number of related appEventScreenshots returned (when they are included) (optional)
   * @param limitAppEventVideoClips maximum number of related appEventVideoClips returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AppEventLocalizationsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppEventLocalizations </td><td>  -  </td></tr>
     </table>
   */
  public AppEventLocalizationsResponse appEventsLocalizationsGetToManyRelated(String id, List<String> fieldsAppEventScreenshots, List<String> fieldsAppEventVideoClips, List<String> fieldsAppEventLocalizations, List<String> fieldsAppEvents, Integer limit, Integer limitAppEventScreenshots, Integer limitAppEventVideoClips, List<String> include) throws ApiException {
    return appEventsLocalizationsGetToManyRelatedWithHttpInfo(id, fieldsAppEventScreenshots, fieldsAppEventVideoClips, fieldsAppEventLocalizations, fieldsAppEvents, limit, limitAppEventScreenshots, limitAppEventVideoClips, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppEventScreenshots the fields to include for returned resources of type appEventScreenshots (optional)
   * @param fieldsAppEventVideoClips the fields to include for returned resources of type appEventVideoClips (optional)
   * @param fieldsAppEventLocalizations the fields to include for returned resources of type appEventLocalizations (optional)
   * @param fieldsAppEvents the fields to include for returned resources of type appEvents (optional)
   * @param limit maximum resources per page (optional)
   * @param limitAppEventScreenshots maximum number of related appEventScreenshots returned (when they are included) (optional)
   * @param limitAppEventVideoClips maximum number of related appEventVideoClips returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AppEventLocalizationsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppEventLocalizations </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppEventLocalizationsResponse> appEventsLocalizationsGetToManyRelatedWithHttpInfo(String id, List<String> fieldsAppEventScreenshots, List<String> fieldsAppEventVideoClips, List<String> fieldsAppEventLocalizations, List<String> fieldsAppEvents, Integer limit, Integer limitAppEventScreenshots, Integer limitAppEventVideoClips, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appEventsLocalizationsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/appEvents/{id}/localizations"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appEventScreenshots]", fieldsAppEventScreenshots)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appEventVideoClips]", fieldsAppEventVideoClips));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appEventLocalizations]", fieldsAppEventLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appEvents]", fieldsAppEvents));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appEventScreenshots]", limitAppEventScreenshots));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appEventVideoClips]", limitAppEventVideoClips));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppEventLocalizationsResponse> localVarReturnType = new GenericType<AppEventLocalizationsResponse>() {};
    return apiClient.invokeAPI("AppEventsApi.appEventsLocalizationsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appEventUpdateRequest AppEvent representation (required)
   * @return AppEventResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppEvent </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public AppEventResponse appEventsUpdateInstance(String id, AppEventUpdateRequest appEventUpdateRequest) throws ApiException {
    return appEventsUpdateInstanceWithHttpInfo(id, appEventUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appEventUpdateRequest AppEvent representation (required)
   * @return ApiResponse&lt;AppEventResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppEvent </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppEventResponse> appEventsUpdateInstanceWithHttpInfo(String id, AppEventUpdateRequest appEventUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appEventsUpdateInstance");
    }
    if (appEventUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appEventUpdateRequest' when calling appEventsUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appEvents/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppEventResponse> localVarReturnType = new GenericType<AppEventResponse>() {};
    return apiClient.invokeAPI("AppEventsApi.appEventsUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), appEventUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
