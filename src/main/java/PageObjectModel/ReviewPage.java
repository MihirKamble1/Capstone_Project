package PageObjectModel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReviewPage {
	WebDriver driver;
	
	public ReviewPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()=' Products']")
	public WebElement productslink;
	
	@FindBy(xpath="//*[text()='View Product']")
	public WebElement viewproductlink;
	
	@FindBy(xpath="//*[@id='name']")
	public WebElement namefield;
	
	@FindBy(xpath="//*[@id='email']")
	public WebElement emailfield;
	
	@FindBy(xpath="//*[@id='review']")
	public WebElement reviewfield;
	
	public void AddReview() throws InterruptedException {
		productslink.isDisplayed();
		productslink.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500)");
		
		viewproductlink.click();
		Thread.sleep(2000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
		viewproductlink.click();
		namefield.sendKeys("Rohit");
		emailfield.sendKeys("RohitBc@gmail.com");
		reviewfield.sendKeys("The worst Product i have seen in my life");
		
	}
	


}
