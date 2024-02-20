package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ts10 {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				
				driver.get("https://www.instagram.com/");
				WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
				
				
				WebElement usernametb=driver.findElement(By.xpath("//input[@name='username']"));
				wait.until(ExpectedConditions.visibilityOf(usernametb)).sendKeys("prajwal96");
				
				
				driver.findElement(By.xpath("//input[@name='password']")).sendKeys("srp1996");
				
				WebElement button = driver.findElement(By.xpath("//div[contains(text(),'Log in')]"));
				wait.until(ExpectedConditions.elementToBeClickable(button));
				
				String acttitle=driver.getTitle();
				wait.until(ExpectedConditions.titleContains("instagrm"));
				
				if (acttitle.equals("instagram")) {
					System.out.println("passed: homepage is displayed");
					
				}
				else {
					System.out.println("failed: homepage is not displayed");
				}
				
				
		}

	}


