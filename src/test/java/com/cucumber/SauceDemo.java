package com.cucumber;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SauceDemo {
WebDriver w;
	@Given("Open browser")
	public void open_browser() {
	   w = new ChromeDriver();
	   w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Given("open saucedemo site.")
	public void open_saucedemo_site() {
	    w.get("https://www.saucedemo.com/");
	}
	@When("Enter username field  {string}")
	public void enter_username_field(String user) {
	   w.findElement(By.id("user-name")).sendKeys(user);
	}
	@When("Enter password field {string}")
	public void enter_password_field(String pass) {
	   w.findElement(By.id("password")).sendKeys(pass);
	}
	@When("Click on Login Button.")
	public void click_on_login_button() {
	  w.findElement(By.id("login-button")).click();
	}
	@Then("Verfiy login by checking url")
	public void verfiy_login_by_checking_url() {
	    String expurl = "https://www.saucedemo.com/inventory.html";
	    String acturl = w.getCurrentUrl();
	    Assert.assertEquals(expurl, acturl);
	}
	@Then("click on menu option")
	public void click_on_menu_option() {
	    w.findElement(By.id("react-burger-menu-btn")).click();
	}
	@Then("click on logout button")
	public void click_on_logout_button() {
	   w.findElement(By.linkText("Logout")).click();
	}
}