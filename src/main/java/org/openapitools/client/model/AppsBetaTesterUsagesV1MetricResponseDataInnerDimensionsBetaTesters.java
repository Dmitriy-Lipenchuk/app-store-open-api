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
import org.openapitools.client.model.AppsBetaTesterUsagesV1MetricResponseDataInnerDimensionsBetaTestersLinks;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * AppsBetaTesterUsagesV1MetricResponseDataInnerDimensionsBetaTesters
 */
@JsonPropertyOrder({
  AppsBetaTesterUsagesV1MetricResponseDataInnerDimensionsBetaTesters.JSON_PROPERTY_LINKS
})
@JsonTypeName("AppsBetaTesterUsagesV1MetricResponse_data_inner_dimensions_betaTesters")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppsBetaTesterUsagesV1MetricResponseDataInnerDimensionsBetaTesters {
  public static final String JSON_PROPERTY_LINKS = "links";
  private AppsBetaTesterUsagesV1MetricResponseDataInnerDimensionsBetaTestersLinks links;

  public AppsBetaTesterUsagesV1MetricResponseDataInnerDimensionsBetaTesters() { 
  }

  public AppsBetaTesterUsagesV1MetricResponseDataInnerDimensionsBetaTesters links(AppsBetaTesterUsagesV1MetricResponseDataInnerDimensionsBetaTestersLinks links) {
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AppsBetaTesterUsagesV1MetricResponseDataInnerDimensionsBetaTestersLinks getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(AppsBetaTesterUsagesV1MetricResponseDataInnerDimensionsBetaTestersLinks links) {
    this.links = links;
  }


  /**
   * Return true if this AppsBetaTesterUsagesV1MetricResponse_data_inner_dimensions_betaTesters object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppsBetaTesterUsagesV1MetricResponseDataInnerDimensionsBetaTesters appsBetaTesterUsagesV1MetricResponseDataInnerDimensionsBetaTesters = (AppsBetaTesterUsagesV1MetricResponseDataInnerDimensionsBetaTesters) o;
    return Objects.equals(this.links, appsBetaTesterUsagesV1MetricResponseDataInnerDimensionsBetaTesters.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppsBetaTesterUsagesV1MetricResponseDataInnerDimensionsBetaTesters {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

