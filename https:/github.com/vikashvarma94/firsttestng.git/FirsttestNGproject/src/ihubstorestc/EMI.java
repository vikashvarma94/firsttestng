package ihubstorestc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EMI {
	WebDriver driver;
	@BeforeTest
	public void beforetest() {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "/home/vikas/Downloads/chromedriver_linux64");}
  @Test
  public void price() throws InterruptedException {
	  driver.get("http://183.82.123.14/iHubMultiStoresDev");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"userName\"]"))
				.sendKeys("Enkoor@Ihubstores.In");
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"password\"]")).sendKeys("Store.123");
		Thread.sleep(2000);
		// Submit
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		// EMi approval
		driver.findElement(By.xpath(
				"//div[@id=\"mobile-menu\"]//a[@ng-click=\"UserMenu()\"]")).click();
		Thread.sleep(3000);
		WebElement checkbox0 = driver.findElement(By.xpath("//div[@id=\"mobile-menu\"]//a[@ng-click=\"EMIconfig()\"]"));
		JavascriptExecutor js0 = (JavascriptExecutor) driver;
		js0.executeScript("arguments[0].click();", checkbox0);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id=\"mobile-menu\"]//a[@ng-click=\"EMIconfig()\"]")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		// Create EMI Approval Request
		WebElement checkbox = driver.findElement(
				By.xpath("//div[@class=\"box-container\"]//input[@value=\"Create EMI Approval Request\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", checkbox);
		driver.findElement(By.xpath(
				"//div[@class=\"modal-content\"]//form[@name=\"BuyerEMIsettingsForm\"]//input[@name=\"MobileNumber\"]"))
				.sendKeys("6309765343");
		driver.findElement(
				By.xpath("//div[@class=\"modal-content\"]//form[@name=\"BuyerEMIsettingsForm\"]//input[@id=\"Min\"]"))
				.sendKeys("0");
		driver.findElement(
				By.xpath("//div[@class=\"modal-content\"]//form[@name=\"BuyerEMIsettingsForm\"]//input[@id=\"Max\"]"))
				.sendKeys("2");
		driver.findElement(By.xpath(
				"//div[@class=\"modal-content\"]//form[@name=\"BuyerEMIsettingsForm\"]//select[@name=\"SelectTenure\"]//option[@value=\"number:2\"]"))
				.click();
		driver.findElement(By.xpath(
				"//div[@class=\"modal-content\"]//form[@name=\"BuyerEMIsettingsForm\"]//textarea[@name=\"Description\"]"))
				.sendKeys("Testing");
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//div[@class=\"modal-content\"]//button[@ng-click=\"Save_EMIdetails('BuyerEMIsettingsForm')\"]"))
				.click();
		// driver.findElement(By.xpath("//div[@class=\"modal-content\"]//div[@class=\"modal-footer\"]//button[@class=\"btn
		// btn-light btn-block\"]")).click();
		// Mobile number
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"box-container\"]//input[@name=\"MobileNumber\"]"))
				.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@class=\"box-container\"]//input[@name=\"MobileNumber\"]"))
				.sendKeys("6309765343");
		driver.findElement(By.xpath("//div[@class=\"box-container\"]//input[@ng-click=\"SearchEMIRequest()\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id=\"mobile-menu\"]//a[@ng-click=\"UserMenu()\"]")).click();
		Thread.sleep(2000);
		WebElement checkbox11 = driver.findElement(By.xpath("//*[@id=\"mobile-menu\"]/ul/li/span/ul/li[8]/a"));
		JavascriptExecutor js11 = (JavascriptExecutor) driver;
		js11.executeScript("arguments[0].click();", checkbox11);
		// EMI Admin
		driver.get("http://205.147.109.73/iHubMultistoresAdminTRG");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name=\"userName\"]")).sendKeys("emiadmin@Ihubstores.In");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Store.123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@ng-click=\"Admin_SignIn('LoginForm')\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@role=\"button\"]")).click();
		Thread.sleep(2000);
		// EMI approval request
		driver.findElement(By.xpath("//li[@ng-repeat=\"i in  DynamicMenuItems\"][3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"MobileNo\"]")).sendKeys("6309765343");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@title=\"Search\"]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@id=\"btnReset\"]")).click();
		driver.findElement(By.xpath("//span[@title=\"Edit\"]")).click();
		Thread.sleep(2000);
		// Tenure
		Select s = new Select(
				driver.findElement(By.xpath("//select[@ng-change=\"ChangeChildOffer(OfferSubChildID)\"]")));
		s.selectByValue("number:1");
		// min
		driver.findElement(By.xpath("//input[@name=\"min\"]")).clear();
		driver.findElement(By.xpath("//input[@name=\"min\"]")).sendKeys("1");
		// max
		driver.findElement(By.xpath("//input[@name=\"max\"]")).clear();
		driver.findElement(By.xpath("//input[@name=\"max\"]")).sendKeys("2");
		// Expire Time
		Select s1 = new Select(driver.findElement(By.xpath("//select[@ng-model=\"editList.Approved_Time_Limit\"]")));
		s1.selectByValue("number:6");
		Select s2 = new Select(driver.findElement(By.xpath("//select[@ng-model=\"editList.EMI_Config_Status\"]")));
		Thread.sleep(2000);
		s2.selectByValue("20");
		driver.findElement(By.xpath("//input[@value=\"Submit\"]")).click();
		// driver.findElement(By.xpath("//input[@value=\"Cancel\"]")).click();
		driver.findElement(By.xpath("//li[@class=\"dropdown user user-menu\"]")).click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//div[@ng-click=\"ChangePassword()\"]")).click();
		driver.findElement(By.xpath("//div[@ng-click=\"SignOut()\"]")).click();
		// Admin
		driver.get("http://183.82.123.14/iHubMultiStoresAdminDev");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"LoginForm\"]//input[@name=\"userName\"]"))
				.sendKeys("superadmin@ihubstores.in");
		driver.findElement(By.xpath("//div[@class=\"LoginForm\"]//input[@name=\"password\"]")).sendKeys("Store.123");
		// Submit
		driver.findElement(By.xpath("//div[@class=\"LoginForm\"]//button[@ng-click=\"Admin_SignIn('LoginForm')\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//header[@class=\"main-header\"]//a[@role=\"button\"]")).click();
		Thread.sleep(2000);
		// EMi Orders(Order Management)
		driver.findElement(By.xpath("//li[@ng-repeat=\"i in  DynamicMenuItems\"][9]")).click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//li[@ng-repeat=\"i in  DynamicMenuItems\"][9]//li[@ng-repeat=\"j in i.SubMenus\"][10]"))
				.click();
		driver.findElement(By.xpath("//input[@ng-model=\"OrderID\"]")).sendKeys("41398624");
		driver.findElement(By.xpath("//input[@ng-model=\"MobileNumber\"]")).sendKeys("9182506505");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@title=\"SearchOrders\"]")).click();
		// driver.findElement(By.xpath("//input[@id=\"btnReset\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@title=\"EMI Details\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id=\"myModal\"]//button[@type=\"button\"]")).click();
		Thread.sleep(2000);
		// signout
		driver.findElement(By.xpath("//div[@class=\"navbar-custom-menu\"]//li[@class=\"dropdown user user-menu\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"navbar-custom-menu\"]//div[@ng-click=\"SignOut()\"]")).click();
		Thread.sleep(2000);
		driver.close();
		// EMI Slab configure(Masters)
		driver.findElement(By.xpath("//li[@ng-repeat=\"i in  DynamicMenuItems\"][3]")).click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//li[@ng-repeat=\"i in  DynamicMenuItems\"][3]//li[@ng-repeat=\"j in i.SubMenus\"][7]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//div[@ng-controller=\"iH_Emi_Slab_Configuration_Controller\"]//input[@value=\"Save\"]"))
				.click();
		Thread.sleep(2000);
		// signout
		driver.findElement(By.xpath("//div[@class=\"navbar-custom-menu\"]//li[@class=\"dropdown user user-menu\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"navbar-custom-menu\"]//div[@ng-click=\"SignOut()\"]")).click();
		Thread.sleep(2000);
		driver.close();
  }
}
