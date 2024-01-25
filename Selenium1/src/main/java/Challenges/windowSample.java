package Challenges;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		
		//Enter the windowHandle for the parent window
		String parentWindow = driver.getWindowHandle();
		
		//Click and Confirm new Window Opens
		WebElement openButton = driver.findElement(By.id("j_idt88:new"));
		openButton.click();
		
		Set<String> handles = driver.getWindowHandles();
		
		for (String string : handles) {
			driver.switchTo().window(string);
			
		}
		WebElement dailyQuizCheckBOx = driver.findElement(By.xpath("//*[@id=\'j_idt107\']/div[2]"));
		dailyQuizCheckBOx.click();
		
		driver.close();
		
		driver.switchTo().window(parentWindow);
	
		//Find the number of opened tabs
		WebElement openMultipleButton = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt91\']/span"));
		openMultipleButton.click();
		
		int noOfOpenWindows = driver.getWindowHandles().size();
		System.out.println("The number of opened windows is: "+noOfOpenWindows);
		
		//Close all windows except Primary
		WebElement closeWindowButtton = driver.findElement(By.id("j_idt88:j_idt93"));
		closeWindowButtton.click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		for (String allWindows : windowHandles) {
			if(!allWindows.equals(parentWindow))
			{
				driver.switchTo().window(parentWindow);
				driver.close();
	
			}
			
		}
		driver.quit();

	}

}
