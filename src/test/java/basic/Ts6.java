package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ts6 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("srp@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("112345");
		WebElement login=driver.findElement(By.xpath("//a[normalize-space()='Forgotten password?']"));
		
		 
		login.click();
		driver.findElement(By.xpath("//a[normalize-space()='Cancel']")).click();
		
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().back();
		driver.navigate().refresh();
		
		}
	}


