package com.itmayiedu.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Value;

import javax.servlet.http.HttpServletRequest;

/**
 * @author v_liwenyang
 */
public class TokenFilter extends ZuulFilter {
    @Value("${server.port}")
    private String serverPort;

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext currentContext = RequestContext.getCurrentContext();
        HttpServletRequest request = currentContext.getRequest();
        String userToken = request.getParameter("userToken");
        request.setAttribute("serverPort",serverPort);
        if (StringUtils.isEmpty(userToken)) {
            // 不会继续执行... 不会去调用服务接口，网关服务直接响应给客户端
            currentContext.setSendZuulResponse(false);
            currentContext.setResponseBody("userToken is null");
            currentContext.setResponseStatusCode(401);
            return null;
            // 返回一个错误提示
        }
        // 正常执行调用其他服务接口...
        System.out.println("网关执行端口号:" + serverPort);
        return null;
    }
}
