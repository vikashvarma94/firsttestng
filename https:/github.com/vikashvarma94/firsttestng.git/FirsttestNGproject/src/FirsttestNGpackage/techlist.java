package FirsttestNGpackage;

import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

public class techlist {
	public static WebDriver driver;

@BeforeTest
  public void beforeTest() throws InterruptedException {
	System.setProperty("webDriver.chrome.driver", "/home/vikas/Downloads/chromedriver_linux64");
	 driver = new ChromeDriver();	
  }

  @Test
 public void tc1() throws InterruptedException {
	  driver.get("https://www.techlistic.com/");
	  driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 
	  String title =driver.getTitle();
	  String url =driver.getCurrentUrl();
	  if(title.equals("Techlistic - Home") && url.equals("https://www.techlistic.com/")) {
		  System.out.println("tc1 title validated - passed");}
	  else { System.out.println("tc1 title validated - failed");}
	  System.out.println(driver.getPageSource());
  }
  
  @Test
  public void tc2() throws InterruptedException {
	  driver.get("https://www.techlistic.com/");
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
	 driver.findElement(By.xpath("(//li[@class=\"overflowable-item\"])[1]")).click(); 
	 Thread.sleep(500);
	 String at= driver.getTitle();
	 String et ="Java Tutorials Series - Java For Selenium";
	 if(at.equals(et)) {
		 System.out.println("java page - passed");}
	 else { System.out.println("java page - failed");}
	 driver.navigate().back();
	 Thread.sleep(500);
	 
	 driver.findElement(By.xpath("(//li[@class='overflowable-item'])[2]")).click(); 
	 String at1= driver.getTitle();
	 String et1 ="Selenium Tutorial - Learn Selenium from Comprehensive Series of 40 Coding Tutorials";
	 if(at1.equals(et1)){
		 System.out.println("selenium page - passed");}
	 else { System.out.println("selenium page - failed");}
	 driver.navigate().back();
	 Thread.sleep(500);
	 
	 driver.findElement(By.xpath("(//li[@class='overflowable-item'])[5]")).click(); 
	 Thread.sleep(5);
	 driver.findElement(By.linkText("Selenium Blogs")).click();
	 String at2= driver.getTitle();
	 String et2 ="Top Selenium Blogs";
	 if(at2.equals(et2)){
		 System.out.println("selenium blog  page - passed");}
	 else { System.out.println("selenium blog page - failed");}
	 driver.navigate().back();
	 Thread.sleep(500);
	 
	 driver.findElement(By.xpath("(//li[@class='overflowable-item'])[5]")).click();
	 Thread.sleep(5);
	 driver.findElement(By.linkText("TestNG Integration")).click();
	 String at3= driver.getTitle();
	 String et3 ="Selenium with TestNG Integration - Tutorial Series";
	 if(at3.equals(et3)){
		 System.out.println("testng - passed");}
	 else { System.out.println("testng - failed");}
	 driver.navigate().back();
	 Thread.sleep(500);
  }
  
  @Test
  public void tc3() throws InterruptedException {
	  driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 driver.findElement(By.name("firstname")).sendKeys("vikas");
		 driver.findElement(By.name("lastname")).sendKeys("varma");
		 driver.findElement(By.id("sex-0")).click();
		 driver.findElement(By.id("exp-1")).click();
		 driver.findElement(By.id("datepicker")).sendKeys("16/10/19");
		 driver.findElement(By.id("profession-0")).click();
		 driver.findElement(By.id("profession-1")).click();
		 driver.findElement(By.id("tool-2")).click();
		 
		 Select s = new Select(driver.findElement(By.id("continents")));
		 s.selectByVisibleText("Africa");
		 
		 Select si = new Select(driver.findElement(By.id("selenium_commands")));
		 si.selectByVisibleText("Wait Commands");
		 
		 driver.findElement(By.id("photo")).sendKeys("/home/vikas/Downloads/WhatsApp Image 2019-09-15 at 8.39.09 PM.jpeg");
		 
		String d =  driver.findElement(By.linkText("Click here to Download File")).getAttribute("href");
		String wget_command ="/home/vikas/Desktop"+d;
		
		driver.findElement(By.id("submit")).click();
  }
  
  @Test
  public void tc4() throws InterruptedException {
	  driver.get("http://www.google.com");
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.findElement(By.name("q")).sendKeys("selenium");
	  
	  WebDriverWait wait = new WebDriverWait(driver,20);
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class=\"sbl1\"]")));
	  
	  List<WebElement> li =(List<WebElement>) driver.findElements(By.xpath("//div[@class=\"sbl1\"]"));
	  
	  for(int i=1;i<=li.size();i++) {
		  String text = li.get(i).getText();
		  Thread.sleep(500);
		  System.out.println(text);
		 
		if(text.equals("selenium ide")) {
			  li.get(i).click();
			  break; }
		else {
			continue;
		}
	}
  }
}