package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class MyController {
    @RequestMapping(value = "/some.do")
    private ModelAndView doSome() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("nums", "你好");
//        mv.setViewName("/WEB-INF/view/show.jsp");
        mv.setViewName("show");
        return mv;


    }
}
