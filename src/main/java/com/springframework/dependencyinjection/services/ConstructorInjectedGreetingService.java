package com.springframework.dependencyinjection.services;

import org.springframework.stereotype.Service;

public class ConstructorInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World! - Constructor";
    }
}
