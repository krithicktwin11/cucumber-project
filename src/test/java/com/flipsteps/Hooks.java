package com.flipsteps;

import com.flipkart.resource.Commonactions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Commonactions{
	Commonactions ca = new Commonactions();
	
	@Before
	public void beforescenario() {
		ca.launch("https://www.flipkart.com/");
		System.out.println("before scenario");
	}
	@After
	public void afterscenario() {
		System.out.println("after scenario");
	}
}
