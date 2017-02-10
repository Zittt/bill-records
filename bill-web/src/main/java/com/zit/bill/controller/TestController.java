package com.zit.bill.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by zwj9044 on 2017/2/9.
 */
@Controller
public class TestController {
    private static final Logger _LOG = LoggerFactory.getLogger(TestController.class);

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView testPage(HttpServletRequest request, HttpServletResponse response,
            ModelAndView mv) {

        return mv;
    }

}
