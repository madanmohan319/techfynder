
package website;


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
public class Main  
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

Class.Job_name(driver);

Class.sectar(driver);
Thread.sleep(2000);
Class.skill_name(driver);
Class.experience_search(driver);
Class.dailyrate_search(driver);
Thread.sleep(2000);
Class.advance(driver);
Class.Availability_search(driver);
Class.elgible_search(driver);
Class.lang_search(driver);
Class.search_name(driver);
Thread.sleep(2000);
}
	
	@AfterMethod
	public void afterMethod() 
	{
		driver.quit();

	}

}










