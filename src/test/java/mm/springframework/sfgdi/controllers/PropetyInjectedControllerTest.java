package mm.springframework.sfgdi.controllers;

import mm.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropetyInjectedControllerTest {

    PropetyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropetyInjectedController();
        controller.greetingService = new GreetingServiceImpl();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}