package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * ============
1. Launch the URL https://www.chittorgarh.com/
2. Click on stock market
3. Click on NSE bulk Deals
4. Get all the Security names
5. Ensure whether there are duplicate Security names

 */

public class ChittogarWebTable {

	public static void main(String[] args) {
		//Set up the driver and create chromeDriver Instance
		
		//WebDriverManager().chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//1. Launch the URL https://www.chittorgarh.com/
		driver.get("https://www.chittorgarh.com/");
		
		//2. Click on stock market
		driver.findElement(By.id("navbtn_stockmarket")).click();
		
		//3. Click on NSE bulk Deals
	    driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).click();
	    //4.Get all the security names
	    
	   
	    
	   
		
		
		
		
		

	}

}
