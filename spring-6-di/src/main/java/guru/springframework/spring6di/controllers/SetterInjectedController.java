package guru.springframework.spring6di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import guru.springframework.spring6di.services.GreetingService;

@Controller
public class SetterInjectedController {
    @Qualifier("setterGreetingBean")
    @Autowired
    private GreetingService greetingService;

    // @Autowired
    // @Qualifier("setterGreetingBean")
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
