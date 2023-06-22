package TestCases;

import org.testng.annotations.Test;
import java.net.MalformedURLException;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;


import Configuration.BaseConfiguration;
import PageObjectModel.AccountInformationPage;
import PageObjectModel.DeleteAccount;
import PageObjectModel.LoginPage;
import PageObjectModel.SignUpPage;
import PageObjectModel.ViewCart;
import PageObjectModel.ProductsPage;
import PageObjectModel.ReviewPage;
import PageObjectModel.SearchProduct;

public class testcase extends BaseConfiguration {
	
	SignUpPage signuppage;
	AccountInformationPage infopage;
	ProductsPage productpage;
	DeleteAccount deleteaccount;
	ViewCart viewcart;
	ReviewPage reviewpage;
	LoginPage loginpage;
	SearchProduct search;
	WebDriver driver;
	
	
	@Parameters({"Port"})
	@BeforeMethod
	public void Setup(String Port) throws MalformedURLException {
		
		driver = GetDriver(Port);
		signuppage = new SignUpPage(driver);
		infopage = new AccountInformationPage(driver);
		deleteaccount = new DeleteAccount(driver);
		productpage = new ProductsPage(driver);
		viewcart = new ViewCart(driver);
		reviewpage = new ReviewPage(driver);
		loginpage = new LoginPage(driver);
		search = new SearchProduct(driver);
		
		
		
		
		
	}
	
	
	
	@Test(priority = 1)
	public void RegisterUser() throws InterruptedException {//pass
		signuppage.ExecutePage1();
		infopage.ExecutePage2();
		
		deleteaccount.ExecutePage4();
		//productpage.ExecutePage3();
		//infopage.verify1();*/
	}
	
	@Test(priority = 2)
	public void Login(){
		loginpage.ExecutePage5();
	}
	
	@Test(priority = 3)
	public void LoginWithInvalid() {
		loginpage.InvalidgLogin();
	}
	
	@Test(priority = 4)
	public void RemovingfromCart() {//pass
		// Adding products to the cart and removing them 
		productpage.ExecutePage3();
		//viewcart.ExecutePage5();
		
	}
	
	@Test(priority = 5)
	public void Search() {//pass
		search.SearchOperation();
	}
	
	@Test(priority = 6)
	public void AddReviewToProduct() throws InterruptedException {//Pass
		reviewpage.AddReview();
		
	}
	
	
	
	
	
	
	
	
	
	

}
