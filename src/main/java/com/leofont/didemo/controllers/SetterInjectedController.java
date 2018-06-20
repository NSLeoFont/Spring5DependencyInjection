package com.leofont.didemo.controllers;

import com.leofont.didemo.services.GreetingServiceImpl;

public class SetterInjectedController {

    // LF - Still not the optimal option, we are injecting concrete implementation

    private GreetingServiceImpl greetingService;

    String sayHello() {
        return  greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingServiceImpl greetingService) {
        this.greetingService = greetingService;
    }
}
