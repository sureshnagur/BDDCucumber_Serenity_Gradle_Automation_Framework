package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	
	
//	@Before  //with this annotation before running each and every scenario in any feature file this method will run first
	
	@Before("@netBanking")  //with this the following method execute before executing the scenario with tag name as @netBanking
	public void netBankingSetup() {
		
		System.out.println("setup the entries for netbanking database");
	}
	
	@After //if you dont mention particular tagname this will execute after each each and every scenario.
	public void tearDown() {
		
		System.out.println("clear the entries");
	}
	
	
	@Before("@mortgage")
		public void mortgageSetup() {
		
		System.out.println("setup the entries for mortgage database");
	}


}


//flow of execution
//Before-->Background-->Scenario-->After