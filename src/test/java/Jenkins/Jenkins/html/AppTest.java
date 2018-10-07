package Jenkins.Jenkins.html;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    
   
    public void myFile()
    {
        
    
    System.setProperty("webdriver.chrome.driver", "/Users/mushtaq/Documents/JarFiles/Webdriver/ChromeJar/chromedriver");
    WebDriver driver = new ChromeDriver();
    
    driver.get("http://localhost:80");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	
	WebElement a = driver.findElement(By.tagName("h1[text()='hello world']"));
	
Assert.assertEquals("hellow world", true, a.isDisplayed());
    }
    
    
    
}
