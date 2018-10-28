package com.cw.authoritymng.service;

import com.cw.authoritymng.dao.model.AmUser;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import java.util.List;

@Slf4j
@SpringBootTest
@ComponentScan(basePackages = {"com.cw.authoritymng"})
@MapperScan("com.cw.authoritymng.dao.mapper")
@PropertySource("classpath:*.yml")
public class AmUserServiceTest {

    @Autowired
    AmUserService amUserService;

    @Test
    public void addUser() throws Exception {

        AmUser amUser = new AmUser();
        amUser.setUserName("曹伟");
        amUser.setUserCode("caowei");
        amUserService.addUser(amUser);
        amUser.setUserName("曹伟1");
        amUser.setUserCode("caowei2");
        amUserService.addUser(amUser);
    }

    @Test
    public void listAllUser() throws Exception {

        List<AmUser> list = amUserService.listPage(new AmUser(), 0, 10);
        log.info("list = {}", list);
    }

}
