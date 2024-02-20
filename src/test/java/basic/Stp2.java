package basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class Stp2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.pavantestingtools.com/p/introduction-to-java-programming.html");
		Thread.sleep(40000);
		driver.quit();
	}

}
