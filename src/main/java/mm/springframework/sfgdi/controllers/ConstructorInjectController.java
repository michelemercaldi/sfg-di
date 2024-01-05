package mm.springframework.sfgdi.controllers;

import mm.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectController {
    private final GreetingService greetingService;

    public ConstructorInjectController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.saygreeting();
    }
}
