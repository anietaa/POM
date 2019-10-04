package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageMercuryTours {
	WebDriver driver;
	//constructor
	public HomePageMercuryTours(WebDriver driver) {
		this.driver = driver;
	}
	
	By sign_on = By.linkText("SIGN-ON");
	
	
	
	public void clickOnSigninLink() {
		driver.findElement(sign_on).click();
	}

}
