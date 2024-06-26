package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.AppStoreVersionPhasedReleaseCreateRequest;
import org.openapitools.client.model.AppStoreVersionPhasedReleaseResponse;
import org.openapitools.client.model.AppStoreVersionPhasedReleaseUpdateRequest;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppStoreVersionPhasedReleasesApi {
  private ApiClient apiClient;

  public AppStoreVersionPhasedReleasesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AppStoreVersionPhasedReleasesApi(ApiClient apiClient) {
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
   * @param appStoreVersionPhasedReleaseCreateRequest AppStoreVersionPhasedRelease representation (required)
   * @return AppStoreVersionPhasedReleaseResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AppStoreVersionPhasedRelease </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public AppStoreVersionPhasedReleaseResponse appStoreVersionPhasedReleasesCreateInstance(AppStoreVersionPhasedReleaseCreateRequest appStoreVersionPhasedReleaseCreateRequest) throws ApiException {
    return appStoreVersionPhasedReleasesCreateInstanceWithHttpInfo(appStoreVersionPhasedReleaseCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param appStoreVersionPhasedReleaseCreateRequest AppStoreVersionPhasedRelease representation (required)
   * @return ApiResponse&lt;AppStoreVersionPhasedReleaseResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AppStoreVersionPhasedRelease </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppStoreVersionPhasedReleaseResponse> appStoreVersionPhasedReleasesCreateInstanceWithHttpInfo(AppStoreVersionPhasedReleaseCreateRequest appStoreVersionPhasedReleaseCreateRequest) throws ApiException {
    // Check required parameters
    if (appStoreVersionPhasedReleaseCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appStoreVersionPhasedReleaseCreateRequest' when calling appStoreVersionPhasedReleasesCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppStoreVersionPhasedReleaseResponse> localVarReturnType = new GenericType<AppStoreVersionPhasedReleaseResponse>() {};
    return apiClient.invokeAPI("AppStoreVersionPhasedReleasesApi.appStoreVersionPhasedReleasesCreateInstance", "/v1/appStoreVersionPhasedReleases", "POST", new ArrayList<>(), appStoreVersionPhasedReleaseCreateRequest,
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
  public void appStoreVersionPhasedReleasesDeleteInstance(String id) throws ApiException {
    appStoreVersionPhasedReleasesDeleteInstanceWithHttpInfo(id);
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
  public ApiResponse<Void> appStoreVersionPhasedReleasesDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appStoreVersionPhasedReleasesDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appStoreVersionPhasedReleases/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("AppStoreVersionPhasedReleasesApi.appStoreVersionPhasedReleasesDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appStoreVersionPhasedReleaseUpdateRequest AppStoreVersionPhasedRelease representation (required)
   * @return AppStoreVersionPhasedReleaseResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppStoreVersionPhasedRelease </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public AppStoreVersionPhasedReleaseResponse appStoreVersionPhasedReleasesUpdateInstance(String id, AppStoreVersionPhasedReleaseUpdateRequest appStoreVersionPhasedReleaseUpdateRequest) throws ApiException {
    return appStoreVersionPhasedReleasesUpdateInstanceWithHttpInfo(id, appStoreVersionPhasedReleaseUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appStoreVersionPhasedReleaseUpdateRequest AppStoreVersionPhasedRelease representation (required)
   * @return ApiResponse&lt;AppStoreVersionPhasedReleaseResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppStoreVersionPhasedRelease </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppStoreVersionPhasedReleaseResponse> appStoreVersionPhasedReleasesUpdateInstanceWithHttpInfo(String id, AppStoreVersionPhasedReleaseUpdateRequest appStoreVersionPhasedReleaseUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appStoreVersionPhasedReleasesUpdateInstance");
    }
    if (appStoreVersionPhasedReleaseUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appStoreVersionPhasedReleaseUpdateRequest' when calling appStoreVersionPhasedReleasesUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appStoreVersionPhasedReleases/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppStoreVersionPhasedReleaseResponse> localVarReturnType = new GenericType<AppStoreVersionPhasedReleaseResponse>() {};
    return apiClient.invokeAPI("AppStoreVersionPhasedReleasesApi.appStoreVersionPhasedReleasesUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), appStoreVersionPhasedReleaseUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
