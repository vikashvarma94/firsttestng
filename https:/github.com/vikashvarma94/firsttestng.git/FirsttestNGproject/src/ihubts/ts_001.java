package ihubts;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class ts_001{
	WebDriver driver;
	@Test
	public void add() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "/home/vikas/Downloads/chromedriver_linux64"); 	
		
		driver.get("http://192.168.7.5/iHubstoressqlQA");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"userName\"]")).sendKeys("Enkoor@Ihubstores.In");
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"password\"]")).sendKeys("Store.123");
		Thread.sleep(2000);
		//Submit
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		List<WebElement> li = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		for(int i = 0; i<5;i++) {
			li.get(i).click();
		}
		driver.findElement(By.xpath("(//input[@type=\"button\"])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class=\"ng-confirm-btn-text\"]")).click();
		Thread.sleep(1000);
		//Clear
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"button\"]")).click();
		//Electronics
		Thread.sleep(2000);
		 driver.findElement(By.linkText("Electronics")).click();
		 driver.findElement(By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Electronics')]")) .click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Televisions')]")) .click();
		 Thread.sleep(2000);
		 WebElement checkbox1 = driver.findElement(By.xpath("//div[@class='aside-filter']//input[@value='Onida']"));
		 JavascriptExecutor js1 =(JavascriptExecutor) driver;
		 js1.executeScript("arguments[0].click();",checkbox1);
		 Thread.sleep(2000);
		 WebElement checkbox2 = driver.findElement(By.xpath("//div[@class='aside-filter']//input[@value=\"43 Inches\"]"));
		 JavascriptExecutor js2 =(JavascriptExecutor) driver;
		 js2.executeScript("arguments[0].click();",checkbox2);
		 Thread.sleep(2000);
		 WebElement checkbox3 = driver.findElement(By.xpath("//div[@class='filter-list'][4]//input[@value=\"2\"]"));
		 JavascriptExecutor js3 =(JavascriptExecutor) driver;
		 js3.executeScript("arguments[0].click();",checkbox3);
		 Thread.sleep(2000);
		 WebElement checkbox4 = driver.findElement(By.xpath("//div[@class='filter-list'][5]//input[@value=\"2\"]"));
		 JavascriptExecutor js4 =(JavascriptExecutor) driver;
		 js4.executeScript("arguments[0].click();",checkbox4);
		 Thread.sleep(2000);
		 WebElement checkbox5 = driver.findElement(By.xpath("//div[@class='filter-list'][6]//input[@value=\"FHD LED\"]"));
		 JavascriptExecutor js5 =(JavascriptExecutor) driver;
		 js5.executeScript("arguments[0].click();",checkbox5);
		 Thread.sleep(2000);
		 WebElement checkbox6 = driver.findElement(By.xpath("//div[@class='filter-list'][7]//input[@value=\"1 Year\"]"));
		 JavascriptExecutor js6 =(JavascriptExecutor) driver;
		 js6.executeScript("arguments[0].click();",checkbox6);
		 Thread.sleep(2000);
		 /*Continue shopping
		 driver.findElement(By.linkText("Continue shopping")).click();
		 Thread.sleep(2000);
		 WebElement checkbox7 = driver.findElement(By.linkText("Electronics And Home Appliances"));
		 JavascriptExecutor js7 =(JavascriptExecutor) driver;
		 js.executeScript("arguments[0].click();",checkbox7);
	//Washing Machines
		 driver.findElement(By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Electronics')]")) .click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@class='category-name text-ellipsis']//p[contains(text(),'Washing Machines')]")).click();
		   WebElement checkbox8 = driver.findElement(By.xpath("//div[@class='aside-filter']//input[@value='Bosch']"));
			 JavascriptExecutor js8 =(JavascriptExecutor) driver;
			 js.executeScript("arguments[0].click();",checkbox8);
			 Thread.sleep(2000);
			 WebElement checkbox9 = driver.findElement(By.xpath("//div[@class='aside-filter']//input[@value='10 Kg']"));
			 JavascriptExecutor js9 =(JavascriptExecutor) driver;
			 js.executeScript("arguments[0].click();",checkbox9);
			 Thread.sleep(2000);
			 WebElement checkbox10 = driver.findElement(By.xpath("//div[@class='aside-filter']//input[@value='Front Load Fully Automatic']"));
			 JavascriptExecutor js10 =(JavascriptExecutor) driver;
			 js.executeScript("arguments[0].click();",checkbox10);
			 */
			 //Cart
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
					WebElement checkbox0 = driver.findElement(By.xpath("//div[@class=\"cart-total\"]//button[@type=\"button\"]"));
					 JavascriptExecutor js0=(JavascriptExecutor) driver;
					 js0.executeScript("arguments[0].click();",checkbox0);
					 Thread.sleep(2000);
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
					 //driver.findElement(By.xpath("//div[@class=\"payment-opt-tab\"]//label[@for=\"Cash\"]")).click();
					 driver.findElement(By.xpath("//div[@class=\"payment-opt-tab\"]//label[@for=\"Card\"]")).click();
					// driver.findElement(By.xpath("//div[@class=\"payment-opt-tab\"]//label[@for=\"Cheque\"]")).click();
					// driver.findElement(By.xpath("//div[@class=\"payment-opt-tab\"]//label[@for=\"CCavenue\"]")).click();
					 //Payment types
					 driver.findElement(By.xpath("//div[@id=\"card\"]//select[@ng-model=\"TypeOfCard\"]//option[@label=\"MAESTRO\"]")).click();
					/* driver.findElement(By.xpath("//div[@id=\"card\"]//select[@ng-model=\"TypeOfCard\"]//option[@label=\"MasterCard\"]")).click();
					 driver.findElement(By.xpath("//div[@id=\"card\"]//select[@ng-model=\"TypeOfCard\"]//option[@label=\"Rupay\"]")).click();
					 driver.findElement(By.xpath("//div[@id=\"card\"]//select[@ng-model=\"TypeOfCard\"]//option[@label=\"Visa\"]")).click();
					 */
					 driver.findElement(By.xpath("//input[@name=\"CardNumber\"]")).sendKeys("4646");
					 driver.findElement(By.xpath("//div[@class=\"tab-content\"]//div[@class=\"text-center\"]//button[@class=\"btn btn-prime\"]")).click();
	}
}