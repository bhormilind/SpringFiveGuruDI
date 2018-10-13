package com.milind.springDi.controller;

import com.milind.springDi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    @Autowired
    private GreetingService greetingService;

    public void sayHello(){
        System.out.println("\n Hello . . .");
        System.out.println(greetingService.sayGreetings());
    }
}
