package rest;

import com.helloSpring.com.HelloSpring.interfaces.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InjectionController {

    @Autowired
    private Coach myCoach;


//    @Autowired //this annotation tell Spring to inject a dependency
//    public InjectionController(Coach theCoach) {
//        myCoach = theCoach;
//    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}