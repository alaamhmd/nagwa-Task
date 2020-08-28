package pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends PageBase {

	public SearchResultPage(WebDriver driver) {
		super(driver);
	}
	@FindBy (css = "ul.list")
    WebElement results;

	
	public void openSelectedResult() {
		List<WebElement> searchResult = results.findElements(By.tagName("li"));
		 WebElement selectedResult = (searchResult.get(1));
		 selectedResult.findElement(By.tagName("a")).click();
	}


}


