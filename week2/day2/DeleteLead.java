package week2.day2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {

	
		/*http://leaftaps.com/opentaps/control/main
		 
		Delete Lead:
		1	Launch the browser
		2	Enter the username
		3	Enter the password
		4	Click Login
		5	Click crm/sfa link
		6	Click Leads link
		7	Click Find leads
		8	Click on Phone
		9	Enter phone number
		10	Click find leads button
		11	Capture lead ID of First Resulting lead
		12	Click First Resulting lead
		13	Click Delete
		14	Click Find leads
		15	Enter captured lead ID
		16	Click find leads button
		17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		18	Close the browser (Do not log out)
*/
		
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		
			 driver.manage().window().maximize();
			 
			 driver.get("http://leaftaps.com/opentaps/control/login");
			 
			 driver.findElement(By.id("username")).sendKeys("demosalesManager");
			 driver.findElement(By.id("password")).sendKeys("crmsfa");
			 
			 driver.findElement(By.className("decorativeSubmit")).click();
			 driver.findElement(By.linkText("CRM/SFA")).click();
			 
			 driver.findElement(By.xpath("//a[text()='Leads']")).click();
			 
	 Thread.sleep(3000);
			
			 driver.findElement(By.linkText("Find Leads")).click();
			 
			 
			 driver.findElement(By.linkText("Email")).click();
			 
			 driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("sysuryakumar246@gmail.com");
			 
			 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			 
			 
			 Thread.sleep(2000);
			 
			 
			 driver.findElement(By.linkText("17952")).click();
			 
			 driver.findElement(By.xpath("//a[text()='Delete']")).click();
			 
			 driver.findElement(By.linkText("Find Leads")).click();
			 
			 Thread.sleep(1000);
			 
			 driver.findElement(By.xpath("//input[@name='id']")).sendKeys("17952");
			 
			 Thread.sleep(1000);
			 
			 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			 
			 Thread.sleep(2000);
			 
			 driver.quit();
			 
	}

	}


