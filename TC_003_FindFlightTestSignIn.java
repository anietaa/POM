package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//import java.io.IOException;  
import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class TC_003_FindFlightTestSignIn  {
	WebDriver driver;
	public void signInToFindFlightTest() {
//		System.setProperty("webdriver.chrome.driver", "D:\\Tools\\eclipse\\chromedriver.exe");
		 WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		
		//Creating object of homepage
		HomePageMercuryTours homePage = new HomePageMercuryTours(driver); 
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
