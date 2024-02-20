package _POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Facebook {
	

	@FindBy(id="email")
	private WebElement usernametb;
	
	@FindBy(xpath = "//input[@id='pass']")
	private WebElement passwordtb;
	
	@FindBy(name = "login")
	private WebElement loginbtn;
	
	Facebook(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void usernametextbox(String user) {
		usernametb.sendKeys(user);
		
	}
	public void passwordtextbox(String pass) {
		passwordtb.sendKeys(pass);
	}
	
	public void loginbutton() {
		loginbtn.click();
	}
}