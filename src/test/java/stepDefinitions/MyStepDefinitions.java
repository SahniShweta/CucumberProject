package stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Cucumber.Automation.base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import pageObjects.CheckOut;
import pageObjects.HomePage;

@RunWith(Cucumber.class)
public class MyStepDefinitions {
	public WebDriver driver;
	HomePage h;
	CheckOut co;
	
    @Given("^User is on Greencart Landing page$")
    public void user_is_on_greencart_landing_page() throws Throwable {
    	driver = base.getDriver();
    	
        
    }

    @When("^User searched for (.+) vegetable$")
    public void user_searched_for_something_vegetable(String strArg1) throws Throwable {
    	h = new HomePage(driver);
        h.getSearch().sendKeys(strArg1);
        Thread.sleep(3000);
    }

    @Then("^\"([^\"]*)\" results are displayed$")
    public void something_results_are_displayed(String strArg1) throws Throwable {
        Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(strArg1));
    }
    

    @Then("^verify selected (.+) item are displayed in check out page$")
    public void verify_selected_item_are_displayed_in_check_out_page(String name) throws Throwable {
    	co = new CheckOut(driver);
    	Assert.assertTrue(co.productNameText().getText().contains(name));
    }

    @And("^added items to cart$")
    public void added_items_to_cart() throws Throwable {
    	h = new HomePage(driver);
        h.getIncrement().click();
        h.addToCart().click();
        Thread.sleep(2000);
    }

    @And("^user proceeded to checkout page for purchase$")
    public void user_proceeded_to_checkout_page_for_purchase() throws Throwable {
    	h = new HomePage(driver);
        h.clickCart().click();
        h.checkout().click();
        Thread.sleep(2000);
    }
}