package ihubfunctions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class addtocart {
	WebDriver driver;	
	
/* @BeforeTest
	public void beforetest() {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "/home/vikas/Downloads/chromedriver_linux64");
		driver.get("http://205.147.109.73/iHubDirectUAT");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@placeholder=\"search\"]")).sendKeys("hyderabad");
		Actions a = new Actions(driver);
		a.sendKeys(Keys.ENTER).perform();
	}*/
 @Test
 	public void add() throws InterruptedException, IOException {
//	 driver.findElement(By.id("myInput")).sendKeys("watches");
//	 Actions a = new Actions(driver);
//	 a.sendKeys(Keys.ENTER).perform();
	 Thread.sleep(500);
	 driver.findElement(By.xpath("(//button[@class='btn buy-btn'])[1]")).click();//add to cart
	 Thread.sleep(500);	 
	 driver.findElement(By.xpath("//span[@class=\"badge\"]")).click();
	 Thread.sleep(500);
	 driver.findElement(By.xpath("//button[@class=\"checkout-btn btn btn-prime btn-block\"]")).click();
	 Thread.sleep(500);
	 driver.findElement(By.xpath("(//input[@placeholder=\"Mobile Number\"])[4]")).sendKeys("9666262992");
	 driver.findElement(By.name("password")).sendKeys("Store.123");
	 driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//button[@class=\"checkout-btn btn btn-prime btn-block\"]")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("(//label[@class='label-wrapper'])[2]")).click(); 
	 Thread.sleep(2000);
	// driver.findElement(By.xpath("//div[@class=\"add-new-address\"]")).click();
	 driver.findElement(By.xpath("//button[@class=\"checkout-btn btn btn-prime btn-block\"]")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.name("billName")).sendKeys("abc");
	 driver.findElement(By.name("billAddress")).sendKeys("abc");
	 driver.findElement(By.name("billZip")).sendKeys("123");
	 driver.findElement(By.name("billState")).sendKeys("abc");
	 driver.findElement(By.name("billTel")).sendKeys("966626299");
	 driver.findElement(By.name("billCity")).sendKeys("abc"); 
	 driver.findElement(By.name("billEmail")).sendKeys("abc@gmail.com");
	 driver.findElement(By.name("notesValue")).sendKeys("abc");
	 Select s1 = new Select(driver.findElement(By.name("billCountry")));
	 s1.selectByVisibleText("India");
	 Select s2 = new Select(driver.findElement(By.name("netBankingBank")));
	 s2.selectByVisibleText("AvenuesTest");
	driver.findElement(By.xpath("(//span[@class=\"primary-button-text\"])[4]")).click();
	Thread.sleep(1000);
	File scren = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scren,new File("/home/vikas/scr.png"));
 }
	 
}
