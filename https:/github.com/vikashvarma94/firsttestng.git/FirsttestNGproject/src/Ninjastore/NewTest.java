package Ninjastore;

import java.awt.Desktop.Action;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.swing.border.TitledBorder;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
  @Test
  public void login() throws InterruptedException, IOException {
 try {driver.get("http://tutorialsninja.com/demo/");
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//a[@title=\"My Account\"]")).click();
	  
	  FileInputStream ff = new FileInputStream("/home/vikas/Desktop/bank.xlsx");
	  XSSFWorkbook wb= new XSSFWorkbook(ff);
	  XSSFSheet sh = wb.getSheetAt(4);
	  
	  for(int i =1;i<=10;i++) {
		  
			for (int j=0;j<=7;j++) { 
			  String value[][] = new String[10][10];
		  	  value[i][j] = sh.getRow(i).getCell(j).getStringCellValue();
		  	  System.out.println(value[1][0]);
		  	  System.out.println(value[1][1]);
		  	  
			 if(sh.getRow(1).getCell(0).getStringCellValue().equals("register")) { 
				  driver.findElement(By.linkText("Register")).click();
				  Thread.sleep(1000);
				  driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(sh.getRow(1).getCell(1).getStringCellValue());
				  driver.findElement(By.name("lastname")).sendKeys(sh.getRow(1).getCell(2).getStringCellValue());
				  driver.findElement(By.name("email")).sendKeys(sh.getRow(1).getCell(3).getStringCellValue());
				  driver.findElement(By.name("telephone")).sendKeys(sh.getRow(1).getCell(4).getStringCellValue());
				  driver.findElement(By.name("password")).sendKeys(sh.getRow(1).getCell(5).getStringCellValue());
				  driver.findElement(By.name("confirm")).sendKeys(sh.getRow(1).getCell(6).getStringCellValue());
				  driver.findElement(By.name("agree")).click();
				  driver.findElement(By.xpath("//input[@value='Continue']")).click();
				  Thread.sleep(500);
				  // String title = driver.getTitle();
				  FileOutputStream fos = new FileOutputStream("/home/vikas/Desktop/bank.xlsx");
				  
				  sh.getRow(1).createCell(7).setCellValue(driver.getTitle());
				  wb.write(fos);
			   
				  if (sh.getRow(1).getCell(7).getStringCellValue()!=null){
				  driver.findElement(By.linkText("Login")).click();
				  Thread.sleep(500);
				  driver.findElement(By.name("email")).sendKeys(sh.getRow(1).getCell(3).getStringCellValue());
				  driver.findElement(By.name("password")).sendKeys(sh.getRow(1).getCell(5).getStringCellValue());
				  driver.findElement(By.xpath("//input[@value='Login']")).click();
				  Thread.sleep(500);
				  sh.getRow(1).createCell(8).setCellValue(driver.getTitle());
				  wb.write(fos);
			  }
			   else {
				  System.out.println("Reg failed");
			   }}
			   else {
				  System.out.println("loop failed");
			  }
		  }}
			  
	  }catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
}
  @Test
  public void guest() throws FileNotFoundException, InterruptedException{
	  
	  driver.get("http://tutorialsninja.com/demo/index.php?route=common/home");
	  		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  		Actions a = new Actions(driver);
	  		WebElement ele = driver.findElement(By.linkText("Desktops"));
	  		a.moveToElement(ele).click().perform();
	  		driver.findElement(By.linkText("Mac (1)")).click();
	  		driver.findElement(By.xpath("//img[@title=\"iMac\"]")).click();
	  		Thread.sleep(500);
	  		driver.findElement(By.id("button-cart")).click();
	  		Thread.sleep(500);
	  		driver.findElement(By.id("cart-total")).click();
	  		driver.findElement(By.linkText(" Checkout")).click();
	  		Thread.sleep(500);
	  		driver.findElement(By.xpath("//input[@value=\"guest\"")).click();
  }
  
}
