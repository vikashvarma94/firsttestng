package ihubstorestc;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Offers {
	WebDriver driver;
	@BeforeTest
	public void beforetest() {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "/home/vikas/Downloads/chromedriver_linux64");
	}
  @Test
  public void addproduct() throws InterruptedException {
	 
		driver.get("http://164.52.194.143/iHubBetaAdmin");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("superadmin@Ihubstores.In");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Store.123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(3000);
		//Assert.assertEquals(driver.getTitle(), "iHubMultiStoresAdmin");
		driver.findElement(By.xpath("//a[@class=\"sidebar-toggle\"]")).click();
		driver.findElement(By.linkText("Coupon Management")).click();
		driver.findElement(By.xpath("(//li/ul/li/a/i)[69]")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@value=\"Add Offer\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='2']")).click();
		Thread.sleep(2000);
		Select s1 = new Select(driver.findElement(By.xpath("(//div/div/select)[4]")));
		s1.selectByIndex(1);
		Select s2 = new Select( driver.findElement(By.xpath("(//div/div/select)[5]")));
		s2.selectByIndex(1);//123456
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("1");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("1");
		Select s3 = new Select( driver.findElement(By.xpath("(//div/div/select)[6]")));
		s3.selectByIndex(2);
		Select s4 = new Select((WebElement) driver.findElement(By.xpath("(//div/div/select)[7]")));
		s4.selectByIndex(3);
		Select s5 = new Select((WebElement) driver.findElement(By.xpath("(//div/div/select)[8]")));
		s5.selectByIndex(3);
		driver.findElement(By.xpath("(//input[@type=\"text\"])[7]")).sendKeys("B-1-G-1");
		driver.findElement(By.xpath("(//textarea[@type=\"text\"])[1]")).sendKeys("test");
		driver.findElement(By.xpath("(//input[@type=\"date\"])[3]")).sendKeys("19/12/2019");
		driver.findElement(By.xpath("(//input[@type=\"date\"])[4]")).sendKeys("30/12/2019");
		driver.findElement(By.xpath("(//input[@type=\"radio\"])[3]")).click();
		driver.findElement(By.xpath("//input[@type=\"number\"]")).sendKeys("4");
		driver.findElement(By.xpath("//input[@value=\"Select Category\"]")).click();
		Thread.sleep(1000);
		
		for(int i =14;i<=14;i++) {//category
			driver.findElement(By.xpath("((//div/tree-view/ul/li)["+i+"]/span)[1]")).click();
			Thread.sleep(4000);
			System.out.println("((//div/tree-view/ul/li)["+i+"]/ul/li)[3]/span/i");
			driver.findElement(By.xpath("((//div/tree-view/ul/li)["+i+"]/ul/li)[1]/span/i")).click();//sub category//3
			Thread.sleep(3000);
			driver.findElement(By.xpath("(((//div/tree-view/ul/li)["+i+"]/ul/li)[1]/ul/li/input)[1]")).click();//123
			Thread.sleep(3000);}
		driver.findElement(By.xpath("(//button[@type=\"button\"])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type=\"button\"])[6]")).click();	
  }
@Test
public void verify() throws InterruptedException{
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.open()");
	 for (String handle1 : driver.getWindowHandles()) {
	 driver.switchTo().window(handle1);}
	 Thread.sleep(1000);
	driver.get("http://164.52.194.143/iHubStoresBeta");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"userName\"]")).sendKeys("enkoor@Ihubstores.In");
	driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"password\"]")).sendKeys("Store.123");
	driver.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();
	Thread.sleep(3000);
//	List<WebElement> li = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
//	for(int i = 0; i<5;i++) {
//		li.get(i).click();
//	}
//	Thread.sleep(1000);
//	driver.findElement(By.xpath("(//input[@type=\"button\"])[2]")).click();
//	Thread.sleep(3000);
//	driver.findElement(By.xpath("//span[@class=\"ng-confirm-btn-text\"]")).click();
//	Thread.sleep(3000);
	Actions a = new Actions(driver);
	a.moveToElement(driver.findElement(By.xpath("//p[@class=\"no-margin\"]"))).perform();
	a.moveToElement(driver.findElement(By.linkText("Men"))).perform();
	driver.findElement(By.linkText("Footwear")).click();
//	Clothing
//	Footwear
//	Accessories
//	School Supplies
	
Thread.sleep(1000);
	List<WebElement> lb = (List<WebElement>) driver.findElements(By.xpath("//a/div/p"));
	for(int v=0;v<lb.size();v++) {//123..
		System.out.println(lb.get(v).getText());
	if(lb.get(v).getText().equals("Sandals")){
		lb.get(v).click();
		break;}
//	Select s = new Select(driver.findElement(By.xpath("//select[@ng-model=\"filterProductsSort\"]")));
//	s.selectByVisibleText("Discount");
//	Thread.sleep(1000);
//	List<WebElement> lc = (List<WebElement>) driver.findElements(By.xpath("//i[@class=\"check\"]"));
//	Thread.sleep(500);
//	for(int i=0;i<=2;i++) {
//		lc.get(i).click();
//		Thread.sleep(2000);}
//	//driver.navigate().back();
	Thread.sleep(2000);}
	//add to cart
	 driver.findElement(By.xpath("(//button[@class='btn buy-btn'])[1]")).click();
	   Thread.sleep(2000);
	 			   
		driver.findElement(By.xpath("//input[@id=\"MobileNumber\"]")).sendKeys("9666262992");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"btnSave\"]")).click();
		
		Thread.sleep(3000); 
		driver.findElement(By.xpath("(//button[@class=\"btn buy-btn\"])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class=\"btn buy-btn\"])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class=\"cart-bag\"]")).click();
		Thread.sleep(2000);
		
		
		//	assert
		String total= driver.findElement(By.xpath("(//h4/span)[8]")).getText();
		String cart =driver.findElement(By.xpath("(//tbody/tr/td)[14]")).getText();
		Assert.assertNotEquals(total, cart);
		
//
////	 Delete
////	 driver.findElement(By.xpath("//div[@class=\"col-sm-6 col-md-8 col-lg-8\"]//tr[@ng-repeat=\"item in cartItems\"]//a[@class=\"remove\"]")).click();
////	 Thread.sleep(2000);
//	 //Yes
//	 driver.findElement(By.xpath("//button[@class=\"btn btn-red\"]")).click();
//	 //No
//	 //driver.findElement(By.xpath("//button[@class=\"btn btn-default\"]")).click();
//	 
////Full Amount
//		//driver.findElement(By.xpath("//input[@value=\"10\"]")).click();	
//		WebElement checkbox = driver.findElement(By.xpath("//input[@value=\"10\"]"));
//		 JavascriptExecutor js =(JavascriptExecutor) driver;
//		 js.executeScript("arguments[0].click();",checkbox);
////Booking Amount.........
////		Thread.sleep(2000);
////		driver.findElement(By.xpath("//input[@value=\"20\"]")).click();
////		WebElement checkbox10 = driver.findElement(By.xpath("//input[@value=\"20\"]"));
////		 JavascriptExecutor js10=(JavascriptExecutor) driver;
////		 js10.executeScript("arguments[0].click();",checkbox10);
//			//EMI...
////			Thread.sleep(2000);
////			WebElement checkbox0 = driver.findElement(By.xpath("//input[@id=\"EMI-0\"]"));
////			 JavascriptExecutor js0=(JavascriptExecutor) driver;
////			 js0.executeScript("arguments[0].click();",checkbox0);
////			 Thread.sleep(2000);
////		 driver.findElement(By.xpath("//input[@type=\"number\"]")).sendKeys("123456");
////		 driver.findElement(By.xpath("(//input[@value=\"Submit\"])[1]")).click();
//
//		 Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@ng-click=\"CheckOut()\"]")).click();
//	
//			 //Store address
//			WebElement link11= driver.findElement(By.xpath("//div[@class=\"col-md-4 address-details\"]//label[@class=\"label-wrapper\"]//input[@value=\"10\"]"));
//			 JavascriptExecutor js11 =(JavascriptExecutor) driver;
//			 js11.executeScript("arguments[0].click();",link11);
//			 Thread.sleep(2000);
//			 /*Personal Address
//				WebElement link10= driver.findElement(By.xpath("//div[@class=\"col-md-4 address-details\"]//label[@class=\"label-wrapper\"]//input[@value=\"5054\"]"));
//				 JavascriptExecutor js10 =(JavascriptExecutor) driver;
//				 js10.executeScript("arguments[0].click();",link10);
//				 */
//			/*Add New Address
//			 driver.findElement(By.xpath("//div[@class=\"add-address\"]")).click();
//			 driver.findElement(By.xpath("//div[@ng-show=\"addAddressShow\"]//input[@name=\"FullName\"]")).sendKeys("Lasya");
//			 driver.findElement(By.xpath("//div[@ng-show=\"addAddressShow\"]//textarea[@name=\"Housenumber\"]")).sendKeys("Madhapur");
//			 driver.findElement(By.xpath("//div[@ng-show=\"addAddressShow\"]//textarea[@name=\"Street\"]")).sendKeys("Jublihilss");
//			 driver.findElement(By.xpath("//div[@ng-show=\"addAddressShow\"]//input[@name=\"PinCode\"]")).sendKeys("500018");
//			 driver.findElement(By.xpath("//div[@ng-show=\"addAddressShow\"]//input[@name=\"MobileNumber\"]")).clear();
//			 driver.findElement(By.xpath("//div[@ng-show=\"addAddressShow\"]//input[@name=\"MobileNumber\"]")).sendKeys("8186814540");
//			 driver.findElement(By.xpath("//div[@class=\"inline-block\"]//input[@id=\"btnSave\"]")).click();
//			 */
//			 driver.findElement(By.xpath("//div[@class=\"text-center\"]//button[@type=\"button\"]")).click();
//			 Thread.sleep(2000);
//			 //Card types
//			 driver.findElement(By.xpath("//div[@class=\"payment-opt-tab\"]//label[@for=\"Cash\"]")).click();
//			 //driver.findElement(By.xpath("//div[@class=\"payment-opt-tab\"]//label[@for=\"Card\"]")).click();
//			// driver.findElement(By.xpath("//div[@class=\"payment-opt-tab\"]//label[@for=\"Cheque\"]")).click();
//			// driver.findElement(By.xpath("//div[@class=\"payment-opt-tab\"]//label[@for=\"CCavenue\"]")).click();
//			 //Payment types
//			 //driver.findElement(By.xpath("//div[@id=\"card\"]//select[@ng-model=\"TypeOfCard\"]//option[@label=\"MAESTRO\"]")).click();
//			/* driver.findElement(By.xpath("//div[@id=\"card\"]//select[@ng-model=\"TypeOfCard\"]//option[@label=\"MasterCard\"]")).click();
//			 driver.findElement(By.xpath("//div[@id=\"card\"]//select[@ng-model=\"TypeOfCard\"]//option[@label=\"Rupay\"]")).click();
//			 driver.findElement(By.xpath("//div[@id=\"card\"]//select[@ng-model=\"TypeOfCard\"]//option[@label=\"Visa\"]")).click();
//			 */
//			// driver.findElement(By.xpath("//input[@name=\"CardNumber\"]")).sendKeys("4646");
//			// driver.findElement(By.xpath("//div[@class=\"tab-content\"]//div[@class=\"text-center\"]//button[@class=\"btn btn-prime\"]")).click();
//			 driver.findElement(By.xpath("(//button[@type=\"button\"])[1]")).click();
//			 Thread.sleep(1000);
//			 driver.findElement(By.id("OTP")).sendKeys("123456");
//			 driver.findElement(By.xpath("//button[@ng-click=\"Confirm_OTP(SOTP)\"]")).click();
//			 Thread.sleep(2000);
//			String ee = driver.findElement(By.xpath("(//div/table/tbody/tr/td)[2]")).getText();
//			 System.out.println(ee);
//			 Thread.sleep(1000);
//			 
//			 JavascriptExecutor jse = (JavascriptExecutor)driver;
//			 jse.executeScript("window.open()");
//			 for (String handle : driver.getWindowHandles()) {
//			 driver.switchTo().window(handle);}
//			 Thread.sleep(1000);
					 
}}
