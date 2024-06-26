package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.AppCustomProductPageLocalizationCreateRequest;
import org.openapitools.client.model.AppCustomProductPageLocalizationResponse;
import org.openapitools.client.model.AppCustomProductPageLocalizationUpdateRequest;
import org.openapitools.client.model.AppPreviewSetsResponse;
import org.openapitools.client.model.AppScreenshotSetsResponse;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppCustomProductPageLocalizationsApi {
  private ApiClient apiClient;

  public AppCustomProductPageLocalizationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AppCustomProductPageLocalizationsApi(ApiClient apiClient) {
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
   * @param filterPreviewType filter by attribute &#39;previewType&#39; (optional)
   * @param filterAppStoreVersionExperimentTreatmentLocalization filter by id(s) of related &#39;appStoreVersionExperimentTreatmentLocalization&#39; (optional)
   * @param filterAppStoreVersionLocalization filter by id(s) of related &#39;appStoreVersionLocalization&#39; (optional)
   * @param fieldsAppCustomProductPageLocalizations the fields to include for returned resources of type appCustomProductPageLocalizations (optional)
   * @param fieldsAppStoreVersionExperimentTreatmentLocalizations the fields to include for returned resources of type appStoreVersionExperimentTreatmentLocalizations (optional)
   * @param fieldsAppPreviews the fields to include for returned resources of type appPreviews (optional)
   * @param fieldsAppPreviewSets the fields to include for returned resources of type appPreviewSets (optional)
   * @param fieldsAppStoreVersionLocalizations the fields to include for returned resources of type appStoreVersionLocalizations (optional)
   * @param limit maximum resources per page (optional)
   * @param limitAppPreviews maximum number of related appPreviews returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AppPreviewSetsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppPreviewSets </td><td>  -  </td></tr>
     </table>
   */
  public AppPreviewSetsResponse appCustomProductPageLocalizationsAppPreviewSetsGetToManyRelated(String id, List<String> filterPreviewType, List<String> filterAppStoreVersionExperimentTreatmentLocalization, List<String> filterAppStoreVersionLocalization, List<String> fieldsAppCustomProductPageLocalizations, List<String> fieldsAppStoreVersionExperimentTreatmentLocalizations, List<String> fieldsAppPreviews, List<String> fieldsAppPreviewSets, List<String> fieldsAppStoreVersionLocalizations, Integer limit, Integer limitAppPreviews, List<String> include) throws ApiException {
    return appCustomProductPageLocalizationsAppPreviewSetsGetToManyRelatedWithHttpInfo(id, filterPreviewType, filterAppStoreVersionExperimentTreatmentLocalization, filterAppStoreVersionLocalization, fieldsAppCustomProductPageLocalizations, fieldsAppStoreVersionExperimentTreatmentLocalizations, fieldsAppPreviews, fieldsAppPreviewSets, fieldsAppStoreVersionLocalizations, limit, limitAppPreviews, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterPreviewType filter by attribute &#39;previewType&#39; (optional)
   * @param filterAppStoreVersionExperimentTreatmentLocalization filter by id(s) of related &#39;appStoreVersionExperimentTreatmentLocalization&#39; (optional)
   * @param filterAppStoreVersionLocalization filter by id(s) of related &#39;appStoreVersionLocalization&#39; (optional)
   * @param fieldsAppCustomProductPageLocalizations the fields to include for returned resources of type appCustomProductPageLocalizations (optional)
   * @param fieldsAppStoreVersionExperimentTreatmentLocalizations the fields to include for returned resources of type appStoreVersionExperimentTreatmentLocalizations (optional)
   * @param fieldsAppPreviews the fields to include for returned resources of type appPreviews (optional)
   * @param fieldsAppPreviewSets the fields to include for returned resources of type appPreviewSets (optional)
   * @param fieldsAppStoreVersionLocalizations the fields to include for returned resources of type appStoreVersionLocalizations (optional)
   * @param limit maximum resources per page (optional)
   * @param limitAppPreviews maximum number of related appPreviews returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AppPreviewSetsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppPreviewSets </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppPreviewSetsResponse> appCustomProductPageLocalizationsAppPreviewSetsGetToManyRelatedWithHttpInfo(String id, List<String> filterPreviewType, List<String> filterAppStoreVersionExperimentTreatmentLocalization, List<String> filterAppStoreVersionLocalization, List<String> fieldsAppCustomProductPageLocalizations, List<String> fieldsAppStoreVersionExperimentTreatmentLocalizations, List<String> fieldsAppPreviews, List<String> fieldsAppPreviewSets, List<String> fieldsAppStoreVersionLocalizations, Integer limit, Integer limitAppPreviews, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appCustomProductPageLocalizationsAppPreviewSetsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/appCustomProductPageLocalizations/{id}/appPreviewSets"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[previewType]", filterPreviewType)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[appStoreVersionExperimentTreatmentLocalization]", filterAppStoreVersionExperimentTreatmentLocalization));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[appStoreVersionLocalization]", filterAppStoreVersionLocalization));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appCustomProductPageLocalizations]", fieldsAppCustomProductPageLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersionExperimentTreatmentLocalizations]", fieldsAppStoreVersionExperimentTreatmentLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appPreviews]", fieldsAppPreviews));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appPreviewSets]", fieldsAppPreviewSets));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersionLocalizations]", fieldsAppStoreVersionLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appPreviews]", limitAppPreviews));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppPreviewSetsResponse> localVarReturnType = new GenericType<AppPreviewSetsResponse>() {};
    return apiClient.invokeAPI("AppCustomProductPageLocalizationsApi.appCustomProductPageLocalizationsAppPreviewSetsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterScreenshotDisplayType filter by attribute &#39;screenshotDisplayType&#39; (optional)
   * @param filterAppStoreVersionExperimentTreatmentLocalization filter by id(s) of related &#39;appStoreVersionExperimentTreatmentLocalization&#39; (optional)
   * @param filterAppStoreVersionLocalization filter by id(s) of related &#39;appStoreVersionLocalization&#39; (optional)
   * @param fieldsAppScreenshotSets the fields to include for returned resources of type appScreenshotSets (optional)
   * @param fieldsAppCustomProductPageLocalizations the fields to include for returned resources of type appCustomProductPageLocalizations (optional)
   * @param fieldsAppStoreVersionExperimentTreatmentLocalizations the fields to include for returned resources of type appStoreVersionExperimentTreatmentLocalizations (optional)
   * @param fieldsAppScreenshots the fields to include for returned resources of type appScreenshots (optional)
   * @param fieldsAppStoreVersionLocalizations the fields to include for returned resources of type appStoreVersionLocalizations (optional)
   * @param limit maximum resources per page (optional)
   * @param limitAppScreenshots maximum number of related appScreenshots returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AppScreenshotSetsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppScreenshotSets </td><td>  -  </td></tr>
     </table>
   */
  public AppScreenshotSetsResponse appCustomProductPageLocalizationsAppScreenshotSetsGetToManyRelated(String id, List<String> filterScreenshotDisplayType, List<String> filterAppStoreVersionExperimentTreatmentLocalization, List<String> filterAppStoreVersionLocalization, List<String> fieldsAppScreenshotSets, List<String> fieldsAppCustomProductPageLocalizations, List<String> fieldsAppStoreVersionExperimentTreatmentLocalizations, List<String> fieldsAppScreenshots, List<String> fieldsAppStoreVersionLocalizations, Integer limit, Integer limitAppScreenshots, List<String> include) throws ApiException {
    return appCustomProductPageLocalizationsAppScreenshotSetsGetToManyRelatedWithHttpInfo(id, filterScreenshotDisplayType, filterAppStoreVersionExperimentTreatmentLocalization, filterAppStoreVersionLocalization, fieldsAppScreenshotSets, fieldsAppCustomProductPageLocalizations, fieldsAppStoreVersionExperimentTreatmentLocalizations, fieldsAppScreenshots, fieldsAppStoreVersionLocalizations, limit, limitAppScreenshots, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterScreenshotDisplayType filter by attribute &#39;screenshotDisplayType&#39; (optional)
   * @param filterAppStoreVersionExperimentTreatmentLocalization filter by id(s) of related &#39;appStoreVersionExperimentTreatmentLocalization&#39; (optional)
   * @param filterAppStoreVersionLocalization filter by id(s) of related &#39;appStoreVersionLocalization&#39; (optional)
   * @param fieldsAppScreenshotSets the fields to include for returned resources of type appScreenshotSets (optional)
   * @param fieldsAppCustomProductPageLocalizations the fields to include for returned resources of type appCustomProductPageLocalizations (optional)
   * @param fieldsAppStoreVersionExperimentTreatmentLocalizations the fields to include for returned resources of type appStoreVersionExperimentTreatmentLocalizations (optional)
   * @param fieldsAppScreenshots the fields to include for returned resources of type appScreenshots (optional)
   * @param fieldsAppStoreVersionLocalizations the fields to include for returned resources of type appStoreVersionLocalizations (optional)
   * @param limit maximum resources per page (optional)
   * @param limitAppScreenshots maximum number of related appScreenshots returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AppScreenshotSetsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppScreenshotSets </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppScreenshotSetsResponse> appCustomProductPageLocalizationsAppScreenshotSetsGetToManyRelatedWithHttpInfo(String id, List<String> filterScreenshotDisplayType, List<String> filterAppStoreVersionExperimentTreatmentLocalization, List<String> filterAppStoreVersionLocalization, List<String> fieldsAppScreenshotSets, List<String> fieldsAppCustomProductPageLocalizations, List<String> fieldsAppStoreVersionExperimentTreatmentLocalizations, List<String> fieldsAppScreenshots, List<String> fieldsAppStoreVersionLocalizations, Integer limit, Integer limitAppScreenshots, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appCustomProductPageLocalizationsAppScreenshotSetsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/appCustomProductPageLocalizations/{id}/appScreenshotSets"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[screenshotDisplayType]", filterScreenshotDisplayType)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[appStoreVersionExperimentTreatmentLocalization]", filterAppStoreVersionExperimentTreatmentLocalization));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[appStoreVersionLocalization]", filterAppStoreVersionLocalization));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appScreenshotSets]", fieldsAppScreenshotSets));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appCustomProductPageLocalizations]", fieldsAppCustomProductPageLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersionExperimentTreatmentLocalizations]", fieldsAppStoreVersionExperimentTreatmentLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appScreenshots]", fieldsAppScreenshots));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersionLocalizations]", fieldsAppStoreVersionLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appScreenshots]", limitAppScreenshots));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppScreenshotSetsResponse> localVarReturnType = new GenericType<AppScreenshotSetsResponse>() {};
    return apiClient.invokeAPI("AppCustomProductPageLocalizationsApi.appCustomProductPageLocalizationsAppScreenshotSetsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param appCustomProductPageLocalizationCreateRequest AppCustomProductPageLocalization representation (required)
   * @return AppCustomProductPageLocalizationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AppCustomProductPageLocalization </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public AppCustomProductPageLocalizationResponse appCustomProductPageLocalizationsCreateInstance(AppCustomProductPageLocalizationCreateRequest appCustomProductPageLocalizationCreateRequest) throws ApiException {
    return appCustomProductPageLocalizationsCreateInstanceWithHttpInfo(appCustomProductPageLocalizationCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param appCustomProductPageLocalizationCreateRequest AppCustomProductPageLocalization representation (required)
   * @return ApiResponse&lt;AppCustomProductPageLocalizationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AppCustomProductPageLocalization </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppCustomProductPageLocalizationResponse> appCustomProductPageLocalizationsCreateInstanceWithHttpInfo(AppCustomProductPageLocalizationCreateRequest appCustomProductPageLocalizationCreateRequest) throws ApiException {
    // Check required parameters
    if (appCustomProductPageLocalizationCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appCustomProductPageLocalizationCreateRequest' when calling appCustomProductPageLocalizationsCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppCustomProductPageLocalizationResponse> localVarReturnType = new GenericType<AppCustomProductPageLocalizationResponse>() {};
    return apiClient.invokeAPI("AppCustomProductPageLocalizationsApi.appCustomProductPageLocalizationsCreateInstance", "/v1/appCustomProductPageLocalizations", "POST", new ArrayList<>(), appCustomProductPageLocalizationCreateRequest,
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
  public void appCustomProductPageLocalizationsDeleteInstance(String id) throws ApiException {
    appCustomProductPageLocalizationsDeleteInstanceWithHttpInfo(id);
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
  public ApiResponse<Void> appCustomProductPageLocalizationsDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appCustomProductPageLocalizationsDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appCustomProductPageLocalizations/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("AppCustomProductPageLocalizationsApi.appCustomProductPageLocalizationsDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppCustomProductPageLocalizations the fields to include for returned resources of type appCustomProductPageLocalizations (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsAppScreenshotSets the fields to include for returned resources of type appScreenshotSets (optional)
   * @param fieldsAppPreviewSets the fields to include for returned resources of type appPreviewSets (optional)
   * @param limitAppPreviewSets maximum number of related appPreviewSets returned (when they are included) (optional)
   * @param limitAppScreenshotSets maximum number of related appScreenshotSets returned (when they are included) (optional)
   * @return AppCustomProductPageLocalizationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppCustomProductPageLocalization </td><td>  -  </td></tr>
     </table>
   */
  public AppCustomProductPageLocalizationResponse appCustomProductPageLocalizationsGetInstance(String id, List<String> fieldsAppCustomProductPageLocalizations, List<String> include, List<String> fieldsAppScreenshotSets, List<String> fieldsAppPreviewSets, Integer limitAppPreviewSets, Integer limitAppScreenshotSets) throws ApiException {
    return appCustomProductPageLocalizationsGetInstanceWithHttpInfo(id, fieldsAppCustomProductPageLocalizations, include, fieldsAppScreenshotSets, fieldsAppPreviewSets, limitAppPreviewSets, limitAppScreenshotSets).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppCustomProductPageLocalizations the fields to include for returned resources of type appCustomProductPageLocalizations (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsAppScreenshotSets the fields to include for returned resources of type appScreenshotSets (optional)
   * @param fieldsAppPreviewSets the fields to include for returned resources of type appPreviewSets (optional)
   * @param limitAppPreviewSets maximum number of related appPreviewSets returned (when they are included) (optional)
   * @param limitAppScreenshotSets maximum number of related appScreenshotSets returned (when they are included) (optional)
   * @return ApiResponse&lt;AppCustomProductPageLocalizationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppCustomProductPageLocalization </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppCustomProductPageLocalizationResponse> appCustomProductPageLocalizationsGetInstanceWithHttpInfo(String id, List<String> fieldsAppCustomProductPageLocalizations, List<String> include, List<String> fieldsAppScreenshotSets, List<String> fieldsAppPreviewSets, Integer limitAppPreviewSets, Integer limitAppScreenshotSets) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appCustomProductPageLocalizationsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appCustomProductPageLocalizations/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appCustomProductPageLocalizations]", fieldsAppCustomProductPageLocalizations)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appScreenshotSets]", fieldsAppScreenshotSets));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appPreviewSets]", fieldsAppPreviewSets));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appPreviewSets]", limitAppPreviewSets));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appScreenshotSets]", limitAppScreenshotSets));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppCustomProductPageLocalizationResponse> localVarReturnType = new GenericType<AppCustomProductPageLocalizationResponse>() {};
    return apiClient.invokeAPI("AppCustomProductPageLocalizationsApi.appCustomProductPageLocalizationsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appCustomProductPageLocalizationUpdateRequest AppCustomProductPageLocalization representation (required)
   * @return AppCustomProductPageLocalizationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppCustomProductPageLocalization </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public AppCustomProductPageLocalizationResponse appCustomProductPageLocalizationsUpdateInstance(String id, AppCustomProductPageLocalizationUpdateRequest appCustomProductPageLocalizationUpdateRequest) throws ApiException {
    return appCustomProductPageLocalizationsUpdateInstanceWithHttpInfo(id, appCustomProductPageLocalizationUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appCustomProductPageLocalizationUpdateRequest AppCustomProductPageLocalization representation (required)
   * @return ApiResponse&lt;AppCustomProductPageLocalizationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppCustomProductPageLocalization </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppCustomProductPageLocalizationResponse> appCustomProductPageLocalizationsUpdateInstanceWithHttpInfo(String id, AppCustomProductPageLocalizationUpdateRequest appCustomProductPageLocalizationUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appCustomProductPageLocalizationsUpdateInstance");
    }
    if (appCustomProductPageLocalizationUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appCustomProductPageLocalizationUpdateRequest' when calling appCustomProductPageLocalizationsUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appCustomProductPageLocalizations/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppCustomProductPageLocalizationResponse> localVarReturnType = new GenericType<AppCustomProductPageLocalizationResponse>() {};
    return apiClient.invokeAPI("AppCustomProductPageLocalizationsApi.appCustomProductPageLocalizationsUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), appCustomProductPageLocalizationUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
