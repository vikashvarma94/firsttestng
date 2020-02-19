package ihubfunctions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class alllinks {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
										
	          String homepage = "http://192.168.7.5/iHubstoressqlQA";		
	          WebDriver driver = new ChromeDriver();
	          System.setProperty("webdriver.chrome.driver", "/home/vikas/Downloads/chromedriver_linux64"); 				
	 		
	          String underConsTitle = "Under Construction: Mercury Tours";					
	          driver.get(homepage);
	    
	  		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  		driver.manage().window().maximize();
	  		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"userName\"]")).sendKeys("Enkoor@Ihubstores.In");
	  		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"password\"]")).sendKeys("Store.123");
	  		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();
	  		Thread.sleep(2000);
	  		Assert.assertEquals(driver.getTitle(), "iHubMultiStores");
	  		
				Thread.sleep(1000);				
	          List<WebElement> linkElements = driver.findElements(By.tagName("a"));							
	          String[] linkTexts = new String[linkElements.size()];							
	  			int	i = 0;					
	
	  			for (WebElement e : linkElements) {							
	  			linkTexts[i] = e.getText();							
	  			i++;			
	          }		

	  			//test each link		
	  			for (String t : linkTexts) {							
	  			driver.findElement(By.linkText(t)).click();					
	  			if (driver.getTitle().equals(underConsTitle)) {							
	                  System.out.println("\"" + t + "\""								
	                          + " is under construction.");			
	              } else {			
	                  System.out.println("\"" + t + "\""								
	                          + " is working.");			
	              }		
	  			driver.navigate().back();			
	          }		
	  			driver.quit();			
	      }		
  }
  


