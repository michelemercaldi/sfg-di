package mm.springframework.sfgdi.services;

public class PrimaryGreetingService implements  GreetingService {
    @Override
    public String saygreeting() {
        return "Hello World from primary bean";
    }
}
