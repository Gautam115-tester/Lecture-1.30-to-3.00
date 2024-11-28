package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomizedEmailReport {

	@Test
	public void Front() {
		
		Reporter r = new Reporter();
		WebDriver w = new ChromeDriver();
		r.log("Browser has been launch");
		w.get("https://demo.frontaccounting.eu/");
		r.log("browser has been redirect to frontaccounting site");
		
		WebElement username = w.findElement(By.name("user_name_entry_field"));
		WebElement password = w.findElement(By.name("password"));
		
		username.clear();
		password.clear();
		
		r.log("username and password field data has been clear");
		
		username.sendKeys("demouser");
		password.sendKeys("password");
		
r.log("In username field demouser data has been enter and password field password data has been enter ");
		
w.findElement(By.name("SubmitUser")).click();
r.log("Click on login button.");

w.findElement(By.linkText("Logout")).click();
r.log("click on logout link");

		
	}
	
	
}
