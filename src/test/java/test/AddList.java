package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import page.BasePage;

public class AddList extends BasePage {
	
	WebDriver driver;
	
	public AddList(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//input[@name ='data']") WebElement Data_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@value='Add']") WebElement Add_Button_ELEMENT;

	
	public void enterData(String data) {
		Data_ELEMENT.sendKeys(data + randomGenerator(100));
	}
	
	public void clickAddButton() {
		Add_Button_ELEMENT.click();
	}
	
}


