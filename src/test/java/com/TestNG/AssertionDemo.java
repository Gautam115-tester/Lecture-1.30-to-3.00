package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {
	
	@Test
	public void GoogleSearch() {
		
		WebDriver w = new ChromeDriver();
		w.get("https://www.google.com/");
		w.findElement(By.id("APjFqb")).sendKeys("shoes",Keys.ENTER);
		
		String exptitle = "shoes- Google Search";
		String acttitle = w.getTitle();
		
//		hard Assertion
//		Assert.assertEquals(acttitle, exptitle);
		
//		Soft Assertion
//		SoftAssert soft = new SoftAssert();
//		
//		soft.assertEquals(acttitle, exptitle);
//		
//		System.out.println("Hello");
//		
//		soft.assertAll();
		
	}

	
}
