package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.AgeRatingDeclarationResponse;
import org.openapitools.client.model.AgeRatingDeclarationUpdateRequest;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AgeRatingDeclarationsApi {
  private ApiClient apiClient;

  public AgeRatingDeclarationsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AgeRatingDeclarationsApi(ApiClient apiClient) {
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
   * @param id the id of the requested resource (required)
   * @param ageRatingDeclarationUpdateRequest AgeRatingDeclaration representation (required)
   * @return AgeRatingDeclarationResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AgeRatingDeclaration </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public AgeRatingDeclarationResponse ageRatingDeclarationsUpdateInstance(String id, AgeRatingDeclarationUpdateRequest ageRatingDeclarationUpdateRequest) throws ApiException {
    return ageRatingDeclarationsUpdateInstanceWithHttpInfo(id, ageRatingDeclarationUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param ageRatingDeclarationUpdateRequest AgeRatingDeclaration representation (required)
   * @return ApiResponse&lt;AgeRatingDeclarationResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single AgeRatingDeclaration </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<AgeRatingDeclarationResponse> ageRatingDeclarationsUpdateInstanceWithHttpInfo(String id, AgeRatingDeclarationUpdateRequest ageRatingDeclarationUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling ageRatingDeclarationsUpdateInstance");
    }
    if (ageRatingDeclarationUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'ageRatingDeclarationUpdateRequest' when calling ageRatingDeclarationsUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/ageRatingDeclarations/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<AgeRatingDeclarationResponse> localVarReturnType = new GenericType<AgeRatingDeclarationResponse>() {};
    return apiClient.invokeAPI("AgeRatingDeclarationsApi.ageRatingDeclarationsUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), ageRatingDeclarationUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
