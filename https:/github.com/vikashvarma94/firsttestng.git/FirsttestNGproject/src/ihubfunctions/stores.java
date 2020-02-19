package ihubfunctions;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class stores {
	 WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	 
	  WebDriver driver = new ChromeDriver();
      System.setProperty("webdriver.chrome.driver", "/home/vikas/Downloads/chromedriver_linux64"); 	
		driver.get("http://205.147.109.73/iHubMultistoresStoreTRG");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"userName\"]")).sendKeys("Enkoor@Ihubstores.In");
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"password\"]")).sendKeys("Store.123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		//assert
		Assert.assertEquals(driver.getTitle(), "iHubMultiStores");
		
		
		 
		 String Mainwindow = driver.getWindowHandle();
		 java.util.Set<String> s1 = driver.getWindowHandles();
		 java.util.Iterator<String> i1 = s1.iterator();
		 while(i1.hasNext())			
	        {		
	            String ChildWindow=i1.next();		
	            		
	            if(!Mainwindow.equalsIgnoreCase(ChildWindow))			
	            {    	
	                    driver.switchTo().window(ChildWindow);	                                                                                                           
	                         			
	                    driver.findElement(By.xpath("//button[@class=\"btn buy-btn\"]")).click();}}
  }

}
