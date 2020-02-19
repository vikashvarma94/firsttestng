package ihubstorestc;

import org.testng.annotations.Test;

public class loadtest {
	@Test(threadPoolSize=5, invocationCount=10)
	  public void test1() throws InterruptedException
	  {
	        System.out.println("Thread ID: "+Thread.currentThread().getId());  
	  }
	}