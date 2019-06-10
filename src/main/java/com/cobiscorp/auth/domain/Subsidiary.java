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
 * Filial.
 */
@ApiModel(description = "Filial.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-06-06T10:06:49.620-05:00[America/Bogota]")

public class Subsidiary   {
  @JsonProperty("code")
  private Integer code;

  @JsonProperty("name")
  private String name;

  @JsonProperty("status")
  private String status;

  public Subsidiary code(Integer code) {
    this.code = code;
    return this;
  }

  /**
   * Código de la filial.
   * minimum: 1
   * maximum: 255
   * @return code
  */
  @ApiModelProperty(value = "Código de la filial.")

@Min(1) @Max(255) 
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public Subsidiary name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Nombre de la filial.
   * @return name
  */
  @ApiModelProperty(value = "Nombre de la filial.")

@Size(min=1,max=64) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Subsidiary status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")

@Size(min=1,max=1) 
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subsidiary subsidiary = (Subsidiary) o;
    return Objects.equals(this.code, subsidiary.code) &&
        Objects.equals(this.name, subsidiary.name) &&
        Objects.equals(this.status, subsidiary.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subsidiary {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

