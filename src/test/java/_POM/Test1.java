package _POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Facebook fb=new Facebook(driver);
		fb.usernametextbox("somanahalli@gmail.com");
		fb.passwordtextbox("prajnfenjwal");
		fb.loginbutton();
	}

}
