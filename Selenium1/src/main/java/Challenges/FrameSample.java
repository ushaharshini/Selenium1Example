package Challenges;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();

		//Click Me (Inside frame)
		driver.switchTo().frame(0);
		WebElement clickButton1 = driver.findElement(By.xpath("//*[@id=\'Click\']"));
		clickButton1.click();

		String text = driver.findElement(By.xpath("//*[@id=\'Click\']")).getText();
		System.out.println(text);

		//Click Me (Inside Nested frame)
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		WebElement clickButton2 = driver.findElement(By.xpath("//*[@id=\'Click\']"));
		clickButton2.click();
		String text1 = driver.findElement(By.xpath("//*[@id=\'Click\']")).getText();
		System.out.println(text1);
		
		//How many frames in this page?
		driver.switchTo().defaultContent();
		List<WebElement>totalElement= driver.findElements(By.tagName("iframe"));
		int size = totalElement.size();
		System.out.println(size);
		
		
		
		


	}

}
