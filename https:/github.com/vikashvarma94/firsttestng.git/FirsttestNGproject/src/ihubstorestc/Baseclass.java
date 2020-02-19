package ihubstorestc;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Baseclass {
	WebDriver driver;
  @BeforeClass
  public void beforeClass() {
	  driver = new ChromeDriver();
	  System.setProperty("webdriver.chrome.driver", "/home/vikas/Downloads/chromedriver_linux64");	
	    	
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  driver.quit();
	  
	  Thread.sleep(3000);
  }

}
