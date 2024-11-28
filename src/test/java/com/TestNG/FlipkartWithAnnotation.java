package com.TestNG;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class FlipkartWithAnnotation {
	WebDriver w;
	@Parameters("browser")
	@BeforeClass 
	public void launchBrowser(String browser){
		if (browser.equals("chrome")) {
			w = new ChromeDriver();
		}else if (browser.equals("firefox")) {
			w = new FirefoxDriver();
		}
		
	}
	@BeforeMethod
	public void OpenSite() {
		w.get("https://www.flipkart.com/");
	}
	@Test (priority = 1 )
	public void Mobile() {
		w.findElement(By.name("q")).sendKeys("iphone 14",Keys.ENTER);
		w.findElement(By.cssSelector("a[class=\"CGtC98\"]")).click();
	}
	@Test (priority = 2)
public void Ac() {
		w.findElement(By.name("q")).sendKeys("dikin ac 1.5 ton",Keys.ENTER);
	List<WebElement>	 ac = w.findElements(By.cssSelector("a[class=\"CGtC98\"]"));
	for (WebElement web : ac) {
		if (web.getText().contains("Daikin 1.5 Ton 3 Star Split AC with PM 2.5 Filter")) {
			web.click();
			break;
		}
	}	
	}
	@AfterMethod
	public void closeChildWindow() throws Exception {
		String parent = w.getWindowHandle();
		Set<String> childw = w.getWindowHandles();
		for (String c : childw) {
			if (!c.equals(parent)) {
				w.switchTo().window(c);
				Thread.sleep(2000);
				w.close();
				w.switchTo().window(parent);
			}
		}
	}	
	
	@AfterClass
	public void closeBrowser() {
		w.quit();
	}
}
