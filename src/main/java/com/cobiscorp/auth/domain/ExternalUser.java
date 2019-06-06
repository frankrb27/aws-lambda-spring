package com.cobiscorp.auth.domain;

import java.util.Objects;
import com.cobiscorp.auth.domain.ExternalApplication;
import com.cobiscorp.auth.domain.Role;
import com.cobiscorp.auth.domain.Trustrelationship;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Usuario externo para aplicación que se conecta al core COBIS.
 */
@ApiModel(description = "Usuario externo para aplicación que se conecta al core COBIS.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-06-06T14:33:14.360-05:00[America/Bogota]")

public class ExternalUser   {
  @JsonProperty("externalApplication")
  private ExternalApplication externalApplication = null;

  @JsonProperty("user")
  private String user;

  @JsonProperty("role")
  private Role role = null;

  @JsonProperty("trustrelationship")
  private Trustrelationship trustrelationship = null;

  public ExternalUser externalApplication(ExternalApplication externalApplication) {
    this.externalApplication = externalApplication;
    return this;
  }

  /**
   * Get externalApplication
   * @return externalApplication
  */
  @ApiModelProperty(value = "")

  @Valid

  public ExternalApplication getExternalApplication() {
    return externalApplication;
  }

  public void setExternalApplication(ExternalApplication externalApplication) {
    this.externalApplication = externalApplication;
  }

  public ExternalUser user(String user) {
    this.user = user;
    return this;
  }

  /**
   * Usuario externo.
   * @return user
  */
  @ApiModelProperty(value = "Usuario externo.")

@Size(max=30) 
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public ExternalUser role(Role role) {
    this.role = role;
    return this;
  }

  /**
   * Get role
   * @return role
  */
  @ApiModelProperty(value = "")

  @Valid

  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  public ExternalUser trustrelationship(Trustrelationship trustrelationship) {
    this.trustrelationship = trustrelationship;
    return this;
  }

  /**
   * Get trustrelationship
   * @return trustrelationship
  */
  @ApiModelProperty(value = "")

  @Valid

  public Trustrelationship getTrustrelationship() {
    return trustrelationship;
  }

  public void setTrustrelationship(Trustrelationship trustrelationship) {
    this.trustrelationship = trustrelationship;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalUser externalUser = (ExternalUser) o;
    return Objects.equals(this.externalApplication, externalUser.externalApplication) &&
        Objects.equals(this.user, externalUser.user) &&
        Objects.equals(this.role, externalUser.role) &&
        Objects.equals(this.trustrelationship, externalUser.trustrelationship);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalApplication, user, role, trustrelationship);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalUser {\n");
    
    sb.append("    externalApplication: ").append(toIndentedString(externalApplication)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    trustrelationship: ").append(toIndentedString(trustrelationship)).append("\n");
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

