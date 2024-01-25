package Week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://leafground.com/dashboard.xhtml");
	driver.manage().window().maximize();
	//WebElement drop=driver.findElement(By.className("ui-selectonemenu"));
	//Select drop1= new Select(drop);
	
	
}

}
