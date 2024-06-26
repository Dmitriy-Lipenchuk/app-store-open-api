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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.client.model.CiBuildRunRelationshipsWorkflowData;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * CiBuildRunCreateRequestDataRelationshipsWorkflow
 */
@JsonPropertyOrder({
  CiBuildRunCreateRequestDataRelationshipsWorkflow.JSON_PROPERTY_DATA
})
@JsonTypeName("CiBuildRunCreateRequest_data_relationships_workflow")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class CiBuildRunCreateRequestDataRelationshipsWorkflow {
  public static final String JSON_PROPERTY_DATA = "data";
  private CiBuildRunRelationshipsWorkflowData data;

  public CiBuildRunCreateRequestDataRelationshipsWorkflow() { 
  }

  public CiBuildRunCreateRequestDataRelationshipsWorkflow data(CiBuildRunRelationshipsWorkflowData data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CiBuildRunRelationshipsWorkflowData getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(CiBuildRunRelationshipsWorkflowData data) {
    this.data = data;
  }


  /**
   * Return true if this CiBuildRunCreateRequest_data_relationships_workflow object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CiBuildRunCreateRequestDataRelationshipsWorkflow ciBuildRunCreateRequestDataRelationshipsWorkflow = (CiBuildRunCreateRequestDataRelationshipsWorkflow) o;
    return Objects.equals(this.data, ciBuildRunCreateRequestDataRelationshipsWorkflow.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CiBuildRunCreateRequestDataRelationshipsWorkflow {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

