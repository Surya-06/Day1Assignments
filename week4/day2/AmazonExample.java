////1.Load the URL https://www.amazon.in/
//2.search as oneplus 9 pro 
//3.Get the price of the first product
//4. Print the number of customer ratings for the first displayed product
//5. Click the first text link of the first image
//6. Take a screen shot of the product displayed
//7. Click 'Add to Cart' button
//8. Get the cart subtotal and verify if it is correct.
//9.close the browser

package week4.day1;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class AmazonExample {

	public static void main(String[] args) throws InterruptedException, IOException {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			ChromeDriver driver = new ChromeDriver(options);		
				 driver.manage().window().maximize();
				 
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
				 driver.get("https://www.amazon.in/");
				 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
				 driver.findElement(By.id("nav-search-submit-button")).click();
				 
				 String FirstPrice=driver.findElement(By.xpath("//span[text()='46,699']")).getText();
				 System.out.println("1st Product Price : " + FirstPrice);
				 
				 driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
				 
				 Set<String> windowHandles=driver.getWindowHandles();
					List<String> window=new ArrayList<String>(windowHandles);
					driver.switchTo().window(window.get(1));
					
					File source = driver.getScreenshotAs(OutputType.FILE);
					File destination = new File("./snaps/Amazon.png");
					FileUtils.copyFile(source, destination);
					
					driver.findElement(By.id("add-to-cart-button")).click();
					
					Thread.sleep(1000);
					
					String SubTotal= driver.findElement(By.xpath("//div[@class='a-column a-span11 a-text-left a-spacing-top-large']")).getText();
					System.out.println("Subtotal of Product is : " + SubTotal);
					
					driver.quit();
					
					
				 
				 
				 
				 
				    
		
					     
				 
	}

}
