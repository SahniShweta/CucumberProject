package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOut {

	public WebDriver driver;
	
	public CheckOut(WebDriver driver) {
		this.driver = driver;
		
	}
	By prodName = By.cssSelector("p.product-name");
	
	public WebElement productNameText() {
		return driver.findElement(prodName);
	}
	
	
}
