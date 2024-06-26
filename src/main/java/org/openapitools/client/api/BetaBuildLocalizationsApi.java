package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.BetaBuildLocalizationCreateRequest;
import org.openapitools.client.model.BetaBuildLocalizationResponse;
import org.openapitools.client.model.BetaBuildLocalizationUpdateRequest;
import org.openapitools.client.model.BetaBuildLocalizationsResponse;
import org.openapitools.client.model.BuildWithoutIncludesResponse;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class BetaBuildLocalizationsApi {
  private ApiClient apiClient;

  public BetaBuildLocalizationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BetaBuildLocalizationsApi(ApiClient apiClient) {
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
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @return BuildWithoutIncludesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single Build with get </td><td>  -  </td></tr>
     </table>
   */
  public BuildWithoutIncludesResponse betaBuildLocalizationsBuildGetToOneRelated(String id, List<String> fieldsBuilds) throws ApiException {
    return betaBuildLocalizationsBuildGetToOneRelatedWithHttpInfo(id, fieldsBuilds).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @return ApiResponse&lt;BuildWithoutIncludesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single Build with get </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BuildWithoutIncludesResponse> betaBuildLocalizationsBuildGetToOneRelatedWithHttpInfo(String id, List<String> fieldsBuilds) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling betaBuildLocalizationsBuildGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/betaBuildLocalizations/{id}/build"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[builds]", fieldsBuilds)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BuildWithoutIncludesResponse> localVarReturnType = new GenericType<BuildWithoutIncludesResponse>() {};
    return apiClient.invokeAPI("BetaBuildLocalizationsApi.betaBuildLocalizationsBuildGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param betaBuildLocalizationCreateRequest BetaBuildLocalization representation (required)
   * @return BetaBuildLocalizationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single BetaBuildLocalization </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public BetaBuildLocalizationResponse betaBuildLocalizationsCreateInstance(BetaBuildLocalizationCreateRequest betaBuildLocalizationCreateRequest) throws ApiException {
    return betaBuildLocalizationsCreateInstanceWithHttpInfo(betaBuildLocalizationCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param betaBuildLocalizationCreateRequest BetaBuildLocalization representation (required)
   * @return ApiResponse&lt;BetaBuildLocalizationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single BetaBuildLocalization </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BetaBuildLocalizationResponse> betaBuildLocalizationsCreateInstanceWithHttpInfo(BetaBuildLocalizationCreateRequest betaBuildLocalizationCreateRequest) throws ApiException {
    // Check required parameters
    if (betaBuildLocalizationCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'betaBuildLocalizationCreateRequest' when calling betaBuildLocalizationsCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BetaBuildLocalizationResponse> localVarReturnType = new GenericType<BetaBuildLocalizationResponse>() {};
    return apiClient.invokeAPI("BetaBuildLocalizationsApi.betaBuildLocalizationsCreateInstance", "/v1/betaBuildLocalizations", "POST", new ArrayList<>(), betaBuildLocalizationCreateRequest,
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
  public void betaBuildLocalizationsDeleteInstance(String id) throws ApiException {
    betaBuildLocalizationsDeleteInstanceWithHttpInfo(id);
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
  public ApiResponse<Void> betaBuildLocalizationsDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling betaBuildLocalizationsDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/betaBuildLocalizations/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("BetaBuildLocalizationsApi.betaBuildLocalizationsDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param filterLocale filter by attribute &#39;locale&#39; (optional)
   * @param filterBuild filter by id(s) of related &#39;build&#39; (optional)
   * @param fieldsBetaBuildLocalizations the fields to include for returned resources of type betaBuildLocalizations (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @return BetaBuildLocalizationsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of BetaBuildLocalizations </td><td>  -  </td></tr>
     </table>
   */
  public BetaBuildLocalizationsResponse betaBuildLocalizationsGetCollection(List<String> filterLocale, List<String> filterBuild, List<String> fieldsBetaBuildLocalizations, Integer limit, List<String> include, List<String> fieldsBuilds) throws ApiException {
    return betaBuildLocalizationsGetCollectionWithHttpInfo(filterLocale, filterBuild, fieldsBetaBuildLocalizations, limit, include, fieldsBuilds).getData();
  }

  /**
   * 
   * 
   * @param filterLocale filter by attribute &#39;locale&#39; (optional)
   * @param filterBuild filter by id(s) of related &#39;build&#39; (optional)
   * @param fieldsBetaBuildLocalizations the fields to include for returned resources of type betaBuildLocalizations (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @return ApiResponse&lt;BetaBuildLocalizationsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of BetaBuildLocalizations </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BetaBuildLocalizationsResponse> betaBuildLocalizationsGetCollectionWithHttpInfo(List<String> filterLocale, List<String> filterBuild, List<String> fieldsBetaBuildLocalizations, Integer limit, List<String> include, List<String> fieldsBuilds) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[locale]", filterLocale)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[build]", filterBuild));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[betaBuildLocalizations]", fieldsBetaBuildLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[builds]", fieldsBuilds));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BetaBuildLocalizationsResponse> localVarReturnType = new GenericType<BetaBuildLocalizationsResponse>() {};
    return apiClient.invokeAPI("BetaBuildLocalizationsApi.betaBuildLocalizationsGetCollection", "/v1/betaBuildLocalizations", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBetaBuildLocalizations the fields to include for returned resources of type betaBuildLocalizations (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @return BetaBuildLocalizationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single BetaBuildLocalization </td><td>  -  </td></tr>
     </table>
   */
  public BetaBuildLocalizationResponse betaBuildLocalizationsGetInstance(String id, List<String> fieldsBetaBuildLocalizations, List<String> include, List<String> fieldsBuilds) throws ApiException {
    return betaBuildLocalizationsGetInstanceWithHttpInfo(id, fieldsBetaBuildLocalizations, include, fieldsBuilds).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBetaBuildLocalizations the fields to include for returned resources of type betaBuildLocalizations (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsBuilds the fields to include for returned resources of type builds (optional)
   * @return ApiResponse&lt;BetaBuildLocalizationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single BetaBuildLocalization </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BetaBuildLocalizationResponse> betaBuildLocalizationsGetInstanceWithHttpInfo(String id, List<String> fieldsBetaBuildLocalizations, List<String> include, List<String> fieldsBuilds) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling betaBuildLocalizationsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/betaBuildLocalizations/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[betaBuildLocalizations]", fieldsBetaBuildLocalizations)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[builds]", fieldsBuilds));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BetaBuildLocalizationResponse> localVarReturnType = new GenericType<BetaBuildLocalizationResponse>() {};
    return apiClient.invokeAPI("BetaBuildLocalizationsApi.betaBuildLocalizationsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param betaBuildLocalizationUpdateRequest BetaBuildLocalization representation (required)
   * @return BetaBuildLocalizationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single BetaBuildLocalization </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public BetaBuildLocalizationResponse betaBuildLocalizationsUpdateInstance(String id, BetaBuildLocalizationUpdateRequest betaBuildLocalizationUpdateRequest) throws ApiException {
    return betaBuildLocalizationsUpdateInstanceWithHttpInfo(id, betaBuildLocalizationUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param betaBuildLocalizationUpdateRequest BetaBuildLocalization representation (required)
   * @return ApiResponse&lt;BetaBuildLocalizationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single BetaBuildLocalization </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BetaBuildLocalizationResponse> betaBuildLocalizationsUpdateInstanceWithHttpInfo(String id, BetaBuildLocalizationUpdateRequest betaBuildLocalizationUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling betaBuildLocalizationsUpdateInstance");
    }
    if (betaBuildLocalizationUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'betaBuildLocalizationUpdateRequest' when calling betaBuildLocalizationsUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/betaBuildLocalizations/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BetaBuildLocalizationResponse> localVarReturnType = new GenericType<BetaBuildLocalizationResponse>() {};
    return apiClient.invokeAPI("BetaBuildLocalizationsApi.betaBuildLocalizationsUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), betaBuildLocalizationUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
