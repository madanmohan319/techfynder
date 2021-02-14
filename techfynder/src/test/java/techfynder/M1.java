package techfynder;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import website.Class;

public class M1  
{
	

	private WebDriver driver;

	@BeforeMethod
	public void beforeMethod()

	{
	    System.setProperty("webdriver.chrome.driver", "/Users/madan mohan reddy/Desktop/selenium-java-3.141.59/chromedriver");

			driver = (WebDriver) new ChromeDriver();

			driver.manage().window().maximize();

			driver.get("https://uat.techfynder.com/");
			
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,200)");
		
        
	}

	@Test
	public void generalInformationTest() throws InterruptedException 
	{
		T1.login(driver);
		Thread.sleep(2000);
		T1.login_details(driver);
		T1.signup_click(driver);
		T1.email_password(driver);
		T1.login_click(driver);
		
		T1.first_name(driver);
		T1.Last_Name(driver);
		T1.country_code(driver);
		T1.state_name(driver);
		Thread.sleep(2000);
		T1.phone_number(driver);
		Thread.sleep(2000);
		
		
		T1.Job_Title(driver);
		Thread.sleep(2000);
		
		T1.sector(driver);
		Thread.sleep(1000);
		
		T1.skill(driver);
		Thread.sleep(2000);
		
		T1.About_me(driver);
		Thread.sleep(2000);
		
		T1.date_of_availability(driver);
		
		T1.hourly_rate(driver);
		
		Thread.sleep(4000);
		
		T1.year_exp(driver);
		
		T1.spoken(driver);
		
		Thread.sleep(1000);
		
	T1.done(driver);
	Thread.sleep(1000);

	}

	@AfterMethod
	public void afterMethod() 
	{
		driver.quit();

	}

}










