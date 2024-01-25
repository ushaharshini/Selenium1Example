package Week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Usha");
		driver.findElement(By.name("lastname")).sendKeys("Harshini");
		driver.findElement(By.name("reg_email__")).sendKeys("123456789");
		driver.findElement(By.id("password_step_input")).sendKeys("password");
		
		
		WebElement day = driver.findElement(By.name("birthday_day"));
		Select drop1=new Select(day);
		drop1.selectByVisibleText("1");
		
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select drop2=new Select(month);
		drop2.selectByVisibleText("May");
		
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select drop3= new Select(year);
		drop3.selectByVisibleText("2000");

		driver.findElement(By.xpath("//label[text()='Female']")).click();
			
		
	}

}
