package com.cw.authoritymng.web;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

import java.time.Duration;

/**
 * @author caowei E-mail:18801796602@163.com on 2018/10/31
 * @version v1.0
 */

//@Configuration
public class WebConfig {

}
//        extends WebMvcAutoConfiguration {
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//
//        if (!registry.hasMappingForPattern("/web/**")) {
//            registry.addResourceHandler("/web/**")
//                    .addResourceLocations("classpath:/resources/static");
//        }
//
//    }
//
//}
