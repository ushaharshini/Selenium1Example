package Challenges;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tablesSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/table.xhtml;jsessionid=node0iqn2zialpjdqhgsqpgmgxhhl261924.node0");
		driver.manage().window().maximize();
		//Locate the Table
		WebElement table = driver.findElement(By.xpath("(//table[@role='grid'])[2]"));
		
		//Get the count of number of columns
		List<WebElement> columns = table.findElements(By.tagName("th"));
		int columnsCount = columns.size();
		System.out.println("The number of columns "+columnsCount);
		
		//Get the count of number of rows
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		int rowsCount = rows.size();
		System.out.println("The number of rows "+rowsCount);
		
		//Print the particular element in the table
		String text = driver.findElement(By.xpath("(//table[@role='grid'])[2]//tr[2]/td[2]")).getText();
		System.out.println(text);
		
		
		for (int i = 1; i < rows.size(); i++) {
			String text2 = driver.findElement(By.xpath("(//table[@role='grid'])[2]//tr["+i+"]/td[2]")).getText();
			System.out.println(text2);
		}
		
		//To print all rows and columns
		for (int i = 1; i < rows.size(); i++) {
			for (int j = 1; j < columns.size(); j++) {
				 String text2 = driver.findElement(By.xpath("(//table[@role='grid'])[2]//tr["+i+"]/td["+j+"]")).getText();
				 System.out.println(text2);
				
			}
		}
			
		
		
	}

}
