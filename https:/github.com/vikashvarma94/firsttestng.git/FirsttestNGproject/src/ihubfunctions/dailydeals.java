package ihubfunctions;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dailydeals {
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
	
		driver.findElement(By.linkText("Daily Deals")).click();

		List<WebElement> lc = (List<WebElement>) driver.findElements(By.xpath("//i[@class=\"check\"]"));
		Thread.sleep(500);
		for(int i=2;i<=3;i++) {
			lc.get(i).click();
			Thread.sleep(2000);}
		List<WebElement> items = (List<WebElement>) driver.findElements(By.xpath("//img[@class='product-img']"));
		Thread.sleep(500);
		System.out.println(items.size());
	}}
		