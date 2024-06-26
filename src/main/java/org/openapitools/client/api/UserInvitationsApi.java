package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.AppsWithoutIncludesResponse;
import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.UserInvitationCreateRequest;
import org.openapitools.client.model.UserInvitationResponse;
import org.openapitools.client.model.UserInvitationsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class UserInvitationsApi {
  private ApiClient apiClient;

  public UserInvitationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public UserInvitationsApi(ApiClient apiClient) {
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
   * @param userInvitationCreateRequest UserInvitation representation (required)
   * @return UserInvitationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single UserInvitation </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public UserInvitationResponse userInvitationsCreateInstance(UserInvitationCreateRequest userInvitationCreateRequest) throws ApiException {
    return userInvitationsCreateInstanceWithHttpInfo(userInvitationCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param userInvitationCreateRequest UserInvitation representation (required)
   * @return ApiResponse&lt;UserInvitationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single UserInvitation </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UserInvitationResponse> userInvitationsCreateInstanceWithHttpInfo(UserInvitationCreateRequest userInvitationCreateRequest) throws ApiException {
    // Check required parameters
    if (userInvitationCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'userInvitationCreateRequest' when calling userInvitationsCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<UserInvitationResponse> localVarReturnType = new GenericType<UserInvitationResponse>() {};
    return apiClient.invokeAPI("UserInvitationsApi.userInvitationsCreateInstance", "/v1/userInvitations", "POST", new ArrayList<>(), userInvitationCreateRequest,
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
  public void userInvitationsDeleteInstance(String id) throws ApiException {
    userInvitationsDeleteInstanceWithHttpInfo(id);
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
  public ApiResponse<Void> userInvitationsDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling userInvitationsDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/userInvitations/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("UserInvitationsApi.userInvitationsDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param filterEmail filter by attribute &#39;email&#39; (optional)
   * @param filterRoles filter by attribute &#39;roles&#39; (optional)
   * @param filterVisibleApps filter by id(s) of related &#39;visibleApps&#39; (optional)
   * @param sort comma-separated list of sort expressions; resources will be sorted as specified (optional)
   * @param fieldsUserInvitations the fields to include for returned resources of type userInvitations (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param limitVisibleApps maximum number of related visibleApps returned (when they are included) (optional)
   * @return UserInvitationsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of UserInvitations </td><td>  -  </td></tr>
     </table>
   */
  public UserInvitationsResponse userInvitationsGetCollection(List<String> filterEmail, List<String> filterRoles, List<String> filterVisibleApps, List<String> sort, List<String> fieldsUserInvitations, Integer limit, List<String> include, List<String> fieldsApps, Integer limitVisibleApps) throws ApiException {
    return userInvitationsGetCollectionWithHttpInfo(filterEmail, filterRoles, filterVisibleApps, sort, fieldsUserInvitations, limit, include, fieldsApps, limitVisibleApps).getData();
  }

  /**
   * 
   * 
   * @param filterEmail filter by attribute &#39;email&#39; (optional)
   * @param filterRoles filter by attribute &#39;roles&#39; (optional)
   * @param filterVisibleApps filter by id(s) of related &#39;visibleApps&#39; (optional)
   * @param sort comma-separated list of sort expressions; resources will be sorted as specified (optional)
   * @param fieldsUserInvitations the fields to include for returned resources of type userInvitations (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param limitVisibleApps maximum number of related visibleApps returned (when they are included) (optional)
   * @return ApiResponse&lt;UserInvitationsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of UserInvitations </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UserInvitationsResponse> userInvitationsGetCollectionWithHttpInfo(List<String> filterEmail, List<String> filterRoles, List<String> filterVisibleApps, List<String> sort, List<String> fieldsUserInvitations, Integer limit, List<String> include, List<String> fieldsApps, Integer limitVisibleApps) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[email]", filterEmail)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[roles]", filterRoles));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[visibleApps]", filterVisibleApps));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[userInvitations]", fieldsUserInvitations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[apps]", fieldsApps));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[visibleApps]", limitVisibleApps));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<UserInvitationsResponse> localVarReturnType = new GenericType<UserInvitationsResponse>() {};
    return apiClient.invokeAPI("UserInvitationsApi.userInvitationsGetCollection", "/v1/userInvitations", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsUserInvitations the fields to include for returned resources of type userInvitations (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param limitVisibleApps maximum number of related visibleApps returned (when they are included) (optional)
   * @return UserInvitationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single UserInvitation </td><td>  -  </td></tr>
     </table>
   */
  public UserInvitationResponse userInvitationsGetInstance(String id, List<String> fieldsUserInvitations, List<String> include, List<String> fieldsApps, Integer limitVisibleApps) throws ApiException {
    return userInvitationsGetInstanceWithHttpInfo(id, fieldsUserInvitations, include, fieldsApps, limitVisibleApps).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsUserInvitations the fields to include for returned resources of type userInvitations (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param limitVisibleApps maximum number of related visibleApps returned (when they are included) (optional)
   * @return ApiResponse&lt;UserInvitationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single UserInvitation </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<UserInvitationResponse> userInvitationsGetInstanceWithHttpInfo(String id, List<String> fieldsUserInvitations, List<String> include, List<String> fieldsApps, Integer limitVisibleApps) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling userInvitationsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/userInvitations/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[userInvitations]", fieldsUserInvitations)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[apps]", fieldsApps));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[visibleApps]", limitVisibleApps));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<UserInvitationResponse> localVarReturnType = new GenericType<UserInvitationResponse>() {};
    return apiClient.invokeAPI("UserInvitationsApi.userInvitationsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param limit maximum resources per page (optional)
   * @return AppsWithoutIncludesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of Apps with get </td><td>  -  </td></tr>
     </table>
   */
  public AppsWithoutIncludesResponse userInvitationsVisibleAppsGetToManyRelated(String id, List<String> fieldsApps, Integer limit) throws ApiException {
    return userInvitationsVisibleAppsGetToManyRelatedWithHttpInfo(id, fieldsApps, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;AppsWithoutIncludesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of Apps with get </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppsWithoutIncludesResponse> userInvitationsVisibleAppsGetToManyRelatedWithHttpInfo(String id, List<String> fieldsApps, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling userInvitationsVisibleAppsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/userInvitations/{id}/visibleApps"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[apps]", fieldsApps)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppsWithoutIncludesResponse> localVarReturnType = new GenericType<AppsWithoutIncludesResponse>() {};
    return apiClient.invokeAPI("UserInvitationsApi.userInvitationsVisibleAppsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
