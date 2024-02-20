package basic;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ts19 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:www.amazon.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		//step 1 Typecasting

			TakesScreenshot ts=(TakesScreenshot)driver; 
			
			File RAM = ts.getScreenshotAs(OutputType.FILE);
			
			File dest =new File("./photo/amz.png");
			
			FileUtils.copyFile(RAM, dest);
			driver.close();
			
			
	}

}
