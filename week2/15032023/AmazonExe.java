//01) Launch Chrome  
//02) Load https://www.amazon.in/
//     add  implicitlyWait
//     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//03) Type "Bags" in the Search box
//04) Choose the 	 item in the result (bags for boys)
//05) Print the total number of results (like 40000)
//    1-48 of over 40,000 results for "bags for boys"
//06) Select the first 2 brands in the left menu
//    (like American Tourister, Generic)
//07) Choose New Arrivals (Sort)
//08) Print the first resulting bag info (name, discounted price)
//09) Get the page title and close the browser(driver.close())

package week215032023;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonExe {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);		
			 driver.manage().window().maximize();
			 
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			 
			 driver.get("https://www.amazon.in/");
			 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags");
			 
			 driver.findElement(By.xpath("//div[@aria-label='bags for boys']")).click();
			 
			 String Bags = driver.findElement(By.xpath("//div[@class='sg-col-inner']")).getText();
			 System.out.println("WebPage header is : " + Bags); 
			 
			 driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
			 driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
		
			 String FirstBag= driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']")).getText();
			 System.out.println("FirstBag is : " + FirstBag);
			 
			 String Title=driver.getTitle();
			 System.out.println("WebPage title is : " + Title);
			 
			 driver.quit();
			 
			 
		
}}
