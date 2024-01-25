package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Usha");

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Jayakumar");

		//dropdown1
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select  drop1=new Select(source);
		drop1.selectByVisibleText("Employee");
		
		
		//dropdown2
		WebElement src = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select drop2=new Select(src);
		Thread.sleep(2000);
		drop2.selectByValue("Pay Per Click Advertising");
		
		//dropdown3
		WebElement src1 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select drop3=new Select(src1);
		Thread.sleep(2000);
		drop3.selectByVisibleText("Corporation");

		//Dropdown4
		WebElement src2 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select drop4=new Select(src2);
		Thread.sleep(2000);
		drop4.selectByVisibleText("India");


		driver.findElement(By.name("submitButton")).click();
		
		String title = driver.getTitle();
		System.out.println(title);

		


	}

}
