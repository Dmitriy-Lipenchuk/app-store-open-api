package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.PromotedPurchaseCreateRequest;
import org.openapitools.client.model.PromotedPurchaseImagesResponse;
import org.openapitools.client.model.PromotedPurchaseResponse;
import org.openapitools.client.model.PromotedPurchaseUpdateRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class PromotedPurchasesApi {
  private ApiClient apiClient;

  public PromotedPurchasesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PromotedPurchasesApi(ApiClient apiClient) {
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
   * @param promotedPurchaseCreateRequest PromotedPurchase representation (required)
   * @return PromotedPurchaseResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single PromotedPurchase </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public PromotedPurchaseResponse promotedPurchasesCreateInstance(PromotedPurchaseCreateRequest promotedPurchaseCreateRequest) throws ApiException {
    return promotedPurchasesCreateInstanceWithHttpInfo(promotedPurchaseCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param promotedPurchaseCreateRequest PromotedPurchase representation (required)
   * @return ApiResponse&lt;PromotedPurchaseResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single PromotedPurchase </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PromotedPurchaseResponse> promotedPurchasesCreateInstanceWithHttpInfo(PromotedPurchaseCreateRequest promotedPurchaseCreateRequest) throws ApiException {
    // Check required parameters
    if (promotedPurchaseCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'promotedPurchaseCreateRequest' when calling promotedPurchasesCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<PromotedPurchaseResponse> localVarReturnType = new GenericType<PromotedPurchaseResponse>() {};
    return apiClient.invokeAPI("PromotedPurchasesApi.promotedPurchasesCreateInstance", "/v1/promotedPurchases", "POST", new ArrayList<>(), promotedPurchaseCreateRequest,
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
  public void promotedPurchasesDeleteInstance(String id) throws ApiException {
    promotedPurchasesDeleteInstanceWithHttpInfo(id);
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
  public ApiResponse<Void> promotedPurchasesDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling promotedPurchasesDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/promotedPurchases/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("PromotedPurchasesApi.promotedPurchasesDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsPromotedPurchases the fields to include for returned resources of type promotedPurchases (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsPromotedPurchaseImages the fields to include for returned resources of type promotedPurchaseImages (optional)
   * @param limitPromotionImages maximum number of related promotionImages returned (when they are included) (optional)
   * @return PromotedPurchaseResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single PromotedPurchase </td><td>  -  </td></tr>
     </table>
   */
  public PromotedPurchaseResponse promotedPurchasesGetInstance(String id, List<String> fieldsPromotedPurchases, List<String> include, List<String> fieldsPromotedPurchaseImages, Integer limitPromotionImages) throws ApiException {
    return promotedPurchasesGetInstanceWithHttpInfo(id, fieldsPromotedPurchases, include, fieldsPromotedPurchaseImages, limitPromotionImages).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsPromotedPurchases the fields to include for returned resources of type promotedPurchases (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsPromotedPurchaseImages the fields to include for returned resources of type promotedPurchaseImages (optional)
   * @param limitPromotionImages maximum number of related promotionImages returned (when they are included) (optional)
   * @return ApiResponse&lt;PromotedPurchaseResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single PromotedPurchase </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PromotedPurchaseResponse> promotedPurchasesGetInstanceWithHttpInfo(String id, List<String> fieldsPromotedPurchases, List<String> include, List<String> fieldsPromotedPurchaseImages, Integer limitPromotionImages) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling promotedPurchasesGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/promotedPurchases/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[promotedPurchases]", fieldsPromotedPurchases)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[promotedPurchaseImages]", fieldsPromotedPurchaseImages));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[promotionImages]", limitPromotionImages));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<PromotedPurchaseResponse> localVarReturnType = new GenericType<PromotedPurchaseResponse>() {};
    return apiClient.invokeAPI("PromotedPurchasesApi.promotedPurchasesGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsPromotedPurchases the fields to include for returned resources of type promotedPurchases (optional)
   * @param fieldsPromotedPurchaseImages the fields to include for returned resources of type promotedPurchaseImages (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return PromotedPurchaseImagesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of PromotedPurchaseImages </td><td>  -  </td></tr>
     </table>
   */
  public PromotedPurchaseImagesResponse promotedPurchasesPromotionImagesGetToManyRelated(String id, List<String> fieldsPromotedPurchases, List<String> fieldsPromotedPurchaseImages, Integer limit, List<String> include) throws ApiException {
    return promotedPurchasesPromotionImagesGetToManyRelatedWithHttpInfo(id, fieldsPromotedPurchases, fieldsPromotedPurchaseImages, limit, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsPromotedPurchases the fields to include for returned resources of type promotedPurchases (optional)
   * @param fieldsPromotedPurchaseImages the fields to include for returned resources of type promotedPurchaseImages (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;PromotedPurchaseImagesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of PromotedPurchaseImages </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PromotedPurchaseImagesResponse> promotedPurchasesPromotionImagesGetToManyRelatedWithHttpInfo(String id, List<String> fieldsPromotedPurchases, List<String> fieldsPromotedPurchaseImages, Integer limit, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling promotedPurchasesPromotionImagesGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/promotedPurchases/{id}/promotionImages"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[promotedPurchases]", fieldsPromotedPurchases)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[promotedPurchaseImages]", fieldsPromotedPurchaseImages));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<PromotedPurchaseImagesResponse> localVarReturnType = new GenericType<PromotedPurchaseImagesResponse>() {};
    return apiClient.invokeAPI("PromotedPurchasesApi.promotedPurchasesPromotionImagesGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param promotedPurchaseUpdateRequest PromotedPurchase representation (required)
   * @return PromotedPurchaseResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single PromotedPurchase </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public PromotedPurchaseResponse promotedPurchasesUpdateInstance(String id, PromotedPurchaseUpdateRequest promotedPurchaseUpdateRequest) throws ApiException {
    return promotedPurchasesUpdateInstanceWithHttpInfo(id, promotedPurchaseUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param promotedPurchaseUpdateRequest PromotedPurchase representation (required)
   * @return ApiResponse&lt;PromotedPurchaseResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single PromotedPurchase </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<PromotedPurchaseResponse> promotedPurchasesUpdateInstanceWithHttpInfo(String id, PromotedPurchaseUpdateRequest promotedPurchaseUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling promotedPurchasesUpdateInstance");
    }
    if (promotedPurchaseUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'promotedPurchaseUpdateRequest' when calling promotedPurchasesUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/promotedPurchases/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<PromotedPurchaseResponse> localVarReturnType = new GenericType<PromotedPurchaseResponse>() {};
    return apiClient.invokeAPI("PromotedPurchasesApi.promotedPurchasesUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), promotedPurchaseUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
