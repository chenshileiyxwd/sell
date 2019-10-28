package com.imooc.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName LoginFilter
 * @Description TODO
 * @Author mrleier
 * @Date 2019/10/28 23:20
 * @Version 1.0
 **/
@WebFilter(urlPatterns = "/index/*", filterName = "loginFilter")
public class LoginFilter implements Filter {
    /**
     * 容器加载的时候被调用
     * @param filterConfig
     * @throws ServletException
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init loginFilter");
    }

    /**
     * 容器销毁的时候调用
     */
    @Override
    public void destroy() {
        System.out.println("destory loginFilter");
    }

    /**
     * 请求被拦截的时候调用
     * @param servletRequest
     * @param servletResponse
     * @param filterChain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("doFilter loginFilter");
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;
        String username = req.getParameter("username");
        if ("csl".equals(username)) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            return ;
        }
    }
}
