package Challenges;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownSamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		
		//Which is your favorite UI Automation tool?
		WebElement dropDown1 = driver.findElement(By.xpath("//*[@id=\'j_idt87\']/div/div[1]/div[1]/div/div/select"));
		Select select=new Select(dropDown1);
		select.selectByIndex(1);
		
		//Number of Elements
		List<WebElement> listOfElements = select.getOptions();
		int size = listOfElements.size();
		System.out.println("The number of Elements present in the first dropdown is "+size);
		
		
		//Choose the Course
		//Going to select multiple course like Selenium WebDriver{2},Appium[1],PostMan[5];
		 WebElement selectCourse = driver.findElement(By.xpath("//*[@id=\'j_idt87:auto-complete\']/button"));
		
		selectCourse.click();
	    driver.findElement(By.xpath("//*[@id=\'j_idt87:auto-complete_panel\']/ul/li[2]")).click();
		Select selectCourseChoice =new Select(selectCourse);
		
		selectCourseChoice.selectByVisibleText("Appium");
		selectCourseChoice.selectByVisibleText("Selenium WebDriver");
		selectCourseChoice.selectByVisibleText("PostMan");
		
		
		

		
		
		

		
		
	}

}
