package testNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class suitExample {

	ChromeDriver driver;
	long startTime;
	long endTime;
	
	@BeforeSuite
	public void launchBrowser()
	{
	startTime=System.currentTimeMillis();
		
	driver=new ChromeDriver();
		
	}
	
	@Test
	public void openGoogle()
	{
		driver.get("https://www.google.com");
	}
	
	@Test
	public void openamazon()
	{
		driver.get("https://www.amazon.ae");
	}
	
	@Test
	public void openIkae()
	{
		driver.get("https://www.ikea.com");
	}
	
	@AfterSuite
	public void closeBrowser()
	{
		driver.quit();
		endTime=System.currentTimeMillis();
		long totalTime=endTime-startTime;
		System.out.println("Total time taken:" +totalTime);
	}
	

}
