package ihubstorestc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class tc_14_mywallet {
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
			driver.findElement(By.xpath("(//span[@class='userName'])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id=\"mobile-menu\"]//i[@class=\"fa ion-iphone icn\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//form[@name=\"RegForm\"]//input[@name=\"MobileNumber\"]")).sendKeys("9666262992");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//form[@name=\"RegForm\"]//input[@type=\"submit\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@id=\"mobile-menu\"]//span[@class=\"User_Mobile_Dropdown\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@ng-click=\"Buyer_Wallet_Details()\"]")).click();
			Thread.sleep(2000);
		//	Boolean total = driver.findElements(By.xpath("(//div/ul/li/a)[18]")).size()!=0;
			System.out.print(driver.findElements(By.xpath("(//div/ul/li/a)[18]")).size()!=0);
			driver.close();
	  }
	  }