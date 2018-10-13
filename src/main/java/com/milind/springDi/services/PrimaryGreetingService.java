package com.milind.springDi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
@Primary
public class PrimaryGreetingService implements GreetingService{


    @Override
    public String sayGreetings() {
        return "Primary Greeting Service -spanish version . . . ";
    }
}
