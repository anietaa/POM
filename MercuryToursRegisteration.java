package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MercuryToursRegisteration {
	
	
	WebDriver driver;
	
	public MercuryToursRegisteration(WebDriver driver) {
		this.driver = driver;
		
	}
	
	By first_name = By.name("firstName");
	By last_name = By.name("lastName");
	By phone = By.name("phone");
	By email = By.name("userName");
	By address1 = By.name("address1");
	By address2 = By.name("address2");
	By city = By.name("city");
	By state = By.name("state");
	By postal_code = By.name("postalCode");
	By country_dropdown = By.name("country");
	By u_name = By.name("email");
	By pwd = By.name("password");
	By cnf_pwd = By.name("confirmPassword");
	By submit_btn = By.name("register");
	
	public void inputFirstName(String fName) {
		driver.findElement(first_name).sendKeys(fName);
	}
	
	public void inputLastName(String lName) {
		driver.findElement(last_name).sendKeys(lName);
	}
	public void inputPhone(String phoneNumber) {
		driver.findElement(phone).sendKeys(phoneNumber);
	}
	public void inputemailAddress(String emailAdd) {
		driver.findElement(email).sendKeys(emailAdd);
	}
	
	public void inputAddress1(String add1) {
		driver.findElement(address1).sendKeys(add1);
	}
	public void inputAddress2(String add2) {
		driver.findElement(address2).sendKeys(add2);
	}
	
	public void inputCity(String cityName) {
		driver.findElement(city).sendKeys(cityName);
	}
	
	public void inputState(String stateName) {
		driver.findElement(state).sendKeys(stateName);
	}
	
	public void inputPostal(String pinCode) {
		driver.findElement(postal_code).sendKeys(pinCode);
	}
	
	public void selectCountry(String countryName) {
		Select selCon = new Select(driver.findElement(country_dropdown));
		selCon.selectByVisibleText(countryName);
	}
	public void inputUserName(String uName) {
		driver.findElement(u_name).sendKeys(uName);
	}
	
	public void inputPassword(String pwdd) {
		driver.findElement(pwd).sendKeys(pwdd);
	}
	
	public void inputConfirmPassword(String cnfPwdd) {
		driver.findElement(cnf_pwd).sendKeys(cnfPwdd);
	}
	
	public void clickOnSubmitBtn() {
		driver.findElement(submit_btn).click();
	}
	
	// single method to register
	public void  completeRegisteration(String fName,String lName,String phoneNumber,String emailAdd,String add1,String add2,String cityName,String stateName,String pinCode,String countryName,String uName,String pwdd,String cnfPwdd) {
		
		inputFirstName(fName);
		inputLastName(lName);
		inputPhone(phoneNumber);
		inputemailAddress(emailAdd);
		inputAddress1(add1);
		inputAddress1(add2);
		inputCity(cityName);
		inputState(stateName);
		inputPostal(pinCode);
		selectCountry(countryName);
		inputUserName(uName);
		inputPassword(pwdd);
		inputConfirmPassword(cnfPwdd);
		clickOnSubmitBtn();
		
		


}
}
