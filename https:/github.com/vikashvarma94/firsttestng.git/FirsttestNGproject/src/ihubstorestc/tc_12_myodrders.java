package ihubstorestc;
import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
public class tc_12_myodrders {
	WebDriver driver;
  @Test
  public void signin() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "/home/vikas/Downloads/chromedriver_linux64"); 	
		
		driver.get("http://164.52.194.143/iHubStoresBeta");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"userName\"]")).sendKeys("Enkoor@Ihubstores.In");
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"password\"]")).sendKeys("Store.123");
		Thread.sleep(2000);
		// Submit
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id=\"mobile-menu\"]//li[@class=\"mobile-dropdown open\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id=\"mobile-menu\"]//i[@class=\"fa ion-iphone icn\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form[@name=\"RegForm\"]//input[@name=\"MobileNumber\"]")).sendKeys("6309765343");//6309765343
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form[@name=\"RegForm\"]//input[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id=\"mobile-menu\"]//span[@class=\"User_Mobile_Dropdown\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id=\"mobile-menu\"]//span[@class=\"User_Mobile_Dropdown\"]//a[@ng-click=\"Buyer_Order_Details()\"]")).click();
		driver.findElement(By.xpath("//div[@id=\"datePicker\"]//input[@type=\"text\"]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id=\"datePicker\"]//input[@type=\"text\"]")).sendKeys("23084646");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@class=\"search-btn\"]//input[@type=\"button\"][1]")).click();
		// view invoice
		WebElement checkbox = driver.findElement(By.xpath("//td[@title=\"View Invoice\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", checkbox);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"box-container\"]//span[contains(text(),'Back')]")).click();
		Thread.sleep(2000);
		/*Payment details
		driver.findElement(By.xpath("//i[@class=\"fa fa-plus-square\"]")).click();
		*/
		//date
		driver.findElement(By.xpath("(//input[@type=\"date\"])[1]")).sendKeys("28/08/2019");
		//view
		driver.findElement(By.xpath("//a[@class=\"btn btn-xs btn-success font-md\"]")).click();
		Thread.sleep(2000);
		//Cancel
		driver.findElement(By.xpath("//span[@style=\"margin-left:20px;color:red;cursor:pointer;\"]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[@class='btn btn-red']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-theme']")).click();
				
				
		
  }}
		