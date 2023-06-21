package PageObjectModel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()=' Signup / Login']")
	public WebElement login;
	
	@FindBy(xpath="//*[@name='email']")
	public WebElement emailid;
	
	@FindBy(xpath="//*[@name='password']")
	public WebElement password;
	
	@FindBy(xpath="//*[text()='Login']")
	public WebElement loginbutton;
	
	@FindBy(xpath="//*[text()=' Logout']")
	public WebElement logout;
	
	@FindBy(xpath="//*[text()='Your email or password is incorrect!']")
	public WebElement text;
	
	  public String readParameterFromFile(String filePath, String parameterName) {
	        String parameterValue = null;
	        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                String[] parts = line.split("=");
	                if (parts.length == 2 && parts[0].trim().equals(parameterName)) {
	                    parameterValue = parts[1].trim();
	                    break;
	                }
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return parameterValue;
	    }
	
	public void ExecutePage5() {
		String username1 = readParameterFromFile("src/main/java/ConfigurationFile/ConfigFile.properties", "username1");
		String password1 = readParameterFromFile("src/main/java/ConfigurationFile/ConfigFile.properties", "password1");
		login.click();
		emailid.sendKeys(username1);
		password.sendKeys(password1);
		loginbutton.click();
		logout.click();
		
	}
	
	public void InvalidgLogin() {
		String usernameInvalid = readParameterFromFile("src/main/java/ConfigurationFile/ConfigFile.properties", "usernameInvalid");
		String password1 = readParameterFromFile("src/main/java/ConfigurationFile/ConfigFile.properties", "password1");
		login.click();
		emailid.sendKeys(usernameInvalid);
		password.sendKeys(password1);
		loginbutton.click();
		System.out.println(text.isDisplayed());
		
		
	}
	

}
