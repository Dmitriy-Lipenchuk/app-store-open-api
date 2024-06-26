package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.AppClipAppStoreReviewDetailResponse;
import org.openapitools.client.model.AppClipDefaultExperienceCreateRequest;
import org.openapitools.client.model.AppClipDefaultExperienceLocalizationsResponse;
import org.openapitools.client.model.AppClipDefaultExperienceReleaseWithAppStoreVersionLinkageRequest;
import org.openapitools.client.model.AppClipDefaultExperienceReleaseWithAppStoreVersionLinkageResponse;
import org.openapitools.client.model.AppClipDefaultExperienceResponse;
import org.openapitools.client.model.AppClipDefaultExperienceUpdateRequest;
import org.openapitools.client.model.AppStoreVersionResponse;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppClipDefaultExperiencesApi {
  private ApiClient apiClient;

  public AppClipDefaultExperiencesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AppClipDefaultExperiencesApi(ApiClient apiClient) {
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
   * @param fieldsAppClipAppStoreReviewDetails the fields to include for returned resources of type appClipAppStoreReviewDetails (optional)
   * @param fieldsAppClipDefaultExperiences the fields to include for returned resources of type appClipDefaultExperiences (optional)
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
  public AppClipAppStoreReviewDetailResponse appClipDefaultExperiencesAppClipAppStoreReviewDetailGetToOneRelated(String id, List<String> fieldsAppClipAppStoreReviewDetails, List<String> fieldsAppClipDefaultExperiences, List<String> include) throws ApiException {
    return appClipDefaultExperiencesAppClipAppStoreReviewDetailGetToOneRelatedWithHttpInfo(id, fieldsAppClipAppStoreReviewDetails, fieldsAppClipDefaultExperiences, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppClipAppStoreReviewDetails the fields to include for returned resources of type appClipAppStoreReviewDetails (optional)
   * @param fieldsAppClipDefaultExperiences the fields to include for returned resources of type appClipDefaultExperiences (optional)
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
  public ApiResponse<AppClipAppStoreReviewDetailResponse> appClipDefaultExperiencesAppClipAppStoreReviewDetailGetToOneRelatedWithHttpInfo(String id, List<String> fieldsAppClipAppStoreReviewDetails, List<String> fieldsAppClipDefaultExperiences, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appClipDefaultExperiencesAppClipAppStoreReviewDetailGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/appClipDefaultExperiences/{id}/appClipAppStoreReviewDetail"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appClipAppStoreReviewDetails]", fieldsAppClipAppStoreReviewDetails)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appClipDefaultExperiences]", fieldsAppClipDefaultExperiences));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppClipAppStoreReviewDetailResponse> localVarReturnType = new GenericType<AppClipAppStoreReviewDetailResponse>() {};
    return apiClient.invokeAPI("AppClipDefaultExperiencesApi.appClipDefaultExperiencesAppClipAppStoreReviewDetailGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterLocale filter by attribute &#39;locale&#39; (optional)
   * @param fieldsAppClipDefaultExperiences the fields to include for returned resources of type appClipDefaultExperiences (optional)
   * @param fieldsAppClipDefaultExperienceLocalizations the fields to include for returned resources of type appClipDefaultExperienceLocalizations (optional)
   * @param fieldsAppClipHeaderImages the fields to include for returned resources of type appClipHeaderImages (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AppClipDefaultExperienceLocalizationsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppClipDefaultExperienceLocalizations </td><td>  -  </td></tr>
     </table>
   */
  public AppClipDefaultExperienceLocalizationsResponse appClipDefaultExperiencesAppClipDefaultExperienceLocalizationsGetToManyRelated(String id, List<String> filterLocale, List<String> fieldsAppClipDefaultExperiences, List<String> fieldsAppClipDefaultExperienceLocalizations, List<String> fieldsAppClipHeaderImages, Integer limit, List<String> include) throws ApiException {
    return appClipDefaultExperiencesAppClipDefaultExperienceLocalizationsGetToManyRelatedWithHttpInfo(id, filterLocale, fieldsAppClipDefaultExperiences, fieldsAppClipDefaultExperienceLocalizations, fieldsAppClipHeaderImages, limit, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterLocale filter by attribute &#39;locale&#39; (optional)
   * @param fieldsAppClipDefaultExperiences the fields to include for returned resources of type appClipDefaultExperiences (optional)
   * @param fieldsAppClipDefaultExperienceLocalizations the fields to include for returned resources of type appClipDefaultExperienceLocalizations (optional)
   * @param fieldsAppClipHeaderImages the fields to include for returned resources of type appClipHeaderImages (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AppClipDefaultExperienceLocalizationsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppClipDefaultExperienceLocalizations </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppClipDefaultExperienceLocalizationsResponse> appClipDefaultExperiencesAppClipDefaultExperienceLocalizationsGetToManyRelatedWithHttpInfo(String id, List<String> filterLocale, List<String> fieldsAppClipDefaultExperiences, List<String> fieldsAppClipDefaultExperienceLocalizations, List<String> fieldsAppClipHeaderImages, Integer limit, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appClipDefaultExperiencesAppClipDefaultExperienceLocalizationsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/appClipDefaultExperiences/{id}/appClipDefaultExperienceLocalizations"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[locale]", filterLocale)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appClipDefaultExperiences]", fieldsAppClipDefaultExperiences));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appClipDefaultExperienceLocalizations]", fieldsAppClipDefaultExperienceLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appClipHeaderImages]", fieldsAppClipHeaderImages));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppClipDefaultExperienceLocalizationsResponse> localVarReturnType = new GenericType<AppClipDefaultExperienceLocalizationsResponse>() {};
    return apiClient.invokeAPI("AppClipDefaultExperiencesApi.appClipDefaultExperiencesAppClipDefaultExperienceLocalizationsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param appClipDefaultExperienceCreateRequest AppClipDefaultExperience representation (required)
   * @return AppClipDefaultExperienceResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AppClipDefaultExperience </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public AppClipDefaultExperienceResponse appClipDefaultExperiencesCreateInstance(AppClipDefaultExperienceCreateRequest appClipDefaultExperienceCreateRequest) throws ApiException {
    return appClipDefaultExperiencesCreateInstanceWithHttpInfo(appClipDefaultExperienceCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param appClipDefaultExperienceCreateRequest AppClipDefaultExperience representation (required)
   * @return ApiResponse&lt;AppClipDefaultExperienceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AppClipDefaultExperience </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppClipDefaultExperienceResponse> appClipDefaultExperiencesCreateInstanceWithHttpInfo(AppClipDefaultExperienceCreateRequest appClipDefaultExperienceCreateRequest) throws ApiException {
    // Check required parameters
    if (appClipDefaultExperienceCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appClipDefaultExperienceCreateRequest' when calling appClipDefaultExperiencesCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppClipDefaultExperienceResponse> localVarReturnType = new GenericType<AppClipDefaultExperienceResponse>() {};
    return apiClient.invokeAPI("AppClipDefaultExperiencesApi.appClipDefaultExperiencesCreateInstance", "/v1/appClipDefaultExperiences", "POST", new ArrayList<>(), appClipDefaultExperienceCreateRequest,
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
  public void appClipDefaultExperiencesDeleteInstance(String id) throws ApiException {
    appClipDefaultExperiencesDeleteInstanceWithHttpInfo(id);
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
  public ApiResponse<Void> appClipDefaultExperiencesDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appClipDefaultExperiencesDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appClipDefaultExperiences/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("AppClipDefaultExperiencesApi.appClipDefaultExperiencesDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppClipDefaultExperiences the fields to include for returned resources of type appClipDefaultExperiences (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsAppClipAppStoreReviewDetails the fields to include for returned resources of type appClipAppStoreReviewDetails (optional)
   * @param fieldsAppStoreVersions the fields to include for returned resources of type appStoreVersions (optional)
   * @param fieldsAppClipDefaultExperienceLocalizations the fields to include for returned resources of type appClipDefaultExperienceLocalizations (optional)
   * @param limitAppClipDefaultExperienceLocalizations maximum number of related appClipDefaultExperienceLocalizations returned (when they are included) (optional)
   * @return AppClipDefaultExperienceResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppClipDefaultExperience </td><td>  -  </td></tr>
     </table>
   */
  public AppClipDefaultExperienceResponse appClipDefaultExperiencesGetInstance(String id, List<String> fieldsAppClipDefaultExperiences, List<String> include, List<String> fieldsAppClipAppStoreReviewDetails, List<String> fieldsAppStoreVersions, List<String> fieldsAppClipDefaultExperienceLocalizations, Integer limitAppClipDefaultExperienceLocalizations) throws ApiException {
    return appClipDefaultExperiencesGetInstanceWithHttpInfo(id, fieldsAppClipDefaultExperiences, include, fieldsAppClipAppStoreReviewDetails, fieldsAppStoreVersions, fieldsAppClipDefaultExperienceLocalizations, limitAppClipDefaultExperienceLocalizations).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppClipDefaultExperiences the fields to include for returned resources of type appClipDefaultExperiences (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsAppClipAppStoreReviewDetails the fields to include for returned resources of type appClipAppStoreReviewDetails (optional)
   * @param fieldsAppStoreVersions the fields to include for returned resources of type appStoreVersions (optional)
   * @param fieldsAppClipDefaultExperienceLocalizations the fields to include for returned resources of type appClipDefaultExperienceLocalizations (optional)
   * @param limitAppClipDefaultExperienceLocalizations maximum number of related appClipDefaultExperienceLocalizations returned (when they are included) (optional)
   * @return ApiResponse&lt;AppClipDefaultExperienceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppClipDefaultExperience </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppClipDefaultExperienceResponse> appClipDefaultExperiencesGetInstanceWithHttpInfo(String id, List<String> fieldsAppClipDefaultExperiences, List<String> include, List<String> fieldsAppClipAppStoreReviewDetails, List<String> fieldsAppStoreVersions, List<String> fieldsAppClipDefaultExperienceLocalizations, Integer limitAppClipDefaultExperienceLocalizations) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appClipDefaultExperiencesGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appClipDefaultExperiences/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appClipDefaultExperiences]", fieldsAppClipDefaultExperiences)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appClipAppStoreReviewDetails]", fieldsAppClipAppStoreReviewDetails));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersions]", fieldsAppStoreVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appClipDefaultExperienceLocalizations]", fieldsAppClipDefaultExperienceLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appClipDefaultExperienceLocalizations]", limitAppClipDefaultExperienceLocalizations));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppClipDefaultExperienceResponse> localVarReturnType = new GenericType<AppClipDefaultExperienceResponse>() {};
    return apiClient.invokeAPI("AppClipDefaultExperiencesApi.appClipDefaultExperiencesGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAgeRatingDeclarations the fields to include for returned resources of type ageRatingDeclarations (optional)
   * @param fieldsAppStoreReviewDetails the fields to include for returned resources of type appStoreReviewDetails (optional)
   * @param fieldsAppStoreVersionLocalizations the fields to include for returned resources of type appStoreVersionLocalizations (optional)
   * @param fieldsAppStoreVersionExperiments the fields to include for returned resources of type appStoreVersionExperiments (optional)
   * @param fieldsAppStoreVersionSubmissions the fields to include for returned resources of type appStoreVersionSubmissions (optional)
   * @param fieldsAlternativeDistributionPackages the fields to include for returned resources of type alternativeDistributionPackages (optional)
   * @param fieldsAppStoreVersions the fields to include for returned resources of type appStoreVersions (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param fieldsRoutingAppCoverages the fields to include for returned resources of type routingAppCoverages (optional)
   * @param fieldsAppClipDefaultExperiences the fields to include for returned resources of type appClipDefaultExperiences (optional)
   * @param fieldsAppStoreVersionPhasedReleases the fields to include for returned resources of type appStoreVersionPhasedReleases (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @param limitAppStoreVersionLocalizations maximum number of related appStoreVersionLocalizations returned (when they are included) (optional)
   * @param limitAppStoreVersionExperiments maximum number of related appStoreVersionExperiments returned (when they are included) (optional)
   * @param limitAppStoreVersionExperimentsV2 maximum number of related appStoreVersionExperimentsV2 returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AppStoreVersionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppStoreVersion </td><td>  -  </td></tr>
     </table>
   */
  public AppStoreVersionResponse appClipDefaultExperiencesReleaseWithAppStoreVersionGetToOneRelated(String id, List<String> fieldsAgeRatingDeclarations, List<String> fieldsAppStoreReviewDetails, List<String> fieldsAppStoreVersionLocalizations, List<String> fieldsAppStoreVersionExperiments, List<String> fieldsAppStoreVersionSubmissions, List<String> fieldsAlternativeDistributionPackages, List<String> fieldsAppStoreVersions, List<String> fieldsApps, List<String> fieldsRoutingAppCoverages, List<String> fieldsAppClipDefaultExperiences, List<String> fieldsAppStoreVersionPhasedReleases, List<String> fieldsBuilds, Integer limitAppStoreVersionLocalizations, Integer limitAppStoreVersionExperiments, Integer limitAppStoreVersionExperimentsV2, List<String> include) throws ApiException {
    return appClipDefaultExperiencesReleaseWithAppStoreVersionGetToOneRelatedWithHttpInfo(id, fieldsAgeRatingDeclarations, fieldsAppStoreReviewDetails, fieldsAppStoreVersionLocalizations, fieldsAppStoreVersionExperiments, fieldsAppStoreVersionSubmissions, fieldsAlternativeDistributionPackages, fieldsAppStoreVersions, fieldsApps, fieldsRoutingAppCoverages, fieldsAppClipDefaultExperiences, fieldsAppStoreVersionPhasedReleases, fieldsBuilds, limitAppStoreVersionLocalizations, limitAppStoreVersionExperiments, limitAppStoreVersionExperimentsV2, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAgeRatingDeclarations the fields to include for returned resources of type ageRatingDeclarations (optional)
   * @param fieldsAppStoreReviewDetails the fields to include for returned resources of type appStoreReviewDetails (optional)
   * @param fieldsAppStoreVersionLocalizations the fields to include for returned resources of type appStoreVersionLocalizations (optional)
   * @param fieldsAppStoreVersionExperiments the fields to include for returned resources of type appStoreVersionExperiments (optional)
   * @param fieldsAppStoreVersionSubmissions the fields to include for returned resources of type appStoreVersionSubmissions (optional)
   * @param fieldsAlternativeDistributionPackages the fields to include for returned resources of type alternativeDistributionPackages (optional)
   * @param fieldsAppStoreVersions the fields to include for returned resources of type appStoreVersions (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param fieldsRoutingAppCoverages the fields to include for returned resources of type routingAppCoverages (optional)
   * @param fieldsAppClipDefaultExperiences the fields to include for returned resources of type appClipDefaultExperiences (optional)
   * @param fieldsAppStoreVersionPhasedReleases the fields to include for returned resources of type appStoreVersionPhasedReleases (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @param limitAppStoreVersionLocalizations maximum number of related appStoreVersionLocalizations returned (when they are included) (optional)
   * @param limitAppStoreVersionExperiments maximum number of related appStoreVersionExperiments returned (when they are included) (optional)
   * @param limitAppStoreVersionExperimentsV2 maximum number of related appStoreVersionExperimentsV2 returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AppStoreVersionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppStoreVersion </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppStoreVersionResponse> appClipDefaultExperiencesReleaseWithAppStoreVersionGetToOneRelatedWithHttpInfo(String id, List<String> fieldsAgeRatingDeclarations, List<String> fieldsAppStoreReviewDetails, List<String> fieldsAppStoreVersionLocalizations, List<String> fieldsAppStoreVersionExperiments, List<String> fieldsAppStoreVersionSubmissions, List<String> fieldsAlternativeDistributionPackages, List<String> fieldsAppStoreVersions, List<String> fieldsApps, List<String> fieldsRoutingAppCoverages, List<String> fieldsAppClipDefaultExperiences, List<String> fieldsAppStoreVersionPhasedReleases, List<String> fieldsBuilds, Integer limitAppStoreVersionLocalizations, Integer limitAppStoreVersionExperiments, Integer limitAppStoreVersionExperimentsV2, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appClipDefaultExperiencesReleaseWithAppStoreVersionGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/appClipDefaultExperiences/{id}/releaseWithAppStoreVersion"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[ageRatingDeclarations]", fieldsAgeRatingDeclarations)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreReviewDetails]", fieldsAppStoreReviewDetails));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersionLocalizations]", fieldsAppStoreVersionLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersionExperiments]", fieldsAppStoreVersionExperiments));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersionSubmissions]", fieldsAppStoreVersionSubmissions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[alternativeDistributionPackages]", fieldsAlternativeDistributionPackages));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersions]", fieldsAppStoreVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[apps]", fieldsApps));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[routingAppCoverages]", fieldsRoutingAppCoverages));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appClipDefaultExperiences]", fieldsAppClipDefaultExperiences));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersionPhasedReleases]", fieldsAppStoreVersionPhasedReleases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[builds]", fieldsBuilds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appStoreVersionLocalizations]", limitAppStoreVersionLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appStoreVersionExperiments]", limitAppStoreVersionExperiments));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appStoreVersionExperimentsV2]", limitAppStoreVersionExperimentsV2));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppStoreVersionResponse> localVarReturnType = new GenericType<AppStoreVersionResponse>() {};
    return apiClient.invokeAPI("AppClipDefaultExperiencesApi.appClipDefaultExperiencesReleaseWithAppStoreVersionGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @return AppClipDefaultExperienceReleaseWithAppStoreVersionLinkageResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Related linkage </td><td>  -  </td></tr>
     </table>
   */
  public AppClipDefaultExperienceReleaseWithAppStoreVersionLinkageResponse appClipDefaultExperiencesReleaseWithAppStoreVersionGetToOneRelationship(String id) throws ApiException {
    return appClipDefaultExperiencesReleaseWithAppStoreVersionGetToOneRelationshipWithHttpInfo(id).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @return ApiResponse&lt;AppClipDefaultExperienceReleaseWithAppStoreVersionLinkageResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Related linkage </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppClipDefaultExperienceReleaseWithAppStoreVersionLinkageResponse> appClipDefaultExperiencesReleaseWithAppStoreVersionGetToOneRelationshipWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appClipDefaultExperiencesReleaseWithAppStoreVersionGetToOneRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/appClipDefaultExperiences/{id}/relationships/releaseWithAppStoreVersion"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppClipDefaultExperienceReleaseWithAppStoreVersionLinkageResponse> localVarReturnType = new GenericType<AppClipDefaultExperienceReleaseWithAppStoreVersionLinkageResponse>() {};
    return apiClient.invokeAPI("AppClipDefaultExperiencesApi.appClipDefaultExperiencesReleaseWithAppStoreVersionGetToOneRelationship", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appClipDefaultExperienceReleaseWithAppStoreVersionLinkageRequest Related linkage (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success (no content) </td><td>  -  </td></tr>
     </table>
   */
  public void appClipDefaultExperiencesReleaseWithAppStoreVersionUpdateToOneRelationship(String id, AppClipDefaultExperienceReleaseWithAppStoreVersionLinkageRequest appClipDefaultExperienceReleaseWithAppStoreVersionLinkageRequest) throws ApiException {
    appClipDefaultExperiencesReleaseWithAppStoreVersionUpdateToOneRelationshipWithHttpInfo(id, appClipDefaultExperienceReleaseWithAppStoreVersionLinkageRequest);
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appClipDefaultExperienceReleaseWithAppStoreVersionLinkageRequest Related linkage (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success (no content) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> appClipDefaultExperiencesReleaseWithAppStoreVersionUpdateToOneRelationshipWithHttpInfo(String id, AppClipDefaultExperienceReleaseWithAppStoreVersionLinkageRequest appClipDefaultExperienceReleaseWithAppStoreVersionLinkageRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appClipDefaultExperiencesReleaseWithAppStoreVersionUpdateToOneRelationship");
    }
    if (appClipDefaultExperienceReleaseWithAppStoreVersionLinkageRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appClipDefaultExperienceReleaseWithAppStoreVersionLinkageRequest' when calling appClipDefaultExperiencesReleaseWithAppStoreVersionUpdateToOneRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/appClipDefaultExperiences/{id}/relationships/releaseWithAppStoreVersion"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("AppClipDefaultExperiencesApi.appClipDefaultExperiencesReleaseWithAppStoreVersionUpdateToOneRelationship", localVarPath, "PATCH", new ArrayList<>(), appClipDefaultExperienceReleaseWithAppStoreVersionLinkageRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appClipDefaultExperienceUpdateRequest AppClipDefaultExperience representation (required)
   * @return AppClipDefaultExperienceResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppClipDefaultExperience </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public AppClipDefaultExperienceResponse appClipDefaultExperiencesUpdateInstance(String id, AppClipDefaultExperienceUpdateRequest appClipDefaultExperienceUpdateRequest) throws ApiException {
    return appClipDefaultExperiencesUpdateInstanceWithHttpInfo(id, appClipDefaultExperienceUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appClipDefaultExperienceUpdateRequest AppClipDefaultExperience representation (required)
   * @return ApiResponse&lt;AppClipDefaultExperienceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppClipDefaultExperience </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppClipDefaultExperienceResponse> appClipDefaultExperiencesUpdateInstanceWithHttpInfo(String id, AppClipDefaultExperienceUpdateRequest appClipDefaultExperienceUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appClipDefaultExperiencesUpdateInstance");
    }
    if (appClipDefaultExperienceUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appClipDefaultExperienceUpdateRequest' when calling appClipDefaultExperiencesUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appClipDefaultExperiences/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppClipDefaultExperienceResponse> localVarReturnType = new GenericType<AppClipDefaultExperienceResponse>() {};
    return apiClient.invokeAPI("AppClipDefaultExperiencesApi.appClipDefaultExperiencesUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), appClipDefaultExperienceUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
