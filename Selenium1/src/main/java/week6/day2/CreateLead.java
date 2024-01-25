package week6.day2;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import week6.day2.ProjectSpecificMethod;

public class CreateLead extends ProjectSpecificMethod{
	
	@BeforeTest
	public  void setup() {
		excelFile="CreateLead";
	}

	
	
@Test(dataProvider = "getData")
	public  void createLead( String cname, String fname,String lname,String pnum) {
	
		
	
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(pnum);
		driver.findElement(By.name("submitButton")).click();
		
		
}

  
}



