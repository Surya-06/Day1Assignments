package week2.day2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EditLead {

	
	/*http://leaftaps.com/opentaps/control/main
	
	* 1	Launch the browser
	* 2	Enter the username
	* 3	Enter the password
	* 4	Click Login
	* 5	Click crm/sfa link
	* 6	Click Leads link
	* 7	Click Find leads
	* 8	Enter first name
	* 9	Click Find leads button
	* 10 Click on first resulting lead
	* 11 Verify title of the page
	* 12 Click Edit
	* 13 Change the company name
	* 14 Click Update
	* 15 Confirm the changed name appears
	* 16 Close the browser (Do not log out)
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
		 
		 driver.findElement(By.xpath("//a[text()='Leads']")).click();
		 
		 Thread.sleep(3000);
				
				 driver.findElement(By.linkText("Find Leads")).click();
				 
				 driver.findElement(By.xpath("//*[@id=\"ext-gen248\"]")).sendKeys("SURYA KUMAR");
				 
				 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				 
				 Thread.sleep(2000);
				 
				 
				 driver.findElement(By.linkText("17249")).click();
				 
				 Thread.sleep(2000);
				 
				 driver.findElement(By.xpath("//a[text()='Edit']")).click();
				 
				 driver.findElement(By.id("updateLeadForm_companyName")).clear();
				 
				 Thread.sleep(2000);
				 
				 driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TestLeafs");
				 
				 driver.findElement(By.xpath("//input[@value='Update']")).click();
				 
				 Thread.sleep(4000);
				 
				 driver.quit();
				 
				

}

}
