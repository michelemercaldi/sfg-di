package mm.springframework.sfgdi.controllers;

import mm.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropetyInjectedController {

    @Autowired
    public GreetingService greetingService;

    public String getGreeting(){
        return greetingService.saygreeting();
    }
}
