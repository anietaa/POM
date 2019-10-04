package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginMercuryTours {
	
WebDriver driver;
	
	public LoginMercuryTours(WebDriver driver) {
		this.driver = driver;
	}
	
	
	By user_name_input = By.name("userName");
	By password_input = By.name("password");
	By sign_in_click = By.name("login");
	
	
	// type usernmae
	public void typeUserName(String uName) {
		driver.findElement(user_name_input).sendKeys(uName);
	}
	
   //type password
	
	public void typePassword(String password) {
		driver.findElement(password_input).sendKeys(password);
	}
	
	//click on sign in button
	
	public void clickOnSignInButton() {
		driver.findElement(sign_in_click).click();
	}
	
	//Single method to signin
	public void signIn(String uName, String password) {
		typeUserName(uName);
		typePassword(password);
		clickOnSignInButton();
	}


}
