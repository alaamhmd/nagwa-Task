package tests;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import data.JSONDataReader;
import pages.HomePage;
import pages.LessonPage;
import pages.SearchResultPage;
import pages.WelcomePage;
import pages.WorkSheetPage;

public class E2EScenario extends TestBase {
	
	WelcomePage welcome;
	HomePage home;
	JSONDataReader jsonReader;
	SearchResultPage results;
	LessonPage lesson;
	WorkSheetPage workSheet;
	
	@Test(priority = 1)
	public void userChooseLanguageOfWebsite() {
		
		welcome = new WelcomePage(driver);
		welcome.changeLanguageOfWebsite();

	}
	
	@Test(priority =2)
	public void userSearchForLesson() throws FileNotFoundException, IOException, ParseException {
		jsonReader = new JSONDataReader();
		jsonReader.jsonReader();
		home = new HomePage(driver);
		home.searchForLessons(jsonReader.nameOfLesson);
		
	}
	@Test(priority =3)
	public void userOpenSelectedResult() {
		results = new SearchResultPage(driver);
		results.openSelectedResult();
		lesson = new LessonPage(driver);
		
	}
	
	@Test(priority =4)
	public void userOpenWorkSheetPage() {
		lesson.openWorkSheetSection();	
	}
	
	@Test (priority =5)
	public void getNumberOfQInWorksheet() throws FileNotFoundException, InterruptedException {
		workSheet = new WorkSheetPage(driver);
		workSheet.numberOfQuestionsInWorkSheet();
		
	}
	

}
