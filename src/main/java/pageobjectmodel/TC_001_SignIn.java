package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class TC_001_SignIn {
	WebDriver driver = null;
	public void signInTest() {
		System.setProperty("webdriver.chrome.driver", "D:\\Tools\\eclipse\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		
		//Creating object of homepage
		HomePageMercuryTours homePage = new HomePageMercuryTours(driver); 
		//click on signin button
		homePage.clickOnSigninLink();
		
		//creating object of loginPage
		
		LoginMercuryTours loginPage = new LoginMercuryTours(driver);
		
		//signin
		loginPage.signIn("mercury","mercury");
		
		//QuitBrowser
		//driver.quit();
	}

}
