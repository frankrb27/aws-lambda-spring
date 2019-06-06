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
 * Aplicación externa que consulta y procesa información financiera de COBIS.
 */
@ApiModel(description = "Aplicación externa que consulta y procesa información financiera de COBIS.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-06-06T14:33:14.360-05:00[America/Bogota]")

public class ExternalApplication   {
  @JsonProperty("code")
  private Integer code;

  @JsonProperty("name")
  private String name;

  @JsonProperty("terminal")
  private String terminal;

  public ExternalApplication code(Integer code) {
    this.code = code;
    return this;
  }

  /**
   * Código de la aplicación.
   * minimum: 0
   * @return code
  */
  @ApiModelProperty(value = "Código de la aplicación.")

@Min(0)
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public ExternalApplication name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Nombre de la aplicación externa.
   * @return name
  */
  @ApiModelProperty(value = "Nombre de la aplicación externa.")

@Size(min=1,max=24) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ExternalApplication terminal(String terminal) {
    this.terminal = terminal;
    return this;
  }

  /**
   * Terminal desde donde se conecta la aplicación.
   * @return terminal
  */
  @ApiModelProperty(value = "Terminal desde donde se conecta la aplicación.")

@Size(min=1,max=10) 
  public String getTerminal() {
    return terminal;
  }

  public void setTerminal(String terminal) {
    this.terminal = terminal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalApplication externalApplication = (ExternalApplication) o;
    return Objects.equals(this.code, externalApplication.code) &&
        Objects.equals(this.name, externalApplication.name) &&
        Objects.equals(this.terminal, externalApplication.terminal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, terminal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalApplication {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
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

