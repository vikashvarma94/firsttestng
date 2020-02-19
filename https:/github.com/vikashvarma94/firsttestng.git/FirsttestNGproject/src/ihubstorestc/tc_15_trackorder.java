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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
public class tc_15_trackorder {
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
		Thread.sleep(2000);
		// Submit
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='userName'])[1]")).click();
		Thread.sleep(2000);
driver.findElement(By.xpath("//div[@id=\"mobile-menu\"]//i[@class=\"fa ion-iphone icn\"]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//form[@name=\"RegForm\"]//input[@name=\"MobileNumber\"]")).sendKeys("9666262992");
Thread.sleep(2000);
driver.findElement(By.xpath("//form[@name=\"RegForm\"]//input[@type=\"submit\"]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@id=\"mobile-menu\"]//span[@class=\"User_Mobile_Dropdown\"]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath(
	"//div[@id=\"mobile-menu\"]//span[@class=\"User_Mobile_Dropdown\"]//a[@ng-click=\"BuyerTrackOrder()\"]"))
	.click();
Thread.sleep(2000);
System.out.println(driver.findElements(By.xpath("(//div/label/i)")).size()==3);

/* MobileNumberTrack
WebElement checkbox = driver.findElement(
	By.xpath("//div[@class=\"col-md-8 col-lg-9\"]//input[@ng-disabled=\"MobileNumberTrack\"]"));
JavascriptExecutor js = (JavascriptExecutor) driver;
js.executeScript("arguments[0].click();", checkbox);
Thread.sleep(2000);
driver.findElement(By.xpath("//ul[@class=\"list-inline\"]//input[@id=\"MobileNo\"]")).sendKeys(Keys.ENTER);
driver.findElement(By.xpath("//ul[@class=\"list-inline\"]//input[@id=\"MobileNo\"]")).sendKeys("6309765343");
Thread.sleep(2000);
driver.findElement(By.xpath("//ul[@class=\"list-inline\"]//input[@value=\"Track\"]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@ng-show=\"TrackOrderDetailsShow\"]//input[@type=\"text\"]"))
	.sendKeys(Keys.ENTER);
driver.findElement(By.xpath("//div[@ng-show=\"TrackOrderDetailsShow\"]//input[@type=\"text\"]"))
	.sendKeys("23084646");
driver.findElement(By.xpath("//div[@ng-show=\"TrackOrderDetailsShow\"]//input[@value=\"Search\"]")).click();
// driver.findElement(By.xpath("//div[@ng-show=\"TrackOrderDetailsShow\"]//input[@value=\"Reset\"]")).click();
Thread.sleep(2000);
// view
driver.findElement(By.xpath("//span[@value=\"Cancel\"]")).click();
// Track
driver.findElement(By.xpath("//button[@title=\"Track Order\"]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath(
	"//div[@ng-show=\"OrderTracking\"]//div[@class=\"modal-dialog\"]//div[@class=\"modal-content\"]//button[@class=\"close\"]"))
	.click();
// Action
Thread.sleep(2000);
driver.findElement(By.xpath("//i[@class=\"fa fa-plus-square\"]")).click();
*/
// OrderIDTrack
WebElement checkbox1 = driver .findElement(By.xpath("//div[@class=\"col-md-8 col-lg-9\"]//input[@ng-disabled=\"OrderIDTrack\"]"));
JavascriptExecutor js1 = (JavascriptExecutor) driver;
js1.executeScript("arguments[0].click();", checkbox1);
driver.findElement(By.xpath("//div[@class=\"col-md-8 col-lg-9\"]//input[@name=\"OrderID\"]")).sendKeys(Keys.ENTER);
driver.findElement(By.xpath("//div[@class=\"col-md-8 col-lg-9\"]//input[@name=\"OrderID\"]")).sendKeys("44287096");
Thread.sleep(2000);
driver.findElement(By.xpath("//ul[@class=\"list-inline\"]//input[@value=\"Track\"]")).click();
// Track
driver.findElement(By.xpath("//button[@title=\"Track Order\"]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@ng-show=\"OrderTracking\"]//div[@class=\"modal-dialog\"]//div[@class=\"modal-content\"]//button[@class=\"close\"]"))
		.click();
// Action
Thread.sleep(2000);
driver.findElement(By.xpath("//i[@class=\"fa fa-plus-square\"]")).click();

  }}
