package __TEstNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testcase1 {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void openapp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
	}
	
	@Test
	public void tc1() {
		driver.findElement(By.id("email")).sendKeys("srp@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("998000");
		driver.findElement(By.name("login")).click();
		String title=driver.getTitle();
		Reporter.log(title);
	}
	
	@Test
	public void tc2() {
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.xpath("//input[@id='identify_email']")).sendKeys("srppp@gmail.com");
		driver.findElement(By.xpath("//button[@id='did_submit']")).click();
	}
	
	
	@AfterMethod
	public void closeapp() {
		driver.close();
	}
	

}
