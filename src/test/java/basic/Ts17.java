package basic;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ts17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:www.amazon.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
WebElement drop=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));

	Select s=new Select(drop);
	s.selectByIndex(4);
	List<WebElement> allopt=s.getOptions();
	System.out.println(allopt.size());
	
	for(WebElement b:allopt)
	{
		System.out.println(b.getTagName());
	}
	

	}
	}


