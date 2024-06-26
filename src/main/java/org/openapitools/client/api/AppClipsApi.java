package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.AppClipAdvancedExperiencesResponse;
import org.openapitools.client.model.AppClipDefaultExperiencesResponse;
import org.openapitools.client.model.AppClipResponse;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppClipsApi {
  private ApiClient apiClient;

  public AppClipsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AppClipsApi(ApiClient apiClient) {
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
   * @param filterAction filter by attribute &#39;action&#39; (optional)
   * @param filterPlaceStatus filter by attribute &#39;placeStatus&#39; (optional)
   * @param filterStatus filter by attribute &#39;status&#39; (optional)
   * @param fieldsAppClipAdvancedExperiences the fields to include for returned resources of type appClipAdvancedExperiences (optional)
   * @param fieldsAppClips the fields to include for returned resources of type appClips (optional)
   * @param fieldsAppClipAdvancedExperienceImages the fields to include for returned resources of type appClipAdvancedExperienceImages (optional)
   * @param fieldsAppClipAdvancedExperienceLocalizations the fields to include for returned resources of type appClipAdvancedExperienceLocalizations (optional)
   * @param limit maximum resources per page (optional)
   * @param limitLocalizations maximum number of related localizations returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AppClipAdvancedExperiencesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppClipAdvancedExperiences </td><td>  -  </td></tr>
     </table>
   */
  public AppClipAdvancedExperiencesResponse appClipsAppClipAdvancedExperiencesGetToManyRelated(String id, List<String> filterAction, List<String> filterPlaceStatus, List<String> filterStatus, List<String> fieldsAppClipAdvancedExperiences, List<String> fieldsAppClips, List<String> fieldsAppClipAdvancedExperienceImages, List<String> fieldsAppClipAdvancedExperienceLocalizations, Integer limit, Integer limitLocalizations, List<String> include) throws ApiException {
    return appClipsAppClipAdvancedExperiencesGetToManyRelatedWithHttpInfo(id, filterAction, filterPlaceStatus, filterStatus, fieldsAppClipAdvancedExperiences, fieldsAppClips, fieldsAppClipAdvancedExperienceImages, fieldsAppClipAdvancedExperienceLocalizations, limit, limitLocalizations, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterAction filter by attribute &#39;action&#39; (optional)
   * @param filterPlaceStatus filter by attribute &#39;placeStatus&#39; (optional)
   * @param filterStatus filter by attribute &#39;status&#39; (optional)
   * @param fieldsAppClipAdvancedExperiences the fields to include for returned resources of type appClipAdvancedExperiences (optional)
   * @param fieldsAppClips the fields to include for returned resources of type appClips (optional)
   * @param fieldsAppClipAdvancedExperienceImages the fields to include for returned resources of type appClipAdvancedExperienceImages (optional)
   * @param fieldsAppClipAdvancedExperienceLocalizations the fields to include for returned resources of type appClipAdvancedExperienceLocalizations (optional)
   * @param limit maximum resources per page (optional)
   * @param limitLocalizations maximum number of related localizations returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AppClipAdvancedExperiencesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppClipAdvancedExperiences </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppClipAdvancedExperiencesResponse> appClipsAppClipAdvancedExperiencesGetToManyRelatedWithHttpInfo(String id, List<String> filterAction, List<String> filterPlaceStatus, List<String> filterStatus, List<String> fieldsAppClipAdvancedExperiences, List<String> fieldsAppClips, List<String> fieldsAppClipAdvancedExperienceImages, List<String> fieldsAppClipAdvancedExperienceLocalizations, Integer limit, Integer limitLocalizations, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appClipsAppClipAdvancedExperiencesGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/appClips/{id}/appClipAdvancedExperiences"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[action]", filterAction)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[placeStatus]", filterPlaceStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[status]", filterStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appClipAdvancedExperiences]", fieldsAppClipAdvancedExperiences));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appClips]", fieldsAppClips));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appClipAdvancedExperienceImages]", fieldsAppClipAdvancedExperienceImages));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appClipAdvancedExperienceLocalizations]", fieldsAppClipAdvancedExperienceLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[localizations]", limitLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppClipAdvancedExperiencesResponse> localVarReturnType = new GenericType<AppClipAdvancedExperiencesResponse>() {};
    return apiClient.invokeAPI("AppClipsApi.appClipsAppClipAdvancedExperiencesGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param existsReleaseWithAppStoreVersion filter by existence or non-existence of related &#39;releaseWithAppStoreVersion&#39; (optional)
   * @param fieldsAppClips the fields to include for returned resources of type appClips (optional)
   * @param fieldsAppClipAppStoreReviewDetails the fields to include for returned resources of type appClipAppStoreReviewDetails (optional)
   * @param fieldsAppStoreVersions the fields to include for returned resources of type appStoreVersions (optional)
   * @param fieldsAppClipDefaultExperiences the fields to include for returned resources of type appClipDefaultExperiences (optional)
   * @param fieldsAppClipDefaultExperienceLocalizations the fields to include for returned resources of type appClipDefaultExperienceLocalizations (optional)
   * @param limit maximum resources per page (optional)
   * @param limitAppClipDefaultExperienceLocalizations maximum number of related appClipDefaultExperienceLocalizations returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return AppClipDefaultExperiencesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppClipDefaultExperiences </td><td>  -  </td></tr>
     </table>
   */
  public AppClipDefaultExperiencesResponse appClipsAppClipDefaultExperiencesGetToManyRelated(String id, Boolean existsReleaseWithAppStoreVersion, List<String> fieldsAppClips, List<String> fieldsAppClipAppStoreReviewDetails, List<String> fieldsAppStoreVersions, List<String> fieldsAppClipDefaultExperiences, List<String> fieldsAppClipDefaultExperienceLocalizations, Integer limit, Integer limitAppClipDefaultExperienceLocalizations, List<String> include) throws ApiException {
    return appClipsAppClipDefaultExperiencesGetToManyRelatedWithHttpInfo(id, existsReleaseWithAppStoreVersion, fieldsAppClips, fieldsAppClipAppStoreReviewDetails, fieldsAppStoreVersions, fieldsAppClipDefaultExperiences, fieldsAppClipDefaultExperienceLocalizations, limit, limitAppClipDefaultExperienceLocalizations, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param existsReleaseWithAppStoreVersion filter by existence or non-existence of related &#39;releaseWithAppStoreVersion&#39; (optional)
   * @param fieldsAppClips the fields to include for returned resources of type appClips (optional)
   * @param fieldsAppClipAppStoreReviewDetails the fields to include for returned resources of type appClipAppStoreReviewDetails (optional)
   * @param fieldsAppStoreVersions the fields to include for returned resources of type appStoreVersions (optional)
   * @param fieldsAppClipDefaultExperiences the fields to include for returned resources of type appClipDefaultExperiences (optional)
   * @param fieldsAppClipDefaultExperienceLocalizations the fields to include for returned resources of type appClipDefaultExperienceLocalizations (optional)
   * @param limit maximum resources per page (optional)
   * @param limitAppClipDefaultExperienceLocalizations maximum number of related appClipDefaultExperienceLocalizations returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;AppClipDefaultExperiencesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppClipDefaultExperiences </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppClipDefaultExperiencesResponse> appClipsAppClipDefaultExperiencesGetToManyRelatedWithHttpInfo(String id, Boolean existsReleaseWithAppStoreVersion, List<String> fieldsAppClips, List<String> fieldsAppClipAppStoreReviewDetails, List<String> fieldsAppStoreVersions, List<String> fieldsAppClipDefaultExperiences, List<String> fieldsAppClipDefaultExperienceLocalizations, Integer limit, Integer limitAppClipDefaultExperienceLocalizations, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appClipsAppClipDefaultExperiencesGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/appClips/{id}/appClipDefaultExperiences"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "exists[releaseWithAppStoreVersion]", existsReleaseWithAppStoreVersion)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appClips]", fieldsAppClips));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appClipAppStoreReviewDetails]", fieldsAppClipAppStoreReviewDetails));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersions]", fieldsAppStoreVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appClipDefaultExperiences]", fieldsAppClipDefaultExperiences));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appClipDefaultExperienceLocalizations]", fieldsAppClipDefaultExperienceLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appClipDefaultExperienceLocalizations]", limitAppClipDefaultExperienceLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppClipDefaultExperiencesResponse> localVarReturnType = new GenericType<AppClipDefaultExperiencesResponse>() {};
    return apiClient.invokeAPI("AppClipsApi.appClipsAppClipDefaultExperiencesGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppClips the fields to include for returned resources of type appClips (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsAppClipAdvancedExperiences the fields to include for returned resources of type appClipAdvancedExperiences (optional)
   * @param fieldsAppClipDefaultExperiences the fields to include for returned resources of type appClipDefaultExperiences (optional)
   * @param limitAppClipDefaultExperiences maximum number of related appClipDefaultExperiences returned (when they are included) (optional)
   * @return AppClipResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppClip </td><td>  -  </td></tr>
     </table>
   */
  public AppClipResponse appClipsGetInstance(String id, List<String> fieldsAppClips, List<String> include, List<String> fieldsAppClipAdvancedExperiences, List<String> fieldsAppClipDefaultExperiences, Integer limitAppClipDefaultExperiences) throws ApiException {
    return appClipsGetInstanceWithHttpInfo(id, fieldsAppClips, include, fieldsAppClipAdvancedExperiences, fieldsAppClipDefaultExperiences, limitAppClipDefaultExperiences).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppClips the fields to include for returned resources of type appClips (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsAppClipAdvancedExperiences the fields to include for returned resources of type appClipAdvancedExperiences (optional)
   * @param fieldsAppClipDefaultExperiences the fields to include for returned resources of type appClipDefaultExperiences (optional)
   * @param limitAppClipDefaultExperiences maximum number of related appClipDefaultExperiences returned (when they are included) (optional)
   * @return ApiResponse&lt;AppClipResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppClip </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppClipResponse> appClipsGetInstanceWithHttpInfo(String id, List<String> fieldsAppClips, List<String> include, List<String> fieldsAppClipAdvancedExperiences, List<String> fieldsAppClipDefaultExperiences, Integer limitAppClipDefaultExperiences) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appClipsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appClips/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appClips]", fieldsAppClips)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appClipAdvancedExperiences]", fieldsAppClipAdvancedExperiences));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appClipDefaultExperiences]", fieldsAppClipDefaultExperiences));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[appClipDefaultExperiences]", limitAppClipDefaultExperiences));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppClipResponse> localVarReturnType = new GenericType<AppClipResponse>() {};
    return apiClient.invokeAPI("AppClipsApi.appClipsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
