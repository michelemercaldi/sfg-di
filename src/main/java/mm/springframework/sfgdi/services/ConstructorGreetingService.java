package mm.springframework.sfgdi.services;

public class ConstructorGreetingService implements GreetingService {
    @Override
    public String saygreeting() {
        return "Hello World - Constructor";
    }
}
