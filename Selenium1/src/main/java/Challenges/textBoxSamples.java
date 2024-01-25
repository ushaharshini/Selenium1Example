package Challenges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textBoxSamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.leafground.com/input.xhtml");

//Maximize the window
driver.manage().window().maximize();

//Type your name
WebElement name = driver.findElement(By.xpath("//*[@id=\'j_idt88:name\']"));
name.sendKeys("Usha");

//Append Country to this City.
WebElement append = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt91\']"));
append.sendKeys(" Nanganallur");

//Verify if text box is disabled
WebElement disable = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]"));
boolean disableBox=disable.isEnabled();
System.out.println(disableBox);

//Clear the typed text.
WebElement clear = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt95\']"));
clear.clear();

//Retrieve
WebElement retrieve = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt97\']"));
String value = retrieve.getAttribute("value");
System.out.println(value);

	}

}
