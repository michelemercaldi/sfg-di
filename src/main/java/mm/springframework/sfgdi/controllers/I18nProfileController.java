package mm.springframework.sfgdi.controllers;

import mm.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nProfileController {

    private final GreetingService greetingService;

    public I18nProfileController(@Qualifier("i18nGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.saygreeting();
    }
}
