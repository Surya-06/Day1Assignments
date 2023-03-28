package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver d = new ChromeDriver(options);		
			 d.manage().window().maximize();
			 d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			 
			 d.get("https://www.snapdeal.com/");
			 WebElement Mens=d.findElement(By.xpath("//span[@class='catText']"));
			 Actions mousehover=new Actions (d);
			 mousehover.moveToElement(Mens).perform();
			 //Sports Shoes
			 
			 Thread.sleep(1000);
			 
			 d.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
			 String ShoesCount=d.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
			 System.out.println("Total Mens shoes count : " + ShoesCount);
			 
			 d.findElement(By.xpath("//div[text()='Training Shoes']")).click();
			 d.findElement(By.xpath("//div[@class='sort-selected']")).click();
			 
			 Thread.sleep(2000);
			 
			 d.findElement(By.xpath("//li[@class='search-li']")).click();
			 d.findElement(By.xpath("//input[@class='input-filter']")).clear();
			 d.findElement(By.xpath("(//input[@class='input-filter'])[2]")).clear();
			 
			 d.findElement(By.xpath("//input[@class='input-filter']")).sendKeys("900");
			 d.findElement(By.xpath("(//input[@class='input-filter'])[2]")).sendKeys("1200");
			 
			 d.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
			 
			 Thread.sleep(1000);
			 
			 d.findElement(By.xpath("//label[@for='Color_s-Navy']")).click();
			 
			 Thread.sleep(2000);
			 
			 WebElement Shoes=d.findElement(By.xpath("//img[@title='Columbus Navy Training Shoes']"));
			 Actions Shoehover=new Actions(d);
			 Shoehover.moveToElement(Shoes).perform();
			 
			 d.findElement(By.xpath("//div[@pogid='621868725223']")).click();
			 String Price=d.findElement(By.xpath("//div[@class='product-price pdp-e-i-PAY-l clearfix']")).getText();
			 System.out.println("Shoes price with discount : " + Price);
			 
			 File source = d.getScreenshotAs(OutputType.FILE);
				File destination = new File("./snaps/SnapDeal.png");
				FileUtils.copyFile(source, destination);
			 
			 Thread.sleep(1000);
			 
		
			 d.findElement(By.xpath("//div[@class='close close1 marR10']")).click();
			 
			 d.quit();
			 
			 

	}

}
