package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.MainPage;
import page.ValidationPage;
import util.BrowserFactory;



public class TestWebPage {

WebDriver driver;

	@Test
		public void toggleOnCheckBox() {
		
		driver = BrowserFactory.init();
		
		// adding items
		
		AddList addList = PageFactory.initElements(driver, AddList.class);
		addList.enterData("Alena");
		addList.clickAddButton();
		addList.enterData("Alena");
		addList.clickAddButton();
		addList.enterData("Alena");
		addList.clickAddButton();
		
    // selecting one item and deleting it
		
	ValidationPage validationPage = PageFactory.initElements(driver, ValidationPage.class);	
	validationPage.selectinOneItem();
	validationPage.buttonDelete();
	
	// selecting toggle all and clicking delete
	MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
	mainPage.ToggleCheckBoxAllChecked();
	    
	validationPage.verifyCheckBox();
	validationPage.buttonDelete();
	
	
	BrowserFactory.tearDown();
	}
}