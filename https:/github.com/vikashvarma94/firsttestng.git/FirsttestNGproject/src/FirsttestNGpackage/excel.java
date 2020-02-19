package FirsttestNGpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.stream.FileImageInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class excel {

	public static void main(String[] args) throws IOException, InterruptedException {
	
		/*System.setProperty("WebDriver.chrome.Driver","/home/vikas/Downloads/chromedriver_linux64");//diver
		WebDriver d =new ChromeDriver();*/
		String url = "http://www.demo.guru99.com/V4/";
		System.setProperty("webdriver.firefox.marionette", "/home/vikas/Documents/geckodriver-v0.25.0-linux64(1)/geckodriver.exe");
		WebDriver d= new FirefoxDriver();

		d.get(url);
		d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				
		FileInputStream fis = new FileInputStream("/home/vikas/Desktop/bank.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0);
		FileOutputStream fos = new FileOutputStream("/home/vikas/Desktop/bank.xlsx");
		wb.write(fos);
		
		String vikas[][]=new String[10][10];
		int lastrow=sh.getLastRowNum();
		
		for (int i=1;i<=lastrow;i++){
			for (int j=1;j<=lastrow;i++){
			vikas[i][j] = sh.getRow(i).getCell(j).getStringCellValue();
			String email = sh.getRow(i).getCell(0).getStringCellValue();
			String pass = sh.getRow(i).getCell(1).getStringCellValue();
			
		d.findElement(By.xpath("//input[@name=\"uid\"]")).sendKeys(email);
		d.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(pass);
		d.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click();	
		Alert al = d.switchTo().alert();
		al.dismiss();
		Thread.sleep(500);
		String et = d.getTitle();
		String at = "Guru99 Bank Manager HomePage";
		
		if (at.equalsIgnoreCase(et)) {
		sh.getRow(i).createCell(2).setCellValue("loged in sucessfully");
		break;
		}
		else {
		sh.getRow(i).createCell(2).setCellValue("login failed");
		continue;
		}
		}
		}
		}}


