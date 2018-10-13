package com.milind.springDi.services;

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingService implements GreetingService {

    @Override
    public String sayGreetings() {
        return "Hello - I am getter Greeting Service . . .";
    }
}
