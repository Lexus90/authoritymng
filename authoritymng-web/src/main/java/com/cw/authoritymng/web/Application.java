package com.cw.authoritymng.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@MapperScan(value = {"com.cw.authoritymng.dao.mapper"})
@ComponentScan(basePackages = {"com.cw.authoritymng"})
@ImportResource(locations = "classpath*:dubbo/dubbo-provider.xml")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
