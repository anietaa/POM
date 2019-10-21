package com.test.MercuryTours;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class FindFlightTest {
	WebDriver driver;

	public void signInToFindFlightTest() {
//		System.setProperty("webdriver.chrome.driver", "D:\\Tools\\eclipse\\chromedriver.exe");
		 WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		
		//Creating object of homepage
		HomePage homePage = new HomePage(driver); 
		//click on signin button
		homePage.clickOnFlights();
		
		
		//creating object for find a flight signIn page
		FindFlight findaflight = new FindFlight(driver);
		
		//enter inputs for signin for find a flight
		//@Test(priority = 2)
		
		findaflight.signInForFlight("ani123","ani123");
		//findaflight.selectTypeOfTrip();
			
			
		
}

}
