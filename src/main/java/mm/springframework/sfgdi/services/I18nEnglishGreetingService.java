package mm.springframework.sfgdi.services;

public class I18nEnglishGreetingService implements GreetingService {
    @Override
    public String saygreeting() {
        return "Hello World - EN";
    }
}
