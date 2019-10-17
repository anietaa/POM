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
	
	
	findaflight.signInForFlight("ani123","ani123");
	FillPassangerDetail fillDetls = new FillPassangerDetail(driver);
	fillDetls.singleMethodToFillDetails("4","New York","February","9","Portland","December","11", "Blue Skies Airlines");
	BookAFlight bFlight = new BookAFlight(driver);
	bFlight.singleMethodToBookAflight("Anita", "Pal","Hindu","Neelesh", "Pal","Kosher", "B", "C","Hindu", "D", "E","Kosher", "Visa", "459170723423", "01", "2009", "Anita", " ","pal", "gg", "hh", "KNP", "SN", "209217", "TOGO", "hh", "ii", "jj", "C", "805241", "SYRIA");
	driver.close();
}
}
