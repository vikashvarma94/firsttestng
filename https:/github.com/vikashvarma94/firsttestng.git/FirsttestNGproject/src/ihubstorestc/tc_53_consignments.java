package ihubstorestc;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

public class tc_53_consignments {
	
	WebDriver driver;
	  @Test
	  public void signin() throws InterruptedException {
		  WebDriver driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.driver", "/home/vikas/Downloads/chromedriver_linux64"); 	
			
			driver.get("http://164.52.194.143/iHubStoresBeta");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"userName\"]")).sendKeys("enkoor@Ihubstores.In");
			driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"password\"]")).sendKeys("Store.123");
			driver.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();
			Thread.sleep(3000);
//			List<WebElement> li = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
//			for(int i = 0; i<5;i++) {
//				li.get(i).click();
//			}
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("(//input[@type=\"button\"])[2]")).click();
//			Thread.sleep(3000);
//			driver.findElement(By.xpath("//span[@class=\"ng-confirm-btn-text\"]")).click();
//			Thread.sleep(3000);
			Actions a = new Actions(driver);
			a.moveToElement(driver.findElement(By.xpath("//p[@class=\"no-margin\"]"))).perform();
			a.moveToElement(driver.findElement(By.linkText("Men"))).perform();
			driver.findElement(By.linkText("Footwear")).click();
//			Clothing
//			Footwear
//			Accessories
//			School Supplies
			
			Thread.sleep(1000);
			List<WebElement> lb = (List<WebElement>) driver.findElements(By.xpath("//div[@class='shopnow-btn']"));
			for(int v=2;v<3;v++) {//123..
			lb.get(v).click();
			Thread.sleep(3000);
			Select s = new Select(driver.findElement(By.xpath("//select[@ng-model=\"filterProductsSort\"]")));
			s.selectByVisibleText("Price High To Low");
//			Thread.sleep(1000);
//			List<WebElement> lc = (List<WebElement>) driver.findElements(By.xpath("//i[@class=\"check\"]"));
//			Thread.sleep(500);
//			for(int i=0;i<=2;i++) {
//				lc.get(i).click();
//				Thread.sleep(2000);}
//			//driver.navigate().back();
			Thread.sleep(3000);}
			//add to cart
			 driver.findElement(By.xpath("(//button[@class='btn buy-btn'])[1]")).click();
			   Thread.sleep(2000);
			 			   
				driver.findElement(By.xpath("//input[@id=\"MobileNumber\"]")).sendKeys("9666262992");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id=\"btnSave\"]")).click();
				Thread.sleep(3000); 
				driver.findElement(By.xpath("(//button[@class=\"btn buy-btn\"])[1]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[@class=\"cart-bag\"]")).click();
				Thread.sleep(2000);
				/*//	assert
				WebElement e = driver.findElement(By.xpath("((//div/table/tbody)[2]/tr)[1]"));
				System.out.println(e.getText());
				Assert.assertEquals(e.getText(), "Cart (1 Item) ₹199.00");*/
				
	  
			 /*Delete
			 driver.findElement(By.xpath("//div[@class=\"col-sm-6 col-md-8 col-lg-8\"]//tr[@ng-repeat=\"item in cartItems\"]//a[@class=\"remove\"]")).click();
			 Thread.sleep(2000);
			 //Yes
			 driver.findElement(By.xpath("//button[@class=\"btn btn-red\"]")).click();
			 //No
			 //driver.findElement(By.xpath("//button[@class=\"btn btn-default\"]")).click();
			 */
		 //Full Amount
				//driver.findElement(By.xpath("//input[@value=\"10\"]")).click();	
//				WebElement checkbox = driver.findElement(By.xpath("//input[@value=\"10\"]"));
//				JavascriptExecutor js =(JavascriptExecutor) driver;
//				js.executeScript("arguments[0].click();",checkbox);
		//Booking Amount.........
				Thread.sleep(2000);
				//driver.findElement(By.xpath("//input[@value=\"20\"]")).click();
				WebElement checkbox10 = driver.findElement(By.xpath("//input[@value=\"20\"]"));
				 JavascriptExecutor js10=(JavascriptExecutor) driver;
				 js10.executeScript("arguments[0].click();",checkbox10);
					//EMI...
//					Thread.sleep(2000);
//					WebElement checkbox0 = driver.findElement(By.xpath("//input[@id=\"EMI-0\"]"));
//					 JavascriptExecutor js0=(JavascriptExecutor) driver;
//					 js0.executeScript("arguments[0].click();",checkbox0);
//					 Thread.sleep(2000);
//				 driver.findElement(By.xpath("//input[@type=\"number\"]")).sendKeys("123456");
//				 driver.findElement(By.xpath("(//input[@value=\"Submit\"])[1]")).click();
	
				 Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@ng-click=\"CheckOut()\"]")).click();
			
					 //Store address
					WebElement link11= driver.findElement(By.xpath("//div[@class=\"col-md-4 address-details\"]//label[@class=\"label-wrapper\"]//input[@value=\"10\"]"));
					 JavascriptExecutor js11 =(JavascriptExecutor) driver;
					 js11.executeScript("arguments[0].click();",link11);
					 Thread.sleep(2000);
					 /*Personal Address
						WebElement link10= driver.findElement(By.xpath("//div[@class=\"col-md-4 address-details\"]//label[@class=\"label-wrapper\"]//input[@value=\"5054\"]"));
						 JavascriptExecutor js10 =(JavascriptExecutor) driver;
						 js10.executeScript("arguments[0].click();",link10);
						 */
					/*Add New Address
					 driver.findElement(By.xpath("//div[@class=\"add-address\"]")).click();
					 driver.findElement(By.xpath("//div[@ng-show=\"addAddressShow\"]//input[@name=\"FullName\"]")).sendKeys("Lasya");
					 driver.findElement(By.xpath("//div[@ng-show=\"addAddressShow\"]//textarea[@name=\"Housenumber\"]")).sendKeys("Madhapur");
					 driver.findElement(By.xpath("//div[@ng-show=\"addAddressShow\"]//textarea[@name=\"Street\"]")).sendKeys("Jublihilss");
					 driver.findElement(By.xpath("//div[@ng-show=\"addAddressShow\"]//input[@name=\"PinCode\"]")).sendKeys("500018");
					 driver.findElement(By.xpath("//div[@ng-show=\"addAddressShow\"]//input[@name=\"MobileNumber\"]")).clear();
					 driver.findElement(By.xpath("//div[@ng-show=\"addAddressShow\"]//input[@name=\"MobileNumber\"]")).sendKeys("8186814540");
					 driver.findElement(By.xpath("//div[@class=\"inline-block\"]//input[@id=\"btnSave\"]")).click();
					 */
					 driver.findElement(By.xpath("//div[@class=\"text-center\"]//button[@type=\"button\"]")).click();
					 Thread.sleep(2000);
					 //Card types
					 driver.findElement(By.xpath("//div[@class=\"payment-opt-tab\"]//label[@for=\"Cash\"]")).click();
					 //driver.findElement(By.xpath("//div[@class=\"payment-opt-tab\"]//label[@for=\"Card\"]")).click();
					// driver.findElement(By.xpath("//div[@class=\"payment-opt-tab\"]//label[@for=\"Cheque\"]")).click();
					// driver.findElement(By.xpath("//div[@class=\"payment-opt-tab\"]//label[@for=\"CCavenue\"]")).click();
					 //Payment types
					 //driver.findElement(By.xpath("//div[@id=\"card\"]//select[@ng-model=\"TypeOfCard\"]//option[@label=\"MAESTRO\"]")).click();
					/* driver.findElement(By.xpath("//div[@id=\"card\"]//select[@ng-model=\"TypeOfCard\"]//option[@label=\"MasterCard\"]")).click();
					 driver.findElement(By.xpath("//div[@id=\"card\"]//select[@ng-model=\"TypeOfCard\"]//option[@label=\"Rupay\"]")).click();
					 driver.findElement(By.xpath("//div[@id=\"card\"]//select[@ng-model=\"TypeOfCard\"]//option[@label=\"Visa\"]")).click();
					 */
					// driver.findElement(By.xpath("//input[@name=\"CardNumber\"]")).sendKeys("4646");
					// driver.findElement(By.xpath("//div[@class=\"tab-content\"]//div[@class=\"text-center\"]//button[@class=\"btn btn-prime\"]")).click();
					 driver.findElement(By.xpath("(//button[@type=\"button\"])[1]")).click();
					 Thread.sleep(1000);
					 driver.findElement(By.id("OTP")).sendKeys("123456");
					 driver.findElement(By.xpath("//button[@ng-click=\"Confirm_OTP(SOTP)\"]")).click();
					 Thread.sleep(2000);
					String ee = driver.findElement(By.xpath("(//div/table/tbody/tr/td)[2]")).getText();
					 System.out.println(ee);
					 Thread.sleep(1000);
					 
					 JavascriptExecutor jse = (JavascriptExecutor)driver;
					 jse.executeScript("window.open()");
					 for (String handle : driver.getWindowHandles()) {
					 driver.switchTo().window(handle);}
					 Thread.sleep(1000);

	 
		driver.get("http://164.52.194.143/iHubBetaAdmin");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("operationsteam@Ihubstores.In");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Store.123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class=\"sidebar-toggle\"]")).click();
		driver.findElement(By.linkText("DC and Vendor Management")).click();
		driver.findElement(By.xpath("(//li/ul/li/a/i)[65]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\"number\"]")).sendKeys(ee);
		driver.findElement(By.xpath("//button[@ng-click=\"SearchOrders()\"]")).click();
		Thread.sleep(2000);
		String store= driver.findElement(By.xpath("(//tbody/tr/td)[2]")).getText();
		driver.findElement(By.xpath("(//input[@value=\"Packed\"])[1]")).click();
		driver.findElement(By.xpath("(//div/button/span)[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/button/span")).click();
		Thread.sleep(1000);
		//inventory
				driver.findElement(By.xpath("//aside[@class=\"main-sidebar\"]//li[@ng-repeat=\"i in  DynamicMenuItems\"][6]")).click();
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
		Select s = new Select(driver.findElement(By.xpath("(//div/select)[4]")));
		s.selectByVisibleText(store);
		Thread.sleep(2000);
		driver.findElement(By.linkText(store)).click();
		Thread.sleep(2000);
		List<WebElement> li = driver.findElements(By.xpath("//tbody/tr/td"));
		for(int i = 0; i<li.size();i++) {
		String vi =li.get(i).getText();
		if(vi.contentEquals(ee)) {
			li.get(i-2).click();
			break;}}

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value=\"Create Consignment\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div/button/span")).click();
		
		 jse.executeScript("window.open()");
		 for (String handle1 : driver.getWindowHandles()) {
		 driver.switchTo().window(handle1);}
		 Thread.sleep(1000);
		 
		 driver.get("http://164.52.194.143/iHubBetaAdmin");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("logisticadmin@Ihubstores.In");
			driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Store.123");
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@class=\"sidebar-toggle\"]")).click();
			driver.findElement(By.linkText("Consignments")).click();//select[@ng-model="source"]
			Thread.sleep(1000);
			Select ss = new Select(driver.findElement(By.xpath("(//select[@ng-required=\"true\"])[1]")));
			ss.selectByVisibleText("Enkoor Store");
				Thread.sleep(1000);
				Select s1 = new Select(driver.findElement(By.xpath("(//select[@ng-required=\"true\"])[5]")));
				s1.selectByVisibleText("Picked Up");
				
				Thread.sleep(1000);
				s1.selectByVisibleText("delivered");
	  
}}	
			
