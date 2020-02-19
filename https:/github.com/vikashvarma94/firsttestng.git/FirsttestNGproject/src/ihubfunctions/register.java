package ihubfunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class register {
	WebDriver driver;	
 @BeforeTest
	public void beforetest() {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "/home/vikas/Downloads/chromedriver_linux64");
		driver.get("http://205.147.109.73/iHubDirectUAT");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@placeholder=\"search\"]")).sendKeys("hyderabad");
		Actions a = new Actions(driver);
		a.sendKeys(Keys.ENTER).perform();
	}
	
  @Test
  public void register() throws InterruptedException {
	 
	  Thread.sleep(500);
	  driver.findElement(By.xpath("(//a[@class=\"sbold\"])[2]")).click();
	  Thread.sleep(500);
	  driver.findElement(By.name("FullName")).sendKeys("");
	  driver.findElement(By.xpath("//label[@for=\"switch_left\"]")).click();//right
	  driver.findElement(By.name("MobileNumber")).sendKeys("");
	  driver.findElement(By.name("EmailID")).sendKeys("");
	  driver.findElement(By.name("Password")).sendKeys("");
	  driver.findElement(By.name("ConfirmPassword")).sendKeys("");
	  driver.findElement(By.xpath("(//button[@type=\"submit\"])[3]")).click();
	  Thread.sleep(500);
	  driver.findElement(By.name("OTP")).sendKeys("");
	  
		  
  }
  
  
  @Test
  public void signin() throws InterruptedException, IOException {
	  Thread.sleep(500);
	  driver.findElement(By.xpath("(//a[@class=\"sbold\"])[1]")).click();
	  Thread.sleep(500);
	  
	  FileInputStream fis = new FileInputStream("/home/vikas/Desktop/ihub.xlsx");
	  XSSFWorkbook wb = new XSSFWorkbook(fis);
	  XSSFSheet sh = wb.getSheetAt(0);
	  Thread.sleep(500);
	  for(int i=1;i<=sh.getLastRowNum();i++) { 
	  driver.findElement(By.xpath("(//input[@placeholder=\"Mobile Number\"])[4]")).sendKeys(sh.getRow(i).getCell(1).getStringCellValue());
	  driver.findElement(By.name("password")).sendKeys(sh.getRow(i).getCell(2).getStringCellValue());
	  driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
	  Thread.sleep(500);
	  String at = driver.getTitle();
	  String et = "iHubMultiStores";
	  FileOutputStream fos = new FileOutputStream("/home/vikas/Desktop/ihub.xlsx");
	  sh.getRow(i).createCell(3).setCellValue(at);  
	  wb.write(fos);
  }
  }
}