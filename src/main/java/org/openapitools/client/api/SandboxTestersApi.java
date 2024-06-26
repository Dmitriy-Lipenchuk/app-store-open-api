package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.SandboxTesterV2Response;
import org.openapitools.client.model.SandboxTesterV2UpdateRequest;
import org.openapitools.client.model.SandboxTestersV2Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class SandboxTestersApi {
  private ApiClient apiClient;

  public SandboxTestersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SandboxTestersApi(ApiClient apiClient) {
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
   * @param fieldsSandboxTesters the fields to include for returned resources of type sandboxTesters (optional)
   * @param limit maximum resources per page (optional)
   * @return SandboxTestersV2Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of SandboxTesters </td><td>  -  </td></tr>
     </table>
   */
  public SandboxTestersV2Response sandboxTestersV2GetCollection(List<String> fieldsSandboxTesters, Integer limit) throws ApiException {
    return sandboxTestersV2GetCollectionWithHttpInfo(fieldsSandboxTesters, limit).getData();
  }

  /**
   * 
   * 
   * @param fieldsSandboxTesters the fields to include for returned resources of type sandboxTesters (optional)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;SandboxTestersV2Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of SandboxTesters </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SandboxTestersV2Response> sandboxTestersV2GetCollectionWithHttpInfo(List<String> fieldsSandboxTesters, Integer limit) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[sandboxTesters]", fieldsSandboxTesters)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<SandboxTestersV2Response> localVarReturnType = new GenericType<SandboxTestersV2Response>() {};
    return apiClient.invokeAPI("SandboxTestersApi.sandboxTestersV2GetCollection", "/v2/sandboxTesters", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param sandboxTesterV2UpdateRequest SandboxTester representation (required)
   * @return SandboxTesterV2Response
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single SandboxTester </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public SandboxTesterV2Response sandboxTestersV2UpdateInstance(String id, SandboxTesterV2UpdateRequest sandboxTesterV2UpdateRequest) throws ApiException {
    return sandboxTestersV2UpdateInstanceWithHttpInfo(id, sandboxTesterV2UpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param sandboxTesterV2UpdateRequest SandboxTester representation (required)
   * @return ApiResponse&lt;SandboxTesterV2Response&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single SandboxTester </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<SandboxTesterV2Response> sandboxTestersV2UpdateInstanceWithHttpInfo(String id, SandboxTesterV2UpdateRequest sandboxTesterV2UpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling sandboxTestersV2UpdateInstance");
    }
    if (sandboxTesterV2UpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'sandboxTesterV2UpdateRequest' when calling sandboxTestersV2UpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v2/sandboxTesters/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<SandboxTesterV2Response> localVarReturnType = new GenericType<SandboxTesterV2Response>() {};
    return apiClient.invokeAPI("SandboxTestersApi.sandboxTestersV2UpdateInstance", localVarPath, "PATCH", new ArrayList<>(), sandboxTesterV2UpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
