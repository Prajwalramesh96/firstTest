package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ts18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:www.amazon.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		WebElement bike=driver.findElement(By.xpath("//img[@alt='Up to 60% off | Car, bike parts & accessories']"));
		Point loc=bike.getLocation();
		int x=loc.getX();
		int y=loc.getY();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		
		bike.click();
		System.out.println(x+y);
	}

}
