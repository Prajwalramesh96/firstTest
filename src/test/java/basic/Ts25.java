package basic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ts25 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[@id='register_Layer']")).click();
		WebElement fp=driver.findElement(By.xpath("//button[normalize-space()='Upload Resume']"));
		
		fp.click();
		Runtime.getRuntime().exec("C:\\Users\\HITHA\\Desktop\\fileupload.au4.exe");
		
	}

}
