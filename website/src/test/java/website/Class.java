
package website;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class Class{
	
	
public static void Job_name(WebDriver driver) throws InterruptedException	
	
	{driver.findElement(By.cssSelector("input[placeholder= 'Job Title']")).sendKeys("test");
	
	Thread.sleep(2000);
	
	driver.findElements(By.className("mat-option-text")).get(1).click();
	Thread.sleep(2000);
	
	}
	
public static void sectar(WebDriver driver) throws InterruptedException

{

	
	
	driver.findElements(By.className("dropdown-btn")).get(0).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"mat-tab-content-0-0\"]/div/div/div/app-simple-search-contractors/form/div[1]/div[2]/ng-multiselect-dropdown/div/div[2]/ul[2]/li[5]/div")).click();

	Thread.sleep(2000);
	
	
}
public static void skill_name(WebDriver driver) throws InterruptedException	

{
	driver.findElement(By.cssSelector("input[placeholder= 'Skills']")).sendKeys("test");

Thread.sleep(2000);

driver.findElements(By.className("mat-option-text")).get(2).click();
Thread.sleep(2000);



}

public static void experience_search(WebDriver driver) throws InterruptedException	

{
	
	driver.findElements(By.className("mat-select-trigger")).get(1).click();
	

	Thread.sleep(2000);
	
	driver.findElements(By.className("mat-option-text")).get(2).click();
	Thread.sleep(2000);

}


public static void dailyrate_search(WebDriver driver) throws InterruptedException	

{
	
	
	
	driver.findElements(By.className("mat-button-wrapper")).get(21).click(); ;  
	
       Thread.sleep(2000);
      
       JavascriptExecutor jse = (JavascriptExecutor)driver;
       jse.executeScript("window.scrollBy(0,200)");
       
		driver.findElement(By.cssSelector("input[placeholder= ' Min daily rate")).clear();
   	
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[placeholder= ' Min daily rate")).sendKeys("10");
	   	
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[placeholder= ' Max daily rate")).clear();
	   	
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[placeholder= ' Max daily rate")).sendKeys("1000");
	   	
		Thread.sleep(3000);
}

public static void advance(WebDriver driver) throws InterruptedException	

{
	driver.findElement(By.xpath("//*[@id=\"mat-tab-content-0-0\"]/div/div/div/app-simple-search-contractors/form/div[4]/a/span")).click();

	Thread.sleep(2000);
}

public static void Availability_search(WebDriver driver) throws InterruptedException	

{
	
	driver.findElement(By.cssSelector("input[placeholder= 'Availability (MM/DD/YYYY)']")).sendKeys("9/17/2020");
	

	Thread.sleep(2000);

}

public static void elgible_search(WebDriver driver) throws InterruptedException	

{
	//driver.findElements(By.className("ng-star-inserted")).get(40).click();
	//Thread.sleep(2000);
	
      driver.findElements(By.className("mat-button-wrapper")).get(23).click();  
      Thread.sleep(2000);
      driver.findElements(By.id("mat-button-toggle-1")).get(0).click();
      Thread.sleep(2000);
      
}

public static void lang_search(WebDriver driver) throws InterruptedException	

{
	WebElement subMenu = driver.findElement(By.cssSelector("input[placeholder= 'Spoken Languages']"));
	subMenu.sendKeys("English");
	Thread.sleep(2000);
	driver.findElement(By.className("mat-option-text")).click();
	Thread.sleep(3000);

}


public static void search_name(WebDriver driver) throws InterruptedException	

{
	List<WebElement> element1 = driver.findElements(By.className("mat-button-wrapper"));
	element1.get(25).click();
	Thread.sleep(2000);

}

public static void login(WebDriver driver) throws InterruptedException

{
	
	Actions actions = new Actions(driver);
	List<WebElement> mainMenu = driver.findElements(By.className("mat-button-wrapper"));
	actions.moveToElement(mainMenu.get(13)).click().perform();;
	Thread.sleep(2000);
	WebElement subMenu = driver.findElement(By.linkText("Contractor SignUp"));
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

public static void first_name(WebDriver driver) throws InterruptedException

{

WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'First Name']"));

element1.sendKeys("madan");	

}

public static void Last_Name(WebDriver driver) throws InterruptedException

{

WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Last Name']"));

element1.sendKeys("reddy");

Thread.sleep(2000);

}

public static void country_code(WebDriver driver) throws InterruptedException

{
WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Country Code']"));

element1.sendKeys("+353");

Thread.sleep(2000);

}

public static void phone_number(WebDriver driver) throws InterruptedException

{
WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Phone Number']"));

element1.sendKeys("9030259238");

Thread.sleep(2000);

}

public static void continent(WebDriver driver) throws InterruptedException

{
WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Country']"));

element1.sendKeys("Ireland");
element1.click();

Thread.sleep(2000);

}

public static void state_name(WebDriver driver) throws InterruptedException

{
WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'State/City']"));

element1.sendKeys("Dublin");

Thread.sleep(2000);

}


public static void Job_Title(WebDriver driver) throws InterruptedException

{
driver.findElement(By.cssSelector("input[placeholder= 'Job Title *']")).sendKeys("test");;


Thread.sleep(2000);

driver.findElements(By.className("mat-option-text")).get(5).click();
Thread.sleep(2000);



}

public static void sector(WebDriver driver) throws InterruptedException

{


driver.findElements(By.className("dropdown-btn")).get(0).click();
Thread.sleep(2000);

driver.findElement(By.xpath("/html/body/app-root/app-signup-contractor-tabs/main/section/div/div[2]/div/form/div/div[2]/div[2]/div/div[5]/div[2]/ng-multiselect-dropdown/div/div[2]/ul[2]/li[5]/div")).click();

Thread.sleep(2000);


}

public static void skill(WebDriver driver) throws InterruptedException

{
	WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Type your skills *']"));

	element1.sendKeys("test");
	
	Thread.sleep(2000);

	driver.findElements(By.className("mat-option-text")).get(6).click();
	
	Thread.sleep(2000);
}

public static void About_me(WebDriver driver) throws InterruptedException

{
WebElement element1 = driver.findElement(By.id("mat-input-21"));

element1.sendKeys("Looking for a challenging role in a reputable organization to utilize my technical, database and management skills for the growth");

	
}



public static void date_of_availability(WebDriver driver) throws InterruptedException


{
JavascriptExecutor jse = (JavascriptExecutor)driver;
jse.executeScript("window.scrollBy(0,400)");

driver.findElement(By.xpath("//*[@id=\"mat-input-28\"]")).click();

Thread.sleep(2000);

driver.findElements(By.className("mat-calendar-body-cell-content")).get(9).click();

Thread.sleep(2000);

}

public static void euro(WebDriver driver) throws InterruptedException


{

driver.findElement(By.cssSelector("input[placeholder= 'Enter your Daily rate']")).sendKeys("10");;

Thread.sleep(2000);

}
public static void year_exp(WebDriver driver) throws InterruptedException


{

driver.findElement(By.xpath("//*[@id=\"mat-select-5\"]/div/div[1]")).click();

Thread.sleep(2000);
driver.findElements(By.className("mat-option-text")).get(2).click();

Thread.sleep(2000);

}


public static void Country_of_interest(WebDriver driver) throws InterruptedException


{
JavascriptExecutor jse = (JavascriptExecutor)driver;
jse.executeScript("window.scrollBy(0,400)");

driver.findElements(By.cssSelector("input[placeholder= 'Country']")).get(1).sendKeys("India");;

Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"mat-option-927\"]/span")).click();

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

WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"mat-input-26\"]"));
subMenu.sendKeys("English");
Thread.sleep(2000);
driver.findElements(By.className("mat-option-text")).get(0).click();
Thread.sleep(3000);
}



public static void certification(WebDriver driver) throws InterruptedException

{
JavascriptExecutor jse = (JavascriptExecutor)driver;
jse.executeScript("window.scrollBy(0,300)");

WebElement element1 = driver.findElement(By.xpath("//*[@id=\"mat-input-27\"]"));

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

JavascriptExecutor jse = (JavascriptExecutor)driver;
jse.executeScript("window.scrollBy(0,500)");

driver.findElements(By.className("mat-button-wrapper")).get(6).click();

Thread.sleep(2000);

}
}

