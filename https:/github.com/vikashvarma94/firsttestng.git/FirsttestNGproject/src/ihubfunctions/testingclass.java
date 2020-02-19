package ihubfunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testingclass {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
      System.setProperty("webdriver.chrome.driver", "/home/vikas/Downloads/chromedriver_linux64"); 	
     // driver.get("http://183.82.123.14/iHubMultiStoresDev");
      driver.get("http://205.147.109.73/iHubMultistoresAdminTRG");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"LoginForm\"]//input[@name=\"userName\"]"))
				.sendKeys("superadmin@ihubstores.in");
		driver.findElement(By.xpath("//div[@class=\"LoginForm\"]//input[@name=\"password\"]")).sendKeys("Store.123");
		// Submit
		driver.findElement(By.xpath("//div[@class=\"LoginForm\"]//button[@ng-click=\"Admin_SignIn('LoginForm')\"]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//header[@class=\"main-header\"]//a[@role=\"button\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//aside[@class=\"main-sidebar\"]//li[@ng-repeat=\"i in  DynamicMenuItems\"][12]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//aside[@class=\"main-sidebar\"]//li[@ng-repeat=\"i in  DynamicMenuItems\"][12]//li[@ng-repeat=\"j in i.SubMenus\"][3]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select[@ng-model=\"LinkTypeID\"]//option[@label=\"About Us Store\"]")).click();
		Thread.sleep(2000);	
		driver.switchTo().frame(0);
		Thread.sleep(2000);	
//	System.out.println(driver.findElement(By.xpath("(//html/body/p)[1]")).getText());
//		Thread.sleep(2000);
		driver.findElement(By.xpath("(//html/body/p)[2]")).clear();
		Thread.sleep(2000);	
		driver.findElement(By.xpath("(//html/body/p)[2]")).sendKeys("Text");
		
  }}

  

