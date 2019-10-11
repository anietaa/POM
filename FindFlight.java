package pageobjectmodel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class FindFlight  {
	WebDriver driver;
	public FindFlight(WebDriver driver) {
		this.driver = driver;
	}
	
	By user_name = By.name("userName");
	By password = By.name("password");
	By sign_in = By.name("login");
	//WebElement typeoftrip = driver.findElement(By.name("tripType"));
	//List<WebElement>radios = typeoftrip.findElements(By.xpath("//input[@type = 'radio']"));
	
	public void inputUserName(String user_Name) {
		driver.findElement(user_name).sendKeys(user_Name);
	}
	public void inputPass(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickSignInButton() {
		driver.findElement(sign_in).click();
	}
	 /*public void selectTypeOfTrip() {
		 for(WebElement typeoftrip : radios) {
			 if(typeoftrip.getAttribute("value").contains("One Way")) {
				 typeoftrip.click();
				 System.out.println(typeoftrip.getAttribute("value" +" "+typeoftrip.getAttribute("checked")));
			 }
		 }
	 }*/
	public void signInForFlight(String user_Name,String pass) {
		inputUserName(user_Name);
		inputPass(pass);
		clickSignInButton();
	}

}
