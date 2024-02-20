package _PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Corejava {

	@FindBy(xpath = "//a[normalize-space()='Core Java For Selenium Trainin']")
	private WebElement corejavacourse;
	
	
 public Corejava(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
 
 public void corejav() {
	 corejavacourse.click();
	
}
}
