package mm.springframework.sfgdi;

import mm.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		PetController petController = ctx.getBean("petController", PetController.class);
		System.out.println("--- The Best Pet is ---");
		System.out.println(petController.whichPetIsTheBest());


		I18nProfileController i18nProfileController = (I18nProfileController) ctx.getBean("i18nProfileController");

		System.out.println("------------ Profiles");
		System.out.println(i18nProfileController.sayHello());

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
