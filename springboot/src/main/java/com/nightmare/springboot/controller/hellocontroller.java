package com.nightmare.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroller {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String helloWorld(){
        return "Hello World! 231  1!";
    }
}
