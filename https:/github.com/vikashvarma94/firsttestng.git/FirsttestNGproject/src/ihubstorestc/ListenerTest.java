package ihubstorestc;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListenerTest implements ITestListener{
WebDriver driver;
    @Override		
    public void onFinish(ITestContext arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onStart(ITestContext arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestFailure(ITestResult arg0) {					
    	File scren = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scren,new File("/home/vikas/scr49.png"));
		//	System.out.println("The name of the testcase failed is :"+Result.getName());	
		} catch (IOException e) {
			e.printStackTrace();}	}	

		    // When Test case get Skipped, this method is called.		
		    @Override		
		    public void onTestSkipped(ITestResult Result)					
		    {		
		    System.out.println("The name of the testcase Skipped is :"+Result.getName());					
		    }		

		    // When Test case get Started, this method is called.		
		    @Override		
		    public void onTestStart(ITestResult Result)					
		    {		
		    System.out.println(Result.getName()+" test case started");					
		    }		

		    // When Test case get passed, this method is called.		
		    @Override		
		    public void onTestSuccess(ITestResult Result)					
		    {		
		    System.out.println("The name of the testcase passed is :"+Result.getName());					
		    }	
}

