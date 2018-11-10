package com.cw.authoritymng.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/web/**")
public class IndexController {

//    @RequestMapping(value="/**")
//    public String index(){
//        return "index";
//    }
//    @RequestMapping(value="/web/**")
    public ModelAndView index2(){
        return new ModelAndView("index");
    }
}
