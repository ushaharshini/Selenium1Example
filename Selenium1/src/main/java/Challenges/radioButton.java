package Challenges;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml;jsessionid=node0wc9su9tem6e18danp7p4ytlm248772.node0");
		driver.manage().window().maximize();
		//Your most favorite browser
		WebElement chrome = driver.findElement(By.xpath("//*[@id=\'j_idt87:console1\']/tbody/tr/td[1]/div/div[2]/span"));
		chrome.click();
		
		//Select the age group (only if not selected)
		WebElement ageGroup = driver.findElement(By.xpath("//*[@id=\'j_idt87:age\']/div/div[1]/div/div[2]/span"));
		boolean status1=ageGroup.isSelected();
		System.out.println(status1);

	}

}
