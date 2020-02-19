package FirsttestNGpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	@BeforeTest
	public void beforetest() {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "/home/vikas/Downloads/chromedriver_linux64");
	}
  @Test
  public void addproduct() throws InterruptedException {
	 
		driver.get("http://183.82.123.14/iHubMultiStoresAdminDev");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);}
  @Test
	
  public void checkproductinstore() throws InterruptedException {
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.open()");
	String Mainwindow = driver.getWindowHandle();
	java.util.Set<String> s1 = driver.getWindowHandles();
	java.util.Iterator<String> i1 = s1.iterator();
	while(i1.hasNext()) 
	{ 
	String ChildWindow=i1.next();
	if(!Mainwindow.equalsIgnoreCase(ChildWindow)) 
	{ 
	driver.switchTo().window(Mainwindow);
	driver.navigate().back();
	}
	  }
driver.get("http://183.82.123.14/iHubMultiStoresDev");
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


driver.switchTo().window(Mainwindow);
driver.navigate().back();

  }}
