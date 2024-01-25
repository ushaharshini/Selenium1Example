package exercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ListAmazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(option);
        driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		//To search the bag
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Moblies",Keys.ENTER);
		
		//To Print the prices
		
	   List<WebElement> prices = driver.findElements(By.className("a-price-whole"));
	   
	   //To print all the prices
	   
	   for (int i = 0; i <prices.size(); i++) {
		   
		   System.out.println(prices.get(i).getText());
		
	}
		
		

	}

}
