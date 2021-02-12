package stepDefinitions;

import Cucumber.Automation.base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends base {
	
	@Before("@MobileTest")
	public void beforevalidation() {
		System.out.println("Before hooks validation");
	}

	@After("@MobileTest")
	public void aftervalidation() {
		System.out.println("after hooks validation");
	}

	@After("@SeleniumTest")
	public void afterSeleniumTest() {
		driver.close();
	}
}
