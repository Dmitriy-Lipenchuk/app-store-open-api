package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.AppPreviewSetsResponse;
import org.openapitools.client.model.AppScreenshotSetsResponse;
import org.openapitools.client.model.AppStoreVersionLocalizationCreateRequest;
import org.openapitools.client.model.AppStoreVersionLocalizationResponse;
import org.openapitools.client.model.AppStoreVersionLocalizationUpdateRequest;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppStoreVersionLocalizationsApi {
  private ApiClient apiClient;

  public AppStoreVersionLocalizationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AppStoreVersionLocalizationsApi(ApiClient apiClient) {
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
   * @param filterAppCustomProductPageLocalization filter by id(s) of related &#39;appCustomProductPageLocalization&#39; (optional)
   * @param filterAppStoreVersionExperimentTreatmentLocalization filter by id(s) of related &#39;appStoreVersionExperimentTreatmentLocalization&#39; (optional)
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
  public AppPreviewSetsResponse appStoreVersionLocalizationsAppPreviewSetsGetToManyRelated(String id, List<String> filterPreviewType, List<String> filterAppCustomProductPageLocalization, List<String> filterAppStoreVersionExperimentTreatmentLocalization, List<String> fieldsAppCustomProductPageLocalizations, List<String> fieldsAppStoreVersionExperimentTreatmentLocalizations, List<String> fieldsAppPreviews, List<String> fieldsAppPreviewSets, List<String> fieldsAppStoreVersionLocalizations, Integer limit, Integer limitAppPreviews, List<String> include) throws ApiException {
    return appStoreVersionLocalizationsAppPreviewSetsGetToManyRelatedWithHttpInfo(id, filterPreviewType, filterAppCustomProductPageLocalization, filterAppStoreVersionExperimentTreatmentLocalization, fieldsAppCustomProductPageLocalizations, fieldsAppStoreVersionExperimentTreatmentLocalizations, fieldsAppPreviews, fieldsAppPreviewSets, fieldsAppStoreVersionLocalizations, limit, limitAppPreviews, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterPreviewType filter by attribute &#39;previewType&#39; (optional)
   * @param filterAppCustomProductPageLocalization filter by id(s) of related &#39;appCustomProductPageLocalization&#39; (optional)
   * @param filterAppStoreVersionExperimentTreatmentLocalization filter by id(s) of related &#39;appStoreVersionExperimentTreatmentLocalization&#39; (optional)
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
  public ApiResponse<AppPreviewSetsResponse> appStoreVersionLocalizationsAppPreviewSetsGetToManyRelatedWithHttpInfo(String id, List<String> filterPreviewType, List<String> filterAppCustomProductPageLocalization, List<String> filterAppStoreVersionExperimentTreatmentLocalization, List<String> fieldsAppCustomProductPageLocalizations, List<String> fieldsAppStoreVersionExperimentTreatmentLocalizations, List<String> fieldsAppPreviews, List<String> fieldsAppPreviewSets, List<String> fieldsAppStoreVersionLocalizations, Integer limit, Integer limitAppPreviews, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appStoreVersionLocalizationsAppPreviewSetsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/appStoreVersionLocalizations/{id}/appPreviewSets"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[previewType]", filterPreviewType)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[appCustomProductPageLocalization]", filterAppCustomProductPageLocalization));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[appStoreVersionExperimentTreatmentLocalization]", filterAppStoreVersionExperimentTreatmentLocalization));
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
    return apiClient.invokeAPI("AppStoreVersionLocalizationsApi.appStoreVersionLocalizationsAppPreviewSetsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterScreenshotDisplayType filter by attribute &#39;screenshotDisplayType&#39; (optional)
   * @param filterAppCustomProductPageLocalization filter by id(s) of related &#39;appCustomProductPageLocalization&#39; (optional)
   * @param filterAppStoreVersionExperimentTreatmentLocalization filter by id(s) of related &#39;appStoreVersionExperimentTreatmentLocalization&#39; (optional)
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
  public AppScreenshotSetsResponse appStoreVersionLocalizationsAppScreenshotSetsGetToManyRelated(String id, List<String> filterScreenshotDisplayType, List<String> filterAppCustomProductPageLocalization, List<String> filterAppStoreVersionExperimentTreatmentLocalization, List<String> fieldsAppScreenshotSets, List<String> fieldsAppCustomProductPageLocalizations, List<String> fieldsAppStoreVersionExperimentTreatmentLocalizations, List<String> fieldsAppScreenshots, List<String> fieldsAppStoreVersionLocalizations, Integer limit, Integer limitAppScreenshots, List<String> include) throws ApiException {
    return appStoreVersionLocalizationsAppScreenshotSetsGetToManyRelatedWithHttpInfo(id, filterScreenshotDisplayType, filterAppCustomProductPageLocalization, filterAppStoreVersionExperimentTreatmentLocalization, fieldsAppScreenshotSets, fieldsAppCustomProductPageLocalizations, fieldsAppStoreVersionExperimentTreatmentLocalizations, fieldsAppScreenshots, fieldsAppStoreVersionLocalizations, limit, limitAppScreenshots, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterScreenshotDisplayType filter by attribute &#39;screenshotDisplayType&#39; (optional)
   * @param filterAppCustomProductPageLocalization filter by id(s) of related &#39;appCustomProductPageLocalization&#39; (optional)
   * @param filterAppStoreVersionExperimentTreatmentLocalization filter by id(s) of related &#39;appStoreVersionExperimentTreatmentLocalization&#39; (optional)
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
  public ApiResponse<AppScreenshotSetsResponse> appStoreVersionLocalizationsAppScreenshotSetsGetToManyRelatedWithHttpInfo(String id, List<String> filterScreenshotDisplayType, List<String> filterAppCustomProductPageLocalization, List<String> filterAppStoreVersionExperimentTreatmentLocalization, List<String> fieldsAppScreenshotSets, List<String> fieldsAppCustomProductPageLocalizations, List<String> fieldsAppStoreVersionExperimentTreatmentLocalizations, List<String> fieldsAppScreenshots, List<String> fieldsAppStoreVersionLocalizations, Integer limit, Integer limitAppScreenshots, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appStoreVersionLocalizationsAppScreenshotSetsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/appStoreVersionLocalizations/{id}/appScreenshotSets"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[screenshotDisplayType]", filterScreenshotDisplayType)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[appCustomProductPageLocalization]", filterAppCustomProductPageLocalization));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[appStoreVersionExperimentTreatmentLocalization]", filterAppStoreVersionExperimentTreatmentLocalization));
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
    return apiClient.invokeAPI("AppStoreVersionLocalizationsApi.appStoreVersionLocalizationsAppScreenshotSetsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param appStoreVersionLocalizationCreateRequest AppStoreVersionLocalization representation (required)
   * @return AppStoreVersionLocalizationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AppStoreVersionLocalization </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public AppStoreVersionLocalizationResponse appStoreVersionLocalizationsCreateInstance(AppStoreVersionLocalizationCreateRequest appStoreVersionLocalizationCreateRequest) throws ApiException {
    return appStoreVersionLocalizationsCreateInstanceWithHttpInfo(appStoreVersionLocalizationCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param appStoreVersionLocalizationCreateRequest AppStoreVersionLocalization representation (required)
   * @return ApiResponse&lt;AppStoreVersionLocalizationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AppStoreVersionLocalization </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppStoreVersionLocalizationResponse> appStoreVersionLocalizationsCreateInstanceWithHttpInfo(AppStoreVersionLocalizationCreateRequest appStoreVersionLocalizationCreateRequest) throws ApiException {
    // Check required parameters
    if (appStoreVersionLocalizationCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appStoreVersionLocalizationCreateRequest' when calling appStoreVersionLocalizationsCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppStoreVersionLocalizationResponse> localVarReturnType = new GenericType<AppStoreVersionLocalizationResponse>() {};
    return apiClient.invokeAPI("AppStoreVersionLocalizationsApi.appStoreVersionLocalizationsCreateInstance", "/v1/appStoreVersionLocalizations", "POST", new ArrayList<>(), appStoreVersionLocalizationCreateRequest,
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
  public void appStoreVersionLocalizationsDeleteInstance(String id) throws ApiException {
    appStoreVersionLocalizationsDeleteInstanceWithHttpInfo(id);
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
  public ApiResponse<Void> appStoreVersionLocalizationsDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appStoreVersionLocalizationsDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appStoreVersionLocalizations/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("AppStoreVersionLocalizationsApi.appStoreVersionLocalizationsDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppStoreVersionLocalizations the fields to include for returned resources of type appStoreVersionLocalizations (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsAppScreenshotSets the fields to include for returned resources of type appScreenshotSets (optional)
   * @param fieldsAppPreviewSets the fields to include for returned resources of type appPreviewSets (optional)
   * @param limitAppPreviewSets maximum number of related appPreviewSets returned (when they are included) (optional)
   * @param limitAppScreenshotSets maximum number of related appScreenshotSets returned (when they are included) (optional)
   * @return AppStoreVersionLocalizationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppStoreVersionLocalization </td><td>  -  </td></tr>
     </table>
   */
  public AppStoreVersionLocalizationResponse appStoreVersionLocalizationsGetInstance(String id, List<String> fieldsAppStoreVersionLocalizations, List<String> include, List<String> fieldsAppScreenshotSets, List<String> fieldsAppPreviewSets, Integer limitAppPreviewSets, Integer limitAppScreenshotSets) throws ApiException {
    return appStoreVersionLocalizationsGetInstanceWithHttpInfo(id, fieldsAppStoreVersionLocalizations, include, fieldsAppScreenshotSets, fieldsAppPreviewSets, limitAppPreviewSets, limitAppScreenshotSets).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppStoreVersionLocalizations the fields to include for returned resources of type appStoreVersionLocalizations (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsAppScreenshotSets the fields to include for returned resources of type appScreenshotSets (optional)
   * @param fieldsAppPreviewSets the fields to include for returned resources of type appPreviewSets (optional)
   * @param limitAppPreviewSets maximum number of related appPreviewSets returned (when they are included) (optional)
   * @param limitAppScreenshotSets maximum number of related appScreenshotSets returned (when they are included) (optional)
   * @return ApiResponse&lt;AppStoreVersionLocalizationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppStoreVersionLocalization </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppStoreVersionLocalizationResponse> appStoreVersionLocalizationsGetInstanceWithHttpInfo(String id, List<String> fieldsAppStoreVersionLocalizations, List<String> include, List<String> fieldsAppScreenshotSets, List<String> fieldsAppPreviewSets, Integer limitAppPreviewSets, Integer limitAppScreenshotSets) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appStoreVersionLocalizationsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appStoreVersionLocalizations/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appStoreVersionLocalizations]", fieldsAppStoreVersionLocalizations)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appScreenshotSets]", fieldsAppScreenshotSets));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appPreviewSets]", fieldsAppPreviewSets));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appPreviewSets]", limitAppPreviewSets));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appScreenshotSets]", limitAppScreenshotSets));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppStoreVersionLocalizationResponse> localVarReturnType = new GenericType<AppStoreVersionLocalizationResponse>() {};
    return apiClient.invokeAPI("AppStoreVersionLocalizationsApi.appStoreVersionLocalizationsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appStoreVersionLocalizationUpdateRequest AppStoreVersionLocalization representation (required)
   * @return AppStoreVersionLocalizationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppStoreVersionLocalization </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public AppStoreVersionLocalizationResponse appStoreVersionLocalizationsUpdateInstance(String id, AppStoreVersionLocalizationUpdateRequest appStoreVersionLocalizationUpdateRequest) throws ApiException {
    return appStoreVersionLocalizationsUpdateInstanceWithHttpInfo(id, appStoreVersionLocalizationUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appStoreVersionLocalizationUpdateRequest AppStoreVersionLocalization representation (required)
   * @return ApiResponse&lt;AppStoreVersionLocalizationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppStoreVersionLocalization </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppStoreVersionLocalizationResponse> appStoreVersionLocalizationsUpdateInstanceWithHttpInfo(String id, AppStoreVersionLocalizationUpdateRequest appStoreVersionLocalizationUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appStoreVersionLocalizationsUpdateInstance");
    }
    if (appStoreVersionLocalizationUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appStoreVersionLocalizationUpdateRequest' when calling appStoreVersionLocalizationsUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appStoreVersionLocalizations/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppStoreVersionLocalizationResponse> localVarReturnType = new GenericType<AppStoreVersionLocalizationResponse>() {};
    return apiClient.invokeAPI("AppStoreVersionLocalizationsApi.appStoreVersionLocalizationsUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), appStoreVersionLocalizationUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
