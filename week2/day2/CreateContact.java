package week2.day2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

		
		/*
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
		 * 6. Click on Create Contact
		 *  
		 * 7. Enter FirstName Field Using id Locator
		 * 
		 * 8. Enter LastName Field Using id Locator
		 * 
		 * 9. Enter FirstName(Local) Field Using id Locator
		 * 
		 * 10. Enter LastName(Local) Field Using id Locator
		 * 
		 * 11. Enter Department Field Using any Locator of Your Choice
		 * 
		 * 12. Enter Description Field Using any Locator of your choice 
		 * 
		 * 13. Enter your email in the E-mail address Field using the locator of your choice
		 * 
		 * 14. Select State/Province as NewYork Using Visible Text
		 * 
		 * 15. Click on Create Contact
		 * 
		 * 16. Click on edit button 
		 * 
		 * 17. Clear the Description Field using .clear
		 * 
		 * 18. Fill ImportantNote Field with Any text
		 * 
		 * 19. Click on update button using Xpath locator
		 * 
		 * 20. Get the Title of Resulting Page.
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
	
			 driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
			 
			 driver.findElement(By.id("firstNameField")).sendKeys("Surya");
			 driver.findElement(By.id("lastNameField")).sendKeys("V A");
			 
			 driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Kumar");
			 driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("V A Local");
			 
			 driver.findElement(By.name("departmentName")).sendKeys("CSE");
			 driver.findElement(By.id("createContactForm_description")).sendKeys("Description");
			 
			 driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("sysuryakumar246@gmail.com");
			 //createContactForm_generalStateProvinceGeoId
			 
			 Thread.sleep(1000);
			 
			 Select state=new Select(driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")));
					 state.selectByVisibleText("California");
					 
					 Thread.sleep(1000);
					 
					 driver.findElement(By.className("smallSubmit")).click();
					 
					 driver.findElement(By.xpath("//a[text()='Edit']")).click();
					 
					 Thread.sleep(1000);
					 
					 driver.findElement(By.name("description")).clear();
					 
					 driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Notes");
					 
					 driver.findElement(By.xpath("//input[@value='Update']")).click();
					 
					 String Title=driver.getTitle();
					 
					 System.out.println("The Webpage title is : " + Title);
					 
					 driver.quit();
				
	}
}

		
		
		

	