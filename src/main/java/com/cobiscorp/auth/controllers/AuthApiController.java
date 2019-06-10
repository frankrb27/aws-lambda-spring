package com.cobiscorp.auth.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-06-06T10:06:49.620-05:00[America/Bogota]")

@Controller
@RequestMapping("${openapi.cOBISAPIAutenticacin.base-path:/eliashel/TMPAPI/1.0.0}")
public class AuthApiController implements AuthApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public AuthApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
