package pages;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WorkSheetPage extends PageBase{

	public WorkSheetPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(tagName = "b")
	List<WebElement> questions;
	
	public void numberOfQuestionsInWorkSheet() throws FileNotFoundException {

		System.out.println("Number Of Questions In WorkSheet is : "+ questions.size());
		  File file = new File("output.txt"); FileOutputStream fos = new
		  FileOutputStream(file); PrintStream ps = new PrintStream(fos);
		  System.setOut(ps);
		System.out.println("Number Of Questions In WorkSheet is : "+ questions.size());

		 
		
	}

}
