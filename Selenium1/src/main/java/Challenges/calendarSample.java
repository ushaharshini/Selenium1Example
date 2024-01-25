package Challenges;

import org.openqa.selenium.chrome.ChromeDriver;

public class calendarSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/calendar.xhtml");
		driver.manage().window().maximize();
		
		
		
	}

}
