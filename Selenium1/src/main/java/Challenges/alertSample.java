package Challenges;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertSample {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		
		//Alert (Simple Dialog)
		WebElement simpleAlert = driver.findElement(By.id("j_idt88:j_idt91"));
		simpleAlert.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		//Alert (Confirm Dialog)
		WebElement confirmAlert = driver.findElement(By.id("j_idt88:j_idt93"));
		confirmAlert.click();
		Alert confirmAlert1 =driver.switchTo().alert();
		confirmAlert1.dismiss();
		
		//Alert (Prompt Dialog)
		WebElement promptAlert = driver.findElement(By.id("j_idt88:j_idt104"));
		promptAlert.click();
		Alert promptAlert1=driver.switchTo().alert();
		promptAlert1.sendKeys("Usha");
		promptAlert1.accept();

		
		
	}

}
