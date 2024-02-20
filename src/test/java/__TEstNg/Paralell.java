package __TEstNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paralell {
	
	public WebDriver driver;
	
	@Test
	@Parameters({"browserName"})
	public void trial(String browser) {
		
		if (browser.equals("chrome")) {
			 driver=new ChromeDriver();
		}
		else {
			driver=new FirefoxDriver();
		}
	
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("email")).sendKeys("srp@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("998001345");
		driver.findElement(By.name("login")).click();
		
		Reporter.log(driver.getCurrentUrl(),true);
		
		driver.close();
		
		
	}

}
