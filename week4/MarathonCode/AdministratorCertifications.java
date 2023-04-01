package week4.day2;

import java.io.File;
import java.io.IOException;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;


public class AdministratorCertifications {

		public static void main(String[] args) throws InterruptedException, IOException {
			ChromeDriver d = new ChromeDriver();
			 d.manage().window().maximize();
			 d.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
			 
			 d.get("https://login.salesforce.com/");
			 d.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
			 d.findElement(By.id("password")).sendKeys("Leaf@123");
			 d.findElement(By.id("Login")).click();
			 d.findElement(By.xpath("//span[text()='Learn More']")).click();
			 
			 Set<String> windowHandles=d.getWindowHandles();
				List<String> window=new ArrayList<String>(windowHandles);
				
				d.switchTo().window(window.get(1));
				
				Thread.sleep(2000);
				
				d.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
				
				Thread.sleep(2000);
				

				Shadow dom = new Shadow(d);
				dom.findElementByXPath("//span[text() ='Learning']").click();	
				dom.findElementByXPath("//span[text()='Learning on Trailhead']");
				
				
			
				Actions builder = new Actions(d);
				builder.moveToElement(dom.findElementByXPath("//span[text()='Learning on Trailhead']")).perform();//it is mandatory to call perform()
				dom.findElementByXPath("//a[text()='Salesforce Certification']").click();
				Thread.sleep(2000);
				
				d.findElement(By.xpath("//div[text() ='Administrator']")).click();
				
				if(d.getTitle().equals("Certification - Administrator Overview"))
					System.out.println("Page is loaded properly");
				else
					System.out.println("Page is not loaded properly");
				
				
				//Print the Certifications available for Administrator Certifications (List)
				
				List<WebElement> cetificateList = d.findElements(By.xpath("//div[@class ='credentials-card_title']"));
				System.out.println(" Certifications available for Administrator Certifications  : ");
				for(WebElement each:cetificateList)
				{
					System.out.println(each.getText());
				}
			
				builder.scrollToElement(d.findElement(By.xpath("(//div[@class ='credentials-card_description'])[4]"))).perform();
				File source = d.getScreenshotAs(OutputType.FILE);
				File dest = new File("./snaps/salesforce.png");
				FileUtils.copyFile(source, dest);
				
				
	}

}
