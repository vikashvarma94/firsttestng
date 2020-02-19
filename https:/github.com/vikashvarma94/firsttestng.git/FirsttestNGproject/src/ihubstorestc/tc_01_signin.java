package ihubstorestc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tc_01_signin  {
	public static WebDriver driver;
	@BeforeTest
	public void setup() {	
		  driver = new ChromeDriver();  
		  System.setProperty("webdriver.chrome.driver", "/home/vikas/Downloads/chromedriver_linux64");	 
	}
  @Test//(invocationCount=2,threadPoolSize=2)
  public void signin() throws InterruptedException {

		driver.get("http://164.52.194.143/iHubStoresBeta");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"userName\"]")).sendKeys("Enkoor@Ihubstores.In");
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"password\"]")).sendKeys("Store.123");
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "iHubMultiStores");
	
//		Actions a = new Actions(driver);
//		a.sendKeys(Keys.CONTROL+"2").perform();
//		driver.findElement(By.tagName("body")).sendKeys(Keys.CONTROL+"t");
//		Thread.sleep(2000);
//		driver.get("http://183.82.123.14/iHubMultiStoresadminDev");	
  }
  @AfterTest
  public void quit() {
	  driver.quit();
  }
}