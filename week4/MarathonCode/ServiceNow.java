package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class ServiceNow {

		public static void main(String[] args) throws InterruptedException, IOException {
			ChromeDriver d = new ChromeDriver();
			 d.manage().window().maximize();
			 d.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
			 
			 
			 d.get("https://dev57553.service-now.com/");
			 d.findElement(By.id("user_name")).sendKeys("admin");
			 d.findElement(By.id("user_password")).sendKeys("2oaD6KN$q$vN");
			 d.findElement(By.xpath("//button[@id='sysverb_login']")).click();
			 
			 Thread.sleep(2000);
			 
			 Shadow dom = new Shadow(d);
			 dom.setImplicitWait(25);
				dom.findElementByXPath("//div[@id='all']").click();	
				dom.setImplicitWait(10);
				dom.findElementByXPath("//span[text()='Service Catalog']").click();
				
				Thread.sleep(2000);
				
				d.switchTo().frame(dom.findElementByXPath("	//iframe[@id = 'gsft_main']"));
				d.findElement(By.xpath("(//td[@class='homepage_category_only_description_cell'])[8]")).click();
				
				Thread.sleep(2000);
				
				d.findElement(By.xpath("//strong[text() = 'Apple iPhone 6s']")).click();
				
				Thread.sleep(2000);
				
				Select Color=new Select(d.findElement(By.xpath("(//select[@class='form-control cat_item_option '])[2]")));
				Color.selectByVisibleText("Gold");
				
				Thread.sleep(2000);
				
				Select Storage=new Select(d.findElement(By.xpath("(//select[@class='form-control cat_item_option '])[3]")));
				Storage.selectByVisibleText("128GB [add $50.00]");
				
				d.findElement(By.id("oi_order_now_button")).click();
				
				String OrderPlaced=d.findElement(By.xpath("//div[@class='notification notification-success']")).getText();
				System.out.println("Order is Placed : " + OrderPlaced);
				
				String RequestNumber=d.findElement(By.id("requesturl")).getText();
				System.out.println("Request number is : " + RequestNumber);
				
				File source = d.getScreenshotAs(OutputType.FILE);
				File dest = new File("./snaps/ServiceNow.jpg");
				FileUtils.copyFile(source, dest);
				
				
				d.quit();
				
				
				
						
						
				
				
				
						
					
				
				
			 

	}

}
