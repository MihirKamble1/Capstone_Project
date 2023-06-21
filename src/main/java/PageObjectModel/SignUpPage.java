package PageObjectModel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	
	WebDriver driver;
	public SignUpPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//*[text()=' Signup / Login']")
	public WebElement signuplogin;
	
	@FindBy(name="name")
	public WebElement name;
	
	@FindBy(xpath="(//*[@name='email'])[2]")
	public WebElement email;
	
	@FindBy(xpath="//*[text()='Signup']")
	public WebElement signupButton;
	
	Random random = new Random();
	String u1="bvhfdv";
	String u2="@gmail.com";
	int r1 = random.nextInt(100000);
	String s = u1 + r1 + u2;
   
	
	public void ExecutePage1() {
		//String username = readParameterFromFile("src/main/java/ConfigurationFile/ConfigFile.properties", "username");
		signuplogin.isDisplayed();
		signuplogin.click();
		name.sendKeys("aaaa");
		email.sendKeys(s);
		signupButton.click();
	}

}

