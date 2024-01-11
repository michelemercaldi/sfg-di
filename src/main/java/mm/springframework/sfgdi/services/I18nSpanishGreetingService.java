package mm.springframework.sfgdi.services;

public class I18nSpanishGreetingService implements GreetingService {
    @Override
    public String saygreeting() {
        return "Hola Mundo - ES";
    }
}
