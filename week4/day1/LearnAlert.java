package week4.day1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnAlert {
	public static void main(String[] args) throws InterruptedException, IOException {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			ChromeDriver driver = new ChromeDriver(options);		
				 driver.manage().window().maximize();
				 
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			 
			 driver.get("https://leafground.com/alert.xhtml");
			 driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
			 Alert confirmAlert=driver.switchTo().alert();
			 Thread.sleep(3000);
			 confirmAlert.accept();
			 String text=driver.findElement(By.xpath("//span[text()='User Clicked : OK']")).getText();
			 //System.out.println("Confirmation alert message - " + text);
			 
			if (text.contains("OK")) {
				System.out.println("You have successfully handled the alert");
				}
				else if(text.contains("Cancel")) {
					System.out.println("Alert not handled");
					
				}
				
			}
	}


