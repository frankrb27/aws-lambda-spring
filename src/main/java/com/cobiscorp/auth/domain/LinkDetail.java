package com.cobiscorp.auth.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LinkDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-06-06T14:33:14.360-05:00[America/Bogota]")

public class LinkDetail   {
  @JsonProperty("href")
  private String href;

  @JsonProperty("rel")
  private String rel;

  @JsonProperty("type")
  private String type;

  public LinkDetail href(String href) {
    this.href = href;
    return this;
  }

  /**
   * URL
   * @return href
  */
  @ApiModelProperty(value = "URL")


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public LinkDetail rel(String rel) {
    this.rel = rel;
    return this;
  }

  /**
   * Entidad relacionada
   * @return rel
  */
  @ApiModelProperty(value = "Entidad relacionada")


  public String getRel() {
    return rel;
  }

  public void setRel(String rel) {
    this.rel = rel;
  }

  public LinkDetail type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Operación HTTP soportada
   * @return type
  */
  @ApiModelProperty(value = "Operación HTTP soportada")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkDetail linkDetail = (LinkDetail) o;
    return Objects.equals(this.href, linkDetail.href) &&
        Objects.equals(this.rel, linkDetail.rel) &&
        Objects.equals(this.type, linkDetail.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(href, rel, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkDetail {\n");
    
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    rel: ").append(toIndentedString(rel)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

