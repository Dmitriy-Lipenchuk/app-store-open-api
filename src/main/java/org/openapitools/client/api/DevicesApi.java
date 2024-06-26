package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;

import jakarta.ws.rs.core.GenericType;

import org.openapitools.client.model.DeviceCreateRequest;
import org.openapitools.client.model.DeviceResponse;
import org.openapitools.client.model.DeviceUpdateRequest;
import org.openapitools.client.model.DevicesResponse;
import org.openapitools.client.model.ErrorResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class DevicesApi {
  private ApiClient apiClient;

  public DevicesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DevicesApi(ApiClient apiClient) {
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
   * @param deviceCreateRequest Device representation (required)
   * @return DeviceResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single Device </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public DeviceResponse devicesCreateInstance(DeviceCreateRequest deviceCreateRequest) throws ApiException {
    return devicesCreateInstanceWithHttpInfo(deviceCreateRequest).getData();
  }

  /**
   * 
   * 
   * @param deviceCreateRequest Device representation (required)
   * @return ApiResponse&lt;DeviceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 201 </td><td> Single Device </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DeviceResponse> devicesCreateInstanceWithHttpInfo(DeviceCreateRequest deviceCreateRequest) throws ApiException {
    // Check required parameters
    if (deviceCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'deviceCreateRequest' when calling devicesCreateInstance");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<DeviceResponse> localVarReturnType = new GenericType<DeviceResponse>() {};
    return apiClient.invokeAPI("DevicesApi.devicesCreateInstance", "/v1/devices", "POST", new ArrayList<>(), deviceCreateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param filterName filter by attribute &#39;name&#39; (optional)
   * @param filterPlatform filter by attribute &#39;platform&#39; (optional)
   * @param filterStatus filter by attribute &#39;status&#39; (optional)
   * @param filterUdid filter by attribute &#39;udid&#39; (optional)
   * @param filterId filter by id(s) (optional)
   * @param sort comma-separated list of sort expressions; resources will be sorted as specified (optional)
   * @param fieldsDevices the fields to include for returned resources of type devices (optional)
   * @param limit maximum resources per page (optional)
   * @return DevicesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of Devices </td><td>  -  </td></tr>
     </table>
   */
  public DevicesResponse devicesGetCollection(List<String> filterName, List<String> filterPlatform, List<String> filterStatus, List<String> filterUdid, List<String> filterId, List<String> sort, List<String> fieldsDevices, Integer limit) throws ApiException {
    return devicesGetCollectionWithHttpInfo(filterName, filterPlatform, filterStatus, filterUdid, filterId, sort, fieldsDevices, limit).getData();
  }

  /**
   * 
   * 
   * @param filterName filter by attribute &#39;name&#39; (optional)
   * @param filterPlatform filter by attribute &#39;platform&#39; (optional)
   * @param filterStatus filter by attribute &#39;status&#39; (optional)
   * @param filterUdid filter by attribute &#39;udid&#39; (optional)
   * @param filterId filter by id(s) (optional)
   * @param sort comma-separated list of sort expressions; resources will be sorted as specified (optional)
   * @param fieldsDevices the fields to include for returned resources of type devices (optional)
   * @param limit maximum resources per page (optional)
   * @return ApiResponse&lt;DevicesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> List of Devices </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DevicesResponse> devicesGetCollectionWithHttpInfo(List<String> filterName, List<String> filterPlatform, List<String> filterStatus, List<String> filterUdid, List<String> filterId, List<String> sort, List<String> fieldsDevices, Integer limit) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "filter[name]", filterName)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[platform]", filterPlatform));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[status]", filterStatus));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[udid]", filterUdid));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "filter[id]", filterId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("csv", "fields[devices]", fieldsDevices));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<DevicesResponse> localVarReturnType = new GenericType<DevicesResponse>() {};
    return apiClient.invokeAPI("DevicesApi.devicesGetCollection", "/v1/devices", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsDevices the fields to include for returned resources of type devices (optional)
   * @return DeviceResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single Device </td><td>  -  </td></tr>
     </table>
   */
  public DeviceResponse devicesGetInstance(String id, List<String> fieldsDevices) throws ApiException {
    return devicesGetInstanceWithHttpInfo(id, fieldsDevices).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param fieldsDevices the fields to include for returned resources of type devices (optional)
   * @return ApiResponse&lt;DeviceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single Device </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DeviceResponse> devicesGetInstanceWithHttpInfo(String id, List<String> fieldsDevices) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling devicesGetInstance");
    }

    // Path parameters
    String localVarPath = "/v1/devices/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("csv", "fields[devices]", fieldsDevices)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<DeviceResponse> localVarReturnType = new GenericType<DeviceResponse>() {};
    return apiClient.invokeAPI("DevicesApi.devicesGetInstance", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param deviceUpdateRequest Device representation (required)
   * @return DeviceResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single Device </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public DeviceResponse devicesUpdateInstance(String id, DeviceUpdateRequest deviceUpdateRequest) throws ApiException {
    return devicesUpdateInstanceWithHttpInfo(id, deviceUpdateRequest).getData();
  }

  /**
   * 
   * 
   * @param id the id of the requested resource (required)
   * @param deviceUpdateRequest Device representation (required)
   * @return ApiResponse&lt;DeviceResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 400 </td><td> Parameter error(s) </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized error(s) </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden error </td><td>  -  </td></tr>
       <tr><td> 404 </td><td> Not found error </td><td>  -  </td></tr>
       <tr><td> 422 </td><td> Unprocessable request entity error(s) </td><td>  -  </td></tr>
       <tr><td> 200 </td><td> Single Device </td><td>  -  </td></tr>
       <tr><td> 409 </td><td> Request entity error(s) </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<DeviceResponse> devicesUpdateInstanceWithHttpInfo(String id, DeviceUpdateRequest deviceUpdateRequest) throws ApiException {
    // Check required parameters
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling devicesUpdateInstance");
    }
    if (deviceUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'deviceUpdateRequest' when calling devicesUpdateInstance");
    }

    // Path parameters
    String localVarPath = "/v1/devices/{id}"
            .replaceAll("\\{id}", apiClient.escapeString(id));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"itc-bearer-token"};
    GenericType<DeviceResponse> localVarReturnType = new GenericType<DeviceResponse>() {};
    return apiClient.invokeAPI("DevicesApi.devicesUpdateInstance", localVarPath, "PATCH", new ArrayList<>(), deviceUpdateRequest,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
