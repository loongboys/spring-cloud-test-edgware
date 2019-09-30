package com.service.zuul.config;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.List;

@Component
@Primary
public class DocumentationConfig implements SwaggerResourcesProvider {
    @Override
    public List<SwaggerResource> get() {
        List resources = new ArrayList<>();
        resources.add(swaggerResource("默认", "/v2/api-docs", "2.0"));
//        resources.add(swaggerResource("ID生成中心", "/id/v2/api-docs", "2.0"));
//        resources.add(swaggerResource("用户服务中心", "/user/v2/api-docs", "2.0"));
        resources.add(swaggerResource("ID生成中心", "/id/id/v2/api-docs", "2.0"));
        resources.add(swaggerResource("用户服务中心", "/user/user/v2/api-docs", "2.0"));
        return resources;
    }

    private SwaggerResource swaggerResource(String name, String location, String version) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(location);
        swaggerResource.setSwaggerVersion(version);
        return swaggerResource;
    }
}
