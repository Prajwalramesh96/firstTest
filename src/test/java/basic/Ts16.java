package basic;
//drag n drop action

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ts16 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			WebElement cap1=driver.findElement(By.id("box5"));
			WebElement cap2=driver.findElement(By.id("box7"));
			
			WebElement cont1=driver.findElement(By.id("box105"));
			WebElement cont2=driver.findElement(By.id("box107"));
			
			Thread.sleep(2000);
			Actions a=new Actions(driver);
			a.dragAndDrop(cap1, cont1).perform();
			a.dragAndDrop(cap2, cont2).perform();
			
			driver.close();
			
			
			
			

	}

}
