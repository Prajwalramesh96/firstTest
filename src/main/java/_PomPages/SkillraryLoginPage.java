package _PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage {
	
	@FindBy(xpath = "//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	@FindBy (xpath="//ul[@class='dropdown-menu gear_menu']//a[@class='ignorelink'][normalize-space()='SkillRary Demo APP']//span")
	private WebElement skillrarydemopp;
	
	@FindBy(xpath="//input[@placeholder='Search for Courses']")
	private WebElement searchtb;
	
	@FindBy(xpath = "//input[@value='go']")
	private WebElement gobtn;
	
	
	

	public SkillraryLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void gearsbutton() {
		gearsbtn.click();
		
	}
	public void skillrarydemoapplication() {
		
		skillrarydemopp.click();
		
	}
	public void searchtb(String name) {
		searchtb.sendKeys(name);
		
	}
	public void searchbtn() {
		gobtn.click();
		
	}
}
