package ihubts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	WebDriver driver;
	@BeforeTest
	public void beforetest() {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "/home/vikas/Downloads/chromedriver_linux64");}
  @Test
  public void f() throws InterruptedException {
	
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
		// Bulk Order
		driver.findElement(By.xpath("//aside[@class=\"main-sidebar\"]//li[@ng-repeat=\"i in  DynamicMenuItems\"][7]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//aside[@class=\"main-sidebar\"]//li[@ng-repeat=\"i in  DynamicMenuItems\"][7]//li[@ng-repeat=\"j in i.SubMenus\"][4]"))
				.click();
		Thread.sleep(2000);
		// Ihub
		driver.findElement(By.xpath(
				"//div[@ng-controller=\"bulkordersController\"]//div[@ng-show=\"Treeview\"]//li[@data-ng-repeat=\"node in UnitDataNode\"]/i[2]"))
				.click();
		Thread.sleep(2000);
		// Hyderabad DC
		driver.findElement(By.xpath(
				"//li[@data-ng-repeat=\"node in node.children\"]//i[@data-ng-click=\"tree01.selectNodeHead(node)\"][2]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@data-ng-repeat=\"node in node.children\"][3]//i[@class=\"expanded\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/section[2]/ng-view/div/div[1]/div/div/ul/li/div/ul/li[1]/div/ul/li[3]/div/ul/li[1]/span/span"))
				.click();
		driver.findElement(By.xpath(
				"//div[@class=\"col-sm-8 col-md-8 col-lg-9 col-xl-9\"]//form[@name=\"Registration_Form\"]//input[@ng-model=\"Buyer_Mobile_Number\"]"))
				.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(
				"//div[@class=\"col-sm-8 col-md-8 col-lg-9 col-xl-9\"]//form[@name=\"Registration_Form\"]//input[@ng-model=\"Buyer_Mobile_Number\"]"))
				.sendKeys("6309765343");
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//div[@ng-repeat=\"address in
		// BuyerAddress_List\"][1]//div[@class=\"media-left\"]")).click();
		WebElement checkbox = driver.findElement(By.xpath(
				"//div[@ng-repeat=\"address in BuyerAddress_List\"][1]//div[@class=\"media-left\"]//i[@for=\"check-\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", checkbox);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@ng-show=\"BulkOrderSKUShow\"]//textarea[@name=\"SKUsearch\"]"))
				.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@ng-show=\"BulkOrderSKUShow\"]//textarea[@name=\"SKUsearch\"]"))
				.sendKeys("01717A-479787");
		driver.findElement(By.xpath("//div[@ng-show=\"BulkOrderSKUShow\"]//input[@value=\"Search\"]")).click();
		driver.findElement(By.xpath("//form[@name=\"SearchSKU\"]//input[@ng-change=\"ChangeBulkSP(Productslist)\"]"))
				.sendKeys("180");
		driver.findElement(By.xpath("//form[@name=\"SearchSKU\"]//input[@name=\"Quantity0\"]")).sendKeys("100");
		Thread.sleep(2000);
		// Booking amount
		driver.findElement(By.xpath(
				"/html/body/div[1]/div[1]/section[2]/ng-view/div/div[2]/div/form[3]/div[2]/table/tbody/tr[1]/td/div[1]/label[1]/i"))
				.click();
		driver.findElement(By.xpath("//form[@name=\"SearchSKU\"]//input[@name=\"bookpay\"]")).sendKeys("8000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//form[@name=\"SearchSKU\"]//input[@value=\"Raise Bulk Order\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"btn btn-green\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@role=\"dialog\"]//button[@class=\"btn btn-default\"]")).click();
		driver.close();
		Thread.sleep(2000);
		// Stores Bulk Orders
		System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
		WebDriver driver1 = new ChromeDriver();
		driver1.get("http://183.82.123.14/iHubMultiStoresDev");
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver1.manage().window().maximize();
		driver1.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"userName\"]"))
				.sendKeys("KusumanchiWCS@ihubwarehouse.in");
		driver1.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"password\"]"))
				.sendKeys("Store.123");
		// Submit
		driver1.findElement(By.xpath("//form[@name=\"LoginForm\"]//button[@ng-click=\"SignIn('LoginForm')\"]")).click();
		Thread.sleep(4000);
		WebElement checkbox1 = driver1.findElement(By.xpath("//div[@ng-click=\"getBulkOrders()\"]"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver1;
		js1.executeScript("arguments[0].click();", checkbox1);
		Thread.sleep(4000);
		// Raised bulk orders
		WebElement checkbox12 = driver1
				.findElement(By.xpath("//div[@ng-click=\"AllRaisedBulkOrders('Raised Bulk Orders')\"]"));
		JavascriptExecutor js12 = (JavascriptExecutor) driver1;
		js12.executeScript("arguments[0].click();", checkbox12);
		Thread.sleep(2000);
		driver1.findElement(By.xpath("//div[@ng-show=\"raisedgrid\"]//input[@ng-model=\"mobilenumber\"]"))
				.sendKeys("6309765343");
		Thread.sleep(2000);
		driver1.findElement(
				By.xpath("//div[@ng-show=\"raisedgrid\"]//input[@ng-click=\"SearchOrders(Orders,orderPaymentmode)\"]"))
				.click();
  }
}
