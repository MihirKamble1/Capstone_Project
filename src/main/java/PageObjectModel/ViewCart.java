package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewCart {
	WebDriver driver;
	
	public ViewCart(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@href='/view_cart']")
	public WebElement viewcart;
	
	@FindBy(xpath="(//*[@class='cart_delete'])[1]")
	public WebElement remove1;
	
	@FindBy(xpath="(//*[@class='cart_delete'])[2]")
	public WebElement remove2;
	
	public void ExecutePage5() {
		viewcart.isDisplayed();
		viewcart.click();
		remove1.click();
		remove2.click();
	}
	

}
