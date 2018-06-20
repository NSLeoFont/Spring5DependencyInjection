package com.leofont.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_PEOPLE = "Hello Gurus!!!";

    @Override
    public String sayGreeting() {
        return HELLO_PEOPLE;
    }
}
