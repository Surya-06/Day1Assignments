package week2.day1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/control/login");
			driver.findElement(By.id("username")).sendKeys("Democsr");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
		
			driver.findElement(By.linkText("CRM/SFA")).click();
			
//			driver.findElement(By.className("inputBox")).sendKeys("Democsr");
//			driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
//			driver.findElement(By.className("loginButton")).click();
			
			driver.findElement(By.linkText("Leads")).click();
		
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("SURYA KUMAR");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("V A");
			
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CSE");
			
			driver.findElement(By.id("createLeadForm_description")).sendKeys("CSE class");
			
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sysuryakumar246@gmail.com");
			

			
			WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			Select selState = new Select(state);
			selState.selectByVisibleText("New York");

			driver.findElement(By.name("submitButton")).click();
			driver.findElement(By.linkText("Edit")).click();
			
			driver.findElement(By.id("updateLeadForm_description")).clear();
			
			driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Testing edit lead form");
			
			driver.findElement(By.name("submitButton")).click();
			
			System.out.println(driver.getTitle());

			
			
			
			
	}

}
