package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.AppEncryptionDeclarationDocumentCreateRequest;
import org.openapitools.client.model.AppEncryptionDeclarationDocumentResponse;
import org.openapitools.client.model.AppEncryptionDeclarationDocumentUpdateRequest;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppEncryptionDeclarationDocumentsApi {
  private ApiClient apiClient;

  public AppEncryptionDeclarationDocumentsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AppEncryptionDeclarationDocumentsApi(ApiClient apiClient) {
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
   * @param appEncryptionDeclarationDocumentCreateRequest AppEncryptionDeclarationDocument representation (required)
   * @return AppEncryptionDeclarationDocumentResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AppEncryptionDeclarationDocument </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public AppEncryptionDeclarationDocumentResponse appEncryptionDeclarationDocumentsCreateInstance(AppEncryptionDeclarationDocumentCreateRequest appEncryptionDeclarationDocumentCreateRequest) throws ApiException {
    return appEncryptionDeclarationDocumentsCreateInstanceWithHttpInfo(appEncryptionDeclarationDocumentCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param appEncryptionDeclarationDocumentCreateRequest AppEncryptionDeclarationDocument representation (required)
   * @return ApiResponse&lt;AppEncryptionDeclarationDocumentResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single AppEncryptionDeclarationDocument </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppEncryptionDeclarationDocumentResponse> appEncryptionDeclarationDocumentsCreateInstanceWithHttpInfo(AppEncryptionDeclarationDocumentCreateRequest appEncryptionDeclarationDocumentCreateRequest) throws ApiException {
    // Check required parameters
    if (appEncryptionDeclarationDocumentCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appEncryptionDeclarationDocumentCreateRequest' when calling appEncryptionDeclarationDocumentsCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppEncryptionDeclarationDocumentResponse> localVarReturnType = new GenericType<AppEncryptionDeclarationDocumentResponse>() {};
    return apiClient.invokeAPI("AppEncryptionDeclarationDocumentsApi.appEncryptionDeclarationDocumentsCreateInstance", "/v1/appEncryptionDeclarationDocuments", "POST", new ArrayList<>(), appEncryptionDeclarationDocumentCreateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
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
  public AppEncryptionDeclarationDocumentResponse appEncryptionDeclarationDocumentsGetInstance(String id, List<String> fieldsAppEncryptionDeclarationDocuments) throws ApiException {
    return appEncryptionDeclarationDocumentsGetInstanceWithHttpInfo(id, fieldsAppEncryptionDeclarationDocuments).getData();
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
  public ApiResponse<AppEncryptionDeclarationDocumentResponse> appEncryptionDeclarationDocumentsGetInstanceWithHttpInfo(String id, List<String> fieldsAppEncryptionDeclarationDocuments) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appEncryptionDeclarationDocumentsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appEncryptionDeclarationDocuments/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appEncryptionDeclarationDocuments]", fieldsAppEncryptionDeclarationDocuments)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppEncryptionDeclarationDocumentResponse> localVarReturnType = new GenericType<AppEncryptionDeclarationDocumentResponse>() {};
    return apiClient.invokeAPI("AppEncryptionDeclarationDocumentsApi.appEncryptionDeclarationDocumentsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appEncryptionDeclarationDocumentUpdateRequest AppEncryptionDeclarationDocument representation (required)
   * @return AppEncryptionDeclarationDocumentResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppEncryptionDeclarationDocument </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public AppEncryptionDeclarationDocumentResponse appEncryptionDeclarationDocumentsUpdateInstance(String id, AppEncryptionDeclarationDocumentUpdateRequest appEncryptionDeclarationDocumentUpdateRequest) throws ApiException {
    return appEncryptionDeclarationDocumentsUpdateInstanceWithHttpInfo(id, appEncryptionDeclarationDocumentUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param appEncryptionDeclarationDocumentUpdateRequest AppEncryptionDeclarationDocument representation (required)
   * @return ApiResponse&lt;AppEncryptionDeclarationDocumentResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AppEncryptionDeclarationDocument </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AppEncryptionDeclarationDocumentResponse> appEncryptionDeclarationDocumentsUpdateInstanceWithHttpInfo(String id, AppEncryptionDeclarationDocumentUpdateRequest appEncryptionDeclarationDocumentUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling appEncryptionDeclarationDocumentsUpdateInstance");
    }
    if (appEncryptionDeclarationDocumentUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'appEncryptionDeclarationDocumentUpdateRequest' when calling appEncryptionDeclarationDocumentsUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/appEncryptionDeclarationDocuments/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AppEncryptionDeclarationDocumentResponse> localVarReturnType = new GenericType<AppEncryptionDeclarationDocumentResponse>() {};
    return apiClient.invokeAPI("AppEncryptionDeclarationDocumentsApi.appEncryptionDeclarationDocumentsUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), appEncryptionDeclarationDocumentUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
