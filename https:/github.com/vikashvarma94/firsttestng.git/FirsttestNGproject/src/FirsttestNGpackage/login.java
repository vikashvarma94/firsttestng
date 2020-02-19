package FirsttestNGpackage;

import org.openqa.selenium.By.ByXPath;

import static org.junit.Assume.assumeTrue;
import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class login {
	
	public String path = "/home/vikas/Downloads/chromedriver_linux64";
	public WebDriver driver;
	String url = "http://www.demo.guru99.com/V4/";
	
	@BeforeTest
	public void launch() {
	System.setProperty("WebDriver.chrome.driver",path);
	driver = new ChromeDriver();
	//driver.get(url);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
//  @Test(priority =0)
//  public void webtest() {
//	 
//	 String at= driver.getTitle();
//	 String et = "Guru99 Bank Home Page";
//	 Assert.assertEquals(at, et);
//  }
//  @Test(priority=1)
//  public void logintest() throws IOException{
//	  FileInputStream fis = new FileInputStream("/home/vikas/Desktop/bank.xlsx");
//	  XSSFWorkbook wb = new XSSFWorkbook(fis);
//	  XSSFSheet sh =wb.getSheetAt(0);
//	  
//	
//	  int lastrow = sh.getLastRowNum();
//	  for (int i=1;i<lastrow;i++) {
//		 String email = sh.getRow(i).getCell(0).getStringCellValue();
//		 String pass = sh.getRow(i).getCell(1).getStringCellValue();
//		driver.get(url);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	  	WebElement e = driver.findElement(By.xpath("//input[@name=\"uid\"]"));
//	  	e.clear();
//	  	e.sendKeys(email);
//	  	driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(pass);
//		driver.findElement(By.xpath("//input[@name=\"btnLogin\"]")).click();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Alert al= driver.switchTo().alert();
//		al.dismiss();
//		String aat =driver.getTitle();
//		System.out.println(aat);
//		String eet = "Guru99 Bank manager Home Page";
//		FileOutputStream fos = new FileOutputStream("/home/vikas/Desktop/bank.xlsx");
//		wb.write(fos);
//		
//		if (aat.equalsIgnoreCase(eet)) {
//			Assert.assertEquals(aat, eet);
//			sh.getRow(i).createCell(2).setCellValue("loged in successfully");		
//			break;
//		}
//		else {
//			driver.navigate().back();
//			sh.getRow(i).createCell(2).setCellValue("login failed");	
//			continue;
//		}	
//		}	
//}
  @Test
  public void tc2() throws InterruptedException {
  driver.get("https://www.softwaretestingmaterial.com");
	//Wait for 5 seconds
	Thread.sleep(5000);
	//Used tagName method to collect the list of items with tagName "a"
	//findElements - to find all the elements with in the current page. It returns a list of all webelements or an empty list if nothing matches
	List<WebElement> links = driver.findElements(By.tagName("a"));	
	//To print the total number of links
	System.out.println("Total links are "+links.size());	
	//used for loop to 
	for(int i=0; i<links.size(); i++) {
		WebElement element = links.get(i);
		//By using "href" attribute, we could get the url of the requried link
		String url=element.getAttribute("href");
		//calling verifyLink() method here. Passing the parameter as url which we collected in the above link
		//See the detailed functionality of the verifyLink(url) method below
	verifyLink(url);			
	}	
}

// The below function verifyLink(String urlLink) verifies any broken links and return the server status. 
public static void verifyLink(String urlLink) {
  //Sometimes we may face exception "java.net.MalformedURLException". Keep the code in try catch block to continue the broken link analysis
  try {
		//Use URL Class - Create object of the URL Class and pass the urlLink as parameter 
		URL link = new URL(urlLink);
		// Create a connection using URL object (i.e., link)
		HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
		//Set the timeout for 2 seconds
		httpConn.setConnectTimeout(2000);
		//connect using connect method
		httpConn.connect();
		//use getResponseCode() to get the response code. 
			if(httpConn.getResponseCode()== 200) {	
				System.out.println(urlLink+" - "+httpConn.getResponseMessage());
			}
			else if(httpConn.getResponseCode()== 404) {
				System.out.println(urlLink+" - "+httpConn.getResponseMessage());
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