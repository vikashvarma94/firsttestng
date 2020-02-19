package ihubstorestc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class tc_63_emiorders {
	@Test
	 public void f() throws InterruptedException {
		  WebDriver driver = new ChromeDriver();
				System.setProperty("webdriver.chrome.driver", "/home/vikas/Downloads/chromedriver_linux64"); 	
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
	driver.findElement(By.xpath("//div[@ng-click=\"BookingAndEMIOrders()\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@ng-click=\"BookingOrders('EMI Orders', 'Total')\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@ng-show=\"asstgrid\"]//input[@ng-model=\"OrdersFrom\"]"))
			.sendKeys("12/12/2019");
	driver.findElement(By.xpath("//div[@ng-show=\"asstgrid\"]//input[@ng-model=\"OrdersTo\"]"))
			.sendKeys("15/12/2019");
	driver.findElement(By.xpath("//div[@ng-show=\"asstgrid\"]//input[@ng-model=\"mobilenumber\"]"))
			.sendKeys("6309765343");
	// driver.findElement(By.xpath("//div[@ng-show=\"asstgrid\"]//input[@ng-model=\"Ordersid\"]")).sendKeys("");
	driver.findElement(By.xpath("//div[@ng-show=\"asstgrid\"]//input[@value=\"Search\"]")).click();
	Thread.sleep(2000);
	// driver.findElement(By.xpath("//div[@ng-show=\"asstgrid\"]//input[@value=\"Reset\"]")).click();
	driver.findElement(By.xpath("//div[@ng-show=\"asstgrid\"]//a[@ng-click=\"toggleGroup(i,i.Orders_Main_ID)\"]"))
			.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//td[@ng-click=\"ViewOrderedProducts(i.Orders_Main_ID,i)\"]")).click();
	driver.findElement(
			By.xpath("//div[@class=\"table-responsive\"]//a[@ng-click=\"NewToggleGroup(y,y.Product_Id)\"]"))
			.click();
  }
}
