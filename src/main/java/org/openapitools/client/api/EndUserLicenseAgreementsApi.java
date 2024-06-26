package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.EndUserLicenseAgreementCreateRequest;
import org.openapitools.client.model.EndUserLicenseAgreementResponse;
import org.openapitools.client.model.EndUserLicenseAgreementUpdateRequest;
import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.TerritoriesWithoutIncludesResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class EndUserLicenseAgreementsApi {
  private ApiClient apiClient;

  public EndUserLicenseAgreementsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EndUserLicenseAgreementsApi(ApiClient apiClient) {
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
   * @param endUserLicenseAgreementCreateRequest EndUserLicenseAgreement representation (required)
   * @return EndUserLicenseAgreementResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single EndUserLicenseAgreement </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public EndUserLicenseAgreementResponse endUserLicenseAgreementsCreateInstance(EndUserLicenseAgreementCreateRequest endUserLicenseAgreementCreateRequest) throws ApiException {
    return endUserLicenseAgreementsCreateInstanceWithHttpInfo(endUserLicenseAgreementCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param endUserLicenseAgreementCreateRequest EndUserLicenseAgreement representation (required)
   * @return ApiResponse&lt;EndUserLicenseAgreementResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single EndUserLicenseAgreement </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EndUserLicenseAgreementResponse> endUserLicenseAgreementsCreateInstanceWithHttpInfo(EndUserLicenseAgreementCreateRequest endUserLicenseAgreementCreateRequest) throws ApiException {
    // Check required parameters
    if (endUserLicenseAgreementCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'endUserLicenseAgreementCreateRequest' when calling endUserLicenseAgreementsCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<EndUserLicenseAgreementResponse> localVarReturnType = new GenericType<EndUserLicenseAgreementResponse>() {};
    return apiClient.invokeAPI("EndUserLicenseAgreementsApi.endUserLicenseAgreementsCreateInstance", "/v1/endUserLicenseAgreements", "POST", new ArrayList<>(), endUserLicenseAgreementCreateRequest,
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
  public void endUserLicenseAgreementsDeleteInstance(String id) throws ApiException {
    endUserLicenseAgreementsDeleteInstanceWithHttpInfo(id);
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
  public ApiResponse<Void> endUserLicenseAgreementsDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling endUserLicenseAgreementsDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/endUserLicenseAgreements/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("EndUserLicenseAgreementsApi.endUserLicenseAgreementsDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsEndUserLicenseAgreements the fields to include for returned resources of type endUserLicenseAgreements (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limitTerritories maximum number of related territories returned (when they are included) (optional)
   * @return EndUserLicenseAgreementResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single EndUserLicenseAgreement </td><td>  -  </td></tr>
     </table>
   */
  public EndUserLicenseAgreementResponse endUserLicenseAgreementsGetInstance(String id, List<String> fieldsEndUserLicenseAgreements, List<String> include, List<String> fieldsTerritories, Integer limitTerritories) throws ApiException {
    return endUserLicenseAgreementsGetInstanceWithHttpInfo(id, fieldsEndUserLicenseAgreements, include, fieldsTerritories, limitTerritories).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsEndUserLicenseAgreements the fields to include for returned resources of type endUserLicenseAgreements (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limitTerritories maximum number of related territories returned (when they are included) (optional)
   * @return ApiResponse&lt;EndUserLicenseAgreementResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single EndUserLicenseAgreement </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EndUserLicenseAgreementResponse> endUserLicenseAgreementsGetInstanceWithHttpInfo(String id, List<String> fieldsEndUserLicenseAgreements, List<String> include, List<String> fieldsTerritories, Integer limitTerritories) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling endUserLicenseAgreementsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/endUserLicenseAgreements/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[endUserLicenseAgreements]", fieldsEndUserLicenseAgreements)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[territories]", fieldsTerritories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[territories]", limitTerritories));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<EndUserLicenseAgreementResponse> localVarReturnType = new GenericType<EndUserLicenseAgreementResponse>() {};
    return apiClient.invokeAPI("EndUserLicenseAgreementsApi.endUserLicenseAgreementsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limit maximum resources per page (optional)
   * @return TerritoriesWithoutIncludesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of Territories with get </td><td>  -  </td></tr>
     </table>
   */
  public TerritoriesWithoutIncludesResponse endUserLicenseAgreementsTerritoriesGetToManyRelated(String id, List<String> fieldsTerritories, Integer limit) throws ApiException {
    return endUserLicenseAgreementsTerritoriesGetToManyRelatedWithHttpInfo(id, fieldsTerritories, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;TerritoriesWithoutIncludesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of Territories with get </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TerritoriesWithoutIncludesResponse> endUserLicenseAgreementsTerritoriesGetToManyRelatedWithHttpInfo(String id, List<String> fieldsTerritories, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling endUserLicenseAgreementsTerritoriesGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/endUserLicenseAgreements/{id}/territories"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[territories]", fieldsTerritories)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<TerritoriesWithoutIncludesResponse> localVarReturnType = new GenericType<TerritoriesWithoutIncludesResponse>() {};
    return apiClient.invokeAPI("EndUserLicenseAgreementsApi.endUserLicenseAgreementsTerritoriesGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param endUserLicenseAgreementUpdateRequest EndUserLicenseAgreement representation (required)
   * @return EndUserLicenseAgreementResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single EndUserLicenseAgreement </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public EndUserLicenseAgreementResponse endUserLicenseAgreementsUpdateInstance(String id, EndUserLicenseAgreementUpdateRequest endUserLicenseAgreementUpdateRequest) throws ApiException {
    return endUserLicenseAgreementsUpdateInstanceWithHttpInfo(id, endUserLicenseAgreementUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param endUserLicenseAgreementUpdateRequest EndUserLicenseAgreement representation (required)
   * @return ApiResponse&lt;EndUserLicenseAgreementResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single EndUserLicenseAgreement </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<EndUserLicenseAgreementResponse> endUserLicenseAgreementsUpdateInstanceWithHttpInfo(String id, EndUserLicenseAgreementUpdateRequest endUserLicenseAgreementUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling endUserLicenseAgreementsUpdateInstance");
    }
    if (endUserLicenseAgreementUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'endUserLicenseAgreementUpdateRequest' when calling endUserLicenseAgreementsUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/endUserLicenseAgreements/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<EndUserLicenseAgreementResponse> localVarReturnType = new GenericType<EndUserLicenseAgreementResponse>() {};
    return apiClient.invokeAPI("EndUserLicenseAgreementsApi.endUserLicenseAgreementsUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), endUserLicenseAgreementUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
