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

public class tc_10_myaccpersonaldetails {
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
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='userName'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@ng-click=\"Buyer_MblNo_modal_open()\"])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"MobileNumber\"]")).sendKeys("6309765343");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@ng-click=\"DataToggle()\"])[1]")).click();
		driver.findElement(By.linkText("My Account")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@class=\"text-btn\"])[1]")).click();
		Thread.sleep(1000);
		Actions a = new Actions(driver);
		driver.findElement(By.name("FullName")).clear();
		Thread.sleep(1000);
		driver.findElement(By.name("FullName")).sendKeys("vikas");
		  driver.findElement(By.xpath("(//label[@class=\"label-wrapper normal\"])[1]")).click();//right
		  driver.findElement(By.name("EmailID")).clear();
			Thread.sleep(1000);
		  driver.findElement(By.name("EmailID")).sendKeys("vikashvarma94@gmail.com");
		  driver.findElement(By.xpath("(//button[@type=\"button\"])[3]")).click();
		  
		//	assert
			WebElement e = driver.findElement(By.xpath("((//div/table/tbody)[2]/tr)[1]"));
			System.out.println(e.getText());
			Assert.assertTrue(e.getText().contains("vikas"),"details saved successfuly");
		
  }}