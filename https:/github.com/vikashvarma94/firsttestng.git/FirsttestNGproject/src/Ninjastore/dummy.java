package Ninjastore;

import org.testng.annotations.Test;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class dummy {
	public WebDriver driver;
	
	 @BeforeTest
	  public void beforeTest() {
		 driver =new ChromeDriver();
		 System.setProperty("webdriver.chrome.driver", "/home/vikas/Downloads/chromedriver_linux64");
		 driver.get("http://tutorialsninja.com/demo/");
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  }

	 @Test
   		public void f() throws IOException {
		 List<WebElement> li = (List<WebElement>)driver.findElements(By.xpath("//img[@class='img-responsive']"));
	  
		 for(int i=0;i<=li.size();i++) {
		  String ele = li.get(i).getAttribute("src");
		  URL imgurl = new URL(ele);
		  
		  BufferedImage img = (BufferedImage)ImageIO.read(imgurl);
		
		  ImageIO.write(img, "png", new File("/home/vikas/dummy.png"+(i)));
		  
	  }
  } 
}
