package ihub;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class pooja {
	WebDriver driver;
	@BeforeTest
	public void beforetest() throws InterruptedException {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "/home/vikas/Downloads/chromedriver_linux64");
		driver.get("http://205.147.109.73/iHubDirectUAT");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@placeholder=\"search\"]")).sendKeys("hyderabad");
		Actions a = new Actions(driver);
		a.sendKeys(Keys.ENTER).perform();
		Thread.sleep(500);
	}
  @Test (priority=1)
  public void clothing() throws InterruptedException {
	  Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//p[@class=\"no-margin\"]"))).perform();
		a.moveToElement(driver.findElement(By.linkText("Pooja"))).perform();
		driver.findElement(By.linkText("Agarbatti & Dhoopsticks")).click();
//		Agarbatti & Dhoopsticks
//		Haldi,Kumkum & Chandan
//		Cotton Wicks&Kankans
//		Camphor
//		Pooja Items
//		Diyas
//		Bells
//		Panchapatra
//		Pooja Thali
//		Aarti Holders
//		Agarbatti And Doop Stick Holders
//		Idols and Frames
//		Prayer Mats
//		Mandirs
//		Chowki
//		Havan Samagri
//		Books
//		Torans & Garlands
//		Fancy Haldi Kumkum  Holders & Packets
//		Pooja Oil&Ghee
//		Car Hangings & DashBoards
		Thread.sleep(500);
		
		Select s = new Select(driver.findElement(By.xpath("//select[@ng-model=\"filterProductsSort\"]")));
		s.selectByVisibleText("Discount");
		Thread.sleep(500);
		List<WebElement> li = (List<WebElement>) driver.findElements(By.xpath("//i[@class=\"check\"]"));
		Thread.sleep(500);
		for(int i=0;i<=li.size();i++) {
			li.get(i).click();
			Thread.sleep(1000);
			}		  
  }
}




