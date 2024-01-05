package mm.springframework.sfgdi.controllers;

import mm.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectControllerTest {

    SetterInjectController controller;
    @BeforeEach
    void setUp() {
        controller = new SetterInjectController();
        controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}