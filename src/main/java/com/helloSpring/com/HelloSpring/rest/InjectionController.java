package com.helloSpring.com.HelloSpring.rest;

import com.helloSpring.com.HelloSpring.interfaces.Coach;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class InjectionController {

    private Coach myCoach;

    @Autowired
    @GetMapping("/injection")
    public void setCoach (Coach setterCoach){
        myCoach = setterCoach;
    }
}