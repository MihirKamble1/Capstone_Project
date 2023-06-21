package PageObjectModel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
	
	WebDriver driver;
	
	public ProductsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()=' Products']")
	public WebElement product;
	
	
	
	@FindBy(xpath="(//*[text()='Add to cart'])[1]")
	public WebElement product1;
	
	
	@FindBy(xpath="(//*[text()='Add to cart'])[3]")
	public WebElement product2;
	
	@FindBy(xpath="(//*[text()='Add to cart'])[5]")
	public WebElement product3;
	
	@FindBy(xpath="(//*[text()='Add to cart'])[7]")
	public WebElement product4;
	
	@FindBy(xpath="(//*[text()='Add to cart'])[9]")
	public WebElement product5;
	
	@FindBy(xpath="//*[text()=' Cart']")
	public WebElement cartbutton;
	
	@FindBy(xpath="//*[text()='Continue Shopping']")
	public WebElement continueshopping;
	
	@FindBy(xpath="//*[@class='cart_quantity_delete']")
	public WebElement deletebutton;
	
	//For searching the product
	
	@FindBy(xpath="//*[@id='search_product']")
	public WebElement search;
	
	@FindBy(xpath="//*[@id='submit_search']")
	public WebElement searchbutton;
	
	//for adding products to the cart
	public void ExecutePage3() {
		
		//Actions act = new Actions(driver);
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500)");
		product1.click();
		continueshopping.click();
		product2.click();
		continueshopping.click();
		product3.click();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0, 500)");
		continueshopping.click();
		product4.click();
		continueshopping.click();
		product5.click();
		continueshopping.click();
		
		/*JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(500,0)");*/
		cartbutton.click();
		deletebutton.click();
		
	}
	
	//for searching the product
	public void SearchOperation() {
		product.click();
		/*JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("const elements = document.getElementsByClassName('adsbygoogle adsbygoogle-noablate'); while (elements.length > 0) elements[0].remove()");*/
		search.sendKeys("Dress");
		searchbutton.click();
		
	}

}
