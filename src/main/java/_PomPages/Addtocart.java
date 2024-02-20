package _PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addtocart {
	
	 @FindBy(xpath = "//button[@id='add']")
	 private WebElement addbtn;
	 
	 @FindBy(xpath = "//button[normalize-space()='Add to Cart']")
	 private WebElement addcart;
	 
	 public Addtocart(WebDriver driver) {
	 PageFactory.initElements(driver, this);
}
	  public void addtocartbtn() {
		  addcart.click();
		
	}
	public WebElement getAddbtn() {
		return addbtn;
	}
}
