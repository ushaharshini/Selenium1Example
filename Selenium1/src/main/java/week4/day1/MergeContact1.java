package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MergeContact1 {

	public static void main(String[] args) throws InterruptedException {
		
		 
		 // 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver =new ChromeDriver(options);
        driver.get("http://leaftaps.com/opentaps/control/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  
		 
		// 2. Enter UserName and Password Using Id Locator
		 
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		 
		  
		 // 3. Click on Login Button using Class Locator
        
        driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
        
		 
		 // 4. Click on CRM/SFA Link
		 
        driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
        
		//  5. Click on contacts Button
        driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		 	
		  // 6. Click on Merge Contacts using Xpath Locator
        driver.findElement(By.xpath("//a[contains(text(),'Merge Contacts')]")).click();
		  
		//  7. Click on Widget of From Contact
        driver.findElement(By.xpath("//img[@alt='Lookup'][1]")).click();
		  
		// 8. Click on First Resulting Contact
        // In order to click we have to click the window Handling
        //ctrl 2+l
        
        Set<String> windowHandles = driver.getWindowHandles();
        //Create an empty list to store WindowHandles inorder to get windowhandles in order
        
        List<String> winlist = new ArrayList<String>(windowHandles);
        //now get into the first window
        //0 is the default window and 1 is the new opened window
        driver.switchTo().window(winlist.get(1));
        //to click the first result contact
        //add Thread.sleep
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
        
        
		  
		// 9. Click on Widget of To Contact
        //to click that first handle should come to default window for that
        driver.switchTo().window(winlist.get(0));
        
		 
		//10. Click on Second Resulting Contact
        driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
        //again using the window Handling
        
        Set<String> windowHandles2 = driver.getWindowHandles();
        //Create an empty list to store WindowHandles inorder to get windowhandles in order
        
        List<String> winlist2 = new ArrayList<String>(windowHandles2);
        //now get into the first window
        //0 is the default window and 1 is the new opened window
        driver.switchTo().window(winlist2.get(1));
		 //add thread.sleep
        Thread.sleep(3000);
        //now click on the second resulting contact;
        driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
        //get the handle to default window
        driver.switchTo().window(winlist2.get(0));
        
		 //11. Click on Merge button using Xpath Locator
        driver.findElement(By.xpath("//a[text()='Merge']")).click();
        
		 
		  //12. Accept the Alert
        driver.switchTo().alert().accept();
        
		  
		 // 13. Verify the title of the page
        
        String title = driver.getTitle();
        if (title.contains("View Contact")) {
        	System.out.println("Passed");
        }
        else
        {
        	System.out.println("Failed");
        }
        	
		 
	}

}
 


	

