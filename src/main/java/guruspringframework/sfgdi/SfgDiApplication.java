package guruspringframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guruspringframework.sfgdi.controllers.ConstructorInjectedController;
import guruspringframework.sfgdi.controllers.I18nController;
import guruspringframework.sfgdi.controllers.MyController;
import guruspringframework.sfgdi.controllers.PropertyInjectedController;
import guruspringframework.sfgdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		
		System.out.println(i18nController.sayHello());
		
		MyController myController = (MyController) ctx.getBean("myController");
				
		System.out.println("------------Primary Bean");

		System.out.println(myController.sayHello());
		
		System.out.println("------------Property");
		
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		
		System.out.println(propertyInjectedController.getGreeting());
		
		System.out.println("------------Setter");
		SetterInjectedController setterInjectedController =  (SetterInjectedController) ctx.getBean("setterInjectedController");
		
		System.out.println(setterInjectedController.getGreetingService());
		
		System.out.println("------------Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		
		System.out.println(constructorInjectedController.getGreetingService());
		
	}

}
