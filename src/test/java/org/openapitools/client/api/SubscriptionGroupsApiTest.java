/*
 * App Store Connect API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 3.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.*;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.SubscriptionGroupCreateRequest;
import org.openapitools.client.model.SubscriptionGroupLocalizationsResponse;
import org.openapitools.client.model.SubscriptionGroupResponse;
import org.openapitools.client.model.SubscriptionGroupUpdateRequest;
import org.openapitools.client.model.SubscriptionsResponse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SubscriptionGroupsApi
 */
public class SubscriptionGroupsApiTest {

    private final SubscriptionGroupsApi api = new SubscriptionGroupsApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void subscriptionGroupsCreateInstanceTest() throws ApiException {
        //SubscriptionGroupCreateRequest subscriptionGroupCreateRequest = null;
        //SubscriptionGroupResponse response = api.subscriptionGroupsCreateInstance(subscriptionGroupCreateRequest);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void subscriptionGroupsDeleteInstanceTest() throws ApiException {
        //String id = null;
        //api.subscriptionGroupsDeleteInstance(id);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void subscriptionGroupsGetInstanceTest() throws ApiException {
        //String id = null;
        //List<String> fieldsSubscriptionGroups = null;
        //List<String> include = null;
        //List<String> fieldsSubscriptions = null;
        //List<String> fieldsSubscriptionGroupLocalizations = null;
        //Integer limitSubscriptionGroupLocalizations = null;
        //Integer limitSubscriptions = null;
        //SubscriptionGroupResponse response = api.subscriptionGroupsGetInstance(id, fieldsSubscriptionGroups, include, fieldsSubscriptions, fieldsSubscriptionGroupLocalizations, limitSubscriptionGroupLocalizations, limitSubscriptions);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void subscriptionGroupsSubscriptionGroupLocalizationsGetToManyRelatedTest() throws ApiException {
        //String id = null;
        //List<String> fieldsSubscriptionGroups = null;
        //List<String> fieldsSubscriptionGroupLocalizations = null;
        //Integer limit = null;
        //List<String> include = null;
        //SubscriptionGroupLocalizationsResponse response = api.subscriptionGroupsSubscriptionGroupLocalizationsGetToManyRelated(id, fieldsSubscriptionGroups, fieldsSubscriptionGroupLocalizations, limit, include);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void subscriptionGroupsSubscriptionsGetToManyRelatedTest() throws ApiException {
        //String id = null;
        //List<String> filterName = null;
        //List<String> filterProductId = null;
        //List<String> filterState = null;
        //List<String> sort = null;
        //List<String> fieldsPromotedPurchases = null;
        //List<String> fieldsSubscriptionPromotionalOffers = null;
        //List<String> fieldsSubscriptionOfferCodes = null;
        //List<String> fieldsSubscriptionAppStoreReviewScreenshots = null;
        //List<String> fieldsSubscriptions = null;
        //List<String> fieldsSubscriptionAvailabilities = null;
        //List<String> fieldsSubscriptionGroups = null;
        //List<String> fieldsSubscriptionIntroductoryOffers = null;
        //List<String> fieldsSubscriptionPrices = null;
        //List<String> fieldsSubscriptionLocalizations = null;
        //Integer limit = null;
        //Integer limitSubscriptionLocalizations = null;
        //Integer limitIntroductoryOffers = null;
        //Integer limitPromotionalOffers = null;
        //Integer limitOfferCodes = null;
        //Integer limitPrices = null;
        //List<String> include = null;
        //SubscriptionsResponse response = api.subscriptionGroupsSubscriptionsGetToManyRelated(id, filterName, filterProductId, filterState, sort, fieldsPromotedPurchases, fieldsSubscriptionPromotionalOffers, fieldsSubscriptionOfferCodes, fieldsSubscriptionAppStoreReviewScreenshots, fieldsSubscriptions, fieldsSubscriptionAvailabilities, fieldsSubscriptionGroups, fieldsSubscriptionIntroductoryOffers, fieldsSubscriptionPrices, fieldsSubscriptionLocalizations, limit, limitSubscriptionLocalizations, limitIntroductoryOffers, limitPromotionalOffers, limitOfferCodes, limitPrices, include);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void subscriptionGroupsUpdateInstanceTest() throws ApiException {
        //String id = null;
        //SubscriptionGroupUpdateRequest subscriptionGroupUpdateRequest = null;
        //SubscriptionGroupResponse response = api.subscriptionGroupsUpdateInstance(id, subscriptionGroupUpdateRequest);
        // TODO: test validations
    }

}
