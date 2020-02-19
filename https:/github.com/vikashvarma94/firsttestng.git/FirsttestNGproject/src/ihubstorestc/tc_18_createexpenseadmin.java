package ihubstorestc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class tc_18_createexpenseadmin {
	WebDriver driver;
	  @Test
	  public void signin() throws InterruptedException {
		  WebDriver driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "/home/vikas/Downloads/chromedriver_linux64"); 	
			
			driver.get("http://183.82.123.14/iHubMultiStoresDev");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"userName\"]")).sendKeys("Enkoor@Ihubstores.In");
			driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"password\"]")).sendKeys("Store.123");
			Thread.sleep(2000);
			// Submit
			driver.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();
			Thread.sleep(2000);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement checkbox = driver.findElement(By.xpath("//div[@id=\"mobile-menu\"]//a[@ng-click=\"UserMenu()\"]"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", checkbox);
			Thread.sleep(2000);
			WebElement checkbox0 = driver.findElement(By.xpath("//div[@id=\"mobile-menu\"]//a[@ng-click=\"ManageExpenses()\"]"));
			JavascriptExecutor js0 = (JavascriptExecutor) driver;
			js0.executeScript("arguments[0].click();", checkbox0);
			Thread.sleep(2000);
			
			
			  WebElement checkbox1 = driver .findElement(By.xpath("//div[@class=\"content-wrapper\"]//input[@value=\"Create New\"]"));
			  JavascriptExecutor js1 = (JavascriptExecutor) driver;
			  js1.executeScript("arguments[0].click();", checkbox1); Thread.sleep(2000);
			  driver.findElement(By.xpath("//div[@class=\"modal-content\"]//select[@name=\"MasterName\"]//option[@label=\"Special Discounts\"]")).click(); 
			  driver.findElement(By.xpath("//div[@class=\"modal-content\"]//input[@name=\"AmountSpent\"]")).sendKeys("500"); 
			  driver.findElement(By.xpath("//div[@class=\"modal-content\"]//textarea[@name=\"Description\"]")).sendKeys("Testing"); 
			  driver.findElement(By.xpath("//div[@class=\"modal-content\"]//input[@value=\"1\"]")).click();
			  //driver.findElement(By.xpath("//div[@class=\"modal-content\"]//input[@value=\"2\"]")).click();
			  driver.findElement(By.xpath("//div[@class=\"modal-content\"]//div[@ng-show=\"BillIssue==1\"]//input[@id=\"checkfileOne\"]")).sendKeys("/home/vikas/Downloads/IMG_20190115_173630.jpg");
			  driver.findElement(By.xpath("//div[@class=\"modal-content\"]//button[@ng-click=\"Save_Expense('CreateNewExpenseForm')\"]")).click();
			  
			  JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("window.open()");
			  
				String Mainwindow = driver.getWindowHandle();
				java.util.Set<String> s1 = driver.getWindowHandles();
				java.util.Iterator<String> i1 = s1.iterator();
				while(i1.hasNext()) { 
				String ChildWindow=i1.next();
				if(!Mainwindow.equalsIgnoreCase(ChildWindow)) 
				{ 
				driver.switchTo().window(ChildWindow);}}

				driver.get("http://183.82.123.14/iHubMultiStoresAdminDev");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("superadmin@Ihubstores.In");
				driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Store.123");
				driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
				Thread.sleep(2000);
				//Assert.assertEquals(driver.getTitle(), "iHubMultiStoresAdmin");
				driver.findElement(By.xpath("//a[@class=\"sidebar-toggle\"]")).click();
				 driver.findElement(By.xpath("//a[@class=\"sidebar-toggle\"]")).click();
					driver.findElement(By.linkText("Account Management")).click();
					driver.findElement(By.xpath("(//li/ul/li/a/i)[62]")).click();
					Thread.sleep(2000);
					String at = driver.findElement(By.xpath("(//div/table/tbody/tr/td)[7]")).getText();//change
					Assert.assertTrue(at.equalsIgnoreCase("Enkoor Store"));
}	  
	  }