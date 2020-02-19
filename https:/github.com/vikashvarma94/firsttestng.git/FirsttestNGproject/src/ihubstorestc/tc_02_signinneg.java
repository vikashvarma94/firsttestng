package ihubstorestc;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tc_02_signinneg {
	public static WebDriver driver;
	@BeforeTest
	public void setup() {
		  
			System.setProperty("webdriver.chrome.driver", "/home/vikas/Downloads/chromedriver_linux64");
			 driver = new ChromeDriver();
	}
	
  @Test
  public void login() throws InterruptedException {
//	  driver = new ChromeDriver();
//		System.setProperty("webdriver.chrome.driver", "/home/vikas/Drivers/chromedriver_linux64"); 	
	
		driver.get("http://164.52.194.143/iHubStoresBeta");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"userName\"]")).sendKeys("Enkoor@Ihubstores.In");
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"password\"]")).sendKeys("123");
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "iHubMultiStores","Invalid credentials");	
		
  }
 
  
  
}