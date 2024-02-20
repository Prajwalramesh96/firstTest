package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ts4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwj9v4Ors9mCAxVyB3sHHZAvC4oYABAAGgJ0bQ&ase=2&gclid=Cj0KCQiA6vaqBhCbARIsACF9M6lXry2jdgV0APqDikkfXa7BRbDT8X63lkHc5ZqWLQHtmVV3cQEggGIaAlh0EALw_wcB&ohost=www.google.com&cid=CAESVuD2H9ojF8wPtQKLZMju66nyRjlSovoh8uk63tvOyCKTHbJ1XpelxMkEeVYkHOmSKrrH3gu5kpuzfiGSNp58mMS38K7sBBM1VJZD5nL1xukxszoGC7eu&sig=AOD64_25OprcXlIr6qcPYDDN2LE7Xo1lqQ&q&nis=4&adurl&ved=2ahUKEwjYo_2qs9mCAxXCm1YBHWirD6wQ0Qx6BAgJEAE");
	
		WebElement sell=driver.findElement(By.xpath("//a[normalize-space()='Sell']"));
		sell.click();
		Thread.sleep(4000);
		driver.navigate().back();
		
		Thread.sleep(4000);
		driver.navigate().forward();
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		System.out.println(driver.getTitle());
		
		driver.close();
	}

}
