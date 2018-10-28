package com.cw.authoritymng.web.controller;

import com.cw.authoritymng.facade.AmUserFacade;
import com.cw.authoritymng.facade.model.AmUserDTO;
import com.cw.authoritymng.facade.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/api/AmUser")
public class AmUserController {

    @Autowired
    private AmUserFacade amUserFacade;

    @ResponseBody
    @RequestMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
    public Response<List<AmUserDTO>> findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
        return amUserFacade.listAll(pageNum,pageSize);
    }
}
