package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class BasicXpathExamples {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		//driver.get("http://leaftaps.com/opentaps");
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		Thread.sleep(1000);
		
//		driver.findElement(By.className("inputBox")).sendKeys("Democsr");
//		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
//		driver.findElement(By.className("loginButton")).click();
		
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.quit();
}}