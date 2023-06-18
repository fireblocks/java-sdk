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
import org.openapitools.client.model.XBSettlementConfigStepsRecord;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * XBSettlementConfigEditRequestBody
 */
@JsonPropertyOrder({
  XBSettlementConfigEditRequestBody.JSON_PROPERTY_NAME,
  XBSettlementConfigEditRequestBody.JSON_PROPERTY_STEPS,
  XBSettlementConfigEditRequestBody.JSON_PROPERTY_CONVERSION_SLIPPAGE_BASIS_POINTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class XBSettlementConfigEditRequestBody {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_STEPS = "steps";
  private XBSettlementConfigStepsRecord steps;

  public static final String JSON_PROPERTY_CONVERSION_SLIPPAGE_BASIS_POINTS = "conversionSlippageBasisPoints";
  private Integer conversionSlippageBasisPoints = 10000;

  public XBSettlementConfigEditRequestBody() {
  }

  public XBSettlementConfigEditRequestBody name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name for the cross-border settlement configuration
   * @return name
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public XBSettlementConfigEditRequestBody steps(XBSettlementConfigStepsRecord steps) {
    
    this.steps = steps;
    return this;
  }

   /**
   * Get steps
   * @return steps
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_STEPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public XBSettlementConfigStepsRecord getSteps() {
    return steps;
  }


  @JsonProperty(JSON_PROPERTY_STEPS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSteps(XBSettlementConfigStepsRecord steps) {
    this.steps = steps;
  }


  public XBSettlementConfigEditRequestBody conversionSlippageBasisPoints(Integer conversionSlippageBasisPoints) {
    
    this.conversionSlippageBasisPoints = conversionSlippageBasisPoints;
    return this;
  }

   /**
   * Slippage configuarion in basis points, the default value is 10% 
   * minimum: 0
   * maximum: 10000
   * @return conversionSlippageBasisPoints
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONVERSION_SLIPPAGE_BASIS_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getConversionSlippageBasisPoints() {
    return conversionSlippageBasisPoints;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSION_SLIPPAGE_BASIS_POINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConversionSlippageBasisPoints(Integer conversionSlippageBasisPoints) {
    this.conversionSlippageBasisPoints = conversionSlippageBasisPoints;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    XBSettlementConfigEditRequestBody xbSettlementConfigEditRequestBody = (XBSettlementConfigEditRequestBody) o;
    return Objects.equals(this.name, xbSettlementConfigEditRequestBody.name) &&
        Objects.equals(this.steps, xbSettlementConfigEditRequestBody.steps) &&
        Objects.equals(this.conversionSlippageBasisPoints, xbSettlementConfigEditRequestBody.conversionSlippageBasisPoints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, steps, conversionSlippageBasisPoints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class XBSettlementConfigEditRequestBody {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    conversionSlippageBasisPoints: ").append(toIndentedString(conversionSlippageBasisPoints)).append("\n");
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

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `steps` to the URL query string
    if (getSteps() != null) {
      try {
        joiner.add(String.format("%ssteps%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getSteps()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `conversionSlippageBasisPoints` to the URL query string
    if (getConversionSlippageBasisPoints() != null) {
      try {
        joiner.add(String.format("%sconversionSlippageBasisPoints%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getConversionSlippageBasisPoints()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

