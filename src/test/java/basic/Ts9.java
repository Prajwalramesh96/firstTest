package basic;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ts9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.instagram.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("prajwal1996");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("srp1996");
			
			driver.findElement(By.xpath("//div[contains(text(),'Log in')]")).click();
			
			
	}
}

    