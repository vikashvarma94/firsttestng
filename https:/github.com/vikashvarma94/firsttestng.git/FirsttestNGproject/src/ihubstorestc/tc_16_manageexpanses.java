package ihubstorestc;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class tc_16_manageexpanses {
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
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement checkbox = driver.findElement(By.xpath("//div[@id=\"mobile-menu\"]//a[@ng-click=\"UserMenu()\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", checkbox);
		Thread.sleep(2000);
		WebElement checkbox0 = driver.findElement(By.xpath("//div[@id=\"mobile-menu\"]//a[@ng-click=\"ManageExpenses()\"]"));
		JavascriptExecutor js0 = (JavascriptExecutor) driver;
		js0.executeScript("arguments[0].click();", checkbox0);
		Thread.sleep(2000);
		/*
		 * create new
		 * WebElement checkbox = driver .findElement(By.
		 * xpath("//div[@class=\"content-wrapper\"]//input[@value=\"Create New\"]"));
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("arguments[0].click();", checkbox); Thread.sleep(2000);
		 * driver.findElement(By.
		 * xpath("//div[@class=\"modal-content\"]//select[@name=\"MasterName\"]//option[@label=\"Special Discounts\"]"
		 * )).click(); driver.findElement(By.xpath(
		 * "//div[@class=\"modal-content\"]//input[@name=\"AmountSpent\"]")).sendKeys(
		 * "500"); driver.findElement(By.xpath(
		 * "//div[@class=\"modal-content\"]//textarea[@name=\"Description\"]")).sendKeys
		 * ("Testing"); driver.findElement(By.xpath(
		 * "//div[@class=\"modal-content\"]//input[@value=\"1\"]")).click();
		 * //driver.findElement(By.xpath(
		 * "//div[@class=\"modal-content\"]//input[@value=\"2\"]")).click();
		 * driver.findElement(By.xpath(
		 * "//div[@class=\"modal-content\"]//div[@ng-show=\"BillIssue==1\"]//input[@id=\"checkfileOne\"]"
		 * )).sendKeys("//home//anusha//Desktop//download.jpeg");
		 * driver.findElement(By.xpath(
		 * "//div[@class=\"modal-content\"]//button[@ng-click=\"Save_Expense('CreateNewExpenseForm')\"]"
		 * )).click();
	*/
		  Thread.sleep(2000);
		   driver.findElement(By.xpath("//div[@class=\"content-wrapper\"]//select[@name=\"Status\"]")).click();
		 driver.findElement( By.xpath("//div[@class=\"content-wrapper\"]//select[@name=\"Status\"]//option[@value=\"10\"]")).click();
		 driver.findElement(By.xpath("//div[@class=\"content-wrapper\"]//div[@class=\"input-group input-append date\"]//select[@name=\"MasterName\"]//option[@label=\"Special Discounts\"]")).click();
		 driver.findElement(By.xpath("//div[@class=\"content-wrapper\"]//input[@value=\"Search\"]")).click();
		 // View image
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//i[@ng-click=\"DisplayImage(i.Expenses_ID)\"]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//span[contains(text(),'ok')]")).click();
  }}