package basic;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v118.webaudio.WebAudio;

public class Ts21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		WebElement addtocart =driver.findElement(By.xpath("//button[normalize-space()='Add to Cart']"));
		addtocart.click();
		
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		
		
		
	}

}
