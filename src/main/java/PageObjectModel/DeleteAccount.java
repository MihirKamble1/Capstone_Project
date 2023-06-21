package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteAccount {
	
	WebDriver driver;
	
	public DeleteAccount(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()=' Delete Account']")
	public WebElement deleteaccount;
	
	@FindBy(xpath="//*[text()='Account Deleted!']")
	public WebElement accountdeldisplay;
	
	@FindBy(xpath="//*[text()='Continue']")
	public WebElement continuebutton;
	
	public void ExecutePage4() {
		deleteaccount.isDisplayed();
		deleteaccount.click();
		accountdeldisplay.isDisplayed();
		continuebutton.isDisplayed();
		continuebutton.click();
	}
	

}
