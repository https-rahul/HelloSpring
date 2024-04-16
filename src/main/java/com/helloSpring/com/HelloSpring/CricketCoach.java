package com.helloSpring.com.HelloSpring;

import com.helloSpring.com.HelloSpring.interfaces.Coach;
import org.springframework.stereotype.Component;

@Component // marks the class as Spring bean and available for dependency injection
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice daily";
    }
}
