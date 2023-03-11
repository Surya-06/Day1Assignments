package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {
	

	
		public static void main(String[] args) throws InterruptedException {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			ChromeDriver driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			//driver.get("http://leaftaps.com/opentaps");
			
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.findElement(By.id("username")).sendKeys("Democsr");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
		
			driver.findElement(By.linkText("CRM/SFA")).click();
//			
//			driver.findElement(By.className("inputBox")).sendKeys("Democsr");
//			driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
//			driver.findElement(By.className("loginButton")).click();
			
			driver.findElement(By.linkText("Leads")).click();
		
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("SURYA KUMAR");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("V A");
			
			Thread.sleep(1000);

			driver.findElement(By.name("submitButton")).click();
			
			
		}

	}

