package com.cw.authoritymng.demo.dubbo;

import com.cw.authoritymng.facade.AmUserFacade;
import com.cw.authoritymng.facade.model.AmUserDTO;
import com.cw.authoritymng.facade.response.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * @author caowei E-mail:18801796602@163.com on 2018/10/27
 * @version v1.0
 */

@Slf4j
public class BizDemo {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "classpath:dubbo/dubbo-consumer.xml" });
        context.start();
        AmUserFacade service = (AmUserFacade) context.getBean("amUserFacade");
        AmUserDTO amUserDTO = new AmUserDTO();
        for (int i =0; i <20; i++) {
            amUserDTO.setUserCode("caowei4"+i);
            amUserDTO.setUserName("曹伟4"+i);
            amUserDTO.setCreateTime(new Date());
            amUserDTO.setUpdateTime(new Date());

            Response<Boolean> resp = service.add(amUserDTO);
            log.info("resp = {}", resp.getMessage());
            log.info("userList = {}", service.listAll(0, 10).getData());
        }
//

    }

}
