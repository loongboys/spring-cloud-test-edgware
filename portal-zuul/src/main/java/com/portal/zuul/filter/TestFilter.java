package com.portal.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

/**
 * 过滤器处理验证，参数处理
 */
@Component
public class TestFilter extends ZuulFilter {
    @Override
    public String filterType() {

        System.out.println("filterType---------------------------------------------");
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        System.out.println("filterOrder---------------------------------------------");
        return 0;
    }

    @Override
    public boolean shouldFilter() {

        System.out.println("shouldFilter---------------------------------------------");
        return true;//返回true执行run方法
    }

    @Override
    public Object run() {
        System.out.println("run---------------------------------------------");
        return null;
    }
}
