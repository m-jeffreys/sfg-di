package guruspringframework.sfgdi.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import guruspringframework.sfgdi.services.ConstructorGreetingServiceImpl;

class ConstructorInjectedControllerTest 
{
	ConstructorInjectedController controller;
	
	@BeforeEach
	void setUp()
	{
		controller =  new ConstructorInjectedController(new ConstructorGreetingServiceImpl());
	}

	@Test
	void getGreeting() {
		System.out.println(controller.getGreetingService());
	}

}
