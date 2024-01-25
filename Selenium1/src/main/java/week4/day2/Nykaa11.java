package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Nykaa11 {

	public static void main(String[] args) throws IOException {
		
		
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver =new ChromeDriver(options);
        driver.get("https://www.nykaa.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        
       // WebElement help = driver.findElement(By.xpath("//a[text()='Contact Us']"));
        
       // Actions builder = new Actions(driver);
        //builder.scrollToElement(help).perform();
        
        WebElement makeup = driver.findElement(By.xpath("(//a[text()='makeup'])[2]"));
        
        Actions bulider = new Actions(driver);
        bulider.moveToElement(makeup).perform();
        
        
        //Take a snapshot
        
        File source = driver.getScreenshotAs(OutputType.FILE);
        
        //Create folder to save the img file
        File dest=new File("./snap/img1.png");
        
        //Merge source and dest
        
        FileUtils.copyFile(source, dest);
        
        
        

	}

}
