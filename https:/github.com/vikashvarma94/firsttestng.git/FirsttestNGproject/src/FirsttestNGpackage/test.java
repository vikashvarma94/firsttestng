package FirsttestNGpackage;



import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class test {
	WebDriver driver;
	  @Test
	  public void signin() throws InterruptedException {
		  WebDriver driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "/home/vikas/Downloads/chromedriver_linux64"); 	
		driver.get("http://183.82.123.14/iHubMultiStoresAdminDev");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@ng-controller=\"loginController\"]//input[@name=\"userName\"]"))
				.sendKeys("operationsteam@ihubstores.in");
		driver.findElement(By.xpath("//div[@ng-controller=\"loginController\"]//input[@name=\"password\"]")).sendKeys("Store.123");
		// Submit
		driver.findElement(By.xpath("//div[@ng-controller=\"loginController\"]//button[@ng-click=\"Admin_SignIn('LoginForm')\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//header[@class=\"main-header\"]//a[@role=\"button\"]")).click();
		Thread.sleep(2000);
//		//DC and Vendor Products
//		driver.findElement(By.xpath("//aside[@class=\"main-sidebar\"]//li[@ng-repeat=\"i in  DynamicMenuItems\"][11]"))
//				.click();
//		Thread.sleep(2000);
//		//Vendor orders inbound
//		driver.findElement(By.xpath(
//				"//aside[@class=\"main-sidebar\"]//li[@ng-repeat=\"i in  DynamicMenuItems\"][11]//ul[@class=\"treeview-menu\"]//li[@ng-repeat=\"j in i.SubMenus\"][1]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//div[@ng-controller=\"Pending_Packed_Orders_Controller\"]//input[@ng-click=\"ShowInBoundInventorys(row,Ordered_Products)\"]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@class=\"modal-content\"]//input[@value=\"Inbound Stock\"]")).click();
//		Thread.sleep(50000);
//		driver.findElement(By.xpath("(//div/span)[1]")).click();
//		Thread.sleep(2000);
//		//Pending DC orders
//		driver.findElement(By.xpath("//aside[@class=\"main-sidebar\"]//li[@ng-repeat=\"i in  DynamicMenuItems\"][11]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//aside[@class=\"main-sidebar\"]//li[@ng-repeat=\"i in  DynamicMenuItems\"][11]//ul[@class=\"treeview-menu\"]//li[@ng-repeat=\"j in i.SubMenus\"][2]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//div[@class=\"content-wrapper\"]//select[@ng-model=\"source\"]//option[@label=\"Enkoor Store\"]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@class=\"content-wrapper\"]//button[@title=\"SearchOrders\"]")).click();
//		// driver.findElement(By.xpath("//div[@class=\"content-wrapper\"]//input[@id=\"btnReset\"]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath(
//				"//div[@ng-controller=\"Pending_DC_Orders_Controller\"]//input[@ng-click=\"UpdateToPacked(row)\"]"))
//				.click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@role=\"dialog\"]//span[contains(text(),'Yes')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//div[@role=\"dialog\"]//div[@class=\"ng-confirm-closeIcon\"]//span[1]")).click();
//		Thread.sleep(2000);
		//inventory Management
		driver.findElement(By.xpath("//aside[@class=\"main-sidebar\"]//li[@ng-repeat=\"i in  DynamicMenuItems\"][6]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//aside[@class=\"main-sidebar\"]//li[@ng-repeat=\"i in  DynamicMenuItems\"][6]//ul[@class=\"treeview-menu\"]//li[@ng-repeat=\"j in i.SubMenus\"][3]")).click();
		Thread.sleep(2000);
	driver.findElement(By.xpath("//aside[@class=\"main-sidebar\"]//li[@ng-repeat=\"i in  DynamicMenuItems\"][6]//ul[@class=\"treeview-menu\"]//li[@ng-repeat=\"j in i.SubMenus\"][3]//li[@ng-repeat=\"g in j.SubMenus\"][1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@ng-controller=\"Create_DC_ConsignmentController\"]//select[@name=\"SelSource\"]//option[@value=\"1\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@ng-controller=\"Create_DC_ConsignmentController\"]//select[@name=\"SourceID\"]//option[@label=\"Hyderabad DC\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@ng-controller=\"Create_DC_ConsignmentController\"]//select[@name=\"SelDest\"]//option[@value=\"3\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@ng-controller=\"Create_DC_ConsignmentController\"]//select[@name=\"DestID\"]//option[@label=\"Kothagudem Store\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Kothagudem Store")).click();
	Thread.sleep(2000);
	List<WebElement> li = driver.findElements(By.xpath("//tbody/tr/td"));
	for(int i = 0; i<li.size();i++) {
		String vi =li.get(i).getText();
		if(vi.contentEquals("70405212")) {
			li.get(i-2).click();
			break;}}
		
	Thread.sleep(2000);
	
	  
	  
	  
	  }}
				
		
		