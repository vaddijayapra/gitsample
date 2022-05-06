package stepdefinition;

import org.junit.After;
import org.junit.Before;

public class Hooks {
	
	@Before
	public void beforeScenario() {
		System.out.println("Before scenario");
		
	}
	@After
	public void afterscenario() {
		System.out.println("After scenario");
	}
	

}
