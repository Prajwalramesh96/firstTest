package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ts7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[normalize-space()='Log in']")).click();
		
		driver.findElement(By.linkText("(//input[@id='Enteryouremail'])[1]")).sendKeys("srp@gmail.com)");
		
		driver.findElement(By.xpath("//button[contains(text(),'Send a code')]")).click();
		
		driver.close();
				}

}
