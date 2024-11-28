package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowsingTest {
	WebDriver w ;
	@Parameters("LaunchBrowser")
	@BeforeClass
	public void LaunchBrowser(String bro) {
		if (bro.equals("chrome")) {
			w = new ChromeDriver();
		}else if (bro.equals("firefox")) {
			w = new FirefoxDriver();
		}
		w.get("https://www.google.com/");
	}
	
	
	@Test (dataProviderClass = GoogleSearchData.class,dataProvider = "GoogleData")
	public void GoogleSearch(String data) {
		
		w.findElement(By.id("APjFqb")).sendKeys(data,Keys.ENTER);
		w.findElement(By.id("APjFqb")).clear();
		
	}
	
	

}
