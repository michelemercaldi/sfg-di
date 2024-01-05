package mm.springframework.sfgdi;

import mm.springframework.sfgdi.controllers.ConstructorInjectController;
import mm.springframework.sfgdi.controllers.MyController;
import mm.springframework.sfgdi.controllers.PropetyInjectedController;
import mm.springframework.sfgdi.controllers.SetterInjectController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		// DI: I'm not creating object, I'm asking to the framework to create it for me
		// note: by default the name is the class name with the first letter lower case
		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();
		System.out.println(greeting);

		System.out.println("------------ Property");
		PropetyInjectedController propetyInjectedController = (PropetyInjectedController) ctx.getBean("propetyInjectedController");
		System.out.println(propetyInjectedController.getGreeting());

		System.out.println("------------ Setter");
		SetterInjectController setterInjectController = (SetterInjectController) ctx.getBean("setterInjectController");
		System.out.println(setterInjectController.getGreeting());

		System.out.println("------------ Constructor");
		ConstructorInjectController constructorInjectController = (ConstructorInjectController) ctx.getBean("constructorInjectController");
		System.out.println(constructorInjectController.getGreeting());
	}

}
