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

public class testcase extends BaseConfiguration {
	
	SignUpPage signuppage;
	AccountInformationPage infopage;
	ProductsPage productpage;
	DeleteAccount deleteaccount;
	ViewCart viewcart;
	ReviewPage reviewpage;
	LoginPage loginpage;
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
		
		
		
		
	}
	
	
	
	@Test
	public void Test1() throws InterruptedException {//pass
		signuppage.ExecutePage1();
		infopage.ExecutePage2();
		/*Thread.sleep(2000);
		deleteaccount.ExecutePage4();*/
		//productpage.ExecutePage3();
		//infopage.verify1();
	}
	
	@Test
	public void Test2(){
		loginpage.ExecutePage5();
	}
	
	@Test
	public void Test3() {//pass
		// Adding products to the cart and removing them 
		productpage.ExecutePage3();
		//viewcart.ExecutePage5();
		
	}
	
	@Test
	public void Test4() {//pass
		productpage.SearchOperation();
	}
	
	@Test
	public void Test5() throws InterruptedException {//Pass
		reviewpage.AddReview();
		
	}
	
	
	
	
	
	
	
	
	

}
