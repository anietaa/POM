package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class TC_004_Fill_Flight_Details {
	WebDriver driver = null;
	public void fillDeatais() {
		System.setProperty("webdriver.chrome.driver", "D:\\Tools\\eclipse\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");



	HomePageMercuryTours homePage = new HomePageMercuryTours(driver); 
	//click on signin button
	homePage.clickOnFlights();
	
	FindFlight findaflight = new FindFlight(driver);
	
	//enter inputs for signin for find a flight
	//@Test(priority = 2)
	
	/*findaflight.signInForFlight("ani123","ani123");
	FillPassangerDetail fillDetls = new FillPassangerDetail(driver);	
	fillDetls.selectTripType();
	fillDetls.selectPass("3");
	fillDetls.departureCountry("New York");
	fillDetls.departDate("February","9");*/
	findaflight.signInForFlight("ani123","ani123");
	FillPassangerDetail fillDetls = new FillPassangerDetail(driver);
	fillDetls.singleMethodToFillDetails("4","New York","February","9","Portland","December","11", "Blue Skies Airlines");
}
}
