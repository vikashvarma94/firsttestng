package ihubfunctions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

	public class brokenlinks {
		WebDriver driver;
	  @Test
	  public void before() throws InterruptedException {
		  	String homepage = "http://205.147.109.73/iHubDirectUAT";
	        HttpURLConnection huc = null;
	        int respCode = 200;
	        driver = new ChromeDriver();
	        System.setProperty("webdriver.chrome.driver", "/home/vikas/Downloads/chromedriver_linux64"); 
	        driver.manage().window().maximize();
	        
	        driver.get(homepage);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@placeholder=\"search\"]")).sendKeys("hyderabad");
			Actions a = new Actions(driver);
			a.sendKeys(Keys.ENTER).perform();
			Thread.sleep(1000);
	        List<WebElement> links = driver.findElements(By.tagName("a")); 
	        Iterator<WebElement> it = links.iterator();
	        
	        while(it.hasNext()){
	            String url = it.next().getAttribute("href");
	            System.out.println(url);
	        
	            if(url == null || url.isEmpty()){
	            	System.out.println("URL is either not configured for anchor tag or it is empty");
	                continue;
	            }   
	            if(!url.startsWith(homepage)){
	                System.out.println("URL belongs to another domain, skipping it.");
	                continue;
	            }
	            
	            try {
	                huc = (HttpURLConnection)(new URL(url).openConnection());
	                
	                huc.setRequestMethod("HEAD");
	                
	                huc.connect();
	                
	                respCode = huc.getResponseCode();
	                
	                if(respCode >= 400){
	                    System.out.println(url+" is a broken link");
	                }
	                else{
	                    System.out.println(url+" is a valid link");
	                }
	                    
	            } catch (MalformedURLException e) {
	                e.printStackTrace();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }      
	    }
	}