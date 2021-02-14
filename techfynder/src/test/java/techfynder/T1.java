package techfynder;



import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class T1 
{
	public static void login(WebDriver driver) throws InterruptedException

	{
		
		Actions actions = new Actions(driver);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,100)");
		List<WebElement> mainMenu = driver.findElements(By.className("mat-button-wrapper"));
		actions.moveToElement(mainMenu.get(6)).click().perform();;
		Thread.sleep(2000);
		WebElement subMenu = driver.findElement(By.linkText("Contractor Signup"));
		actions.moveToElement(subMenu);
		actions.click().build().perform();

		Thread.sleep(2000);
		}
	
	public static void login_details(WebDriver driver) throws InterruptedException	
	
	{
		driver.findElement(By.cssSelector("input[placeholder= 'Your Email']")).sendKeys("rejowi1097@youlynx.com");
	
	Thread.sleep(2000);
	
	}
public static void signup_click(WebDriver driver) throws InterruptedException	
	
	{
	WebElement element1 = driver.findElement(By.className("login-button-title"));

	Thread.sleep(2000);
	
	element1.click();

	Thread.sleep(2000);
	
	} 
public static void email_password(WebDriver driver) throws InterruptedException	

{
 
	driver.findElement(By.cssSelector("input[placeholder= 'Your Email']")).sendKeys("rejowi1097@youlynx.com");

	
	driver.findElement(By.cssSelector("input[placeholder= 'Enter your password']")).sendKeys("IND@319a");


	Thread.sleep(2000);

}

public static void login_click(WebDriver driver) throws InterruptedException	

{
WebElement element1 = driver.findElement(By.className("login-button-title"));

Thread.sleep(2000);

element1.click();

Thread.sleep(3000);

} 

public static void resume(WebDriver driver) throws InterruptedException

{

	
        Actions actions = new Actions(driver);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,100)");
		List<WebElement> mainMenu = driver.findElements(By.className("mat-button-wrapper"));
		actions.moveToElement(mainMenu.get(1)).click().perform();;
		 Thread.sleep(3000);
	driver.findElements(By.className("mat-button-wrapper")).get(5).sendKeys("file:///Users/madan%20mohan%20reddy/Desktop/resume.pdf");
		
		Thread.sleep(2000);
        
}




public static void first_name(WebDriver driver) throws InterruptedException

{
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,300)");
	Thread.sleep(2000);
	driver.findElement(By.id("mat-input-17")).sendKeys("madan");

	Thread.sleep(2000);	

}

public static void Last_Name(WebDriver driver) throws InterruptedException

{

	driver.findElement(By.id("mat-input-18")).sendKeys("reddy");

	Thread.sleep(2000);	



}

public static void country_code(WebDriver driver) throws InterruptedException

{
	driver.findElement(By.id("mat-input-19")).clear();
	
	driver.findElement(By.id("mat-input-19")).sendKeys("ire");

	Thread.sleep(2000);

	driver.findElement(By.className("mat-option-text")).click();
	
	Thread.sleep(2000);
	
	
}

public static void state_name(WebDriver driver) throws InterruptedException

{
	WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'State/City']"));

	element1.sendKeys("Dublin");

	Thread.sleep(2000);
	
	driver.findElement(By.className("mat-option-text")).click();
	
	Thread.sleep(2000);
	
	
}
public static void phone_number(WebDriver driver) throws InterruptedException

{
	WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Phone Number']"));

	element1.sendKeys("9030259238");

	Thread.sleep(2000);
	
}


public static void Job_Title(WebDriver driver) throws InterruptedException

{
	driver.findElement(By.id("mat-input-24")).sendKeys("test");;


	Thread.sleep(2000);

	driver.findElements(By.className("mat-option-text")).get(4).click();
	Thread.sleep(2000);

	
	
}

public static void sector(WebDriver driver) throws InterruptedException

{
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,200)");
	Thread.sleep(2000);
	
	driver.findElements(By.className("ng-star-inserted")).get(38).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/app-root/app-signup-contractors-steps/main/section/div/div/div[2]/form/div/div[2]/div[2]/div/div[6]/div[2]/div/ng-multiselect-dropdown/div/div[2]/ul[2]/li[5]/div")).click();

	Thread.sleep(2000);
	
	
}

public static void skill(WebDriver driver) throws InterruptedException

{
		WebElement element1 = driver.findElement(By.id("mat-input-25"));

		element1.sendKeys("test");
		
		Thread.sleep(2000);

		driver.findElements(By.className("mat-option-text")).get(8).click();
		
		Thread.sleep(2000);
		WebElement element2 = driver.findElement(By.id("mat-input-25"));

		element1.sendKeys("test");
		
		Thread.sleep(2000);

		driver.findElements(By.className("mat-option-text")).get(4).click();
		
		Thread.sleep(2000);
		WebElement element3 = driver.findElement(By.id("mat-input-25"));

		element1.sendKeys("test");
		
		Thread.sleep(2000);

		driver.findElements(By.className("mat-option-text")).get(5).click();
		
		Thread.sleep(2000);
}

public static void About_me(WebDriver driver) throws InterruptedException

{
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,400)");
	
	
	WebElement element1 = driver.findElement(By.id("mat-input-26"));

	element1.sendKeys("Looking for a challenging role in a reputable organization to utilize my technical, database and management skills for the growth");

		
}

public static void date_of_availability(WebDriver driver) throws InterruptedException


{
	 driver.findElement(By.xpath("//*[@id=\"mat-input-30\"]")).click();
	
	Thread.sleep(2000);
	
   driver.findElements(By.className("mat-calendar-body-cell-content")).get(22).click();;




}
public static void hourly_rate(WebDriver driver) throws InterruptedException


{
	
driver.findElement(By.id("mat-input-27")).sendKeys("10");;

	Thread.sleep(2000);
	
}

public static void year_exp(WebDriver driver) throws InterruptedException


{
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,400)");
	Thread.sleep(2000);
	driver.findElements(By.className("mat-select-value")).get(2).click();

	Thread.sleep(2000);
	driver.findElements(By.className("mat-option-text")).get(1).click();

	Thread.sleep(2000);
	
}


public static void spoken(WebDriver driver) throws InterruptedException


{
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,400)");
	
	driver.findElement(By.id("mat-input-32")).sendKeys("engli");

	Thread.sleep(2000);

	driver.findElements(By.className("mat-option-text")).get(0).click();
	
	Thread.sleep(2000);

}

public static void state_interest(WebDriver driver) throws InterruptedException


{

	driver.findElement(By.xpath("//*[@id=\"mat-input-24\"]")).sendKeys("tela");;

	Thread.sleep(3000);
	
	driver.findElements(By.className("mat-option-text")).get(0).click();
	
	Thread.sleep(2000);

}

public static void sponsership(WebDriver driver) throws InterruptedException


{


driver.findElement(By.xpath("//*[@id=\"mat-select-6\"]/div/div[1]/span")).click();
Thread.sleep(2000);

driver.findElements(By.className("mat-option-text")).get(0).click();
Thread.sleep(2000);

}


public static void position(WebDriver driver) throws InterruptedException

{
	driver.findElement(By.xpath("//*[@id=\"mat-input-25\"]")).sendKeys("test");
Thread.sleep(2000);

driver.findElements(By.className("mat-option-text")).get(4).click();
Thread.sleep(2000);

	
}



public static void Auto(WebDriver driver) throws InterruptedException

{  
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,300)");
	
	WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"mat-input-25\"]"));
	subMenu.sendKeys("English");
	Thread.sleep(2000);
	driver.findElements(By.className("mat-option-text")).get(0).click();
	Thread.sleep(3000);
}
	


public static void certification(WebDriver driver) throws InterruptedException

{
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,300)");
	
	WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mat-input-26\"]"));
	
	element1.sendKeys("Information Technology");

	Thread.sleep(2000);
	
}

public static void captcha(WebDriver driver) throws InterruptedException

{
	
driver.findElement(By.className("recaptcha-checkbox-border")).click();

Thread.sleep(2000);

}


public static void done(WebDriver driver) throws InterruptedException

{
	

	
driver.findElements(By.className("mat-button-wrapper")).get(4).click();

Thread.sleep(2000);

}
}


