package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LessonPage extends PageBase {

	public LessonPage(WebDriver driver) {
		super(driver);
		js = (JavascriptExecutor) driver;

	}



	@FindBy (id = "preview")

	WebElement previewBtn;
	
	public void openWorkSheetSection() {
		scrollDown();
		clickBtn(previewBtn);
		
	}





}
