package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ValidationPage extends BasePage {
	
	WebDriver driver;
	
	public ValidationPage (WebDriver driver) {
		this.driver = driver;
		}

	
	String before_xpath = "//input[@name='todo[";
	String after_xpath =  "]']";
	@FindBy(how = How.XPATH, using ="//input[@value='Remove']")
	WebElement RemoveButton;
		
	public void verifyCheckBox() {
		
		for(int i = 1; i <= 100; i++) {
		//driver.findElement(By.xpath(before_xpath + i + after_xpath)).click();
			driver.findElement(By.xpath(before_xpath + i + after_xpath)).isSelected();
			i++;
						
				//RemoveButton.click();
				//i++;
			break;
		}
		}
		

	public void buttonDelete() {
		
		RemoveButton.click();
		
	}
	public void selectinOneItem() {
		for(int i = 0; i <= 100; i++) {
			driver.findElement(By.xpath(before_xpath + i + after_xpath)).click();
			
			break;
	}
	}
}
