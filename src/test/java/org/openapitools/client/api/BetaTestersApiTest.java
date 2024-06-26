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
import org.openapitools.client.model.AppsWithoutIncludesResponse;
import org.openapitools.client.model.BetaGroupsWithoutIncludesResponse;
import org.openapitools.client.model.BetaTesterAppsLinkagesRequest;
import org.openapitools.client.model.BetaTesterAppsLinkagesResponse;
import org.openapitools.client.model.BetaTesterBetaGroupsLinkagesRequest;
import org.openapitools.client.model.BetaTesterBetaGroupsLinkagesResponse;
import org.openapitools.client.model.BetaTesterBuildsLinkagesRequest;
import org.openapitools.client.model.BetaTesterBuildsLinkagesResponse;
import org.openapitools.client.model.BetaTesterCreateRequest;
import org.openapitools.client.model.BetaTesterResponse;
import org.openapitools.client.model.BetaTesterUsagesV1MetricResponse;
import org.openapitools.client.model.BetaTestersResponse;
import org.openapitools.client.model.BuildsWithoutIncludesResponse;
import org.openapitools.client.model.ErrorResponse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BetaTestersApi
 */
public class BetaTestersApiTest {

    private final BetaTestersApi api = new BetaTestersApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void betaTestersAppsDeleteToManyRelationshipTest() throws ApiException {
        //String id = null;
        //BetaTesterAppsLinkagesRequest betaTesterAppsLinkagesRequest = null;
        //api.betaTestersAppsDeleteToManyRelationship(id, betaTesterAppsLinkagesRequest);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void betaTestersAppsGetToManyRelatedTest() throws ApiException {
        //String id = null;
        //List<String> fieldsApps = null;
        //Integer limit = null;
        //AppsWithoutIncludesResponse response = api.betaTestersAppsGetToManyRelated(id, fieldsApps, limit);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void betaTestersAppsGetToManyRelationshipTest() throws ApiException {
        //String id = null;
        //Integer limit = null;
        //BetaTesterAppsLinkagesResponse response = api.betaTestersAppsGetToManyRelationship(id, limit);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void betaTestersBetaGroupsCreateToManyRelationshipTest() throws ApiException {
        //String id = null;
        //BetaTesterBetaGroupsLinkagesRequest betaTesterBetaGroupsLinkagesRequest = null;
        //api.betaTestersBetaGroupsCreateToManyRelationship(id, betaTesterBetaGroupsLinkagesRequest);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void betaTestersBetaGroupsDeleteToManyRelationshipTest() throws ApiException {
        //String id = null;
        //BetaTesterBetaGroupsLinkagesRequest betaTesterBetaGroupsLinkagesRequest = null;
        //api.betaTestersBetaGroupsDeleteToManyRelationship(id, betaTesterBetaGroupsLinkagesRequest);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void betaTestersBetaGroupsGetToManyRelatedTest() throws ApiException {
        //String id = null;
        //List<String> fieldsBetaGroups = null;
        //Integer limit = null;
        //BetaGroupsWithoutIncludesResponse response = api.betaTestersBetaGroupsGetToManyRelated(id, fieldsBetaGroups, limit);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void betaTestersBetaGroupsGetToManyRelationshipTest() throws ApiException {
        //String id = null;
        //Integer limit = null;
        //BetaTesterBetaGroupsLinkagesResponse response = api.betaTestersBetaGroupsGetToManyRelationship(id, limit);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void betaTestersBetaTesterUsagesGetMetricsTest() throws ApiException {
        //String id = null;
        //String filterApps = null;
        //Integer limit = null;
        //String period = null;
        //BetaTesterUsagesV1MetricResponse response = api.betaTestersBetaTesterUsagesGetMetrics(id, filterApps, limit, period);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void betaTestersBuildsCreateToManyRelationshipTest() throws ApiException {
        //String id = null;
        //BetaTesterBuildsLinkagesRequest betaTesterBuildsLinkagesRequest = null;
        //api.betaTestersBuildsCreateToManyRelationship(id, betaTesterBuildsLinkagesRequest);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void betaTestersBuildsDeleteToManyRelationshipTest() throws ApiException {
        //String id = null;
        //BetaTesterBuildsLinkagesRequest betaTesterBuildsLinkagesRequest = null;
        //api.betaTestersBuildsDeleteToManyRelationship(id, betaTesterBuildsLinkagesRequest);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void betaTestersBuildsGetToManyRelatedTest() throws ApiException {
        //String id = null;
        //List<String> fieldsBuilds = null;
        //Integer limit = null;
        //BuildsWithoutIncludesResponse response = api.betaTestersBuildsGetToManyRelated(id, fieldsBuilds, limit);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void betaTestersBuildsGetToManyRelationshipTest() throws ApiException {
        //String id = null;
        //Integer limit = null;
        //BetaTesterBuildsLinkagesResponse response = api.betaTestersBuildsGetToManyRelationship(id, limit);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void betaTestersCreateInstanceTest() throws ApiException {
        //BetaTesterCreateRequest betaTesterCreateRequest = null;
        //BetaTesterResponse response = api.betaTestersCreateInstance(betaTesterCreateRequest);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void betaTestersDeleteInstanceTest() throws ApiException {
        //String id = null;
        //api.betaTestersDeleteInstance(id);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void betaTestersGetCollectionTest() throws ApiException {
        //List<String> filterEmail = null;
        //List<String> filterFirstName = null;
        //List<String> filterInviteType = null;
        //List<String> filterLastName = null;
        //List<String> filterApps = null;
        //List<String> filterBetaGroups = null;
        //List<String> filterBuilds = null;
        //List<String> filterId = null;
        //List<String> sort = null;
        //List<String> fieldsBetaTesters = null;
        //Integer limit = null;
        //List<String> include = null;
        //List<String> fieldsApps = null;
        //List<String> fieldsBuilds = null;
        //List<String> fieldsBetaGroups = null;
        //Integer limitApps = null;
        //Integer limitBetaGroups = null;
        //Integer limitBuilds = null;
        //BetaTestersResponse response = api.betaTestersGetCollection(filterEmail, filterFirstName, filterInviteType, filterLastName, filterApps, filterBetaGroups, filterBuilds, filterId, sort, fieldsBetaTesters, limit, include, fieldsApps, fieldsBuilds, fieldsBetaGroups, limitApps, limitBetaGroups, limitBuilds);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void betaTestersGetInstanceTest() throws ApiException {
        //String id = null;
        //List<String> fieldsBetaTesters = null;
        //List<String> include = null;
        //List<String> fieldsApps = null;
        //List<String> fieldsBuilds = null;
        //List<String> fieldsBetaGroups = null;
        //Integer limitApps = null;
        //Integer limitBetaGroups = null;
        //Integer limitBuilds = null;
        //BetaTesterResponse response = api.betaTestersGetInstance(id, fieldsBetaTesters, include, fieldsApps, fieldsBuilds, fieldsBetaGroups, limitApps, limitBetaGroups, limitBuilds);
        // TODO: test validations
    }

}
