package FirsttestNGpackage;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.sun.xml.bind.v2.runtime.Name;
public class webmail {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("WebDriver.Chrome.Driver","/home/prasannakumar/Downloads/chromedriver_linux64/chromedriver");
		WebDriver d= new ChromeDriver();
		d.get("https://webmail.123-reg.co.uk/login/");
	  
		d.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	//	d.manage().window().maximize();
	   	 
		d.findElement(By.xpath("//input[@class=\"input input-big\"]")).sendKeys("vikasavarma.n@inativetech.com");
	    d.findElement(By.id("password-id")).sendKeys("Inative@135");
	    d.findElement(By.id("show-password")).click();
        d.findElement(By.xpath("//button[@class=\"cta cta--primary\"]")).click();
        Thread.sleep(30000);
        JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("window.scrollto(0,document.body.scrollhight)");
        d.findElement(By.xpath("//a[@data-action=\"compose\"]")).click();
       
        System.out.println(d.switchTo().alert().getText());
		d.switchTo().alert().accept();
	
      /*  d.findElement(By.xpath("(//input[@class=\"token-input tt-input\"])[1]")).sendKeys("vikasavarma.n@inativetech.com");
        Thread.sleep(3000);
        d.findElement(By.id("tinymce")).sendKeys("hi");
        d.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();
	    // d.findElement(By.xpath("//a[@data-action=\"compose\"]")).click();
	    //System.out.print("successfully login to webmail123....");
	    //d.findElement(By.id("background-loader")).click();
        //d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(2000);
        d.findElement(By.xpath("(//div[@class=\"contact-picture\"])[1]")).click();
        d.findElement(By.xpath("//a[@data-name=\"logout\"]")).click();
        System.out.println("logout successfully....");		*/
	  	  }
	}

