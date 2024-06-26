package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.AppStoreVersionExperimentCreateRequest;
import org.openapitools.client.model.AppStoreVersionExperimentResponse;
import org.openapitools.client.model.AppStoreVersionExperimentTreatmentsResponse;
import org.openapitools.client.model.AppStoreVersionExperimentUpdateRequest;
import org.openapitools.client.model.AppStoreVersionExperimentV2CreateRequest;
import org.openapitools.client.model.AppStoreVersionExperimentV2Response;
import org.openapitools.client.model.AppStoreVersionExperimentV2UpdateRequest;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppStoreVersionExperimentsApi {
  private ApiClient apiClient;

  public AppStoreVersionExperimentsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AppStoreVersionExperimentsApi(ApiClient apiClient) {
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
   * @param fieldsAppStoreVersionExperiments the fields to include for returned resources of type appStoreVersionExperiments (optional)
   * @param fieldsAppStoreVersionExperimentTreatments the fields to include for returned resources of type appStoreVersionExperimentTreatments (optional)
   * @param fieldsAppStoreVersionExperimentTreatmentLocalizations the fields to include for returned resources of type appStoreVersionExperimentTreatmentLocalizations (optional)
   * @param limit maximum resources per page (optional)
   * @param limitAppStoreVersionExperimentTreatmentLocalizations maximum number of related appStoreVersionExperimentTreatmentLocalizations returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AppStoreVersionExperimentTreatmentsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppStoreVersionExperimentTreatments </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public AppStoreVersionExperimentTreatmentsResponse appStoreVersionExperimentsAppStoreVersionExperimentTreatmentsGetToManyRelated(String id, List<String> fieldsAppStoreVersionExperiments, List<String> fieldsAppStoreVersionExperimentTreatments, List<String> fieldsAppStoreVersionExperimentTreatmentLocalizations, Integer limit, Integer limitAppStoreVersionExperimentTreatmentLocalizations, List<String> include) throws ApiException {
    return appStoreVersionExperimentsAppStoreVersionExperimentTreatmentsGetToManyRelatedWithHttpInfo(id, fieldsAppStoreVersionExperiments, fieldsAppStoreVersionExperimentTreatments, fieldsAppStoreVersionExperimentTreatmentLocalizations, limit, limitAppStoreVersionExperimentTreatmentLocalizations, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppStoreVersionExperiments the fields to include for returned resources of type appStoreVersionExperiments (optional)
   * @param fieldsAppStoreVersionExperimentTreatments the fields to include for returned resources of type appStoreVersionExperimentTreatments (optional)
   * @param fieldsAppStoreVersionExperimentTreatmentLocalizations the fields to include for returned resources of type appStoreVersionExperimentTreatmentLocalizations (optional)
   * @param limit maximum resources per page (optional)
   * @param limitAppStoreVersionExperimentTreatmentLocalizations maximum number of related appStoreVersionExperimentTreatmentLocalizations returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AppStoreVersionExperimentTreatmentsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppStoreVersionExperimentTreatments </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public ApiResponse<AppStoreVersionExperimentTreatmentsResponse> appStoreVersionExperimentsAppStoreVersionExperimentTreatmentsGetToManyRelatedWithHttpInfo(String id, List<String> fieldsAppStoreVersionExperiments, List<String> fieldsAppStoreVersionExperimentTreatments, List<String> fieldsAppStoreVersionExperimentTreatmentLocalizations, Integer limit, Integer limitAppStoreVersionExperimentTreatmentLocalizations, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appStoreVersionExperimentsAppStoreVersionExperimentTreatmentsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/appStoreVersionExperiments/{id}/appStoreVersionExperimentTreatments"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appStoreVersionExperiments]", fieldsAppStoreVersionExperiments)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersionExperimentTreatments]", fieldsAppStoreVersionExperimentTreatments));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersionExperimentTreatmentLocalizations]", fieldsAppStoreVersionExperimentTreatmentLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appStoreVersionExperimentTreatmentLocalizations]", limitAppStoreVersionExperimentTreatmentLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppStoreVersionExperimentTreatmentsResponse> localVarReturnType = new GenericType<AppStoreVersionExperimentTreatmentsResponse>() {};
    return apiClient.invokeAPI("AppStoreVersionExperimentsApi.appStoreVersionExperimentsAppStoreVersionExperimentTreatmentsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param appStoreVersionExperimentCreateRequest AppStoreVersionExperiment representation (required)
   * @return AppStoreVersionExperimentResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AppStoreVersionExperiment </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public AppStoreVersionExperimentResponse appStoreVersionExperimentsCreateInstance(AppStoreVersionExperimentCreateRequest appStoreVersionExperimentCreateRequest) throws ApiException {
    return appStoreVersionExperimentsCreateInstanceWithHttpInfo(appStoreVersionExperimentCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param appStoreVersionExperimentCreateRequest AppStoreVersionExperiment representation (required)
   * @return ApiResponse&lt;AppStoreVersionExperimentResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AppStoreVersionExperiment </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public ApiResponse<AppStoreVersionExperimentResponse> appStoreVersionExperimentsCreateInstanceWithHttpInfo(AppStoreVersionExperimentCreateRequest appStoreVersionExperimentCreateRequest) throws ApiException {
    // Check required parameters
    if (appStoreVersionExperimentCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appStoreVersionExperimentCreateRequest' when calling appStoreVersionExperimentsCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppStoreVersionExperimentResponse> localVarReturnType = new GenericType<AppStoreVersionExperimentResponse>() {};
    return apiClient.invokeAPI("AppStoreVersionExperimentsApi.appStoreVersionExperimentsCreateInstance", "/v1/appStoreVersionExperiments", "POST", new ArrayList<>(), appStoreVersionExperimentCreateRequest,
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
   * @deprecated
   */
  @Deprecated
  public void appStoreVersionExperimentsDeleteInstance(String id) throws ApiException {
    appStoreVersionExperimentsDeleteInstanceWithHttpInfo(id);
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
   * @deprecated
   */
  @Deprecated
  public ApiResponse<Void> appStoreVersionExperimentsDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appStoreVersionExperimentsDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appStoreVersionExperiments/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("AppStoreVersionExperimentsApi.appStoreVersionExperimentsDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppStoreVersionExperiments the fields to include for returned resources of type appStoreVersionExperiments (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsAppStoreVersionExperimentTreatments the fields to include for returned resources of type appStoreVersionExperimentTreatments (optional)
   * @param limitAppStoreVersionExperimentTreatments maximum number of related appStoreVersionExperimentTreatments returned (when they are included) (optional)
   * @return AppStoreVersionExperimentResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppStoreVersionExperiment </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public AppStoreVersionExperimentResponse appStoreVersionExperimentsGetInstance(String id, List<String> fieldsAppStoreVersionExperiments, List<String> include, List<String> fieldsAppStoreVersionExperimentTreatments, Integer limitAppStoreVersionExperimentTreatments) throws ApiException {
    return appStoreVersionExperimentsGetInstanceWithHttpInfo(id, fieldsAppStoreVersionExperiments, include, fieldsAppStoreVersionExperimentTreatments, limitAppStoreVersionExperimentTreatments).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppStoreVersionExperiments the fields to include for returned resources of type appStoreVersionExperiments (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsAppStoreVersionExperimentTreatments the fields to include for returned resources of type appStoreVersionExperimentTreatments (optional)
   * @param limitAppStoreVersionExperimentTreatments maximum number of related appStoreVersionExperimentTreatments returned (when they are included) (optional)
   * @return ApiResponse&lt;AppStoreVersionExperimentResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppStoreVersionExperiment </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public ApiResponse<AppStoreVersionExperimentResponse> appStoreVersionExperimentsGetInstanceWithHttpInfo(String id, List<String> fieldsAppStoreVersionExperiments, List<String> include, List<String> fieldsAppStoreVersionExperimentTreatments, Integer limitAppStoreVersionExperimentTreatments) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appStoreVersionExperimentsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appStoreVersionExperiments/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appStoreVersionExperiments]", fieldsAppStoreVersionExperiments)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersionExperimentTreatments]", fieldsAppStoreVersionExperimentTreatments));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appStoreVersionExperimentTreatments]", limitAppStoreVersionExperimentTreatments));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppStoreVersionExperimentResponse> localVarReturnType = new GenericType<AppStoreVersionExperimentResponse>() {};
    return apiClient.invokeAPI("AppStoreVersionExperimentsApi.appStoreVersionExperimentsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appStoreVersionExperimentUpdateRequest AppStoreVersionExperiment representation (required)
   * @return AppStoreVersionExperimentResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppStoreVersionExperiment </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public AppStoreVersionExperimentResponse appStoreVersionExperimentsUpdateInstance(String id, AppStoreVersionExperimentUpdateRequest appStoreVersionExperimentUpdateRequest) throws ApiException {
    return appStoreVersionExperimentsUpdateInstanceWithHttpInfo(id, appStoreVersionExperimentUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appStoreVersionExperimentUpdateRequest AppStoreVersionExperiment representation (required)
   * @return ApiResponse&lt;AppStoreVersionExperimentResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppStoreVersionExperiment </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public ApiResponse<AppStoreVersionExperimentResponse> appStoreVersionExperimentsUpdateInstanceWithHttpInfo(String id, AppStoreVersionExperimentUpdateRequest appStoreVersionExperimentUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appStoreVersionExperimentsUpdateInstance");
    }
    if (appStoreVersionExperimentUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appStoreVersionExperimentUpdateRequest' when calling appStoreVersionExperimentsUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appStoreVersionExperiments/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppStoreVersionExperimentResponse> localVarReturnType = new GenericType<AppStoreVersionExperimentResponse>() {};
    return apiClient.invokeAPI("AppStoreVersionExperimentsApi.appStoreVersionExperimentsUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), appStoreVersionExperimentUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppStoreVersionExperiments the fields to include for returned resources of type appStoreVersionExperiments (optional)
   * @param fieldsAppStoreVersionExperimentTreatments the fields to include for returned resources of type appStoreVersionExperimentTreatments (optional)
   * @param fieldsAppStoreVersionExperimentTreatmentLocalizations the fields to include for returned resources of type appStoreVersionExperimentTreatmentLocalizations (optional)
   * @param limit maximum resources per page (optional)
   * @param limitAppStoreVersionExperimentTreatmentLocalizations maximum number of related appStoreVersionExperimentTreatmentLocalizations returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AppStoreVersionExperimentTreatmentsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppStoreVersionExperimentTreatments </td><td>  -  </td></tr>
     </table>
   */
  public AppStoreVersionExperimentTreatmentsResponse appStoreVersionExperimentsV2AppStoreVersionExperimentTreatmentsGetToManyRelated(String id, List<String> fieldsAppStoreVersionExperiments, List<String> fieldsAppStoreVersionExperimentTreatments, List<String> fieldsAppStoreVersionExperimentTreatmentLocalizations, Integer limit, Integer limitAppStoreVersionExperimentTreatmentLocalizations, List<String> include) throws ApiException {
    return appStoreVersionExperimentsV2AppStoreVersionExperimentTreatmentsGetToManyRelatedWithHttpInfo(id, fieldsAppStoreVersionExperiments, fieldsAppStoreVersionExperimentTreatments, fieldsAppStoreVersionExperimentTreatmentLocalizations, limit, limitAppStoreVersionExperimentTreatmentLocalizations, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppStoreVersionExperiments the fields to include for returned resources of type appStoreVersionExperiments (optional)
   * @param fieldsAppStoreVersionExperimentTreatments the fields to include for returned resources of type appStoreVersionExperimentTreatments (optional)
   * @param fieldsAppStoreVersionExperimentTreatmentLocalizations the fields to include for returned resources of type appStoreVersionExperimentTreatmentLocalizations (optional)
   * @param limit maximum resources per page (optional)
   * @param limitAppStoreVersionExperimentTreatmentLocalizations maximum number of related appStoreVersionExperimentTreatmentLocalizations returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AppStoreVersionExperimentTreatmentsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppStoreVersionExperimentTreatments </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppStoreVersionExperimentTreatmentsResponse> appStoreVersionExperimentsV2AppStoreVersionExperimentTreatmentsGetToManyRelatedWithHttpInfo(String id, List<String> fieldsAppStoreVersionExperiments, List<String> fieldsAppStoreVersionExperimentTreatments, List<String> fieldsAppStoreVersionExperimentTreatmentLocalizations, Integer limit, Integer limitAppStoreVersionExperimentTreatmentLocalizations, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appStoreVersionExperimentsV2AppStoreVersionExperimentTreatmentsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v2/appStoreVersionExperiments/{id}/appStoreVersionExperimentTreatments"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appStoreVersionExperiments]", fieldsAppStoreVersionExperiments)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersionExperimentTreatments]", fieldsAppStoreVersionExperimentTreatments));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersionExperimentTreatmentLocalizations]", fieldsAppStoreVersionExperimentTreatmentLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appStoreVersionExperimentTreatmentLocalizations]", limitAppStoreVersionExperimentTreatmentLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppStoreVersionExperimentTreatmentsResponse> localVarReturnType = new GenericType<AppStoreVersionExperimentTreatmentsResponse>() {};
    return apiClient.invokeAPI("AppStoreVersionExperimentsApi.appStoreVersionExperimentsV2AppStoreVersionExperimentTreatmentsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param appStoreVersionExperimentV2CreateRequest AppStoreVersionExperiment representation (required)
   * @return AppStoreVersionExperimentV2Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AppStoreVersionExperiment </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public AppStoreVersionExperimentV2Response appStoreVersionExperimentsV2CreateInstance(AppStoreVersionExperimentV2CreateRequest appStoreVersionExperimentV2CreateRequest) throws ApiException {
    return appStoreVersionExperimentsV2CreateInstanceWithHttpInfo(appStoreVersionExperimentV2CreateRequest).getData();
  }

  /**
   * 
   * 
   * @param appStoreVersionExperimentV2CreateRequest AppStoreVersionExperiment representation (required)
   * @return ApiResponse&lt;AppStoreVersionExperimentV2Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AppStoreVersionExperiment </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppStoreVersionExperimentV2Response> appStoreVersionExperimentsV2CreateInstanceWithHttpInfo(AppStoreVersionExperimentV2CreateRequest appStoreVersionExperimentV2CreateRequest) throws ApiException {
    // Check required parameters
    if (appStoreVersionExperimentV2CreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appStoreVersionExperimentV2CreateRequest' when calling appStoreVersionExperimentsV2CreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppStoreVersionExperimentV2Response> localVarReturnType = new GenericType<AppStoreVersionExperimentV2Response>() {};
    return apiClient.invokeAPI("AppStoreVersionExperimentsApi.appStoreVersionExperimentsV2CreateInstance", "/v2/appStoreVersionExperiments", "POST", new ArrayList<>(), appStoreVersionExperimentV2CreateRequest,
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
  public void appStoreVersionExperimentsV2DeleteInstance(String id) throws ApiException {
    appStoreVersionExperimentsV2DeleteInstanceWithHttpInfo(id);
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
  public ApiResponse<Void> appStoreVersionExperimentsV2DeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appStoreVersionExperimentsV2DeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v2/appStoreVersionExperiments/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("AppStoreVersionExperimentsApi.appStoreVersionExperimentsV2DeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppStoreVersionExperiments the fields to include for returned resources of type appStoreVersionExperiments (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsAppStoreVersionExperimentTreatments the fields to include for returned resources of type appStoreVersionExperimentTreatments (optional)
   * @param limitAppStoreVersionExperimentTreatments maximum number of related appStoreVersionExperimentTreatments returned (when they are included) (optional)
   * @param limitControlVersions maximum number of related controlVersions returned (when they are included) (optional)
   * @return AppStoreVersionExperimentV2Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppStoreVersionExperiment </td><td>  -  </td></tr>
     </table>
   */
  public AppStoreVersionExperimentV2Response appStoreVersionExperimentsV2GetInstance(String id, List<String> fieldsAppStoreVersionExperiments, List<String> include, List<String> fieldsAppStoreVersionExperimentTreatments, Integer limitAppStoreVersionExperimentTreatments, Integer limitControlVersions) throws ApiException {
    return appStoreVersionExperimentsV2GetInstanceWithHttpInfo(id, fieldsAppStoreVersionExperiments, include, fieldsAppStoreVersionExperimentTreatments, limitAppStoreVersionExperimentTreatments, limitControlVersions).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppStoreVersionExperiments the fields to include for returned resources of type appStoreVersionExperiments (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsAppStoreVersionExperimentTreatments the fields to include for returned resources of type appStoreVersionExperimentTreatments (optional)
   * @param limitAppStoreVersionExperimentTreatments maximum number of related appStoreVersionExperimentTreatments returned (when they are included) (optional)
   * @param limitControlVersions maximum number of related controlVersions returned (when they are included) (optional)
   * @return ApiResponse&lt;AppStoreVersionExperimentV2Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppStoreVersionExperiment </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppStoreVersionExperimentV2Response> appStoreVersionExperimentsV2GetInstanceWithHttpInfo(String id, List<String> fieldsAppStoreVersionExperiments, List<String> include, List<String> fieldsAppStoreVersionExperimentTreatments, Integer limitAppStoreVersionExperimentTreatments, Integer limitControlVersions) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appStoreVersionExperimentsV2GetInstance");
    }

    // Path parameters
    String localVarPath = "/v2/appStoreVersionExperiments/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appStoreVersionExperiments]", fieldsAppStoreVersionExperiments)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersionExperimentTreatments]", fieldsAppStoreVersionExperimentTreatments));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appStoreVersionExperimentTreatments]", limitAppStoreVersionExperimentTreatments));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[controlVersions]", limitControlVersions));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppStoreVersionExperimentV2Response> localVarReturnType = new GenericType<AppStoreVersionExperimentV2Response>() {};
    return apiClient.invokeAPI("AppStoreVersionExperimentsApi.appStoreVersionExperimentsV2GetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appStoreVersionExperimentV2UpdateRequest AppStoreVersionExperiment representation (required)
   * @return AppStoreVersionExperimentV2Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppStoreVersionExperiment </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public AppStoreVersionExperimentV2Response appStoreVersionExperimentsV2UpdateInstance(String id, AppStoreVersionExperimentV2UpdateRequest appStoreVersionExperimentV2UpdateRequest) throws ApiException {
    return appStoreVersionExperimentsV2UpdateInstanceWithHttpInfo(id, appStoreVersionExperimentV2UpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appStoreVersionExperimentV2UpdateRequest AppStoreVersionExperiment representation (required)
   * @return ApiResponse&lt;AppStoreVersionExperimentV2Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppStoreVersionExperiment </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppStoreVersionExperimentV2Response> appStoreVersionExperimentsV2UpdateInstanceWithHttpInfo(String id, AppStoreVersionExperimentV2UpdateRequest appStoreVersionExperimentV2UpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appStoreVersionExperimentsV2UpdateInstance");
    }
    if (appStoreVersionExperimentV2UpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appStoreVersionExperimentV2UpdateRequest' when calling appStoreVersionExperimentsV2UpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v2/appStoreVersionExperiments/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppStoreVersionExperimentV2Response> localVarReturnType = new GenericType<AppStoreVersionExperimentV2Response>() {};
    return apiClient.invokeAPI("AppStoreVersionExperimentsApi.appStoreVersionExperimentsV2UpdateInstance", localVarPath, "PATCH", new ArrayList<>(), appStoreVersionExperimentV2UpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
