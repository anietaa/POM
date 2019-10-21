 package com.test.MercuryTours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	
	

	
		WebDriver driver;
		//constructor
		public HomePage(WebDriver driver) {
			this.driver = driver;
		}
		
		By sign_on = By.linkText("SIGN-ON");
		By register = By.linkText("REGISTER");
		By flights = By.linkText("Flights");
		
		
		public void clickOnSigninLink() {
			driver.findElement(sign_on).click();
		}
		
		public void clickOnRegister() {
			driver.findElement(register).click();
		}
		
		public void clickOnFlights() {
			driver.findElement(flights).click();
		}
		
		

	
}
