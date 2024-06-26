package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.AppWithoutIncludesResponse;
import org.openapitools.client.model.BetaLicenseAgreementResponse;
import org.openapitools.client.model.BetaLicenseAgreementUpdateRequest;
import org.openapitools.client.model.BetaLicenseAgreementsResponse;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class BetaLicenseAgreementsApi {
  private ApiClient apiClient;

  public BetaLicenseAgreementsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BetaLicenseAgreementsApi(ApiClient apiClient) {
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
  public AppWithoutIncludesResponse betaLicenseAgreementsAppGetToOneRelated(String id, List<String> fieldsApps) throws ApiException {
    return betaLicenseAgreementsAppGetToOneRelatedWithHttpInfo(id, fieldsApps).getData();
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
  public ApiResponse<AppWithoutIncludesResponse> betaLicenseAgreementsAppGetToOneRelatedWithHttpInfo(String id, List<String> fieldsApps) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling betaLicenseAgreementsAppGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/betaLicenseAgreements/{id}/app"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[apps]", fieldsApps)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppWithoutIncludesResponse> localVarReturnType = new GenericType<AppWithoutIncludesResponse>() {};
    return apiClient.invokeAPI("BetaLicenseAgreementsApi.betaLicenseAgreementsAppGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param filterApp filter by id(s) of related &#39;app&#39; (optional)
   * @param fieldsBetaLicenseAgreements the fields to include for returned resources of type betaLicenseAgreements (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @return BetaLicenseAgreementsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of BetaLicenseAgreements </td><td>  -  </td></tr>
     </table>
   */
  public BetaLicenseAgreementsResponse betaLicenseAgreementsGetCollection(List<String> filterApp, List<String> fieldsBetaLicenseAgreements, Integer limit, List<String> include, List<String> fieldsApps) throws ApiException {
    return betaLicenseAgreementsGetCollectionWithHttpInfo(filterApp, fieldsBetaLicenseAgreements, limit, include, fieldsApps).getData();
  }

  /**
   * 
   * 
   * @param filterApp filter by id(s) of related &#39;app&#39; (optional)
   * @param fieldsBetaLicenseAgreements the fields to include for returned resources of type betaLicenseAgreements (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @return ApiResponse&lt;BetaLicenseAgreementsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of BetaLicenseAgreements </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BetaLicenseAgreementsResponse> betaLicenseAgreementsGetCollectionWithHttpInfo(List<String> filterApp, List<String> fieldsBetaLicenseAgreements, Integer limit, List<String> include, List<String> fieldsApps) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[app]", filterApp)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[betaLicenseAgreements]", fieldsBetaLicenseAgreements));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[apps]", fieldsApps));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BetaLicenseAgreementsResponse> localVarReturnType = new GenericType<BetaLicenseAgreementsResponse>() {};
    return apiClient.invokeAPI("BetaLicenseAgreementsApi.betaLicenseAgreementsGetCollection", "/v1/betaLicenseAgreements", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBetaLicenseAgreements the fields to include for returned resources of type betaLicenseAgreements (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @return BetaLicenseAgreementResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single BetaLicenseAgreement </td><td>  -  </td></tr>
     </table>
   */
  public BetaLicenseAgreementResponse betaLicenseAgreementsGetInstance(String id, List<String> fieldsBetaLicenseAgreements, List<String> include, List<String> fieldsApps) throws ApiException {
    return betaLicenseAgreementsGetInstanceWithHttpInfo(id, fieldsBetaLicenseAgreements, include, fieldsApps).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsBetaLicenseAgreements the fields to include for returned resources of type betaLicenseAgreements (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsApps the fields to include for returned resources of type apps (optional)
   * @return ApiResponse&lt;BetaLicenseAgreementResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single BetaLicenseAgreement </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BetaLicenseAgreementResponse> betaLicenseAgreementsGetInstanceWithHttpInfo(String id, List<String> fieldsBetaLicenseAgreements, List<String> include, List<String> fieldsApps) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling betaLicenseAgreementsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/betaLicenseAgreements/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[betaLicenseAgreements]", fieldsBetaLicenseAgreements)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[apps]", fieldsApps));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BetaLicenseAgreementResponse> localVarReturnType = new GenericType<BetaLicenseAgreementResponse>() {};
    return apiClient.invokeAPI("BetaLicenseAgreementsApi.betaLicenseAgreementsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param betaLicenseAgreementUpdateRequest BetaLicenseAgreement representation (required)
   * @return BetaLicenseAgreementResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single BetaLicenseAgreement </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public BetaLicenseAgreementResponse betaLicenseAgreementsUpdateInstance(String id, BetaLicenseAgreementUpdateRequest betaLicenseAgreementUpdateRequest) throws ApiException {
    return betaLicenseAgreementsUpdateInstanceWithHttpInfo(id, betaLicenseAgreementUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param betaLicenseAgreementUpdateRequest BetaLicenseAgreement representation (required)
   * @return ApiResponse&lt;BetaLicenseAgreementResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single BetaLicenseAgreement </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<BetaLicenseAgreementResponse> betaLicenseAgreementsUpdateInstanceWithHttpInfo(String id, BetaLicenseAgreementUpdateRequest betaLicenseAgreementUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling betaLicenseAgreementsUpdateInstance");
    }
    if (betaLicenseAgreementUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'betaLicenseAgreementUpdateRequest' when calling betaLicenseAgreementsUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/betaLicenseAgreements/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<BetaLicenseAgreementResponse> localVarReturnType = new GenericType<BetaLicenseAgreementResponse>() {};
    return apiClient.invokeAPI("BetaLicenseAgreementsApi.betaLicenseAgreementsUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), betaLicenseAgreementUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
