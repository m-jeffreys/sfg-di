package guruspringframework.sfgdi.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guruspringframework.sfgdi.services.ConstructorGreetingServiceImpl;

class PropertyInjectionControllerTest 
{
	PropertyInjectedController controller;
	
	@BeforeEach
	void setup()
	{
		controller = new PropertyInjectedController();
		
		controller.greetingService = new ConstructorGreetingServiceImpl();
	}
	
	@Test
	void getGreeting() 
	{
		System.out.println(controller.getGreeting());
	}

}
