package com.Logger;
import java.time.Duration;
import org.apache.logging.log4j.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class SauceDemoLogin {
	Logger log;
WebDriver w;

	@Parameters("browser")
	@BeforeMethod
	public void LaunchBrowser(String browser) {
		log = LogManager.getLogger();
		
		if (browser.equals("chrome")) {
			w = new ChromeDriver();
			log.info(browser+" has been launch");
		}else if (browser.equals("firefox")) {
			w = new FirefoxDriver();
			log.info(browser+" has been launch");
		}
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		w.get("https://www.saucedemo.com/");
		log.info("sauce demo site has been open");
	}
	@Test
	public void login() {
		w.findElement(By.id("user-name")).sendKeys("standard_user");
		log.info("standard_user has been enter in username field");
		w.findElement(By.id("password")).sendKeys("secret_sauce");
		log.info("secret_sauce has been enter in password field");
		w.findElement(By.id("login-button")).click();
		log.info("login button has been click");
	}
	
	@AfterMethod
	public void logout() {
		w.findElement(By.id("react-burger-menu-btn")).click();
		log.info("menu button has been click");
		w.findElement(By.linkText("Logout")).click();
		log.info("click on logout link");
	}
	
	
	
}
