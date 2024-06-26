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
import org.openapitools.client.model.AppResponse;
import org.openapitools.client.model.CiBuildRunsResponse;
import org.openapitools.client.model.CiProductResponse;
import org.openapitools.client.model.CiProductsResponse;
import org.openapitools.client.model.CiWorkflowsResponse;
import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.ScmRepositoriesResponse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CiProductsApi
 */
public class CiProductsApiTest {

    private final CiProductsApi api = new CiProductsApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ciProductsAdditionalRepositoriesGetToManyRelatedTest() throws ApiException {
        //String id = null;
        //List<String> filterId = null;
        //List<String> fieldsScmGitReferences = null;
        //List<String> fieldsScmProviders = null;
        //List<String> fieldsScmRepositories = null;
        //Integer limit = null;
        //List<String> include = null;
        //ScmRepositoriesResponse response = api.ciProductsAdditionalRepositoriesGetToManyRelated(id, filterId, fieldsScmGitReferences, fieldsScmProviders, fieldsScmRepositories, limit, include);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ciProductsAppGetToOneRelatedTest() throws ApiException {
        //String id = null;
        //List<String> fieldsBetaAppReviewDetails = null;
        //List<String> fieldsGameCenterDetails = null;
        //List<String> fieldsCiProducts = null;
        //List<String> fieldsReviewSubmissions = null;
        //List<String> fieldsBetaGroups = null;
        //List<String> fieldsPromotedPurchases = null;
        //List<String> fieldsApps = null;
        //List<String> fieldsAppEvents = null;
        //List<String> fieldsBuilds = null;
        //List<String> fieldsBetaLicenseAgreements = null;
        //List<String> fieldsAppClips = null;
        //List<String> fieldsBetaAppLocalizations = null;
        //List<String> fieldsAppInfos = null;
        //List<String> fieldsPreReleaseVersions = null;
        //List<String> fieldsInAppPurchases = null;
        //List<String> fieldsSubscriptionGroups = null;
        //List<String> fieldsAppPreOrders = null;
        //List<String> fieldsGameCenterEnabledVersions = null;
        //List<String> fieldsAppStoreVersionExperiments = null;
        //List<String> fieldsSubscriptionGracePeriods = null;
        //List<String> fieldsEndUserLicenseAgreements = null;
        //List<String> fieldsAppStoreVersions = null;
        //List<String> fieldsAppEncryptionDeclarations = null;
        //List<String> fieldsAppCustomProductPages = null;
        //Integer limitAppEncryptionDeclarations = null;
        //Integer limitBetaGroups = null;
        //Integer limitAppStoreVersions = null;
        //Integer limitPreReleaseVersions = null;
        //Integer limitBetaAppLocalizations = null;
        //Integer limitBuilds = null;
        //Integer limitAppInfos = null;
        //Integer limitAppClips = null;
        //Integer limitInAppPurchases = null;
        //Integer limitSubscriptionGroups = null;
        //Integer limitGameCenterEnabledVersions = null;
        //Integer limitAppCustomProductPages = null;
        //Integer limitInAppPurchasesV2 = null;
        //Integer limitPromotedPurchases = null;
        //Integer limitAppEvents = null;
        //Integer limitReviewSubmissions = null;
        //Integer limitAppStoreVersionExperimentsV2 = null;
        //List<String> include = null;
        //AppResponse response = api.ciProductsAppGetToOneRelated(id, fieldsBetaAppReviewDetails, fieldsGameCenterDetails, fieldsCiProducts, fieldsReviewSubmissions, fieldsBetaGroups, fieldsPromotedPurchases, fieldsApps, fieldsAppEvents, fieldsBuilds, fieldsBetaLicenseAgreements, fieldsAppClips, fieldsBetaAppLocalizations, fieldsAppInfos, fieldsPreReleaseVersions, fieldsInAppPurchases, fieldsSubscriptionGroups, fieldsAppPreOrders, fieldsGameCenterEnabledVersions, fieldsAppStoreVersionExperiments, fieldsSubscriptionGracePeriods, fieldsEndUserLicenseAgreements, fieldsAppStoreVersions, fieldsAppEncryptionDeclarations, fieldsAppCustomProductPages, limitAppEncryptionDeclarations, limitBetaGroups, limitAppStoreVersions, limitPreReleaseVersions, limitBetaAppLocalizations, limitBuilds, limitAppInfos, limitAppClips, limitInAppPurchases, limitSubscriptionGroups, limitGameCenterEnabledVersions, limitAppCustomProductPages, limitInAppPurchasesV2, limitPromotedPurchases, limitAppEvents, limitReviewSubmissions, limitAppStoreVersionExperimentsV2, include);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ciProductsBuildRunsGetToManyRelatedTest() throws ApiException {
        //String id = null;
        //List<String> filterBuilds = null;
        //List<String> sort = null;
        //List<String> fieldsScmGitReferences = null;
        //List<String> fieldsCiBuildRuns = null;
        //List<String> fieldsCiWorkflows = null;
        //List<String> fieldsScmPullRequests = null;
        //List<String> fieldsCiProducts = null;
        //List<String> fieldsBuilds = null;
        //Integer limit = null;
        //Integer limitBuilds = null;
        //List<String> include = null;
        //CiBuildRunsResponse response = api.ciProductsBuildRunsGetToManyRelated(id, filterBuilds, sort, fieldsScmGitReferences, fieldsCiBuildRuns, fieldsCiWorkflows, fieldsScmPullRequests, fieldsCiProducts, fieldsBuilds, limit, limitBuilds, include);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ciProductsDeleteInstanceTest() throws ApiException {
        //String id = null;
        //api.ciProductsDeleteInstance(id);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ciProductsGetCollectionTest() throws ApiException {
        //List<String> filterProductType = null;
        //List<String> filterApp = null;
        //List<String> fieldsCiProducts = null;
        //Integer limit = null;
        //List<String> include = null;
        //List<String> fieldsCiBuildRuns = null;
        //List<String> fieldsCiWorkflows = null;
        //List<String> fieldsApps = null;
        //List<String> fieldsScmRepositories = null;
        //Integer limitPrimaryRepositories = null;
        //CiProductsResponse response = api.ciProductsGetCollection(filterProductType, filterApp, fieldsCiProducts, limit, include, fieldsCiBuildRuns, fieldsCiWorkflows, fieldsApps, fieldsScmRepositories, limitPrimaryRepositories);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ciProductsGetInstanceTest() throws ApiException {
        //String id = null;
        //List<String> fieldsCiProducts = null;
        //List<String> include = null;
        //List<String> fieldsCiBuildRuns = null;
        //List<String> fieldsCiWorkflows = null;
        //List<String> fieldsApps = null;
        //List<String> fieldsScmRepositories = null;
        //Integer limitPrimaryRepositories = null;
        //CiProductResponse response = api.ciProductsGetInstance(id, fieldsCiProducts, include, fieldsCiBuildRuns, fieldsCiWorkflows, fieldsApps, fieldsScmRepositories, limitPrimaryRepositories);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ciProductsPrimaryRepositoriesGetToManyRelatedTest() throws ApiException {
        //String id = null;
        //List<String> filterId = null;
        //List<String> fieldsScmGitReferences = null;
        //List<String> fieldsScmProviders = null;
        //List<String> fieldsScmRepositories = null;
        //Integer limit = null;
        //List<String> include = null;
        //ScmRepositoriesResponse response = api.ciProductsPrimaryRepositoriesGetToManyRelated(id, filterId, fieldsScmGitReferences, fieldsScmProviders, fieldsScmRepositories, limit, include);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void ciProductsWorkflowsGetToManyRelatedTest() throws ApiException {
        //String id = null;
        //List<String> fieldsCiXcodeVersions = null;
        //List<String> fieldsCiWorkflows = null;
        //List<String> fieldsCiMacOsVersions = null;
        //List<String> fieldsCiProducts = null;
        //List<String> fieldsScmRepositories = null;
        //Integer limit = null;
        //List<String> include = null;
        //CiWorkflowsResponse response = api.ciProductsWorkflowsGetToManyRelated(id, fieldsCiXcodeVersions, fieldsCiWorkflows, fieldsCiMacOsVersions, fieldsCiProducts, fieldsScmRepositories, limit, include);
        // TODO: test validations
    }

}