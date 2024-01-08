package mm.springframework.sfgdi.controllers;

import mm.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectControllerTest {

    SetterInjectController controller;
    @BeforeEach
    void setUp() {
        controller = new SetterInjectController();
        controller.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}