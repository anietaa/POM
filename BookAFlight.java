package com.test.MercuryTours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BookAFlight {
	
	WebDriver driver;
	public BookAFlight(WebDriver driver) {
		this.driver = driver;
	}
	
	By FirstName1 = By.name("passFirst0");
	By LastName1 = By.name("passLast0");
	By meal_preference1 = By.name("pass.0.meal");
	By FirstName2 = By.name("passFirst1");
	
	By LastName2 = By.name("passLast1");
	By meal_preference2 = By.name("pass.1.meal");
	By FirstName3 = By.name("passFirst2");
	
	By LastName3 = By.name("passLast2");
	By meal_preference3 = By.name("pass.2.meal");
	By FirstName4 = By.name("passFirst3");
	By LastName4 = By.name("passLast3");
	By meal_preference4 = By.name("pass.3.meal");
	By CardType = By.name("creditCard");
	By Card_Number = By.name("creditnumber");
	By Expiration_day = By.name("cc_exp_dt_mn");
	By Expiration_year = By.name("cc_exp_dt_yr");
	By Card_fName = By.name("cc_frst_name");
	By Card_mName = By.name("cc_mid_name");
	By Card_lName = By.name("cc_last_name");
	By check_box_Ticketless = By.name("ticketLess"); 
	By bill_address1 = By.name("billAddress1");
	By bill_address2 = By.name("billAddress2");
	By bill_City = By.name("billCity");
	By bill_state_provinance = By.name("billState");
	By bill_pinCode = By.name("billZip");
	By bill_country = By.name("billCountry");
	By check_box_sameAsDeliveryAddress = By.name("ticketLess");
	By del_address1 = By.name("delAddress1");
	By del_address2 = By.name("delAddress2");
	By del_City = By.name("delCity");
	By del_state_provinance = By.name("delState");
	By del_pinCode = By.name("delZip");
	By del_country = By.name("delCountry");
	By Secure_purchase = By.name("buyFlights");
	By Log_Out = By.linkText("LOG Out");
	
	WebElement check_box_del_addd;
	WebElement check_box_ticketlesss;
	
	
	public void inputPassanger_1_details(String ffName1,String llName1,String mealpf1) {
		driver.findElement(FirstName1).sendKeys(ffName1);
		driver.findElement(LastName1).sendKeys(llName1);
		Select mf1 = new Select(driver.findElement(meal_preference1) );
		mf1.selectByVisibleText(mealpf1);
	}
	
	public void inputPassanger_2_details(String ffName2,String llName2,String mealpf2) {
		driver.findElement(FirstName2).sendKeys(ffName2);
		driver.findElement(LastName2).sendKeys(llName2);
		Select mf2 = new Select(driver.findElement(meal_preference2) );
		mf2.selectByVisibleText(mealpf2);
	}
	public void inputPassanger_3_details(String ffName3,String llName3,String mealpf3) {
		driver.findElement(FirstName3).sendKeys(ffName3);
		driver.findElement(LastName3).sendKeys(llName3);
		Select mf3 = new Select(driver.findElement(meal_preference3) );
		mf3.selectByVisibleText(mealpf3);
	}
	public void inputPassanger_4_details(String ffName4,String llName4,String mealpf4) {
		driver.findElement(FirstName4).sendKeys(ffName4);
		driver.findElement(LastName4).sendKeys(llName4);
		Select mf4 = new Select(driver.findElement(meal_preference4) );
		mf4.selectByVisibleText(mealpf4);
	}
	
	public void selectCardType(String card) {
		Select cCard = new Select(driver.findElement( CardType));
		cCard.selectByVisibleText(card);
	}
	
	public void enterCardNumber(String cNumber) {
		driver.findElement( Card_Number).sendKeys(cNumber);
	}
	
	public void selectExpiration(String month,String year) {
		Select month_expire = new Select(driver.findElement( Expiration_day));
		Select year_expire = new Select(driver.findElement( Expiration_year));
		month_expire.selectByVisibleText(month);
		year_expire.selectByVisibleText(year);
	}
	public void enterCardDetails(String fNameOnCard,String mNameOnCard,String lNameOnCard) {
		driver.findElement(Card_fName).sendKeys(fNameOnCard);
		driver.findElement(Card_mName).sendKeys(mNameOnCard);
		driver.findElement(Card_lName).sendKeys(lNameOnCard);
	}
	
	public void clickOnTicketlessCheckBox(WebElement check_box_ticketlesss ) {
		check_box_ticketlesss = driver.findElement(check_box_Ticketless);
		check_box_ticketlesss.isSelected();
		if(!check_box_ticketlesss.isSelected()== true) {
			check_box_ticketlesss.click();
		}
	
	}
	
	public void enterBillingAddress(String add1,String add2,String cityName,String stName,String zipCode,String counName) {
		driver.findElement(bill_address1).clear();
		driver.findElement(bill_address1).sendKeys(add1);
		driver.findElement(bill_address2).clear();
		driver.findElement(bill_address2).sendKeys(add2);
		driver.findElement(bill_City).clear();
		driver.findElement(bill_City).sendKeys(cityName);
		driver.findElement(bill_state_provinance).clear();
		driver.findElement(bill_state_provinance).sendKeys(stName);
		driver.findElement(bill_pinCode).clear();
		driver.findElement(bill_pinCode).sendKeys(zipCode);
		Select billCon = new Select(driver.findElement(bill_country));
		//billCon.deselectByVisibleText(counName);
		billCon.selectByVisibleText(counName);
		
	}
	
	public void clickOnCheckBox_Delivery_Address(WebElement check_box_del_addd) {
		 check_box_del_addd = driver.findElement(check_box_sameAsDeliveryAddress);
		 check_box_del_addd.isSelected();
		 if( check_box_del_addd.isSelected() == true) {
			 check_box_del_addd.click();
		 }
		
	}
	
	public void enterDeliveryAddress(String dAdd1,String dAdd2,String dCity,String dState,String dZipCode,String dCounName) {
		
		    
		    	
			driver.findElement(del_address1).clear();
			driver.findElement(del_address1).sendKeys(dAdd1);
			driver.findElement(del_address2).clear();
			driver.findElement(del_address2).sendKeys(dAdd2);
			driver.findElement(del_City).clear();
			driver.findElement(del_City).sendKeys(dCity);
			driver.findElement(del_state_provinance).clear();
			driver.findElement(del_state_provinance).sendKeys(dState);
			driver.findElement(del_pinCode).clear();
			driver.findElement(del_pinCode).sendKeys(dZipCode);
			driver.findElement(del_country).clear();
			Select delivery_Coun = new Select(driver.findElement(del_country));
			//delivery_Coun.deselectByVisibleText(dCounName);
			delivery_Coun.selectByVisibleText(dCounName);
			
		}
		    
	public void whenToEnterDelAdd(String dAdd1,String dAdd2,String dCity,String dState,String dZipCode,String dCounName) {
		if( !check_box_del_addd.isSelected() == true || check_box_ticketlesss.isSelected()== true) {
			
			enterDeliveryAddress(dAdd1,dAdd2,dCity,dState,dZipCode,dCounName);
		}
	}
		
		

	
	

	public void clickOnSecurePurchase() {
		driver.findElement(Secure_purchase).click();
	  
	}
	public void clickOnLogOut() {
		driver.findElement(Log_Out).click();
	  
	}
	
	public void singleMethodToBookAflight(String ffName1,String llName1,String mealpf1,String ffName2,String llName2,String mealpf2,String ffName3,String llName3,String mealpf3,String ffName4,String llName4,String mealpf4,String card,String cNumber,String month,String year,String fNameOnCard,String mNameOnCard,String lNameOnCard,String add1,String add2,String cityName,String stName,String zipCode,String counName,String dAdd1,String dAdd2,String dCity,String dState,String dZipCode,String dCounName) {
		
		inputPassanger_1_details(ffName1,llName1,mealpf1);
		inputPassanger_2_details(ffName2,llName2,mealpf2);
		inputPassanger_3_details(ffName3,llName3,mealpf3);
		inputPassanger_4_details(ffName4,llName4,mealpf4);
		selectCardType(card);
		enterCardNumber(cNumber);
		selectExpiration(month,year);
		enterCardDetails(fNameOnCard,mNameOnCard,lNameOnCard);
		enterBillingAddress(add1,add2,cityName,stName,zipCode,counName);
		whenToEnterDelAdd( dAdd1, dAdd2, dCity, dState, dZipCode, dCounName);
		
		clickOnSecurePurchase();
		clickOnLogOut();
	}

}

