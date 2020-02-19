/*package ihubfunctions;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class dashboards {
 @Test
  public void f() {
	//  System.setProperty("webdriver.chrome.driver", "/home/anusha/Downloads/chromedriver_linux64/chromedriver");
	//	WebDriver driver = new ChromeDriver();
		driver.get("http://183.82.123.14/iHubMultiStoresDev");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"userName\"]"))
				.sendKeys("Enkoor@Ihubstores.In");
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"password\"]")).sendKeys("Store.123");
		// Submit
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@ng-click=\"TotalOrderClick()\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@ng-click=\"AllOrders('Cash', 'Total',false)\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@ng-show=\"asstgrid\"]//input[@ng-model=\"OrdersFrom\"]"))
				.sendKeys("01/12/2019");
		driver.findElement(By.xpath("//div[@ng-show=\"asstgrid\"]//input[@ng-model=\"OrdersTo\"]"))
				.sendKeys("31/12/2019");
		driver.findElement(By.xpath("//div[@ng-show=\"asstgrid\"]//input[@ng-model=\"mobilenumber\"]"))
				.sendKeys("6309765343");
		driver.findElement(By.xpath("//div[@ng-show=\"asstgrid\"]//input[@ng-model=\"Ordersid\"]")).sendKeys("");
		Thread.sleep(4000);
		driver.findElement(
				By.xpath("//div[@ng-show=\"asstgrid\"]//input[@ng-click=\"SearchOrders(Orders,orderPaymentmode)\"]"))
				.click();
		Thread.sleep(4000);
		// driver.findElement(By.xpath("//div[@ng-show=\"asstgrid\"]//input[@ng-click=\"Reset(Orders,orderPaymentmode)\"]")).click();
		driver.findElement(By.xpath("//div[@ng-show=\"asstgrid\"]//a[@ng-click=\"toggleGroup(i,i.Orders_Main_ID)\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@ng-click=\"ViewOrderedProducts(i.Orders_Main_ID,i)\"]")).click();
		driver.findElement(
				By.xpath("//div[@class=\"table-responsive\"]//a[@ng-click=\"NewToggleGroup(y,y.Product_Id)\"]"))
				.click();

----------------------------------------------------------
total orders(cheque)-------------------------------------
WebDriver driver = new ChromeDriver();
		driver.get("http://183.82.123.14/iHubMultiStoresDev");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"userName\"]"))
				.sendKeys("Enkoor@Ihubstores.In");
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"password\"]")).sendKeys("Store.123");
		// Submit
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@ng-click=\"TotalOrderClick()\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@ng-click=\"AllOrders('Cheque', 'Total',false)\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@ng-show=\"asstgrid\"]//input[@ng-model=\"OrdersFrom\"]"))
				.sendKeys("01/12/2019");
		driver.findElement(By.xpath("//div[@ng-show=\"asstgrid\"]//input[@ng-model=\"OrdersTo\"]"))
				.sendKeys("31/12/2019");
		driver.findElement(By.xpath("//div[@ng-show=\"asstgrid\"]//input[@ng-model=\"mobilenumber\"]"))
				.sendKeys("6309765343");
		driver.findElement(By.xpath("//div[@ng-show=\"asstgrid\"]//input[@ng-model=\"Ordersid\"]")).sendKeys("");
		Thread.sleep(4000);
		driver.findElement(
				By.xpath("//div[@ng-show=\"asstgrid\"]//input[@ng-click=\"SearchOrders(Orders,orderPaymentmode)\"]"))
				.click();
		Thread.sleep(4000);
		// driver.findElement(By.xpath("//div[@ng-show=\"asstgrid\"]//input[@ng-click=\"Reset(Orders,orderPaymentmode)\"]")).click();
		driver.findElement(By.xpath("//div[@ng-show=\"asstgrid\"]//a[@ng-click=\"toggleGroup(i,i.Orders_Main_ID)\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@ng-click=\"ViewOrderedProducts(i.Orders_Main_ID,i)\"]")).click();
		driver.findElement(
				By.xpath("//div[@class=\"table-responsive\"]//a[@ng-click=\"NewToggleGroup(y,y.Product_Id)\"]"))
				.click();
------------------------------------------------
total orders(card)----------------------------
WebDriver driver = new ChromeDriver();
		driver.get("http://183.82.123.14/iHubMultiStoresDev");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"userName\"]"))
				.sendKeys("Enkoor@Ihubstores.In");
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"password\"]")).sendKeys("Store.123");
		// Submit
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@ng-click=\"TotalOrderClick()\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@ng-click=\"AllOrders('Card', 'Total',false)\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@ng-show=\"asstgrid\"]//input[@ng-model=\"OrdersFrom\"]"))
				.sendKeys("01/12/2019");
		driver.findElement(By.xpath("//div[@ng-show=\"asstgrid\"]//input[@ng-model=\"OrdersTo\"]"))
				.sendKeys("31/12/2019");
		driver.findElement(By.xpath("//div[@ng-show=\"asstgrid\"]//input[@ng-model=\"mobilenumber\"]"))
				.sendKeys("6309765343");
		driver.findElement(By.xpath("//div[@ng-show=\"asstgrid\"]//input[@ng-model=\"Ordersid\"]")).sendKeys("");
		Thread.sleep(4000);
		driver.findElement(
				By.xpath("//div[@ng-show=\"asstgrid\"]//input[@ng-click=\"SearchOrders(Orders,orderPaymentmode)\"]"))
				.click();
		Thread.sleep(4000);
		// driver.findElement(By.xpath("//div[@ng-show=\"asstgrid\"]//input[@ng-click=\"Reset(Orders,orderPaymentmode)\"]")).click();
		driver.findElement(By.xpath("//div[@ng-show=\"asstgrid\"]//a[@ng-click=\"toggleGroup(i,i.Orders_Main_ID)\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@ng-click=\"ViewOrderedProducts(i.Orders_Main_ID,i)\"]")).click();
		driver.findElement(
				By.xpath("//div[@class=\"table-responsive\"]//a[@ng-click=\"NewToggleGroup(y,y.Product_Id)\"]"))
				.click();
------------------------------------------------
total orders(wallet)---------------------------------
WebDriver driver = new ChromeDriver();
		driver.get("http://183.82.123.14/iHubMultiStoresDev");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"userName\"]"))
				.sendKeys("Enkoor@Ihubstores.In");
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"password\"]")).sendKeys("Store.123");
		// Submit
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@ng-click=\"TotalOrderClick()\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@ng-click=\"AllOrdersForWCCB('Wallet', 'Total',false)\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@ng-show=\"asstgrid\"]//input[@ng-model=\"OrdersFrom\"]"))
				.sendKeys("01/12/2019");
		driver.findElement(By.xpath("//div[@ng-show=\"asstgrid\"]//input[@ng-model=\"OrdersTo\"]"))
				.sendKeys("31/12/2019");
		driver.findElement(By.xpath("//div[@ng-show=\"asstgrid\"]//input[@ng-model=\"mobilenumber\"]"))
				.sendKeys("6309765343");
		driver.findElement(By.xpath("//div[@ng-show=\"asstgrid\"]//input[@ng-model=\"Ordersid\"]")).sendKeys("");
		Thread.sleep(4000);
		driver.findElement(
				By.xpath("//div[@ng-show=\"asstgrid\"]//input[@ng-click=\"SearchOrders(Orders,orderPaymentmode)\"]"))
				.click();
		Thread.sleep(4000);
		// driver.findElement(By.xpath("//div[@ng-show=\"asstgrid\"]//input[@ng-click=\"Reset(Orders,orderPaymentmode)\"]")).click();
		driver.findElement(By.xpath("//div[@ng-show=\"asstgrid\"]//a[@ng-click=\"toggleGroup(i,i.Orders_Main_ID)\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@ng-click=\"ViewOrderedProducts(i.Orders_Main_ID,i)\"]")).click();
		driver.findElement(
				By.xpath("//div[@class=\"table-responsive\"]//a[@ng-click=\"NewToggleGroup(y,y.Product_Id)\"]"))
				.click();
--------------------------------------------------
//total orders(coupon)---------------------------------------------------------
//WebDriver driver = new ChromeDriver();
		driver.get("http://183.82.123.14/iHubMultiStoresDev");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"userName\"]"))
				.sendKeys("Enkoor@Ihubstores.In");
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"password\"]")).sendKeys("Store.123");
		// Submit
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@ng-click=\"TotalOrderClick()\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@ng-click=\"AllOrdersForWCCB('Coupon', 'Total',false)\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@ng-show=\"asstgrid\"]//input[@ng-model=\"OrdersFrom\"]"))
				.sendKeys("01/12/2019");
		driver.findElement(By.xpath("//div[@ng-show=\"asstgrid\"]//input[@ng-model=\"OrdersTo\"]"))
				.sendKeys("31/12/2019");
		driver.findElement(By.xpath("//div[@ng-show=\"asstgrid\"]//input[@ng-model=\"mobilenumber\"]"))
				.sendKeys("6309765343");
		driver.findElement(By.xpath("//div[@ng-show=\"asstgrid\"]//input[@ng-model=\"Ordersid\"]")).sendKeys("");
		Thread.sleep(4000);
		driver.findElement(
				By.xpath("//div[@ng-show=\"asstgrid\"]//input[@ng-click=\"SearchOrders(Orders,orderPaymentmode)\"]"))
				.click();
		Thread.sleep(4000);
		// driver.findElement(By.xpath("//div[@ng-show=\"asstgrid\"]//input[@ng-click=\"Reset(Orders,orderPaymentmode)\"]")).click();
		driver.findElement(By.xpath("//div[@ng-show=\"asstgrid\"]//a[@ng-click=\"toggleGroup(i,i.Orders_Main_ID)\"]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@ng-click=\"ViewOrderedProducts(i.Orders_Main_ID,i)\"]")).click();
		driver.findElement(
				By.xpath("//div[@class=\"table-responsive\"]//a[@ng-click=\"NewToggleGroup(y,y.Product_Id)\"]"))
				.click();
//-------------------------------------------


  }
}*/
