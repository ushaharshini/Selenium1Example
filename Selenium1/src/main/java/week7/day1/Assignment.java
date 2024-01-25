package week7.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/waits.xhtml");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("(//span[text()='Click'])[1]")).click();
		
		WebElement element = driver.findElement(By.xpath("//span[text()='I am here']"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.visibilityOf(element));
		
		System.out.println(element.getText());
		
		
		driver.findElement(By.xpath("(//span[text()='Click'])[2]")).click();
		
		WebElement invisible = driver.findElement(By.xpath("//span[text()='I am about to hide']"));
		
		System.out.println(invisible.getText());
		
		wait.until(ExpectedConditions.invisibilityOf(invisible));
		
		
		try {
			invisible.isDisplayed();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		driver.findElement(By.xpath("//span[text()='Click First Button']")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Click Second']")));
		
		String text = driver.findElement(By.xpath("//span[text()='Click Second']")).getText();
		
		System.out.println(text);
		
		driver.findElement(By.xpath("(//span[text()='Click'])[3]")).click();
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//span[text()='Did you notice?']"),"Did you notice?"));
		
		String text2 = driver.findElement(By.xpath("//span[text()='Did you notice?']")).getText();
		
		System.out.println(text2);
		
		

	}

}
