package mm.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String saygreeting() {
        return "Hello World - Constructor";
    }
}
