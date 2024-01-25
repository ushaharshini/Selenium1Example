package Challenges;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hyperLinkSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/link.xhtml");
		driver.manage().window().maximize();
		
		//Take me to dashboard
		WebElement homePageLink = driver.findElement(By.linkText("Go to Dashboard"));
		homePageLink.click();
		
		driver.navigate().back();
		
		//Find my destination
		WebElement whereToGo = driver.findElement(By.partialLinkText("Find the URL"));
		String where = whereToGo.getAttribute("href");
		System.out.println("This Link is going to "+ where);
		
		//Am I broken link?
		WebElement brokenLink = driver.findElement(By.linkText("Broken?"));
		brokenLink.click();
		
		String title = driver.getTitle();
		
		if(title.contains("404"))
		{
			System.out.println("The link is Broken");
		}
		driver.navigate().back();
		
		WebElement homePageLink1 = driver.findElement(By.linkText("Go to Dashboard"));
		homePageLink1.click();
		
		driver.navigate().back();
		

		//Count Links
		List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
		int size = totalLinks.size();
		System.out.println("The count of the links is "+ size);
		
		
		
		
	}

}
