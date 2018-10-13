package com.milind.springDi.controller;

import com.milind.springDi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PropertyInjectController {

    //Even after not using @Qualifier annotation, Spring able to configure the bean becasue
    //greetingServiceImpl uses as a variable name ans spring uses reflection to set the bean

    //this reflection logic will be overloaded by @Primary

    //Another way is to use @Qualifier

    @Autowired
    private GreetingService greetingServiceImpl;

    public String sayHello(){

       return greetingServiceImpl.sayGreetings();
    }
}
