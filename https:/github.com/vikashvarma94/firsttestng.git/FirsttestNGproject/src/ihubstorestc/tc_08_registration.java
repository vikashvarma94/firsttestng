package ihubstorestc;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class tc_08_registration {
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
		Thread.sleep(2000);
//		//forced
//		List<WebElement> li = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
//		for(int i = 0; i<5;i++) {
//			li.get(i).click();
//		}
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//input[@type=\"button\"])[2]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//span[@class=\"ng-confirm-btn-text\"]")).click();
//		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='userName'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@ng-click=\"RegisterModal()\"])[1]")).click();//a[@ng-click="Buyer_MblNo_modal_open()"]
		Thread.sleep(2000);
		driver.findElement(By.name("FullName")).sendKeys("vikas");
		  driver.findElement(By.xpath("//label[@for=\"switch_left\"]")).click();//right
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("(//input[@name=\"MobileNumber\"])[2]")).sendKeys("9666262992");	
		  driver.findElement(By.name("EmailID")).sendKeys("vikashvarma94@gmail.com");
		  driver.findElement(By.name("Password")).sendKeys("Store.123");
		  driver.findElement(By.name("ConfirmPassword")).sendKeys("Store.123");
		  driver.findElement(By.xpath("//i[@class=\"check\"]")).click();
		  driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();		  
		  System.out.println(driver.getTitle());
  }}