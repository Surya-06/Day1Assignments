package week4.day1;

import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MergeContact {

				/*
				 * //Pseudo Code
				 * 
				 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
				 * 
				 * 2. Enter UserName and Password Using Id Locator
				 * 
				 * 3. Click on Login Button using Class Locator
				 * 
				 * 4. Click on CRM/SFA Link
				 * 
				 * 5. Click on contacts Button
				 * 	
				 * 6. Click on Merge Contacts using Xpath Locator
				 * 
				 * 7. Click on Widget of From Contact
				 * 
				 * 8. Click on First Resulting Contact
				 * 
				 * 9. Click on Widget of To Contact
				 * 
				 * 10. Click on Second Resulting Contact
				 * 
				 * 11. Click on Merge button using Xpath Locator
				 * 
				 * 12. Accept the Alert
				 * 
				 * 13. Verify the title of the page
				 */
		 public static void main(String[] args) throws InterruptedException, IOException {
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				ChromeDriver driver = new ChromeDriver(options);
				
				driver.manage().window().maximize();
				 
				 driver.get("http://leaftaps.com/opentaps/control/login");
				 
				 driver.findElement(By.id("username")).sendKeys("Democsr");
				 driver.findElement(By.id("password")).sendKeys("crmsfa");
				 
				 driver.findElement(By.className("decorativeSubmit")).click();
				 driver.findElement(By.linkText("CRM/SFA")).click();
				 
				 driver.findElement(By.xpath("//a[text()='Contacts']")).click();
				 driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
				 driver.findElement(By.xpath("//img[@alt='Lookup']")).click();

//				 driver.getWindowHandle();
//				 driver.findElement(By.xpath("//a[text()='10929']")).click();
				 
				 
			
				 
				 
			
	}

}
