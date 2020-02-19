package ihubts;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class admin {
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
		Thread.sleep(2000);
		//Assert.assertEquals(driver.getTitle(), "iHubMultiStoresAdmin");
		driver.findElement(By.xpath("//a[@class=\"sidebar-toggle\"]")).click();
		driver.findElement(By.linkText("Product Management")).click();
		driver.findElement(By.xpath("(//li/ul/li/a/i)[20]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div/div/div/ul/li/i)[2]")).click();//1 collapse
		Thread.sleep(2000);
for(int i =14;i<=14;i++) {//category
		driver.findElement(By.xpath("(//div/div/div/ul/li/div/ul/li)["+i+"]/i[2]")).click();
		List<WebElement> lb = (List<WebElement>)driver.findElements(By.xpath("(//div/div/div/ul/li/div/ul/li/div/ul)["+i+"]/li/i[2]"));
		System.out.println(lb.size());
		for(int j=0;j<1;j++) {//sub category
			lb.get(j).click();
			driver.findElement(By.xpath("((//div/div/div/ul/li/div/ul/li/div/ul)["+i+"]/li/div/ul/li/span)[4]")).click();//+ 1 to 32
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@value=\"Upload New Products\"]")).click();
			driver.findElement(By.xpath("(//input[@type=\"file\"])[1]")).sendKeys("/home/vikas/Downloads/Zeven.xlsx");
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//button[@value=\"Save\"])[1]")).click();
			Thread.sleep(2000);
			Actions a = new Actions(driver);
			a.sendKeys(Keys.CONTROL+"T").perform();
		}
}	}	
			
			@Test
			
			  public void checkproductinstore() throws InterruptedException {
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("window.open()");
				String Mainwindow = driver.getWindowHandle();
				java.util.Set<String> s1 = driver.getWindowHandles();
				java.util.Iterator<String> i1 = s1.iterator();
				while(i1.hasNext()) { 
				String ChildWindow=i1.next();
				if(!Mainwindow.equalsIgnoreCase(ChildWindow)) 
				{ 
				driver.switchTo().window(ChildWindow);}}
			driver.get("http://164.52.194.143/iHubStoresBeta");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.findElement(By.xpath("(//input[@name=\"userName\"])[1]")).sendKeys("Enkoor@Ihubstores.In");
			driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("Store.123");
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			Thread.sleep(3000);
			/*List<WebElement> li = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
			for(int i = 0; i<5;i++) {
				li.get(i).click();
			}
			Thread.sleep(1000);
			driver.findElement(By.xpath("(//input[@type=\"button\"])[2]")).click();
			Thread.sleep(3000);*/
			driver.findElement(By.linkText("Categories")).click();
			Thread.sleep(3000);
			Actions a = new Actions(driver);
	a.moveToElement(driver.findElement(By.xpath("//p[@class=\"no-margin\"]"))).perform();
	a.moveToElement(driver.findElement(By.linkText("Men"))).perform();
	driver.findElement(By.linkText("Footwear")).click();
	//Clothing
	//Footwear
	//Accessories
	//School Supplies

	Thread.sleep(500);
	List<WebElement> li = (List<WebElement>) driver.findElements(By.xpath("//div[@class='shopnow-btn']"));
	for(int v=1;v<2;v++) {//123..
	li.get(v).click();
	Thread.sleep(1000);
	Select s = new Select(driver.findElement(By.xpath("//select[@ng-model=\"filterProductsSort\"]")));
	s.selectByVisibleText("Discount");
	Thread.sleep(2000);
	List<WebElement> lc = (List<WebElement>) driver.findElements(By.xpath("//i[@class='check']"));
	Thread.sleep(2000);
	for(int k=0;k<1;k++) {
		lc.get(k).click();
		Thread.sleep(2000);}
	//driver.navigate().back();
	Thread.sleep(1000);}
//search
	/*	@Test
 	public void add() throws InterruptedException, IOException {
	 driver.findElement(By.id("myInput")).sendKeys("watches");
	 Actions a = new Actions(driver);
	 a.sendKeys(Keys.ENTER).perform();*/
	driver.findElement(By.xpath("//div[@class=\"media\"]//button[@class=\"btn buy-btn\"]")).click();
	   Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"MobileNumber\"]")).sendKeys("6309765343");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"btnSave\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"media\"]//button[@ng-click=\"Add_Product_ToCart(Product)\"]")).click();
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@class=\"cart-bag\"]")).click();
		Thread.sleep(2000);
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
			WebElement checkbox = driver.findElement(By.xpath("//input[@value=\"10\"]"));
			 JavascriptExecutor js =(JavascriptExecutor) driver;
			 js.executeScript("arguments[0].click();",checkbox);
	/*Booking Amount
			Thread.sleep(2000);
			//driver.findElement(By.xpath("//input[@value=\"20\"]")).click();
			WebElement checkbox10 = driver.findElement(By.xpath("//input[@value=\"20\"]"));
			 JavascriptExecutor js10=(JavascriptExecutor) driver;
			 js10.executeScript("arguments[0].click();",checkbox10);
				//EMI
				Thread.sleep(2000);
				WebElement checkbox0 = driver.findElement(By.xpath("//input[@id=\"EMI-0\"]"));
				 JavascriptExecutor js0=(JavascriptExecutor) driver;
				 js0.executeScript("arguments[0].click();",checkbox0);
*/
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
				 driver.findElement(By.linkText("Generate Store OTP")).click();
				 Thread.sleep(1000);
				 driver.findElement(By.id("OTP")).sendKeys("123456");
				 driver.findElement(By.xpath("//button[@ng-click=\"Confirm_OTP(SOTP)\"]")).click();
				 
				 driver.switchTo().window(Mainwindow);
				 driver.navigate().refresh();
				 
				 driver.findElement(By.xpath("//a[@class=\"sidebar-toggle\"]")).click();
					driver.findElement(By.linkText("Order Management")).click();
					driver.findElement(By.xpath("(//li/ul/li/a/i)[48]")).click();
					Thread.sleep(2000);
					String at  = driver.findElement(By.xpath("(//div/table/tbody/tr/td)[7]")).getText();
					Assert.assertTrue(at.equalsIgnoreCase("Enkoor Store"));
  }
}