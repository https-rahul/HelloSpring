package rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//this is a controller
@RestController
public class FunRestController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello World, this is my first ever SpringBoot application";
    }

    @GetMapping("/workout")
    public String workout() {
        return "Go to Gym !";
    }

    @GetMapping("/testing")
    public String testing() {
        return "GThis is testing";
    }
}