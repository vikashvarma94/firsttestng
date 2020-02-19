package ihubfunctions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Requestproduct {
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
	@Test (priority=0)
	public void extra() throws InterruptedException {
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Request Product")).click();
		driver.findElement(By.name("CustomerName")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@name='MobileNumber'])[3]")).sendKeys("9123456789");
		driver.findElement(By.name("ProductName")).sendKeys("abc");
		driver.findElement(By.name("RequestedQunatity")).sendKeys("5");
		driver.findElement(By.name("Specifications")).sendKeys("abc");
		driver.findElement(By.xpath("(//button[@id=\"submit\"])[2]")).click();
	}	
}