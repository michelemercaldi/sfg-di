package mm.springframework.sfgdi.repositories;

public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {

    @Override
    public String getGteetings() {
        return "Hello World - EN";
    }
}
