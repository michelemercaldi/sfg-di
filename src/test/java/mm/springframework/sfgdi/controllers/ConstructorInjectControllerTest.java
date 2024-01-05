package mm.springframework.sfgdi.controllers;

import mm.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectControllerTest {

    ConstructorInjectController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}