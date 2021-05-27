package guruspringframework.sfgdi.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guruspringframework.sfgdi.services.ConstructorGreetingServiceImpl;

class SetterInjectedControllerTest 
{
	SetterInjectedController controller;
	
	@BeforeEach
	void setUp()
	{
		controller = new SetterInjectedController();
		controller.setGreetingService(new ConstructorGreetingServiceImpl());
	}
	
	
	@Test
	void getGreeting() 
	{
		System.out.println(controller.getGreetingService());
	}

}
