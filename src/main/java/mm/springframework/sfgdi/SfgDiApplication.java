package mm.springframework.sfgdi;

import mm.springframework.sfgdi.controllers.ConstructorInjectController;
import mm.springframework.sfgdi.controllers.MyController;
import mm.springframework.sfgdi.controllers.PropertyInjectedController;
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

		System.out.println("------------ Primary bean");
		System.out.println(myController.sayHello());

		System.out.println("------------ Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------------ Setter");
		SetterInjectController setterInjectController = (SetterInjectController) ctx.getBean("setterInjectController");
		System.out.println(setterInjectController.getGreeting());

		System.out.println("------------ Constructor");
		ConstructorInjectController constructorInjectController = (ConstructorInjectController) ctx.getBean("constructorInjectController");
		System.out.println(constructorInjectController.getGreeting());
	}

}
