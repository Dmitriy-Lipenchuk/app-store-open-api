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
import org.openapitools.client.model.AppEncryptionDeclarationDocumentCreateRequestDataRelationshipsAppEncryptionDeclaration;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * AppEncryptionDeclarationDocumentCreateRequestDataRelationships
 */
@JsonPropertyOrder({
  AppEncryptionDeclarationDocumentCreateRequestDataRelationships.JSON_PROPERTY_APP_ENCRYPTION_DECLARATION
})
@JsonTypeName("AppEncryptionDeclarationDocumentCreateRequest_data_relationships")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class AppEncryptionDeclarationDocumentCreateRequestDataRelationships {
  public static final String JSON_PROPERTY_APP_ENCRYPTION_DECLARATION = "appEncryptionDeclaration";
  private AppEncryptionDeclarationDocumentCreateRequestDataRelationshipsAppEncryptionDeclaration appEncryptionDeclaration;

  public AppEncryptionDeclarationDocumentCreateRequestDataRelationships() { 
  }

  public AppEncryptionDeclarationDocumentCreateRequestDataRelationships appEncryptionDeclaration(AppEncryptionDeclarationDocumentCreateRequestDataRelationshipsAppEncryptionDeclaration appEncryptionDeclaration) {
    this.appEncryptionDeclaration = appEncryptionDeclaration;
    return this;
  }

   /**
   * Get appEncryptionDeclaration
   * @return appEncryptionDeclaration
  **/
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_APP_ENCRYPTION_DECLARATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AppEncryptionDeclarationDocumentCreateRequestDataRelationshipsAppEncryptionDeclaration getAppEncryptionDeclaration() {
    return appEncryptionDeclaration;
  }


  @JsonProperty(JSON_PROPERTY_APP_ENCRYPTION_DECLARATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAppEncryptionDeclaration(AppEncryptionDeclarationDocumentCreateRequestDataRelationshipsAppEncryptionDeclaration appEncryptionDeclaration) {
    this.appEncryptionDeclaration = appEncryptionDeclaration;
  }


  /**
   * Return true if this AppEncryptionDeclarationDocumentCreateRequest_data_relationships object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppEncryptionDeclarationDocumentCreateRequestDataRelationships appEncryptionDeclarationDocumentCreateRequestDataRelationships = (AppEncryptionDeclarationDocumentCreateRequestDataRelationships) o;
    return Objects.equals(this.appEncryptionDeclaration, appEncryptionDeclarationDocumentCreateRequestDataRelationships.appEncryptionDeclaration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appEncryptionDeclaration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppEncryptionDeclarationDocumentCreateRequestDataRelationships {\n");
    sb.append("    appEncryptionDeclaration: ").append(toIndentedString(appEncryptionDeclaration)).append("\n");
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
