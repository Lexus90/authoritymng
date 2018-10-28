package com.cw.authoritymng.web.filter;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author caowei E-mail:18801796602@163.com on 2018/10/28
 * @version v1.0
 */
public class CrossOriginFilter extends OncePerRequestFilter{
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String origin = request.getHeader("Origin");
        if (StringUtils.isNotBlank(origin)) {
            response.addHeader("Access-Control-Allow-Origin", origin);
        }
        response.addHeader("Access-Control-Allow-Method", "*");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        response.addHeader("Access-Control-Allow-Credentials", "true");
        response.addHeader("Access-Control-Max-Age", "3600");
        filterChain.doFilter(request, response);

    }
}
