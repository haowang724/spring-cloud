package com.cq.wh.cloudadminservice.api;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.invoke.MethodType;
import java.lang.reflect.Method;

@RestController
@RequestMapping("/rest")
public class HelloApi {
    @RequestMapping(method = RequestMethod.GET,value = "/hello")
    public String hello(String name){
        return "hello "+name;
    }
}
