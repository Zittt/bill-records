package com.zit.bill.controller.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zwj9044 on 2017/9/15.
 */
@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/he")
    String home() {
        return "hello world!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Example.class, args);
    }
}
