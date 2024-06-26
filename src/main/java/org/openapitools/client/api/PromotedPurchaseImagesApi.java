package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.PromotedPurchaseImageCreateRequest;
import org.openapitools.client.model.PromotedPurchaseImageResponse;
import org.openapitools.client.model.PromotedPurchaseImageUpdateRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class PromotedPurchaseImagesApi {
  private ApiClient apiClient;

  public PromotedPurchaseImagesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PromotedPurchaseImagesApi(ApiClient apiClient) {
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
   * @param promotedPurchaseImageCreateRequest PromotedPurchaseImage representation (required)
   * @return PromotedPurchaseImageResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single PromotedPurchaseImage </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public PromotedPurchaseImageResponse promotedPurchaseImagesCreateInstance(PromotedPurchaseImageCreateRequest promotedPurchaseImageCreateRequest) throws ApiException {
    return promotedPurchaseImagesCreateInstanceWithHttpInfo(promotedPurchaseImageCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param promotedPurchaseImageCreateRequest PromotedPurchaseImage representation (required)
   * @return ApiResponse&lt;PromotedPurchaseImageResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single PromotedPurchaseImage </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PromotedPurchaseImageResponse> promotedPurchaseImagesCreateInstanceWithHttpInfo(PromotedPurchaseImageCreateRequest promotedPurchaseImageCreateRequest) throws ApiException {
    // Check required parameters
    if (promotedPurchaseImageCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'promotedPurchaseImageCreateRequest' when calling promotedPurchaseImagesCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<PromotedPurchaseImageResponse> localVarReturnType = new GenericType<PromotedPurchaseImageResponse>() {};
    return apiClient.invokeAPI("PromotedPurchaseImagesApi.promotedPurchaseImagesCreateInstance", "/v1/promotedPurchaseImages", "POST", new ArrayList<>(), promotedPurchaseImageCreateRequest,
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
  public void promotedPurchaseImagesDeleteInstance(String id) throws ApiException {
    promotedPurchaseImagesDeleteInstanceWithHttpInfo(id);
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
  public ApiResponse<Void> promotedPurchaseImagesDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling promotedPurchaseImagesDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/promotedPurchaseImages/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("PromotedPurchaseImagesApi.promotedPurchaseImagesDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsPromotedPurchaseImages the fields to include for returned resources of type promotedPurchaseImages (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return PromotedPurchaseImageResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single PromotedPurchaseImage </td><td>  -  </td></tr>
     </table>
   */
  public PromotedPurchaseImageResponse promotedPurchaseImagesGetInstance(String id, List<String> fieldsPromotedPurchaseImages, List<String> include) throws ApiException {
    return promotedPurchaseImagesGetInstanceWithHttpInfo(id, fieldsPromotedPurchaseImages, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsPromotedPurchaseImages the fields to include for returned resources of type promotedPurchaseImages (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;PromotedPurchaseImageResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single PromotedPurchaseImage </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PromotedPurchaseImageResponse> promotedPurchaseImagesGetInstanceWithHttpInfo(String id, List<String> fieldsPromotedPurchaseImages, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling promotedPurchaseImagesGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/promotedPurchaseImages/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[promotedPurchaseImages]", fieldsPromotedPurchaseImages)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<PromotedPurchaseImageResponse> localVarReturnType = new GenericType<PromotedPurchaseImageResponse>() {};
    return apiClient.invokeAPI("PromotedPurchaseImagesApi.promotedPurchaseImagesGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param promotedPurchaseImageUpdateRequest PromotedPurchaseImage representation (required)
   * @return PromotedPurchaseImageResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single PromotedPurchaseImage </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public PromotedPurchaseImageResponse promotedPurchaseImagesUpdateInstance(String id, PromotedPurchaseImageUpdateRequest promotedPurchaseImageUpdateRequest) throws ApiException {
    return promotedPurchaseImagesUpdateInstanceWithHttpInfo(id, promotedPurchaseImageUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param promotedPurchaseImageUpdateRequest PromotedPurchaseImage representation (required)
   * @return ApiResponse&lt;PromotedPurchaseImageResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single PromotedPurchaseImage </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PromotedPurchaseImageResponse> promotedPurchaseImagesUpdateInstanceWithHttpInfo(String id, PromotedPurchaseImageUpdateRequest promotedPurchaseImageUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling promotedPurchaseImagesUpdateInstance");
    }
    if (promotedPurchaseImageUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'promotedPurchaseImageUpdateRequest' when calling promotedPurchaseImagesUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/promotedPurchaseImages/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<PromotedPurchaseImageResponse> localVarReturnType = new GenericType<PromotedPurchaseImageResponse>() {};
    return apiClient.invokeAPI("PromotedPurchaseImagesApi.promotedPurchaseImagesUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), promotedPurchaseImageUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
