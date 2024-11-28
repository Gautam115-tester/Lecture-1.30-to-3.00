package com.TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Demo {

	@Test (priority = 1,invocationCount = 2,enabled = true)
	public void google() throws Exception{
		 WebDriver w = new ChromeDriver();
		 w.get("https://www.google.com/");
//		 w.findElement(By.id("hello")).sendKeys("iphone");
		 Thread.sleep(5000);
		 w.quit();
	}
	@Test (priority = 2,enabled = true)
	public void Facebook() throws Exception {
		 WebDriver w = new ChromeDriver();
		 w.get("https://www.facebook.com/");
		 Thread.sleep(5000);
		 w.quit();
	}
}