package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController  {

//    @Value("${cupSize}")
//    private String  cupSize;
//
//    @Value("${age}")
//    private String age;
//
//
//    @Value("${content}")
//    private String content;

    @RequestMapping(value = "/hello",method =RequestMethod.GET )
    public String say()
    {
        return "hello";
    }
}
