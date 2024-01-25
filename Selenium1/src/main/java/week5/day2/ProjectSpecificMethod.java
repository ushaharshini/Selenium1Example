package week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;



public class ProjectSpecificMethod {
	public ChromeDriver driver;
	@Parameters({"url","username","password"})
	@BeforeMethod
	

	public  void preCondition (String url,String uname,String pwd) {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote_allow-origins=*");
		driver =new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
	}
	
	}

