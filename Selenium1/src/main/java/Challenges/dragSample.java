package Challenges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node012zmsd752vv0g1vcxnkdxmmgqq254400.node0");
		
		driver.manage().window().maximize();
		
		WebElement from = driver.findElement(By.id("form:drag_content"));
		WebElement to = driver.findElement(By.id("form:drop_header"));
		
		Actions action=new Actions(driver);
		action.clickAndHold(from).moveToElement(to).release(to).build().perform();
		//action.dragAndDrop(from, to).build().perform();
		

	}

}
