package week2.day2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DuplicateLead {

	/*http://leaftaps.com/opentaps/control/main
	 
	1	Launch the browser
	2	Enter the username
	3	Enter the password
	4	Click Login
	5	Click crm/sfa link
	6	Click Leads link
	7	Click Find leads
	8	Click on Email
	9	Enter Email
	10	Click find leads button
	11	Capture name of First Resulting lead
	12	Click First Resulting lead
	13	Click Duplicate Lead
	14	Verify the title as 'Duplicate Lead'
	15	Click Create Lead
	16	Confirm the duplicated lead name is same as captured name
	17	Close the browser (Do not log out)
	
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
	 
	 
	 driver.findElement(By.linkText("16569")).click();
	 
	 
	 driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
	 
	 Thread.sleep(1000);
	 
	 driver.findElement(By.className("smallSubmit")).click();
	 
	 Thread.sleep(4000);
	 
	 driver.quit();
	 
	 
	
}

}
	

	

