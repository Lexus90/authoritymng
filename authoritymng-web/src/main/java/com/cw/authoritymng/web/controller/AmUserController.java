package com.cw.authoritymng.web.controller;

import com.cw.authoritymng.facade.AmUserFacade;
import com.cw.authoritymng.facade.model.AmUserDTO;
import com.cw.authoritymng.facade.page.Page;
import com.cw.authoritymng.facade.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.websocket.server.PathParam;

@Controller
@RequestMapping(value = "/api/AmUser")
public class AmUserController {

    @Autowired
    private AmUserFacade amUserFacade;

    @ResponseBody
    @RequestMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
    public Response<Page<AmUserDTO>> findAllUser(@PathParam("userCode") String userCode, @PathVariable("pageNum") int current, @PathVariable("pageSize") int pageSize){
        AmUserDTO amUserDTO = new AmUserDTO();
        amUserDTO.setUserCode(userCode);
        return amUserFacade.listPage(amUserDTO, current, pageSize);
    }
}
