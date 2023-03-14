package week2.day2;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//1. Load url "https://acme-test.uipath.com/login"
//2. Enter email as "kumar.testleaf@gmail.com"
//3. Enter Password as "leaf@12"
//4. Click login button
//5. Get the title of the page and print
//6. Click on Log Out
//7. Close the browser (use -driver.close())

public class AcmeSystem {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);		
			 driver.manage().window().maximize();
		 
		 driver.get("https://acme-test.uipath.com/login");
		 
		 //kumar.testleaf@gmail.com
	
		 driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		 driver.findElement(By.id("password")).sendKeys("leaf@12");
		 driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		String Titile =  driver.getTitle();
		System.out.println("WebPage Title is : " + Titile);
		driver.findElement(By.xpath("//a[text()='Log Out']")).click();
		driver.quit();
		 
		 
		 
	}}
