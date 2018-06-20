package com.leofont.didemo.controllers;

import com.leofont.didemo.services.GreetingService;
import com.leofont.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    // LF - This just to demo what NOT TO DO!!!
    // Is an example of wrong style!!!

    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingServiceImpl;
    // This doesn't require qualifier because Spring uses the name doing reflection to
    // find the corresponding service bean. It´s better to use qualifier to better
    // express intent.
    // If I put the Qualifier annotation it will override it.

    public String sayHello() {

        return greetingServiceImpl.sayGreeting();
    }

}
