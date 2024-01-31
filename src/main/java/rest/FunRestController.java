package rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public String testing(@RequestBody String message) {
        return "The message is " + message;
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