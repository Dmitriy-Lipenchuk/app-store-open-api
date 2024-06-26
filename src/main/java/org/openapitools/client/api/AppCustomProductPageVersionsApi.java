package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.AppCustomProductPageLocalizationsResponse;
import org.openapitools.client.model.AppCustomProductPageVersionCreateRequest;
import org.openapitools.client.model.AppCustomProductPageVersionResponse;
import org.openapitools.client.model.AppCustomProductPageVersionUpdateRequest;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppCustomProductPageVersionsApi {
  private ApiClient apiClient;

  public AppCustomProductPageVersionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AppCustomProductPageVersionsApi(ApiClient apiClient) {
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
   * @param filterLocale filter by attribute &#39;locale&#39; (optional)
   * @param fieldsAppScreenshotSets the fields to include for returned resources of type appScreenshotSets (optional)
   * @param fieldsAppCustomProductPageLocalizations the fields to include for returned resources of type appCustomProductPageLocalizations (optional)
   * @param fieldsAppCustomProductPageVersions the fields to include for returned resources of type appCustomProductPageVersions (optional)
   * @param fieldsAppPreviewSets the fields to include for returned resources of type appPreviewSets (optional)
   * @param limit maximum resources per page (optional)
   * @param limitAppScreenshotSets maximum number of related appScreenshotSets returned (when they are included) (optional)
   * @param limitAppPreviewSets maximum number of related appPreviewSets returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AppCustomProductPageLocalizationsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppCustomProductPageLocalizations </td><td>  -  </td></tr>
     </table>
   */
  public AppCustomProductPageLocalizationsResponse appCustomProductPageVersionsAppCustomProductPageLocalizationsGetToManyRelated(String id, List<String> filterLocale, List<String> fieldsAppScreenshotSets, List<String> fieldsAppCustomProductPageLocalizations, List<String> fieldsAppCustomProductPageVersions, List<String> fieldsAppPreviewSets, Integer limit, Integer limitAppScreenshotSets, Integer limitAppPreviewSets, List<String> include) throws ApiException {
    return appCustomProductPageVersionsAppCustomProductPageLocalizationsGetToManyRelatedWithHttpInfo(id, filterLocale, fieldsAppScreenshotSets, fieldsAppCustomProductPageLocalizations, fieldsAppCustomProductPageVersions, fieldsAppPreviewSets, limit, limitAppScreenshotSets, limitAppPreviewSets, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterLocale filter by attribute &#39;locale&#39; (optional)
   * @param fieldsAppScreenshotSets the fields to include for returned resources of type appScreenshotSets (optional)
   * @param fieldsAppCustomProductPageLocalizations the fields to include for returned resources of type appCustomProductPageLocalizations (optional)
   * @param fieldsAppCustomProductPageVersions the fields to include for returned resources of type appCustomProductPageVersions (optional)
   * @param fieldsAppPreviewSets the fields to include for returned resources of type appPreviewSets (optional)
   * @param limit maximum resources per page (optional)
   * @param limitAppScreenshotSets maximum number of related appScreenshotSets returned (when they are included) (optional)
   * @param limitAppPreviewSets maximum number of related appPreviewSets returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AppCustomProductPageLocalizationsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppCustomProductPageLocalizations </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppCustomProductPageLocalizationsResponse> appCustomProductPageVersionsAppCustomProductPageLocalizationsGetToManyRelatedWithHttpInfo(String id, List<String> filterLocale, List<String> fieldsAppScreenshotSets, List<String> fieldsAppCustomProductPageLocalizations, List<String> fieldsAppCustomProductPageVersions, List<String> fieldsAppPreviewSets, Integer limit, Integer limitAppScreenshotSets, Integer limitAppPreviewSets, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appCustomProductPageVersionsAppCustomProductPageLocalizationsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/appCustomProductPageVersions/{id}/appCustomProductPageLocalizations"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[locale]", filterLocale)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appScreenshotSets]", fieldsAppScreenshotSets));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appCustomProductPageLocalizations]", fieldsAppCustomProductPageLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appCustomProductPageVersions]", fieldsAppCustomProductPageVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appPreviewSets]", fieldsAppPreviewSets));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appScreenshotSets]", limitAppScreenshotSets));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appPreviewSets]", limitAppPreviewSets));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppCustomProductPageLocalizationsResponse> localVarReturnType = new GenericType<AppCustomProductPageLocalizationsResponse>() {};
    return apiClient.invokeAPI("AppCustomProductPageVersionsApi.appCustomProductPageVersionsAppCustomProductPageLocalizationsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param appCustomProductPageVersionCreateRequest AppCustomProductPageVersion representation (required)
   * @return AppCustomProductPageVersionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AppCustomProductPageVersion </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public AppCustomProductPageVersionResponse appCustomProductPageVersionsCreateInstance(AppCustomProductPageVersionCreateRequest appCustomProductPageVersionCreateRequest) throws ApiException {
    return appCustomProductPageVersionsCreateInstanceWithHttpInfo(appCustomProductPageVersionCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param appCustomProductPageVersionCreateRequest AppCustomProductPageVersion representation (required)
   * @return ApiResponse&lt;AppCustomProductPageVersionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AppCustomProductPageVersion </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppCustomProductPageVersionResponse> appCustomProductPageVersionsCreateInstanceWithHttpInfo(AppCustomProductPageVersionCreateRequest appCustomProductPageVersionCreateRequest) throws ApiException {
    // Check required parameters
    if (appCustomProductPageVersionCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appCustomProductPageVersionCreateRequest' when calling appCustomProductPageVersionsCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppCustomProductPageVersionResponse> localVarReturnType = new GenericType<AppCustomProductPageVersionResponse>() {};
    return apiClient.invokeAPI("AppCustomProductPageVersionsApi.appCustomProductPageVersionsCreateInstance", "/v1/appCustomProductPageVersions", "POST", new ArrayList<>(), appCustomProductPageVersionCreateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppCustomProductPageVersions the fields to include for returned resources of type appCustomProductPageVersions (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsAppCustomProductPageLocalizations the fields to include for returned resources of type appCustomProductPageLocalizations (optional)
   * @param limitAppCustomProductPageLocalizations maximum number of related appCustomProductPageLocalizations returned (when they are included) (optional)
   * @return AppCustomProductPageVersionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppCustomProductPageVersion </td><td>  -  </td></tr>
     </table>
   */
  public AppCustomProductPageVersionResponse appCustomProductPageVersionsGetInstance(String id, List<String> fieldsAppCustomProductPageVersions, List<String> include, List<String> fieldsAppCustomProductPageLocalizations, Integer limitAppCustomProductPageLocalizations) throws ApiException {
    return appCustomProductPageVersionsGetInstanceWithHttpInfo(id, fieldsAppCustomProductPageVersions, include, fieldsAppCustomProductPageLocalizations, limitAppCustomProductPageLocalizations).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppCustomProductPageVersions the fields to include for returned resources of type appCustomProductPageVersions (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsAppCustomProductPageLocalizations the fields to include for returned resources of type appCustomProductPageLocalizations (optional)
   * @param limitAppCustomProductPageLocalizations maximum number of related appCustomProductPageLocalizations returned (when they are included) (optional)
   * @return ApiResponse&lt;AppCustomProductPageVersionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppCustomProductPageVersion </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppCustomProductPageVersionResponse> appCustomProductPageVersionsGetInstanceWithHttpInfo(String id, List<String> fieldsAppCustomProductPageVersions, List<String> include, List<String> fieldsAppCustomProductPageLocalizations, Integer limitAppCustomProductPageLocalizations) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appCustomProductPageVersionsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appCustomProductPageVersions/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appCustomProductPageVersions]", fieldsAppCustomProductPageVersions)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appCustomProductPageLocalizations]", fieldsAppCustomProductPageLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appCustomProductPageLocalizations]", limitAppCustomProductPageLocalizations));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppCustomProductPageVersionResponse> localVarReturnType = new GenericType<AppCustomProductPageVersionResponse>() {};
    return apiClient.invokeAPI("AppCustomProductPageVersionsApi.appCustomProductPageVersionsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appCustomProductPageVersionUpdateRequest AppCustomProductPageVersion representation (required)
   * @return AppCustomProductPageVersionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppCustomProductPageVersion </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public AppCustomProductPageVersionResponse appCustomProductPageVersionsUpdateInstance(String id, AppCustomProductPageVersionUpdateRequest appCustomProductPageVersionUpdateRequest) throws ApiException {
    return appCustomProductPageVersionsUpdateInstanceWithHttpInfo(id, appCustomProductPageVersionUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appCustomProductPageVersionUpdateRequest AppCustomProductPageVersion representation (required)
   * @return ApiResponse&lt;AppCustomProductPageVersionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppCustomProductPageVersion </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppCustomProductPageVersionResponse> appCustomProductPageVersionsUpdateInstanceWithHttpInfo(String id, AppCustomProductPageVersionUpdateRequest appCustomProductPageVersionUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appCustomProductPageVersionsUpdateInstance");
    }
    if (appCustomProductPageVersionUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appCustomProductPageVersionUpdateRequest' when calling appCustomProductPageVersionsUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appCustomProductPageVersions/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppCustomProductPageVersionResponse> localVarReturnType = new GenericType<AppCustomProductPageVersionResponse>() {};
    return apiClient.invokeAPI("AppCustomProductPageVersionsApi.appCustomProductPageVersionsUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), appCustomProductPageVersionUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
