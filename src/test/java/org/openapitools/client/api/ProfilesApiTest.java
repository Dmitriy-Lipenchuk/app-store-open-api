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
import org.openapitools.client.model.BundleIdWithoutIncludesResponse;
import org.openapitools.client.model.CertificatesWithoutIncludesResponse;
import org.openapitools.client.model.DevicesWithoutIncludesResponse;
import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.ProfileCreateRequest;
import org.openapitools.client.model.ProfileResponse;
import org.openapitools.client.model.ProfilesResponse;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProfilesApi
 */
public class ProfilesApiTest {

    private final ProfilesApi api = new ProfilesApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void profilesBundleIdGetToOneRelatedTest() throws ApiException {
        //String id = null;
        //List<String> fieldsBundleIds = null;
        //BundleIdWithoutIncludesResponse response = api.profilesBundleIdGetToOneRelated(id, fieldsBundleIds);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void profilesCertificatesGetToManyRelatedTest() throws ApiException {
        //String id = null;
        //List<String> fieldsCertificates = null;
        //Integer limit = null;
        //CertificatesWithoutIncludesResponse response = api.profilesCertificatesGetToManyRelated(id, fieldsCertificates, limit);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void profilesCreateInstanceTest() throws ApiException {
        //ProfileCreateRequest profileCreateRequest = null;
        //ProfileResponse response = api.profilesCreateInstance(profileCreateRequest);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void profilesDeleteInstanceTest() throws ApiException {
        //String id = null;
        //api.profilesDeleteInstance(id);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void profilesDevicesGetToManyRelatedTest() throws ApiException {
        //String id = null;
        //List<String> fieldsDevices = null;
        //Integer limit = null;
        //DevicesWithoutIncludesResponse response = api.profilesDevicesGetToManyRelated(id, fieldsDevices, limit);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void profilesGetCollectionTest() throws ApiException {
        //List<String> filterName = null;
        //List<String> filterProfileState = null;
        //List<String> filterProfileType = null;
        //List<String> filterId = null;
        //List<String> sort = null;
        //List<String> fieldsProfiles = null;
        //Integer limit = null;
        //List<String> include = null;
        //List<String> fieldsCertificates = null;
        //List<String> fieldsDevices = null;
        //List<String> fieldsBundleIds = null;
        //Integer limitCertificates = null;
        //Integer limitDevices = null;
        //ProfilesResponse response = api.profilesGetCollection(filterName, filterProfileState, filterProfileType, filterId, sort, fieldsProfiles, limit, include, fieldsCertificates, fieldsDevices, fieldsBundleIds, limitCertificates, limitDevices);
        // TODO: test validations
    }

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void profilesGetInstanceTest() throws ApiException {
        //String id = null;
        //List<String> fieldsProfiles = null;
        //List<String> include = null;
        //List<String> fieldsCertificates = null;
        //List<String> fieldsDevices = null;
        //List<String> fieldsBundleIds = null;
        //Integer limitCertificates = null;
        //Integer limitDevices = null;
        //ProfileResponse response = api.profilesGetInstance(id, fieldsProfiles, include, fieldsCertificates, fieldsDevices, fieldsBundleIds, limitCertificates, limitDevices);
        // TODO: test validations
    }

}