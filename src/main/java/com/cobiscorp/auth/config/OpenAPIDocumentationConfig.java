package com.cobiscorp.auth.config;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.expression.ParseException;
import org.springframework.format.Formatter;
import org.springframework.web.util.UriComponentsBuilder;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.paths.Paths;
import springfox.documentation.spring.web.paths.RelativePathProvider;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-06-06T10:06:49.620-05:00[America/Bogota]")

@Configuration
@EnableSwagger2
public class OpenAPIDocumentationConfig {

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("COBIS API Autenticación")
            .description("Este es el API del sistema de autenticación y autorización del Core Banking System. Se encuentran definidos los servicios esenciales para procesos de autenticación y autorización. Puedes conseguir mas información en nuestra sitio web: [http://www.cobiscorp.com](http://www.cobiscorp.com).")
            .license("COBIS API License")
            .licenseUrl("http://www.cobiscorp.com/licenses/LICENSE-1.0.html")
            .termsOfServiceUrl("http://www.cobiscorp.com/contact-us/customer-technical-support/")
            .version("1.0.0")
            .contact(new Contact("","", "support.center@cobiscorp.com"))
            .build();
    }

    @Bean
    public Docket customImplementation(ServletContext servletContext, @Value("${openapi.cOBISAPIAutenticacin.base-path:/eliashel/TMPAPI/1.0.0}") String basePath) {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                    .apis(RequestHandlerSelectors.basePackage("com.cobiscorp.auth.controllers"))
                    .build()
                .pathProvider(new BasePathAwareRelativePathProvider(servletContext, basePath))
                .directModelSubstitute(java.time.LocalDate.class, java.sql.Date.class)
                .directModelSubstitute(java.time.OffsetDateTime.class, java.util.Date.class)
                .apiInfo(apiInfo());
    }
    
    @Bean
    public Formatter<OffsetDateTime> localDateFormatter() {
      return new Formatter<OffsetDateTime>() {
        @Override
        public OffsetDateTime parse(String text, Locale locale) throws ParseException {
          return OffsetDateTime.parse(text, DateTimeFormatter.ISO_DATE_TIME);
        }
     
        @Override
        public String print(OffsetDateTime object, Locale locale) {
          return DateTimeFormatter.ISO_DATE_TIME.format(object);
        }
      };
    }  
    
    class BasePathAwareRelativePathProvider extends RelativePathProvider {
        private String basePath;

        public BasePathAwareRelativePathProvider(ServletContext servletContext, String basePath) {
            super(servletContext);
            this.basePath = basePath;
        }

        @Override
        protected String applicationPath() {
            return  Paths.removeAdjacentForwardSlashes(UriComponentsBuilder.fromPath(super.applicationPath()).path(basePath).build().toString());
        }

        @Override
        public String getOperationPath(String operationPath) {
            UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromPath("/");
            return Paths.removeAdjacentForwardSlashes(
                    uriComponentsBuilder.path(operationPath.replaceFirst("^" + basePath, "")).build().toString());
        }
    }

}
