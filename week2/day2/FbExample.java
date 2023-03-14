package week2.day2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

//Step 1: Download and set the path 
//Step 2: Launch the chromebrowser
//Step 3: Load the URL https://en-gb.facebook.com/
//Step 4: Maximise the window
//Step 5: Add implicit wait
//Step 6: Click on Create New Account button
//Step 7: Enter the first name
//Step 8: Enter the last name
//Step 9: Enter the mobile number
//Step 10: Enterthe password
//Step 11: Handle all the three drop downs
//Step 12: Select the radio button "Female" 
         

public class FbExample {
	
			public static void main(String[] args) throws InterruptedException, IOException {
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				ChromeDriver driver = new ChromeDriver(options);		
					 driver.manage().window().maximize();
					 
					 
					 
					 //driver.manage().timeouts().implicitlyWait(Duration, 30);
					 
					 
					 driver.get("https://en-gb.facebook.com/");
					 Thread.sleep(1000);
					 
					 driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
			
					 Thread.sleep(5000);

					 driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Surya");
					 driver.findElement(By.name("lastname")).sendKeys("Kumar");
					 driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("0912458901");
					 
					 Thread.sleep(1000);
					 
					 Select day=new Select(driver.findElement(By.id("day")));
					 day.selectByVisibleText("24");
					 
					 Thread.sleep(1000);
					 
					 Select month=new Select(driver.findElement(By.id("month")));
					 month.selectByVisibleText("Jan");
					 
					 Thread.sleep(1000);
					 
					 Select year=new Select(driver.findElement(By.id("year")));
					 year.selectByVisibleText("1999");
					 
					 Thread.sleep(1000);
					 
					 driver.findElement(By.xpath("//input[@type='radio']")).click();
					 
					 File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				     FileUtils.copyFile(f, new File("C:\\Automation Testing\\14032023\\FBExample.jpg"));
				     System.out.println("The Screenshot is captured and saved in mentioned path.");
					 
				     
				     Thread.sleep(3000);
				     
				     driver.quit();
					 
					 
					 
					 
	
	}}
