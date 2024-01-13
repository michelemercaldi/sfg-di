package mm.springframework.sfgdi;

import mm.springframework.sfgdi.config.SfgConfiguration;
import mm.springframework.sfgdi.controllers.*;
import mm.springframework.sfgdi.datasource.FakeDataSource;
import mm.springframework.sfgdi.services.PrototypeBean;
import mm.springframework.sfgdi.services.SingletonBean;
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
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("------------ Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());


		System.out.println("------------ Bean scope");
		SingletonBean singletonBean1 = (SingletonBean) ctx.getBean(SingletonBean.class);
		System.out.println(singletonBean1.getMyScope());
		SingletonBean singletonBean2 = (SingletonBean) ctx.getBean(SingletonBean.class);
		System.out.println(singletonBean2.getMyScope());

		PrototypeBean prototypeBean1 = (PrototypeBean) ctx.getBean(PrototypeBean.class);
		System.out.println(prototypeBean1.getMyScope());
		PrototypeBean prototypeBean2 = (PrototypeBean) ctx.getBean(PrototypeBean.class);
		System.out.println(prototypeBean2.getMyScope());


		System.out.println("------------ FakeDataSource");
		FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
		System.out.println("Username from properties:    " + fakeDataSource.getUsername());
		System.out.println("Password from properties:    " + fakeDataSource.getPassword());
		System.out.println("Jdbcurl from properties:    " + fakeDataSource.getJdbcurl());

		System.out.println("------------ Config Props Bean");
		SfgConfiguration sfgConfiguration = ctx.getBean(SfgConfiguration.class);
		System.out.println(sfgConfiguration.getUsername());
		System.out.println(sfgConfiguration.getPassword());
		System.out.println(sfgConfiguration.getJdbcurl());


		System.out.println("------------ end of main ------------");
	}

}
