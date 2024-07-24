package com.helloSpring.com.HelloSpring.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


//this is a controller
@Slf4j
@RestController
public class FunRestController {
    @GetMapping("/")
    public String sayHello() {
        log.info("default controller was called.");
        return "Hello World, this is my first ever Spring Boot application!";
    }

    @GetMapping("/workout")
    public String workout() {
        log.info("workout endpoint was called.");
        return "Go to Gym !";
    }

    @GetMapping("/testing")
    public String testing(@RequestBody String message) {
        log.info("testing endpoint was called.");
        return "The message is: " + message;
    }

    // Injecting custom application properties
    @Value("${agent.name}")
    private String agentName;

    @Value("${agent.type}")
    private String agentType;

    //creating endpoints for agent info
    @GetMapping("/agent")
    public String agent(){
        return "Agent: " +agentName +" Type: " +agentType;
    }

}