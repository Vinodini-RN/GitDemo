package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	
	@Before("@Netbanking")
	public void netbankingSetup() {
		System.out.println("setup the netbabking enteries in database");
	
	}
	
	@After
	public void teardown() {
		System.out.println("setup the teardown enteries in database");
	
	}
	
	@Before("@Mortgauge")
	public void mortguageSetup() {
		System.out.println("setup the mortguage enteries in database");
	
	}
//Before hooks->background->scenario->After
	
}
