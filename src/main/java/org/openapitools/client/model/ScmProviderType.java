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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * ScmProviderType
 */
@JsonPropertyOrder({
  ScmProviderType.JSON_PROPERTY_KIND,
  ScmProviderType.JSON_PROPERTY_DISPLAY_NAME,
  ScmProviderType.JSON_PROPERTY_IS_ON_PREMISE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class ScmProviderType {
  /**
   * Gets or Sets kind
   */
  public enum KindEnum {
    BITBUCKET_CLOUD("BITBUCKET_CLOUD"),
    
    BITBUCKET_SERVER("BITBUCKET_SERVER"),
    
    GITHUB_CLOUD("GITHUB_CLOUD"),
    
    GITHUB_ENTERPRISE("GITHUB_ENTERPRISE"),
    
    GITLAB_CLOUD("GITLAB_CLOUD"),
    
    GITLAB_SELF_MANAGED("GITLAB_SELF_MANAGED");

    private String value;

    KindEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static KindEnum fromValue(String value) {
      for (KindEnum b : KindEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_KIND = "kind";
  private KindEnum kind;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private String displayName;

  public static final String JSON_PROPERTY_IS_ON_PREMISE = "isOnPremise";
  private Boolean isOnPremise;

  public ScmProviderType() { 
  }

  public ScmProviderType kind(KindEnum kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Get kind
   * @return kind
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KIND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public KindEnum getKind() {
    return kind;
  }


  @JsonProperty(JSON_PROPERTY_KIND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKind(KindEnum kind) {
    this.kind = kind;
  }


  public ScmProviderType displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayName() {
    return displayName;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public ScmProviderType isOnPremise(Boolean isOnPremise) {
    this.isOnPremise = isOnPremise;
    return this;
  }

   /**
   * Get isOnPremise
   * @return isOnPremise
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_ON_PREMISE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsOnPremise() {
    return isOnPremise;
  }


  @JsonProperty(JSON_PROPERTY_IS_ON_PREMISE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsOnPremise(Boolean isOnPremise) {
    this.isOnPremise = isOnPremise;
  }


  /**
   * Return true if this ScmProviderType object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScmProviderType scmProviderType = (ScmProviderType) o;
    return Objects.equals(this.kind, scmProviderType.kind) &&
        Objects.equals(this.displayName, scmProviderType.displayName) &&
        Objects.equals(this.isOnPremise, scmProviderType.isOnPremise);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, displayName, isOnPremise);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScmProviderType {\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    isOnPremise: ").append(toIndentedString(isOnPremise)).append("\n");
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
