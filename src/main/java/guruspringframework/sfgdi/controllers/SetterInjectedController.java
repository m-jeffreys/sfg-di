package guruspringframework.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guruspringframework.sfgdi.services.GreetingService;

@Controller
public class SetterInjectedController 
{
	@Qualifier("setterInjectedGreetingServiceImpl")
	@Autowired
	private GreetingService greetingService;

	public String  getGreetingService() 
	{
		return greetingService.sayGreeting();
	}

	public void setGreetingService(GreetingService greetingService) 
	{
		this.greetingService = greetingService;
	}
}
