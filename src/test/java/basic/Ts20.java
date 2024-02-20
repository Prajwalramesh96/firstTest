package basic;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ts20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		WebElement month=driver.findElement(By.id("month"));
		
		Select s=new Select(month);
		
		s.selectByIndex(1);
		
		s.selectByVisibleText("Mar");
		s.selectByValue("3");
		
		List<WebElement>alloptions=s.getOptions();
		System.out.println(alloptions.size());
		
		
		ArrayList a=new ArrayList();
		for(WebElement opt:alloptions) {
			String text=opt.getText();
			a.add(text);
			System.out.println(text);
			
		}
		
		Collections.sort(a);
		for(Object options:a) {
			System.out.println(options);
		}
		
		
		driver.close();
	}

}
