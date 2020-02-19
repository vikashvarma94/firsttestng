package Ninjastore;

import org.testng.annotations.Test;

import com.sun.xml.bind.v2.runtime.unmarshaller.LocatorEx.Snapshot;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class ninjaTest {
	WebDriver driver;	
 @BeforeTest
	public void beforetest() {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "/home/vikas/Downloads/chromedriver_linux64");
		driver.get("http://tutorialsninja.com/demo/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
//img[@class="img-responsive"]
 @Test
public void tc1() throws IOException, InterruptedException{
	 List<WebElement> li =(List<WebElement>) driver.findElements(By.xpath("//img[@class='img-responsive']"));
	 
	 for(int i =1;i<=5;i++) {
		 //li.get(i).click();
		 WebElement ele =li.get(i);
		 Thread.sleep(500);
		 
		 String logoSRC = ele.getAttribute("src");
	     URL imageURL = new URL(logoSRC);
		 BufferedImage img = (BufferedImage) ImageIO.read(imageURL);
// 		 ImageIO.write(img,"png", new File("/home/vikas/dummy.png"+(i)));
 			     
	     
//		 File scr = ((TakesScreenshot)ele).getScreenshotAs(OutputType.FILE);
//		 FileUtils.copyFile(scr,new File("/home/vikas/ninja.png"));
//		 
	 }
 
	 
 }
}
