package Challenges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.graphbuilder.curve.Point;

public class ButtonSamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml;jsessionid=node0l0czv8dp61hi19fx681llaszq246103.node0");
		driver.manage().window().maximize();
		
		
		//Find the position of the Submit button
		WebElement positionButton=driver.findElement(By.id("j_idt88:j_idt94"));
	    org.openqa.selenium.Point xypoint = positionButton.getLocation();
		int xValue=xypoint.getX();
		int yValue=xypoint.getY();
	    System.out.println("The X value is: " + xValue+ " The Y value is: " +yValue );
	
	    
	    //Find the Save button color
	    WebElement colorButton = driver.findElement(By.id("j_idt88:j_idt96"));
	    String color = colorButton.getCssValue("background");
	    System.out.println("The save button color is : " +color);
	    
	    
	    //Find the height and width of this button
	    WebElement hwButton = driver.findElement(By.id("j_idt88:j_idt98"));
	    int height = hwButton.getSize().getHeight();
	    int width = hwButton.getSize().getWidth();
	    System.out.println("THe height is: "+ height + " The width is: " + width);
	    
	    //Click and Confirm title.//Go to Home Page
	    WebElement clickButton = driver.findElement(By.id("j_idt88:j_idt90"));
	    clickButton.click();





		
	
		
		
		
	}

}
