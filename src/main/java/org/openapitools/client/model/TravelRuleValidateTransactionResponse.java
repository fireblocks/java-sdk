/*
 * Fireblocks API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.6.2
 * Contact: support@fireblocks.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;
import com.sun.jersey.api.client.GenericType;
import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * TravelRuleValidateTransactionResponse
 */
@JsonPropertyOrder({
  TravelRuleValidateTransactionResponse.JSON_PROPERTY_IS_VALID,
  TravelRuleValidateTransactionResponse.JSON_PROPERTY_TYPE,
  TravelRuleValidateTransactionResponse.JSON_PROPERTY_BENEFICIARY_ADDRESS_TYPE,
  TravelRuleValidateTransactionResponse.JSON_PROPERTY_ADDRESS_SOURCE,
  TravelRuleValidateTransactionResponse.JSON_PROPERTY_BENEFICIARY_V_A_S_PDID,
  TravelRuleValidateTransactionResponse.JSON_PROPERTY_BENEFICIARY_V_A_S_PNAME,
  TravelRuleValidateTransactionResponse.JSON_PROPERTY_WARNINGS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TravelRuleValidateTransactionResponse {
  public static final String JSON_PROPERTY_IS_VALID = "isValid";
  private Boolean isValid;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_BENEFICIARY_ADDRESS_TYPE = "beneficiaryAddressType";
  private String beneficiaryAddressType;

  public static final String JSON_PROPERTY_ADDRESS_SOURCE = "addressSource";
  private String addressSource;

  public static final String JSON_PROPERTY_BENEFICIARY_V_A_S_PDID = "beneficiaryVASPdid";
  private String beneficiaryVASPdid;

  public static final String JSON_PROPERTY_BENEFICIARY_V_A_S_PNAME = "beneficiaryVASPname";
  private String beneficiaryVASPname;

  public static final String JSON_PROPERTY_WARNINGS = "warnings";
  private List<String> warnings = new ArrayList<>();

  public TravelRuleValidateTransactionResponse() {
  }

  public TravelRuleValidateTransactionResponse isValid(Boolean isValid) {
    
    this.isValid = isValid;
    return this;
  }

   /**
   * \&quot;isValid\&quot; will tell you if you have collected all the information needed for the travel rule data transfer. Once this field &#x3D; \&quot;true\&quot;, you can move on to the next step which is to transfer the front-end information to your back-end and perform Travel Rule Transaction create
   * @return isValid
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_VALID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsValid() {
    return isValid;
  }


  @JsonProperty(JSON_PROPERTY_IS_VALID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsValid(Boolean isValid) {
    this.isValid = isValid;
  }


  public TravelRuleValidateTransactionResponse type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * \&quot;type\&quot; will tell you if the virtual asset value converted to FIAT value of the withdrawal request is above (&#x3D;TRAVELRULE) or below (&#x3D;BELOW_THRESHOLD) the threshold in your jurisdiction. If it is to an unhosted wallet which does not require travel rule information to be sent and only collected, it will say NON_CUSTODIAL.
   * @return type
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(String type) {
    this.type = type;
  }


  public TravelRuleValidateTransactionResponse beneficiaryAddressType(String beneficiaryAddressType) {
    
    this.beneficiaryAddressType = beneficiaryAddressType;
    return this;
  }

   /**
   * \&quot;beneficiaryAddressType\&quot; will tell you if your blockchain analytics provider or internal address book has been able to identify the wallet address.
   * @return beneficiaryAddressType
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BENEFICIARY_ADDRESS_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBeneficiaryAddressType() {
    return beneficiaryAddressType;
  }


  @JsonProperty(JSON_PROPERTY_BENEFICIARY_ADDRESS_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBeneficiaryAddressType(String beneficiaryAddressType) {
    this.beneficiaryAddressType = beneficiaryAddressType;
  }


  public TravelRuleValidateTransactionResponse addressSource(String addressSource) {
    
    this.addressSource = addressSource;
    return this;
  }

   /**
   * \&quot;addressSource\&quot; will tell you if the address was found in your internal address book or identified by the blockchain analytics provider.
   * @return addressSource
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ADDRESS_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAddressSource() {
    return addressSource;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAddressSource(String addressSource) {
    this.addressSource = addressSource;
  }


  public TravelRuleValidateTransactionResponse beneficiaryVASPdid(String beneficiaryVASPdid) {
    
    this.beneficiaryVASPdid = beneficiaryVASPdid;
    return this;
  }

   /**
   * The VASP DID of the beneficiary VASP
   * @return beneficiaryVASPdid
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BENEFICIARY_V_A_S_PDID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBeneficiaryVASPdid() {
    return beneficiaryVASPdid;
  }


  @JsonProperty(JSON_PROPERTY_BENEFICIARY_V_A_S_PDID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBeneficiaryVASPdid(String beneficiaryVASPdid) {
    this.beneficiaryVASPdid = beneficiaryVASPdid;
  }


  public TravelRuleValidateTransactionResponse beneficiaryVASPname(String beneficiaryVASPname) {
    
    this.beneficiaryVASPname = beneficiaryVASPname;
    return this;
  }

   /**
   * \&quot;beneficiaryVASPname\&quot; will tell you the name of the VASP that has been identified as the owner of the wallet address. This name is used in a subsequent call to get its DID.
   * @return beneficiaryVASPname
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BENEFICIARY_V_A_S_PNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBeneficiaryVASPname() {
    return beneficiaryVASPname;
  }


  @JsonProperty(JSON_PROPERTY_BENEFICIARY_V_A_S_PNAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBeneficiaryVASPname(String beneficiaryVASPname) {
    this.beneficiaryVASPname = beneficiaryVASPname;
  }


  public TravelRuleValidateTransactionResponse warnings(List<String> warnings) {
    
    this.warnings = warnings;
    return this;
  }

  public TravelRuleValidateTransactionResponse addWarningsItem(String warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * \&quot;errors/warnings\&quot; will tell you what information about the beneficiary you need to collect from the sender.
   * @return warnings
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getWarnings() {
    return warnings;
  }


  @JsonProperty(JSON_PROPERTY_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWarnings(List<String> warnings) {
    this.warnings = warnings;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TravelRuleValidateTransactionResponse travelRuleValidateTransactionResponse = (TravelRuleValidateTransactionResponse) o;
    return Objects.equals(this.isValid, travelRuleValidateTransactionResponse.isValid) &&
        Objects.equals(this.type, travelRuleValidateTransactionResponse.type) &&
        Objects.equals(this.beneficiaryAddressType, travelRuleValidateTransactionResponse.beneficiaryAddressType) &&
        Objects.equals(this.addressSource, travelRuleValidateTransactionResponse.addressSource) &&
        Objects.equals(this.beneficiaryVASPdid, travelRuleValidateTransactionResponse.beneficiaryVASPdid) &&
        Objects.equals(this.beneficiaryVASPname, travelRuleValidateTransactionResponse.beneficiaryVASPname) &&
        Objects.equals(this.warnings, travelRuleValidateTransactionResponse.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isValid, type, beneficiaryAddressType, addressSource, beneficiaryVASPdid, beneficiaryVASPname, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TravelRuleValidateTransactionResponse {\n");
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    beneficiaryAddressType: ").append(toIndentedString(beneficiaryAddressType)).append("\n");
    sb.append("    addressSource: ").append(toIndentedString(addressSource)).append("\n");
    sb.append("    beneficiaryVASPdid: ").append(toIndentedString(beneficiaryVASPdid)).append("\n");
    sb.append("    beneficiaryVASPname: ").append(toIndentedString(beneficiaryVASPname)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `isValid` to the URL query string
    if (getIsValid() != null) {
      try {
        joiner.add(String.format("%sisValid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIsValid()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `type` to the URL query string
    if (getType() != null) {
      try {
        joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `beneficiaryAddressType` to the URL query string
    if (getBeneficiaryAddressType() != null) {
      try {
        joiner.add(String.format("%sbeneficiaryAddressType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBeneficiaryAddressType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `addressSource` to the URL query string
    if (getAddressSource() != null) {
      try {
        joiner.add(String.format("%saddressSource%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAddressSource()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `beneficiaryVASPdid` to the URL query string
    if (getBeneficiaryVASPdid() != null) {
      try {
        joiner.add(String.format("%sbeneficiaryVASPdid%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBeneficiaryVASPdid()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `beneficiaryVASPname` to the URL query string
    if (getBeneficiaryVASPname() != null) {
      try {
        joiner.add(String.format("%sbeneficiaryVASPname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getBeneficiaryVASPname()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `warnings` to the URL query string
    if (getWarnings() != null) {
      for (int i = 0; i < getWarnings().size(); i++) {
        try {
          joiner.add(String.format("%swarnings%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
              URLEncoder.encode(String.valueOf(getWarnings().get(i)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    return joiner.toString();
  }

}

