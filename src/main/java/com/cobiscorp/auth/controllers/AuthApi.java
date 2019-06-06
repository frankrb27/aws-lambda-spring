/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.0.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.cobiscorp.auth.controllers;

import java.util.Optional;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.NativeWebRequest;

import com.cobiscorp.auth.domain.AuthenticationPSTRq;
import com.cobiscorp.auth.domain.AuthenticationPSTRs;
import com.cobiscorp.auth.domain.AuthorizationPSTByRoleRq;
import com.cobiscorp.auth.domain.AuthorizationPSTByRoleRs;
import com.cobiscorp.auth.domain.Branch;
import com.cobiscorp.auth.domain.ErrorResponse;
import com.cobiscorp.auth.domain.LinkDetail;
import com.cobiscorp.auth.domain.Links;
import com.cobiscorp.auth.domain.Role;
import com.cobiscorp.auth.domain.Subsidiary;
import com.cobiscorp.auth.domain.TrustRelationshipPSTByApplicationRq;
import com.cobiscorp.auth.domain.TrustRelationshipPSTByApplicationRs;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-06-06T14:33:14.360-05:00[America/Bogota]")

@Validated
@Api(value = "auth", description = "the auth API")
public interface AuthApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "Proceso de autenticación de usuarios COBIS.", nickname = "authenticationPSTByClerk", notes = "Retorna información de los roles de ese usuario para el proceso de autorización y el JWT.", response = AuthenticationPSTRs.class, tags={ "Authentication", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Se ha autenticado exitosamente.", response = AuthenticationPSTRs.class),
        @ApiResponse(code = 400, message = "El mensaje de solicitud no se encuentra debidamente formateado.", response = ErrorResponse.class),
        @ApiResponse(code = 401, message = "No se encuentra autorizado para ejecutar la operación.", response = ErrorResponse.class),
        @ApiResponse(code = 403, message = "La solicitud ha sido denegada.", response = ErrorResponse.class),
        @ApiResponse(code = 404, message = "El objeto no fue encontrado.", response = ErrorResponse.class),
        @ApiResponse(code = 405, message = "La operación (método, ej: GET, POST, etc.) que se trata de ejecutar no se encuentra soportado para el contexto.", response = ErrorResponse.class),
        @ApiResponse(code = 406, message = "La solicitud no fue aceptada.", response = ErrorResponse.class),
        @ApiResponse(code = 429, message = "Se ha realizado la solicitud más de una vez.", response = ErrorResponse.class),
        @ApiResponse(code = 500, message = "Se presentó un error durante el procesamiento de la solicitud.", response = ErrorResponse.class) })
    @RequestMapping(value = "/auth/authentication",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<AuthenticationPSTRs> authenticationPSTByClerk(@ApiParam(value = "JSON Web Token (JWT) entregado al usuario en la autenticación" ,required=true) @RequestHeader(value="X-Authorization", required=true) String xAuthorization,@ApiParam(value = "Identificación única de la solicitud o petición" ,required=true) @RequestHeader(value="X-Request-ID", required=true) UUID xRequestID,@ApiParam(value = "Login de usuario en la aplicación de front-end que realiza la petición" ,required=true) @RequestHeader(value="X-EndUser-Login", required=true) String xEndUserLogin,@ApiParam(value = "Fecha y hora en la que se originó la solicitud o petición por el usuario en la aplicación de front-end" ,required=true) @RequestHeader(value="X-EndUser-RequestDateTime", required=true) java.lang.String xEndUserRequestDateTime,@ApiParam(value = "Terminal (IP, número de teléfono, o identificador del dispositivo) desde el cual se originó la solicitud o petición por el usuario en la aplicación de front-end" ,required=true) @RequestHeader(value="X-EndUser-Terminal", required=true) String xEndUserTerminal,@ApiParam(value = "Información de autenticación del funcionario." ,required=true )  @Valid @RequestBody AuthenticationPSTRq authenticationPSTRq,@ApiParam(value = "ID del banco o entidad financiera que provee el servicio de cuentas de ahorros" ) @RequestHeader(value="X-Financial-ID", required=false) String xFinancialID,@ApiParam(value = "Fecha y hora del último logueo del usuario en la aplicación" ) @RequestHeader(value="X-EndUser-LastLoggedDateTime", required=false) java.lang.String xEndUserLastLoggedDateTime) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"roles\" : [ \"\", \"\" ],  \"Links\" : \"\"}");
                    break;
                }
            }
        });
        AuthenticationPSTRs authenticationPSTRs = new AuthenticationPSTRs();
        //Roles
        Role rol1 = new Role();
        Role rol2 = new Role();
        Role rol3 = new Role();
        Subsidiary subsidiary = new Subsidiary();
        subsidiary.setCode(99);
        Branch branch = new Branch();
        branch.setCode(1);        
        rol1.setCode(1);
        rol1.description("CONSULTA");
        rol1.setSubsidiary(subsidiary);
        rol1.setBranch(branch);
        rol2.setCode(1);
        rol2.description("ASESOR");
        rol2.setSubsidiary(subsidiary);
        rol2.setBranch(branch);
        rol3.setCode(1);
        rol3.description("OPERACIONES");
        rol3.setSubsidiary(subsidiary);
        rol3.setBranch(branch);
        //Links
        LinkDetail detail = new LinkDetail();
        detail.setHref("/auth/authorization/");
        detail.setRel("Authorization");
        detail.setType("POST");
        Links links = new Links();
        links.setSelf("/auth/authentication");
        links.addNavsItem(detail);
        
        authenticationPSTRs.setLinks(links);
        authenticationPSTRs.addRolesItem(rol1);
        authenticationPSTRs.addRolesItem(rol2);
        authenticationPSTRs.addRolesItem(rol3);
        
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("X-Authorization","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjb2RlIjoiMTc4IiwibmFtZSI6IkFJREEgTElTU0VUVEUgVE9SUkVTIFJFWU5BIn0.znLhu5TrKdQ94vm0pFHks27LQBdwceLScE88b0jqqSI");
        
        return new ResponseEntity<AuthenticationPSTRs>(authenticationPSTRs, responseHeaders, HttpStatus.CREATED);

    }


    @ApiOperation(value = "Proceso de cierre de sesión de usuarios COBIS.", nickname = "authorizationGETLogout", notes = "", tags={ "Authorization", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "El proceso de cierre de la sesión se ha realizado con éxito."),
        @ApiResponse(code = 400, message = "El mensaje de solicitud no se encuentra debidamente formateado.", response = ErrorResponse.class),
        @ApiResponse(code = 401, message = "No se encuentra autorizado para ejecutar la operación.", response = ErrorResponse.class),
        @ApiResponse(code = 403, message = "La solicitud ha sido denegada.", response = ErrorResponse.class),
        @ApiResponse(code = 404, message = "El objeto no fue encontrado.", response = ErrorResponse.class),
        @ApiResponse(code = 405, message = "La operación (método, ej: GET, POST, etc.) que se trata de ejecutar no se encuentra soportado para el contexto.", response = ErrorResponse.class),
        @ApiResponse(code = 406, message = "La solicitud no fue aceptada.", response = ErrorResponse.class),
        @ApiResponse(code = 429, message = "Se ha realizado la solicitud más de una vez.", response = ErrorResponse.class),
        @ApiResponse(code = 500, message = "Se presentó un error durante el procesamiento de la solicitud.", response = ErrorResponse.class) })
    @RequestMapping(value = "/auth/authorization/logout",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Void> authorizationGETLogout(@ApiParam(value = "JSON Web Token (JWT) entregado al usuario en la autenticación" ,required=true) @RequestHeader(value="X-Authorization", required=true) String xAuthorization,@ApiParam(value = "Identificación única de la solicitud o petición" ,required=true) @RequestHeader(value="X-Request-ID", required=true) UUID xRequestID,@ApiParam(value = "Login de usuario en la aplicación de front-end que realiza la petición" ,required=true) @RequestHeader(value="X-EndUser-Login", required=true) String xEndUserLogin,@ApiParam(value = "Fecha y hora en la que se originó la solicitud o petición por el usuario en la aplicación de front-end" ,required=true) @RequestHeader(value="X-EndUser-RequestDateTime", required=true) java.lang.String xEndUserRequestDateTime,@ApiParam(value = "Terminal (IP, número de teléfono, o identificador del dispositivo) desde el cual se originó la solicitud o petición por el usuario en la aplicación de front-end" ,required=true) @RequestHeader(value="X-EndUser-Terminal", required=true) String xEndUserTerminal,@ApiParam(value = "ID del banco o entidad financiera que provee el servicio de cuentas de ahorros" ) @RequestHeader(value="X-Financial-ID", required=false) String xFinancialID,@ApiParam(value = "Fecha y hora del último logueo del usuario en la aplicación" ) @RequestHeader(value="X-EndUser-LastLoggedDateTime", required=false) java.lang.String xEndUserLastLoggedDateTime) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "Proceso de autorización de usuarios COBIS.", nickname = "authorizationPSTByRole", notes = "Retorna JWT.", response = AuthorizationPSTByRoleRs.class, tags={ "Authorization", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "El proceso de autorización se ha realizado con éxito.", response = AuthorizationPSTByRoleRs.class),
        @ApiResponse(code = 400, message = "El mensaje de solicitud no se encuentra debidamente formateado.", response = ErrorResponse.class),
        @ApiResponse(code = 401, message = "No se encuentra autorizado para ejecutar la operación.", response = ErrorResponse.class),
        @ApiResponse(code = 403, message = "La solicitud ha sido denegada.", response = ErrorResponse.class),
        @ApiResponse(code = 404, message = "El objeto no fue encontrado.", response = ErrorResponse.class),
        @ApiResponse(code = 405, message = "La operación (método, ej: GET, POST, etc.) que se trata de ejecutar no se encuentra soportado para el contexto.", response = ErrorResponse.class),
        @ApiResponse(code = 406, message = "La solicitud no fue aceptada.", response = ErrorResponse.class),
        @ApiResponse(code = 429, message = "Se ha realizado la solicitud más de una vez.", response = ErrorResponse.class),
        @ApiResponse(code = 500, message = "Se presentó un error durante el procesamiento de la solicitud.", response = ErrorResponse.class) })
    @RequestMapping(value = "/auth/authorization",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<AuthorizationPSTByRoleRs> authorizationPSTByRole(@ApiParam(value = "JSON Web Token (JWT) entregado al usuario en la autenticación" ,required=true) @RequestHeader(value="X-Authorization", required=true) String xAuthorization,@ApiParam(value = "Identificación única de la solicitud o petición" ,required=true) @RequestHeader(value="X-Request-ID", required=true) UUID xRequestID,@ApiParam(value = "Login de usuario en la aplicación de front-end que realiza la petición" ,required=true) @RequestHeader(value="X-EndUser-Login", required=true) String xEndUserLogin,@ApiParam(value = "Fecha y hora en la que se originó la solicitud o petición por el usuario en la aplicación de front-end" ,required=true) @RequestHeader(value="X-EndUser-RequestDateTime", required=true) java.lang.String xEndUserRequestDateTime,@ApiParam(value = "Terminal (IP, número de teléfono, o identificador del dispositivo) desde el cual se originó la solicitud o petición por el usuario en la aplicación de front-end" ,required=true) @RequestHeader(value="X-EndUser-Terminal", required=true) String xEndUserTerminal,@ApiParam(value = "Información de autenticación del funcionario." ,required=true )  @Valid @RequestBody AuthorizationPSTByRoleRq authorizationPSTByRoleRq,@ApiParam(value = "ID del banco o entidad financiera que provee el servicio de cuentas de ahorros" ) @RequestHeader(value="X-Financial-ID", required=false) String xFinancialID,@ApiParam(value = "Fecha y hora del último logueo del usuario en la aplicación" ) @RequestHeader(value="X-EndUser-LastLoggedDateTime", required=false) java.lang.String xEndUserLastLoggedDateTime) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"Links\" : {    \"Last\" : \"http://example.com/aeiou\",    \"Navs\" : [ {      \"rel\" : \"rel\",      \"href\" : \"http://example.com/aeiou\",      \"type\" : \"type\"    }, {      \"rel\" : \"rel\",      \"href\" : \"http://example.com/aeiou\",      \"type\" : \"type\"    } ],    \"Prev\" : \"http://example.com/aeiou\",    \"Next\" : \"http://example.com/aeiou\",    \"Self\" : \"http://example.com/aeiou\",    \"First\" : \"http://example.com/aeiou\"  }}");
                    break;
                }
            }
        });
        AuthorizationPSTByRoleRs authorizationPSTByRoleRs = new AuthorizationPSTByRoleRs();
        //Links
        Links links = new Links();
        links.setSelf("/auth/authorization");
        authorizationPSTByRoleRs.setLinks(links);
        
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("X-Authorization","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJjb2RlIjoiMTc4IiwibmFtZSI6IkFJREEgTElTU0VUVEUgVE9SUkVTIFJFWU5BIiwicm9sZSI6eyJjb2RlIjo0fX0.UU4mIYV3QIPPUTiwxc26p0KRa3fFFw3dkDUDT6CVlt8");
        
        return new ResponseEntity<AuthorizationPSTByRoleRs>(authorizationPSTByRoleRs, responseHeaders, HttpStatus.CREATED);

    }


    @ApiOperation(value = "Proceso de relación de confianza de aplicación con COBIS.", nickname = "trustRelationshipPSTByApplication", notes = "Retorna JWT.", response = TrustRelationshipPSTByApplicationRs.class, tags={ "TrustRelationship", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Proceso de relación de confianza realizado con éxito.", response = TrustRelationshipPSTByApplicationRs.class),
        @ApiResponse(code = 400, message = "El mensaje de solicitud no se encuentra debidamente formateado.", response = ErrorResponse.class),
        @ApiResponse(code = 401, message = "No se encuentra autorizado para ejecutar la operación.", response = ErrorResponse.class),
        @ApiResponse(code = 403, message = "La solicitud ha sido denegada.", response = ErrorResponse.class),
        @ApiResponse(code = 404, message = "El objeto no fue encontrado.", response = ErrorResponse.class),
        @ApiResponse(code = 405, message = "La operación (método, ej: GET, POST, etc.) que se trata de ejecutar no se encuentra soportado para el contexto.", response = ErrorResponse.class),
        @ApiResponse(code = 406, message = "La solicitud no fue aceptada.", response = ErrorResponse.class),
        @ApiResponse(code = 429, message = "Se ha realizado la solicitud más de una vez.", response = ErrorResponse.class),
        @ApiResponse(code = 500, message = "Se presentó un error durante el procesamiento de la solicitud.", response = ErrorResponse.class) })
    @RequestMapping(value = "/auth/trustrelationship",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<TrustRelationshipPSTByApplicationRs> trustRelationshipPSTByApplication(@ApiParam(value = "JSON Web Token (JWT) entregado al usuario en la autenticación" ,required=true) @RequestHeader(value="X-Authorization", required=true) String xAuthorization,@ApiParam(value = "Identificación única de la solicitud o petición" ,required=true) @RequestHeader(value="X-Request-ID", required=true) UUID xRequestID,@ApiParam(value = "Login de usuario en la aplicación de front-end que realiza la petición" ,required=true) @RequestHeader(value="X-EndUser-Login", required=true) String xEndUserLogin,@ApiParam(value = "Fecha y hora en la que se originó la solicitud o petición por el usuario en la aplicación de front-end" ,required=true) @RequestHeader(value="X-EndUser-RequestDateTime", required=true) java.lang.String xEndUserRequestDateTime,@ApiParam(value = "Terminal (IP, número de teléfono, o identificador del dispositivo) desde el cual se originó la solicitud o petición por el usuario en la aplicación de front-end" ,required=true) @RequestHeader(value="X-EndUser-Terminal", required=true) String xEndUserTerminal,@ApiParam(value = "Información de confianza de la aplicación." ,required=true )  @Valid @RequestBody TrustRelationshipPSTByApplicationRq trustRelationshipPSTByApplicationRq,@ApiParam(value = "ID del banco o entidad financiera que provee el servicio de cuentas de ahorros" ) @RequestHeader(value="X-Financial-ID", required=false) String xFinancialID,@ApiParam(value = "Fecha y hora del último logueo del usuario en la aplicación" ) @RequestHeader(value="X-EndUser-LastLoggedDateTime", required=false) java.lang.String xEndUserLastLoggedDateTime) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"Links\" : \"\"}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}