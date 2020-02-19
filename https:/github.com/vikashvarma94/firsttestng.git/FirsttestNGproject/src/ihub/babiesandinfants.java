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

public class babiesandinfants {
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
		a.moveToElement(driver.findElement(By.linkText("Babies And Infants"))).perform();
		driver.findElement(By.linkText("Clothing")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//div[@class=\"shopnow-btn\"])[1]")).click();//add increment froc
		Thread.sleep(1000);
		Select s = new Select(driver.findElement(By.xpath("//select[@ng-model=\"filterProductsSort\"]")));
		s.selectByVisibleText("Discount");
		Thread.sleep(500);
		List<WebElement> li = (List<WebElement>) driver.findElements(By.xpath("//i[@class=\"check\"]"));
		Thread.sleep(500);
		for(int i=0;i<=2;i++) {
			li.get(i).click();
			Thread.sleep(1000);
			}		  
  }
  
  @Test(priority=2)
  public void babygiftset() throws InterruptedException {
	  Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//p[@class=\"no-margin\"]"))).perform();
		a.moveToElement(driver.findElement(By.linkText("Babies And Infants"))).perform();
		driver.findElement(By.linkText("Baby Gift Sets")).click();
		Thread.sleep(1000);
		Select s = new Select(driver.findElement(By.xpath("//select[@ng-model=\"filterProductsSort\"]")));
		s.selectByVisibleText("Discount");
		Thread.sleep(500);
		List<WebElement> li = (List<WebElement>) driver.findElements(By.xpath("//i[@class=\"check\"]"));
		Thread.sleep(500);
		for(int i=0;i<=2;i++) {
			li.get(i).click();
			Thread.sleep(1000);
			}		  
  }
  @Test(priority=3)
  public void feeding() throws InterruptedException {
	  Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//p[@class=\"no-margin\"]"))).perform();
		a.moveToElement(driver.findElement(By.linkText("Babies And Infants"))).perform();
		driver.findElement(By.linkText("Feeding & Nursing")).click();
		Thread.sleep(500);
		Select s = new Select(driver.findElement(By.xpath("//select[@ng-model=\"filterProductsSort\"]")));
		s.selectByVisibleText("Discount");
		Thread.sleep(500);
		List<WebElement> li = (List<WebElement>) driver.findElements(By.xpath("//i[@class=\"check\"]"));
		Thread.sleep(500);
		for(int i=0;i<=2;i++) {
			li.get(i).click();
			Thread.sleep(1000);
			}		  
  }
  @Test(priority=4)
  public void Footwear() throws InterruptedException {
	  Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//p[@class=\"no-margin\"]"))).perform();
		a.moveToElement(driver.findElement(By.linkText("Babies And Infants"))).perform();
		driver.findElement(By.linkText("Footwear")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//div[@class=\"shopnow-btn\"])[1]")).click();//add increment froc
		Thread.sleep(1000);
		Select s = new Select(driver.findElement(By.xpath("//select[@ng-model=\"filterProductsSort\"]")));
		s.selectByVisibleText("Discount");
		Thread.sleep(500);
		List<WebElement> li = (List<WebElement>) driver.findElements(By.xpath("//i[@class=\"check\"]"));
		Thread.sleep(500);
		for(int i=0;i<=2;i++) {
			li.get(i).click();
			Thread.sleep(1000);
			}		  
  }
  @Test(priority=5)
  public void grooming() throws InterruptedException {
	  Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//p[@class=\"no-margin\"]"))).perform();
		a.moveToElement(driver.findElement(By.linkText("Babies And Infants"))).perform();
		driver.findElement(By.linkText("Baby Grooming")).click();
		Thread.sleep(500);
		Select s = new Select(driver.findElement(By.xpath("//select[@ng-model=\"filterProductsSort\"]")));
		s.selectByVisibleText("Discount");
		Thread.sleep(500);
		List<WebElement> li = (List<WebElement>) driver.findElements(By.xpath("//i[@class=\"check\"]"));
		Thread.sleep(500);
		for(int i=0;i<=2;i++) {
			li.get(i).click();
			Thread.sleep(1000);
			}		  
  }
  @Test(priority=6)
  public void bathandskin() throws InterruptedException {
	  Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//p[@class=\"no-margin\"]"))).perform();
		a.moveToElement(driver.findElement(By.linkText("Babies And Infants"))).perform();
		driver.findElement(By.linkText("Bath and Skin Care")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//div[@class=\"shopnow-btn\"])[1]")).click();//add increment froc
		Thread.sleep(1000);
		Select s = new Select(driver.findElement(By.xpath("//select[@ng-model=\"filterProductsSort\"]")));
		s.selectByVisibleText("Discount");
		Thread.sleep(500);
		List<WebElement> li = (List<WebElement>) driver.findElements(By.xpath("//i[@class=\"check\"]"));
		Thread.sleep(500);
		for(int i=0;i<=2;i++) {
			li.get(i).click();
			Thread.sleep(1000);
			}		  
  }
  @Test(priority=7)
  public void Accessories() throws InterruptedException {
	  Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//p[@class=\"no-margin\"]"))).perform();
		a.moveToElement(driver.findElement(By.linkText("Babies And Infants"))).perform();
		driver.findElement(By.linkText("Accessories")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//div[@class=\"shopnow-btn\"])[1]")).click();//add increment froc
		Thread.sleep(1000);
		Select s = new Select(driver.findElement(By.xpath("//select[@ng-model=\"filterProductsSort\"]")));
		s.selectByVisibleText("Discount");
		Thread.sleep(500);
		List<WebElement> li = (List<WebElement>) driver.findElements(By.xpath("//i[@class=\"check\"]"));
		Thread.sleep(500);
		for(int i=0;i<=2;i++) {
			li.get(i).click();
			Thread.sleep(1000);
			}		  
  }
  @Test(priority=8)
  public void BabyNeeds() throws InterruptedException {
	  Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//p[@class=\"no-margin\"]"))).perform();
		a.moveToElement(driver.findElement(By.linkText("Babies And Infants"))).perform();
		driver.findElement(By.linkText("Baby Needs")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//div[@class=\"shopnow-btn\"])[1]")).click();//add increment froc
		Thread.sleep(1000);
		Select s = new Select(driver.findElement(By.xpath("//select[@ng-model=\"filterProductsSort\"]")));
		s.selectByVisibleText("Discount");
		Thread.sleep(500);
		List<WebElement> li = (List<WebElement>) driver.findElements(By.xpath("//i[@class=\"check\"]"));
		Thread.sleep(500);
		for(int i=0;i<=2;i++) {
			li.get(i).click();
			Thread.sleep(1000);
			}		  
  }
  @Test(priority=9)
  public void health() throws InterruptedException {
	  Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//p[@class=\"no-margin\"]"))).perform();
		a.moveToElement(driver.findElement(By.linkText("Babies And Infants"))).perform();
		driver.findElement(By.linkText("Health & Safety")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//div[@class=\"shopnow-btn\"])[1]")).click();//add increment froc
		Thread.sleep(1000);
		Select s = new Select(driver.findElement(By.xpath("//select[@ng-model=\"filterProductsSort\"]")));
		s.selectByVisibleText("Discount");
		Thread.sleep(500);
		List<WebElement> li = (List<WebElement>) driver.findElements(By.xpath("//i[@class=\"check\"]"));
		Thread.sleep(500);
		for(int i=0;i<=2;i++) {
			li.get(i).click();
			Thread.sleep(1000);
			}		  
  }
}
