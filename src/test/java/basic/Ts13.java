package basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ts13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement sea=driver.findElement(By.xpath("//header/div[2]/div[3]/input[1]"));
		sea.sendKeys("dress");
		List<WebElement> autosuggestion= driver.findElements(By.xpath("//li[@class='desktop-suggestion null']"));
		System.out.println(autosuggestion.size());
		
		for (WebElement c:autosuggestion) {
			System.out.println(c.getText());
			
		}
		driver.close();
		
	}

}
