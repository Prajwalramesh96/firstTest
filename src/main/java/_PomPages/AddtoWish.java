package _PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddtoWish {
	
	@FindBy(xpath = "//button[@aria-label='Play']//*[name()='svg']")
	private WebElement playbtn;
	
	public AddtoWish(WebDriver driver) {
		
	}

}
