package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage {
	
WebDriver driver;

	
	
	public MainPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Validate when the toggle all check box is CHECKED, 
	//all check boxes for list items are also CHECKED ON.
	
	@FindBy(how = How.XPATH, using = "//input[@name  = 'allbox']")
    WebElement ToggleCheckBoxAll;
	
	public void ToggleCheckBoxAllChecked() {
		
		ToggleCheckBoxAll.click();
				
	}

}
