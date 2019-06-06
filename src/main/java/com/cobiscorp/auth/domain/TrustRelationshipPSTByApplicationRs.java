package com.cobiscorp.auth.domain;

import java.util.Objects;
import com.cobiscorp.auth.domain.Links;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Respuesta de la relación de confianza JWT.
 */
@ApiModel(description = "Respuesta de la relación de confianza JWT.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-06-06T14:33:14.360-05:00[America/Bogota]")

public class TrustRelationshipPSTByApplicationRs   {
  @JsonProperty("Links")
  private Links links = null;

  public TrustRelationshipPSTByApplicationRs links(Links links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @ApiModelProperty(value = "")

  @Valid

  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrustRelationshipPSTByApplicationRs trustRelationshipPSTByApplicationRs = (TrustRelationshipPSTByApplicationRs) o;
    return Objects.equals(this.links, trustRelationshipPSTByApplicationRs.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrustRelationshipPSTByApplicationRs {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

