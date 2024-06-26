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
import org.openapitools.client.model.AppStoreVersionResponse;
import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.GameCenterAppVersionCompatibilityVersionsLinkagesRequest;
import org.openapitools.client.model.GameCenterAppVersionCompatibilityVersionsLinkagesResponse;
import org.openapitools.client.model.GameCenterAppVersionCreateRequest;
import org.openapitools.client.model.GameCenterAppVersionResponse;
import org.openapitools.client.model.GameCenterAppVersionUpdateRequest;
import org.openapitools.client.model.GameCenterAppVersionsResponse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GameCenterAppVersionsApi
 */
public class GameCenterAppVersionsApiTest {

    private final GameCenterAppVersionsApi api = new GameCenterAppVersionsApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gameCenterAppVersionsAppStoreVersionGetToOneRelatedTest() throws ApiException {
        //String id = null;
        //List<String> fieldsAgeRatingDeclarations = null;
        //List<String> fieldsAppStoreReviewDetails = null;
        //List<String> fieldsAppStoreVersionLocalizations = null;
        //List<String> fieldsAppStoreVersionExperiments = null;
        //List<String> fieldsAppStoreVersionSubmissions = null;
        //List<String> fieldsAlternativeDistributionPackages = null;
        //List<String> fieldsAppStoreVersions = null;
        //List<String> fieldsApps = null;
        //List<String> fieldsRoutingAppCoverages = null;
        //List<String> fieldsAppClipDefaultExperiences = null;
        //List<String> fieldsAppStoreVersionPhasedReleases = null;
        //List<String> fieldsBuilds = null;
        //Integer limitAppStoreVersionLocalizations = null;
        //Integer limitAppStoreVersionExperiments = null;
        //Integer limitAppStoreVersionExperimentsV2 = null;
        //List<String> include = null;
        //AppStoreVersionResponse response = api.gameCenterAppVersionsAppStoreVersionGetToOneRelated(id, fieldsAgeRatingDeclarations, fieldsAppStoreReviewDetails, fieldsAppStoreVersionLocalizations, fieldsAppStoreVersionExperiments, fieldsAppStoreVersionSubmissions, fieldsAlternativeDistributionPackages, fieldsAppStoreVersions, fieldsApps, fieldsRoutingAppCoverages, fieldsAppClipDefaultExperiences, fieldsAppStoreVersionPhasedReleases, fieldsBuilds, limitAppStoreVersionLocalizations, limitAppStoreVersionExperiments, limitAppStoreVersionExperimentsV2, include);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gameCenterAppVersionsCompatibilityVersionsCreateToManyRelationshipTest() throws ApiException {
        //String id = null;
        //GameCenterAppVersionCompatibilityVersionsLinkagesRequest gameCenterAppVersionCompatibilityVersionsLinkagesRequest = null;
        //api.gameCenterAppVersionsCompatibilityVersionsCreateToManyRelationship(id, gameCenterAppVersionCompatibilityVersionsLinkagesRequest);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gameCenterAppVersionsCompatibilityVersionsDeleteToManyRelationshipTest() throws ApiException {
        //String id = null;
        //GameCenterAppVersionCompatibilityVersionsLinkagesRequest gameCenterAppVersionCompatibilityVersionsLinkagesRequest = null;
        //api.gameCenterAppVersionsCompatibilityVersionsDeleteToManyRelationship(id, gameCenterAppVersionCompatibilityVersionsLinkagesRequest);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gameCenterAppVersionsCompatibilityVersionsGetToManyRelatedTest() throws ApiException {
        //String id = null;
        //List<String> filterEnabled = null;
        //List<String> fieldsAppStoreVersions = null;
        //List<String> fieldsGameCenterAppVersions = null;
        //Integer limit = null;
        //Integer limitCompatibilityVersions = null;
        //List<String> include = null;
        //GameCenterAppVersionsResponse response = api.gameCenterAppVersionsCompatibilityVersionsGetToManyRelated(id, filterEnabled, fieldsAppStoreVersions, fieldsGameCenterAppVersions, limit, limitCompatibilityVersions, include);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gameCenterAppVersionsCompatibilityVersionsGetToManyRelationshipTest() throws ApiException {
        //String id = null;
        //Integer limit = null;
        //GameCenterAppVersionCompatibilityVersionsLinkagesResponse response = api.gameCenterAppVersionsCompatibilityVersionsGetToManyRelationship(id, limit);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gameCenterAppVersionsCreateInstanceTest() throws ApiException {
        //GameCenterAppVersionCreateRequest gameCenterAppVersionCreateRequest = null;
        //GameCenterAppVersionResponse response = api.gameCenterAppVersionsCreateInstance(gameCenterAppVersionCreateRequest);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gameCenterAppVersionsGetInstanceTest() throws ApiException {
        //String id = null;
        //List<String> fieldsGameCenterAppVersions = null;
        //List<String> include = null;
        //List<String> fieldsAppStoreVersions = null;
        //Integer limitCompatibilityVersions = null;
        //GameCenterAppVersionResponse response = api.gameCenterAppVersionsGetInstance(id, fieldsGameCenterAppVersions, include, fieldsAppStoreVersions, limitCompatibilityVersions);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gameCenterAppVersionsUpdateInstanceTest() throws ApiException {
        //String id = null;
        //GameCenterAppVersionUpdateRequest gameCenterAppVersionUpdateRequest = null;
        //GameCenterAppVersionResponse response = api.gameCenterAppVersionsUpdateInstance(id, gameCenterAppVersionUpdateRequest);
        // TODO: test validations
    }

}
