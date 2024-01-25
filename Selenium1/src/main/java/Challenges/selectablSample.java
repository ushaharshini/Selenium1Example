package Challenges;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class selectablSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		
		//Handle the Frame
		driver.switchTo().frame(0);
		List<WebElement>selectables=driver.findElements(By.xpath("//*[@id=\'selectable\']/li"));
		int size = selectables.size();
		System.out.println(size);
		
		Actions action =new Actions(driver);
		action.keyDown(Keys.CONTROL)
		.click(selectables.get(0))
		.click(selectables.get(1))
		.click(selectables.get(2))
		.build().perform();
		
		//Other Method
		action.clickAndHold(selectables.get(5));
		action.build().perform();

	}

}
