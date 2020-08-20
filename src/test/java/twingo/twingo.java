package twingo;  
import static org.testng.AssertJUnit.assertEquals;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;  
import org.testng.annotations.BeforeTest;  
import org.testng.annotations.Test;  
public class twingo {  
public String baseUrl1 = "https://www.google.com/";
public String baseUrl2 = "https://twingo.techmahindra.com/";           

 
public void twingo(WebDriver driver) {
	// TODO Auto-generated method stub
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get(baseUrl2);  
	// get the current URL of the page  
	String URL= driver.getCurrentUrl(); 
	String title1 = driver.getTitle();
	String ExpectedTitle1 = "Sign in to your account";
	Assert.assertEquals(title1, ExpectedTitle1);
	
}   
} 
