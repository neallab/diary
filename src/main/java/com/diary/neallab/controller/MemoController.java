package com.diary.neallab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemoController {

    @RequestMapping("/hello")
    public @ResponseBody
    String hello() {
        return "Hello, Spring Boot!";
    }

}
