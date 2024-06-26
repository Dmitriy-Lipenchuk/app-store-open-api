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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.CiXcodeVersionAttributesTestDestinationsInner;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * CiXcodeVersionAttributes
 */
@JsonPropertyOrder({
  CiXcodeVersionAttributes.JSON_PROPERTY_VERSION,
  CiXcodeVersionAttributes.JSON_PROPERTY_NAME,
  CiXcodeVersionAttributes.JSON_PROPERTY_TEST_DESTINATIONS
})
@JsonTypeName("CiXcodeVersion_attributes")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class CiXcodeVersionAttributes {
  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TEST_DESTINATIONS = "testDestinations";
  private List<CiXcodeVersionAttributesTestDestinationsInner> testDestinations = new ArrayList<>();

  public CiXcodeVersionAttributes() { 
  }

  public CiXcodeVersionAttributes version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(String version) {
    this.version = version;
  }


  public CiXcodeVersionAttributes name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public CiXcodeVersionAttributes testDestinations(List<CiXcodeVersionAttributesTestDestinationsInner> testDestinations) {
    this.testDestinations = testDestinations;
    return this;
  }

  public CiXcodeVersionAttributes addTestDestinationsItem(CiXcodeVersionAttributesTestDestinationsInner testDestinationsItem) {
    if (this.testDestinations == null) {
      this.testDestinations = new ArrayList<>();
    }
    this.testDestinations.add(testDestinationsItem);
    return this;
  }

   /**
   * Get testDestinations
   * @return testDestinations
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEST_DESTINATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CiXcodeVersionAttributesTestDestinationsInner> getTestDestinations() {
    return testDestinations;
  }


  @JsonProperty(JSON_PROPERTY_TEST_DESTINATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestDestinations(List<CiXcodeVersionAttributesTestDestinationsInner> testDestinations) {
    this.testDestinations = testDestinations;
  }


  /**
   * Return true if this CiXcodeVersion_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CiXcodeVersionAttributes ciXcodeVersionAttributes = (CiXcodeVersionAttributes) o;
    return Objects.equals(this.version, ciXcodeVersionAttributes.version) &&
        Objects.equals(this.name, ciXcodeVersionAttributes.name) &&
        Objects.equals(this.testDestinations, ciXcodeVersionAttributes.testDestinations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, name, testDestinations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CiXcodeVersionAttributes {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    testDestinations: ").append(toIndentedString(testDestinations)).append("\n");
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
