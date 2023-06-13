package com.narenkg.GCPHelloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/narenkg")
public class HelloController {

    @GetMapping("/hello")
    public String getMessage()
    {
        return "Hello World!";
    }
}
