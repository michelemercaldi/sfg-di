package mm.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String saygreeting() {
        return "Hello World - Property";
    }
}
