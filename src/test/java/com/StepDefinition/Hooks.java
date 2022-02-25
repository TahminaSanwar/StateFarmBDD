package com.StepDefinition;

import base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before
	public void setUp() {
		BaseClass.initDriver();
	}
   @After
   public void dismiss() {
	   BaseClass.tearUp();
   }
}
