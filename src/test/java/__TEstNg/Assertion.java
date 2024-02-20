package __TEstNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import dev.failsafe.internal.util.Assert;

@Test
public class Assertion {
	
public WebDriver driver;
	
	@BeforeMethod
	public void openapp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
	}
	
	public void tc1() {
		driver.findElement(By.id("email")).sendKeys("srp@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("998000");
		driver.findElement(By.name("login")).click();
		String title=driver.getTitle();
	
		
		org.testng.Assert.assertEquals(title, "Facebook ");
		
		//SoftAssert a = new SoftAssert();
		//a.assertEquals(title, "hello");
		
		Reporter.log(title,true);
		
		String url=driver.getCurrentUrl();
		Reporter.log(url,true);
		//a.assertAll();
	}
	
	
	
	@AfterMethod
	public void closeapp() {
		driver.close();
	}
	

}
