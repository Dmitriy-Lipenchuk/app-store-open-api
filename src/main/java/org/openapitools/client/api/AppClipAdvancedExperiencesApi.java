package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.AppClipAdvancedExperienceCreateRequest;
import org.openapitools.client.model.AppClipAdvancedExperienceResponse;
import org.openapitools.client.model.AppClipAdvancedExperienceUpdateRequest;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppClipAdvancedExperiencesApi {
  private ApiClient apiClient;

  public AppClipAdvancedExperiencesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AppClipAdvancedExperiencesApi(ApiClient apiClient) {
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
   * @param appClipAdvancedExperienceCreateRequest AppClipAdvancedExperience representation (required)
   * @return AppClipAdvancedExperienceResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AppClipAdvancedExperience </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public AppClipAdvancedExperienceResponse appClipAdvancedExperiencesCreateInstance(AppClipAdvancedExperienceCreateRequest appClipAdvancedExperienceCreateRequest) throws ApiException {
    return appClipAdvancedExperiencesCreateInstanceWithHttpInfo(appClipAdvancedExperienceCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param appClipAdvancedExperienceCreateRequest AppClipAdvancedExperience representation (required)
   * @return ApiResponse&lt;AppClipAdvancedExperienceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AppClipAdvancedExperience </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppClipAdvancedExperienceResponse> appClipAdvancedExperiencesCreateInstanceWithHttpInfo(AppClipAdvancedExperienceCreateRequest appClipAdvancedExperienceCreateRequest) throws ApiException {
    // Check required parameters
    if (appClipAdvancedExperienceCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appClipAdvancedExperienceCreateRequest' when calling appClipAdvancedExperiencesCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppClipAdvancedExperienceResponse> localVarReturnType = new GenericType<AppClipAdvancedExperienceResponse>() {};
    return apiClient.invokeAPI("AppClipAdvancedExperiencesApi.appClipAdvancedExperiencesCreateInstance", "/v1/appClipAdvancedExperiences", "POST", new ArrayList<>(), appClipAdvancedExperienceCreateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppClipAdvancedExperiences the fields to include for returned resources of type appClipAdvancedExperiences (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param limitLocalizations maximum number of related localizations returned (when they are included) (optional)
   * @return AppClipAdvancedExperienceResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppClipAdvancedExperience </td><td>  -  </td></tr>
     </table>
   */
  public AppClipAdvancedExperienceResponse appClipAdvancedExperiencesGetInstance(String id, List<String> fieldsAppClipAdvancedExperiences, List<String> include, Integer limitLocalizations) throws ApiException {
    return appClipAdvancedExperiencesGetInstanceWithHttpInfo(id, fieldsAppClipAdvancedExperiences, include, limitLocalizations).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppClipAdvancedExperiences the fields to include for returned resources of type appClipAdvancedExperiences (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param limitLocalizations maximum number of related localizations returned (when they are included) (optional)
   * @return ApiResponse&lt;AppClipAdvancedExperienceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppClipAdvancedExperience </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppClipAdvancedExperienceResponse> appClipAdvancedExperiencesGetInstanceWithHttpInfo(String id, List<String> fieldsAppClipAdvancedExperiences, List<String> include, Integer limitLocalizations) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appClipAdvancedExperiencesGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appClipAdvancedExperiences/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appClipAdvancedExperiences]", fieldsAppClipAdvancedExperiences)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[localizations]", limitLocalizations));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppClipAdvancedExperienceResponse> localVarReturnType = new GenericType<AppClipAdvancedExperienceResponse>() {};
    return apiClient.invokeAPI("AppClipAdvancedExperiencesApi.appClipAdvancedExperiencesGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appClipAdvancedExperienceUpdateRequest AppClipAdvancedExperience representation (required)
   * @return AppClipAdvancedExperienceResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppClipAdvancedExperience </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public AppClipAdvancedExperienceResponse appClipAdvancedExperiencesUpdateInstance(String id, AppClipAdvancedExperienceUpdateRequest appClipAdvancedExperienceUpdateRequest) throws ApiException {
    return appClipAdvancedExperiencesUpdateInstanceWithHttpInfo(id, appClipAdvancedExperienceUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appClipAdvancedExperienceUpdateRequest AppClipAdvancedExperience representation (required)
   * @return ApiResponse&lt;AppClipAdvancedExperienceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppClipAdvancedExperience </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppClipAdvancedExperienceResponse> appClipAdvancedExperiencesUpdateInstanceWithHttpInfo(String id, AppClipAdvancedExperienceUpdateRequest appClipAdvancedExperienceUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appClipAdvancedExperiencesUpdateInstance");
    }
    if (appClipAdvancedExperienceUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appClipAdvancedExperienceUpdateRequest' when calling appClipAdvancedExperiencesUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appClipAdvancedExperiences/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppClipAdvancedExperienceResponse> localVarReturnType = new GenericType<AppClipAdvancedExperienceResponse>() {};
    return apiClient.invokeAPI("AppClipAdvancedExperiencesApi.appClipAdvancedExperiencesUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), appClipAdvancedExperienceUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
