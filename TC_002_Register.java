package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class TC_002_Register {
	
	WebDriver driver = null;
	public void registerTest() {
		System.setProperty("webdriver.chrome.driver", "D:\\Tools\\eclipse\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		
		//Creating object of homepage
		HomePageMercuryTours homePage = new HomePageMercuryTours(driver);
		//click on register link
		homePage.clickOnRegister();
		// Creating object of Registration page
		MercuryToursRegisteration regMer = new MercuryToursRegisteration(driver);
		
		//enter inputs for registeration
		regMer.completeRegisteration("Any","Pal","8766347109","automation075@gmail.com","ElectronicCity","Chandapura","Bangalore","Karnatka","562043","INDIA","ani123","ani1234","ani1234");

}
}
