package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "/html/body/header/div[1]/div/div[3]/button")
	WebElement searchBtn;
	@FindBy (id = "txt_search_query")
	WebElement searchTxtBox;
	@FindBy(id = "btn_global_search")
	WebElement submitBtnForSearch;
	
	public void searchForLessons(String nameOfLesson) {
		clickBtn(searchBtn);
		setTextToWebElement(searchTxtBox, nameOfLesson);
		clickBtn(submitBtnForSearch);
		
		
		
	}

}
