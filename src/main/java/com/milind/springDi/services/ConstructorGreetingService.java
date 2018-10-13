package com.milind.springDi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService{
    @Override
    public String sayGreetings() {
        return "Hello - I am a constructor greeting service . . .";
    }
}
