package mm.springframework.sfgdi.controllers;

import mm.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.saygreeting();
    }
}



//    before refactoring for primary beans
// @Controller
// public class MyController {
//     public String sayHello(){
//         System.out.println("Hello World");
//         return "Hi folks!";
//     }
// }
