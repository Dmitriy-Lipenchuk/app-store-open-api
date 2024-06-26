package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.ReviewSubmissionCreateRequest;
import org.openapitools.client.model.ReviewSubmissionItemsResponse;
import org.openapitools.client.model.ReviewSubmissionResponse;
import org.openapitools.client.model.ReviewSubmissionUpdateRequest;
import org.openapitools.client.model.ReviewSubmissionsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class ReviewSubmissionsApi {
  private ApiClient apiClient;

  public ReviewSubmissionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ReviewSubmissionsApi(ApiClient apiClient) {
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
   * @param reviewSubmissionCreateRequest ReviewSubmission representation (required)
   * @return ReviewSubmissionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single ReviewSubmission </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ReviewSubmissionResponse reviewSubmissionsCreateInstance(ReviewSubmissionCreateRequest reviewSubmissionCreateRequest) throws ApiException {
    return reviewSubmissionsCreateInstanceWithHttpInfo(reviewSubmissionCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param reviewSubmissionCreateRequest ReviewSubmission representation (required)
   * @return ApiResponse&lt;ReviewSubmissionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single ReviewSubmission </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ReviewSubmissionResponse> reviewSubmissionsCreateInstanceWithHttpInfo(ReviewSubmissionCreateRequest reviewSubmissionCreateRequest) throws ApiException {
    // Check required parameters
    if (reviewSubmissionCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'reviewSubmissionCreateRequest' when calling reviewSubmissionsCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<ReviewSubmissionResponse> localVarReturnType = new GenericType<ReviewSubmissionResponse>() {};
    return apiClient.invokeAPI("ReviewSubmissionsApi.reviewSubmissionsCreateInstance", "/v1/reviewSubmissions", "POST", new ArrayList<>(), reviewSubmissionCreateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param filterApp filter by id(s) of related &#39;app&#39; (required)
   * @param filterPlatform filter by attribute &#39;platform&#39; (optional)
   * @param filterState filter by attribute &#39;state&#39; (optional)
   * @param fieldsReviewSubmissions the fields to include for returned resources of type reviewSubmissions (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsReviewSubmissionItems the fields to include for returned resources of type reviewSubmissionItems (optional)
   * @param limitItems maximum number of related items returned (when they are included) (optional)
   * @return ReviewSubmissionsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of ReviewSubmissions </td><td>  -  </td></tr>
     </table>
   */
  public ReviewSubmissionsResponse reviewSubmissionsGetCollection(List<String> filterApp, List<String> filterPlatform, List<String> filterState, List<String> fieldsReviewSubmissions, Integer limit, List<String> include, List<String> fieldsReviewSubmissionItems, Integer limitItems) throws ApiException {
    return reviewSubmissionsGetCollectionWithHttpInfo(filterApp, filterPlatform, filterState, fieldsReviewSubmissions, limit, include, fieldsReviewSubmissionItems, limitItems).getData();
  }

  /**
   * 
   * 
   * @param filterApp filter by id(s) of related &#39;app&#39; (required)
   * @param filterPlatform filter by attribute &#39;platform&#39; (optional)
   * @param filterState filter by attribute &#39;state&#39; (optional)
   * @param fieldsReviewSubmissions the fields to include for returned resources of type reviewSubmissions (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsReviewSubmissionItems the fields to include for returned resources of type reviewSubmissionItems (optional)
   * @param limitItems maximum number of related items returned (when they are included) (optional)
   * @return ApiResponse&lt;ReviewSubmissionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of ReviewSubmissions </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ReviewSubmissionsResponse> reviewSubmissionsGetCollectionWithHttpInfo(List<String> filterApp, List<String> filterPlatform, List<String> filterState, List<String> fieldsReviewSubmissions, Integer limit, List<String> include, List<String> fieldsReviewSubmissionItems, Integer limitItems) throws ApiException {
    // Check required parameters
    if (filterApp == null) {
      throw new ApiException(400, "Missing the required parameter 'filterApp' when calling reviewSubmissionsGetCollection");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[platform]", filterPlatform)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[state]", filterState));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[app]", filterApp));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[reviewSubmissions]", fieldsReviewSubmissions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[reviewSubmissionItems]", fieldsReviewSubmissionItems));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[items]", limitItems));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<ReviewSubmissionsResponse> localVarReturnType = new GenericType<ReviewSubmissionsResponse>() {};
    return apiClient.invokeAPI("ReviewSubmissionsApi.reviewSubmissionsGetCollection", "/v1/reviewSubmissions", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsReviewSubmissions the fields to include for returned resources of type reviewSubmissions (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsReviewSubmissionItems the fields to include for returned resources of type reviewSubmissionItems (optional)
   * @param limitItems maximum number of related items returned (when they are included) (optional)
   * @return ReviewSubmissionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single ReviewSubmission </td><td>  -  </td></tr>
     </table>
   */
  public ReviewSubmissionResponse reviewSubmissionsGetInstance(String id, List<String> fieldsReviewSubmissions, List<String> include, List<String> fieldsReviewSubmissionItems, Integer limitItems) throws ApiException {
    return reviewSubmissionsGetInstanceWithHttpInfo(id, fieldsReviewSubmissions, include, fieldsReviewSubmissionItems, limitItems).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsReviewSubmissions the fields to include for returned resources of type reviewSubmissions (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsReviewSubmissionItems the fields to include for returned resources of type reviewSubmissionItems (optional)
   * @param limitItems maximum number of related items returned (when they are included) (optional)
   * @return ApiResponse&lt;ReviewSubmissionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single ReviewSubmission </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ReviewSubmissionResponse> reviewSubmissionsGetInstanceWithHttpInfo(String id, List<String> fieldsReviewSubmissions, List<String> include, List<String> fieldsReviewSubmissionItems, Integer limitItems) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling reviewSubmissionsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/reviewSubmissions/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[reviewSubmissions]", fieldsReviewSubmissions)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[reviewSubmissionItems]", fieldsReviewSubmissionItems));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[items]", limitItems));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<ReviewSubmissionResponse> localVarReturnType = new GenericType<ReviewSubmissionResponse>() {};
    return apiClient.invokeAPI("ReviewSubmissionsApi.reviewSubmissionsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppStoreVersionExperiments the fields to include for returned resources of type appStoreVersionExperiments (optional)
   * @param fieldsReviewSubmissionItems the fields to include for returned resources of type reviewSubmissionItems (optional)
   * @param fieldsAppStoreVersions the fields to include for returned resources of type appStoreVersions (optional)
   * @param fieldsAppCustomProductPageVersions the fields to include for returned resources of type appCustomProductPageVersions (optional)
   * @param fieldsAppEvents the fields to include for returned resources of type appEvents (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ReviewSubmissionItemsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of ReviewSubmissionItems </td><td>  -  </td></tr>
     </table>
   */
  public ReviewSubmissionItemsResponse reviewSubmissionsItemsGetToManyRelated(String id, List<String> fieldsAppStoreVersionExperiments, List<String> fieldsReviewSubmissionItems, List<String> fieldsAppStoreVersions, List<String> fieldsAppCustomProductPageVersions, List<String> fieldsAppEvents, Integer limit, List<String> include) throws ApiException {
    return reviewSubmissionsItemsGetToManyRelatedWithHttpInfo(id, fieldsAppStoreVersionExperiments, fieldsReviewSubmissionItems, fieldsAppStoreVersions, fieldsAppCustomProductPageVersions, fieldsAppEvents, limit, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsAppStoreVersionExperiments the fields to include for returned resources of type appStoreVersionExperiments (optional)
   * @param fieldsReviewSubmissionItems the fields to include for returned resources of type reviewSubmissionItems (optional)
   * @param fieldsAppStoreVersions the fields to include for returned resources of type appStoreVersions (optional)
   * @param fieldsAppCustomProductPageVersions the fields to include for returned resources of type appCustomProductPageVersions (optional)
   * @param fieldsAppEvents the fields to include for returned resources of type appEvents (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;ReviewSubmissionItemsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of ReviewSubmissionItems </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ReviewSubmissionItemsResponse> reviewSubmissionsItemsGetToManyRelatedWithHttpInfo(String id, List<String> fieldsAppStoreVersionExperiments, List<String> fieldsReviewSubmissionItems, List<String> fieldsAppStoreVersions, List<String> fieldsAppCustomProductPageVersions, List<String> fieldsAppEvents, Integer limit, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling reviewSubmissionsItemsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/reviewSubmissions/{id}/items"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[appStoreVersionExperiments]", fieldsAppStoreVersionExperiments)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[reviewSubmissionItems]", fieldsReviewSubmissionItems));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appStoreVersions]", fieldsAppStoreVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appCustomProductPageVersions]", fieldsAppCustomProductPageVersions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[appEvents]", fieldsAppEvents));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<ReviewSubmissionItemsResponse> localVarReturnType = new GenericType<ReviewSubmissionItemsResponse>() {};
    return apiClient.invokeAPI("ReviewSubmissionsApi.reviewSubmissionsItemsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param reviewSubmissionUpdateRequest ReviewSubmission representation (required)
   * @return ReviewSubmissionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single ReviewSubmission </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ReviewSubmissionResponse reviewSubmissionsUpdateInstance(String id, ReviewSubmissionUpdateRequest reviewSubmissionUpdateRequest) throws ApiException {
    return reviewSubmissionsUpdateInstanceWithHttpInfo(id, reviewSubmissionUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param reviewSubmissionUpdateRequest ReviewSubmission representation (required)
   * @return ApiResponse&lt;ReviewSubmissionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single ReviewSubmission </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ReviewSubmissionResponse> reviewSubmissionsUpdateInstanceWithHttpInfo(String id, ReviewSubmissionUpdateRequest reviewSubmissionUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling reviewSubmissionsUpdateInstance");
    }
    if (reviewSubmissionUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'reviewSubmissionUpdateRequest' when calling reviewSubmissionsUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/reviewSubmissions/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<ReviewSubmissionResponse> localVarReturnType = new GenericType<ReviewSubmissionResponse>() {};
    return apiClient.invokeAPI("ReviewSubmissionsApi.reviewSubmissionsUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), reviewSubmissionUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
