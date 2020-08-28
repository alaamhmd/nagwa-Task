package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends PageBase{

	public WelcomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy (xpath = "/html/body/div/div/main/div[2]/ul/li[1]/a")
	
	WebElement englishLanguageBtn ;
	
	public void changeLanguageOfWebsite() {
		clickBtn(englishLanguageBtn);
		
	}

}
