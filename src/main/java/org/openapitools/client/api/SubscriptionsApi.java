package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.PromotedPurchaseResponse;
import org.openapitools.client.model.SubscriptionAppStoreReviewScreenshotResponse;
import org.openapitools.client.model.SubscriptionAvailabilityResponse;
import org.openapitools.client.model.SubscriptionCreateRequest;
import org.openapitools.client.model.SubscriptionIntroductoryOffersLinkagesRequest;
import org.openapitools.client.model.SubscriptionIntroductoryOffersLinkagesResponse;
import org.openapitools.client.model.SubscriptionIntroductoryOffersResponse;
import org.openapitools.client.model.SubscriptionLocalizationsResponse;
import org.openapitools.client.model.SubscriptionOfferCodesResponse;
import org.openapitools.client.model.SubscriptionPricePointsResponse;
import org.openapitools.client.model.SubscriptionPricesLinkagesRequest;
import org.openapitools.client.model.SubscriptionPricesLinkagesResponse;
import org.openapitools.client.model.SubscriptionPricesResponse;
import org.openapitools.client.model.SubscriptionPromotionalOffersResponse;
import org.openapitools.client.model.SubscriptionResponse;
import org.openapitools.client.model.SubscriptionUpdateRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class SubscriptionsApi {
  private ApiClient apiClient;

  public SubscriptionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SubscriptionsApi(ApiClient apiClient) {
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
   * @param fieldsSubscriptionAppStoreReviewScreenshots the fields to include for returned resources of type subscriptionAppStoreReviewScreenshots (optional)
   * @param fieldsSubscriptions the fields to include for returned resources of type subscriptions (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return SubscriptionAppStoreReviewScreenshotResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single SubscriptionAppStoreReviewScreenshot </td><td>  -  </td></tr>
     </table>
   */
  public SubscriptionAppStoreReviewScreenshotResponse subscriptionsAppStoreReviewScreenshotGetToOneRelated(String id, List<String> fieldsSubscriptionAppStoreReviewScreenshots, List<String> fieldsSubscriptions, List<String> include) throws ApiException {
    return subscriptionsAppStoreReviewScreenshotGetToOneRelatedWithHttpInfo(id, fieldsSubscriptionAppStoreReviewScreenshots, fieldsSubscriptions, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsSubscriptionAppStoreReviewScreenshots the fields to include for returned resources of type subscriptionAppStoreReviewScreenshots (optional)
   * @param fieldsSubscriptions the fields to include for returned resources of type subscriptions (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;SubscriptionAppStoreReviewScreenshotResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single SubscriptionAppStoreReviewScreenshot </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubscriptionAppStoreReviewScreenshotResponse> subscriptionsAppStoreReviewScreenshotGetToOneRelatedWithHttpInfo(String id, List<String> fieldsSubscriptionAppStoreReviewScreenshots, List<String> fieldsSubscriptions, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionsAppStoreReviewScreenshotGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/subscriptions/{id}/appStoreReviewScreenshot"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[subscriptionAppStoreReviewScreenshots]", fieldsSubscriptionAppStoreReviewScreenshots)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptions]", fieldsSubscriptions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<SubscriptionAppStoreReviewScreenshotResponse> localVarReturnType = new GenericType<SubscriptionAppStoreReviewScreenshotResponse>() {};
    return apiClient.invokeAPI("SubscriptionsApi.subscriptionsAppStoreReviewScreenshotGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param subscriptionCreateRequest Subscription representation (required)
   * @return SubscriptionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single Subscription </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public SubscriptionResponse subscriptionsCreateInstance(SubscriptionCreateRequest subscriptionCreateRequest) throws ApiException {
    return subscriptionsCreateInstanceWithHttpInfo(subscriptionCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param subscriptionCreateRequest Subscription representation (required)
   * @return ApiResponse&lt;SubscriptionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single Subscription </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubscriptionResponse> subscriptionsCreateInstanceWithHttpInfo(SubscriptionCreateRequest subscriptionCreateRequest) throws ApiException {
    // Check required parameters
    if (subscriptionCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'subscriptionCreateRequest' when calling subscriptionsCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<SubscriptionResponse> localVarReturnType = new GenericType<SubscriptionResponse>() {};
    return apiClient.invokeAPI("SubscriptionsApi.subscriptionsCreateInstance", "/v1/subscriptions", "POST", new ArrayList<>(), subscriptionCreateRequest,
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
  public void subscriptionsDeleteInstance(String id) throws ApiException {
    subscriptionsDeleteInstanceWithHttpInfo(id);
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
  public ApiResponse<Void> subscriptionsDeleteInstanceWithHttpInfo(String id) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionsDeleteInstance");
    }

    // Path parameters
    String localVarPath = "/v1/subscriptions/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("SubscriptionsApi.subscriptionsDeleteInstance", localVarPath, "DELETE", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsSubscriptions the fields to include for returned resources of type subscriptions (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsPromotedPurchases the fields to include for returned resources of type promotedPurchases (optional)
   * @param fieldsSubscriptionPricePoints the fields to include for returned resources of type subscriptionPricePoints (optional)
   * @param fieldsSubscriptionPromotionalOffers the fields to include for returned resources of type subscriptionPromotionalOffers (optional)
   * @param fieldsSubscriptionOfferCodes the fields to include for returned resources of type subscriptionOfferCodes (optional)
   * @param fieldsSubscriptionAppStoreReviewScreenshots the fields to include for returned resources of type subscriptionAppStoreReviewScreenshots (optional)
   * @param fieldsSubscriptionAvailabilities the fields to include for returned resources of type subscriptionAvailabilities (optional)
   * @param fieldsSubscriptionPrices the fields to include for returned resources of type subscriptionPrices (optional)
   * @param fieldsSubscriptionIntroductoryOffers the fields to include for returned resources of type subscriptionIntroductoryOffers (optional)
   * @param fieldsSubscriptionLocalizations the fields to include for returned resources of type subscriptionLocalizations (optional)
   * @param limitIntroductoryOffers maximum number of related introductoryOffers returned (when they are included) (optional)
   * @param limitOfferCodes maximum number of related offerCodes returned (when they are included) (optional)
   * @param limitPrices maximum number of related prices returned (when they are included) (optional)
   * @param limitPromotionalOffers maximum number of related promotionalOffers returned (when they are included) (optional)
   * @param limitSubscriptionLocalizations maximum number of related subscriptionLocalizations returned (when they are included) (optional)
   * @return SubscriptionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single Subscription </td><td>  -  </td></tr>
     </table>
   */
  public SubscriptionResponse subscriptionsGetInstance(String id, List<String> fieldsSubscriptions, List<String> include, List<String> fieldsPromotedPurchases, List<String> fieldsSubscriptionPricePoints, List<String> fieldsSubscriptionPromotionalOffers, List<String> fieldsSubscriptionOfferCodes, List<String> fieldsSubscriptionAppStoreReviewScreenshots, List<String> fieldsSubscriptionAvailabilities, List<String> fieldsSubscriptionPrices, List<String> fieldsSubscriptionIntroductoryOffers, List<String> fieldsSubscriptionLocalizations, Integer limitIntroductoryOffers, Integer limitOfferCodes, Integer limitPrices, Integer limitPromotionalOffers, Integer limitSubscriptionLocalizations) throws ApiException {
    return subscriptionsGetInstanceWithHttpInfo(id, fieldsSubscriptions, include, fieldsPromotedPurchases, fieldsSubscriptionPricePoints, fieldsSubscriptionPromotionalOffers, fieldsSubscriptionOfferCodes, fieldsSubscriptionAppStoreReviewScreenshots, fieldsSubscriptionAvailabilities, fieldsSubscriptionPrices, fieldsSubscriptionIntroductoryOffers, fieldsSubscriptionLocalizations, limitIntroductoryOffers, limitOfferCodes, limitPrices, limitPromotionalOffers, limitSubscriptionLocalizations).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsSubscriptions the fields to include for returned resources of type subscriptions (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @param fieldsPromotedPurchases the fields to include for returned resources of type promotedPurchases (optional)
   * @param fieldsSubscriptionPricePoints the fields to include for returned resources of type subscriptionPricePoints (optional)
   * @param fieldsSubscriptionPromotionalOffers the fields to include for returned resources of type subscriptionPromotionalOffers (optional)
   * @param fieldsSubscriptionOfferCodes the fields to include for returned resources of type subscriptionOfferCodes (optional)
   * @param fieldsSubscriptionAppStoreReviewScreenshots the fields to include for returned resources of type subscriptionAppStoreReviewScreenshots (optional)
   * @param fieldsSubscriptionAvailabilities the fields to include for returned resources of type subscriptionAvailabilities (optional)
   * @param fieldsSubscriptionPrices the fields to include for returned resources of type subscriptionPrices (optional)
   * @param fieldsSubscriptionIntroductoryOffers the fields to include for returned resources of type subscriptionIntroductoryOffers (optional)
   * @param fieldsSubscriptionLocalizations the fields to include for returned resources of type subscriptionLocalizations (optional)
   * @param limitIntroductoryOffers maximum number of related introductoryOffers returned (when they are included) (optional)
   * @param limitOfferCodes maximum number of related offerCodes returned (when they are included) (optional)
   * @param limitPrices maximum number of related prices returned (when they are included) (optional)
   * @param limitPromotionalOffers maximum number of related promotionalOffers returned (when they are included) (optional)
   * @param limitSubscriptionLocalizations maximum number of related subscriptionLocalizations returned (when they are included) (optional)
   * @return ApiResponse&lt;SubscriptionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single Subscription </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubscriptionResponse> subscriptionsGetInstanceWithHttpInfo(String id, List<String> fieldsSubscriptions, List<String> include, List<String> fieldsPromotedPurchases, List<String> fieldsSubscriptionPricePoints, List<String> fieldsSubscriptionPromotionalOffers, List<String> fieldsSubscriptionOfferCodes, List<String> fieldsSubscriptionAppStoreReviewScreenshots, List<String> fieldsSubscriptionAvailabilities, List<String> fieldsSubscriptionPrices, List<String> fieldsSubscriptionIntroductoryOffers, List<String> fieldsSubscriptionLocalizations, Integer limitIntroductoryOffers, Integer limitOfferCodes, Integer limitPrices, Integer limitPromotionalOffers, Integer limitSubscriptionLocalizations) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionsGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/subscriptions/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[subscriptions]", fieldsSubscriptions)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[promotedPurchases]", fieldsPromotedPurchases));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptionPricePoints]", fieldsSubscriptionPricePoints));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptionPromotionalOffers]", fieldsSubscriptionPromotionalOffers));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptionOfferCodes]", fieldsSubscriptionOfferCodes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptionAppStoreReviewScreenshots]", fieldsSubscriptionAppStoreReviewScreenshots));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptionAvailabilities]", fieldsSubscriptionAvailabilities));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptionPrices]", fieldsSubscriptionPrices));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptionIntroductoryOffers]", fieldsSubscriptionIntroductoryOffers));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptionLocalizations]", fieldsSubscriptionLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[introductoryOffers]", limitIntroductoryOffers));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[offerCodes]", limitOfferCodes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[prices]", limitPrices));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[promotionalOffers]", limitPromotionalOffers));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[subscriptionLocalizations]", limitSubscriptionLocalizations));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<SubscriptionResponse> localVarReturnType = new GenericType<SubscriptionResponse>() {};
    return apiClient.invokeAPI("SubscriptionsApi.subscriptionsGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param subscriptionIntroductoryOffersLinkagesRequest List of related linkages (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success (no content) </td><td>  -  </td></tr>
     </table>
   */
  public void subscriptionsIntroductoryOffersDeleteToManyRelationship(String id, SubscriptionIntroductoryOffersLinkagesRequest subscriptionIntroductoryOffersLinkagesRequest) throws ApiException {
    subscriptionsIntroductoryOffersDeleteToManyRelationshipWithHttpInfo(id, subscriptionIntroductoryOffersLinkagesRequest);
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param subscriptionIntroductoryOffersLinkagesRequest List of related linkages (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success (no content) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> subscriptionsIntroductoryOffersDeleteToManyRelationshipWithHttpInfo(String id, SubscriptionIntroductoryOffersLinkagesRequest subscriptionIntroductoryOffersLinkagesRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionsIntroductoryOffersDeleteToManyRelationship");
    }
    if (subscriptionIntroductoryOffersLinkagesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'subscriptionIntroductoryOffersLinkagesRequest' when calling subscriptionsIntroductoryOffersDeleteToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/subscriptions/{id}/relationships/introductoryOffers"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("SubscriptionsApi.subscriptionsIntroductoryOffersDeleteToManyRelationship", localVarPath, "DELETE", new ArrayList<>(), subscriptionIntroductoryOffersLinkagesRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterTerritory filter by id(s) of related &#39;territory&#39; (optional)
   * @param fieldsSubscriptionPricePoints the fields to include for returned resources of type subscriptionPricePoints (optional)
   * @param fieldsSubscriptions the fields to include for returned resources of type subscriptions (optional)
   * @param fieldsSubscriptionIntroductoryOffers the fields to include for returned resources of type subscriptionIntroductoryOffers (optional)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return SubscriptionIntroductoryOffersResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of SubscriptionIntroductoryOffers </td><td>  -  </td></tr>
     </table>
   */
  public SubscriptionIntroductoryOffersResponse subscriptionsIntroductoryOffersGetToManyRelated(String id, List<String> filterTerritory, List<String> fieldsSubscriptionPricePoints, List<String> fieldsSubscriptions, List<String> fieldsSubscriptionIntroductoryOffers, List<String> fieldsTerritories, Integer limit, List<String> include) throws ApiException {
    return subscriptionsIntroductoryOffersGetToManyRelatedWithHttpInfo(id, filterTerritory, fieldsSubscriptionPricePoints, fieldsSubscriptions, fieldsSubscriptionIntroductoryOffers, fieldsTerritories, limit, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterTerritory filter by id(s) of related &#39;territory&#39; (optional)
   * @param fieldsSubscriptionPricePoints the fields to include for returned resources of type subscriptionPricePoints (optional)
   * @param fieldsSubscriptions the fields to include for returned resources of type subscriptions (optional)
   * @param fieldsSubscriptionIntroductoryOffers the fields to include for returned resources of type subscriptionIntroductoryOffers (optional)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;SubscriptionIntroductoryOffersResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of SubscriptionIntroductoryOffers </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubscriptionIntroductoryOffersResponse> subscriptionsIntroductoryOffersGetToManyRelatedWithHttpInfo(String id, List<String> filterTerritory, List<String> fieldsSubscriptionPricePoints, List<String> fieldsSubscriptions, List<String> fieldsSubscriptionIntroductoryOffers, List<String> fieldsTerritories, Integer limit, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionsIntroductoryOffersGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/subscriptions/{id}/introductoryOffers"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[territory]", filterTerritory)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptionPricePoints]", fieldsSubscriptionPricePoints));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptions]", fieldsSubscriptions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptionIntroductoryOffers]", fieldsSubscriptionIntroductoryOffers));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[territories]", fieldsTerritories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<SubscriptionIntroductoryOffersResponse> localVarReturnType = new GenericType<SubscriptionIntroductoryOffersResponse>() {};
    return apiClient.invokeAPI("SubscriptionsApi.subscriptionsIntroductoryOffersGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param limit maximum resources per page (optional)
   * @return SubscriptionIntroductoryOffersLinkagesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of related linkages </td><td>  -  </td></tr>
     </table>
   */
  public SubscriptionIntroductoryOffersLinkagesResponse subscriptionsIntroductoryOffersGetToManyRelationship(String id, Integer limit) throws ApiException {
    return subscriptionsIntroductoryOffersGetToManyRelationshipWithHttpInfo(id, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;SubscriptionIntroductoryOffersLinkagesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of related linkages </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubscriptionIntroductoryOffersLinkagesResponse> subscriptionsIntroductoryOffersGetToManyRelationshipWithHttpInfo(String id, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionsIntroductoryOffersGetToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/subscriptions/{id}/relationships/introductoryOffers"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "limit", limit)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<SubscriptionIntroductoryOffersLinkagesResponse> localVarReturnType = new GenericType<SubscriptionIntroductoryOffersLinkagesResponse>() {};
    return apiClient.invokeAPI("SubscriptionsApi.subscriptionsIntroductoryOffersGetToManyRelationship", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterTerritory filter by territory (optional)
   * @param fieldsSubscriptionOfferCodeCustomCodes the fields to include for returned resources of type subscriptionOfferCodeCustomCodes (optional)
   * @param fieldsSubscriptionOfferCodes the fields to include for returned resources of type subscriptionOfferCodes (optional)
   * @param fieldsSubscriptionOfferCodeOneTimeUseCodes the fields to include for returned resources of type subscriptionOfferCodeOneTimeUseCodes (optional)
   * @param fieldsSubscriptions the fields to include for returned resources of type subscriptions (optional)
   * @param fieldsSubscriptionOfferCodePrices the fields to include for returned resources of type subscriptionOfferCodePrices (optional)
   * @param limit maximum resources per page (optional)
   * @param limitOneTimeUseCodes maximum number of related oneTimeUseCodes returned (when they are included) (optional)
   * @param limitCustomCodes maximum number of related customCodes returned (when they are included) (optional)
   * @param limitPrices maximum number of related prices returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return SubscriptionOfferCodesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of SubscriptionOfferCodes </td><td>  -  </td></tr>
     </table>
   */
  public SubscriptionOfferCodesResponse subscriptionsOfferCodesGetToManyRelated(String id, List<String> filterTerritory, List<String> fieldsSubscriptionOfferCodeCustomCodes, List<String> fieldsSubscriptionOfferCodes, List<String> fieldsSubscriptionOfferCodeOneTimeUseCodes, List<String> fieldsSubscriptions, List<String> fieldsSubscriptionOfferCodePrices, Integer limit, Integer limitOneTimeUseCodes, Integer limitCustomCodes, Integer limitPrices, List<String> include) throws ApiException {
    return subscriptionsOfferCodesGetToManyRelatedWithHttpInfo(id, filterTerritory, fieldsSubscriptionOfferCodeCustomCodes, fieldsSubscriptionOfferCodes, fieldsSubscriptionOfferCodeOneTimeUseCodes, fieldsSubscriptions, fieldsSubscriptionOfferCodePrices, limit, limitOneTimeUseCodes, limitCustomCodes, limitPrices, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterTerritory filter by territory (optional)
   * @param fieldsSubscriptionOfferCodeCustomCodes the fields to include for returned resources of type subscriptionOfferCodeCustomCodes (optional)
   * @param fieldsSubscriptionOfferCodes the fields to include for returned resources of type subscriptionOfferCodes (optional)
   * @param fieldsSubscriptionOfferCodeOneTimeUseCodes the fields to include for returned resources of type subscriptionOfferCodeOneTimeUseCodes (optional)
   * @param fieldsSubscriptions the fields to include for returned resources of type subscriptions (optional)
   * @param fieldsSubscriptionOfferCodePrices the fields to include for returned resources of type subscriptionOfferCodePrices (optional)
   * @param limit maximum resources per page (optional)
   * @param limitOneTimeUseCodes maximum number of related oneTimeUseCodes returned (when they are included) (optional)
   * @param limitCustomCodes maximum number of related customCodes returned (when they are included) (optional)
   * @param limitPrices maximum number of related prices returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;SubscriptionOfferCodesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of SubscriptionOfferCodes </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubscriptionOfferCodesResponse> subscriptionsOfferCodesGetToManyRelatedWithHttpInfo(String id, List<String> filterTerritory, List<String> fieldsSubscriptionOfferCodeCustomCodes, List<String> fieldsSubscriptionOfferCodes, List<String> fieldsSubscriptionOfferCodeOneTimeUseCodes, List<String> fieldsSubscriptions, List<String> fieldsSubscriptionOfferCodePrices, Integer limit, Integer limitOneTimeUseCodes, Integer limitCustomCodes, Integer limitPrices, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionsOfferCodesGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/subscriptions/{id}/offerCodes"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[territory]", filterTerritory)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptionOfferCodeCustomCodes]", fieldsSubscriptionOfferCodeCustomCodes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptionOfferCodes]", fieldsSubscriptionOfferCodes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptionOfferCodeOneTimeUseCodes]", fieldsSubscriptionOfferCodeOneTimeUseCodes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptions]", fieldsSubscriptions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptionOfferCodePrices]", fieldsSubscriptionOfferCodePrices));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[oneTimeUseCodes]", limitOneTimeUseCodes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[customCodes]", limitCustomCodes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[prices]", limitPrices));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<SubscriptionOfferCodesResponse> localVarReturnType = new GenericType<SubscriptionOfferCodesResponse>() {};
    return apiClient.invokeAPI("SubscriptionsApi.subscriptionsOfferCodesGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterTerritory filter by id(s) of related &#39;territory&#39; (optional)
   * @param fieldsSubscriptionPricePoints the fields to include for returned resources of type subscriptionPricePoints (optional)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return SubscriptionPricePointsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of SubscriptionPricePoints </td><td>  -  </td></tr>
     </table>
   */
  public SubscriptionPricePointsResponse subscriptionsPricePointsGetToManyRelated(String id, List<String> filterTerritory, List<String> fieldsSubscriptionPricePoints, List<String> fieldsTerritories, Integer limit, List<String> include) throws ApiException {
    return subscriptionsPricePointsGetToManyRelatedWithHttpInfo(id, filterTerritory, fieldsSubscriptionPricePoints, fieldsTerritories, limit, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterTerritory filter by id(s) of related &#39;territory&#39; (optional)
   * @param fieldsSubscriptionPricePoints the fields to include for returned resources of type subscriptionPricePoints (optional)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;SubscriptionPricePointsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of SubscriptionPricePoints </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubscriptionPricePointsResponse> subscriptionsPricePointsGetToManyRelatedWithHttpInfo(String id, List<String> filterTerritory, List<String> fieldsSubscriptionPricePoints, List<String> fieldsTerritories, Integer limit, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionsPricePointsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/subscriptions/{id}/pricePoints"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[territory]", filterTerritory)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptionPricePoints]", fieldsSubscriptionPricePoints));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[territories]", fieldsTerritories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json", "text/csv");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<SubscriptionPricePointsResponse> localVarReturnType = new GenericType<SubscriptionPricePointsResponse>() {};
    return apiClient.invokeAPI("SubscriptionsApi.subscriptionsPricePointsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param subscriptionPricesLinkagesRequest List of related linkages (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success (no content) </td><td>  -  </td></tr>
     </table>
   */
  public void subscriptionsPricesDeleteToManyRelationship(String id, SubscriptionPricesLinkagesRequest subscriptionPricesLinkagesRequest) throws ApiException {
    subscriptionsPricesDeleteToManyRelationshipWithHttpInfo(id, subscriptionPricesLinkagesRequest);
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param subscriptionPricesLinkagesRequest List of related linkages (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 204 </td><td> Success (no content) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> subscriptionsPricesDeleteToManyRelationshipWithHttpInfo(String id, SubscriptionPricesLinkagesRequest subscriptionPricesLinkagesRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionsPricesDeleteToManyRelationship");
    }
    if (subscriptionPricesLinkagesRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'subscriptionPricesLinkagesRequest' when calling subscriptionsPricesDeleteToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/subscriptions/{id}/relationships/prices"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    return apiClient.invokeAPI("SubscriptionsApi.subscriptionsPricesDeleteToManyRelationship", localVarPath, "DELETE", new ArrayList<>(), subscriptionPricesLinkagesRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterSubscriptionPricePoint filter by id(s) of related &#39;subscriptionPricePoint&#39; (optional)
   * @param filterTerritory filter by id(s) of related &#39;territory&#39; (optional)
   * @param fieldsSubscriptionPricePoints the fields to include for returned resources of type subscriptionPricePoints (optional)
   * @param fieldsSubscriptionPrices the fields to include for returned resources of type subscriptionPrices (optional)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return SubscriptionPricesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of SubscriptionPrices </td><td>  -  </td></tr>
     </table>
   */
  public SubscriptionPricesResponse subscriptionsPricesGetToManyRelated(String id, List<String> filterSubscriptionPricePoint, List<String> filterTerritory, List<String> fieldsSubscriptionPricePoints, List<String> fieldsSubscriptionPrices, List<String> fieldsTerritories, Integer limit, List<String> include) throws ApiException {
    return subscriptionsPricesGetToManyRelatedWithHttpInfo(id, filterSubscriptionPricePoint, filterTerritory, fieldsSubscriptionPricePoints, fieldsSubscriptionPrices, fieldsTerritories, limit, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterSubscriptionPricePoint filter by id(s) of related &#39;subscriptionPricePoint&#39; (optional)
   * @param filterTerritory filter by id(s) of related &#39;territory&#39; (optional)
   * @param fieldsSubscriptionPricePoints the fields to include for returned resources of type subscriptionPricePoints (optional)
   * @param fieldsSubscriptionPrices the fields to include for returned resources of type subscriptionPrices (optional)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;SubscriptionPricesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of SubscriptionPrices </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubscriptionPricesResponse> subscriptionsPricesGetToManyRelatedWithHttpInfo(String id, List<String> filterSubscriptionPricePoint, List<String> filterTerritory, List<String> fieldsSubscriptionPricePoints, List<String> fieldsSubscriptionPrices, List<String> fieldsTerritories, Integer limit, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionsPricesGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/subscriptions/{id}/prices"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[subscriptionPricePoint]", filterSubscriptionPricePoint)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[territory]", filterTerritory));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptionPricePoints]", fieldsSubscriptionPricePoints));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptionPrices]", fieldsSubscriptionPrices));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[territories]", fieldsTerritories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<SubscriptionPricesResponse> localVarReturnType = new GenericType<SubscriptionPricesResponse>() {};
    return apiClient.invokeAPI("SubscriptionsApi.subscriptionsPricesGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param limit maximum resources per page (optional)
   * @return SubscriptionPricesLinkagesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of related linkages </td><td>  -  </td></tr>
     </table>
   */
  public SubscriptionPricesLinkagesResponse subscriptionsPricesGetToManyRelationship(String id, Integer limit) throws ApiException {
    return subscriptionsPricesGetToManyRelationshipWithHttpInfo(id, limit).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;SubscriptionPricesLinkagesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of related linkages </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubscriptionPricesLinkagesResponse> subscriptionsPricesGetToManyRelationshipWithHttpInfo(String id, Integer limit) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionsPricesGetToManyRelationship");
    }

    // Path parameters
    String localVarPath = "/v1/subscriptions/{id}/relationships/prices"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "limit", limit)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<SubscriptionPricesLinkagesResponse> localVarReturnType = new GenericType<SubscriptionPricesLinkagesResponse>() {};
    return apiClient.invokeAPI("SubscriptionsApi.subscriptionsPricesGetToManyRelationship", localVarPath, "GET", localVarQueryParams, null,
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
  public PromotedPurchaseResponse subscriptionsPromotedPurchaseGetToOneRelated(String id, List<String> fieldsPromotedPurchases, List<String> fieldsSubscriptions, List<String> fieldsInAppPurchases, List<String> fieldsPromotedPurchaseImages, Integer limitPromotionImages, List<String> include) throws ApiException {
    return subscriptionsPromotedPurchaseGetToOneRelatedWithHttpInfo(id, fieldsPromotedPurchases, fieldsSubscriptions, fieldsInAppPurchases, fieldsPromotedPurchaseImages, limitPromotionImages, include).getData();
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
  public ApiResponse<PromotedPurchaseResponse> subscriptionsPromotedPurchaseGetToOneRelatedWithHttpInfo(String id, List<String> fieldsPromotedPurchases, List<String> fieldsSubscriptions, List<String> fieldsInAppPurchases, List<String> fieldsPromotedPurchaseImages, Integer limitPromotionImages, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionsPromotedPurchaseGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/subscriptions/{id}/promotedPurchase"
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
    return apiClient.invokeAPI("SubscriptionsApi.subscriptionsPromotedPurchaseGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterTerritory filter by territory (optional)
   * @param fieldsSubscriptionPromotionalOffers the fields to include for returned resources of type subscriptionPromotionalOffers (optional)
   * @param fieldsSubscriptions the fields to include for returned resources of type subscriptions (optional)
   * @param fieldsSubscriptionPromotionalOfferPrices the fields to include for returned resources of type subscriptionPromotionalOfferPrices (optional)
   * @param limit maximum resources per page (optional)
   * @param limitPrices maximum number of related prices returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return SubscriptionPromotionalOffersResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of SubscriptionPromotionalOffers </td><td>  -  </td></tr>
     </table>
   */
  public SubscriptionPromotionalOffersResponse subscriptionsPromotionalOffersGetToManyRelated(String id, List<String> filterTerritory, List<String> fieldsSubscriptionPromotionalOffers, List<String> fieldsSubscriptions, List<String> fieldsSubscriptionPromotionalOfferPrices, Integer limit, Integer limitPrices, List<String> include) throws ApiException {
    return subscriptionsPromotionalOffersGetToManyRelatedWithHttpInfo(id, filterTerritory, fieldsSubscriptionPromotionalOffers, fieldsSubscriptions, fieldsSubscriptionPromotionalOfferPrices, limit, limitPrices, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param filterTerritory filter by territory (optional)
   * @param fieldsSubscriptionPromotionalOffers the fields to include for returned resources of type subscriptionPromotionalOffers (optional)
   * @param fieldsSubscriptions the fields to include for returned resources of type subscriptions (optional)
   * @param fieldsSubscriptionPromotionalOfferPrices the fields to include for returned resources of type subscriptionPromotionalOfferPrices (optional)
   * @param limit maximum resources per page (optional)
   * @param limitPrices maximum number of related prices returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;SubscriptionPromotionalOffersResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of SubscriptionPromotionalOffers </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubscriptionPromotionalOffersResponse> subscriptionsPromotionalOffersGetToManyRelatedWithHttpInfo(String id, List<String> filterTerritory, List<String> fieldsSubscriptionPromotionalOffers, List<String> fieldsSubscriptions, List<String> fieldsSubscriptionPromotionalOfferPrices, Integer limit, Integer limitPrices, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionsPromotionalOffersGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/subscriptions/{id}/promotionalOffers"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[territory]", filterTerritory)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptionPromotionalOffers]", fieldsSubscriptionPromotionalOffers));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptions]", fieldsSubscriptions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptionPromotionalOfferPrices]", fieldsSubscriptionPromotionalOfferPrices));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[prices]", limitPrices));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<SubscriptionPromotionalOffersResponse> localVarReturnType = new GenericType<SubscriptionPromotionalOffersResponse>() {};
    return apiClient.invokeAPI("SubscriptionsApi.subscriptionsPromotionalOffersGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsSubscriptionAvailabilities the fields to include for returned resources of type subscriptionAvailabilities (optional)
   * @param fieldsSubscriptions the fields to include for returned resources of type subscriptions (optional)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limitAvailableTerritories maximum number of related availableTerritories returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return SubscriptionAvailabilityResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single SubscriptionAvailability </td><td>  -  </td></tr>
     </table>
   */
  public SubscriptionAvailabilityResponse subscriptionsSubscriptionAvailabilityGetToOneRelated(String id, List<String> fieldsSubscriptionAvailabilities, List<String> fieldsSubscriptions, List<String> fieldsTerritories, Integer limitAvailableTerritories, List<String> include) throws ApiException {
    return subscriptionsSubscriptionAvailabilityGetToOneRelatedWithHttpInfo(id, fieldsSubscriptionAvailabilities, fieldsSubscriptions, fieldsTerritories, limitAvailableTerritories, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsSubscriptionAvailabilities the fields to include for returned resources of type subscriptionAvailabilities (optional)
   * @param fieldsSubscriptions the fields to include for returned resources of type subscriptions (optional)
   * @param fieldsTerritories the fields to include for returned resources of type territories (optional)
   * @param limitAvailableTerritories maximum number of related availableTerritories returned (when they are included) (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;SubscriptionAvailabilityResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single SubscriptionAvailability </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubscriptionAvailabilityResponse> subscriptionsSubscriptionAvailabilityGetToOneRelatedWithHttpInfo(String id, List<String> fieldsSubscriptionAvailabilities, List<String> fieldsSubscriptions, List<String> fieldsTerritories, Integer limitAvailableTerritories, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionsSubscriptionAvailabilityGetToOneRelated");
    }

    // Path parameters
    String localVarPath = "/v1/subscriptions/{id}/subscriptionAvailability"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[subscriptionAvailabilities]", fieldsSubscriptionAvailabilities)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptions]", fieldsSubscriptions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[territories]", fieldsTerritories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit[availableTerritories]", limitAvailableTerritories));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<SubscriptionAvailabilityResponse> localVarReturnType = new GenericType<SubscriptionAvailabilityResponse>() {};
    return apiClient.invokeAPI("SubscriptionsApi.subscriptionsSubscriptionAvailabilityGetToOneRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsSubscriptions the fields to include for returned resources of type subscriptions (optional)
   * @param fieldsSubscriptionLocalizations the fields to include for returned resources of type subscriptionLocalizations (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return SubscriptionLocalizationsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of SubscriptionLocalizations </td><td>  -  </td></tr>
     </table>
   */
  public SubscriptionLocalizationsResponse subscriptionsSubscriptionLocalizationsGetToManyRelated(String id, List<String> fieldsSubscriptions, List<String> fieldsSubscriptionLocalizations, Integer limit, List<String> include) throws ApiException {
    return subscriptionsSubscriptionLocalizationsGetToManyRelatedWithHttpInfo(id, fieldsSubscriptions, fieldsSubscriptionLocalizations, limit, include).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsSubscriptions the fields to include for returned resources of type subscriptions (optional)
   * @param fieldsSubscriptionLocalizations the fields to include for returned resources of type subscriptionLocalizations (optional)
   * @param limit maximum resources per page (optional)
   * @param include comma-separated list of relationships to include (optional)
   * @return ApiResponse&lt;SubscriptionLocalizationsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of SubscriptionLocalizations </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubscriptionLocalizationsResponse> subscriptionsSubscriptionLocalizationsGetToManyRelatedWithHttpInfo(String id, List<String> fieldsSubscriptions, List<String> fieldsSubscriptionLocalizations, Integer limit, List<String> include) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionsSubscriptionLocalizationsGetToManyRelated");
    }

    // Path parameters
    String localVarPath = "/v1/subscriptions/{id}/subscriptionLocalizations"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[subscriptions]", fieldsSubscriptions)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[subscriptionLocalizations]", fieldsSubscriptionLocalizations));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "include", include));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<SubscriptionLocalizationsResponse> localVarReturnType = new GenericType<SubscriptionLocalizationsResponse>() {};
    return apiClient.invokeAPI("SubscriptionsApi.subscriptionsSubscriptionLocalizationsGetToManyRelated", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param subscriptionUpdateRequest Subscription representation (required)
   * @return SubscriptionResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single Subscription </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public SubscriptionResponse subscriptionsUpdateInstance(String id, SubscriptionUpdateRequest subscriptionUpdateRequest) throws ApiException {
    return subscriptionsUpdateInstanceWithHttpInfo(id, subscriptionUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param subscriptionUpdateRequest Subscription representation (required)
   * @return ApiResponse&lt;SubscriptionResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single Subscription </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SubscriptionResponse> subscriptionsUpdateInstanceWithHttpInfo(String id, SubscriptionUpdateRequest subscriptionUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling subscriptionsUpdateInstance");
    }
    if (subscriptionUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'subscriptionUpdateRequest' when calling subscriptionsUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/subscriptions/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<SubscriptionResponse> localVarReturnType = new GenericType<SubscriptionResponse>() {};
    return apiClient.invokeAPI("SubscriptionsApi.subscriptionsUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), subscriptionUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
