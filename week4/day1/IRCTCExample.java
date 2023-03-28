package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IRCTCExample {

	public static void main(String[] args) throws InterruptedException, IOException {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			ChromeDriver d = new ChromeDriver(options);		
				 d.manage().window().maximize();
				 d.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
			 
			 d.get("https://www.irctc.co.in/nget/train-search");
			 
			 d.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
			 
			  Set<String> windowHandles = d.getWindowHandles();//insertion order
			  List<String> windowhandes1=new ArrayList<String>(windowHandles);
			    
			    d.switchTo().window(windowhandes1.get(1));
			    
			    
			    //to take snapshot
			    File f1 = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
			     FileUtils.copyFile(f1, new File("C:\\Automation Testing\\AmazonExample\\IRCTCFlights.jpg"));
			     System.out.println("The Screenshot is captured.");
			    
			 
	
	}

}
