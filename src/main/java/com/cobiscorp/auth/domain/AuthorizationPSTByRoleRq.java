package com.cobiscorp.auth.domain;

import java.util.Objects;
import com.cobiscorp.auth.domain.Role;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Autorización de usuarios por roles.
 */
@ApiModel(description = "Autorización de usuarios por roles.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-06-06T10:06:49.620-05:00[America/Bogota]")

public class AuthorizationPSTByRoleRq   {
  @JsonProperty("payload")
  private Role payload = null;

  public AuthorizationPSTByRoleRq payload(Role payload) {
    this.payload = payload;
    return this;
  }

  /**
   * Get payload
   * @return payload
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Role getPayload() {
    return payload;
  }

  public void setPayload(Role payload) {
    this.payload = payload;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorizationPSTByRoleRq authorizationPSTByRoleRq = (AuthorizationPSTByRoleRq) o;
    return Objects.equals(this.payload, authorizationPSTByRoleRq.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizationPSTByRoleRq {\n");
    
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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

