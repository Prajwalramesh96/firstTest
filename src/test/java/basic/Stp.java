package basic;

import org.openqa.selenium.chrome.*;

public class Stp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=1pf6CzgazTo");
		Thread.sleep(3000);
		driver.quit();
	}

}
