package _Scripts;

import org.testng.annotations.Test;

import _PomPages.Addtocart;
import _PomPages.Demologin;
import _PomPages.SkillraryLoginPage;
import generic.BAseClass;

public class Testcase1 extends BAseClass {
	
	@Test
	public void tc1() {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		
		
		Demologin sd=new Demologin(driver) ;
		driverutlites.switchtabs(driver);
		driverutlites.mousehover(driver, sd.getCursebtn());
		sd.getSelenium();
		sd.seleniumtraining();
		
		
		Addtocart a=new Addtocart(driver);
		driverutlites.doubleclick(driver, a.getAddbtn());
		a.addtocartbtn();
		driverutlites.alertpopup(driver);
		
		
	}

}
