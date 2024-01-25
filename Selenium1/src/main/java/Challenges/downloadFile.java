package Challenges;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class downloadFile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml");
		driver.manage().window().maximize();
		
		//Basic Download
		///Users/jayv/Downloads
		
		WebElement downloadLink = driver.findElement(By.xpath("//span[text()='Download']"));
		downloadLink.click();
		Thread.sleep(3000);
		
		File fileLocation =new File("//Users//jayv//Downloads");
	    File[] totalFiles = fileLocation.listFiles();
	    
	    for (File file : totalFiles) {
	    	if(file.getName().equals("TestLeaf Logo")){
	    		System.out.println("File is downloaded");
	    		break;
	    		
	    		
	    	}
			
		}
		

	}

}
