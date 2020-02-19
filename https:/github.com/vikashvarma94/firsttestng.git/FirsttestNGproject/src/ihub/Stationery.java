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

public class Stationery {
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
	public void extra() throws InterruptedException {
	  Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//p[@class=\"no-margin\"]"))).perform();
		a.moveToElement(driver.findElement(By.linkText("Stationery"))).perform();
		driver.findElement(By.linkText("Fancy Stationery")).click();
//		Fancy Stationery
		
		Thread.sleep(500);
		List<WebElement> lb = (List<WebElement>) driver.findElements(By.xpath("//div[@class='shopnow-btn']"));
		for(int v=0;v<lb.size();v++) {//123..
		lb.get(v).click();
		Thread.sleep(1000);
		Select s = new Select(driver.findElement(By.xpath("//select[@ng-model=\"filterProductsSort\"]")));
		s.selectByVisibleText("Discount");
		Thread.sleep(500);
		List<WebElement> lc = (List<WebElement>) driver.findElements(By.xpath("//i[@class=\"check\"]"));
		Thread.sleep(500);
		for(int i=0;i<=2;i++) {
			lc.get(i).click();
			Thread.sleep(1000);}
			driver.navigate().back();
			Thread.sleep(1000);
		}
  }
	@Test (priority=0)
	public void normal() throws InterruptedException {
	  Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//p[@class=\"no-margin\"]"))).perform();
		a.moveToElement(driver.findElement(By.linkText("Stationery"))).perform();
		driver.findElement(By.linkText("NoteBooks")).click();
//		NoteBooks
//		Pens
//		Pencils Erasers & Sharpeners
//		Pencil Boxes & Geometry Boxes
//		Boards & Markers
//		Glue Gum & Tapes
//		Children Books
//		Educational Charts & Maps
//		Files & Folders
//		Envelopes
//		Papers & Paper Products
//		Staplers ,Scissors & Paper Punches
//		Art & Colours
//		Accessories
//		Diaries & Spiral Books
//		Desk Organisers
		
		Thread.sleep(1000);
		Select s = new Select(driver.findElement(By.xpath("//select[@ng-model=\"filterProductsSort\"]")));
		s.selectByVisibleText("Discount");
		Thread.sleep(500);
		List<WebElement> lc = (List<WebElement>) driver.findElements(By.xpath("//i[@class=\"check\"]"));
		Thread.sleep(500);
		for(int i=0;i<=2;i++) {
			lc.get(i).click();
			Thread.sleep(1000);
		}
  }
}