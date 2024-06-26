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
import org.openapitools.client.model.AlternativeDistributionKeyCreateRequestDataRelationshipsApp;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * AlternativeDistributionKeyCreateRequestDataRelationships
 */
@JsonPropertyOrder({
  AlternativeDistributionKeyCreateRequestDataRelationships.JSON_PROPERTY_APP
})
@JsonTypeName("AlternativeDistributionKeyCreateRequest_data_relationships")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AlternativeDistributionKeyCreateRequestDataRelationships {
  public static final String JSON_PROPERTY_APP = "app";
  private AlternativeDistributionKeyCreateRequestDataRelationshipsApp app;

  public AlternativeDistributionKeyCreateRequestDataRelationships() { 
  }

  public AlternativeDistributionKeyCreateRequestDataRelationships app(AlternativeDistributionKeyCreateRequestDataRelationshipsApp app) {
    this.app = app;
    return this;
  }

   /**
   * Get app
   * @return app
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_APP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AlternativeDistributionKeyCreateRequestDataRelationshipsApp getApp() {
    return app;
  }


  @JsonProperty(JSON_PROPERTY_APP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApp(AlternativeDistributionKeyCreateRequestDataRelationshipsApp app) {
    this.app = app;
  }


  /**
   * Return true if this AlternativeDistributionKeyCreateRequest_data_relationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlternativeDistributionKeyCreateRequestDataRelationships alternativeDistributionKeyCreateRequestDataRelationships = (AlternativeDistributionKeyCreateRequestDataRelationships) o;
    return Objects.equals(this.app, alternativeDistributionKeyCreateRequestDataRelationships.app);
  }

  @Override
  public int hashCode() {
    return Objects.hash(app);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlternativeDistributionKeyCreateRequestDataRelationships {\n");
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
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
