package ihubfunctions;

import static org.testng.Assert.expectThrows;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.print.DocFlavor.STRING;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Teststore {
	WebDriver driver;
	 @Test(priority=0)
	  public void test() throws InterruptedException, IOException {
		 
		  WebDriver driver = new ChromeDriver();
	      System.setProperty("webdriver.chrome.driver", "/home/vikas/Downloads/chromedriver_linux64"); 	
	      try {
			driver.get("http://205.147.109.73/iHubMultistoresStoreTRG");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"userName\"]")).sendKeys("Enkoor@Ihubstores.In");
			driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"password\"]")).sendKeys("Store.123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();
			Thread.sleep(2000);
			//assert
			Assert.assertEquals(driver.getTitle(), "iHubMultiStores");
			
			Actions a = new Actions(driver);
			a.moveToElement(driver.findElement(By.xpath("//p[@class=\"no-margin\"]"))).perform();
			a.moveToElement(driver.findElement(By.linkText("Boys"))).perform();
			driver.findElement(By.linkText("Clothing")).click();
//			Clothing
//			Footwear
//			Accessories
//			School Supplies
			
			Thread.sleep(500);
			List<WebElement> lb = (List<WebElement>) driver.findElements(By.xpath("//div[@class='shopnow-btn']"));
			for(int v=0;v<1;v++) {//123..
			lb.get(v).click();
			Thread.sleep(1000);
			Select s = new Select(driver.findElement(By.xpath("//select[@ng-model=\"filterProductsSort\"]")));
			s.selectByVisibleText("Discount");
			Thread.sleep(500);
			List<WebElement> lc = (List<WebElement>) driver.findElements(By.xpath("//i[@class=\"check\"]"));
			Thread.sleep(500);
			for(int i=0;i<=2;i++) {
				lc.get(i).click();
				Thread.sleep(2000);}
			//driver.navigate().back();
			Thread.sleep(1000);}
			//add to cart
			 driver.findElement(By.xpath("//div[@class=\"media\"]//button[@class=\"btn buy-btn\"]")).click();
			   Thread.sleep(2000);
			 			   
				driver.findElement(By.xpath("//input[@id=\"MobileNumber\"]")).sendKeys("9666262992");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id=\"btnSave\"]")).click();
				Thread.sleep(2000); 
				driver.findElement(By.xpath("//div[@class=\"media\"]//button[@ng-click=\"Add_Product_ToCart(Product)\"]")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[@class=\"cart-bag\"]")).click();
				Thread.sleep(2000);
				//	assert
				WebElement e = driver.findElement(By.xpath("((//div/table/tbody)[2]/tr)[1]"));
				System.out.println(e.getText());
				Assert.assertEquals(e.getText(), "Cart (2 Items) ₹10,099.00");
				
				
			//scrshot	
			File scren = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scren,new File("/home/vikas/scr.png"));
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@ng-click='CheckOut()']")).click();
			Thread.sleep(2000);
			
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
				 /*Store address
				WebElement link11= driver.findElement(By.xpath("//i[@for=\"check-\"]"));
				 JavascriptExecutor js11 =(JavascriptExecutor) driver;
				 js11.executeScript("arguments[0].click();",link11);
				 Thread.sleep(2000);*/
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
				// driver.findElement(By.xpath("//label[@for='Cash']")).click();
		
				// driver.findElement(By.xpath("//div[@class=\"payment-opt-tab\"]//label[@for=\"Cheque\"]")).click();
				// driver.findElement(By.xpath("//div[@class=\"payment-opt-tab\"]//label[@for=\"CCavenue\"]")).click();
				 //Payment types
				Thread.sleep(1000);
				/* driver.findElement(By.xpath("//div[@id=\"card\"]//select[@ng-model=\"TypeOfCard\"]//option[@label=\"MAESTRO\"]")).click();
				 driver.findElement(By.xpath("//div[@id=\"card\"]//select[@ng-model=\"TypeOfCard\"]//option[@label=\"MasterCard\"]")).click();
				 driver.findElement(By.xpath("//div[@id=\"card\"]//select[@ng-model=\"TypeOfCard\"]//option[@label=\"Rupay\"]")).click();
				 driver.findElement(By.xpath("//div[@id=\"card\"]//select[@ng-model=\"TypeOfCard\"]//option[@label=\"Visa\"]")).click();
				
				 driver.findElement(By.xpath("//input[@name=\"CardNumber\"]")).sendKeys("4646"); */
				 driver.findElement(By.xpath("//div[@class=\"tab-content\"]//div[@class=\"text-center\"]//button[@class=\"btn btn-prime\"]")).click();
				 
				//scrshot	
					
					//
}catch(Exception e){
	File scren1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scren1,new File("/home/vikas/screen2.png"));
}
//@AfterMethod
//public void invokeScreenshotMethod(ITestResult res)
//{
//if (ITestResult.FAILURE==res.getStatus()){
//try{
//TakesScreenshot ts=(TakesScreenshot) driver;
//
//File src= ts.getScreenshotAs(OutputType.FILE);
//FileUtils.copyFile(src, new File("/home/vikas/"+res.getName()+".png"));
//}
//catch(Exception e)
//{
//
//System.out.println("");
//}}
}}