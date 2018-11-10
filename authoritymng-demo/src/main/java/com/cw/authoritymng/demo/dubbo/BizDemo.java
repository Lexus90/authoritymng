package com.cw.authoritymng.demo.dubbo;

import lombok.extern.slf4j.Slf4j;

/**
 * @author caowei E-mail:18801796602@163.com on 2018/10/27
 * @version v1.0
 */

@Slf4j
public class BizDemo {
    public static void main(String[] args) {
//        LoggerFactory.getLogger(BizDemo.class);
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                new String[] { "classpath:dubbo/dubbo-consumer.xml" });
//        context.start();
//        AmUserFacade service = (AmUserFacade) context.getBean("amUserFacade");
//        AmUserDTO amUserDTO = new AmUserDTO();
//        for (int i =0; i <20; i++) {
//            amUserDTO.setUserCode("caowei4"+i);
//            amUserDTO.setUserName("曹伟4"+i);
//            amUserDTO.setCreateTime(new Date());
//            amUserDTO.setUpdateTime(new Date());
//
//            Response<Boolean> resp = service.add(amUserDTO);
//            log.info("resp = {}", resp.getMessage());
//
//            log.info("userList = {}", service.listPage(amUserDTO, 0, 10).getData());
//        }
//
        log.info("args = {}", "abc");

    }

}
