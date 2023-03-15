package week0215032023;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 
		 driver.get("https://www.redbus.in/");
		 
		driver.findElement(By.id("src")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[@select-id='results[0]']")).click();
		driver.findElement(By.id("dest")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[@select-id='results[0]']")).click();
	
		driver.findElement(By.xpath("//td[text()='16']")).click();
		driver.findElement(By.id("search_btn")).click();
		
		String Buses=driver.findElement(By.xpath("//span[@class='w-60 d-block d-found']")).getText();
		   System.out.println("All Buses: " + Buses);
		   
		driver.findElement(By.xpath("//label[@for='bt_SLEEPER']")).click();
		String buses=driver.findElement(By.xpath("(//div[@class='travels lh-24 f-bold d-color'])[2]")).getText();
	   System.out.println("2nd Bus: " + buses);
	   String RedbusTitle = driver.getTitle();
	   System.out.println("Title : " + RedbusTitle);
		
	
	}

}
