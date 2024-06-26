package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.AppsWithoutIncludesResponse;
import org.openapitools.client.model.BetaGroupsWithoutIncludesResponse;
import org.openapitools.client.model.BetaTesterAppsLinkagesRequest;
import org.openapitools.client.model.BetaTesterAppsLinkagesResponse;
import org.openapitools.client.model.BetaTesterBetaGroupsLinkagesRequest;
import org.openapitools.client.model.BetaTesterBetaGroupsLinkagesResponse;
import org.openapitools.client.model.BetaTesterBuildsLinkagesRequest;
import org.openapitools.client.model.BetaTesterBuildsLinkagesResponse;
import org.openapitools.client.model.BetaTesterCreateRequest;
import org.openapitools.client.model.BetaTesterResponse;
import org.openapitools.client.model.BetaTesterUsagesV1MetricResponse;
import org.openapitools.client.model.BetaTestersResponse;
import org.openapitools.client.model.BuildsWithoutIncludesResponse;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class BetaTestersApi {
  private ApiClient apiClient;

  public BetaTestersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BetaTestersApi(ApiClient apiClient) {
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
   * @param betaTesterAppsLinkagesRequest List of related linkages (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 202 </td><td> Accepted for future completion </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success (no content) </td><td>  -  </td></tr>
     </table>
   */
  public void betaTestersAppsDeleteToManyRelationship(String id, BetaTesterAppsLinkagesRequest betaTesterAppsLinkagesRequest) throws ApiException {
    betaTestersAppsDeleteToManyRelationshipWithHttpInfo(id, betaTesterAppsLinkagesRequest);
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param betaTesterAppsLinkagesRequest List of related linkages (required)
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
       <tr><td> 202 </td><td> Accepted for future completion </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success (no content) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> betaTestersAppsDeleteToManyRelationshipWithHttpInfo(String id, BetaTesterAppsLinkagesRequest betaTesterAppsLinkagesRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling betaTestersAppsDeleteToManyRelationship");
    }
    if (betaTesterAppsLinkagesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'betaTesterAppsLinkagesRequest' when calling betaTestersAppsDeleteToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/betaTesters/{id}/relationships/apps"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("BetaTestersApi.betaTestersAppsDeleteToManyRelationship", localVarPath, "DELETE", new ArrayList<>(), betaTesterAppsLinkagesRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
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
  public AppsWithoutIncludesResponse betaTestersAppsGetToManyRelated(String id, List<String> fieldsApps, Integer limit) throws ApiException {
    return betaTestersAppsGetToManyRelatedWithHttpInfo(id, fieldsApps, limit).getData();
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
  public ApiResponse<AppsWithoutIncludesResponse> betaTestersAppsGetToManyRelatedWithHttpInfo(String id, List<String> fieldsApps, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling betaTestersAppsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/betaTesters/{id}/apps"
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
    return apiClient.invokeAPI("BetaTestersApi.betaTestersAppsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param limit maximum resources per page (optional)
   * @return BetaTesterAppsLinkagesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of related linkages </td><td>  -  </td></tr>
     </table>
   */
  public BetaTesterAppsLinkagesResponse betaTestersAppsGetToManyRelationship(String id, Integer limit) throws ApiException {
    return betaTestersAppsGetToManyRelationshipWithHttpInfo(id, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;BetaTesterAppsLinkagesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of related linkages </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BetaTesterAppsLinkagesResponse> betaTestersAppsGetToManyRelationshipWithHttpInfo(String id, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling betaTestersAppsGetToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/betaTesters/{id}/relationships/apps"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "limit", limit)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BetaTesterAppsLinkagesResponse> localVarReturnType = new GenericType<BetaTesterAppsLinkagesResponse>() {};
    return apiClient.invokeAPI("BetaTestersApi.betaTestersAppsGetToManyRelationship", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param betaTesterBetaGroupsLinkagesRequest List of related linkages (required)
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
  public void betaTestersBetaGroupsCreateToManyRelationship(String id, BetaTesterBetaGroupsLinkagesRequest betaTesterBetaGroupsLinkagesRequest) throws ApiException {
    betaTestersBetaGroupsCreateToManyRelationshipWithHttpInfo(id, betaTesterBetaGroupsLinkagesRequest);
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param betaTesterBetaGroupsLinkagesRequest List of related linkages (required)
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
  public ApiResponse<Void> betaTestersBetaGroupsCreateToManyRelationshipWithHttpInfo(String id, BetaTesterBetaGroupsLinkagesRequest betaTesterBetaGroupsLinkagesRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling betaTestersBetaGroupsCreateToManyRelationship");
    }
    if (betaTesterBetaGroupsLinkagesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'betaTesterBetaGroupsLinkagesRequest' when calling betaTestersBetaGroupsCreateToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/betaTesters/{id}/relationships/betaGroups"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("BetaTestersApi.betaTestersBetaGroupsCreateToManyRelationship", localVarPath, "POST", new ArrayList<>(), betaTesterBetaGroupsLinkagesRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param betaTesterBetaGroupsLinkagesRequest List of related linkages (required)
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
  public void betaTestersBetaGroupsDeleteToManyRelationship(String id, BetaTesterBetaGroupsLinkagesRequest betaTesterBetaGroupsLinkagesRequest) throws ApiException {
    betaTestersBetaGroupsDeleteToManyRelationshipWithHttpInfo(id, betaTesterBetaGroupsLinkagesRequest);
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param betaTesterBetaGroupsLinkagesRequest List of related linkages (required)
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
  public ApiResponse<Void> betaTestersBetaGroupsDeleteToManyRelationshipWithHttpInfo(String id, BetaTesterBetaGroupsLinkagesRequest betaTesterBetaGroupsLinkagesRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling betaTestersBetaGroupsDeleteToManyRelationship");
    }
    if (betaTesterBetaGroupsLinkagesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'betaTesterBetaGroupsLinkagesRequest' when calling betaTestersBetaGroupsDeleteToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/betaTesters/{id}/relationships/betaGroups"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("BetaTestersApi.betaTestersBetaGroupsDeleteToManyRelationship", localVarPath, "DELETE", new ArrayList<>(), betaTesterBetaGroupsLinkagesRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBetaGroups the fields to include for returned resources of type betaGroups (optional)
   * @param limit maximum resources per page (optional)
   * @return BetaGroupsWithoutIncludesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of BetaGroups with get </td><td>  -  </td></tr>
     </table>
   */
  public BetaGroupsWithoutIncludesResponse betaTestersBetaGroupsGetToManyRelated(String id, List<String> fieldsBetaGroups, Integer limit) throws ApiException {
    return betaTestersBetaGroupsGetToManyRelatedWithHttpInfo(id, fieldsBetaGroups, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBetaGroups the fields to include for returned resources of type betaGroups (optional)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;BetaGroupsWithoutIncludesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of BetaGroups with get </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BetaGroupsWithoutIncludesResponse> betaTestersBetaGroupsGetToManyRelatedWithHttpInfo(String id, List<String> fieldsBetaGroups, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling betaTestersBetaGroupsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/betaTesters/{id}/betaGroups"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[betaGroups]", fieldsBetaGroups)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BetaGroupsWithoutIncludesResponse> localVarReturnType = new GenericType<BetaGroupsWithoutIncludesResponse>() {};
    return apiClient.invokeAPI("BetaTestersApi.betaTestersBetaGroupsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param limit maximum resources per page (optional)
   * @return BetaTesterBetaGroupsLinkagesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of related linkages </td><td>  -  </td></tr>
     </table>
   */
  public BetaTesterBetaGroupsLinkagesResponse betaTestersBetaGroupsGetToManyRelationship(String id, Integer limit) throws ApiException {
    return betaTestersBetaGroupsGetToManyRelationshipWithHttpInfo(id, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;BetaTesterBetaGroupsLinkagesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of related linkages </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BetaTesterBetaGroupsLinkagesResponse> betaTestersBetaGroupsGetToManyRelationshipWithHttpInfo(String id, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling betaTestersBetaGroupsGetToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/betaTesters/{id}/relationships/betaGroups"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "limit", limit)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BetaTesterBetaGroupsLinkagesResponse> localVarReturnType = new GenericType<BetaTesterBetaGroupsLinkagesResponse>() {};
    return apiClient.invokeAPI("BetaTestersApi.betaTestersBetaGroupsGetToManyRelationship", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterApps filter by &#39;apps&#39; relationship dimension (required)
   * @param limit maximum number of groups to return per page (optional)
   * @param period the duration of the reporting period (optional)
   * @return BetaTesterUsagesV1MetricResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Metrics data response </td><td>  -  </td></tr>
     </table>
   */
  public BetaTesterUsagesV1MetricResponse betaTestersBetaTesterUsagesGetMetrics(String id, String filterApps, Integer limit, String period) throws ApiException {
    return betaTestersBetaTesterUsagesGetMetricsWithHttpInfo(id, filterApps, limit, period).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterApps filter by &#39;apps&#39; relationship dimension (required)
   * @param limit maximum number of groups to return per page (optional)
   * @param period the duration of the reporting period (optional)
   * @return ApiResponse&lt;BetaTesterUsagesV1MetricResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Metrics data response </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BetaTesterUsagesV1MetricResponse> betaTestersBetaTesterUsagesGetMetricsWithHttpInfo(String id, String filterApps, Integer limit, String period) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling betaTestersBetaTesterUsagesGetMetrics");
    }
    if (filterApps == null) {
      throw new ApiException(400, "Missing the required parameter 'filterApps' when calling betaTestersBetaTesterUsagesGetMetrics");
    }

    // Path parameters
    String localVarPath = "/v1/betaTesters/{id}/metrics/betaTesterUsages"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "limit", limit)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter[apps]", filterApps));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "period", period));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BetaTesterUsagesV1MetricResponse> localVarReturnType = new GenericType<BetaTesterUsagesV1MetricResponse>() {};
    return apiClient.invokeAPI("BetaTestersApi.betaTestersBetaTesterUsagesGetMetrics", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param betaTesterBuildsLinkagesRequest List of related linkages (required)
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
  public void betaTestersBuildsCreateToManyRelationship(String id, BetaTesterBuildsLinkagesRequest betaTesterBuildsLinkagesRequest) throws ApiException {
    betaTestersBuildsCreateToManyRelationshipWithHttpInfo(id, betaTesterBuildsLinkagesRequest);
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param betaTesterBuildsLinkagesRequest List of related linkages (required)
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
  public ApiResponse<Void> betaTestersBuildsCreateToManyRelationshipWithHttpInfo(String id, BetaTesterBuildsLinkagesRequest betaTesterBuildsLinkagesRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling betaTestersBuildsCreateToManyRelationship");
    }
    if (betaTesterBuildsLinkagesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'betaTesterBuildsLinkagesRequest' when calling betaTestersBuildsCreateToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/betaTesters/{id}/relationships/builds"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("BetaTestersApi.betaTestersBuildsCreateToManyRelationship", localVarPath, "POST", new ArrayList<>(), betaTesterBuildsLinkagesRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param betaTesterBuildsLinkagesRequest List of related linkages (required)
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
  public void betaTestersBuildsDeleteToManyRelationship(String id, BetaTesterBuildsLinkagesRequest betaTesterBuildsLinkagesRequest) throws ApiException {
    betaTestersBuildsDeleteToManyRelationshipWithHttpInfo(id, betaTesterBuildsLinkagesRequest);
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param betaTesterBuildsLinkagesRequest List of related linkages (required)
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
  public ApiResponse<Void> betaTestersBuildsDeleteToManyRelationshipWithHttpInfo(String id, BetaTesterBuildsLinkagesRequest betaTesterBuildsLinkagesRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling betaTestersBuildsDeleteToManyRelationship");
    }
    if (betaTesterBuildsLinkagesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'betaTesterBuildsLinkagesRequest' when calling betaTestersBuildsDeleteToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/betaTesters/{id}/relationships/builds"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("BetaTestersApi.betaTestersBuildsDeleteToManyRelationship", localVarPath, "DELETE", new ArrayList<>(), betaTesterBuildsLinkagesRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @param limit maximum resources per page (optional)
   * @return BuildsWithoutIncludesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of Builds with get </td><td>  -  </td></tr>
     </table>
   */
  public BuildsWithoutIncludesResponse betaTestersBuildsGetToManyRelated(String id, List<String> fieldsBuilds, Integer limit) throws ApiException {
    return betaTestersBuildsGetToManyRelatedWithHttpInfo(id, fieldsBuilds, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;BuildsWithoutIncludesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of Builds with get </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BuildsWithoutIncludesResponse> betaTestersBuildsGetToManyRelatedWithHttpInfo(String id, List<String> fieldsBuilds, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling betaTestersBuildsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/betaTesters/{id}/builds"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[builds]", fieldsBuilds)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BuildsWithoutIncludesResponse> localVarReturnType = new GenericType<BuildsWithoutIncludesResponse>() {};
    return apiClient.invokeAPI("BetaTestersApi.betaTestersBuildsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param limit maximum resources per page (optional)
   * @return BetaTesterBuildsLinkagesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of related linkages </td><td>  -  </td></tr>
     </table>
   */
  public BetaTesterBuildsLinkagesResponse betaTestersBuildsGetToManyRelationship(String id, Integer limit) throws ApiException {
    return betaTestersBuildsGetToManyRelationshipWithHttpInfo(id, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;BetaTesterBuildsLinkagesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of related linkages </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BetaTesterBuildsLinkagesResponse> betaTestersBuildsGetToManyRelationshipWithHttpInfo(String id, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling betaTestersBuildsGetToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/betaTesters/{id}/relationships/builds"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "limit", limit)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BetaTesterBuildsLinkagesResponse> localVarReturnType = new GenericType<BetaTesterBuildsLinkagesResponse>() {};
    return apiClient.invokeAPI("BetaTestersApi.betaTestersBuildsGetToManyRelationship", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param betaTesterCreateRequest BetaTester representation (required)
   * @return BetaTesterResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single BetaTester </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public BetaTesterResponse betaTestersCreateInstance(BetaTesterCreateRequest betaTesterCreateRequest) throws ApiException {
    return betaTestersCreateInstanceWithHttpInfo(betaTesterCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param betaTesterCreateRequest BetaTester representation (required)
   * @return ApiResponse&lt;BetaTesterResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single BetaTester </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BetaTesterResponse> betaTestersCreateInstanceWithHttpInfo(BetaTesterCreateRequest betaTesterCreateRequest) throws ApiException {
    // Check required parameters
    if (betaTesterCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'betaTesterCreateRequest' when calling betaTestersCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BetaTesterResponse> localVarReturnType = new GenericType<BetaTesterResponse>() {};
    return apiClient.invokeAPI("BetaTestersApi.betaTestersCreateInstance", "/v1/betaTesters", "POST", new ArrayList<>(), betaTesterCreateRequest,
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
       <tr><td> 202 </td><td> Accepted for future completion </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success (no content) </td><td>  -  </td></tr>
     </table>
   */
  public void betaTestersDeleteInstance(String id) throws ApiException {
    betaTestersDeleteInstanceWithHttpInfo(id);
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
       <tr><td> 202 </td><td> Accepted for future completion </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success (no content) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> betaTestersDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling betaTestersDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/betaTesters/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("BetaTestersApi.betaTestersDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param filterEmail filter by attribute &#39;email&#39; (optional)
   * @param filterFirstName filter by attribute &#39;firstName&#39; (optional)
   * @param filterInviteType filter by attribute &#39;inviteType&#39; (optional)
   * @param filterLastName filter by attribute &#39;lastName&#39; (optional)
   * @param filterApps filter by id(s) of related &#39;apps&#39; (optional)
   * @param filterBetaGroups filter by id(s) of related &#39;betaGroups&#39; (optional)
   * @param filterBuilds filter by id(s) of related &#39;builds&#39; (optional)
   * @param filterId filter by id(s) (optional)
   * @param sort comma-separated list of sort expressions; resources will be sorted as specified (optional)
   * @param fieldsBetaTesters the fields to include for returned resources of type betaTesters (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @param fieldsBetaGroups the fields to include for returned resources of type betaGroups (optional)
   * @param limitApps maximum number of related apps returned (when they are included) (optional)
   * @param limitBetaGroups maximum number of related betaGroups returned (when they are included) (optional)
   * @param limitBuilds maximum number of related builds returned (when they are included) (optional)
   * @return BetaTestersResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of BetaTesters </td><td>  -  </td></tr>
     </table>
   */
  public BetaTestersResponse betaTestersGetCollection(List<String> filterEmail, List<String> filterFirstName, List<String> filterInviteType, List<String> filterLastName, List<String> filterApps, List<String> filterBetaGroups, List<String> filterBuilds, List<String> filterId, List<String> sort, List<String> fieldsBetaTesters, Integer limit, List<String> include, List<String> fieldsApps, List<String> fieldsBuilds, List<String> fieldsBetaGroups, Integer limitApps, Integer limitBetaGroups, Integer limitBuilds) throws ApiException {
    return betaTestersGetCollectionWithHttpInfo(filterEmail, filterFirstName, filterInviteType, filterLastName, filterApps, filterBetaGroups, filterBuilds, filterId, sort, fieldsBetaTesters, limit, include, fieldsApps, fieldsBuilds, fieldsBetaGroups, limitApps, limitBetaGroups, limitBuilds).getData();
  }

  /**
   * 
   * 
   * @param filterEmail filter by attribute &#39;email&#39; (optional)
   * @param filterFirstName filter by attribute &#39;firstName&#39; (optional)
   * @param filterInviteType filter by attribute &#39;inviteType&#39; (optional)
   * @param filterLastName filter by attribute &#39;lastName&#39; (optional)
   * @param filterApps filter by id(s) of related &#39;apps&#39; (optional)
   * @param filterBetaGroups filter by id(s) of related &#39;betaGroups&#39; (optional)
   * @param filterBuilds filter by id(s) of related &#39;builds&#39; (optional)
   * @param filterId filter by id(s) (optional)
   * @param sort comma-separated list of sort expressions; resources will be sorted as specified (optional)
   * @param fieldsBetaTesters the fields to include for returned resources of type betaTesters (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @param fieldsBetaGroups the fields to include for returned resources of type betaGroups (optional)
   * @param limitApps maximum number of related apps returned (when they are included) (optional)
   * @param limitBetaGroups maximum number of related betaGroups returned (when they are included) (optional)
   * @param limitBuilds maximum number of related builds returned (when they are included) (optional)
   * @return ApiResponse&lt;BetaTestersResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of BetaTesters </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BetaTestersResponse> betaTestersGetCollectionWithHttpInfo(List<String> filterEmail, List<String> filterFirstName, List<String> filterInviteType, List<String> filterLastName, List<String> filterApps, List<String> filterBetaGroups, List<String> filterBuilds, List<String> filterId, List<String> sort, List<String> fieldsBetaTesters, Integer limit, List<String> include, List<String> fieldsApps, List<String> fieldsBuilds, List<String> fieldsBetaGroups, Integer limitApps, Integer limitBetaGroups, Integer limitBuilds) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[email]", filterEmail)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[firstName]", filterFirstName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[inviteType]", filterInviteType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[lastName]", filterLastName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[apps]", filterApps));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[betaGroups]", filterBetaGroups));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[builds]", filterBuilds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[id]", filterId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[betaTesters]", fieldsBetaTesters));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[apps]", fieldsApps));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[builds]", fieldsBuilds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[betaGroups]", fieldsBetaGroups));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[apps]", limitApps));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[betaGroups]", limitBetaGroups));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[builds]", limitBuilds));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BetaTestersResponse> localVarReturnType = new GenericType<BetaTestersResponse>() {};
    return apiClient.invokeAPI("BetaTestersApi.betaTestersGetCollection", "/v1/betaTesters", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBetaTesters the fields to include for returned resources of type betaTesters (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @param fieldsBetaGroups the fields to include for returned resources of type betaGroups (optional)
   * @param limitApps maximum number of related apps returned (when they are included) (optional)
   * @param limitBetaGroups maximum number of related betaGroups returned (when they are included) (optional)
   * @param limitBuilds maximum number of related builds returned (when they are included) (optional)
   * @return BetaTesterResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single BetaTester </td><td>  -  </td></tr>
     </table>
   */
  public BetaTesterResponse betaTestersGetInstance(String id, List<String> fieldsBetaTesters, List<String> include, List<String> fieldsApps, List<String> fieldsBuilds, List<String> fieldsBetaGroups, Integer limitApps, Integer limitBetaGroups, Integer limitBuilds) throws ApiException {
    return betaTestersGetInstanceWithHttpInfo(id, fieldsBetaTesters, include, fieldsApps, fieldsBuilds, fieldsBetaGroups, limitApps, limitBetaGroups, limitBuilds).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBetaTesters the fields to include for returned resources of type betaTesters (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @param fieldsBetaGroups the fields to include for returned resources of type betaGroups (optional)
   * @param limitApps maximum number of related apps returned (when they are included) (optional)
   * @param limitBetaGroups maximum number of related betaGroups returned (when they are included) (optional)
   * @param limitBuilds maximum number of related builds returned (when they are included) (optional)
   * @return ApiResponse&lt;BetaTesterResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single BetaTester </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BetaTesterResponse> betaTestersGetInstanceWithHttpInfo(String id, List<String> fieldsBetaTesters, List<String> include, List<String> fieldsApps, List<String> fieldsBuilds, List<String> fieldsBetaGroups, Integer limitApps, Integer limitBetaGroups, Integer limitBuilds) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling betaTestersGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/betaTesters/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[betaTesters]", fieldsBetaTesters)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[apps]", fieldsApps));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[builds]", fieldsBuilds));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[betaGroups]", fieldsBetaGroups));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[apps]", limitApps));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[betaGroups]", limitBetaGroups));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[builds]", limitBuilds));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BetaTesterResponse> localVarReturnType = new GenericType<BetaTesterResponse>() {};
    return apiClient.invokeAPI("BetaTestersApi.betaTestersGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
