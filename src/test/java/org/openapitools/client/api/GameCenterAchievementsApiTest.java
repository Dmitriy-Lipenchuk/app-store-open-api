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
import org.openapitools.client.model.GameCenterAchievementCreateRequest;
import org.openapitools.client.model.GameCenterAchievementGroupAchievementLinkageRequest;
import org.openapitools.client.model.GameCenterAchievementGroupAchievementLinkageResponse;
import org.openapitools.client.model.GameCenterAchievementLocalizationsResponse;
import org.openapitools.client.model.GameCenterAchievementReleasesResponse;
import org.openapitools.client.model.GameCenterAchievementResponse;
import org.openapitools.client.model.GameCenterAchievementUpdateRequest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GameCenterAchievementsApi
 */
public class GameCenterAchievementsApiTest {

    private final GameCenterAchievementsApi api = new GameCenterAchievementsApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gameCenterAchievementsCreateInstanceTest() throws ApiException {
        //GameCenterAchievementCreateRequest gameCenterAchievementCreateRequest = null;
        //GameCenterAchievementResponse response = api.gameCenterAchievementsCreateInstance(gameCenterAchievementCreateRequest);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gameCenterAchievementsDeleteInstanceTest() throws ApiException {
        //String id = null;
        //api.gameCenterAchievementsDeleteInstance(id);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gameCenterAchievementsGetInstanceTest() throws ApiException {
        //String id = null;
        //List<String> fieldsGameCenterAchievements = null;
        //List<String> include = null;
        //List<String> fieldsGameCenterAchievementReleases = null;
        //List<String> fieldsGameCenterAchievementLocalizations = null;
        //Integer limitLocalizations = null;
        //Integer limitReleases = null;
        //GameCenterAchievementResponse response = api.gameCenterAchievementsGetInstance(id, fieldsGameCenterAchievements, include, fieldsGameCenterAchievementReleases, fieldsGameCenterAchievementLocalizations, limitLocalizations, limitReleases);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gameCenterAchievementsGroupAchievementGetToOneRelatedTest() throws ApiException {
        //String id = null;
        //List<String> fieldsGameCenterAchievementReleases = null;
        //List<String> fieldsGameCenterGroups = null;
        //List<String> fieldsGameCenterDetails = null;
        //List<String> fieldsGameCenterAchievementLocalizations = null;
        //List<String> fieldsGameCenterAchievements = null;
        //Integer limitLocalizations = null;
        //Integer limitReleases = null;
        //List<String> include = null;
        //GameCenterAchievementResponse response = api.gameCenterAchievementsGroupAchievementGetToOneRelated(id, fieldsGameCenterAchievementReleases, fieldsGameCenterGroups, fieldsGameCenterDetails, fieldsGameCenterAchievementLocalizations, fieldsGameCenterAchievements, limitLocalizations, limitReleases, include);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gameCenterAchievementsGroupAchievementGetToOneRelationshipTest() throws ApiException {
        //String id = null;
        //GameCenterAchievementGroupAchievementLinkageResponse response = api.gameCenterAchievementsGroupAchievementGetToOneRelationship(id);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gameCenterAchievementsGroupAchievementUpdateToOneRelationshipTest() throws ApiException {
        //String id = null;
        //GameCenterAchievementGroupAchievementLinkageRequest gameCenterAchievementGroupAchievementLinkageRequest = null;
        //api.gameCenterAchievementsGroupAchievementUpdateToOneRelationship(id, gameCenterAchievementGroupAchievementLinkageRequest);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gameCenterAchievementsLocalizationsGetToManyRelatedTest() throws ApiException {
        //String id = null;
        //List<String> fieldsGameCenterAchievementImages = null;
        //List<String> fieldsGameCenterAchievementLocalizations = null;
        //List<String> fieldsGameCenterAchievements = null;
        //Integer limit = null;
        //List<String> include = null;
        //GameCenterAchievementLocalizationsResponse response = api.gameCenterAchievementsLocalizationsGetToManyRelated(id, fieldsGameCenterAchievementImages, fieldsGameCenterAchievementLocalizations, fieldsGameCenterAchievements, limit, include);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gameCenterAchievementsReleasesGetToManyRelatedTest() throws ApiException {
        //String id = null;
        //List<String> filterLive = null;
        //List<String> filterGameCenterDetail = null;
        //List<String> fieldsGameCenterAchievementReleases = null;
        //List<String> fieldsGameCenterDetails = null;
        //List<String> fieldsGameCenterAchievements = null;
        //Integer limit = null;
        //List<String> include = null;
        //GameCenterAchievementReleasesResponse response = api.gameCenterAchievementsReleasesGetToManyRelated(id, filterLive, filterGameCenterDetail, fieldsGameCenterAchievementReleases, fieldsGameCenterDetails, fieldsGameCenterAchievements, limit, include);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void gameCenterAchievementsUpdateInstanceTest() throws ApiException {
        //String id = null;
        //GameCenterAchievementUpdateRequest gameCenterAchievementUpdateRequest = null;
        //GameCenterAchievementResponse response = api.gameCenterAchievementsUpdateInstance(id, gameCenterAchievementUpdateRequest);
        // TODO: test validations
    }

}
