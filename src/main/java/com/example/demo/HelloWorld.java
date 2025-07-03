package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@Controller
public class HelloWorld {
    @GetMapping("/h")
    public String hello(){
        System.out.println("Hello World");
        return "hello floks, Welcome to springboot ";
    }
}
