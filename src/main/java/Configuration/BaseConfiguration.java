package Configuration;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaseConfiguration {
	
	WebDriver driver;
	String nodeURL;
	
	public WebDriver GetDriver(String Port) throws MalformedURLException {
		 if(Port.equalsIgnoreCase("5555"))
	        {
	            nodeURL = "http://192.168.241.1:4444/wd/hub";
	            System.out.println("Edge Browser Initiated");
	            DesiredCapabilities capabilities = DesiredCapabilities.edge();            
	            capabilities.setBrowserName("MicrosoftEdge");
	            capabilities.setPlatform(Platform.WINDOWS);
	            
	            driver = new RemoteWebDriver(new URL(nodeURL),capabilities);
	            
	            driver.get("https://automationexercise.com/");
	            driver.manage().window().maximize();
	            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	            //return Port;
	        }
	        
	        else
	            if(Port.equalsIgnoreCase("6666"))
	            {
	                nodeURL = "http://192.168.241.1:4444/wd/hub";
	                System.out.println("Edge Browser Initiated");
	                DesiredCapabilities capabilities1 = DesiredCapabilities.edge();
	                capabilities1.setBrowserName("MicrosoftEdge");
	                capabilities1.setPlatform(Platform.WINDOWS);
	                
	                driver = new RemoteWebDriver(new URL(nodeURL),capabilities1);   
	                
	                driver.get("https://automationexercise.com/");
	                driver.manage().window().maximize();
	                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	            }
		
		return driver;
	}
	
	
	}
	
	
	
	        
	        
	       
	    
	
	



