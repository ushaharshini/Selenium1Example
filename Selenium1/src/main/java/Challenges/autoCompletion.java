package Challenges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoCompletion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.ae/");
		driver.manage().window().maximize();
		
		//Type your name and choose the third option

		WebElement input = driver.findElement(By.xpath("//*[@id=\'twotabsearchtextbox\']"));
		input.sendKeys("Bag");
		
		
		

	}

}
