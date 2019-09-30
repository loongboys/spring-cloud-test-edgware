package com.service.zuul.fallback;

import org.springframework.cloud.netflix.zuul.filters.route.ZuulFallbackProvider;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

/**
 * 处理熔断信息
 */
@Component
public class TestFallback implements ZuulFallbackProvider{
    @Override
    public String getRoute() {
        System.out.println("getRoute---------------------------------------------");
        return null;
    }

    @Override
    public ClientHttpResponse fallbackResponse() {
        System.out.println("fallbackResponse---------------------------------------------");
        return null;
    }
}
