package com.test.MercuryTours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FindFlight {
	
	WebDriver driver;
	public FindFlight(WebDriver driver) {
		this.driver = driver;
	}
	
	By user_name = By.name("userName");
	By password = By.name("password");
	By sign_in = By.name("login");
	
	
	public void inputUserName(String user_Name) {
		driver.findElement(user_name).sendKeys(user_Name);
	}
	public void inputPass(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickSignInButton() {
		driver.findElement(sign_in).click();
	}
	 
	public void signInForFlight(String user_Name,String pass) {
		inputUserName(user_Name);
		inputPass(pass);
		clickSignInButton();
	}

}
