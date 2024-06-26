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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * DiagnosticLogCallStackNode
 */
@JsonPropertyOrder({
  DiagnosticLogCallStackNode.JSON_PROPERTY_SAMPLE_COUNT,
  DiagnosticLogCallStackNode.JSON_PROPERTY_IS_BLAME_FRAME,
  DiagnosticLogCallStackNode.JSON_PROPERTY_SYMBOL_NAME,
  DiagnosticLogCallStackNode.JSON_PROPERTY_INSIGHTS_CATEGORY,
  DiagnosticLogCallStackNode.JSON_PROPERTY_OFFSET_INTO_SYMBOL,
  DiagnosticLogCallStackNode.JSON_PROPERTY_BINARY_NAME,
  DiagnosticLogCallStackNode.JSON_PROPERTY_FILE_NAME,
  DiagnosticLogCallStackNode.JSON_PROPERTY_BINARY_U_U_I_D,
  DiagnosticLogCallStackNode.JSON_PROPERTY_LINE_NUMBER,
  DiagnosticLogCallStackNode.JSON_PROPERTY_ADDRESS,
  DiagnosticLogCallStackNode.JSON_PROPERTY_OFFSET_INTO_BINARY_TEXT_SEGMENT,
  DiagnosticLogCallStackNode.JSON_PROPERTY_RAW_FRAME,
  DiagnosticLogCallStackNode.JSON_PROPERTY_SUB_FRAMES
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-26T23:41:20.466109+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class DiagnosticLogCallStackNode {
  public static final String JSON_PROPERTY_SAMPLE_COUNT = "sampleCount";
  private Integer sampleCount;

  public static final String JSON_PROPERTY_IS_BLAME_FRAME = "isBlameFrame";
  private Boolean isBlameFrame;

  public static final String JSON_PROPERTY_SYMBOL_NAME = "symbolName";
  private String symbolName;

  public static final String JSON_PROPERTY_INSIGHTS_CATEGORY = "insightsCategory";
  private String insightsCategory;

  public static final String JSON_PROPERTY_OFFSET_INTO_SYMBOL = "offsetIntoSymbol";
  private String offsetIntoSymbol;

  public static final String JSON_PROPERTY_BINARY_NAME = "binaryName";
  private String binaryName;

  public static final String JSON_PROPERTY_FILE_NAME = "fileName";
  private String fileName;

  public static final String JSON_PROPERTY_BINARY_U_U_I_D = "binaryUUID";
  private String binaryUUID;

  public static final String JSON_PROPERTY_LINE_NUMBER = "lineNumber";
  private String lineNumber;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private String address;

  public static final String JSON_PROPERTY_OFFSET_INTO_BINARY_TEXT_SEGMENT = "offsetIntoBinaryTextSegment";
  private String offsetIntoBinaryTextSegment;

  public static final String JSON_PROPERTY_RAW_FRAME = "rawFrame";
  private String rawFrame;

  public static final String JSON_PROPERTY_SUB_FRAMES = "subFrames";
  private List<DiagnosticLogCallStackNode> subFrames = new ArrayList<>();

  public DiagnosticLogCallStackNode() { 
  }

  public DiagnosticLogCallStackNode sampleCount(Integer sampleCount) {
    this.sampleCount = sampleCount;
    return this;
  }

   /**
   * Get sampleCount
   * @return sampleCount
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SAMPLE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSampleCount() {
    return sampleCount;
  }


  @JsonProperty(JSON_PROPERTY_SAMPLE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSampleCount(Integer sampleCount) {
    this.sampleCount = sampleCount;
  }


  public DiagnosticLogCallStackNode isBlameFrame(Boolean isBlameFrame) {
    this.isBlameFrame = isBlameFrame;
    return this;
  }

   /**
   * Get isBlameFrame
   * @return isBlameFrame
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_BLAME_FRAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsBlameFrame() {
    return isBlameFrame;
  }


  @JsonProperty(JSON_PROPERTY_IS_BLAME_FRAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsBlameFrame(Boolean isBlameFrame) {
    this.isBlameFrame = isBlameFrame;
  }


  public DiagnosticLogCallStackNode symbolName(String symbolName) {
    this.symbolName = symbolName;
    return this;
  }

   /**
   * Get symbolName
   * @return symbolName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SYMBOL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSymbolName() {
    return symbolName;
  }


  @JsonProperty(JSON_PROPERTY_SYMBOL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSymbolName(String symbolName) {
    this.symbolName = symbolName;
  }


  public DiagnosticLogCallStackNode insightsCategory(String insightsCategory) {
    this.insightsCategory = insightsCategory;
    return this;
  }

   /**
   * Get insightsCategory
   * @return insightsCategory
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSIGHTS_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInsightsCategory() {
    return insightsCategory;
  }


  @JsonProperty(JSON_PROPERTY_INSIGHTS_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInsightsCategory(String insightsCategory) {
    this.insightsCategory = insightsCategory;
  }


  public DiagnosticLogCallStackNode offsetIntoSymbol(String offsetIntoSymbol) {
    this.offsetIntoSymbol = offsetIntoSymbol;
    return this;
  }

   /**
   * Get offsetIntoSymbol
   * @return offsetIntoSymbol
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OFFSET_INTO_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOffsetIntoSymbol() {
    return offsetIntoSymbol;
  }


  @JsonProperty(JSON_PROPERTY_OFFSET_INTO_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOffsetIntoSymbol(String offsetIntoSymbol) {
    this.offsetIntoSymbol = offsetIntoSymbol;
  }


  public DiagnosticLogCallStackNode binaryName(String binaryName) {
    this.binaryName = binaryName;
    return this;
  }

   /**
   * Get binaryName
   * @return binaryName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BINARY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBinaryName() {
    return binaryName;
  }


  @JsonProperty(JSON_PROPERTY_BINARY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBinaryName(String binaryName) {
    this.binaryName = binaryName;
  }


  public DiagnosticLogCallStackNode fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFileName() {
    return fileName;
  }


  @JsonProperty(JSON_PROPERTY_FILE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public DiagnosticLogCallStackNode binaryUUID(String binaryUUID) {
    this.binaryUUID = binaryUUID;
    return this;
  }

   /**
   * Get binaryUUID
   * @return binaryUUID
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BINARY_U_U_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBinaryUUID() {
    return binaryUUID;
  }


  @JsonProperty(JSON_PROPERTY_BINARY_U_U_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBinaryUUID(String binaryUUID) {
    this.binaryUUID = binaryUUID;
  }


  public DiagnosticLogCallStackNode lineNumber(String lineNumber) {
    this.lineNumber = lineNumber;
    return this;
  }

   /**
   * Get lineNumber
   * @return lineNumber
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLineNumber() {
    return lineNumber;
  }


  @JsonProperty(JSON_PROPERTY_LINE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLineNumber(String lineNumber) {
    this.lineNumber = lineNumber;
  }


  public DiagnosticLogCallStackNode address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress(String address) {
    this.address = address;
  }


  public DiagnosticLogCallStackNode offsetIntoBinaryTextSegment(String offsetIntoBinaryTextSegment) {
    this.offsetIntoBinaryTextSegment = offsetIntoBinaryTextSegment;
    return this;
  }

   /**
   * Get offsetIntoBinaryTextSegment
   * @return offsetIntoBinaryTextSegment
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OFFSET_INTO_BINARY_TEXT_SEGMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOffsetIntoBinaryTextSegment() {
    return offsetIntoBinaryTextSegment;
  }


  @JsonProperty(JSON_PROPERTY_OFFSET_INTO_BINARY_TEXT_SEGMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOffsetIntoBinaryTextSegment(String offsetIntoBinaryTextSegment) {
    this.offsetIntoBinaryTextSegment = offsetIntoBinaryTextSegment;
  }


  public DiagnosticLogCallStackNode rawFrame(String rawFrame) {
    this.rawFrame = rawFrame;
    return this;
  }

   /**
   * Get rawFrame
   * @return rawFrame
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RAW_FRAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRawFrame() {
    return rawFrame;
  }


  @JsonProperty(JSON_PROPERTY_RAW_FRAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRawFrame(String rawFrame) {
    this.rawFrame = rawFrame;
  }


  public DiagnosticLogCallStackNode subFrames(List<DiagnosticLogCallStackNode> subFrames) {
    this.subFrames = subFrames;
    return this;
  }

  public DiagnosticLogCallStackNode addSubFramesItem(DiagnosticLogCallStackNode subFramesItem) {
    if (this.subFrames == null) {
      this.subFrames = new ArrayList<>();
    }
    this.subFrames.add(subFramesItem);
    return this;
  }

   /**
   * Get subFrames
   * @return subFrames
  **/
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUB_FRAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DiagnosticLogCallStackNode> getSubFrames() {
    return subFrames;
  }


  @JsonProperty(JSON_PROPERTY_SUB_FRAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubFrames(List<DiagnosticLogCallStackNode> subFrames) {
    this.subFrames = subFrames;
  }


  /**
   * Return true if this DiagnosticLogCallStackNode object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiagnosticLogCallStackNode diagnosticLogCallStackNode = (DiagnosticLogCallStackNode) o;
    return Objects.equals(this.sampleCount, diagnosticLogCallStackNode.sampleCount) &&
        Objects.equals(this.isBlameFrame, diagnosticLogCallStackNode.isBlameFrame) &&
        Objects.equals(this.symbolName, diagnosticLogCallStackNode.symbolName) &&
        Objects.equals(this.insightsCategory, diagnosticLogCallStackNode.insightsCategory) &&
        Objects.equals(this.offsetIntoSymbol, diagnosticLogCallStackNode.offsetIntoSymbol) &&
        Objects.equals(this.binaryName, diagnosticLogCallStackNode.binaryName) &&
        Objects.equals(this.fileName, diagnosticLogCallStackNode.fileName) &&
        Objects.equals(this.binaryUUID, diagnosticLogCallStackNode.binaryUUID) &&
        Objects.equals(this.lineNumber, diagnosticLogCallStackNode.lineNumber) &&
        Objects.equals(this.address, diagnosticLogCallStackNode.address) &&
        Objects.equals(this.offsetIntoBinaryTextSegment, diagnosticLogCallStackNode.offsetIntoBinaryTextSegment) &&
        Objects.equals(this.rawFrame, diagnosticLogCallStackNode.rawFrame) &&
        Objects.equals(this.subFrames, diagnosticLogCallStackNode.subFrames);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sampleCount, isBlameFrame, symbolName, insightsCategory, offsetIntoSymbol, binaryName, fileName, binaryUUID, lineNumber, address, offsetIntoBinaryTextSegment, rawFrame, subFrames);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiagnosticLogCallStackNode {\n");
    sb.append("    sampleCount: ").append(toIndentedString(sampleCount)).append("\n");
    sb.append("    isBlameFrame: ").append(toIndentedString(isBlameFrame)).append("\n");
    sb.append("    symbolName: ").append(toIndentedString(symbolName)).append("\n");
    sb.append("    insightsCategory: ").append(toIndentedString(insightsCategory)).append("\n");
    sb.append("    offsetIntoSymbol: ").append(toIndentedString(offsetIntoSymbol)).append("\n");
    sb.append("    binaryName: ").append(toIndentedString(binaryName)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    binaryUUID: ").append(toIndentedString(binaryUUID)).append("\n");
    sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    offsetIntoBinaryTextSegment: ").append(toIndentedString(offsetIntoBinaryTextSegment)).append("\n");
    sb.append("    rawFrame: ").append(toIndentedString(rawFrame)).append("\n");
    sb.append("    subFrames: ").append(toIndentedString(subFrames)).append("\n");
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

