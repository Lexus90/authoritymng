package com.cw.authoritymng.web.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.tuckey.web.filters.urlrewrite.UrlRewriteFilter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author caowei E-mail:18801796602@163.com on 2018/11/1
 * @version v1.0
 */
//extends OncePerRequestFilter
@Configuration
public class ReactUrlRewriteFilter  {
    @Bean
    public FilterRegistrationBean urlRewrite(){
        UrlRewriteFilter rewriteFilter=new UrlRewriteFilter();
        FilterRegistrationBean registration = new FilterRegistrationBean(rewriteFilter);
        registration.setUrlPatterns(Arrays.asList("/web/**"));
        Map initParam=new HashMap();
//        initParam.put("confPath","urlrewrite.xml");
        initParam.put("modRewriteConfText","RewriteRule ^/web|web/** |web/users index.html [L]");
        initParam.put("infoLevel","INFO");
        registration.setInitParameters(initParam);
        return  registration;
    }

//    @Override
//    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
//        String path = httpServletRequest.getServletPath();
//        System.out.println("path = " + path);
//        if (path.startsWith("web") || path.startsWith("/web")) {
//            httpServletRequest.getRequestDispatcher("index.html").forward(httpServletRequest, httpServletResponse);
//        } else {
//            filterChain.doFilter(httpServletRequest, httpServletResponse);
//        }
//
//    }
}
