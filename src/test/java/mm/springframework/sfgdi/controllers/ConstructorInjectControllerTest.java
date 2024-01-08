package mm.springframework.sfgdi.controllers;

import mm.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectControllerTest {

    ConstructorInjectController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectController(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}