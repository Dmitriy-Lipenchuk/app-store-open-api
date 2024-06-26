package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.AppEncryptionDeclarationBuildsLinkagesRequest;
import org.openapitools.client.model.AppEncryptionDeclarationDocumentResponse;
import org.openapitools.client.model.AppEncryptionDeclarationResponse;
import org.openapitools.client.model.AppEncryptionDeclarationsResponse;
import org.openapitools.client.model.AppWithoutIncludesResponse;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppEncryptionDeclarationsApi {
  private ApiClient apiClient;

  public AppEncryptionDeclarationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AppEncryptionDeclarationsApi(ApiClient apiClient) {
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
   * @param fieldsAppEncryptionDeclarationDocuments the fields to include for returned resources of type appEncryptionDeclarationDocuments (optional)
   * @return AppEncryptionDeclarationDocumentResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppEncryptionDeclarationDocument </td><td>  -  </td></tr>
     </table>
   */
  public AppEncryptionDeclarationDocumentResponse appEncryptionDeclarationsAppEncryptionDeclarationDocumentGetToOneRelated(String id, List<String> fieldsAppEncryptionDeclarationDocuments) throws ApiException {
    return appEncryptionDeclarationsAppEncryptionDeclarationDocumentGetToOneRelatedWithHttpInfo(id, fieldsAppEncryptionDeclarationDocuments).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppEncryptionDeclarationDocuments the fields to include for returned resources of type appEncryptionDeclarationDocuments (optional)
   * @return ApiResponse&lt;AppEncryptionDeclarationDocumentResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppEncryptionDeclarationDocument </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppEncryptionDeclarationDocumentResponse> appEncryptionDeclarationsAppEncryptionDeclarationDocumentGetToOneRelatedWithHttpInfo(String id, List<String> fieldsAppEncryptionDeclarationDocuments) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appEncryptionDeclarationsAppEncryptionDeclarationDocumentGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/appEncryptionDeclarations/{id}/appEncryptionDeclarationDocument"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appEncryptionDeclarationDocuments]", fieldsAppEncryptionDeclarationDocuments)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppEncryptionDeclarationDocumentResponse> localVarReturnType = new GenericType<AppEncryptionDeclarationDocumentResponse>() {};
    return apiClient.invokeAPI("AppEncryptionDeclarationsApi.appEncryptionDeclarationsAppEncryptionDeclarationDocumentGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @return AppWithoutIncludesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single App with get </td><td>  -  </td></tr>
     </table>
   */
  public AppWithoutIncludesResponse appEncryptionDeclarationsAppGetToOneRelated(String id, List<String> fieldsApps) throws ApiException {
    return appEncryptionDeclarationsAppGetToOneRelatedWithHttpInfo(id, fieldsApps).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @return ApiResponse&lt;AppWithoutIncludesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single App with get </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppWithoutIncludesResponse> appEncryptionDeclarationsAppGetToOneRelatedWithHttpInfo(String id, List<String> fieldsApps) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appEncryptionDeclarationsAppGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/appEncryptionDeclarations/{id}/app"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[apps]", fieldsApps)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppWithoutIncludesResponse> localVarReturnType = new GenericType<AppWithoutIncludesResponse>() {};
    return apiClient.invokeAPI("AppEncryptionDeclarationsApi.appEncryptionDeclarationsAppGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appEncryptionDeclarationBuildsLinkagesRequest List of related linkages (required)
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
   * @deprecated
   */
  @Deprecated
  public void appEncryptionDeclarationsBuildsCreateToManyRelationship(String id, AppEncryptionDeclarationBuildsLinkagesRequest appEncryptionDeclarationBuildsLinkagesRequest) throws ApiException {
    appEncryptionDeclarationsBuildsCreateToManyRelationshipWithHttpInfo(id, appEncryptionDeclarationBuildsLinkagesRequest);
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appEncryptionDeclarationBuildsLinkagesRequest List of related linkages (required)
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
   * @deprecated
   */
  @Deprecated
  public ApiResponse<Void> appEncryptionDeclarationsBuildsCreateToManyRelationshipWithHttpInfo(String id, AppEncryptionDeclarationBuildsLinkagesRequest appEncryptionDeclarationBuildsLinkagesRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appEncryptionDeclarationsBuildsCreateToManyRelationship");
    }
    if (appEncryptionDeclarationBuildsLinkagesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appEncryptionDeclarationBuildsLinkagesRequest' when calling appEncryptionDeclarationsBuildsCreateToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/appEncryptionDeclarations/{id}/relationships/builds"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("AppEncryptionDeclarationsApi.appEncryptionDeclarationsBuildsCreateToManyRelationship", localVarPath, "POST", new ArrayList<>(), appEncryptionDeclarationBuildsLinkagesRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param filterPlatform filter by attribute &#39;platform&#39; (optional)
   * @param filterApp filter by id(s) of related &#39;app&#39; (optional)
   * @param filterBuilds filter by id(s) of related &#39;builds&#39; (optional)
   * @param fieldsAppEncryptionDeclarations the fields to include for returned resources of type appEncryptionDeclarations (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsAppEncryptionDeclarationDocuments the fields to include for returned resources of type appEncryptionDeclarationDocuments (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param limitBuilds maximum number of related builds returned (when they are included) (optional)
   * @return AppEncryptionDeclarationsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppEncryptionDeclarations </td><td>  -  </td></tr>
     </table>
   */
  public AppEncryptionDeclarationsResponse appEncryptionDeclarationsGetCollection(List<String> filterPlatform, List<String> filterApp, List<String> filterBuilds, List<String> fieldsAppEncryptionDeclarations, Integer limit, List<String> include, List<String> fieldsAppEncryptionDeclarationDocuments, List<String> fieldsApps, Integer limitBuilds) throws ApiException {
    return appEncryptionDeclarationsGetCollectionWithHttpInfo(filterPlatform, filterApp, filterBuilds, fieldsAppEncryptionDeclarations, limit, include, fieldsAppEncryptionDeclarationDocuments, fieldsApps, limitBuilds).getData();
  }

  /**
   * 
   * 
   * @param filterPlatform filter by attribute &#39;platform&#39; (optional)
   * @param filterApp filter by id(s) of related &#39;app&#39; (optional)
   * @param filterBuilds filter by id(s) of related &#39;builds&#39; (optional)
   * @param fieldsAppEncryptionDeclarations the fields to include for returned resources of type appEncryptionDeclarations (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsAppEncryptionDeclarationDocuments the fields to include for returned resources of type appEncryptionDeclarationDocuments (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param limitBuilds maximum number of related builds returned (when they are included) (optional)
   * @return ApiResponse&lt;AppEncryptionDeclarationsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AppEncryptionDeclarations </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppEncryptionDeclarationsResponse> appEncryptionDeclarationsGetCollectionWithHttpInfo(List<String> filterPlatform, List<String> filterApp, List<String> filterBuilds, List<String> fieldsAppEncryptionDeclarations, Integer limit, List<String> include, List<String> fieldsAppEncryptionDeclarationDocuments, List<String> fieldsApps, Integer limitBuilds) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[platform]", filterPlatform)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[app]", filterApp));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[builds]", filterBuilds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appEncryptionDeclarations]", fieldsAppEncryptionDeclarations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appEncryptionDeclarationDocuments]", fieldsAppEncryptionDeclarationDocuments));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[apps]", fieldsApps));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[builds]", limitBuilds));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppEncryptionDeclarationsResponse> localVarReturnType = new GenericType<AppEncryptionDeclarationsResponse>() {};
    return apiClient.invokeAPI("AppEncryptionDeclarationsApi.appEncryptionDeclarationsGetCollection", "/v1/appEncryptionDeclarations", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppEncryptionDeclarations the fields to include for returned resources of type appEncryptionDeclarations (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsAppEncryptionDeclarationDocuments the fields to include for returned resources of type appEncryptionDeclarationDocuments (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param limitBuilds maximum number of related builds returned (when they are included) (optional)
   * @return AppEncryptionDeclarationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppEncryptionDeclaration </td><td>  -  </td></tr>
     </table>
   */
  public AppEncryptionDeclarationResponse appEncryptionDeclarationsGetInstance(String id, List<String> fieldsAppEncryptionDeclarations, List<String> include, List<String> fieldsAppEncryptionDeclarationDocuments, List<String> fieldsApps, Integer limitBuilds) throws ApiException {
    return appEncryptionDeclarationsGetInstanceWithHttpInfo(id, fieldsAppEncryptionDeclarations, include, fieldsAppEncryptionDeclarationDocuments, fieldsApps, limitBuilds).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppEncryptionDeclarations the fields to include for returned resources of type appEncryptionDeclarations (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsAppEncryptionDeclarationDocuments the fields to include for returned resources of type appEncryptionDeclarationDocuments (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param limitBuilds maximum number of related builds returned (when they are included) (optional)
   * @return ApiResponse&lt;AppEncryptionDeclarationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppEncryptionDeclaration </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppEncryptionDeclarationResponse> appEncryptionDeclarationsGetInstanceWithHttpInfo(String id, List<String> fieldsAppEncryptionDeclarations, List<String> include, List<String> fieldsAppEncryptionDeclarationDocuments, List<String> fieldsApps, Integer limitBuilds) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appEncryptionDeclarationsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appEncryptionDeclarations/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appEncryptionDeclarations]", fieldsAppEncryptionDeclarations)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appEncryptionDeclarationDocuments]", fieldsAppEncryptionDeclarationDocuments));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[apps]", fieldsApps));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[builds]", limitBuilds));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppEncryptionDeclarationResponse> localVarReturnType = new GenericType<AppEncryptionDeclarationResponse>() {};
    return apiClient.invokeAPI("AppEncryptionDeclarationsApi.appEncryptionDeclarationsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
