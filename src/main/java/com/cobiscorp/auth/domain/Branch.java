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
 * Oficina.
 */
@ApiModel(description = "Oficina.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-06-06T10:06:49.620-05:00[America/Bogota]")

public class Branch   {
  @JsonProperty("code")
  private Integer code;

  @JsonProperty("name")
  private String name;

  public Branch code(Integer code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * minimum: 1
   * maximum: 32767
   * @return code
  */
  @ApiModelProperty(value = "")

@Min(1) @Max(32767) 
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public Branch name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Nombre de oficina.
   * @return name
  */
  @ApiModelProperty(value = "Nombre de oficina.")

@Size(min=1,max=64) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Branch branch = (Branch) o;
    return Objects.equals(this.code, branch.code) &&
        Objects.equals(this.name, branch.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Branch {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

