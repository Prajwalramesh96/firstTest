package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ts12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement usernametb=driver.findElement(By.xpath("//input[@name='username']"));
		System.out.println(usernametb.getSize());
		Point loc=usernametb.getLocation();
		System.out.println(loc.getX());
		System.out.println(loc.getY());
		System.out.println(driver.getWindowHandle());
		driver.close();
	
		
	}

}
