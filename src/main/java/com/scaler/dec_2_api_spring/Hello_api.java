package com.scaler.dec_2_api_spring;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello_api {

    @RequestMapping(value = "/Hello",method= RequestMethod.GET)
    public String hello() {
        return "Hello, Mohit Vats";
    }
    @RequestMapping(value = "/Hello1/{name}",method= RequestMethod.GET)
    public String hello(@PathVariable("name") String name) {
        return "Hello, "+name;
    }
}
