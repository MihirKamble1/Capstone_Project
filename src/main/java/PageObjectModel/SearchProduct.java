package PageObjectModel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProduct {
	WebDriver driver;
	
	public SearchProduct(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()=' Products']")
	public WebElement product;
	
	@FindBy(xpath="//*[@id='search_product']")
	public WebElement search;
	
	@FindBy(xpath="//*[@id='submit_search']")
	public WebElement searchbutton;
	
	@FindBy(xpath="//*[text()='Continue Shopping']")
	public WebElement continueB;
	
	@FindBy(xpath="(//*[text()='Add to cart'])[1]")
	public WebElement p1;
	
	@FindBy(xpath="(//*[text()='Add to cart'])[3]")
	public WebElement p2;

	@FindBy(xpath="(//*[text()='Add to cart'])[5]")
	public WebElement p3;

	@FindBy(xpath="(//*[text()='Add to cart'])[7]")
	public WebElement p4;

	@FindBy(xpath="(//*[text()='Add to cart'])[9]")
	public WebElement p5;

	@FindBy(xpath="(//*[text()='Add to cart'])[11]")
	public WebElement p6;

	@FindBy(xpath="(//*[text()='Add to cart'])[13]")
	public WebElement p7;

	@FindBy(xpath="(//*[text()='Add to cart'])[15]")
	public WebElement p8;

	@FindBy(xpath="(//*[text()='Add to cart'])[17]")
	public WebElement p9;
	
	@FindBy(xpath="//*[text()=' Cart']")
	public WebElement cartbutton1;
	
	public void SearchOperation() {
		product.click();
		JavascriptExecutor js0 = (JavascriptExecutor) driver;
		js0.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");
		search.sendKeys("Dress");
		searchbutton.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500)");
		
		p1.click();
		continueB.click();
		p2.click();
		continueB.click();
		p3.click();
		continueB.click();
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0, 500)");
		p4.click();
		continueB.click();
		p5.click();
		continueB.click();
		p6.click();
		continueB.click();
		
		cartbutton1.click();
		
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0, 500)");
		
		/*p7.click();
		continueB.click();
		p8.click();
		continueB.click();
		p9.click();
		continueB.click();*/
		
	}


}
