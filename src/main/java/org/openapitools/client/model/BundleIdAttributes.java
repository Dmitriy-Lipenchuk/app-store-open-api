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
import org.openapitools.client.model.BundleIdPlatform;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * BundleIdAttributes
 */
@JsonPropertyOrder({
  BundleIdAttributes.JSON_PROPERTY_NAME,
  BundleIdAttributes.JSON_PROPERTY_PLATFORM,
  BundleIdAttributes.JSON_PROPERTY_IDENTIFIER,
  BundleIdAttributes.JSON_PROPERTY_SEED_ID
})
@JsonTypeName("BundleId_attributes")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class BundleIdAttributes {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PLATFORM = "platform";
  private BundleIdPlatform platform;

  public static final String JSON_PROPERTY_IDENTIFIER = "identifier";
  private String identifier;

  public static final String JSON_PROPERTY_SEED_ID = "seedId";
  private String seedId;

  public BundleIdAttributes() { 
  }

  public BundleIdAttributes name(String name) {
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


  public BundleIdAttributes platform(BundleIdPlatform platform) {
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BundleIdPlatform getPlatform() {
    return platform;
  }


  @JsonProperty(JSON_PROPERTY_PLATFORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlatform(BundleIdPlatform platform) {
    this.platform = platform;
  }


  public BundleIdAttributes identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Get identifier
   * @return identifier
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIdentifier() {
    return identifier;
  }


  @JsonProperty(JSON_PROPERTY_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }


  public BundleIdAttributes seedId(String seedId) {
    this.seedId = seedId;
    return this;
  }

   /**
   * Get seedId
   * @return seedId
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEED_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSeedId() {
    return seedId;
  }


  @JsonProperty(JSON_PROPERTY_SEED_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSeedId(String seedId) {
    this.seedId = seedId;
  }


  /**
   * Return true if this BundleId_attributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BundleIdAttributes bundleIdAttributes = (BundleIdAttributes) o;
    return Objects.equals(this.name, bundleIdAttributes.name) &&
        Objects.equals(this.platform, bundleIdAttributes.platform) &&
        Objects.equals(this.identifier, bundleIdAttributes.identifier) &&
        Objects.equals(this.seedId, bundleIdAttributes.seedId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, platform, identifier, seedId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BundleIdAttributes {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    seedId: ").append(toIndentedString(seedId)).append("\n");
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

