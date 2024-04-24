package rest;

import com.helloSpring.com.HelloSpring.interfaces.Coach;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class InjectionController {

    private final Coach myCoach;
    // using constructor injection
    @Autowired
    public InjectionController(Coach myCoach) {
        this.myCoach = myCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        log.info("injected dailyworkout controller");
        return myCoach.getDailyWorkout();
    }
    /*
        this is constructor injection, similar to
        Coach theCoach = new InjectionController(theCoach)
    */
}