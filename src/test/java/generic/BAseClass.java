package generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BAseClass {
	
	public WebDriver driver;
	public Propertyfile pdata=new Propertyfile();
	public WebDriverutlites driverutlites=new WebDriverutlites();
	
	@BeforeMethod
	
	public void openapp() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pdata.getPfile("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@AfterMethod
	
	public void closeapp() {
	driver.quit();
		
	}
}


