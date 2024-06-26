package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.InAppPurchaseAppStoreReviewScreenshotResponse;
import org.openapitools.client.model.InAppPurchaseAvailabilityResponse;
import org.openapitools.client.model.InAppPurchaseContentResponse;
import org.openapitools.client.model.InAppPurchaseLocalizationsResponse;
import org.openapitools.client.model.InAppPurchasePricePointsResponse;
import org.openapitools.client.model.InAppPurchasePriceScheduleResponse;
import org.openapitools.client.model.InAppPurchaseResponse;
import org.openapitools.client.model.InAppPurchaseV2CreateRequest;
import org.openapitools.client.model.InAppPurchaseV2Response;
import org.openapitools.client.model.InAppPurchaseV2UpdateRequest;
import org.openapitools.client.model.PromotedPurchaseResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class InAppPurchasesApi {
  private ApiClient apiClient;

  public InAppPurchasesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public InAppPurchasesApi(ApiClient apiClient) {
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
   * @param fieldsInAppPurchases the fields to include for returned resources of type inAppPurchases (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param limitApps maximum number of related apps returned (when they are included) (optional)
   * @return InAppPurchaseResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single InAppPurchase </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public InAppPurchaseResponse inAppPurchasesGetInstance(String id, List<String> fieldsInAppPurchases, List<String> include, Integer limitApps) throws ApiException {
    return inAppPurchasesGetInstanceWithHttpInfo(id, fieldsInAppPurchases, include, limitApps).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsInAppPurchases the fields to include for returned resources of type inAppPurchases (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param limitApps maximum number of related apps returned (when they are included) (optional)
   * @return ApiResponse&lt;InAppPurchaseResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single InAppPurchase </td><td>  -  </td></tr>
     </table>
   * @deprecated
   */
  @Deprecated
  public ApiResponse<InAppPurchaseResponse> inAppPurchasesGetInstanceWithHttpInfo(String id, List<String> fieldsInAppPurchases, List<String> include, Integer limitApps) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling inAppPurchasesGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/inAppPurchases/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[inAppPurchases]", fieldsInAppPurchases)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[apps]", limitApps));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<InAppPurchaseResponse> localVarReturnType = new GenericType<InAppPurchaseResponse>() {};
    return apiClient.invokeAPI("InAppPurchasesApi.inAppPurchasesGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsInAppPurchaseAppStoreReviewScreenshots the fields to include for returned resources of type inAppPurchaseAppStoreReviewScreenshots (optional)
   * @param fieldsInAppPurchases the fields to include for returned resources of type inAppPurchases (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return InAppPurchaseAppStoreReviewScreenshotResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single InAppPurchaseAppStoreReviewScreenshot </td><td>  -  </td></tr>
     </table>
   */
  public InAppPurchaseAppStoreReviewScreenshotResponse inAppPurchasesV2AppStoreReviewScreenshotGetToOneRelated(String id, List<String> fieldsInAppPurchaseAppStoreReviewScreenshots, List<String> fieldsInAppPurchases, List<String> include) throws ApiException {
    return inAppPurchasesV2AppStoreReviewScreenshotGetToOneRelatedWithHttpInfo(id, fieldsInAppPurchaseAppStoreReviewScreenshots, fieldsInAppPurchases, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsInAppPurchaseAppStoreReviewScreenshots the fields to include for returned resources of type inAppPurchaseAppStoreReviewScreenshots (optional)
   * @param fieldsInAppPurchases the fields to include for returned resources of type inAppPurchases (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;InAppPurchaseAppStoreReviewScreenshotResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single InAppPurchaseAppStoreReviewScreenshot </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InAppPurchaseAppStoreReviewScreenshotResponse> inAppPurchasesV2AppStoreReviewScreenshotGetToOneRelatedWithHttpInfo(String id, List<String> fieldsInAppPurchaseAppStoreReviewScreenshots, List<String> fieldsInAppPurchases, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling inAppPurchasesV2AppStoreReviewScreenshotGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v2/inAppPurchases/{id}/appStoreReviewScreenshot"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[inAppPurchaseAppStoreReviewScreenshots]", fieldsInAppPurchaseAppStoreReviewScreenshots)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[inAppPurchases]", fieldsInAppPurchases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<InAppPurchaseAppStoreReviewScreenshotResponse> localVarReturnType = new GenericType<InAppPurchaseAppStoreReviewScreenshotResponse>() {};
    return apiClient.invokeAPI("InAppPurchasesApi.inAppPurchasesV2AppStoreReviewScreenshotGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsInAppPurchases the fields to include for returned resources of type inAppPurchases (optional)
   * @param fieldsInAppPurchaseContents the fields to include for returned resources of type inAppPurchaseContents (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return InAppPurchaseContentResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single InAppPurchaseContent </td><td>  -  </td></tr>
     </table>
   */
  public InAppPurchaseContentResponse inAppPurchasesV2ContentGetToOneRelated(String id, List<String> fieldsInAppPurchases, List<String> fieldsInAppPurchaseContents, List<String> include) throws ApiException {
    return inAppPurchasesV2ContentGetToOneRelatedWithHttpInfo(id, fieldsInAppPurchases, fieldsInAppPurchaseContents, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsInAppPurchases the fields to include for returned resources of type inAppPurchases (optional)
   * @param fieldsInAppPurchaseContents the fields to include for returned resources of type inAppPurchaseContents (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;InAppPurchaseContentResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single InAppPurchaseContent </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InAppPurchaseContentResponse> inAppPurchasesV2ContentGetToOneRelatedWithHttpInfo(String id, List<String> fieldsInAppPurchases, List<String> fieldsInAppPurchaseContents, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling inAppPurchasesV2ContentGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v2/inAppPurchases/{id}/content"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[inAppPurchases]", fieldsInAppPurchases)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[inAppPurchaseContents]", fieldsInAppPurchaseContents));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<InAppPurchaseContentResponse> localVarReturnType = new GenericType<InAppPurchaseContentResponse>() {};
    return apiClient.invokeAPI("InAppPurchasesApi.inAppPurchasesV2ContentGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param inAppPurchaseV2CreateRequest InAppPurchase representation (required)
   * @return InAppPurchaseV2Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single InAppPurchase </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public InAppPurchaseV2Response inAppPurchasesV2CreateInstance(InAppPurchaseV2CreateRequest inAppPurchaseV2CreateRequest) throws ApiException {
    return inAppPurchasesV2CreateInstanceWithHttpInfo(inAppPurchaseV2CreateRequest).getData();
  }

  /**
   * 
   * 
   * @param inAppPurchaseV2CreateRequest InAppPurchase representation (required)
   * @return ApiResponse&lt;InAppPurchaseV2Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single InAppPurchase </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InAppPurchaseV2Response> inAppPurchasesV2CreateInstanceWithHttpInfo(InAppPurchaseV2CreateRequest inAppPurchaseV2CreateRequest) throws ApiException {
    // Check required parameters
    if (inAppPurchaseV2CreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'inAppPurchaseV2CreateRequest' when calling inAppPurchasesV2CreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<InAppPurchaseV2Response> localVarReturnType = new GenericType<InAppPurchaseV2Response>() {};
    return apiClient.invokeAPI("InAppPurchasesApi.inAppPurchasesV2CreateInstance", "/v2/inAppPurchases", "POST", new ArrayList<>(), inAppPurchaseV2CreateRequest,
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
  public void inAppPurchasesV2DeleteInstance(String id) throws ApiException {
    inAppPurchasesV2DeleteInstanceWithHttpInfo(id);
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
  public ApiResponse<Void> inAppPurchasesV2DeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling inAppPurchasesV2DeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v2/inAppPurchases/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("InAppPurchasesApi.inAppPurchasesV2DeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsInAppPurchases the fields to include for returned resources of type inAppPurchases (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsInAppPurchaseAvailabilities the fields to include for returned resources of type inAppPurchaseAvailabilities (optional)
   * @param fieldsInAppPurchaseAppStoreReviewScreenshots the fields to include for returned resources of type inAppPurchaseAppStoreReviewScreenshots (optional)
   * @param fieldsPromotedPurchases the fields to include for returned resources of type promotedPurchases (optional)
   * @param fieldsInAppPurchasePricePoints the fields to include for returned resources of type inAppPurchasePricePoints (optional)
   * @param fieldsInAppPurchaseLocalizations the fields to include for returned resources of type inAppPurchaseLocalizations (optional)
   * @param fieldsInAppPurchasePriceSchedules the fields to include for returned resources of type inAppPurchasePriceSchedules (optional)
   * @param fieldsInAppPurchaseContents the fields to include for returned resources of type inAppPurchaseContents (optional)
   * @param limitInAppPurchaseLocalizations maximum number of related inAppPurchaseLocalizations returned (when they are included) (optional)
   * @param limitPricePoints maximum number of related pricePoints returned (when they are included) (optional)
   * @return InAppPurchaseV2Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single InAppPurchase </td><td>  -  </td></tr>
     </table>
   */
  public InAppPurchaseV2Response inAppPurchasesV2GetInstance(String id, List<String> fieldsInAppPurchases, List<String> include, List<String> fieldsInAppPurchaseAvailabilities, List<String> fieldsInAppPurchaseAppStoreReviewScreenshots, List<String> fieldsPromotedPurchases, List<String> fieldsInAppPurchasePricePoints, List<String> fieldsInAppPurchaseLocalizations, List<String> fieldsInAppPurchasePriceSchedules, List<String> fieldsInAppPurchaseContents, Integer limitInAppPurchaseLocalizations, Integer limitPricePoints) throws ApiException {
    return inAppPurchasesV2GetInstanceWithHttpInfo(id, fieldsInAppPurchases, include, fieldsInAppPurchaseAvailabilities, fieldsInAppPurchaseAppStoreReviewScreenshots, fieldsPromotedPurchases, fieldsInAppPurchasePricePoints, fieldsInAppPurchaseLocalizations, fieldsInAppPurchasePriceSchedules, fieldsInAppPurchaseContents, limitInAppPurchaseLocalizations, limitPricePoints).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsInAppPurchases the fields to include for returned resources of type inAppPurchases (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsInAppPurchaseAvailabilities the fields to include for returned resources of type inAppPurchaseAvailabilities (optional)
   * @param fieldsInAppPurchaseAppStoreReviewScreenshots the fields to include for returned resources of type inAppPurchaseAppStoreReviewScreenshots (optional)
   * @param fieldsPromotedPurchases the fields to include for returned resources of type promotedPurchases (optional)
   * @param fieldsInAppPurchasePricePoints the fields to include for returned resources of type inAppPurchasePricePoints (optional)
   * @param fieldsInAppPurchaseLocalizations the fields to include for returned resources of type inAppPurchaseLocalizations (optional)
   * @param fieldsInAppPurchasePriceSchedules the fields to include for returned resources of type inAppPurchasePriceSchedules (optional)
   * @param fieldsInAppPurchaseContents the fields to include for returned resources of type inAppPurchaseContents (optional)
   * @param limitInAppPurchaseLocalizations maximum number of related inAppPurchaseLocalizations returned (when they are included) (optional)
   * @param limitPricePoints maximum number of related pricePoints returned (when they are included) (optional)
   * @return ApiResponse&lt;InAppPurchaseV2Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single InAppPurchase </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InAppPurchaseV2Response> inAppPurchasesV2GetInstanceWithHttpInfo(String id, List<String> fieldsInAppPurchases, List<String> include, List<String> fieldsInAppPurchaseAvailabilities, List<String> fieldsInAppPurchaseAppStoreReviewScreenshots, List<String> fieldsPromotedPurchases, List<String> fieldsInAppPurchasePricePoints, List<String> fieldsInAppPurchaseLocalizations, List<String> fieldsInAppPurchasePriceSchedules, List<String> fieldsInAppPurchaseContents, Integer limitInAppPurchaseLocalizations, Integer limitPricePoints) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling inAppPurchasesV2GetInstance");
    }

    // Path parameters
    String localVarPath = "/v2/inAppPurchases/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[inAppPurchases]", fieldsInAppPurchases)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[inAppPurchaseAvailabilities]", fieldsInAppPurchaseAvailabilities));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[inAppPurchaseAppStoreReviewScreenshots]", fieldsInAppPurchaseAppStoreReviewScreenshots));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[promotedPurchases]", fieldsPromotedPurchases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[inAppPurchasePricePoints]", fieldsInAppPurchasePricePoints));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[inAppPurchaseLocalizations]", fieldsInAppPurchaseLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[inAppPurchasePriceSchedules]", fieldsInAppPurchasePriceSchedules));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[inAppPurchaseContents]", fieldsInAppPurchaseContents));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[inAppPurchaseLocalizations]", limitInAppPurchaseLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[pricePoints]", limitPricePoints));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<InAppPurchaseV2Response> localVarReturnType = new GenericType<InAppPurchaseV2Response>() {};
    return apiClient.invokeAPI("InAppPurchasesApi.inAppPurchasesV2GetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsInAppPurchasePrices the fields to include for returned resources of type inAppPurchasePrices (optional)
   * @param fieldsInAppPurchases the fields to include for returned resources of type inAppPurchases (optional)
   * @param fieldsInAppPurchasePriceSchedules the fields to include for returned resources of type inAppPurchasePriceSchedules (optional)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limitManualPrices maximum number of related manualPrices returned (when they are included) (optional)
   * @param limitAutomaticPrices maximum number of related automaticPrices returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return InAppPurchasePriceScheduleResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single InAppPurchasePriceSchedule </td><td>  -  </td></tr>
     </table>
   */
  public InAppPurchasePriceScheduleResponse inAppPurchasesV2IapPriceScheduleGetToOneRelated(String id, List<String> fieldsInAppPurchasePrices, List<String> fieldsInAppPurchases, List<String> fieldsInAppPurchasePriceSchedules, List<String> fieldsTerritories, Integer limitManualPrices, Integer limitAutomaticPrices, List<String> include) throws ApiException {
    return inAppPurchasesV2IapPriceScheduleGetToOneRelatedWithHttpInfo(id, fieldsInAppPurchasePrices, fieldsInAppPurchases, fieldsInAppPurchasePriceSchedules, fieldsTerritories, limitManualPrices, limitAutomaticPrices, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsInAppPurchasePrices the fields to include for returned resources of type inAppPurchasePrices (optional)
   * @param fieldsInAppPurchases the fields to include for returned resources of type inAppPurchases (optional)
   * @param fieldsInAppPurchasePriceSchedules the fields to include for returned resources of type inAppPurchasePriceSchedules (optional)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limitManualPrices maximum number of related manualPrices returned (when they are included) (optional)
   * @param limitAutomaticPrices maximum number of related automaticPrices returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;InAppPurchasePriceScheduleResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single InAppPurchasePriceSchedule </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InAppPurchasePriceScheduleResponse> inAppPurchasesV2IapPriceScheduleGetToOneRelatedWithHttpInfo(String id, List<String> fieldsInAppPurchasePrices, List<String> fieldsInAppPurchases, List<String> fieldsInAppPurchasePriceSchedules, List<String> fieldsTerritories, Integer limitManualPrices, Integer limitAutomaticPrices, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling inAppPurchasesV2IapPriceScheduleGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v2/inAppPurchases/{id}/iapPriceSchedule"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[inAppPurchasePrices]", fieldsInAppPurchasePrices)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[inAppPurchases]", fieldsInAppPurchases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[inAppPurchasePriceSchedules]", fieldsInAppPurchasePriceSchedules));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[territories]", fieldsTerritories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[manualPrices]", limitManualPrices));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[automaticPrices]", limitAutomaticPrices));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<InAppPurchasePriceScheduleResponse> localVarReturnType = new GenericType<InAppPurchasePriceScheduleResponse>() {};
    return apiClient.invokeAPI("InAppPurchasesApi.inAppPurchasesV2IapPriceScheduleGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsInAppPurchaseAvailabilities the fields to include for returned resources of type inAppPurchaseAvailabilities (optional)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limitAvailableTerritories maximum number of related availableTerritories returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return InAppPurchaseAvailabilityResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single InAppPurchaseAvailability </td><td>  -  </td></tr>
     </table>
   */
  public InAppPurchaseAvailabilityResponse inAppPurchasesV2InAppPurchaseAvailabilityGetToOneRelated(String id, List<String> fieldsInAppPurchaseAvailabilities, List<String> fieldsTerritories, Integer limitAvailableTerritories, List<String> include) throws ApiException {
    return inAppPurchasesV2InAppPurchaseAvailabilityGetToOneRelatedWithHttpInfo(id, fieldsInAppPurchaseAvailabilities, fieldsTerritories, limitAvailableTerritories, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsInAppPurchaseAvailabilities the fields to include for returned resources of type inAppPurchaseAvailabilities (optional)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limitAvailableTerritories maximum number of related availableTerritories returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;InAppPurchaseAvailabilityResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single InAppPurchaseAvailability </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InAppPurchaseAvailabilityResponse> inAppPurchasesV2InAppPurchaseAvailabilityGetToOneRelatedWithHttpInfo(String id, List<String> fieldsInAppPurchaseAvailabilities, List<String> fieldsTerritories, Integer limitAvailableTerritories, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling inAppPurchasesV2InAppPurchaseAvailabilityGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v2/inAppPurchases/{id}/inAppPurchaseAvailability"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[inAppPurchaseAvailabilities]", fieldsInAppPurchaseAvailabilities)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[territories]", fieldsTerritories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[availableTerritories]", limitAvailableTerritories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<InAppPurchaseAvailabilityResponse> localVarReturnType = new GenericType<InAppPurchaseAvailabilityResponse>() {};
    return apiClient.invokeAPI("InAppPurchasesApi.inAppPurchasesV2InAppPurchaseAvailabilityGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsInAppPurchaseLocalizations the fields to include for returned resources of type inAppPurchaseLocalizations (optional)
   * @param fieldsInAppPurchases the fields to include for returned resources of type inAppPurchases (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return InAppPurchaseLocalizationsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of InAppPurchaseLocalizations </td><td>  -  </td></tr>
     </table>
   */
  public InAppPurchaseLocalizationsResponse inAppPurchasesV2InAppPurchaseLocalizationsGetToManyRelated(String id, List<String> fieldsInAppPurchaseLocalizations, List<String> fieldsInAppPurchases, Integer limit, List<String> include) throws ApiException {
    return inAppPurchasesV2InAppPurchaseLocalizationsGetToManyRelatedWithHttpInfo(id, fieldsInAppPurchaseLocalizations, fieldsInAppPurchases, limit, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsInAppPurchaseLocalizations the fields to include for returned resources of type inAppPurchaseLocalizations (optional)
   * @param fieldsInAppPurchases the fields to include for returned resources of type inAppPurchases (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;InAppPurchaseLocalizationsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of InAppPurchaseLocalizations </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InAppPurchaseLocalizationsResponse> inAppPurchasesV2InAppPurchaseLocalizationsGetToManyRelatedWithHttpInfo(String id, List<String> fieldsInAppPurchaseLocalizations, List<String> fieldsInAppPurchases, Integer limit, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling inAppPurchasesV2InAppPurchaseLocalizationsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v2/inAppPurchases/{id}/inAppPurchaseLocalizations"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[inAppPurchaseLocalizations]", fieldsInAppPurchaseLocalizations)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[inAppPurchases]", fieldsInAppPurchases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<InAppPurchaseLocalizationsResponse> localVarReturnType = new GenericType<InAppPurchaseLocalizationsResponse>() {};
    return apiClient.invokeAPI("InAppPurchasesApi.inAppPurchasesV2InAppPurchaseLocalizationsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterTerritory filter by id(s) of related &#39;territory&#39; (optional)
   * @param fieldsInAppPurchasePricePoints the fields to include for returned resources of type inAppPurchasePricePoints (optional)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return InAppPurchasePricePointsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of InAppPurchasePricePoints </td><td>  -  </td></tr>
     </table>
   */
  public InAppPurchasePricePointsResponse inAppPurchasesV2PricePointsGetToManyRelated(String id, List<String> filterTerritory, List<String> fieldsInAppPurchasePricePoints, List<String> fieldsTerritories, Integer limit, List<String> include) throws ApiException {
    return inAppPurchasesV2PricePointsGetToManyRelatedWithHttpInfo(id, filterTerritory, fieldsInAppPurchasePricePoints, fieldsTerritories, limit, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterTerritory filter by id(s) of related &#39;territory&#39; (optional)
   * @param fieldsInAppPurchasePricePoints the fields to include for returned resources of type inAppPurchasePricePoints (optional)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;InAppPurchasePricePointsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of InAppPurchasePricePoints </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InAppPurchasePricePointsResponse> inAppPurchasesV2PricePointsGetToManyRelatedWithHttpInfo(String id, List<String> filterTerritory, List<String> fieldsInAppPurchasePricePoints, List<String> fieldsTerritories, Integer limit, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling inAppPurchasesV2PricePointsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v2/inAppPurchases/{id}/pricePoints"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[territory]", filterTerritory)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[inAppPurchasePricePoints]", fieldsInAppPurchasePricePoints));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[territories]", fieldsTerritories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json", "text/csv");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<InAppPurchasePricePointsResponse> localVarReturnType = new GenericType<InAppPurchasePricePointsResponse>() {};
    return apiClient.invokeAPI("InAppPurchasesApi.inAppPurchasesV2PricePointsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsPromotedPurchases the fields to include for returned resources of type promotedPurchases (optional)
   * @param fieldsSubscriptions the fields to include for returned resources of type subscriptions (optional)
   * @param fieldsInAppPurchases the fields to include for returned resources of type inAppPurchases (optional)
   * @param fieldsPromotedPurchaseImages the fields to include for returned resources of type promotedPurchaseImages (optional)
   * @param limitPromotionImages maximum number of related promotionImages returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
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
  public PromotedPurchaseResponse inAppPurchasesV2PromotedPurchaseGetToOneRelated(String id, List<String> fieldsPromotedPurchases, List<String> fieldsSubscriptions, List<String> fieldsInAppPurchases, List<String> fieldsPromotedPurchaseImages, Integer limitPromotionImages, List<String> include) throws ApiException {
    return inAppPurchasesV2PromotedPurchaseGetToOneRelatedWithHttpInfo(id, fieldsPromotedPurchases, fieldsSubscriptions, fieldsInAppPurchases, fieldsPromotedPurchaseImages, limitPromotionImages, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsPromotedPurchases the fields to include for returned resources of type promotedPurchases (optional)
   * @param fieldsSubscriptions the fields to include for returned resources of type subscriptions (optional)
   * @param fieldsInAppPurchases the fields to include for returned resources of type inAppPurchases (optional)
   * @param fieldsPromotedPurchaseImages the fields to include for returned resources of type promotedPurchaseImages (optional)
   * @param limitPromotionImages maximum number of related promotionImages returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
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
  public ApiResponse<PromotedPurchaseResponse> inAppPurchasesV2PromotedPurchaseGetToOneRelatedWithHttpInfo(String id, List<String> fieldsPromotedPurchases, List<String> fieldsSubscriptions, List<String> fieldsInAppPurchases, List<String> fieldsPromotedPurchaseImages, Integer limitPromotionImages, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling inAppPurchasesV2PromotedPurchaseGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v2/inAppPurchases/{id}/promotedPurchase"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[promotedPurchases]", fieldsPromotedPurchases)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptions]", fieldsSubscriptions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[inAppPurchases]", fieldsInAppPurchases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[promotedPurchaseImages]", fieldsPromotedPurchaseImages));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[promotionImages]", limitPromotionImages));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<PromotedPurchaseResponse> localVarReturnType = new GenericType<PromotedPurchaseResponse>() {};
    return apiClient.invokeAPI("InAppPurchasesApi.inAppPurchasesV2PromotedPurchaseGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param inAppPurchaseV2UpdateRequest InAppPurchase representation (required)
   * @return InAppPurchaseV2Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single InAppPurchase </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public InAppPurchaseV2Response inAppPurchasesV2UpdateInstance(String id, InAppPurchaseV2UpdateRequest inAppPurchaseV2UpdateRequest) throws ApiException {
    return inAppPurchasesV2UpdateInstanceWithHttpInfo(id, inAppPurchaseV2UpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param inAppPurchaseV2UpdateRequest InAppPurchase representation (required)
   * @return ApiResponse&lt;InAppPurchaseV2Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single InAppPurchase </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<InAppPurchaseV2Response> inAppPurchasesV2UpdateInstanceWithHttpInfo(String id, InAppPurchaseV2UpdateRequest inAppPurchaseV2UpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling inAppPurchasesV2UpdateInstance");
    }
    if (inAppPurchaseV2UpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'inAppPurchaseV2UpdateRequest' when calling inAppPurchasesV2UpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v2/inAppPurchases/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<InAppPurchaseV2Response> localVarReturnType = new GenericType<InAppPurchaseV2Response>() {};
    return apiClient.invokeAPI("InAppPurchasesApi.inAppPurchasesV2UpdateInstance", localVarPath, "PATCH", new ArrayList<>(), inAppPurchaseV2UpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
