package stepDefinitions;

import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinition {
	
	@Given("^user is on netbanking landing page$")
	public void user_is_on_netbanking_landing_Page() {
		System.out.println("navigated to login url");
	}
	

    @Given("^validate the browser$")
    public void validate_the_browser() throws Throwable {
      System.out.println("browser is validated");
    }

    @When("^browser is triggered$")
    public void browser_is_triggered() throws Throwable {
    	System.out.println("browser is triggered");
      
    }

    @Then("^check if browser is started$")
    public void check_if_browser_is_started() throws Throwable {
    	System.out.println("browser started");
        
    }
    

	 @When("^user logs into the application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void user_logs_into_the_application_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
	       System.out.println(strArg1);
	       System.out.println(strArg2);
	    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        System.out.println("validated homepage");
    }


    @Then("Cards displayed are {string}")
    public void cards_displayed_are(String string) {
    // Write code here that turns the phrase above into concrete actions
    System.out.println(string);
    }
    
    @When("^user signs up with following details$")
    public void user_signs_up_with_following_details(DataTable data) throws Throwable {
    	List<List<String>> obj = data.asLists();
    	System.out.println("******************************");
	System.out.println(obj.get(0).get(0));
	System.out.println(obj.get(0).get(1));
	System.out.println(obj.get(0).get(2));
	System.out.println(obj.get(0).get(3));
	System.out.println(obj.get(0).get(4));
	System.out.println("******************************");
        
    }
    
    @When("^user logs in to the application with (.+) and (.+)$")
    public void user_logs_in_to_the_application_with_and(String username, String password) throws Throwable {
        System.out.println(username);
        System.out.println(password);
    }


}
