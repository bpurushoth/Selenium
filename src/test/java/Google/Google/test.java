package Google.Google;  
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
public class test {  
public String baseUrl1 = "https://www.google.com/";
public String baseUrl2 = "https://twingo.techmahindra.com/";  


public void google(WebDriver driver) { 
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
driver.get(baseUrl1);  
// get the current URL of the page  
String URL= driver.getCurrentUrl(); 
String title1 = driver.getTitle();
String ExpectedTitle1 = "Google";
Assert.assertEquals(title1, ExpectedTitle1);
driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t"); 
}   
}  

