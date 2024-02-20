package _PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demologin {
		@FindBy(xpath = "//a[@id='course']")
		private WebElement cursebtn;
		
		public WebElement getSelenium() {
			return selenium;
		}

		@FindBy(xpath = "//a[contains(text(),'Selenium874')]")
		private WebElement selenium;
		
		public Demologin(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		public WebElement getCursebtn() {
			return cursebtn;
		}

		public void setCursebtn(WebElement cursebtn) {
			this.cursebtn = cursebtn;
		}
		
		 public void seleniumtraining() {
			 
			 selenium.click();
			
		}
}
