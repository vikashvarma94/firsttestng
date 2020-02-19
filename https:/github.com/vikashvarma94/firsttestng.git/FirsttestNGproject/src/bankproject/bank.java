package bankproject;

import static org.testng.Assert.assertEquals;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class bank {
	private static final TimeUnit TimeUnit_seconds = null;
	public String path = "/home/vikas/Downloads/chromedriver_linux64";
	public WebDriver driver;
	String url = "http://www.demo.guru99.com/V4/";
	
	@BeforeTest
	public void launch(){
	System.setProperty("WebDriver.chrome.driver",path);
	driver = new ChromeDriver();
	driver.get(url);
	driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr224915");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("tYbymUv");
	driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);      
	}
	
	@DataProvider()
	public void data(Object DataFormatter) throws IOException {
		 FileInputStream fis = new FileInputStream("/home/vikas/Desktop/bank.xlsx");
		 XSSFWorkbook wb = new XSSFWorkbook (fis);
		 DataFormatter formatter = new DataFormatter();
	}

	@Test (priority = 0)
	public void login() {
	  WebElement e = driver.findElement( By.xpath("//td[@style=\"color: green\"]"));
	  Assert.assertEquals("Manger Id : mngr224915", e.getText());	 
  }
  
	@Test (priority=1)
	public void createuser()throws IOException, InterruptedException  {
	  driver.findElement(By.linkText("New Customer")).click();
	  String vikas[][]= new String[10][10];
	  
	FileInputStream fis = new FileInputStream("/home/vikas/Desktop/bank.xlsx");
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sh = wb.getSheetAt(1);
	for (int i=2;i<=sh.getLastRowNum();i++) {
		  for (int j=0;j<=9;j++) {
		
		vikas[i][j] = sh.getRow(i).getCell(j).getStringCellValue();
		Thread.sleep(500);

		if (j==0) {driver.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys(vikas[i][0]);}
		else if(j==1) {
		if ("female".equalsIgnoreCase(vikas[i][1])){
		  WebElement m = driver.findElement(By.xpath("//input[@value=\"f\"]"));
		  m.click();
		  m.isSelected();}
		else {
		  WebElement f = driver.findElement(By.xpath("//input[@value=\"m\"]"));
		  f.click();
		  f.isSelected();}  }
		  
		else if(j==2) { driver.findElement(By.xpath("//input[@name=\"dob\"]")).sendKeys(vikas[i][2]);}
		else if(j==3) {driver.findElement(By.xpath("//textarea[@name=\"addr\"]")).sendKeys(vikas[i][3]);}
		else if(j==4) {  driver.findElement(By.xpath("//input[@name=\"city\"]")).sendKeys(vikas[i][4]);}
		else if(j==5) {  driver.findElement(By.xpath("//input[@name=\"state\"]")).sendKeys(vikas[i][5]);}
		else if(j==6) {  driver.findElement(By.xpath("//input[@name=\"pinno\"]")).sendKeys(vikas[i][6]);}
		else if(j==7) {  driver.findElement(By.xpath("//input[@name=\"telephoneno\"]")).sendKeys(vikas[i][7]);}
		else if(j==8) {  driver.findElement(By.xpath("//input[@name=\"emailid\"]")).sendKeys(vikas[i][8]);}
		else{driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(vikas[i][9]);}	  	  
	  }
	 driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	 Thread.sleep(500);
	 driver.switchTo().alert().accept();
  }}
	  @Test (priority = 1)
	  public void newacct() throws IOException, InterruptedException {
		  driver.findElement(By.linkText("New Account")).click();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit_seconds);
		  //driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys("v985623");
		  String vikas[][] = new String[10][10];
		  
		  FileInputStream fis = new FileInputStream("/home/vikas/Desktop/bank.xlsx");
		  XSSFWorkbook wb = new XSSFWorkbook (fis);
		  XSSFSheet sh = wb.getSheetAt(3);
				
		 for (int k=2;k<=sh.getLastRowNum();k++) {
			for (int l=0;l<=2;l++) {
			vikas[k][l] =sh.getRow(k).getCell(l).getStringCellValue();
			Thread.sleep(500);
			
			if(l==0) {driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys(vikas[k][0]);}
			else if (l==1){
				Select type =new Select(driver.findElement(By.xpath("//select[@name=\"selaccount\"]")));
				type.selectByVisibleText(vikas[k][1]);}
			else {driver.findElement(By.xpath("//input[@name=\"inideposit\"]")).sendKeys(vikas[k][2]);}
			}
		 driver.findElement(By.xpath("//input[@name=\"button2\"]")).click();
	  }
	  
}}
