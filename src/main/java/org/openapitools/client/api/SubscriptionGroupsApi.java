package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.SubscriptionGroupCreateRequest;
import org.openapitools.client.model.SubscriptionGroupLocalizationsResponse;
import org.openapitools.client.model.SubscriptionGroupResponse;
import org.openapitools.client.model.SubscriptionGroupUpdateRequest;
import org.openapitools.client.model.SubscriptionsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class SubscriptionGroupsApi {
  private ApiClient apiClient;

  public SubscriptionGroupsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SubscriptionGroupsApi(ApiClient apiClient) {
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
   * @param subscriptionGroupCreateRequest SubscriptionGroup representation (required)
   * @return SubscriptionGroupResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single SubscriptionGroup </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public SubscriptionGroupResponse subscriptionGroupsCreateInstance(SubscriptionGroupCreateRequest subscriptionGroupCreateRequest) throws ApiException {
    return subscriptionGroupsCreateInstanceWithHttpInfo(subscriptionGroupCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param subscriptionGroupCreateRequest SubscriptionGroup representation (required)
   * @return ApiResponse&lt;SubscriptionGroupResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single SubscriptionGroup </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubscriptionGroupResponse> subscriptionGroupsCreateInstanceWithHttpInfo(SubscriptionGroupCreateRequest subscriptionGroupCreateRequest) throws ApiException {
    // Check required parameters
    if (subscriptionGroupCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'subscriptionGroupCreateRequest' when calling subscriptionGroupsCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<SubscriptionGroupResponse> localVarReturnType = new GenericType<SubscriptionGroupResponse>() {};
    return apiClient.invokeAPI("SubscriptionGroupsApi.subscriptionGroupsCreateInstance", "/v1/subscriptionGroups", "POST", new ArrayList<>(), subscriptionGroupCreateRequest,
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
  public void subscriptionGroupsDeleteInstance(String id) throws ApiException {
    subscriptionGroupsDeleteInstanceWithHttpInfo(id);
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
  public ApiResponse<Void> subscriptionGroupsDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionGroupsDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/subscriptionGroups/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("SubscriptionGroupsApi.subscriptionGroupsDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsSubscriptionGroups the fields to include for returned resources of type subscriptionGroups (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsSubscriptions the fields to include for returned resources of type subscriptions (optional)
   * @param fieldsSubscriptionGroupLocalizations the fields to include for returned resources of type subscriptionGroupLocalizations (optional)
   * @param limitSubscriptionGroupLocalizations maximum number of related subscriptionGroupLocalizations returned (when they are included) (optional)
   * @param limitSubscriptions maximum number of related subscriptions returned (when they are included) (optional)
   * @return SubscriptionGroupResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single SubscriptionGroup </td><td>  -  </td></tr>
     </table>
   */
  public SubscriptionGroupResponse subscriptionGroupsGetInstance(String id, List<String> fieldsSubscriptionGroups, List<String> include, List<String> fieldsSubscriptions, List<String> fieldsSubscriptionGroupLocalizations, Integer limitSubscriptionGroupLocalizations, Integer limitSubscriptions) throws ApiException {
    return subscriptionGroupsGetInstanceWithHttpInfo(id, fieldsSubscriptionGroups, include, fieldsSubscriptions, fieldsSubscriptionGroupLocalizations, limitSubscriptionGroupLocalizations, limitSubscriptions).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsSubscriptionGroups the fields to include for returned resources of type subscriptionGroups (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsSubscriptions the fields to include for returned resources of type subscriptions (optional)
   * @param fieldsSubscriptionGroupLocalizations the fields to include for returned resources of type subscriptionGroupLocalizations (optional)
   * @param limitSubscriptionGroupLocalizations maximum number of related subscriptionGroupLocalizations returned (when they are included) (optional)
   * @param limitSubscriptions maximum number of related subscriptions returned (when they are included) (optional)
   * @return ApiResponse&lt;SubscriptionGroupResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single SubscriptionGroup </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubscriptionGroupResponse> subscriptionGroupsGetInstanceWithHttpInfo(String id, List<String> fieldsSubscriptionGroups, List<String> include, List<String> fieldsSubscriptions, List<String> fieldsSubscriptionGroupLocalizations, Integer limitSubscriptionGroupLocalizations, Integer limitSubscriptions) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionGroupsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/subscriptionGroups/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[subscriptionGroups]", fieldsSubscriptionGroups)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptions]", fieldsSubscriptions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptionGroupLocalizations]", fieldsSubscriptionGroupLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[subscriptionGroupLocalizations]", limitSubscriptionGroupLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[subscriptions]", limitSubscriptions));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<SubscriptionGroupResponse> localVarReturnType = new GenericType<SubscriptionGroupResponse>() {};
    return apiClient.invokeAPI("SubscriptionGroupsApi.subscriptionGroupsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsSubscriptionGroups the fields to include for returned resources of type subscriptionGroups (optional)
   * @param fieldsSubscriptionGroupLocalizations the fields to include for returned resources of type subscriptionGroupLocalizations (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return SubscriptionGroupLocalizationsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of SubscriptionGroupLocalizations </td><td>  -  </td></tr>
     </table>
   */
  public SubscriptionGroupLocalizationsResponse subscriptionGroupsSubscriptionGroupLocalizationsGetToManyRelated(String id, List<String> fieldsSubscriptionGroups, List<String> fieldsSubscriptionGroupLocalizations, Integer limit, List<String> include) throws ApiException {
    return subscriptionGroupsSubscriptionGroupLocalizationsGetToManyRelatedWithHttpInfo(id, fieldsSubscriptionGroups, fieldsSubscriptionGroupLocalizations, limit, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsSubscriptionGroups the fields to include for returned resources of type subscriptionGroups (optional)
   * @param fieldsSubscriptionGroupLocalizations the fields to include for returned resources of type subscriptionGroupLocalizations (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;SubscriptionGroupLocalizationsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of SubscriptionGroupLocalizations </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubscriptionGroupLocalizationsResponse> subscriptionGroupsSubscriptionGroupLocalizationsGetToManyRelatedWithHttpInfo(String id, List<String> fieldsSubscriptionGroups, List<String> fieldsSubscriptionGroupLocalizations, Integer limit, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionGroupsSubscriptionGroupLocalizationsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/subscriptionGroups/{id}/subscriptionGroupLocalizations"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[subscriptionGroups]", fieldsSubscriptionGroups)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptionGroupLocalizations]", fieldsSubscriptionGroupLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<SubscriptionGroupLocalizationsResponse> localVarReturnType = new GenericType<SubscriptionGroupLocalizationsResponse>() {};
    return apiClient.invokeAPI("SubscriptionGroupsApi.subscriptionGroupsSubscriptionGroupLocalizationsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterName filter by attribute &#39;name&#39; (optional)
   * @param filterProductId filter by attribute &#39;productId&#39; (optional)
   * @param filterState filter by attribute &#39;state&#39; (optional)
   * @param sort comma-separated list of sort expressions; resources will be sorted as specified (optional)
   * @param fieldsPromotedPurchases the fields to include for returned resources of type promotedPurchases (optional)
   * @param fieldsSubscriptionPromotionalOffers the fields to include for returned resources of type subscriptionPromotionalOffers (optional)
   * @param fieldsSubscriptionOfferCodes the fields to include for returned resources of type subscriptionOfferCodes (optional)
   * @param fieldsSubscriptionAppStoreReviewScreenshots the fields to include for returned resources of type subscriptionAppStoreReviewScreenshots (optional)
   * @param fieldsSubscriptions the fields to include for returned resources of type subscriptions (optional)
   * @param fieldsSubscriptionAvailabilities the fields to include for returned resources of type subscriptionAvailabilities (optional)
   * @param fieldsSubscriptionGroups the fields to include for returned resources of type subscriptionGroups (optional)
   * @param fieldsSubscriptionIntroductoryOffers the fields to include for returned resources of type subscriptionIntroductoryOffers (optional)
   * @param fieldsSubscriptionPrices the fields to include for returned resources of type subscriptionPrices (optional)
   * @param fieldsSubscriptionLocalizations the fields to include for returned resources of type subscriptionLocalizations (optional)
   * @param limit maximum resources per page (optional)
   * @param limitSubscriptionLocalizations maximum number of related subscriptionLocalizations returned (when they are included) (optional)
   * @param limitIntroductoryOffers maximum number of related introductoryOffers returned (when they are included) (optional)
   * @param limitPromotionalOffers maximum number of related promotionalOffers returned (when they are included) (optional)
   * @param limitOfferCodes maximum number of related offerCodes returned (when they are included) (optional)
   * @param limitPrices maximum number of related prices returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return SubscriptionsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of Subscriptions </td><td>  -  </td></tr>
     </table>
   */
  public SubscriptionsResponse subscriptionGroupsSubscriptionsGetToManyRelated(String id, List<String> filterName, List<String> filterProductId, List<String> filterState, List<String> sort, List<String> fieldsPromotedPurchases, List<String> fieldsSubscriptionPromotionalOffers, List<String> fieldsSubscriptionOfferCodes, List<String> fieldsSubscriptionAppStoreReviewScreenshots, List<String> fieldsSubscriptions, List<String> fieldsSubscriptionAvailabilities, List<String> fieldsSubscriptionGroups, List<String> fieldsSubscriptionIntroductoryOffers, List<String> fieldsSubscriptionPrices, List<String> fieldsSubscriptionLocalizations, Integer limit, Integer limitSubscriptionLocalizations, Integer limitIntroductoryOffers, Integer limitPromotionalOffers, Integer limitOfferCodes, Integer limitPrices, List<String> include) throws ApiException {
    return subscriptionGroupsSubscriptionsGetToManyRelatedWithHttpInfo(id, filterName, filterProductId, filterState, sort, fieldsPromotedPurchases, fieldsSubscriptionPromotionalOffers, fieldsSubscriptionOfferCodes, fieldsSubscriptionAppStoreReviewScreenshots, fieldsSubscriptions, fieldsSubscriptionAvailabilities, fieldsSubscriptionGroups, fieldsSubscriptionIntroductoryOffers, fieldsSubscriptionPrices, fieldsSubscriptionLocalizations, limit, limitSubscriptionLocalizations, limitIntroductoryOffers, limitPromotionalOffers, limitOfferCodes, limitPrices, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterName filter by attribute &#39;name&#39; (optional)
   * @param filterProductId filter by attribute &#39;productId&#39; (optional)
   * @param filterState filter by attribute &#39;state&#39; (optional)
   * @param sort comma-separated list of sort expressions; resources will be sorted as specified (optional)
   * @param fieldsPromotedPurchases the fields to include for returned resources of type promotedPurchases (optional)
   * @param fieldsSubscriptionPromotionalOffers the fields to include for returned resources of type subscriptionPromotionalOffers (optional)
   * @param fieldsSubscriptionOfferCodes the fields to include for returned resources of type subscriptionOfferCodes (optional)
   * @param fieldsSubscriptionAppStoreReviewScreenshots the fields to include for returned resources of type subscriptionAppStoreReviewScreenshots (optional)
   * @param fieldsSubscriptions the fields to include for returned resources of type subscriptions (optional)
   * @param fieldsSubscriptionAvailabilities the fields to include for returned resources of type subscriptionAvailabilities (optional)
   * @param fieldsSubscriptionGroups the fields to include for returned resources of type subscriptionGroups (optional)
   * @param fieldsSubscriptionIntroductoryOffers the fields to include for returned resources of type subscriptionIntroductoryOffers (optional)
   * @param fieldsSubscriptionPrices the fields to include for returned resources of type subscriptionPrices (optional)
   * @param fieldsSubscriptionLocalizations the fields to include for returned resources of type subscriptionLocalizations (optional)
   * @param limit maximum resources per page (optional)
   * @param limitSubscriptionLocalizations maximum number of related subscriptionLocalizations returned (when they are included) (optional)
   * @param limitIntroductoryOffers maximum number of related introductoryOffers returned (when they are included) (optional)
   * @param limitPromotionalOffers maximum number of related promotionalOffers returned (when they are included) (optional)
   * @param limitOfferCodes maximum number of related offerCodes returned (when they are included) (optional)
   * @param limitPrices maximum number of related prices returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;SubscriptionsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of Subscriptions </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubscriptionsResponse> subscriptionGroupsSubscriptionsGetToManyRelatedWithHttpInfo(String id, List<String> filterName, List<String> filterProductId, List<String> filterState, List<String> sort, List<String> fieldsPromotedPurchases, List<String> fieldsSubscriptionPromotionalOffers, List<String> fieldsSubscriptionOfferCodes, List<String> fieldsSubscriptionAppStoreReviewScreenshots, List<String> fieldsSubscriptions, List<String> fieldsSubscriptionAvailabilities, List<String> fieldsSubscriptionGroups, List<String> fieldsSubscriptionIntroductoryOffers, List<String> fieldsSubscriptionPrices, List<String> fieldsSubscriptionLocalizations, Integer limit, Integer limitSubscriptionLocalizations, Integer limitIntroductoryOffers, Integer limitPromotionalOffers, Integer limitOfferCodes, Integer limitPrices, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionGroupsSubscriptionsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/subscriptionGroups/{id}/subscriptions"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[name]", filterName)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[productId]", filterProductId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[state]", filterState));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[promotedPurchases]", fieldsPromotedPurchases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptionPromotionalOffers]", fieldsSubscriptionPromotionalOffers));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptionOfferCodes]", fieldsSubscriptionOfferCodes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptionAppStoreReviewScreenshots]", fieldsSubscriptionAppStoreReviewScreenshots));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptions]", fieldsSubscriptions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptionAvailabilities]", fieldsSubscriptionAvailabilities));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptionGroups]", fieldsSubscriptionGroups));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptionIntroductoryOffers]", fieldsSubscriptionIntroductoryOffers));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptionPrices]", fieldsSubscriptionPrices));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptionLocalizations]", fieldsSubscriptionLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[subscriptionLocalizations]", limitSubscriptionLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[introductoryOffers]", limitIntroductoryOffers));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[promotionalOffers]", limitPromotionalOffers));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[offerCodes]", limitOfferCodes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[prices]", limitPrices));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<SubscriptionsResponse> localVarReturnType = new GenericType<SubscriptionsResponse>() {};
    return apiClient.invokeAPI("SubscriptionGroupsApi.subscriptionGroupsSubscriptionsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param subscriptionGroupUpdateRequest SubscriptionGroup representation (required)
   * @return SubscriptionGroupResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single SubscriptionGroup </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public SubscriptionGroupResponse subscriptionGroupsUpdateInstance(String id, SubscriptionGroupUpdateRequest subscriptionGroupUpdateRequest) throws ApiException {
    return subscriptionGroupsUpdateInstanceWithHttpInfo(id, subscriptionGroupUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param subscriptionGroupUpdateRequest SubscriptionGroup representation (required)
   * @return ApiResponse&lt;SubscriptionGroupResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single SubscriptionGroup </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubscriptionGroupResponse> subscriptionGroupsUpdateInstanceWithHttpInfo(String id, SubscriptionGroupUpdateRequest subscriptionGroupUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionGroupsUpdateInstance");
    }
    if (subscriptionGroupUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'subscriptionGroupUpdateRequest' when calling subscriptionGroupsUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/subscriptionGroups/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<SubscriptionGroupResponse> localVarReturnType = new GenericType<SubscriptionGroupResponse>() {};
    return apiClient.invokeAPI("SubscriptionGroupsApi.subscriptionGroupsUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), subscriptionGroupUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
