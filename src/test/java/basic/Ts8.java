package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ts8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.findElement(By.xpath("//a[normalize-space()='Forgotten password?']")).click();
			driver.findElement(By.xpath("//input[@id='identify_email']")).sendKeys("9980001345");
			driver.findElement(By.xpath("//button[@id='did_submit']")).click();
			
			System.out.println(driver.getTitle());
			
			System.out.println(driver.getCurrentUrl());
	}
	

}
