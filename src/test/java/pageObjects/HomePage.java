package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	By search = By.xpath("//input[@type='search']");
	By increment = By.cssSelector("a.increment");
	By add = By.xpath("//button[contains(text(),'ADD TO CART')]");
	By cart = By.xpath("//img[@alt='Cart']");
	By checkout = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	
	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public WebElement getSearch() {
		return driver.findElement(search);
	}
	
	public WebElement getIncrement() {
	return driver.findElement(increment);
	}
	
	public WebElement addToCart() {
		return driver.findElement(add);
	}
	
	public WebElement clickCart() {
		return driver.findElement(cart);
	}
	
	public WebElement checkout() {
		return driver.findElement(checkout);
	}
	
	
	

}
