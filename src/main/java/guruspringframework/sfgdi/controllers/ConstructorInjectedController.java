package guruspringframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guruspringframework.sfgdi.services.GreetingService;

@Controller
public class ConstructorInjectedController 
{
	private final GreetingService greetingService;

	public ConstructorInjectedController(@Qualifier("constructorGreetingServiceImpl")GreetingService greetingService) 
	{
		this.greetingService = greetingService;
	}

	public String getGreetingService() {
		return greetingService.sayGreeting();
	}	
}
