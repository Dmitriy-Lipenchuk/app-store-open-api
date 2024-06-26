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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets TerritoryCode
 */
public enum TerritoryCode {
  
  ABW("ABW"),
  
  AFG("AFG"),
  
  AGO("AGO"),
  
  AIA("AIA"),
  
  ALB("ALB"),
  
  AND("AND"),
  
  ANT("ANT"),
  
  ARE("ARE"),
  
  ARG("ARG"),
  
  ARM("ARM"),
  
  ASM("ASM"),
  
  ATG("ATG"),
  
  AUS("AUS"),
  
  AUT("AUT"),
  
  AZE("AZE"),
  
  BDI("BDI"),
  
  BEL("BEL"),
  
  BEN("BEN"),
  
  BES("BES"),
  
  BFA("BFA"),
  
  BGD("BGD"),
  
  BGR("BGR"),
  
  BHR("BHR"),
  
  BHS("BHS"),
  
  BIH("BIH"),
  
  BLR("BLR"),
  
  BLZ("BLZ"),
  
  BMU("BMU"),
  
  BOL("BOL"),
  
  BRA("BRA"),
  
  BRB("BRB"),
  
  BRN("BRN"),
  
  BTN("BTN"),
  
  BWA("BWA"),
  
  CAF("CAF"),
  
  CAN("CAN"),
  
  CHE("CHE"),
  
  CHL("CHL"),
  
  CHN("CHN"),
  
  CIV("CIV"),
  
  CMR("CMR"),
  
  COD("COD"),
  
  COG("COG"),
  
  COK("COK"),
  
  COL("COL"),
  
  COM("COM"),
  
  CPV("CPV"),
  
  CRI("CRI"),
  
  CUB("CUB"),
  
  CUW("CUW"),
  
  CXR("CXR"),
  
  CYM("CYM"),
  
  CYP("CYP"),
  
  CZE("CZE"),
  
  DEU("DEU"),
  
  DJI("DJI"),
  
  DMA("DMA"),
  
  DNK("DNK"),
  
  DOM("DOM"),
  
  DZA("DZA"),
  
  ECU("ECU"),
  
  EGY("EGY"),
  
  ERI("ERI"),
  
  ESP("ESP"),
  
  EST("EST"),
  
  ETH("ETH"),
  
  FIN("FIN"),
  
  FJI("FJI"),
  
  FLK("FLK"),
  
  FRA("FRA"),
  
  FRO("FRO"),
  
  FSM("FSM"),
  
  GAB("GAB"),
  
  GBR("GBR"),
  
  GEO("GEO"),
  
  GGY("GGY"),
  
  GHA("GHA"),
  
  GIB("GIB"),
  
  GIN("GIN"),
  
  GLP("GLP"),
  
  GMB("GMB"),
  
  GNB("GNB"),
  
  GNQ("GNQ"),
  
  GRC("GRC"),
  
  GRD("GRD"),
  
  GRL("GRL"),
  
  GTM("GTM"),
  
  GUF("GUF"),
  
  GUM("GUM"),
  
  GUY("GUY"),
  
  HKG("HKG"),
  
  HND("HND"),
  
  HRV("HRV"),
  
  HTI("HTI"),
  
  HUN("HUN"),
  
  IDN("IDN"),
  
  IMN("IMN"),
  
  IND("IND"),
  
  IRL("IRL"),
  
  IRQ("IRQ"),
  
  ISL("ISL"),
  
  ISR("ISR"),
  
  ITA("ITA"),
  
  JAM("JAM"),
  
  JEY("JEY"),
  
  JOR("JOR"),
  
  JPN("JPN"),
  
  KAZ("KAZ"),
  
  KEN("KEN"),
  
  KGZ("KGZ"),
  
  KHM("KHM"),
  
  KIR("KIR"),
  
  KNA("KNA"),
  
  KOR("KOR"),
  
  KWT("KWT"),
  
  LAO("LAO"),
  
  LBN("LBN"),
  
  LBR("LBR"),
  
  LBY("LBY"),
  
  LCA("LCA"),
  
  LIE("LIE"),
  
  LKA("LKA"),
  
  LSO("LSO"),
  
  LTU("LTU"),
  
  LUX("LUX"),
  
  LVA("LVA"),
  
  MAC("MAC"),
  
  MAR("MAR"),
  
  MCO("MCO"),
  
  MDA("MDA"),
  
  MDG("MDG"),
  
  MDV("MDV"),
  
  MEX("MEX"),
  
  MHL("MHL"),
  
  MKD("MKD"),
  
  MLI("MLI"),
  
  MLT("MLT"),
  
  MMR("MMR"),
  
  MNE("MNE"),
  
  MNG("MNG"),
  
  MNP("MNP"),
  
  MOZ("MOZ"),
  
  MRT("MRT"),
  
  MSR("MSR"),
  
  MTQ("MTQ"),
  
  MUS("MUS"),
  
  MWI("MWI"),
  
  MYS("MYS"),
  
  MYT("MYT"),
  
  NAM("NAM"),
  
  NCL("NCL"),
  
  NER("NER"),
  
  NFK("NFK"),
  
  NGA("NGA"),
  
  NIC("NIC"),
  
  NIU("NIU"),
  
  NLD("NLD"),
  
  NOR("NOR"),
  
  NPL("NPL"),
  
  NRU("NRU"),
  
  NZL("NZL"),
  
  OMN("OMN"),
  
  PAK("PAK"),
  
  PAN("PAN"),
  
  PER("PER"),
  
  PHL("PHL"),
  
  PLW("PLW"),
  
  PNG("PNG"),
  
  POL("POL"),
  
  PRI("PRI"),
  
  PRT("PRT"),
  
  PRY("PRY"),
  
  PSE("PSE"),
  
  PYF("PYF"),
  
  QAT("QAT"),
  
  REU("REU"),
  
  ROU("ROU"),
  
  RUS("RUS"),
  
  RWA("RWA"),
  
  SAU("SAU"),
  
  SEN("SEN"),
  
  SGP("SGP"),
  
  SHN("SHN"),
  
  SLB("SLB"),
  
  SLE("SLE"),
  
  SLV("SLV"),
  
  SMR("SMR"),
  
  SOM("SOM"),
  
  SPM("SPM"),
  
  SRB("SRB"),
  
  SSD("SSD"),
  
  STP("STP"),
  
  SUR("SUR"),
  
  SVK("SVK"),
  
  SVN("SVN"),
  
  SWE("SWE"),
  
  SWZ("SWZ"),
  
  SXM("SXM"),
  
  SYC("SYC"),
  
  TCA("TCA"),
  
  TCD("TCD"),
  
  TGO("TGO"),
  
  THA("THA"),
  
  TJK("TJK"),
  
  TKM("TKM"),
  
  TLS("TLS"),
  
  TON("TON"),
  
  TTO("TTO"),
  
  TUN("TUN"),
  
  TUR("TUR"),
  
  TUV("TUV"),
  
  TWN("TWN"),
  
  TZA("TZA"),
  
  UGA("UGA"),
  
  UKR("UKR"),
  
  UMI("UMI"),
  
  URY("URY"),
  
  USA("USA"),
  
  UZB("UZB"),
  
  VAT("VAT"),
  
  VCT("VCT"),
  
  VEN("VEN"),
  
  VGB("VGB"),
  
  VIR("VIR"),
  
  VNM("VNM"),
  
  VUT("VUT"),
  
  WLF("WLF"),
  
  WSM("WSM"),
  
  YEM("YEM"),
  
  ZAF("ZAF"),
  
  ZMB("ZMB"),
  
  ZWE("ZWE");

  private String value;

  TerritoryCode(String value) {
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
  public static TerritoryCode fromValue(String value) {
    for (TerritoryCode b : TerritoryCode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

