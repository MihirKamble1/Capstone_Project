package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountInformationPage {
	WebDriver driver;
	
	public AccountInformationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@value='Mr']")
	public WebElement title;
	
	@FindBy(xpath="//*[@name='password']")
	public WebElement password;
	
	@FindBy(xpath="//*[@name='days']")
	public WebElement day;
	
	@FindBy(xpath="//*[@name='months']")
	public WebElement month;
	
	@FindBy(xpath="//*[@name='years']")
	public WebElement year;
	
	@FindBy(xpath="(//*[@value='1'])[3]")
	public WebElement checkbox1;
	
	@FindBy(xpath="optin")
	public WebElement checkbox2;

	@FindBy(xpath="//*[@name='country']")
	public WebElement country;
	
	@FindBy(xpath="//*[@name='first_name']")
	public WebElement firstname;
	
	@FindBy(xpath="//*[@name='last_name']")
	public WebElement lastname;
	
	@FindBy(xpath="//*[@id='company']")
	public WebElement company;
	
	@FindBy(xpath="//*[@name='address1']")
	public WebElement address1;
	
	@FindBy(xpath="//*[@name='state']")
	public WebElement state;
	
	@FindBy(xpath="//*[@name='city']")
	public WebElement city;
	
	@FindBy(xpath="//*[@name='zipcode']")
	public WebElement zipcode;
	
	@FindBy(xpath="//*[@name='mobile_number']")
	public WebElement mobilenumber;
	
	//@FindBy(xpath="//*[text()='Create Account']")
	@FindBy(xpath="(//*[@type='submit'])[1]")
	public WebElement createaccount;
	
	@FindBy(xpath="//*[@class='btn btn-primary']")
	public WebElement continuebutton;
	
	@FindBy(xpath="//*[text()='Account Created!']")
	public WebElement accountcreatedmsg;
	
	@FindBy(xpath="//*[text()=' Delete Account']")
	public WebElement deleteaccount;
	
	@FindBy(xpath="//*[text()='Account Deleted!']")
	public WebElement accountdeldisplay;
	
	@FindBy(xpath="//*[text()='Continue']")
	public WebElement continuebutton1;
	
	
	
	//the info account created and continue is displayed or not
	public void verify1() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		accountcreatedmsg.isDisplayed();
		js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
		continuebutton.isDisplayed();
		
		//js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
	}
	
	
	public void ExecutePage2() throws InterruptedException {
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		
		title.click();
		password.sendKeys("luck@1234");
		
		Select sel1 = new Select(day);
		Select sel2 = new Select(month);
		Select sel3 = new Select(year);
		Select sel4 = new Select(country);
		sel1.selectByValue("1");
		sel2.selectByValue("11");
		sel3.selectByValue("1999");
		
		//checkbox1.click();
		//checkbox2.click();
		
		firstname.sendKeys("Mi");
		lastname.sendKeys("Hi");
		company.sendKeys("Axis");
		address1.sendKeys("D nagar");
		
		sel4.selectByValue("India");
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0, 250)");
		
		state.sendKeys("Drystate");
		city.sendKeys("Drycity");
		zipcode.sendKeys("123456");
		mobilenumber.sendKeys("1234567897");
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0, 250)");
		
		
		
		createaccount.click();
		continuebutton.click();

	    Thread.sleep(2000);

	    JavascriptExecutor js = (JavascriptExecutor) driver;

	    js.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");	    	    

	    continuebutton.click();
	    Thread.sleep(2000);
	    
	    deleteaccount.click();
	    continuebutton1.click();
	    
	    
	}

}
