package mm.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"ES", "default"})
@Service("i18nGreetingService")
public class I18nSpanishGreetingService implements GreetingService {
    @Override
    public String saygreeting() {
        return "Hola Mundo - ES";
    }
}
