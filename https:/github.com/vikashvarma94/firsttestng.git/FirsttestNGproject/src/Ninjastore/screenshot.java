package Ninjastore;

import org.testng.annotations.Test;

import com.sun.xml.bind.v2.runtime.unmarshaller.LocatorEx.Snapshot;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.poi.poifs.filesystem.FileMagic;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Hyperlink;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class screenshot {

	WebDriver driver;	
	@BeforeTest
	public void beforetest() {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "/home/vikas/Downloads/chromedriver_linux64");
		driver.get("http://google.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
  
  	@Test
  	public void scr() throws IOException{
	File scren = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	// System.out.println(scren);
	 FileUtils.copyFile(scren,new File("/home/vikas/scr.png"));
	// String vikas = FileUtils.readFileToString(new File("/home/vikas/scr.png"));
	
//	 BufferedImage Img = ImageIO.read(scren);
//	 FileInputStream fi = new FileInputStream("/home/vikas/Desktop/bank.xlsx");
//	 XSSFWorkbook wb = new XSSFWorkbook(fi);
//	 
//	 FileOutputStream fo = new FileOutputStream("/home/vikas/Desktop/bank.xlsx");
//	 XSSFSheet sh = wb.getSheetAt(1);
//	 wb.write(fo);
//	 for(int i=0;i<=1;i++) {
//	 sh.getRow(i).createCell(4).setcelvalue(scren);
 
}}