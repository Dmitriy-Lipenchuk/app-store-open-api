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
import org.openapitools.client.model.GameCenterLeaderboardSetCreateRequest;
import org.openapitools.client.model.GameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest;
import org.openapitools.client.model.GameCenterLeaderboardSetGameCenterLeaderboardsLinkagesResponse;
import org.openapitools.client.model.GameCenterLeaderboardSetGroupLeaderboardSetLinkageRequest;
import org.openapitools.client.model.GameCenterLeaderboardSetGroupLeaderboardSetLinkageResponse;
import org.openapitools.client.model.GameCenterLeaderboardSetLocalizationsResponse;
import org.openapitools.client.model.GameCenterLeaderboardSetReleasesResponse;
import org.openapitools.client.model.GameCenterLeaderboardSetResponse;
import org.openapitools.client.model.GameCenterLeaderboardSetUpdateRequest;
import org.openapitools.client.model.GameCenterLeaderboardsResponse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GameCenterLeaderboardSetsApi
 */
public class GameCenterLeaderboardSetsApiTest {

    private final GameCenterLeaderboardSetsApi api = new GameCenterLeaderboardSetsApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gameCenterLeaderboardSetsCreateInstanceTest() throws ApiException {
        //GameCenterLeaderboardSetCreateRequest gameCenterLeaderboardSetCreateRequest = null;
        //GameCenterLeaderboardSetResponse response = api.gameCenterLeaderboardSetsCreateInstance(gameCenterLeaderboardSetCreateRequest);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gameCenterLeaderboardSetsDeleteInstanceTest() throws ApiException {
        //String id = null;
        //api.gameCenterLeaderboardSetsDeleteInstance(id);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gameCenterLeaderboardSetsGameCenterLeaderboardsCreateToManyRelationshipTest() throws ApiException {
        //String id = null;
        //GameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest gameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest = null;
        //api.gameCenterLeaderboardSetsGameCenterLeaderboardsCreateToManyRelationship(id, gameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gameCenterLeaderboardSetsGameCenterLeaderboardsDeleteToManyRelationshipTest() throws ApiException {
        //String id = null;
        //GameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest gameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest = null;
        //api.gameCenterLeaderboardSetsGameCenterLeaderboardsDeleteToManyRelationship(id, gameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gameCenterLeaderboardSetsGameCenterLeaderboardsGetToManyRelatedTest() throws ApiException {
        //String id = null;
        //List<String> filterArchived = null;
        //List<String> filterReferenceName = null;
        //List<String> filterId = null;
        //List<String> fieldsGameCenterLeaderboardLocalizations = null;
        //List<String> fieldsGameCenterLeaderboardSets = null;
        //List<String> fieldsGameCenterGroups = null;
        //List<String> fieldsGameCenterDetails = null;
        //List<String> fieldsGameCenterLeaderboards = null;
        //List<String> fieldsGameCenterLeaderboardReleases = null;
        //Integer limit = null;
        //Integer limitGameCenterLeaderboardSets = null;
        //Integer limitLocalizations = null;
        //Integer limitReleases = null;
        //List<String> include = null;
        //GameCenterLeaderboardsResponse response = api.gameCenterLeaderboardSetsGameCenterLeaderboardsGetToManyRelated(id, filterArchived, filterReferenceName, filterId, fieldsGameCenterLeaderboardLocalizations, fieldsGameCenterLeaderboardSets, fieldsGameCenterGroups, fieldsGameCenterDetails, fieldsGameCenterLeaderboards, fieldsGameCenterLeaderboardReleases, limit, limitGameCenterLeaderboardSets, limitLocalizations, limitReleases, include);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gameCenterLeaderboardSetsGameCenterLeaderboardsGetToManyRelationshipTest() throws ApiException {
        //String id = null;
        //Integer limit = null;
        //GameCenterLeaderboardSetGameCenterLeaderboardsLinkagesResponse response = api.gameCenterLeaderboardSetsGameCenterLeaderboardsGetToManyRelationship(id, limit);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gameCenterLeaderboardSetsGameCenterLeaderboardsReplaceToManyRelationshipTest() throws ApiException {
        //String id = null;
        //GameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest gameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest = null;
        //api.gameCenterLeaderboardSetsGameCenterLeaderboardsReplaceToManyRelationship(id, gameCenterLeaderboardSetGameCenterLeaderboardsLinkagesRequest);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gameCenterLeaderboardSetsGetInstanceTest() throws ApiException {
        //String id = null;
        //List<String> fieldsGameCenterLeaderboardSets = null;
        //List<String> include = null;
        //List<String> fieldsGameCenterLeaderboardSetLocalizations = null;
        //List<String> fieldsGameCenterLeaderboardSetReleases = null;
        //List<String> fieldsGameCenterLeaderboards = null;
        //Integer limitGameCenterLeaderboards = null;
        //Integer limitLocalizations = null;
        //Integer limitReleases = null;
        //GameCenterLeaderboardSetResponse response = api.gameCenterLeaderboardSetsGetInstance(id, fieldsGameCenterLeaderboardSets, include, fieldsGameCenterLeaderboardSetLocalizations, fieldsGameCenterLeaderboardSetReleases, fieldsGameCenterLeaderboards, limitGameCenterLeaderboards, limitLocalizations, limitReleases);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gameCenterLeaderboardSetsGroupLeaderboardSetGetToOneRelatedTest() throws ApiException {
        //String id = null;
        //List<String> fieldsGameCenterLeaderboardSetLocalizations = null;
        //List<String> fieldsGameCenterLeaderboardSetReleases = null;
        //List<String> fieldsGameCenterLeaderboardSets = null;
        //List<String> fieldsGameCenterGroups = null;
        //List<String> fieldsGameCenterDetails = null;
        //List<String> fieldsGameCenterLeaderboards = null;
        //Integer limitLocalizations = null;
        //Integer limitGameCenterLeaderboards = null;
        //Integer limitReleases = null;
        //List<String> include = null;
        //GameCenterLeaderboardSetResponse response = api.gameCenterLeaderboardSetsGroupLeaderboardSetGetToOneRelated(id, fieldsGameCenterLeaderboardSetLocalizations, fieldsGameCenterLeaderboardSetReleases, fieldsGameCenterLeaderboardSets, fieldsGameCenterGroups, fieldsGameCenterDetails, fieldsGameCenterLeaderboards, limitLocalizations, limitGameCenterLeaderboards, limitReleases, include);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gameCenterLeaderboardSetsGroupLeaderboardSetGetToOneRelationshipTest() throws ApiException {
        //String id = null;
        //GameCenterLeaderboardSetGroupLeaderboardSetLinkageResponse response = api.gameCenterLeaderboardSetsGroupLeaderboardSetGetToOneRelationship(id);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gameCenterLeaderboardSetsGroupLeaderboardSetUpdateToOneRelationshipTest() throws ApiException {
        //String id = null;
        //GameCenterLeaderboardSetGroupLeaderboardSetLinkageRequest gameCenterLeaderboardSetGroupLeaderboardSetLinkageRequest = null;
        //api.gameCenterLeaderboardSetsGroupLeaderboardSetUpdateToOneRelationship(id, gameCenterLeaderboardSetGroupLeaderboardSetLinkageRequest);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gameCenterLeaderboardSetsLocalizationsGetToManyRelatedTest() throws ApiException {
        //String id = null;
        //List<String> fieldsGameCenterLeaderboardSetLocalizations = null;
        //List<String> fieldsGameCenterLeaderboardSets = null;
        //List<String> fieldsGameCenterLeaderboardSetImages = null;
        //Integer limit = null;
        //List<String> include = null;
        //GameCenterLeaderboardSetLocalizationsResponse response = api.gameCenterLeaderboardSetsLocalizationsGetToManyRelated(id, fieldsGameCenterLeaderboardSetLocalizations, fieldsGameCenterLeaderboardSets, fieldsGameCenterLeaderboardSetImages, limit, include);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gameCenterLeaderboardSetsReleasesGetToManyRelatedTest() throws ApiException {
        //String id = null;
        //List<String> filterLive = null;
        //List<String> filterGameCenterDetail = null;
        //List<String> fieldsGameCenterLeaderboardSetReleases = null;
        //List<String> fieldsGameCenterLeaderboardSets = null;
        //List<String> fieldsGameCenterDetails = null;
        //Integer limit = null;
        //List<String> include = null;
        //GameCenterLeaderboardSetReleasesResponse response = api.gameCenterLeaderboardSetsReleasesGetToManyRelated(id, filterLive, filterGameCenterDetail, fieldsGameCenterLeaderboardSetReleases, fieldsGameCenterLeaderboardSets, fieldsGameCenterDetails, limit, include);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gameCenterLeaderboardSetsUpdateInstanceTest() throws ApiException {
        //String id = null;
        //GameCenterLeaderboardSetUpdateRequest gameCenterLeaderboardSetUpdateRequest = null;
        //GameCenterLeaderboardSetResponse response = api.gameCenterLeaderboardSetsUpdateInstance(id, gameCenterLeaderboardSetUpdateRequest);
        // TODO: test validations
    }

}
