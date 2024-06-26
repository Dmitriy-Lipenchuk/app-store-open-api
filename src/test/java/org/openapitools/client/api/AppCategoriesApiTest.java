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
import org.openapitools.client.model.AppCategoriesResponse;
import org.openapitools.client.model.AppCategoriesWithoutIncludesResponse;
import org.openapitools.client.model.AppCategoryResponse;
import org.openapitools.client.model.AppCategoryWithoutIncludesResponse;
import org.openapitools.client.model.ErrorResponse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AppCategoriesApi
 */
public class AppCategoriesApiTest {

    private final AppCategoriesApi api = new AppCategoriesApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appCategoriesGetCollectionTest() throws ApiException {
        //List<String> filterPlatforms = null;
        //Boolean existsParent = null;
        //List<String> fieldsAppCategories = null;
        //Integer limit = null;
        //List<String> include = null;
        //Integer limitSubcategories = null;
        //AppCategoriesResponse response = api.appCategoriesGetCollection(filterPlatforms, existsParent, fieldsAppCategories, limit, include, limitSubcategories);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appCategoriesGetInstanceTest() throws ApiException {
        //String id = null;
        //List<String> fieldsAppCategories = null;
        //List<String> include = null;
        //Integer limitSubcategories = null;
        //AppCategoryResponse response = api.appCategoriesGetInstance(id, fieldsAppCategories, include, limitSubcategories);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appCategoriesParentGetToOneRelatedTest() throws ApiException {
        //String id = null;
        //List<String> fieldsAppCategories = null;
        //AppCategoryWithoutIncludesResponse response = api.appCategoriesParentGetToOneRelated(id, fieldsAppCategories);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void appCategoriesSubcategoriesGetToManyRelatedTest() throws ApiException {
        //String id = null;
        //List<String> fieldsAppCategories = null;
        //Integer limit = null;
        //AppCategoriesWithoutIncludesResponse response = api.appCategoriesSubcategoriesGetToManyRelated(id, fieldsAppCategories, limit);
        // TODO: test validations
    }

}
