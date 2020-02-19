package ihubstorestc;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class tc_26_addtocart {
	WebDriver driver;
  @Test
  public void signin() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "/home/vikas/Downloads/chromedriver_linux64"); 	
		
		driver.get("http://183.82.123.14/iHubMultiStoresDev");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"userName\"]")).sendKeys("Enkoor@Ihubstores.In");
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"password\"]")).sendKeys("Store.123");
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();
		Thread.sleep(3000);
		List<WebElement> li = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		for(int i = 0; i<5;i++) {
			li.get(i).click();
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type=\"button\"])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class=\"ng-confirm-btn-text\"]")).click();
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//p[@class=\"no-margin\"]"))).perform();
		a.moveToElement(driver.findElement(By.linkText("Boys"))).perform();
		driver.findElement(By.linkText("Clothing")).click();
//		Clothing
//		Footwear
//		Accessories
//		School Supplies
		
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
			Assert.assertEquals(e.getText(), "Cart (1 Item) ₹199.00");
			
  }}
			