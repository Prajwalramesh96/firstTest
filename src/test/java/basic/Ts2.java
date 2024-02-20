package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ts2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement login=driver.findElement(By.xpath("//a[normalize-space()='Log in']"));
		
		if (login.isEnabled()) {
			System.out.println("test pass");
			login.click();
			
		}
		else {
			System.out.println("test failed");
		}
		driver.close();
	}

}
