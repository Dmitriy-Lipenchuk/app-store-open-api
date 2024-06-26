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
import org.openapitools.client.model.AgeRatingDeclarationResponse;
import org.openapitools.client.model.AppCategoryResponse;
import org.openapitools.client.model.AppInfoLocalizationsResponse;
import org.openapitools.client.model.AppInfoResponse;
import org.openapitools.client.model.AppInfoUpdateRequest;
import org.openapitools.client.model.ErrorResponse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AppInfosApi
 */
public class AppInfosApiTest {

    private final AppInfosApi api = new AppInfosApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appInfosAgeRatingDeclarationGetToOneRelatedTest() throws ApiException {
        //String id = null;
        //List<String> fieldsAgeRatingDeclarations = null;
        //AgeRatingDeclarationResponse response = api.appInfosAgeRatingDeclarationGetToOneRelated(id, fieldsAgeRatingDeclarations);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appInfosAppInfoLocalizationsGetToManyRelatedTest() throws ApiException {
        //String id = null;
        //List<String> filterLocale = null;
        //List<String> fieldsAppInfos = null;
        //List<String> fieldsAppInfoLocalizations = null;
        //Integer limit = null;
        //List<String> include = null;
        //AppInfoLocalizationsResponse response = api.appInfosAppInfoLocalizationsGetToManyRelated(id, filterLocale, fieldsAppInfos, fieldsAppInfoLocalizations, limit, include);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appInfosGetInstanceTest() throws ApiException {
        //String id = null;
        //List<String> fieldsAppInfos = null;
        //List<String> include = null;
        //List<String> fieldsAgeRatingDeclarations = null;
        //List<String> fieldsAppInfoLocalizations = null;
        //List<String> fieldsAppCategories = null;
        //Integer limitAppInfoLocalizations = null;
        //AppInfoResponse response = api.appInfosGetInstance(id, fieldsAppInfos, include, fieldsAgeRatingDeclarations, fieldsAppInfoLocalizations, fieldsAppCategories, limitAppInfoLocalizations);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appInfosPrimaryCategoryGetToOneRelatedTest() throws ApiException {
        //String id = null;
        //List<String> fieldsAppCategories = null;
        //Integer limitSubcategories = null;
        //List<String> include = null;
        //AppCategoryResponse response = api.appInfosPrimaryCategoryGetToOneRelated(id, fieldsAppCategories, limitSubcategories, include);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appInfosPrimarySubcategoryOneGetToOneRelatedTest() throws ApiException {
        //String id = null;
        //List<String> fieldsAppCategories = null;
        //Integer limitSubcategories = null;
        //List<String> include = null;
        //AppCategoryResponse response = api.appInfosPrimarySubcategoryOneGetToOneRelated(id, fieldsAppCategories, limitSubcategories, include);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appInfosPrimarySubcategoryTwoGetToOneRelatedTest() throws ApiException {
        //String id = null;
        //List<String> fieldsAppCategories = null;
        //Integer limitSubcategories = null;
        //List<String> include = null;
        //AppCategoryResponse response = api.appInfosPrimarySubcategoryTwoGetToOneRelated(id, fieldsAppCategories, limitSubcategories, include);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appInfosSecondaryCategoryGetToOneRelatedTest() throws ApiException {
        //String id = null;
        //List<String> fieldsAppCategories = null;
        //Integer limitSubcategories = null;
        //List<String> include = null;
        //AppCategoryResponse response = api.appInfosSecondaryCategoryGetToOneRelated(id, fieldsAppCategories, limitSubcategories, include);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appInfosSecondarySubcategoryOneGetToOneRelatedTest() throws ApiException {
        //String id = null;
        //List<String> fieldsAppCategories = null;
        //Integer limitSubcategories = null;
        //List<String> include = null;
        //AppCategoryResponse response = api.appInfosSecondarySubcategoryOneGetToOneRelated(id, fieldsAppCategories, limitSubcategories, include);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appInfosSecondarySubcategoryTwoGetToOneRelatedTest() throws ApiException {
        //String id = null;
        //List<String> fieldsAppCategories = null;
        //Integer limitSubcategories = null;
        //List<String> include = null;
        //AppCategoryResponse response = api.appInfosSecondarySubcategoryTwoGetToOneRelated(id, fieldsAppCategories, limitSubcategories, include);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appInfosUpdateInstanceTest() throws ApiException {
        //String id = null;
        //AppInfoUpdateRequest appInfoUpdateRequest = null;
        //AppInfoResponse response = api.appInfosUpdateInstance(id, appInfoUpdateRequest);
        // TODO: test validations
    }

}