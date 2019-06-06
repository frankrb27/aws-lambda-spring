package com.cobiscorp.auth.domain;

import java.util.Objects;
import com.cobiscorp.auth.domain.Branch;
import com.cobiscorp.auth.domain.Subsidiary;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Rol de cliente funcionario de la entidad financiera.
 */
@ApiModel(description = "Rol de cliente funcionario de la entidad financiera.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-06-06T14:33:14.360-05:00[America/Bogota]")

public class Role   {
  @JsonProperty("code")
  private Integer code;

  @JsonProperty("subsidiary")
  private Subsidiary subsidiary = null;

  @JsonProperty("description")
  private String description;

  @JsonProperty("creationDate")
  private java.lang.String creationDate;

  @JsonProperty("lastUpdatedDate")
  private java.lang.String lastUpdatedDate;

  @JsonProperty("branch")
  private Branch branch = null;

  public Role code(Integer code) {
    this.code = code;
    return this;
  }

  /**
   * Código del rol de cliente.
   * minimum: 1
   * maximum: 255
   * @return code
  */
  @ApiModelProperty(value = "Código del rol de cliente.")

@Min(1) @Max(255) 
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public Role subsidiary(Subsidiary subsidiary) {
    this.subsidiary = subsidiary;
    return this;
  }

  /**
   * Get subsidiary
   * @return subsidiary
  */
  @ApiModelProperty(value = "")

  @Valid

  public Subsidiary getSubsidiary() {
    return subsidiary;
  }

  public void setSubsidiary(Subsidiary subsidiary) {
    this.subsidiary = subsidiary;
  }

  public Role description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Descripción del rol.
   * @return description
  */
  @ApiModelProperty(value = "Descripción del rol.")

@Size(max=64) 
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Role creationDate(java.lang.String creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Fecha de creación del rol.
   * @return creationDate
  */
  @ApiModelProperty(value = "Fecha de creación del rol.")

  @Valid

  public java.lang.String getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(java.lang.String creationDate) {
    this.creationDate = creationDate;
  }

  public Role lastUpdatedDate(java.lang.String lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
    return this;
  }

  /**
   * Fecha de última actualización del rol.
   * @return lastUpdatedDate
  */
  @ApiModelProperty(value = "Fecha de última actualización del rol.")

  @Valid

  public java.lang.String getLastUpdatedDate() {
    return lastUpdatedDate;
  }

  public void setLastUpdatedDate(java.lang.String lastUpdatedDate) {
    this.lastUpdatedDate = lastUpdatedDate;
  }

  public Role branch(Branch branch) {
    this.branch = branch;
    return this;
  }

  /**
   * Get branch
   * @return branch
  */
  @ApiModelProperty(value = "")

  @Valid

  public Branch getBranch() {
    return branch;
  }

  public void setBranch(Branch branch) {
    this.branch = branch;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Role role = (Role) o;
    return Objects.equals(this.code, role.code) &&
        Objects.equals(this.subsidiary, role.subsidiary) &&
        Objects.equals(this.description, role.description) &&
        Objects.equals(this.creationDate, role.creationDate) &&
        Objects.equals(this.lastUpdatedDate, role.lastUpdatedDate) &&
        Objects.equals(this.branch, role.branch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, subsidiary, description, creationDate, lastUpdatedDate, branch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Role {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    subsidiary: ").append(toIndentedString(subsidiary)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    lastUpdatedDate: ").append(toIndentedString(lastUpdatedDate)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
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

