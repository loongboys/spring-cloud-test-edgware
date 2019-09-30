package com.common.config.swagger;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@PropertySource(value={"swagger-config.yml"},encoding = "utf-8")
public class SwaggerConfig {

    @Value("${title}")
    private String title;

    @Value("${description}")
    private String description;
    @Value("${version}")
    private String version;
    @Value("${basePackage}")
    private String basePackage;
    @Value("${swaggerShow}")
    private String swaggerShow;

    @Bean
    public Docket newsApi() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        docket.enable(Boolean.parseBoolean(swaggerShow));
        docket.apiInfo(apiInfo()).select().apis(RequestHandlerSelectors.basePackage(basePackage)).paths(PathSelectors.any()).build();
        return docket;
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(title)
                .description(description)
                .termsOfServiceUrl("http://www.huarun.com")
                .version(version)
                .build();
    }
}