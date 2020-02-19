package ihubstorestc;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class pricemanagement {
	WebDriver driver;
	@BeforeTest
	public void beforetest() {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "/home/vikas/Downloads/chromedriver_linux64");}
  @Test
  public void price() throws InterruptedException {
	 
		driver.get("http://183.82.123.14/iHubMultiStoresAdminDev");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("superadmin@Ihubstores.In");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Store.123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		//Assert.assertEquals(driver.getTitle(), "iHubMultiStoresAdmin");
		driver.findElement(By.xpath("//a[@class=\"sidebar-toggle\"]")).click();
		driver.findElement(By.linkText("Price Management")).click();
		driver.findElement(By.xpath("(//li/ul/li/a/i)[29]")).click();
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
				Thread.sleep(1000);}}
		String s = driver.findElement(By.xpath("(//tbody/tr)[1]/td[3]")).getText();
		driver.findElement(By.xpath("(//tbody/tr)[1]/td[3]")).sendKeys("600");
		driver.findElement(By.xpath("(//tbody/tr)[1]/td[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@value=\"Selling Apply\"])[1]")).click();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("window.open()");
		 for (String handle : driver.getWindowHandles()) {
		 driver.switchTo().window(handle);}
		 Thread.sleep(1000);
		 
		 System.setProperty("webdriver.chrome.driver", "/home/vikas/Downloads/chromedriver_linux64"); 	
			driver.get("http://183.82.123.14/iHubMultiStoresDev");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"userName\"]")).sendKeys("Enkoor@Ihubstores.In");
			driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"password\"]")).sendKeys("Store.123");
			driver.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();
			Thread.sleep(2000);
		 driver.findElement(By.id("myInput")).sendKeys("watches");
		 Actions a = new Actions(driver);
		 a.sendKeys(Keys.ENTER).perform();
		 
		}}

