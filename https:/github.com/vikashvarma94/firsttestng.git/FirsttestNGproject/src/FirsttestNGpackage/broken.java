package FirsttestNGpackage;

import org.testng.annotations.Test;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class broken {
	public WebDriver driver;
	
  @Test
  public void beforeTest() throws InterruptedException {
		System.setProperty("webDriver.chrome.driver", "/home/vikas/Downloads/chromedriver_linux64");
		WebDriver driver = new ChromeDriver();
		driver.get("http://192.168.7.5/iHubstoressqlQA");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"userName\"]")).sendKeys("Enkoor@Ihubstores.In");
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//input[@name=\"password\"]")).sendKeys("Store.123");
		Thread.sleep(2000);
		// Submit
		driver.findElement(By.xpath("//div[@class=\"card effect2\"]//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		  List<WebElement> li = driver.findElements(By.tagName("a"));
		  System.out.println(li.size());
		  for(int i=0;i<=100;i++) {
			  WebElement ele = (WebElement) li.get(i);
			  String url =  ele.getAttribute("href");
			  verifylink(url);
		  }
  }
private void verifylink(String url) {
	try {
		URL link = new URL(url);
		HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
		httpConn.setConnectTimeout(2000);
		//connect using connect method
		httpConn.connect();
		//use getResponseCode() to get the response code. 
			if(httpConn.getResponseCode()== 200) {	
				System.out.println(link+" - "+httpConn.getResponseMessage());
			}
			else if(httpConn.getResponseCode()== 404) {
				System.out.println(link+" - "+httpConn.getResponseMessage());
			}
			else {
				System.out.println("ok");
			}
		}
		//getResponseCode method returns = IOException - if an error occurred connecting to the server. 
	catch (Exception e) {
		//e.printStackTrace();
	}
} 
	
}
