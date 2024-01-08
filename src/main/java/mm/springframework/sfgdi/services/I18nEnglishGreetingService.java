package mm.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nGreetingService")
public class I18nEnglishGreetingService implements GreetingService {
    @Override
    public String saygreeting() {
        return "Hello World - EN";
    }
}
