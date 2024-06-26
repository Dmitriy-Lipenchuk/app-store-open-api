package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.AlternativeDistributionKeyCreateRequest;
import org.openapitools.client.model.AlternativeDistributionKeyResponse;
import org.openapitools.client.model.AlternativeDistributionKeysResponse;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AlternativeDistributionKeysApi {
  private ApiClient apiClient;

  public AlternativeDistributionKeysApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AlternativeDistributionKeysApi(ApiClient apiClient) {
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
   * @param alternativeDistributionKeyCreateRequest AlternativeDistributionKey representation (required)
   * @return AlternativeDistributionKeyResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AlternativeDistributionKey </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public AlternativeDistributionKeyResponse alternativeDistributionKeysCreateInstance(AlternativeDistributionKeyCreateRequest alternativeDistributionKeyCreateRequest) throws ApiException {
    return alternativeDistributionKeysCreateInstanceWithHttpInfo(alternativeDistributionKeyCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param alternativeDistributionKeyCreateRequest AlternativeDistributionKey representation (required)
   * @return ApiResponse&lt;AlternativeDistributionKeyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AlternativeDistributionKey </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AlternativeDistributionKeyResponse> alternativeDistributionKeysCreateInstanceWithHttpInfo(AlternativeDistributionKeyCreateRequest alternativeDistributionKeyCreateRequest) throws ApiException {
    // Check required parameters
    if (alternativeDistributionKeyCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'alternativeDistributionKeyCreateRequest' when calling alternativeDistributionKeysCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AlternativeDistributionKeyResponse> localVarReturnType = new GenericType<AlternativeDistributionKeyResponse>() {};
    return apiClient.invokeAPI("AlternativeDistributionKeysApi.alternativeDistributionKeysCreateInstance", "/v1/alternativeDistributionKeys", "POST", new ArrayList<>(), alternativeDistributionKeyCreateRequest,
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
  public void alternativeDistributionKeysDeleteInstance(String id) throws ApiException {
    alternativeDistributionKeysDeleteInstanceWithHttpInfo(id);
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
  public ApiResponse<Void> alternativeDistributionKeysDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling alternativeDistributionKeysDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/alternativeDistributionKeys/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("AlternativeDistributionKeysApi.alternativeDistributionKeysDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param existsApp filter by existence or non-existence of related &#39;app&#39; (optional)
   * @param fieldsAlternativeDistributionKeys the fields to include for returned resources of type alternativeDistributionKeys (optional)
   * @param limit maximum resources per page (optional)
   * @return AlternativeDistributionKeysResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AlternativeDistributionKeys </td><td>  -  </td></tr>
     </table>
   */
  public AlternativeDistributionKeysResponse alternativeDistributionKeysGetCollection(Boolean existsApp, List<String> fieldsAlternativeDistributionKeys, Integer limit) throws ApiException {
    return alternativeDistributionKeysGetCollectionWithHttpInfo(existsApp, fieldsAlternativeDistributionKeys, limit).getData();
  }

  /**
   * 
   * 
   * @param existsApp filter by existence or non-existence of related &#39;app&#39; (optional)
   * @param fieldsAlternativeDistributionKeys the fields to include for returned resources of type alternativeDistributionKeys (optional)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;AlternativeDistributionKeysResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of AlternativeDistributionKeys </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AlternativeDistributionKeysResponse> alternativeDistributionKeysGetCollectionWithHttpInfo(Boolean existsApp, List<String> fieldsAlternativeDistributionKeys, Integer limit) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "exists[app]", existsApp)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[alternativeDistributionKeys]", fieldsAlternativeDistributionKeys));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AlternativeDistributionKeysResponse> localVarReturnType = new GenericType<AlternativeDistributionKeysResponse>() {};
    return apiClient.invokeAPI("AlternativeDistributionKeysApi.alternativeDistributionKeysGetCollection", "/v1/alternativeDistributionKeys", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAlternativeDistributionKeys the fields to include for returned resources of type alternativeDistributionKeys (optional)
   * @return AlternativeDistributionKeyResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AlternativeDistributionKey </td><td>  -  </td></tr>
     </table>
   */
  public AlternativeDistributionKeyResponse alternativeDistributionKeysGetInstance(String id, List<String> fieldsAlternativeDistributionKeys) throws ApiException {
    return alternativeDistributionKeysGetInstanceWithHttpInfo(id, fieldsAlternativeDistributionKeys).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAlternativeDistributionKeys the fields to include for returned resources of type alternativeDistributionKeys (optional)
   * @return ApiResponse&lt;AlternativeDistributionKeyResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AlternativeDistributionKey </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AlternativeDistributionKeyResponse> alternativeDistributionKeysGetInstanceWithHttpInfo(String id, List<String> fieldsAlternativeDistributionKeys) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling alternativeDistributionKeysGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/alternativeDistributionKeys/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[alternativeDistributionKeys]", fieldsAlternativeDistributionKeys)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AlternativeDistributionKeyResponse> localVarReturnType = new GenericType<AlternativeDistributionKeyResponse>() {};
    return apiClient.invokeAPI("AlternativeDistributionKeysApi.alternativeDistributionKeysGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
