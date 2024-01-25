package Challenges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoxSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml;jsessionid=node0wc9su9tem6e18danp7p4ytlm248772.node0");
		driver.manage().window().maximize();
		
		//Basic Checkbox
		WebElement basicCheckBox = driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-icon ui-c ui-icon-check']"));
		basicCheckBox.click();
		
		//Select Multiple
		WebElement multiple = driver.findElement(By.xpath("//*[@id=\'j_idt87:j_idt89\']/div[2]"));
		multiple.click();
		
		

	}

}
