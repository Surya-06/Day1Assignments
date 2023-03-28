package week4.day1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnFrameExample {

	
		// (https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm) 
		
		public static void main(String[] args) throws InterruptedException, IOException {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			ChromeDriver driver = new ChromeDriver(options);		
				 driver.manage().window().maximize();
				 
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
				 driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
				 
				WebElement c= driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
				driver.switchTo().frame(c);
				 
				 driver.findElement(By.xpath("//button[text()='Try it']")).click();
				 
				 Alert alerts=driver.switchTo().alert();
				 alerts.accept();
				 
				 String s=driver.findElement(By.xpath("//p[text()='You pressed OK!']")).getText();
				 System.out.println(s);			
	}
}
