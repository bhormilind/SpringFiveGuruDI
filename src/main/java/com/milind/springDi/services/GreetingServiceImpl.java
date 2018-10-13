package com.milind.springDi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class GreetingServiceImpl implements GreetingService {

    public static String HELLO_MILIND = "Hello Milind";

    @Override
    public String sayGreetings() {
        return HELLO_MILIND;
    }
}
