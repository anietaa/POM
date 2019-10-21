package com.test.MercuryTours;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FillPassangerDetail {

	
	WebDriver driver;
	public  FillPassangerDetail(WebDriver driver) {
		this.driver = driver;
	}
	
	By rdBtn_Trip = By.name("tripType");
	By Passangers = By.name("passCount");
    By departing_From = By.name("fromPort");
    By on_date_month = By.name("fromMonth");
    By on_date_day = By.name("fromDay");
    By arriving_at = By.name("toPort");
    By returning_date_month = By.name("toMonth");
    By returning_date_day = By.name("toDay");
    By service_class = By.name("servClass");
    By airline = By.name("airline");
    By continue_btn = By.name("findFlights");
    By selectDepartFlightType = By.name("outFlight");
    By selectReturnFlightType = By.name("inFlight");
    By conToConBtn = By.name("reserveFlights");
    
    
	
	
	
	
	
	public void selectTripType() {
		List rdBtn_Trips = driver.findElements(rdBtn_Trip);
		int iSize = rdBtn_Trips.size();
		for(int i=0; i < iSize ; i++ ){
			System.out.println(rdBtn_Trips.get(i));
			 String sValue =((WebElement) rdBtn_Trips.get(i)).getAttribute("value");
			 if (sValue.equalsIgnoreCase("oneway")){
				 
				 ((WebElement) rdBtn_Trips.get(i)).click();
				 break;
			 }
		
		
	}
}
	
	
	public void selectPass(String PassangerValue) {
		Select pass_No = new Select(driver.findElement(Passangers));
		pass_No.selectByVisibleText(PassangerValue);
	}
	
	public void departureCountry(String dCountryName) {
		Select d_country = new Select(driver.findElement(departing_From));
		d_country.selectByVisibleText(dCountryName);
	}
	

	public void departDate(String month,String day) {
		Select departDatesM = new Select(driver.findElement(on_date_month));
		Select departDatesD = new Select(driver.findElement(on_date_day));
		
		departDatesM.selectByVisibleText(month);
		departDatesD.selectByVisibleText(day);
		}
	public void selectDestination(String destinationName) {
		Select dest = new Select(driver.findElement(arriving_at));
		dest.selectByVisibleText(destinationName);
	}
	
	public void selectReturningDate(String rMonth,String rDay) {
		Select returnM = new Select(driver.findElement( returning_date_month));
		Select returnD = new Select(driver.findElement( returning_date_day));
		returnM.selectByVisibleText(rMonth);
		returnD.selectByVisibleText( rDay);
	}
	
	public void selectServiceType() {
		List rdBtn_Service = driver.findElements(service_class);
		int jSize = rdBtn_Service.size();
		for(int j=0; j < jSize ; j++ ){
			System.out.println(rdBtn_Service.get(j));
			 String ssValue =((WebElement) rdBtn_Service.get(j)).getAttribute("value");
			 if (ssValue.equalsIgnoreCase("First")){
				 
				 ((WebElement) rdBtn_Service.get(j)).click();
				break;
			 }
		}
	}
	
	public void selectAirlineType(String arline) {
		Select arLine = new Select(driver.findElement(airline));
		arLine.selectByVisibleText(arline);
	}
	
	public void clickCon() {
		driver.findElement(continue_btn).click();
		
	}
	
	public void selectDepartTripType() {
		List rdBtn_DepartType = driver.findElements(selectDepartFlightType);
		int kSize = rdBtn_DepartType.size();
		for(int k=0; k < kSize ; k++ ){
			System.out.println(rdBtn_DepartType.get(k));
			 String sssValue =((WebElement) rdBtn_DepartType.get(k)).getAttribute("value");
			 if (sssValue.equalsIgnoreCase("Blue Skies Airlines$361$271$7:10")){
				 
				 ((WebElement) rdBtn_DepartType.get(k)).click();
				 break;
			 }
		
		
	}
}
	
	public void selectReturnTripType() {
		List rdBtn_ReturnType = driver.findElements(selectDepartFlightType);
		int lSize = rdBtn_ReturnType.size();
		for(int l=0; l < lSize ; l++ ){
			System.out.println(rdBtn_ReturnType.get(l));
			 String ssssValue =((WebElement) rdBtn_ReturnType.get(l)).getAttribute("value");
			 if (ssssValue.equalsIgnoreCase("Pangea Airlines$632$282$16:37")){
				 
				 ((WebElement) rdBtn_ReturnType.get(l)).click();
				 break;
			 }
		
		
	}
}
	
	public void clickConTo() {
		driver.findElement(conToConBtn).click();
		
	}
	public void singleMethodToFillDetails(String PassangerValue,String dCountryName,String month,String day,String destinationName,String rMonth,String rDay,String arline) {
		selectTripType();
		selectPass(PassangerValue);
		departureCountry(dCountryName);
		departDate(month,day);
		selectDestination(destinationName);
		selectReturningDate(rMonth,rDay);
		
		selectServiceType();
		selectAirlineType(arline);
		clickCon();
		selectDepartTripType();
		selectReturnTripType();
		clickConTo();
	}

	
	
}
