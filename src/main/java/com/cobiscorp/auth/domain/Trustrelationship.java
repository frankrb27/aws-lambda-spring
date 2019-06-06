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
 * Configuración de la relación de confianza para usuarios externos que se conectan al core COBIS.
 */
@ApiModel(description = "Configuración de la relación de confianza para usuarios externos que se conectan al core COBIS.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-06-06T14:33:14.360-05:00[America/Bogota]")

public class Trustrelationship   {
  @JsonProperty("code")
  private Integer code;

  @JsonProperty("relationshipCode")
  private Integer relationshipCode;

  @JsonProperty("server")
  private String server;

  @JsonProperty("sessionIdetification")
  private String sessionIdetification;

  @JsonProperty("ctsSession")
  private String ctsSession;

  public Trustrelationship code(Integer code) {
    this.code = code;
    return this;
  }

  /**
   * Código de la configuración de la relación de confianza.
   * minimum: 1
   * @return code
  */
  @ApiModelProperty(value = "Código de la configuración de la relación de confianza.")

@Min(1)
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public Trustrelationship relationshipCode(Integer relationshipCode) {
    this.relationshipCode = relationshipCode;
    return this;
  }

  /**
   * Código que relaciona la configuración de relación de confianza con el usuario y la aplicación externa.
   * minimum: 1
   * @return relationshipCode
  */
  @ApiModelProperty(value = "Código que relaciona la configuración de relación de confianza con el usuario y la aplicación externa.")

@Min(1)
  public Integer getRelationshipCode() {
    return relationshipCode;
  }

  public void setRelationshipCode(Integer relationshipCode) {
    this.relationshipCode = relationshipCode;
  }

  public Trustrelationship server(String server) {
    this.server = server;
    return this;
  }

  /**
   * Servidor CTS donde se genera la configuración de relación de confianza.
   * @return server
  */
  @ApiModelProperty(value = "Servidor CTS donde se genera la configuración de relación de confianza.")

@Size(min=1,max=30) 
  public String getServer() {
    return server;
  }

  public void setServer(String server) {
    this.server = server;
  }

  public Trustrelationship sessionIdetification(String sessionIdetification) {
    this.sessionIdetification = sessionIdetification;
    return this;
  }

  /**
   * Identificador de la sesión que se genera en CTS.
   * @return sessionIdetification
  */
  @ApiModelProperty(value = "Identificador de la sesión que se genera en CTS.")

@Size(min=1,max=24) 
  public String getSessionIdetification() {
    return sessionIdetification;
  }

  public void setSessionIdetification(String sessionIdetification) {
    this.sessionIdetification = sessionIdetification;
  }

  public Trustrelationship ctsSession(String ctsSession) {
    this.ctsSession = ctsSession;
    return this;
  }

  /**
   * Sesión generada en CTS.
   * @return ctsSession
  */
  @ApiModelProperty(value = "Sesión generada en CTS.")

@Size(min=1,max=51) 
  public String getCtsSession() {
    return ctsSession;
  }

  public void setCtsSession(String ctsSession) {
    this.ctsSession = ctsSession;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Trustrelationship trustrelationship = (Trustrelationship) o;
    return Objects.equals(this.code, trustrelationship.code) &&
        Objects.equals(this.relationshipCode, trustrelationship.relationshipCode) &&
        Objects.equals(this.server, trustrelationship.server) &&
        Objects.equals(this.sessionIdetification, trustrelationship.sessionIdetification) &&
        Objects.equals(this.ctsSession, trustrelationship.ctsSession);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, relationshipCode, server, sessionIdetification, ctsSession);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Trustrelationship {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    relationshipCode: ").append(toIndentedString(relationshipCode)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    sessionIdetification: ").append(toIndentedString(sessionIdetification)).append("\n");
    sb.append("    ctsSession: ").append(toIndentedString(ctsSession)).append("\n");
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

