package com.jenkins.maven1;


import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "/Users/mushtaq/Documents/JarFiles/Webdriver/ChromeJar/chromedriver");
	    WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		assertEquals(true, driver.findElement(By.name("q")).isDisplayed());
		
		
		
		driver.quit();
		
		
		
	}
}
